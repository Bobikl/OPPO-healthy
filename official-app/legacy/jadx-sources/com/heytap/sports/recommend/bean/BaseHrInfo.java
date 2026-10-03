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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/heytap/sports/recommend/bean/BaseHrInfo;", "Landroid/os/Parcelable;", "restHr", "", "maxHr", "hrSec", "", "(IILjava/util/List;)V", "getHrSec", "()Ljava/util/List;", "getMaxHr", "()I", "getRestHr", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class BaseHrInfo implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BaseHrInfo> CREATOR = new a();

    @NotNull
    private final List<Integer> hrSec;
    private final int maxHr;
    private final int restHr;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BaseHrInfo> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseHrInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new BaseHrInfo(i, i2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BaseHrInfo[] newArray(int i) {
            return new BaseHrInfo[i];
        }
    }

    public BaseHrInfo() {
        this(0, 0, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BaseHrInfo copy$default(BaseHrInfo baseHrInfo, int i, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = baseHrInfo.restHr;
        }
        if ((i3 & 2) != 0) {
            i2 = baseHrInfo.maxHr;
        }
        if ((i3 & 4) != 0) {
            list = baseHrInfo.hrSec;
        }
        return baseHrInfo.copy(i, i2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRestHr() {
        return this.restHr;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxHr() {
        return this.maxHr;
    }

    @NotNull
    public final List<Integer> component3() {
        return this.hrSec;
    }

    @NotNull
    public final BaseHrInfo copy(int restHr, int maxHr, @NotNull List<Integer> hrSec) {
        Intrinsics.checkNotNullParameter(hrSec, "hrSec");
        return new BaseHrInfo(restHr, maxHr, hrSec);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseHrInfo)) {
            return false;
        }
        BaseHrInfo baseHrInfo = (BaseHrInfo) other;
        return this.restHr == baseHrInfo.restHr && this.maxHr == baseHrInfo.maxHr && Intrinsics.areEqual(this.hrSec, baseHrInfo.hrSec);
    }

    @NotNull
    public final List<Integer> getHrSec() {
        return this.hrSec;
    }

    public final int getMaxHr() {
        return this.maxHr;
    }

    public final int getRestHr() {
        return this.restHr;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.restHr) * 31) + Integer.hashCode(this.maxHr)) * 31) + this.hrSec.hashCode();
    }

    @NotNull
    public String toString() {
        return "BaseHrInfo(restHr=" + this.restHr + ", maxHr=" + this.maxHr + ", hrSec=" + this.hrSec + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.restHr);
        parcel.writeInt(this.maxHr);
        List<Integer> list = this.hrSec;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
    }

    public BaseHrInfo(int i, int i2, @NotNull List<Integer> hrSec) {
        Intrinsics.checkNotNullParameter(hrSec, "hrSec");
        this.restHr = i;
        this.maxHr = i2;
        this.hrSec = hrSec;
    }

    public /* synthetic */ BaseHrInfo(int i, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
