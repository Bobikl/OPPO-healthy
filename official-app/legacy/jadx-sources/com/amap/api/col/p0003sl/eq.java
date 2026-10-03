package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.View;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.oplus.aiunit.vision.c2n;
import com.oplus.aiunit.vision.c9n;
import com.oplus.aiunit.vision.crm;
import com.oplus.aiunit.vision.grm;
import com.oplus.aiunit.vision.krm;
import com.oplus.aiunit.vision.t0n;
import com.oplus.aiunit.vision.u4n;
import com.oplus.aiunit.vision.xsm;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes12.dex */
public final class eq extends View {
    public boolean A;
    public Context B;
    public boolean C;
    public float D;
    public float E;
    public boolean F;
    public boolean G;
    public Bitmap i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Bitmap f716j;
    public Bitmap k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bitmap f717l;
    public Bitmap m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bitmap f718n;
    public Bitmap o;
    public Paint p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public boolean z;

    public class a extends u4n {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.u4n
        public final void runTask() {
            eq.this.e(AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME, 0);
            eq.this.e(AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME, 1);
            if ("".equals(crm.b(eq.this.B, "amap_web_logo", "md5_day", ""))) {
                if (eq.this.k == null || eq.this.f717l == null) {
                    crm.c(eq.this.B, "amap_web_logo", "md5_day", "0b718b5f291b09d2b62be725dfb977b3");
                    crm.c(eq.this.B, "amap_web_logo", "md5_night", "4b1405462a5c910de0e0723ffd96c018");
                    return;
                }
                crm.c(eq.this.B, "amap_web_logo", "md5_day", t0n.a(AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME));
                String strA = t0n.a(AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME);
                if (!"".equals(strA)) {
                    crm.c(eq.this.B, "amap_web_logo", "md5_night", strA);
                }
                eq.this.p(true);
            }
        }
    }

    public eq(Context context) {
        InputStream inputStream;
        super(context);
        this.p = new Paint();
        this.q = false;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 10;
        this.v = 0;
        this.w = 0;
        this.x = 10;
        this.y = 8;
        this.z = false;
        this.A = false;
        this.C = true;
        this.D = 0.0f;
        this.E = 0.0f;
        this.F = true;
        this.G = false;
        InputStream inputStreamOpen = null;
        try {
            this.B = context.getApplicationContext();
            InputStream inputStreamOpen2 = grm.b(context).open("ap.data");
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen2);
                this.f718n = bitmapDecodeStream;
                this.i = xsm.m(bitmapDecodeStream, c9n.b);
                inputStreamOpen2.close();
                inputStreamOpen = grm.b(context).open("ap1.data");
                Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStreamOpen);
                this.o = bitmapDecodeStream2;
                this.f716j = xsm.m(bitmapDecodeStream2, c9n.b);
                inputStreamOpen.close();
                this.s = this.f716j.getWidth();
                this.r = this.f716j.getHeight();
                this.p.setAntiAlias(true);
                this.p.setColor(-16777216);
                this.p.setStyle(Paint.Style.STROKE);
                AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME = context.getFilesDir() + "/icon_web_day.data";
                AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME = context.getFilesDir() + "/icon_web_night.data";
                krm.a().b(new a());
                try {
                    inputStreamOpen2.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                try {
                    inputStreamOpen.close();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = inputStreamOpen;
                inputStreamOpen = inputStreamOpen2;
                try {
                    c2n.r(th, "WaterMarkerView", "create");
                } finally {
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (Throwable th4) {
                            th4.printStackTrace();
                        }
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th5) {
                            th5.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th6) {
            th = th6;
            inputStream = null;
        }
    }

    public final void b() {
        try {
            Bitmap bitmap = this.i;
            if (bitmap != null) {
                xsm.C(bitmap);
                this.i = null;
            }
            Bitmap bitmap2 = this.f716j;
            if (bitmap2 != null) {
                xsm.C(bitmap2);
                this.f716j = null;
            }
            this.i = null;
            this.f716j = null;
            Bitmap bitmap3 = this.f718n;
            if (bitmap3 != null) {
                xsm.C(bitmap3);
                this.f718n = null;
            }
            Bitmap bitmap4 = this.o;
            if (bitmap4 != null) {
                xsm.C(bitmap4);
                this.o = null;
            }
            Bitmap bitmap5 = this.k;
            if (bitmap5 != null) {
                xsm.C(bitmap5);
            }
            this.k = null;
            Bitmap bitmap6 = this.f717l;
            if (bitmap6 != null) {
                xsm.C(bitmap6);
            }
            this.f717l = null;
            Bitmap bitmap7 = this.m;
            if (bitmap7 != null) {
                bitmap7.recycle();
            }
            this.p = null;
        } catch (Throwable th) {
            c2n.r(th, "WaterMarkerView", "destory");
            th.printStackTrace();
        }
    }

    public final void c(int i) {
        this.w = 0;
        this.t = i;
        l();
    }

    public final void d(int i, float f) {
        if (this.C) {
            this.w = 2;
            float fMax = Math.max(0.0f, Math.min(f, 1.0f));
            if (i == 0) {
                this.D = fMax;
                this.F = true;
            } else if (i == 1) {
                this.D = 1.0f - fMax;
                this.F = false;
            } else if (i == 2) {
                this.E = 1.0f - fMax;
            }
            l();
        }
    }

    public final void e(String str, int i) {
        try {
            if (this.C && new File(str).exists()) {
                if (i == 0) {
                    Bitmap bitmap = this.k;
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
                    this.f718n = bitmapDecodeFile;
                    this.k = xsm.m(bitmapDecodeFile, c9n.b);
                    if (bitmap == null || bitmap.isRecycled()) {
                        return;
                    }
                    xsm.C(bitmap);
                    return;
                }
                if (i == 1) {
                    Bitmap bitmap2 = this.f717l;
                    Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(str);
                    this.f718n = bitmapDecodeFile2;
                    this.f717l = xsm.m(bitmapDecodeFile2, c9n.b);
                    if (bitmap2 == null || bitmap2.isRecycled()) {
                        return;
                    }
                    xsm.C(bitmap2);
                }
            }
        } catch (Throwable th) {
            c2n.r(th, "WaterMarkerView", "create");
            th.printStackTrace();
        }
    }

    public final void f(boolean z) {
        if (this.C) {
            try {
                this.q = z;
                if (z) {
                    this.p.setColor(-1);
                } else {
                    this.p.setColor(-16777216);
                }
            } catch (Throwable th) {
                c2n.r(th, "WaterMarkerView", "changeBitmap");
                th.printStackTrace();
            }
        }
    }

    public final Point h() {
        return new Point(this.u, this.v - 2);
    }

    public final void i(int i) {
        this.w = 1;
        this.y = i;
        l();
    }

    public final void j(boolean z) {
        if (this.C) {
            this.G = z;
            if (!z) {
                this.s = this.i.getWidth();
                this.r = this.i.getHeight();
                return;
            }
            Bitmap bitmap = this.m;
            if (bitmap != null) {
                this.s = bitmap.getWidth();
                this.r = this.m.getHeight();
            }
        }
    }

    public final void l() {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        s();
        postInvalidate();
    }

    public final void m(int i) {
        this.w = 1;
        this.x = i;
        l();
    }

    public final void n(boolean z) {
        this.C = z;
    }

    public final float o(int i) {
        float f;
        if (!this.C) {
            return 0.0f;
        }
        if (i == 0) {
            return this.D;
        }
        if (i == 1) {
            f = this.D;
        } else {
            if (i != 2) {
                return 0.0f;
            }
            f = this.E;
        }
        return 1.0f - f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            if (!this.C || getWidth() == 0 || getHeight() == 0 || this.f716j == null) {
                return;
            }
            if (!this.z) {
                s();
                this.z = true;
            }
            canvas.drawBitmap(r(), this.u, this.v, this.p);
        } catch (Throwable th) {
            c2n.r(th, "WaterMarkerView", "onDraw");
            th.printStackTrace();
        }
    }

