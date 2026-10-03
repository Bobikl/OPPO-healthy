package com.oplus.aiunit.vision;

import android.content.Context;
import android.hardware.Camera;
import android.view.WindowManager;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class kw2 {
    public static Camera.Size b(List<Camera.Size> list, float f) {
        float fAbs = 100.0f;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Camera.Size size = list.get(i2);
            float f2 = f - (size.width / size.height);
            if (Math.abs(f2) < fAbs) {
                fAbs = Math.abs(f2);
                i = i2;
            }
        }
        return list.get(i);
    }

    public static int c(Context context, int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i2 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i2 = 90;
            } else if (rotation == 2) {
                i2 = 180;
            } else if (rotation == 3) {
                i2 = 270;
            }
        }
        return cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i2) % 360)) % 360 : ((cameraInfo.orientation - i2) + 360) % 360;
    }

    public static Camera.Size d(List<Camera.Size> list, int i, float f) {
        Collections.sort(list, new Comparator() { // from class: com.oplus.aiunit.vision.jw2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return kw2.g((Camera.Size) obj, (Camera.Size) obj2);
            }
        });
        int i2 = -1;
        float f2 = 1.0f;
        for (int i3 = 0; i3 < list.size(); i3++) {
            Camera.Size size = list.get(i3);
            int i4 = size.width;
            if (i <= i4) {
                float fAbs = Math.abs(((i4 * 1.0f) / size.height) - f);
                if (fAbs <= 0.1f && (i2 < 0 || f2 > fAbs)) {
                    i2 = i3;
                    f2 = fAbs;
                }
            }
        }
        return i2 < 0 ? b(list, f) : list.get(i2);
    }

    public static boolean e(List<String> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if (str.equals(list.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(List<Integer> list, int i) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i == list.get(i2).intValue()) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ int g(Camera.Size size, Camera.Size size2) {
        int i = size2.width - size.width;
        return i == 0 ? size2.height - size.height : i;
    }
}
