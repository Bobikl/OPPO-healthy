package com.heytap.speech.engine.protocol.directive.devicedata;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/devicedata/AlarmCondition;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "allAlarmLimit", "", "getAllAlarmLimit", "()Ljava/lang/Integer;", "setAllAlarmLimit", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "name", "Ljava/util/ArrayList;", "", "getName", "()Ljava/util/ArrayList;", "setName", "(Ljava/util/ArrayList;)V", "status", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", ClickApiEntity.TIME, "getTime", "setTime", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AlarmCondition extends DirectivePayload {

    @Nullable
    private Integer allAlarmLimit;

    @Nullable
    private ArrayList<String> name;

    @Nullable
    private String status;

    @Nullable
    private ArrayList<String> time;

    @Nullable
    public final Integer getAllAlarmLimit() {
        return this.allAlarmLimit;
    }

    @Nullable
    public final ArrayList<String> getName() {
        return this.name;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final ArrayList<String> getTime() {
        return this.time;
    }

    public final void setAllAlarmLimit(@Nullable Integer num) {
        this.allAlarmLimit = num;
    }

    public final void setName(@Nullable ArrayList<String> arrayList) {
        this.name = arrayList;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public final void setTime(@Nullable ArrayList<String> arrayList) {
        this.time = arrayList;
    }
}
