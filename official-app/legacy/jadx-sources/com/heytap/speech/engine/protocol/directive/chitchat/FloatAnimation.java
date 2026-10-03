package com.heytap.speech.engine.protocol.directive.chitchat;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/chitchat/FloatAnimation;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "imageHolderUrl", "", "getImageHolderUrl", "()Ljava/lang/String;", "setImageHolderUrl", "(Ljava/lang/String;)V", "md5", "getMd5", "setMd5", "mode", "getMode", "setMode", "type", "getType", "setType", "url", "getUrl", "setUrl", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class FloatAnimation extends DirectivePayload {

    @JsonProperty("imageHolderUrl")
    @Nullable
    private String imageHolderUrl;

    @JsonProperty("md5")
    @Nullable
    private String md5;

    @JsonProperty("mode")
    @Nullable
    private String mode;

    @JsonProperty("type")
    @Nullable
    private String type;

    @JsonProperty("url")
    @Nullable
    private String url;

    @Nullable
    public final String getImageHolderUrl() {
        return this.imageHolderUrl;
    }

    @Nullable
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    public final String getMode() {
        return this.mode;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setImageHolderUrl(@Nullable String str) {
        this.imageHolderUrl = str;
    }

    public final void setMd5(@Nullable String str) {
        this.md5 = str;
    }

    public final void setMode(@Nullable String str) {
        this.mode = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }
}
