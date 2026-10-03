package com.heytap.speech.engine.protocol.directive.template;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/template/TextListCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "Lcom/heytap/speech/engine/protocol/directive/template/Title;", "title", "Lcom/heytap/speech/engine/protocol/directive/template/Title;", "getTitle", "()Lcom/heytap/speech/engine/protocol/directive/template/Title;", "setTitle", "(Lcom/heytap/speech/engine/protocol/directive/template/Title;)V", "", "Lcom/heytap/speech/engine/protocol/directive/template/TextItem;", "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class TextListCard extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @JsonProperty("items")
    @Nullable
    private List<TextItem> items;

    @JsonProperty("title")
    @Nullable
    private Title title;

    @Nullable
    public final List<TextItem> getItems() {
        return this.items;
    }

    @Nullable
    public final Title getTitle() {
        return this.title;
    }

    public final void setItems(@Nullable List<TextItem> list) {
        this.items = list;
    }

    public final void setTitle(@Nullable Title title) {
        this.title = title;
    }
}
