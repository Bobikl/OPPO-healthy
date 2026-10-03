package com.heytap.speech.engine.protocol.directive.exclusiveai;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR6\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/exclusiveai/MemoryToast;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "keeped", "Ljava/lang/Boolean;", "getKeeped", "()Ljava/lang/Boolean;", "setKeeped", "(Ljava/lang/Boolean;)V", "", "keepSecond", "Ljava/lang/String;", "getKeepSecond", "()Ljava/lang/String;", "setKeepSecond", "(Ljava/lang/String;)V", "saveFailReason", "getSaveFailReason", "setSaveFailReason", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/exclusiveai/Content;", "Lkotlin/collections/ArrayList;", "contentList", "Ljava/util/ArrayList;", "getContentList", "()Ljava/util/ArrayList;", "setContentList", "(Ljava/util/ArrayList;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class MemoryToast extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private ArrayList<Content> contentList;

    @Nullable
    private String keepSecond;

    @JsonProperty("keep")
    @Nullable
    private Boolean keeped;

    @Nullable
    private String saveFailReason;

    @Nullable
    public final ArrayList<Content> getContentList() {
        return this.contentList;
    }

    @Nullable
    public final String getKeepSecond() {
        return this.keepSecond;
    }

    @Nullable
    public final Boolean getKeeped() {
        return this.keeped;
    }

    @Nullable
    public final String getSaveFailReason() {
        return this.saveFailReason;
    }

    public final void setContentList(@Nullable ArrayList<Content> arrayList) {
        this.contentList = arrayList;
    }

    public final void setKeepSecond(@Nullable String str) {
        this.keepSecond = str;
    }

    public final void setKeeped(@Nullable Boolean bool) {
        this.keeped = bool;
    }

    public final void setSaveFailReason(@Nullable String str) {
        this.saveFailReason = str;
    }
}
