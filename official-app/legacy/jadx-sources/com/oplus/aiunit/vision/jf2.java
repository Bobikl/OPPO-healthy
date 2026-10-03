package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.ContentObserver;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import com.coui.appcompat.uiutil.AnimLevel;
import com.oplus.graphics.OplusBlurParam;
import com.oplus.view.ViewRootManager;
import com.support.appcompat.R$bool;
import com.support.appcompat.R$color;
import com.support.appcompat.R$dimen;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class jf2 {
    public View b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f12867c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f12868e;
    public ViewRootManager f;
    public WindowManager g;
    public Consumer<Boolean> h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f12869j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f12870l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f12871n;
    public boolean s;
    public final ContentObserver a = new a(new Handler(Looper.getMainLooper()));
    public float[] o = null;
    public float[] p = null;
    public float[] q = null;
    public float[] r = null;
    public boolean t = false;
    public boolean u = false;
    public boolean v = false;

    public class a extends ContentObserver {
        public a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            boolean zH = jf2.this.h();
            if (jf2.this.t != zH) {
                jf2.this.t = zH;
                jf2.this.n("BlurSettingObserver");
            }
        }
    }

    public jf2(Context context) {
        this.f12868e = context;
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Boolean bool) {
        if (this.u != bool.booleanValue()) {
            this.u = bool.booleanValue();
            n("CrossWindowBlurEnabledListener");
        }
    }

    public void e() {
        if (y()) {
            if (this.v) {
                x();
                n("updateBlurState");
                return;
            }
            bj2.d("BackgroundBlurBuilder", "applyBlurBackground");
            this.t = h();
            this.f12868e.getContentResolver().registerContentObserver(Settings.System.getUriFor("system_material_blur_enable"), false, this.a);
            this.g = (WindowManager) this.f12868e.getSystemService("window");
            if (this.f12867c == null) {
                throw new IllegalStateException("Must setTargetView before applyBlurBackground");
            }
            if (this.f == null) {
                if (this.b != null) {
                    this.f = new ViewRootManager(this.b);
                } else {
                    this.f = new ViewRootManager(this.f12867c);
                }
            }
            Drawable backgroundBlurDrawable = this.f.getBackgroundBlurDrawable();
            if (this.h == null) {
                this.h = new Consumer() { // from class: com.oplus.aiunit.vision.if2
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        this.i.i((Boolean) obj);
                    }
                };
            }
            if (Build.VERSION.SDK_INT >= 31) {
                this.g.addCrossWindowBlurEnabledListener(this.h);
                this.u = this.g.isCrossWindowBlurEnabled();
            }
            x();
            if (backgroundBlurDrawable != null) {
                backgroundBlurDrawable.setAlpha((int) (this.f12867c.getAlpha() * 255.0f));
                this.f12867c.setBackground(backgroundBlurDrawable);
            }
            n("ApplyBlurBackground");
            this.v = true;
        }
    }

    public final OplusBlurParam f() {
        float[] fArr;
        float[] fArr2;
        OplusBlurParam oplusBlurParam = new OplusBlurParam();
        oplusBlurParam.setBlurType(2);
        boolean z = this.s;
        int i = z ? 2 : 3;
        if (z) {
            fArr = this.p;
            fArr2 = this.r;
        } else {
            fArr = this.o;
            fArr2 = this.q;
        }
        oplusBlurParam.setMaterialParams(i, fArr, fArr2);
        if (byf.e()) {
            oplusBlurParam.setSmoothCornerWeight(this.f12871n);
            bj2.d("BackgroundBlurBuilder", "Current version supports roundCorner when using blur");
        }
        return oplusBlurParam;
    }

    public final void g() {
        this.s = lh2.j(this.f12868e) || ph2.a(this.f12868e);
        this.m = this.f12868e.getResources().getDimensionPixelSize(R$dimen.coui_list_dialog_background_blur_radius);
    }

    public boolean h() {
        return Settings.System.getInt(this.f12868e.getContentResolver(), "system_material_blur_enable", 0) == 1;
    }

    public void j() {
        this.f.setCornerRadius(this.i, this.f12869j, this.k, this.f12870l);
    }

    public void k() {
        Consumer<Boolean> consumer;
        WindowManager windowManager;
        if (Build.VERSION.SDK_INT >= 31 && (consumer = this.h) != null && (windowManager = this.g) != null) {
            windowManager.removeCrossWindowBlurEnabledListener(consumer);
        }
        this.f12868e.getContentResolver().unregisterContentObserver(this.a);
        View view = this.f12867c;
        if (view != null && this.f != null && view.getBackground() == this.f.getBackgroundBlurDrawable()) {
            this.f12867c.setBackground(null);
        }
        this.f = null;
        this.v = false;
        bj2.d("BackgroundBlurBuilder", "release");
    }

    public void l(float[] fArr) {
        this.p = fArr;
    }

    public void m(float[] fArr) {
        this.o = fArr;
    }

    public final void n(String str) {
        int iH = lh2.h(this.f12868e, R$color.coui_list_dialog_background_color_above_blur);
        int iH2 = this.s ? lh2.h(this.f12868e, R$color.coui_list_dialog_background_color_no_blur_night) : lh2.h(this.f12868e, R$color.coui_list_dialog_background_color_no_blur_light);
        ViewRootManager viewRootManager = this.f;
        if (!this.t || !this.u) {
            iH = iH2;
        }
        viewRootManager.setColor(iH);
        this.f12867c.invalidate();
        bj2.d("BackgroundBlurBuilder", "setBlurEnable mLastBlurState = " + this.t + ",mWindowBlurEnable = " + this.u + ",tag:" + str);
    }

    public jf2 o(float f) {
        this.i = f;
        this.f12869j = f;
        this.k = f;
        this.f12870l = f;
        return this;
    }

    public jf2 p(float f, float f2, float f3, float f4) {
        this.i = f;
        this.f12869j = f2;
        this.k = f3;
        this.f12870l = f4;
        return this;
    }

    public void q(float[] fArr) {
        this.r = fArr;
    }

    public void r(float[] fArr) {
        this.q = fArr;
    }

    public jf2 s(View view) {
        this.b = view;
        return this;
    }

    public jf2 t(float f) {
        this.f12871n = f;
        return this;
    }

    public jf2 u(View view) {
        this.f12867c = view;
        return this;
    }

    public jf2 v(boolean z, AnimLevel animLevel) {
        return w(z, animLevel, this.f12868e.getResources().getBoolean(R$bool.coui_blur_enable));
    }

    public jf2 w(boolean z, AnimLevel animLevel, boolean z2) {
        if (byg.a() && ifk.b(animLevel) && z2) {
            this.d = z;
        } else {
            Log.e("BackgroundBlurBuilder", "Machines below V do not support setting blurred backgrounds or current animLevel is too low or is in third party theme");
            this.d = false;
        }
        return this;
    }

    public final void x() {
        if (this.f == null) {
            return;
        }
        this.f.setBlurParams(f());
        this.f.setBlurRadius(this.m);
        j();
    }

    public boolean y() {
        return this.d;
    }
}
