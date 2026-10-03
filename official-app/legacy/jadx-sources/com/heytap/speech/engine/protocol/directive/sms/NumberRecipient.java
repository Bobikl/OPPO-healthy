package com.heytap.speech.engine.protocol.directive.sms;

import androidx.annotation.Keep;
import androidx.autofill.HintConstants;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/sms/NumberRecipient;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "", "getPhoneNumber", "()Ljava/lang/String;", "setPhoneNumber", "(Ljava/lang/String;)V", "type", "", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NumberRecipient extends DirectivePayload {

    @Nullable
    private String phoneNumber;

    @Nullable
    private Integer type;

    @Nullable
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public final void setPhoneNumber(@Nullable String str) {
        this.phoneNumber = str;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }
}
