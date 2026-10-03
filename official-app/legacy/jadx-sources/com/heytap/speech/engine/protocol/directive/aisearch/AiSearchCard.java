package com.heytap.speech.engine.protocol.directive.aisearch;

import androidx.annotation.Keep;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b)\u0010*R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR$\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR$\u0010 \u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u000fR$\u0010#\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\r\"\u0004\b%\u0010\u000fR$\u0010&\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u000b\u001a\u0004\b'\u0010\r\"\u0004\b(\u0010\u000f¨\u0006-"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/aisearch/AiSearchCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "type", "Ljava/lang/Integer;", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "", "reply", "Ljava/lang/String;", "getReply", "()Ljava/lang/String;", "setReply", "(Ljava/lang/String;)V", SearchIntents.EXTRA_QUERY, "getQuery", "setQuery", "Ljava/util/ArrayList;", "loadingStateTexts", "Ljava/util/ArrayList;", "getLoadingStateTexts", "()Ljava/util/ArrayList;", "setLoadingStateTexts", "(Ljava/util/ArrayList;)V", "timeout", "getTimeout", "setTimeout", "agentCallReply", "getAgentCallReply", "setAgentCallReply", "afterKillReply", "getAfterKillReply", "setAfterKillReply", "backupReply", "getBackupReply", "setBackupReply", SpeechConstant.KEY_ORIGINAL_RECORD_ID, "getOriginalRecordId", "setOriginalRecordId", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class AiSearchCard extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.1";

    @Nullable
    private String afterKillReply;

    @Nullable
    private String agentCallReply;

    @Nullable
    private String backupReply;

    @Nullable
    private ArrayList<String> loadingStateTexts;

    @Nullable
    private String originalRecordId;

    @Nullable
    private String query;

    @Nullable
    private String reply;

    @Nullable
    private Integer timeout;

    @Nullable
    private Integer type;

    @Nullable
    public final String getAfterKillReply() {
        return this.afterKillReply;
    }

    @Nullable
    public final String getAgentCallReply() {
        return this.agentCallReply;
    }

    @Nullable
    public final String getBackupReply() {
        return this.backupReply;
    }

    @Nullable
    public final ArrayList<String> getLoadingStateTexts() {
        return this.loadingStateTexts;
    }

    @Nullable
    public final String getOriginalRecordId() {
        return this.originalRecordId;
    }

    @Nullable
    public final String getQuery() {
        return this.query;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    @Nullable
    public final Integer getTimeout() {
        return this.timeout;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public final void setAfterKillReply(@Nullable String str) {
        this.afterKillReply = str;
    }

    public final void setAgentCallReply(@Nullable String str) {
        this.agentCallReply = str;
    }

    public final void setBackupReply(@Nullable String str) {
        this.backupReply = str;
    }

    public final void setLoadingStateTexts(@Nullable ArrayList<String> arrayList) {
        this.loadingStateTexts = arrayList;
    }

    public final void setOriginalRecordId(@Nullable String str) {
        this.originalRecordId = str;
    }

    public final void setQuery(@Nullable String str) {
        this.query = str;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }

    public final void setTimeout(@Nullable Integer num) {
        this.timeout = num;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }
}
