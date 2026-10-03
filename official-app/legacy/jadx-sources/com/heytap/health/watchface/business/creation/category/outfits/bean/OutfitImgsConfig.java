package com.heytap.health.watchface.business.creation.category.outfits.bean;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class OutfitImgsConfig {
    public static final String CONFIG = "imgs_config.json";
    public static final String FOLDER = "imgs";
    private int mBackgroundCategory;
    private String mCategoryTag;
    private List<ImgBean> mImgs;

    @Keep
    public static class ImgBean {
        private int mAiShaderType;
        private String mBackgroundName;
        private boolean mForceWhite;
        private String mSupportTimeMark;

        public int getAiShaderType() {
            return this.mAiShaderType;
        }

        public String getBackgroundName() {
            return this.mBackgroundName;
        }

        public String getSupportTimeMark() {
            return this.mSupportTimeMark;
        }

        public boolean isForceWhite() {
            return this.mForceWhite;
        }

        public void setAiShaderType(int i) {
            this.mAiShaderType = i;
        }

        public void setBackgroundName(String str) {
            this.mBackgroundName = str;
        }

        public void setForceWhite(boolean z) {
            this.mForceWhite = z;
        }

        public void setSupportTimeMark(String str) {
            this.mSupportTimeMark = str;
        }
    }

    public int getBackgroundCategory() {
        return this.mBackgroundCategory;
    }

    public String getCategoryTag() {
        return this.mCategoryTag;
    }

    public List<ImgBean> getImgs() {
        return this.mImgs;
    }

    public void setBackgroundCategory(int i) {
        this.mBackgroundCategory = i;
    }

    public void setCategoryTag(String str) {
        this.mCategoryTag = str;
    }

    public void setImgs(List<ImgBean> list) {
        this.mImgs = list;
    }
}
