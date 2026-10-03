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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/heytap/sports/recommend/bean/BloodPressureData;", "Landroid/os/Parcelable;", "data", "", "", "statusRange", "Lcom/heytap/sports/recommend/bean/IntPair;", "(Ljava/util/List;Ljava/util/List;)V", "getData", "()Ljava/util/List;", "getStatusRange", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class BloodPressureData implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BloodPressureData> CREATOR = new a();

    @NotNull
    private final List<Integer> data;

    @NotNull
    private final List<IntPair> statusRange;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BloodPressureData> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BloodPressureData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(IntPair.CREATOR.createFromParcel(parcel));
            }
            return new BloodPressureData(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BloodPressureData[] newArray(int i) {
            return new BloodPressureData[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BloodPressureData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BloodPressureData copy$default(BloodPressureData bloodPressureData, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bloodPressureData.data;
        }
        if ((i & 2) != 0) {
            list2 = bloodPressureData.statusRange;
        }
        return bloodPressureData.copy(list, list2);
    }

    @NotNull
    public final List<Integer> component1() {
        return this.data;
    }

    @NotNull
    public final List<IntPair> component2() {
        return this.statusRange;
    }

    @NotNull
    public final BloodPressureData copy(@NotNull List<Integer> data, @NotNull List<IntPair> statusRange) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(statusRange, "statusRange");
        return new BloodPressureData(data, statusRange);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureData)) {
            return false;
        }
        BloodPressureData bloodPressureData = (BloodPressureData) other;
        return Intrinsics.areEqual(this.data, bloodPressureData.data) && Intrinsics.areEqual(this.statusRange, bloodPressureData.statusRange);
    }

    @NotNull
    public final List<Integer> getData() {
        return this.data;
    }

    @NotNull
    public final List<IntPair> getStatusRange() {
        return this.statusRange;
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + this.statusRange.hashCode();
    }

    @NotNull
    public String toString() {
        return "BloodPressureData(data=" + this.data + ", statusRange=" + this.statusRange + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<Integer> list = this.data;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
        List<IntPair> list2 = this.statusRange;
        parcel.writeInt(list2.size());
        Iterator<IntPair> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, flags);
        }
    }

    public BloodPressureData(@NotNull List<Integer> data, @NotNull List<IntPair> statusRange) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(statusRange, "statusRange");
        this.data = data;
        this.statusRange = statusRange;
    }

    public /* synthetic */ BloodPressureData(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
