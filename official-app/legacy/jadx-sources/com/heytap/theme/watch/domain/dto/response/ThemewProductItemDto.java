package com.heytap.theme.watch.domain.dto.response;

import io.protostuff.Tag;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class ThemewProductItemDto {

    @Tag(23)
    private String algReqId;

    @Tag(33)
    private List<ThemewPicDto> aodPreviewPicList;

    @Tag(15)
    private String appName;

    @Tag(30)
    private AppTagDto appTag;

    @Tag(31)
    private List<AppTagDto> appTagList;

    @Tag(16)
    private String detailDesc;

    @Tag(9)
    private long devId;

    @Tag(10)
    private String devName;

    @Tag(11)
    private long downloadNum;

    @Tag(12)
    private String downloadNumDesc;

    @Tag(7)
    private long fileSize;

    @Tag(8)
    private String fileSizeDesc;

    @Tag(25)
    private int highPower;

    @Tag(26)
    private String jumpUrl;

    @Tag(1)
    private long masterId;

    @Tag(13)
    private long onlineTime;

    @Tag(27)
    private int pay;

    @Tag(3)
    private String pkgName;

    @Tag(4)
    private String pkgNameMd5;

    @Tag(18)
    private List<ThemewPicDto> previewPic;

    @Tag(21)
    private ThemewVideoDto previewVideo;

    @Tag(28)
    private String price;

    @Tag(29)
    private long purchaseTime;

    @Tag(36)
    private Integer radius;

    @Tag(35)
    private String screen;

    @Tag(34)
    private Integer shape;

    @Tag(37)
    private String sign;

    @Tag(22)
    private String sourceKey;

    @Tag(20)
    private int status;

    @Tag(32)
    private Long testTime;

    @Tag(19)
    private String thumbnailPic;

    @Tag(14)
    private int type;

    @Tag(17)
    private String updateDesc;

    @Tag(5)
    private int versionCode;

    @Tag(2)
    private long versionId;

    @Tag(6)
    private String versionName;

    @Tag(24)
    private int widget;

    public String getAlgReqId() {
        return this.algReqId;
    }

    public List<ThemewPicDto> getAodPreviewPicList() {
        return this.aodPreviewPicList;
    }

    public String getAppName() {
        return this.appName;
    }

    public AppTagDto getAppTag() {
        return this.appTag;
    }

    public List<AppTagDto> getAppTagList() {
        return this.appTagList;
    }

    public String getDetailDesc() {
        return this.detailDesc;
    }

    public long getDevId() {
        return this.devId;
    }

    public String getDevName() {
        return this.devName;
    }

    public long getDownloadNum() {
        return this.downloadNum;
    }

    public String getDownloadNumDesc() {
        return this.downloadNumDesc;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public String getFileSizeDesc() {
        return this.fileSizeDesc;
    }

    public int getHighPower() {
        return this.highPower;
    }

    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public long getMasterId() {
        return this.masterId;
    }

    public long getOnlineTime() {
        return this.onlineTime;
    }

    public int getPay() {
        return this.pay;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public String getPkgNameMd5() {
        return this.pkgNameMd5;
    }

    public List<ThemewPicDto> getPreviewPic() {
        return this.previewPic;
    }

    public ThemewVideoDto getPreviewVideo() {
        return this.previewVideo;
    }

    public String getPrice() {
        return this.price;
    }

    public long getPurchaseTime() {
        return this.purchaseTime;
    }

    public Integer getRadius() {
        return this.radius;
    }

    public String getScreen() {
        return this.screen;
    }

    public Integer getShape() {
        return this.shape;
    }

    public String getSign() {
        return this.sign;
    }

    public String getSourceKey() {
        return this.sourceKey;
    }

    public int getStatus() {
        return this.status;
    }

    public Long getTestTime() {
        return this.testTime;
    }

    public String getThumbnailPic() {
        return this.thumbnailPic;
    }

    public int getType() {
        return this.type;
    }

    public String getUpdateDesc() {
        return this.updateDesc;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public long getVersionId() {
        return this.versionId;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public int getWidget() {
        return this.widget;
    }

    public void setAlgReqId(String str) {
        this.algReqId = str;
    }

    public void setAodPreviewPicList(List<ThemewPicDto> list) {
        this.aodPreviewPicList = list;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setAppTag(AppTagDto appTagDto) {
        this.appTag = appTagDto;
    }

    public void setAppTagList(List<AppTagDto> list) {
        this.appTagList = list;
    }

    public void setDetailDesc(String str) {
        this.detailDesc = str;
    }

    public void setDevId(long j2) {
        this.devId = j2;
    }

    public void setDevName(String str) {
        this.devName = str;
    }

    public void setDownloadNum(long j2) {
        this.downloadNum = j2;
    }

    public void setDownloadNumDesc(String str) {
        this.downloadNumDesc = str;
    }

    public void setFileSize(long j2) {
        this.fileSize = j2;
    }

    public void setFileSizeDesc(String str) {
        this.fileSizeDesc = str;
    }

    public void setHighPower(int i) {
        this.highPower = i;
    }

    public void setJumpUrl(String str) {
        this.jumpUrl = str;
    }

    public void setMasterId(long j2) {
        this.masterId = j2;
    }

    public void setOnlineTime(long j2) {
        this.onlineTime = j2;
    }

    public void setPay(int i) {
        this.pay = i;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }

    public void setPkgNameMd5(String str) {
        this.pkgNameMd5 = str;
    }

    public void setPreviewPic(List<ThemewPicDto> list) {
        this.previewPic = list;
    }

    public void setPreviewVideo(ThemewVideoDto themewVideoDto) {
        this.previewVideo = themewVideoDto;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setPurchaseTime(long j2) {
        this.purchaseTime = j2;
    }

    public void setRadius(Integer num) {
        this.radius = num;
    }

    public void setScreen(String str) {
        this.screen = str;
    }

    public void setShape(Integer num) {
        this.shape = num;
    }

    public void setSign(String str) {
        this.sign = str;
    }

    public void setSourceKey(String str) {
        this.sourceKey = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTestTime(Long l2) {
        this.testTime = l2;
    }

    public void setThumbnailPic(String str) {
        this.thumbnailPic = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUpdateDesc(String str) {
        this.updateDesc = str;
    }

    public void setVersionCode(int i) {
        this.versionCode = i;
    }

    public void setVersionId(long j2) {
        this.versionId = j2;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }

    public void setWidget(int i) {
        this.widget = i;
    }

    public String toString() {
        return "ThemewProductItemDto{masterId=" + this.masterId + ", versionId=" + this.versionId + ", pkgName='" + this.pkgName + "', pkgNameMd5='" + this.pkgNameMd5 + "', versionCode=" + this.versionCode + ", versionName='" + this.versionName + "', fileSize=" + this.fileSize + ", fileSizeDesc='" + this.fileSizeDesc + "', devId=" + this.devId + ", devName='" + this.devName + "', downloadNum=" + this.downloadNum + ", downloadNumDesc='" + this.downloadNumDesc + "', onlineTime=" + this.onlineTime + ", type=" + this.type + ", appName='" + this.appName + "', detailDesc='" + this.detailDesc + "', updateDesc='" + this.updateDesc + "', previewPic=" + this.previewPic + ", thumbnailPic='" + this.thumbnailPic + "', status=" + this.status + ", previewVideo=" + this.previewVideo + ", sourceKey='" + this.sourceKey + "', algReqId='" + this.algReqId + "', widget=" + this.widget + ", highPower=" + this.highPower + ", jumpUrl='" + this.jumpUrl + "', pay=" + this.pay + ", price='" + this.price + "', purchaseTime=" + this.purchaseTime + ", appTag=" + this.appTag + ", appTagList=" + this.appTagList + ", testTime=" + this.testTime + ", aodPreviewPicList=" + this.aodPreviewPicList + ", shape=" + this.shape + ", screen='" + this.screen + "', radius=" + this.radius + ", sign='" + this.sign + "'}";
    }
}
