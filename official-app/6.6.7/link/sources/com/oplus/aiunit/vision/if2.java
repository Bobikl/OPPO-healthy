package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RuntimeShader;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import androidx.annotation.RequiresApi;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.smartenginehelper.entity.ViewEntity;
import com.oplus.vfxsdk.common.AbsAnimator;
import com.oplus.vfxsdk.common.COEParse;
import com.oplus.vfxsdk.common.a;
import com.oplus.vfxsdk.rsview.AnimatorEffectShader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000§\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001b\b\u0016\u0018\u0000 m2\u00020\u00012\u00020\u0002:\u0001nB-\b\u0007\u0012\u0006\u0010g\u001a\u00020f\u0012\u0006\u0010h\u001a\u00020\u0010\u0012\b\b\u0002\u0010'\u001a\u00020#\u0012\b\b\u0002\u0010j\u001a\u00020i¢\u0006\u0004\bk\u0010lJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\b\u001a\u00020\u0000J\u0016\u0010\f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J3\u0010\u0014\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0012\"\u00028\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0015J\b\u0010\u0019\u001a\u00020\u0003H\u0005J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001aH\u0017J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\tH\u0016J\u0012\u0010!\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010\"\u001a\u00020\tH\u0017J\b\u0010$\u001a\u00020#H\u0016R\u0017\u0010'\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u0010.\u001a\u00020)8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,\"\u0004\b%\u0010-R\u001a\u00103\u001a\u00020/8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0014\u00100\u001a\u0004\b1\u00102R\"\u0010:\u001a\u0002048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0007\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010=\u001a\u0002048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\b\u00105\u001a\u0004\b;\u00107\"\u0004\b<\u00109R\"\u0010\n\u001a\u00020\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010\u000b\u001a\u00020\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bD\u0010?\u001a\u0004\bE\u0010A\"\u0004\bF\u0010CR\"\u0010J\u001a\u00020\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bG\u0010?\u001a\u0004\bH\u0010A\"\u0004\bI\u0010CR\"\u0010O\u001a\u00020#8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bK\u0010&\u001a\u0004\bL\u0010(\"\u0004\bM\u0010NR\u001e\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010[\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010]\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010&R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006o"}, d2 = {"Lcom/oplus/aiunit/vision/if2;", "Landroid/graphics/drawable/Drawable;", "Lcom/oplus/vfxsdk/common/a;", "", "g", "Landroid/view/View;", "hostView", "l", "m", "", "offsetx", "offsety", "j", "Landroid/graphics/RuntimeShader;", "e", "T", "", "paraName", "", "value", "k", "(Ljava/lang/String;[Ljava/lang/Object;)V", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "h", "Landroid/graphics/Canvas;", "canvas", ParserTag.TAG_DRAW, ViewEntity.ALPHA, ClickApiEntity.SET_ALPHA, "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "getOpacity", "", "isProjected", "i", "Z", "isZip", "()Z", "Lcom/oplus/vfxsdk/common/AbsAnimator;", "Lcom/oplus/vfxsdk/common/AbsAnimator;", "getAnimator", "()Lcom/oplus/vfxsdk/common/AbsAnimator;", "(Lcom/oplus/vfxsdk/common/AbsAnimator;)V", "animator", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "getMPaint", "()Landroid/graphics/Paint;", "mPaint", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "getMRect", "()Landroid/graphics/RectF;", "setMRect", "(Landroid/graphics/RectF;)V", "mRect", "getMResolution", "setMResolution", "mResolution", "n", "I", "getOffsetx", "()I", "setOffsetx", "(I)V", "o", "getOffsety", "setOffsety", "p", "getMOpacity", "setMOpacity", "mOpacity", "q", "getMIsProjected", "setMIsProjected", "(Z)V", "mIsProjected", "Ljava/lang/ref/WeakReference;", "r", "Ljava/lang/ref/WeakReference;", "weakHostView", "Landroid/view/View$OnAttachStateChangeListener;", "s", "Landroid/view/View$OnAttachStateChangeListener;", "onAttachStateChangeListener", "Lcom/oplus/aiunit/vision/dvk;", "t", "Lcom/oplus/aiunit/vision/dvk;", "utils", "u", "isPlaying", "Lcom/oplus/aiunit/vision/my7;", "v", "Lcom/oplus/aiunit/vision/my7;", "fpsControl", "com/oplus/aiunit/vision/if2$b", "w", "Lcom/oplus/aiunit/vision/if2$b;", "frameCallback", "Landroid/content/Context;", "context", "cozFile", "Lcom/oplus/aiunit/vision/e6g;", "options", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZLcom/oplus/aiunit/vision/e6g;)V", "Companion", "a", "rsview.1.1.0_release"}, k = 1, mv = {1, 9, 0})
public class if2 extends Drawable implements a {

