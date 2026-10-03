package com.oplus.aiunit.vision;

import com.heytap.health.watch.watchface.proto.Proto$DeviceInfo;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class rul {
    public static final String TAG = "WfRequestUtil";

    public static String a(Proto$DeviceInfo proto$DeviceInfo) {
        return grl.a(proto$DeviceInfo.getDeviceMac()).L2();
    }

    public static String b(Proto$DeviceInfo proto$DeviceInfo) {
        return kg7.a(proto$DeviceInfo.getFirmwareVersion());
    }

    public static HashMap<String, Object> c(Proto$DeviceInfo proto$DeviceInfo, String str) {
        HashMap<String, Object> map = new HashMap<>();
        String firmwareVersion = proto$DeviceInfo.getFirmwareVersion();
        String strA = kg7.a(firmwareVersion);
        map.put(e36.PARAM_SKU_CODE, proto$DeviceInfo.getSku());
        map.put(e36.PARAM_FIRMWARE_ID, strA);
        map.put(e36.PARAM_FIRMWARE_VERSION, firmwareVersion);
        map.put("materialType", str);
        map.put("deviceType", a(proto$DeviceInfo));
        map.put("model", proto$DeviceInfo.getModel());
        return map;
    }

    public static HashMap<String, Object> d(Proto$DeviceInfo proto$DeviceInfo, ArrayList<String> arrayList) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("os", 1);
        map.put("dialKeyList", arrayList);
        if (proto$DeviceInfo != null) {
            map.put("model", proto$DeviceInfo.getModel());
            map.put(e36.PARAM_SKU_CODE, proto$DeviceInfo.getSku());
            map.put("deviceType", a(proto$DeviceInfo));
            map.put(e36.PARAM_FIRMWARE_ID, b(proto$DeviceInfo));
            map.put(e36.PARAM_FIRMWARE_VERSION, proto$DeviceInfo.getFirmwareVersion());
        } else {
            ltl.b(TAG, "[queryDialDetailListV2] --> error, deviceInfo null");
        }
        return map;
    }

    public static HashMap<String, Object> e(Proto$DeviceInfo proto$DeviceInfo, String str) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("os", 1);
        map.put("dialKey", str);
        if (proto$DeviceInfo != null) {
            map.put("model", proto$DeviceInfo.getModel());
            map.put(e36.PARAM_SKU_CODE, proto$DeviceInfo.getSku());
            map.put("deviceType", a(proto$DeviceInfo));
            map.put(e36.PARAM_FIRMWARE_ID, b(proto$DeviceInfo));
            map.put(e36.PARAM_FIRMWARE_VERSION, proto$DeviceInfo.getFirmwareVersion());
        } else {
            ltl.b(TAG, "[queryDialDetailV2] --> error, deviceInfo null");
        }
        return map;
    }

    public static HashMap<String, Object> f(Proto$DeviceInfo proto$DeviceInfo, int i, int i2, String str) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("os", 1);
        map.put("dialType", str);
        map.put("pageNo", Integer.valueOf(i2));
        map.put("pageSize", Integer.valueOf(i));
        if (proto$DeviceInfo != null) {
            map.put("model", proto$DeviceInfo.getModel());
            map.put(e36.PARAM_SKU_CODE, proto$DeviceInfo.getSku());
            map.put("deviceType", a(proto$DeviceInfo));
            map.put(e36.PARAM_FIRMWARE_ID, b(proto$DeviceInfo));
            map.put(e36.PARAM_FIRMWARE_VERSION, proto$DeviceInfo.getFirmwareVersion());
        } else {
            ltl.b(TAG, "[queryDialListV2] --> error, deviceInfo null");
        }
        return map;
    }

    public static HashMap<String, Object> g(Proto$DeviceInfo proto$DeviceInfo) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("os", 1);
        if (proto$DeviceInfo != null) {
            map.put("model", proto$DeviceInfo.getModel());
            map.put(e36.PARAM_SKU_CODE, proto$DeviceInfo.getSku());
            map.put("deviceType", a(proto$DeviceInfo));
            map.put(e36.PARAM_FIRMWARE_ID, b(proto$DeviceInfo));
            map.put(e36.PARAM_FIRMWARE_VERSION, proto$DeviceInfo.getFirmwareVersion());
        } else {
            ltl.b(TAG, "[queryDialMaterial] --> error, deviceInfo null");
        }
        return map;
    }

    public static HashMap<String, Object> h(Proto$DeviceInfo proto$DeviceInfo) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("os", 1);
        map.put("pageNo", 1);
        map.put("pageSize", 60);
        if (proto$DeviceInfo != null) {
            map.put("model", proto$DeviceInfo.getModel());
            map.put(e36.PARAM_SKU_CODE, proto$DeviceInfo.getSku());
            map.put("deviceType", a(proto$DeviceInfo));
            map.put(e36.PARAM_FIRMWARE_ID, b(proto$DeviceInfo));
            map.put(e36.PARAM_FIRMWARE_VERSION, proto$DeviceInfo.getFirmwareVersion());
        } else {
            ltl.b(TAG, "[queryRsDialTypeList] --> error, deviceInfo null");
        }
        return map;
    }
}
