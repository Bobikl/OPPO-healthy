package com.oplus.mydevices.sdk.utils;

import android.content.Context;
import android.net.Uri;
import com.oplus.mydevices.sdk.Constants;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u001c\u0010\u000b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/oplus/mydevices/sdk/utils/UriPermissionUtils;", "", "()V", "TAG", "", "grantUriPermission", "", "context", "Landroid/content/Context;", ParserTag.TAG_URI, "Landroid/net/Uri;", "revokeUriPermission", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final class UriPermissionUtils {
    public static final UriPermissionUtils INSTANCE = new UriPermissionUtils();
    private static final String TAG = "UriPermissionUtils";

    private UriPermissionUtils() {
    }

    @JvmStatic
    public static final void grantUriPermission(@Nullable Context context, @Nullable Uri uri) {
        if (uri == null) {
            return;
        }
        if (context != null) {
            try {
                context.grantUriPermission(Constants.PACKAGE_NAME_MY_DEVICE, uri, 1);
            } catch (Exception e2) {
                LogUtils.INSTANCE.e(TAG, "grant uri error! " + e2.getMessage());
                return;
            }
        }
        if (context != null) {
            context.grantUriPermission("com.coloros.assistantscreen", uri, 1);
        }
        if (context != null) {
            context.grantUriPermission("com.android.launcher", uri, 1);
        }
    }

    @JvmStatic
    public static final void revokeUriPermission(@Nullable Context context, @Nullable Uri uri) {
        if (uri == null) {
            return;
        }
        if (context != null) {
            try {
                context.revokeUriPermission(Constants.PACKAGE_NAME_MY_DEVICE, uri, 1);
            } catch (Exception e2) {
                LogUtils.INSTANCE.e(TAG, "revoke error ! " + e2.getMessage());
                return;
            }
        }
        if (context != null) {
            context.revokeUriPermission("com.android.launcher", uri, 1);
        }
        if (context != null) {
            context.revokeUriPermission("com.coloros.assistantscreen", uri, 1);
        }
    }
}
