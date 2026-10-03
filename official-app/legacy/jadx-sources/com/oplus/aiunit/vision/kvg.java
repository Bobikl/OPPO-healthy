package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class kvg {
    public static final List<zy9> a = new CopyOnWriteArrayList();
    public static final Map<String, String> b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<String> f13429c = new CopyOnWriteArrayList();
    public static final List<String> d = Arrays.asList("android.view.IWindowManager");

    public static String a(String str, int i) {
        Map<String, String> map = b;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        for (zy9 zy9Var : a) {
            if (TextUtils.equals(zy9Var.getServiceName(), str)) {
                return zy9Var.a(i);
            }
        }
        dlj dljVar = new dlj(str);
        a.add(dljVar);
        return dljVar.a(i);
    }

    public static void b() {
        Iterator<String> it = d.iterator();
        while (it.hasNext()) {
            a.add(new dlj(it.next()));
        }
        Map<String, String> map = b;
        map.put("android.view.IWindowSession", "IWindowSession");
        map.put("android.view.IWindowManager", "IWindowSession");
        f13429c.add("android.view.IWindowSession");
        map.put("android.content.pm.IPackageInstaller", "PackageInstaller.Session");
        map.put("android.content.pm.IPackageInstallerSession", "PackageInstaller.Session");
    }

    public static boolean c(String str) {
        return f13429c.contains(str);
    }
}
