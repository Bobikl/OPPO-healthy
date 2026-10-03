package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public abstract class t91 {
    public static final int POSITION_CONTENT = 2;
    public static final int POSITION_UPDATE = 1;
    public static final int POSITION_USER_INFO = 0;
    public static final int TYPE_ITEM_CONTENT = 3;
    public static final int TYPE_ITEM_UPDATE = 2;
    public static final int TYPE_ITEM_USER_INFO = 1;
    public int a;
    public dua b;

    public t91(int i) {
        this.a = i;
    }

    public dua a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public void c(dua duaVar) {
        this.b = duaVar;
    }

    public String toString() {
        return "BaseUserCenterItemBean2{mType=" + this.a + ", mLaunchPageBean=" + this.b + '}';
    }
}