    @NotNull
    public static final String TAG = "COE:ShadowDrawable";
    public final boolean i;
    public AbsAnimator j;

    @NotNull
    public final Paint k;

    @NotNull
    public RectF l;

    @NotNull
    public RectF m;
    public int n;
    public int o;
    public int p;
    public boolean q;

    @Nullable
    public WeakReference<View> r;

    @Nullable
    public View.OnAttachStateChangeListener s;

    @NotNull
    public dvk t;
    public boolean u;

    @NotNull
    public final my7 v;

    @NotNull
    public final b w;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¨\u0006\u0006"}, d2 = {"com/oplus/aiunit/vision/if2$b", "Landroid/view/Choreographer$FrameCallback;", "", "frameTimeNanos", "", "doFrame", "rsview.1.1.0_release"}, k = 1, mv = {1, 9, 0})
    public static final class b implements Choreographer.FrameCallback {
        public b() {
        }

        @Override // android.view.Choreographer.FrameCallback
        @RequiresApi(33)
        public void doFrame(long frameTimeNanos) {
            View view;
            WeakReference weakReference = if2.this.r;
            if (weakReference == null || (view = (View) weakReference.get()) == null) {
                return;
            }
            if2 if2Var = if2.this;
            if (if2Var.v.a()) {
                view.invalidate();
            }
            if (if2Var.u) {
                Choreographer.getInstance().postFrameCallback(this);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/oplus/aiunit/vision/if2$c", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "onViewDetachedFromWindow", "rsview.1.1.0_release"}, k = 1, mv = {1, 9, 0})
    public static final class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            Log.i(dvk.TAG, "COE:ShadowDrawable=>Host onViewAttachedToWindow");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            Log.i(dvk.TAG, "COE:ShadowDrawable=>Host onViewDetachedFromWindow");
            if2.this.m();
        }
    }

    public /* synthetic */ if2(Context context, String str, boolean z, RuntimeShaderOptions runtimeShaderOptions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? true : z, (i & 8) != 0 ? new RuntimeShaderOptions(false, false, false, 7, null) : runtimeShaderOptions);
    }

    @Override // com.oplus.vfxsdk.common.a
    public void a(@NotNull String str, boolean z, @Nullable Function0<Unit> function0) {
        a.a.c(this, str, z, function0);
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(33)
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        h();
        canvas.drawRect(this.m, this.k);
    }

    @RequiresApi(33)
    @Nullable
    public final RuntimeShader e() {
        AbsAnimator t = getT();
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type com.oplus.vfxsdk.rsview.AnimatorEffectShader");
        return ((AnimatorEffectShader) t).getU();
    }

    public void f(@NotNull String str) {
        a.a.e(this, str);
    }

    public final void g() {
        RectF rectF = this.m;
        RectF rectF2 = this.l;
        float f = rectF2.left;
        int i = this.n;
        rectF.left = f + i;
        float f2 = rectF2.top;
        int i2 = this.o;
        rectF.top = f2 + i2;
        rectF.right = rectF2.right - i;
        rectF.bottom = rectF2.bottom - i2;
    }

