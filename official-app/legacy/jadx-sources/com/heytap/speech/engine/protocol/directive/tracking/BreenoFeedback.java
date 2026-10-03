package com.heytap.speech.engine.protocol.directive.tracking;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\"\u0010#R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/tracking/BreenoFeedback;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "Lcom/heytap/speech/engine/protocol/directive/tracking/LongPressInfo;", "longPressInfoList", "Ljava/util/List;", "getLongPressInfoList", "()Ljava/util/List;", "setLongPressInfoList", "(Ljava/util/List;)V", "newLongPressInfoList", "getNewLongPressInfoList", "setNewLongPressInfoList", "Lcom/heytap/speech/engine/protocol/directive/tracking/FooterInfo;", "footerInfo", "Lcom/heytap/speech/engine/protocol/directive/tracking/FooterInfo;", "getFooterInfo", "()Lcom/heytap/speech/engine/protocol/directive/tracking/FooterInfo;", "setFooterInfo", "(Lcom/heytap/speech/engine/protocol/directive/tracking/FooterInfo;)V", "Lcom/heytap/speech/engine/protocol/directive/tracking/DislikeInfo;", "dislikeInfo", "Lcom/heytap/speech/engine/protocol/directive/tracking/DislikeInfo;", "getDislikeInfo", "()Lcom/heytap/speech/engine/protocol/directive/tracking/DislikeInfo;", "setDislikeInfo", "(Lcom/heytap/speech/engine/protocol/directive/tracking/DislikeInfo;)V", "", "voteEchoString", "Ljava/lang/String;", "getVoteEchoString", "()Ljava/lang/String;", "setVoteEchoString", "(Ljava/lang/String;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class BreenoFeedback extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.4";

    @Nullable
    private DislikeInfo dislikeInfo;

    @Nullable
    private FooterInfo footerInfo;

    @Nullable
    private List<LongPressInfo> longPressInfoList;

    @Nullable
    private List<LongPressInfo> newLongPressInfoList;

    @Nullable
    private String voteEchoString;

    @Nullable
    public final DislikeInfo getDislikeInfo() {
        return this.dislikeInfo;
    }

    @Nullable
    public final FooterInfo getFooterInfo() {
        return this.footerInfo;
    }

    @Nullable
    public final List<LongPressInfo> getLongPressInfoList() {
        return this.longPressInfoList;
    }

    @Nullable
    public final List<LongPressInfo> getNewLongPressInfoList() {
        return this.newLongPressInfoList;
    }

    @Nullable
    public final String getVoteEchoString() {
        return this.voteEchoString;
    }

    public final void setDislikeInfo(@Nullable DislikeInfo dislikeInfo) {
        this.dislikeInfo = dislikeInfo;
    }

    public final void setFooterInfo(@Nullable FooterInfo footerInfo) {
        this.footerInfo = footerInfo;
    }

    public final void setLongPressInfoList(@Nullable List<LongPressInfo> list) {
        this.longPressInfoList = list;
    }

    public final void setNewLongPressInfoList(@Nullable List<LongPressInfo> list) {
        this.newLongPressInfoList = list;
    }

    public final void setVoteEchoString(@Nullable String str) {
        this.voteEchoString = str;
    }
}
