package com.oplus.aiunit.vision;

import com.badlogic.gdx.utils.BufferUtils;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class i6a implements l6a {
    public final ShortBuffer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ByteBuffer f12396j;
    public final boolean k;

    public i6a(int i) {
        boolean z = i == 0;
        this.k = z;
        ByteBuffer byteBufferF = BufferUtils.f((z ? 1 : i) * 2);
        this.f12396j = byteBufferF;
        ShortBuffer shortBufferAsShortBuffer = byteBufferF.asShortBuffer();
        this.i = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.flip();
        byteBufferF.flip();
    }

    @Override // com.oplus.aiunit.vision.l6a
    public ShortBuffer a(boolean z) {
        return this.i;
    }

    @Override // com.oplus.aiunit.vision.l6a
    public void bind() {
    }

    @Override // com.oplus.aiunit.vision.l6a, com.oplus.aiunit.vision.bv5
    public void dispose() {
        BufferUtils.b(this.f12396j);
    }

    @Override // com.oplus.aiunit.vision.l6a
    public void f(short[] sArr, int i, int i2) {
        this.i.clear();
        this.i.put(sArr, i, i2);
        this.i.flip();
        this.f12396j.position(0);
        this.f12396j.limit(i2 << 1);
    }

    @Override // com.oplus.aiunit.vision.l6a
    public int g() {
        if (this.k) {
            return 0;
        }
        return this.i.capacity();
    }

    @Override // com.oplus.aiunit.vision.l6a
    public void invalidate() {
    }

    @Override // com.oplus.aiunit.vision.l6a
    public int k() {
        if (this.k) {
            return 0;
        }
        return this.i.limit();
    }

    @Override // com.oplus.aiunit.vision.l6a
    public void unbind() {
    }
}
