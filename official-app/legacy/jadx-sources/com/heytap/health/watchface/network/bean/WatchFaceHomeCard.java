package com.heytap.health.watchface.network.bean;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class WatchFaceHomeCard {
    public static final int CARD_CODE_ALL = 10002;
    public static final int CARD_CODE_ALL_TITLE = 10010;
    public static final int CARD_CODE_BANNER = 10001;
    public static final int CARD_CODE_CATEGORY = 10009;
    public static final int CARD_CODE_CREATION_WF = 10007;
    public static final int CARD_CODE_FOOT = 99999;
    public static final int CARD_CODE_ONLINE_WF = 10006;
    public static final int CARD_CODE_OPERATION = 10008;
    public static final int CARD_CODE_RANK = 10011;
    public static final int CARD_CODE_TEXT = 10005;
    private String actionParam;
    private int actionType;
    private String backPicture;
    private List<Banner> banners;
    private int code;
    private List<CreatedDialInfo> createdDialInfo;
    private int creationWfType;
    private String desc;
    private Ext ext;
    private boolean isExpose;
    private List<Item> items;
    private int key;
    private List<MenuItem> menuList;
    private String subTitle;
    private List<CategoryItem> tags;
    private String thumbnailPic;
    private String title;

    @Keep
    public static class Banner {
        private String actionParam;
        private int actionType;
        private String ext;
        private int id;
        private Image image;
        private boolean isExpose;
        private String title;

        @Keep
        public static class Image {
            private int height;
            private String id;
            private String url;
            private int width;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Image image = (Image) obj;
                return this.width == image.width && this.height == image.height && Objects.equals(this.url, image.url);
            }

            public int getHeight() {
                return this.height;
            }

            public String getId() {
                return this.id;
            }

            public String getUrl() {
                return this.url;
            }

            public int getWidth() {
                return this.width;
            }

            public int hashCode() {
                return Objects.hash(this.url, Integer.valueOf(this.width), Integer.valueOf(this.height));
            }

            public void setHeight(int i) {
                this.height = i;
            }

            public void setId(String str) {
                this.id = str;
            }

            public void setUrl(String str) {
                this.url = str;
            }

            public void setWidth(int i) {
                this.width = i;
            }

            public String toString() {
                return "Image{id='" + this.id + "', url='" + this.url + "', width=" + this.width + ", height=" + this.height + '}';
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Banner banner = (Banner) obj;
            return this.actionType == banner.actionType && Objects.equals(this.image, banner.image) && Objects.equals(this.actionParam, banner.actionParam);
        }

        public String getActionParam() {
            return this.actionParam;
        }

        public int getActionType() {
            return this.actionType;
        }

        public String getExt() {
            return this.ext;
        }

        public int getId() {
            return this.id;
        }

        public Image getImage() {
            return this.image;
        }

        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Objects.hash(this.image, Integer.valueOf(this.actionType), this.actionParam);
        }

        public boolean isExpose() {
            return this.isExpose;
        }

        public void setActionParam(String str) {
            this.actionParam = str;
        }

        public void setActionType(int i) {
            this.actionType = i;
        }

        public void setExpose(boolean z) {
            this.isExpose = z;
        }

        public void setExt(String str) {
            this.ext = str;
        }

        public void setId(int i) {
            this.id = i;
        }

        public void setImage(Image image) {
            this.image = image;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public String toString() {
            return "Banner{id=" + this.id + ", image=" + this.image + ", actionType=" + this.actionType + ", actionParam='" + this.actionParam + "', title='" + this.title + "', ext='" + this.ext + "'}";
        }
    }

    @Keep
    public static class CategoryItem {
        private String actionParam;
        private int actionType;
        private String backgroundImage;
        private String displayContent;
        private String id;
        private boolean isExpose;
        private String name;
        private String subName;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            CategoryItem categoryItem = (CategoryItem) obj;
            return this.actionType == categoryItem.actionType && Objects.equals(this.displayContent, categoryItem.displayContent) && Objects.equals(this.backgroundImage, categoryItem.backgroundImage) && Objects.equals(this.subName, categoryItem.subName) && Objects.equals(this.actionParam, categoryItem.actionParam);
        }

        public String getActionParam() {
            return this.actionParam;
        }

        public int getActionType() {
            return this.actionType;
        }

        public String getBackgroundImage() {
            return this.backgroundImage;
        }

        public String getDisplayContent() {
            return this.displayContent;
        }

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public String getSubName() {
            return this.subName;
        }

        public int hashCode() {
            return Objects.hash(this.displayContent, this.backgroundImage, this.subName, Integer.valueOf(this.actionType), this.actionParam);
        }

        public boolean isExpose() {
            return this.isExpose;
        }

        public void setActionParam(String str) {
            this.actionParam = str;
        }

        public void setActionType(int i) {
            this.actionType = i;
        }

        public void setBackgroundImage(String str) {
            this.backgroundImage = str;
        }

        public void setDisplayContent(String str) {
            this.displayContent = str;
        }

        public void setExpose(boolean z) {
            this.isExpose = z;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setSubName(String str) {
            this.subName = str;
        }

        public String toString() {
            return "CategoryItem{id='" + this.id + "', name='" + this.name + "', displayContent='" + this.displayContent + "', backgroundImage='" + this.backgroundImage + "', subName='" + this.subName + "', actionType=" + this.actionType + ", actionParam='" + this.actionParam + "'}";
        }
    }

    @Keep
    public static class CreatedDialInfo implements Serializable {
        private static final long serialVersionUID = 1;
        private String actionParam;
        private int actionType;
        private String backPicture;
        private int code;
        private int creationWfType;
        private String desc;
        private int key;
        private String subTitle;
        private String thumbnailPic;
        private String title;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            CreatedDialInfo createdDialInfo = (CreatedDialInfo) obj;
            return this.actionType == createdDialInfo.actionType && this.code == createdDialInfo.code && this.creationWfType == createdDialInfo.creationWfType && this.key == createdDialInfo.key && Objects.equals(this.actionParam, createdDialInfo.actionParam) && Objects.equals(this.backPicture, createdDialInfo.backPicture) && Objects.equals(this.desc, createdDialInfo.desc) && Objects.equals(this.subTitle, createdDialInfo.subTitle) && Objects.equals(this.thumbnailPic, createdDialInfo.thumbnailPic) && Objects.equals(this.title, createdDialInfo.title);
        }

        public String getActionParam() {
            return this.actionParam;
        }

        public int getActionType() {
            return this.actionType;
        }

        public String getBackPicture() {
            return this.backPicture;
        }

        public int getCode() {
            return this.code;
        }

        public int getCreationWfType() {
            return this.creationWfType;
        }

        public String getDesc() {
            return this.desc;
        }

        public int getKey() {
            return this.key;
        }

        public String getSubTitle() {
            return this.subTitle;
        }

        public String getThumbnailPic() {
            return this.thumbnailPic;
        }

        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Objects.hash(this.actionParam, Integer.valueOf(this.actionType), this.backPicture, Integer.valueOf(this.code), Integer.valueOf(this.creationWfType), this.desc, Integer.valueOf(this.key), this.subTitle, this.thumbnailPic, this.title);
        }

        public void setActionParam(String str) {
            this.actionParam = str;
        }

        public void setActionType(int i) {
            this.actionType = i;
        }

        public void setBackPicture(String str) {
            this.backPicture = str;
        }

        public void setCode(int i) {
            this.code = i;
        }

        public void setCreationWfType(int i) {
            this.creationWfType = i;
        }

        public void setDesc(String str) {
            this.desc = str;
        }

        public void setKey(int i) {
            this.key = i;
        }

        public void setSubTitle(String str) {
            this.subTitle = str;
        }

        public void setThumbnailPic(String str) {
            this.thumbnailPic = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public String toString() {
            return "CreatedDialInfo{actionParam='" + this.actionParam + "', actionType=" + this.actionType + ", backPicture='" + this.backPicture + "', code=" + this.code + ", creationWfType=" + this.creationWfType + ", desc='" + this.desc + "', key=" + this.key + ", subTitle='" + this.subTitle + "', thumbnailPic='" + this.thumbnailPic + "', title='" + this.title + "'}";
        }
    }

    @Keep
    public static class Ext {
    }

    @Keep
    public static class Item implements Serializable {
        public static final int OBTAIN_TYPE_GIVE = 1;
        public static final int PAY_STATUS_FREE = 2;
        public static final int PAY_STATUS_HAD_PAY = 1;
        public static final int PAY_STATUS_NO_PAY = 0;
        public static final int POWER_DEGREE_HIGH = 9;
        public static final int POWER_DEGREE_LOW = 1;
        public static final int POWER_DEGREE_MIDDLE = 5;
        public static final int SHAPE_CIRCLE = 1;
        public static final int SHAPE_SQUARE = 2;
        public static final int WF_STATUS_NOT_SUPPORT = 2;
        public static final int WF_STATUS_OFFLINE = 1;
        public static final int WF_STATUS_ONLINE = 0;
        private static final long serialVersionUID = 2192026014600747061L;
        private String algReqId;
        private List<AodPreviewPic> aodPreviewPicList;
        private String appName;
        private AppTag appTag;
        private List<AppTag> appTagList;
        private String detailDesc;
        private long devId;
        private String devName;
        private String discountPrice;
        private int downloadNum;
        private String downloadNumDesc;
        private long fileSize;
        private String fileSizeDesc;
        private int give;
        private int highPower;
        private boolean isExpose;
        private String jumpUrl;
        private long masterId;
        private String offPrice;
        private long onlineTime;
        private int pay;
        private String pkgName;
        private String pkgNameMd5;
        private int powerLevel;
        private String price;
        private long purchaseTime;
        private int radius;
        private String screen;
        private int shape;
        private String sign;
        private String sourceKey;
        private int status;
        private long testTime;
        private String thumbnailPic;
        private int type;
        private String updateDesc;
        private int versionCode;
        private long versionId;
        private String versionName;
        private int widget;

        @Keep
        public static class AodPreviewPic implements Serializable {
            private static final long serialVersionUID = -5014303670306693492L;
            private int height;
            private String id;
            private int picType;
            private String url;
            private int width;

            public int getHeight() {
                return this.height;
            }

            public String getId() {
                return this.id;
            }

            public int getPicType() {
                return this.picType;
            }

            public String getUrl() {
                return this.url;
            }

            public int getWidth() {
                return this.width;
            }

            public void setHeight(int i) {
                this.height = i;
            }

            public void setId(String str) {
                this.id = str;
            }

            public void setPicType(int i) {
                this.picType = i;
            }

            public void setUrl(String str) {
                this.url = str;
            }

            public void setWidth(int i) {
                this.width = i;
            }

            public String toString() {
                return "AodPreviewPic{id=" + this.id + ", url='" + this.url + "', width=" + this.width + ", height=" + this.height + ", picType=" + this.picType + '}';
            }
        }

        @Keep
        public static class AppTag implements Serializable {
            private static final long serialVersionUID = 2104956074245624819L;
            private int cornerType;
            private int id;
            private String name;
            private int type;

            public int getCornerType() {
                return this.cornerType;
            }

            public int getId() {
                return this.id;
            }

            public String getName() {
                return this.name;
            }

            public int getType() {
                return this.type;
            }

            public void setCornerType(int i) {
                this.cornerType = i;
            }

            public void setId(int i) {
                this.id = i;
            }

            public void setName(String str) {
                this.name = str;
            }

            public void setType(int i) {
                this.type = i;
            }

            public String toString() {
                return "AppTag{type=" + this.type + ", cornerType=" + this.cornerType + ", name='" + this.name + "', id=" + this.id + '}';
            }
        }

        public static boolean isNotWfSupport(int i) {
            return i == 2;
        }

        public static boolean isWfOnline(int i) {
            return i == 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Item item = (Item) obj;
            return this.masterId == item.masterId && this.versionId == item.versionId;
        }

        public String getAlgReqId() {
            return this.algReqId;
        }

        public List<AodPreviewPic> getAodPreviewPicList() {
            return this.aodPreviewPicList;
        }

        public String getAppName() {
            return this.appName;
        }

        public AppTag getAppTag() {
            return this.appTag;
        }

        public List<AppTag> getAppTagList() {
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

        public String getDiscountPrice() {
            return this.discountPrice;
        }

        public int getDownloadNum() {
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

        public String getOffPrice() {
            return this.offPrice;
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

        public int getPowerLevel() {
            return this.powerLevel;
        }

        public String getPrice() {
            return this.price;
        }

        public long getPurchaseTime() {
            return this.purchaseTime;
        }

        public int getRadius() {
            return this.radius;
        }

        public String getScreen() {
            return this.screen;
        }

        public int getShape() {
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

        public long getTestTime() {
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

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.masterId), Long.valueOf(this.versionId));
        }

        public boolean isExpose() {
            return this.isExpose;
        }

        public boolean isGiven() {
            return this.give == 1;
        }

        public boolean isNoPay() {
            return this.pay == 0;
        }

        public boolean isNotSupport() {
            return this.status == 2;
        }

        public void setAlgReqId(String str) {
            this.algReqId = str;
        }

        public void setAodPreviewPicList(List<AodPreviewPic> list) {
            this.aodPreviewPicList = list;
        }

        public void setAppName(String str) {
            this.appName = str;
        }

        public void setAppTag(AppTag appTag) {
            this.appTag = appTag;
        }

        public void setAppTagList(List<AppTag> list) {
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

        public void setDownloadNum(int i) {
            this.downloadNum = i;
        }

        public void setDownloadNumDesc(String str) {
            this.downloadNumDesc = str;
        }

        public void setExpose(boolean z) {
            this.isExpose = z;
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

        public void setPowerLevel(int i) {
            this.powerLevel = i;
        }

        public void setPrice(String str) {
            this.price = str;
        }

        public void setPurchaseTime(long j2) {
            this.purchaseTime = j2;
        }

        public void setRadius(int i) {
            this.radius = i;
        }

        public void setScreen(String str) {
            this.screen = str;
        }

        public void setShape(int i) {
            this.shape = i;
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

        public void setTestTime(long j2) {
            this.testTime = j2;
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
            return "Item{algReqId='" + this.algReqId + "', appName='" + this.appName + "', devId=" + this.devId + ", downloadNum=" + this.downloadNum + ", fileSize=" + this.fileSize + ", highPower=" + this.highPower + ", masterId=" + this.masterId + ", onlineTime=" + this.onlineTime + ", pkgName='" + this.pkgName + "', pkgNameMd5='" + this.pkgNameMd5 + "', sourceKey='" + this.sourceKey + "', status=" + this.status + ", thumbnailPic='" + this.thumbnailPic + "', type=" + this.type + ", versionCode=" + this.versionCode + ", versionId=" + this.versionId + ", versionName='" + this.versionName + "', widget=" + this.widget + ", jumpUrl='" + this.jumpUrl + "', pay=" + this.pay + ", price='" + this.price + "', testTime=" + this.testTime + ", appTag=" + this.appTag + ", purchaseTime=" + this.purchaseTime + ", isExpose=" + this.isExpose + ", shape=" + this.shape + ", screen='" + this.screen + "', radius=" + this.radius + ", detailDesc='" + this.detailDesc + "', devName='" + this.devName + "', downloadNumDesc='" + this.downloadNumDesc + "', fileSizeDesc='" + this.fileSizeDesc + "', aodPreviewPicList=" + this.aodPreviewPicList + ", appTagList=" + this.appTagList + ", powerLevel=" + this.powerLevel + ", updateDesc='" + this.updateDesc + "', sign='" + this.sign + "'}";
        }
    }

    @Keep
    public static class MenuItem {
        private String actionParam;
        private int actionType;
        private String icon;
        private String id;
        private boolean isExpose;
        private String name;
        private String tagName;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MenuItem menuItem = (MenuItem) obj;
            return this.actionType == menuItem.actionType && Objects.equals(this.name, menuItem.name) && Objects.equals(this.actionParam, menuItem.actionParam) && Objects.equals(this.tagName, menuItem.tagName);
        }

        public String getActionParam() {
            return this.actionParam;
        }

        public int getActionType() {
            return this.actionType;
        }

        public String getIconUrl() {
            return this.icon;
        }

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public String getTagName() {
            return this.tagName;
        }

        public int hashCode() {
            return Objects.hash(this.name, Integer.valueOf(this.actionType), this.actionParam, this.tagName);
        }

        public boolean isExpose() {
            return this.isExpose;
        }

        public void setActionParam(String str) {
            this.actionParam = str;
        }

        public void setActionType(int i) {
            this.actionType = i;
        }

        public void setExpose(boolean z) {
            this.isExpose = z;
        }

        public void setIconUrl(String str) {
            this.icon = str;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setTagName(String str) {
            this.tagName = str;
        }

        public String toString() {
            return "MenuItem{id='" + this.id + "', name='" + this.name + "', actionType=" + this.actionType + ", actionParam='" + this.actionParam + "', tagName='" + this.tagName + "', iconUrl='" + this.icon + "'}";
        }
    }

    public String getActionParam() {
        return this.actionParam;
    }

    public int getActionType() {
        return this.actionType;
    }

    public String getBackPicture() {
        return this.backPicture;
    }

    public List<Banner> getBanners() {
        return this.banners;
    }

    public int getCode() {
        return this.code;
    }

    public List<CreatedDialInfo> getCreatedDialInfo() {
        return this.createdDialInfo;
    }

    public int getCreationWfType() {
        return this.creationWfType;
    }

    public String getDesc() {
        return this.desc;
    }

    public List<WatchFaceHomeCard> getDisplayList() {
        List<CreatedDialInfo> list = this.createdDialInfo;
        if (list == null || list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (CreatedDialInfo createdDialInfo : this.createdDialInfo) {
            WatchFaceHomeCard watchFaceHomeCard = new WatchFaceHomeCard();
            watchFaceHomeCard.setActionParam(createdDialInfo.getActionParam());
            watchFaceHomeCard.setActionType(createdDialInfo.getActionType());
            watchFaceHomeCard.setBackPicture(createdDialInfo.getBackPicture());
            watchFaceHomeCard.setCode(createdDialInfo.getCode());
            watchFaceHomeCard.setCreationWfType(createdDialInfo.getCreationWfType());
            watchFaceHomeCard.setDesc(createdDialInfo.getDesc());
            watchFaceHomeCard.setKey(createdDialInfo.getKey());
            watchFaceHomeCard.setSubTitle(createdDialInfo.getSubTitle());
            watchFaceHomeCard.setThumbnailPic(createdDialInfo.getThumbnailPic());
            watchFaceHomeCard.setTitle(createdDialInfo.getTitle());
            arrayList2.add(watchFaceHomeCard);
        }
        return arrayList2;
    }

    public Ext getExt() {
        return this.ext;
    }

    public List<Item> getItems() {
        return this.items;
    }

    public int getKey() {
        return this.key;
    }

    public List<MenuItem> getMenuList() {
        return this.menuList;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public List<CategoryItem> getTags() {
        return this.tags;
    }

    public String getThumbnailPic() {
        return this.thumbnailPic;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isExpose() {
        return this.isExpose;
    }

    public void setActionParam(String str) {
        this.actionParam = str;
    }

    public void setActionType(int i) {
        this.actionType = i;
    }

    public void setBackPicture(String str) {
        this.backPicture = str;
    }

    public void setBanners(List<Banner> list) {
        this.banners = list;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setCreatedDialInfo(List<CreatedDialInfo> list) {
        this.createdDialInfo = list;
    }

    public void setCreationWfType(int i) {
        this.creationWfType = i;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setExpose(boolean z) {
        this.isExpose = z;
    }

    public void setExt(Ext ext) {
        this.ext = ext;
    }

    public void setItems(List<Item> list) {
        this.items = list;
    }

    public void setKey(int i) {
        this.key = i;
    }

    public void setMenuList(List<MenuItem> list) {
        this.menuList = list;
    }

    public void setSubTitle(String str) {
        this.subTitle = str;
    }

    public void setTags(List<CategoryItem> list) {
        this.tags = list;
    }

    public void setThumbnailPic(String str) {
        this.thumbnailPic = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "WatchFaceHomeCard{actionParam='" + this.actionParam + "', actionType=" + this.actionType + ", code=" + this.code + ", ext=" + this.ext + ", items=" + this.items + ", menuList=" + this.menuList + ", tags=" + this.tags + ", banners=" + this.banners + ", key=" + this.key + ", title='" + this.title + "', subTitle='" + this.subTitle + "', desc='" + this.desc + "', thumbnailPic='" + this.thumbnailPic + "', backPicture='" + this.backPicture + "'}";
    }
}
