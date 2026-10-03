package com.heytap.speech.engine.protocol.directive.exclusiveai;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b \u0010!R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/exclusiveai/SearchNotes;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "category", "Ljava/lang/String;", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "", "timeout", "Ljava/lang/Integer;", "getTimeout", "()Ljava/lang/Integer;", "setTimeout", "(Ljava/lang/Integer;)V", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/exclusiveai/SearchCondition;", "searchConditions", "Ljava/util/ArrayList;", "getSearchConditions", "()Ljava/util/ArrayList;", "setSearchConditions", "(Ljava/util/ArrayList;)V", "Ljava/util/HashMap;", "", "extend", "Ljava/util/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class SearchNotes extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String category;

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private ArrayList<SearchCondition> searchConditions;

    @Nullable
    private Integer timeout;

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final ArrayList<SearchCondition> getSearchConditions() {
        return this.searchConditions;
    }

    @Nullable
    public final Integer getTimeout() {
        return this.timeout;
    }

    public final void setCategory(@Nullable String str) {
        this.category = str;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setSearchConditions(@Nullable ArrayList<SearchCondition> arrayList) {
        this.searchConditions = arrayList;
    }

    public final void setTimeout(@Nullable Integer num) {
        this.timeout = num;
    }
}
