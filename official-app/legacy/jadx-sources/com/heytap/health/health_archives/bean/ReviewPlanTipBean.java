package com.heytap.health.health_archives.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.healtharchive.HealthReviewPlan;
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

/* JADX INFO: loaded from: classes16.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JG\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0013\u0010$\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006."}, d2 = {"Lcom/heytap/health/health_archives/bean/ReviewPlanTipBean;", "Landroid/os/Parcelable;", "title", "", "content", "hasAdded", "", "showTime", "planList", "", "Lcom/heytap/databaseengine/model/healtharchive/HealthReviewPlan;", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getHasAdded", "()Z", "setHasAdded", "(Z)V", "getPlanList", "()Ljava/util/List;", "setPlanList", "(Ljava/util/List;)V", "getShowTime", "setShowTime", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ReviewPlanTipBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ReviewPlanTipBean> CREATOR = new a();

    @Nullable
    private String content;
    private boolean hasAdded;

    @NotNull
    private List<HealthReviewPlan> planList;

    @Nullable
    private String showTime;

    @Nullable
    private String title;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReviewPlanTipBean> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ReviewPlanTipBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(ReviewPlanTipBean.class.getClassLoader()));
            }
            return new ReviewPlanTipBean(string, string2, z, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ReviewPlanTipBean[] newArray(int i) {
            return new ReviewPlanTipBean[i];
        }
    }

    public ReviewPlanTipBean() {
        this(null, null, false, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReviewPlanTipBean copy$default(ReviewPlanTipBean reviewPlanTipBean, String str, String str2, boolean z, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reviewPlanTipBean.title;
        }
        if ((i & 2) != 0) {
            str2 = reviewPlanTipBean.content;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            z = reviewPlanTipBean.hasAdded;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str3 = reviewPlanTipBean.showTime;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            list = reviewPlanTipBean.planList;
        }
        return reviewPlanTipBean.copy(str, str4, z2, str5, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHasAdded() {
        return this.hasAdded;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getShowTime() {
        return this.showTime;
    }

    @NotNull
    public final List<HealthReviewPlan> component5() {
        return this.planList;
    }

    @NotNull
    public final ReviewPlanTipBean copy(@Nullable String title, @Nullable String content, boolean hasAdded, @Nullable String showTime, @NotNull List<HealthReviewPlan> planList) {
        Intrinsics.checkNotNullParameter(planList, "planList");
        return new ReviewPlanTipBean(title, content, hasAdded, showTime, planList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewPlanTipBean)) {
            return false;
        }
        ReviewPlanTipBean reviewPlanTipBean = (ReviewPlanTipBean) other;
        return Intrinsics.areEqual(this.title, reviewPlanTipBean.title) && Intrinsics.areEqual(this.content, reviewPlanTipBean.content) && this.hasAdded == reviewPlanTipBean.hasAdded && Intrinsics.areEqual(this.showTime, reviewPlanTipBean.showTime) && Intrinsics.areEqual(this.planList, reviewPlanTipBean.planList);
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    public final boolean getHasAdded() {
        return this.hasAdded;
    }

    @NotNull
    public final List<HealthReviewPlan> getPlanList() {
        return this.planList;
    }

    @Nullable
    public final String getShowTime() {
        return this.showTime;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.hasAdded;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode2 + r2) * 31;
        String str3 = this.showTime;
        return ((i + (str3 != null ? str3.hashCode() : 0)) * 31) + this.planList.hashCode();
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setHasAdded(boolean z) {
        this.hasAdded = z;
    }

    public final void setPlanList(@NotNull List<HealthReviewPlan> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.planList = list;
    }

    public final void setShowTime(@Nullable String str) {
        this.showTime = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "ReviewPlanTipBean(title=" + this.title + ", content=" + this.content + ", hasAdded=" + this.hasAdded + ", showTime=" + this.showTime + ", planList=" + this.planList + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeInt(this.hasAdded ? 1 : 0);
        parcel.writeString(this.showTime);
        List<HealthReviewPlan> list = this.planList;
        parcel.writeInt(list.size());
        Iterator<HealthReviewPlan> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), flags);
        }
    }

    public ReviewPlanTipBean(@Nullable String str, @Nullable String str2, boolean z, @Nullable String str3, @NotNull List<HealthReviewPlan> planList) {
        Intrinsics.checkNotNullParameter(planList, "planList");
        this.title = str;
        this.content = str2;
        this.hasAdded = z;
        this.showTime = str3;
        this.planList = planList;
    }

    public /* synthetic */ ReviewPlanTipBean(String str, String str2, boolean z, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? new ArrayList() : list);
    }
}
