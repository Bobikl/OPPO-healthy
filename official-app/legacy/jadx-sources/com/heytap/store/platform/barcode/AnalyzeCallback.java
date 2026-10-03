package com.heytap.store.platform.barcode;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface AnalyzeCallback {
    void onAnalyzeFailed();

    void onAnalyzeSuccess(@Nullable Bitmap bitmap, String str);
}
