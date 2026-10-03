package com.heytap.speech.engine.protocol.directive.devicedata;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/devicedata/CallLogCondition;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "count", "", "getCount", "()Ljava/lang/Integer;", "setCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CallLogCondition extends DirectivePayload {

    @Nullable
    private Integer count;

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    public final void setCount(@Nullable Integer num) {
        this.count = num;
    }
}
