package com.heytap.health.watchface.business.creation.category.omoji.bean;

import com.heytap.health.watchface.business.creation.base.custom.WatchFaceCustomStyleListItem;

/* JADX INFO: loaded from: classes19.dex */
public class OmojiClockStyleItemBean extends WatchFaceCustomStyleListItem {
    public static final int BG_TYPE_JB = 1;
    public static final int BG_TYPE_WG = 0;
    private static final int TIME_STYLE_COUNT = 6;
    private int bgType;
    private int timeStyle;

    public int getBgType() {
        return this.bgType;
    }

    public int getTimeStyle() {
        return this.timeStyle;
    }

    public void setBgType(int i) {
        this.bgType = i;
    }

    public void setTimeStyle(int i) {
        this.timeStyle = i;
    }
}
