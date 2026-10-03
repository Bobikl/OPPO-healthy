package com.oplus.aiuint.open.wallpaper.plugin;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class WallpaperMattingConstant {

    @NotNull
    public static final String ACTION_INIT = "wallpaper_matting_plugin_init";

    @NotNull
    public static final String ACTION_MATTING = "wallpaper_matting_plugin_matting";

    @NotNull
    public static final String DETECT_NAME = "wallpaper_matting";

    @NotNull
    public static final WallpaperMattingConstant INSTANCE = new WallpaperMattingConstant();

    @NotNull
    public static final String PARAM_ACTION_NAME = "face_feature_plugin_param_name";

    @NotNull
    public static final String PARAM_VERSION_CODE = "face_feature_plugin_version_code";

    @NotNull
    public static final String RESULT_MATTING_BITMAP_TAG = "wallpaper_matting_result_matting_bitmap_tag";

    private WallpaperMattingConstant() {
    }
}
