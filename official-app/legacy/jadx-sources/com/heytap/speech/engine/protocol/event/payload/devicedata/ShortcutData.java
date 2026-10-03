package com.heytap.speech.engine.protocol.event.payload.devicedata;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/devicedata/ShortcutData;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "()V", "shortcutList", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/ShortcutEntity;", "getShortcutList", "()Ljava/util/ArrayList;", "setShortcutList", "(Ljava/util/ArrayList;)V", "taskList", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/TaskEntity;", "getTaskList", "setTaskList", "triggerList", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/TriggerEntity;", "getTriggerList", "setTriggerList", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ShortcutData extends Payload {

    @Nullable
    private ArrayList<ShortcutEntity> shortcutList;

    @Nullable
    private ArrayList<TaskEntity> taskList;

    @Nullable
    private ArrayList<TriggerEntity> triggerList;

    @Nullable
    public final ArrayList<ShortcutEntity> getShortcutList() {
        return this.shortcutList;
    }

    @Nullable
    public final ArrayList<TaskEntity> getTaskList() {
        return this.taskList;
    }

    @Nullable
    public final ArrayList<TriggerEntity> getTriggerList() {
        return this.triggerList;
    }

    public final void setShortcutList(@Nullable ArrayList<ShortcutEntity> arrayList) {
        this.shortcutList = arrayList;
    }

    public final void setTaskList(@Nullable ArrayList<TaskEntity> arrayList) {
        this.taskList = arrayList;
    }

    public final void setTriggerList(@Nullable ArrayList<TriggerEntity> arrayList) {
        this.triggerList = arrayList;
    }
}
