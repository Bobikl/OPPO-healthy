"""Local change-scope and verification gate. No device, network, build or Git writes."""
from pathlib import Path, PurePosixPath
import argparse
import fnmatch
import hashlib
import json
import os
import subprocess
import sys
import tempfile

ROOT = Path(__file__).resolve().parents[2]
FILES = ("AGENTS.md", ".gitignore", "README.md", "CHANGELOG.md", "PROJECT-CONTEXT.md",
         "01-account-login.md", "02-watch-pairing.md", "03-cloud-data-sync.md",
         "04-three-layer-architecture.md", "05-review-1.0.82-and-cloud-adaptation.md",
         "standalone-relay/build.ps1", "standalone-relay/version.txt")
TREES = ("docs/engineering", "standalone-relay/app/src", "standalone-relay/tests",
         "standalone-relay/tools", "standalone-relay/native", "lsposed-module")
SUFFIXES = {".java", ".kt", ".cpp", ".c", ".h", ".py", ".ps1", ".bat", ".xml",
            ".json", ".md", ".txt", ".gradle", ".kts", ".properties", ".toml", ".yml", ".yaml"}
SKIP = {"build", ".gradle", "__pycache__", ".git", "node_modules"}
DOMAINS = {"D00", "D01", "D02", "D03", "D04", "D05", "D06", "D07"}
CHECKS = {"self", "host", "home"}


class GateError(Exception):
    pass


def relative_name(value):
    if not isinstance(value, str) or not value or "\\" in value or ":" in value:
        raise GateError("PATH_MUST_BE_REPOSITORY_RELATIVE")
    path = PurePosixPath(value)
    if path.is_absolute() or ".." in path.parts or value in {"*", "**", "**/*", "."}:
        raise GateError("PATH_SCOPE_TOO_BROAD_OR_OUTSIDE_REPOSITORY")
    return value


def snapshot(root):
    root = root.resolve()
    paths = {root / name for name in FILES if (root / name).is_file()}
    for tree in TREES:
        folder = root / tree
        if folder.exists():
            paths.update(path for path in folder.rglob("*") if path.is_file()
                         and path.suffix in SUFFIXES
                         and not any(part in SKIP for part in path.relative_to(folder).parts))
    files = {}
    for path in sorted(paths):
        if not path.resolve().is_relative_to(root):
            raise GateError("SOURCE_PATH_LEAVES_REPOSITORY")
        files[path.relative_to(root).as_posix()] = hashlib.sha256(path.read_bytes()).hexdigest()
    return {"schema": 1, "root": str(root), "files": files}


def write_json(path, value):
    path.parent.mkdir(parents=True, exist_ok=True)
    text = json.dumps(value, ensure_ascii=False, indent=2) + "\n"
    path.write_text(text, encoding="utf-8")
    if path.read_text(encoding="utf-8") != text:
        raise GateError("UTF8_READBACK_FAILED")


def report_path(root, value):
    path = (root / value).resolve()
    if not path.is_relative_to(root.resolve()) or path.relative_to(root.resolve()).parts[0] not in {"analysis", ".build-tmp"}:
        raise GateError("REPORT_MUST_BE_IN_ANALYSIS_OR_BUILD_TMP")
    return path


def read_json(path):
    return json.loads(path.read_text(encoding="utf-8-sig"))


def validate_record(record):
    if not isinstance(record, dict) or record.get("kind") not in {"docs", "tooling", "runtime"}:
        raise GateError("CHANGE_KIND_REQUIRED")
    for key in ("id", "goal", "rollback", "review"):
        if not isinstance(record.get(key), str) or not record[key].strip():
            raise GateError("CHANGE_FIELD_REQUIRED:" + key)
    if record["id"] == "REPLACE_CHANGE_ID":
        raise GateError("CHANGE_TEMPLATE_MUST_BE_FILLED")
    if record.get("risk") not in {"low", "medium", "high"}:
        raise GateError("CHANGE_RISK_REQUIRED")
    for key in ("scope", "domains", "acceptance", "invariants", "impact"):
        if not isinstance(record.get(key), list) or not record[key] or any(not isinstance(item, str) or not item.strip() for item in record[key]):
            raise GateError("CHANGE_LIST_REQUIRED:" + key)
    for name in record["scope"]:
        relative_name(name)
    if not set(record["domains"]) <= DOMAINS:
        raise GateError("UNKNOWN_DOMAIN")
    required = record.get("required_checks")
    if not isinstance(required, list) or any(not isinstance(item, str) or item not in CHECKS for item in required):
        raise GateError("UNKNOWN_OR_MISSING_REQUIRED_CHECKS")
    if not isinstance(record.get("deferred"), list) or any(not isinstance(item, str) for item in record["deferred"]):
        raise GateError("DEFERRED_VERIFICATION_MUST_BE_EXPLICIT")
    if record["kind"] == "runtime" and "host" not in required:
        raise GateError("RUNTIME_CHANGE_REQUIRES_HOST_CHECKS")
    if record["kind"] == "runtime" and "D01" in record["domains"] and "home" not in required:
        raise GateError("HEALTH_UI_CHANGE_REQUIRES_HOME_CHECKS")


