package com.heytap.speech.engine.protocol.directive.image;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/image/ImageStyle1;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "bottomImageDarkUrl", "", "getBottomImageDarkUrl", "()Ljava/lang/String;", "setBottomImageDarkUrl", "(Ljava/lang/String;)V", "bottomImageUrl", "getBottomImageUrl", "setBottomImageUrl", "styleType", "getStyleType", "setStyleType", "topImageDarkUrl", "getTopImageDarkUrl", "setTopImageDarkUrl", "topImageUrl", "getTopImageUrl", "setTopImageUrl", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ImageStyle1 extends DirectivePayload {

    @Nullable
    private String bottomImageDarkUrl;

    @Nullable
    private String bottomImageUrl;

    @Nullable
    private String styleType;

    @Nullable
    private String topImageDarkUrl;

    @Nullable
    private String topImageUrl;

    @Nullable
    public final String getBottomImageDarkUrl() {
        return this.bottomImageDarkUrl;
    }

    @Nullable
    public final String getBottomImageUrl() {
        return this.bottomImageUrl;
    }

    @Nullable
    public final String getStyleType() {
        return this.styleType;
    }

    @Nullable
    public final String getTopImageDarkUrl() {
        return this.topImageDarkUrl;
    }

    @Nullable
    public final String getTopImageUrl() {
        return this.topImageUrl;
    }

    public final void setBottomImageDarkUrl(@Nullable String str) {
        this.bottomImageDarkUrl = str;
    }

    public final void setBottomImageUrl(@Nullable String str) {
        this.bottomImageUrl = str;
    }

    public final void setStyleType(@Nullable String str) {
        this.styleType = str;
    }

    public final void setTopImageDarkUrl(@Nullable String str) {
        this.topImageDarkUrl = str;
    }

    public final void setTopImageUrl(@Nullable String str) {
        this.topImageUrl = str;
    }
}
