package com.heytap.store.platform.barcode;

import android.graphics.Bitmap;
import com.google.zxing.Result;

/* JADX INFO: loaded from: classes6.dex */
public interface OnCaptureListener {
    void onHandleDecode(Result result, Bitmap bitmap, float f);
}
