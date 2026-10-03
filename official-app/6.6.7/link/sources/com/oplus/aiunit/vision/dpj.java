package com.oplus.aiunit.vision;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public abstract class dpj<T> {
    public static String e;
    public String b;
    public boolean c;
    public ThreadLocal<String> a = new ThreadLocal<>();
    public final ReentrantLock d = new ReentrantLock(true);

    public dpj() {
        e = getClass().getName();
        this.c = true;
    }
}
