package com.heytap.speech.engine.protocol.directive.devicedata;

import androidx.annotation.Keep;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/devicedata/AiSearchCondition;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "extend", "Ljava/util/HashMap;", "", "", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", SearchIntents.EXTRA_QUERY, "getQuery", "()Ljava/lang/String;", "setQuery", "(Ljava/lang/String;)V", "queryScope", "Ljava/util/ArrayList;", "", "getQueryScope", "()Ljava/util/ArrayList;", "setQueryScope", "(Ljava/util/ArrayList;)V", "type", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AiSearchCondition extends DirectivePayload {

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private String query;

    @Nullable
    private ArrayList<Integer> queryScope;

    @Nullable
    private Integer type;

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final String getQuery() {
        return this.query;
    }

    @Nullable
    public final ArrayList<Integer> getQueryScope() {
        return this.queryScope;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setQuery(@Nullable String str) {
        this.query = str;
    }

    public final void setQueryScope(@Nullable ArrayList<Integer> arrayList) {
        this.queryScope = arrayList;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }
}
