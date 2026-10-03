package com.heytap.databaseengineservice.db.table.space;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.heytap.store.base.core.util.statistics.StatisticsUtil;

/* JADX INFO: loaded from: classes15.dex */
@Entity(tableName = "DBSpaceInfo")
@Keep
public class DBSpaceInfo implements Parcelable {
    public static final Parcelable.Creator<DBSpaceInfo> CREATOR = new a();

    @ColumnInfo(name = StatisticsUtil.LOG_CARD_CODE)
    private String cardCode;

    @ColumnInfo(name = "container_code")
    private String containerCode;

    @ColumnInfo(name = "container_title")
    private String containerTitle;

    @ColumnInfo(name = "container_type")
    private int containerType;

    @ColumnInfo(name = "display_endTime")
    private long displayEndTime;

    @ColumnInfo(name = "display_startTime")
    private long displayStatTime;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private long id;

    @ColumnInfo(name = "materielList")
    private String materielList;

    @ColumnInfo(name = "more_jumpUrl")
    private String moreJumplUrl;

    @ColumnInfo(name = "more_title")
    private String moreTitle;

    @ColumnInfo(name = StatisticsUtil.LOG_PAGE_CODE)
    private String pageCode;

    @ColumnInfo(name = "priority")
    private int priority;

    @ColumnInfo(name = "strategy_code")
    private String strategyCode;

    public class a implements Parcelable.Creator<DBSpaceInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBSpaceInfo createFromParcel(Parcel parcel) {
            return new DBSpaceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBSpaceInfo[] newArray(int i) {
            return new DBSpaceInfo[i];
        }
    }

    public DBSpaceInfo() {
    }

    public static String createSpaceInfoTableSQL() {
        return "create table if not exists DBSpaceInfo(_id INTEGER primary key autoincrement not null,strategy_code TEXT,container_type INTEGER not null,container_code TEXT,page_code TEXT,card_code TEXT,container_title TEXT,more_title TEXT,more_jumpUrl TEXT,display_startTime INTEGER not null,display_endTime INTEGER not null,priority INTEGER not null,materielList TEXT)";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCardCode() {
        return this.cardCode;
    }

    public String getContainerCode() {
        return this.containerCode;
    }

    public String getContainerTitle() {
        return this.containerTitle;
    }

    public int getContainerType() {
        return this.containerType;
    }

    public long getDisplayEndTime() {
        return this.displayEndTime;
    }

    public long getDisplayStatTime() {
        return this.displayStatTime;
    }

    public long getId() {
        return this.id;
    }

    public String getMaterielList() {
        return this.materielList;
    }

    public String getMoreJumplUrl() {
        return this.moreJumplUrl;
    }

    public String getMoreTitle() {
        return this.moreTitle;
    }

    public String getPageCode() {
        return this.pageCode;
    }

    public int getPriority() {
        return this.priority;
    }

    public String getStrategyCode() {
        return this.strategyCode;
    }

    public void setCardCode(String str) {
        this.cardCode = str;
    }

    public void setContainerCode(String str) {
        this.containerCode = str;
    }

    public void setContainerTitle(String str) {
        this.containerTitle = str;
    }

    public void setContainerType(int i) {
        this.containerType = i;
    }

    public void setDisplayEndTime(long j2) {
        this.displayEndTime = j2;
    }

    public void setDisplayStatTime(long j2) {
        this.displayStatTime = j2;
    }

    public void setId(long j2) {
        this.id = j2;
    }

    public void setMaterielList(String str) {
        this.materielList = str;
    }

    public void setMoreJumplUrl(String str) {
        this.moreJumplUrl = str;
    }

    public void setMoreTitle(String str) {
        this.moreTitle = str;
    }

    public void setPageCode(String str) {
        this.pageCode = str;
    }

    public void setPriority(int i) {
        this.priority = i;
    }

    public void setStrategyCode(String str) {
        this.strategyCode = str;
    }

    public String toString() {
        return "DBSpaceInfo{id=" + this.id + ", strategyCode='" + this.strategyCode + "', containerType=" + this.containerType + ", containerCode='" + this.containerCode + "', pageCode='" + this.pageCode + "', cardCode='" + this.cardCode + "', containerTitle='" + this.containerTitle + "', moreTitle='" + this.moreTitle + "', moreJumplUrl='" + this.moreJumplUrl + "', displayStatTime=" + this.displayStatTime + ", displayEndTime=" + this.displayEndTime + ", priority=" + this.priority + ", materielList='" + this.materielList + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeString(this.strategyCode);
        parcel.writeInt(this.containerType);
        parcel.writeString(this.containerCode);
        parcel.writeString(this.pageCode);
        parcel.writeString(this.cardCode);
        parcel.writeString(this.containerTitle);
        parcel.writeString(this.moreTitle);
        parcel.writeString(this.moreJumplUrl);
        parcel.writeLong(this.displayStatTime);
        parcel.writeLong(this.displayEndTime);
        parcel.writeInt(this.priority);
        parcel.writeString(this.materielList);
    }

    public DBSpaceInfo(Parcel parcel) {
        this.id = parcel.readLong();
        this.strategyCode = parcel.readString();
        this.containerType = parcel.readInt();
        this.containerCode = parcel.readString();
        this.pageCode = parcel.readString();
        this.cardCode = parcel.readString();
        this.containerTitle = parcel.readString();
        this.moreTitle = parcel.readString();
        this.moreJumplUrl = parcel.readString();
        this.displayStatTime = parcel.readLong();
        this.displayEndTime = parcel.readLong();
        this.priority = parcel.readInt();
        this.materielList = parcel.readString();
    }
}
