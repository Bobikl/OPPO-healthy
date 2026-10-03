package com.oplus.seedling.sdk.serviceconfig;

import android.util.ArrayMap;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001Bc\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\u0010\rBk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\tHÂ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u0015\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\fHÆ\u0003Jo\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\fHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\tHÖ\u0001J\u000e\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020\tJ\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/oplus/seedling/sdk/serviceconfig/SeedlingConfig;", "", "serviceId", "", "name", "des", "previewImgUri", "packageName", "supportEntrance", "", "size", "extraData", "Landroid/util/ArrayMap;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILandroid/util/ArrayMap;)V", "groupTitle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Landroid/util/ArrayMap;)V", "getDes", "()Ljava/lang/String;", "getExtraData", "()Landroid/util/ArrayMap;", "getGroupTitle", "setGroupTitle", "(Ljava/lang/String;)V", "getName", "getPackageName", "getPreviewImgUri", "getServiceId", "getSize", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "isSupportEntrance", "entranceType", "toString", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SeedlingConfig {

    @NotNull
    private final String des;

    @NotNull
    private final ArrayMap<String, Object> extraData;

    @NotNull
    private String groupTitle;

    @NotNull
    private final String name;

    @NotNull
    private final String packageName;

    @NotNull
    private final String previewImgUri;

    @NotNull
    private final String serviceId;
    private final int size;
    private final int supportEntrance;

    public SeedlingConfig() {
        this(null, null, null, null, null, 0, 0, null, null, 511, null);
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    private final int getSupportEntrance() {
        return this.supportEntrance;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDes() {
        return this.des;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPreviewImgUri() {
        return this.previewImgUri;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getGroupTitle() {
        return this.groupTitle;
    }

    @NotNull
    public final ArrayMap<String, Object> component9() {
        return this.extraData;
    }

    @NotNull
    public final SeedlingConfig copy(@NotNull String serviceId, @NotNull String name, @NotNull String des, @NotNull String previewImgUri, @NotNull String packageName, int supportEntrance, int size, @NotNull String groupTitle, @NotNull ArrayMap<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(des, "des");
        Intrinsics.checkNotNullParameter(previewImgUri, "previewImgUri");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(groupTitle, "groupTitle");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        return new SeedlingConfig(serviceId, name, des, previewImgUri, packageName, supportEntrance, size, groupTitle, extraData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeedlingConfig)) {
            return false;
        }
        SeedlingConfig seedlingConfig = (SeedlingConfig) other;
        return Intrinsics.areEqual(this.serviceId, seedlingConfig.serviceId) && Intrinsics.areEqual(this.name, seedlingConfig.name) && Intrinsics.areEqual(this.des, seedlingConfig.des) && Intrinsics.areEqual(this.previewImgUri, seedlingConfig.previewImgUri) && Intrinsics.areEqual(this.packageName, seedlingConfig.packageName) && this.supportEntrance == seedlingConfig.supportEntrance && this.size == seedlingConfig.size && Intrinsics.areEqual(this.groupTitle, seedlingConfig.groupTitle) && Intrinsics.areEqual(this.extraData, seedlingConfig.extraData);
    }

    @NotNull
    public final String getDes() {
        return this.des;
    }

    @NotNull
    public final ArrayMap<String, Object> getExtraData() {
        return this.extraData;
    }

    @NotNull
    public final String getGroupTitle() {
        return this.groupTitle;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final String getPreviewImgUri() {
        return this.previewImgUri;
    }

    @NotNull
    public final String getServiceId() {
        return this.serviceId;
    }

    public final int getSize() {
        return this.size;
    }

    public int hashCode() {
        return (((((((((((((((this.serviceId.hashCode() * 31) + this.name.hashCode()) * 31) + this.des.hashCode()) * 31) + this.previewImgUri.hashCode()) * 31) + this.packageName.hashCode()) * 31) + Integer.hashCode(this.supportEntrance)) * 31) + Integer.hashCode(this.size)) * 31) + this.groupTitle.hashCode()) * 31) + this.extraData.hashCode();
    }

    public final boolean isSupportEntrance(int entranceType) {
        int i = this.supportEntrance;
        return (i & entranceType) == entranceType || i == 0;
    }

    public final void setGroupTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.groupTitle = str;
    }

    @NotNull
    public String toString() {
        return "SeedlingConfig(serviceId=" + this.serviceId + ", name=" + this.name + ", des=" + this.des + ", previewImgUri=" + this.previewImgUri + ", packageName=" + this.packageName + ", supportEntrance=" + this.supportEntrance + ", size=" + this.size + ", groupTitle=" + this.groupTitle + ", extraData=" + this.extraData + ")";
    }

    public SeedlingConfig(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i, int i2, @NotNull String str6, @NotNull ArrayMap<String, Object> arrayMap) {
        Intrinsics.checkNotNullParameter(str, "serviceId");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "des");
        Intrinsics.checkNotNullParameter(str4, "previewImgUri");
        Intrinsics.checkNotNullParameter(str5, "packageName");
        Intrinsics.checkNotNullParameter(str6, "groupTitle");
        Intrinsics.checkNotNullParameter(arrayMap, "extraData");
        this.serviceId = str;
        this.name = str2;
        this.des = str3;
        this.previewImgUri = str4;
        this.packageName = str5;
        this.supportEntrance = i;
        this.size = i2;
        this.groupTitle = str6;
        this.extraData = arrayMap;
    }

    public /* synthetic */ SeedlingConfig(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, ArrayMap arrayMap, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? -1 : i, (i3 & 64) != 0 ? 1000 : i2, (i3 & 128) != 0 ? "" : str6, (i3 & 256) != 0 ? new ArrayMap() : arrayMap);
    }

    public /* synthetic */ SeedlingConfig(String str, String str2, String str3, String str4, String str5, int i, int i2, ArrayMap arrayMap, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? -1 : i, (i3 & 64) != 0 ? 1000 : i2, (i3 & 128) != 0 ? new ArrayMap() : arrayMap);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SeedlingConfig(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i, int i2, @NotNull ArrayMap<String, Object> arrayMap) {
        this(str, str2, str3, str4, str5, i, i2, "", arrayMap);
        Intrinsics.checkNotNullParameter(str, "serviceId");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "des");
        Intrinsics.checkNotNullParameter(str4, "previewImgUri");
        Intrinsics.checkNotNullParameter(str5, "packageName");
        Intrinsics.checkNotNullParameter(arrayMap, "extraData");
    }
}
