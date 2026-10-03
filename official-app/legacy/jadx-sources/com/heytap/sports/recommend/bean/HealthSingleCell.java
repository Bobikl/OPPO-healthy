package com.heytap.sports.recommend.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\tHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\tHÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0015¨\u0006)"}, d2 = {"Lcom/heytap/sports/recommend/bean/HealthSingleCell;", "Landroid/os/Parcelable;", "healthId", "Lcom/heytap/sports/recommend/bean/BaseCellId;", "isNor", "Lcom/heytap/sports/recommend/bean/NormalStatus;", "healthLevel", "Lcom/heytap/sports/recommend/bean/HealthCellStatus;", "healthValue", "", "bloodPreData", "Lcom/heytap/sports/recommend/bean/BloodPressureData;", "(Lcom/heytap/sports/recommend/bean/BaseCellId;Lcom/heytap/sports/recommend/bean/NormalStatus;Lcom/heytap/sports/recommend/bean/HealthCellStatus;ILcom/heytap/sports/recommend/bean/BloodPressureData;)V", "getBloodPreData", "()Lcom/heytap/sports/recommend/bean/BloodPressureData;", "getHealthId", "()Lcom/heytap/sports/recommend/bean/BaseCellId;", "getHealthLevel", "()Lcom/heytap/sports/recommend/bean/HealthCellStatus;", "getHealthValue", "()I", "()Lcom/heytap/sports/recommend/bean/NormalStatus;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HealthSingleCell implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<HealthSingleCell> CREATOR = new a();

    @Nullable
    private final BloodPressureData bloodPreData;

    @NotNull
    private final BaseCellId healthId;

    @NotNull
    private final HealthCellStatus healthLevel;
    private final int healthValue;

    @NotNull
    private final NormalStatus isNor;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HealthSingleCell> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HealthSingleCell createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HealthSingleCell(BaseCellId.valueOf(parcel.readString()), NormalStatus.valueOf(parcel.readString()), HealthCellStatus.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt() == 0 ? null : BloodPressureData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HealthSingleCell[] newArray(int i) {
            return new HealthSingleCell[i];
        }
    }

    public HealthSingleCell() {
        this(null, null, null, 0, null, 31, null);
    }

    public static /* synthetic */ HealthSingleCell copy$default(HealthSingleCell healthSingleCell, BaseCellId baseCellId, NormalStatus normalStatus, HealthCellStatus healthCellStatus, int i, BloodPressureData bloodPressureData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            baseCellId = healthSingleCell.healthId;
        }
        if ((i2 & 2) != 0) {
            normalStatus = healthSingleCell.isNor;
        }
        NormalStatus normalStatus2 = normalStatus;
        if ((i2 & 4) != 0) {
            healthCellStatus = healthSingleCell.healthLevel;
        }
        HealthCellStatus healthCellStatus2 = healthCellStatus;
        if ((i2 & 8) != 0) {
            i = healthSingleCell.healthValue;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            bloodPressureData = healthSingleCell.bloodPreData;
        }
        return healthSingleCell.copy(baseCellId, normalStatus2, healthCellStatus2, i3, bloodPressureData);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BaseCellId getHealthId() {
        return this.healthId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NormalStatus getIsNor() {
        return this.isNor;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HealthCellStatus getHealthLevel() {
        return this.healthLevel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHealthValue() {
        return this.healthValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BloodPressureData getBloodPreData() {
        return this.bloodPreData;
    }

    @NotNull
    public final HealthSingleCell copy(@NotNull BaseCellId healthId, @NotNull NormalStatus isNor, @NotNull HealthCellStatus healthLevel, int healthValue, @Nullable BloodPressureData bloodPreData) {
        Intrinsics.checkNotNullParameter(healthId, "healthId");
        Intrinsics.checkNotNullParameter(isNor, "isNor");
        Intrinsics.checkNotNullParameter(healthLevel, "healthLevel");
        return new HealthSingleCell(healthId, isNor, healthLevel, healthValue, bloodPreData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthSingleCell)) {
            return false;
        }
        HealthSingleCell healthSingleCell = (HealthSingleCell) other;
        return this.healthId == healthSingleCell.healthId && this.isNor == healthSingleCell.isNor && this.healthLevel == healthSingleCell.healthLevel && this.healthValue == healthSingleCell.healthValue && Intrinsics.areEqual(this.bloodPreData, healthSingleCell.bloodPreData);
    }

    @Nullable
    public final BloodPressureData getBloodPreData() {
        return this.bloodPreData;
    }

    @NotNull
    public final BaseCellId getHealthId() {
        return this.healthId;
    }

    @NotNull
    public final HealthCellStatus getHealthLevel() {
        return this.healthLevel;
    }

    public final int getHealthValue() {
        return this.healthValue;
    }

    public int hashCode() {
        int iHashCode = ((((((this.healthId.hashCode() * 31) + this.isNor.hashCode()) * 31) + this.healthLevel.hashCode()) * 31) + Integer.hashCode(this.healthValue)) * 31;
        BloodPressureData bloodPressureData = this.bloodPreData;
        return iHashCode + (bloodPressureData == null ? 0 : bloodPressureData.hashCode());
    }

    @NotNull
    public final NormalStatus isNor() {
        return this.isNor;
    }

    @NotNull
    public String toString() {
        return "HealthSingleCell(healthId=" + this.healthId + ", isNor=" + this.isNor + ", healthLevel=" + this.healthLevel + ", healthValue=" + this.healthValue + ", bloodPreData=" + this.bloodPreData + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.healthId.name());
        parcel.writeString(this.isNor.name());
        parcel.writeString(this.healthLevel.name());
        parcel.writeInt(this.healthValue);
        BloodPressureData bloodPressureData = this.bloodPreData;
        if (bloodPressureData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bloodPressureData.writeToParcel(parcel, flags);
        }
    }

    public HealthSingleCell(@NotNull BaseCellId healthId, @NotNull NormalStatus isNor, @NotNull HealthCellStatus healthLevel, int i, @Nullable BloodPressureData bloodPressureData) {
        Intrinsics.checkNotNullParameter(healthId, "healthId");
        Intrinsics.checkNotNullParameter(isNor, "isNor");
        Intrinsics.checkNotNullParameter(healthLevel, "healthLevel");
        this.healthId = healthId;
        this.isNor = isNor;
        this.healthLevel = healthLevel;
        this.healthValue = i;
        this.bloodPreData = bloodPressureData;
    }

    public /* synthetic */ HealthSingleCell(BaseCellId baseCellId, NormalStatus normalStatus, HealthCellStatus healthCellStatus, int i, BloodPressureData bloodPressureData, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? BaseCellId.B_NULL : baseCellId, (i2 & 2) != 0 ? NormalStatus.LEVEL_NONE : normalStatus, (i2 & 4) != 0 ? HealthCellStatus.HEALTH_NULL : healthCellStatus, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : bloodPressureData);
    }
}
