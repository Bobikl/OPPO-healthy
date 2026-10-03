package com.heytap.health.watchface.business.legacy.creation.outfits.transfor.algorithm;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.oplus.aiunit.vision.cg1;
import com.oplus.aiunit.vision.ltl;
import java.io.File;

/* JADX INFO: loaded from: classes19.dex */
public class StripeSVMClassifier {
    public static final int ERROR = -1;
    public static final int NDK_NOT_SUPPORT = -2;
    public static final int NDK_NULL_ERROR = -3;
    public static final int SUCCESS = 0;
    public static final String TAG = "StripeSVMClassifier";
    public int a;

    public static class a {
        public static final StripeSVMClassifier a = new StripeSVMClassifier();
    }

    static {
        System.loadLibrary("stripe-process");
    }

    public static StripeSVMClassifier b() {
        return a.a;
    }

    private native int initSDK(String str);

    private native int predict(byte[] bArr, int i);

    public final boolean a(Context context, String str) {
        File file = new File(str);
        if (!file.exists()) {
            ltl.b(TAG, "[checkModelFile] --> mkdirs=" + file.mkdirs());
        }
        new File(str + "/Coreai.bin").exists();
        return true;
    }

    public final byte[] c(Bitmap bitmap) {
        if (bitmap != null) {
            return cg1.J(cg1.K(bitmap, 480, 480));
        }
        ltl.i(TAG, " [handleBitmap]  bitmap is null");
        return null;
    }

    @WorkerThread
    public int d(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null) {
            ltl.i(TAG, "path or context is empty and init failed");
            return -3;
        }
        if (a(context.getApplicationContext(), str)) {
            ltl.a(TAG, "[init] start init native sdk");
            return initSDK(str);
        }
        ltl.i(TAG, "[init] check model file failed.");
        return -3;
    }

    public int e(Bitmap bitmap) {
        if (bitmap == null) {
            ltl.i(TAG, "bitmap is empty and init failed");
            return -3;
        }
        byte[] bArrC = c(bitmap);
        if (bArrC == null) {
            ltl.i(TAG, "img is empty and predict failed");
            return -3;
        }
        int iPredict = predict(bArrC, 480);
        ltl.a(TAG, " [predictResult] result " + iPredict);
        return iPredict;
    }

    public native void release();

    public StripeSVMClassifier() {
        this.a = -3;
    }
}
