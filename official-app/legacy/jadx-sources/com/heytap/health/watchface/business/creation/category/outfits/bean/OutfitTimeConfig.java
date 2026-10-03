package com.heytap.health.watchface.business.creation.category.outfits.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class OutfitTimeConfig {
    public static final String CONFIG = "times_config.json";
    public static final String FOLDER = "times";
    private String mConfigFile;
    private String mTimeMark;
    private String mTimePreView;

    public String getConfigFile() {
        return this.mConfigFile;
    }

    public String getTimeMark() {
        return this.mTimeMark;
    }

    public String getTimePreView() {
        return this.mTimePreView;
    }

    public void setConfigFile(String str) {
        this.mConfigFile = str;
    }

    public void setTimeMark(String str) {
        this.mTimeMark = str;
    }

    public void setTimePreView(String str) {
        this.mTimePreView = str;
    }
}
