package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class hkf<E> {
    public static final String TAG = "ReferenceCountMap";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f12192c = new Object();
    public a a;
    public HashMap<String, ArrayList<E>> b = new HashMap<>();

    public interface a {
    }

    public List<E> a(String str) {
        ArrayList<E> arrayList;
        synchronized (f12192c) {
            arrayList = this.b.get(str);
        }
        return arrayList;
    }

    public synchronized void setListener(a aVar) {
        this.a = aVar;
    }
}
