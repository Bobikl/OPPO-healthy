package com.oplus.seedling.sdk.plugin;

import android.content.Context;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/oplus/seedling/sdk/plugin/SeedlingConstants;", "", "()V", "PluginClassField", "PluginFilePath", "base-plugin-manage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SeedlingConstants {

    @NotNull
    public static final SeedlingConstants INSTANCE = new SeedlingConstants();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/oplus/seedling/sdk/plugin/SeedlingConstants$PluginClassField;", "", "()V", "PACKAGE_PATH_SEEDLING_MANAGER", "", "PACKAGE_PATH_SEEDLING_SDK", "base-plugin-manage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PluginClassField {

        @NotNull
        public static final PluginClassField INSTANCE = new PluginClassField();

        @NotNull
        public static final String PACKAGE_PATH_SEEDLING_MANAGER = "com.oplus.seedling.framework.manager.SeedlingManager";

        @NotNull
        public static final String PACKAGE_PATH_SEEDLING_SDK = "com.oplus.seedling.framework.manager.SeedlingSdkInternal";

        private PluginClassField() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001aH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0012\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\r¨\u0006 "}, d2 = {"Lcom/oplus/seedling/sdk/plugin/SeedlingConstants$PluginFilePath;", "", "()V", "FILE_PLUGIN", "", "FILE_SO", "FOLDER_SDK", "FOLDER_SDK_CACHE", "FOLDER_SDK_LITE", "FOLDER_SDK_STANDARD", "FOLDER_SO", "PATH_REMOTE_CONFIG", "getPATH_REMOTE_CONFIG", "()Ljava/lang/String;", "PATH_REMOTE_SDK_LITE", "getPATH_REMOTE_SDK_LITE", "PATH_REMOTE_SDK_STANDARD", "getPATH_REMOTE_SDK_STANDARD", "PATH_REMOTE_SO_FOLDER_LITE", "getPATH_REMOTE_SO_FOLDER_LITE", "PATH_REMOTE_SO_FOLDER_STANDARD", "getPATH_REMOTE_SO_FOLDER_STANDARD", "PATH_REMOTE_SO_STANDARD", "getPATH_REMOTE_SO_STANDARD", "getPathFolderSdk", "context", "Landroid/content/Context;", "getPathFolderSdkCache", "getPathFolderSo", "getPathFolderSoCache", "getPathLocalConfig", "getPathPlugin", "base-plugin-manage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PluginFilePath {

        @NotNull
        public static final String FILE_PLUGIN = "SeedlingSdk.apk";

        @NotNull
        public static final String FILE_SO = "libuleflutter.so";

        @NotNull
        public static final String FOLDER_SDK = "seedlingsdk_plugin";

        @NotNull
        private static final String FOLDER_SDK_CACHE = "seedlingsdk_plugin_cache";

        @NotNull
        public static final String FOLDER_SDK_LITE = "lite";

        @NotNull
        public static final String FOLDER_SDK_STANDARD = "standard";

        @NotNull
        private static final String FOLDER_SO = "lib_so";

        @NotNull
        public static final PluginFilePath INSTANCE = new PluginFilePath();

        @NotNull
        private static final String PATH_REMOTE_CONFIG;

        @NotNull
        private static final String PATH_REMOTE_SDK_LITE;

        @NotNull
        private static final String PATH_REMOTE_SDK_STANDARD;

        @NotNull
        private static final String PATH_REMOTE_SO_FOLDER_LITE;

        @NotNull
        private static final String PATH_REMOTE_SO_FOLDER_STANDARD;

        @NotNull
        private static final String PATH_REMOTE_SO_STANDARD;

        static {
            String str = File.separator;
            PATH_REMOTE_CONFIG = FOLDER_SDK + str + "config.json";
            PATH_REMOTE_SDK_LITE = FOLDER_SDK + str + "lite" + str + FILE_PLUGIN;
            PATH_REMOTE_SDK_STANDARD = FOLDER_SDK + str + FOLDER_SDK_STANDARD + str + FILE_PLUGIN;
            PATH_REMOTE_SO_STANDARD = FOLDER_SDK + str + FOLDER_SDK_STANDARD + str + FOLDER_SO + str + FILE_SO;
            StringBuilder sb = new StringBuilder();
            sb.append(FOLDER_SDK);
            sb.append(str);
            sb.append("lite");
            sb.append(str);
            sb.append(FOLDER_SO);
            PATH_REMOTE_SO_FOLDER_LITE = sb.toString();
            PATH_REMOTE_SO_FOLDER_STANDARD = FOLDER_SDK + str + FOLDER_SDK_STANDARD + str + FOLDER_SO;
        }

        private PluginFilePath() {
        }

        @JvmStatic
        @NotNull
        public static final String getPathFolderSdk(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return (context.getFilesDir().getAbsolutePath() + File.separator) + FOLDER_SDK;
        }

        @JvmStatic
        @NotNull
        public static final String getPathFolderSdkCache(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return (context.getFilesDir().getAbsolutePath() + File.separator) + FOLDER_SDK_CACHE;
        }

        @JvmStatic
        @NotNull
        public static final String getPathFolderSo(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return getPathFolderSdk(context) + File.separator + FOLDER_SO;
        }

        @JvmStatic
        @NotNull
        public static final String getPathFolderSoCache(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String absolutePath = context.getFilesDir().getAbsolutePath();
            String str = File.separator;
            return (absolutePath + str) + FOLDER_SDK_CACHE + str + FOLDER_SO;
        }

        @JvmStatic
        @NotNull
        public static final String getPathLocalConfig(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return getPathFolderSdk(context) + File.separator + "config.json";
        }

        @JvmStatic
        @NotNull
        public static final String getPathPlugin(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return getPathFolderSdk(context) + File.separator + FILE_PLUGIN;
        }

        @NotNull
        public final String getPATH_REMOTE_CONFIG() {
            return PATH_REMOTE_CONFIG;
        }

        @NotNull
        public final String getPATH_REMOTE_SDK_LITE() {
            return PATH_REMOTE_SDK_LITE;
        }

        @NotNull
        public final String getPATH_REMOTE_SDK_STANDARD() {
            return PATH_REMOTE_SDK_STANDARD;
        }

        @NotNull
        public final String getPATH_REMOTE_SO_FOLDER_LITE() {
            return PATH_REMOTE_SO_FOLDER_LITE;
        }

        @NotNull
        public final String getPATH_REMOTE_SO_FOLDER_STANDARD() {
            return PATH_REMOTE_SO_FOLDER_STANDARD;
        }

        @NotNull
        public final String getPATH_REMOTE_SO_STANDARD() {
            return PATH_REMOTE_SO_STANDARD;
        }
    }

    private SeedlingConstants() {
    }
}
