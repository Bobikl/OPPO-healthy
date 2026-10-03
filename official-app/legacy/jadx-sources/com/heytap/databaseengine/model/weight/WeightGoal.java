package com.heytap.databaseengine.model.weight;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b+\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0087\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007¢\u0006\u0002\u0010\u0013J\t\u00102\u001a\u00020\tHÖ\u0001J\b\u00103\u001a\u00020\u0004H\u0016J\u000e\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0004J\b\u00107\u001a\u00020\u0004H\u0016J\u0019\u00108\u001a\u0002052\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\r\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001b\"\u0004\b'\u0010\u001dR\u001a\u0010\u0010\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dR\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006<"}, d2 = {"Lcom/heytap/databaseengine/model/weight/WeightGoal;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "ssoid", "", "userTagId", "effectiveDate", "", "initialWeightG", "", "targetWeightG", "expectedAchieveDate", "createdAt", "display", "goalDirection", "latestWeightG", "latestWeightTimestamp", "state", "actualEndDate", "(Ljava/lang/String;Ljava/lang/String;JIIJJIIIJIJ)V", "getActualEndDate", "()J", "setActualEndDate", "(J)V", "getCreatedAt", "setCreatedAt", "getDisplay", "()I", "setDisplay", "(I)V", "getEffectiveDate", "setEffectiveDate", "getExpectedAchieveDate", "setExpectedAchieveDate", "getGoalDirection", "setGoalDirection", "getInitialWeightG", "setInitialWeightG", "getLatestWeightG", "setLatestWeightG", "getLatestWeightTimestamp", "setLatestWeightTimestamp", "getState", "setState", "getTargetWeightG", "setTargetWeightG", "getUserTagId", "()Ljava/lang/String;", "setUserTagId", "(Ljava/lang/String;)V", "describeContents", "getSsoid", "setSsoid", "", "mSsoid", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "heytap_health_sdk_v2.1.7_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WeightGoal extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WeightGoal> CREATOR = new a();
    private long actualEndDate;
    private long createdAt;
    private int display;
    private long effectiveDate;
    private long expectedAchieveDate;
    private int goalDirection;
    private int initialWeightG;
    private int latestWeightG;
    private long latestWeightTimestamp;

    @NotNull
    private String ssoid;
    private int state;
    private int targetWeightG;

    @NotNull
    private String userTagId;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WeightGoal> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WeightGoal createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WeightGoal(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final WeightGoal[] newArray(int i) {
            return new WeightGoal[i];
        }
    }

    public WeightGoal() {
        this(null, null, 0L, 0, 0, 0L, 0L, 0, 0, 0, 0L, 0, 0L, 8191, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long getActualEndDate() {
        return this.actualEndDate;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final int getDisplay() {
        return this.display;
    }

    public final long getEffectiveDate() {
        return this.effectiveDate;
    }

    public final long getExpectedAchieveDate() {
        return this.expectedAchieveDate;
    }

    public final int getGoalDirection() {
        return this.goalDirection;
    }

    public final int getInitialWeightG() {
        return this.initialWeightG;
    }

    public final int getLatestWeightG() {
        return this.latestWeightG;
    }

    public final long getLatestWeightTimestamp() {
        return this.latestWeightTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public final int getState() {
        return this.state;
    }

    public final int getTargetWeightG() {
        return this.targetWeightG;
    }

    @NotNull
    public final String getUserTagId() {
        return this.userTagId;
    }

    public final void setActualEndDate(long j2) {
        this.actualEndDate = j2;
    }

    public final void setCreatedAt(long j2) {
        this.createdAt = j2;
    }

    public final void setDisplay(int i) {
        this.display = i;
    }

    public final void setEffectiveDate(long j2) {
        this.effectiveDate = j2;
    }

    public final void setExpectedAchieveDate(long j2) {
        this.expectedAchieveDate = j2;
    }

    public final void setGoalDirection(int i) {
        this.goalDirection = i;
    }

    public final void setInitialWeightG(int i) {
        this.initialWeightG = i;
    }

    public final void setLatestWeightG(int i) {
        this.latestWeightG = i;
    }

    public final void setLatestWeightTimestamp(long j2) {
        this.latestWeightTimestamp = j2;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final void setTargetWeightG(int i) {
        this.targetWeightG = i;
    }

    public final void setUserTagId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userTagId = str;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "WeightGoal(ssoid='" + this.ssoid + "', userTagId='" + this.userTagId + "', effectiveDate=" + this.effectiveDate + ", initialWeightG=" + this.initialWeightG + ", targetWeightG=" + this.targetWeightG + ", expectedAchieveDate=" + this.expectedAchieveDate + ", createdAt=" + this.createdAt + ", display=" + this.display + ", goalDirection=" + this.goalDirection + ", latestWeightG=" + this.latestWeightG + ", latestWeightTimestamp=" + this.latestWeightTimestamp + ", state=" + this.state + ", actualEndDate=" + this.actualEndDate + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.userTagId);
        parcel.writeLong(this.effectiveDate);
        parcel.writeInt(this.initialWeightG);
        parcel.writeInt(this.targetWeightG);
        parcel.writeLong(this.expectedAchieveDate);
        parcel.writeLong(this.createdAt);
        parcel.writeInt(this.display);
        parcel.writeInt(this.goalDirection);
        parcel.writeInt(this.latestWeightG);
        parcel.writeLong(this.latestWeightTimestamp);
        parcel.writeInt(this.state);
        parcel.writeLong(this.actualEndDate);
    }

    public /* synthetic */ WeightGoal(String str, String str2, long j2, int i, int i2, long j3, long j4, int i3, int i4, int i5, long j5, int i6, long j6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) == 0 ? str2 : "", (i7 & 4) != 0 ? 0L : j2, (i7 & 8) != 0 ? 0 : i, (i7 & 16) != 0 ? 0 : i2, (i7 & 32) != 0 ? 0L : j3, (i7 & 64) != 0 ? 0L : j4, (i7 & 128) != 0 ? 0 : i3, (i7 & 256) != 0 ? 0 : i4, (i7 & 512) != 0 ? 0 : i5, (i7 & 1024) != 0 ? 0L : j5, (i7 & 2048) == 0 ? i6 : 0, (i7 & 4096) != 0 ? 0L : j6);
    }

    public WeightGoal(@NotNull String ssoid, @NotNull String userTagId, long j2, int i, int i2, long j3, long j4, int i3, int i4, int i5, long j5, int i6, long j6) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(userTagId, "userTagId");
        this.ssoid = ssoid;
        this.userTagId = userTagId;
        this.effectiveDate = j2;
        this.initialWeightG = i;
        this.targetWeightG = i2;
        this.expectedAchieveDate = j3;
        this.createdAt = j4;
        this.display = i3;
        this.goalDirection = i4;
        this.latestWeightG = i5;
        this.latestWeightTimestamp = j5;
        this.state = i6;
        this.actualEndDate = j6;
    }
}
