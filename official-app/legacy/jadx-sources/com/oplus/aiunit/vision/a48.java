package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class a48 {
    public static boolean a = false;
    public static boolean disableNativesLoading = false;

    public static synchronized void a() {
        if (a) {
            return;
        }
        if (disableNativesLoading) {
            return;
        }
        new com.badlogic.gdx.utils.m().e("gdx");
        a = true;
    }
}
