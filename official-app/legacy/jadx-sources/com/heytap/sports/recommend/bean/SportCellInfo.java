package com.heytap.sports.recommend.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006'"}, d2 = {"Lcom/heytap/sports/recommend/bean/SportCellInfo;", "Landroid/os/Parcelable;", "startTime", "", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "duration", "avgHr", "kcal", "sportStrength", "Lcom/heytap/sports/recommend/bean/MotionPostSportsStatus;", "(IIIIILcom/heytap/sports/recommend/bean/MotionPostSportsStatus;)V", "getAvgHr", "()I", "getDuration", "getKcal", "getSportMode", "getSportStrength", "()Lcom/heytap/sports/recommend/bean/MotionPostSportsStatus;", "getStartTime", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SportCellInfo implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<SportCellInfo> CREATOR = new a();
    private final int avgHr;
    private final int duration;
    private final int kcal;
    private final int sportMode;

    @NotNull
    private final MotionPostSportsStatus sportStrength;
    private final int startTime;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SportCellInfo> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SportCellInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SportCellInfo(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), MotionPostSportsStatus.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SportCellInfo[] newArray(int i) {
            return new SportCellInfo[i];
        }
    }

    public SportCellInfo() {
        this(0, 0, 0, 0, 0, null, 63, null);
    }

    public static /* synthetic */ SportCellInfo copy$default(SportCellInfo sportCellInfo, int i, int i2, int i3, int i4, int i5, MotionPostSportsStatus motionPostSportsStatus, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = sportCellInfo.startTime;
        }
        if ((i6 & 2) != 0) {
            i2 = sportCellInfo.sportMode;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = sportCellInfo.duration;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = sportCellInfo.avgHr;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = sportCellInfo.kcal;
        }
        int i10 = i5;
        if ((i6 & 32) != 0) {
            motionPostSportsStatus = sportCellInfo.sportStrength;
        }
        return sportCellInfo.copy(i, i7, i8, i9, i10, motionPostSportsStatus);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSportMode() {
        return this.sportMode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAvgHr() {
        return this.avgHr;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getKcal() {
        return this.kcal;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MotionPostSportsStatus getSportStrength() {
        return this.sportStrength;
    }

    @NotNull
    public final SportCellInfo copy(int startTime, int sportMode, int duration, int avgHr, int kcal, @NotNull MotionPostSportsStatus sportStrength) {
        Intrinsics.checkNotNullParameter(sportStrength, "sportStrength");
        return new SportCellInfo(startTime, sportMode, duration, avgHr, kcal, sportStrength);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportCellInfo)) {
            return false;
        }
        SportCellInfo sportCellInfo = (SportCellInfo) other;
        return this.startTime == sportCellInfo.startTime && this.sportMode == sportCellInfo.sportMode && this.duration == sportCellInfo.duration && this.avgHr == sportCellInfo.avgHr && this.kcal == sportCellInfo.kcal && this.sportStrength == sportCellInfo.sportStrength;
    }

    public final int getAvgHr() {
        return this.avgHr;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getKcal() {
        return this.kcal;
    }

    public final int getSportMode() {
        return this.sportMode;
    }

    @NotNull
    public final MotionPostSportsStatus getSportStrength() {
        return this.sportStrength;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.startTime) * 31) + Integer.hashCode(this.sportMode)) * 31) + Integer.hashCode(this.duration)) * 31) + Integer.hashCode(this.avgHr)) * 31) + Integer.hashCode(this.kcal)) * 31) + this.sportStrength.hashCode();
    }

    @NotNull
    public String toString() {
        return "SportCellInfo(startTime=" + this.startTime + ", sportMode=" + this.sportMode + ", duration=" + this.duration + ", avgHr=" + this.avgHr + ", kcal=" + this.kcal + ", sportStrength=" + this.sportStrength + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.startTime);
        parcel.writeInt(this.sportMode);
        parcel.writeInt(this.duration);
        parcel.writeInt(this.avgHr);
        parcel.writeInt(this.kcal);
        parcel.writeString(this.sportStrength.name());
    }

    public SportCellInfo(int i, int i2, int i3, int i4, int i5, @NotNull MotionPostSportsStatus sportStrength) {
        Intrinsics.checkNotNullParameter(sportStrength, "sportStrength");
        this.startTime = i;
        this.sportMode = i2;
        this.duration = i3;
        this.avgHr = i4;
        this.kcal = i5;
        this.sportStrength = sportStrength;
    }

    public /* synthetic */ SportCellInfo(int i, int i2, int i3, int i4, int i5, MotionPostSportsStatus motionPostSportsStatus, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5, (i6 & 32) != 0 ? MotionPostSportsStatus.P_NULL : motionPostSportsStatus);
    }
}
