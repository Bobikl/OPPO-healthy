package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.File;

/* JADX INFO: loaded from: classes19.dex */
public class kd3 {
    public static final String STR_BACKGROUND = "bg";
    public static final String STR_POINTER = "pointer";
    public static final String STR_SCALE = "scale";
    public static final String STR_WIDGET = "widget";

    public static Bitmap a(i11 i11Var, String str) {
        File file = new File(i11Var.m().w() + File.separator + str + ".png");
        if (file.exists()) {
            return BitmapFactory.decodeFile(file.getPath());
        }
        ltl.b("ClassicInfoHelper", "getBitmap with file not exists: " + file.getPath());
        return null;
    }

    public static String b(Context context, String str) {
        return context.getString(context.getResources().getIdentifier(str, TypedValues.Custom.S_STRING, context.getPackageName()));
    }
}
