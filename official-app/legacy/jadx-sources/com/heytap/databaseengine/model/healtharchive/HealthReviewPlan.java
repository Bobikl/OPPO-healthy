package com.heytap.databaseengine.model.healtharchive;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.health.health_archives.web.HealthArchiveWebViewActivity;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b3\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0097\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0002\u0010\u0013J\t\u00104\u001a\u00020\u0004HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00106\u001a\u00020\u0010HÆ\u0003J\t\u00107\u001a\u00020\u0010HÆ\u0003J\t\u00108\u001a\u00020\u0010HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010?\u001a\u00020\u0004HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u009b\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010HÆ\u0001J\t\u0010B\u001a\u00020\u0010HÖ\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020\u0010HÖ\u0001J\b\u0010H\u001a\u00020\u0006H\u0016J\u0019\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001a\u0010\u0012\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR\u001a\u0010\u0011\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010%\"\u0004\b/\u0010'R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010%\"\u0004\b1\u0010'R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010\u0017¨\u0006N"}, d2 = {"Lcom/heytap/databaseengine/model/healtharchive/HealthReviewPlan;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", HealthArchiveWebViewActivity.H5_DATA_ID_KEY, "", "owner", "", "docId", "category", "title", "indicatorName", DBHealthReviewPlan.DEPARTMENT, "reviewTime", DBHealthReviewPlan.DESC, "calendarRemind", "state", "", "source", "ignoreState", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;III)V", "getCalendarRemind", "()Ljava/lang/String;", "setCalendarRemind", "(Ljava/lang/String;)V", "getCategory", "setCategory", "getDataId", "()J", "setDataId", "(J)V", "getDepartment", "setDepartment", "getDesc", "setDesc", "getDocId", "setDocId", "getIgnoreState", "()I", "setIgnoreState", "(I)V", "getIndicatorName", "setIndicatorName", "getOwner", "setOwner", "getReviewTime", "setReviewTime", "getSource", "setSource", "getState", "setState", "getTitle", "setTitle", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HealthReviewPlan extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HealthReviewPlan> CREATOR = new a();

    @Nullable
    private String calendarRemind;

    @Nullable
    private String category;
    private long dataId;

    @Nullable
    private String department;

    @Nullable
    private String desc;

    @Nullable
    private String docId;
    private int ignoreState;

    @Nullable
    private String indicatorName;

    @Nullable
    private String owner;
    private long reviewTime;
    private int source;
    private int state;

    @Nullable
    private String title;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HealthReviewPlan> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HealthReviewPlan createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HealthReviewPlan(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HealthReviewPlan[] newArray(int i) {
            return new HealthReviewPlan[i];
        }
    }

    public HealthReviewPlan() {
        this(0L, null, null, null, null, null, null, 0L, null, null, 0, 0, 0, 8191, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDataId() {
        return this.dataId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCalendarRemind() {
        return this.calendarRemind;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getIgnoreState() {
        return this.ignoreState;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOwner() {
        return this.owner;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDocId() {
        return this.docId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIndicatorName() {
        return this.indicatorName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDepartment() {
        return this.department;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getReviewTime() {
        return this.reviewTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final HealthReviewPlan copy(long dataId, @Nullable String owner, @Nullable String docId, @Nullable String category, @Nullable String title, @Nullable String indicatorName, @Nullable String department, long reviewTime, @Nullable String desc, @Nullable String calendarRemind, int state, int source, int ignoreState) {
        return new HealthReviewPlan(dataId, owner, docId, category, title, indicatorName, department, reviewTime, desc, calendarRemind, state, source, ignoreState);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthReviewPlan)) {
            return false;
        }
        HealthReviewPlan healthReviewPlan = (HealthReviewPlan) other;
        return this.dataId == healthReviewPlan.dataId && Intrinsics.areEqual(this.owner, healthReviewPlan.owner) && Intrinsics.areEqual(this.docId, healthReviewPlan.docId) && Intrinsics.areEqual(this.category, healthReviewPlan.category) && Intrinsics.areEqual(this.title, healthReviewPlan.title) && Intrinsics.areEqual(this.indicatorName, healthReviewPlan.indicatorName) && Intrinsics.areEqual(this.department, healthReviewPlan.department) && this.reviewTime == healthReviewPlan.reviewTime && Intrinsics.areEqual(this.desc, healthReviewPlan.desc) && Intrinsics.areEqual(this.calendarRemind, healthReviewPlan.calendarRemind) && this.state == healthReviewPlan.state && this.source == healthReviewPlan.source && this.ignoreState == healthReviewPlan.ignoreState;
    }

    @Nullable
    public final String getCalendarRemind() {
        return this.calendarRemind;
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    public final long getDataId() {
        return this.dataId;
    }

    @Nullable
    public final String getDepartment() {
        return this.department;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getDocId() {
        return this.docId;
    }

    public final int getIgnoreState() {
        return this.ignoreState;
    }

    @Nullable
    public final String getIndicatorName() {
        return this.indicatorName;
    }

    @Nullable
    public final String getOwner() {
        return this.owner;
    }

    public final long getReviewTime() {
        return this.reviewTime;
    }

    public final int getSource() {
        return this.source;
    }

    public final int getState() {
        return this.state;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.dataId) * 31;
        String str = this.owner;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.docId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.category;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.indicatorName;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.department;
        int iHashCode7 = (((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + Long.hashCode(this.reviewTime)) * 31;
        String str7 = this.desc;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.calendarRemind;
        return ((((((iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31) + Integer.hashCode(this.state)) * 31) + Integer.hashCode(this.source)) * 31) + Integer.hashCode(this.ignoreState);
    }

    public final void setCalendarRemind(@Nullable String str) {
        this.calendarRemind = str;
    }

    public final void setCategory(@Nullable String str) {
        this.category = str;
    }

    public final void setDataId(long j2) {
        this.dataId = j2;
    }

    public final void setDepartment(@Nullable String str) {
        this.department = str;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setDocId(@Nullable String str) {
        this.docId = str;
    }

    public final void setIgnoreState(int i) {
        this.ignoreState = i;
    }

    public final void setIndicatorName(@Nullable String str) {
        this.indicatorName = str;
    }

    public final void setOwner(@Nullable String str) {
        this.owner = str;
    }

    public final void setReviewTime(long j2) {
        this.reviewTime = j2;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "HealthReviewPlan( dataId='" + this.dataId + "', owner='" + this.owner + "', docId='" + this.docId + "', category='" + this.category + "', title='" + this.title + "', indicatorName='" + this.indicatorName + "', department='" + this.department + "', reviewTime='" + this.reviewTime + "', desc='" + this.desc + "', calendarRemind='" + this.calendarRemind + "', state='" + this.state + "', source='" + this.source + "', ignoreState='" + this.ignoreState + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeLong(this.dataId);
        parcel.writeString(this.owner);
        parcel.writeString(this.docId);
        parcel.writeString(this.category);
        parcel.writeString(this.title);
        parcel.writeString(this.indicatorName);
        parcel.writeString(this.department);
        parcel.writeLong(this.reviewTime);
        parcel.writeString(this.desc);
        parcel.writeString(this.calendarRemind);
        parcel.writeInt(this.state);
        parcel.writeInt(this.source);
        parcel.writeInt(this.ignoreState);
    }

    public /* synthetic */ HealthReviewPlan(long j2, String str, String str2, String str3, String str4, String str5, String str6, long j3, String str7, String str8, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : j2, (i4 & 2) != 0 ? null : str, (i4 & 4) != 0 ? null : str2, (i4 & 8) != 0 ? null : str3, (i4 & 16) != 0 ? null : str4, (i4 & 32) != 0 ? null : str5, (i4 & 64) != 0 ? null : str6, (i4 & 128) == 0 ? j3 : 0L, (i4 & 256) != 0 ? null : str7, (i4 & 512) == 0 ? str8 : null, (i4 & 1024) != 0 ? -1 : i, (i4 & 2048) != 0 ? 0 : i2, (i4 & 4096) == 0 ? i3 : 0);
    }

    public HealthReviewPlan(long j2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, long j3, @Nullable String str7, @Nullable String str8, int i, int i2, int i3) {
        this.dataId = j2;
        this.owner = str;
        this.docId = str2;
        this.category = str3;
        this.title = str4;
        this.indicatorName = str5;
        this.department = str6;
        this.reviewTime = j3;
        this.desc = str7;
        this.calendarRemind = str8;
        this.state = i;
        this.source = i2;
        this.ignoreState = i3;
    }
}
