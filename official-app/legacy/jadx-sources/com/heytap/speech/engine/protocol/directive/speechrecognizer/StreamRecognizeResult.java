package com.heytap.speech.engine.protocol.directive.speechrecognizer;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b#\u0010$R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R$\u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/speechrecognizer/StreamRecognizeResult;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "content", "getContent", "setContent", "mode", "getMode", "setMode", "", "seqNo", "Ljava/lang/Integer;", "getSeqNo", "()Ljava/lang/Integer;", "setSeqNo", "(Ljava/lang/Integer;)V", "replaceIndex", "getReplaceIndex", "setReplaceIndex", "oneshotRound", "getOneshotRound", "setOneshotRound", "", "wakeupWord", "Ljava/lang/Boolean;", "getWakeupWord", "()Ljava/lang/Boolean;", "setWakeupWord", "(Ljava/lang/Boolean;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class StreamRecognizeResult extends DirectivePayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String content;

    @Nullable
    private String mode;

    @Nullable
    private Integer oneshotRound;

    @Nullable
    private Integer replaceIndex;

    @Nullable
    private Integer seqNo;

    @Nullable
    private String type;

    @Nullable
    private Boolean wakeupWord;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.directive.speechrecognizer.StreamRecognizeResult$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/speechrecognizer/StreamRecognizeResult$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return StreamRecognizeResult.VERSION;
        }
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getMode() {
        return this.mode;
    }

    @Nullable
    public final Integer getOneshotRound() {
        return this.oneshotRound;
    }

    @Nullable
    public final Integer getReplaceIndex() {
        return this.replaceIndex;
    }

    @Nullable
    public final Integer getSeqNo() {
        return this.seqNo;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final Boolean getWakeupWord() {
        return this.wakeupWord;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setMode(@Nullable String str) {
        this.mode = str;
    }

    public final void setOneshotRound(@Nullable Integer num) {
        this.oneshotRound = num;
    }

    public final void setReplaceIndex(@Nullable Integer num) {
        this.replaceIndex = num;
    }

    public final void setSeqNo(@Nullable Integer num) {
        this.seqNo = num;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setWakeupWord(@Nullable Boolean bool) {
        this.wakeupWord = bool;
    }
}
