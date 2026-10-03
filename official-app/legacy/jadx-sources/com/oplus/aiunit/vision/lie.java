package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.provider.MediaStore;

/* JADX INFO: loaded from: classes15.dex */
public class lie {
    public static final String PKG_SYSTEM_PHOTO_APP = "com.coloros.gallery3d";

    public static boolean a(Context context) {
        return iba.b(context, "com.coloros.gallery3d");
    }

    public static void b(Activity activity, int i) {
        if (a(activity)) {
            Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
            activity.startActivityForResult(intent, i);
        } else {
            Intent intent2 = new Intent();
            intent2.addCategory("android.intent.category.OPENABLE");
            intent2.setType("image/*");
            intent2.setAction("android.intent.action.GET_CONTENT");
            activity.startActivityForResult(Intent.createChooser(intent2, "Selection Picture"), i);
        }
    }
}
