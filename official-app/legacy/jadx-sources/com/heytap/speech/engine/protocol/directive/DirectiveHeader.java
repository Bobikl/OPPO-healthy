package com.heytap.speech.engine.protocol.directive;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.oplus.aiunit.vision.usm;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001e\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001e\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001e\u0010\u0019\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001e\u0010\u001c\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/DirectiveHeader;", "Ljava/io/Serializable;", "()V", "dependencies", "", "Lcom/heytap/speech/engine/protocol/directive/Dependency;", "getDependencies", "()Ljava/util/List;", "setDependencies", "(Ljava/util/List;)V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "name", "getName", "setName", usm.f17592j, "getNamespace", "setNamespace", "namespaceVersion", "getNamespaceVersion", "setNamespaceVersion", "type", "getType", "setType", "version", "getVersion", "setVersion", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DirectiveHeader implements Serializable {

    @JsonProperty("dependencies")
    @NotNull
    private List<Dependency> dependencies = CollectionsKt__CollectionsKt.emptyList();

    @JsonProperty("id")
    @NotNull
    private String id = "";

    @JsonProperty("name")
    @NotNull
    private String name = "";

    @JsonProperty(usm.f17592j)
    @NotNull
    private String namespace = "";

    @JsonProperty("version")
    @NotNull
    private String version = "";

    @JsonProperty("namespaceVersion")
    @NotNull
    private String namespaceVersion = "";

    @JsonProperty("type")
    @NotNull
    private String type = "";

    @NotNull
    public final List<Dependency> getDependencies() {
        return this.dependencies;
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

    @NotNull
    public final String getNamespaceVersion() {
        return this.namespaceVersion;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public final void setDependencies(@NotNull List<Dependency> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dependencies = list;
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

    public final void setNamespaceVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.namespaceVersion = str;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final void setVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.version = str;
    }
}
