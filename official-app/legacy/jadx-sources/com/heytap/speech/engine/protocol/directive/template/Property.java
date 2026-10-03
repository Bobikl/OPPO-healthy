package com.heytap.speech.engine.protocol.directive.template;

import androidx.annotation.Keep;
import java.io.Serializable;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/template/Property;", "Ljava/io/Serializable;", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "value", "getValue", "setValue", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Property implements Serializable {

    @Nullable
    private String name;

    @Nullable
    private String value;

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }
}
