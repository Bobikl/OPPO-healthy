package com.heytap.msp.sdk.base.common;

/* JADX INFO: loaded from: classes19.dex */
public class DialogResourceConfig {
    private String content;
    private String customContent;
    private String nagative;
    private String positive;
    private String title;

    public DialogResourceConfig(String str, String str2) {
        this(str, str2, "", "");
    }

    public String getContent() {
        return this.content;
    }

    public String getCustomContent() {
        return this.customContent;
    }

    public String getNagative() {
        return this.nagative;
    }

    public String getPositive() {
        return this.positive;
    }

    public String getTitle() {
        return this.title;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCustomContent(String str) {
        this.customContent = str;
    }

    public void setNagative(String str) {
        this.nagative = str;
    }

    public void setPositive(String str) {
        this.positive = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public DialogResourceConfig(String str, String str2, String str3, String str4) {
        this(str, str2, "", str3, str4);
    }

    public DialogResourceConfig(String str, String str2, String str3, String str4, String str5) {
        this.customContent = str3;
        this.title = str;
        this.content = str2;
        this.positive = str4;
        this.nagative = str5;
    }
}
