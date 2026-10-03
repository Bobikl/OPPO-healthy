package com.heytap.speech.engine.protocol.directive.template;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.Action;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u001f\u0010 R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/template/Music;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "songName", "Ljava/lang/String;", "getSongName", "()Ljava/lang/String;", "setSongName", "(Ljava/lang/String;)V", "albumName", "getAlbumName", "setAlbumName", "albumUrl", "getAlbumUrl", "setAlbumUrl", "singer", "getSinger", "setSinger", "appName", "getAppName", "setAppName", "packageName", "getPackageName", "setPackageName", "Lcom/heytap/speech/engine/protocol/directive/common/Action;", "action", "Lcom/heytap/speech/engine/protocol/directive/common/Action;", "getAction", "()Lcom/heytap/speech/engine/protocol/directive/common/Action;", "setAction", "(Lcom/heytap/speech/engine/protocol/directive/common/Action;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class Music extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @JsonProperty("action")
    @Nullable
    private Action action;

    @JsonProperty("albumName")
    @Nullable
    private String albumName;

    @JsonProperty("albumUrl")
    @Nullable
    private String albumUrl;

    @JsonProperty("appName")
    @Nullable
    private String appName;

    @JsonProperty("packageName")
    @Nullable
    private String packageName;

    @JsonProperty("singer")
    @Nullable
    private String singer;

    @JsonProperty("songName")
    @Nullable
    private String songName;

    @Nullable
    public final Action getAction() {
        return this.action;
    }

    @Nullable
    public final String getAlbumName() {
        return this.albumName;
    }

    @Nullable
    public final String getAlbumUrl() {
        return this.albumUrl;
    }

    @Nullable
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    public final String getSinger() {
        return this.singer;
    }

    @Nullable
    public final String getSongName() {
        return this.songName;
    }

    public final void setAction(@Nullable Action action) {
        this.action = action;
    }

    public final void setAlbumName(@Nullable String str) {
        this.albumName = str;
    }

    public final void setAlbumUrl(@Nullable String str) {
        this.albumUrl = str;
    }

    public final void setAppName(@Nullable String str) {
        this.appName = str;
    }

    public final void setPackageName(@Nullable String str) {
        this.packageName = str;
    }

    public final void setSinger(@Nullable String str) {
        this.singer = str;
    }

    public final void setSongName(@Nullable String str) {
        this.songName = str;
    }
}
