package com.oplus.aiunit.vision;

import com.heytap.health.watchface.adaptation.base.BaseWatchFaceBean;

/* JADX INFO: loaded from: classes19.dex */
public abstract class za1 {
    public static final int TYPE_ITEM_CONTENT = 3;
    public static final int TYPE_ITEM_FOOTER = 4;
    public static final int TYPE_ITEM_HEADER = 1;
    public static final int TYPE_ITEM_TITLE = 2;
    public int a;
    public BaseWatchFaceBean b;

    public za1(int i) {
        this.a = i;
    }

    public BaseWatchFaceBean a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public String toString() {
        return "BaseWfCenterItemBean{mType=" + this.a + ", mBaseWatchFaceBean=" + this.b + '}';
    }
}
