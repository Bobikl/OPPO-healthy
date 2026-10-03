package com.heytap.speech.engine.protocol.directive.devicedata;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/devicedata/ScheduleCondition;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "limit", "", "getLimit", "()Ljava/lang/Integer;", "setLimit", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "timeRangeList", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/devicedata/ScheduleTimeRange;", "getTimeRangeList", "()Ljava/util/ArrayList;", "setTimeRangeList", "(Ljava/util/ArrayList;)V", "typeList", "getTypeList", "setTypeList", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ScheduleCondition extends DirectivePayload {

    @Nullable
    private Integer limit;

    @Nullable
    private ArrayList<ScheduleTimeRange> timeRangeList;

    @Nullable
    private ArrayList<Integer> typeList;

    @Nullable
    public final Integer getLimit() {
        return this.limit;
    }

    @Nullable
    public final ArrayList<ScheduleTimeRange> getTimeRangeList() {
        return this.timeRangeList;
    }

    @Nullable
    public final ArrayList<Integer> getTypeList() {
        return this.typeList;
    }

    public final void setLimit(@Nullable Integer num) {
        this.limit = num;
    }

    public final void setTimeRangeList(@Nullable ArrayList<ScheduleTimeRange> arrayList) {
        this.timeRangeList = arrayList;
    }

    public final void setTypeList(@Nullable ArrayList<Integer> arrayList) {
        this.typeList = arrayList;
    }
}
