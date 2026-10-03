package com.heytap.speech.engine.protocol.event.payload.devicedata;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.speech.engine.protocol.event.Payload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/devicedata/TriggerEntity;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "()V", DBHealthReviewPlan.DESC, "", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "grayIcon", "getGrayIcon", "setGrayIcon", "icon", "getIcon", "setIcon", "triggerId", "", "getTriggerId", "()Ljava/lang/Integer;", "setTriggerId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TriggerEntity extends Payload {

    @Nullable
    private String desc;

    @Nullable
    private String grayIcon;

    @Nullable
    private String icon;

    @Nullable
    private Integer triggerId;

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getGrayIcon() {
        return this.grayIcon;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final Integer getTriggerId() {
        return this.triggerId;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setGrayIcon(@Nullable String str) {
        this.grayIcon = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setTriggerId(@Nullable Integer num) {
        this.triggerId = num;
    }
}
