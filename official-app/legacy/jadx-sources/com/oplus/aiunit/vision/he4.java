package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import com.heytap.health.watchface.business.store.view.ClipImageView;
import java.util.Arrays;

/* JADX INFO: loaded from: classes19.dex */
public class he4 {
    public String a;
    public float[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f12119c;
    public ClipImageView.CropParams d;

    public he4(String str, float[] fArr, Bitmap bitmap, ClipImageView.CropParams cropParams) {
        this.a = str;
        this.b = fArr;
        this.f12119c = bitmap;
        this.d = cropParams;
    }

    public Bitmap a() {
        return this.f12119c;
    }

    public ClipImageView.CropParams b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public float[] d() {
        return this.b;
    }

    public String toString() {
        return "CropViewTransInfo{mPath='" + this.a + "', mScaleMatrix=" + Arrays.toString(this.b) + ", mBitmap=" + this.f12119c + '}';
    }
}
