package com.heytap.health.watchface.business.legacy.main.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class FindDetailStyleBean {
    private boolean mIsPreview;
    private boolean mIsVideo;
    private String mStyleImgUrl;
    private String mVideoUrl;

    public String getStyleImgUrl() {
        return this.mStyleImgUrl;
    }

    public String getVideoUrl() {
        return this.mVideoUrl;
    }

    public boolean isPreview() {
        return this.mIsPreview;
    }

    public boolean isVideo() {
        return this.mIsVideo;
    }

    public void setIsPreview(boolean z) {
        this.mIsPreview = z;
    }

    public void setIsVideo(boolean z) {
        this.mIsVideo = z;
    }

    public void setStyleImgUrl(String str) {
        this.mStyleImgUrl = str;
    }

    public void setVideoUrl(String str) {
        this.mVideoUrl = str;
    }
}
