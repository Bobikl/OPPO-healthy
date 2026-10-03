package com.platform.usercenter.network.header;

import android.content.Context;
import androidx.annotation.Nullable;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import com.platform.usercenter.tools.UCBasicUtils;
import com.platform.usercenter.tools.device.UCDeviceInfoUtil;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.os.Version;
import com.platform.usercenter.tools.sim.TelEntity;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class DeviceSecurityHeader {
    private static final String TAG = "DeviceSecurityHeader";

    public static String getDeviceSecurityHeader(Context context, @Nullable IBizHeaderManager iBizHeaderManager) {
        String wifiSsid;
        try {
            JSONObject jSONObject = new JSONObject();
            if (iBizHeaderManager != null) {
                wifiSsid = iBizHeaderManager.getWifiSsid();
                jSONObject.put("imei", iBizHeaderManager.getImei(context));
                jSONObject.put("serialNum", iBizHeaderManager.getSerialNum());
                jSONObject.put("serial", iBizHeaderManager.getSerialNum());
                jSONObject.put("imei1", iBizHeaderManager.getImei(context));
                TelEntity telEntity = iBizHeaderManager.getTelEntity(context, 0);
                if (telEntity != null && telEntity.subId != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("iccid", telEntity.iccid);
                    jSONObject2.put(SpeechConstant.KEY_IMSI, telEntity.imsi);
                    jSONObject2.put(DeepLinkInterpreter.KEY_PHONE_NUM, telEntity.phoneNum);
                    jSONObject.put("slot0", jSONObject2.toString());
                }
                TelEntity telEntity2 = iBizHeaderManager.getTelEntity(context, 1);
                if (telEntity2 != null && telEntity2.subId != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("iccid", telEntity2.iccid);
                    jSONObject3.put(SpeechConstant.KEY_IMSI, telEntity2.imsi);
                    jSONObject3.put(DeepLinkInterpreter.KEY_PHONE_NUM, telEntity2.phoneNum);
                    jSONObject.put("slot1", jSONObject3.toString());
                }
            } else {
                wifiSsid = "";
            }
            jSONObject.put("wifissid", wifiSsid);
            boolean z = !Version.hasM() || context.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            UCLogUtil.d(UCBasicUtils.SDK_TAG, "DeviceSecurityHeader state hasPermission = " + z);
            jSONObject.put("hasPermission", z);
            jSONObject.put(ServiceNodeBundleKeys.DEVICE_NAME, UCDeviceInfoUtil.getDeviceName(context));
            jSONObject.put("marketName", UCDeviceInfoUtil.getMarketName());
            return jSONObject.toString();
        } catch (Exception e2) {
            UCLogUtil.e(UCBasicUtils.SDK_TAG, TAG + e2);
            return "";
        }
    }

    @Deprecated
    public static String getDeviceSecurityHeader(Context context) {
        return getDeviceSecurityHeader(context, null);
    }
}
