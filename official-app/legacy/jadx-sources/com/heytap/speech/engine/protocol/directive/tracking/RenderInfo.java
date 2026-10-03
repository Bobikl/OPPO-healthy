package com.heytap.speech.engine.protocol.directive.tracking;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/tracking/RenderInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "options", "", "Lcom/heytap/speech/engine/protocol/directive/tracking/FeedbackOption;", "getOptions", "()Ljava/util/List;", "setOptions", "(Ljava/util/List;)V", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RenderInfo extends DirectivePayload {

    @JsonProperty("options")
    @Nullable
    private List<FeedbackOption> options;

    @JsonProperty("title")
    @Nullable
    private String title;

    @Nullable
    public final List<FeedbackOption> getOptions() {
        return this.options;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setOptions(@Nullable List<FeedbackOption> list) {
        this.options = list;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
