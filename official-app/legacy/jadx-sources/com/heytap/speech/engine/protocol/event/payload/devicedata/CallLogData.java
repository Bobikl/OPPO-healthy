package com.heytap.speech.engine.protocol.event.payload.devicedata;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/devicedata/CallLogData;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "()V", "callLogList", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/CallLog;", "getCallLogList", "()Ljava/util/ArrayList;", "setCallLogList", "(Ljava/util/ArrayList;)V", "failMsg", "", "getFailMsg", "()Ljava/lang/String;", "setFailMsg", "(Ljava/lang/String;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CallLogData extends Payload {

    @Nullable
    private ArrayList<CallLog> callLogList;

    @Nullable
    private String failMsg;

    @Nullable
    public final ArrayList<CallLog> getCallLogList() {
        return this.callLogList;
    }

    @Nullable
    public final String getFailMsg() {
        return this.failMsg;
    }

    public final void setCallLogList(@Nullable ArrayList<CallLog> arrayList) {
        this.callLogList = arrayList;
    }

    public final void setFailMsg(@Nullable String str) {
        this.failMsg = str;
    }
}
