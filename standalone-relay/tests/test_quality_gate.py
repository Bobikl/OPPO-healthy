"""Negative-path tests for the real local gate; synthetic repositories only."""
from copy import deepcopy
from pathlib import Path
from unittest.mock import patch
import importlib.util
import json
import os
import subprocess
import tempfile
import unittest

PROJECT = Path(__file__).resolve().parents[2]
spec = importlib.util.spec_from_file_location("project_quality_gate", PROJECT / "standalone-relay/tools/quality_gate.py")
gate = importlib.util.module_from_spec(spec)
spec.loader.exec_module(gate)


class QualityGateTest(unittest.TestCase):
    def setUp(self):
        folder = PROJECT / ".build-tmp"
        folder.mkdir(exist_ok=True)
        self.temporary = tempfile.TemporaryDirectory(prefix="quality-gate-test-", dir=folder)
        self.addCleanup(self.temporary.cleanup)
        self.root = Path(self.temporary.name).resolve()
        self.write("README.md", "原有文档\n")
        self.write("standalone-relay/app/src/main/java/Existing.java", "class Existing {}")
        self.before = gate.snapshot(self.root)
        self.record = dict(id="test", goal="验证范围与退出码", kind="docs", risk="low",
                           scope=["README.md", "docs/engineering/**"], domains=["D00"],
                           acceptance=["受控范围"], invariants=["不改运行时"], impact=["仅文档"],
                           rollback="恢复当前变更", review="self_review", required_checks=[], deferred=[])

    def write(self, name, text):
        path = self.root / name
        path.parent.mkdir(parents=True, exist_ok=True)
        path.write_text(text, encoding="utf-8")

    def inspect(self, record=None, before=None):
        return gate.inspect_change(self.root, before or self.before, gate.snapshot(self.root), record or self.record)

    def test_preexisting_changes_are_baselined(self):
        self.assertEqual(self.inspect(), [])

    def test_scoped_utf8_document_passes(self):
        self.write("README.md", "中文路径与规范\n")
        self.assertEqual(self.inspect(), ["README.md"])

    def test_new_document_is_detected(self):
        self.write("docs/engineering/新增.md", "约束")
        self.assertEqual(self.inspect(), ["docs/engineering/新增.md"])

    def test_deleted_source_cannot_escape_scope(self):
        (self.root / "standalone-relay/app/src/main/java/Existing.java").unlink()
        with self.assertRaisesRegex(gate.GateError, "OUTSIDE_DECLARED_SCOPE"):
            self.inspect()

    def test_runtime_source_rejected_for_tooling(self):
        self.write("standalone-relay/app/src/main/java/Existing.java", "class Existing {int x;}")
        self.record.update(kind="tooling", scope=["standalone-relay/app/**"])
        with self.assertRaisesRegex(gate.GateError, "RUNTIME_FILE"):
            self.inspect()

    def test_docs_cannot_change_build_script(self):
        self.write("standalone-relay/build.ps1", "Write-Output ok")
        self.record["scope"] = ["standalone-relay/build.ps1"]
        with self.assertRaisesRegex(gate.GateError, "NON_DOCUMENT_FILE"):
            self.inspect()

    def test_docs_cannot_hide_code_in_document_tree(self):
        self.write("docs/engineering/example.py", "pass")
        with self.assertRaisesRegex(gate.GateError, "NON_DOCUMENT_FILE"):
            self.inspect()

    def test_unfilled_template_fails(self):
        self.record["id"] = "REPLACE_CHANGE_ID"
        with self.assertRaisesRegex(gate.GateError, "TEMPLATE_MUST_BE_FILLED"):
            self.inspect()

    def test_unsafe_scope_patterns_fail(self):
        for name in ("*", "**", "**/*", "../x", "/x", "C:/x", "a\\b", ""):
            with self.subTest(name=name), self.assertRaises(gate.GateError):
                gate.relative_name(name)

    def test_missing_acceptance_or_impact_fails(self):
        for field in ("goal", "acceptance", "invariants", "impact", "review", "deferred"):
            record = deepcopy(self.record)
            record.pop(field)
            with self.subTest(field=field), self.assertRaises(gate.GateError):
                gate.validate_record(record)

    def test_unknown_check_is_not_executable(self):
        self.record["required_checks"] = ["arbitrary-shell-command"]
        with self.assertRaisesRegex(gate.GateError, "UNKNOWN_OR_MISSING_REQUIRED_CHECKS"):
            self.inspect()

    def test_unknown_domain_fails(self):
        self.record["domains"] = ["D99"]
        with self.assertRaisesRegex(gate.GateError, "UNKNOWN_DOMAIN"):
            self.inspect()

    def test_runtime_requires_host_and_health_requires_home(self):
        self.record.update(kind="runtime", domains=["D01"])
        for checks in ([], ["host"]):
            self.record["required_checks"] = checks
            with self.subTest(checks=checks), self.assertRaises(gate.GateError):
                self.inspect()
        self.record["required_checks"] = ["host", "home"]
        self.assertEqual(self.inspect(), [])

    def test_changed_gate_requires_self_tests(self):
        self.write("standalone-relay/tools/quality_gate.py", "pass")
        self.record.update(kind="tooling", scope=["standalone-relay/tools/quality_gate.py"])
        with self.assertRaisesRegex(gate.GateError, "REQUIRES_SELF_TESTS"):
            self.inspect()

    def test_other_repository_baseline_fails(self):
        before = deepcopy(self.before)
        before["root"] += "-different"
        with self.assertRaisesRegex(gate.GateError, "REPOSITORY_MISMATCH"):
            self.inspect(before=before)

    def test_bad_baseline_hash_fails(self):
        before = deepcopy(self.before)
        before["files"]["README.md"] = "not-a-hash"
        with self.assertRaisesRegex(gate.GateError, "HASH_INVALID"):
            self.inspect(before=before)

    def test_bad_encoding_and_replacement_character_fail(self):
        self.write("README.md", chr(0xFFFD))
        with self.assertRaisesRegex(gate.GateError, "REPLACEMENT_CHARACTER"):
            self.inspect()
        (self.root / "README.md").write_bytes(b"\xff")
        with self.assertRaises(UnicodeError):
            self.inspect()

    def test_reports_cannot_overwrite_sources(self):
        for name in ("README.md", "standalone-relay/tools/x.json", "../outside.json"):
            with self.subTest(name=name), self.assertRaises(gate.GateError):
                gate.report_path(self.root, name)

    def test_report_json_preserves_chinese(self):
        path = self.root / "analysis/report.json"
        gate.write_json(path, {"结果": "已验证"})
        self.assertEqual(gate.read_json(path), {"结果": "已验证"})

    def test_python_optimization_is_rejected(self):
        with patch.dict(os.environ, {"PYTHONOPTIMIZE": "1"}):
            with self.assertRaisesRegex(gate.GateError, "ASSERTIONS_MUST_BE_ENABLED"):
                gate.run_checks(self.root, [], self.root / "analysis/logs", self.root)

    def test_failed_subprocess_is_a_failed_check(self):
        with patch.object(gate.subprocess, "run", return_value=subprocess.CompletedProcess([], 7)):
            results = gate.run_checks(self.root, ["host"], self.root / "analysis/logs", self.root)
        self.assertEqual(results[0]["exit_code"], 7)
        self.assertFalse(results[0]["passed"])

    def test_timeout_is_failed(self):
        with patch.object(gate.subprocess, "run", side_effect=subprocess.TimeoutExpired([], 180)):
            results = gate.run_checks(self.root, ["host"], self.root / "analysis/logs", self.root)
        self.assertEqual(results[0]["exit_code"], 124)
        self.assertFalse(results[0]["passed"])

    def prepare_cli(self):
        gate.write_json(self.root / "analysis/before.json", self.before)
        path = self.root / "docs/engineering/changes/test.json"
        gate.write_json(path, self.record)
        return ["check", "--baseline", "analysis/before.json", "--change", "docs/engineering/changes/test.json",
                "--out", "analysis/result.json", "--scratch", str(self.root)]

    def test_cli_failure_is_nonzero_and_saved(self):
        args = self.prepare_cli()
        with patch.object(gate, "ROOT", self.root), patch.object(gate, "run_checks", return_value=[{"passed": False}]):
            self.assertEqual(gate.main(args), 1)
        self.assertEqual(gate.read_json(self.root / "analysis/result.json")["error"], "REQUIRED_CHECK_FAILED")

    def test_build_cannot_use_a_document_only_profile(self):
        args = self.prepare_cli() + ["--for-build"]
        with patch.object(gate, "ROOT", self.root), patch.object(gate, "run_checks") as checks:
            self.assertEqual(gate.main(args), 1)
            checks.assert_not_called()
        self.assertEqual(gate.read_json(self.root / "analysis/result.json")["error"], "BUILD_REQUIRES_SELF_HOST_HOME_CHECKS")

    def test_cli_rejects_source_mutation_during_checks(self):
        args = self.prepare_cli()
        def changed(*arguments):
            self.write("README.md", "测试期间发生意外改动")
            return []
        with patch.object(gate, "ROOT", self.root), patch.object(gate, "run_checks", side_effect=changed):
            self.assertEqual(gate.main(args), 1)
        self.assertEqual(gate.read_json(self.root / "analysis/result.json")["error"], "SOURCE_CHANGED_DURING_VERIFICATION")


if __name__ == "__main__":
    unittest.main()
