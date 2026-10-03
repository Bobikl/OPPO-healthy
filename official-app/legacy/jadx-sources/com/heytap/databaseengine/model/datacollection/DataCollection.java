package com.heytap.databaseengine.model.datacollection;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.datacollection.DBDataCollection;
import com.oplus.aiunit.vision.v05;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B_\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005¢\u0006\u0002\u0010\u0010J\t\u0010!\u001a\u00020\bHÖ\u0001J\b\u0010\"\u001a\u00020\u0005H\u0016J\b\u0010#\u001a\u00020\fH\u0016J\b\u0010$\u001a\u00020\u0005H\u0016J\b\u0010%\u001a\u00020\fH\u0016J\u000e\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\fJ\u000e\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0005J\u000e\u0010+\u001a\u00020'2\u0006\u0010,\u001a\u00020\fJ\b\u0010-\u001a\u00020\u0005H\u0016J\u0019\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\bHÖ\u0001R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/heytap/databaseengine/model/datacollection/DataCollection;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "()V", "ssoid", "", "clientId", "date", "", DBDataCollection.FIELD, "business", "startTimestamp", "", "endTimestamp", "count", "content", "(Ljava/lang/String;Ljava/lang/String;IIIJJILjava/lang/String;)V", "getBusiness", "()I", "setBusiness", "(I)V", "getClientId", "()Ljava/lang/String;", "setClientId", "(Ljava/lang/String;)V", "getContent", "setContent", "getCount", "setCount", "getDate", "setDate", "getField", "setField", "describeContents", "getDeviceUniqueId", "getEndTimestamp", "getSsoid", "getStartTimestamp", "setEndTimestamp", "", "mEndTimestamp", "setSsoid", "mSsoid", "setStartTimestamp", "mStartTimestamp", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DataCollection extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DataCollection> CREATOR = new a();
    private int business;

    @NotNull
    private String clientId;

    @NotNull
    private String content;
    private int count;
    private int date;
    private long endTimestamp;
    private int field;

    @NotNull
    private String ssoid;
    private long startTimestamp;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DataCollection> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DataCollection createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DataCollection(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DataCollection[] newArray(int i) {
            return new DataCollection[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DataCollection(String str, String str2, int i, int i2, int i3, long j2, long j3, int i4, String str3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        String str4 = (i5 & 1) != 0 ? "" : str;
        String str5 = (i5 & 2) != 0 ? "" : str2;
        int i6 = (i5 & 4) != 0 ? v05.i(System.currentTimeMillis()) : i;
        int i7 = (i5 & 8) != 0 ? 1 : i2;
        int i8 = (i5 & 16) == 0 ? i3 : 1;
        long jQ = (i5 & 32) != 0 ? v05.q(System.currentTimeMillis()) : j2;
        this(str4, str5, i6, i7, i8, jQ, (i5 & 64) != 0 ? jQ : j3, (i5 & 128) != 0 ? 0 : i4, (i5 & 256) == 0 ? str3 : "");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getBusiness() {
        return this.business;
    }

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getDate() {
        return this.date;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getDeviceUniqueId() {
        return this.clientId;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return RangesKt___RangesKt.coerceAtLeast(this.endTimestamp, this.startTimestamp);
    }

    public final int getField() {
        return this.field;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final void setBusiness(int i) {
        this.business = i;
    }

    public final void setClientId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clientId = str;
    }

    public final void setContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.content = str;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setEndTimestamp(long mEndTimestamp) {
        this.endTimestamp = mEndTimestamp;
    }

    public final void setField(int i) {
        this.field = i;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setStartTimestamp(long mStartTimestamp) {
        this.startTimestamp = mStartTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DataCollection(ssoid='" + this.ssoid + "', clientId='" + this.clientId + "', date=" + this.date + ", field=" + this.field + ", business=" + this.business + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", count=" + this.count + ", content='" + this.content + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.clientId);
        parcel.writeInt(this.date);
        parcel.writeInt(this.field);
        parcel.writeInt(this.business);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeInt(this.count);
        parcel.writeString(this.content);
    }

    public DataCollection(@NotNull String ssoid, @NotNull String clientId, int i, int i2, int i3, long j2, long j3, int i4, @NotNull String content) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(content, "content");
        this.ssoid = ssoid;
        this.clientId = clientId;
        this.date = i;
        this.field = i2;
        this.business = i3;
        this.startTimestamp = j2;
        this.endTimestamp = j3;
        this.count = i4;
        this.content = content;
    }

    public DataCollection() {
        this("", "", v05.i(System.currentTimeMillis()), 1, 1, v05.q(System.currentTimeMillis()), v05.q(System.currentTimeMillis()), 0, "");
    }
}
