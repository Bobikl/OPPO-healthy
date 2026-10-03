package com.omron.lib.model.bg;

/* JADX INFO: loaded from: classes5.dex */
public enum Unit {
    UNIT_MGPL("mg/L"),
    UNIT_MMOLPL("mmol/L");

    private String description;

    Unit(String str) {
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String str) {
        this.description = str;
    }
}
