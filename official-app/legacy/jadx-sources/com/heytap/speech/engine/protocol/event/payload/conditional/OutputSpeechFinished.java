package com.heytap.speech.engine.protocol.event.payload.conditional;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u001f\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002HÆ\u0003J!\u0010\u0007\u001a\u00020\u00002\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0003HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÖ\u0003R0\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/conditional/OutputSpeechFinished;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "", "", "component1", "params", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "setParams", "(Ljava/util/Map;)V", "<init>", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class OutputSpeechFinished extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private Map<String, Object> params;

    /* JADX WARN: Multi-variable type inference failed */
    public OutputSpeechFinished() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OutputSpeechFinished copy$default(OutputSpeechFinished outputSpeechFinished, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = outputSpeechFinished.params;
        }
        return outputSpeechFinished.copy(map);
    }

    @Nullable
    public final Map<String, Object> component1() {
        return this.params;
    }

    @NotNull
    public final OutputSpeechFinished copy(@Nullable Map<String, Object> params) {
        return new OutputSpeechFinished(params);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OutputSpeechFinished) && Intrinsics.areEqual(this.params, ((OutputSpeechFinished) other).params);
    }

    @Nullable
    public final Map<String, Object> getParams() {
        return this.params;
    }

    public int hashCode() {
        Map<String, Object> map = this.params;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final void setParams(@Nullable Map<String, Object> map) {
        this.params = map;
    }

    @NotNull
    public String toString() {
        return "OutputSpeechFinished(params=" + this.params + ')';
    }

    public /* synthetic */ OutputSpeechFinished(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map);
    }

    public OutputSpeechFinished(@Nullable Map<String, Object> map) {
        this.params = map;
    }
}
