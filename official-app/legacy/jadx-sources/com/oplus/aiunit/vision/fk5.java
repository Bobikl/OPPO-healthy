package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002\u0004\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0006R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\b\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0005\u001a\u0004\b\u0015\u0010\u0006R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0005\u001a\u0004\b\u0018\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/fk5;", "", "", "toString", "a", "Ljava/lang/String;", "()Ljava/lang/String;", ServiceNodeBundleKeys.DEVICE_NAME, "b", "getSlogan", "slogan", "c", "getImageUrl", "imageUrl", "", "Lcom/oplus/aiunit/vision/fk5$b;", "d", "Ljava/util/List;", "()Ljava/util/List;", "skuList", MapSchema.FIELD_NAME_ENTRY, "getOobeFileUrl", "oobeFileUrl", "f", "getOobeFileMd5", "oobeFileMd5", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class fk5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName(ServiceNodeBundleKeys.DEVICE_NAME)
    @NotNull
    private final String deviceName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("slogan")
    @NotNull
    private final String slogan;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageUrl")
    @NotNull
    private final String imageUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("skuList")
    @NotNull
    private final List<b> skuList;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("oobeFileUrl")
    @NotNull
    private final String oobeFileUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("oobeFileMd5")
    @NotNull
    private final String oobeFileMd5;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\u0004\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/fk5$a;", "", "", "toString", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "imageUrl", "imageTypeCode", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("imageUrl")
        @NotNull
        private final String imageUrl;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @SerializedName("imageTypeCode")
        @NotNull
        private final String imageTypeCode;

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getImageTypeCode() {
            return this.imageTypeCode;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        public String toString() {
            return "ModelImage{imageUrl='" + this.imageUrl + "', imageTypeCode='" + this.imageTypeCode + "'}";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\n\u0010\u0012R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u000f\u0010\u001e¨\u0006 "}, d2 = {"Lcom/oplus/aiunit/vision/fk5$b;", "", "", "f", "", "toString", "", "hashCode", "other", "equals", "a", "I", "getDefaultSku", "()I", "defaultSku", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", e36.PARAM_SKU_CODE, "d", "skuDesc", "defaultPackageCode", MapSchema.FIELD_NAME_ENTRY, "deviceMarketName", "skuMarketName", "", "Lcom/oplus/aiunit/vision/fk5$a;", b2n.f, "Ljava/util/List;", "()Ljava/util/List;", "imageList", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("defaultSku")
        private final int defaultSku;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @SerializedName(e36.PARAM_SKU_CODE)
        @Nullable
        private final String skuCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @SerializedName("skuDesc")
        @Nullable
        private final String skuDesc;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @SerializedName("defaultPackageCode")
        @Nullable
        private final String defaultPackageCode;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @SerializedName("deviceMarketName")
        @Nullable
        private final String deviceMarketName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        @SerializedName("skuMarketName")
        @Nullable
        private final String skuMarketName;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @SerializedName("imageList")
        @Nullable
        private final List<a> imageList;

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDeviceMarketName() {
            return this.deviceMarketName;
        }

        @Nullable
        public final List<a> b() {
            return this.imageList;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSkuCode() {
            return this.skuCode;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSkuDesc() {
            return this.skuDesc;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSkuMarketName() {
            return this.skuMarketName;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.defaultSku == bVar.defaultSku && Intrinsics.areEqual(this.skuCode, bVar.skuCode) && Intrinsics.areEqual(this.skuDesc, bVar.skuDesc) && Intrinsics.areEqual(this.defaultPackageCode, bVar.defaultPackageCode) && Intrinsics.areEqual(this.deviceMarketName, bVar.deviceMarketName) && Intrinsics.areEqual(this.skuMarketName, bVar.skuMarketName) && Intrinsics.areEqual(this.imageList, bVar.imageList);
        }

        public final boolean f() {
            return this.defaultSku == 1;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.defaultSku) * 31;
            String str = this.skuCode;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.skuDesc;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.defaultPackageCode;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.deviceMarketName;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.skuMarketName;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            List<a> list = this.imageList;
            return iHashCode6 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ModelSku{defaultSku=" + this.defaultSku + ", skuCode='" + this.skuCode + "', skuDesc='" + this.skuDesc + "', defaultPackageCode='" + this.defaultPackageCode + "', deviceMarketName='" + this.deviceMarketName + "', skuMarketName='" + this.skuMarketName + "'}";
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    public final List<b> b() {
        return this.skuList;
    }

    @NotNull
    public String toString() {
        return "DeviceModelDetailRsp{deviceName='" + this.deviceName + "', slogan='" + this.slogan + "', skuList=" + this.skuList + "}";
    }
}
