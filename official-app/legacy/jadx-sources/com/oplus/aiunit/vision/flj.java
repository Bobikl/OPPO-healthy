package com.oplus.aiunit.vision;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes8.dex */
public abstract class flj<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f11427e;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11428c;
    public ThreadLocal<String> a = new ThreadLocal<>();
    public final ReentrantLock d = new ReentrantLock(true);

    public flj() {
        f11427e = getClass().getName();
        this.f11428c = true;
    }
}
