package com.oplus.drs.core.ingest.step;

/* JADX INFO: loaded from: classes6.dex */
public final class StepResult {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final StepResult f19768c = new StepResult(Action.CONTINUE, null);
    public final Action a;
    public final String b;

    public enum Action {
        CONTINUE,
        COMPLETE,
        ABORT
    }

    public StepResult(Action action, String str) {
        this.a = action;
        this.b = str;
    }

    public static StepResult a(String str) {
        return new StepResult(Action.ABORT, str);
    }

    public static StepResult b(String str) {
        return new StepResult(Action.COMPLETE, str);
    }

    public static StepResult c() {
        return f19768c;
    }

    public boolean d() {
        return this.a == Action.ABORT;
    }

    public boolean e() {
        return this.a != Action.CONTINUE;
    }
}
