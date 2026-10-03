package com.heytap.speech.engine.protocol.event.payload.devicedata;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u0005\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/devicedata/Alarm;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "()V", "alarmId", "", "getAlarmId", "()Ljava/lang/String;", "setAlarmId", "(Ljava/lang/String;)V", "name", "getName", "setName", "repeatType", "getRepeatType", "setRepeatType", "repeatValue", "", "", "getRepeatValue", "()[Ljava/lang/Byte;", "setRepeatValue", "([Ljava/lang/Byte;)V", "[Ljava/lang/Byte;", "status", "getStatus", "setStatus", ClickApiEntity.TIME, "getTime", "setTime", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Alarm extends Payload {

    @Nullable
    private String alarmId;

    @Nullable
    private String name;

    @Nullable
    private String repeatType;

    @Nullable
    private Byte[] repeatValue;

    @Nullable
    private String status;

    @Nullable
    private String time;

    @Nullable
    public final String getAlarmId() {
        return this.alarmId;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getRepeatType() {
        return this.repeatType;
    }

    @Nullable
    public final Byte[] getRepeatValue() {
        return this.repeatValue;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTime() {
        return this.time;
    }

    public final void setAlarmId(@Nullable String str) {
        this.alarmId = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setRepeatType(@Nullable String str) {
        this.repeatType = str;
    }

    public final void setRepeatValue(@Nullable Byte[] bArr) {
        this.repeatValue = bArr;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public final void setTime(@Nullable String str) {
        this.time = str;
    }
}
