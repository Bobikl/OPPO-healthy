package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class hk5 {

    @Nullable
    @SerializedName(ServiceNodeBundleKeys.DEVICE_NAME)
    private String a;

    @Nullable
    @SerializedName("slogan")
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    @SerializedName("imageUrl")
    private String f12184c;

    @Nullable
    @SerializedName("skuList")
    private List<b> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    @SerializedName("oobeFileUrl")
    private String f12185e;

    @Nullable
    @SerializedName("oobeFileMd5")
    private String f;

    public static class a {

        @Nullable
        @SerializedName("imageUrl")
        private String a;

        @Nullable
        @SerializedName("imageTypeCode")
        private String b;

        public String a() {
            return this.b;
        }

        public String b() {
            return this.a;
        }

        public String toString() {
            return "ModelImage{imageUrl='" + this.a + "', imageTypeCode='" + this.b + "'}";
        }
    }

    public static class b {

        @SerializedName("defaultSku")
        private int a;

        @Nullable
        @SerializedName(e36.PARAM_SKU_CODE)
        private String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        @SerializedName("skuDesc")
        private String f12186c;

        @Nullable
        @SerializedName("defaultPackageCode")
        private String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        @SerializedName("deviceMarketName")
        private String f12187e;

        @Nullable
        @SerializedName("skuMarketName")
        private String f;

        @Nullable
        @SerializedName("imageList")
        private List<a> g;

        public int a() {
            return this.a;
        }

        public String b() {
            return this.f12187e;
        }

        public List<a> c() {
            return this.g;
        }

        public String d() {
            return this.b;
        }

        public String e() {
            return this.f12186c;
        }

        public String f() {
            return this.f;
        }

        public boolean g() {
            return this.a == 1;
        }

        public String toString() {
            return "ModelSku{defaultSku=" + this.a + ", skuCode='" + this.b + "', skuDesc='" + this.f12186c + "', defaultPackageCode='" + this.d + "', deviceMarketName='" + this.f12187e + "', skuMarketName='" + this.f + "', imageList=" + this.g + '}';
        }
    }

    public String a() {
        return this.a;
    }

    @Nullable
    public String b() {
        return this.f;
    }

    @Nullable
    public String c() {
        return this.f12185e;
    }

    public List<b> d() {
        return this.d;
    }

    public String toString() {
        return "DeviceModelDetailRsp{deviceName='" + this.a + "', slogan='" + this.b + "', imageUrl='" + this.f12184c + "', oobeFileMd5='" + this.f + "', oobeFileUrl='" + this.f12185e + "', skuList=" + this.d + '}';
    }
}
