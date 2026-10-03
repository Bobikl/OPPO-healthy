package com.heytap.speech.engine.protocol.event.payload.devicedata;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.speech.engine.protocol.event.Payload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/devicedata/ShortcutEntity;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "()V", DBHealthReviewPlan.DESC, "", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "name", "getName", "setName", "shortcutId", "", "getShortcutId", "()Ljava/lang/Integer;", "setShortcutId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "tag", "getTag", "setTag", "type", "getType", "setType", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ShortcutEntity extends Payload {

    @Nullable
    private String desc;

    @Nullable
    private String name;

    @Nullable
    private Integer shortcutId;

    @Nullable
    private String tag;

    @Nullable
    private Integer type;

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getShortcutId() {
        return this.shortcutId;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setShortcutId(@Nullable Integer num) {
        this.shortcutId = num;
    }

    public final void setTag(@Nullable String str) {
        this.tag = str;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }
}
