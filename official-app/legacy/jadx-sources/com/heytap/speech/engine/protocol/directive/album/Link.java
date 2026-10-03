package com.heytap.speech.engine.protocol.directive.album;

import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/album/Link;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", DeepLinkInterpreter.KEY_DEEP_LINK, "", "getDeepLink", "()Ljava/lang/String;", "setDeepLink", "(Ljava/lang/String;)V", "packageName", "getPackageName", "setPackageName", "url", "getUrl", "setUrl", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Link extends DirectivePayload {

    @Nullable
    private String deepLink;

    @Nullable
    private String packageName;

    @Nullable
    private String url;

    @Nullable
    public final String getDeepLink() {
        return this.deepLink;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setDeepLink(@Nullable String str) {
        this.deepLink = str;
    }

    public final void setPackageName(@Nullable String str) {
        this.packageName = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }
}
