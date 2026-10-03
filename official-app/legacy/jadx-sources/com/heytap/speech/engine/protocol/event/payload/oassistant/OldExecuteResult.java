package com.heytap.speech.engine.protocol.event.payload.oassistant;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/oassistant/OldExecuteResult;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "()V", "code", "", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "errorCode", "getErrorCode", "setErrorCode", "text", "", "getText", "()Ljava/lang/String;", ClickApiEntity.SET_TEXT, "(Ljava/lang/String;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class OldExecuteResult extends Payload {

    @Nullable
    private Integer code;

    @Nullable
    private Integer errorCode;

    @Nullable
    private String text;

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final void setCode(@Nullable Integer num) {
        this.code = num;
    }

    public final void setErrorCode(@Nullable Integer num) {
        this.errorCode = num;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }
}
