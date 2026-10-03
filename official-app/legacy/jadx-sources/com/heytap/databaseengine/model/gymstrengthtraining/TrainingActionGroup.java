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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/heytap/databaseengine/model/gymstrengthtraining/TrainingActionGroup;", "Landroid/os/Parcelable;", "trainingActionName", "", "actionBeanList", "", "Lcom/heytap/databaseengine/model/gymstrengthtraining/TrainingActionBean;", "(Ljava/lang/String;Ljava/util/List;)V", "getActionBeanList", "()Ljava/util/List;", "setActionBeanList", "(Ljava/util/List;)V", "getTrainingActionName", "()Ljava/lang/String;", "setTrainingActionName", "(Ljava/lang/String;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TrainingActionGroup implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TrainingActionGroup> CREATOR = new a();

    @NotNull
    private List<TrainingActionBean> actionBeanList;

    @NotNull
    private String trainingActionName;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrainingActionGroup> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TrainingActionGroup createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TrainingActionBean.CREATOR.createFromParcel(parcel));
            }
            return new TrainingActionGroup(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TrainingActionGroup[] newArray(int i) {
            return new TrainingActionGroup[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrainingActionGroup() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrainingActionGroup copy$default(TrainingActionGroup trainingActionGroup, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trainingActionGroup.trainingActionName;
        }
        if ((i & 2) != 0) {
            list = trainingActionGroup.actionBeanList;
        }
        return trainingActionGroup.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTrainingActionName() {
        return this.trainingActionName;
    }

    @NotNull
    public final List<TrainingActionBean> component2() {
        return this.actionBeanList;
    }

    @NotNull
    public final TrainingActionGroup copy(@NotNull String trainingActionName, @NotNull List<TrainingActionBean> actionBeanList) {
        Intrinsics.checkNotNullParameter(trainingActionName, "trainingActionName");
        Intrinsics.checkNotNullParameter(actionBeanList, "actionBeanList");
        return new TrainingActionGroup(trainingActionName, actionBeanList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainingActionGroup)) {
            return false;
        }
        TrainingActionGroup trainingActionGroup = (TrainingActionGroup) other;
        return Intrinsics.areEqual(this.trainingActionName, trainingActionGroup.trainingActionName) && Intrinsics.areEqual(this.actionBeanList, trainingActionGroup.actionBeanList);
    }

    @NotNull
    public final List<TrainingActionBean> getActionBeanList() {
        return this.actionBeanList;
    }

    @NotNull
    public final String getTrainingActionName() {
        return this.trainingActionName;
    }

    public int hashCode() {
        return (this.trainingActionName.hashCode() * 31) + this.actionBeanList.hashCode();
    }

    public final void setActionBeanList(@NotNull List<TrainingActionBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.actionBeanList = list;
    }

    public final void setTrainingActionName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.trainingActionName = str;
    }

    @NotNull
    public String toString() {
        return "TrainingActionGroup(trainingActionName=" + this.trainingActionName + ", actionBeanList=" + this.actionBeanList + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.trainingActionName);
        List<TrainingActionBean> list = this.actionBeanList;
        parcel.writeInt(list.size());
        Iterator<TrainingActionBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public TrainingActionGroup(@NotNull String trainingActionName, @NotNull List<TrainingActionBean> actionBeanList) {
        Intrinsics.checkNotNullParameter(trainingActionName, "trainingActionName");
        Intrinsics.checkNotNullParameter(actionBeanList, "actionBeanList");
        this.trainingActionName = trainingActionName;
        this.actionBeanList = actionBeanList;
    }

    public /* synthetic */ TrainingActionGroup(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list);
    }
}
