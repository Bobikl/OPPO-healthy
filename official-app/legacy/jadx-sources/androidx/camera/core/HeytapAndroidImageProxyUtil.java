package androidx.camera.core;

import android.media.Image;

/* JADX INFO: loaded from: classes.dex */
public class HeytapAndroidImageProxyUtil {
    public static ImageProxy getImageProxy(Image image) {
        return new AndroidImageProxy(image);
    }
}
