package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;

/* JADX INFO: loaded from: classes13.dex */
public class uh2 extends EdgeTreatment {
    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f2, float f3, @NonNull ShapePath shapePath) {
        shapePath.reset(f2, 0.001f, 180.0f, 0.0f);
    }
}
