package com.heytap.databaseengine.model.snore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class SnoreDbFileInfo extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<SnoreDbFileInfo> CREATOR = new a();
    private String clientFileId;
    private int date;
    private String extension;
    private String fileName;
    private String filePath;
    private int fileSource;
    private int fileType;
    private long snoreDbEndTimestamp;
    private long snoreDbStartTimestamp;
    private String ssoid;
    private String timezone;
    private int version;

    public class a implements Parcelable.Creator<SnoreDbFileInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SnoreDbFileInfo createFromParcel(Parcel parcel) {
            return new SnoreDbFileInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SnoreDbFileInfo[] newArray(int i) {
            return new SnoreDbFileInfo[i];
        }
    }

    public SnoreDbFileInfo() {
        this.fileType = 1;
        this.fileSource = 1;
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

    public String getExtension() {
        return this.extension;
    }

    public String getFileName() {
        return this.fileName;
    }

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
    public String getSsoid() {
        return this.ssoid;
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

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setFilePath(String str) {
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

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "SnoreDbFile{ssoid='" + this.ssoid + "', date=" + this.date + ", timezone='" + this.timezone + "', name='" + this.fileName + "', path='" + this.filePath + "', clientFileId='" + this.clientFileId + "', fileType=" + this.fileType + ", fileSource=" + this.fileSource + ", version=" + this.version + ", extension='" + this.extension + "', snoreDbStartTimestamp=" + this.snoreDbStartTimestamp + ", snoreDbEndTimestamp=" + this.snoreDbEndTimestamp + "} ";
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
    }

    public SnoreDbFileInfo(Parcel parcel) {
        this.fileType = 1;
        this.fileSource = 1;
        this.ssoid = parcel.readString();
        this.date = parcel.readInt();
        this.timezone = parcel.readString();
        this.fileName = parcel.readString();
        this.filePath = parcel.readString();
        this.clientFileId = parcel.readString();
        this.fileType = parcel.readInt();
        this.fileSource = parcel.readInt();
        this.version = parcel.readInt();
        this.extension = parcel.readString();
        this.snoreDbStartTimestamp = parcel.readLong();
        this.snoreDbEndTimestamp = parcel.readLong();
    }
}
