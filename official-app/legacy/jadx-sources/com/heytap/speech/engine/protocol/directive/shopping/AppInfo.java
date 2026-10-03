package com.heytap.speech.engine.protocol.directive.shopping;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/shopping/AppInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "appName", "", "getAppName", "()Ljava/lang/String;", "setAppName", "(Ljava/lang/String;)V", "packageName", "getPackageName", "setPackageName", "versionCode", "getVersionCode", "setVersionCode", "versionName", "getVersionName", "setVersionName", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AppInfo extends DirectivePayload {

    @Nullable
    private String appName;

    @Nullable
    private String packageName;

    @Nullable
    private String versionCode;

    @Nullable
    private String versionName;

    @Nullable
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    public final String getVersionCode() {
        return this.versionCode;
    }

    @Nullable
    public final String getVersionName() {
        return this.versionName;
    }

    public final void setAppName(@Nullable String str) {
        this.appName = str;
    }

    public final void setPackageName(@Nullable String str) {
        this.packageName = str;
    }

    public final void setVersionCode(@Nullable String str) {
        this.versionCode = str;
    }

    public final void setVersionName(@Nullable String str) {
        this.versionName = str;
    }
}
