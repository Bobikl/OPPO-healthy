package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.accessory.file.model.Constant;
import com.heytap.log.consts.LogSenderConst;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010'\u001a\u00020\u0004HÂ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010.\u001a\u00020\u000eHÆ\u0003Jn\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u00100J\t\u00101\u001a\u00020\tHÖ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\b\u00106\u001a\u00020\u0004H\u0016J\t\u00107\u001a\u00020\tHÖ\u0001J\u000e\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0004J\b\u0010;\u001a\u00020\u0004H\u0016J\u0019\u0010<\u001a\u0002092\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\tHÖ\u0001R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/heytap/databaseengine/model/ThirdSportImportRecord;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "ssoid", "", "sportClientIdList", "", LogSenderConst.FILENAME, Constant.FILE_SIZE, "", "fileSource", "batchId", Fields.FILE_TYPE, "operationTime", "", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;J)V", "getBatchId", "()Ljava/lang/String;", "setBatchId", "(Ljava/lang/String;)V", "getFileName", "setFileName", "getFileSize", "()Ljava/lang/Integer;", "setFileSize", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getFileSource", "setFileSource", "getFileType", "setFileType", "getOperationTime", "()J", "setOperationTime", "(J)V", "getSportClientIdList", "()Ljava/util/List;", "setSportClientIdList", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;J)Lcom/heytap/databaseengine/model/ThirdSportImportRecord;", "describeContents", "equals", "", "other", "", "getSsoid", "hashCode", "setSsoid", "", "mSsoid", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ThirdSportImportRecord extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ThirdSportImportRecord> CREATOR = new a();

    @Nullable
    private String batchId;

    @Nullable
    private String fileName;

    @Nullable
    private Integer fileSize;

    @Nullable
    private Integer fileSource;

    @Nullable
    private String fileType;
    private long operationTime;

    @NotNull
    private List<String> sportClientIdList;

    @NotNull
    private String ssoid;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ThirdSportImportRecord> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ThirdSportImportRecord createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ThirdSportImportRecord(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ThirdSportImportRecord[] newArray(int i) {
            return new ThirdSportImportRecord[i];
        }
    }

    public ThirdSportImportRecord() {
        this(null, null, null, null, null, null, null, 0L, 255, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getSsoid() {
        return this.ssoid;
    }

    @NotNull
    public final List<String> component2() {
        return this.sportClientIdList;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getFileSize() {
        return this.fileSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getFileSource() {
        return this.fileSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBatchId() {
        return this.batchId;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFileType() {
        return this.fileType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getOperationTime() {
        return this.operationTime;
    }

    @NotNull
    public final ThirdSportImportRecord copy(@NotNull String ssoid, @NotNull List<String> sportClientIdList, @Nullable String fileName, @Nullable Integer fileSize, @Nullable Integer fileSource, @Nullable String batchId, @Nullable String fileType, long operationTime) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(sportClientIdList, "sportClientIdList");
        return new ThirdSportImportRecord(ssoid, sportClientIdList, fileName, fileSize, fileSource, batchId, fileType, operationTime);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThirdSportImportRecord)) {
            return false;
        }
        ThirdSportImportRecord thirdSportImportRecord = (ThirdSportImportRecord) other;
        return Intrinsics.areEqual(this.ssoid, thirdSportImportRecord.ssoid) && Intrinsics.areEqual(this.sportClientIdList, thirdSportImportRecord.sportClientIdList) && Intrinsics.areEqual(this.fileName, thirdSportImportRecord.fileName) && Intrinsics.areEqual(this.fileSize, thirdSportImportRecord.fileSize) && Intrinsics.areEqual(this.fileSource, thirdSportImportRecord.fileSource) && Intrinsics.areEqual(this.batchId, thirdSportImportRecord.batchId) && Intrinsics.areEqual(this.fileType, thirdSportImportRecord.fileType) && this.operationTime == thirdSportImportRecord.operationTime;
    }

    @Nullable
    public final String getBatchId() {
        return this.batchId;
    }

    @Nullable
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    public final Integer getFileSize() {
        return this.fileSize;
    }

    @Nullable
    public final Integer getFileSource() {
        return this.fileSource;
    }

    @Nullable
    public final String getFileType() {
        return this.fileType;
    }

    public final long getOperationTime() {
        return this.operationTime;
    }

    @NotNull
    public final List<String> getSportClientIdList() {
        return this.sportClientIdList;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public int hashCode() {
        int iHashCode = ((this.ssoid.hashCode() * 31) + this.sportClientIdList.hashCode()) * 31;
        String str = this.fileName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.fileSize;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.fileSource;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.batchId;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fileType;
        return ((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31) + Long.hashCode(this.operationTime);
    }

    public final void setBatchId(@Nullable String str) {
        this.batchId = str;
    }

    public final void setFileName(@Nullable String str) {
        this.fileName = str;
    }

    public final void setFileSize(@Nullable Integer num) {
        this.fileSize = num;
    }

    public final void setFileSource(@Nullable Integer num) {
        this.fileSource = num;
    }

    public final void setFileType(@Nullable String str) {
        this.fileType = str;
    }

    public final void setOperationTime(long j2) {
        this.operationTime = j2;
    }

    public final void setSportClientIdList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.sportClientIdList = list;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "ThirdSportImportRecord(ssoid='" + this.ssoid + "', sportClientIdList=" + this.sportClientIdList + ", fileName=" + this.fileName + ", fileSize=" + this.fileSize + ", fileSource=" + this.fileSource + ", batchId=" + this.batchId + ", fileType=" + this.fileType + ", operationTime=" + this.operationTime + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeStringList(this.sportClientIdList);
        parcel.writeString(this.fileName);
        Integer num = this.fileSize;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.fileSource;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.batchId);
        parcel.writeString(this.fileType);
        parcel.writeLong(this.operationTime);
    }

    public /* synthetic */ ThirdSportImportRecord(String str, List list, String str2, Integer num, Integer num2, String str3, String str4, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str3, (i & 64) == 0 ? str4 : null, (i & 128) != 0 ? 0L : j2);
    }

    public ThirdSportImportRecord(@NotNull String ssoid, @NotNull List<String> sportClientIdList, @Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2, @Nullable String str3, long j2) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(sportClientIdList, "sportClientIdList");
        this.ssoid = ssoid;
        this.sportClientIdList = sportClientIdList;
        this.fileName = str;
        this.fileSize = num;
        this.fileSource = num2;
        this.batchId = str2;
        this.fileType = str3;
        this.operationTime = j2;
    }
}
