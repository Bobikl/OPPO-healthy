package com.heytap.speech.engine.protocol.directive.multimedia;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b'\u0010(R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/multimedia/SearchAndPlayMusic;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", TraceConstants.KEY_PKG_NAME, "getPkgName", "setPkgName", "appName", "getAppName", "setAppName", "speak", "getSpeak", "setSpeak", "Lcom/heytap/speech/engine/protocol/directive/multimedia/MusicData;", "musicData", "Lcom/heytap/speech/engine/protocol/directive/multimedia/MusicData;", "getMusicData", "()Lcom/heytap/speech/engine/protocol/directive/multimedia/MusicData;", "setMusicData", "(Lcom/heytap/speech/engine/protocol/directive/multimedia/MusicData;)V", "", "mode", "Ljava/lang/Integer;", "getMode", "()Ljava/lang/Integer;", "setMode", "(Ljava/lang/Integer;)V", "", ParserTag.AUTO_PLAY, "Ljava/lang/Boolean;", "getAutoPlay", "()Ljava/lang/Boolean;", "setAutoPlay", "(Ljava/lang/Boolean;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class SearchAndPlayMusic extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.2";

    @Nullable
    private String appName;

    @Nullable
    private Boolean autoPlay;

    @Nullable
    private Integer mode;

    @Nullable
    private MusicData musicData;

    @Nullable
    private String pkgName;

    @Nullable
    private String speak;

    @Nullable
    private String type;

    @Nullable
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    public final Boolean getAutoPlay() {
        return this.autoPlay;
    }

    @Nullable
    public final Integer getMode() {
        return this.mode;
    }

    @Nullable
    public final MusicData getMusicData() {
        return this.musicData;
    }

    @Nullable
    public final String getPkgName() {
        return this.pkgName;
    }

    @Nullable
    public final String getSpeak() {
        return this.speak;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setAppName(@Nullable String str) {
        this.appName = str;
    }

    public final void setAutoPlay(@Nullable Boolean bool) {
        this.autoPlay = bool;
    }

    public final void setMode(@Nullable Integer num) {
        this.mode = num;
    }

    public final void setMusicData(@Nullable MusicData musicData) {
        this.musicData = musicData;
    }

    public final void setPkgName(@Nullable String str) {
        this.pkgName = str;
    }

    public final void setSpeak(@Nullable String str) {
        this.speak = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