def inspect_change(root, before, current, record):
    validate_record(record)
    if before.get("schema") != 1 or before.get("root") != str(root.resolve()) or not isinstance(before.get("files"), dict):
        raise GateError("BASELINE_REPOSITORY_MISMATCH")
    for name, digest in before["files"].items():
        relative_name(name)
        if not isinstance(digest, str) or len(digest) != 64 or any(char not in "0123456789abcdef" for char in digest):
            raise GateError("BASELINE_HASH_INVALID")
    old, new = before["files"], current["files"]
    changed = sorted(name for name in old.keys() | new.keys() if old.get(name) != new.get(name))
    outside = [name for name in changed if not any(fnmatch.fnmatchcase(name, pattern) for pattern in record["scope"])]
    if outside:
        raise GateError("OUTSIDE_DECLARED_SCOPE:" + ",".join(outside))
    for name in changed:
        if record["kind"] == "docs" and not (name.endswith(".md") or name == ".gitignore" or (name.startswith("docs/engineering/") and name.endswith(".json"))):
            raise GateError("NON_DOCUMENT_FILE_IN_DOCS_CHANGE:" + name)
        if record["kind"] != "runtime" and (name.startswith("standalone-relay/app/") or name.startswith("standalone-relay/native/") or name.startswith("lsposed-module/")):
            raise GateError("RUNTIME_FILE_IN_NON_RUNTIME_CHANGE:" + name)
        if name in new:
            text = (root / name).read_text(encoding="utf-8-sig")
            if chr(0xFFFD) in text:
                raise GateError("REPLACEMENT_CHARACTER:" + name)
    if any(name.endswith("quality_gate.py") for name in changed) and "self" not in record["required_checks"]:
        raise GateError("QUALITY_GATE_CHANGE_REQUIRES_SELF_TESTS")
    return changed


def run_checks(root, required, folder, scratch):
    if not __debug__ or os.environ.get("PYTHONOPTIMIZE", "0").strip() not in {"", "0"}:
        raise GateError("PYTHON_ASSERTIONS_MUST_BE_ENABLED")
    folder.mkdir(parents=True, exist_ok=True)
    if not scratch.is_dir() or scratch.is_symlink():
        raise GateError("EXISTING_TASK_SCRATCH_REQUIRED")
    results = []
    with tempfile.TemporaryDirectory(prefix="quality-gate-", dir=scratch) as temporary:
        work = Path(temporary)
        if work.resolve().parent != scratch.resolve():
            raise GateError("SCRATCH_CHILD_PATH_INVALID")
        env = os.environ.copy()
        env.update(TEMP=str(work), TMP=str(work), PYTHONDONTWRITEBYTECODE="1", PYTHONIOENCODING="utf-8")
        commands = {
            "self": [sys.executable, "-B", "-m", "unittest", "discover", "-s", str(root / "standalone-relay/tests"), "-p", "test_quality_gate.py"],
            "host": [sys.executable, "-B", str(root / "standalone-relay/tests/run_tests.py")],
            "home": [sys.executable, "-B", str(root / "standalone-relay/tests/run_health_home_tests.py"), str(work / "home")],
        }
        for name in dict.fromkeys(required):
            log = folder / (name + ".log")
            try:
                with log.open("w", encoding="utf-8") as output:
                    process = subprocess.run(commands[name], cwd=root, env=env, stdout=output,
                                             stderr=subprocess.STDOUT, timeout=180, shell=False)
                code = process.returncode
            except subprocess.TimeoutExpired:
                code = 124
            results.append({"name": name, "exit_code": code, "passed": code == 0,
                            "log": log.relative_to(root).as_posix(), "log_sha256": hashlib.sha256(log.read_bytes()).hexdigest()})
    return results


def main(argv=None):
    parser = argparse.ArgumentParser(description=__doc__)
    commands = parser.add_subparsers(dest="command", required=True)
    capture = commands.add_parser("snapshot")
    capture.add_argument("--out", required=True)
    check = commands.add_parser("check")
    check.add_argument("--baseline", required=True)
    check.add_argument("--change", required=True)
    check.add_argument("--out", required=True)
    check.add_argument("--scratch", required=True)
    check.add_argument("--for-build", action="store_true", help="Require the full local build verification profile")
    args = parser.parse_args(argv)
    output = report_path(ROOT, args.out)
    if args.command == "snapshot":
        write_json(output, snapshot(ROOT))
        print("BASELINE_SAVED " + output.relative_to(ROOT).as_posix())
        return 0
    report = {"status": "failed", "claim": "local_gate_only_not_device_acceptance"}
    try:
        before = read_json(ROOT / relative_name(args.baseline))
        change_path = ROOT / relative_name(args.change)
        record = read_json(change_path)
        current = snapshot(ROOT)
        changed = inspect_change(ROOT, before, current, record)
        if args.for_build and not {"self", "host", "home"} <= set(record["required_checks"]):
            raise GateError("BUILD_REQUIRES_SELF_HOST_HOME_CHECKS")
        report.update(change_id=record["id"], changed_files=changed, source_files=current["files"],
                      change_sha256=hashlib.sha256(change_path.read_bytes()).hexdigest(), deferred=record["deferred"])
        results = run_checks(ROOT, record["required_checks"], output.parent / "checks", Path(args.scratch).resolve())
        report["checks"] = results
        if any(not result["passed"] for result in results):
            raise GateError("REQUIRED_CHECK_FAILED")
        if snapshot(ROOT) != current:
            raise GateError("SOURCE_CHANGED_DURING_VERIFICATION")
        report["status"] = "passed"
    except (GateError, OSError, ValueError) as error:
        report["error"] = str(error)
    write_json(output, report)
    print("QUALITY_GATE " + report["status"] + " " + output.relative_to(ROOT).as_posix())
    return 0 if report["status"] == "passed" else 1


if __name__ == "__main__":
    raise SystemExit(main())
