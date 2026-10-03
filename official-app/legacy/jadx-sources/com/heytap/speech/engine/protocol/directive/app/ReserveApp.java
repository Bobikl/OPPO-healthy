package com.heytap.speech.engine.protocol.directive.app;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/app/ReserveApp;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "appName", "Ljava/lang/String;", "getAppName", "()Ljava/lang/String;", "setAppName", "(Ljava/lang/String;)V", "packageName", "getPackageName", "setPackageName", "appId", "getAppId", "setAppId", "reply", "getReply", "setReply", "sourceMod", "getSourceMod", "setSourceMod", "", "autoReserve", "Ljava/lang/Boolean;", "getAutoReserve", "()Ljava/lang/Boolean;", "setAutoReserve", "(Ljava/lang/Boolean;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class ReserveApp extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String appId;

    @Nullable
    private String appName;

    @Nullable
    private Boolean autoReserve;

    @Nullable
    private String packageName;

    @Nullable
    private String reply;

    @Nullable
    private String sourceMod;

    @Nullable
    public final String getAppId() {
        return this.appId;
    }

    @Nullable
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    public final Boolean getAutoReserve() {
        return this.autoReserve;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    @Nullable
    public final String getSourceMod() {
        return this.sourceMod;
    }

    public final void setAppId(@Nullable String str) {
        this.appId = str;
    }

    public final void setAppName(@Nullable String str) {
        this.appName = str;
    }

    public final void setAutoReserve(@Nullable Boolean bool) {
        this.autoReserve = bool;
    }

    public final void setPackageName(@Nullable String str) {
        this.packageName = str;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }

    public final void setSourceMod(@Nullable String str) {
        this.sourceMod = str;
    }
}
