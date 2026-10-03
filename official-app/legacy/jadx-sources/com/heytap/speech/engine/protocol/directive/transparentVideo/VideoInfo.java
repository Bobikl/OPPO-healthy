package com.heytap.speech.engine.protocol.directive.transparentVideo;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/transparentVideo/VideoInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "md5", "", "getMd5", "()Ljava/lang/String;", "setMd5", "(Ljava/lang/String;)V", "size", "", "getSize", "()Ljava/lang/Long;", "setSize", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "url", "getUrl", "setUrl", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class VideoInfo extends DirectivePayload {

    @Nullable
    private String md5;

    @Nullable
    private Long size;

    @Nullable
    private String url;

    @Nullable
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    public final Long getSize() {
        return this.size;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setMd5(@Nullable String str) {
        this.md5 = str;
    }

    public final void setSize(@Nullable Long l2) {
        this.size = l2;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }
}
