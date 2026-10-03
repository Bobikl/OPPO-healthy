package com.heytap.store.bean;

/* JADX INFO: loaded from: classes3.dex */
public class OnLineCustomServiceBean {
    private String card_desc;
    private String card_note;
    private String card_picture;
    private String card_title;
    private String card_url;

    public String getCard_desc() {
        return this.card_desc;
    }

    public String getCard_note() {
        return this.card_note;
    }

    public String getCard_picture() {
        return this.card_picture;
    }

    public String getCard_title() {
        return this.card_title;
    }

    public String getCard_url() {
        return this.card_url;
    }

    public void setCard_desc(String str) {
        this.card_desc = str;
    }

    public void setCard_note(String str) {
        this.card_note = str;
    }

    public void setCard_picture(String str) {
        this.card_picture = str;
    }

    public void setCard_title(String str) {
        this.card_title = str;
    }

    public void setCard_url(String str) {
        this.card_url = str;
    }

    public String toString() {
        return "OnLineCustomServiceBean{card_title='" + this.card_title + "', card_url='" + this.card_url + "', card_desc='" + this.card_desc + "', card_note='" + this.card_note + "', card_picture='" + this.card_picture + "'}";
    }
}
