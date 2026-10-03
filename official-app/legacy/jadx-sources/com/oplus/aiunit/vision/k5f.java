package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class k5f {

    @SerializedName("modelsList")
    private List<b> a;

    public static class a {

        @SerializedName("deviceType")
        private int a;

        @SerializedName(ServiceNodeBundleKeys.DEVICE_NAME)
        private String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("model")
        private String f13157c;

        @SerializedName("versionNumber")
        private int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @SerializedName("version")
        private String f13158e;

        @SerializedName("slogan")
        private String f;

        @SerializedName("thirdPartyModel")
        private String g;

        @SerializedName("generation")
        private String h;

        public String a() {
            return this.f13157c;
        }

        public String b() {
            return this.f13158e;
        }

        public int c() {
            return this.d;
        }

        public String toString() {
            return "Model{deviceType=" + this.a + ", deviceName='" + this.b + "', model='" + this.f13157c + "', slogan='" + this.f + "', thirdPartyModel='" + this.g + "', generation='" + this.h + "'}";
        }
    }

    public static class b {

        @SerializedName("deviceType")
        private int a;

        @SerializedName("deviceTypeName")
        private String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("modelList")
        private List<a> f13159c;

        public List<a> a() {
            return this.f13159c;
        }

        public String toString() {
            return "Models{deviceType=" + this.a + ", deviceTypeName='" + this.b + "', modelList=" + this.f13159c + '}';
        }
    }

    public List<b> a() {
        return this.a;
    }

    public String toString() {
        return "QueryDeviceModelsListRsp{modelsList=" + this.a + '}';
    }
}
