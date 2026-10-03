package com.heytap.speech.engine.protocol.directive.analogclick;

import androidx.annotation.Keep;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/analogclick/ClickScript;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "script", "Ljava/lang/String;", "getScript", "()Ljava/lang/String;", "setScript", "(Ljava/lang/String;)V", "data", "getData", "setData", SearchIntents.EXTRA_QUERY, "getQuery", "setQuery", "trackingInfo", "getTrackingInfo", "setTrackingInfo", "Ljava/util/HashMap;", "", "extend", "Ljava/util/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class ClickScript extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.2";

    @Nullable
    private String data;

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private String query;

    @Nullable
    private String script;

    @Nullable
    private String trackingInfo;

    @Nullable
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final String getQuery() {
        return this.query;
    }

    @Nullable
    public final String getScript() {
        return this.script;
    }

    @Nullable
    public final String getTrackingInfo() {
        return this.trackingInfo;
    }

    public final void setData(@Nullable String str) {
        this.data = str;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setQuery(@Nullable String str) {
        this.query = str;
    }

    public final void setScript(@Nullable String str) {
        this.script = str;
    }

    public final void setTrackingInfo(@Nullable String str) {
        this.trackingInfo = str;
    }
}
