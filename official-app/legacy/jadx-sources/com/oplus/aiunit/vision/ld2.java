package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class ld2 implements com.bumptech.glide.load.data.a<ByteBuffer> {
    public final ByteBuffer a;

    public static class a implements com.bumptech.glide.load.data.a.InterfaceC0176a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.a.InterfaceC0176a
        @NonNull
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0176a
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.bumptech.glide.load.data.a<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new ld2(byteBuffer);
        }
    }

    public ld2(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.a
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ByteBuffer c() {
        this.a.position(0);
        return this.a;
    }

    @Override // com.bumptech.glide.load.data.a
    public void b() {
    }
}
