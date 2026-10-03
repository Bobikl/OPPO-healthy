package com.heytap.speech.engine.protocol.event.payload.devicedata;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/devicedata/AlarmData;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "()V", "alarmList", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/Alarm;", "getAlarmList", "()Ljava/util/ArrayList;", "setAlarmList", "(Ljava/util/ArrayList;)V", "maxAlarmCount", "", "getMaxAlarmCount", "()Ljava/lang/Integer;", "setMaxAlarmCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "userAlarmCount", "getUserAlarmCount", "setUserAlarmCount", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AlarmData extends Payload {

    @Nullable
    private ArrayList<Alarm> alarmList;

    @Nullable
    private Integer maxAlarmCount;

    @Nullable
    private Integer userAlarmCount;

    @Nullable
    public final ArrayList<Alarm> getAlarmList() {
        return this.alarmList;
    }

    @Nullable
    public final Integer getMaxAlarmCount() {
        return this.maxAlarmCount;
    }

    @Nullable
    public final Integer getUserAlarmCount() {
        return this.userAlarmCount;
    }

    public final void setAlarmList(@Nullable ArrayList<Alarm> arrayList) {
        this.alarmList = arrayList;
    }

    public final void setMaxAlarmCount(@Nullable Integer num) {
        this.maxAlarmCount = num;
    }

    public final void setUserAlarmCount(@Nullable Integer num) {
        this.userAlarmCount = num;
    }
}
