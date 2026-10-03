package com.heytap.speech.engine.protocol.directive.nlp;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.store.base.widget.state.data.StateConstantsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/nlp/DocUploadResult;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "content", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", StateConstantsKt.STATE_ACTION_BTN_CLICK, "getButtonText", "setButtonText", "filePath", "getFilePath", "setFilePath", "", "action", "I", "getAction", "()I", "setAction", "(I)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class DocUploadResult extends DirectivePayload {
    public static final int ACTION_RE_UPLOAD = 0;

    @NotNull
    private static final String VERSION = "2.0";
    private int action;

    @Nullable
    private String buttonText;

    @Nullable
    private String content;

    @Nullable
    private String filePath;

    public final int getAction() {
        return this.action;
    }

    @Nullable
    public final String getButtonText() {
        return this.buttonText;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getFilePath() {
        return this.filePath;
    }

    public final void setAction(int i) {
        this.action = i;
    }

    public final void setButtonText(@Nullable String str) {
        this.buttonText = str;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setFilePath(@Nullable String str) {
        this.filePath = str;
    }
}
