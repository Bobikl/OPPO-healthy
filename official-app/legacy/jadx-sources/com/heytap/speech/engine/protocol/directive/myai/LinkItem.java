package com.heytap.speech.engine.protocol.directive.myai;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/myai/LinkItem;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "extraInfo", "Ljava/util/HashMap;", "", "", "getExtraInfo", "()Ljava/util/HashMap;", "setExtraInfo", "(Ljava/util/HashMap;)V", "linkContent", "getLinkContent", "()Ljava/lang/String;", "setLinkContent", "(Ljava/lang/String;)V", "originalIndex", "", "getOriginalIndex", "()Ljava/lang/Integer;", "setOriginalIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "title", "getTitle", "setTitle", "type", "getType", "setType", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class LinkItem extends DirectivePayload {

    @Nullable
    private HashMap<String, Object> extraInfo;

    @Nullable
    private String linkContent;

    @Nullable
    private Integer originalIndex;

    @Nullable
    private String title;

    @Nullable
    private Integer type;

    @Nullable
    public final HashMap<String, Object> getExtraInfo() {
        return this.extraInfo;
    }

    @Nullable
    public final String getLinkContent() {
        return this.linkContent;
    }

    @Nullable
    public final Integer getOriginalIndex() {
        return this.originalIndex;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public final void setExtraInfo(@Nullable HashMap<String, Object> map) {
        this.extraInfo = map;
    }

    public final void setLinkContent(@Nullable String str) {
        this.linkContent = str;
    }

    public final void setOriginalIndex(@Nullable Integer num) {
        this.originalIndex = num;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }
}
