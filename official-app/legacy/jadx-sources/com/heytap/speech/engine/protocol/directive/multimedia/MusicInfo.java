package com.heytap.speech.engine.protocol.directive.multimedia;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/multimedia/MusicInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "albumName", "", "getAlbumName", "()Ljava/lang/String;", "setAlbumName", "(Ljava/lang/String;)V", "albumUrl", "getAlbumUrl", "setAlbumUrl", "mid", "getMid", "setMid", "singer", "getSinger", "setSinger", "songName", "getSongName", "setSongName", "vip", "", "getVip", "()Ljava/lang/Boolean;", "setVip", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MusicInfo extends DirectivePayload {

    @Nullable
    private String albumName;

    @Nullable
    private String albumUrl;

    @Nullable
    private String mid;

    @Nullable
    private String singer;

    @Nullable
    private String songName;

    @Nullable
    private Boolean vip;

    @Nullable
    public final String getAlbumName() {
        return this.albumName;
    }

    @Nullable
    public final String getAlbumUrl() {
        return this.albumUrl;
    }

    @Nullable
    public final String getMid() {
        return this.mid;
    }

    @Nullable
    public final String getSinger() {
        return this.singer;
    }

    @Nullable
    public final String getSongName() {
        return this.songName;
    }

    @Nullable
    public final Boolean getVip() {
        return this.vip;
    }

    public final void setAlbumName(@Nullable String str) {
        this.albumName = str;
    }

    public final void setAlbumUrl(@Nullable String str) {
        this.albumUrl = str;
    }

    public final void setMid(@Nullable String str) {
        this.mid = str;
    }

    public final void setSinger(@Nullable String str) {
        this.singer = str;
    }

    public final void setSongName(@Nullable String str) {
        this.songName = str;
    }

    public final void setVip(@Nullable Boolean bool) {
        this.vip = bool;
    }
}
