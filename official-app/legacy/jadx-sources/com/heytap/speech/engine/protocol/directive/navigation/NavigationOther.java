package com.heytap.speech.engine.protocol.directive.navigation;

import androidx.annotation.Keep;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.platform.sdk.center.webview.js.AcCommonApiMethod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import xcrash.TombstoneParser;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u0000 #2\u00020\u0001:\u0003$%&B\u0007¢\u0006\u0004\b!\u0010\"R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006'"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/navigation/NavigationOther;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "intent", "Ljava/lang/String;", "getIntent", "()Ljava/lang/String;", "setIntent", "(Ljava/lang/String;)V", "Lcom/heytap/speech/engine/protocol/directive/navigation/NavigationOther$BaiduAuth;", "baidu", "Lcom/heytap/speech/engine/protocol/directive/navigation/NavigationOther$BaiduAuth;", "getBaidu", "()Lcom/heytap/speech/engine/protocol/directive/navigation/NavigationOther$BaiduAuth;", "setBaidu", "(Lcom/heytap/speech/engine/protocol/directive/navigation/NavigationOther$BaiduAuth;)V", "Lcom/heytap/speech/engine/protocol/directive/navigation/NavigationOther$GaodeAuth;", "gaode", "Lcom/heytap/speech/engine/protocol/directive/navigation/NavigationOther$GaodeAuth;", "getGaode", "()Lcom/heytap/speech/engine/protocol/directive/navigation/NavigationOther$GaodeAuth;", "setGaode", "(Lcom/heytap/speech/engine/protocol/directive/navigation/NavigationOther$GaodeAuth;)V", "priority", "getPriority", "setPriority", "", "needLocationPrivacy", "Ljava/lang/Boolean;", "getNeedLocationPrivacy", "()Ljava/lang/Boolean;", "setNeedLocationPrivacy", "(Ljava/lang/Boolean;)V", "<init>", "()V", "Companion", "BaiduAuth", "a", "GaodeAuth", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class NavigationOther extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private BaiduAuth baidu;

    @Nullable
    private GaodeAuth gaode;

    @Nullable
    private String intent;

    @Nullable
    private Boolean needLocationPrivacy;

    @Nullable
    private String priority;

    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/navigation/NavigationOther$BaiduAuth;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", TombstoneParser.keyProcessName, "", "getPname", "()Ljava/lang/String;", "setPname", "(Ljava/lang/String;)V", SearchIntents.EXTRA_QUERY, "getQuery", "setQuery", "token", AcCommonApiMethod.GET_TOKEN, "setToken", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class BaiduAuth extends DirectivePayload {

        @Nullable
        private String pname;

        @Nullable
        private String query;

        @Nullable
        private String token;

        @Nullable
        public final String getPname() {
            return this.pname;
        }

        @Nullable
        public final String getQuery() {
            return this.query;
        }

        @Nullable
        public final String getToken() {
            return this.token;
        }

        public final void setPname(@Nullable String str) {
            this.pname = str;
        }

        public final void setQuery(@Nullable String str) {
            this.query = str;
        }

        public final void setToken(@Nullable String str) {
            this.token = str;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/navigation/NavigationOther$GaodeAuth;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", SearchIntents.EXTRA_QUERY, "", "getQuery", "()Ljava/lang/String;", "setQuery", "(Ljava/lang/String;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class GaodeAuth extends DirectivePayload {

        @Nullable
        private String query;

        @Nullable
        public final String getQuery() {
            return this.query;
        }

        public final void setQuery(@Nullable String str) {
            this.query = str;
        }
    }

    @Nullable
    public final BaiduAuth getBaidu() {
        return this.baidu;
    }

    @Nullable
    public final GaodeAuth getGaode() {
        return this.gaode;
    }

    @Nullable
    public final String getIntent() {
        return this.intent;
    }

    @Nullable
    public final Boolean getNeedLocationPrivacy() {
        return this.needLocationPrivacy;
    }

    @Nullable
    public final String getPriority() {
        return this.priority;
    }

    public final void setBaidu(@Nullable BaiduAuth baiduAuth) {
        this.baidu = baiduAuth;
    }

    public final void setGaode(@Nullable GaodeAuth gaodeAuth) {
        this.gaode = gaodeAuth;
    }

    public final void setIntent(@Nullable String str) {
        this.intent = str;
    }

    public final void setNeedLocationPrivacy(@Nullable Boolean bool) {
        this.needLocationPrivacy = bool;
    }

    public final void setPriority(@Nullable String str) {
        this.priority = str;
    }
}
