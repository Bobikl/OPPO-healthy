package com.oplus.aiunit.vision;

import com.oplus.oms.split.full.common.ProcessInfoData;
import com.oplus.oms.split.full.common.SplitInfoData;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class b7i {
    public static String a() {
        try {
            Field field = c().getField("DEFAULT_SPLIT_INFO_VERSION");
            field.setAccessible(true);
            return (String) field.get(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            w7i.c("SplitBaseInfoProvider", "getDefaultSplitInfoVersion error", new Object[0]);
            return "unknown_1.0";
        }
    }

    public static String[] b() {
        try {
            Field field = c().getField("DYNAMIC_FEATURES");
            field.setAccessible(true);
            return (String[]) field.get(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            w7i.c("SplitBaseInfoProvider", "getDynamicFeatures error", new Object[0]);
            return null;
        }
    }

    public static Class<?> c() throws ClassNotFoundException {
        try {
            return mkf.b("com.oplus.ocs.OmsConfig");
        } catch (ClassNotFoundException e2) {
            w7i.i("SplitBaseInfoProvider", "Oms Warning: Can't find class com.oplus.ocs.OmsConfig.class!", new Object[0]);
            throw e2;
        }
    }

    public static String d() {
        try {
            Field field = c().getField("OMS_ID");
            field.setAccessible(true);
            return (String) field.get(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            w7i.c("SplitBaseInfoProvider", "getOmsId error", new Object[0]);
            return "unknown";
        }
    }

    public static Map<String, ProcessInfoData> e() {
        try {
            Field field = c().getField("sProcessMap");
            field.setAccessible(true);
            return (Map) field.get(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            w7i.c("SplitBaseInfoProvider", "getProcessMap error", new Object[0]);
            return null;
        }
    }

    public static Map<String, SplitInfoData> f() {
        try {
            Field field = c().getField("sSplitMap");
            field.setAccessible(true);
            return (Map) field.get(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            w7i.c("SplitBaseInfoProvider", "getSplitMap error", new Object[0]);
            return null;
        }
    }

    public static String g() {
        try {
            Field field = c().getField("VERSION_NAME");
            field.setAccessible(true);
            return (String) field.get(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            w7i.c("SplitBaseInfoProvider", "getVersionName error", new Object[0]);
            return "unknown";
        }
    }
}
