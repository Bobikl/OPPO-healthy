package com.oplus.aiunit.vision;

import com.heytap.health.watch.watchapp.proto.WatchAppProto$AppCommandMsg;

/* JADX INFO: loaded from: classes16.dex */
public class f55 extends t4 {
    public static /* synthetic */ void f(ys9 ys9Var, WatchAppProto$AppCommandMsg watchAppProto$AppCommandMsg, boolean z, int i) {
        if (!z) {
            ys9Var.onFail(-2);
            return;
        }
        ys9Var.onSuccess(null);
        s5l.d(t4.TAG, "[sendMessage] --> send success, anchor = " + watchAppProto$AppCommandMsg.getHeader().getActionAnchor());
    }

    @Override // com.oplus.aiunit.vision.t4
    public void d(final WatchAppProto$AppCommandMsg watchAppProto$AppCommandMsg, final ys9 ys9Var) {
        if (gl4.managerApi.isStubModule()) {
            ys9Var.onFail(-4);
            s5l.b(t4.TAG, "[sendMessage] --> ERROR_IN_STUB_MODULE");
        } else {
            s5l.a(t4.TAG, "[sendMessage] --> start request to send msg.");
            b(watchAppProto$AppCommandMsg, new rl4.c() { // from class: com.oplus.aiunit.vision.e55
                @Override // com.oplus.aiunit.vision.rl4.c
                public final void a(boolean z, int i) {
                    f55.f(ys9Var, watchAppProto$AppCommandMsg, z, i);
                }
            });
        }
    }
}
