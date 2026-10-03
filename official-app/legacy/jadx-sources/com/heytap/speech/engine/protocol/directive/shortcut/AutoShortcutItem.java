package com.heytap.speech.engine.protocol.directive.shortcut;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/shortcut/AutoShortcutItem;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "shortcutId", "", "getShortcutId", "()Ljava/lang/Integer;", "setShortcutId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "state", "getState", "setState", "tag", "", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AutoShortcutItem extends DirectivePayload {

    @Nullable
    private Integer shortcutId;

    @Nullable
    private Integer state;

    @Nullable
    private String tag;

    @Nullable
    public final Integer getShortcutId() {
        return this.shortcutId;
    }

    @Nullable
    public final Integer getState() {
        return this.state;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    public final void setShortcutId(@Nullable Integer num) {
        this.shortcutId = num;
    }

    public final void setState(@Nullable Integer num) {
        this.state = num;
    }

    public final void setTag(@Nullable String str) {
        this.tag = str;
    }
}
