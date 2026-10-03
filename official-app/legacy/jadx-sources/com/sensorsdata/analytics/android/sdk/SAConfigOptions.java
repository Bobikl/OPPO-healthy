package com.sensorsdata.analytics.android.sdk;

import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.core.business.exposure.SAExposureConfig;
import com.sensorsdata.analytics.android.sdk.deeplink.SensorsDataDeferredDeepLinkCallback;
import com.sensorsdata.analytics.android.sdk.encrypt.IPersistentSecretKey;
import com.sensorsdata.analytics.android.sdk.encrypt.SAEncryptListener;
import com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin;
import com.sensorsdata.analytics.android.sdk.plugin.property.SAPropertyPlugin;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes10.dex */
public final class SAConfigOptions extends AbstractSAConfigOptions implements Cloneable {
    boolean mInvokeHeatMapEnabled;
    boolean mInvokeLog;
    boolean mInvokeVisualizedEnabled;

    private SAConfigOptions() {
    }

    public SAConfigOptions disableAppEndTimer() {
        this.mDisableAppEndTimer = true;
        return this;
    }

    public SAConfigOptions disableDebugAssistant() {
        this.mDisableDebugAssistant = true;
        return this;
    }

    public SAConfigOptions disableDeviceId() {
        this.mDisableDeviceId = true;
        return this;
    }

    public SAConfigOptions disableRandomTimeRequestRemoteConfig() {
        this.mDisableRandomTimeRequestRemoteConfig = true;
        return this;
    }

    public SAConfigOptions disableSDK(boolean z) {
        this.isDisableSDK = z;
        return this;
    }

    public SAConfigOptions enableAutoAddChannelCallbackEvent(boolean z) {
        this.isAutoAddChannelCallbackEvent = z;
        return this;
    }

    public SAConfigOptions enableEncrypt(boolean z) {
        this.mEnableEncrypt = z;
        return this;
    }

    public SAConfigOptions enableHeatMap(boolean z) {
        this.mHeatMapEnabled = z;
        this.mInvokeHeatMapEnabled = true;
        return this;
    }

    public SAConfigOptions enableJavaScriptBridge(boolean z) {
        this.isAutoTrackWebView = true;
        this.isWebViewSupportJellyBean = z;
        return this;
    }

    public SAConfigOptions enableLog(boolean z) {
        this.mLogEnabled = z;
        this.mInvokeLog = true;
        return this;
    }

    public SAConfigOptions enableSaveDeepLinkInfo(boolean z) {
        this.mEnableSaveDeepLinkInfo = z;
        return this;
    }

    public SAConfigOptions enableSession(boolean z) {
        this.mEnableSession = z;
        return this;
    }

    public SAConfigOptions enableSubProcessFlushData() {
        this.isSubProcessFlushData = true;
        return this;
    }

    public SAConfigOptions enableTrackAppCrash() {
        this.mEnableTrackAppCrash = true;
        return this;
    }

    @Deprecated
    public SAConfigOptions enableTrackPageLeave(boolean z) {
        return enableTrackPageLeave(z, false);
    }

    public SAConfigOptions enableTrackPush(boolean z) {
        this.mEnableTrackPush = z;
        return this;
    }

    public SAConfigOptions enableTrackScreenOrientation(boolean z) {
        this.mTrackScreenOrientationEnabled = z;
        return this;
    }

    public SAConfigOptions enableTransportEncrypt() {
        this.mTransportEncrypt = true;
        return this;
    }

    public SAConfigOptions enableVisualizedAutoTrack(boolean z) {
        this.mVisualizedEnabled = z;
        this.mInvokeVisualizedEnabled = true;
        return this;
    }

