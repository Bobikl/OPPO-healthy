package com.google.android.material.appbar;

/* JADX INFO: loaded from: classes14.dex */
public interface OnToolbarLayoutScrollStateListener {
    public static final int COLLAPSED = 1;
    public static final int EXPANDED = 0;
    public static final int IDLE = 2;

    void onScrollData(int i, int i2, int i3);
}
