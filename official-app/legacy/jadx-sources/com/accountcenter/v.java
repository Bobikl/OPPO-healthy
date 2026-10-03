package com.accountcenter;

import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.oplus.aiunit.vision.rb1;
import com.platform.usercenter.account.mba.OutsideApk;
import com.platform.usercenter.bizuws.utils.UwsInstantUtil;
import com.platform.usercenter.bizuws.utils.UwsSha256Util;
import com.platform.usercenter.tools.ApkInfoHelper;
import com.platform.usercenter.tools.device.OpenIDHelper;
import com.platform.usercenter.tools.device.UCDeviceInfoUtil;
import com.platform.usercenter.tools.os.UCRuntimeEnvironment;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes12.dex */
public final class v extends rb1 {
    @Override // com.oplus.aiunit.vision.rb1
    public final void handleCustomBasicInfo(Context context) {
        Map<String, String> map = this.nonSensitiveMap;
        if (map != null) {
            map.put("orderType", "1");
        }
    }

    @Override // com.oplus.aiunit.vision.rb1
    public final void handleHighSensitiveInfo(Context context) {
        Map<String, String> map = this.sensitiveMap;
        if (map == null || TextUtils.isEmpty(map.get(OpenIDHelper.OUID))) {
            this.sensitiveMap = new ArrayMap();
            if (TextUtils.isEmpty(OpenIDHelper.getOUID())) {
                OpenIDHelper.getOpenIdHeader(context);
            }
            this.sensitiveMap.put(OpenIDHelper.OUID, OpenIDHelper.getOUID());
            this.map30.put("regionMark", UCDeviceInfoUtil.getRegionMark());
            this.map20.put("OUID_s", UwsSha256Util.getSHA256(OpenIDHelper.getOUID()));
        }
    }

    @Override // com.oplus.aiunit.vision.rb1
    public final void handleNoneSensitiveInfo(Context context) throws JSONException {
        super.handleNoneSensitiveInfo(context);
        this.nonSensitiveMap.put("isHTExp", String.valueOf(UCRuntimeEnvironment.sIsExp));
        this.nonSensitiveMap.put("language", UCDeviceInfoUtil.getLanguage());
        this.nonSensitiveMap.put("languageTag", UCDeviceInfoUtil.getLanguageTag());
        this.nonSensitiveMap.put("payApkVersionCode", String.valueOf(ApkInfoHelper.getVersionCode(context, OutsideApk.payPackageName(context))));
        this.nonSensitiveMap.put("instantPlatformVersion", UwsInstantUtil.getInstantVersion(context));
    }
}