    public final void p(boolean z) {
        if (this.C && this.A != z) {
            this.A = z;
            if (!z) {
                this.s = this.i.getWidth();
                this.r = this.i.getHeight();
                return;
            }
            if (this.q) {
                Bitmap bitmap = this.f717l;
                if (bitmap != null) {
                    this.s = bitmap.getWidth();
                    this.r = this.f717l.getHeight();
                    return;
                }
                return;
            }
            Bitmap bitmap2 = this.k;
            if (bitmap2 != null) {
                this.s = bitmap2.getWidth();
                this.r = this.k.getHeight();
            }
        }
    }

    public final boolean q() {
        return this.q;
    }

    public final Bitmap r() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        if (this.G && (bitmap3 = this.m) != null) {
            return bitmap3;
        }
        if (this.q) {
            return (!this.A || (bitmap2 = this.f717l) == null) ? this.f716j : bitmap2;
        }
        return (!this.A || (bitmap = this.k) == null) ? this.i : bitmap;
    }

    public final void s() {
        int i = this.w;
        if (i == 0) {
            u();
        } else if (i == 2) {
            t();
        }
        this.u = this.x;
        int height = (getHeight() - this.y) - this.r;
        this.v = height;
        if (this.u < 0) {
            this.u = 0;
        }
        if (height < 0) {
            this.v = 0;
        }
    }

    public final void t() {
        if (this.F) {
            this.x = (int) (getWidth() * this.D);
        } else {
            this.x = (int) ((getWidth() * this.D) - this.s);
        }
        this.y = (int) (getHeight() * this.E);
    }

    public final void u() {
        int i = this.t;
        if (i == 1) {
            this.x = (getWidth() - this.s) / 2;
        } else if (i == 2) {
            this.x = (getWidth() - this.s) - 10;
        } else {
            this.x = 10;
        }
        this.y = 8;
    }
}
