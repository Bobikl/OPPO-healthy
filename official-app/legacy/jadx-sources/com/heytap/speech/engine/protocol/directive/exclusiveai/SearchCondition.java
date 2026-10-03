package com.heytap.speech.engine.protocol.directive.exclusiveai;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\u001c\u0010%\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\b¨\u0006("}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/exclusiveai/SearchCondition;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "createBeginTime", "", "getCreateBeginTime", "()Ljava/lang/String;", "setCreateBeginTime", "(Ljava/lang/String;)V", "createEndTime", "getCreateEndTime", "setCreateEndTime", "keywords", "Ljava/util/ArrayList;", "getKeywords", "()Ljava/util/ArrayList;", "setKeywords", "(Ljava/util/ArrayList;)V", "lastN", "", "getLastN", "()Ljava/lang/Integer;", "setLastN", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "limit", "getLimit", "setLimit", "noteIds", "getNoteIds", "setNoteIds", "searchType", "getSearchType", "setSearchType", "updateBeginTime", "getUpdateBeginTime", "setUpdateBeginTime", "updateEndTime", "getUpdateEndTime", "setUpdateEndTime", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SearchCondition extends DirectivePayload {

    @Nullable
    private String createBeginTime;

    @Nullable
    private String createEndTime;

    @Nullable
    private ArrayList<String> keywords;

    @Nullable
    private Integer lastN;

    @Nullable
    private Integer limit;

    @Nullable
    private ArrayList<String> noteIds;

    @Nullable
    private String searchType;

    @Nullable
    private String updateBeginTime;

    @Nullable
    private String updateEndTime;

    @Nullable
    public final String getCreateBeginTime() {
        return this.createBeginTime;
    }

    @Nullable
    public final String getCreateEndTime() {
        return this.createEndTime;
    }

    @Nullable
    public final ArrayList<String> getKeywords() {
        return this.keywords;
    }

    @Nullable
    public final Integer getLastN() {
        return this.lastN;
    }

    @Nullable
    public final Integer getLimit() {
        return this.limit;
    }

    @Nullable
    public final ArrayList<String> getNoteIds() {
        return this.noteIds;
    }

    @Nullable
    public final String getSearchType() {
        return this.searchType;
    }

    @Nullable
    public final String getUpdateBeginTime() {
        return this.updateBeginTime;
    }

    @Nullable
    public final String getUpdateEndTime() {
        return this.updateEndTime;
    }

    public final void setCreateBeginTime(@Nullable String str) {
        this.createBeginTime = str;
    }

    public final void setCreateEndTime(@Nullable String str) {
        this.createEndTime = str;
    }

    public final void setKeywords(@Nullable ArrayList<String> arrayList) {
        this.keywords = arrayList;
    }

    public final void setLastN(@Nullable Integer num) {
        this.lastN = num;
    }

    public final void setLimit(@Nullable Integer num) {
        this.limit = num;
    }

    public final void setNoteIds(@Nullable ArrayList<String> arrayList) {
        this.noteIds = arrayList;
    }

    public final void setSearchType(@Nullable String str) {
        this.searchType = str;
    }

    public final void setUpdateBeginTime(@Nullable String str) {
        this.updateBeginTime = str;
    }

    public final void setUpdateEndTime(@Nullable String str) {
        this.updateEndTime = str;
    }
}
