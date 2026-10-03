package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public class e3e {
    public static final String PKG_ASSISTANT_SCREEN = "com.coloros.assistantscreen";
    public static final String PKG_INSTANT = "com.nearme.instant.platform";
    public static final String PKG_OCR_SCANNER = "com.coloros.ocrscanner";
    public static final String PKG_PICTORIAL = "com.heytap.pictorial";
    public static final String PKG_SEARCH_BOX = "com.heytap.quicksearchbox";
    public static Set<String> a = new HashSet();

    public static synchronized void a(Context context, String str) {
        lp2.c("PackageUtil", "has add pkg = " + str);
        if (a.size() < 10) {
            a.clear();
            e(context);
        } else {
            a.add(str);
        }
    }

    public static Set<String> b(Context context) {
        HashSet hashSet = new HashSet();
        try {
            hashSet.clear();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().activityInfo.packageName);
            }
            hashSet.remove("com.heytap.pictorial");
        } catch (Exception e2) {
            lp2.b("PackageUtil", "getHomeAppList() e: " + e2);
        }
        return hashSet;
    }

    public static List<ResolveInfo> c(Context context) {
        List<ResolveInfo> listD = d(context);
        Intent intent = new Intent();
        intent.setPackage("com.nearme.instant.platform");
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty() && !g(listD, listQueryIntentActivities.get(0))) {
            listD.add(listQueryIntentActivities.get(0));
        }
        intent.setPackage("com.heytap.quicksearchbox");
        List<ResolveInfo> listQueryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 0);
        if (listQueryIntentActivities2 != null && !listQueryIntentActivities2.isEmpty() && !g(listD, listQueryIntentActivities2.get(0))) {
            listD.add(listQueryIntentActivities2.get(0));
        }
        intent.setPackage("com.coloros.assistantscreen");
        List<ResolveInfo> listQueryIntentActivities3 = context.getPackageManager().queryIntentActivities(intent, 0);
        if (listQueryIntentActivities3 != null && !listQueryIntentActivities3.isEmpty() && !g(listD, listQueryIntentActivities3.get(0))) {
            listD.add(listQueryIntentActivities3.get(0));
        }
        intent.setPackage("com.coloros.ocrscanner");
        List<ResolveInfo> listQueryIntentActivities4 = context.getPackageManager().queryIntentActivities(intent, 0);
        if (listQueryIntentActivities4 != null && !listQueryIntentActivities4.isEmpty() && !g(listD, listQueryIntentActivities4.get(0))) {
            listD.add(listQueryIntentActivities4.get(0));
        }
        if (za0.a(context)) {
            intent.setPackage("com.heytap.pictorial");
            List<ResolveInfo> listQueryIntentActivities5 = context.getPackageManager().queryIntentActivities(intent, 0);
            if (listQueryIntentActivities5 != null && !listQueryIntentActivities5.isEmpty() && !g(listD, listQueryIntentActivities5.get(0))) {
                listD.add(listQueryIntentActivities5.get(0));
            }
        }
        return listD;
    }

    public static List<ResolveInfo> d(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        return context.getPackageManager().queryIntentActivities(intent, 0);
    }

    public static synchronized List<String> e(Context context) {
        ArrayList arrayList;
        List<ResolveInfo> listC;
        if (a.isEmpty() && (listC = c(context)) != null) {
            for (ResolveInfo resolveInfo : listC) {
                if (!a.contains(resolveInfo.activityInfo.packageName)) {
                    a.add(resolveInfo.activityInfo.packageName);
                }
            }
        }
        arrayList = new ArrayList();
        Iterator<String> it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static final String f(@NonNull String str) {
        StringBuilder sb = new StringBuilder();
        String[] strArrSplit = str.split("\\.");
        for (int i = 0; i < strArrSplit.length; i++) {
            String str2 = strArrSplit[i];
            if (i % 2 == 0 || i == strArrSplit.length - 1) {
                sb.append(str2 + ".");
            } else {
                int length = str2.length();
                if (length <= 4 || length > 10) {
                    length = 20;
                }
                sb.append("*" + length + "*.");
            }
        }
        return sb.toString();
    }

    public static boolean g(List<ResolveInfo> list, ResolveInfo resolveInfo) {
        Iterator<ResolveInfo> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().activityInfo.packageName, resolveInfo.activityInfo.packageName)) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        Intent intent = new Intent();
        intent.setPackage(str);
        intent.addCategory("android.intent.category.LAUNCHER");
        return !context.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public static synchronized void i(String str) {
        if (a.contains(str)) {
            a.remove(str);
        }
        lp2.c("PackageUtil", "has remove pkg = " + str);
    }
}
