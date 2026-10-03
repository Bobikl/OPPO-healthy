package com.heytap.speech.engine.protocol.directive.rgsets;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.store.business.rn.service.RnConstant;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019RB\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R$\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/rgsets/SetAction;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", RnConstant.KEY_INIT_OPTIONS, "Ljava/util/HashMap;", "getParam", "()Ljava/util/HashMap;", "setParam", "(Ljava/util/HashMap;)V", "clientSkill", "Ljava/lang/String;", "getClientSkill", "()Ljava/lang/String;", "setClientSkill", "(Ljava/lang/String;)V", "clientIntent", "getClientIntent", "setClientIntent", "speakText", "getSpeakText", "setSpeakText", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class SetAction extends DirectivePayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String clientIntent;

    @Nullable
    private String clientSkill;

    @Nullable
    private HashMap<String, Object> param;

    @Nullable
    private String speakText;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.directive.rgsets.SetAction$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/rgsets/SetAction$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return SetAction.VERSION;
        }
    }

    @Nullable
    public final String getClientIntent() {
        return this.clientIntent;
    }

    @Nullable
    public final String getClientSkill() {
        return this.clientSkill;
    }

    @Nullable
    public final HashMap<String, Object> getParam() {
        return this.param;
    }

    @Nullable
    public final String getSpeakText() {
        return this.speakText;
    }

    public final void setClientIntent(@Nullable String str) {
        this.clientIntent = str;
    }

    public final void setClientSkill(@Nullable String str) {
        this.clientSkill = str;
    }

    public final void setParam(@Nullable HashMap<String, Object> map) {
        this.param = map;
    }

    public final void setSpeakText(@Nullable String str) {
        this.speakText = str;
    }
}
