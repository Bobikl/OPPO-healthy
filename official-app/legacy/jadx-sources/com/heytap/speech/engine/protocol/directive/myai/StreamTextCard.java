package com.heytap.speech.engine.protocol.directive.myai;

import androidx.annotation.Keep;
import com.customer.feedback.sdk.model.RequestData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.ThinkingResult;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 f2\u00020\u0001:\u0001gB\u0007¢\u0006\u0004\bd\u0010eR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR$\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R$\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010/\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR$\u00103\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u00109\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\u0014\u001a\u0004\b:\u0010\u0016\"\u0004\b;\u0010\u0018R$\u0010<\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010\u0004\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR$\u0010?\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010\u0004\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR$\u0010C\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR0\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020J\u0018\u00010I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PRL\u0010T\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0Q\u0018\u00010Qj\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020R0Qj\b\u0012\u0004\u0012\u00020R`S\u0018\u0001`S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010Z\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010\u0004\u001a\u0004\b[\u0010\u0006\"\u0004\b\\\u0010\bR$\u0010]\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010\u0004\u001a\u0004\b^\u0010\u0006\"\u0004\b_\u0010\bR6\u0010a\u001a\u0016\u0012\u0004\u0012\u00020`\u0018\u00010Qj\n\u0012\u0004\u0012\u00020`\u0018\u0001`S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010U\u001a\u0004\bb\u0010W\"\u0004\bc\u0010Y¨\u0006h"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/myai/StreamTextCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "content", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "roomId", "getRoomId", "setRoomId", "", "isFinal", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setFinal", "(Ljava/lang/Boolean;)V", "", "type", "Ljava/lang/Integer;", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", SearchIntents.EXTRA_QUERY, "getQuery", "setQuery", "isHtml", "setHtml", "needNewRoom", "getNeedNewRoom", "setNeedNewRoom", "Lcom/heytap/speech/engine/protocol/directive/myai/FeedBackInfo;", RequestData.TYPE_FEEDBACK, "Lcom/heytap/speech/engine/protocol/directive/myai/FeedBackInfo;", "getFeedback", "()Lcom/heytap/speech/engine/protocol/directive/myai/FeedBackInfo;", "setFeedback", "(Lcom/heytap/speech/engine/protocol/directive/myai/FeedBackInfo;)V", "Lcom/heytap/speech/engine/protocol/directive/myai/LinkInfo;", "linkInfo", "Lcom/heytap/speech/engine/protocol/directive/myai/LinkInfo;", "getLinkInfo", "()Lcom/heytap/speech/engine/protocol/directive/myai/LinkInfo;", "setLinkInfo", "(Lcom/heytap/speech/engine/protocol/directive/myai/LinkInfo;)V", "statement", "getStatement", "setStatement", "Lcom/heytap/speech/engine/protocol/directive/myai/Header;", SpeechConstant.KEY_TTS_REQUEST_HEADER, "Lcom/heytap/speech/engine/protocol/directive/myai/Header;", "getHeader", "()Lcom/heytap/speech/engine/protocol/directive/myai/Header;", "setHeader", "(Lcom/heytap/speech/engine/protocol/directive/myai/Header;)V", "charPerSec", "getCharPerSec", "setCharPerSec", SpeechConstant.KEY_TTS_TYPE, "getTtsType", "setTtsType", "ttsText", "getTtsText", "setTtsText", "Lcom/heytap/speech/engine/protocol/directive/common/ThinkingResult;", "thinkingResult", "Lcom/heytap/speech/engine/protocol/directive/common/ThinkingResult;", "getThinkingResult", "()Lcom/heytap/speech/engine/protocol/directive/common/ThinkingResult;", "setThinkingResult", "(Lcom/heytap/speech/engine/protocol/directive/common/ThinkingResult;)V", "Ljava/util/HashMap;", "", "extraInfo", "Ljava/util/HashMap;", "getExtraInfo", "()Ljava/util/HashMap;", "setExtraInfo", "(Ljava/util/HashMap;)V", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/myai/ImageInfo;", "Lkotlin/collections/ArrayList;", "imageInfos", "Ljava/util/ArrayList;", "getImageInfos", "()Ljava/util/ArrayList;", "setImageInfos", "(Ljava/util/ArrayList;)V", "reasoningContent", "getReasoningContent", "setReasoningContent", "reasoningState", "getReasoningState", "setReasoningState", "Lcom/heytap/speech/engine/protocol/directive/myai/CardInfo;", "cardInfos", "getCardInfos", "setCardInfos", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class StreamTextCard extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.8";

    @Nullable
    private ArrayList<CardInfo> cardInfos;

    @Nullable
    private Integer charPerSec;

    @Nullable
    private String content;

    @Nullable
    private HashMap<String, Object> extraInfo;

    @Nullable
    private FeedBackInfo feedback;

    @Nullable
    private Header header;

    @Nullable
    private ArrayList<ArrayList<ImageInfo>> imageInfos;

    @JsonProperty("isFinal")
    @Nullable
    private Boolean isFinal;

    @JsonProperty("isHtml")
    @Nullable
    private Boolean isHtml;

    @Nullable
    private LinkInfo linkInfo;

    @Nullable
    private Boolean needNewRoom;

    @Nullable
    private String query;

    @Nullable
    private String reasoningContent;

    @Nullable
    private String reasoningState;

    @Nullable
    private String roomId;

    @Nullable
    private String statement;

    @Nullable
    private ThinkingResult thinkingResult;

    @Nullable
    private String ttsText;

    @Nullable
    private String ttsType;

    @Nullable
    private Integer type;

    @Nullable
    public final ArrayList<CardInfo> getCardInfos() {
        return this.cardInfos;
    }

    @Nullable
    public final Integer getCharPerSec() {
        return this.charPerSec;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final HashMap<String, Object> getExtraInfo() {
        return this.extraInfo;
    }

    @Nullable
    public final FeedBackInfo getFeedback() {
        return this.feedback;
    }

    @Nullable
    public final Header getHeader() {
        return this.header;
    }

    @Nullable
    public final ArrayList<ArrayList<ImageInfo>> getImageInfos() {
        return this.imageInfos;
    }

    @Nullable
    public final LinkInfo getLinkInfo() {
        return this.linkInfo;
    }

    @Nullable
    public final Boolean getNeedNewRoom() {
        return this.needNewRoom;
    }

    @Nullable
    public final String getQuery() {
        return this.query;
    }

    @Nullable
    public final String getReasoningContent() {
        return this.reasoningContent;
    }

    @Nullable
    public final String getReasoningState() {
        return this.reasoningState;
    }

    @Nullable
    public final String getRoomId() {
        return this.roomId;
    }

    @Nullable
    public final String getStatement() {
        return this.statement;
    }

    @Nullable
    public final ThinkingResult getThinkingResult() {
        return this.thinkingResult;
    }

    @Nullable
    public final String getTtsText() {
        return this.ttsText;
    }

    @Nullable
    public final String getTtsType() {
        return this.ttsType;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: isFinal, reason: from getter */
    public final Boolean getIsFinal() {
        return this.isFinal;
    }

    @Nullable
    /* JADX INFO: renamed from: isHtml, reason: from getter */
    public final Boolean getIsHtml() {
        return this.isHtml;
    }

    public final void setCardInfos(@Nullable ArrayList<CardInfo> arrayList) {
        this.cardInfos = arrayList;
    }

    public final void setCharPerSec(@Nullable Integer num) {
        this.charPerSec = num;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setExtraInfo(@Nullable HashMap<String, Object> map) {
        this.extraInfo = map;
    }

    public final void setFeedback(@Nullable FeedBackInfo feedBackInfo) {
        this.feedback = feedBackInfo;
    }

    public final void setFinal(@Nullable Boolean bool) {
        this.isFinal = bool;
    }

    public final void setHeader(@Nullable Header header) {
        this.header = header;
    }

    public final void setHtml(@Nullable Boolean bool) {
        this.isHtml = bool;
    }

    public final void setImageInfos(@Nullable ArrayList<ArrayList<ImageInfo>> arrayList) {
        this.imageInfos = arrayList;
    }

    public final void setLinkInfo(@Nullable LinkInfo linkInfo) {
        this.linkInfo = linkInfo;
    }

    public final void setNeedNewRoom(@Nullable Boolean bool) {
        this.needNewRoom = bool;
    }

    public final void setQuery(@Nullable String str) {
        this.query = str;
    }

    public final void setReasoningContent(@Nullable String str) {
        this.reasoningContent = str;
    }

    public final void setReasoningState(@Nullable String str) {
        this.reasoningState = str;
    }

    public final void setRoomId(@Nullable String str) {
        this.roomId = str;
    }

    public final void setStatement(@Nullable String str) {
        this.statement = str;
    }

    public final void setThinkingResult(@Nullable ThinkingResult thinkingResult) {
        this.thinkingResult = thinkingResult;
    }

    public final void setTtsText(@Nullable String str) {
        this.ttsText = str;
    }

    public final void setTtsType(@Nullable String str) {
        this.ttsType = str;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }
}
