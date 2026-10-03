package com.heytap.databaseengineservice.db.table.snore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthArchiveFile;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import com.oplus.backup.sdk.common.utils.Constants;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Entity(primaryKeys = {"ssoid", Constants.MessagerConstants.INTENT_GET_FD_FILE_PATH, "start_timestamp", "end_timestamp"}, tableName = "DBSnoreDbFileInfo")
@Keep
public class DBSnoreDbFileInfo extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<DBSnoreDbFileInfo> CREATOR = new a();

    @ColumnInfo(name = DBHealthArchiveFile.CLIENT_FILE_ID)
    private String clientFileId;

    @ColumnInfo(name = "date")
    private int date;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = DBSportMetadata.EXTENSION)
    private String extension;

    @ColumnInfo(name = "file_name")
    private String fileName;

    @NonNull
    @ColumnInfo(name = Constants.MessagerConstants.INTENT_GET_FD_FILE_PATH)
    private String filePath;

    @ColumnInfo(name = "source")
    private int fileSource;

    @ColumnInfo(name = "type")
    private int fileType;

    @ColumnInfo(name = "end_timestamp")
    private long snoreDbEndTimestamp;

    @ColumnInfo(name = "start_timestamp")
    private long snoreDbStartTimestamp;

    @NonNull
    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "timezone")
    private String timezone;

    @ColumnInfo(name = "version")
    private int version;

    public class a implements Parcelable.Creator<DBSnoreDbFileInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBSnoreDbFileInfo createFromParcel(Parcel parcel) {
            return new DBSnoreDbFileInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBSnoreDbFileInfo[] newArray(int i) {
            return new DBSnoreDbFileInfo[i];
        }
    }

    public DBSnoreDbFileInfo() {
        this.ssoid = "";
        this.filePath = "";
        this.clientFileId = "";
        this.display = 0;
    }

    public static String createSnoreDbFileInfoTableSQL() {
        return "create table if not exists DBSnoreDbFileInfo (ssoid TEXT not null,date INTEGER not null,timezone TEXT,file_name TEXT,file_path TEXT not null,client_file_id TEXT,start_timestamp INTEGER not null,end_timestamp INTEGER not null,type INTEGER not null,source INTEGER not null,version INTEGER not null,extension TEXT,primary key(ssoid," + Constants.MessagerConstants.INTENT_GET_FD_FILE_PATH + ",start_timestamp,end_timestamp))";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getClientFileId() {
        return this.clientFileId;
    }

    public int getDate() {
        return this.date;
    }

    public int getDisplay() {
        return this.display;
    }

    public String getExtension() {
        return this.extension;
    }

    public String getFileName() {
        return this.fileName;
    }

    @NonNull
    public String getFilePath() {
        return this.filePath;
    }

    public int getFileSource() {
        return this.fileSource;
    }

    public int getFileType() {
        return this.fileType;
    }

    public long getSnoreDbEndTimestamp() {
        return this.snoreDbEndTimestamp;
    }

    public long getSnoreDbStartTimestamp() {
        return this.snoreDbStartTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public int getVersion() {
        return this.version;
    }

    public void setClientFileId(String str) {
        this.clientFileId = str;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setFilePath(@NonNull String str) {
        this.filePath = str;
    }

    public void setFileSource(int i) {
        this.fileSource = i;
    }

    public void setFileType(int i) {
        this.fileType = i;
    }

    public void setSnoreDbEndTimestamp(long j2) {
        this.snoreDbEndTimestamp = j2;
    }

    public void setSnoreDbStartTimestamp(long j2) {
        this.snoreDbStartTimestamp = j2;
    }

    public void setSsoid(@NotNull String str) {
        this.ssoid = str;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "DBSnoreDbFileInfo{ssoid='" + this.ssoid + "', date=" + this.date + ", timezone='" + this.timezone + "', fileName='" + this.fileName + "', filePath='" + this.filePath + "', clientFileId='" + this.clientFileId + "', snoreDbStartTimestamp=" + this.snoreDbStartTimestamp + ", snoreDbEndTimestamp=" + this.snoreDbEndTimestamp + ", fileType=" + this.fileType + ", fileSource=" + this.fileSource + ", version=" + this.version + ", extension='" + this.extension + "', syncStatus=" + this.syncStatus + ", display=" + this.display + "} ";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
        parcel.writeString(this.fileName);
        parcel.writeString(this.filePath);
        parcel.writeString(this.clientFileId);
        parcel.writeInt(this.fileType);
        parcel.writeInt(this.fileSource);
        parcel.writeInt(this.version);
        parcel.writeString(this.extension);
        parcel.writeLong(this.snoreDbStartTimestamp);
        parcel.writeLong(this.snoreDbEndTimestamp);
        parcel.writeInt(this.syncStatus);
        parcel.writeInt(this.display);
    }

    public DBSnoreDbFileInfo(Parcel parcel) {
        this.ssoid = "";
        this.filePath = "";
        this.clientFileId = "";
        this.display = 0;
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.ssoid = string;
        this.date = parcel.readInt();
        this.timezone = parcel.readString();
        this.fileName = parcel.readString();
        String string2 = parcel.readString();
        Objects.requireNonNull(string2);
        this.filePath = string2;
        this.clientFileId = parcel.readString();
        this.fileType = parcel.readInt();
        this.fileSource = parcel.readInt();
        this.version = parcel.readInt();
        this.extension = parcel.readString();
        this.snoreDbStartTimestamp = parcel.readLong();
        this.snoreDbEndTimestamp = parcel.readLong();
        this.syncStatus = parcel.readInt();
        this.display = parcel.readInt();
    }
}
