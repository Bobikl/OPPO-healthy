package com.oplus.aiunit.vision;

import android.graphics.Rect;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes13.dex */
public interface rne extends wne {
    public static final int BARRIER_FROM_BOTTOM = 3;
    public static final int BARRIER_FROM_LEFT = 0;
    public static final int BARRIER_FROM_RIGHT = 2;
    public static final int BARRIER_FROM_TOP = 1;
    public static final int BARRIER_GONE = -1;
    public static final int BARRIER_WINDOW = 4;
    public static final int TYPE_ANCHOR = 1;
    public static final int TYPE_BARRIER = 2;
    public static final int TYPE_SUBMENU_ANCHOR = 3;
    public static final int TYPE_WINDOW = 0;

    int getBarrierDirection();

    @NonNull
    Rect getDisplayFrame();

    @NonNull
    Rect getOutsets();

    boolean getPopupMenuRuleEnabled();

    int getType();
}
