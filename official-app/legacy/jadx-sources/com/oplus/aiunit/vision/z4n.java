package com.oplus.aiunit.vision;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class z4n extends u6n {
    public z4n(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    @Override // com.oplus.aiunit.vision.u6n
    public final int b(CharSequence charSequence) {
        try {
            return super.b(charSequence);
        } catch (Throwable th) {
            n6n.a(th);
            return super.b("");
        }
    }
}
