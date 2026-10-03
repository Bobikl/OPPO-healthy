package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public abstract class j4h<Z> extends k91<Z> {
    private final int height;
    private final int width;

    public j4h() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.oplus.aiunit.vision.boj
    public final void getSize(@NonNull l7h l7hVar) {
        if (uqk.v(this.width, this.height)) {
            l7hVar.d(this.width, this.height);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.width + " and height: " + this.height + ", either provide dimensions in the constructor or call override()");
    }

    @Override // com.oplus.aiunit.vision.boj
    public void removeCallback(@NonNull l7h l7hVar) {
    }

    public j4h(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
