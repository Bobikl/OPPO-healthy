package com.heytap.nearx.uikit.internal.utils.blur;

import com.oplus.aiunit.vision.fjc;

/* JADX INFO: loaded from: classes18.dex */
public class a {
    public static final int DEFAULT_COLOR_SATURATION = 1;
    public static final a DEFAULT_CONFIG = new a(10, 10, 0, 1);
    public static final int DEFAULT_DOWN_SCALE_FACTOR = 10;
    public static final int DEFAULT_OVERLAY_COLOR = 0;
    public static final int DEFAULT_RADIUS = 10;
    public final int a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7471c;
    public final int d;

    public static class b {
        public int a = 10;
        public int b = 10;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7472c = 0;
        public int d;

        public a a() {
            return new a(this.a, this.b, this.f7472c, this.d);
        }

        public b b(int i) {
            a.a(i);
            this.b = i;
            return this;
        }

        public b c(int i) {
            this.d = i;
            return this;
        }

        public b d(int i) {
            this.f7472c = i;
            return this;
        }

        public b e(int i) {
            this.a = i;
            return this;
        }
    }

    public static void a(int i) {
        if (i <= 0) {
            fjc.e("NearBlurConfig", "mDownScaleFactor must be greater than 0.");
        }
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.f7471c;
    }

    public int e() {
        return this.a;
    }

    public a(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.f7471c = i3;
        this.d = i4;
    }
}
