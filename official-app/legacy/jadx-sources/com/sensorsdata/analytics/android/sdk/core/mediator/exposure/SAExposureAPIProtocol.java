package com.sensorsdata.analytics.android.sdk.core.mediator.exposure;

import android.view.View;
import com.sensorsdata.analytics.android.sdk.core.business.exposure.SAExposureData;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public interface SAExposureAPIProtocol {
    void addExposureView(View view, SAExposureData sAExposureData);

    void removeExposureView(View view);

    void removeExposureView(View view, String str);

    void setExposureIdentifier(View view, String str);

    void updateExposureProperties(View view, JSONObject jSONObject);
}
