package com.oplus.aiunit.vision;

import android.content.Context;
import xcrash.TombstoneParser;

/* JADX INFO: loaded from: classes19.dex */
public class q5m {

    public static class a implements ko9 {
        public final Context a;

        @Override // com.oplus.aiunit.vision.ko9
        public void a(String str, String str2) throws Exception {
            a7b.f("XCrashMonitor", "onCrash() called with: logPath = [" + str + "], emergency = [" + str2 + "]");
            String str3 = TombstoneParser.b(str, str2).get(TombstoneParser.keyBacktrace);
            StringBuilder sb = new StringBuilder();
            sb.append("xCrash backtrace ");
            sb.append(str3);
            z7b.c("XCrashMonitor", sb.toString());
            mc4.d(this.a, str3);
        }

        public a(Context context) {
            this.a = context;
        }
    }

    public static void a(Context context) {
        int iC = mc4.c(context);
        a7b.f("XCrashMonitor", "start() called with: context = [" + context + "], maxCount = " + iC);
        try {
            xcrash.b.d(context, new xcrash.b.a().c(qe0.n()).a().b().i(iC < 20).h(50).g(new String[]{"^xcrash\\.sample$", "^Signal Catcher$", "^Jit thread pool$", ".*(R|r)ender.*", ".*Chrome.*"}).f(10).e(new a(context)).j(3).k(512).d(1000));
        } catch (Throwable th) {
            a7b.c("XCrashMonitor", th.getMessage(), th);
        }
    }
}
