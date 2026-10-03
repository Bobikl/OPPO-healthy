package com.lifesense.plugin.ble.data.tracker.setting;

/* JADX INFO: loaded from: classes5.dex */
public enum ATLanguage {
    ChineseCN("zh-CN"),
    ChineseTW("zh-TW"),
    English("en"),
    Japanese("ja"),
    Korean("ko"),
    French("fr"),
    Thai("th"),
    Hindi("hi"),
    Indonesian("id"),
    Vietnam("vi"),
    Russian("ru"),
    Ukraine("uk"),
    German("de"),
    Italian("it"),
    Spanish("es"),
    Polish("pl"),
    Arabic("ar"),
    Burmese("my"),
    Turkish("tr"),
    Hebrew("he"),
    Dutch("nl"),
    Portuguese("pt");

    public String languageCode;

    ATLanguage(String str) {
        this.languageCode = str;
    }

    public String getLanguageCode() {
        return this.languageCode;
    }

    public void setLanguageCode(String str) {
        this.languageCode = str;
    }
}