    @Override // com.oplus.vfxsdk.common.a
    @NotNull
    /* JADX INFO: renamed from: getAnimator */
    public AbsAnimator getT() {
        AbsAnimator absAnimator = this.j;
        if (absAnimator != null) {
            return absAnimator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("animator");
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public int getOpacity() {
        Log.i(dvk.TAG, "COE:ShadowDrawable=>getOpacity: " + this.p);
        return this.p;
    }

    @RequiresApi(33)
    public final void h() {
        double dB = this.t.b(System.currentTimeMillis() / 1000.0d);
        RuntimeShader runtimeShaderE = e();
        if (runtimeShaderE != null) {
            lc8.a(runtimeShaderE, "u_time", (float) dB);
        }
        RuntimeShader runtimeShaderE2 = e();
        if (runtimeShaderE2 != null) {
            runtimeShaderE2.setFloatUniform("u_resolution", new float[]{this.m.width(), this.m.height()});
        }
        float[] fArr = {1.0f, vr3.UNSET, vr3.UNSET, vr3.UNSET, 1.0f, vr3.UNSET, this.n * (-1.0f), this.o * (-1.0f), 1.0f};
        RuntimeShader runtimeShaderE3 = e();
        if (runtimeShaderE3 != null) {
            runtimeShaderE3.setFloatUniform("u_matResolution", fArr);
        }
        AbsAnimator t = getT();
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type com.oplus.vfxsdk.rsview.AnimatorEffectShader");
        ((AnimatorEffectShader) t).A();
    }

    public void i(@NotNull AbsAnimator absAnimator) {
        Intrinsics.checkNotNullParameter(absAnimator, "<set-?>");
        this.j = absAnimator;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.q;
    }

    @NotNull
    public final if2 j(int offsetx, int offsety) {
        this.n = offsetx;
        this.o = offsety;
        g();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RequiresApi(33)
    public final <T> void k(@Nullable String paraName, @NotNull T... value) {
        Intrinsics.checkNotNullParameter(value, "value");
        AbsAnimator t = getT();
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type com.oplus.vfxsdk.rsview.AnimatorEffectShader");
        Intrinsics.checkNotNull(paraName);
        ((AnimatorEffectShader) t).s(paraName, Arrays.copyOf(value, value.length));
    }

    @NotNull
    public final if2 l(@Nullable View hostView) {
        Log.i(dvk.TAG, "COE:ShadowDrawable=>start");
        if (this.u) {
            return this;
        }
        this.u = true;
        this.r = new WeakReference<>(hostView);
        if (hostView != null) {
            c cVar = new c();
            this.s = cVar;
            Intrinsics.checkNotNull(cVar);
            hostView.addOnAttachStateChangeListener(cVar);
        }
        Choreographer.getInstance().postFrameCallback(this.w);
        return this;
    }

    @NotNull
    public final if2 m() {
        if (!this.u) {
            return this;
        }
        this.u = false;
        WeakReference<View> weakReference = this.r;
        View view = weakReference != null ? weakReference.get() : null;
        if (view != null) {
            view.removeOnAttachStateChangeListener(this.s);
        }
        this.r = null;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(33)
    public void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        Log.i(dvk.TAG, "COE:ShadowDrawable=>bounds:" + bounds.width() + ", " + bounds.height());
        this.l.set(bounds);
        g();
        RuntimeShader runtimeShaderE = e();
        if (runtimeShaderE != null) {
            runtimeShaderE.setFloatUniform("u_resolution", new float[]{this.m.width(), this.m.height()});
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        Log.i(dvk.TAG, "COE:ShadowDrawable=>setAlpha: " + alpha);
        this.k.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        Log.i(dvk.TAG, "COE:ShadowDrawable=>setColorFilter: " + colorFilter);
        this.k.setColorFilter(colorFilter);
    }

    @RequiresApi(33)
    public if2(@NotNull Context context, @NotNull String str, boolean z, @NotNull RuntimeShaderOptions runtimeShaderOptions) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "cozFile");
        Intrinsics.checkNotNullParameter(runtimeShaderOptions, "options");
        this.i = z;
        Paint paint = new Paint();
        this.k = paint;
        this.l = new RectF();
        this.m = new RectF();
        this.p = -3;
        this.q = true;
        this.t = new dvk();
        this.v = new my7();
        Log.i(dvk.TAG, "COE:ShadowDrawable=>construct shadowDrawable");
        InputStream inputStreamOpen = context.getAssets().open(str);
        try {
            COEParse cOEParse = new COEParse();
            Intrinsics.checkNotNull(inputStreamOpen);
            i(new AnimatorEffectShader(cOEParse.parse(ByteStreamsKt.readBytes(inputStreamOpen), z), 0, runtimeShaderOptions, 2, null));
            inputStreamOpen.close();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(inputStreamOpen, (Throwable) null);
            AbsAnimator t = getT();
            Intrinsics.checkNotNull(t, "null cannot be cast to non-null type com.oplus.vfxsdk.rsview.AnimatorEffectShader");
            paint.setShader(((AnimatorEffectShader) t).getU());
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            this.t = new dvk();
            this.w = new b();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(inputStreamOpen, th);
                throw th2;
            }
        }
    }
}
