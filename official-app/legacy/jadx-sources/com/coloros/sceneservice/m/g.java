package com.coloros.sceneservice.m;

/* JADX INFO: loaded from: classes13.dex */
public class g {
    public static final int INVALID_TIME = -1;
    public static final String TAG = "NumberUtils";

    public static int l(String str) {
        try {
            return Integer.parseInt(str.contains("_") ? str.split("_")[0] : str);
        } catch (Exception e2) {
            f.d(TAG, str + " parse failed, " + e2);
            return 0;
        }
    }

    public static double parseDouble(String str) {
        try {
            return Double.parseDouble(str);
        } catch (Exception e2) {
            f.d(TAG, str + " parse failed, " + e2);
            return 0.0d;
        }
    }

    public static float parseFloat(String str) {
        try {
            return Float.parseFloat(str);
        } catch (Exception e2) {
            f.d(TAG, str + " parse failed, " + e2);
            return 0.0f;
        }
    }

    public static int parseInt(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e2) {
            f.d(TAG, str + " parse failed, " + e2);
            return i;
        }
    }

    public static long parseLong(String str, long j2) {
        try {
            return Long.parseLong(str);
        } catch (Exception e2) {
            f.d(TAG, str + " parse long failed, " + e2);
            return j2;
        }
    }

    public static double parseDouble(String str, double d) {
        try {
            return Double.parseDouble(str);
        } catch (Exception e2) {
            f.d(TAG, str + " parse failed, " + e2);
            return d;
        }
    }
}
