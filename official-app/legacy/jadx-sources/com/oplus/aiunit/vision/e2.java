package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes8.dex */
public class e2 {
    public static final AtomicReference<String> a = new AtomicReference<>();
    public static final AtomicReference<String> b = new AtomicReference<>();

    public static String a(Collection<String> collection) throws IOException {
        List<String> listH = h();
        if (collection == null || collection.isEmpty()) {
            return listH.get(0);
        }
        for (String str : listH) {
            if (collection.contains(str)) {
                return str;
            }
        }
        throw new IOException("No supported abi for this device, supported abis:" + listH + ", sorted abis: " + collection);
    }

    public static String b(Context context) throws IOException {
        String str = context.getApplicationInfo().sourceDir;
        HashSet hashSet = new HashSet();
        try {
            ZipFile zipFile = new ZipFile(str);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    String name = enumerationEntries.nextElement().getName();
                    if (name.charAt(0) >= 'l' && name.charAt(0) <= 'l' && name.startsWith("lib/") && name.endsWith(".so")) {
                        String[] strArrSplit = name.split("/");
                        if (strArrSplit.length == 3) {
                            hashSet.add(strArrSplit[1]);
                        } else {
                            continue;
                        }
                    }
                }
                zipFile.close();
                Set<String> setI = i(hashSet);
                w7i.a("Split:AbiUtil", "sorted abis: " + setI, new Object[0]);
                return a(setI);
            } catch (Throwable th) {
                try {
                    zipFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new IOException("Failed to open base apk " + str, e2);
        }
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        switch (str) {
            case "x86_64":
                return "x86_64";
            case "x86":
                return "x86";
            case "arm64":
                return "arm64-v8a";
            default:
                return null;
        }
    }

    public static String d(Context context) throws Throwable {
        Throwable th;
        IOException e2;
        try {
            try {
                InputStream inputStreamOpen = context.getAssets().open("base.app.cpu.abilist.properties");
                try {
                    Properties properties = new Properties();
                    properties.load(inputStreamOpen);
                    String property = properties.getProperty("abiList");
                    if (!TextUtils.isEmpty(property)) {
                        String[] strArrSplit = property.split(",");
                        HashSet hashSet = new HashSet();
                        Collections.addAll(hashSet, strArrSplit);
                        if (!hashSet.isEmpty()) {
                            Set<String> setI = i(hashSet);
                            w7i.a("Split:AbiUtil", "sorted abis: " + setI, new Object[0]);
                            String strA = a(setI);
                            pd7.a(inputStreamOpen);
                            return strA;
                        }
                    }
                    pd7.a(inputStreamOpen);
                    return null;
                } catch (IOException e3) {
                    e2 = e3;
                    throw new IOException("Failed to read asset file 'assets/base.app.cpu.abilist.properties'!", e2);
                }
            } catch (Throwable th2) {
                th = th2;
                pd7.a(context);
                throw th;
            }
        } catch (IOException e4) {
            e2 = e4;
        } catch (Throwable th3) {
            th = th3;
            context = null;
            pd7.a(context);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0053 A[RETURN] */
    public static String e(String str, List<String> list) {
        if (list == null) {
            return null;
        }
        if (list.contains(str)) {
            return str;
        }
        str.hashCode();
        switch (str) {
            case "armeabi":
                if (h().contains("armeabi-v7a") && list.contains("armeabi-v7a")) {
                    return "armeabi-v7a";
                }
                return null;
            case "x86":
            case "armeabi-v7a":
                if (list.contains("armeabi")) {
                    return "armeabi";
                }
                return null;
            default:
                return null;
        }
    }

    public static String f(Context context) throws IOException {
        String str;
        if (context == null) {
            return null;
        }
        AtomicReference<String> atomicReference = a;
        if (!TextUtils.isEmpty(atomicReference.get())) {
            return atomicReference.get();
        }
        synchronized (e2.class) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            try {
                Field field = ApplicationInfo.class.getField("primaryCpuAbi");
                field.setAccessible(true);
                fue.a(atomicReference, null, (String) field.get(applicationInfo));
                w7i.a("Split:AbiUtil", "Succeed to get primaryCpuAbi " + atomicReference + " from ApplicationInfo.", new Object[0]);
            } catch (IllegalAccessException | NoSuchFieldException e2) {
                w7i.h("Split:AbiUtil", "Failed to get primaryCpuAbi from ApplicationInfo.", e2);
            }
            AtomicReference<String> atomicReference2 = a;
            if (TextUtils.isEmpty(atomicReference2.get())) {
                fue.a(atomicReference2, null, c(g()));
                if (TextUtils.isEmpty(atomicReference2.get())) {
                    w7i.a("Split:AbiUtil", "Failed to get primaryCpuAbi from currentInstructionSet.", new Object[0]);
                    fue.a(atomicReference2, null, d(context));
                    if (TextUtils.isEmpty(atomicReference2.get())) {
                        w7i.a("Split:AbiUtil", "Failed to get primaryCpuAbi from Properties.", new Object[0]);
                        fue.a(atomicReference2, null, b(context));
                        w7i.a("Split:AbiUtil", "Succeed to get primaryCpuAbi " + atomicReference2 + " from BaseApk.", new Object[0]);
                    } else {
                        w7i.a("Split:AbiUtil", "Succeed to get primaryCpuAbi " + atomicReference2 + " from Properties.", new Object[0]);
                    }
                } else {
                    w7i.a("Split:AbiUtil", "Succeed to get primaryCpuAbi " + atomicReference2 + " from currentInstructionSet.", new Object[0]);
                }
            }
            str = atomicReference2.get();
        }
        return str;
    }

    @SuppressLint({"DiscouragedPrivateApi"})
    public static String g() {
        AtomicReference<String> atomicReference = b;
        if (!TextUtils.isEmpty(atomicReference.get())) {
            return atomicReference.get();
        }
        try {
            Method declaredMethod = Class.forName("dalvik.system.VMRuntime").getDeclaredMethod("getCurrentInstructionSet", new Class[0]);
            declaredMethod.setAccessible(true);
            fue.a(atomicReference, null, (String) declaredMethod.invoke(null, new Object[0]));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            w7i.c("Split:AbiUtil", "getCurrentInstructionSet error", new Object[0]);
        }
        return b.get();
    }

    public static List<String> h() {
        return Arrays.asList(Build.SUPPORTED_ABIS);
    }

    public static Set<String> i(Set<String> set) {
        if (set.isEmpty() || set.size() == 1) {
            return set;
        }
        HashSet hashSet = new HashSet(set.size());
        if (set.contains("arm64-v8a")) {
            hashSet.add("arm64-v8a");
        }
        if (set.contains("armeabi-v7a")) {
            hashSet.add("armeabi-v7a");
        }
        if (set.contains("armeabi")) {
            hashSet.add("armeabi");
        }
        if (set.contains("x86")) {
            hashSet.add("x86");
        }
        if (set.contains("x86_64")) {
            hashSet.add("x86_64");
        }
        return hashSet;
    }
}
