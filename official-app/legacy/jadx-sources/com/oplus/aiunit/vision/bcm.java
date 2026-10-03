package com.oplus.aiunit.vision;

import android.app.Application;
import android.content.Context;
import com.oplus.oms.split.full.splitrequest.SplitOmsJsonLoadStrategy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public class bcm {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference<bcm> f9678c = new AtomicReference<>(null);
    public final Map<String, List<com.oplus.oms.split.full.splitload.c.f>> a = new HashMap();
    public final xlm b = new opm(new uxm(h()));

    public static bcm f() {
        AtomicReference<bcm> atomicReference = f9678c;
        if (atomicReference.get() == null) {
            atomicReference.set(new bcm());
        }
        return atomicReference.get();
    }

    public Class<?> a(String str) {
        if (this.b.a(str)) {
            return com.oplus.oms.split.full.splitload.d.a.class;
        }
        if (this.b.b(str)) {
            return com.oplus.oms.split.full.splitload.d.c.class;
        }
        if (this.b.c(str)) {
            return com.oplus.oms.split.full.splitload.d.b.class;
        }
        return null;
    }

    public void b(Application application, Context context) throws com.oplus.oms.split.full.splitload.c.b {
        this.b.a(application, context);
    }

    public void c(ClassLoader classLoader, String str) throws com.oplus.oms.split.full.splitload.c.b {
        List<com.oplus.oms.split.full.splitload.c.f> list = this.a.get(str);
        if (list != null) {
            Iterator<com.oplus.oms.split.full.splitload.c.f> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(classLoader);
            }
        }
    }

    public void d(String str, com.oplus.oms.split.full.splitload.c.f fVar) {
        List<com.oplus.oms.split.full.splitload.c.f> arrayList = this.a.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.a.put(str, arrayList);
        }
        arrayList.add(fVar);
    }

    public Application e(ClassLoader classLoader, String str) throws com.oplus.oms.split.full.splitload.c.b {
        return this.b.b(classLoader, str);
    }

    public String g(String str) {
        return this.b.d(str);
    }

    public final Set<String> h() {
        String[] dynamicFeatures = SplitOmsJsonLoadStrategy.getInstance().getDynamicFeatures();
        HashSet hashSet = new HashSet();
        if (dynamicFeatures != null && dynamicFeatures.length > 0) {
            hashSet.addAll(Arrays.asList(dynamicFeatures));
        }
        return hashSet;
    }

    public void i(String str) {
        List<com.oplus.oms.split.full.splitload.c.f> list = this.a.get(str);
        if (list != null) {
            Iterator<com.oplus.oms.split.full.splitload.c.f> it = list.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }
}
