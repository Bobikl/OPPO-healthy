package com.heytap.speech.engine.protocol.event.payload.oassistant;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.oassistant.OAssistant;
import com.heytap.speech.engine.protocol.event.Payload;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b'\u0010(R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/oassistant/OAssistantExecuteResult;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistant$OAssistantApiInfo;", "executeApi", "Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistant$OAssistantApiInfo;", "getExecuteApi", "()Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistant$OAssistantApiInfo;", "setExecuteApi", "(Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistant$OAssistantApiInfo;)V", "Lcom/heytap/speech/engine/protocol/event/payload/oassistant/ExecuteResult;", "result", "Lcom/heytap/speech/engine/protocol/event/payload/oassistant/ExecuteResult;", "getResult", "()Lcom/heytap/speech/engine/protocol/event/payload/oassistant/ExecuteResult;", "setResult", "(Lcom/heytap/speech/engine/protocol/event/payload/oassistant/ExecuteResult;)V", "Lcom/heytap/speech/engine/protocol/event/payload/oassistant/OldExecuteResult;", "oldResult", "Lcom/heytap/speech/engine/protocol/event/payload/oassistant/OldExecuteResult;", "getOldResult", "()Lcom/heytap/speech/engine/protocol/event/payload/oassistant/OldExecuteResult;", "setOldResult", "(Lcom/heytap/speech/engine/protocol/event/payload/oassistant/OldExecuteResult;)V", "Ljava/util/HashMap;", "", "", "extend", "Ljava/util/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "", "userClick", "Ljava/lang/Boolean;", "getUserClick", "()Ljava/lang/Boolean;", "setUserClick", "(Ljava/lang/Boolean;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class OAssistantExecuteResult extends Payload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private OAssistant.OAssistantApiInfo executeApi;

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private OldExecuteResult oldResult;

    @Nullable
    private ExecuteResult result;

    @Nullable
    private Boolean userClick = Boolean.FALSE;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.event.payload.oassistant.OAssistantExecuteResult$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/oassistant/OAssistantExecuteResult$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return OAssistantExecuteResult.VERSION;
        }
    }

    @Nullable
    public final OAssistant.OAssistantApiInfo getExecuteApi() {
        return this.executeApi;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final OldExecuteResult getOldResult() {
        return this.oldResult;
    }

    @Nullable
    public final ExecuteResult getResult() {
        return this.result;
    }

    @Nullable
    public final Boolean getUserClick() {
        return this.userClick;
    }

    public final void setExecuteApi(@Nullable OAssistant.OAssistantApiInfo oAssistantApiInfo) {
        this.executeApi = oAssistantApiInfo;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setOldResult(@Nullable OldExecuteResult oldExecuteResult) {
        this.oldResult = oldExecuteResult;
    }

    public final void setResult(@Nullable ExecuteResult executeResult) {
        this.result = executeResult;
    }

    public final void setUserClick(@Nullable Boolean bool) {
        this.userClick = bool;
    }
}
