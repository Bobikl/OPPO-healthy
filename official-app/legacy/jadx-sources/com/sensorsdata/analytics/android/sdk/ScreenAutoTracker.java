package com.sensorsdata.analytics.android.sdk;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public interface ScreenAutoTracker {
    String getScreenUrl();

    JSONObject getTrackProperties() throws JSONException;
}
