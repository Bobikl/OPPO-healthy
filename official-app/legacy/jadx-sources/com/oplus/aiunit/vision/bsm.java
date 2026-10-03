package com.oplus.aiunit.vision;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes8.dex */
public final class bsm {
    public static final String a = "ComponentInfoManager";
    public static final String b = "com.oplus.oms.split.full.core.extension.ComponentInfo";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f9840c = "_ACTIVITIES";
    public static final String d = "_SERVICES";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f9841e = "_RECEIVERS";
    public static final String f = "_APPLICATION";

    public static String[] a(String str) {
        try {
            Field field = mkf.b(b).getField(str + f9840c);
            field.setAccessible(true);
            String str2 = (String) field.get(null);
            if (str2 != null) {
                return str2.split(",");
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            w7i.c(a, "getSplitActivities error", new Object[0]);
        }
        return new String[0];
    }

    public static String b(String str) {
        try {
            Field field = mkf.b(b).getField(str + f);
            field.setAccessible(true);
            return (String) field.get(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            w7i.c(a, "getSplitApplication error", new Object[0]);
            return null;
        }
    }

    public static String[] c(String str) {
        try {
            Field field = mkf.b(b).getField(str + f9841e);
            field.setAccessible(true);
            String str2 = (String) field.get(null);
            if (str2 != null) {
                return str2.split(",");
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            w7i.c(a, "getSplitReceivers error", new Object[0]);
        }
        return new String[0];
    }

    public static String[] d(String str) {
        try {
            Field field = mkf.b(b).getField(str + d);
            field.setAccessible(true);
            String str2 = (String) field.get(null);
            if (str2 != null) {
                return str2.split(",");
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            w7i.c(a, "getSplitServices error", new Object[0]);
        }
        return new String[0];
    }
}
