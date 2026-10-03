package com.heytap.health.base.share;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes15.dex */
public final class SportShareDataBean implements Parcelable {
    public static final Parcelable.Creator<SportShareDataBean> CREATOR = new a();
    private String avatar;
    private String cardTitle;
    private String cardTitleType;
    private boolean changePicBg;
    private String clientId;
    private String dataTypes;
    private String dataUnit;
    private String deviceName;
    private String deviceType;
    private long endTime;
    private boolean hasLongImage;
    private boolean hasRoute;
    private int imageResourceType;
    private int imageShareType;
    private String imgCardCode;
    private String imgPageCode;
    private boolean isRouteSport;
    private String mainData;
    private String mainInfo;
    private boolean mainInfoHasUnit;
    private int praiseModule;
    private String recordListName;
    private String sourceDesc;
    private int sportMode;
    private String sticker;
    private String stickerDarkIcon;
    private String stickerLightIcon;
    private String subInfoLeft;
    private String subInfoMiddle;
    private String subInfoRight;
    private String swimLapDetail;
    private int totalDays;
    private String userName;

    public class a implements Parcelable.Creator<SportShareDataBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SportShareDataBean createFromParcel(Parcel parcel) {
            return new SportShareDataBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SportShareDataBean[] newArray(int i) {
            return new SportShareDataBean[i];
        }
    }

