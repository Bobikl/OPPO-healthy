package com.coui.appcompat.bottomfloatingtoolbar;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import com.oplus.aiunit.vision.bn2;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.ph2;
import com.oplus.graphics.OplusPathAdapter;
import com.oplus.os.OplusBuild;
import com.oplus.view.OplusViewBackgroundRenderEffect;
import com.support.appcompat.R$attr;
import com.support.bottomnavigation.R$color;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class g {
    public static final int SDK_SUB_VERSION = 34;
    public final WeakReference<Context> a;
    public final Paint b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f1597c;
    public final Paint d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f1598e;
    public final RectF f;
    public f.a g;
    public e.a h;
    public d.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GradientStroke f1599j;
    public COUIBottomFloatingToolbar.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f1600l;
    public e m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d f1601n;

    public g(Context context) {
        this(context, new f.a(), new e.a(), new d.a());
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT <= 31) {
            return false;
        }
        if (bn2.c() > 33) {
            return true;
        }
        return bn2.c() >= 30 && OplusBuild.VERSION.SDK_SUB_VERSION >= 34;
    }

    public void a(View view) {
        if (view == null) {
            return;
        }
        view.setBackgroundColor(0);
        RenderEffect renderEffectC = c();
        if (!b()) {
            view.setBackgroundColor(lh2.a(e(), R$attr.couiColorBar));
        } else {
            OplusViewBackgroundRenderEffect.setBackgroundRenderEffect(renderEffectC, view);
            view.requestLayout();
        }
    }

    public final RenderEffect c() {
        Context contextE = e();
        if (contextE == null || Build.VERSION.SDK_INT < 31) {
            return null;
        }
        float f = this.f1601n.a;
        RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(f, f, Shader.TileMode.MIRROR);
        if (ph2.a(contextE)) {
            return RenderEffect.createColorFilterEffect(new BlendModeColorFilter(lh2.h(e(), R$color.coui_floating_toolbar_menu_background_color1), BlendMode.LUMINOSITY), RenderEffect.createColorFilterEffect(new BlendModeColorFilter(lh2.h(e(), R$color.coui_floating_toolbar_menu_background_color0), BlendMode.OVERLAY), renderEffectCreateBlurEffect));
        }
        return RenderEffect.createColorFilterEffect(new BlendModeColorFilter(lh2.h(e(), R$color.coui_floating_toolbar_menu_background_color1), BlendMode.COLOR_DODGE), RenderEffect.createColorFilterEffect(new BlendModeColorFilter(lh2.h(e(), R$color.coui_floating_toolbar_menu_background_color0), BlendMode.LUMINOSITY), renderEffectCreateBlurEffect));
    }

    public void d(Canvas canvas, RectF rectF, Path path, float f, float f2) {
        i(rectF, f, f2);
        if (Build.VERSION.SDK_INT >= 33) {
            canvas.drawPath(path, this.b);
        }
        canvas.drawPath(this.f1597c, this.d);
        canvas.drawPath(this.f1597c, this.f1598e);
    }

    public final Context e() {
        return this.a.get();
    }

    public final void f() {
        this.k = new COUIBottomFloatingToolbar.d(this.f1597c);
        h();
    }

    public final void g() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f1599j = new GradientStroke();
            if (this.k.b() == 1) {
                GradientStroke gradientStroke = this.f1599j;
                GradientStroke.CornerType cornerType = GradientStroke.CornerType.SMOOTH;
                f fVar = this.f1600l;
                gradientStroke.d(cornerType, fVar.p, fVar.q);
            } else {
                GradientStroke gradientStroke2 = this.f1599j;
                GradientStroke.CornerType cornerType2 = GradientStroke.CornerType.FULL;
                f fVar2 = this.f1600l;
                gradientStroke2.d(cornerType2, fVar2.p, fVar2.q);
            }
            this.f1599j.c(this.f1600l.a);
            this.f1599j.r(this.f1600l.f1587c);
            GradientStroke gradientStroke3 = this.f1599j;
            f fVar3 = this.f1600l;
            gradientStroke3.u(Math.max(fVar3.d, fVar3.f1589j) * 2.0f);
            this.f1599j.k(this.f1600l.f1588e);
            this.f1599j.p(this.f1600l.d);
            this.f1599j.l(this.f1600l.f);
            this.f1599j.m(this.f1600l.g);
            this.f1599j.n(this.f1600l.h);
            this.f1599j.o(this.f1600l.i);
            this.f1599j.e(this.f1600l.k);
            this.f1599j.j(this.f1600l.f1589j);
            this.f1599j.f(this.f1600l.f1590l);
            this.f1599j.g(this.f1600l.m);
            this.f1599j.h(this.f1600l.f1591n);
            this.f1599j.i(this.f1600l.o);
            this.b.setShader(this.f1599j.a());
        }
        this.b.setAntiAlias(true);
        this.b.setStyle(Paint.Style.STROKE);
        Paint paint = this.b;
        f fVar4 = this.f1600l;
        paint.setStrokeWidth(Math.max(fVar4.d, fVar4.f1589j) * 2.0f);
        this.b.setAlpha(255);
        this.b.setBlendMode(BlendMode.OVERLAY);
    }

    public final void h() {
        this.m = this.h.p(lh2.h(e(), R$color.coui_floating_toolbar_menu_inner_shadow_color0)).q(lh2.h(e(), R$color.coui_floating_toolbar_menu_inner_shadow_color1)).o();
        this.d.setColor(0);
        this.d.setStyle(Paint.Style.STROKE);
        this.d.setStrokeWidth(this.m.b);
        Paint paint = this.d;
        e eVar = this.m;
        paint.setShadowLayer(eVar.f1577c, eVar.d, eVar.f1578e, Color.argb((int) (eVar.a * 255.0f), Color.red(eVar.f), Color.green(this.m.f), Color.blue(this.m.f)));
        this.f1598e.setColor(0);
        this.f1598e.setStyle(Paint.Style.STROKE);
        this.f1598e.setStrokeWidth(this.m.h);
        Paint paint2 = this.f1598e;
        e eVar2 = this.m;
        paint2.setShadowLayer(eVar2.i, eVar2.f1579j, eVar2.k, Color.argb((int) (eVar2.g * 255.0f), Color.red(eVar2.f1580l), Color.green(this.m.f1580l), Color.blue(this.m.f1580l)));
        if (ph2.a(e())) {
            this.d.setBlendMode(BlendMode.COLOR_DODGE);
            this.f1598e.setBlendMode(BlendMode.COLOR_DODGE);
        } else {
            this.d.setBlendMode(BlendMode.OVERLAY);
            this.f1598e.setBlendMode(BlendMode.OVERLAY);
        }
    }

    public final void i(RectF rectF, float f, float f2) {
        GradientStroke gradientStroke;
        if (Build.VERSION.SDK_INT >= 33 && (gradientStroke = this.f1599j) != null) {
            gradientStroke.s((int) ((rectF.right - rectF.left) + (f * 2.0f)), (int) ((rectF.bottom - rectF.top) + (f2 * 2.0f)));
            this.f1599j.q(f, f2);
            this.f1599j.r((float) (((((double) rectF.width()) * 1.5d) + ((double) rectF.height())) / ((double) ((rectF.width() + rectF.height()) * 2.0f))));
        }
        RectF rectF2 = this.f;
        float f3 = rectF.left;
        e eVar = this.m;
        float f4 = eVar.m;
        rectF2.left = f3 - f4;
        float f5 = rectF.top;
        float f6 = eVar.f1581n;
        rectF2.top = f5 - f6;
        rectF2.right = rectF.right + f4;
        rectF2.bottom = rectF.bottom + f6;
        this.f1597c.reset();
        if (this.k.b() == 1) {
            OplusPathAdapter oplusPathAdapterA = this.k.a();
            RectF rectF3 = this.f;
            oplusPathAdapterA.addSmoothRoundRect(rectF3, rectF3.height() / 2.0f, this.f.height() / 2.0f, Path.Direction.CCW);
        } else {
            Path path = this.f1597c;
            RectF rectF4 = this.f;
            path.addRoundRect(rectF4, rectF4.height() / 2.0f, this.f.height() / 2.0f, Path.Direction.CCW);
        }
    }

    public g(Context context, f.a aVar, e.a aVar2, d.a aVar3) {
        this.b = new Paint();
        this.f1597c = new Path();
        this.d = new Paint();
        this.f1598e = new Paint();
        this.f = new RectF();
        this.a = new WeakReference<>(context);
        this.g = aVar;
        this.h = aVar2;
        this.i = aVar3;
        this.f1600l = aVar.r();
        this.m = aVar2.o();
        this.f1601n = aVar3.b();
        f();
        g();
    }
}
