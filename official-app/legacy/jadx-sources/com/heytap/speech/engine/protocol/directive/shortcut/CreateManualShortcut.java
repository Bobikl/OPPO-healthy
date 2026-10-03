package com.heytap.speech.engine.protocol.directive.shortcut;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b \u0010!R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bRB\u0010\r\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tj\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/shortcut/CreateManualShortcut;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "Lcom/heytap/speech/engine/protocol/directive/shortcut/ManualShortcutItemInfo;", UTraceSQLiteHelperKt.COL_INFO, "Lcom/heytap/speech/engine/protocol/directive/shortcut/ManualShortcutItemInfo;", "getInfo", "()Lcom/heytap/speech/engine/protocol/directive/shortcut/ManualShortcutItemInfo;", "setInfo", "(Lcom/heytap/speech/engine/protocol/directive/shortcut/ManualShortcutItemInfo;)V", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "params", "Ljava/util/HashMap;", "getParams", "()Ljava/util/HashMap;", "setParams", "(Ljava/util/HashMap;)V", "", "paramComplete", "Ljava/lang/Boolean;", "getParamComplete", "()Ljava/lang/Boolean;", "setParamComplete", "(Ljava/lang/Boolean;)V", "reply", "Ljava/lang/String;", "getReply", "()Ljava/lang/String;", "setReply", "(Ljava/lang/String;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class CreateManualShortcut extends DirectivePayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private ManualShortcutItemInfo info;

    @Nullable
    private Boolean paramComplete;

    @Nullable
    private HashMap<String, Object> params;

    @Nullable
    private String reply;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.directive.shortcut.CreateManualShortcut$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/shortcut/CreateManualShortcut$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return CreateManualShortcut.VERSION;
        }
    }

    @Nullable
    public final ManualShortcutItemInfo getInfo() {
        return this.info;
    }

    @Nullable
    public final Boolean getParamComplete() {
        return this.paramComplete;
    }

    @Nullable
    public final HashMap<String, Object> getParams() {
        return this.params;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    public final void setInfo(@Nullable ManualShortcutItemInfo manualShortcutItemInfo) {
        this.info = manualShortcutItemInfo;
    }

    public final void setParamComplete(@Nullable Boolean bool) {
        this.paramComplete = bool;
    }

    public final void setParams(@Nullable HashMap<String, Object> map) {
        this.params = map;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }
}
