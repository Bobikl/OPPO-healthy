package com.heytap.speech.engine.connect.core.legacy;

import androidx.annotation.Keep;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/heytap/speech/engine/connect/core/legacy/DirectiveBean;", "", "()V", "cmd", "", "getCmd", "()Ljava/lang/String;", "setCmd", "(Ljava/lang/String;)V", "params", "", "getParams", "()Ljava/util/Map;", "setParams", "(Ljava/util/Map;)V", "type", "getType", "setType", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DirectiveBean {

    @Nullable
    private String cmd;

    @Nullable
    private Map<String, Object> params;

    @Nullable
    private String type;

    @Nullable
    public final String getCmd() {
        return this.cmd;
    }

    @Nullable
    public final Map<String, Object> getParams() {
        return this.params;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setCmd(@Nullable String str) {
        this.cmd = str;
    }

    public final void setParams(@Nullable Map<String, Object> map) {
        this.params = map;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
