package com.sensorsdata.analytics.android.sdk;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.sensorsdata.analytics.android.sdk.core.SAContextManager;
import com.sensorsdata.analytics.android.sdk.core.business.SAPropertyManager;
import com.sensorsdata.analytics.android.sdk.core.business.exposure.SAExposureData;
import com.sensorsdata.analytics.android.sdk.core.business.timer.EventTimer;
import com.sensorsdata.analytics.android.sdk.core.business.timer.EventTimerManager;
import com.sensorsdata.analytics.android.sdk.core.event.InputData;
import com.sensorsdata.analytics.android.sdk.core.mediator.Modules;
import com.sensorsdata.analytics.android.sdk.core.mediator.SAModuleManager;
import com.sensorsdata.analytics.android.sdk.core.rpc.SensorsDataContentObserver;
import com.sensorsdata.analytics.android.sdk.core.tasks.TrackTaskManagerThread;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbAdapter;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentLoader;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentSuperProperties;
import com.sensorsdata.analytics.android.sdk.deeplink.SensorsDataDeepLinkCallback;
import com.sensorsdata.analytics.android.sdk.deeplink.SensorsDataDeferredDeepLinkCallback;
import com.sensorsdata.analytics.android.sdk.internal.beans.EventType;
import com.sensorsdata.analytics.android.sdk.internal.beans.InternalConfigOptions;
import com.sensorsdata.analytics.android.sdk.listener.SAEventListener;
import com.sensorsdata.analytics.android.sdk.listener.SAFunctionListener;
import com.sensorsdata.analytics.android.sdk.listener.SAJSListener;
import com.sensorsdata.analytics.android.sdk.monitor.TrackMonitor;
import com.sensorsdata.analytics.android.sdk.plugin.property.SAPropertyPlugin;
import com.sensorsdata.analytics.android.sdk.plugin.property.impl.SAPresetPropertyPlugin;
import com.sensorsdata.analytics.android.sdk.remote.BaseSensorsDataSDKRemoteManager;
import com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI;
import com.sensorsdata.analytics.android.sdk.useridentity.LoginIDAndKey;
import com.sensorsdata.analytics.android.sdk.util.JSONUtils;
import com.sensorsdata.analytics.android.sdk.util.SADataHelper;
import com.sensorsdata.analytics.android.sdk.util.TimeUtils;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class SensorsDataAPI extends AbstractSensorsDataAPI {
    public static String ANDROID_PLUGIN_VERSION = "4.0.1";
    static final String MIN_PLUGIN_VERSION = "3.5.2";
    static final String VERSION = "6.8.0";
    public static final int VTRACK_SUPPORTED_MIN_API = 16;

    public enum AutoTrackEventType {
        APP_START(1),
        APP_END(2),
        APP_CLICK(4),
        APP_VIEW_SCREEN(8);

        public final int eventValue;

        AutoTrackEventType(int i) {
            this.eventValue = i;
        }

        public static String autoTrackEventName(int i) {
            if (i == 1) {
                return "$AppStart";
            }
            if (i == 2) {
                return "$AppEnd";
            }
            if (i != 4) {
                return i != 8 ? "" : "$AppViewScreen";
            }
            return "$AppClick";
        }

        public int getEventValue() {
            return this.eventValue;
        }
    }

    public enum DebugMode {
        DEBUG_OFF(false, false),
        DEBUG_ONLY(true, false),
        DEBUG_AND_TRACK(true, true);

        private final boolean debugMode;
        private final boolean debugWriteData;

        DebugMode(boolean z, boolean z2) {
            this.debugMode = z;
            this.debugWriteData = z2;
        }

        public boolean isDebugMode() {
            return this.debugMode;
        }

        public boolean isDebugWriteData() {
            return this.debugWriteData;
        }
    }

    public final class NetworkType {
        public static final int TYPE_2G = 1;
        public static final int TYPE_3G = 2;
        public static final int TYPE_4G = 4;
        public static final int TYPE_5G = 16;
        public static final int TYPE_ALL = 255;
        public static final int TYPE_NONE = 0;
        public static final int TYPE_WIFI = 8;

        public NetworkType() {
        }
    }

    public SensorsDataAPI() {
    }

    public static void disableSDK() {
        SALog.i("SA.SensorsDataAPI", "call static function disableSDK");
        try {
            SensorsDataAPI sDKInstance = getSDKInstance();
            if (!(sDKInstance instanceof SensorsDataAPIEmptyImplementation) && AbstractSensorsDataAPI.getConfigOptions() != null) {
                SensorsDataContentObserver.State state = SensorsDataContentObserver.State.DISABLE_SDK;
                if (!state.isObserverCalled) {
                    sDKInstance.track("$AppDataTrackingClose");
                    sDKInstance.flush();
                }
                sDKInstance.unregisterNetworkListener(sDKInstance.getSAContextManager().getContext());
                sDKInstance.clearTrackTimer();
                SAModuleManager.getInstance().setModuleState(false);
                DbAdapter.getInstance().commitAppStartTime(0L);
                AbstractSensorsDataAPI.getConfigOptions().disableSDK(true);
                SALog.setDisableSDK(true);
                if (!state.isObserverCalled) {
                    sDKInstance.getSAContextManager().getContext().getContentResolver().notifyChange(DbParams.getInstance().getDisableSDKUri(), null);
                }
                state.isObserverCalled = false;
                state.isDid = true;
                SensorsDataContentObserver.State.ENABLE_SDK.isDid = false;
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public static void enableSDK() {
        SALog.i("SA.SensorsDataAPI", "call static function enableSDK");
        try {
            SensorsDataAPI sDKInstance = getSDKInstance();
            if (!(sDKInstance instanceof SensorsDataAPIEmptyImplementation) && AbstractSensorsDataAPI.getConfigOptions() != null) {
                AbstractSensorsDataAPI.getConfigOptions().disableSDK(false);
                SAModuleManager.getInstance().setModuleState(true);
                try {
                    SALog.setDisableSDK(false);
                    sDKInstance.enableLog(SALog.isLogEnabled());
                    SALog.i("SA.SensorsDataAPI", "enableSDK, enable log");
                    if (PersistentLoader.getInstance().getFirstDayPst().get() == null) {
                        PersistentLoader.getInstance().getFirstDayPst().commit(TimeUtils.formatTime(System.currentTimeMillis(), "yyyy-MM-dd"));
                    }
                    sDKInstance.mSAContextManager.getRemoteManager().pullSDKConfigFromServer();
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                }
                SensorsDataContentObserver.State state = SensorsDataContentObserver.State.ENABLE_SDK;
                if (!state.isObserverCalled) {
                    sDKInstance.getSAContextManager().getContext().getContentResolver().notifyChange(DbParams.getInstance().getEnableSDKUri(), null);
                }
                state.isObserverCalled = false;
                state.isDid = true;
                SensorsDataContentObserver.State.DISABLE_SDK.isDid = false;
            }
        } catch (Exception e3) {
            SALog.printStackTrace(e3);
        }
    }

    private static synchronized SensorsDataAPI getInstance(Context context, DebugMode debugMode, SAConfigOptions sAConfigOptions) {
        try {
            if (context == null) {
                return new SensorsDataAPIEmptyImplementation();
            }
            Context applicationContext = context.getApplicationContext();
            Map<Context, SensorsDataAPI> map = AbstractSensorsDataAPI.sInstanceMap;
            SensorsDataAPI sensorsDataAPI = map.get(applicationContext);
            if (sensorsDataAPI == null) {
                sensorsDataAPI = new SensorsDataAPI(context, sAConfigOptions, debugMode);
                map.put(applicationContext, sensorsDataAPI);
            }
            return sensorsDataAPI;
        } catch (Throwable th) {
            throw th;
        }
    }

    private static SensorsDataAPI getSDKInstance() {
        Map<Context, SensorsDataAPI> map = AbstractSensorsDataAPI.sInstanceMap;
        if (map.size() > 0) {
            Iterator<SensorsDataAPI> it = map.values().iterator();
            if (it.hasNext()) {
                return it.next();
            }
        }
        return new SensorsDataAPIEmptyImplementation();
    }

    public static SensorsDataAPI sharedInstance(Context context) {
        try {
            if (AbstractSensorsDataAPI.isSDKDisabled()) {
                return new SensorsDataAPIEmptyImplementation();
            }
            if (context == null) {
                return new SensorsDataAPIEmptyImplementation();
            }
            SensorsDataAPI sensorsDataAPI = AbstractSensorsDataAPI.sInstanceMap.get(context.getApplicationContext());
            if (sensorsDataAPI != null) {
                return sensorsDataAPI;
            }
            SALog.i("SA.SensorsDataAPI", "The static method sharedInstance(context, serverURL, debugMode) should be called before calling sharedInstance()");
            return new SensorsDataAPIEmptyImplementation();
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return new SensorsDataAPIEmptyImplementation();
        }
    }

    public static void startWithConfigOptions(Context context, SAConfigOptions sAConfigOptions) {
        try {
            if (context == null || sAConfigOptions == null) {
                throw new NullPointerException("Context、SAConfigOptions can not be null");
            }
            SensorsDataAPI sensorsDataAPI = getInstance(context, DebugMode.DEBUG_OFF, sAConfigOptions);
            if (sensorsDataAPI.mSDKConfigInit) {
                return;
            }
            sensorsDataAPI.applySAConfigOptions();
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ void addEventListener(SAEventListener sAEventListener) {
        super.addEventListener(sAEventListener);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.exposure.SAExposureAPIProtocol
    public void addExposureView(View view, SAExposureData sAExposureData) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.Exposure.MODULE_NAME, Modules.Exposure.METHOD_ADD_EXPOSURE_VIEW, view, sAExposureData);
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ void addFunctionListener(SAFunctionListener sAFunctionListener) {
        super.addFunctionListener(sAFunctionListener);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void addHeatMapActivities(List<Class<?>> list) {
        if (list != null) {
            try {
                if (list.size() == 0) {
                    return;
                }
                for (Class<?> cls : list) {
                    if (cls != null) {
                        int iHashCode = cls.hashCode();
                        if (this.mHeatMapActivities.contains(Integer.valueOf(iHashCode))) {
                            continue;
                        } else {
                            this.mHeatMapActivities.add(Integer.valueOf(iHashCode));
                        }
                    }
                }
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void addHeatMapActivity(Class<?> cls) {
        if (cls == null) {
            return;
        }
        try {
            this.mHeatMapActivities.add(Integer.valueOf(cls.hashCode()));
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ void addSAJSListener(SAJSListener sAJSListener) {
        super.addSAJSListener(sAJSListener);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void addVisualizedAutoTrackActivities(List<Class<?>> list) {
        if (list != null) {
            try {
                if (list.size() == 0) {
                    return;
                }
                for (Class<?> cls : list) {
                    if (cls != null) {
                        int iHashCode = cls.hashCode();
                        if (this.mVisualizedAutoTrackActivities.contains(Integer.valueOf(iHashCode))) {
                            continue;
                        } else {
                            this.mVisualizedAutoTrackActivities.add(Integer.valueOf(iHashCode));
                        }
                    }
                }
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void addVisualizedAutoTrackActivity(Class<?> cls) {
        if (cls == null) {
            return;
        }
        try {
            this.mVisualizedAutoTrackActivities.add(Integer.valueOf(cls.hashCode()));
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public void bind(final String str, final String str2) {
        try {
            this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (SensorsDataAPI.this.mSAContextManager.getUserIdentityAPI().bindBack(str, str2)) {
                            SensorsDataAPI.this.mSAContextManager.trackEvent(new InputData().setEventName(IUserIdentityAPI.BIND_ID).setEventType(EventType.TRACK_ID_BIND));
                        }
                    } catch (Exception e2) {
                        SALog.printStackTrace(e2);
                    }
                }
            });
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void clearGPSLocation() {
        try {
            this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.2
                @Override // java.lang.Runnable
                public void run() {
                    SensorsDataAPI.this.mInternalConfigs.gpsLocation = null;
                }
            });
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public void clearLastScreenUrl() {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_CLEAR_LAST_SCREENURL, new Object[0]);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public void clearReferrerWhenAppEnd() {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_CLEAR_REFERRER_WHEN_APPEND, new Object[0]);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void clearSuperProperties() {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.23
            @Override // java.lang.Runnable
            public void run() {
                PersistentLoader.getInstance().getSuperPropertiesPst().commit(new JSONObject());
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void clearTrackTimer() {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.16
            @Override // java.lang.Runnable
            public void run() {
                EventTimerManager.getInstance().clearTimers();
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void deleteAll() {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.20
            @Override // java.lang.Runnable
            public void run() {
                SensorsDataAPI.this.mSAContextManager.getAnalyticsMessages().deleteAll();
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public void disableAutoTrack(List<AutoTrackEventType> list) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_DISABLE_AUTO_TRACK, list);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public void enableAutoTrack(List<AutoTrackEventType> list) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_ENABLE_AUTO_TRACK, list);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.IFragmentAPI
    public void enableAutoTrackFragment(Class<?> cls) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_ENABLE_AUTOTRACK_FRAGMENT, cls);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.IFragmentAPI
    public void enableAutoTrackFragments(List<Class<?>> list) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_ENABLE_AUTOTRACK_FRAGMENTS, list);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI, com.sensorsdata.analytics.android.sdk.core.mediator.advert.SAAdvertAPIProtocol
    public void enableDeepLinkInstallSource(boolean z) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.Advert.MODULE_NAME, Modules.Advert.METHOD_ENABLE_DEEPLINK_INSTALL_SOURCE, Boolean.valueOf(z));
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void enableLog(boolean z) {
        SALog.setEnableLog(z);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void enableNetworkRequest(boolean z) {
        this.mInternalConfigs.isNetworkRequestEnable = z;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void enableRemoteConfig(boolean z) {
        try {
            SAContextManager sAContextManager = this.mSAContextManager;
            if (sAContextManager != null) {
                this.mInternalConfigs.isRemoteConfigEnabled = z;
                if (sAContextManager.getRemoteManager() != null) {
                    this.mSAContextManager.getRemoteManager().pullSDKConfigFromServer();
                }
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void enableTrackScreenOrientation(boolean z) {
        try {
            if (z) {
                if (this.mSAContextManager.getOrientationDetector() == null) {
                    this.mSAContextManager.setOrientationDetector(new SensorsDataScreenOrientationDetector(this.mInternalConfigs.context, 3));
                }
                this.mSAContextManager.getOrientationDetector().enable();
                this.mSAContextManager.getOrientationDetector().setState(true);
                return;
            }
            if (this.mSAContextManager.getOrientationDetector() != null) {
                this.mSAContextManager.getOrientationDetector().disable();
                this.mSAContextManager.getOrientationDetector().setState(false);
                this.mSAContextManager.setOrientationDetector(null);
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void flush() {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.17
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SensorsDataAPI.this.mSAContextManager.getAnalyticsMessages().flush();
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void flushScheduled() {
        try {
            this.mSAContextManager.getAnalyticsMessages().flushScheduled();
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void flushSync() {
        flush();
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI, com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public String getAnonymousId() {
        try {
            return this.mSAContextManager.getUserIdentityAPI().getAnonymousId();
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return "";
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public String getCookie(boolean z) {
        try {
            return z ? URLDecoder.decode(this.mInternalConfigs.cookie, "UTF-8") : this.mInternalConfigs.cookie;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ DebugMode getDebugMode() {
        return super.getDebugMode();
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI, com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public String getDistinctId() {
        try {
            return this.mSAContextManager.getUserIdentityAPI().getDistinctId();
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return "";
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ JSONObject getDynamicProperty() {
        return super.getDynamicProperty();
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public int getFlushBulkSize() {
        return AbstractSensorsDataAPI.mSAConfigOptions.mFlushBulkSize;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public int getFlushInterval() {
        return AbstractSensorsDataAPI.mSAConfigOptions.mFlushInterval;
    }

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public JSONObject getIdentities() {
        try {
            JSONObject identities = this.mSAContextManager.getUserIdentityAPI().getIdentities();
            if (identities != null) {
                return new JSONObject(identities.toString());
            }
            return null;
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public List<Class<?>> getIgnoredViewTypeList() {
        try {
            return (List) SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_GET_IGNORED_VIEW_TYPE_LIST, new Object[0]);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public JSONObject getLastScreenTrackProperties() {
        return (JSONObject) SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_GET_LAST_SCREEN_TRACK_PROPERTIES, new Object[0]);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public String getLastScreenUrl() {
        return (String) SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_GET_LAST_SCREENURL, new Object[0]);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI, com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public String getLoginId() {
        try {
            return this.mSAContextManager.getUserIdentityAPI().getLoginId();
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return "";
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public long getMaxCacheSize() {
        return AbstractSensorsDataAPI.mSAConfigOptions.mMaxCacheSize;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public JSONObject getPresetProperties() {
        JSONObject jSONObject = new JSONObject();
        try {
            SAPropertyPlugin propertyPlugin = this.mSAContextManager.getPluginManager().getPropertyPlugin(SAPresetPropertyPlugin.class.getName());
            if (propertyPlugin instanceof SAPresetPropertyPlugin) {
                jSONObject = ((SAPresetPropertyPlugin) propertyPlugin).getPresetProperties();
            }
            jSONObject.put("$is_first_day", getSAContextManager().isFirstDay(System.currentTimeMillis()));
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
        return jSONObject;
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ SAContextManager getSAContextManager() {
        return super.getSAContextManager();
    }

    public String getSDKVersion() {
        return "6.8.0";
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public String getScreenOrientation() {
        try {
            if (this.mSAContextManager.getOrientationDetector() != null) {
                return this.mSAContextManager.getOrientationDetector().getOrientation();
            }
            return null;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public String getServerUrl() {
        return this.mServerUrl;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public int getSessionIntervalTime() {
        return this.mInternalConfigs.sessionTime;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public JSONObject getSuperProperties() {
        JSONObject jSONObject;
        synchronized (PersistentSuperProperties.class) {
            try {
                try {
                    jSONObject = new JSONObject(JSONUtils.cloneJsonObject(PersistentLoader.getInstance().getSuperPropertiesPst().get()).toString());
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                    return new JSONObject();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI, com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public void identify(final String str) {
        try {
            SADataHelper.assertDistinctId(str);
            this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        SensorsDataAPI.this.mSAContextManager.getUserIdentityAPI().identify(str);
                    } catch (Exception e2) {
                        SALog.printStackTrace(e2);
                    }
                }
            });
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public void ignoreAutoTrackActivities(List<Class<?>> list) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_IGNORE_AUTOTRACK_ACTIVITIES, list);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public void ignoreAutoTrackActivity(Class<?> cls) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_IGNORE_AUTOTRACK_ACTIVITY, cls);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.IFragmentAPI
    public void ignoreAutoTrackFragment(Class<?> cls) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_IGNORE_AUTOTRACK_FRAGMENT, cls);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.IFragmentAPI
    public void ignoreAutoTrackFragments(List<Class<?>> list) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_IGNORE_AUTOTRACK_FRAGMENTS, list);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public void ignoreView(View view) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_IGNORE_VIEW, view);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public void ignoreViewType(Class<?> cls) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_IGNORE_VIEW_TYPE, cls);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public boolean isActivityAutoTrackAppClickIgnored(Class<?> cls) {
        Boolean bool = (Boolean) SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_IS_ACTIVITY_AUTOTRACK_APPCLICK_IGNORED, cls);
        return bool != null && bool.booleanValue();
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public boolean isActivityAutoTrackAppViewScreenIgnored(Class<?> cls) {
        Boolean bool = (Boolean) SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_IS_ACTIVITY_AUTOTRACK_APPVIEWSCREEN_IGNORED, cls);
        return bool != null && bool.booleanValue();
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public boolean isAutoTrackEnabled() {
        Boolean bool;
        try {
            return (AbstractSensorsDataAPI.isSDKDisabled() || (bool = (Boolean) SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_IS_AUTOTRACK_ENABLED, new Object[0])) == null || !bool.booleanValue()) ? false : true;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return false;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public boolean isAutoTrackEventTypeIgnored(AutoTrackEventType autoTrackEventType) {
        Boolean bool = (Boolean) SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_IS_AUTOTRACK_EVENT_TYPE_IGNORED, autoTrackEventType);
        return bool != null && bool.booleanValue();
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public boolean isDebugMode() {
        return this.mInternalConfigs.debugMode.isDebugMode();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ boolean isDisableDefaultRemoteConfig() {
        return super.isDisableDefaultRemoteConfig();
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.IFragmentAPI
    public boolean isFragmentAutoTrackAppViewScreen(Class<?> cls) {
        Boolean bool = (Boolean) SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_IS_FRAGMENT_AUTOTRACK_APPVIEWSCREEN, cls);
        return bool != null && bool.booleanValue();
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public boolean isHeatMapActivity(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        try {
            return this.mHeatMapActivities.size() == 0 || this.mHeatMapActivities.contains(Integer.valueOf(cls.hashCode()));
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public boolean isHeatMapEnabled() {
        return AbstractSensorsDataAPI.mSAConfigOptions.mHeatMapEnabled;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public boolean isNetworkRequestEnable() {
        return this.mInternalConfigs.isNetworkRequestEnable;
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.IFragmentAPI
    public boolean isTrackFragmentAppViewScreenEnabled() {
        Boolean bool = (Boolean) SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_IS_TRACK_FRAGMENT_APPVIEWSCREEN_ENABLED, new Object[0]);
        return bool != null && bool.booleanValue();
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public boolean isVisualizedAutoTrackActivity(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        try {
            return this.mVisualizedAutoTrackActivities.size() == 0 || this.mVisualizedAutoTrackActivities.contains(Integer.valueOf(cls.hashCode()));
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public boolean isVisualizedAutoTrackEnabled() {
        SAConfigOptions sAConfigOptions = AbstractSensorsDataAPI.mSAConfigOptions;
        return sAConfigOptions.mVisualizedEnabled || sAConfigOptions.mVisualizedPropertiesEnabled;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void itemDelete(final String str, final String str2) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.38
            @Override // java.lang.Runnable
            public void run() {
                SensorsDataAPI.this.mSAContextManager.trackEvent(new InputData().setItemId(str2).setItemType(str).setEventType(EventType.ITEM_DELETE));
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void itemSet(final String str, final String str2, JSONObject jSONObject) {
        try {
            final JSONObject jSONObjectCloneJsonObject = JSONUtils.cloneJsonObject(jSONObject);
            this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.37
                @Override // java.lang.Runnable
                public void run() {
                    SensorsDataAPI.this.mSAContextManager.trackEvent(new InputData().setItemId(str2).setItemType(str).setEventType(EventType.ITEM_SET).setProperties(jSONObjectCloneJsonObject));
                }
            });
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI, com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public void login(String str) {
        login(str, null);
    }

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public void loginWithKey(String str, String str2) {
        loginWithKey(str, str2, null);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI, com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public void logout() {
        synchronized (this.mLoginIdLock) {
            this.mSAContextManager.getUserIdentityAPI().updateLoginId(null, null);
            this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.6
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        SensorsDataAPI.this.mSAContextManager.getUserIdentityAPI().logout();
                    } catch (Exception e2) {
                        SALog.printStackTrace(e2);
                    }
                }
            });
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void profileAppend(final String str, final String str2) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.30
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(str2);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str, jSONArray);
                    SensorsDataAPI.this.mSAContextManager.trackEvent(new InputData().setEventType(EventType.PROFILE_APPEND).setProperties(jSONObject));
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void profileDelete() {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.33
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SensorsDataAPI.this.mSAContextManager.trackEvent(new InputData().setEventType(EventType.PROFILE_DELETE));
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void profileIncrement(final Map<String, ? extends Number> map) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.28
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SensorsDataAPI.this.mSAContextManager.trackEvent(new InputData().setEventType(EventType.PROFILE_INCREMENT).setProperties(new JSONObject(map)));
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void profilePushId(final String str, final String str2) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.35
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (SADataHelper.assertPropertyKey(str)) {
                        String str3 = SensorsDataAPI.this.getDistinctId() + str2;
                        if (TextUtils.equals(DbAdapter.getInstance().getPushId("distinctId_" + str), str3)) {
                            return;
                        }
                        SensorsDataAPI.this.profileSet(str, str2);
                        DbAdapter.getInstance().commitPushID("distinctId_" + str, str3);
                    }
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void profileSet(JSONObject jSONObject) {
        try {
            final JSONObject jSONObjectCloneJsonObject = JSONUtils.cloneJsonObject(jSONObject);
            this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.24
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        SensorsDataAPI.this.mSAContextManager.trackEvent(new InputData().setEventType(EventType.PROFILE_SET).setProperties(jSONObjectCloneJsonObject));
                    } catch (Exception e2) {
                        SALog.printStackTrace(e2);
                    }
                }
            });
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void profileSetOnce(JSONObject jSONObject) {
        try {
            final JSONObject jSONObjectCloneJsonObject = JSONUtils.cloneJsonObject(jSONObject);
            this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.26
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        SensorsDataAPI.this.mSAContextManager.trackEvent(new InputData().setEventType(EventType.PROFILE_SET_ONCE).setProperties(jSONObjectCloneJsonObject));
                    } catch (Exception e2) {
                        SALog.printStackTrace(e2);
                    }
                }
            });
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void profileUnset(final String str) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.32
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SensorsDataAPI.this.mSAContextManager.trackEvent(new InputData().setEventType(EventType.PROFILE_UNSET).setProperties(new JSONObject().put(str, true)));
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void profileUnsetPushId(final String str) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.36
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (SADataHelper.assertPropertyKey(str)) {
                        String distinctId = SensorsDataAPI.this.getDistinctId();
                        String str2 = "distinctId_" + str;
                        String pushId = DbAdapter.getInstance().getPushId(str2);
                        if (TextUtils.isEmpty(pushId) || !pushId.startsWith(distinctId)) {
                            return;
                        }
                        SensorsDataAPI.this.profileUnset(str);
                        DbAdapter.getInstance().removePushId(str2);
                    }
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void registerDynamicSuperProperties(SensorsDataDynamicSuperProperties sensorsDataDynamicSuperProperties) {
        this.mDynamicSuperPropertiesCallBack = sensorsDataDynamicSuperProperties;
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void registerLimitKeys(Map<String, String> map) {
        SAPropertyManager.getInstance().registerLimitKeys(map);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void registerPropertyPlugin(final SAPropertyPlugin sAPropertyPlugin) {
        if (sAPropertyPlugin != null) {
            this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.18
                @Override // java.lang.Runnable
                public void run() {
                    SensorsDataAPI.this.mSAContextManager.getPluginManager().registerPropertyPlugin(sAPropertyPlugin);
                }
            });
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void registerSuperProperties(JSONObject jSONObject) {
        try {
            final JSONObject jSONObjectCloneJsonObject = JSONUtils.cloneJsonObject(jSONObject);
            this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.21
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (jSONObjectCloneJsonObject == null) {
                            return;
                        }
                        PersistentLoader.getInstance().getSuperPropertiesPst().commit(JSONUtils.mergeSuperJSONObject(jSONObjectCloneJsonObject, JSONUtils.cloneJsonObject(PersistentLoader.getInstance().getSuperPropertiesPst().get())));
                    } catch (Exception e2) {
                        SALog.printStackTrace(e2);
                    }
                }
            });
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ void removeEventListener(SAEventListener sAEventListener) {
        super.removeEventListener(sAEventListener);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.exposure.SAExposureAPIProtocol
    public void removeExposureView(View view, String str) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.Exposure.MODULE_NAME, Modules.Exposure.METHOD_REMOVE_EXPOSURE_VIEW, view, str);
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ void removeFunctionListener(SAFunctionListener sAFunctionListener) {
        super.removeFunctionListener(sAFunctionListener);
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ void removeSAJSListener(SAJSListener sAJSListener) {
        super.removeSAJSListener(sAJSListener);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void removeTimer(final String str) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.12
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SADataHelper.assertEventName(str);
                    EventTimerManager.getInstance().removeTimer(str);
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.advert.SAAdvertAPIProtocol
    public void requestDeferredDeepLink(JSONObject jSONObject) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.Advert.MODULE_NAME, Modules.Advert.METHOD_REQUEST_DEFERRED_DEEPLINK, jSONObject);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI, com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public void resetAnonymousId() {
        try {
            this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.3
                @Override // java.lang.Runnable
                public void run() {
                    SensorsDataAPI.this.mSAContextManager.getUserIdentityAPI().resetAnonymousId();
                }
            });
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public void resetAnonymousIdentity(final String str) {
        TrackTaskManager trackTaskManager = this.mTrackTaskManager;
        if (trackTaskManager != null) {
            trackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.9
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        SensorsDataAPI.this.mSAContextManager.getUserIdentityAPI().resetAnonymousIdentity(str);
                    } catch (Exception e2) {
                        SALog.printStackTrace(e2);
                    }
                }
            });
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public void resumeAutoTrackActivities(List<Class<?>> list) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_RESUME_AUTOTRACK_ACTIVITIES, list);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public void resumeAutoTrackActivity(Class<?> cls) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_RESUME_AUTOTRACK_ACTIVITY, cls);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.IFragmentAPI
    public void resumeIgnoredAutoTrackFragment(Class<?> cls) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_RESUME_IGNORED_AUTOTRACK_FRAGMENT, cls);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.IFragmentAPI
    public void resumeIgnoredAutoTrackFragments(List<Class<?>> list) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_RESUME_IGNORED_AUTOTRACK_FRAGMENTS, list);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void resumeTrackScreenOrientation() {
        try {
            if (this.mSAContextManager.getOrientationDetector() != null) {
                this.mSAContextManager.getOrientationDetector().enable();
                this.mSAContextManager.getOrientationDetector().setState(true);
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setCookie(String str, boolean z) {
        try {
            if (z) {
                this.mInternalConfigs.cookie = URLEncoder.encode(str, "UTF-8");
            } else {
                this.mInternalConfigs.cookie = str;
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI
    public /* bridge */ /* synthetic */ void setDebugMode(DebugMode debugMode) {
        super.setDebugMode(debugMode);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.advert.SAAdvertAPIProtocol
    @Deprecated
    public void setDeepLinkCallback(SensorsDataDeepLinkCallback sensorsDataDeepLinkCallback) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.Advert.MODULE_NAME, Modules.Advert.METHOD_SET_DEEPLINK_CALLBACK, sensorsDataDeepLinkCallback);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.advert.SAAdvertAPIProtocol
    public void setDeepLinkCompletion(SensorsDataDeferredDeepLinkCallback sensorsDataDeferredDeepLinkCallback) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.Advert.MODULE_NAME, Modules.Advert.METHOD_SET_DEEPLINK_COMPLETION, sensorsDataDeferredDeepLinkCallback);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.exposure.SAExposureAPIProtocol
    public void setExposureIdentifier(View view, String str) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.Exposure.MODULE_NAME, Modules.Exposure.METHOD_SET_EXPOSURE_IDENTIFIER, view, str);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setFlushBulkSize(int i) {
        if (i < 0) {
            SALog.i("SA.SensorsDataAPI", "The value of flushBulkSize is invalid");
        }
        AbstractSensorsDataAPI.mSAConfigOptions.setFlushBulkSize(i);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setFlushInterval(int i) {
        AbstractSensorsDataAPI.mSAConfigOptions.setFlushInterval(i);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setFlushNetworkPolicy(int i) {
        AbstractSensorsDataAPI.mSAConfigOptions.setNetworkTypePolicy(i);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setGPSLocation(double d, double d2) {
        setGPSLocation(d, d2, null);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setMaxCacheSize(long j2) {
        AbstractSensorsDataAPI.mSAConfigOptions.setMaxCacheSize(j2);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setServerUrl(String str) {
        setServerUrl(str, false);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setSessionIntervalTime(int i) {
        if (DbAdapter.getInstance() == null) {
            SALog.i("SA.SensorsDataAPI", "The static method sharedInstance(context, serverURL, debugMode) should be called before calling sharedInstance()");
            return;
        }
        if (i < 10000 || i > 300000) {
            SALog.i("SA.SensorsDataAPI", "SessionIntervalTime:" + i + " is invalid, session interval time is between 10s and 300s.");
            return;
        }
        InternalConfigOptions internalConfigOptions = this.mInternalConfigs;
        if (i != internalConfigOptions.sessionTime) {
            internalConfigOptions.sessionTime = i;
            DbAdapter.getInstance().commitSessionIntervalTime(i);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setTrackEventCallBack(SensorsDataTrackEventCallBack sensorsDataTrackEventCallBack) {
        this.mInternalConfigs.sensorsDataTrackEventCallBack = sensorsDataTrackEventCallBack;
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public void setViewActivity(View view, Activity activity) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_SET_VIEW_ACTIVITY, view, activity);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public void setViewFragmentName(View view, String str) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_SET_VIEW_FRAGMENT_NAME, view, str);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public void setViewID(View view, String str) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_SET_VIEW_ID, view, str);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public void setViewProperties(View view, JSONObject jSONObject) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_SET_VIEW_PROPERTIES, view, jSONObject);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void showUpWebView(WebView webView, boolean z) {
        showUpWebView(webView, z, (JSONObject) null);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    @Deprecated
    public void showUpX5WebView(Object obj, JSONObject jSONObject, boolean z, boolean z2) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.WebView.MODULE_NAME, Modules.WebView.METHOD_SHOWUP_X5WEBVIEW, obj, jSONObject, Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void startTrackThread() {
        TrackTaskManagerThread trackTaskManagerThread = this.mTrackTaskManagerThread;
        if (trackTaskManagerThread == null || trackTaskManagerThread.isStopped()) {
            this.mTrackTaskManagerThread = new TrackTaskManagerThread();
            new Thread(this.mTrackTaskManagerThread).start();
            SALog.i("SA.SensorsDataAPI", "Data collection thread has been started");
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void stopTrackScreenOrientation() {
        try {
            if (this.mSAContextManager.getOrientationDetector() != null) {
                this.mSAContextManager.getOrientationDetector().disable();
                this.mSAContextManager.getOrientationDetector().setState(false);
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void stopTrackThread() {
        TrackTaskManagerThread trackTaskManagerThread = this.mTrackTaskManagerThread;
        if (trackTaskManagerThread == null || trackTaskManagerThread.isStopped()) {
            return;
        }
        this.mTrackTaskManagerThread.stop();
        SALog.i("SA.SensorsDataAPI", "Data collection thread has been stopped");
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void track(final String str, JSONObject jSONObject) {
        try {
            final JSONObject jSONObjectCloneJsonObject = JSONUtils.cloneJsonObject(jSONObject);
            JSONUtils.mergeDistinctProperty(JSONUtils.cloneJsonObject(getDynamicProperty()), jSONObjectCloneJsonObject);
            this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.10
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        JSONObject jSONObject2 = (JSONObject) SAModuleManager.getInstance().invokeModuleFunction(Modules.Advert.MODULE_NAME, Modules.Advert.METHOD_MERGE_CHANNEL_EVENT_PROPERTIES, str, jSONObjectCloneJsonObject);
                        if (jSONObject2 == null) {
                            jSONObject2 = jSONObjectCloneJsonObject;
                        }
                        SensorsDataAPI.this.mSAContextManager.trackEvent(new InputData().setEventName(str).setEventType(EventType.TRACK).setProperties(jSONObject2));
                    } catch (Exception e2) {
                        SALog.printStackTrace(e2);
                    }
                }
            });
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.advert.SAAdvertAPIProtocol
    public void trackAppInstall(JSONObject jSONObject, boolean z) {
        trackInstallation("$AppInstall", jSONObject, z);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.advert.SAAdvertAPIProtocol
    public void trackChannelEvent(String str) {
        trackChannelEvent(str, null);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI, com.sensorsdata.analytics.android.sdk.core.mediator.advert.SAAdvertAPIProtocol
    public void trackDeepLinkLaunch(String str) {
        trackDeepLinkLaunch(str, null);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.IFragmentAPI
    public void trackFragmentAppViewScreen() {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_TRACK_FRAGMENT_APPVIEWSCREEN, new Object[0]);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.advert.SAAdvertAPIProtocol
    public void trackInstallation(String str, JSONObject jSONObject, boolean z) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.Advert.MODULE_NAME, Modules.Advert.METHOD_TRACK_INSTALLATION, str, jSONObject, Boolean.valueOf(z));
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    @Deprecated
    public void trackTimer(final String str, final TimeUnit timeUnit) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.11
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SADataHelper.assertEventName(str);
                    EventTimerManager.getInstance().addEventTimer(str, new EventTimer(timeUnit, jElapsedRealtime));
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void trackTimerEnd(final String str, JSONObject jSONObject) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            final JSONObject jSONObjectCloneJsonObject = JSONUtils.cloneJsonObject(jSONObject);
            this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.15
                @Override // java.lang.Runnable
                public void run() {
                    if (str != null) {
                        EventTimerManager.getInstance().updateEndTime(str, jElapsedRealtime);
                    }
                    try {
                        JSONObject jSONObject2 = (JSONObject) SAModuleManager.getInstance().invokeModuleFunction(Modules.Advert.MODULE_NAME, Modules.Advert.METHOD_MERGE_CHANNEL_EVENT_PROPERTIES, str, jSONObjectCloneJsonObject);
                        if (jSONObject2 == null) {
                            jSONObject2 = jSONObjectCloneJsonObject;
                        }
                        SensorsDataAPI.this.mSAContextManager.trackEvent(new InputData().setEventName(str).setEventType(EventType.TRACK).setProperties(jSONObject2));
                    } catch (Exception e2) {
                        SALog.printStackTrace(e2);
                    }
                }
            });
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void trackTimerPause(final String str) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.13
            @Override // java.lang.Runnable
            public void run() {
                EventTimerManager.getInstance().updateTimerState(str, jElapsedRealtime, true);
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void trackTimerResume(final String str) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.14
            @Override // java.lang.Runnable
            public void run() {
                EventTimerManager.getInstance().updateTimerState(str, jElapsedRealtime, false);
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public String trackTimerStart(String str) {
        try {
            String str2 = String.format("%s_%s_%s", str, UUID.randomUUID().toString().replace("-", "_"), "SATimer");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            trackTimer(str2, timeUnit);
            trackTimer(str, timeUnit);
            return str2;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return "";
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public void trackViewAppClick(View view) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_TRACK_VIEW_APPCLICK, view);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    @Deprecated
    public void trackViewScreen(String str, JSONObject jSONObject) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_TRACK_VIEW_SCREEN, str, jSONObject);
    }

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public void unbind(final String str, final String str2) {
        try {
            this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.8
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (SensorsDataAPI.this.mSAContextManager.getUserIdentityAPI().unbindBack(str, str2)) {
                            SensorsDataAPI.this.mSAContextManager.trackEvent(new InputData().setEventName(IUserIdentityAPI.UNBIND_ID).setEventType(EventType.TRACK_ID_UNBIND));
                        }
                    } catch (Exception e2) {
                        SALog.printStackTrace(e2);
                    }
                }
            });
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void unregisterPropertyPlugin(final SAPropertyPlugin sAPropertyPlugin) {
        if (sAPropertyPlugin != null) {
            this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.19
                @Override // java.lang.Runnable
                public void run() {
                    SensorsDataAPI.this.mSAContextManager.getPluginManager().unregisterPropertyPlugin(sAPropertyPlugin);
                }
            });
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void unregisterSuperProperty(final String str) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.22
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObjectCloneJsonObject = JSONUtils.cloneJsonObject(PersistentLoader.getInstance().getSuperPropertiesPst().get());
                    jSONObjectCloneJsonObject.remove(str);
                    PersistentLoader.getInstance().getSuperPropertiesPst().commit(jSONObjectCloneJsonObject);
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.exposure.SAExposureAPIProtocol
    public void updateExposureProperties(View view, JSONObject jSONObject) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.Exposure.MODULE_NAME, Modules.Exposure.METHOD_UPDATE_EXPOSURE_PROPERTIES, view, jSONObject);
    }

    public SensorsDataAPI(Context context, SAConfigOptions sAConfigOptions, DebugMode debugMode) {
        super(context, sAConfigOptions, debugMode);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public void disableAutoTrack(AutoTrackEventType autoTrackEventType) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_DISABLE_AUTO_TRACK, autoTrackEventType);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public void ignoreView(View view, boolean z) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_IGNORE_VIEW, view, Boolean.valueOf(z));
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI, com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public void login(String str, JSONObject jSONObject) {
        loginWithKey(LoginIDAndKey.LOGIN_ID_KEY_DEFAULT, str, jSONObject);
    }

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public void loginWithKey(final String str, final String str2, JSONObject jSONObject) {
        try {
            SensorsDataContentObserver.State.LOGIN.isDid = true;
            SensorsDataContentObserver.State.LOGOUT.isDid = false;
            synchronized (this.mLoginIdLock) {
                final JSONObject jSONObjectCloneJsonObject = JSONUtils.cloneJsonObject(jSONObject);
                if (!LoginIDAndKey.isInValidLogin(str, str2, this.mSAContextManager.getUserIdentityAPI().getIdentitiesInstance().getLoginIDKey(), this.mSAContextManager.getUserIdentityAPI().getIdentitiesInstance().getLoginId(), getAnonymousId())) {
                    this.mSAContextManager.getUserIdentityAPI().updateLoginId(str, str2);
                }
                this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.5
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (SensorsDataAPI.this.mSAContextManager.getUserIdentityAPI().loginWithKeyBack(str, str2)) {
                                SensorsDataAPI.this.mSAContextManager.trackEvent(new InputData().setEventName("$SignUp").setEventType(EventType.TRACK_SIGNUP).setProperties(jSONObjectCloneJsonObject));
                            }
                        } catch (Exception e2) {
                            SALog.printStackTrace(e2);
                        }
                    }
                });
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void profileAppend(final String str, final Set<String> set) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.31
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        jSONArray.put((String) it.next());
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str, jSONArray);
                    SensorsDataAPI.this.mSAContextManager.trackEvent(new InputData().setEventType(EventType.PROFILE_APPEND).setProperties(jSONObject));
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void profileIncrement(final String str, final Number number) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.29
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SensorsDataAPI.this.mSAContextManager.trackEvent(new InputData().setEventType(EventType.PROFILE_INCREMENT).setProperties(new JSONObject().put(str, number)));
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.exposure.SAExposureAPIProtocol
    public void removeExposureView(View view) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.Exposure.MODULE_NAME, Modules.Exposure.METHOD_REMOVE_EXPOSURE_VIEW, view);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setGPSLocation(final double d, final double d2, final String str) {
        try {
            this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        InternalConfigOptions internalConfigOptions = SensorsDataAPI.this.mInternalConfigs;
                        if (internalConfigOptions.gpsLocation == null) {
                            internalConfigOptions.gpsLocation = new SensorsDataGPSLocation();
                        }
                        SensorsDataAPI.this.mInternalConfigs.gpsLocation.setLatitude((long) (d * Math.pow(10.0d, 6.0d)));
                        SensorsDataAPI.this.mInternalConfigs.gpsLocation.setLongitude((long) (d2 * Math.pow(10.0d, 6.0d)));
                        SensorsDataAPI.this.mInternalConfigs.gpsLocation.setCoordinate(SADataHelper.assertPropertyValue(str));
                    } catch (Exception e2) {
                        SALog.printStackTrace(e2);
                    }
                }
            });
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void setServerUrl(final String str, boolean z) {
        if (z) {
            try {
                if (this.mSAContextManager.getRemoteManager() != null) {
                    try {
                        this.mSAContextManager.getRemoteManager().requestRemoteConfig(BaseSensorsDataSDKRemoteManager.RandomTimeType.RandomTimeTypeWrite, false);
                    } catch (Exception e2) {
                        SALog.printStackTrace(e2);
                    }
                }
            } catch (Exception e3) {
                SALog.printStackTrace(e3);
                return;
            }
        }
        if (!TextUtils.equals(str, this.mOriginServerUrl)) {
            try {
                SAModuleManager.getInstance().invokeModuleFunction(Modules.Visual.MODULE_NAME, Modules.Visual.METHOD_REQUEST_VISUAL_CONFIG, new Object[0]);
            } catch (Exception e4) {
                SALog.printStackTrace(e4);
            }
        }
        this.mOriginServerUrl = str;
        if (TextUtils.isEmpty(str)) {
            this.mServerUrl = str;
            AbstractSensorsDataAPI.mSAConfigOptions.mServerUrl = str;
            SALog.i("SA.SensorsDataAPI", "Server url is null or empty.");
            return;
        }
        final Uri uri = Uri.parse(str);
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.34
            @Override // java.lang.Runnable
            public void run() {
                String host = uri.getHost();
                if (TextUtils.isEmpty(host) || !host.contains("_")) {
                    return;
                }
                SALog.i("SA.SensorsDataAPI", "Server url " + str + " contains '_' is not recommend，see details: https://en.wikipedia.org/wiki/Hostname");
            }
        });
        if (this.mInternalConfigs.debugMode != DebugMode.DEBUG_OFF) {
            String path = uri.getPath();
            if (TextUtils.isEmpty(path)) {
                return;
            }
            int iLastIndexOf = path.lastIndexOf(47);
            if (iLastIndexOf != -1) {
                this.mServerUrl = uri.buildUpon().path(path.substring(0, iLastIndexOf) + "/debug").build().toString();
            }
        } else {
            this.mServerUrl = str;
        }
        AbstractSensorsDataAPI.mSAConfigOptions.mServerUrl = this.mServerUrl;
        TrackMonitor.getInstance().callSetServerUrl();
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public void setViewID(Dialog dialog, String str) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_SET_VIEW_ID, dialog, str);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void showUpWebView(WebView webView, boolean z, boolean z2) {
        showUpWebView(webView, null, z, z2);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.advert.SAAdvertAPIProtocol
    public void trackAppInstall(JSONObject jSONObject) {
        trackAppInstall(jSONObject, false);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.advert.SAAdvertAPIProtocol
    public void trackChannelEvent(String str, JSONObject jSONObject) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.Advert.MODULE_NAME, Modules.Advert.METHOD_TRACK_CHANNEL_EVENT, str, jSONObject);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI, com.sensorsdata.analytics.android.sdk.core.mediator.advert.SAAdvertAPIProtocol
    public void trackDeepLinkLaunch(String str, String str2) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.Advert.MODULE_NAME, Modules.Advert.METHOD_TRACK_DEEPLINK_LAUNCH, str, str2);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.advert.SAAdvertAPIProtocol
    public void trackInstallation(String str, JSONObject jSONObject) {
        trackInstallation(str, jSONObject, false);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public void trackViewAppClick(View view, JSONObject jSONObject) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_TRACK_VIEW_APPCLICK, view, jSONObject);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public void trackViewScreen(Activity activity) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_TRACK_VIEW_SCREEN, activity);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public boolean isAutoTrackEventTypeIgnored(int i) {
        Boolean bool = (Boolean) SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_IS_AUTOTRACK_EVENT_TYPE_IGNORED, Integer.valueOf(i));
        return bool != null && bool.booleanValue();
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public void setViewID(Object obj, String str) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_SET_VIEW_ID, obj, str);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    @Deprecated
    public void showUpWebView(WebView webView, JSONObject jSONObject, boolean z, boolean z2) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.WebView.MODULE_NAME, Modules.WebView.METHOD_SHOWUP_WEBVIEW, webView, jSONObject, Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.advert.SAAdvertAPIProtocol
    public void trackAppInstall() {
        trackAppInstall(null, false);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.advert.SAAdvertAPIProtocol
    public void trackInstallation(String str) {
        trackInstallation(str, null, false);
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.autotrack.AutoTrackProtocol
    public void trackViewScreen(Object obj) {
        SAModuleManager.getInstance().invokeModuleFunction(Modules.AutoTrack.MODULE_NAME, Modules.AutoTrack.METHOD_TRACK_VIEW_SCREEN, obj);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void profileSet(final String str, final Object obj) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.25
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SensorsDataAPI.this.mSAContextManager.trackEvent(new InputData().setEventType(EventType.PROFILE_SET).setProperties(new JSONObject().put(str, obj)));
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void profileSetOnce(final String str, final Object obj) {
        this.mTrackTaskManager.addTrackEventTask(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAPI.27
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SensorsDataAPI.this.mSAContextManager.trackEvent(new InputData().setEventType(EventType.PROFILE_SET_ONCE).setProperties(new JSONObject().put(str, obj)));
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                }
            }
        });
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void showUpX5WebView(Object obj, boolean z) {
        showUpX5WebView(obj, null, true, z);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void showUpX5WebView(Object obj) {
        showUpX5WebView(obj, false);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void track(String str) {
        track(str, null);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    public void trackTimerEnd(String str) {
        trackTimerEnd(str, null);
    }

    @Override // com.sensorsdata.analytics.android.sdk.ISensorsDataAPI
    @Deprecated
    public void showUpWebView(WebView webView, boolean z, JSONObject jSONObject) {
        showUpWebView(webView, jSONObject, z, false);
    }

    public static SensorsDataAPI sharedInstance() {
        try {
            if (AbstractSensorsDataAPI.isSDKDisabled()) {
                return new SensorsDataAPIEmptyImplementation();
            }
            return getSDKInstance();
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return new SensorsDataAPIEmptyImplementation();
        }
    }
}
