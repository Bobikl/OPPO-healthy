package com.omron.lib.model.bg;

/* JADX INFO: loaded from: classes5.dex */
public enum Meal {
    NOT_PRESENT("未设定", 0),
    BEFORE_MEAL("餐前", 1),
    AFTER_MEAL("餐后", 2),
    EMPTY_MEAL("空腹", 3);

    private int code;
    private String description;

    Meal(String str, int i) {
        this.description = str;
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }
}
