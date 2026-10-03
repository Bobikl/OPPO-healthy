package com.heytap.health.esim.nsc.dto;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.health.esim.R$string;
import com.heytap.health.esim.nsc.utils.NSCHelper;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.t04;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b8\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010:\u001a\u00020\tHÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010/J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\tHÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0018HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\tHÆ\u0003J\t\u0010H\u001a\u00020\u000bHÆ\u0003J\t\u0010I\u001a\u00020\u000bHÆ\u0003J\t\u0010J\u001a\u00020\u000bHÆ\u0003JÔ\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0018HÆ\u0001¢\u0006\u0002\u0010LJ\u0006\u0010M\u001a\u00020\u0003J\t\u0010N\u001a\u00020\tHÖ\u0001J\u0013\u0010O\u001a\u00020\u00182\b\u0010P\u001a\u0004\u0018\u00010QHÖ\u0003J\t\u0010R\u001a\u00020\tHÖ\u0001J\u0006\u0010S\u001a\u00020\u0018J\u0006\u0010T\u001a\u00020\u0018J\u0006\u0010U\u001a\u00020\u0018J\u0006\u0010V\u001a\u00020\u0018J\u0006\u0010W\u001a\u00020\u0018J\u0006\u0010X\u001a\u00020\u0018J\u0006\u0010Y\u001a\u00020ZJ\u0006\u0010[\u001a\u00020ZJ\u0006\u0010\\\u001a\u00020\u0003J\u0006\u0010]\u001a\u00020\u0003J\u0006\u0010^\u001a\u00020\tJ\u000e\u0010_\u001a\u00020\u00032\u0006\u0010`\u001a\u00020aJ\u0006\u0010b\u001a\u00020\u0003J\u0006\u0010c\u001a\u00020\u0003J\t\u0010d\u001a\u00020\u0003HÖ\u0001J\u0019\u0010e\u001a\u00020Z2\u0006\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001e\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010#R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u0010\u0015\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001b\"\u0004\b6\u0010#R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001e¨\u0006i"}, d2 = {"Lcom/heytap/health/esim/nsc/dto/UserCombo;", "Landroid/os/Parcelable;", "id", "", DBHealthReviewPlan.DESC, "name", ServiceNodeBundleKeys.DEVICE_NAME, SensorsBean.PRICE, "comboType", "", "expireTime", "", "currentTimeMillis", "usageUpdateTime", "dataSyncDesc", "dataUsage", "comboSize", "renewalState", "iccid", "mac", "eid", "status", "imei", "selected", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJJLjava/lang/String;IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Z)V", "getComboSize", "()I", "getComboType", "getCurrentTimeMillis", "()J", "getDataSyncDesc", "()Ljava/lang/String;", "getDataUsage", "setDataUsage", "(I)V", "getDesc", "getDeviceName", "getEid", "getExpireTime", "getIccid", "getId", "getImei", "getMac", "getName", "getPrice", "getRenewalState", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSelected", "()Z", "setSelected", "(Z)V", "getStatus", "setStatus", "getUsageUpdateTime", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJJLjava/lang/String;IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Z)Lcom/heytap/health/esim/nsc/dto/UserCombo;", "dataTrafficUpdateTime", "describeContents", "equals", "other", "", "hashCode", "isAutoRenewal", "isNotValid", "isOrderFailed", "isPackage", "isToBeActive", "isValid", "markOrderFailed", "", "markStateToBeActive", "showDataTotal", "showDataUsage", "showDataUsageSize", "showDesc", "context", "Landroid/content/Context;", "showExpireTime", "showPrice", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UserCombo implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<UserCombo> CREATOR = new a();

    @SerializedName("comboSize")
    private final int comboSize;

    @SerializedName("comboType")
    private final int comboType;

    @SerializedName("currentTimeMillis")
    private final long currentTimeMillis;

    @SerializedName("dataSyncDesc")
    @Nullable
    private final String dataSyncDesc;

    @SerializedName("dataUsage")
    private int dataUsage;

    @SerializedName("comboDesc")
    @NotNull
    private final String desc;

    @SerializedName(ServiceNodeBundleKeys.DEVICE_NAME)
    @Nullable
    private final String deviceName;

    @SerializedName("eid")
    @NotNull
    private final String eid;

    @SerializedName("disPlayExpireTime")
    private final long expireTime;

    @SerializedName("iccid")
    @Nullable
    private final String iccid;

    @SerializedName("comboThirdId")
    @NotNull
    private final String id;

    @SerializedName("imei")
    @NotNull
    private final String imei;

    @SerializedName(t04.DEVICE_UNIQUE_ID)
    @NotNull
    private final String mac;

    @SerializedName("comboName")
    @NotNull
    private final String name;

    @SerializedName("comboPrice")
    @NotNull
    private final String price;

    @SerializedName("renewalState")
    @Nullable
    private final Integer renewalState;
    private boolean selected;

    @SerializedName("status")
    private int status;

    @SerializedName("dataSyncTime")
    private final long usageUpdateTime;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserCombo> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UserCombo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserCombo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UserCombo[] newArray(int i) {
            return new UserCombo[i];
        }
    }

    public UserCombo(@NotNull String id, @NotNull String desc, @NotNull String name, @Nullable String str, @NotNull String price, int i, long j2, long j3, long j4, @Nullable String str2, int i2, int i3, @Nullable Integer num, @Nullable String str3, @NotNull String mac, @NotNull String eid, int i4, @NotNull String imei, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(eid, "eid");
        Intrinsics.checkNotNullParameter(imei, "imei");
        this.id = id;
        this.desc = desc;
        this.name = name;
        this.deviceName = str;
        this.price = price;
        this.comboType = i;
        this.expireTime = j2;
        this.currentTimeMillis = j3;
        this.usageUpdateTime = j4;
        this.dataSyncDesc = str2;
        this.dataUsage = i2;
        this.comboSize = i3;
        this.renewalState = num;
        this.iccid = str3;
        this.mac = mac;
        this.eid = eid;
        this.status = i4;
        this.imei = imei;
        this.selected = z;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDataSyncDesc() {
        return this.dataSyncDesc;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getDataUsage() {
        return this.dataUsage;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getComboSize() {
        return this.comboSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getRenewalState() {
        return this.renewalState;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getIccid() {
        return this.iccid;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getEid() {
        return this.eid;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getImei() {
        return this.imei;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getComboType() {
        return this.comboType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getExpireTime() {
        return this.expireTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getCurrentTimeMillis() {
        return this.currentTimeMillis;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getUsageUpdateTime() {
        return this.usageUpdateTime;
    }

    @NotNull
    public final UserCombo copy(@NotNull String id, @NotNull String desc, @NotNull String name, @Nullable String deviceName, @NotNull String price, int comboType, long expireTime, long currentTimeMillis, long usageUpdateTime, @Nullable String dataSyncDesc, int dataUsage, int comboSize, @Nullable Integer renewalState, @Nullable String iccid, @NotNull String mac, @NotNull String eid, int status, @NotNull String imei, boolean selected) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(eid, "eid");
        Intrinsics.checkNotNullParameter(imei, "imei");
        return new UserCombo(id, desc, name, deviceName, price, comboType, expireTime, currentTimeMillis, usageUpdateTime, dataSyncDesc, dataUsage, comboSize, renewalState, iccid, mac, eid, status, imei, selected);
    }

    @NotNull
    public final String dataTrafficUpdateTime() {
        return !isValid() ? qtf.o(R$string.esim_redtea_combo_detal_usage_update_time, "--") : qtf.o(R$string.esim_redtea_combo_detal_usage_update_time, NSCHelper.INSTANCE.g(this.usageUpdateTime));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserCombo)) {
            return false;
        }
        UserCombo userCombo = (UserCombo) other;
        return Intrinsics.areEqual(this.id, userCombo.id) && Intrinsics.areEqual(this.desc, userCombo.desc) && Intrinsics.areEqual(this.name, userCombo.name) && Intrinsics.areEqual(this.deviceName, userCombo.deviceName) && Intrinsics.areEqual(this.price, userCombo.price) && this.comboType == userCombo.comboType && this.expireTime == userCombo.expireTime && this.currentTimeMillis == userCombo.currentTimeMillis && this.usageUpdateTime == userCombo.usageUpdateTime && Intrinsics.areEqual(this.dataSyncDesc, userCombo.dataSyncDesc) && this.dataUsage == userCombo.dataUsage && this.comboSize == userCombo.comboSize && Intrinsics.areEqual(this.renewalState, userCombo.renewalState) && Intrinsics.areEqual(this.iccid, userCombo.iccid) && Intrinsics.areEqual(this.mac, userCombo.mac) && Intrinsics.areEqual(this.eid, userCombo.eid) && this.status == userCombo.status && Intrinsics.areEqual(this.imei, userCombo.imei) && this.selected == userCombo.selected;
    }

    public final int getComboSize() {
        return this.comboSize;
    }

    public final int getComboType() {
        return this.comboType;
    }

    public final long getCurrentTimeMillis() {
        return this.currentTimeMillis;
    }

    @Nullable
    public final String getDataSyncDesc() {
        return this.dataSyncDesc;
    }

    public final int getDataUsage() {
        return this.dataUsage;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    public final String getEid() {
        return this.eid;
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    @Nullable
    public final String getIccid() {
        return this.iccid;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getImei() {
        return this.imei;
    }

    @NotNull
    public final String getMac() {
        return this.mac;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final Integer getRenewalState() {
        return this.renewalState;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getUsageUpdateTime() {
        return this.usageUpdateTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.desc.hashCode()) * 31) + this.name.hashCode()) * 31;
        String str = this.deviceName;
        int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.price.hashCode()) * 31) + Integer.hashCode(this.comboType)) * 31) + Long.hashCode(this.expireTime)) * 31) + Long.hashCode(this.currentTimeMillis)) * 31) + Long.hashCode(this.usageUpdateTime)) * 31;
        String str2 = this.dataSyncDesc;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.dataUsage)) * 31) + Integer.hashCode(this.comboSize)) * 31;
        Integer num = this.renewalState;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.iccid;
        int iHashCode5 = (((((((((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.mac.hashCode()) * 31) + this.eid.hashCode()) * 31) + Integer.hashCode(this.status)) * 31) + this.imei.hashCode()) * 31;
        boolean z = this.selected;
        ?? r5 = z;
        if (z) {
            r5 = 1;
        }
        return iHashCode5 + r5;
    }

    public final boolean isAutoRenewal() {
        Integer num = this.renewalState;
        return num != null && num.intValue() == 1;
    }

    public final boolean isNotValid() {
        int i = this.status;
        return i == 3 || i == 4;
    }

    public final boolean isOrderFailed() {
        return this.status == -1;
    }

    public final boolean isPackage() {
        return this.comboType == 1;
    }

    public final boolean isToBeActive() {
        return this.status == 1;
    }

    public final boolean isValid() {
        return this.status == 2;
    }

    public final void markOrderFailed() {
        this.status = -1;
    }

    public final void markStateToBeActive() {
        this.status = 1;
    }

    public final void setDataUsage(int i) {
        this.dataUsage = i;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    @NotNull
    public final String showDataTotal() {
        return NSCHelper.INSTANCE.c(Integer.valueOf(RangesKt___RangesKt.coerceAtLeast(this.comboSize, 0)));
    }

    @NotNull
    public final String showDataUsage() {
        return NSCHelper.INSTANCE.c(Integer.valueOf(showDataUsageSize()));
    }

    public final int showDataUsageSize() {
        return RangesKt___RangesKt.coerceAtMost(RangesKt___RangesKt.coerceAtLeast(this.dataUsage, 0), this.comboSize);
    }

    @NotNull
    public final String showDesc(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (isPackage()) {
            String string = context.getString(R$string.esim_redtea_user_combo_detail_package_desc, showDataTotal(), showExpireTime());
            Intrinsics.checkNotNullExpressionValue(string, "{\n        context.getStr…, showExpireTime())\n    }");
            return string;
        }
        String string2 = context.getString(R$string.esim_redtea_user_combo_manager_auto_pay_desc, showPrice());
        Intrinsics.checkNotNullExpressionValue(string2, "{\n        context.getStr…_desc, showPrice())\n    }");
        return string2;
    }

    @NotNull
    public final String showExpireTime() {
        return NSCHelper.INSTANCE.i(this.expireTime);
    }

    @NotNull
    public final String showPrice() {
        return this.price;
    }

    @NotNull
    public String toString() {
        return "UserCombo(id=" + this.id + ", desc=" + this.desc + ", name=" + this.name + ", deviceName=" + this.deviceName + ", price=" + this.price + ", comboType=" + this.comboType + ", expireTime=" + this.expireTime + ", currentTimeMillis=" + this.currentTimeMillis + ", usageUpdateTime=" + this.usageUpdateTime + ", dataSyncDesc=" + this.dataSyncDesc + ", dataUsage=" + this.dataUsage + ", comboSize=" + this.comboSize + ", renewalState=" + this.renewalState + ", iccid=" + this.iccid + ", mac=" + this.mac + ", eid=" + this.eid + ", status=" + this.status + ", imei=" + this.imei + ", selected=" + this.selected + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.desc);
        parcel.writeString(this.name);
        parcel.writeString(this.deviceName);
        parcel.writeString(this.price);
        parcel.writeInt(this.comboType);
        parcel.writeLong(this.expireTime);
        parcel.writeLong(this.currentTimeMillis);
        parcel.writeLong(this.usageUpdateTime);
        parcel.writeString(this.dataSyncDesc);
        parcel.writeInt(this.dataUsage);
        parcel.writeInt(this.comboSize);
        Integer num = this.renewalState;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.iccid);
        parcel.writeString(this.mac);
        parcel.writeString(this.eid);
        parcel.writeInt(this.status);
        parcel.writeString(this.imei);
        parcel.writeInt(this.selected ? 1 : 0);
    }
}
