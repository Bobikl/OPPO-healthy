package com.heytap.speech.engine.protocol.event.payload.alerts;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR0\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/alerts/AlarmStatus;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "", "attributes", "Ljava/util/Map;", "getAttributes", "()Ljava/util/Map;", "setAttributes", "(Ljava/util/Map;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class AlarmStatus extends Payload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private Map<String, String> attributes;

    @Nullable
    private String code;

    @Nullable
    public final Map<String, String> getAttributes() {
        return this.attributes;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    public final void setAttributes(@Nullable Map<String, String> map) {
        this.attributes = map;
    }

    public final void setCode(@Nullable String str) {
        this.code = str;
    }
}
