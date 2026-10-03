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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/heytap/sports/recommend/bean/LevelEntryData;", "Landroid/os/Parcelable;", "purpose", "", "Lcom/heytap/sports/recommend/bean/GuideSportsPurpose;", "entryArr", "Lcom/heytap/sports/recommend/bean/EntryWTime;", "(Ljava/util/List;Ljava/util/List;)V", "getEntryArr", "()Ljava/util/List;", "getPurpose", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class LevelEntryData implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<LevelEntryData> CREATOR = new a();

    @NotNull
    private final List<EntryWTime> entryArr;

    @NotNull
    private final List<GuideSportsPurpose> purpose;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LevelEntryData> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LevelEntryData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(GuideSportsPurpose.valueOf(parcel.readString()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(EntryWTime.CREATOR.createFromParcel(parcel));
            }
            return new LevelEntryData(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LevelEntryData[] newArray(int i) {
            return new LevelEntryData[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LevelEntryData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LevelEntryData copy$default(LevelEntryData levelEntryData, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = levelEntryData.purpose;
        }
        if ((i & 2) != 0) {
            list2 = levelEntryData.entryArr;
        }
        return levelEntryData.copy(list, list2);
    }

    @NotNull
    public final List<GuideSportsPurpose> component1() {
        return this.purpose;
    }

    @NotNull
    public final List<EntryWTime> component2() {
        return this.entryArr;
    }

    @NotNull
    public final LevelEntryData copy(@NotNull List<? extends GuideSportsPurpose> purpose, @NotNull List<EntryWTime> entryArr) {
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(entryArr, "entryArr");
        return new LevelEntryData(purpose, entryArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LevelEntryData)) {
            return false;
        }
        LevelEntryData levelEntryData = (LevelEntryData) other;
        return Intrinsics.areEqual(this.purpose, levelEntryData.purpose) && Intrinsics.areEqual(this.entryArr, levelEntryData.entryArr);
    }

    @NotNull
    public final List<EntryWTime> getEntryArr() {
        return this.entryArr;
    }

    @NotNull
    public final List<GuideSportsPurpose> getPurpose() {
        return this.purpose;
    }

    public int hashCode() {
        return (this.purpose.hashCode() * 31) + this.entryArr.hashCode();
    }

    @NotNull
    public String toString() {
        return "LevelEntryData(purpose=" + this.purpose + ", entryArr=" + this.entryArr + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<GuideSportsPurpose> list = this.purpose;
        parcel.writeInt(list.size());
        Iterator<GuideSportsPurpose> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next().name());
        }
        List<EntryWTime> list2 = this.entryArr;
        parcel.writeInt(list2.size());
        Iterator<EntryWTime> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LevelEntryData(@NotNull List<? extends GuideSportsPurpose> purpose, @NotNull List<EntryWTime> entryArr) {
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(entryArr, "entryArr");
        this.purpose = purpose;
        this.entryArr = entryArr;
    }

    public /* synthetic */ LevelEntryData(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
