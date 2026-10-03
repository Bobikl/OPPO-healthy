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
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, d2 = {"Lcom/heytap/sports/recommend/bean/Data1;", "Landroid/os/Parcelable;", "durationMax", "", "durationMin", "intensityMin", "intensityMax", "tips", "", "(IIIILjava/lang/String;)V", "getDurationMax", "()I", "getDurationMin", "getIntensityMax", "getIntensityMin", "getTips", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Data1 implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<Data1> CREATOR = new a();
    private final int durationMax;
    private final int durationMin;
    private final int intensityMax;
    private final int intensityMin;

    @NotNull
    private final String tips;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Data1> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Data1 createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Data1(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Data1[] newArray(int i) {
            return new Data1[i];
        }
    }

    public Data1(int i, int i2, int i3, int i4, @NotNull String tips) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        this.durationMax = i;
        this.durationMin = i2;
        this.intensityMin = i3;
        this.intensityMax = i4;
        this.tips = tips;
    }

    public static /* synthetic */ Data1 copy$default(Data1 data1, int i, int i2, int i3, int i4, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = data1.durationMax;
        }
        if ((i5 & 2) != 0) {
            i2 = data1.durationMin;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = data1.intensityMin;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = data1.intensityMax;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            str = data1.tips;
        }
        return data1.copy(i, i6, i7, i8, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDurationMax() {
        return this.durationMax;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDurationMin() {
        return this.durationMin;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIntensityMin() {
        return this.intensityMin;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getIntensityMax() {
        return this.intensityMax;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    @NotNull
    public final Data1 copy(int durationMax, int durationMin, int intensityMin, int intensityMax, @NotNull String tips) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        return new Data1(durationMax, durationMin, intensityMin, intensityMax, tips);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data1)) {
            return false;
        }
        Data1 data1 = (Data1) other;
        return this.durationMax == data1.durationMax && this.durationMin == data1.durationMin && this.intensityMin == data1.intensityMin && this.intensityMax == data1.intensityMax && Intrinsics.areEqual(this.tips, data1.tips);
    }

    public final int getDurationMax() {
        return this.durationMax;
    }

    public final int getDurationMin() {
        return this.durationMin;
    }

    public final int getIntensityMax() {
        return this.intensityMax;
    }

    public final int getIntensityMin() {
        return this.intensityMin;
    }

    @NotNull
    public final String getTips() {
        return this.tips;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.durationMax) * 31) + Integer.hashCode(this.durationMin)) * 31) + Integer.hashCode(this.intensityMin)) * 31) + Integer.hashCode(this.intensityMax)) * 31) + this.tips.hashCode();
    }

    @NotNull
    public String toString() {
        return "Data1(durationMax=" + this.durationMax + ", durationMin=" + this.durationMin + ", intensityMin=" + this.intensityMin + ", intensityMax=" + this.intensityMax + ", tips=" + this.tips + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.durationMax);
        parcel.writeInt(this.durationMin);
        parcel.writeInt(this.intensityMin);
        parcel.writeInt(this.intensityMax);
        parcel.writeString(this.tips);
    }
}
