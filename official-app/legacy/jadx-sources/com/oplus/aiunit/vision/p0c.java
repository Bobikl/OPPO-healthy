package com.oplus.aiunit.vision;

import android.opengl.GLES20;
import com.heytap.log.consts.LogSenderConst;
import io.protostuff.MapSchema;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\r\u0010\bR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/p0c;", "", "", "i", "", "a", "I", "d", "()I", LogSenderConst.Program, "b", b2n.g, "uTextureSrcUnitLocation", "c", b2n.f, "uTextureMaskUnitLocation", "f", "uIsFillLocation", MapSchema.FIELD_NAME_ENTRY, "uColorLocation", "aPositionLocation", "aTextureSrcCoordinatesLocation", "aTextureMaskCoordinatesLocation", "<init>", "()V", "Companion", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class p0c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int program;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int uTextureSrcUnitLocation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int uTextureMaskUnitLocation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int uIsFillLocation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int uColorLocation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int aPositionLocation;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int aTextureSrcCoordinatesLocation;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final int aTextureMaskCoordinatesLocation;

    public p0c() {
        int iC = yxg.INSTANCE.c("attribute vec4 a_Position;  \nattribute vec2 a_TextureSrcCoordinates;\nattribute vec2 a_TextureMaskCoordinates;\nvarying vec2 v_TextureSrcCoordinates;\nvarying vec2 v_TextureMaskCoordinates;\nvoid main()\n{\n    v_TextureSrcCoordinates = a_TextureSrcCoordinates;\n    v_TextureMaskCoordinates = a_TextureMaskCoordinates;\n    gl_Position = a_Position;\n}", "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nuniform sampler2D u_TextureSrcUnit;\nuniform samplerExternalOES u_TextureMaskUnit;\nuniform int u_isFill;\nuniform vec4 u_Color;\nvarying vec2 v_TextureSrcCoordinates;\nvarying vec2 v_TextureMaskCoordinates;\nvoid main()\n{\n    vec4 srcRgba = texture2D(u_TextureSrcUnit, v_TextureSrcCoordinates);\n    vec4 maskRgba = texture2D(u_TextureMaskUnit, v_TextureMaskCoordinates);\n    float isFill = step(0.5, float(u_isFill));\n    vec4 srcRgbaCal = isFill * vec4(u_Color.r, u_Color.g, u_Color.b, srcRgba.a) + (1.0 - isFill) * srcRgba;\n    gl_FragColor = vec4(srcRgbaCal.r, srcRgbaCal.g, srcRgbaCal.b, srcRgba.a * maskRgba.r);\n}");
        this.program = iC;
        this.uTextureSrcUnitLocation = GLES20.glGetUniformLocation(iC, "u_TextureSrcUnit");
        this.uTextureMaskUnitLocation = GLES20.glGetUniformLocation(iC, "u_TextureMaskUnit");
        this.uIsFillLocation = GLES20.glGetUniformLocation(iC, "u_isFill");
        this.uColorLocation = GLES20.glGetUniformLocation(iC, "u_Color");
        this.aPositionLocation = GLES20.glGetAttribLocation(iC, "a_Position");
        this.aTextureSrcCoordinatesLocation = GLES20.glGetAttribLocation(iC, "a_TextureSrcCoordinates");
        this.aTextureMaskCoordinatesLocation = GLES20.glGetAttribLocation(iC, "a_TextureMaskCoordinates");
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAPositionLocation() {
        return this.aPositionLocation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getATextureMaskCoordinatesLocation() {
        return this.aTextureMaskCoordinatesLocation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getATextureSrcCoordinatesLocation() {
        return this.aTextureSrcCoordinatesLocation;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getProgram() {
        return this.program;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getUColorLocation() {
        return this.uColorLocation;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getUIsFillLocation() {
        return this.uIsFillLocation;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getUTextureMaskUnitLocation() {
        return this.uTextureMaskUnitLocation;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getUTextureSrcUnitLocation() {
        return this.uTextureSrcUnitLocation;
    }

    public final void i() {
        GLES20.glUseProgram(this.program);
    }
}
