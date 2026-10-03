package com.heytap.health.cardiovascular.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/cardiovascular/bean/QueryAiAnalysisCrossRsp;", "", "text", "", "sceneInfo", "Lcom/heytap/health/cardiovascular/bean/SceneInfo;", "tagInfo", "Lcom/heytap/health/cardiovascular/bean/TagInfo;", "(Ljava/lang/String;Lcom/heytap/health/cardiovascular/bean/SceneInfo;Lcom/heytap/health/cardiovascular/bean/TagInfo;)V", "getSceneInfo", "()Lcom/heytap/health/cardiovascular/bean/SceneInfo;", "getTagInfo", "()Lcom/heytap/health/cardiovascular/bean/TagInfo;", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class QueryAiAnalysisCrossRsp {
    public static final int $stable = 8;

    @Nullable
    private final SceneInfo sceneInfo;

    @Nullable
    private final TagInfo tagInfo;

    @NotNull
    private final String text;

    public QueryAiAnalysisCrossRsp() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ QueryAiAnalysisCrossRsp copy$default(QueryAiAnalysisCrossRsp queryAiAnalysisCrossRsp, String str, SceneInfo sceneInfo, TagInfo tagInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = queryAiAnalysisCrossRsp.text;
        }
        if ((i & 2) != 0) {
            sceneInfo = queryAiAnalysisCrossRsp.sceneInfo;
        }
        if ((i & 4) != 0) {
            tagInfo = queryAiAnalysisCrossRsp.tagInfo;
        }
        return queryAiAnalysisCrossRsp.copy(str, sceneInfo, tagInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SceneInfo getSceneInfo() {
        return this.sceneInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TagInfo getTagInfo() {
        return this.tagInfo;
    }

    @NotNull
    public final QueryAiAnalysisCrossRsp copy(@NotNull String text, @Nullable SceneInfo sceneInfo, @Nullable TagInfo tagInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new QueryAiAnalysisCrossRsp(text, sceneInfo, tagInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryAiAnalysisCrossRsp)) {
            return false;
        }
        QueryAiAnalysisCrossRsp queryAiAnalysisCrossRsp = (QueryAiAnalysisCrossRsp) other;
        return Intrinsics.areEqual(this.text, queryAiAnalysisCrossRsp.text) && Intrinsics.areEqual(this.sceneInfo, queryAiAnalysisCrossRsp.sceneInfo) && Intrinsics.areEqual(this.tagInfo, queryAiAnalysisCrossRsp.tagInfo);
    }

    @Nullable
    public final SceneInfo getSceneInfo() {
        return this.sceneInfo;
    }

    @Nullable
    public final TagInfo getTagInfo() {
        return this.tagInfo;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        SceneInfo sceneInfo = this.sceneInfo;
        int iHashCode2 = (iHashCode + (sceneInfo == null ? 0 : sceneInfo.hashCode())) * 31;
        TagInfo tagInfo = this.tagInfo;
        return iHashCode2 + (tagInfo != null ? tagInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "QueryAiAnalysisCrossRsp(text=" + this.text + ", sceneInfo=" + this.sceneInfo + ", tagInfo=" + this.tagInfo + ")";
    }

    public QueryAiAnalysisCrossRsp(@NotNull String text, @Nullable SceneInfo sceneInfo, @Nullable TagInfo tagInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.sceneInfo = sceneInfo;
        this.tagInfo = tagInfo;
    }

    public /* synthetic */ QueryAiAnalysisCrossRsp(String str, SceneInfo sceneInfo, TagInfo tagInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : sceneInfo, (i & 4) != 0 ? null : tagInfo);
    }
}
