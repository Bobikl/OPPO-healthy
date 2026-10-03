package com.oplus.aiunit.vision;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class l20 implements k18 {
    public int[] a = new int[1];
    public int[] b = new int[1];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f13492c = new int[1];
    public byte[] d = new byte[512];

    @Override // com.oplus.aiunit.vision.k18
    public void A(boolean z) {
        GLES20.glDepthMask(z);
    }

    @Override // com.oplus.aiunit.vision.k18
    public String B(int i) {
        return GLES20.glGetShaderInfoLog(i);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void C(int i, int i2, boolean z, float[] fArr, int i3) {
        GLES20.glUniformMatrix4fv(i, i2, z, fArr, i3);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void D(int i, String str) {
        GLES20.glShaderSource(i, str);
    }

    @Override // com.oplus.aiunit.vision.k18
    public String E(int i, int i2, IntBuffer intBuffer, IntBuffer intBuffer2) {
        byte[] bArr = this.d;
        GLES20.glGetActiveUniform(i, i2, bArr.length, this.a, 0, this.b, 0, this.f13492c, 0, bArr, 0);
        intBuffer.put(this.b[0]);
        intBuffer2.put(this.f13492c[0]);
        return new String(this.d, 0, this.a[0]);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void G(int i, int i2, int i3, boolean z, int i4, int i5) {
        GLES20.glVertexAttribPointer(i, i2, i3, z, i4, i5);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void H(int i, IntBuffer intBuffer) {
        GLES20.glGetIntegerv(i, intBuffer);
    }

    @Override // com.oplus.aiunit.vision.k18
    public String I(int i, int i2, IntBuffer intBuffer, IntBuffer intBuffer2) {
        byte[] bArr = this.d;
        GLES20.glGetActiveAttrib(i, i2, bArr.length, this.a, 0, this.b, 0, this.f13492c, 0, bArr, 0);
        intBuffer.put(this.b[0]);
        intBuffer2.put(this.f13492c[0]);
        return new String(this.d, 0, this.a[0]);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void J(int i, int i2) {
        GLES20.glUniform1i(i, i2);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void K(int i, int i2) {
        GLES20.glBindBuffer(i, i2);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void L(int i) {
        GLES20.glGenerateMipmap(i);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void M(int i) {
        GLES20.glLinkProgram(i);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void N(int i) {
        GLES20.glDisableVertexAttribArray(i);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void O(int i, int i2, int i3, int i4) {
        GLES20.glDrawElements(i, i2, i3, i4);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void P(float f, float f2, float f3, float f4) {
        GLES20.glClearColor(f, f2, f3, f4);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void Q(int i) {
        GLES20.glDeleteProgram(i);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void R(int i, int i2, IntBuffer intBuffer) {
        GLES20.glGetShaderiv(i, i2, intBuffer);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void S(int i, int i2, int i3) {
        GLES20.glDrawArrays(i, i2, i3);
    }

    @Override // com.oplus.aiunit.vision.k18
    public String T(int i) {
        return GLES20.glGetProgramInfoLog(i);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void U(int i) {
        GLES20.glDeleteShader(i);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void V(int i, int i2) {
        GLES20.glAttachShader(i, i2);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void W(int i) {
        GLES20.glDisable(i);
    }

    @Override // com.oplus.aiunit.vision.k18
    public int X() {
        return GLES20.glCreateProgram();
    }

    @Override // com.oplus.aiunit.vision.k18
    public void Y(int i, int i2) {
        GLES20.glBindTexture(i, i2);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void a(int i) {
        GLES20.glEnable(i);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void a0(int i, int i2, int i3, boolean z, int i4, Buffer buffer) {
        GLES20.glVertexAttribPointer(i, i2, i3, z, i4, buffer);
    }

    @Override // com.oplus.aiunit.vision.k18
    public int b() {
        GLES20.glGenTextures(1, this.a, 0);
        return this.a[0];
    }

    @Override // com.oplus.aiunit.vision.k18
    public void b0(int i, int i2, int i3, int i4) {
        GLES20.glBlendFuncSeparate(i, i2, i3, i4);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void c(int i) {
        int[] iArr = this.a;
        iArr[0] = i;
        GLES20.glDeleteBuffers(1, iArr, 0);
    }

    @Override // com.oplus.aiunit.vision.k18
    public int c0() {
        GLES20.glGenFramebuffers(1, this.a, 0);
        return this.a[0];
    }

    @Override // com.oplus.aiunit.vision.k18
    public void d(int i) {
        GLES20.glUseProgram(i);
    }

    @Override // com.oplus.aiunit.vision.k18
    public int d0(int i, String str) {
        return GLES20.glGetAttribLocation(i, str);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void e0(int i) {
        int[] iArr = this.a;
        iArr[0] = i;
        GLES20.glDeleteTextures(1, iArr, 0);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void f(int i, int i2) {
        GLES20.glBindFramebuffer(i, i2);
    }

    @Override // com.oplus.aiunit.vision.k18
    public int f0(int i) {
        return GLES20.glCreateShader(i);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void g(int i) {
        GLES20.glClear(i);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void h(int i, int i2) {
        GLES20.glPixelStorei(i, i2);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void i(int i, int i2, int i3, int i4, int i5, int i6, int i7, Buffer buffer) {
        GLES20.glCompressedTexImage2D(i, i2, i3, i4, i5, i6, i7, buffer);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void j(int i, FloatBuffer floatBuffer) {
        GLES20.glGetFloatv(i, floatBuffer);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void k(int i, int i2, int i3, Buffer buffer) {
        GLES20.glDrawElements(i, i2, i3, buffer);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void l(int i, int i2, int i3, int i4) {
        GLES20.glViewport(i, i2, i3, i4);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void m(int i) {
        GLES20.glEnableVertexAttribArray(i);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void n(int i, int i2, int i3) {
        GLES20.glTexParameteri(i, i2, i3);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void o(int i, int i2, IntBuffer intBuffer) {
        GLES20.glGetProgramiv(i, i2, intBuffer);
    }

    @Override // com.oplus.aiunit.vision.k18
    public int p() {
        GLES20.glGenBuffers(1, this.a, 0);
        return this.a[0];
    }

    @Override // com.oplus.aiunit.vision.k18
    public String q(int i) {
        return GLES20.glGetString(i);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void r(int i) {
        int[] iArr = this.a;
        iArr[0] = i;
        GLES20.glDeleteRenderbuffers(1, iArr, 0);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void s(int i, int i2, int i3, Buffer buffer) {
        GLES20.glBufferSubData(i, i2, i3, buffer);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void t(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Buffer buffer) {
        GLES20.glTexImage2D(i, i2, i3, i4, i5, i6, i7, i8, buffer);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void u(int i) {
        int[] iArr = this.a;
        iArr[0] = i;
        GLES20.glDeleteFramebuffers(1, iArr, 0);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void v(int i) {
        GLES20.glCompileShader(i);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void w(int i, int i2, float f) {
        GLES20.glTexParameterf(i, i2, f);
    }

    @Override // com.oplus.aiunit.vision.k18
    public void y(int i, int i2, Buffer buffer, int i3) {
        GLES20.glBufferData(i, i2, buffer, i3);
    }

    @Override // com.oplus.aiunit.vision.k18
    public int z(int i, String str) {
        return GLES20.glGetUniformLocation(i, str);
    }
}
