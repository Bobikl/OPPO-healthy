package com.heytap.speech.engine.protocol.directive.tracking;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.store.base.widget.state.data.StateConstantsKt;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/tracking/LongPressInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", StateConstantsKt.STATE_ACTION_BTN_CLICK, "", "getButtonText", "()Ljava/lang/String;", "setButtonText", "(Ljava/lang/String;)V", "type", "getType", "setType", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class LongPressInfo extends DirectivePayload {

    @Nullable
    private String buttonText;

    @Nullable
    private String type;

    @Nullable
    public final String getButtonText() {
        return this.buttonText;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setButtonText(@Nullable String str) {
        this.buttonText = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
