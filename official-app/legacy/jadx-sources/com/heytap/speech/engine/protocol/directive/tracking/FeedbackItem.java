package com.heytap.speech.engine.protocol.directive.tracking;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/tracking/FeedbackItem;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "dialogConfig", "Lcom/heytap/speech/engine/protocol/directive/tracking/DialogConfig;", "getDialogConfig", "()Lcom/heytap/speech/engine/protocol/directive/tracking/DialogConfig;", "setDialogConfig", "(Lcom/heytap/speech/engine/protocol/directive/tracking/DialogConfig;)V", "itemName", "", "getItemName", "()Ljava/lang/String;", "setItemName", "(Ljava/lang/String;)V", "type", "getType", "setType", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class FeedbackItem extends DirectivePayload {

    @JsonProperty("dialogConfig")
    @Nullable
    private DialogConfig dialogConfig;

    @JsonProperty("itemName")
    @Nullable
    private String itemName;

    @JsonProperty("type")
    @Nullable
    private String type;

    @Nullable
    public final DialogConfig getDialogConfig() {
        return this.dialogConfig;
    }

    @Nullable
    public final String getItemName() {
        return this.itemName;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setDialogConfig(@Nullable DialogConfig dialogConfig) {
        this.dialogConfig = dialogConfig;
    }

    public final void setItemName(@Nullable String str) {
        this.itemName = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
