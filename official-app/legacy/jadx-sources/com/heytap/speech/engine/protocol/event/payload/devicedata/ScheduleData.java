package com.heytap.speech.engine.protocol.event.payload.devicedata;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.exclusiveai.Schedule;
import com.heytap.speech.engine.protocol.event.Payload;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/devicedata/ScheduleData;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "()V", "count", "", "getCount", "()Ljava/lang/Integer;", "setCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "scheduleList", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/exclusiveai/Schedule;", "getScheduleList", "()Ljava/util/ArrayList;", "setScheduleList", "(Ljava/util/ArrayList;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ScheduleData extends Payload {

    @Nullable
    private Integer count;

    @Nullable
    private ArrayList<Schedule> scheduleList;

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final ArrayList<Schedule> getScheduleList() {
        return this.scheduleList;
    }

    public final void setCount(@Nullable Integer num) {
        this.count = num;
    }

    public final void setScheduleList(@Nullable ArrayList<Schedule> arrayList) {
        this.scheduleList = arrayList;
    }
}
