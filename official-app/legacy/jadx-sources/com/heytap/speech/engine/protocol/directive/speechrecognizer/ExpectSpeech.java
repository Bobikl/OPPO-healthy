package com.heytap.speech.engine.protocol.directive.speechrecognizer;

import androidx.annotation.Keep;
import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/speechrecognizer/ExpectSpeech;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "micAct", "Ljava/lang/String;", "getMicAct", "()Ljava/lang/String;", "setMicAct", "(Ljava/lang/String;)V", EngineConstant.REASON, "getReason", "setReason", "", "newAi", "Z", "getNewAi", "()Z", "setNewAi", "(Z)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class ExpectSpeech extends DirectivePayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.1";

    @Nullable
    private String micAct;
    private boolean newAi;

    @Nullable
    private String reason;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.directive.speechrecognizer.ExpectSpeech$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/speechrecognizer/ExpectSpeech$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return ExpectSpeech.VERSION;
        }
    }

    @Nullable
    public final String getMicAct() {
        return this.micAct;
    }

    public final boolean getNewAi() {
        return this.newAi;
    }

    @Nullable
    public final String getReason() {
        return this.reason;
    }

    public final void setMicAct(@Nullable String str) {
        this.micAct = str;
    }

    public final void setNewAi(boolean z) {
        this.newAi = z;
    }

    public final void setReason(@Nullable String str) {
        this.reason = str;
    }
}
