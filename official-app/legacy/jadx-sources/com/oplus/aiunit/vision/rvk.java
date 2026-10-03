package com.oplus.aiunit.vision;

import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes13.dex */
public interface rvk extends bv5 {
    FloatBuffer a(boolean z);

    nvk c();

    int d();

    @Override // com.oplus.aiunit.vision.bv5
    void dispose();

    void e(wxg wxgVar, int[] iArr);

    void invalidate();

    void l(wxg wxgVar, int[] iArr);

    void m(float[] fArr, int i, int i2);
}
