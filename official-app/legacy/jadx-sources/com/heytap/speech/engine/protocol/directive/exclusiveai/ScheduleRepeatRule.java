package com.heytap.speech.engine.protocol.directive.exclusiveai;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/exclusiveai/ScheduleRepeatRule;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "monthly", "Ljava/util/ArrayList;", "", "getMonthly", "()Ljava/util/ArrayList;", "setMonthly", "(Ljava/util/ArrayList;)V", "type", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "weekly", "getWeekly", "setWeekly", "yearly", "getYearly", "setYearly", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ScheduleRepeatRule extends DirectivePayload {

    @Nullable
    private ArrayList<String> monthly;

    @Nullable
    private String type;

    @Nullable
    private ArrayList<String> weekly;

    @Nullable
    private ArrayList<String> yearly;

    @Nullable
    public final ArrayList<String> getMonthly() {
        return this.monthly;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final ArrayList<String> getWeekly() {
        return this.weekly;
    }

    @Nullable
    public final ArrayList<String> getYearly() {
        return this.yearly;
    }

    public final void setMonthly(@Nullable ArrayList<String> arrayList) {
        this.monthly = arrayList;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setWeekly(@Nullable ArrayList<String> arrayList) {
        this.weekly = arrayList;
    }

    public final void setYearly(@Nullable ArrayList<String> arrayList) {
        this.yearly = arrayList;
    }
}
