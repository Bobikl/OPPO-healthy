package com.oplus.aiunit.vision;

import com.oplus.wrapper.os.Debug;
import com.oplus.wrapper.os.SystemProperties;
import com.oplus.wrapper.os.Trace;

/* JADX INFO: loaded from: classes13.dex */
public class cf2 {
    public boolean a;

    public cf2(Object obj) {
        this.a = false;
        try {
            this.a = SystemProperties.getBoolean("debug.sys.animtrace.enable", false);
        } catch (Error | Exception unused) {
        }
    }

    public void a(long j2) {
    }

    public void b() {
    }

    public void c() {
        if (this.a) {
            try {
                Trace.traceBegin(Trace.TRACE_TAG_VIEW, "AnimatorStart " + Debug.getCallers(10));
                Trace.traceEnd(Trace.TRACE_TAG_VIEW);
            } catch (Error | Exception unused) {
            }
        }
    }

    public void d() {
    }

    public void e(int i) {
        if (this.a) {
            try {
                Trace.asyncTraceEnd(Trace.TRACE_TAG_VIEW, "spring_animator", i);
            } catch (Error | Exception unused) {
            }
            b();
        }
    }

    public void f(int i) {
        if (this.a) {
            try {
                Trace.asyncTraceBegin(Trace.TRACE_TAG_VIEW, "spring_animator", i);
            } catch (Error | Exception unused) {
            }
            c();
        }
    }
}
