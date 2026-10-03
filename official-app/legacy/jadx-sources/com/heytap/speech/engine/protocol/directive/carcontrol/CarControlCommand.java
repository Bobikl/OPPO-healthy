package com.heytap.speech.engine.protocol.directive.carcontrol;

import androidx.annotation.Keep;
import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/carcontrol/CarControlCommand;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", EngineConstant.WAKEUP_TYPE_COMMAND, "Ljava/lang/String;", "getCommand", "()Ljava/lang/String;", "setCommand", "(Ljava/lang/String;)V", "commandStartTip", "getCommandStartTip", "setCommandStartTip", "commandEndTip", "getCommandEndTip", "setCommandEndTip", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/carcontrol/DeviceInfo;", "device", "Ljava/util/ArrayList;", "getDevice", "()Ljava/util/ArrayList;", "setDevice", "(Ljava/util/ArrayList;)V", "", "needUnlockPhone", "Ljava/lang/Boolean;", "getNeedUnlockPhone", "()Ljava/lang/Boolean;", "setNeedUnlockPhone", "(Ljava/lang/Boolean;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class CarControlCommand extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.1";

    @Nullable
    private String command;

    @Nullable
    private String commandEndTip;

    @Nullable
    private String commandStartTip;

    @Nullable
    private ArrayList<DeviceInfo> device;

    @Nullable
    private Boolean needUnlockPhone;

    @Nullable
    public final String getCommand() {
        return this.command;
    }

    @Nullable
    public final String getCommandEndTip() {
        return this.commandEndTip;
    }

    @Nullable
    public final String getCommandStartTip() {
        return this.commandStartTip;
    }

    @Nullable
    public final ArrayList<DeviceInfo> getDevice() {
        return this.device;
    }

    @Nullable
    public final Boolean getNeedUnlockPhone() {
        return this.needUnlockPhone;
    }

    public final void setCommand(@Nullable String str) {
        this.command = str;
    }

    public final void setCommandEndTip(@Nullable String str) {
        this.commandEndTip = str;
    }

    public final void setCommandStartTip(@Nullable String str) {
        this.commandStartTip = str;
    }

    public final void setDevice(@Nullable ArrayList<DeviceInfo> arrayList) {
        this.device = arrayList;
    }

    public final void setNeedUnlockPhone(@Nullable Boolean bool) {
        this.needUnlockPhone = bool;
    }
}
