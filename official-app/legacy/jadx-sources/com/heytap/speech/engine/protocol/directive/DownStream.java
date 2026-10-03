package com.heytap.speech.engine.protocol.directive;

import androidx.annotation.Keep;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.platform.usercenter.bizuws.executor.dialog.ShowDialogExecutor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR(\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00110\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001a\u00100\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\b¨\u00063"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/DownStream;", "Ljava/io/Serializable;", "()V", "clientId", "", "getClientId", "()Ljava/lang/String;", "setClientId", "(Ljava/lang/String;)V", "conversationId", "getConversationId", "setConversationId", ShowDialogExecutor.JSON_DIALOG_ID_KEY, "getDialogId", "setDialogId", "directives", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/Directive;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "getDirectives", "()Ljava/util/ArrayList;", "setDirectives", "(Ljava/util/ArrayList;)V", "extend", "Ljava/util/HashMap;", "", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", SpeechConstant.KEY_ORIGINAL_RECORD_ID, "getOriginalRecordId", "setOriginalRecordId", SpeechConstant.KEY_RECORD_ID, "getRecordId", "setRecordId", "roomId", "getRoomId", "setRoomId", "sequenceId", "getSequenceId", "setSequenceId", "sessionId", "getSessionId", "setSessionId", "uniqueId", "getUniqueId", "setUniqueId", "version", "getVersion", "setVersion", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DownStream implements Serializable {

    @Nullable
    private HashMap<String, Object> extend;

    @NotNull
    private ArrayList<Directive<? extends DirectivePayload>> directives = new ArrayList<>();

    @NotNull
    private String version = "";

    @NotNull
    private String clientId = "";

    @NotNull
    private String conversationId = "";

    @NotNull
    private String sessionId = "";

    @NotNull
    private String recordId = "";

    @NotNull
    private String originalRecordId = "";

    @NotNull
    private String dialogId = "";

    @NotNull
    private String roomId = "";

    @NotNull
    private String uniqueId = "";

    @NotNull
    private String sequenceId = "";

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    public final String getDialogId() {
        return this.dialogId;
    }

    @NotNull
    public final ArrayList<Directive<? extends DirectivePayload>> getDirectives() {
        return this.directives;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @NotNull
    public final String getOriginalRecordId() {
        return this.originalRecordId;
    }

    @NotNull
    public final String getRecordId() {
        return this.recordId;
    }

    @NotNull
    public final String getRoomId() {
        return this.roomId;
    }

    @NotNull
    public final String getSequenceId() {
        return this.sequenceId;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final String getUniqueId() {
        return this.uniqueId;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public final void setClientId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clientId = str;
    }

    public final void setConversationId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.conversationId = str;
    }

    public final void setDialogId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dialogId = str;
    }

    public final void setDirectives(@NotNull ArrayList<Directive<? extends DirectivePayload>> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.directives = arrayList;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setOriginalRecordId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.originalRecordId = str;
    }

    public final void setRecordId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.recordId = str;
    }

    public final void setRoomId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.roomId = str;
    }

    public final void setSequenceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sequenceId = str;
    }

    public final void setSessionId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sessionId = str;
    }

    public final void setUniqueId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uniqueId = str;
    }

    public final void setVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.version = str;
    }
}
