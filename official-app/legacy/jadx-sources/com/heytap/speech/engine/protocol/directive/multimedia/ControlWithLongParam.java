package com.heytap.speech.engine.protocol.directive.multimedia;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/multimedia/ControlWithLongParam;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "action", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "", "second", "Ljava/lang/Long;", "getSecond", "()Ljava/lang/Long;", "setSecond", "(Ljava/lang/Long;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class ControlWithLongParam extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String action;

    @Nullable
    private Long second;

    @Nullable
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final Long getSecond() {
        return this.second;
    }

    public final void setAction(@Nullable String str) {
        this.action = str;
    }

    public final void setSecond(@Nullable Long l2) {
        this.second = l2;
    }
}
