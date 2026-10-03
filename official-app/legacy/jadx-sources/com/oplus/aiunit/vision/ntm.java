package com.oplus.aiunit.vision;

import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.amap.api.maps.model.BaseOverlay;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ntm extends BaseOverlay {
    public com.amap.api.col.p0003sl.et b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference<IGlOverlayLayer> f14641c;

    public ntm(IGlOverlayLayer iGlOverlayLayer, com.amap.api.col.p0003sl.et etVar, String str) {
        super(str);
        this.f14641c = new WeakReference<>(iGlOverlayLayer);
        this.b = etVar;
    }
}
