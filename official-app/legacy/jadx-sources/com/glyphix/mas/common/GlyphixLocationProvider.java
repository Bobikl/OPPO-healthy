package com.glyphix.mas.common;

import com.glyphix.mas.callback.GlyphixResolver;
import com.oplus.aiunit.vision.cxe;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public abstract class GlyphixLocationProvider {
    private Integer continuousFailedNum;

    public static class GxLocation {
        private LocationCode code;
        private String coordType;
        private double latitude;
        private double longitude;
        private String msg;

        public GxLocation() {
            this.latitude = 0.0d;
            this.longitude = 0.0d;
            this.coordType = "";
            this.code = LocationCode.SUCCESS;
            this.msg = "success";
        }

        public int getCode() {
            return this.code.getCode();
        }

        public String getCoordType() {
            return this.coordType;
        }

        public double getLatitude() {
            return this.latitude;
        }

        public double getLongitude() {
            return this.longitude;
        }

        public String getMsg() {
            return this.msg;
        }

        public void setCode(LocationCode locationCode) {
            this.code = locationCode;
        }

        public void setCoordType(String str) {
            this.coordType = str;
        }

        public void setLatitude(double d) {
            this.latitude = d;
        }

        public void setLongitude(double d) {
            this.longitude = d;
        }

        public void setMsg(String str) {
            this.msg = str;
        }

        public GxLocation(double d, double d2, String str) {
            this.latitude = 0.0d;
            this.longitude = 0.0d;
            this.coordType = "";
            this.code = LocationCode.SUCCESS;
            this.msg = "success";
            this.latitude = d;
            this.longitude = d2;
            this.coordType = str;
        }

        public GxLocation(LocationCode locationCode, String str) {
            this.latitude = 0.0d;
            this.longitude = 0.0d;
            this.coordType = "";
            LocationCode locationCode2 = LocationCode.SUCCESS;
            this.code = locationCode;
            this.msg = str;
        }
    }

    public enum LocationCode {
        SUCCESS(200),
        MANAGER_IS_NULL(1300),
        PROVIDER_DISABLE(1301),
        NOT_PERMISSION(1302),
        LOCATION_TIMEOUT(1303),
        UNKNOWN_ERROR(1399);

        private final int code;

        LocationCode(int i) {
            this.code = i;
        }

        public int getCode() {
            return this.code;
        }

        public String getMsg() {
            int i = this.code;
            if (i == 200) {
                return cxe.MSG_SUC;
            }
            if (i == 1399) {
                return "Unknown error";
            }
            switch (i) {
                case 1300:
                    return "Can't use location service";
                case 1301:
                    return "location provider disable";
                case 1302:
                    return "No permission";
                case 1303:
                    return "Can't get location";
                default:
                    return "";
            }
        }
    }

    public class a implements GlyphixResolver {
        public a() {
        }

        @Override // com.glyphix.mas.callback.GlyphixResolver
        public Integer onFailed(JSONObject jSONObject) {
            GlyphixLocationProvider glyphixLocationProvider = GlyphixLocationProvider.this;
            glyphixLocationProvider.continuousFailedNum = Integer.valueOf(glyphixLocationProvider.continuousFailedNum.intValue() + 1);
            if (GlyphixLocationProvider.this.continuousFailedNum.intValue() >= 5) {
                com.glyphix.mas.utils.b.c().b("sendLocationToDevice", "onFailed: 连续 5 次下发定位失败，停止获取定位信息");
                GlyphixLocationProvider.this.unregisterListen();
            }
            return 0;
        }

        @Override // com.glyphix.mas.callback.GlyphixResolver
        public Integer onSuccess(JSONObject jSONObject) {
            GlyphixLocationProvider.this.continuousFailedNum = 0;
            return 0;
        }

        @Override // com.glyphix.mas.callback.GlyphixResolver
        public Integer retry() {
            return 0;
        }
    }

    public abstract GxLocation getLocation(String str, String str2, Integer num);

    public abstract LocationCode registerListen(String str, String str2);

    public final void sendLocationToDevice(double d, double d2, String str) {
        sendLocationToDevice(d, d2, str, LocationCode.SUCCESS);
    }

    public abstract LocationCode unregisterListen();

    public final void sendLocationToDevice(double d, double d2, String str, LocationCode locationCode) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", locationCode.getCode());
            jSONObject.put("msg", locationCode.getMsg());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("latitude", d);
            jSONObject2.put("longitude", d2);
            if (str.isEmpty()) {
                str = "Unknown";
            }
            jSONObject2.put("coordType", str);
            jSONObject.put("data", jSONObject2);
            b.a("svc_update_location", jSONObject, "location", new a());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
