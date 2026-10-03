package com.google.android.material.sidesheet;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
interface SheetCallback {
    void onSlide(@NonNull View view, float f);

    void onStateChanged(@NonNull View view, int i);
}
