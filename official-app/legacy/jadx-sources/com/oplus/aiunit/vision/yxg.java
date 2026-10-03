package com.oplus.aiunit.vision;

import android.opengl.GLES20;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/yxg;", "", "", "vertexSource", "fragmentSource", "", "c", "shaderType", "shaderSource", "a", "vertexShaderHandle", "fragmentShaderHandle", "b", "<init>", "()V", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class yxg {
    public static final yxg INSTANCE = new yxg();

    public final int a(int shaderType, String shaderSource) {
        int iGlCreateShader = GLES20.glCreateShader(shaderType);
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, shaderSource);
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, k18.GL_COMPILE_STATUS, iArr, 0);
            if (iArr[0] == 0) {
                q0.INSTANCE.b("AnimPlayer.ShaderUtil", "Error compiling shader: " + GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                iGlCreateShader = 0;
            }
        }
        if (iGlCreateShader != 0) {
            return iGlCreateShader;
        }
        throw new RuntimeException("Error creating shader.");
    }

    public final int b(int vertexShaderHandle, int fragmentShaderHandle) {
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, vertexShaderHandle);
            GLES20.glAttachShader(iGlCreateProgram, fragmentShaderHandle);
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, k18.GL_LINK_STATUS, iArr, 0);
            if (iArr[0] == 0) {
                q0.INSTANCE.b("AnimPlayer.ShaderUtil", "Error compiling program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                GLES20.glDeleteProgram(iGlCreateProgram);
                iGlCreateProgram = 0;
            }
        }
        if (iGlCreateProgram != 0) {
            return iGlCreateProgram;
        }
        throw new RuntimeException("Error creating program.");
    }

    public final int c(@NotNull String vertexSource, @NotNull String fragmentSource) {
        Intrinsics.checkParameterIsNotNull(vertexSource, "vertexSource");
        Intrinsics.checkParameterIsNotNull(fragmentSource, "fragmentSource");
        return b(a(k18.GL_VERTEX_SHADER, vertexSource), a(k18.GL_FRAGMENT_SHADER, fragmentSource));
    }
}
