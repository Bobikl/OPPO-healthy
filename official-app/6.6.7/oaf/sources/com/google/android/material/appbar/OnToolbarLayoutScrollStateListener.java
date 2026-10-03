package com.google.android.material.appbar;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface OnToolbarLayoutScrollStateListener {
    public static final int COLLAPSED = 1;
    public static final int EXPANDED = 0;
    public static final int IDLE = 2;

    void onScrollData(int i, int i2, int i3);
}
