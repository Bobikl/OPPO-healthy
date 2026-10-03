package com.oplus.aiunit.vision;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes2.dex */
public class gwj {
    public static a a;

    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        public static a a() {
            HandlerThread handlerThread = new HandlerThread("monitor");
            handlerThread.start();
            return new a(handlerThread.getLooper());
        }

        public void b(Thread thread, long j2, String str) {
            removeMessages(1, thread);
            Message messageObtainMessage = obtainMessage(1, thread);
            if (str != null) {
                messageObtainMessage.getData().putString("tag", str);
                messageObtainMessage.getData().putLong(TypedValues.TransitionType.S_TO, j2);
            }
            sendMessageDelayed(messageObtainMessage, j2);
        }

        public void c(Thread thread) {
            removeMessages(1, thread);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            String string;
            if (message.what == 1) {
                Bundle bundlePeekData = message.peekData();
                long j2 = 0;
                if (bundlePeekData != null) {
                    string = bundlePeekData.getString("tag");
                    j2 = bundlePeekData.getLong(TypedValues.TransitionType.S_TO, 0L);
                } else {
                    string = null;
                }
                StackTraceElement[] stackTrace = ((Thread) message.obj).getStackTrace();
                Throwable th = new Throwable();
                th.setStackTrace(stackTrace);
                a7b.n("ThreadMonitor", "TIMEOUT=" + j2 + " for {" + string + "} appVer=" + qe0.n() + ", at ", th);
            }
        }
    }

    public static synchronized a a() {
        if (a == null) {
            a = a.a();
        }
        return a;
    }

    public static void b(long j2, String str) {
        c(Thread.currentThread(), j2, str);
    }

    public static void c(Thread thread, long j2, String str) {
        a().b(thread, j2, str);
    }

    public static void d() {
        e(Thread.currentThread());
    }

    public static void e(Thread thread) {
        a().c(thread);
    }
}
