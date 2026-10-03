package com.oplus.pantanal.seedling.file;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.backup.sdk.common.plugin.BRPluginConfig;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.util.Logger;
import com.oplus.smartenginehelper.ParserTag;
import java.io.File;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000bH\u0007J(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000bH\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/oplus/pantanal/seedling/file/UriPermissionUtils;", "", "()V", "GRANT_MODE_FLAGS", "", "MAIN_USER_ID", "genUri", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "authority", "", Const.Scheme.SCHEME_FILE, "Ljava/io/File;", "grantUriPermission", "", ParserTag.TAG_URI, BRPluginConfig.TARGET_PACKAGE, "grantUriPermissionToUser", "", "userId", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UriPermissionUtils {
    private static final int GRANT_MODE_FLAGS = 193;

    @NotNull
    public static final UriPermissionUtils INSTANCE = new UriPermissionUtils();
    private static final int MAIN_USER_ID = 0;

    private UriPermissionUtils() {
    }

    @JvmStatic
    @NotNull
    public static final Uri genUri(@NotNull Context context, @NotNull String authority, @NotNull File file) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authority, "authority");
        Intrinsics.checkNotNullParameter(file, "file");
        Uri uriForFile = FileProvider.getUriForFile(context, authority, file);
        for (String str : FileShareHelper.INSTANCE.getPACKAGES_ARRAY$seedling_support_manualRelease()) {
            Intrinsics.checkNotNull(uriForFile);
            grantUriPermission(context, uriForFile, str);
        }
        for (String str2 : FileShareHelper.INSTANCE.getMULTI_USER_RUN_IN_SINGLE_PROCESS$seedling_support_manualRelease()) {
            Intrinsics.checkNotNull(uriForFile);
            grantUriPermissionToUser(context, uriForFile, 0, str2);
        }
        Logger.INSTANCE.i(Constants.TAG, "genUri, uri=" + uriForFile + ", authority=" + authority + ", file=" + file);
        Intrinsics.checkNotNull(uriForFile);
        return uriForFile;
    }

    @JvmStatic
    public static final void grantUriPermission(@NotNull Context context, @NotNull Uri uri, @NotNull String targetPackage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(targetPackage, "targetPackage");
        context.grantUriPermission(targetPackage, uri, 193);
    }

    @JvmStatic
    private static final boolean grantUriPermissionToUser(Context context, Uri uri, int userId, String targetPackage) {
        Object objM5287constructorimpl;
        Logger logger = Logger.INSTANCE;
        logger.i(Constants.TAG, "grantUriPermissionToUser userId:" + userId + ", targetPackage:" + targetPackage + ", uri:" + uri);
        try {
            Result.Companion companion = Result.INSTANCE;
            Class<?> cls = Class.forName("android.app.OplusActivityManager");
            Object objNewInstance = cls.newInstance();
            Class<?> cls2 = Integer.TYPE;
            Method declaredMethod = cls.getDeclaredMethod("grantUriPermissionToUser", Context.class, String.class, Uri.class, cls2, cls2);
            Intrinsics.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(objNewInstance, context, targetPackage, uri, 193, Integer.valueOf(userId));
            logger.i(Constants.TAG, "grantUriPermissionToUser success......");
            objM5287constructorimpl = Result.m5287constructorimpl(Boolean.TRUE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            Logger.INSTANCE.e(Constants.TAG, "grantUriPermissionToUser error, errorMsg:" + thM5290exceptionOrNullimpl.getMessage() + " cause:" + thM5290exceptionOrNullimpl.getCause());
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            objM5287constructorimpl = bool;
        }
        return ((Boolean) objM5287constructorimpl).booleanValue();
    }
}
