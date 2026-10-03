package com.oplus.aiunit.vision;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class x7l {
    public static final String CROPPED_WALLPAPER_JPG = "preview.jpg";
    public static final String ORIGIN_WALLPAPER_JPG = "origin.jpg";
    public static final String ORIGIN_WP_TEMP_JPG = "origin_temp.jpg";
    public static final String TEMP_WALLPAPER_JPG = "temp.jpg";

    public static String a(Context context, String str) {
        File file = new File(c(context, str), CROPPED_WALLPAPER_JPG);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                ltl.b("WallpaperSaveUtil", "create file error: " + e2.getMessage());
            }
        }
        return file.getPath();
    }

    public static String b(Context context, String str) {
        File file = new File(h(context), str + ".jpg");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                ltl.b("WallpaperSaveUtil", "create file error: " + e2.getMessage());
            }
        }
        return file.getPath();
    }

    public static String c(Context context, String str) {
        File file = new File(h(context), j1j.e(str.toUpperCase()));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getPath();
    }

    public static String d(String str, String str2) {
        return str + str2 + ".png";
    }

    public static String e(Context context) {
        File file = new File(h(context), "model");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getPath();
    }

    public static String f(Context context, String str) {
        File file = new File(c(context, str), ORIGIN_WALLPAPER_JPG);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                ltl.b("WallpaperSaveUtil", "create file error: " + e2.getMessage());
            }
        }
        return file.getPath();
    }

    public static String g(Context context) {
        File file = new File(h(context), ORIGIN_WP_TEMP_JPG);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                ltl.b("WallpaperSaveUtil", "create file error: " + e2.getMessage());
            }
        }
        return file.getPath();
    }

    public static String h(Context context) {
        File file = new File(context.getFilesDir().getAbsolutePath() + File.separator + lo9.TAG_DEFAULT_CREATION_WALLPAPER);
        if (file.exists() || file.mkdirs()) {
            return file.getPath();
        }
        ltl.a("WallpaperSaveUtil", "getCacheFolderPath mkdirs failed.file path-->" + file.getAbsolutePath());
        return null;
    }

    public static String i(Context context) {
        File file = new File(h(context), TEMP_WALLPAPER_JPG);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                ltl.b("WallpaperSaveUtil", "create temp file error: " + e2.getMessage());
            }
        }
        return file.getPath();
    }

    public static String j(Context context, String str, String str2) {
        File file = new File(c(context, str), str2 + ".jpg");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                ltl.b("WallpaperSaveUtil", "create file error: " + e2.getMessage());
            }
        }
        return file.getPath();
    }
}
