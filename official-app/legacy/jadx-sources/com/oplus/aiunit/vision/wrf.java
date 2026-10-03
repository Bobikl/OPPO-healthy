package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u0000 \u00132\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/wrf;", "", "Ljava/io/File;", "a", "", "d", b2n.g, "f", MapSchema.FIELD_NAME_ENTRY, "name", "c", "suffix", b2n.f, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "basePkgDir", "<init>", "(Ljava/lang/String;)V", "Companion", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class wrf {

    @NotNull
    public static final String DEFAULT_COLOR = "#00000000";

    @NotNull
    public static final String DEFAULT_EDIT_IMG_NAME = "edit.png";

    @NotNull
    public static final String DEFAULT_FONT_DIR_NAME = "fonts";

    @NotNull
    public static final String DEFAULT_IMAGES_DIR_NAME = "images";

    @NotNull
    public static final String DEFAULT_INFO_RES_NAME = "infos.json";

    @NotNull
    public static final String DEFAULT_MANIFEST_RES_NAME = "manifest.json";

    @NotNull
    public static final String DEFAULT_PREVIEW_IMG_NAME = "preview.png";

    @NotNull
    public static final String DEFAULT_VIDEO_DIR_NAME = "videos";

    @NotNull
    public static final String SUFFIX_NAME_FONT = ".ttf";

    @NotNull
    public static final String SUFFIX_NAME_IMG = ".png";

    @NotNull
    public static final String SUFFIX_NAME_VIDEO = ".mp4";

    @NotNull
    public static final String TAG = "ResFileHelper";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String basePkgDir;

    public wrf(@NotNull String basePkgDir) {
        Intrinsics.checkNotNullParameter(basePkgDir, "basePkgDir");
        this.basePkgDir = basePkgDir;
    }

    @NotNull
    public final File a() {
        return new File(this.basePkgDir);
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBasePkgDir() {
        return this.basePkgDir;
    }

    @NotNull
    public final String c(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.basePkgDir + "/" + name;
    }

    @NotNull
    public final String d() {
        return c(DEFAULT_IMAGES_DIR_NAME);
    }

    @NotNull
    public final String e() {
        return this.basePkgDir + "/infos.json";
    }

    @NotNull
    public final String f() {
        return this.basePkgDir + "/manifest.json";
    }

    @NotNull
    public final String g(@NotNull String suffix) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return this.basePkgDir + suffix;
    }

    @NotNull
    public final String h() {
        return c("videos");
    }
}
