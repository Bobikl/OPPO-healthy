package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class lvg {
    public static List<Object> a = new CopyOnWriteArrayList();
    public static Map<String, String> b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static List<String> f13849c = new ArrayList(Arrays.asList("android.app.IActivityManager", "android.content.pm.IPackageManager", "android.view.IWindowManager"));

    public static void a() {
        Iterator<String> it = f13849c.iterator();
        while (it.hasNext()) {
            a.add(new elj(it.next()));
        }
        b.put("android.view.IWindowSession", "IWindowSession");
        b.put("android.view.IWindowManager", "IWindowSession");
        b.put("android.content.pm.IPackageInstaller", "PackageInstaller.Session");
        b.put("android.content.pm.IPackageInstallerSession", "PackageInstaller.Session");
    }
}
