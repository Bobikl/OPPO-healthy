package com.heytap.usercenter.accountsdk.tools;

import android.os.Build;
import com.heytap.log.collect.auto.SystemInfoCollect;
import com.heytap.usercenter.accountsdk.UCDispatcherManager;
import com.heytap.usercenter.helper.NoNetworkUtil;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.ApkInfoHelper;
import com.platform.usercenter.tools.datastructure.Maps;
import com.platform.usercenter.tools.device.OpenIDHelper;
import com.platform.usercenter.tools.device.UCDeviceInfoUtil;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.os.UCOSVersionUtil;
import com.platform.usercenter.tools.os.Version;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class UCStatisticsHelper {
    public static final String DEFAULT_SYSTEMID = "3012";
    public static final String LOG_TAG_106 = "106";

    @Keep
    public static class StatBuilder {
        private String eventId;
        private HashMap<String, String> eventInfo;
        private String logTag;

        public StatBuilder eventId(String str) {
            this.eventId = str;
            return this;
        }

        public StatBuilder eventInfo(HashMap<String, String> map) {
            this.eventInfo = map;
            return this;
        }

        public StatBuilder logTag(String str) {
            this.logTag = str;
            return this;
        }

        public StatBuilder putInfo(String str, String str2) {
            if (this.eventInfo == null) {
                this.eventInfo = Maps.newHashMap();
            }
            this.eventInfo.put(str, str2);
            return this;
        }

        public void statistics() {
            UCLogUtil.e("statistics logTag = " + this.logTag + "\n statistics eventId = " + this.eventId + "\n statistics logmap = " + this.eventInfo);
            UCStatisticsHelper.onStatistics("3012", this.logTag, this.eventId, this.eventInfo);
        }
    }

    public static void onCommon(String str, String str2, String str3, Map<String, String> map) {
        if (map == null) {
            map = Maps.newHashMap();
        }
        map.put("app_package", BaseApp.mContext.getPackageName());
        map.put("app_version", ApkInfoHelper.getVersionName(BaseApp.mContext));
        map.put("Model", Build.BRAND);
        map.put(SystemInfoCollect.IMEI, UCDeviceInfoUtil.getOSIMEI(BaseApp.mContext));
        map.put("os_version", UCDeviceInfoUtil.getOsVersionRelease());
        map.put("rom_version", UCOSVersionUtil.getOsVersion());
        map.put("AndroidVersion", UCDeviceInfoUtil.getOsVersionSDK());
        if (Version.hasQ()) {
            map.putAll(OpenIDHelper.getOpenIdHeader(BaseApp.mContext));
        }
        map.put("isConnectNet", String.valueOf(NoNetworkUtil.isConnectNet(BaseApp.mContext)));
        map.put("regionMask", UCDeviceInfoUtil.getRegionMark());
        map.put("curRegion", UCOSVersionUtil.getCurRegion());
        onStatistics(str, str2, str3, map);
    }

    public static void onError(String str, String str2, String str3, String str4, Map<String, String> map) {
        if (map == null) {
            map = Maps.newHashMap();
        }
        map.put("errMsg", str4);
        onCommon(str, str2, str3, map);
    }

    public static void onEvent(String str, String str2, String str3, Map<String, String> map) {
        if (map == null) {
            map = Maps.newHashMap();
        }
        onStatistics(str, str2, str3, map);
    }

    public static void onStatistics(String str, String str2, String str3, Map<String, String> map) {
        UCDispatcherManager.getInstance().onStatistics(str, str2, str3, map);
    }
}
