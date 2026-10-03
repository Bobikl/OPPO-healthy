package com.oplus.pantanal.seedling.file;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.util.Logger;
import com.oplus.smartenginehelper.ParserTag;
import java.io.File;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000bH\u0007J(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000bH\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/oplus/pantanal/seedling/file/UriPermissionUtils;", "", "()V", "GRANT_MODE_FLAGS", "", "MAIN_USER_ID", "genUri", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "authority", "", "file", "Ljava/io/File;", "grantUriPermission", "", ParserTag.TAG_URI, "targetPackage", "grantUriPermissionToUser", "", "userId", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
        Intrinsics.checkNotNullParameter(uri, ParserTag.TAG_URI);
        Intrinsics.checkNotNullParameter(targetPackage, "targetPackage");
        context.grantUriPermission(targetPackage, uri, GRANT_MODE_FLAGS);
    }

    @JvmStatic
    private static final boolean grantUriPermissionToUser(Context context, Uri uri, int userId, String targetPackage) {
        Object obj;
        Logger logger = Logger.INSTANCE;
        logger.i(Constants.TAG, "grantUriPermissionToUser userId:" + userId + ", targetPackage:" + targetPackage + ", uri:" + uri);
        try {
            Result.Companion companion = Result.Companion;
            Class<?> cls = Class.forName("android.app.OplusActivityManager");
            Object objNewInstance = cls.newInstance();
            Class<?> cls2 = Integer.TYPE;
            Method declaredMethod = cls.getDeclaredMethod("grantUriPermissionToUser", Context.class, String.class, Uri.class, cls2, cls2);
            Intrinsics.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(objNewInstance, context, targetPackage, uri, Integer.valueOf(GRANT_MODE_FLAGS), Integer.valueOf(userId));
            logger.i(Constants.TAG, "grantUriPermissionToUser success......");
            obj = Result.constructor-impl(Boolean.TRUE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logger.INSTANCE.e(Constants.TAG, "grantUriPermissionToUser error, errorMsg:" + th2.getMessage() + " cause:" + th2.getCause());
        }
        Boolean bool = Boolean.FALSE;
        if (Result.isFailure-impl(obj)) {
            obj = bool;
        }
        return ((Boolean) obj).booleanValue();
    }
}
