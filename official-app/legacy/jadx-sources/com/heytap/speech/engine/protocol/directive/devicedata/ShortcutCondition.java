package com.heytap.speech.engine.protocol.directive.devicedata;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/devicedata/ShortcutCondition;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "needShortcuts", "", "getNeedShortcuts", "()Ljava/lang/Boolean;", "setNeedShortcuts", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "needTasks", "getNeedTasks", "setNeedTasks", "needTriggers", "getNeedTriggers", "setNeedTriggers", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ShortcutCondition extends DirectivePayload {

    @Nullable
    private Boolean needShortcuts;

    @Nullable
    private Boolean needTasks;

    @Nullable
    private Boolean needTriggers;

    @Nullable
    public final Boolean getNeedShortcuts() {
        return this.needShortcuts;
    }

    @Nullable
    public final Boolean getNeedTasks() {
        return this.needTasks;
    }

    @Nullable
    public final Boolean getNeedTriggers() {
        return this.needTriggers;
    }

    public final void setNeedShortcuts(@Nullable Boolean bool) {
        this.needShortcuts = bool;
    }

    public final void setNeedTasks(@Nullable Boolean bool) {
        this.needTasks = bool;
    }

    public final void setNeedTriggers(@Nullable Boolean bool) {
        this.needTriggers = bool;
    }
}
