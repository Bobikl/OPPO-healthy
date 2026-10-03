package com.heytap.health.watchface.business.creation.category.paint.bean;

import com.heytap.health.watchface.business.creation.base.custom.WatchFaceCustomStyleListItem;

/* JADX INFO: loaded from: classes19.dex */
public class HandPaintClockStyleItemBean extends WatchFaceCustomStyleListItem {
    public static final int POINTER_STYLE_1 = 0;
    public static final int TEXT_STYLE_HORIZONTAL_CENTER = 0;
    public static final int TEXT_STYLE_HORIZONTAL_CENTER_DOWN = 7;
    public static final int TEXT_STYLE_HORIZONTAL_CENTER_UP = 6;
    public static final int TEXT_STYLE_HORIZONTAL_LEFT_DOWN = 2;
    public static final int TEXT_STYLE_HORIZONTAL_LEFT_UP = 1;
    public static final int TEXT_STYLE_VERTICAL_CENTER = 3;
    public static final int TEXT_STYLE_VERTICAL_LEFT_DOWN = 5;
    public static final int TEXT_STYLE_VERTICAL_LEFT_UP = 4;
    public static final int TIME_TYPE_POINTER = 1;
    public static final int TIME_TYPE_TEXT = 0;
    private int styleType;
    private int timeType;

    public int getStyleType() {
        return this.styleType;
    }

    public int getTimeType() {
        return this.timeType;
    }

    public void setStyleType(int i) {
        this.styleType = i;
    }

    public void setTimeType(int i) {
        this.timeType = i;
    }
}
