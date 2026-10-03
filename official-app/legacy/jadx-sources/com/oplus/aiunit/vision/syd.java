package com.oplus.aiunit.vision;

import com.heytap.health.watchface.R$drawable;

/* JADX INFO: loaded from: classes19.dex */
public class syd extends s3 {
    public static final int[] ALBUM_DEFAULT_BACKGROUND;
    public static final int[] TIME_STYLE_ALBUM;
    public static final int[] TIME_STYLE_OMOJI;
    public static final int[] TIME_STYLE_PAINT;
    public static final int[] TIME_STYLE_VIDEO;
    public static final int[] WALLPAPER_DEFAULT_BACKGROUND;

    static {
        int i = R$drawable.watch_face_v3_album_clock_style_1;
        int i2 = R$drawable.watch_face_v3_album_clock_style_2;
        int i3 = R$drawable.watch_face_v3_v3pro_clock_style_3;
        TIME_STYLE_ALBUM = new int[]{i, i2, i3};
        TIME_STYLE_PAINT = new int[]{R$drawable.watch_face_v3_clock_style_4, R$drawable.watch_face_v3_clock_style_5, i3};
        TIME_STYLE_OMOJI = new int[]{R$drawable.watch_face_v3_clock_style_omoji_0, R$drawable.watch_face_v3_clock_style_omoji_1, R$drawable.watch_face_v3_clock_style_omoji_2, R$drawable.watch_face_v3_clock_style_omoji_3, R$drawable.watch_face_v3_clock_style_omoji_4, R$drawable.watch_face_v3_clock_style_omoji_5};
        ALBUM_DEFAULT_BACKGROUND = new int[]{R$drawable.watch_face_v3_album_default_up, R$drawable.watch_face_v3_album_default_down, R$drawable.watch_face_v3_album_default_pointer};
        int i4 = R$drawable.watch_face_v3_wallpaper_default_bg_down;
        WALLPAPER_DEFAULT_BACKGROUND = new int[]{i4, R$drawable.watch_face_v3_wallpaper_default_bg_up, i4};
        TIME_STYLE_VIDEO = new int[]{R$drawable.watch_face_v3_video_clock_style_1, R$drawable.watch_face_v3_video_clock_style_2, R$drawable.watch_face_v3_video_clock_style_3, R$drawable.watch_face_v3_video_clock_style_4};
    }

    @Override // com.oplus.aiunit.vision.s3
    public lo9 b() {
        return new ryd();
    }
}
