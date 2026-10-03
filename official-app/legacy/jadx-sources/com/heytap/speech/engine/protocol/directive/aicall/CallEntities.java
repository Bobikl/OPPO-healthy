package com.heytap.speech.engine.protocol.directive.aicall;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/aicall/CallEntities;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "contacts", "Ljava/lang/String;", "getContacts", "()Ljava/lang/String;", "setContacts", "(Ljava/lang/String;)V", "company", "getCompany", "setCompany", "position", "getPosition", "setPosition", "callId", "getCallId", "setCallId", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class CallEntities extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String callId;

    @Nullable
    private String company;

    @Nullable
    private String contacts;

    @Nullable
    private String position;

    @Nullable
    public final String getCallId() {
        return this.callId;
    }

    @Nullable
    public final String getCompany() {
        return this.company;
    }

    @Nullable
    public final String getContacts() {
        return this.contacts;
    }

    @Nullable
    public final String getPosition() {
        return this.position;
    }

    public final void setCallId(@Nullable String str) {
        this.callId = str;
    }

    public final void setCompany(@Nullable String str) {
        this.company = str;
    }

    public final void setContacts(@Nullable String str) {
        this.contacts = str;
    }

    public final void setPosition(@Nullable String str) {
        this.position = str;
    }
}
