package com.heytap.speech.engine.protocol.directive.sms;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001e\u0010\u001fR*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R$\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/sms/SendSmsByNumber;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/sms/NumberRecipient;", "candidateRecipients", "Ljava/util/ArrayList;", "getCandidateRecipients", "()Ljava/util/ArrayList;", "setCandidateRecipients", "(Ljava/util/ArrayList;)V", "", "reply", "Ljava/lang/String;", "getReply", "()Ljava/lang/String;", "setReply", "(Ljava/lang/String;)V", "content", "getContent", "setContent", "simIndex", "getSimIndex", "setSimIndex", "", "userConfirm", "Ljava/lang/Boolean;", "getUserConfirm", "()Ljava/lang/Boolean;", "setUserConfirm", "(Ljava/lang/Boolean;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class SendSmsByNumber extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private ArrayList<NumberRecipient> candidateRecipients;

    @Nullable
    private String content;

    @Nullable
    private String reply;

    @Nullable
    private String simIndex;

    @Nullable
    private Boolean userConfirm;

    @Nullable
    public final ArrayList<NumberRecipient> getCandidateRecipients() {
        return this.candidateRecipients;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    @Nullable
    public final String getSimIndex() {
        return this.simIndex;
    }

    @Nullable
    public final Boolean getUserConfirm() {
        return this.userConfirm;
    }

    public final void setCandidateRecipients(@Nullable ArrayList<NumberRecipient> arrayList) {
        this.candidateRecipients = arrayList;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }

    public final void setSimIndex(@Nullable String str) {
        this.simIndex = str;
    }

    public final void setUserConfirm(@Nullable Boolean bool) {
        this.userConfirm = bool;
    }
}
