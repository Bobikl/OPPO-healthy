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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/heytap/databaseengine/model/gymstrengthtraining/TrainingActionData;", "Landroid/os/Parcelable;", "trainingActionName", "", "actionGroupList", "", "Lcom/heytap/databaseengine/model/gymstrengthtraining/TrainingActionGroup;", "(Ljava/lang/String;Ljava/util/List;)V", "getActionGroupList", "()Ljava/util/List;", "setActionGroupList", "(Ljava/util/List;)V", "getTrainingActionName", "()Ljava/lang/String;", "setTrainingActionName", "(Ljava/lang/String;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TrainingActionData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TrainingActionData> CREATOR = new a();

    @NotNull
    private List<TrainingActionGroup> actionGroupList;

    @NotNull
    private String trainingActionName;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrainingActionData> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TrainingActionData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TrainingActionGroup.CREATOR.createFromParcel(parcel));
            }
            return new TrainingActionData(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TrainingActionData[] newArray(int i) {
            return new TrainingActionData[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrainingActionData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrainingActionData copy$default(TrainingActionData trainingActionData, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trainingActionData.trainingActionName;
        }
        if ((i & 2) != 0) {
            list = trainingActionData.actionGroupList;
        }
        return trainingActionData.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTrainingActionName() {
        return this.trainingActionName;
    }

    @NotNull
    public final List<TrainingActionGroup> component2() {
        return this.actionGroupList;
    }

    @NotNull
    public final TrainingActionData copy(@NotNull String trainingActionName, @NotNull List<TrainingActionGroup> actionGroupList) {
        Intrinsics.checkNotNullParameter(trainingActionName, "trainingActionName");
        Intrinsics.checkNotNullParameter(actionGroupList, "actionGroupList");
        return new TrainingActionData(trainingActionName, actionGroupList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainingActionData)) {
            return false;
        }
        TrainingActionData trainingActionData = (TrainingActionData) other;
        return Intrinsics.areEqual(this.trainingActionName, trainingActionData.trainingActionName) && Intrinsics.areEqual(this.actionGroupList, trainingActionData.actionGroupList);
    }

    @NotNull
    public final List<TrainingActionGroup> getActionGroupList() {
        return this.actionGroupList;
    }

    @NotNull
    public final String getTrainingActionName() {
        return this.trainingActionName;
    }

    public int hashCode() {
        return (this.trainingActionName.hashCode() * 31) + this.actionGroupList.hashCode();
    }

    public final void setActionGroupList(@NotNull List<TrainingActionGroup> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.actionGroupList = list;
    }

    public final void setTrainingActionName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.trainingActionName = str;
    }

    @NotNull
    public String toString() {
        return "TrainingActionData(trainingActionName=" + this.trainingActionName + ", actionGroupList=" + this.actionGroupList + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.trainingActionName);
        List<TrainingActionGroup> list = this.actionGroupList;
        parcel.writeInt(list.size());
        Iterator<TrainingActionGroup> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public TrainingActionData(@NotNull String trainingActionName, @NotNull List<TrainingActionGroup> actionGroupList) {
        Intrinsics.checkNotNullParameter(trainingActionName, "trainingActionName");
        Intrinsics.checkNotNullParameter(actionGroupList, "actionGroupList");
        this.trainingActionName = trainingActionName;
        this.actionGroupList = actionGroupList;
    }

    public /* synthetic */ TrainingActionData(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list);
    }
}
