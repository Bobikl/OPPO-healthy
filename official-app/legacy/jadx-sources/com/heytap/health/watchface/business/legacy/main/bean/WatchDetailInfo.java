package com.heytap.health.watchface.business.legacy.main.bean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.oplus.aiunit.vision.e36;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class WatchDetailInfo {

    @SerializedName(ServiceNodeBundleKeys.DEVICE_NAME)
    private String mDeviceName;

    @SerializedName("imageUrl")
    private String mImageUrl;

    @SerializedName("skuList")
    private List<b> mSkuList;

    @SerializedName("slogan")
    private String mSlogan;

    public static class a {

        @SerializedName("imageUrl")
        private String a;

        @SerializedName("imageTypeCode")
        private String b;

        public String a() {
            return this.b;
        }

        public String b() {
            return this.a;
        }

        public String toString() {
            return "ImageList{mImageUrl='" + this.a + "', mImageTypeCode='" + this.b + "'}";
        }
    }

    public static class b {

        @SerializedName("defaultSku")
        private int a;

        @SerializedName(e36.PARAM_SKU_CODE)
        private String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("skuDesc")
        private String f6945c;

        @SerializedName("defaultPackageCode")
        private String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @SerializedName("surfaceType")
        private int f6946e;

        @SerializedName("imageList")
        private List<a> f;

        @SerializedName("rangle")
        private int g;

        public List<a> a() {
            return this.f;
        }

        public int b() {
            return this.g;
        }

        public String c() {
            return this.b;
        }

        public String toString() {
            return "Sku{mDefaultSku=" + this.a + ", mSkuCode='" + this.b + "', mSkuDesc='" + this.f6945c + "', mDefaultPackageCode='" + this.d + "', mSurfaceType=" + this.f6946e + ", mImageList=" + this.f + ", mRangle=" + this.g + '}';
        }
    }

    public String getDeviceName() {
        return this.mDeviceName;
    }

    public String getImageUrl() {
        return this.mImageUrl;
    }

    public List<b> getSkuList() {
        return this.mSkuList;
    }

    public String getSlogan() {
        return this.mSlogan;
    }

    public void setDeviceName(String str) {
        this.mDeviceName = str;
    }

    public void setImageUrl(String str) {
        this.mImageUrl = str;
    }

    public void setSkuList(List<b> list) {
        this.mSkuList = list;
    }

    public void setSlogan(String str) {
        this.mSlogan = str;
    }

    public String toString() {
        return "WatchDetailInfo{mDeviceName='" + this.mDeviceName + "', mSlogan='" + this.mSlogan + "', mImageUrl='" + this.mImageUrl + "', mSkuList=" + this.mSkuList + '}';
    }
}
