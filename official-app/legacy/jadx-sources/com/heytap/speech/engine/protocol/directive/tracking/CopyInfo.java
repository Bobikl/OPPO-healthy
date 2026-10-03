package com.heytap.speech.engine.protocol.directive.tracking;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/tracking/CopyInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "autoCopy", "", "getAutoCopy", "()Ljava/lang/Boolean;", "setAutoCopy", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CopyInfo extends DirectivePayload {

    @Nullable
    private Boolean autoCopy;

    @Nullable
    private String content;

    @Nullable
    public final Boolean getAutoCopy() {
        return this.autoCopy;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    public final void setAutoCopy(@Nullable Boolean bool) {
        this.autoCopy = bool;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }
}
