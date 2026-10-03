package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.ShapePath;

/* JADX INFO: loaded from: classes13.dex */
public class th2 extends CornerTreatment {
    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@NonNull ShapePath shapePath, float f, float f2, float f3) {
        shapePath.reset(0.0f, f3 * f2, 180.0f, 0.0f);
        float f4 = f3 * 2.0f * f2;
        shapePath.addArc(0.0f, 0.0f, f4, f4, 180.0f, 0.0f);
    }
}
