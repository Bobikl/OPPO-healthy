package com.heytap.speech.engine.protocol.directive.cuiedu;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/cuiedu/Room;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "agentName", "", "getAgentName", "()Ljava/lang/String;", "setAgentName", "(Ljava/lang/String;)V", "bbox", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/cuiedu/Location;", "getBbox", "()Ljava/util/ArrayList;", "setBbox", "(Ljava/util/ArrayList;)V", "extend", "Ljava/util/HashMap;", "", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "index", "", "getIndex", "()Ljava/lang/Integer;", "setIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "roomId", "getRoomId", "setRoomId", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Room extends DirectivePayload {

    @Nullable
    private String agentName;

    @Nullable
    private ArrayList<Location> bbox;

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private Integer index;

    @Nullable
    private String roomId;

    @Nullable
    public final String getAgentName() {
        return this.agentName;
    }

    @Nullable
    public final ArrayList<Location> getBbox() {
        return this.bbox;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final Integer getIndex() {
        return this.index;
    }

    @Nullable
    public final String getRoomId() {
        return this.roomId;
    }

    public final void setAgentName(@Nullable String str) {
        this.agentName = str;
    }

    public final void setBbox(@Nullable ArrayList<Location> arrayList) {
        this.bbox = arrayList;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setIndex(@Nullable Integer num) {
        this.index = num;
    }

    public final void setRoomId(@Nullable String str) {
        this.roomId = str;
    }
}
