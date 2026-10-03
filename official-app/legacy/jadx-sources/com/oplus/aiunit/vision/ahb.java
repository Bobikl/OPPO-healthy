package com.oplus.aiunit.vision;

import android.opengl.GLES20;
import com.tencent.qgame.animplayer.Decoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/oplus/aiunit/vision/ahb;", "", "", "edgeBlur", "", "a", "Lcom/oplus/aiunit/vision/v30;", "config", "b", "Lcom/oplus/aiunit/vision/bhb;", "Lcom/oplus/aiunit/vision/bhb;", "getMaskShader", "()Lcom/oplus/aiunit/vision/bhb;", "setMaskShader", "(Lcom/oplus/aiunit/vision/bhb;)V", "maskShader", "Lcom/oplus/aiunit/vision/s68;", "Lcom/oplus/aiunit/vision/s68;", "getVertexArray", "()Lcom/oplus/aiunit/vision/s68;", "setVertexArray", "(Lcom/oplus/aiunit/vision/s68;)V", "vertexArray", "c", "maskArray", "Lcom/oplus/aiunit/vision/tgb;", "d", "Lcom/oplus/aiunit/vision/tgb;", "maskAnimPlugin", "<init>", "(Lcom/oplus/aiunit/vision/tgb;)V", "Companion", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class ahb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public bhb maskShader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public s68 vertexArray;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public s68 maskArray;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final tgb maskAnimPlugin;

    public ahb(@NotNull tgb maskAnimPlugin) {
        Intrinsics.checkParameterIsNotNull(maskAnimPlugin, "maskAnimPlugin");
        this.maskAnimPlugin = maskAnimPlugin;
        this.vertexArray = new s68();
        this.maskArray = new s68();
    }

    public final void a(boolean edgeBlur) {
        this.maskShader = new bhb(edgeBlur);
        GLES20.glDisable(k18.GL_DEPTH_TEST);
    }

    public final void b(@NotNull AnimConfig config) {
        ew9 render;
        Intrinsics.checkParameterIsNotNull(config, "config");
        Decoder decoder = this.maskAnimPlugin.getPlayer().getDecoder();
        if (decoder == null || (render = decoder.getRender()) == null || render.b() <= 0 || this.maskShader == null) {
            return;
        }
        config.e();
    }
}
