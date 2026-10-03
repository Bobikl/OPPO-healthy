package com.heytap.speech.engine.protocol.event.payload.devicedata;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR4\u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/devicedata/UserPortrait;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "()V", "failMsg", "", "getFailMsg", "()Ljava/lang/String;", "setFailMsg", "(Ljava/lang/String;)V", "userMessage", "", "", "getUserMessage", "()Ljava/util/Map;", "setUserMessage", "(Ljava/util/Map;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UserPortrait extends Payload {

    @Nullable
    private String failMsg;

    @Nullable
    private Map<String, ? extends Map<String, ? extends Object>> userMessage;

    @Nullable
    public final String getFailMsg() {
        return this.failMsg;
    }

    @Nullable
    public final Map<String, Map<String, Object>> getUserMessage() {
        return this.userMessage;
    }

    public final void setFailMsg(@Nullable String str) {
        this.failMsg = str;
    }

    public final void setUserMessage(@Nullable Map<String, ? extends Map<String, ? extends Object>> map) {
        this.userMessage = map;
    }
}
