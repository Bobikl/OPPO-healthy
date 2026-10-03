package com.heytap.speech.engine.protocol.event.payload.devicedata;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u001c\u0010\"\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000eR\u001e\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/devicedata/AiSearchData;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "()V", "cardContent", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/AiSearchCardContent;", "getCardContent", "()Lcom/heytap/speech/engine/protocol/event/payload/devicedata/AiSearchCardContent;", "setCardContent", "(Lcom/heytap/speech/engine/protocol/event/payload/devicedata/AiSearchCardContent;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "setErrorCode", "(Ljava/lang/String;)V", "extend", "Ljava/util/HashMap;", "", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "interfaceStatus", "getInterfaceStatus", "setInterfaceStatus", "recallRes", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/AiSearchRecallRes;", "getRecallRes", "()Lcom/heytap/speech/engine/protocol/event/payload/devicedata/AiSearchRecallRes;", "setRecallRes", "(Lcom/heytap/speech/engine/protocol/event/payload/devicedata/AiSearchRecallRes;)V", "relyTimestampMap", "getRelyTimestampMap", "setRelyTimestampMap", "timestamp", "getTimestamp", "setTimestamp", "type", "", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AiSearchData extends Payload {

    @Nullable
    private AiSearchCardContent cardContent;

    @Nullable
    private String errorCode;

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private String interfaceStatus;

    @Nullable
    private AiSearchRecallRes recallRes;

    @Nullable
    private HashMap<String, Object> relyTimestampMap;

    @Nullable
    private String timestamp;

    @Nullable
    private Integer type;

    @Nullable
    public final AiSearchCardContent getCardContent() {
        return this.cardContent;
    }

    @Nullable
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final String getInterfaceStatus() {
        return this.interfaceStatus;
    }

    @Nullable
    public final AiSearchRecallRes getRecallRes() {
        return this.recallRes;
    }

    @Nullable
    public final HashMap<String, Object> getRelyTimestampMap() {
        return this.relyTimestampMap;
    }

    @Nullable
    public final String getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public final void setCardContent(@Nullable AiSearchCardContent aiSearchCardContent) {
        this.cardContent = aiSearchCardContent;
    }

    public final void setErrorCode(@Nullable String str) {
        this.errorCode = str;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setInterfaceStatus(@Nullable String str) {
        this.interfaceStatus = str;
    }

    public final void setRecallRes(@Nullable AiSearchRecallRes aiSearchRecallRes) {
        this.recallRes = aiSearchRecallRes;
    }

    public final void setRelyTimestampMap(@Nullable HashMap<String, Object> map) {
        this.relyTimestampMap = map;
    }

    public final void setTimestamp(@Nullable String str) {
        this.timestamp = str;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }
}
