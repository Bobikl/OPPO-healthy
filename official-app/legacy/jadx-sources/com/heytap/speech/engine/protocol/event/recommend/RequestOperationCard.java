package com.heytap.speech.engine.protocol.event.recommend;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b \b\u0007\u0018\u0000 *2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b(\u0010)R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR$\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R$\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R$\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R$\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R$\u0010\"\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u000e\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R$\u0010%\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u000e\u001a\u0004\b&\u0010\u0010\"\u0004\b'\u0010\u0012¨\u0006,"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/recommend/RequestOperationCard;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "", "reqNum", "Ljava/lang/Integer;", "getReqNum", "()Ljava/lang/Integer;", "setReqNum", "(Ljava/lang/Integer;)V", "operateId", "getOperateId", "setOperateId", "", "topQuery", "Ljava/lang/String;", "getTopQuery", "()Ljava/lang/String;", "setTopQuery", "(Ljava/lang/String;)V", "refreshReq", "getRefreshReq", "setRefreshReq", "prevQueries", "getPrevQueries", "setPrevQueries", "prevUniqueId", "getPrevUniqueId", "setPrevUniqueId", "extendMap", "getExtendMap", "setExtendMap", "roomId", "getRoomId", "setRoomId", "agentName", "getAgentName", "setAgentName", SpeechConstant.KEY_START_SOURCE, "getStartSource", "setStartSource", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class RequestOperationCard extends Payload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String agentName;

    @Nullable
    private String extendMap;

    @Nullable
    private Integer operateId;

    @Nullable
    private String prevQueries;

    @Nullable
    private String prevUniqueId;

    @Nullable
    private Integer refreshReq;

    @Nullable
    private Integer reqNum;

    @Nullable
    private String roomId;

    @Nullable
    private String startSource;

    @Nullable
    private String topQuery;

    @Nullable
    public final String getAgentName() {
        return this.agentName;
    }

    @Nullable
    public final String getExtendMap() {
        return this.extendMap;
    }

    @Nullable
    public final Integer getOperateId() {
        return this.operateId;
    }

    @Nullable
    public final String getPrevQueries() {
        return this.prevQueries;
    }

    @Nullable
    public final String getPrevUniqueId() {
        return this.prevUniqueId;
    }

    @Nullable
    public final Integer getRefreshReq() {
        return this.refreshReq;
    }

    @Nullable
    public final Integer getReqNum() {
        return this.reqNum;
    }

    @Nullable
    public final String getRoomId() {
        return this.roomId;
    }

    @Nullable
    public final String getStartSource() {
        return this.startSource;
    }

    @Nullable
    public final String getTopQuery() {
        return this.topQuery;
    }

    public final void setAgentName(@Nullable String str) {
        this.agentName = str;
    }

    public final void setExtendMap(@Nullable String str) {
        this.extendMap = str;
    }

    public final void setOperateId(@Nullable Integer num) {
        this.operateId = num;
    }

    public final void setPrevQueries(@Nullable String str) {
        this.prevQueries = str;
    }

    public final void setPrevUniqueId(@Nullable String str) {
        this.prevUniqueId = str;
    }

    public final void setRefreshReq(@Nullable Integer num) {
        this.refreshReq = num;
    }

    public final void setReqNum(@Nullable Integer num) {
        this.reqNum = num;
    }

    public final void setRoomId(@Nullable String str) {
        this.roomId = str;
    }

    public final void setStartSource(@Nullable String str) {
        this.startSource = str;
    }

    public final void setTopQuery(@Nullable String str) {
        this.topQuery = str;
    }
}
