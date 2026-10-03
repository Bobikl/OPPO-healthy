package com.heytap.speech.engine.protocol.event.payload.oassistant;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/oassistant/ExecuteResult;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "()V", "code", "", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "message", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "params", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/event/payload/oassistant/OutputParam;", "getParams", "()Ljava/util/ArrayList;", "setParams", "(Ljava/util/ArrayList;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ExecuteResult extends Payload {

    @Nullable
    private Integer code;

    @Nullable
    private String message;

    @Nullable
    private ArrayList<OutputParam> params;

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final ArrayList<OutputParam> getParams() {
        return this.params;
    }

    public final void setCode(@Nullable Integer num) {
        this.code = num;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    public final void setParams(@Nullable ArrayList<OutputParam> arrayList) {
        this.params = arrayList;
    }
}
