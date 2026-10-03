package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class SpaceCardMetaData implements Parcelable {
    public static final Parcelable.Creator<SpaceCardMetaData> CREATOR = new a();
    private int actType;
    private String appIconUrl;
    private String backupJumpUrl;
    private String backupJumpUrlDesc;
    private int close;
    private Commodity commodity;
    private boolean compliance;
    private long currentTime;
    private String darkImageUrl;
    private long endTime;
    private String groupName;
    private int groupPos;
    private String imageUrl;
    private String impressions;
    private boolean join;
    private long joinNum;
    private String jumpUrl;
    private String jumpUrlDesc;
    private String materielCode;
    private String materielDesc;
    private String materielSubTitle;
    private String materielTitle;
    private String parentActCode;
    private String payAmount;
    private String periodNum;
    private String redPointContent;
    private long signUpEndTime;
    private long signUpStartTime;
    private long startTime;
    private int status;
    private int target;
    private String totalBonus;
    private int userRedPoint;

    public class a implements Parcelable.Creator<SpaceCardMetaData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SpaceCardMetaData createFromParcel(Parcel parcel) {
            return new SpaceCardMetaData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SpaceCardMetaData[] newArray(int i) {
            return new SpaceCardMetaData[i];
        }
    }

    public SpaceCardMetaData(Parcel parcel) {
        this.materielCode = parcel.readString();
        this.materielTitle = parcel.readString();
        this.materielSubTitle = parcel.readString();
        this.materielDesc = parcel.readString();
        this.commodity = (Commodity) parcel.readParcelable(Commodity.class.getClassLoader());
        this.imageUrl = parcel.readString();
        this.darkImageUrl = parcel.readString();
        this.jumpUrl = parcel.readString();
        this.jumpUrlDesc = parcel.readString();
        this.backupJumpUrl = parcel.readString();
        this.backupJumpUrlDesc = parcel.readString();
        this.currentTime = parcel.readLong();
        this.parentActCode = parcel.readString();
        this.actType = parcel.readInt();
        this.periodNum = parcel.readString();
        this.signUpStartTime = parcel.readLong();
        this.signUpEndTime = parcel.readLong();
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
        this.status = parcel.readInt();
        this.target = parcel.readInt();
        this.payAmount = parcel.readString();
        this.joinNum = parcel.readLong();
        this.totalBonus = parcel.readString();
        this.join = parcel.readByte() != 0;
        this.compliance = parcel.readByte() != 0;
        this.close = parcel.readInt();
        this.userRedPoint = parcel.readInt();
        this.redPointContent = parcel.readString();
        this.impressions = parcel.readString();
        this.groupName = parcel.readString();
        this.groupPos = parcel.readInt();
        this.appIconUrl = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpaceCardMetaData spaceCardMetaData = (SpaceCardMetaData) obj;
        return this.actType == spaceCardMetaData.actType && this.signUpStartTime == spaceCardMetaData.signUpStartTime && this.signUpEndTime == spaceCardMetaData.signUpEndTime && this.startTime == spaceCardMetaData.startTime && this.endTime == spaceCardMetaData.endTime && this.status == spaceCardMetaData.status && this.target == spaceCardMetaData.target && this.joinNum == spaceCardMetaData.joinNum && this.join == spaceCardMetaData.join && this.compliance == spaceCardMetaData.compliance && this.close == spaceCardMetaData.close && this.userRedPoint == spaceCardMetaData.userRedPoint && this.groupPos == spaceCardMetaData.groupPos && Objects.equals(this.materielCode, spaceCardMetaData.materielCode) && Objects.equals(this.materielTitle, spaceCardMetaData.materielTitle) && Objects.equals(this.materielSubTitle, spaceCardMetaData.materielSubTitle) && Objects.equals(this.materielDesc, spaceCardMetaData.materielDesc) && Objects.equals(this.commodity, spaceCardMetaData.commodity) && Objects.equals(this.imageUrl, spaceCardMetaData.imageUrl) && Objects.equals(this.darkImageUrl, spaceCardMetaData.darkImageUrl) && Objects.equals(this.jumpUrl, spaceCardMetaData.jumpUrl) && Objects.equals(this.jumpUrlDesc, spaceCardMetaData.jumpUrlDesc) && Objects.equals(this.backupJumpUrl, spaceCardMetaData.backupJumpUrl) && Objects.equals(this.backupJumpUrlDesc, spaceCardMetaData.backupJumpUrlDesc) && Objects.equals(this.parentActCode, spaceCardMetaData.parentActCode) && Objects.equals(this.periodNum, spaceCardMetaData.periodNum) && Objects.equals(this.payAmount, spaceCardMetaData.payAmount) && Objects.equals(this.totalBonus, spaceCardMetaData.totalBonus) && Objects.equals(this.redPointContent, spaceCardMetaData.redPointContent) && Objects.equals(this.impressions, spaceCardMetaData.impressions) && Objects.equals(this.groupName, spaceCardMetaData.groupName) && Objects.equals(this.appIconUrl, spaceCardMetaData.appIconUrl);
    }

    public int getActType() {
        return this.actType;
    }

    public String getAppIconUrl() {
        return this.appIconUrl;
    }

    public String getBackupJumpUrl() {
        return this.backupJumpUrl;
    }

    public String getBackupJumpUrlDesc() {
        return this.backupJumpUrlDesc;
    }

    public int getClose() {
        return this.close;
    }

    public Commodity getCommodity() {
        return this.commodity;
    }

    public long getCurrentTime() {
        return this.currentTime;
    }

    public String getDarkImageUrl() {
        return this.darkImageUrl;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public int getGroupPos() {
        return this.groupPos;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getImpressions() {
        return this.impressions;
    }

    public long getJoinNum() {
        return this.joinNum;
    }

    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public String getJumpUrlDesc() {
        return this.jumpUrlDesc;
    }

    public String getMaterielCode() {
        return this.materielCode;
    }

    public String getMaterielDesc() {
        return this.materielDesc;
    }

    public String getMaterielSubTitle() {
        return this.materielSubTitle;
    }

    public String getMaterielTitle() {
        return this.materielTitle;
    }

    public String getParentActCode() {
        return this.parentActCode;
    }

    public String getPayAmount() {
        return this.payAmount;
    }

    public String getPeriodNum() {
        return this.periodNum;
    }

    public int getRedPoint() {
        return this.userRedPoint;
    }

    public long getSignUpEndTime() {
        return this.signUpEndTime;
    }

    public long getSignUpStartTime() {
        return this.signUpStartTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public int getStatus() {
        return this.status;
    }

    public int getTarget() {
        return this.target;
    }

    public String getTotalBonus() {
        return this.totalBonus;
    }

    public String getUserRedPointContent() {
        return this.redPointContent;
    }

    public int hashCode() {
        return Objects.hash(this.materielCode, this.materielTitle, this.materielSubTitle, this.materielDesc, this.commodity, this.imageUrl, this.darkImageUrl, this.jumpUrl, this.jumpUrlDesc, this.backupJumpUrl, this.backupJumpUrlDesc, this.parentActCode, Integer.valueOf(this.actType), this.periodNum, Long.valueOf(this.signUpStartTime), Long.valueOf(this.signUpEndTime), Long.valueOf(this.startTime), Long.valueOf(this.endTime), Integer.valueOf(this.status), Integer.valueOf(this.target), this.payAmount, Long.valueOf(this.joinNum), this.totalBonus, Boolean.valueOf(this.join), Boolean.valueOf(this.compliance), Integer.valueOf(this.close), Integer.valueOf(this.userRedPoint), this.redPointContent, this.impressions, this.groupName, Integer.valueOf(this.groupPos), this.appIconUrl);
    }

    public boolean isCompliance() {
        return this.compliance;
    }

    public boolean isJoin() {
        return this.join;
    }

    public void setActType(int i) {
        this.actType = i;
    }

    public void setAppIconUrl(String str) {
        this.appIconUrl = str;
    }

    public void setBackupJumpUrl(String str) {
        this.backupJumpUrl = str;
    }

    public void setBackupJumpUrlDesc(String str) {
        this.backupJumpUrlDesc = str;
    }

    public void setClose(int i) {
        this.close = i;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public void setCompliance(boolean z) {
        this.compliance = z;
    }

    public void setCurrentTime(long j2) {
        this.currentTime = j2;
    }

    public void setDarkImageUrl(String str) {
        this.darkImageUrl = str;
    }

    public void setEndTime(long j2) {
        this.endTime = j2;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setGroupPos(int i) {
        this.groupPos = i;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setImpressions(String str) {
        this.impressions = str;
    }

    public void setJoin(boolean z) {
        this.join = z;
    }

    public void setJoinNum(long j2) {
        this.joinNum = j2;
    }

    public void setJumpUrl(String str) {
        this.jumpUrl = str;
    }

    public void setJumpUrlDesc(String str) {
        this.jumpUrlDesc = str;
    }

    public void setMaterielCode(String str) {
        this.materielCode = str;
    }

    public void setMaterielDesc(String str) {
        this.materielDesc = str;
    }

    public void setMaterielSubTitle(String str) {
        this.materielSubTitle = str;
    }

    public void setMaterielTitle(String str) {
        this.materielTitle = str;
    }

    public void setParentActCode(String str) {
        this.parentActCode = str;
    }

    public void setPayAmount(String str) {
        this.payAmount = str;
    }

    public void setPeriodNum(String str) {
        this.periodNum = str;
    }

    public void setRedPointContent(String str) {
        this.redPointContent = str;
    }

    public void setSignUpEndTime(long j2) {
        this.signUpEndTime = j2;
    }

    public void setSignUpStartTime(long j2) {
        this.signUpStartTime = j2;
    }

    public void setStartTime(long j2) {
        this.startTime = j2;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTarget(int i) {
        this.target = i;
    }

    public void setTotalBonus(String str) {
        this.totalBonus = str;
    }

    public void setUserRedPoint(int i) {
        this.userRedPoint = i;
    }

    public String toString() {
        return "SpaceCardMetaData{materielCode='" + this.materielCode + "', materielTitle='" + this.materielTitle + "', materielSubTitle='" + this.materielSubTitle + "', materielDesc='" + this.materielDesc + "', imageUrl='" + this.imageUrl + "', darkImageUrl='" + this.darkImageUrl + "', jumpUrl='" + this.jumpUrl + "', jumpUrlDesc='" + this.jumpUrlDesc + "', backupJumpUrl='" + this.backupJumpUrl + "', backupJumpUrlDesc='" + this.backupJumpUrlDesc + "', currentTime=" + this.currentTime + ", close=" + this.close + ", redPoint=" + this.userRedPoint + ", redPointContent='" + this.redPointContent + "', impressions ='" + this.impressions + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.materielCode);
        parcel.writeString(this.materielTitle);
        parcel.writeString(this.materielSubTitle);
        parcel.writeString(this.materielDesc);
        parcel.writeParcelable(this.commodity, i);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.darkImageUrl);
        parcel.writeString(this.jumpUrl);
        parcel.writeString(this.jumpUrlDesc);
        parcel.writeString(this.backupJumpUrl);
        parcel.writeString(this.backupJumpUrlDesc);
        parcel.writeLong(this.currentTime);
        parcel.writeString(this.parentActCode);
        parcel.writeInt(this.actType);
        parcel.writeString(this.periodNum);
        parcel.writeLong(this.signUpStartTime);
        parcel.writeLong(this.signUpEndTime);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeInt(this.status);
        parcel.writeInt(this.target);
        parcel.writeString(this.payAmount);
        parcel.writeLong(this.joinNum);
        parcel.writeString(this.totalBonus);
        parcel.writeByte(this.join ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.compliance ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.close);
        parcel.writeInt(this.userRedPoint);
        parcel.writeString(this.redPointContent);
        parcel.writeString(this.impressions);
        parcel.writeString(this.groupName);
        parcel.writeInt(this.groupPos);
        parcel.writeString(this.appIconUrl);
    }

    public SpaceCardMetaData() {
    }
}
