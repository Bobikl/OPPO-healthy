package com.oplus.aiunit.vision;

import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class j6a implements l6a {
    public final ShortBuffer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ByteBuffer f12769j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12770l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12771n = true;
    public boolean o = false;
    public final int p;
    public final boolean q;

    public j6a(boolean z, int i) {
        boolean z2 = i == 0;
        this.q = z2;
        ByteBuffer byteBufferF = BufferUtils.f((z2 ? 1 : i) * 2);
        this.f12769j = byteBufferF;
        this.m = true;
        ShortBuffer shortBufferAsShortBuffer = byteBufferF.asShortBuffer();
        this.i = shortBufferAsShortBuffer;
        this.k = true;
        shortBufferAsShortBuffer.flip();
        byteBufferF.flip();
        this.f12770l = x38.gl20.p();
        this.p = z ? k18.GL_STATIC_DRAW : k18.GL_DYNAMIC_DRAW;
    }

    @Override // com.oplus.aiunit.vision.l6a
    public ShortBuffer a(boolean z) {
        this.f12771n = z | this.f12771n;
        return this.i;
    }

    @Override // com.oplus.aiunit.vision.l6a
    public void bind() {
        int i = this.f12770l;
        if (i == 0) {
            throw new GdxRuntimeException("No buffer allocated!");
        }
        x38.gl20.K(k18.GL_ELEMENT_ARRAY_BUFFER, i);
        if (this.f12771n) {
            this.f12769j.limit(this.i.limit() * 2);
            x38.gl20.y(k18.GL_ELEMENT_ARRAY_BUFFER, this.f12769j.limit(), this.f12769j, this.p);
            this.f12771n = false;
        }
        this.o = true;
    }

    @Override // com.oplus.aiunit.vision.l6a, com.oplus.aiunit.vision.bv5
    public void dispose() {
        x38.gl20.K(k18.GL_ELEMENT_ARRAY_BUFFER, 0);
        x38.gl20.c(this.f12770l);
        this.f12770l = 0;
        if (this.k) {
            BufferUtils.b(this.f12769j);
        }
    }

    @Override // com.oplus.aiunit.vision.l6a
    public void f(short[] sArr, int i, int i2) {
        this.f12771n = true;
        this.i.clear();
        this.i.put(sArr, i, i2);
        this.i.flip();
        this.f12769j.position(0);
        this.f12769j.limit(i2 << 1);
        if (this.o) {
            x38.gl20.y(k18.GL_ELEMENT_ARRAY_BUFFER, this.f12769j.limit(), this.f12769j, this.p);
            this.f12771n = false;
        }
    }

    @Override // com.oplus.aiunit.vision.l6a
    public int g() {
        if (this.q) {
            return 0;
        }
        return this.i.capacity();
    }

    @Override // com.oplus.aiunit.vision.l6a
    public void invalidate() {
        this.f12770l = x38.gl20.p();
        this.f12771n = true;
    }

    @Override // com.oplus.aiunit.vision.l6a
    public int k() {
        if (this.q) {
            return 0;
        }
        return this.i.limit();
    }

    @Override // com.oplus.aiunit.vision.l6a
    public void unbind() {
        x38.gl20.K(k18.GL_ELEMENT_ARRAY_BUFFER, 0);
        this.o = false;
    }
}
