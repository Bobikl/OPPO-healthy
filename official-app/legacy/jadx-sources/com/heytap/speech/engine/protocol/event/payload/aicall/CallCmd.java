package com.heytap.speech.engine.protocol.event.payload.aicall;

import androidx.annotation.Keep;
import com.coloros.sceneservice.e.b;
import com.heytap.speech.engine.protocol.directive.aicall.CallScene;
import com.heytap.speech.engine.protocol.event.Payload;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\"\u0010#R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001d¨\u0006&"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/aicall/CallCmd;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "", "type", "Ljava/lang/Integer;", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "trigger", "getTrigger", "setTrigger", "autoStrategy", "getAutoStrategy", "setAutoStrategy", "", "harassScene", "Ljava/lang/String;", "getHarassScene", "()Ljava/lang/String;", "setHarassScene", "(Ljava/lang/String;)V", "", "Lcom/heytap/speech/engine/protocol/event/payload/aicall/CallDialogInfo;", "callDialogInfos", "Ljava/util/List;", "getCallDialogInfos", "()Ljava/util/List;", "setCallDialogInfos", "(Ljava/util/List;)V", "Lcom/heytap/speech/engine/protocol/directive/aicall/CallScene;", b.TABLE_NAME, "getScenes", "setScenes", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class CallCmd extends Payload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private Integer autoStrategy;

    @Nullable
    private List<CallDialogInfo> callDialogInfos;

    @Nullable
    private String harassScene;

    @Nullable
    private List<CallScene> scenes;

    @Nullable
    private Integer trigger;

    @Nullable
    private Integer type;

    @Nullable
    public final Integer getAutoStrategy() {
        return this.autoStrategy;
    }

    @Nullable
    public final List<CallDialogInfo> getCallDialogInfos() {
        return this.callDialogInfos;
    }

    @Nullable
    public final String getHarassScene() {
        return this.harassScene;
    }

    @Nullable
    public final List<CallScene> getScenes() {
        return this.scenes;
    }

    @Nullable
    public final Integer getTrigger() {
        return this.trigger;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public final void setAutoStrategy(@Nullable Integer num) {
        this.autoStrategy = num;
    }

    public final void setCallDialogInfos(@Nullable List<CallDialogInfo> list) {
        this.callDialogInfos = list;
    }

    public final void setHarassScene(@Nullable String str) {
        this.harassScene = str;
    }

    public final void setScenes(@Nullable List<CallScene> list) {
        this.scenes = list;
    }

    public final void setTrigger(@Nullable Integer num) {
        this.trigger = num;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }
}
