package com.heytap.speech.engine.protocol.directive.command;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\n\u0010\u000bR*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/command/AckPublish;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "", "type", "Ljava/util/List;", "getType", "()Ljava/util/List;", "setType", "(Ljava/util/List;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class AckPublish extends DirectivePayload {

    @NotNull
    public static final String TYPE_SKILL_EXE_END = "SKILL_EXE_END";

    @NotNull
    public static final String TYPE_SKILL_EXE_FAIL = "SKILL_EXE_FAIL";

    @NotNull
    public static final String TYPE_SKILL_EXE_START = "SKILL_EXE_START";

    @NotNull
    public static final String TYPE_SKILL_EXE_SUC = "SKILL_EXE_SUC";

    @NotNull
    public static final String TYPE_SKILL_REC = "REC_ACK";

    @Nullable
    private List<String> type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.0";

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.directive.command.AckPublish$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/command/AckPublish$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "TYPE_SKILL_EXE_END", "TYPE_SKILL_EXE_FAIL", "TYPE_SKILL_EXE_START", "TYPE_SKILL_EXE_SUC", "TYPE_SKILL_REC", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return AckPublish.VERSION;
        }
    }

    @Nullable
    public final List<String> getType() {
        return this.type;
    }

    public final void setType(@Nullable List<String> list) {
        this.type = list;
    }
}
