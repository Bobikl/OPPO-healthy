package com.tencent.qgame.animplayer.mix;

import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.MotionEvent;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.AnimConfig;
import com.oplus.aiunit.vision.a40;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.dli;
import com.oplus.aiunit.vision.dq9;
import com.oplus.aiunit.vision.dy7;
import com.oplus.aiunit.vision.ey7;
import com.oplus.aiunit.vision.n0c;
import com.oplus.aiunit.vision.o0c;
import com.oplus.aiunit.vision.pid;
import com.oplus.aiunit.vision.q0;
import com.oplus.aiunit.vision.q0c;
import com.oplus.aiunit.vision.tsf;
import com.oplus.aiunit.vision.ty7;
import com.oplus.aiunit.vision.zl9;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.PropertyReference1Impl;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 Q2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010@\u001a\u00020<¢\u0006\u0004\bO\u0010PJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R$\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\"R\u0018\u0010+\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010*R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\"\u00107\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00109R\u0016\u0010;\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0017\u0010@\u001a\u00020<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?R$\u0010B\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010I\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N¨\u0006R"}, d2 = {"Lcom/tencent/qgame/animplayer/mix/MixAnimPlugin;", "Lcom/oplus/aiunit/vision/zl9;", "", b2n.f, b2n.g, LogFieldKey.LEVEL_KEY, "Lcom/oplus/aiunit/vision/v30;", "config", "", "a", MapSchema.FIELD_NAME_ENTRY, "frameIndex", "d", "onRelease", "onDestroy", "Landroid/view/MotionEvent;", "ev", "", "b", "Lcom/oplus/aiunit/vision/dli;", "Lcom/oplus/aiunit/vision/dli;", MapSchema.FIELD_NAME_KEY, "()Lcom/oplus/aiunit/vision/dli;", "setSrcMap", "(Lcom/oplus/aiunit/vision/dli;)V", "srcMap", "Lcom/oplus/aiunit/vision/ey7;", "Lcom/oplus/aiunit/vision/ey7;", "getFrameAll", "()Lcom/oplus/aiunit/vision/ey7;", "setFrameAll", "(Lcom/oplus/aiunit/vision/ey7;)V", "frameAll", "c", "I", "getCurFrameIndex", "()I", "setCurFrameIndex", "(I)V", "curFrameIndex", "resultCbCount", "Lcom/oplus/aiunit/vision/o0c;", "Lcom/oplus/aiunit/vision/o0c;", "mixRender", "Lcom/oplus/aiunit/vision/q0c;", "f", "Lkotlin/Lazy;", "getMixTouch", "()Lcom/oplus/aiunit/vision/q0c;", "mixTouch", "Z", "i", "()Z", "setAutoTxtColorFill", "(Z)V", "autoTxtColorFill", "Ljava/lang/Object;", "Ljava/lang/Object;", "lock", "forceStopLock", "Lcom/oplus/aiunit/vision/a40;", "j", "Lcom/oplus/aiunit/vision/a40;", "()Lcom/oplus/aiunit/vision/a40;", "player", "Lcom/oplus/aiunit/vision/dq9;", "resourceRequest", "Lcom/oplus/aiunit/vision/dq9;", "getResourceRequest", "()Lcom/oplus/aiunit/vision/dq9;", LogFieldKey.MESSAGE_KEY, "(Lcom/oplus/aiunit/vision/dq9;)V", "Lcom/oplus/aiunit/vision/pid;", "resourceClickListener", "Lcom/oplus/aiunit/vision/pid;", "getResourceClickListener", "()Lcom/oplus/aiunit/vision/pid;", "setResourceClickListener", "(Lcom/oplus/aiunit/vision/pid;)V", "<init>", "(Lcom/oplus/aiunit/vision/a40;)V", "Companion", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class MixAnimPlugin implements zl9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public dli srcMap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public ey7 frameAll;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int curFrameIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int resultCbCount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public o0c mixRender;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final Lazy mixTouch;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean autoTxtColorFill;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final Object lock;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean forceStopLock;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a40 player;
    public static final /* synthetic */ KProperty[] k = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(MixAnimPlugin.class), "mixTouch", "getMixTouch()Lcom/tencent/qgame/animplayer/mix/MixTouch;"))};

    public MixAnimPlugin(@NotNull a40 player) {
        Intrinsics.checkParameterIsNotNull(player, "player");
        this.player = player;
        this.curFrameIndex = -1;
        this.mixTouch = LazyKt__LazyJVMKt.lazy(new Function0<q0c>() { // from class: com.tencent.qgame.animplayer.mix.MixAnimPlugin$mixTouch$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final q0c invoke() {
                return new q0c(this.this$0);
            }
        });
        this.autoTxtColorFill = true;
        this.lock = new Object();
    }

    @Override // com.oplus.aiunit.vision.zl9
    public int a(@NotNull AnimConfig config) {
        Intrinsics.checkParameterIsNotNull(config, "config");
        if (!config.getIsMix()) {
            return 0;
        }
        q0.INSTANCE.b("AnimPlayer.MixAnimPlugin", "IFetchResource is empty");
        return 0;
    }

    @Override // com.oplus.aiunit.vision.zl9
    public boolean b(@NotNull MotionEvent ev) {
        Intrinsics.checkParameterIsNotNull(ev, "ev");
        AnimConfig config = this.player.getConfigManager().getConfig();
        if (config != null) {
            config.getIsMix();
        }
        return zl9.a.b(this, ev);
    }

    @Override // com.oplus.aiunit.vision.zl9
    public void c(int i) {
        zl9.a.a(this, i);
    }

    @Override // com.oplus.aiunit.vision.zl9
    public void d(int frameIndex) {
        SparseArray<ty7> sparseArrayA;
        ty7 ty7Var;
        ArrayList<dy7> arrayListB;
        HashMap<String, Src> mapA;
        Src src;
        AnimConfig config = this.player.getConfigManager().getConfig();
        if (config == null || !config.getIsMix()) {
            return;
        }
        this.curFrameIndex = frameIndex;
        ey7 ey7Var = this.frameAll;
        if (ey7Var == null || (sparseArrayA = ey7Var.a()) == null || (ty7Var = sparseArrayA.get(frameIndex)) == null || (arrayListB = ty7Var.b()) == null) {
            return;
        }
        for (dy7 dy7Var : arrayListB) {
            dli dliVar = this.srcMap;
            if (dliVar != null && (mapA = dliVar.a()) != null && (src = mapA.get(dy7Var.getSrcId())) != null) {
                Intrinsics.checkExpressionValueIsNotNull(src, "srcMap?.map?.get(frame.srcId) ?: return@forEach");
                o0c o0cVar = this.mixRender;
                if (o0cVar != null) {
                    o0cVar.d(config, dy7Var, src);
                }
            }
        }
    }

    @Override // com.oplus.aiunit.vision.zl9
    public void e() {
        AnimConfig config = this.player.getConfigManager().getConfig();
        if (config == null || config.getIsMix()) {
            q0.INSTANCE.d("AnimPlayer.MixAnimPlugin", "mix render init");
            o0c o0cVar = new o0c(this);
            this.mixRender = o0cVar;
            o0cVar.b();
        }
    }

    public final void g() {
        SparseArray<ty7> sparseArrayA;
        HashMap<String, Src> mapA;
        HashMap<String, Src> mapA2;
        Collection<Src> collectionValues;
        Bitmap bitmap;
        h();
        AnimConfig config = this.player.getConfigManager().getConfig();
        if (config == null || config.getIsMix()) {
            ArrayList arrayList = new ArrayList();
            dli dliVar = this.srcMap;
            if (dliVar != null && (mapA2 = dliVar.a()) != null && (collectionValues = mapA2.values()) != null) {
                for (Src src : collectionValues) {
                    o0c o0cVar = this.mixRender;
                    if (o0cVar != null) {
                        o0cVar.c(src.getSrcTextureId());
                    }
                    int i = n0c.$EnumSwitchMapping$0[src.getSrcType().ordinal()];
                    if (i == 1) {
                        Intrinsics.checkExpressionValueIsNotNull(src, "src");
                        arrayList.add(new tsf(src));
                    } else if (i == 2 && (bitmap = src.getBitmap()) != null) {
                        bitmap.recycle();
                    }
                }
            }
            this.curFrameIndex = -1;
            dli dliVar2 = this.srcMap;
            if (dliVar2 != null && (mapA = dliVar2.a()) != null) {
                mapA.clear();
            }
            ey7 ey7Var = this.frameAll;
            if (ey7Var == null || (sparseArrayA = ey7Var.a()) == null) {
                return;
            }
            sparseArrayA.clear();
        }
    }

    public final void h() {
        synchronized (this.lock) {
            this.forceStopLock = true;
            this.lock.notifyAll();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getAutoTxtColorFill() {
        return this.autoTxtColorFill;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final a40 getPlayer() {
        return this.player;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final dli getSrcMap() {
        return this.srcMap;
    }

    public final void l() {
        synchronized (this.lock) {
            this.resultCbCount++;
            this.lock.notifyAll();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void m(@Nullable dq9 dq9Var) {
    }

    @Override // com.oplus.aiunit.vision.zl9
    public void onDestroy() {
        g();
    }

    @Override // com.oplus.aiunit.vision.zl9
    public void onRelease() {
        g();
    }

    public final void setResourceClickListener(@Nullable pid pidVar) {
    }
}
