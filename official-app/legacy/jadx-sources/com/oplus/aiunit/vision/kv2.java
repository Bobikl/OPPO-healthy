package com.oplus.aiunit.vision;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kv2 implements CameraCharacteristicsProvider {
    public final /* synthetic */ CameraCharacteristicsCompat a;

    @Override // androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider
    public final Object get(CameraCharacteristics.Key key) {
        return this.a.get(key);
    }
}
