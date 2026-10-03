package com.heytap.speech.engine.protocol.directive.template;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.Action;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR \u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR \u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR \u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR \u0010\u001b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR \u0010\u001e\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000e¨\u0006!"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/template/VideoItem;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "action", "Lcom/heytap/speech/engine/protocol/directive/common/Action;", "getAction", "()Lcom/heytap/speech/engine/protocol/directive/common/Action;", "setAction", "(Lcom/heytap/speech/engine/protocol/directive/common/Action;)V", "appDownloadDeepLink", "", "getAppDownloadDeepLink", "()Ljava/lang/String;", "setAppDownloadDeepLink", "(Ljava/lang/String;)V", "moviesCoverUrl", "getMoviesCoverUrl", "setMoviesCoverUrl", "pkg", "getPkg", "setPkg", "resourceType", "getResourceType", "setResourceType", "score", "getScore", "setScore", "title", "getTitle", "setTitle", "type", "getType", "setType", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class VideoItem extends DirectivePayload {

    @JsonProperty("action")
    @Nullable
    private Action action;

    @JsonProperty("appDownloadDeepLink")
    @Nullable
    private String appDownloadDeepLink;

    @JsonProperty("moviesCoverUrl")
    @Nullable
    private String moviesCoverUrl;

    @JsonProperty("pkg")
    @Nullable
    private String pkg;

    @JsonProperty("resourceType")
    @Nullable
    private String resourceType;

    @JsonProperty("score")
    @Nullable
    private String score;

    @JsonProperty("title")
    @Nullable
    private String title;

    @JsonProperty("type")
    @Nullable
    private String type;

    @Nullable
    public final Action getAction() {
        return this.action;
    }

    @Nullable
    public final String getAppDownloadDeepLink() {
        return this.appDownloadDeepLink;
    }

    @Nullable
    public final String getMoviesCoverUrl() {
        return this.moviesCoverUrl;
    }

    @Nullable
    public final String getPkg() {
        return this.pkg;
    }

    @Nullable
    public final String getResourceType() {
        return this.resourceType;
    }

    @Nullable
    public final String getScore() {
        return this.score;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setAction(@Nullable Action action) {
        this.action = action;
    }

    public final void setAppDownloadDeepLink(@Nullable String str) {
        this.appDownloadDeepLink = str;
    }

    public final void setMoviesCoverUrl(@Nullable String str) {
        this.moviesCoverUrl = str;
    }

    public final void setPkg(@Nullable String str) {
        this.pkg = str;
    }

    public final void setResourceType(@Nullable String str) {
        this.resourceType = str;
    }

    public final void setScore(@Nullable String str) {
        this.score = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
