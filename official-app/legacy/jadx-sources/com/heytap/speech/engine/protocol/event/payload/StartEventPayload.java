package com.heytap.speech.engine.protocol.event.payload;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR0\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/StartEventPayload;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "Lcom/heytap/speech/engine/protocol/event/payload/Invoker;", "invoker", "Lcom/heytap/speech/engine/protocol/event/payload/Invoker;", "getInvoker", "()Lcom/heytap/speech/engine/protocol/event/payload/Invoker;", "setInvoker", "(Lcom/heytap/speech/engine/protocol/event/payload/Invoker;)V", "", "", "", "attributes", "Ljava/util/Map;", "getAttributes", "()Ljava/util/Map;", "setAttributes", "(Ljava/util/Map;)V", "<init>", "(Lcom/heytap/speech/engine/protocol/event/payload/Invoker;Ljava/util/Map;)V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class StartEventPayload extends Payload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private Map<String, ? extends Object> attributes;

    @NotNull
    private Invoker invoker;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.event.payload.StartEventPayload$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/StartEventPayload$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return StartEventPayload.VERSION;
        }
    }

    public /* synthetic */ StartEventPayload(Invoker invoker, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(invoker, (i & 2) != 0 ? new HashMap() : map);
    }

    @Nullable
    public final Map<String, Object> getAttributes() {
        return this.attributes;
    }

    @NotNull
    public final Invoker getInvoker() {
        return this.invoker;
    }

    public final void setAttributes(@Nullable Map<String, ? extends Object> map) {
        this.attributes = map;
    }

    public final void setInvoker(@NotNull Invoker invoker) {
        Intrinsics.checkNotNullParameter(invoker, "<set-?>");
        this.invoker = invoker;
    }

    public StartEventPayload(@NotNull Invoker invoker, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(invoker, "invoker");
        this.invoker = invoker;
        this.attributes = map;
    }
}
