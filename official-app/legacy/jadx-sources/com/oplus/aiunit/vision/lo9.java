package com.oplus.aiunit.vision;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public interface lo9 {
    public static final String ALBUM_STYLE_FILE_JPG_FORMAT = "album_style_%1d_";
    public static final String TAG_DEFAULT_CREATION_ALBUM = "album";
    public static final String TAG_DEFAULT_CREATION_CLASSIC = "classic";
    public static final String TAG_DEFAULT_CREATION_OMOJI = "omoji";
    public static final String TAG_DEFAULT_CREATION_OUTFITS = "outfits";
    public static final String TAG_DEFAULT_CREATION_PAINT = "paint";
    public static final String TAG_DEFAULT_CREATION_VIDEO = "video";
    public static final String TAG_DEFAULT_CREATION_WALLPAPER = "wallpaper";

    int a();

    Map<String, int[]> b();

    Map<String, List<k11>> c();

    boolean d();

    Map<String, int[]> e();

    boolean f();

    int g();
}
