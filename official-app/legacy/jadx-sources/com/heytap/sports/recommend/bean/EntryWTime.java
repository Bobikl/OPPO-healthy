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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006!"}, d2 = {"Lcom/heytap/sports/recommend/bean/EntryWTime;", "Landroid/os/Parcelable;", "startTime", "", "endTime", "entryId", "entry", "Lcom/heytap/sports/recommend/bean/EntryData;", "(IIILcom/heytap/sports/recommend/bean/EntryData;)V", "getEndTime", "()I", "getEntry", "()Lcom/heytap/sports/recommend/bean/EntryData;", "getEntryId", "getStartTime", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class EntryWTime implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<EntryWTime> CREATOR = new a();
    private final int endTime;

    @Nullable
    private final EntryData entry;
    private final int entryId;
    private final int startTime;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EntryWTime> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EntryWTime createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EntryWTime(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : EntryData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EntryWTime[] newArray(int i) {
            return new EntryWTime[i];
        }
    }

    public EntryWTime() {
        this(0, 0, 0, null, 15, null);
    }

    public static /* synthetic */ EntryWTime copy$default(EntryWTime entryWTime, int i, int i2, int i3, EntryData entryData, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = entryWTime.startTime;
        }
        if ((i4 & 2) != 0) {
            i2 = entryWTime.endTime;
        }
        if ((i4 & 4) != 0) {
            i3 = entryWTime.entryId;
        }
        if ((i4 & 8) != 0) {
            entryData = entryWTime.entry;
        }
        return entryWTime.copy(i, i2, i3, entryData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEntryId() {
        return this.entryId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EntryData getEntry() {
        return this.entry;
    }

    @NotNull
    public final EntryWTime copy(int startTime, int endTime, int entryId, @Nullable EntryData entry) {
        return new EntryWTime(startTime, endTime, entryId, entry);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntryWTime)) {
            return false;
        }
        EntryWTime entryWTime = (EntryWTime) other;
        return this.startTime == entryWTime.startTime && this.endTime == entryWTime.endTime && this.entryId == entryWTime.entryId && Intrinsics.areEqual(this.entry, entryWTime.entry);
    }

    public final int getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final EntryData getEntry() {
        return this.entry;
    }

    public final int getEntryId() {
        return this.entryId;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.startTime) * 31) + Integer.hashCode(this.endTime)) * 31) + Integer.hashCode(this.entryId)) * 31;
        EntryData entryData = this.entry;
        return iHashCode + (entryData == null ? 0 : entryData.hashCode());
    }

    @NotNull
    public String toString() {
        return "EntryWTime(startTime=" + this.startTime + ", endTime=" + this.endTime + ", entryId=" + this.entryId + ", entry=" + this.entry + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.startTime);
        parcel.writeInt(this.endTime);
        parcel.writeInt(this.entryId);
        EntryData entryData = this.entry;
        if (entryData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            entryData.writeToParcel(parcel, flags);
        }
    }

    public EntryWTime(int i, int i2, int i3, @Nullable EntryData entryData) {
        this.startTime = i;
        this.endTime = i2;
        this.entryId = i3;
        this.entry = entryData;
    }

    public /* synthetic */ EntryWTime(int i, int i2, int i3, EntryData entryData, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? null : entryData);
    }
}
