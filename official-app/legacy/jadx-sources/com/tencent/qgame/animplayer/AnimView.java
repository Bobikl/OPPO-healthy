package com.tencent.qgame.animplayer;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.AnimConfig;
import com.oplus.aiunit.vision.a40;
import com.oplus.aiunit.vision.am9;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.bx9;
import com.oplus.aiunit.vision.dq9;
import com.oplus.aiunit.vision.e04;
import com.oplus.aiunit.vision.eq9;
import com.oplus.aiunit.vision.pa7;
import com.oplus.aiunit.vision.pid;
import com.oplus.aiunit.vision.q0;
import com.oplus.aiunit.vision.yl9;
import com.oplus.smartenginehelper.ParserTag;
import com.tencent.qgame.animplayer.mix.MixAnimPlugin;
import com.tencent.qgame.animplayer.textureview.InnerTextureView;
import com.tencent.qgame.animplayer.util.ScaleType;
import com.tencent.qgame.animplayer.util.ScaleTypeUtil;
import io.protostuff.MapSchema;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.PropertyReference1Impl;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000±\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001P\b\u0016\u0018\u0000 e2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\tB'\b\u0007\u0012\u0006\u0010_\u001a\u00020^\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010`\u0012\b\b\u0002\u0010b\u001a\u00020\r¢\u0006\u0004\bc\u0010dJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J \u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\nH\u0016J \u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016J(\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\rH\u0014J\b\u0010\u001a\u001a\u00020\u0004H\u0014J\b\u0010\u001b\u001a\u00020\u0004H\u0014J\u0012\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\rH\u0016J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0012H\u0007J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\rH\u0007J\u0010\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0016J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-H\u0016J\u0010\u0010/\u001a\u00020\u00042\u0006\u00101\u001a\u000200H\u0016J\u0010\u00103\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0012H\u0016J\u0010\u00106\u001a\u00020\u00042\u0006\u00105\u001a\u000204H\u0016J\u0010\u00109\u001a\u00020\u00042\u0006\u00108\u001a\u000207H\u0016J\b\u0010:\u001a\u00020\u0004H\u0016J\u0014\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0;H\u0016R\u0016\u0010?\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010CR\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010ER\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010FR\u0018\u0010I\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010HR\u0018\u0010K\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001b\u0010T\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010A\u001a\u0004\bR\u0010SR\u0016\u0010W\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010Y\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010VR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006f"}, d2 = {"Lcom/tencent/qgame/animplayer/AnimView;", "Lcom/oplus/aiunit/vision/am9;", "Landroid/widget/FrameLayout;", "Landroid/view/TextureView$SurfaceTextureListener;", "", "j", "Lkotlin/Function0;", "f", "n", "a", "Landroid/graphics/SurfaceTexture;", "getSurfaceTexture", "surface", "", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "onSurfaceTextureSizeChanged", "onSurfaceTextureUpdated", "", "onSurfaceTextureDestroyed", "onSurfaceTextureAvailable", "w", b2n.g, "oldw", "oldh", "onSizeChanged", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/oplus/aiunit/vision/yl9;", "animListener", "setAnimListener", "Lcom/oplus/aiunit/vision/dq9;", "fetchResource", "setFetchResource", "Lcom/oplus/aiunit/vision/pid;", "resourceClickListener", "setOnResourceClickListener", "playLoop", "setLoop", "enable", "i", "mode", "setVideoMode", "fps", "setFps", "Lcom/tencent/qgame/animplayer/util/ScaleType;", "type", "setScaleType", "Lcom/oplus/aiunit/vision/bx9;", ParserTag.TAG_SCALE_TYPE, "isMute", "setMute", "Ljava/io/File;", Const.Scheme.SCHEME_FILE, LogFieldKey.LEVEL_KEY, "Lcom/oplus/aiunit/vision/eq9;", "fileContainer", MapSchema.FIELD_NAME_KEY, LogFieldKey.MESSAGE_KEY, "Lkotlin/Pair;", "getRealSize", "Lcom/oplus/aiunit/vision/a40;", "Lcom/oplus/aiunit/vision/a40;", "player", "Landroid/os/Handler;", "Lkotlin/Lazy;", "getUiHandler", "()Landroid/os/Handler;", "uiHandler", "Landroid/graphics/SurfaceTexture;", "Lcom/oplus/aiunit/vision/yl9;", "Lcom/tencent/qgame/animplayer/textureview/InnerTextureView;", "Lcom/tencent/qgame/animplayer/textureview/InnerTextureView;", "innerTextureView", "Lcom/oplus/aiunit/vision/eq9;", "lastFile", "Lcom/tencent/qgame/animplayer/util/ScaleTypeUtil;", "o", "Lcom/tencent/qgame/animplayer/util/ScaleTypeUtil;", "scaleTypeUtil", "com/tencent/qgame/animplayer/AnimView$animProxyListener$2$a", LogFieldKey.PROCESS_NAME_KEY, "getAnimProxyListener", "()Lcom/tencent/qgame/animplayer/AnimView$animProxyListener$2$a;", "animProxyListener", "q", "Z", "onSizeChangedCalled", "r", "needPrepareTextureView", "Ljava/lang/Runnable;", "s", "Ljava/lang/Runnable;", "prepareTextureViewRunnable", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public class AnimView extends FrameLayout implements am9, TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public a40 player;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final Lazy uiHandler;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public SurfaceTexture surface;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public yl9 animListener;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public InnerTextureView innerTextureView;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public eq9 lastFile;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final ScaleTypeUtil scaleTypeUtil;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final Lazy animProxyListener;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public boolean onSizeChangedCalled;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public boolean needPrepareTextureView;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final Runnable prepareTextureViewRunnable;
    public static final /* synthetic */ KProperty[] t = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AnimView.class), "uiHandler", "getUiHandler()Landroid/os/Handler;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AnimView.class), "animProxyListener", "getAnimProxyListener()Lcom/tencent/qgame/animplayer/AnimView$animProxyListener$2$1;"))};

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    public static final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            InnerTextureView innerTextureView = AnimView.this.innerTextureView;
            if (innerTextureView != null) {
                innerTextureView.setSurfaceTextureListener(null);
            }
            AnimView.this.innerTextureView = null;
            AnimView.this.removeAllViews();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    public static final class c implements Runnable {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Context f20325j;

        public c(Context context) {
            this.f20325j = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnimView.this.removeAllViews();
            AnimView animView = AnimView.this;
            InnerTextureView innerTextureView = new InnerTextureView(this.f20325j, null, 0, 6, null);
            innerTextureView.setPlayer(AnimView.d(AnimView.this));
            innerTextureView.setOpaque(false);
            innerTextureView.setSurfaceTextureListener(AnimView.this);
            innerTextureView.setLayoutParams(AnimView.this.scaleTypeUtil.c(innerTextureView));
            animView.innerTextureView = innerTextureView;
            AnimView animView2 = AnimView.this;
            animView2.addView(animView2.innerTextureView);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    public static final class d implements Runnable {
        public final /* synthetic */ Function0 i;

        public d(Function0 function0) {
            this.i = function0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.i.invoke();
        }
    }

    @JvmOverloads
    public AnimView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public static final /* synthetic */ a40 d(AnimView animView) {
        a40 a40Var = animView.player;
        if (a40Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
        }
        return a40Var;
    }

    private final AnimView$animProxyListener$2.a getAnimProxyListener() {
        Lazy lazy = this.animProxyListener;
        KProperty kProperty = t[1];
        return (AnimView$animProxyListener$2.a) lazy.getValue();
    }

    private final Handler getUiHandler() {
        Lazy lazy = this.uiHandler;
        KProperty kProperty = t[0];
        return (Handler) lazy.getValue();
    }

    @Override // com.oplus.aiunit.vision.am9
    public void a() {
        if (this.onSizeChangedCalled) {
            getUiHandler().post(this.prepareTextureViewRunnable);
        } else {
            q0.INSTANCE.b("AnimPlayer.AnimView", "onSizeChanged not called");
            this.needPrepareTextureView = true;
        }
    }

    @NotNull
    public Pair<Integer, Integer> getRealSize() {
        return this.scaleTypeUtil.d();
    }

    @Override // com.oplus.aiunit.vision.am9
    @Nullable
    public SurfaceTexture getSurfaceTexture() {
        SurfaceTexture surfaceTexture;
        InnerTextureView innerTextureView = this.innerTextureView;
        return (innerTextureView == null || (surfaceTexture = innerTextureView.getSurfaceTexture()) == null) ? this.surface : surfaceTexture;
    }

    @Deprecated(message = "Compatible older version mp4, default false")
    public final void i(boolean enable) {
        a40 a40Var = this.player;
        if (a40Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
        }
        a40Var.w(enable);
    }

    public final void j() {
        eq9 eq9Var = this.lastFile;
        if (eq9Var != null) {
            eq9Var.close();
        }
        n(new Function0<Unit>() { // from class: com.tencent.qgame.animplayer.AnimView$hide$1
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.removeAllViews();
            }
        });
    }

    public void k(@NotNull final eq9 fileContainer) {
        Intrinsics.checkParameterIsNotNull(fileContainer, "fileContainer");
        n(new Function0<Unit>() { // from class: com.tencent.qgame.animplayer.AnimView$startPlay$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.this$0.getVisibility() != 0) {
                    q0.INSTANCE.b("AnimPlayer.AnimView", "AnimView is GONE, can't play");
                } else {
                    if (AnimView.d(this.this$0).o()) {
                        q0.INSTANCE.b("AnimPlayer.AnimView", "is running can not start");
                        return;
                    }
                    this.this$0.lastFile = fileContainer;
                    AnimView.d(this.this$0).C(fileContainer);
                }
            }
        });
    }

    public void l(@NotNull File file) {
        Intrinsics.checkParameterIsNotNull(file, "file");
        try {
            k(new pa7(file));
        } catch (Throwable unused) {
            getAnimProxyListener().onFailed(10007, e04.ERROR_MSG_FILE_ERROR);
            getAnimProxyListener().d();
        }
    }

    public void m() {
        a40 a40Var = this.player;
        if (a40Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
        }
        a40Var.D();
    }

    public final void n(Function0<Unit> f) {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            f.invoke();
        } else {
            getUiHandler().post(new d(f));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        eq9 eq9Var;
        q0.INSTANCE.d("AnimPlayer.AnimView", "onAttachedToWindow");
        super.onAttachedToWindow();
        a40 a40Var = this.player;
        if (a40Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
        }
        a40Var.v(false);
        a40 a40Var2 = this.player;
        if (a40Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
        }
        if (a40Var2.getPlayLoop() <= 0 || (eq9Var = this.lastFile) == null) {
            return;
        }
        k(eq9Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        q0.INSTANCE.d("AnimPlayer.AnimView", "onDetachedFromWindow");
        super.onDetachedFromWindow();
        a40 a40Var = this.player;
        if (a40Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
        }
        a40Var.v(true);
        a40 a40Var2 = this.player;
        if (a40Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
        }
        a40Var2.q();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        q0.INSTANCE.d("AnimPlayer.AnimView", "onSizeChanged w=" + w + ", h=" + h);
        this.scaleTypeUtil.i(w, h);
        this.onSizeChangedCalled = true;
        if (this.needPrepareTextureView) {
            this.needPrepareTextureView = false;
            a();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@NotNull SurfaceTexture surface, int width, int height) {
        Intrinsics.checkParameterIsNotNull(surface, "surface");
        q0.INSTANCE.d("AnimPlayer.AnimView", "onSurfaceTextureAvailable width=" + width + " height=" + height);
        this.surface = surface;
        a40 a40Var = this.player;
        if (a40Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
        }
        a40Var.p(width, height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@NotNull SurfaceTexture surface) {
        Intrinsics.checkParameterIsNotNull(surface, "surface");
        q0.INSTANCE.d("AnimPlayer.AnimView", "onSurfaceTextureDestroyed");
        this.surface = null;
        a40 a40Var = this.player;
        if (a40Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
        }
        a40Var.q();
        getUiHandler().post(new b());
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture surface, int width, int height) {
        Intrinsics.checkParameterIsNotNull(surface, "surface");
        q0.INSTANCE.d("AnimPlayer.AnimView", "onSurfaceTextureSizeChanged " + width + " x " + height);
        a40 a40Var = this.player;
        if (a40Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
        }
        a40Var.r(width, height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@NotNull SurfaceTexture surface) {
        Intrinsics.checkParameterIsNotNull(surface, "surface");
    }

    public void setAnimListener(@Nullable yl9 animListener) {
        this.animListener = animListener;
    }

    public void setFetchResource(@Nullable dq9 fetchResource) {
        a40 a40Var = this.player;
        if (a40Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
        }
        MixAnimPlugin mixAnimPlugin = a40Var.getPluginManager().getMixAnimPlugin();
        if (mixAnimPlugin != null) {
            mixAnimPlugin.m(fetchResource);
        }
    }

    public void setFps(int fps) {
        q0.INSTANCE.d("AnimPlayer.AnimView", "setFps=" + fps);
        a40 a40Var = this.player;
        if (a40Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
        }
        a40Var.u(fps);
    }

    public void setLoop(int playLoop) {
        a40 a40Var = this.player;
        if (a40Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
        }
        a40Var.z(playLoop);
    }

    public void setMute(boolean isMute) {
        q0.INSTANCE.b("AnimPlayer.AnimView", "set mute=" + isMute);
        a40 a40Var = this.player;
        if (a40Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
        }
        a40Var.y(isMute);
    }

    @Override // com.oplus.aiunit.vision.am9
    public void setOnResourceClickListener(@Nullable pid resourceClickListener) {
        a40 a40Var = this.player;
        if (a40Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
        }
        MixAnimPlugin mixAnimPlugin = a40Var.getPluginManager().getMixAnimPlugin();
        if (mixAnimPlugin != null) {
            mixAnimPlugin.setResourceClickListener(resourceClickListener);
        }
    }

    public void setScaleType(@NotNull ScaleType type) {
        Intrinsics.checkParameterIsNotNull(type, "type");
        this.scaleTypeUtil.h(type);
    }

    @Deprecated(message = "Compatible older version mp4")
    public final void setVideoMode(int mode) {
        a40 a40Var = this.player;
        if (a40Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("player");
        }
        a40Var.B(mode);
    }

    @JvmOverloads
    public AnimView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public void setScaleType(@NotNull bx9 scaleType) {
        Intrinsics.checkParameterIsNotNull(scaleType, "scaleType");
        this.scaleTypeUtil.j(scaleType);
    }

    public /* synthetic */ AnimView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AnimView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.uiHandler = LazyKt__LazyJVMKt.lazy(new Function0<Handler>() { // from class: com.tencent.qgame.animplayer.AnimView$uiHandler$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Handler invoke() {
                return new Handler(Looper.getMainLooper());
            }
        });
        this.scaleTypeUtil = new ScaleTypeUtil();
        this.animProxyListener = LazyKt__LazyJVMKt.lazy(new Function0<AnimView$animProxyListener$2.a>() { // from class: com.tencent.qgame.animplayer.AnimView$animProxyListener$2

            @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\u001a\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u0011"}, d2 = {"com/tencent/qgame/animplayer/AnimView$animProxyListener$2$a", "Lcom/oplus/aiunit/vision/yl9;", "Lcom/oplus/aiunit/vision/v30;", "config", "", "a", "", "c", "", "frameIndex", MapSchema.FIELD_NAME_ENTRY, "d", "b", "errorType", "", "errorMsg", "onFailed", "animplayer_release"}, k = 1, mv = {1, 4, 0})
            public static final class a implements yl9 {
                public a() {
                }

                @Override // com.oplus.aiunit.vision.yl9
                public boolean a(@NotNull AnimConfig config) {
                    Intrinsics.checkParameterIsNotNull(config, "config");
                    AnimView$animProxyListener$2.this.this$0.scaleTypeUtil.k(config.getWidth(), config.getHeight());
                    yl9 yl9Var = AnimView$animProxyListener$2.this.this$0.animListener;
                    return yl9Var != null ? yl9Var.a(config) : yl9.a.a(this, config);
                }

                @Override // com.oplus.aiunit.vision.yl9
                public void b() {
                    AnimView$animProxyListener$2.this.this$0.j();
                    yl9 yl9Var = AnimView$animProxyListener$2.this.this$0.animListener;
                    if (yl9Var != null) {
                        yl9Var.b();
                    }
                }

                @Override // com.oplus.aiunit.vision.yl9
                public void c() {
                    yl9 yl9Var = AnimView$animProxyListener$2.this.this$0.animListener;
                    if (yl9Var != null) {
                        yl9Var.c();
                    }
                }

                @Override // com.oplus.aiunit.vision.yl9
                public void d() {
                    AnimView$animProxyListener$2.this.this$0.j();
                    yl9 yl9Var = AnimView$animProxyListener$2.this.this$0.animListener;
                    if (yl9Var != null) {
                        yl9Var.d();
                    }
                }

                @Override // com.oplus.aiunit.vision.yl9
                public void e(int frameIndex, @Nullable AnimConfig config) {
                    yl9 yl9Var = AnimView$animProxyListener$2.this.this$0.animListener;
                    if (yl9Var != null) {
                        yl9Var.e(frameIndex, config);
                    }
                }

                @Override // com.oplus.aiunit.vision.yl9
                public void onFailed(int errorType, @Nullable String errorMsg) {
                    yl9 yl9Var = AnimView$animProxyListener$2.this.this$0.animListener;
                    if (yl9Var != null) {
                        yl9Var.onFailed(errorType, errorMsg);
                    }
                }
            }

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final a invoke() {
                return new a();
            }
        });
        this.prepareTextureViewRunnable = new c(context);
        j();
        a40 a40Var = new a40(this);
        this.player = a40Var;
        a40Var.t(getAnimProxyListener());
    }
}
