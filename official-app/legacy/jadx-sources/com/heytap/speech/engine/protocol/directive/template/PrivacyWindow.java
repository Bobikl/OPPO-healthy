package com.heytap.speech.engine.protocol.directive.template;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/template/PrivacyWindow;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", SearchIntents.EXTRA_QUERY, "Ljava/lang/String;", "getQuery", "()Ljava/lang/String;", "setQuery", "(Ljava/lang/String;)V", "", "isNeedLogin", "Z", "()Z", "setNeedLogin", "(Z)V", "", "checkPolicyUpgradeCode", "Ljava/lang/Integer;", "getCheckPolicyUpgradeCode", "()Ljava/lang/Integer;", "setCheckPolicyUpgradeCode", "(Ljava/lang/Integer;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class PrivacyWindow extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @JsonProperty("checkPolicyUpgradeCode")
    @Nullable
    private Integer checkPolicyUpgradeCode;

    @JsonProperty("isNeedLogin")
    private boolean isNeedLogin;

    @JsonProperty(SearchIntents.EXTRA_QUERY)
    @Nullable
    private String query;

    @Nullable
    public final Integer getCheckPolicyUpgradeCode() {
        return this.checkPolicyUpgradeCode;
    }

    @Nullable
    public final String getQuery() {
        return this.query;
    }

    /* JADX INFO: renamed from: isNeedLogin, reason: from getter */
    public final boolean getIsNeedLogin() {
        return this.isNeedLogin;
    }

    public final void setCheckPolicyUpgradeCode(@Nullable Integer num) {
        this.checkPolicyUpgradeCode = num;
    }

    public final void setNeedLogin(boolean z) {
        this.isNeedLogin = z;
    }

    public final void setQuery(@Nullable String str) {
        this.query = str;
    }
}
