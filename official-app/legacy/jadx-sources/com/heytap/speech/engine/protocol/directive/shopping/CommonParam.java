package com.heytap.speech.engine.protocol.directive.shopping;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/shopping/CommonParam;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", SpeechConstant.KEY_TTS_REQUEST_HEADER, "Lcom/heytap/speech/engine/protocol/directive/shopping/Header;", "getHeader", "()Lcom/heytap/speech/engine/protocol/directive/shopping/Header;", "setHeader", "(Lcom/heytap/speech/engine/protocol/directive/shopping/Header;)V", "openCardType", "", "getOpenCardType", "()Ljava/lang/String;", "setOpenCardType", "(Ljava/lang/String;)V", "reply", "getReply", "setReply", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CommonParam extends DirectivePayload {

    @Nullable
    private Header header;

    @Nullable
    private String openCardType;

    @Nullable
    private String reply;

    @Nullable
    public final Header getHeader() {
        return this.header;
    }

    @Nullable
    public final String getOpenCardType() {
        return this.openCardType;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    public final void setHeader(@Nullable Header header) {
        this.header = header;
    }

    public final void setOpenCardType(@Nullable String str) {
        this.openCardType = str;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }
}
