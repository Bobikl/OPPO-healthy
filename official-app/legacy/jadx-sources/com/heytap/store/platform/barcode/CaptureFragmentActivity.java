package com.heytap.store.platform.barcode;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.heytap.nearx.uikit.widget.dialogview.NearAlertDialogBuilder;
import com.heytap.store.platform.barcode.CaptureFragmentActivity;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes6.dex */
public class CaptureFragmentActivity extends AppCompatActivity {
    public static final int BAR_CODE = 2;
    public static final String KEY_CODE_FORMAT = "key_code_format";
    public static final int QR_CODE = 1;
    private static final String TAG = "CaptureFragmentActivity";
    private LinearLayout mCameraLay;
    private AlertDialog mDialog;
    private boolean mIsSettingBack;
    private int mCurrentCodeFormat = 1;
    private String result = "";
    IScanCallback mScanCallback = new IScanCallback() { // from class: com.oplus.aiunit.vision.gy2
        @Override // com.heytap.store.platform.barcode.IScanCallback
        public final void onCall(String str) {
            this.a.lambda$new$4(str);
        }
    };

    private String getAppName() {
        try {
            return getPackageManager().getPackageInfo(getApplication().getPackageName(), 0).applicationInfo.loadLabel(getPackageManager()).toString();
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return "本应用";
        }
    }

    private void jump2AppInfoPage() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", getPackageName(), null));
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$4(String str) {
        this.result = str;
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    public /* synthetic */ void lambda$showCameraPermissionDeny$0(DialogInterface dialogInterface, int i) {
        this.mIsSettingBack = false;
        dialogInterface.dismiss();
        finish();
        SensorsDataAutoTrackHelper.trackDialog(dialogInterface, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    public /* synthetic */ void lambda$showCameraPermissionDeny$1(DialogInterface dialogInterface, int i) {
        this.mIsSettingBack = true;
        dialogInterface.dismiss();
        jump2AppInfoPage();
        SensorsDataAutoTrackHelper.trackDialog(dialogInterface, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    public static /* synthetic */ void lambda$showReadExternalStoragePermissionDeny$2(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        SensorsDataAutoTrackHelper.trackDialog(dialogInterface, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    public /* synthetic */ void lambda$showReadExternalStoragePermissionDeny$3(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        jump2AppInfoPage();
        SensorsDataAutoTrackHelper.trackDialog(dialogInterface, i);
    }

    private void showCameraPermissionDeny() {
        NearAlertDialogBuilder nearAlertDialogBuilder = new NearAlertDialogBuilder(this);
        nearAlertDialogBuilder.setTitle(R.string.camera_dialog_title);
        nearAlertDialogBuilder.setMessage((CharSequence) String.format(getString(R.string.camera_dialog_msg_sdk_23), getAppName()));
        nearAlertDialogBuilder.setNegativeButton(R.string.audio_dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.cy2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.i.lambda$showCameraPermissionDeny$0(dialogInterface, i);
            }
        }).setPositiveButton(R.string.audio_dialog_ok, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.dy2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.i.lambda$showCameraPermissionDeny$1(dialogInterface, i);
            }
        });
        if (isFinishing()) {
            return;
        }
        AlertDialog alertDialog = this.mDialog;
        if (alertDialog == null || !alertDialog.isShowing()) {
            AlertDialog alertDialogShow = nearAlertDialogBuilder.show();
            this.mDialog = alertDialogShow;
            alertDialogShow.setCancelable(false);
        }
    }

    private void showReadExternalStoragePermissionDeny() {
        NearAlertDialogBuilder nearAlertDialogBuilder = new NearAlertDialogBuilder(this);
        nearAlertDialogBuilder.setTitle(R.string.read_external_storage_dialog_title);
        nearAlertDialogBuilder.setMessage((CharSequence) String.format(getString(R.string.read_external_storage_dialog_msg), getAppName()));
        nearAlertDialogBuilder.setNegativeButton(R.string.audio_dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.ey2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                CaptureFragmentActivity.lambda$showReadExternalStoragePermissionDeny$2(dialogInterface, i);
            }
        }).setPositiveButton(R.string.audio_dialog_ok, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.fy2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.i.lambda$showReadExternalStoragePermissionDeny$3(dialogInterface, i);
            }
        });
        nearAlertDialogBuilder.show().setCancelable(false);
    }

    private void startCamera() {
        AlertDialog alertDialog;
        if (!isFinishing() && (alertDialog = this.mDialog) != null && alertDialog.isShowing()) {
            this.mDialog.dismiss();
        }
        if (!PermissionHelperKt.checkCameraPermission(this)) {
            if (this.mIsSettingBack) {
                finish();
                return;
            } else if (ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.CAMERA")) {
                showCameraPermissionDeny();
                return;
            } else {
                PermissionHelperKt.checkAndRequestCameraPermission(this);
                return;
            }
        }
        LinearLayout linearLayout = this.mCameraLay;
        if (linearLayout != null && linearLayout.getChildCount() > 0) {
            this.mCameraLay.removeAllViews();
        }
        CaptureFragment captureFragmentNewInstance = CaptureFragment.newInstance();
        captureFragmentNewInstance.setScanCallback(this.mScanCallback);
        captureFragmentNewInstance.setCodeFormat(this.mCurrentCodeFormat);
        replaceFragment(captureFragmentNewInstance);
    }

    @Override // android.app.Activity
    public void finish() {
        ScanScheduler scanScheduler = ScanScheduler.getInstance(false);
        if (scanScheduler == null || scanScheduler.getScanCallback() == null) {
            Intent intent = new Intent();
            intent.putExtra("SCAN_RESULT", this.result);
            setResult(-1, intent);
        } else {
            ScanScheduler.getInstance().getScanCallback().onCall(this.result);
        }
        this.result = "";
        super.finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fragment_activity);
        getWindow().setNavigationBarColor(0);
        this.mCameraLay = (LinearLayout) findViewById(R.id.fragmentContent);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.mCurrentCodeFormat = extras.getInt(KEY_CODE_FORMAT, 1);
        }
        startCamera();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (14 == i) {
            if (strArr.length <= 0 || iArr.length <= 0 || iArr[0] != 0) {
                finish();
                return;
            } else {
                startCamera();
                return;
            }
        }
        if (12 == i) {
            if ((strArr.length > 0 && iArr.length > 0 && iArr[0] == 0) || ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.READ_EXTERNAL_STORAGE") || isFinishing()) {
                return;
            }
            showReadExternalStoragePermissionDeny();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.mIsSettingBack) {
            startCamera();
        }
    }

    public void replaceFragment(Fragment fragment) {
        replaceFragment(R.id.fragmentContent, fragment);
    }

    public void replaceFragment(@IdRes int i, Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(i, fragment).commit();
    }
}
