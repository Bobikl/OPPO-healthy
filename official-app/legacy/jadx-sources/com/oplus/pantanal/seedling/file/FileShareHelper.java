package com.oplus.pantanal.seedling.file;

import android.content.Context;
import android.net.Uri;
import com.heytap.log.consts.LogSenderConst;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.util.Logger;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010!\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010#\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J \u0010(\u001a\u00020\"2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u0004H\u0016J \u0010*\u001a\u00020\"2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0080\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0080\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tR\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/oplus/pantanal/seedling/file/FileShareHelper;", "Lcom/oplus/pantanal/seedling/file/IFileShare;", "()V", "DEFAULT_SHARE_FILE", "", "FILE_SHARE_PROVIDER", "MULTI_USER_RUN_IN_SINGLE_PROCESS", "", "getMULTI_USER_RUN_IN_SINGLE_PROCESS$seedling_support_manualRelease", "()[Ljava/lang/String;", "[Ljava/lang/String;", "PACKAGES_ARRAY", "getPACKAGES_ARRAY$seedling_support_manualRelease", "PACKAGE_AOD", "PACKAGE_ASSISTANTSCREEN", "PACKAGE_CALENDAR", "PACKAGE_FULL_SEARCH", "PACKAGE_HEALTH", "PACKAGE_LAUNCHER", "PACKAGE_OPPO_CAR", "PACKAGE_SECONDARY_HOME", "PACKAGE_SEEDLING_HOST_APP", "PACKAGE_SPEECH_ASSIST", "PACKAGE_SYSTEMUI", "PACKAGE_UMS", "createDefaultFile", "Ljava/io/File;", "context", "Landroid/content/Context;", "deleteDefaultShareFile", "", LogSenderConst.FILENAME, "getDefaultFilePath", "getDefaultFileUri", "Landroid/net/Uri;", "getDefaultShareFileByName", "getDefaultShareFileDir", "getDefaultSharePath", "getShareFileUri", "path", "getShareFileUriByAuthority", "authority", "permissionUri", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FileShareHelper implements IFileShare {

    @NotNull
    private static final String DEFAULT_SHARE_FILE = "share_images";

    @NotNull
    private static final String FILE_SHARE_PROVIDER = ".FileShareProvider";

    @NotNull
    private static final String PACKAGE_ASSISTANTSCREEN = "com.coloros.assistantscreen";

    @NotNull
    private static final String PACKAGE_CALENDAR = "com.coloros.calendar";

    @NotNull
    private static final String PACKAGE_FULL_SEARCH = "com.heytap.quicksearchbox";

    @NotNull
    private static final String PACKAGE_HEALTH = "com.heytap.health";

    @NotNull
    private static final String PACKAGE_LAUNCHER = "com.android.launcher";

    @NotNull
    private static final String PACKAGE_SECONDARY_HOME = "com.oplus.secondaryhome";

    @NotNull
    private static final String PACKAGE_SEEDLING_HOST_APP = "com.oplus.seedling.hostapp";

    @NotNull
    private static final String PACKAGE_SPEECH_ASSIST = "com.heytap.speechassist";

    @NotNull
    public static final String PACKAGE_SYSTEMUI = "com.android.systemui";

    @NotNull
    private static final String PACKAGE_UMS = "com.oplus.pantanal.ums";

    @NotNull
    public static final FileShareHelper INSTANCE = new FileShareHelper();

    @NotNull
    private static final String PACKAGE_OPPO_CAR = "com.oplus.ocar";

    @NotNull
    private static final String PACKAGE_AOD = "com.oplus.aod";

    @NotNull
    private static final String[] PACKAGES_ARRAY = {"com.android.systemui", "com.coloros.assistantscreen", "com.android.launcher", "com.oplus.pantanal.ums", "com.oplus.secondaryhome", PACKAGE_OPPO_CAR, PACKAGE_AOD, "com.coloros.calendar", "com.heytap.speechassist", "com.oplus.seedling.hostapp", "com.heytap.quicksearchbox", "com.heytap.health"};

    @NotNull
    private static final String[] MULTI_USER_RUN_IN_SINGLE_PROCESS = {"com.android.systemui"};

    private FileShareHelper() {
    }

    private final File createDefaultFile(Context context) {
        File file = new File(getDefaultSharePath(context));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String getDefaultFilePath(String fileName, Context context) {
        return createDefaultFile(context).getAbsolutePath() + File.separator + fileName;
    }

    private final String getDefaultSharePath(Context context) {
        return context.getFilesDir().toString() + File.separator + DEFAULT_SHARE_FILE;
    }

    private final Uri permissionUri(String path, Context context, String authority) {
        File file = new File(path);
        if (file.exists()) {
            Uri uriGenUri = UriPermissionUtils.genUri(context, authority, file);
            Logger.INSTANCE.i(Constants.TAG, "permissionUri after grant permission, uri= " + uriGenUri);
            return uriGenUri;
        }
        Logger.INSTANCE.i(Constants.TAG, "permissionUri The shared file is not exist!, shareFile:" + file.getPath());
        Uri EMPTY = Uri.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        return EMPTY;
    }

    @Override // com.oplus.pantanal.seedling.file.IFileShare
    public void deleteDefaultShareFile(@NotNull String fileName, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(getDefaultFilePath(fileName, context));
        if (file.exists()) {
            file.delete();
        }
    }

    @Override // com.oplus.pantanal.seedling.file.IFileShare
    @NotNull
    public Uri getDefaultFileUri(@NotNull String fileName, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(context, "context");
        return getShareFileUri(getDefaultFilePath(fileName, context), context);
    }

    @Override // com.oplus.pantanal.seedling.file.IFileShare
    @NotNull
    public File getDefaultShareFileByName(@NotNull String fileName, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(context, "context");
        return new File(getDefaultFilePath(fileName, context));
    }

    @Override // com.oplus.pantanal.seedling.file.IFileShare
    @NotNull
    public File getDefaultShareFileDir(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return createDefaultFile(context);
    }

    @NotNull
    public final String[] getMULTI_USER_RUN_IN_SINGLE_PROCESS$seedling_support_manualRelease() {
        return MULTI_USER_RUN_IN_SINGLE_PROCESS;
    }

    @NotNull
    public final String[] getPACKAGES_ARRAY$seedling_support_manualRelease() {
        return PACKAGES_ARRAY;
    }

    @Override // com.oplus.pantanal.seedling.file.IFileShare
    @NotNull
    public Uri getShareFileUri(@NotNull String path, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(context, "context");
        Logger.INSTANCE.i(Constants.TAG, "getShareFileUri,path:" + path);
        return permissionUri(path, context, context.getPackageName() + FILE_SHARE_PROVIDER);
    }

    @Override // com.oplus.pantanal.seedling.file.IFileShare
    @NotNull
    public Uri getShareFileUriByAuthority(@NotNull String path, @NotNull Context context, @NotNull String authority) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authority, "authority");
        return permissionUri(path, context, authority);
    }
}
