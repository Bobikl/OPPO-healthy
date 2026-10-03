package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class SpaceInfo implements Parcelable {
    public static final Parcelable.Creator<SpaceInfo> CREATOR = new a();
    private String cardCode;
    private String containerCode;
    private String containerSubtitle;
    private String containerTitle;
    private int containerType;
    private long displayEndTime;
    private long displayStatTime;
    private List<SpaceCardMetaData> materielList;
    private String moreJumpUrl;
    private String moreTitle;
    private String pageCode;
    private int priority;
    private String strategyCode;
    private long swipeDuration;

    public class a implements Parcelable.Creator<SpaceInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SpaceInfo createFromParcel(Parcel parcel) {
            return new SpaceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SpaceInfo[] newArray(int i) {
            return new SpaceInfo[i];
        }
    }

    public SpaceInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpaceInfo spaceInfo = (SpaceInfo) obj;
        return this.containerType == spaceInfo.containerType && this.displayStatTime == spaceInfo.displayStatTime && this.displayEndTime == spaceInfo.displayEndTime && this.swipeDuration == spaceInfo.swipeDuration && this.priority == spaceInfo.priority && Objects.equals(this.strategyCode, spaceInfo.strategyCode) && Objects.equals(this.containerCode, spaceInfo.containerCode) && Objects.equals(this.pageCode, spaceInfo.pageCode) && Objects.equals(this.cardCode, spaceInfo.cardCode) && Objects.equals(this.containerTitle, spaceInfo.containerTitle) && Objects.equals(this.containerSubtitle, spaceInfo.containerSubtitle) && Objects.equals(this.moreTitle, spaceInfo.moreTitle) && Objects.equals(this.moreJumpUrl, spaceInfo.moreJumpUrl) && Objects.equals(this.materielList, spaceInfo.materielList);
    }

    public String getCardCode() {
        return this.cardCode;
    }

    public String getContainerCode() {
        return this.containerCode;
    }

    public String getContainerSubtitle() {
        return this.containerSubtitle;
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

    public List<SpaceCardMetaData> getMaterielList() {
        return this.materielList;
    }

    public String getMoreJumpUrl() {
        return this.moreJumpUrl;
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

    public long getSwipeDuration() {
        return this.swipeDuration;
    }

    public int hashCode() {
        return Objects.hash(this.strategyCode, Integer.valueOf(this.containerType), this.containerCode, this.pageCode, this.cardCode, this.containerTitle, this.containerSubtitle, this.moreTitle, this.moreJumpUrl, Long.valueOf(this.displayStatTime), Long.valueOf(this.displayEndTime), Long.valueOf(this.swipeDuration), Integer.valueOf(this.priority), this.materielList);
    }

    public void setCardCode(String str) {
        this.cardCode = str;
    }

    public void setContainerCode(String str) {
        this.containerCode = str;
    }

    public void setContainerSubtitle(String str) {
        this.containerSubtitle = str;
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

    public void setMaterielList(List<SpaceCardMetaData> list) {
        this.materielList = list;
    }

    public void setMoreJumpUrl(String str) {
        this.moreJumpUrl = str;
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

    public void setSwipeDuration(long j2) {
        this.swipeDuration = j2;
    }

    public String toString() {
        return "SpaceInfo{strategyCode='" + this.strategyCode + "', containerType=" + this.containerType + ", containerCode='" + this.containerCode + "', pageCode='" + this.pageCode + "', cardCode='" + this.cardCode + "', containerTitle='" + this.containerTitle + "', containerSubtitle='" + this.containerSubtitle + "', moreTitle='" + this.moreTitle + "', moreJumpUrl='" + this.moreJumpUrl + "', displayStatTime=" + this.displayStatTime + ", displayEndTime=" + this.displayEndTime + ", swipeDuration=" + this.swipeDuration + ", priority=" + this.priority + ", materielList=" + this.materielList + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.strategyCode);
        parcel.writeInt(this.containerType);
        parcel.writeString(this.containerCode);
        parcel.writeString(this.pageCode);
        parcel.writeString(this.cardCode);
        parcel.writeString(this.containerTitle);
        parcel.writeString(this.containerSubtitle);
        parcel.writeString(this.moreTitle);
        parcel.writeString(this.moreJumpUrl);
        parcel.writeLong(this.displayStatTime);
        parcel.writeLong(this.displayEndTime);
        parcel.writeLong(this.swipeDuration);
        parcel.writeInt(this.priority);
        parcel.writeTypedList(this.materielList);
    }

    public SpaceInfo(Parcel parcel) {
        this.strategyCode = parcel.readString();
        this.containerType = parcel.readInt();
        this.containerCode = parcel.readString();
        this.pageCode = parcel.readString();
        this.cardCode = parcel.readString();
        this.containerTitle = parcel.readString();
        this.containerSubtitle = parcel.readString();
        this.moreTitle = parcel.readString();
        this.moreJumpUrl = parcel.readString();
        this.displayStatTime = parcel.readLong();
        this.displayEndTime = parcel.readLong();
        this.swipeDuration = parcel.readLong();
        this.priority = parcel.readInt();
        this.materielList = parcel.createTypedArrayList(SpaceCardMetaData.CREATOR);
    }
}
