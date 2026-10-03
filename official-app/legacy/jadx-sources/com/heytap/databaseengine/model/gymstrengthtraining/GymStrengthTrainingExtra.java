package com.heytap.databaseengine.model.gymstrengthtraining;

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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0005HÖ\u0001R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006&"}, d2 = {"Lcom/heytap/databaseengine/model/gymstrengthtraining/GymStrengthTrainingExtra;", "Landroid/os/Parcelable;", "trainingTitle", "", "trainingCapacity", "", "trainingActionDataList", "", "Lcom/heytap/databaseengine/model/gymstrengthtraining/TrainingActionData;", "(Ljava/lang/String;ILjava/util/List;)V", "getTrainingActionDataList", "()Ljava/util/List;", "setTrainingActionDataList", "(Ljava/util/List;)V", "getTrainingCapacity", "()I", "setTrainingCapacity", "(I)V", "getTrainingTitle", "()Ljava/lang/String;", "setTrainingTitle", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GymStrengthTrainingExtra implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GymStrengthTrainingExtra> CREATOR = new a();

    @NotNull
    private List<TrainingActionData> trainingActionDataList;
    private int trainingCapacity;

    @NotNull
    private String trainingTitle;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GymStrengthTrainingExtra> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GymStrengthTrainingExtra createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(TrainingActionData.CREATOR.createFromParcel(parcel));
            }
            return new GymStrengthTrainingExtra(string, i, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GymStrengthTrainingExtra[] newArray(int i) {
            return new GymStrengthTrainingExtra[i];
        }
    }

    public GymStrengthTrainingExtra() {
        this(null, 0, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GymStrengthTrainingExtra copy$default(GymStrengthTrainingExtra gymStrengthTrainingExtra, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = gymStrengthTrainingExtra.trainingTitle;
        }
        if ((i2 & 2) != 0) {
            i = gymStrengthTrainingExtra.trainingCapacity;
        }
        if ((i2 & 4) != 0) {
            list = gymStrengthTrainingExtra.trainingActionDataList;
        }
        return gymStrengthTrainingExtra.copy(str, i, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTrainingTitle() {
        return this.trainingTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTrainingCapacity() {
        return this.trainingCapacity;
    }

    @NotNull
    public final List<TrainingActionData> component3() {
        return this.trainingActionDataList;
    }

    @NotNull
    public final GymStrengthTrainingExtra copy(@NotNull String trainingTitle, int trainingCapacity, @NotNull List<TrainingActionData> trainingActionDataList) {
        Intrinsics.checkNotNullParameter(trainingTitle, "trainingTitle");
        Intrinsics.checkNotNullParameter(trainingActionDataList, "trainingActionDataList");
        return new GymStrengthTrainingExtra(trainingTitle, trainingCapacity, trainingActionDataList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GymStrengthTrainingExtra)) {
            return false;
        }
        GymStrengthTrainingExtra gymStrengthTrainingExtra = (GymStrengthTrainingExtra) other;
        return Intrinsics.areEqual(this.trainingTitle, gymStrengthTrainingExtra.trainingTitle) && this.trainingCapacity == gymStrengthTrainingExtra.trainingCapacity && Intrinsics.areEqual(this.trainingActionDataList, gymStrengthTrainingExtra.trainingActionDataList);
    }

    @NotNull
    public final List<TrainingActionData> getTrainingActionDataList() {
        return this.trainingActionDataList;
    }

    public final int getTrainingCapacity() {
        return this.trainingCapacity;
    }

    @NotNull
    public final String getTrainingTitle() {
        return this.trainingTitle;
    }

    public int hashCode() {
        return (((this.trainingTitle.hashCode() * 31) + Integer.hashCode(this.trainingCapacity)) * 31) + this.trainingActionDataList.hashCode();
    }

    public final void setTrainingActionDataList(@NotNull List<TrainingActionData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.trainingActionDataList = list;
    }

    public final void setTrainingCapacity(int i) {
        this.trainingCapacity = i;
    }

    public final void setTrainingTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.trainingTitle = str;
    }

    @NotNull
    public String toString() {
        return "GymStrengthTrainingExtra(trainingTitle=" + this.trainingTitle + ", trainingCapacity=" + this.trainingCapacity + ", trainingActionDataList=" + this.trainingActionDataList + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.trainingTitle);
        parcel.writeInt(this.trainingCapacity);
        List<TrainingActionData> list = this.trainingActionDataList;
        parcel.writeInt(list.size());
        Iterator<TrainingActionData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public GymStrengthTrainingExtra(@NotNull String trainingTitle, int i, @NotNull List<TrainingActionData> trainingActionDataList) {
        Intrinsics.checkNotNullParameter(trainingTitle, "trainingTitle");
        Intrinsics.checkNotNullParameter(trainingActionDataList, "trainingActionDataList");
        this.trainingTitle = trainingTitle;
        this.trainingCapacity = i;
        this.trainingActionDataList = trainingActionDataList;
    }

    public /* synthetic */ GymStrengthTrainingExtra(String str, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? new ArrayList() : list);
    }
}
