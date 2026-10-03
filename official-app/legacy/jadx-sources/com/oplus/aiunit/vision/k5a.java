package com.oplus.aiunit.vision;

import androidx.annotation.DrawableRes;
import com.heytap.health.base.base.BaseApplication;
import com.oplusos.vfxmodelviewer.view.ModelViewer;
import com.oplusos.vfxmodelviewer.view.PerformanceChecker;

/* JADX INFO: loaded from: classes16.dex */
public class k5a {
    public static final String TAG = "LA.ImgUtil";

    @DrawableRes
    public static int a(String str) {
        return ac5.b(str).H5();
    }

    public static boolean b() {
        ModelViewer.Companion companion = ModelViewer.INSTANCE;
        float gLVersion = companion.getGLVersion(BaseApplication.a());
        a7b.f(TAG, "isLoad3D glVersion:" + gLVersion);
        if (gLVersion < 3.0f) {
            return false;
        }
        if (PerformanceChecker.PerformanceLevel.Low != companion.getPerformanceLevel()) {
            return true;
        }
        a7b.f(TAG, "isLoad3D PerformanceLevel.Low");
        return false;
    }
}
