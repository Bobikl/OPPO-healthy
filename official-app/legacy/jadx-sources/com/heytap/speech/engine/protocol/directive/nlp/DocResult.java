package com.heytap.speech.engine.protocol.directive.nlp;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/nlp/DocResult;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "docRecordId", "Ljava/lang/String;", "getDocRecordId", "()Ljava/lang/String;", "setDocRecordId", "(Ljava/lang/String;)V", "", "status", "Ljava/lang/Integer;", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class DocResult extends DirectivePayload {
    public static final int RESULT_FAIL = 0;
    public static final int RESULT_OK = 1;

    @Nullable
    private String docRecordId;

    @Nullable
    private Integer status;

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    public final String getDocRecordId() {
        return this.docRecordId;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    public final void setDocRecordId(@Nullable String str) {
        this.docRecordId = str;
    }

    public final void setStatus(@Nullable Integer num) {
        this.status = num;
    }
}
