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
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/heytap/sports/recommend/bean/Task2;", "Landroid/os/Parcelable;", "type", "", "data1", "Lcom/heytap/sports/recommend/bean/Data1;", "data2", "", "Lcom/heytap/sports/recommend/bean/Data2;", "(ILcom/heytap/sports/recommend/bean/Data1;Ljava/util/List;)V", "getData1", "()Lcom/heytap/sports/recommend/bean/Data1;", "getData2", "()Ljava/util/List;", "getType", "()I", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Task2 implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Task2> CREATOR = new a();

    @NotNull
    private final Data1 data1;

    @Nullable
    private final List<Data2> data2;
    private final int type;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Task2> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Task2 createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            Data1 data1CreateFromParcel = Data1.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList2.add(Data2.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new Task2(i, data1CreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Task2[] newArray(int i) {
            return new Task2[i];
        }
    }

    public Task2(int i, @NotNull Data1 data1, @Nullable List<Data2> list) {
        Intrinsics.checkNotNullParameter(data1, "data1");
        this.type = i;
        this.data1 = data1;
        this.data2 = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Task2 copy$default(Task2 task2, int i, Data1 data1, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = task2.type;
        }
        if ((i2 & 2) != 0) {
            data1 = task2.data1;
        }
        if ((i2 & 4) != 0) {
            list = task2.data2;
        }
        return task2.copy(i, data1, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Data1 getData1() {
        return this.data1;
    }

    @Nullable
    public final List<Data2> component3() {
        return this.data2;
    }

    @NotNull
    public final Task2 copy(int type, @NotNull Data1 data1, @Nullable List<Data2> data2) {
        Intrinsics.checkNotNullParameter(data1, "data1");
        return new Task2(type, data1, data2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Task2)) {
            return false;
        }
        Task2 task2 = (Task2) other;
        return this.type == task2.type && Intrinsics.areEqual(this.data1, task2.data1) && Intrinsics.areEqual(this.data2, task2.data2);
    }

    @NotNull
    public final Data1 getData1() {
        return this.data1;
    }

    @Nullable
    public final List<Data2> getData2() {
        return this.data2;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.type) * 31) + this.data1.hashCode()) * 31;
        List<Data2> list = this.data2;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "Task2(type=" + this.type + ", data1=" + this.data1 + ", data2=" + this.data2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.type);
        this.data1.writeToParcel(parcel, flags);
        List<Data2> list = this.data2;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<Data2> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }
}
