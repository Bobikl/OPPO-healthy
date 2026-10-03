package com.heytap.speech.engine.protocol.directive.alerts;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmFusion;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "entityType", "", "getEntityType", "()Ljava/lang/Integer;", "setEntityType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "originEntity", "Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmEntity;", "getOriginEntity", "()Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmEntity;", "setOriginEntity", "(Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmEntity;)V", "targetEntity", "getTargetEntity", "setTargetEntity", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AlarmFusion extends DirectivePayload {

    @Nullable
    private Integer entityType;

    @Nullable
    private AlarmEntity originEntity;

    @Nullable
    private AlarmEntity targetEntity;

    @Nullable
    public final Integer getEntityType() {
        return this.entityType;
    }

    @Nullable
    public final AlarmEntity getOriginEntity() {
        return this.originEntity;
    }

    @Nullable
    public final AlarmEntity getTargetEntity() {
        return this.targetEntity;
    }

    public final void setEntityType(@Nullable Integer num) {
        this.entityType = num;
    }

    public final void setOriginEntity(@Nullable AlarmEntity alarmEntity) {
        this.originEntity = alarmEntity;
    }

    public final void setTargetEntity(@Nullable AlarmEntity alarmEntity) {
        this.targetEntity = alarmEntity;
    }
}
