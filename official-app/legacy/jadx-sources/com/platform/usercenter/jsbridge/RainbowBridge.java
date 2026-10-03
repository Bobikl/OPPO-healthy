package com.platform.usercenter.jsbridge;

/* JADX INFO: loaded from: classes9.dex */
public class RainbowBridge {
    private static volatile RainbowBridge sInstance;

    private RainbowBridge() {
    }

    public static RainbowBridge getInstance() {
        RainbowBridge rainbowBridge = sInstance;
        if (rainbowBridge == null) {
            synchronized (RainbowBridge.class) {
                rainbowBridge = sInstance;
                if (rainbowBridge == null) {
                    rainbowBridge = new RainbowBridge();
                    sInstance = rainbowBridge;
                }
            }
        }
        return rainbowBridge;
    }

    public NativeMethodInjectHelper clazz(Class<?> cls) {
        return NativeMethodInjectHelper.getInstance().clazz(cls);
    }
}
