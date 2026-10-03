package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class bzg {
    public static final List<g0a> a = new CopyOnWriteArrayList();
    public static final Map<String, String> b = new ConcurrentHashMap();
    public static final List<String> c = new CopyOnWriteArrayList();
    public static final List<String> d = Arrays.asList("android.view.IWindowManager");

    public static String a(String str, int i) {
        Map<String, String> map = b;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        for (g0a g0aVar : a) {
            if (TextUtils.equals(g0aVar.getServiceName(), str)) {
                return g0aVar.a(i);
            }
        }
        bpj bpjVar = new bpj(str);
        a.add(bpjVar);
        return bpjVar.a(i);
    }

    public static void b() {
        Iterator<String> it = d.iterator();
        while (it.hasNext()) {
            a.add(new bpj(it.next()));
        }
        Map<String, String> map = b;
        map.put("android.view.IWindowSession", "IWindowSession");
        map.put("android.view.IWindowManager", "IWindowSession");
        c.add("android.view.IWindowSession");
        map.put("android.content.pm.IPackageInstaller", "PackageInstaller.Session");
        map.put("android.content.pm.IPackageInstallerSession", "PackageInstaller.Session");
    }

    public static boolean c(String str) {
        return c.contains(str);
    }
}
