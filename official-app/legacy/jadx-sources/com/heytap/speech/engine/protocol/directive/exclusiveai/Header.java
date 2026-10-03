package com.heytap.speech.engine.protocol.directive.exclusiveai;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/exclusiveai/Header;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "buttonLink", "", "getButtonLink", "()Ljava/lang/String;", "setButtonLink", "(Ljava/lang/String;)V", "buttonName", "getButtonName", "setButtonName", "darkIconUrl", "getDarkIconUrl", "setDarkIconUrl", "iconUrl", "getIconUrl", "setIconUrl", "title", "getTitle", "setTitle", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Header extends DirectivePayload {

    @Nullable
    private String buttonLink;

    @Nullable
    private String buttonName;

    @Nullable
    private String darkIconUrl;

    @Nullable
    private String iconUrl;

    @Nullable
    private String title;

    @Nullable
    public final String getButtonLink() {
        return this.buttonLink;
    }

    @Nullable
    public final String getButtonName() {
        return this.buttonName;
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
    public final String getTitle() {
        return this.title;
    }

    public final void setButtonLink(@Nullable String str) {
        this.buttonLink = str;
    }

    public final void setButtonName(@Nullable String str) {
        this.buttonName = str;
    }

    public final void setDarkIconUrl(@Nullable String str) {
        this.darkIconUrl = str;
    }

    public final void setIconUrl(@Nullable String str) {
        this.iconUrl = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
