package com.oplus.aiunit.vision;

import android.os.Process;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class zt6 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashSet<a> f19545j = new HashSet<>();
    public static zt6 k;
    public Thread.UncaughtExceptionHandler i = Thread.getDefaultUncaughtExceptionHandler();

    public interface a {
        void uncaughtException(Thread thread, Throwable th);
    }

    public zt6() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static void a(a aVar) {
        if (aVar != null) {
            f19545j.add(aVar);
        }
    }

    public static synchronized void b() {
        if (k == null) {
            k = new zt6();
        }
    }

    public final void c() {
        try {
            Process.killProcess(Process.myPid());
            System.exit(10);
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        try {
            Iterator<a> it = f19545j.iterator();
            while (it.hasNext()) {
                try {
                    it.next().uncaughtException(thread, th);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.i;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } else {
                c();
            }
        } catch (Exception unused) {
        }
    }
}
