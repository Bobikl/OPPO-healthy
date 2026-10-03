package com.heytap.health.health_archives.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.healtharchive.HealthArchiveRecord;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/health_archives/bean/ArchiveDetailNavigationData;", "Landroid/os/Parcelable;", "healthArchiveRecord", "Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveRecord;", "reviewPlanTipBean", "Lcom/heytap/health/health_archives/bean/ReviewPlanTipBean;", "(Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveRecord;Lcom/heytap/health/health_archives/bean/ReviewPlanTipBean;)V", "getHealthArchiveRecord", "()Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveRecord;", "getReviewPlanTipBean", "()Lcom/heytap/health/health_archives/bean/ReviewPlanTipBean;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ArchiveDetailNavigationData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ArchiveDetailNavigationData> CREATOR = new a();

    @NotNull
    private final HealthArchiveRecord healthArchiveRecord;

    @Nullable
    private final ReviewPlanTipBean reviewPlanTipBean;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ArchiveDetailNavigationData> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArchiveDetailNavigationData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ArchiveDetailNavigationData((HealthArchiveRecord) parcel.readParcelable(ArchiveDetailNavigationData.class.getClassLoader()), parcel.readInt() == 0 ? null : ReviewPlanTipBean.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ArchiveDetailNavigationData[] newArray(int i) {
            return new ArchiveDetailNavigationData[i];
        }
    }

    public ArchiveDetailNavigationData(@NotNull HealthArchiveRecord healthArchiveRecord, @Nullable ReviewPlanTipBean reviewPlanTipBean) {
        Intrinsics.checkNotNullParameter(healthArchiveRecord, "healthArchiveRecord");
        this.healthArchiveRecord = healthArchiveRecord;
        this.reviewPlanTipBean = reviewPlanTipBean;
    }

    public static /* synthetic */ ArchiveDetailNavigationData copy$default(ArchiveDetailNavigationData archiveDetailNavigationData, HealthArchiveRecord healthArchiveRecord, ReviewPlanTipBean reviewPlanTipBean, int i, Object obj) {
        if ((i & 1) != 0) {
            healthArchiveRecord = archiveDetailNavigationData.healthArchiveRecord;
        }
        if ((i & 2) != 0) {
            reviewPlanTipBean = archiveDetailNavigationData.reviewPlanTipBean;
        }
        return archiveDetailNavigationData.copy(healthArchiveRecord, reviewPlanTipBean);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HealthArchiveRecord getHealthArchiveRecord() {
        return this.healthArchiveRecord;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ReviewPlanTipBean getReviewPlanTipBean() {
        return this.reviewPlanTipBean;
    }

    @NotNull
    public final ArchiveDetailNavigationData copy(@NotNull HealthArchiveRecord healthArchiveRecord, @Nullable ReviewPlanTipBean reviewPlanTipBean) {
        Intrinsics.checkNotNullParameter(healthArchiveRecord, "healthArchiveRecord");
        return new ArchiveDetailNavigationData(healthArchiveRecord, reviewPlanTipBean);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArchiveDetailNavigationData)) {
            return false;
        }
        ArchiveDetailNavigationData archiveDetailNavigationData = (ArchiveDetailNavigationData) other;
        return Intrinsics.areEqual(this.healthArchiveRecord, archiveDetailNavigationData.healthArchiveRecord) && Intrinsics.areEqual(this.reviewPlanTipBean, archiveDetailNavigationData.reviewPlanTipBean);
    }

    @NotNull
    public final HealthArchiveRecord getHealthArchiveRecord() {
        return this.healthArchiveRecord;
    }

    @Nullable
    public final ReviewPlanTipBean getReviewPlanTipBean() {
        return this.reviewPlanTipBean;
    }

    public int hashCode() {
        int iHashCode = this.healthArchiveRecord.hashCode() * 31;
        ReviewPlanTipBean reviewPlanTipBean = this.reviewPlanTipBean;
        return iHashCode + (reviewPlanTipBean == null ? 0 : reviewPlanTipBean.hashCode());
    }

    @NotNull
    public String toString() {
        return "ArchiveDetailNavigationData(healthArchiveRecord=" + this.healthArchiveRecord + ", reviewPlanTipBean=" + this.reviewPlanTipBean + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.healthArchiveRecord, flags);
        ReviewPlanTipBean reviewPlanTipBean = this.reviewPlanTipBean;
        if (reviewPlanTipBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reviewPlanTipBean.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ ArchiveDetailNavigationData(HealthArchiveRecord healthArchiveRecord, ReviewPlanTipBean reviewPlanTipBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(healthArchiveRecord, (i & 2) != 0 ? null : reviewPlanTipBean);
    }
}
