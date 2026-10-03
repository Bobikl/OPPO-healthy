package com.oppo.store.web.bean;

import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/oppo/store/web/bean/JsCreditBean;", "", "()V", "credit", "", "getCredit", "()Ljava/lang/String;", "setCredit", "(Ljava/lang/String;)V", "states", "getStates", "setStates", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class JsCreditBean {

    @Nullable
    private String credit;

    @Nullable
    private String states;

    @Nullable
    public final String getCredit() {
        return this.credit;
    }

    @Nullable
    public final String getStates() {
        return this.states;
    }

    public final void setCredit(@Nullable String str) {
        this.credit = str;
    }

    public final void setStates(@Nullable String str) {
        this.states = str;
    }
}
