package com.oplus.seedling.sdk.seedling;

import androidx.annotation.Keep;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\bHÆ\u0003JK\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/oplus/seedling/sdk/seedling/EngineTreeNodeData;", "", "type", "", "level", "props", "", "children", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "getChildren", "()Ljava/util/List;", "getLevel", "()Ljava/lang/String;", "getProps", "()Ljava/util/Map;", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class EngineTreeNodeData {

    @NotNull
    private final List<EngineTreeNodeData> children;

    @Nullable
    private final String level;

    @NotNull
    private final Map<String, String> props;

    @Nullable
    private final String type;

    public EngineTreeNodeData(@Nullable String str, @Nullable String str2, @NotNull Map<String, String> props, @NotNull List<EngineTreeNodeData> children) {
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(children, "children");
        this.type = str;
        this.level = str2;
        this.props = props;
        this.children = children;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EngineTreeNodeData copy$default(EngineTreeNodeData engineTreeNodeData, String str, String str2, Map map, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = engineTreeNodeData.type;
        }
        if ((i & 2) != 0) {
            str2 = engineTreeNodeData.level;
        }
        if ((i & 4) != 0) {
            map = engineTreeNodeData.props;
        }
        if ((i & 8) != 0) {
            list = engineTreeNodeData.children;
        }
        return engineTreeNodeData.copy(str, str2, map, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLevel() {
        return this.level;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.props;
    }

    @NotNull
    public final List<EngineTreeNodeData> component4() {
        return this.children;
    }

    @NotNull
    public final EngineTreeNodeData copy(@Nullable String type, @Nullable String level, @NotNull Map<String, String> props, @NotNull List<EngineTreeNodeData> children) {
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(children, "children");
        return new EngineTreeNodeData(type, level, props, children);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EngineTreeNodeData)) {
            return false;
        }
        EngineTreeNodeData engineTreeNodeData = (EngineTreeNodeData) other;
        return Intrinsics.areEqual(this.type, engineTreeNodeData.type) && Intrinsics.areEqual(this.level, engineTreeNodeData.level) && Intrinsics.areEqual(this.props, engineTreeNodeData.props) && Intrinsics.areEqual(this.children, engineTreeNodeData.children);
    }

    @NotNull
    public final List<EngineTreeNodeData> getChildren() {
        return this.children;
    }

    @Nullable
    public final String getLevel() {
        return this.level;
    }

    @NotNull
    public final Map<String, String> getProps() {
        return this.props;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.level;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.props.hashCode()) * 31) + this.children.hashCode();
    }

    @NotNull
    public String toString() {
        return "EngineTreeNodeData(type=" + this.type + ", level=" + this.level + ", props=" + this.props + ", children=" + this.children + ")";
    }
}
