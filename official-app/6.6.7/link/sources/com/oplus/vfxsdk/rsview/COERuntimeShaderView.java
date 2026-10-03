package com.oplus.vfxsdk.rsview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RuntimeShader;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import androidx.annotation.RequiresApi;
import com.oplus.aiunit.vision.dvk;
import com.oplus.aiunit.vision.ef2;
import com.oplus.aiunit.vision.ff2;
import com.oplus.aiunit.vision.j9c;
import com.oplus.aiunit.vision.lc8;
import com.oplus.aiunit.vision.mc8;
import com.oplus.aiunit.vision.my7;
import com.oplus.vfxsdk.common.AbsAnimator;
import com.oplus.vfxsdk.common.Animator;
import com.oplus.vfxsdk.common.PassParams;
import com.oplus.vfxsdk.common.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@RequiresApi(33)
@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001>\b\u0017\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0001LB\u0013\b\u0016\u0012\b\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\bD\u0010EB\u001d\b\u0016\u0012\b\u0010C\u001a\u0004\u0018\u00010B\u0012\b\u0010G\u001a\u0004\u0018\u00010F¢\u0006\u0004\bD\u0010HB%\b\u0016\u0012\b\u0010C\u001a\u0004\u0018\u00010B\u0012\b\u0010G\u001a\u0004\u0018\u00010F\u0012\u0006\u0010I\u001a\u00020\n¢\u0006\u0004\bD\u0010JJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0007J\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u0003J(\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0015J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0014J\b\u0010\u001a\u001a\u00020\u0003H\u0014J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0007J\u0017\u0010\u001f\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010.R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010.R\u0016\u0010=\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010.R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006M"}, d2 = {"Lcom/oplus/vfxsdk/rsview/COERuntimeShaderView;", "Landroid/view/View;", "Lcom/oplus/vfxsdk/common/a;", "", "f", "Lcom/oplus/aiunit/vision/ef2;", "listener", "setRuntimeShaderListener", "Landroid/graphics/RuntimeShader;", "getShader", "", "passId", "c", "", "getShaders", "Landroid/graphics/Paint;", "getPaint", "e", "w", "h", "oldw", "oldh", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "onDetachedFromWindow", "", "frameTimeNanos", "d", "fps", "setFPS", "(Ljava/lang/Integer;)V", "i", "Landroid/graphics/Paint;", "shaderPaint", "Lcom/oplus/vfxsdk/common/AbsAnimator;", "j", "Lcom/oplus/vfxsdk/common/AbsAnimator;", "getAnimator", "()Lcom/oplus/vfxsdk/common/AbsAnimator;", "setAnimator", "(Lcom/oplus/vfxsdk/common/AbsAnimator;)V", "animator", "", "k", "Z", "playing", "Lcom/oplus/aiunit/vision/dvk;", "l", "Lcom/oplus/aiunit/vision/dvk;", "utils", "m", "drawOnceDirty", "Lcom/oplus/aiunit/vision/my7;", "n", "Lcom/oplus/aiunit/vision/my7;", "fpsControl", "o", "hasLoaded", "p", "mFirstDrawed", "com/oplus/vfxsdk/rsview/COERuntimeShaderView$b", "q", "Lcom/oplus/vfxsdk/rsview/COERuntimeShaderView$b;", "frameCallback", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "rsview.1.1.0_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCOERuntimeShaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 COERuntimeShaderView.kt\ncom/oplus/vfxsdk/rsview/COERuntimeShaderView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,237:1\n1855#2,2:238\n1855#2,2:242\n215#3,2:240\n*S KotlinDebug\n*F\n+ 1 COERuntimeShaderView.kt\ncom/oplus/vfxsdk/rsview/COERuntimeShaderView\n*L\n163#1:238,2\n194#1:242,2\n181#1:240,2\n*E\n"})
public class COERuntimeShaderView extends View implements a {

    @NotNull
    public final Paint i;
    public AbsAnimator j;
    public boolean k;

    @NotNull
    public dvk l;
    public boolean m;

    @NotNull
    public final my7 n;
    public boolean o;
    public boolean p;

    @NotNull
    public final b q;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¨\u0006\u0006"}, d2 = {"com/oplus/vfxsdk/rsview/COERuntimeShaderView$b", "Landroid/view/Choreographer$FrameCallback;", "", "frameTimeNanos", "", "doFrame", "rsview.1.1.0_release"}, k = 1, mv = {1, 9, 0})
    public static final class b implements Choreographer.FrameCallback {
        public b() {
        }

        @Override // android.view.Choreographer.FrameCallback
        @RequiresApi(33)
        public void doFrame(long frameTimeNanos) {
            COERuntimeShaderView.this.d(frameTimeNanos);
            if (COERuntimeShaderView.this.k) {
                Choreographer.getInstance().postFrameCallback(this);
            }
        }
    }

    public COERuntimeShaderView(@Nullable Context context) {
        super(context);
        Paint paint = new Paint();
        this.i = paint;
        this.l = new dvk();
        this.n = new my7();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.q = new b();
    }

    @Override // com.oplus.vfxsdk.common.a
    public void a(@NotNull String str, boolean z, @Nullable Function0<Unit> function0) {
        a.a.c(this, str, z, function0);
    }

    @RequiresApi(33)
    @Nullable
    public final RuntimeShader c(int passId) {
        AbsAnimator t = getT();
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type com.oplus.vfxsdk.rsview.MultiPassShader");
        return ((j9c) t).y(passId);
    }

    @RequiresApi(33)
    public final void d(long frameTimeNanos) {
        Iterator<T> it = getShaders().iterator();
        while (it.hasNext()) {
            lc8.a(ff2.a(it.next()), "u_time", (float) this.l.b(frameTimeNanos / 1.0E9d));
        }
        AbsAnimator t = getT();
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type com.oplus.vfxsdk.rsview.MultiPassShader");
        ((j9c) t).B();
        f();
        if (this.n.a()) {
            invalidate();
        }
        if (!this.p) {
            this.p = true;
        }
        if (this.m) {
            e();
            this.m = false;
        }
    }

    public final void e() {
        if (this.k) {
            this.k = false;
        }
    }

    public final void f() {
        AbsAnimator t = getT();
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type com.oplus.vfxsdk.rsview.MultiPassShader");
        if (((j9c) t).A()) {
            AbsAnimator t2 = getT();
            Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type com.oplus.vfxsdk.rsview.MultiPassShader");
            setRenderEffect(((j9c) t2).x(getWidth(), getHeight()));
        }
    }

    @Nullable
    public HashMap<String, PassParams[]> getAllTrigers() {
        return a.a.a(this);
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

    @Nullable
    public HashMap<String, Animator> getAnimators() {
        return a.a.b(this);
    }

    @NotNull
    /* JADX INFO: renamed from: getPaint, reason: from getter */
    public final Paint getI() {
        return this.i;
    }

    @RequiresApi(33)
    @Nullable
    public final RuntimeShader getShader() {
        return c(0);
    }

    @RequiresApi(33)
    @NotNull
    public final List<RuntimeShader> getShaders() {
        AbsAnimator t = getT();
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type com.oplus.vfxsdk.rsview.MultiPassShader");
        return ((j9c) t).z();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.i(dvk.TAG, "COERuntimeShader=>onDetachedFromWindow");
        e();
        Choreographer.getInstance().removeFrameCallback(this.q);
        if (this.o) {
            HashMap<String, Animator> animators = getAnimators();
            if (animators != null) {
                Iterator<Map.Entry<String, Animator>> it = animators.entrySet().iterator();
                while (it.hasNext()) {
                    it.next().getValue().stop();
                }
            }
            HashMap<String, Animator> animators2 = getAnimators();
            if (animators2 != null) {
                animators2.clear();
            }
        }
        this.i.setShader(null);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawPaint(this.i);
    }

    @Override // android.view.View
    @RequiresApi(33)
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (this.o) {
            Iterator<T> it = getShaders().iterator();
            while (it.hasNext()) {
                mc8.a(ff2.a(it.next()), "u_resolution", getWidth(), getHeight());
            }
            f();
        }
    }

    public void setAnimator(@NotNull AbsAnimator absAnimator) {
        Intrinsics.checkNotNullParameter(absAnimator, "<set-?>");
        this.j = absAnimator;
    }

    public final void setFPS(@Nullable Integer fps) {
        this.n.b(fps);
    }

    public final void setRuntimeShaderListener(@NotNull ef2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    public COERuntimeShaderView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.i = paint;
        this.l = new dvk();
        this.n = new my7();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.q = new b();
    }

    public COERuntimeShaderView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.i = paint;
        this.l = new dvk();
        this.n = new my7();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.q = new b();
    }
}
