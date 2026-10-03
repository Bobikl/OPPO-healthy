package com.oplus.aiunit.vision;

import android.view.MotionEvent;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0002R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/tgb;", "Lcom/oplus/aiunit/vision/zl9;", "Lcom/oplus/aiunit/vision/v30;", "config", "", "a", "", MapSchema.FIELD_NAME_ENTRY, "frameIndex", "d", "onRelease", "onDestroy", "f", "Lcom/oplus/aiunit/vision/ahb;", "Lcom/oplus/aiunit/vision/ahb;", "maskRender", "b", "Lcom/oplus/aiunit/vision/v30;", "animConfig", "Lcom/oplus/aiunit/vision/a40;", "c", "Lcom/oplus/aiunit/vision/a40;", b2n.f, "()Lcom/oplus/aiunit/vision/a40;", "player", "<init>", "(Lcom/oplus/aiunit/vision/a40;)V", "Companion", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class tgb implements zl9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public ahb maskRender;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public AnimConfig animConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a40 player;

    public tgb(@NotNull a40 player) {
        Intrinsics.checkParameterIsNotNull(player, "player");
        this.player = player;
    }

    @Override // com.oplus.aiunit.vision.zl9
    public int a(@NotNull AnimConfig config) {
        Intrinsics.checkParameterIsNotNull(config, "config");
        return 0;
    }

    @Override // com.oplus.aiunit.vision.zl9
    public boolean b(@NotNull MotionEvent ev) {
        Intrinsics.checkParameterIsNotNull(ev, "ev");
        return zl9.a.b(this, ev);
    }

    @Override // com.oplus.aiunit.vision.zl9
    public void c(int i) {
        zl9.a.a(this, i);
    }

    @Override // com.oplus.aiunit.vision.zl9
    public void d(int frameIndex) {
        ahb ahbVar;
        if (this.player.getSupportMaskBoolean() && (this.player.getConfigManager().getConfig() instanceof AnimConfig)) {
            AnimConfig config = this.player.getConfigManager().getConfig();
            this.animConfig = config;
            if (config == null || (ahbVar = this.maskRender) == null) {
                return;
            }
            ahbVar.b(config);
        }
    }

    @Override // com.oplus.aiunit.vision.zl9
    public void e() {
        q0.INSTANCE.d("AnimPlayer.MaskAnimPlugin", "mask render init");
        if (this.player.getSupportMaskBoolean()) {
            ahb ahbVar = new ahb(this);
            this.maskRender = ahbVar;
            ahbVar.a(this.player.getMaskEdgeBlurBoolean());
        }
    }

    public final void f() {
        AnimConfig animConfig = this.animConfig;
        if (animConfig != null) {
            animConfig.e();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final a40 getPlayer() {
        return this.player;
    }

    @Override // com.oplus.aiunit.vision.zl9
    public void onDestroy() {
        f();
    }

    @Override // com.oplus.aiunit.vision.zl9
    public void onRelease() {
        f();
    }
}
