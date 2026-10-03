package com.heytap.speech.engine.protocol.directive.myai;

import androidx.annotation.Keep;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/myai/ImageInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", Fields.HEIGHT_FIELD, "", "getHeight", "()Ljava/lang/String;", "setHeight", "(Ljava/lang/String;)V", "index", "", "getIndex", "()Ljava/lang/Integer;", "setIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "securityCheckResult", "getSecurityCheckResult", "setSecurityCheckResult", "sourceUrl", "getSourceUrl", "setSourceUrl", "title", "getTitle", "setTitle", "url", "getUrl", "setUrl", Fields.WIDTH_FIELD, "getWidth", "setWidth", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ImageInfo extends DirectivePayload {

    @Nullable
    private String height;

    @Nullable
    private Integer index;

    @Nullable
    private Integer securityCheckResult;

    @Nullable
    private String sourceUrl;

    @Nullable
    private String title;

    @Nullable
    private String url;

    @Nullable
    private String width;

    @Nullable
    public final String getHeight() {
        return this.height;
    }

    @Nullable
    public final Integer getIndex() {
        return this.index;
    }

    @Nullable
    public final Integer getSecurityCheckResult() {
        return this.securityCheckResult;
    }

    @Nullable
    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final String getWidth() {
        return this.width;
    }

    public final void setHeight(@Nullable String str) {
        this.height = str;
    }

    public final void setIndex(@Nullable Integer num) {
        this.index = num;
    }

    public final void setSecurityCheckResult(@Nullable Integer num) {
        this.securityCheckResult = num;
    }

    public final void setSourceUrl(@Nullable String str) {
        this.sourceUrl = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    public final void setWidth(@Nullable String str) {
        this.width = str;
    }
}
