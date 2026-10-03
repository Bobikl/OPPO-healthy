package com.oplus.aiunit.vision;

import android.content.Context;
import io.protostuff.MapSchema;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\f\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/i04;", "", "Landroid/content/Context;", "context", "", "f", b2n.f, b2n.g, MapSchema.FIELD_NAME_ENTRY, "FOLDER_SDK_CARD_GROUP", "Ljava/lang/String;", "FILE_PLUGIN_CARD_GROUP", "a", "c", "()Ljava/lang/String;", "PATH_REMOTE_CONFIG_CARD_GROUP", "b", "d", "PATH_REMOTE_SDK_LITE_CARD_GROUP", "PATH_PLUGIN_BUILT_IN_CARD_GROUP", "PATH_BUILT_IN_CONFIG_CARD_GROUP", "<init>", "()V", "base-plugin-manage_release"}, k = 1, mv = {1, 8, 0})
public final class i04 {

    @NotNull
    public static final String FILE_PLUGIN_CARD_GROUP = "PantanalCardGroupSdk.apk";

    @NotNull
    public static final String FOLDER_SDK_CARD_GROUP = "card_group_plugin";

    @NotNull
    public static final i04 INSTANCE = new i04();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String PATH_REMOTE_CONFIG_CARD_GROUP;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final String PATH_REMOTE_SDK_LITE_CARD_GROUP;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String PATH_PLUGIN_BUILT_IN_CARD_GROUP;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final String PATH_BUILT_IN_CONFIG_CARD_GROUP;

    static {
        String str = File.separator;
        PATH_REMOTE_CONFIG_CARD_GROUP = FOLDER_SDK_CARD_GROUP + str + "config.json";
        PATH_REMOTE_SDK_LITE_CARD_GROUP = FOLDER_SDK_CARD_GROUP + str + FILE_PLUGIN_CARD_GROUP;
        PATH_PLUGIN_BUILT_IN_CARD_GROUP = "card_group_plugin_buildIn" + str + FILE_PLUGIN_CARD_GROUP;
        PATH_BUILT_IN_CONFIG_CARD_GROUP = "card_group_plugin_buildIn" + str + "config.json";
    }

    @JvmStatic
    @NotNull
    public static final String e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (context.getFilesDir().getAbsolutePath() + File.separator) + "card_group_plugin_cache";
    }

    @JvmStatic
    @NotNull
    public static final String f(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (context.getFilesDir().getAbsolutePath() + File.separator) + FOLDER_SDK_CARD_GROUP;
    }

    @JvmStatic
    @NotNull
    public static final String g(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return f(context) + File.separator + "config.json";
    }

    @JvmStatic
    @NotNull
    public static final String h(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return f(context) + File.separator + FILE_PLUGIN_CARD_GROUP;
    }

    @NotNull
    public final String a() {
        return PATH_BUILT_IN_CONFIG_CARD_GROUP;
    }

    @NotNull
    public final String b() {
        return PATH_PLUGIN_BUILT_IN_CARD_GROUP;
    }

    @NotNull
    public final String c() {
        return PATH_REMOTE_CONFIG_CARD_GROUP;
    }

    @NotNull
    public final String d() {
        return PATH_REMOTE_SDK_LITE_CARD_GROUP;
    }
}
