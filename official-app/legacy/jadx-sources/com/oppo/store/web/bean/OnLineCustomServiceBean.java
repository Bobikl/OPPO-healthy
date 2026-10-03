package com.oppo.store.web.bean;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/oppo/store/web/bean/OnLineCustomServiceBean;", "", "()V", "card_desc", "", "getCard_desc", "()Ljava/lang/String;", "setCard_desc", "(Ljava/lang/String;)V", "card_note", "getCard_note", "setCard_note", "card_picture", "getCard_picture", "setCard_picture", "card_title", "getCard_title", "setCard_title", "card_url", "getCard_url", "setCard_url", "toString", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class OnLineCustomServiceBean {

    @Nullable
    private String card_desc;

    @Nullable
    private String card_note;

    @Nullable
    private String card_picture;

    @Nullable
    private String card_title;

    @Nullable
    private String card_url;

    @Nullable
    public final String getCard_desc() {
        return this.card_desc;
    }

    @Nullable
    public final String getCard_note() {
        return this.card_note;
    }

    @Nullable
    public final String getCard_picture() {
        return this.card_picture;
    }

    @Nullable
    public final String getCard_title() {
        return this.card_title;
    }

    @Nullable
    public final String getCard_url() {
        return this.card_url;
    }

    public final void setCard_desc(@Nullable String str) {
        this.card_desc = str;
    }

    public final void setCard_note(@Nullable String str) {
        this.card_note = str;
    }

    public final void setCard_picture(@Nullable String str) {
        this.card_picture = str;
    }

    public final void setCard_title(@Nullable String str) {
        this.card_title = str;
    }

    public final void setCard_url(@Nullable String str) {
        this.card_url = str;
    }

    @NotNull
    public String toString() {
        return "OnLineCustomServiceBean{card_title='" + this.card_title + "', card_url='" + this.card_url + "', card_desc='" + this.card_desc + "', card_note='" + this.card_note + "', card_picture='" + this.card_picture + "'}";
    }
}
