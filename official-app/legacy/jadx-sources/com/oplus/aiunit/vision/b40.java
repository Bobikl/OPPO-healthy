package com.oplus.aiunit.vision;

import android.view.MotionEvent;
import com.oplus.backup.sdk.common.utils.Constants;
import com.tencent.qgame.animplayer.mix.MixAnimPlugin;
import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 '2\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010$\u001a\u00020 ¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\bJ\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/oplus/aiunit/vision/b40;", "", "Lcom/tencent/qgame/animplayer/mix/MixAnimPlugin;", "a", "Lcom/oplus/aiunit/vision/v30;", "config", "", "b", "", b2n.g, "decodeIndex", "c", "f", "i", b2n.f, "d", "Landroid/view/MotionEvent;", "ev", "", MapSchema.FIELD_NAME_ENTRY, "Lcom/tencent/qgame/animplayer/mix/MixAnimPlugin;", "mixAnimPlugin", "Lcom/oplus/aiunit/vision/tgb;", "Lcom/oplus/aiunit/vision/tgb;", "maskAnimPlugin", "", "Lcom/oplus/aiunit/vision/zl9;", "Ljava/util/List;", Constants.LoadBundle.PLUGINS, "I", "frameIndex", "frameDiffTimes", "Lcom/oplus/aiunit/vision/a40;", "Lcom/oplus/aiunit/vision/a40;", "getPlayer", "()Lcom/oplus/aiunit/vision/a40;", "player", "<init>", "(Lcom/oplus/aiunit/vision/a40;)V", "Companion", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class b40 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final MixAnimPlugin mixAnimPlugin;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final tgb maskAnimPlugin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final List<zl9> plugins;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int frameIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int decodeIndex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int frameDiffTimes;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final a40 player;

    public b40(@NotNull a40 player) {
        Intrinsics.checkParameterIsNotNull(player, "player");
        this.player = player;
        MixAnimPlugin mixAnimPlugin = new MixAnimPlugin(player);
        this.mixAnimPlugin = mixAnimPlugin;
        tgb tgbVar = new tgb(player);
        this.maskAnimPlugin = tgbVar;
        this.plugins = CollectionsKt__CollectionsKt.listOf((Object[]) new zl9[]{mixAnimPlugin, tgbVar});
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final MixAnimPlugin getMixAnimPlugin() {
        return this.mixAnimPlugin;
    }

    public final int b(@NotNull AnimConfig config) {
        Intrinsics.checkParameterIsNotNull(config, "config");
        q0.INSTANCE.d("AnimPlayer.AnimPluginManager", "onConfigCreate");
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            int iA = ((zl9) it.next()).a(config);
            if (iA != 0) {
                return iA;
            }
        }
        return 0;
    }

    public final void c(int decodeIndex) {
        q0.INSTANCE.a("AnimPlayer.AnimPluginManager", "onDecoding decodeIndex=" + decodeIndex);
        this.decodeIndex = decodeIndex;
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            ((zl9) it.next()).c(decodeIndex);
        }
    }

    public final void d() {
        q0.INSTANCE.d("AnimPlayer.AnimPluginManager", "onDestroy");
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            ((zl9) it.next()).onDestroy();
        }
    }

    public final boolean e(@NotNull MotionEvent ev) {
        Intrinsics.checkParameterIsNotNull(ev, "ev");
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            if (((zl9) it.next()).b(ev)) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        q0.INSTANCE.d("AnimPlayer.AnimPluginManager", "onLoopStart");
        this.frameIndex = 0;
        this.decodeIndex = 0;
    }

    public final void g() {
        q0.INSTANCE.d("AnimPlayer.AnimPluginManager", "onRelease");
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            ((zl9) it.next()).onRelease();
        }
    }

    public final void h() {
        q0.INSTANCE.d("AnimPlayer.AnimPluginManager", "onRenderCreate");
        this.frameIndex = 0;
        this.decodeIndex = 0;
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            ((zl9) it.next()).e();
        }
    }

    public final void i() {
        if (this.decodeIndex > this.frameIndex + 1 || this.frameDiffTimes >= 4) {
            q0.INSTANCE.d("AnimPlayer.AnimPluginManager", "jump frameIndex= " + this.frameIndex + ",decodeIndex=" + this.decodeIndex + ",frameDiffTimes=" + this.frameDiffTimes);
            this.frameIndex = this.decodeIndex;
        }
        if (this.decodeIndex != this.frameIndex) {
            this.frameDiffTimes++;
        } else {
            this.frameDiffTimes = 0;
        }
        q0.INSTANCE.a("AnimPlayer.AnimPluginManager", "onRendering frameIndex=" + this.frameIndex);
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            ((zl9) it.next()).d(this.frameIndex);
        }
        this.frameIndex++;
    }
}
