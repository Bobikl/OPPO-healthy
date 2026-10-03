package com.oplus.aiunit.vision;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import io.protostuff.MapSchema;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 B2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J6\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0002R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0016\u0010\u001d\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0016\u0010 \u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0016\u0010!\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0016\u0010#\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0016\u0010(\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001cR\u0016\u0010*\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001cR\u0016\u0010,\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\u001cR\u0016\u0010.\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\u001cR\u0018\u0010\u0011\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u0010\u0012\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0018\u0010\u0013\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010\u001cR\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010;R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010;¨\u0006C"}, d2 = {"Lcom/oplus/aiunit/vision/n7m;", "Lcom/oplus/aiunit/vision/ew9;", "", MapSchema.FIELD_NAME_KEY, "f", "i", b2n.f, "Lcom/oplus/aiunit/vision/v30;", "config", "a", "", "b", b2n.g, "c", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "", "y", "u", "v", MapSchema.FIELD_NAME_ENTRY, "j", "Lcom/oplus/aiunit/vision/s68;", "Lcom/oplus/aiunit/vision/s68;", "vertexArray", "alphaArray", "rgbArray", "d", "I", "shaderProgram", "avPosition", "rgbPosition", "alphaPosition", "samplerY", "samplerU", "samplerV", "", "[I", "textureId", LogFieldKey.LEVEL_KEY, "convertMatrixUniform", LogFieldKey.MESSAGE_KEY, "convertOffsetUniform", "n", "widthYUV", "o", "heightYUV", "Ljava/nio/ByteBuffer;", LogFieldKey.PROCESS_NAME_KEY, "Ljava/nio/ByteBuffer;", "q", "r", "Lcom/oplus/aiunit/vision/cc6;", "s", "Lcom/oplus/aiunit/vision/cc6;", "eglUtil", "t", "unpackAlign", "", "[F", "YUV_OFFSET", "YUV_MATRIX", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "<init>", "(Landroid/graphics/SurfaceTexture;)V", "Companion", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class n7m implements ew9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final s68 vertexArray;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final s68 alphaArray;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final s68 rgbArray;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int shaderProgram;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int avPosition;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int rgbPosition;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int alphaPosition;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int samplerY;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int samplerU;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int samplerV;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int[] textureId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int convertMatrixUniform;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int convertOffsetUniform;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int widthYUV;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int heightYUV;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public ByteBuffer y;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public ByteBuffer u;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public ByteBuffer v;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final cc6 eglUtil;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public int unpackAlign;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final float[] YUV_OFFSET;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final float[] YUV_MATRIX;

    public n7m(@NotNull SurfaceTexture surfaceTexture) {
        Intrinsics.checkParameterIsNotNull(surfaceTexture, "surfaceTexture");
        this.vertexArray = new s68();
        this.alphaArray = new s68();
        this.rgbArray = new s68();
        this.textureId = new int[3];
        cc6 cc6Var = new cc6();
        this.eglUtil = cc6Var;
        this.unpackAlign = 4;
        this.YUV_OFFSET = new float[]{0.0f, -0.5019608f, -0.5019608f};
        this.YUV_MATRIX = new float[]{1.0f, 1.0f, 1.0f, 0.0f, -0.3441f, 1.772f, 1.402f, -0.7141f, 0.0f};
        cc6Var.e(surfaceTexture);
        k();
    }

    @Override // com.oplus.aiunit.vision.ew9
    public void a(@NotNull AnimConfig config) {
        Intrinsics.checkParameterIsNotNull(config, "config");
        this.vertexArray.b(svk.INSTANCE.a(config.getWidth(), config.getHeight(), new PointRect(0, 0, config.getWidth(), config.getHeight()), this.vertexArray.getArray()));
        yrj yrjVar = yrj.INSTANCE;
        float[] fArrA = yrjVar.a(config.getVideoWidth(), config.getVideoHeight(), config.getAlphaPointRect(), this.alphaArray.getArray());
        float[] fArrA2 = yrjVar.a(config.getVideoWidth(), config.getVideoHeight(), config.getRgbPointRect(), this.rgbArray.getArray());
        this.alphaArray.b(fArrA);
        this.rgbArray.b(fArrA2);
    }

    @Override // com.oplus.aiunit.vision.ew9
    public int b() {
        return this.textureId[0];
    }

    @Override // com.oplus.aiunit.vision.ew9
    public void c() {
        this.eglUtil.f();
    }

    @Override // com.oplus.aiunit.vision.ew9
    public void d(int i, int i2) {
        ew9.a.b(this, i, i2);
    }

    @Override // com.oplus.aiunit.vision.ew9
    public void e(int width, int height, @Nullable byte[] y, @Nullable byte[] u, @Nullable byte[] v) {
        this.widthYUV = width;
        this.heightYUV = height;
        this.y = ByteBuffer.wrap(y);
        this.u = ByteBuffer.wrap(u);
        this.v = ByteBuffer.wrap(v);
        int i = this.widthYUV;
        if ((i / 2) % 4 != 0) {
            this.unpackAlign = (i / 2) % 2 != 0 ? 1 : 2;
        }
    }

    @Override // com.oplus.aiunit.vision.ew9
    public void f() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        j();
    }

    @Override // com.oplus.aiunit.vision.ew9
    public void g() {
        h();
        this.eglUtil.d();
    }

    @Override // com.oplus.aiunit.vision.ew9
    public void h() {
        int[] iArr = this.textureId;
        GLES20.glDeleteTextures(iArr.length, iArr, 0);
    }

    @Override // com.oplus.aiunit.vision.ew9
    public void i() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        this.eglUtil.f();
    }

    public final void j() {
        if (this.widthYUV <= 0 || this.heightYUV <= 0 || this.y == null || this.u == null || this.v == null) {
            return;
        }
        GLES20.glUseProgram(this.shaderProgram);
        this.vertexArray.c(this.avPosition);
        this.alphaArray.c(this.alphaPosition);
        this.rgbArray.c(this.rgbPosition);
        GLES20.glPixelStorei(k18.GL_UNPACK_ALIGNMENT, this.unpackAlign);
        GLES20.glActiveTexture(k18.GL_TEXTURE0);
        GLES20.glBindTexture(k18.GL_TEXTURE_2D, this.textureId[0]);
        GLES20.glTexImage2D(k18.GL_TEXTURE_2D, 0, k18.GL_LUMINANCE, this.widthYUV, this.heightYUV, 0, k18.GL_LUMINANCE, 5121, this.y);
        GLES20.glActiveTexture(k18.GL_TEXTURE1);
        GLES20.glBindTexture(k18.GL_TEXTURE_2D, this.textureId[1]);
        GLES20.glTexImage2D(k18.GL_TEXTURE_2D, 0, k18.GL_LUMINANCE, this.widthYUV / 2, this.heightYUV / 2, 0, k18.GL_LUMINANCE, 5121, this.u);
        GLES20.glActiveTexture(k18.GL_TEXTURE2);
        GLES20.glBindTexture(k18.GL_TEXTURE_2D, this.textureId[2]);
        GLES20.glTexImage2D(k18.GL_TEXTURE_2D, 0, k18.GL_LUMINANCE, this.widthYUV / 2, this.heightYUV / 2, 0, k18.GL_LUMINANCE, 5121, this.v);
        GLES20.glUniform1i(this.samplerY, 0);
        GLES20.glUniform1i(this.samplerU, 1);
        GLES20.glUniform1i(this.samplerV, 2);
        GLES20.glUniform3fv(this.convertOffsetUniform, 1, FloatBuffer.wrap(this.YUV_OFFSET));
        GLES20.glUniformMatrix3fv(this.convertMatrixUniform, 1, false, this.YUV_MATRIX, 0);
        GLES20.glDrawArrays(5, 0, 4);
        ByteBuffer byteBuffer = this.y;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.u;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        ByteBuffer byteBuffer3 = this.v;
        if (byteBuffer3 != null) {
            byteBuffer3.clear();
        }
        this.y = null;
        this.u = null;
        this.v = null;
        GLES20.glDisableVertexAttribArray(this.avPosition);
        GLES20.glDisableVertexAttribArray(this.rgbPosition);
        GLES20.glDisableVertexAttribArray(this.alphaPosition);
    }

    public void k() {
        int iC = yxg.INSTANCE.c("attribute vec4 v_Position;\nattribute vec2 vTexCoordinateAlpha;\nattribute vec2 vTexCoordinateRgb;\nvarying vec2 v_TexCoordinateAlpha;\nvarying vec2 v_TexCoordinateRgb;\n\nvoid main() {\n    v_TexCoordinateAlpha = vTexCoordinateAlpha;\n    v_TexCoordinateRgb = vTexCoordinateRgb;\n    gl_Position = v_Position;\n}", "precision mediump float;\nuniform sampler2D sampler_y;\nuniform sampler2D sampler_u;\nuniform sampler2D sampler_v;\nvarying vec2 v_TexCoordinateAlpha;\nvarying vec2 v_TexCoordinateRgb;\nuniform mat3 convertMatrix;\nuniform vec3 offset;\n\nvoid main() {\n   highp vec3 yuvColorAlpha;\n   highp vec3 yuvColorRGB;\n   highp vec3 rgbColorAlpha;\n   highp vec3 rgbColorRGB;\n   yuvColorAlpha.x = texture2D(sampler_y,v_TexCoordinateAlpha).r;\n   yuvColorRGB.x = texture2D(sampler_y,v_TexCoordinateRgb).r;\n   yuvColorAlpha.y = texture2D(sampler_u,v_TexCoordinateAlpha).r;\n   yuvColorAlpha.z = texture2D(sampler_v,v_TexCoordinateAlpha).r;\n   yuvColorRGB.y = texture2D(sampler_u,v_TexCoordinateRgb).r;\n   yuvColorRGB.z = texture2D(sampler_v,v_TexCoordinateRgb).r;\n   yuvColorAlpha += offset;\n   yuvColorRGB += offset;\n   rgbColorAlpha = convertMatrix * yuvColorAlpha; \n   rgbColorRGB = convertMatrix * yuvColorRGB; \n   gl_FragColor=vec4(rgbColorRGB, rgbColorAlpha.r);\n}");
        this.shaderProgram = iC;
        this.avPosition = GLES20.glGetAttribLocation(iC, "v_Position");
        this.rgbPosition = GLES20.glGetAttribLocation(this.shaderProgram, "vTexCoordinateRgb");
        this.alphaPosition = GLES20.glGetAttribLocation(this.shaderProgram, "vTexCoordinateAlpha");
        this.samplerY = GLES20.glGetUniformLocation(this.shaderProgram, "sampler_y");
        this.samplerU = GLES20.glGetUniformLocation(this.shaderProgram, "sampler_u");
        this.samplerV = GLES20.glGetUniformLocation(this.shaderProgram, "sampler_v");
        this.convertMatrixUniform = GLES20.glGetUniformLocation(this.shaderProgram, "convertMatrix");
        this.convertOffsetUniform = GLES20.glGetUniformLocation(this.shaderProgram, TypedValues.CycleType.S_WAVE_OFFSET);
        int[] iArr = this.textureId;
        GLES20.glGenTextures(iArr.length, iArr, 0);
        for (int i : this.textureId) {
            GLES20.glBindTexture(k18.GL_TEXTURE_2D, i);
            GLES20.glTexParameteri(k18.GL_TEXTURE_2D, k18.GL_TEXTURE_WRAP_S, k18.GL_REPEAT);
            GLES20.glTexParameteri(k18.GL_TEXTURE_2D, k18.GL_TEXTURE_WRAP_T, k18.GL_REPEAT);
            GLES20.glTexParameteri(k18.GL_TEXTURE_2D, k18.GL_TEXTURE_MIN_FILTER, k18.GL_LINEAR);
            GLES20.glTexParameteri(k18.GL_TEXTURE_2D, 10240, k18.GL_LINEAR);
        }
    }
}
