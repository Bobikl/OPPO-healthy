package com.heytap.speech.engine.protocol.directive.activepush;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/activepush/PushData;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "directives", "Ljava/util/ArrayList;", "", "getDirectives", "()Ljava/util/ArrayList;", "setDirectives", "(Ljava/util/ArrayList;)V", "messageContent", "Ljava/util/HashMap;", "", "getMessageContent", "()Ljava/util/HashMap;", "setMessageContent", "(Ljava/util/HashMap;)V", "scene", "getScene", "()Ljava/lang/String;", "setScene", "(Ljava/lang/String;)V", "type", "getType", "setType", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PushData extends DirectivePayload {

    @Nullable
    private ArrayList<Object> directives;

    @Nullable
    private HashMap<String, Object> messageContent;

    @Nullable
    private String scene;

    @Nullable
    private String type;

    @Nullable
    public final ArrayList<Object> getDirectives() {
        return this.directives;
    }

    @Nullable
    public final HashMap<String, Object> getMessageContent() {
        return this.messageContent;
    }

    @Nullable
    public final String getScene() {
        return this.scene;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setDirectives(@Nullable ArrayList<Object> arrayList) {
        this.directives = arrayList;
    }

    public final void setMessageContent(@Nullable HashMap<String, Object> map) {
        this.messageContent = map;
    }

    public final void setScene(@Nullable String str) {
        this.scene = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
