package com.oppo.store.web.bean;

import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/oppo/store/web/bean/RightActionBean;", "", "()V", "callbackId", "", "getCallbackId", "()Ljava/lang/String;", "setCallbackId", "(Ljava/lang/String;)V", "colorDark", "getColorDark", "setColorDark", "colorLight", "getColorLight", "setColorLight", "iconDark", "getIconDark", "setIconDark", "iconGrey", "getIconGrey", "setIconGrey", "iconLight", "getIconLight", "setIconLight", "text", "getText", ClickApiEntity.SET_TEXT, "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class RightActionBean {

    @Nullable
    private String callbackId;

    @Nullable
    private String colorDark;

    @Nullable
    private String colorLight;

    @Nullable
    private String iconDark;

    @Nullable
    private String iconGrey;

    @Nullable
    private String iconLight;

    @Nullable
    private String text;

    @Nullable
    public final String getCallbackId() {
        return this.callbackId;
    }

    @Nullable
    public final String getColorDark() {
        return this.colorDark;
    }

    @Nullable
    public final String getColorLight() {
        return this.colorLight;
    }

    @Nullable
    public final String getIconDark() {
        return this.iconDark;
    }

    @Nullable
    public final String getIconGrey() {
        return this.iconGrey;
    }

    @Nullable
    public final String getIconLight() {
        return this.iconLight;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final void setCallbackId(@Nullable String str) {
        this.callbackId = str;
    }

    public final void setColorDark(@Nullable String str) {
        this.colorDark = str;
    }

    public final void setColorLight(@Nullable String str) {
        this.colorLight = str;
    }

    public final void setIconDark(@Nullable String str) {
        this.iconDark = str;
    }

    public final void setIconGrey(@Nullable String str) {
        this.iconGrey = str;
    }

    public final void setIconLight(@Nullable String str) {
        this.iconLight = str;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }
}
