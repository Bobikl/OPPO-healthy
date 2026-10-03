package com.heytap.speech.engine.protocol.directive.activepush;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/activepush/PushMessage;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "ignoreVerificationRecordId", "Ljava/lang/Boolean;", "getIgnoreVerificationRecordId", "()Ljava/lang/Boolean;", "setIgnoreVerificationRecordId", "(Ljava/lang/Boolean;)V", "Lcom/heytap/speech/engine/protocol/directive/activepush/PushData;", "data", "Lcom/heytap/speech/engine/protocol/directive/activepush/PushData;", "getData", "()Lcom/heytap/speech/engine/protocol/directive/activepush/PushData;", "setData", "(Lcom/heytap/speech/engine/protocol/directive/activepush/PushData;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class PushMessage extends DirectivePayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.1";

    @Nullable
    private PushData data;

    @Nullable
    private Boolean ignoreVerificationRecordId;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.directive.activepush.PushMessage$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/activepush/PushMessage$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return PushMessage.VERSION;
        }
    }

    @Nullable
    public final PushData getData() {
        return this.data;
    }

    @Nullable
    public final Boolean getIgnoreVerificationRecordId() {
        return this.ignoreVerificationRecordId;
    }

    public final void setData(@Nullable PushData pushData) {
        this.data = pushData;
    }

    public final void setIgnoreVerificationRecordId(@Nullable Boolean bool) {
        this.ignoreVerificationRecordId = bool;
    }
}
