package com.heytab.health.sleep.snore;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class LameMp3 {
    public static final int QUALITY_HIGH = 3;
    public static final int QUALITY_LOW = 7;
    public static final int QUALITY_MIDDLE = 5;

    static {
        System.loadLibrary("lame");
    }

    public static native void pcm2Mp3WithPara(String str, boolean z, String str2, int i, int i2, int i3, int i4);
}
