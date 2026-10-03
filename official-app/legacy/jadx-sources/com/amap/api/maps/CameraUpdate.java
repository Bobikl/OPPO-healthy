package com.amap.api.maps;

import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage;

/* JADX INFO: loaded from: classes12.dex */
public final class CameraUpdate {
    AbstractCameraUpdateMessage a;

    public CameraUpdate(AbstractCameraUpdateMessage abstractCameraUpdateMessage) {
        this.a = abstractCameraUpdateMessage;
    }

    public final AbstractCameraUpdateMessage getCameraUpdateFactoryDelegate() {
        return this.a;
    }
}
