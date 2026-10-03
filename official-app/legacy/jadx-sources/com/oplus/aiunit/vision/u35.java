package com.oplus.aiunit.vision;

import android.graphics.Color;

/* JADX INFO: loaded from: classes15.dex */
public class u35 implements xa2 {
    public boolean a;
    public boolean b;

    @Override // com.oplus.aiunit.vision.xa2
    public int a(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] - 0.1f;
        return Color.HSVToColor(fArr);
    }

    @Override // com.oplus.aiunit.vision.xa2
    public boolean b() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.xa2
    public int c(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[1] = fArr[1] - 0.3f;
        fArr[2] = fArr[2] + 0.3f;
        return Color.HSVToColor(fArr);
    }

    @Override // com.oplus.aiunit.vision.xa2
    public boolean d() {
        return this.b;
    }

    public u35 e(boolean z) {
        this.b = z;
        return this;
    }

    public u35 f(boolean z) {
        this.a = z;
        return this;
    }
}
