package com.heytap.store.platform.barcode;

import android.app.Activity;
import android.util.Log;
import com.heytap.health.settings.me.settings2.permission.PermissionDetailAct;
import com.oplus.aiunit.vision.vc;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0001\u001a\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE", "", "PERMISSIONS_REQUEST_USE_CAMERA", "checkAndRequestCameraPermission", "", "activity", "Landroid/app/Activity;", "checkAndRequestPermission", "context", PermissionDetailAct.PERMISSION, "", vc.KEY_REQUEST_CODE, "checkAndRequestReadExternalStoragePermission", "checkCameraPermission", "checkPermission", "barcode_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class PermissionHelperKt {
    public static final int PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE = 12;
    public static final int PERMISSIONS_REQUEST_USE_CAMERA = 14;

    public static final boolean checkAndRequestCameraPermission(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return checkAndRequestPermission(activity, "android.permission.CAMERA", 14);
    }

    public static final boolean checkAndRequestPermission(@NotNull Activity context, @NotNull String permission, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permission, "permission");
        if (context.checkSelfPermission(permission) == 0) {
            return true;
        }
        try {
            context.requestPermissions(new String[]{permission}, i);
            return false;
        } catch (Exception e2) {
            Log.e("PermissionHelper", e2.getMessage());
            e2.printStackTrace();
            return false;
        }
    }

    public static final boolean checkAndRequestReadExternalStoragePermission(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return checkAndRequestPermission(activity, "android.permission.READ_EXTERNAL_STORAGE", 12);
    }

    public static final boolean checkCameraPermission(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return checkPermission(activity, "android.permission.CAMERA");
    }

    public static final boolean checkPermission(@NotNull Activity context, @NotNull String permission) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return context.checkSelfPermission(permission) == 0;
    }
}
