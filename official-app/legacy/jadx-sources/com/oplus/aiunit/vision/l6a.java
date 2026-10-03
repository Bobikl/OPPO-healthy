package com.oplus.aiunit.vision;

import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes13.dex */
public interface l6a extends bv5 {
    ShortBuffer a(boolean z);

    void bind();

    @Override // com.oplus.aiunit.vision.bv5
    void dispose();

    void f(short[] sArr, int i, int i2);

    int g();

    void invalidate();

    int k();

    void unbind();
}
