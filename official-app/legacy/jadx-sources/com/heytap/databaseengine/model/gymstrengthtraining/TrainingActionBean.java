package com.heytap.databaseengine.model.gymstrengthtraining;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010$\u001a\u00020\nHÆ\u0003JP\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010&J\t\u0010'\u001a\u00020\u0006HÖ\u0001J\u0013\u0010(\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u0006HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013¨\u00062"}, d2 = {"Lcom/heytap/databaseengine/model/gymstrengthtraining/TrainingActionBean;", "Landroid/os/Parcelable;", "trainingActionName", "", "actionRound", "countWeight1", "", "countWeight2", "times", "actionCompletionStatus", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "getActionCompletionStatus", "()Z", "setActionCompletionStatus", "(Z)V", "getActionRound", "()Ljava/lang/String;", "setActionRound", "(Ljava/lang/String;)V", "getCountWeight1", "()Ljava/lang/Integer;", "setCountWeight1", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCountWeight2", "setCountWeight2", "getTimes", "setTimes", "getTrainingActionName", "setTrainingActionName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/heytap/databaseengine/model/gymstrengthtraining/TrainingActionBean;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TrainingActionBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TrainingActionBean> CREATOR = new a();
    private boolean actionCompletionStatus;

    @NotNull
    private String actionRound;

    @Nullable
    private Integer countWeight1;

    @Nullable
    private Integer countWeight2;

    @Nullable
    private Integer times;

    @NotNull
    private String trainingActionName;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrainingActionBean> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TrainingActionBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TrainingActionBean(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TrainingActionBean[] newArray(int i) {
            return new TrainingActionBean[i];
        }
    }

    public TrainingActionBean() {
        this(null, null, null, null, null, false, 63, null);
    }

    public static /* synthetic */ TrainingActionBean copy$default(TrainingActionBean trainingActionBean, String str, String str2, Integer num, Integer num2, Integer num3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trainingActionBean.trainingActionName;
        }
        if ((i & 2) != 0) {
            str2 = trainingActionBean.actionRound;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            num = trainingActionBean.countWeight1;
        }
        Integer num4 = num;
        if ((i & 8) != 0) {
            num2 = trainingActionBean.countWeight2;
        }
        Integer num5 = num2;
        if ((i & 16) != 0) {
            num3 = trainingActionBean.times;
        }
        Integer num6 = num3;
        if ((i & 32) != 0) {
            z = trainingActionBean.actionCompletionStatus;
        }
        return trainingActionBean.copy(str, str3, num4, num5, num6, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTrainingActionName() {
        return this.trainingActionName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getActionRound() {
        return this.actionRound;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getCountWeight1() {
        return this.countWeight1;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getCountWeight2() {
        return this.countWeight2;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getTimes() {
        return this.times;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getActionCompletionStatus() {
        return this.actionCompletionStatus;
    }

    @NotNull
    public final TrainingActionBean copy(@NotNull String trainingActionName, @NotNull String actionRound, @Nullable Integer countWeight1, @Nullable Integer countWeight2, @Nullable Integer times, boolean actionCompletionStatus) {
        Intrinsics.checkNotNullParameter(trainingActionName, "trainingActionName");
        Intrinsics.checkNotNullParameter(actionRound, "actionRound");
        return new TrainingActionBean(trainingActionName, actionRound, countWeight1, countWeight2, times, actionCompletionStatus);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainingActionBean)) {
            return false;
        }
        TrainingActionBean trainingActionBean = (TrainingActionBean) other;
        return Intrinsics.areEqual(this.trainingActionName, trainingActionBean.trainingActionName) && Intrinsics.areEqual(this.actionRound, trainingActionBean.actionRound) && Intrinsics.areEqual(this.countWeight1, trainingActionBean.countWeight1) && Intrinsics.areEqual(this.countWeight2, trainingActionBean.countWeight2) && Intrinsics.areEqual(this.times, trainingActionBean.times) && this.actionCompletionStatus == trainingActionBean.actionCompletionStatus;
    }

    public final boolean getActionCompletionStatus() {
        return this.actionCompletionStatus;
    }

    @NotNull
    public final String getActionRound() {
        return this.actionRound;
    }

    @Nullable
    public final Integer getCountWeight1() {
        return this.countWeight1;
    }

    @Nullable
    public final Integer getCountWeight2() {
        return this.countWeight2;
    }

    @Nullable
    public final Integer getTimes() {
        return this.times;
    }

    @NotNull
    public final String getTrainingActionName() {
        return this.trainingActionName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        int iHashCode = ((this.trainingActionName.hashCode() * 31) + this.actionRound.hashCode()) * 31;
        Integer num = this.countWeight1;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.countWeight2;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.times;
        int iHashCode4 = (iHashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31;
        boolean z = this.actionCompletionStatus;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return iHashCode4 + r3;
    }

    public final void setActionCompletionStatus(boolean z) {
        this.actionCompletionStatus = z;
    }

    public final void setActionRound(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.actionRound = str;
    }

    public final void setCountWeight1(@Nullable Integer num) {
        this.countWeight1 = num;
    }

    public final void setCountWeight2(@Nullable Integer num) {
        this.countWeight2 = num;
    }

    public final void setTimes(@Nullable Integer num) {
        this.times = num;
    }

    public final void setTrainingActionName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.trainingActionName = str;
    }

    @NotNull
    public String toString() {
        return "TrainingActionBean(trainingActionName=" + this.trainingActionName + ", actionRound=" + this.actionRound + ", countWeight1=" + this.countWeight1 + ", countWeight2=" + this.countWeight2 + ", times=" + this.times + ", actionCompletionStatus=" + this.actionCompletionStatus + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.trainingActionName);
        parcel.writeString(this.actionRound);
        Integer num = this.countWeight1;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.countWeight2;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.times;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeInt(this.actionCompletionStatus ? 1 : 0);
    }

    public TrainingActionBean(@NotNull String trainingActionName, @NotNull String actionRound, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, boolean z) {
        Intrinsics.checkNotNullParameter(trainingActionName, "trainingActionName");
        Intrinsics.checkNotNullParameter(actionRound, "actionRound");
        this.trainingActionName = trainingActionName;
        this.actionRound = actionRound;
        this.countWeight1 = num;
        this.countWeight2 = num2;
        this.times = num3;
        this.actionCompletionStatus = z;
    }

    public /* synthetic */ TrainingActionBean(String str, String str2, Integer num, Integer num2, Integer num3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? true : z);
    }
}
