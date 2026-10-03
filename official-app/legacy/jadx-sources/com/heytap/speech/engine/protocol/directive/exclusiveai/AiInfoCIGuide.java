package com.heytap.speech.engine.protocol.directive.exclusiveai;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/exclusiveai/AiInfoCIGuide;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "guidText", "Ljava/lang/String;", "getGuidText", "()Ljava/lang/String;", "setGuidText", "(Ljava/lang/String;)V", "linkText", "getLinkText", "setLinkText", "guideDp", "getGuideDp", "setGuideDp", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class AiInfoCIGuide extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String guidText;

    @Nullable
    private String guideDp;

    @Nullable
    private String linkText;

    @Nullable
    public final String getGuidText() {
        return this.guidText;
    }

    @Nullable
    public final String getGuideDp() {
        return this.guideDp;
    }

    @Nullable
    public final String getLinkText() {
        return this.linkText;
    }

    public final void setGuidText(@Nullable String str) {
        this.guidText = str;
    }

    public final void setGuideDp(@Nullable String str) {
        this.guideDp = str;
    }

    public final void setLinkText(@Nullable String str) {
        this.linkText = str;
    }
}
