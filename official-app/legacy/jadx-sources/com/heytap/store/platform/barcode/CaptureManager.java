package com.heytap.store.platform.barcode;

import com.heytap.store.platform.barcode.camera.CameraManager;
import com.oplus.aiunit.vision.c6a;
import com.oplus.aiunit.vision.h10;

/* JADX INFO: loaded from: classes6.dex */
public interface CaptureManager {
    h10 getAmbientLightManager();

    BeepManager getBeepManager();

    CameraManager getCameraManager();

    c6a getInactivityTimer();
}
