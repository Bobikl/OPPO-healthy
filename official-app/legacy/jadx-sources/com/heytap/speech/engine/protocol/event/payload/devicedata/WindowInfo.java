package com.heytap.speech.engine.protocol.event.payload.devicedata;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import com.heytap.store.business.rn.service.RnConstant;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/devicedata/WindowInfo;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "()V", RnConstant.KEY_COMPONENT_NAME, "", "getComponentName", "()Ljava/lang/String;", "setComponentName", "(Ljava/lang/String;)V", "floating", "", "getFloating", "()Ljava/lang/Boolean;", "setFloating", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "pip", "getPip", "setPip", "split", "getSplit", "setSplit", "taskId", "", "getTaskId", "()Ljava/lang/Integer;", "setTaskId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "windowName", "getWindowName", "setWindowName", "windowPos", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/WindowRectangle;", "getWindowPos", "()Lcom/heytap/speech/engine/protocol/event/payload/devicedata/WindowRectangle;", "setWindowPos", "(Lcom/heytap/speech/engine/protocol/event/payload/devicedata/WindowRectangle;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WindowInfo extends Payload {

    @Nullable
    private String componentName;

    @Nullable
    private Boolean floating;

    @Nullable
    private Boolean pip;

    @Nullable
    private Boolean split;

    @Nullable
    private Integer taskId;

    @Nullable
    private String windowName;

    @Nullable
    private WindowRectangle windowPos;

    @Nullable
    public final String getComponentName() {
        return this.componentName;
    }

    @Nullable
    public final Boolean getFloating() {
        return this.floating;
    }

    @Nullable
    public final Boolean getPip() {
        return this.pip;
    }

    @Nullable
    public final Boolean getSplit() {
        return this.split;
    }

    @Nullable
    public final Integer getTaskId() {
        return this.taskId;
    }

    @Nullable
    public final String getWindowName() {
        return this.windowName;
    }

    @Nullable
    public final WindowRectangle getWindowPos() {
        return this.windowPos;
    }

    public final void setComponentName(@Nullable String str) {
        this.componentName = str;
    }

    public final void setFloating(@Nullable Boolean bool) {
        this.floating = bool;
    }

    public final void setPip(@Nullable Boolean bool) {
        this.pip = bool;
    }

    public final void setSplit(@Nullable Boolean bool) {
        this.split = bool;
    }

    public final void setTaskId(@Nullable Integer num) {
        this.taskId = num;
    }

    public final void setWindowName(@Nullable String str) {
        this.windowName = str;
    }

    public final void setWindowPos(@Nullable WindowRectangle windowRectangle) {
        this.windowPos = windowRectangle;
    }
}
