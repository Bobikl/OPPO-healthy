package com.oppo.store.web;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.webkit.ValueCallback;
import androidx.core.content.FileProvider;
import com.heytap.nearx.uikit.widget.dialogview.NearAlertDialogBuilder;
import com.heytap.store.base.core.state.Constants;
import com.heytap.store.base.core.util.app.AppConfig;
import com.heytap.store.base.core.util.file.FileUtils;
import com.heytap.store.base.core.util.permission.PermissionDialog;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.vc;
import com.oppo.store.web.SelectImageActivityWrapper;
import com.oppo.store.web.browser.R;
import com.oppo.store.web.util.DialogUtilKt;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.TuplesKt;
import p010kotlin.Unit;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 22\u00020\u0001:\u00012B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012(\b\u0002\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0016\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010 \u001a\u00020\u001bJ\b\u0010!\u001a\u00020\u001bH\u0002J\u0010\u0010\"\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010$J \u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010)J\u0006\u0010*\u001a\u00020\u001bJ\u000e\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001eJ\u0006\u0010-\u001a\u00020\u001bJ\u0010\u0010.\u001a\u00020\u001b2\b\b\u0002\u0010,\u001a\u00020\u001eJ\b\u0010/\u001a\u00020\u001bH\u0002J\u0006\u00100\u001a\u00020\u001bJ\b\u00101\u001a\u00020\u001bH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R(\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013¨\u00063"}, d2 = {"Lcom/oppo/store/web/SelectImageActivityWrapper;", "", "realActivity", "Landroid/app/Activity;", "reportData", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "(Landroid/app/Activity;Ljava/util/HashMap;)V", "CAMERA_RESULTCODE", "", "FILECHOOSER_RESULTCODE", "filePathCallback", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "getFilePathCallback", "()Landroid/webkit/ValueCallback;", "setFilePathCallback", "(Landroid/webkit/ValueCallback;)V", "mCameraUri", "mCompressPath", "mImagePaths", "uploadFileCallback", "getUploadFileCallback", "setUploadFileCallback", "afterOpenCamera", "", "changeReportDate", "isKefu", "", "isFace", "chooseFile", "chooseImage", "fromFileUri", Const.Scheme.SCHEME_FILE, "Ljava/io/File;", "handleOnActivityResult", vc.KEY_REQUEST_CODE, "resultCode", "data", "Landroid/content/Intent;", "onCancelSelectImage", "onlyGoCamera", "isClick", "onlyGoChoosImg", "openSystemCamera", "realOpenSystemCamera", "selectImage", "setPath", "Companion", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SelectImageActivityWrapper {
    private static final String TAG = SelectImageActivityWrapper.class.getSimpleName();
    private final int CAMERA_RESULTCODE;
    private final int FILECHOOSER_RESULTCODE;

    @Nullable
    private ValueCallback<Uri[]> filePathCallback;

    @Nullable
    private Uri mCameraUri;

    @NotNull
    private String mCompressPath;

    @NotNull
    private String mImagePaths;

    @NotNull
    private final Activity realActivity;

    @Nullable
    private HashMap<String, String> reportData;

    @Nullable
    private ValueCallback<Uri> uploadFileCallback;

    public SelectImageActivityWrapper(@NotNull Activity realActivity, @Nullable HashMap<String, String> map) {
        Intrinsics.checkNotNullParameter(realActivity, "realActivity");
        this.realActivity = realActivity;
        this.reportData = map;
        this.mImagePaths = "";
        this.FILECHOOSER_RESULTCODE = 1;
        this.CAMERA_RESULTCODE = 2;
        this.mCompressPath = "";
    }

    private final void afterOpenCamera() {
        try {
            ContentResolver contentResolver = this.realActivity.getContentResolver();
            String str = this.mImagePaths;
            MediaStore.Images.Media.insertImage(contentResolver, str, str, (String) null);
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        }
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(new File(this.mImagePaths)));
        this.realActivity.sendBroadcast(intent);
    }

    private final void chooseImage() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        this.realActivity.startActivityForResult(Intent.createChooser(intent, "File Chooser"), this.FILECHOOSER_RESULTCODE);
    }

    public static /* synthetic */ void openSystemCamera$default(SelectImageActivityWrapper selectImageActivityWrapper, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        selectImageActivityWrapper.openSystemCamera(z);
    }

    private final void realOpenSystemCamera() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        this.mImagePaths = FileUtils.TRIBUNE_STORAGE_PATH_CAMERA + System.currentTimeMillis() + ".jpg";
        File file = new File(this.mImagePaths);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        } else if (file.exists()) {
            file.delete();
        }
        Uri uriFromFileUri = fromFileUri(file);
        this.mCameraUri = uriFromFileUri;
        intent.putExtra("output", uriFromFileUri);
        intent.putExtra("caller", Constants.STORE_APP_PACKAGE_NAME);
        this.realActivity.startActivityForResult(intent, this.CAMERA_RESULTCODE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: selectImage$lambda-0, reason: not valid java name */
    public static final void m5225selectImage$lambda0(SelectImageActivityWrapper this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 0) {
            this$0.openSystemCamera(true);
            dialogInterface.dismiss();
        } else if (i == 1) {
            this$0.chooseImage();
            dialogInterface.dismiss();
        }
        this$0.setPath();
        SensorsDataAutoTrackHelper.trackDialog(dialogInterface, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: selectImage$lambda-1, reason: not valid java name */
    public static final void m5226selectImage$lambda1(SelectImageActivityWrapper this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onCancelSelectImage();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: selectImage$lambda-2, reason: not valid java name */
    public static final void m5227selectImage$lambda2(SelectImageActivityWrapper this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onCancelSelectImage();
        dialogInterface.dismiss();
        SensorsDataAutoTrackHelper.trackDialog(dialogInterface, i);
    }

    private final void setPath() {
        String TRIBUNE_STORAGE_PATH_INIT_PIC = FileUtils.TRIBUNE_STORAGE_PATH_INIT_PIC;
        Intrinsics.checkNotNullExpressionValue(TRIBUNE_STORAGE_PATH_INIT_PIC, "TRIBUNE_STORAGE_PATH_INIT_PIC");
        this.mCompressPath = TRIBUNE_STORAGE_PATH_INIT_PIC;
        new File(this.mCompressPath).mkdirs();
        this.mCompressPath += "compress.jpg";
    }

    public final void changeReportDate(boolean isKefu, boolean isFace) {
        if (isKefu) {
            this.reportData = MapsKt__MapsKt.hashMapOf(TuplesKt.to(PermissionDialog.PERMISSION_TIPS_REPORT_PAGE_TITLE, "在线客服咨询页"), TuplesKt.to(PermissionDialog.PERMISSION_TIPS_REPORT_POPUPS_TYPE, "获取相机权限弹窗"), TuplesKt.to(PermissionDialog.PERMISSION_TIPS_REPORT_POPUPS_SCENCE, "客服会话拍摄前"), TuplesKt.to(PermissionDialog.PERMISSION_TIPS_REPORT_POPUPS_NAME, "相机权限获取提示"));
        } else if (isFace) {
            this.reportData = MapsKt__MapsKt.hashMapOf(TuplesKt.to(PermissionDialog.PERMISSION_TIPS_REPORT_PAGE_TITLE, "开通欢太分期"), TuplesKt.to(PermissionDialog.PERMISSION_TIPS_REPORT_POPUPS_TYPE, "获取摄像头权限弹窗"), TuplesKt.to(PermissionDialog.PERMISSION_TIPS_REPORT_POPUPS_SCENCE, "开通欢太分期前"), TuplesKt.to(PermissionDialog.PERMISSION_TIPS_REPORT_POPUPS_NAME, "相机权限获取提示"));
        } else {
            this.reportData = new HashMap<>();
        }
    }

    public final void chooseFile() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        this.realActivity.startActivityForResult(Intent.createChooser(intent, "File Chooser"), this.FILECHOOSER_RESULTCODE);
    }

    @NotNull
    public final Uri fromFileUri(@Nullable File file) {
        Activity activity = this.realActivity;
        String str = this.realActivity.getPackageName() + ".storeweb.fileprovider";
        Intrinsics.checkNotNull(file);
        Uri uriForFile = FileProvider.getUriForFile(activity, str, file);
        Intrinsics.checkNotNullExpressionValue(uriForFile, "{\n\n            FileProvi…!\n            )\n        }");
        return uriForFile;
    }

    @Nullable
    public final ValueCallback<Uri[]> getFilePathCallback() {
        return this.filePathCallback;
    }

    @Nullable
    public final ValueCallback<Uri> getUploadFileCallback() {
        return this.uploadFileCallback;
    }

    public final void handleOnActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        Uri data2;
        if (this.uploadFileCallback == null && this.filePathCallback == null) {
            return;
        }
        if (requestCode == this.CAMERA_RESULTCODE) {
            if (!new File(this.mImagePaths).exists()) {
                this.mCameraUri = Uri.parse("");
            }
            afterOpenCamera();
            data2 = this.mCameraUri;
        } else {
            data2 = (requestCode == this.FILECHOOSER_RESULTCODE && data != null && resultCode == -1) ? data.getData() : null;
        }
        if (data2 != null) {
            ValueCallback<Uri[]> valueCallback = this.filePathCallback;
            if (valueCallback != null) {
                Intrinsics.checkNotNull(valueCallback);
                valueCallback.onReceiveValue(new Uri[]{data2});
            } else {
                ValueCallback<Uri> valueCallback2 = this.uploadFileCallback;
                Intrinsics.checkNotNull(valueCallback2);
                valueCallback2.onReceiveValue(data2);
            }
        } else {
            onCancelSelectImage();
        }
        this.filePathCallback = null;
        this.uploadFileCallback = null;
    }

    public final void onCancelSelectImage() {
        if (this.filePathCallback != null) {
            Uri[] uriArr = {Uri.parse("")};
            ValueCallback<Uri[]> valueCallback = this.filePathCallback;
            Intrinsics.checkNotNull(valueCallback);
            valueCallback.onReceiveValue(uriArr);
            this.filePathCallback = null;
            return;
        }
        ValueCallback<Uri> valueCallback2 = this.uploadFileCallback;
        if (valueCallback2 == null) {
            return;
        }
        Intrinsics.checkNotNull(valueCallback2);
        valueCallback2.onReceiveValue(Uri.parse(""));
        this.uploadFileCallback = null;
    }

    public final void onlyGoCamera(boolean isClick) {
        openSystemCamera(isClick);
        setPath();
    }

    public final void onlyGoChoosImg() {
        chooseImage();
        setPath();
    }

    public final void openSystemCamera(final boolean isClick) {
        if (isClick) {
            Boolean boolIsNeedShowPermissionTips = AppConfig.getInstance().isNeedShowPermissionTips("android.permission.CAMERA");
            Intrinsics.checkNotNullExpressionValue(boolIsNeedShowPermissionTips, "getInstance().isNeedShow…nifest.permission.CAMERA)");
            if (boolIsNeedShowPermissionTips.booleanValue()) {
                Activity activity = this.realActivity;
                String string = activity.getString(R.string.before_permission_ask_tips);
                Intrinsics.checkNotNullExpressionValue(string, "realActivity.getString(R…fore_permission_ask_tips)");
                Activity activity2 = this.realActivity;
                String string2 = activity2.getString(R.string.before_common_sdk_permission_camera, activity2.getResources().getString(R.string.permission_store_sdk_name));
                Intrinsics.checkNotNullExpressionValue(string2, "realActivity.getString(\n…k_name)\n                )");
                String string3 = this.realActivity.getString(R.string.pf_core_sure);
                Intrinsics.checkNotNullExpressionValue(string3, "realActivity.getString(R.string.pf_core_sure)");
                Function0<Unit> function0 = new Function0<Unit>() { // from class: com.oppo.store.web.SelectImageActivityWrapper.openSystemCamera.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        SelectImageActivityWrapper.this.openSystemCamera(isClick);
                    }
                };
                String string4 = this.realActivity.getString(R.string.permission_dialog_cancel);
                Function0<Unit> function1 = new Function0<Unit>() { // from class: com.oppo.store.web.SelectImageActivityWrapper.openSystemCamera.2
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        SelectImageActivityWrapper.this.onCancelSelectImage();
                    }
                };
                HashMap<String, String> map = this.reportData;
                if (map == null) {
                    map = new HashMap<>();
                }
                DialogUtilKt.showPermissionTipsDialog(activity, string, string2, string3, function0, string4, function1, false, "android.permission.CAMERA", map);
                return;
            }
        }
        if (PermissionDialog.reCheckCameraPermission(this.realActivity, 14)) {
            realOpenSystemCamera();
        }
    }

    public final void selectImage() {
        if (FileUtils.checkSDcard(this.realActivity)) {
            new NearAlertDialogBuilder(this.realActivity).setWindowGravity(80).setItems((CharSequence[]) new String[]{this.realActivity.getString(R.string.take_pic_by_camera), this.realActivity.getString(R.string.take_pic_by_album)}, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.xrg
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    SelectImageActivityWrapper.m5225selectImage$lambda0(this.i, dialogInterface, i);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.oplus.aiunit.vision.yrg
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    SelectImageActivityWrapper.m5226selectImage$lambda1(this.i, dialogInterface);
                }
            }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.zrg
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    SelectImageActivityWrapper.m5227selectImage$lambda2(this.i, dialogInterface, i);
                }
            }).show();
        }
    }

    public final void setFilePathCallback(@Nullable ValueCallback<Uri[]> valueCallback) {
        this.filePathCallback = valueCallback;
    }

    public final void setUploadFileCallback(@Nullable ValueCallback<Uri> valueCallback) {
        this.uploadFileCallback = valueCallback;
    }

    public /* synthetic */ SelectImageActivityWrapper(Activity activity, HashMap map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, (i & 2) != 0 ? new HashMap() : map);
    }
}
