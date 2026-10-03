package com.heytap.sports.recommend.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003¢\u0006\u0002\u0010\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\nHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u008f\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u0003HÆ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u00020\u0003HÖ\u0001J\t\u0010=\u001a\u00020>HÖ\u0001J\u0019\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018¨\u0006D"}, d2 = {"Lcom/heytap/sports/recommend/bean/HealthStatus;", "Landroid/os/Parcelable;", "updateTimestamp", "", "health", "Lcom/heytap/sports/recommend/bean/MotionHealthStatus;", "afterMotion", "Lcom/heytap/sports/recommend/bean/MotionPostSportsStatus;", "abnormalNum", "mainEntry", "Lcom/heytap/sports/recommend/bean/StatusEntry;", "secondEntry", "dataCell", "", "Lcom/heytap/sports/recommend/bean/HealthCell;", UTraceSQLiteHelperKt.COL_INFO, "Lcom/heytap/sports/recommend/bean/SportWorkingInfo;", "hrInfo", "Lcom/heytap/sports/recommend/bean/BaseHrInfo;", "request", "version", "backIsInvalid", "(ILcom/heytap/sports/recommend/bean/MotionHealthStatus;Lcom/heytap/sports/recommend/bean/MotionPostSportsStatus;ILcom/heytap/sports/recommend/bean/StatusEntry;Lcom/heytap/sports/recommend/bean/StatusEntry;Ljava/util/List;Lcom/heytap/sports/recommend/bean/SportWorkingInfo;Lcom/heytap/sports/recommend/bean/BaseHrInfo;III)V", "getAbnormalNum", "()I", "getAfterMotion", "()Lcom/heytap/sports/recommend/bean/MotionPostSportsStatus;", "getBackIsInvalid", "getDataCell", "()Ljava/util/List;", "getHealth", "()Lcom/heytap/sports/recommend/bean/MotionHealthStatus;", "getHrInfo", "()Lcom/heytap/sports/recommend/bean/BaseHrInfo;", "getInfo", "()Lcom/heytap/sports/recommend/bean/SportWorkingInfo;", "getMainEntry", "()Lcom/heytap/sports/recommend/bean/StatusEntry;", "getRequest", "getSecondEntry", "getUpdateTimestamp", "getVersion", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HealthStatus implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<HealthStatus> CREATOR = new a();
    private final int abnormalNum;

    @Nullable
    private final MotionPostSportsStatus afterMotion;
    private final int backIsInvalid;

    @NotNull
    private final List<HealthCell> dataCell;

    @NotNull
    private final MotionHealthStatus health;

    @Nullable
    private final BaseHrInfo hrInfo;

    @Nullable
    private final SportWorkingInfo info;

    @NotNull
    private final StatusEntry mainEntry;
    private final int request;

    @Nullable
    private final StatusEntry secondEntry;
    private final int updateTimestamp;
    private final int version;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HealthStatus> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HealthStatus createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            MotionHealthStatus motionHealthStatusValueOf = MotionHealthStatus.valueOf(parcel.readString());
            MotionPostSportsStatus motionPostSportsStatusValueOf = parcel.readInt() == 0 ? null : MotionPostSportsStatus.valueOf(parcel.readString());
            int i2 = parcel.readInt();
            Parcelable.Creator<StatusEntry> creator = StatusEntry.CREATOR;
            StatusEntry statusEntryCreateFromParcel = creator.createFromParcel(parcel);
            StatusEntry statusEntryCreateFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList.add(HealthCell.CREATOR.createFromParcel(parcel));
            }
            return new HealthStatus(i, motionHealthStatusValueOf, motionPostSportsStatusValueOf, i2, statusEntryCreateFromParcel, statusEntryCreateFromParcel2, arrayList, parcel.readInt() == 0 ? null : SportWorkingInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BaseHrInfo.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HealthStatus[] newArray(int i) {
            return new HealthStatus[i];
        }
    }

    public HealthStatus() {
        this(0, null, null, 0, null, null, null, null, null, 0, 0, 0, 4095, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getBackIsInvalid() {
        return this.backIsInvalid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MotionHealthStatus getHealth() {
        return this.health;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MotionPostSportsStatus getAfterMotion() {
        return this.afterMotion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAbnormalNum() {
        return this.abnormalNum;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final StatusEntry getMainEntry() {
        return this.mainEntry;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final StatusEntry getSecondEntry() {
        return this.secondEntry;
    }

    @NotNull
    public final List<HealthCell> component7() {
        return this.dataCell;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final SportWorkingInfo getInfo() {
        return this.info;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BaseHrInfo getHrInfo() {
        return this.hrInfo;
    }

    @NotNull
    public final HealthStatus copy(int updateTimestamp, @NotNull MotionHealthStatus health, @Nullable MotionPostSportsStatus afterMotion, int abnormalNum, @NotNull StatusEntry mainEntry, @Nullable StatusEntry secondEntry, @NotNull List<HealthCell> dataCell, @Nullable SportWorkingInfo info, @Nullable BaseHrInfo hrInfo, int request, int version, int backIsInvalid) {
        Intrinsics.checkNotNullParameter(health, "health");
        Intrinsics.checkNotNullParameter(mainEntry, "mainEntry");
        Intrinsics.checkNotNullParameter(dataCell, "dataCell");
        return new HealthStatus(updateTimestamp, health, afterMotion, abnormalNum, mainEntry, secondEntry, dataCell, info, hrInfo, request, version, backIsInvalid);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthStatus)) {
            return false;
        }
        HealthStatus healthStatus = (HealthStatus) other;
        return this.updateTimestamp == healthStatus.updateTimestamp && this.health == healthStatus.health && this.afterMotion == healthStatus.afterMotion && this.abnormalNum == healthStatus.abnormalNum && Intrinsics.areEqual(this.mainEntry, healthStatus.mainEntry) && Intrinsics.areEqual(this.secondEntry, healthStatus.secondEntry) && Intrinsics.areEqual(this.dataCell, healthStatus.dataCell) && Intrinsics.areEqual(this.info, healthStatus.info) && Intrinsics.areEqual(this.hrInfo, healthStatus.hrInfo) && this.request == healthStatus.request && this.version == healthStatus.version && this.backIsInvalid == healthStatus.backIsInvalid;
    }

    public final int getAbnormalNum() {
        return this.abnormalNum;
    }

    @Nullable
    public final MotionPostSportsStatus getAfterMotion() {
        return this.afterMotion;
    }

    public final int getBackIsInvalid() {
        return this.backIsInvalid;
    }

    @NotNull
    public final List<HealthCell> getDataCell() {
        return this.dataCell;
    }

    @NotNull
    public final MotionHealthStatus getHealth() {
        return this.health;
    }

    @Nullable
    public final BaseHrInfo getHrInfo() {
        return this.hrInfo;
    }

    @Nullable
    public final SportWorkingInfo getInfo() {
        return this.info;
    }

    @NotNull
    public final StatusEntry getMainEntry() {
        return this.mainEntry;
    }

    public final int getRequest() {
        return this.request;
    }

    @Nullable
    public final StatusEntry getSecondEntry() {
        return this.secondEntry;
    }

    public final int getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.updateTimestamp) * 31) + this.health.hashCode()) * 31;
        MotionPostSportsStatus motionPostSportsStatus = this.afterMotion;
        int iHashCode2 = (((((iHashCode + (motionPostSportsStatus == null ? 0 : motionPostSportsStatus.hashCode())) * 31) + Integer.hashCode(this.abnormalNum)) * 31) + this.mainEntry.hashCode()) * 31;
        StatusEntry statusEntry = this.secondEntry;
        int iHashCode3 = (((iHashCode2 + (statusEntry == null ? 0 : statusEntry.hashCode())) * 31) + this.dataCell.hashCode()) * 31;
        SportWorkingInfo sportWorkingInfo = this.info;
        int iHashCode4 = (iHashCode3 + (sportWorkingInfo == null ? 0 : sportWorkingInfo.hashCode())) * 31;
        BaseHrInfo baseHrInfo = this.hrInfo;
        return ((((((iHashCode4 + (baseHrInfo != null ? baseHrInfo.hashCode() : 0)) * 31) + Integer.hashCode(this.request)) * 31) + Integer.hashCode(this.version)) * 31) + Integer.hashCode(this.backIsInvalid);
    }

    @NotNull
    public String toString() {
        return "HealthStatus(updateTimestamp=" + this.updateTimestamp + ", health=" + this.health + ", afterMotion=" + this.afterMotion + ", abnormalNum=" + this.abnormalNum + ", mainEntry=" + this.mainEntry + ", secondEntry=" + this.secondEntry + ", dataCell=" + this.dataCell + ", info=" + this.info + ", hrInfo=" + this.hrInfo + ", request=" + this.request + ", version=" + this.version + ", backIsInvalid=" + this.backIsInvalid + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.updateTimestamp);
        parcel.writeString(this.health.name());
        MotionPostSportsStatus motionPostSportsStatus = this.afterMotion;
        if (motionPostSportsStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(motionPostSportsStatus.name());
        }
        parcel.writeInt(this.abnormalNum);
        this.mainEntry.writeToParcel(parcel, flags);
        StatusEntry statusEntry = this.secondEntry;
        if (statusEntry == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            statusEntry.writeToParcel(parcel, flags);
        }
        List<HealthCell> list = this.dataCell;
        parcel.writeInt(list.size());
        Iterator<HealthCell> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        SportWorkingInfo sportWorkingInfo = this.info;
        if (sportWorkingInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sportWorkingInfo.writeToParcel(parcel, flags);
        }
        BaseHrInfo baseHrInfo = this.hrInfo;
        if (baseHrInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseHrInfo.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.request);
        parcel.writeInt(this.version);
        parcel.writeInt(this.backIsInvalid);
    }

    public HealthStatus(int i, @NotNull MotionHealthStatus health, @Nullable MotionPostSportsStatus motionPostSportsStatus, int i2, @NotNull StatusEntry mainEntry, @Nullable StatusEntry statusEntry, @NotNull List<HealthCell> dataCell, @Nullable SportWorkingInfo sportWorkingInfo, @Nullable BaseHrInfo baseHrInfo, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(health, "health");
        Intrinsics.checkNotNullParameter(mainEntry, "mainEntry");
        Intrinsics.checkNotNullParameter(dataCell, "dataCell");
        this.updateTimestamp = i;
        this.health = health;
        this.afterMotion = motionPostSportsStatus;
        this.abnormalNum = i2;
        this.mainEntry = mainEntry;
        this.secondEntry = statusEntry;
        this.dataCell = dataCell;
        this.info = sportWorkingInfo;
        this.hrInfo = baseHrInfo;
        this.request = i3;
        this.version = i4;
        this.backIsInvalid = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ HealthStatus(int i, MotionHealthStatus motionHealthStatus, MotionPostSportsStatus motionPostSportsStatus, int i2, StatusEntry statusEntry, StatusEntry statusEntry2, List list, SportWorkingInfo sportWorkingInfo, BaseHrInfo baseHrInfo, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        StatusEntry statusEntry3;
        int i7 = (i6 & 1) != 0 ? 0 : i;
        MotionHealthStatus motionHealthStatus2 = (i6 & 2) != 0 ? MotionHealthStatus.H_NULL : motionHealthStatus;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        MotionPostSportsStatus motionPostSportsStatus2 = (i6 & 4) != 0 ? null : motionPostSportsStatus;
        int i8 = (i6 & 8) != 0 ? 0 : i2;
        if ((i6 & 16) != 0) {
            statusEntry3 = new StatusEntry(objArr2 == true ? 1 : 0, 1, objArr == true ? 1 : 0);
        } else {
            statusEntry3 = statusEntry;
        }
        this(i7, motionHealthStatus2, motionPostSportsStatus2, i8, statusEntry3, (i6 & 32) != 0 ? null : statusEntry2, (i6 & 64) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i6 & 128) != 0 ? null : sportWorkingInfo, (i6 & 256) == 0 ? baseHrInfo : null, (i6 & 512) != 0 ? 0 : i3, (i6 & 1024) != 0 ? 0 : i4, (i6 & 2048) == 0 ? i5 : 0);
    }
}
