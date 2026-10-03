package com.heytap.store.base.core.data;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SplashAdData extends BaseResponseJsonData<data> {

    public class data implements Serializable {
        private int componentCode;
        private List<DetailsBean> details;
        private HeaderInfoBean headerInfo;
        private String id;
        private int modelCode;
        private String moduleCode;
        private StyleInfoBean styleInfo;

        public class DetailsBean implements Serializable {
            private String buttonDesc;
            private int buttonEffect;
            private long id;
            private boolean isLogin;
            private boolean isShowNotInterestedButton;
            private String link;
            public String localImagePath;
            private int mediaType;
            private String padPic;
            private String pic;
            private int playNum;
            private int rowNum;
            private int seq;
            private boolean showAdvertLabel;
            private boolean showSoundButton;
            private boolean supportOneShot;
            private boolean switchValue;
            private String title;
            private String transparent;
            private String video;

            public DetailsBean() {
            }

            private boolean isSameObject(String str, String str2) {
                if (str == null && str2 == null) {
                    return true;
                }
                if (str == null || str2 == null) {
                    return false;
                }
                return str.equals(str2);
            }

            public boolean equals(Object obj) {
                if (obj == null || !(obj instanceof DetailsBean)) {
                    return false;
                }
                DetailsBean detailsBean = (DetailsBean) obj;
                return this.id == detailsBean.id && isSameObject(this.video, detailsBean.video) && isSameObject(this.padPic, detailsBean.padPic) && isSameObject(this.pic, detailsBean.pic) && isSameObject(this.link, detailsBean.link) && this.playNum == detailsBean.playNum && this.showAdvertLabel == detailsBean.showAdvertLabel && isSameObject(this.buttonDesc, detailsBean.buttonDesc) && this.supportOneShot == detailsBean.supportOneShot;
            }

            public String getButtonDesc() {
                return this.buttonDesc;
            }

            public int getButtonEffect() {
                return this.buttonEffect;
            }

            public long getId() {
                return this.id;
            }

            public String getLink() {
                return this.link;
            }

            public int getMediaType() {
                return this.mediaType;
            }

            public String getPadPic() {
                return this.padPic;
            }

            public String getPic() {
                return this.pic;
            }

            public int getPlayNum() {
                return this.playNum;
            }

            public int getRowNum() {
                return this.rowNum;
            }

            public int getSeq() {
                return this.seq;
            }

            public String getTitle() {
                return this.title;
            }

            public String getTransparent() {
                return this.transparent;
            }

            public String getVideo() {
                return this.video;
            }

            public boolean isIsLogin() {
                return this.isLogin;
            }

            public boolean isIsShowNotInterestedButton() {
                return this.isShowNotInterestedButton;
            }

            public boolean isShowAdvertLabel() {
                return this.showAdvertLabel;
            }

            public boolean isShowSoundButton() {
                return this.showSoundButton;
            }

            public boolean isSupportOneShot() {
                return this.supportOneShot;
            }

            public boolean isSwitchValue() {
                return this.switchValue;
            }

            public void setButtonDesc(String str) {
                this.buttonDesc = str;
            }

            public void setButtonEffect(int i) {
                this.buttonEffect = i;
            }

            public void setId(long j2) {
                this.id = j2;
            }

            public void setIsLogin(boolean z) {
                this.isLogin = z;
            }

            public void setIsShowNotInterestedButton(boolean z) {
                this.isShowNotInterestedButton = z;
            }

            public void setLink(String str) {
                this.link = str;
            }

            public void setMediaType(int i) {
                this.mediaType = i;
            }

            public void setPic(String str) {
                this.pic = str;
            }

            public void setPlayNum(int i) {
                this.playNum = i;
            }

            public void setRowNum(int i) {
                this.rowNum = i;
            }

            public void setSeq(int i) {
                this.seq = i;
            }

            public void setShowAdvertLabel(boolean z) {
                this.showAdvertLabel = z;
            }

            public void setShowSoundButton(boolean z) {
                this.showSoundButton = z;
            }

            public void setSupportOneShot(boolean z) {
                this.supportOneShot = z;
            }

            public void setSwitchValue(boolean z) {
                this.switchValue = z;
            }

            public void setTitle(String str) {
                this.title = str;
            }

            public void setTransparent(String str) {
                this.transparent = str;
            }

            public void setVideo(String str) {
                this.video = str;
            }

            public String toString() {
                return "DetailsBean{id='" + this.id + "', title='" + this.title + "', seq=" + this.seq + ", pic='" + this.pic + "', link='" + this.link + "', isLogin=" + this.isLogin + ", isShowNotInterestedButton=" + this.isShowNotInterestedButton + ", mediaType=" + this.mediaType + ", video='" + this.video + "', showSoundButton=" + this.showSoundButton + ", supportOneShot=" + this.supportOneShot + ", playNum=" + this.playNum + ", rowNum=" + this.rowNum + ", buttonEffect=" + this.buttonEffect + ", switchValue=" + this.switchValue + ", buttonDesc='" + this.buttonDesc + "', showAdvertLabel=" + this.showAdvertLabel + '}';
            }
        }

        public class HeaderInfoBean implements Serializable {
            private String colorScroll;
            private String colorTitle;
            private boolean isShowMore;
            private boolean isShowPic;
            private String moreText;
            private String pic;
            private String picField;
            private String picJson;
            private String picJsonField;
            private String picTitle;
            private int styleFillet;
            private String title;
            private boolean titleShow;
            private int titleStyle;

            public HeaderInfoBean() {
            }

            public String getColorScroll() {
                return this.colorScroll;
            }

            public String getColorTitle() {
                return this.colorTitle;
            }

            public String getMoreText() {
                return this.moreText;
            }

            public String getPic() {
                return this.pic;
            }

            public String getPicField() {
                return this.picField;
            }

            public String getPicJson() {
                return this.picJson;
            }

            public String getPicJsonField() {
                return this.picJsonField;
            }

            public String getPicTitle() {
                return this.picTitle;
            }

            public int getStyleFillet() {
                return this.styleFillet;
            }

            public String getTitle() {
                return this.title;
            }

            public int getTitleStyle() {
                return this.titleStyle;
            }

            public boolean isIsShowMore() {
                return this.isShowMore;
            }

            public boolean isIsShowPic() {
                return this.isShowPic;
            }

            public boolean isTitleShow() {
                return this.titleShow;
            }

            public void setColorScroll(String str) {
                this.colorScroll = str;
            }

            public void setColorTitle(String str) {
                this.colorTitle = str;
            }

            public void setIsShowMore(boolean z) {
                this.isShowMore = z;
            }

            public void setIsShowPic(boolean z) {
                this.isShowPic = z;
            }

            public void setMoreText(String str) {
                this.moreText = str;
            }

            public void setPic(String str) {
                this.pic = str;
            }

            public void setPicField(String str) {
                this.picField = str;
            }

            public void setPicJson(String str) {
                this.picJson = str;
            }

            public void setPicJsonField(String str) {
                this.picJsonField = str;
            }

            public void setPicTitle(String str) {
                this.picTitle = str;
            }

            public void setStyleFillet(int i) {
                this.styleFillet = i;
            }

            public void setTitle(String str) {
                this.title = str;
            }

            public void setTitleShow(boolean z) {
                this.titleShow = z;
            }

            public void setTitleStyle(int i) {
                this.titleStyle = i;
            }

            public String toString() {
                return "HeaderInfoBean{isShowPic=" + this.isShowPic + ", pic='" + this.pic + "', picJson='" + this.picJson + "', styleFillet=" + this.styleFillet + ", colorTitle='" + this.colorTitle + "', colorScroll='" + this.colorScroll + "', picField='" + this.picField + "', picJsonField='" + this.picJsonField + "', titleStyle=" + this.titleStyle + ", picTitle='" + this.picTitle + "', titleShow=" + this.titleShow + ", title='" + this.title + "', isShowMore=" + this.isShowMore + ", moreText='" + this.moreText + "'}";
            }
        }

        public class StyleInfoBean {
            public StyleInfoBean() {
            }
        }

        public data() {
        }

        public boolean equals(Object obj) {
            List<DetailsBean> list;
            if (obj == null || !(obj instanceof data)) {
                return false;
            }
            data dataVar = (data) obj;
            return this.id.equals(dataVar.id) && (list = this.details) != null && dataVar.details != null && list.size() == dataVar.details.size() && this.details.equals(dataVar.details);
        }

        public int getComponentCode() {
            return this.componentCode;
        }

        public List<DetailsBean> getDetails() {
            return this.details;
        }

        public HeaderInfoBean getHeaderInfo() {
            return this.headerInfo;
        }

        public String getId() {
            return this.id;
        }

        public int getModelCode() {
            return this.modelCode;
        }

        public String getModuleCode() {
            return this.moduleCode;
        }

        public StyleInfoBean getStyleInfo() {
            return this.styleInfo;
        }

        public void setComponentCode(int i) {
            this.componentCode = i;
        }

        public void setDetails(List<DetailsBean> list) {
            this.details = list;
        }

        public void setHeaderInfo(HeaderInfoBean headerInfoBean) {
            this.headerInfo = headerInfoBean;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setModelCode(int i) {
            this.modelCode = i;
        }

        public void setModuleCode(String str) {
            this.moduleCode = str;
        }

        public void setStyleInfo(StyleInfoBean styleInfoBean) {
            this.styleInfo = styleInfoBean;
        }

        public String toString() {
            return "data{id='" + this.id + "', componentCode=" + this.componentCode + ", modelCode=" + this.modelCode + ", moduleCode='" + this.moduleCode + "', headerInfo=" + this.headerInfo + ", styleInfo=" + this.styleInfo + ", details=" + this.details + '}';
        }
    }

    public String toString() {
        return "SplashAdData{code=" + this.code + ", data=" + this.data + '}';
    }
}
