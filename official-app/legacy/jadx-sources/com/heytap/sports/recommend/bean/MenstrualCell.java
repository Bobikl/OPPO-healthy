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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/heytap/sports/recommend/bean/MenstrualCell;", "Landroid/os/Parcelable;", "day", "", "entry", "", "Lcom/heytap/sports/recommend/bean/EntryData;", "(ILjava/util/List;)V", "getDay", "()I", "getEntry", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MenstrualCell implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<MenstrualCell> CREATOR = new a();
    private final int day;

    @NotNull
    private final List<EntryData> entry;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MenstrualCell> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MenstrualCell createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(EntryData.CREATOR.createFromParcel(parcel));
            }
            return new MenstrualCell(i, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MenstrualCell[] newArray(int i) {
            return new MenstrualCell[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MenstrualCell() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MenstrualCell copy$default(MenstrualCell menstrualCell, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = menstrualCell.day;
        }
        if ((i2 & 2) != 0) {
            list = menstrualCell.entry;
        }
        return menstrualCell.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDay() {
        return this.day;
    }

    @NotNull
    public final List<EntryData> component2() {
        return this.entry;
    }

    @NotNull
    public final MenstrualCell copy(int day, @NotNull List<EntryData> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        return new MenstrualCell(day, entry);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstrualCell)) {
            return false;
        }
        MenstrualCell menstrualCell = (MenstrualCell) other;
        return this.day == menstrualCell.day && Intrinsics.areEqual(this.entry, menstrualCell.entry);
    }

    public final int getDay() {
        return this.day;
    }

    @NotNull
    public final List<EntryData> getEntry() {
        return this.entry;
    }

    public int hashCode() {
        return (Integer.hashCode(this.day) * 31) + this.entry.hashCode();
    }

    @NotNull
    public String toString() {
        return "MenstrualCell(day=" + this.day + ", entry=" + this.entry + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.day);
        List<EntryData> list = this.entry;
        parcel.writeInt(list.size());
        Iterator<EntryData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public MenstrualCell(int i, @NotNull List<EntryData> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.day = i;
        this.entry = entry;
    }

    public /* synthetic */ MenstrualCell(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
