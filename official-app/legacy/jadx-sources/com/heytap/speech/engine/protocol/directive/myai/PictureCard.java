package com.heytap.speech.engine.protocol.directive.myai;

import androidx.annotation.Keep;
import com.customer.feedback.sdk.model.RequestData;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u001d\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001DB\u0007¢\u0006\u0004\bA\u0010BR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bRB\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010%\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010/\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR$\u00102\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\bR$\u00105\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR$\u00108\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\bR$\u0010;\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010*\u001a\u0004\b<\u0010,\"\u0004\b=\u0010.R$\u0010>\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010\u0004\u001a\u0004\b?\u0010\u0006\"\u0004\b@\u0010\b¨\u0006E"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/myai/PictureCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "picUrl", "Ljava/lang/String;", "getPicUrl", "()Ljava/lang/String;", "setPicUrl", "(Ljava/lang/String;)V", "roomId", "getRoomId", "setRoomId", "Lcom/heytap/speech/engine/protocol/directive/myai/FeedBackInfo;", RequestData.TYPE_FEEDBACK, "Lcom/heytap/speech/engine/protocol/directive/myai/FeedBackInfo;", "getFeedback", "()Lcom/heytap/speech/engine/protocol/directive/myai/FeedBackInfo;", "setFeedback", "(Lcom/heytap/speech/engine/protocol/directive/myai/FeedBackInfo;)V", "statement", "getStatement", "setStatement", "footer", "getFooter", "setFooter", "callTtsContent", "getCallTtsContent", "setCallTtsContent", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "extend", "Ljava/util/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "guideQuery", "getGuideQuery", "setGuideQuery", "", "stateCode", "Ljava/lang/Integer;", "getStateCode", "()Ljava/lang/Integer;", "setStateCode", "(Ljava/lang/Integer;)V", "stateMsg", "getStateMsg", "setStateMsg", "stateTips", "getStateTips", "setStateTips", "iconUrl", "getIconUrl", "setIconUrl", "iconText", "getIconText", "setIconText", "loadType", "getLoadType", "setLoadType", "businessType", "getBusinessType", "setBusinessType", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class PictureCard extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.2";

    @Nullable
    private String businessType;

    @Nullable
    private String callTtsContent;

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private FeedBackInfo feedback;

    @Nullable
    private String footer;

    @Nullable
    private String guideQuery;

    @Nullable
    private String iconText;

    @Nullable
    private String iconUrl;

    @Nullable
    private Integer loadType;

    @Nullable
    private String picUrl;

    @Nullable
    private String roomId;

    @Nullable
    private Integer stateCode;

    @Nullable
    private String stateMsg;

    @Nullable
    private String stateTips;

    @Nullable
    private String statement;

    @Nullable
    public final String getBusinessType() {
        return this.businessType;
    }

    @Nullable
    public final String getCallTtsContent() {
        return this.callTtsContent;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final FeedBackInfo getFeedback() {
        return this.feedback;
    }

    @Nullable
    public final String getFooter() {
        return this.footer;
    }

    @Nullable
    public final String getGuideQuery() {
        return this.guideQuery;
    }

    @Nullable
    public final String getIconText() {
        return this.iconText;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final Integer getLoadType() {
        return this.loadType;
    }

    @Nullable
    public final String getPicUrl() {
        return this.picUrl;
    }

    @Nullable
    public final String getRoomId() {
        return this.roomId;
    }

    @Nullable
    public final Integer getStateCode() {
        return this.stateCode;
    }

    @Nullable
    public final String getStateMsg() {
        return this.stateMsg;
    }

    @Nullable
    public final String getStateTips() {
        return this.stateTips;
    }

    @Nullable
    public final String getStatement() {
        return this.statement;
    }

    public final void setBusinessType(@Nullable String str) {
        this.businessType = str;
    }

    public final void setCallTtsContent(@Nullable String str) {
        this.callTtsContent = str;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setFeedback(@Nullable FeedBackInfo feedBackInfo) {
        this.feedback = feedBackInfo;
    }

    public final void setFooter(@Nullable String str) {
        this.footer = str;
    }

    public final void setGuideQuery(@Nullable String str) {
        this.guideQuery = str;
    }

    public final void setIconText(@Nullable String str) {
        this.iconText = str;
    }

    public final void setIconUrl(@Nullable String str) {
        this.iconUrl = str;
    }

    public final void setLoadType(@Nullable Integer num) {
        this.loadType = num;
    }

    public final void setPicUrl(@Nullable String str) {
        this.picUrl = str;
    }

    public final void setRoomId(@Nullable String str) {
        this.roomId = str;
    }

    public final void setStateCode(@Nullable Integer num) {
        this.stateCode = num;
    }

    public final void setStateMsg(@Nullable String str) {
        this.stateMsg = str;
    }

    public final void setStateTips(@Nullable String str) {
        this.stateTips = str;
    }

    public final void setStatement(@Nullable String str) {
        this.statement = str;
    }
}
