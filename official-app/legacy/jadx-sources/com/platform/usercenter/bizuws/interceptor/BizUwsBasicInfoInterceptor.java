package com.platform.usercenter.bizuws.interceptor;

import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.oplus.aiunit.vision.en;
import com.oplus.aiunit.vision.rb1;
import com.platform.usercenter.account.mba.OutsideApk;
import com.platform.usercenter.bizuws.utils.UwsSha256Util;
import com.platform.usercenter.tools.ApkInfoHelper;
import com.platform.usercenter.tools.device.OpenIDHelper;
import com.platform.usercenter.tools.device.UCDeviceInfoUtil;
import com.platform.usercenter.tools.os.UCRuntimeEnvironment;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes9.dex */
public class BizUwsBasicInfoInterceptor extends rb1 {
    public static final String SHA256_KEY_SUFFIX = "_s";

    @Override // com.oplus.aiunit.vision.rb1
    public void handleHighSensitiveInfo(Context context) {
        Map<String, String> map = this.sensitiveMap;
        if (map == null || TextUtils.isEmpty(map.get("imei")) || TextUtils.isEmpty(this.map30.get("imei_s")) || TextUtils.isEmpty(this.sensitiveMap.get(OpenIDHelper.GUID))) {
            this.sensitiveMap = new ArrayMap();
            String macAddress = UCDeviceInfoUtil.getMacAddress(context);
            this.sensitiveMap.put("imei", "");
            if (TextUtils.isEmpty(OpenIDHelper.getGUID())) {
                OpenIDHelper.getOpenIdHeader(context);
            }
            this.sensitiveMap.put(OpenIDHelper.APID, OpenIDHelper.getAPID());
            this.sensitiveMap.put(OpenIDHelper.GUID, OpenIDHelper.getGUID());
            this.sensitiveMap.put(OpenIDHelper.AUID, OpenIDHelper.getAUID());
            this.sensitiveMap.put(OpenIDHelper.DUID, OpenIDHelper.getDUID());
            this.sensitiveMap.put(OpenIDHelper.OUID, OpenIDHelper.getOUID());
            this.sensitiveMap.put("mac", macAddress);
            this.sensitiveMap.put("deviceId", "");
            this.sensitiveMap.put("serial", UCDeviceInfoUtil.getSerialNum());
            this.sensitiveMap.put("ip", UCDeviceInfoUtil.getIpAddress(context));
            this.map30.put("regionMark", UCDeviceInfoUtil.getRegionMark());
            this.map30.put("imei_s", UwsSha256Util.getSHA256(""));
            this.map30.put("mac_s", UwsSha256Util.getSHA256(macAddress));
            this.map20.put("APID_s", UwsSha256Util.getSHA256(OpenIDHelper.getAPID()));
            this.map20.put("GUID_s", UwsSha256Util.getSHA256(OpenIDHelper.getGUID()));
            this.map20.put("AUID_s", UwsSha256Util.getSHA256(OpenIDHelper.getAUID()));
            this.map20.put("DUID_s", UwsSha256Util.getSHA256(OpenIDHelper.getDUID()));
            this.map20.put("OUID_s", UwsSha256Util.getSHA256(OpenIDHelper.getOUID()));
        }
    }

    @Override // com.oplus.aiunit.vision.rb1
    public void handleNoneSensitiveInfo(Context context) throws JSONException {
        super.handleNoneSensitiveInfo(context);
        this.nonSensitiveMap.put("isHTExp", String.valueOf(UCRuntimeEnvironment.sIsExp));
        this.nonSensitiveMap.put("language", UCDeviceInfoUtil.getLanguage());
        this.nonSensitiveMap.put("languageTag", UCDeviceInfoUtil.getLanguageTag());
        this.nonSensitiveMap.put("payApkVersionCode", String.valueOf(ApkInfoHelper.getVersionCode(context, OutsideApk.payPackageName(context))));
        this.nonSensitiveMap.put("instantPlatformVersion", en.b(context));
    }
}
