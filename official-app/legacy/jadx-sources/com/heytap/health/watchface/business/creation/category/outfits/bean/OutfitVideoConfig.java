package com.heytap.health.watchface.business.creation.category.outfits.bean;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class OutfitVideoConfig {
    public static final String CONFIG = "videos_config.json";
    public static final String FOLDER = "videos";
    private int mBackgroundCategory;
    private String mCategoryTag;
    private List<VideoBean> mVideos;

    @Keep
    public static class VideoBean {
        private int mAiShaderType;
        private String mBackgroundImgName;
        private String mBackgroundName;
        private boolean mForceWhite;
        private int mRepeatTimes;
        private String mSupportTimeMark;

        public int getAiShaderType() {
            return this.mAiShaderType;
        }

        public String getBackgroundImgName() {
            return this.mBackgroundImgName;
        }

        public String getBackgroundName() {
            return this.mBackgroundName;
        }

        public int getRepeatTimes() {
            return this.mRepeatTimes;
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

        public void setBackgroundImgName(String str) {
            this.mBackgroundImgName = str;
        }

        public void setBackgroundName(String str) {
            this.mBackgroundName = str;
        }

        public void setForceWhite(boolean z) {
            this.mForceWhite = z;
        }

        public void setRepeatTimes(int i) {
            this.mRepeatTimes = i;
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

    public List<VideoBean> getVideos() {
        return this.mVideos;
    }

    public void setBackgroundCategory(int i) {
        this.mBackgroundCategory = i;
    }

    public void setCategoryTag(String str) {
        this.mCategoryTag = str;
    }

    public void setVideos(List<VideoBean> list) {
        this.mVideos = list;
    }
}
