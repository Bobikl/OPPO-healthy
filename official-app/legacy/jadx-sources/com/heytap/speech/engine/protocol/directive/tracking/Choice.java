package com.heytap.speech.engine.protocol.directive.tracking;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/tracking/Choice;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "choiceTitle", "", "getChoiceTitle", "()Ljava/lang/String;", "setChoiceTitle", "(Ljava/lang/String;)V", "options", "", "getOptions", "()Ljava/util/List;", "setOptions", "(Ljava/util/List;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Choice extends DirectivePayload {

    @Nullable
    private String choiceTitle;

    @Nullable
    private List<String> options;

    @Nullable
    public final String getChoiceTitle() {
        return this.choiceTitle;
    }

    @Nullable
    public final List<String> getOptions() {
        return this.options;
    }

    public final void setChoiceTitle(@Nullable String str) {
        this.choiceTitle = str;
    }

    public final void setOptions(@Nullable List<String> list) {
        this.options = list;
    }
}
