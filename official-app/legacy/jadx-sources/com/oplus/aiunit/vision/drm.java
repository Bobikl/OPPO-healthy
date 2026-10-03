package com.oplus.aiunit.vision;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes12.dex */
public final class drm {
    public static boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f10674e = false;
    public static boolean f = false;
    public boolean a = false;
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10675c = 20;

    public static void a(boolean z) {
        d = z;
    }

    public static boolean b() {
        return d;
    }

    public static void d(boolean z) {
        f10674e = z;
    }

    public static boolean e() {
        return f10674e;
    }

    public static void f(boolean z) {
        f = z;
    }

    public static boolean g() {
        return f;
    }

    public static void k() {
        c2n.r(new Exception("BlackScreen"), "PureScreenCheckTool", "uploadInfo");
    }

    public final boolean c(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i = -1;
                for (int i2 = (int) (width / 4.0f); i2 < (width * 3) / 4.0f; i2++) {
                    for (int i3 = (int) (height / 4.0f); i3 < (height * 3) / 4.0f; i3++) {
                        int pixel = bitmap.getPixel(i2, i3);
                        if (i == -1) {
                            i = pixel;
                        }
                        if (pixel != i) {
                            this.a = true;
                            return false;
                        }
                        if (pixel != -16777216) {
                            this.a = true;
                            return false;
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    c2n.r(th, "AMapdelegate", "checkBlackScreen");
                } finally {
                    this.a = true;
                }
            }
        }
        return true;
    }

    public final boolean h() {
        return this.a;
    }

    public final void i() {
        this.b++;
    }

    public final boolean j() {
        return this.b >= this.f10675c;
    }
}
