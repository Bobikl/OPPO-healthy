package com.oplus.drs.track.utils;

import android.os.Process;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class ExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashSet<a> f19881j = new HashSet<>();
    public static ExceptionHandler k;
    public Thread.UncaughtExceptionHandler i = Thread.getDefaultUncaughtExceptionHandler();

    public interface a {
        void uncaughtException(Thread thread, Throwable th);
    }

    public ExceptionHandler() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static void addExceptionListener(a aVar) {
        if (aVar != null) {
            f19881j.add(aVar);
        }
    }

    public static synchronized void init() {
        if (k == null) {
            k = new ExceptionHandler();
        }
    }

    public final void a() {
        try {
            Process.killProcess(Process.myPid());
            System.exit(10);
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        StringBuilder sb = new StringBuilder();
        HashSet<a> hashSet = f19881j;
        sb.append(hashSet.size());
        sb.append(", uncaught[");
        sb.append(thread.getName());
        sb.append("]:");
        sb.append(th.getMessage());
        Log.i("ExceptionHandler", sb.toString());
        try {
            Iterator<a> it = hashSet.iterator();
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
                a();
            }
        } catch (Exception unused) {
        }
    }
}