    public SAConfigOptions enableVisualizedProperties(boolean z) {
        this.mVisualizedPropertiesEnabled = z;
        return this;
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ SAAdvertisingConfig getAdvertConfig() {
        return super.getAdvertConfig();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ String getAnonymousId() {
        return super.getAnonymousId();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ int getAutoTrackEventType() {
        return super.getAutoTrackEventType();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ String getCustomADChannelUrl() {
        return super.getCustomADChannelUrl();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ SensorsDataDeferredDeepLinkCallback getDeeplinkCallback() {
        return super.getDeeplinkCallback();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ List getEncryptors() {
        return super.getEncryptors();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ int getEventSessionTimeout() {
        return super.getEventSessionTimeout();
    }

    public SAExposureConfig getExposureConfig() {
        return this.mExposureConfig;
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ int getFlushBulkSize() {
        return super.getFlushBulkSize();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ List getIgnorePageLeave() {
        return super.getIgnorePageLeave();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ List getInstantEvents() {
        return super.getInstantEvents();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ Map getLimitKeys() {
        return super.getLimitKeys();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ int getMaxRequestInterval() {
        return super.getMaxRequestInterval();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ int getMinRequestInterval() {
        return super.getMinRequestInterval();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ IPersistentSecretKey getPersistentSecretKey() {
        return super.getPersistentSecretKey();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ List getPropertyPlugins() {
        return super.getPropertyPlugins();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ String getRemoteConfigUrl() {
        return super.getRemoteConfigUrl();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ SSLSocketFactory getSSLSocketFactory() {
        return super.getSSLSocketFactory();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ String getServerUrl() {
        return super.getServerUrl();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ List getStorePlugins() {
        return super.getStorePlugins();
    }

    public SAConfigOptions ignorePageLeave(List<Class<?>> list) {
        this.mIgnorePageLeave = list;
        return this;
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ boolean isAutoAddChannelCallbackEvent() {
        return super.isAutoAddChannelCallbackEvent();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ boolean isAutoTrackWebView() {
        return super.isAutoTrackWebView();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    @Deprecated
    public /* bridge */ /* synthetic */ boolean isDataCollectEnable() {
        return super.isDataCollectEnable();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ boolean isDisableAppEndTimer() {
        return super.isDisableAppEndTimer();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ boolean isDisableDebugAssistant() {
        return super.isDisableDebugAssistant();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ boolean isDisableDeviceId() {
        return super.isDisableDeviceId();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ boolean isDisableRandomTimeRequestRemoteConfig() {
        return super.isDisableRandomTimeRequestRemoteConfig();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ boolean isDisableSDK() {
        return super.isDisableSDK();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ boolean isEnableEncrypt() {
        return super.isEnableEncrypt();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ boolean isEnableSession() {
        return super.isEnableSession();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ boolean isEnableTrackPush() {
        return super.isEnableTrackPush();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ boolean isMultiProcessFlush() {
        return super.isMultiProcessFlush();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ boolean isSaveDeepLinkInfo() {
        return super.isSaveDeepLinkInfo();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ boolean isTrackFragmentPageLeave() {
        return super.isTrackFragmentPageLeave();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ boolean isTrackPageLeave() {
        return super.isTrackPageLeave();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ boolean isTransportEncrypt() {
        return super.isTransportEncrypt();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ boolean isVisualizedPropertiesEnabled() {
        return super.isVisualizedPropertiesEnabled();
    }

    @Override // com.sensorsdata.analytics.android.sdk.AbstractSAConfigOptions
    public /* bridge */ /* synthetic */ boolean isWebViewSupportJellyBean() {
        return super.isWebViewSupportJellyBean();
    }

    public SAConfigOptions persistentSecretKey(IPersistentSecretKey iPersistentSecretKey) {
        this.mPersistentSecretKey = iPersistentSecretKey;
        return this;
    }

    public SAConfigOptions registerEncryptor(SAEncryptListener sAEncryptListener) {
        if (sAEncryptListener != null && !TextUtils.isEmpty(sAEncryptListener.asymmetricEncryptType()) && !TextUtils.isEmpty(sAEncryptListener.symmetricEncryptType()) && !this.mEncryptors.contains(sAEncryptListener)) {
            this.mEncryptors.add(0, sAEncryptListener);
        }
        return this;
    }

    public SAConfigOptions registerLimitKeys(Map<String, String> map) {
        this.mLimitKeys = map;
        return this;
    }

    public SAConfigOptions registerPropertyPlugin(SAPropertyPlugin sAPropertyPlugin) {
        if (this.mPropertyPlugins == null) {
            this.mPropertyPlugins = new ArrayList();
        }
        this.mPropertyPlugins.add(sAPropertyPlugin);
        return this;
    }

    public SAConfigOptions registerStorePlugin(StorePlugin storePlugin) {
        if (this.mStorePlugins == null) {
            this.mStorePlugins = new ArrayList();
        }
        this.mStorePlugins.add(storePlugin);
        return this;
    }

    public SAConfigOptions setAdvertConfig(SAAdvertisingConfig sAAdvertisingConfig) {
        this.mSATConfig = sAAdvertisingConfig;
        return this;
    }

    public SAConfigOptions setAnonymousId(String str) {
        this.mAnonymousId = str;
        return this;
    }

    public SAConfigOptions setAutoTrackEventType(int i) {
        this.mAutoTrackEventType = i;
        return this;
    }

    public SAConfigOptions setCustomAdChannelUrl(String str) {
        this.mCustomADChannelUrl = str;
        return this;
    }

    public SAConfigOptions setDeepLinkCompletion(SensorsDataDeferredDeepLinkCallback sensorsDataDeferredDeepLinkCallback) {
        this.mDeeplinkCallback = sensorsDataDeferredDeepLinkCallback;
        return this;
    }

    public SAConfigOptions setEventSessionTimeout(int i) {
        this.mEventSessionTimeout = i;
        return this;
    }

    public SAConfigOptions setExposureConfig(SAExposureConfig sAExposureConfig) {
        this.mExposureConfig = sAExposureConfig;
        return this;
    }

    public SAConfigOptions setFlushBulkSize(int i) {
        this.mFlushBulkSize = Math.max(50, i);
        return this;
    }

    public SAConfigOptions setFlushInterval(int i) {
        this.mFlushInterval = Math.max(5000, i);
        return this;
    }

    public SAConfigOptions setInstantEvents(List<String> list) {
        this.mListInstantEvents = list;
        return this;
    }

    public SAConfigOptions setMaxCacheSize(long j2) {
        this.mMaxCacheSize = Math.max(16777216L, j2);
        return this;
    }

    public SAConfigOptions setMaxRequestInterval(int i) {
        if (i > 0) {
            this.mMaxRequestInterval = Math.min(i, 168);
        }
        return this;
    }

    public SAConfigOptions setMinRequestInterval(int i) {
        if (i > 0) {
            this.mMinRequestInterval = Math.min(i, 168);
        }
        return this;
    }

    public SAConfigOptions setNetworkTypePolicy(int i) {
        this.mNetworkTypePolicy = i;
        return this;
    }

    public SAConfigOptions setRemoteConfigUrl(String str) {
        this.mRemoteConfigUrl = str;
        return this;
    }

    public SAConfigOptions setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.mSSLSocketFactory = sSLSocketFactory;
        return this;
    }

    public SAConfigOptions setServerUrl(String str) {
        this.mServerUrl = str;
        return this;
    }

    public SAConfigOptions setSourceChannels(String... strArr) {
        this.channelSourceKeys = strArr;
        return this;
    }

    public SAConfigOptions(String str) {
        this.mServerUrl = str;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SAConfigOptions m5266clone() {
        try {
            return (SAConfigOptions) super.clone();
        } catch (CloneNotSupportedException e2) {
            SALog.printStackTrace(e2);
            return this;
        }
    }

    public SAConfigOptions enableTrackPageLeave(boolean z, boolean z2) {
        this.mIsTrackPageLeave = z;
        this.mIsTrackFragmentPageLeave = z2;
        return this;
    }
}
