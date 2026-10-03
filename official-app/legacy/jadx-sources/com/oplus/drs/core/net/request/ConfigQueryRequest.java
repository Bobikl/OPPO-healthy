package com.oplus.drs.core.net.request;

import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.iq5;
import com.oplus.aiunit.vision.q7a;
import com.oplus.aiunit.vision.tpe;
import com.oplus.aiunit.vision.vg0;
import com.oplus.aiunit.vision.w56;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ConfigQueryRequest {
    private List<AppInfo> apps;
    private String area;
    private String brand;
    private int cv;
    private String duid;
    private int hv;
    private String model;
    private String osVersion;
    private String ouid;
    private String region;
    private String sdkVersion;

    public static class AppInfo {
        private String appId;
        private int ev;
        private int sv;

        public AppInfo() {
        }

        public AppInfo(String str, int i, int i2) {
            this.appId = str;
            this.ev = i;
            this.sv = i2;
        }

        public String getAppId() {
            return this.appId;
        }

        public int getEv() {
            return this.ev;
        }

        public int getSv() {
            return this.sv;
        }

        @NonNull
        public String toString() {
            return "AppInfo{appId='" + this.appId + "', ev=" + this.ev + ", sv=" + this.sv + '}';
        }
    }

    public ConfigQueryRequest() {
    }

    public ConfigQueryRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, List<AppInfo> list) {
        this.duid = str;
        this.ouid = str2;
        this.area = str3;
        this.region = str4;
        this.brand = str5;
        this.model = str6;
        this.osVersion = str7;
        this.sdkVersion = str8;
        this.cv = i;
        this.hv = i2;
        this.apps = list;
    }

    public static ConfigQueryRequest buildAppIdsRequest(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new AppInfo(it.next(), 0, 0));
        }
        String strE = vg0.e();
        return new ConfigQueryRequest(resolveDuid(), resolveOuid(), vg0.b(strE).toString(), strE, iq5.e(), iq5.model, iq5.d(), resolveSdkVersion(), 0, 0, arrayList);
    }

    private static List<AppInfo> buildBootstrapApps() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new AppInfo("", 0, 0));
        return arrayList;
    }

    public static ConfigQueryRequest buildIncrementalRequest(List<String> list, Map<String, Integer> map, Map<String, Integer> map2, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            int iIntValue = 0;
            int iIntValue2 = (map == null || !map.containsKey(str)) ? 0 : map.get(str).intValue();
            if (map2 != null && map2.containsKey(str)) {
                iIntValue = map2.get(str).intValue();
            }
            arrayList.add(new AppInfo(str, iIntValue2, iIntValue));
        }
        String strE = vg0.e();
        return new ConfigQueryRequest(resolveDuid(), resolveOuid(), vg0.b(strE).toString(), strE, iq5.e(), iq5.model, iq5.d(), resolveSdkVersion(), i, i2, arrayList);
    }

    public static ConfigQueryRequest buildInitialBootstrapRequest() {
        String strE = vg0.e();
        return new ConfigQueryRequest(resolveDuid(), resolveOuid(), vg0.b(strE).toString(), strE, iq5.e(), iq5.model, iq5.d(), resolveSdkVersion(), 0, 0, buildBootstrapApps());
    }

    @Deprecated
    public static ConfigQueryRequest buildNullRequest() {
        return buildInitialBootstrapRequest();
    }

    private static String resolveDuid() {
        try {
            String strD = q7a.d();
            if (strD != null && !strD.isEmpty()) {
                return strD;
            }
            String strE = tpe.e(w56.h());
            if (strE != null && !strE.isEmpty()) {
                q7a.h(strE);
                return strE;
            }
        } catch (Throwable unused) {
        }
        return "EMPTY_CACHE";
    }

    private static String resolveOuid() {
        try {
            String strF = tpe.f(w56.h());
            return (strF == null || strF.isEmpty()) ? "EMPTY_CACHE" : strF;
        } catch (Throwable unused) {
            return "EMPTY_CACHE";
        }
    }

    private static String resolveSdkVersion() {
        try {
            String strD = w56.d();
            return strD != null ? strD : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public List<AppInfo> getApps() {
        return this.apps;
    }

    public String getArea() {
        return this.area;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getCv() {
        return this.cv;
    }

    public String getDuid() {
        return this.duid;
    }

    public int getHv() {
        return this.hv;
    }

    public String getModel() {
        return this.model;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getOuid() {
        return this.ouid;
    }

    public String getRegion() {
        return this.region;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    @NonNull
    public String toString() {
        return "ConfigQueryRequest{duid='" + this.duid + "', ouid='" + this.ouid + "', area='" + this.area + "', region='" + this.region + "', brand='" + this.brand + "', model='" + this.model + "', osVersion='" + this.osVersion + "', sdkVersion='" + this.sdkVersion + "', cv=" + this.cv + ", hv=" + this.hv + ", apps=" + this.apps + '}';
    }
}
