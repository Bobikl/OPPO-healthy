package com.sensorsdata.analytics.android.sdk.core.business.exposure;

import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public interface SAExposureListener {
    void didExposure(View view, SAExposureData sAExposureData);

    boolean shouldExposure(View view, SAExposureData sAExposureData);
}
