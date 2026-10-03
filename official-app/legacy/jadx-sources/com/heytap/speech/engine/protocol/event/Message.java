package com.heytap.speech.engine.protocol.event;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.wka;
import com.platform.usercenter.bizuws.executor.dialog.ShowDialogExecutor;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR,\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e0\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u00020\u00158GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u00020\u00158GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001c\u001a\u00020\u00048GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR\u001e\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001e\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\"\u0010%\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010,\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR\u001e\u0010/\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\b¨\u00062"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/Message;", "Ljava/io/Serializable;", "()V", "conversationId", "", "getConversationId", "()Ljava/lang/String;", "setConversationId", "(Ljava/lang/String;)V", ShowDialogExecutor.JSON_DIALOG_ID_KEY, "getDialogId", "setDialogId", DbParams.TABLE_EVENTS, "", "Lcom/heytap/speech/engine/protocol/event/Event;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "getEvents", "()Ljava/util/List;", "setEvents", "(Ljava/util/List;)V", "isRetryMessage", "", "()Z", "setRetryMessage", "(Z)V", "logout", "getLogout", "setLogout", "messageId", "getMessageId", "setMessageId", SpeechConstant.KEY_ORIGINAL_RECORD_ID, "getOriginalRecordId", "setOriginalRecordId", SpeechConstant.KEY_RECORD_ID, "getRecordId", "setRecordId", "sequenceId", "", "getSequenceId", "()Ljava/lang/Integer;", "setSequenceId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "sessionId", "getSessionId", "setSessionId", "version", "getVersion", "setVersion", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Message implements Serializable {
    private boolean isRetryMessage;

    @JsonProperty("sequenceId")
    @Nullable
    private Integer sequenceId;

    @JsonProperty("conversationId")
    @NotNull
    private String conversationId = "";

    @JsonProperty(DbParams.TABLE_EVENTS)
    @NotNull
    private List<? extends Event<? extends Payload>> events = CollectionsKt__CollectionsKt.emptyList();

    @JsonProperty(SpeechConstant.KEY_RECORD_ID)
    @NotNull
    private String recordId = "";

    @JsonProperty(SpeechConstant.KEY_ORIGINAL_RECORD_ID)
    @NotNull
    private String originalRecordId = "";

    @JsonProperty("sessionId")
    @NotNull
    private String sessionId = "";

    @JsonProperty(ShowDialogExecutor.JSON_DIALOG_ID_KEY)
    @NotNull
    private String dialogId = "";

    @JsonProperty("version")
    @NotNull
    private String version = "3.0";
    private boolean logout = true;

    @NotNull
    private String messageId = "";

    @NotNull
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    public final String getDialogId() {
        return this.dialogId;
    }

    @NotNull
    public final List<Event<? extends Payload>> getEvents() {
        return this.events;
    }

    @wka
    public final boolean getLogout() {
        return this.logout;
    }

    @wka
    @NotNull
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    public final String getOriginalRecordId() {
        return this.originalRecordId;
    }

    @NotNull
    public final String getRecordId() {
        return this.recordId;
    }

    @Nullable
    public final Integer getSequenceId() {
        return this.sequenceId;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    @wka
    /* JADX INFO: renamed from: isRetryMessage, reason: from getter */
    public final boolean getIsRetryMessage() {
        return this.isRetryMessage;
    }

    public final void setConversationId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.conversationId = str;
    }

    public final void setDialogId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dialogId = str;
    }

    public final void setEvents(@NotNull List<? extends Event<? extends Payload>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.events = list;
    }

    public final void setLogout(boolean z) {
        this.logout = z;
    }

    public final void setMessageId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.messageId = str;
    }

    public final void setOriginalRecordId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.originalRecordId = str;
    }

    public final void setRecordId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.recordId = str;
    }

    public final void setRetryMessage(boolean z) {
        this.isRetryMessage = z;
    }

    public final void setSequenceId(@Nullable Integer num) {
        this.sequenceId = num;
    }

    public final void setSessionId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sessionId = str;
    }

    public final void setVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.version = str;
    }
}
