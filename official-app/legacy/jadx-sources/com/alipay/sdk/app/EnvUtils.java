package com.alipay.sdk.app;

/* JADX INFO: loaded from: classes12.dex */
public class EnvUtils {
    public static EnvEnum mEnv = EnvEnum.ONLINE;

    public enum EnvEnum {
        ONLINE,
        PRE_SANDBOX,
        SANDBOX
    }

    public static boolean a() {
        return mEnv == EnvEnum.SANDBOX;
    }

    public static boolean b() {
        return mEnv == EnvEnum.PRE_SANDBOX;
    }

    public static boolean c() {
        return b() || a();
    }

    public static void d(EnvEnum envEnum) {
        mEnv = envEnum;
    }
}
