package com.heytap.speech.engine.protocol.directive.shortcut;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/shortcut/ManualShortcutItem;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "immediateExe", "", "getImmediateExe", "()Ljava/lang/Boolean;", "setImmediateExe", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", UTraceSQLiteHelperKt.COL_INFO, "Lcom/heytap/speech/engine/protocol/directive/shortcut/ManualShortcutItemInfo;", "getInfo", "()Lcom/heytap/speech/engine/protocol/directive/shortcut/ManualShortcutItemInfo;", "setInfo", "(Lcom/heytap/speech/engine/protocol/directive/shortcut/ManualShortcutItemInfo;)V", "shortcutId", "", "getShortcutId", "()Ljava/lang/Integer;", "setShortcutId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "tag", "", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ManualShortcutItem extends DirectivePayload {

    @Nullable
    private Boolean immediateExe;

    @Nullable
    private ManualShortcutItemInfo info;

    @Nullable
    private Integer shortcutId;

    @Nullable
    private String tag;

    @Nullable
    public final Boolean getImmediateExe() {
        return this.immediateExe;
    }

    @Nullable
    public final ManualShortcutItemInfo getInfo() {
        return this.info;
    }

    @Nullable
    public final Integer getShortcutId() {
        return this.shortcutId;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    public final void setImmediateExe(@Nullable Boolean bool) {
        this.immediateExe = bool;
    }

    public final void setInfo(@Nullable ManualShortcutItemInfo manualShortcutItemInfo) {
        this.info = manualShortcutItemInfo;
    }

    public final void setShortcutId(@Nullable Integer num) {
        this.shortcutId = num;
    }

    public final void setTag(@Nullable String str) {
        this.tag = str;
    }
}
