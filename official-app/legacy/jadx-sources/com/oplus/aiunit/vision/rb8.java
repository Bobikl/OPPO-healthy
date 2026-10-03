package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class rb8 {
    public static final int ACCESS_STATUS_DENIED = 0;
    public static final int ACCESS_STATUS_FULL = 1000;
    public static final int ACCESS_STATUS_PARTIAL = 100;
    public static final String COMPAT_READ_MEDIA_AUDIO;
    public static final String[] COMPAT_READ_MEDIA_IMAGES;
    public static final String[] COMPAT_READ_MEDIA_IMAGES_AND_VIDEO;
    public static final String[] COMPAT_READ_MEDIA_VIDEO;

    static {
        int i = Build.VERSION.SDK_INT;
        COMPAT_READ_MEDIA_AUDIO = i >= 33 ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.READ_EXTERNAL_STORAGE";
        if (i >= 34) {
            COMPAT_READ_MEDIA_IMAGES = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
            COMPAT_READ_MEDIA_VIDEO = new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
            COMPAT_READ_MEDIA_IMAGES_AND_VIDEO = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        } else if (i >= 33) {
            COMPAT_READ_MEDIA_IMAGES = new String[]{"android.permission.READ_MEDIA_IMAGES"};
            COMPAT_READ_MEDIA_VIDEO = new String[]{"android.permission.READ_MEDIA_VIDEO"};
            COMPAT_READ_MEDIA_IMAGES_AND_VIDEO = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
        } else {
            COMPAT_READ_MEDIA_IMAGES = new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
            COMPAT_READ_MEDIA_VIDEO = new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
            COMPAT_READ_MEDIA_IMAGES_AND_VIDEO = new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
        }
    }

    public static void a(List<String> list, List<String> list2) {
        if (Build.VERSION.SDK_INT >= 33) {
            if (list2.contains("android.permission.READ_MEDIA_IMAGES") && b("android.permission.READ_MEDIA_IMAGES") >= 100) {
                list2.remove("android.permission.READ_MEDIA_IMAGES");
                list.add("android.permission.READ_MEDIA_IMAGES");
            }
            if (!list2.contains("android.permission.READ_MEDIA_VIDEO") || b("android.permission.READ_MEDIA_VIDEO") < 100) {
                return;
            }
            list2.remove("android.permission.READ_MEDIA_VIDEO");
            list.add("android.permission.READ_MEDIA_VIDEO");
        }
    }

    public static int b(String str) {
        Context contextA = b78.a();
        int i = Build.VERSION.SDK_INT;
        if (i == 33 && ContextCompat.checkSelfPermission(contextA, str) == 0) {
            return 1000;
        }
        if (i >= 34) {
            if (TextUtils.equals("android.permission.READ_MEDIA_IMAGES", str) && ContextCompat.checkSelfPermission(contextA, "android.permission.READ_MEDIA_IMAGES") == 0) {
                return 1000;
            }
            if (TextUtils.equals("android.permission.READ_MEDIA_VIDEO", str) && ContextCompat.checkSelfPermission(contextA, "android.permission.READ_MEDIA_VIDEO") == 0) {
                return 1000;
            }
            if (ContextCompat.checkSelfPermission(contextA, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                return 100;
            }
        } else if (i < 33 && ContextCompat.checkSelfPermission(contextA, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return 1000;
        }
        return 0;
    }
}
