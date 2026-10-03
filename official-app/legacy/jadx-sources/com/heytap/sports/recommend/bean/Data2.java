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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003JI\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006&"}, d2 = {"Lcom/heytap/sports/recommend/bean/Data2;", "Landroid/os/Parcelable;", "duration", "", "sportModeType", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "", "intensityMin", "intensityMax", "courseJsonData", "(IILjava/lang/String;IILjava/lang/String;)V", "getCourseJsonData", "()Ljava/lang/String;", "getDuration", "()I", "getIntensityMax", "getIntensityMin", "getSportMode", "getSportModeType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Data2 implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<Data2> CREATOR = new a();

    @Nullable
    private final String courseJsonData;
    private final int duration;
    private final int intensityMax;
    private final int intensityMin;

    @Nullable
    private final String sportMode;
    private final int sportModeType;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Data2> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Data2 createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Data2(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Data2[] newArray(int i) {
            return new Data2[i];
        }
    }

    public Data2(int i, int i2, @Nullable String str, int i3, int i4, @Nullable String str2) {
        this.duration = i;
        this.sportModeType = i2;
        this.sportMode = str;
        this.intensityMin = i3;
        this.intensityMax = i4;
        this.courseJsonData = str2;
    }

    public static /* synthetic */ Data2 copy$default(Data2 data2, int i, int i2, String str, int i3, int i4, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = data2.duration;
        }
        if ((i5 & 2) != 0) {
            i2 = data2.sportModeType;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            str = data2.sportMode;
        }
        String str3 = str;
        if ((i5 & 8) != 0) {
            i3 = data2.intensityMin;
        }
        int i7 = i3;
        if ((i5 & 16) != 0) {
            i4 = data2.intensityMax;
        }
        int i8 = i4;
        if ((i5 & 32) != 0) {
            str2 = data2.courseJsonData;
        }
        return data2.copy(i, i6, str3, i7, i8, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSportModeType() {
        return this.sportModeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSportMode() {
        return this.sportMode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getIntensityMin() {
        return this.intensityMin;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getIntensityMax() {
        return this.intensityMax;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCourseJsonData() {
        return this.courseJsonData;
    }

    @NotNull
    public final Data2 copy(int duration, int sportModeType, @Nullable String sportMode, int intensityMin, int intensityMax, @Nullable String courseJsonData) {
        return new Data2(duration, sportModeType, sportMode, intensityMin, intensityMax, courseJsonData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data2)) {
            return false;
        }
        Data2 data2 = (Data2) other;
        return this.duration == data2.duration && this.sportModeType == data2.sportModeType && Intrinsics.areEqual(this.sportMode, data2.sportMode) && this.intensityMin == data2.intensityMin && this.intensityMax == data2.intensityMax && Intrinsics.areEqual(this.courseJsonData, data2.courseJsonData);
    }

    @Nullable
    public final String getCourseJsonData() {
        return this.courseJsonData;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getIntensityMax() {
        return this.intensityMax;
    }

    public final int getIntensityMin() {
        return this.intensityMin;
    }

    @Nullable
    public final String getSportMode() {
        return this.sportMode;
    }

    public final int getSportModeType() {
        return this.sportModeType;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.duration) * 31) + Integer.hashCode(this.sportModeType)) * 31;
        String str = this.sportMode;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.intensityMin)) * 31) + Integer.hashCode(this.intensityMax)) * 31;
        String str2 = this.courseJsonData;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Data2(duration=" + this.duration + ", sportModeType=" + this.sportModeType + ", sportMode=" + this.sportMode + ", intensityMin=" + this.intensityMin + ", intensityMax=" + this.intensityMax + ", courseJsonData=" + this.courseJsonData + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.duration);
        parcel.writeInt(this.sportModeType);
        parcel.writeString(this.sportMode);
        parcel.writeInt(this.intensityMin);
        parcel.writeInt(this.intensityMax);
        parcel.writeString(this.courseJsonData);
    }

    public /* synthetic */ Data2(int i, int i2, String str, int i3, int i4, String str2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, i3, i4, (i5 & 32) != 0 ? null : str2);
    }
}
