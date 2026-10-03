package com.oppo.store.web;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.client.platform.opensdk.pay.download.resource.LanUtils;
import com.heytap.nearx.uikit.widget.dialogview.NearAlertDialogBuilder;
import com.heytap.store.base.core.util.ToastUtil;
import com.heytap.store.base.core.util.app.AppConfig;
import com.heytap.store.base.core.util.permission.PermissionDialog;
import com.heytap.store.base.core.util.permission.PermissionUtil;
import com.oppo.store.web.browser.R;
import com.oppo.store.web.client.StoreJsBridgeWebChromeClient;
import com.oppo.store.web.util.DialogUtilKt;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.HashMap;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class WBH5FaceVerifyHelper {
    private static final int PERMISSION_QUEST_CAMERA_RECORD_VERIFY = 40;
    private static final int PERMISSION_QUEST_CAMERA_SOUND_RECORD_VERIFY = 41;
    private static final int PERMISSION_QUEST_FACE_CAMERA = 10001;
    private static final int PERMISSION_QUEST_TRTC_CAMERA_VERIFY = 39;
    public static final int PHOTO_REQUEST = 10011;
    private static String TIPS_CAMERA_RECORD = "permission_tips_camera_record";
    private Activity activity;
    private StoreJsBridgeWebChromeClient webViewClient;

    public WBH5FaceVerifyHelper(Activity activity, StoreJsBridgeWebChromeClient storeJsBridgeWebChromeClient) {
        this.activity = activity;
        this.webViewClient = storeJsBridgeWebChromeClient;
    }

    private void askPermissionError() {
        if (this.activity.isFinishing()) {
            return;
        }
        this.activity.finish();
    }

    private void checkCameraSoundsPermission(String[] strArr) {
        Activity activity = this.activity;
        PermissionDialog.reCheckCustomPermissionForNoFilter(activity, "相机录音权限使用说明", activity.getString(R.string.before_permission_camera), strArr, 41, null);
    }

    private void checkPermission(String[] strArr) {
        Activity activity = this.activity;
        PermissionDialog.reCheckCustomPermissionForNoFilter(activity, "相机权限使用说明", activity.getString(R.string.before_permission_camera), strArr, 40, null);
    }

    private int checkSdkPermission(String str) {
        return ContextCompat.checkSelfPermission(this.activity, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enterSettingActivity(int i) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", this.activity.getPackageName(), null));
        if (this.activity.getPackageManager().resolveActivity(intent, 0) != null) {
            this.activity.startActivityForResult(intent, i);
        }
    }

    private void openAppDetail(int i) {
        showWarningDialog(i);
    }

    private void showWarningDialog(final int i) {
        new NearAlertDialogBuilder(this.activity).setTitle((CharSequence) "权限申请提示").setMessage((CharSequence) "请前往设置->应用->权限中打开相关权限，否则功能无法正常运行！").setPositiveButton((CharSequence) "确定", new DialogInterface.OnClickListener() { // from class: com.oppo.store.web.WBH5FaceVerifyHelper.6
            @Override // android.content.DialogInterface.OnClickListener
            @SensorsDataInstrumented
            public void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
                WBH5FaceVerifyHelper.this.enterSettingActivity(i);
                SensorsDataAutoTrackHelper.trackDialog(dialogInterface, i2);
            }
        }).setNegativeButton((CharSequence) LanUtils.CN.CANCEL, new DialogInterface.OnClickListener() { // from class: com.oppo.store.web.WBH5FaceVerifyHelper.5
            @Override // android.content.DialogInterface.OnClickListener
            @SensorsDataInstrumented
            public void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
                if (!WBH5FaceVerifyHelper.this.activity.isFinishing()) {
                    WBH5FaceVerifyHelper.this.activity.finish();
                }
                SensorsDataAutoTrackHelper.trackDialog(dialogInterface, i2);
            }
        }).setCancelable(false).show();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 17 || i == 10011) {
            if (WBH5FaceVerifySDK.getInstance().receiveH5FaceVerifyResult(i, i2, intent)) {
                return;
            }
        } else if (i == 39) {
            requestCameraPermission();
        } else if (i == 40) {
            requestCameraAndSomePermissions("video/*", false);
        } else if (i == 41) {
            requestCameraAndSoundsPermissions("video/*", false);
        }
        if (this.webViewClient.getSelectImageActivityWrapper() != null) {
            this.webViewClient.getSelectImageActivityWrapper().handleOnActivityResult(i, i2, intent);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 10001) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                if (this.webViewClient.getSelectImageActivityWrapper() != null) {
                    this.webViewClient.getSelectImageActivityWrapper().onCancelSelectImage();
                    PermissionUtil.showCameraDialog(this.activity);
                }
                return;
            }
            if (this.webViewClient.getSelectImageActivityWrapper() != null) {
                this.webViewClient.getSelectImageActivityWrapper().changeReportDate(false, true);
                this.webViewClient.getSelectImageActivityWrapper().openSystemCamera(false);
                return;
            }
            return;
        }
        switch (i) {
            case 39:
                if (iArr.length > 0) {
                    int i2 = iArr[0];
                    if (i2 == 0) {
                        this.webViewClient.enterTrtcFaceVerify();
                    } else if (i2 == -1 && !ActivityCompat.shouldShowRequestPermissionRationale(this.activity, "android.permission.CAMERA")) {
                        openAppDetail(39);
                    } else {
                        askPermissionError();
                    }
                }
                break;
            case 40:
                if (iArr.length > 0) {
                    if (Build.VERSION.SDK_INT < 33) {
                        if (iArr.length >= 2) {
                            if (iArr[0] != 0) {
                                if (!ActivityCompat.shouldShowRequestPermissionRationale(this.activity, "android.permission.CAMERA")) {
                                    ToastUtil.show(this.activity, "请前往设置->应用->权限中打开相机权限，否则功能无法正常运行");
                                    openAppDetail(40);
                                } else {
                                    askPermissionError();
                                }
                            } else if (iArr[1] == 0) {
                                this.webViewClient.enterOldModeFaceVerify(false);
                            } else if (!ActivityCompat.shouldShowRequestPermissionRationale(this.activity, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                                ToastUtil.show(this.activity, "请前往设置->应用->权限中打开存储权限，否则功能无法正常运行");
                                openAppDetail(40);
                            } else {
                                askPermissionError();
                            }
                        }
                    } else if (iArr.length >= 1) {
                        if (iArr[0] == 0) {
                            this.webViewClient.enterOldModeFaceVerify(false);
                        } else if (!ActivityCompat.shouldShowRequestPermissionRationale(this.activity, "android.permission.CAMERA")) {
                            ToastUtil.show(this.activity, "请前往设置->应用->权限中打开相机权限，否则功能无法正常运行");
                            openAppDetail(40);
                        } else {
                            askPermissionError();
                        }
                    }
                }
                break;
            case 41:
                if (iArr.length > 0) {
                    if (Build.VERSION.SDK_INT < 33) {
                        if (iArr.length >= 3) {
                            if (iArr[0] != 0) {
                                if (!ActivityCompat.shouldShowRequestPermissionRationale(this.activity, "android.permission.CAMERA")) {
                                    ToastUtil.show(this.activity, "请前往设置->应用->权限中打开相机权限，否则功能无法正常运行");
                                    openAppDetail(41);
                                } else {
                                    askPermissionError();
                                }
                            } else if (iArr[1] != 0) {
                                if (!ActivityCompat.shouldShowRequestPermissionRationale(this.activity, "android.permission.RECORD_AUDIO")) {
                                    ToastUtil.show(this.activity, "请前往设置->应用->权限中打开录制权限，否则功能无法正常运行");
                                    openAppDetail(41);
                                } else {
                                    askPermissionError();
                                }
                            } else if (iArr[2] == 0) {
                                this.webViewClient.enterOldModeFaceVerify(false);
                            } else if (!ActivityCompat.shouldShowRequestPermissionRationale(this.activity, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                                ToastUtil.show(this.activity, "请前往设置->应用->权限中打开存储权限，否则功能无法正常运行");
                                openAppDetail(41);
                            } else {
                                askPermissionError();
                            }
                        }
                    } else if (iArr.length >= 2) {
                        if (iArr[0] != 0) {
                            if (!ActivityCompat.shouldShowRequestPermissionRationale(this.activity, "android.permission.CAMERA")) {
                                ToastUtil.show(this.activity, "请前往设置->应用->权限中打开相机权限，否则功能无法正常运行");
                                openAppDetail(41);
                            } else {
                                askPermissionError();
                            }
                        } else if (iArr[1] == 0) {
                            this.webViewClient.enterOldModeFaceVerify(false);
                        } else if (!ActivityCompat.shouldShowRequestPermissionRationale(this.activity, "android.permission.RECORD_AUDIO")) {
                            ToastUtil.show(this.activity, "请前往设置->应用->权限中打开录制权限，否则功能无法正常运行");
                            openAppDetail(41);
                        } else {
                            askPermissionError();
                        }
                    }
                }
                break;
        }
    }

    public void requestCameraAndSomePermissions(final String str, final boolean z) {
        HashMap map = new HashMap();
        map.put(PermissionDialog.PERMISSION_TIPS_REPORT_PAGE_TITLE, "开通欢太分期页");
        map.put(PermissionDialog.PERMISSION_TIPS_REPORT_POPUPS_TYPE, "获取摄像头权限弹窗");
        map.put(PermissionDialog.PERMISSION_TIPS_REPORT_POPUPS_SCENCE, "开通欢太分期前");
        map.put(PermissionDialog.PERMISSION_TIPS_REPORT_POPUPS_NAME, "摄像头获取提示");
        if (AppConfig.getInstance().isNeedShowPermissionTips("android.permission.CAMERA").booleanValue()) {
            Activity activity = this.activity;
            String string = activity.getString(R.string.before_permission_ask_tips);
            Activity activity2 = this.activity;
            DialogUtilKt.showPermissionTipsDialog(activity, string, activity2.getString(R.string.before_common_sdk_permission_camera, activity2.getResources().getString(R.string.permission_store_sdk_name)), this.activity.getString(R.string.pf_core_sure), new Function0<Unit>() { // from class: com.oppo.store.web.WBH5FaceVerifyHelper.1
                @Override // p010kotlin.jvm.functions.Function0
                public Unit invoke() {
                    WBH5FaceVerifyHelper.this.requestCameraAndSomePermissions(str, z);
                    return null;
                }
            }, this.activity.getString(R.string.permission_dialog_cancel), new Function0<Unit>() { // from class: com.oppo.store.web.WBH5FaceVerifyHelper.2
                @Override // p010kotlin.jvm.functions.Function0
                public Unit invoke() {
                    if (WBH5FaceVerifyHelper.this.webViewClient.getFilePathCallback() == null) {
                        return null;
                    }
                    WBH5FaceVerifyHelper.this.webViewClient.getFilePathCallback().onReceiveValue(new Uri[]{Uri.parse("")});
                    return null;
                }
            }, false, "android.permission.CAMERA", map);
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (checkSdkPermission("android.permission.CAMERA") == 0) {
                this.webViewClient.enterOldModeFaceVerify(false);
                return;
            } else if (ActivityCompat.shouldShowRequestPermissionRationale(this.activity, "android.permission.CAMERA")) {
                checkPermission(new String[]{"android.permission.CAMERA"});
                return;
            } else {
                checkPermission(new String[]{"android.permission.CAMERA"});
                return;
            }
        }
        if (checkSdkPermission("android.permission.CAMERA") == 0 && checkSdkPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            this.webViewClient.enterOldModeFaceVerify(false);
        } else if (ActivityCompat.shouldShowRequestPermissionRationale(this.activity, "android.permission.CAMERA") || ActivityCompat.shouldShowRequestPermissionRationale(this.activity, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            checkPermission(new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"});
        } else {
            checkPermission(new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"});
        }
    }

    public void requestCameraAndSoundsPermissions(final String str, final boolean z) {
        HashMap map = new HashMap();
        map.put(PermissionDialog.PERMISSION_TIPS_REPORT_PAGE_TITLE, "在线客服拍视频");
        map.put(PermissionDialog.PERMISSION_TIPS_REPORT_POPUPS_TYPE, "获取摄像头权限弹窗");
        map.put(PermissionDialog.PERMISSION_TIPS_REPORT_POPUPS_SCENCE, "在线客服拍视频前");
        map.put(PermissionDialog.PERMISSION_TIPS_REPORT_POPUPS_NAME, "摄像头获取提示");
        if (AppConfig.getInstance().isNeedShowPermissionTips(TIPS_CAMERA_RECORD).booleanValue()) {
            Activity activity = this.activity;
            String string = activity.getString(R.string.before_permission_ask_tips);
            Activity activity2 = this.activity;
            DialogUtilKt.showPermissionTipsDialog(activity, string, activity2.getString(R.string.before_common_sdk_permission_camera_record, activity2.getResources().getString(R.string.permission_store_sdk_name)), this.activity.getString(R.string.pf_core_sure), new Function0<Unit>() { // from class: com.oppo.store.web.WBH5FaceVerifyHelper.3
                @Override // p010kotlin.jvm.functions.Function0
                public Unit invoke() {
                    WBH5FaceVerifyHelper.this.requestCameraAndSoundsPermissions(str, z);
                    return null;
                }
            }, this.activity.getString(R.string.permission_dialog_cancel), new Function0<Unit>() { // from class: com.oppo.store.web.WBH5FaceVerifyHelper.4
                @Override // p010kotlin.jvm.functions.Function0
                public Unit invoke() {
                    if (WBH5FaceVerifyHelper.this.webViewClient.getFilePathCallback() == null) {
                        return null;
                    }
                    WBH5FaceVerifyHelper.this.webViewClient.getFilePathCallback().onReceiveValue(new Uri[]{Uri.parse("")});
                    return null;
                }
            }, false, TIPS_CAMERA_RECORD, map);
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (checkSdkPermission("android.permission.CAMERA") == 0 && checkSdkPermission("android.permission.RECORD_AUDIO") == 0) {
                this.webViewClient.enterOldModeFaceVerify(false);
                return;
            } else {
                checkCameraSoundsPermission(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"});
                return;
            }
        }
        if (checkSdkPermission("android.permission.CAMERA") == 0 && checkSdkPermission("android.permission.RECORD_AUDIO") == 0 && checkSdkPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            this.webViewClient.enterOldModeFaceVerify(false);
        } else {
            checkCameraSoundsPermission(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE"});
        }
    }

    public void requestCameraPermission() {
        PermissionUtil.checkAndRequestPermission(this.activity, "android.permission.CAMERA", 10001);
    }
}
