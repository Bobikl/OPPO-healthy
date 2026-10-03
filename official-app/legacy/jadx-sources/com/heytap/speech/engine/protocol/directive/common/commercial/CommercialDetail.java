package com.heytap.speech.engine.protocol.directive.common.commercial;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR&\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/common/commercial/CommercialDetail;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "appId", "", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "channel", "getChannel", "setChannel", "content", "getContent", "setContent", "downloadToken", "getDownloadToken", "setDownloadToken", "id", "getId", "setId", "posId", "getPosId", "setPosId", "tracks", "", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/Track;", "getTracks", "()Ljava/util/List;", "setTracks", "(Ljava/util/List;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CommercialDetail extends DirectivePayload {

    @JsonProperty("appId")
    @Nullable
    private String appId;

    @JsonProperty("channel")
    @Nullable
    private String channel;

    @JsonProperty("content")
    @Nullable
    private String content;

    @JsonProperty("downloadToken")
    @Nullable
    private String downloadToken;

    @JsonProperty("id")
    @Nullable
    private String id;

    @JsonProperty("posId")
    @Nullable
    private String posId;

    @JsonProperty("tracks")
    @Nullable
    private List<Track> tracks;

    @Nullable
    public final String getAppId() {
        return this.appId;
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getDownloadToken() {
        return this.downloadToken;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getPosId() {
        return this.posId;
    }

    @Nullable
    public final List<Track> getTracks() {
        return this.tracks;
    }

    public final void setAppId(@Nullable String str) {
        this.appId = str;
    }

    public final void setChannel(@Nullable String str) {
        this.channel = str;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setDownloadToken(@Nullable String str) {
        this.downloadToken = str;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setPosId(@Nullable String str) {
        this.posId = str;
    }

    public final void setTracks(@Nullable List<Track> list) {
        this.tracks = list;
    }
}
