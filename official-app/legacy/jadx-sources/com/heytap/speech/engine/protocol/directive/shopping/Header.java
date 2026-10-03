package com.heytap.speech.engine.protocol.directive.shopping;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/shopping/Header;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "buttonName", "", "getButtonName", "()Ljava/lang/String;", "setButtonName", "(Ljava/lang/String;)V", "clientImageUri", "getClientImageUri", "setClientImageUri", "darkIconUrl", "getDarkIconUrl", "setDarkIconUrl", "iconUrl", "getIconUrl", "setIconUrl", "recognizeBitmapUrl", "getRecognizeBitmapUrl", "setRecognizeBitmapUrl", "selectArea", "getSelectArea", "setSelectArea", "title", "getTitle", "setTitle", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Header extends DirectivePayload {

    @Nullable
    private String buttonName;

    @Nullable
    private String clientImageUri;

    @Nullable
    private String darkIconUrl;

    @Nullable
    private String iconUrl;

    @Nullable
    private String recognizeBitmapUrl;

    @Nullable
    private String selectArea;

    @Nullable
    private String title;

    @Nullable
    public final String getButtonName() {
        return this.buttonName;
    }

    @Nullable
    public final String getClientImageUri() {
        return this.clientImageUri;
    }

    @Nullable
    public final String getDarkIconUrl() {
        return this.darkIconUrl;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getRecognizeBitmapUrl() {
        return this.recognizeBitmapUrl;
    }

    @Nullable
    public final String getSelectArea() {
        return this.selectArea;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setButtonName(@Nullable String str) {
        this.buttonName = str;
    }

    public final void setClientImageUri(@Nullable String str) {
        this.clientImageUri = str;
    }

    public final void setDarkIconUrl(@Nullable String str) {
        this.darkIconUrl = str;
    }

    public final void setIconUrl(@Nullable String str) {
        this.iconUrl = str;
    }

    public final void setRecognizeBitmapUrl(@Nullable String str) {
        this.recognizeBitmapUrl = str;
    }

    public final void setSelectArea(@Nullable String str) {
        this.selectArea = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
