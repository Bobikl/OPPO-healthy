package com.badlogic.gdx.utils;

import com.oplus.aiunit.vision.t0j;

/* JADX INFO: loaded from: classes13.dex */
public class SerializationException extends RuntimeException {
    private t0j trace;

    public SerializationException() {
    }

    public void addTrace(String str) {
        if (str == null) {
            throw new IllegalArgumentException("info cannot be null.");
        }
        if (this.trace == null) {
            this.trace = new t0j(512);
        }
        this.trace.append('\n');
        this.trace.n(str);
    }

    public boolean causedBy(Class cls) {
        return causedBy(this, cls);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.trace == null) {
            return super.getMessage();
        }
        t0j t0jVar = new t0j(512);
        t0jVar.n(super.getMessage());
        if (t0jVar.length() > 0) {
            t0jVar.append('\n');
        }
        t0jVar.n("Serialization trace:");
        t0jVar.j(this.trace);
        return t0jVar.toString();
    }

    public SerializationException(String str, Throwable th) {
        super(str, th);
    }

    private boolean causedBy(Throwable th, Class cls) {
        Throwable cause = th.getCause();
        if (cause == null || cause == th) {
            return false;
        }
        if (cls.isAssignableFrom(cause.getClass())) {
            return true;
        }
        return causedBy(cause, cls);
    }

    public SerializationException(String str) {
        super(str);
    }

    public SerializationException(Throwable th) {
        super("", th);
    }
}
