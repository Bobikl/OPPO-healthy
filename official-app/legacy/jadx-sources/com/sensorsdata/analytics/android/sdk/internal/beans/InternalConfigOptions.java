package com.sensorsdata.analytics.android.sdk.internal.beans;

import android.content.Context;
import com.sensorsdata.analytics.android.sdk.SAConfigOptions;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SensorsDataGPSLocation;
import com.sensorsdata.analytics.android.sdk.SensorsDataTrackEventCallBack;

/* JADX INFO: loaded from: classes10.dex */
public class InternalConfigOptions {
    public Context context;
    public String cookie;
    public SensorsDataGPSLocation gpsLocation;
    public SAConfigOptions saConfigOptions;
    public SensorsDataTrackEventCallBack sensorsDataTrackEventCallBack;
    public boolean isMainProcess = false;
    public boolean isShowDebugView = true;
    public boolean isNetworkRequestEnable = true;
    public boolean isDefaultRemoteConfigEnable = false;
    public boolean isTrackDeviceId = false;
    public int sessionTime = 30000;
    public SensorsDataAPI.DebugMode debugMode = SensorsDataAPI.DebugMode.DEBUG_OFF;
    public boolean isRemoteConfigEnabled = false;
}
