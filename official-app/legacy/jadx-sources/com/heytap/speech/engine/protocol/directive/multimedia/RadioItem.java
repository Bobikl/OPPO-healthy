package com.heytap.speech.engine.protocol.directive.multimedia;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010#\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\u001e\u0010&\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b'\u0010\u0015\"\u0004\b(\u0010\u0017R\u001c\u0010)\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\b¨\u0006,"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/multimedia/RadioItem;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "albumName", "", "getAlbumName", "()Ljava/lang/String;", "setAlbumName", "(Ljava/lang/String;)V", "artistName", "getArtistName", "setArtistName", "audioUrl", "getAudioUrl", "setAudioUrl", "coverUrl", "getCoverUrl", "setCoverUrl", "duration", "", "getDuration", "()Ljava/lang/Long;", "setDuration", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "fmId", "getFmId", "setFmId", "hotspot", "", "getHotspot", "()Ljava/lang/Boolean;", "setHotspot", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "platform", "getPlatform", "setPlatform", "playCount", "getPlayCount", "setPlayCount", "title", "getTitle", "setTitle", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RadioItem extends DirectivePayload {

    @Nullable
    private String albumName;

    @Nullable
    private String artistName;

    @Nullable
    private String audioUrl;

    @Nullable
    private String coverUrl;

    @Nullable
    private Long duration;

    @Nullable
    private String fmId;

    @Nullable
    private Boolean hotspot;

    @Nullable
    private String platform;

    @Nullable
    private Long playCount;

    @Nullable
    private String title;

    @Nullable
    public final String getAlbumName() {
        return this.albumName;
    }

    @Nullable
    public final String getArtistName() {
        return this.artistName;
    }

    @Nullable
    public final String getAudioUrl() {
        return this.audioUrl;
    }

    @Nullable
    public final String getCoverUrl() {
        return this.coverUrl;
    }

    @Nullable
    public final Long getDuration() {
        return this.duration;
    }

    @Nullable
    public final String getFmId() {
        return this.fmId;
    }

    @Nullable
    public final Boolean getHotspot() {
        return this.hotspot;
    }

    @Nullable
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    public final Long getPlayCount() {
        return this.playCount;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setAlbumName(@Nullable String str) {
        this.albumName = str;
    }

    public final void setArtistName(@Nullable String str) {
        this.artistName = str;
    }

    public final void setAudioUrl(@Nullable String str) {
        this.audioUrl = str;
    }

    public final void setCoverUrl(@Nullable String str) {
        this.coverUrl = str;
    }

    public final void setDuration(@Nullable Long l2) {
        this.duration = l2;
    }

    public final void setFmId(@Nullable String str) {
        this.fmId = str;
    }

    public final void setHotspot(@Nullable Boolean bool) {
        this.hotspot = bool;
    }

    public final void setPlatform(@Nullable String str) {
        this.platform = str;
    }

    public final void setPlayCount(@Nullable Long l2) {
        this.playCount = l2;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
