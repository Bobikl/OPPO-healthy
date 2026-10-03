package com.heytap.speech.engine.protocol.directive.template;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/template/Index;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "degree", "getDegree", "setDegree", "detail", "getDetail", "setDetail", "brief", "getBrief", "setBrief", "icon", "getIcon", "setIcon", "", "darkIcon", "Ljava/lang/Boolean;", "getDarkIcon", "()Ljava/lang/Boolean;", "setDarkIcon", "(Ljava/lang/Boolean;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class Index extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @JsonProperty("brief")
    @Nullable
    private String brief;

    @JsonProperty("darkIcon")
    @Nullable
    private Boolean darkIcon;

    @JsonProperty("degree")
    @Nullable
    private String degree;

    @JsonProperty("detail")
    @Nullable
    private String detail;

    @JsonProperty("icon")
    @Nullable
    private String icon;

    @JsonProperty("name")
    @Nullable
    private String name;

    @Nullable
    public final String getBrief() {
        return this.brief;
    }

    @Nullable
    public final Boolean getDarkIcon() {
        return this.darkIcon;
    }

    @Nullable
    public final String getDegree() {
        return this.degree;
    }

    @Nullable
    public final String getDetail() {
        return this.detail;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final void setBrief(@Nullable String str) {
        this.brief = str;
    }

    public final void setDarkIcon(@Nullable Boolean bool) {
        this.darkIcon = bool;
    }

    public final void setDegree(@Nullable String str) {
        this.degree = str;
    }

    public final void setDetail(@Nullable String str) {
        this.detail = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }
}
