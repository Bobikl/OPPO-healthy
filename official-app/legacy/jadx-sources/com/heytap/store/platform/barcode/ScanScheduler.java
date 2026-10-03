package com.heytap.store.platform.barcode;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes6.dex */
public class ScanScheduler {
    public static final int BAR_CODE = 2;
    public static final int QR_CODE = 1;
    public static final String RESULT = "SCAN_RESULT";
    private static ScanScheduler sScanScheduler;
    private IScanCallback mScanCallback;

    public static ScanScheduler getInstance() {
        return getInstance(true);
    }

    public IScanCallback getScanCallback() {
        return this.mScanCallback;
    }

    public void scan(Activity activity) {
        scan(activity, -1);
    }

    public void scanBarCode(Activity activity) {
        scan(activity, -1, 2);
    }

    public void scanQrCode(Activity activity) {
        scan(activity, -1, 1);
    }

    public void setScanCallback(IScanCallback iScanCallback) {
        this.mScanCallback = iScanCallback;
        if (iScanCallback == null) {
            sScanScheduler = null;
        }
    }

    public static ScanScheduler getInstance(boolean z) {
        if (sScanScheduler == null && z) {
            sScanScheduler = new ScanScheduler();
        }
        return sScanScheduler;
    }

    public void scan(Activity activity, int i) {
        scan(activity, i, 1);
    }

    public void scan(Activity activity, int i, int i2) {
        Intent intent = new Intent(activity, (Class<?>) CaptureFragmentActivity.class);
        intent.putExtra(CaptureFragmentActivity.KEY_CODE_FORMAT, i2);
        activity.startActivityForResult(intent, i);
    }
}
