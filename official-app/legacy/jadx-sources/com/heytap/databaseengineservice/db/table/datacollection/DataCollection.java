package com.heytap.databaseengineservice.db.table.datacollection;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.health.operation.ecg.business.PdfViewActivity;
import com.oplus.aiunit.vision.v05;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.datacollection.DBDataCollection, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u0002:\u00017Ba\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0011\u0012\b\b\u0002\u0010$\u001a\u00020\u0011\u0012\b\b\u0002\u0010'\u001a\u00020\u0011\u0012\b\b\u0002\u0010*\u001a\u00020\u0005\u0012\b\b\u0002\u0010,\u001a\u00020\u0005\u0012\b\b\u0002\u0010-\u001a\u00020\u0011\u0012\b\b\u0002\u00100\u001a\u00020\u0003¢\u0006\u0004\b3\u00104B\t\b\u0016¢\u0006\u0004\b3\u00105J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0005J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0017\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\"\u0010'\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\u0016\u0010*\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\"\u0010-\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#R\"\u00100\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0018\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u001d¨\u00068"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/datacollection/DBDataCollection;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "getSsoid", "", "getStartTimestamp", "getEndTimestamp", "getDeviceUniqueId", "mSsoid", "", "setSsoid", "mStartTimestamp", "setStartTimestamp", "mEndTimestamp", "setEndTimestamp", "toString", "", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "ssoid", "Ljava/lang/String;", "clientId", "getClientId", "()Ljava/lang/String;", "setClientId", "(Ljava/lang/String;)V", "date", "I", "getDate", "()I", "setDate", "(I)V", DataCollection.FIELD, "getField", "setField", "business", "getBusiness", "setBusiness", "startTimestamp", "J", "endTimestamp", "count", "getCount", "setCount", "content", "getContent", "setContent", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIIJJILjava/lang/String;)V", "()V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "client_id", "date", DataCollection.FIELD, "business"}, tableName = DataCollection.TABLE_NAME)
public final class DataCollection extends SportHealthData implements Parcelable {

    @NotNull
    public static final String BUSINESS = "business";

    @NotNull
    public static final String CLIENT_ID = "client_id";

    @NotNull
    public static final String CONTENT = "content";

    @NotNull
    public static final String COUNT = "count";

    @NotNull
    public static final String DATE = "date";

    @NotNull
    public static final String END_TIMESTAMP = "end_timestamp";

    @NotNull
    public static final String FIELD = "field";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String START_TIMESTAMP = "start_timestamp";

    @NotNull
    public static final String TABLE_NAME = "DBDataCollection";

    @ColumnInfo(name = "business")
    private int business;

    @ColumnInfo(name = "client_id")
    @NotNull
    private String clientId;

    @ColumnInfo(name = "content")
    @NotNull
    private String content;

    @ColumnInfo(name = "count")
    private int count;

    @ColumnInfo(name = "date")
    private int date;

    @ColumnInfo(name = "end_timestamp")
    private long endTimestamp;

    @ColumnInfo(name = FIELD)
    private int field;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = "start_timestamp")
    private long startTimestamp;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DataCollection> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.datacollection.DBDataCollection$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/datacollection/DBDataCollection$a;", "", "", "a", "BUSINESS", "Ljava/lang/String;", "CLIENT_ID", "CONTENT", "COUNT", "DATE", "END_TIMESTAMP", "FIELD", PdfViewActivity.SSOID, "START_TIMESTAMP", "TABLE_NAME", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBDataCollection(ssoid TEXT not null,client_id TEXT not null,date INTEGER not null,field INTEGER not null,business INTEGER not null,start_timestamp INTEGER not null,end_timestamp INTEGER not null,count INTEGER not null,content TEXT not null,primary key(ssoid,client_id,date," + DataCollection.FIELD + ",business))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.datacollection.DBDataCollection$b */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DataCollection> {
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

    @JvmStatic
    @NotNull
    public static final String createTable() {
        return INSTANCE.a();
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
