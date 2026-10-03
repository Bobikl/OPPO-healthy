package com.heytap.speech.engine.protocol.directive.multimedia;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.commercial.ActionInfo;
import com.oplus.smartenginehelper.ParserTag;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b!\u0010\"R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/multimedia/PlayNews;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "Lcom/heytap/speech/engine/protocol/directive/multimedia/AudioList;", "audioList", "Lcom/heytap/speech/engine/protocol/directive/multimedia/AudioList;", "getAudioList", "()Lcom/heytap/speech/engine/protocol/directive/multimedia/AudioList;", "setAudioList", "(Lcom/heytap/speech/engine/protocol/directive/multimedia/AudioList;)V", "", "sourceName", "Ljava/lang/String;", "getSourceName", "()Ljava/lang/String;", "setSourceName", "(Ljava/lang/String;)V", "sourceIcon", "getSourceIcon", "setSourceIcon", "reply", "getReply", "setReply", ParserTag.TYPE_BUTTON, "getButton", "setButton", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;", "actionInfos", "Ljava/util/ArrayList;", "getActionInfos", "()Ljava/util/ArrayList;", "setActionInfos", "(Ljava/util/ArrayList;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class PlayNews extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private ArrayList<ActionInfo> actionInfos;

    @Nullable
    private AudioList audioList;

    @Nullable
    private String button;

    @Nullable
    private String reply;

    @Nullable
    private String sourceIcon;

    @Nullable
    private String sourceName;

    @Nullable
    public final ArrayList<ActionInfo> getActionInfos() {
        return this.actionInfos;
    }

    @Nullable
    public final AudioList getAudioList() {
        return this.audioList;
    }

    @Nullable
    public final String getButton() {
        return this.button;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    @Nullable
    public final String getSourceIcon() {
        return this.sourceIcon;
    }

    @Nullable
    public final String getSourceName() {
        return this.sourceName;
    }

    public final void setActionInfos(@Nullable ArrayList<ActionInfo> arrayList) {
        this.actionInfos = arrayList;
    }

    public final void setAudioList(@Nullable AudioList audioList) {
        this.audioList = audioList;
    }

    public final void setButton(@Nullable String str) {
        this.button = str;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }

    public final void setSourceIcon(@Nullable String str) {
        this.sourceIcon = str;
    }

    public final void setSourceName(@Nullable String str) {
        this.sourceName = str;
    }
}
