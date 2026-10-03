package com.oplus.aiunit.vision;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 /2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0016\u0010#\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0016\u0010'\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0016\u0010(\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0016\u0010)\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0016\u0010*\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001d¨\u00060"}, d2 = {"Lcom/oplus/aiunit/vision/epf;", "Lcom/oplus/aiunit/vision/ew9;", "", MapSchema.FIELD_NAME_KEY, "f", "i", b2n.f, b2n.g, "Lcom/oplus/aiunit/vision/v30;", "config", "a", "", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "d", "c", "b", LogFieldKey.MESSAGE_KEY, LogFieldKey.LEVEL_KEY, "j", "Lcom/oplus/aiunit/vision/s68;", "Lcom/oplus/aiunit/vision/s68;", "vertexArray", "alphaArray", "rgbArray", "", "Z", "surfaceSizeChanged", MapSchema.FIELD_NAME_ENTRY, "I", "surfaceWidth", "surfaceHeight", "Lcom/oplus/aiunit/vision/cc6;", "Lcom/oplus/aiunit/vision/cc6;", "eglUtil", "shaderProgram", "", "[I", "genTexture", "uTextureLocation", "aPositionLocation", "aTextureAlphaLocation", "aTextureRgbLocation", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "<init>", "(Landroid/graphics/SurfaceTexture;)V", "Companion", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class epf implements ew9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final s68 vertexArray;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final s68 alphaArray;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final s68 rgbArray;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean surfaceSizeChanged;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int surfaceWidth;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int surfaceHeight;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final cc6 eglUtil;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int shaderProgram;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int[] genTexture;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int uTextureLocation;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int aPositionLocation;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int aTextureAlphaLocation;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int aTextureRgbLocation;

    public epf(@NotNull SurfaceTexture surfaceTexture) {
        Intrinsics.checkParameterIsNotNull(surfaceTexture, "surfaceTexture");
        this.vertexArray = new s68();
        this.alphaArray = new s68();
        this.rgbArray = new s68();
        cc6 cc6Var = new cc6();
        this.eglUtil = cc6Var;
        this.genTexture = new int[1];
        cc6Var.e(surfaceTexture);
        k();
    }

    @Override // com.oplus.aiunit.vision.ew9
    public void a(@NotNull AnimConfig config) {
        Intrinsics.checkParameterIsNotNull(config, "config");
        m(config);
        l(config);
    }

    @Override // com.oplus.aiunit.vision.ew9
    public int b() {
        return this.genTexture[0];
    }

    @Override // com.oplus.aiunit.vision.ew9
    public void c() {
        this.eglUtil.f();
    }

    @Override // com.oplus.aiunit.vision.ew9
    public void d(int width, int height) {
        if (width <= 0 || height <= 0) {
            return;
        }
        this.surfaceSizeChanged = true;
        this.surfaceWidth = width;
        this.surfaceHeight = height;
    }

    @Override // com.oplus.aiunit.vision.ew9
    public void e(int i, int i2, @Nullable byte[] bArr, @Nullable byte[] bArr2, @Nullable byte[] bArr3) {
        ew9.a.a(this, i, i2, bArr, bArr2, bArr3);
    }

    @Override // com.oplus.aiunit.vision.ew9
    public void f() {
        int i;
        int i2;
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        if (this.surfaceSizeChanged && (i = this.surfaceWidth) > 0 && (i2 = this.surfaceHeight) > 0) {
            this.surfaceSizeChanged = false;
            GLES20.glViewport(0, 0, i, i2);
        }
        j();
    }

    @Override // com.oplus.aiunit.vision.ew9
    public void g() {
        h();
        this.eglUtil.d();
    }

    @Override // com.oplus.aiunit.vision.ew9
    public void h() {
        int[] iArr = this.genTexture;
        GLES20.glDeleteTextures(iArr.length, iArr, 0);
    }

    @Override // com.oplus.aiunit.vision.ew9
    public void i() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        this.eglUtil.f();
    }

    public final void j() {
        GLES20.glUseProgram(this.shaderProgram);
        this.vertexArray.c(this.aPositionLocation);
        GLES20.glActiveTexture(k18.GL_TEXTURE0);
        GLES20.glBindTexture(36197, this.genTexture[0]);
        GLES20.glUniform1i(this.uTextureLocation, 0);
        this.alphaArray.c(this.aTextureAlphaLocation);
        this.rgbArray.c(this.aTextureRgbLocation);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public void k() {
        int iC = yxg.INSTANCE.c("attribute vec4 vPosition;\nattribute vec4 vTexCoordinateAlpha;\nattribute vec4 vTexCoordinateRgb;\nvarying vec2 v_TexCoordinateAlpha;\nvarying vec2 v_TexCoordinateRgb;\n\nvoid main() {\n    v_TexCoordinateAlpha = vec2(vTexCoordinateAlpha.x, vTexCoordinateAlpha.y);\n    v_TexCoordinateRgb = vec2(vTexCoordinateRgb.x, vTexCoordinateRgb.y);\n    gl_Position = vPosition;\n}", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES texture;\nvarying vec2 v_TexCoordinateAlpha;\nvarying vec2 v_TexCoordinateRgb;\n\nvoid main () {\n    vec4 alphaColor = texture2D(texture, v_TexCoordinateAlpha);\n    vec4 rgbColor = texture2D(texture, v_TexCoordinateRgb);\n    gl_FragColor = vec4(rgbColor.r, rgbColor.g, rgbColor.b, alphaColor.r);\n}");
        this.shaderProgram = iC;
        this.uTextureLocation = GLES20.glGetUniformLocation(iC, "texture");
        this.aPositionLocation = GLES20.glGetAttribLocation(this.shaderProgram, "vPosition");
        this.aTextureAlphaLocation = GLES20.glGetAttribLocation(this.shaderProgram, "vTexCoordinateAlpha");
        this.aTextureRgbLocation = GLES20.glGetAttribLocation(this.shaderProgram, "vTexCoordinateRgb");
        int[] iArr = this.genTexture;
        GLES20.glGenTextures(iArr.length, iArr, 0);
        GLES20.glBindTexture(36197, this.genTexture[0]);
        GLES20.glTexParameterf(36197, k18.GL_TEXTURE_MIN_FILTER, k18.GL_NEAREST);
        GLES20.glTexParameterf(36197, 10240, k18.GL_LINEAR);
        GLES20.glTexParameteri(36197, k18.GL_TEXTURE_WRAP_S, k18.GL_CLAMP_TO_EDGE);
        GLES20.glTexParameteri(36197, k18.GL_TEXTURE_WRAP_T, k18.GL_CLAMP_TO_EDGE);
    }

    public final void l(AnimConfig config) {
        yrj yrjVar = yrj.INSTANCE;
        float[] fArrA = yrjVar.a(config.getVideoWidth(), config.getVideoHeight(), config.getAlphaPointRect(), this.alphaArray.getArray());
        float[] fArrA2 = yrjVar.a(config.getVideoWidth(), config.getVideoHeight(), config.getRgbPointRect(), this.rgbArray.getArray());
        this.alphaArray.b(fArrA);
        this.rgbArray.b(fArrA2);
    }

    public final void m(AnimConfig config) {
        this.vertexArray.b(svk.INSTANCE.a(config.getWidth(), config.getHeight(), new PointRect(0, 0, config.getWidth(), config.getHeight()), this.vertexArray.getArray()));
    }
}
