package com.oplus.aiunit.vision;

import android.opengl.GLES20;
import com.heytap.log.consts.LogSenderConst;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0004\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/bhb;", "", "", "a", "I", LogSenderConst.Program, "b", "getUTextureMaskUnitLocation", "()I", "uTextureMaskUnitLocation", "c", "getAPositionLocation", "aPositionLocation", "d", "getATextureMaskCoordinatesLocation", "aTextureMaskCoordinatesLocation", "", "edgeBlurBoolean", "<init>", "(Z)V", "Companion", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class bhb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int program;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int uTextureMaskUnitLocation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int aPositionLocation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int aTextureMaskCoordinatesLocation;

    public bhb(boolean z) {
        yxg yxgVar;
        String str;
        if (z) {
            yxgVar = yxg.INSTANCE;
            str = "precision mediump float;\nuniform sampler2D uTextureAlphaMask;\nvarying vec2 v_TexCoordinateAlphaMask;\nmat3 weight = mat3(0.0625,0.125,0.0625,0.125,0.25,0.125,0.0625,0.125,0.0625);\n int coreSize=3;\nfloat texelOffset = .01;\n\nvoid main() {\n   float alphaResult = 0.;\n   for(int y = 0; y < coreSize; y++) {\n       for(int x = 0;x < coreSize; x++) {\n           alphaResult += texture2D(uTextureAlphaMask, vec2(v_TexCoordinateAlphaMask.x + (-1.0 + float(x)) * texelOffset,v_TexCoordinateAlphaMask.y + (-1.0 + float(y)) * texelOffset)).a * weight[x][y];\n       }\n    }\n    gl_FragColor = vec4(0, 0, 0, alphaResult);\n}";
        } else {
            yxgVar = yxg.INSTANCE;
            str = "precision mediump float;\nuniform sampler2D uTextureAlphaMask;\nvarying vec2 v_TexCoordinateAlphaMask;\n\nvoid main () {\n    vec4 alphaMaskColor = texture2D(uTextureAlphaMask, v_TexCoordinateAlphaMask);\n    gl_FragColor = vec4(0, 0, 0, alphaMaskColor.a);\n}";
        }
        int iC = yxgVar.c("attribute vec4 vPosition;\nattribute vec4 vTexCoordinateAlphaMask;\nvarying vec2 v_TexCoordinateAlphaMask;\n\nvoid main() {\n    v_TexCoordinateAlphaMask = vec2(vTexCoordinateAlphaMask.x, vTexCoordinateAlphaMask.y);\n    gl_Position = vPosition;\n}", str);
        this.program = iC;
        this.uTextureMaskUnitLocation = GLES20.glGetUniformLocation(iC, "uTextureAlphaMask");
        this.aPositionLocation = GLES20.glGetAttribLocation(iC, "vPosition");
        this.aTextureMaskCoordinatesLocation = GLES20.glGetAttribLocation(iC, "vTexCoordinateAlphaMask");
    }
}
