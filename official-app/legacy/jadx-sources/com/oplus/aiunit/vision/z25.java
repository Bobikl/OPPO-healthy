package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.ResultPointCallback;
import com.heytap.store.platform.barcode.CaptureHandler;
import com.heytap.store.platform.barcode.DecodeFormatManager;
import com.heytap.store.platform.barcode.Preferences;
import com.heytap.store.platform.barcode.camera.CameraManager;
import com.heytap.store.platform.barcode.util.LogUtils;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes6.dex */
public final class z25 extends Thread {
    public static final String BARCODE_BITMAP = "barcode_bitmap";
    public static final String BARCODE_SCALED_FACTOR = "barcode_scaled_factor";
    public final Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CameraManager f19253j;
    public final Map<DecodeHintType, Object> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Handler f19254l;
    public CaptureHandler m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CountDownLatch f19255n = new CountDownLatch(1);

    public z25(Context context, CameraManager cameraManager, CaptureHandler captureHandler, Collection<BarcodeFormat> collection, Map<DecodeHintType, Object> map, String str, ResultPointCallback resultPointCallback) {
        this.i = context;
        this.f19253j = cameraManager;
        this.m = captureHandler;
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        this.k = enumMap;
        if (map != null) {
            enumMap.putAll(map);
        }
        if (collection == null || collection.isEmpty()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            collection = EnumSet.noneOf(BarcodeFormat.class);
            if (defaultSharedPreferences.getBoolean(Preferences.KEY_DECODE_1D_PRODUCT, true)) {
                collection.addAll(DecodeFormatManager.PRODUCT_FORMATS);
            }
            if (defaultSharedPreferences.getBoolean(Preferences.KEY_DECODE_1D_INDUSTRIAL, true)) {
                collection.addAll(DecodeFormatManager.INDUSTRIAL_FORMATS);
            }
            if (defaultSharedPreferences.getBoolean(Preferences.KEY_DECODE_QR, true)) {
                collection.addAll(DecodeFormatManager.QR_CODE_FORMATS);
            }
            if (defaultSharedPreferences.getBoolean(Preferences.KEY_DECODE_DATA_MATRIX, true)) {
                collection.addAll(DecodeFormatManager.DATA_MATRIX_FORMATS);
            }
            if (defaultSharedPreferences.getBoolean(Preferences.KEY_DECODE_AZTEC, false)) {
                collection.addAll(DecodeFormatManager.AZTEC_FORMATS);
            }
            if (defaultSharedPreferences.getBoolean(Preferences.KEY_DECODE_PDF417, false)) {
                collection.addAll(DecodeFormatManager.PDF417_FORMATS);
            }
        }
        enumMap.put(DecodeHintType.POSSIBLE_FORMATS, collection);
        if (str != null) {
            enumMap.put(DecodeHintType.CHARACTER_SET, str);
        }
        enumMap.put(DecodeHintType.NEED_RESULT_POINT_CALLBACK, resultPointCallback);
        LogUtils.i("Hints: " + enumMap);
    }

    public Handler a() {
        try {
            this.f19255n.await();
        } catch (InterruptedException unused) {
        }
        return this.f19254l;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.f19254l = new com.heytap.store.platform.barcode.a(this.i, this.f19253j, this.m, this.k);
        this.f19255n.countDown();
        Looper.loop();
    }
}
