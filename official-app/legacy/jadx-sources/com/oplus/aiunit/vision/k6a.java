package com.oplus.aiunit.vision;

import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class k6a implements l6a {
    public final ShortBuffer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ByteBuffer f13170j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f13171l;
    public boolean m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13172n = false;
    public final int o;

    public k6a(boolean z, int i) {
        ByteBuffer byteBufferC = BufferUtils.c(i * 2);
        this.f13170j = byteBufferC;
        this.f13171l = true;
        this.o = z ? k18.GL_STATIC_DRAW : k18.GL_DYNAMIC_DRAW;
        ShortBuffer shortBufferAsShortBuffer = byteBufferC.asShortBuffer();
        this.i = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.flip();
        byteBufferC.flip();
        this.k = b();
    }

    @Override // com.oplus.aiunit.vision.l6a
    public ShortBuffer a(boolean z) {
        this.m = z | this.m;
        return this.i;
    }

    public final int b() {
        int iP = x38.gl20.p();
        x38.gl20.K(k18.GL_ELEMENT_ARRAY_BUFFER, iP);
        x38.gl20.y(k18.GL_ELEMENT_ARRAY_BUFFER, this.f13170j.capacity(), null, this.o);
        x38.gl20.K(k18.GL_ELEMENT_ARRAY_BUFFER, 0);
        return iP;
    }

    @Override // com.oplus.aiunit.vision.l6a
    public void bind() {
        int i = this.k;
        if (i == 0) {
            throw new GdxRuntimeException("IndexBufferObject cannot be used after it has been disposed.");
        }
        x38.gl20.K(k18.GL_ELEMENT_ARRAY_BUFFER, i);
        if (this.m) {
            this.f13170j.limit(this.i.limit() * 2);
            x38.gl20.s(k18.GL_ELEMENT_ARRAY_BUFFER, 0, this.f13170j.limit(), this.f13170j);
            this.m = false;
        }
        this.f13172n = true;
    }

    @Override // com.oplus.aiunit.vision.l6a, com.oplus.aiunit.vision.bv5
    public void dispose() {
        k18 k18Var = x38.gl20;
        k18Var.K(k18.GL_ELEMENT_ARRAY_BUFFER, 0);
        k18Var.c(this.k);
        this.k = 0;
    }

    @Override // com.oplus.aiunit.vision.l6a
    public void f(short[] sArr, int i, int i2) {
        this.m = true;
        this.i.clear();
        this.i.put(sArr, i, i2);
        this.i.flip();
        this.f13170j.position(0);
        this.f13170j.limit(i2 << 1);
        if (this.f13172n) {
            x38.gl20.s(k18.GL_ELEMENT_ARRAY_BUFFER, 0, this.f13170j.limit(), this.f13170j);
            this.m = false;
        }
    }

    @Override // com.oplus.aiunit.vision.l6a
    public int g() {
        return this.i.capacity();
    }

    @Override // com.oplus.aiunit.vision.l6a
    public void invalidate() {
        this.k = b();
        this.m = true;
    }

    @Override // com.oplus.aiunit.vision.l6a
    public int k() {
        return this.i.limit();
    }

    @Override // com.oplus.aiunit.vision.l6a
    public void unbind() {
        x38.gl20.K(k18.GL_ELEMENT_ARRAY_BUFFER, 0);
        this.f13172n = false;
    }
}
