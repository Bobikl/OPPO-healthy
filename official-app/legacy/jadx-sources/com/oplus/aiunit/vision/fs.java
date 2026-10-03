package com.oplus.aiunit.vision;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes18.dex */
public class fs {
    public static final Object b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static fs f11480c;
    public Set<String> a = new HashSet();

    public static fs b() {
        if (f11480c == null) {
            synchronized (b) {
                if (f11480c == null) {
                    f11480c = new fs();
                }
            }
        }
        return f11480c;
    }

    public synchronized Set<String> a() {
        return this.a;
    }

    public synchronized void c(String str) {
        this.a.add(str);
    }

    public synchronized void d(Collection<String> collection) {
        this.a.addAll(collection);
    }
}
