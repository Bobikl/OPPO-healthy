package com.heytap.device.bpg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/heytap/device/bpg/GuideData;", "Landroid/os/Parcelable;", "step", "", "Lcom/heytap/device/bpg/StepData;", "idImg", "", "use", "Lcom/heytap/device/bpg/UseData;", "(Ljava/util/List;Ljava/lang/String;Lcom/heytap/device/bpg/UseData;)V", "getIdImg", "()Ljava/lang/String;", "getStep", "()Ljava/util/List;", "getUse", "()Lcom/heytap/device/bpg/UseData;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "device_third_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GuideData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GuideData> CREATOR = new a();

    @NotNull
    private final String idImg;

    @NotNull
    private final List<StepData> step;

    @Nullable
    private final UseData use;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GuideData> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GuideData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(StepData.CREATOR.createFromParcel(parcel));
            }
            return new GuideData(arrayList, parcel.readString(), parcel.readInt() == 0 ? null : UseData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GuideData[] newArray(int i) {
            return new GuideData[i];
        }
    }

    public GuideData(@NotNull List<StepData> step, @NotNull String idImg, @Nullable UseData useData) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(idImg, "idImg");
        this.step = step;
        this.idImg = idImg;
        this.use = useData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GuideData copy$default(GuideData guideData, List list, String str, UseData useData, int i, Object obj) {
        if ((i & 1) != 0) {
            list = guideData.step;
        }
        if ((i & 2) != 0) {
            str = guideData.idImg;
        }
        if ((i & 4) != 0) {
            useData = guideData.use;
        }
        return guideData.copy(list, str, useData);
    }

    @NotNull
    public final List<StepData> component1() {
        return this.step;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIdImg() {
        return this.idImg;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UseData getUse() {
        return this.use;
    }

    @NotNull
    public final GuideData copy(@NotNull List<StepData> step, @NotNull String idImg, @Nullable UseData use) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(idImg, "idImg");
        return new GuideData(step, idImg, use);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuideData)) {
            return false;
        }
        GuideData guideData = (GuideData) other;
        return Intrinsics.areEqual(this.step, guideData.step) && Intrinsics.areEqual(this.idImg, guideData.idImg) && Intrinsics.areEqual(this.use, guideData.use);
    }

    @NotNull
    public final String getIdImg() {
        return this.idImg;
    }

    @NotNull
    public final List<StepData> getStep() {
        return this.step;
    }

    @Nullable
    public final UseData getUse() {
        return this.use;
    }

    public int hashCode() {
        int iHashCode = ((this.step.hashCode() * 31) + this.idImg.hashCode()) * 31;
        UseData useData = this.use;
        return iHashCode + (useData == null ? 0 : useData.hashCode());
    }

    @NotNull
    public String toString() {
        return "GuideData(step=" + this.step + ", idImg=" + this.idImg + ", use=" + this.use + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<StepData> list = this.step;
        parcel.writeInt(list.size());
        Iterator<StepData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        parcel.writeString(this.idImg);
        UseData useData = this.use;
        if (useData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            useData.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ GuideData(List list, String str, UseData useData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : useData);
    }
}
