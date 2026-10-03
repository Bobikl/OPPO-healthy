package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/heytap/store/business/component/entity/HeaderAdvertPendantInfo;", "", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "pendantIcon", "getPendantIcon", "setPendantIcon", "pendantLinks", "getPendantLinks", "setPendantLinks", "pendantLogin", "", "getPendantLogin", "()Ljava/lang/Boolean;", "setPendantLogin", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "pendantStyle", "getPendantStyle", "setPendantStyle", "pendantText", "getPendantText", "setPendantText", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HeaderAdvertPendantInfo {

    @Nullable
    private String id;

    @Nullable
    private String pendantIcon;

    @Nullable
    private String pendantLinks;

    @Nullable
    private Boolean pendantLogin = Boolean.FALSE;

    @Nullable
    private String pendantStyle;

    @Nullable
    private String pendantText;

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getPendantIcon() {
        return this.pendantIcon;
    }

    @Nullable
    public final String getPendantLinks() {
        return this.pendantLinks;
    }

    @Nullable
    public final Boolean getPendantLogin() {
        return this.pendantLogin;
    }

    @Nullable
    public final String getPendantStyle() {
        return this.pendantStyle;
    }

    @Nullable
    public final String getPendantText() {
        return this.pendantText;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setPendantIcon(@Nullable String str) {
        this.pendantIcon = str;
    }

    public final void setPendantLinks(@Nullable String str) {
        this.pendantLinks = str;
    }

    public final void setPendantLogin(@Nullable Boolean bool) {
        this.pendantLogin = bool;
    }

    public final void setPendantStyle(@Nullable String str) {
        this.pendantStyle = str;
    }

    public final void setPendantText(@Nullable String str) {
        this.pendantText = str;
    }
}
