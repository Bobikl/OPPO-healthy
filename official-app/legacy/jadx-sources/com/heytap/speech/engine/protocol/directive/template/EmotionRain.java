package com.heytap.speech.engine.protocol.directive.template;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.commercial.ActionInfo;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/template/EmotionRain;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "iconUrl", "Ljava/lang/String;", "getIconUrl", "()Ljava/lang/String;", "setIconUrl", "(Ljava/lang/String;)V", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;", "actionInfos", "Ljava/util/ArrayList;", "getActionInfos", "()Ljava/util/ArrayList;", "setActionInfos", "(Ljava/util/ArrayList;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class EmotionRain extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private ArrayList<ActionInfo> actionInfos;

    @Nullable
    private String iconUrl;

    @Nullable
    public final ArrayList<ActionInfo> getActionInfos() {
        return this.actionInfos;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final void setActionInfos(@Nullable ArrayList<ActionInfo> arrayList) {
        this.actionInfos = arrayList;
    }

    public final void setIconUrl(@Nullable String str) {
        this.iconUrl = str;
    }
}
