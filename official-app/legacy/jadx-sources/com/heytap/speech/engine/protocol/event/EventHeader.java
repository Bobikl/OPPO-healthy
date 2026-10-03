package com.heytap.speech.engine.protocol.event;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.oplus.aiunit.vision.usm;
import java.io.Serializable;
import java.util.Map;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R,\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001e\u0010\u0013\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR \u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR \u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"Lcom/heytap/speech/engine/protocol/event/EventHeader;", "Ljava/io/Serializable;", "()V", "echo", "", "", "", "getEcho", "()Ljava/util/Map;", "setEcho", "(Ljava/util/Map;)V", "id", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "name", "getName", "setName", usm.f17592j, "getNamespace", "setNamespace", "namespaceVersion", "getNamespaceVersion", "setNamespaceVersion", "route", "Lcom/heytap/speech/engine/protocol/event/Route;", "getRoute", "()Lcom/heytap/speech/engine/protocol/event/Route;", "setRoute", "(Lcom/heytap/speech/engine/protocol/event/Route;)V", "version", "getVersion", "setVersion", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class EventHeader implements Serializable {

    @JsonProperty("echo")
    @Nullable
    private Map<String, ? extends Object> echo;

    @JsonProperty("id")
    @NotNull
    private String id;

    @JsonProperty("name")
    @NotNull
    private String name;

    @JsonProperty(usm.f17592j)
    @NotNull
    private String namespace;

    @JsonProperty("namespaceVersion")
    @Nullable
    private String namespaceVersion;

    @JsonProperty("route")
    @Nullable
    private Route route;

    @JsonProperty("version")
    @Nullable
    private String version;

    public EventHeader() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        this.id = StringsKt__StringsJVMKt.replace$default(string, "-", "", false, 4, (Object) null);
        this.name = "";
        this.namespace = "";
        this.version = "2.0";
        this.namespaceVersion = "2.0.0";
    }

    @Nullable
    public final Map<String, Object> getEcho() {
        return this.echo;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNamespace() {
        return this.namespace;
    }

    @Nullable
    public final String getNamespaceVersion() {
        return this.namespaceVersion;
    }

    @Nullable
    public final Route getRoute() {
        return this.route;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public final void setEcho(@Nullable Map<String, ? extends Object> map) {
        this.echo = map;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setNamespace(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.namespace = str;
    }

    public final void setNamespaceVersion(@Nullable String str) {
        this.namespaceVersion = str;
    }

    public final void setRoute(@Nullable Route route) {
        this.route = route;
    }

    public final void setVersion(@Nullable String str) {
        this.version = str;
    }
}