    public SportShareDataBean() {
        this.hasLongImage = true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getCardTitle() {
        return this.cardTitle;
    }

    public String getCardTitleType() {
        return this.cardTitleType;
    }

    public boolean getChangePicBg() {
        return this.changePicBg;
    }

    public String getClientId() {
        return this.clientId;
    }

    public String getDataTypes() {
        return this.dataTypes;
    }

    public String getDataUnit() {
        return this.dataUnit;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public int getImageResourceType() {
        return this.imageResourceType;
    }

    public int getImageShareType() {
        return this.imageShareType;
    }

    public String getImgCardCode() {
        return this.imgCardCode;
    }

    public String getImgPageCode() {
        return this.imgPageCode;
    }

    public String getMainData() {
        return this.mainData;
    }

    public String getMainInfo() {
        return this.mainInfo;
    }

    public int getPraiseModule() {
        return this.praiseModule;
    }

    public String getRecordListName() {
        return this.recordListName;
    }

    public String getSourceDesc() {
        return this.sourceDesc;
    }

    public int getSportMode() {
        return this.sportMode;
    }

    public String getSticker() {
        return this.sticker;
    }

    public String getStickerDarkIcon() {
        return this.stickerDarkIcon;
    }

    public String getStickerLightIcon() {
        return this.stickerLightIcon;
    }

    public String getSubInfoLeft() {
        return this.subInfoLeft;
    }

    public String getSubInfoMiddle() {
        return this.subInfoMiddle;
    }

    public String getSubInfoRight() {
        return this.subInfoRight;
    }

    public String getSwimLapDetail() {
        return this.swimLapDetail;
    }

    public int getTotalDays() {
        return this.totalDays;
    }

    public String getUserName() {
        return this.userName;
    }

    public boolean isChangePicBg() {
        return this.changePicBg;
    }

    public boolean isHasLongImage() {
        return this.hasLongImage;
    }

    public boolean isHasRoute() {
        return this.hasRoute;
    }

    public boolean isMainInfoHasUnit() {
        return this.mainInfoHasUnit;
    }

    public boolean isRouteSport() {
        return this.isRouteSport;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setCardTitle(String str) {
        this.cardTitle = str;
    }

    public void setCardTitleType(String str) {
        this.cardTitleType = str;
    }

    public void setChangePicBg(boolean z) {
        this.changePicBg = z;
    }

    public void setClientId(String str) {
        this.clientId = str;
    }

    public void setDataTypes(String str) {
        this.dataTypes = str;
    }

    public void setDataUnit(String str) {
        this.dataUnit = str;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setEndTime(long j2) {
        this.endTime = j2;
    }

    public void setHasLongImage(boolean z) {
        this.hasLongImage = z;
    }

    public void setHasRoute(boolean z) {
        this.hasRoute = z;
    }

    public void setImageResourceType(int i) {
        this.imageResourceType = i;
    }

    public void setImageShareType(int i) {
        this.imageShareType = i;
    }

    public void setImgCardCode(String str) {
        this.imgCardCode = str;
    }

    public void setImgPageCode(String str) {
        this.imgPageCode = str;
    }

    public void setLaunchPraiseModule(int i) {
        this.praiseModule = i;
    }

    public void setMainData(String str) {
        this.mainData = str;
    }

    public void setMainInfo(String str) {
        this.mainInfo = str;
    }

    public void setMainInfoHasUnit(boolean z) {
        this.mainInfoHasUnit = z;
    }

    public void setRecordListName(String str) {
        this.recordListName = str;
    }

    public void setRouteSport(boolean z) {
        this.isRouteSport = z;
    }

    public void setSourceDesc(String str) {
        this.sourceDesc = str;
    }

    public void setSportMode(int i) {
        this.sportMode = i;
    }

    public void setSticker(String str) {
        this.sticker = str;
    }

    public void setStickerDarkIcon(String str) {
        this.stickerDarkIcon = str;
    }

    public void setStickerLightIcon(String str) {
        this.stickerLightIcon = str;
    }

    public void setSubInfoLeft(String str) {
        this.subInfoLeft = str;
    }

    public void setSubInfoMiddle(String str) {
        this.subInfoMiddle = str;
    }

    public void setSubInfoRight(String str) {
        this.subInfoRight = str;
    }

    public void setSwimLapDetail(String str) {
        this.swimLapDetail = str;
    }

    public void setTotalDays(int i) {
        this.totalDays = i;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public String toString() {
        return "SportShareDataBean{sportMode=" + this.sportMode + ", deviceType='" + this.deviceType + "', hasRoute=" + this.hasRoute + ", imageShareType=" + this.imageShareType + ", hasLongImage=" + this.hasLongImage + ", recordListName='" + this.recordListName + "', endTime=" + this.endTime + ", mainInfo='" + this.mainInfo + "', subInfoLeft='" + this.subInfoLeft + "', subInfoMiddle='" + this.subInfoMiddle + "', subInfoRight='" + this.subInfoRight + "', cardTitle='" + this.cardTitle + "', avatar='" + this.avatar + "', userName='" + this.userName + "', imageResourceType=" + this.imageResourceType + ", swimLapDetail='" + this.swimLapDetail + "', mainInfoHasUnit='" + this.mainInfoHasUnit + "', praiseModule='" + this.praiseModule + "', totalDays='" + this.totalDays + "', isRouteSport='" + this.isRouteSport + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.sportMode);
        parcel.writeString(this.deviceType);
        parcel.writeString(this.deviceName);
        parcel.writeInt(this.hasRoute ? 1 : 0);
        parcel.writeInt(this.imageShareType);
        parcel.writeInt(this.hasLongImage ? 1 : 0);
        parcel.writeString(this.recordListName);
        parcel.writeLong(this.endTime);
        parcel.writeString(this.mainInfo);
        parcel.writeString(this.subInfoLeft);
        parcel.writeString(this.subInfoMiddle);
        parcel.writeString(this.subInfoRight);
        parcel.writeString(this.cardTitle);
        parcel.writeString(this.avatar);
        parcel.writeString(this.userName);
        parcel.writeInt(this.imageResourceType);
        parcel.writeString(this.swimLapDetail);
        parcel.writeInt(this.changePicBg ? 1 : 0);
        parcel.writeString(this.imgPageCode);
        parcel.writeString(this.imgCardCode);
        parcel.writeString(this.cardTitleType);
        parcel.writeString(this.dataTypes);
        parcel.writeString(this.sticker);
        parcel.writeString(this.stickerDarkIcon);
        parcel.writeString(this.stickerLightIcon);
        parcel.writeInt(this.mainInfoHasUnit ? 1 : 0);
        parcel.writeInt(this.praiseModule);
        parcel.writeInt(this.totalDays);
        parcel.writeInt(this.isRouteSport ? 1 : 0);
        parcel.writeString(this.mainData);
        parcel.writeString(this.dataUnit);
        parcel.writeString(this.clientId);
        parcel.writeString(this.sourceDesc);
    }

    public SportShareDataBean(Parcel parcel) {
        this.hasLongImage = true;
        this.sportMode = parcel.readInt();
        this.deviceType = parcel.readString();
        this.deviceName = parcel.readString();
        this.hasRoute = parcel.readInt() == 1;
        this.imageShareType = parcel.readInt();
        this.hasLongImage = parcel.readInt() == 1;
        this.recordListName = parcel.readString();
        this.endTime = parcel.readLong();
        this.mainInfo = parcel.readString();
        this.subInfoLeft = parcel.readString();
        this.subInfoMiddle = parcel.readString();
        this.subInfoRight = parcel.readString();
        this.cardTitle = parcel.readString();
        this.avatar = parcel.readString();
        this.userName = parcel.readString();
        this.imageResourceType = parcel.readInt();
        this.swimLapDetail = parcel.readString();
        this.changePicBg = parcel.readInt() == 1;
        this.imgPageCode = parcel.readString();
        this.imgCardCode = parcel.readString();
        this.cardTitleType = parcel.readString();
        this.dataTypes = parcel.readString();
        this.sticker = parcel.readString();
        this.stickerDarkIcon = parcel.readString();
        this.stickerLightIcon = parcel.readString();
        this.mainInfoHasUnit = parcel.readInt() == 1;
        this.praiseModule = parcel.readInt();
        this.totalDays = parcel.readInt();
        this.isRouteSport = parcel.readInt() == 1;
        this.mainData = parcel.readString();
        this.dataUnit = parcel.readString();
        this.clientId = parcel.readString();
        this.sourceDesc = parcel.readString();
    }
}
