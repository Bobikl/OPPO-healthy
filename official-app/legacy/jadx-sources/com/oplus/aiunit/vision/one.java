package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class one {
    public static final com.badlogic.gdx.utils.i<Class, mne> a = new com.badlogic.gdx.utils.i<>();

    public static <T> mne<T> a(Class<T> cls) {
        return b(cls, 100);
    }

    public static <T> mne<T> b(Class<T> cls, int i) {
        com.badlogic.gdx.utils.i<Class, mne> iVar = a;
        mne<T> mneVar = iVar.get(cls);
        if (mneVar != null) {
            return mneVar;
        }
        okf okfVar = new okf(cls, 4, i);
        iVar.h(cls, okfVar);
        return okfVar;
    }
}
