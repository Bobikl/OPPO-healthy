package com.heytap.speech.engine.protocol.directive.addresslist;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015R6\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/addresslist/DeleteContact;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "candidateNames", "Ljava/util/ArrayList;", "getCandidateNames", "()Ljava/util/ArrayList;", "setCandidateNames", "(Ljava/util/ArrayList;)V", "whichIndex", "Ljava/lang/String;", "getWhichIndex", "()Ljava/lang/String;", "setWhichIndex", "(Ljava/lang/String;)V", "content", "getContent", "setContent", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class DeleteContact extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private ArrayList<String> candidateNames;

    @Nullable
    private String content;

    @Nullable
    private String whichIndex;

    @Nullable
    public final ArrayList<String> getCandidateNames() {
        return this.candidateNames;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getWhichIndex() {
        return this.whichIndex;
    }

    public final void setCandidateNames(@Nullable ArrayList<String> arrayList) {
        this.candidateNames = arrayList;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setWhichIndex(@Nullable String str) {
        this.whichIndex = str;
    }
}
