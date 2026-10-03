package com.omron.lib.utils;

/* JADX INFO: loaded from: classes5.dex */
public class OmronLogVisibleUtil {
    public static com.omron.lib.common.a mOmronlogenum = com.omron.lib.common.a.OMRONLOG_ALL;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.omron.lib.common.a.values().length];
            a = iArr;
            try {
                iArr[com.omron.lib.common.a.OMRONLOG_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.omron.lib.common.a.OMRONLOG_HALF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[com.omron.lib.common.a.OMRONLOG_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String getMessage(String str) {
        int i = a.a[setLogType(mOmronlogenum).ordinal()];
        if (i != 1) {
            return i != 2 ? str : replaceHalf(str);
        }
        return replaceAll(str);
    }

    public static String replaceAll(String str) {
        try {
            int length = str.length();
            StringBuilder sb = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                sb.append('*');
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String replaceHalf(String str) {
        try {
            int length = str.substring(0, str.length() >= 10 ? str.length() - 5 : str.length() / 2).length();
            StringBuilder sb = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                sb.append('*');
            }
            if (str.length() >= 10) {
                return sb.toString() + str.substring(str.length() - 5);
            }
            return sb.toString() + str.substring(str.length() / 2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static com.omron.lib.common.a setLogType(com.omron.lib.common.a aVar) {
        mOmronlogenum = aVar;
        return aVar;
    }
}
