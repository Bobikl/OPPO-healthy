package com.sensorsdata.analytics.android.sdk.listener;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public interface SAEventListener {
    void identify();

    void login();

    void logout();

    void resetAnonymousId();

    void trackEvent(JSONObject jSONObject);
}
