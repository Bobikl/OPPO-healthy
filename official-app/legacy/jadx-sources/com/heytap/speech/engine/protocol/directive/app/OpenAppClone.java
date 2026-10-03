package com.heytap.speech.engine.protocol.directive.app;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\f\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/app/OpenAppClone;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "appName", "Ljava/lang/String;", "getAppName", "()Ljava/lang/String;", "setAppName", "(Ljava/lang/String;)V", "packageName", "getPackageName", "setPackageName", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class OpenAppClone extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String appName;

    @Nullable
    private String packageName;

    @Nullable
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    public final void setAppName(@Nullable String str) {
        this.appName = str;
    }

    public final void setPackageName(@Nullable String str) {
        this.packageName = str;
    }
}
