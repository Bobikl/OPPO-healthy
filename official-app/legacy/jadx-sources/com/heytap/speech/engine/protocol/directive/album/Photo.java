package com.heytap.speech.engine.protocol.directive.album;

import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/album/Photo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "mediaId", "", "getMediaId", "()Ljava/lang/Long;", "setMediaId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "path", "", "getPath", "()Ljava/lang/String;", "setPath", "(Ljava/lang/String;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Photo extends DirectivePayload {

    @Nullable
    private Long mediaId;

    @Nullable
    private String path;

    @Nullable
    public final Long getMediaId() {
        return this.mediaId;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    public final void setMediaId(@Nullable Long l2) {
        this.mediaId = l2;
    }

    public final void setPath(@Nullable String str) {
        this.path = str;
    }
}
