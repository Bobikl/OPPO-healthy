package com.heytap.speech.engine.protocol.directive.exclusiveai;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/exclusiveai/MemorySearchCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/exclusiveai/MemoryEntity;", "memoryList", "Ljava/util/ArrayList;", "getMemoryList", "()Ljava/util/ArrayList;", "setMemoryList", "(Ljava/util/ArrayList;)V", "Lcom/heytap/speech/engine/protocol/directive/exclusiveai/Header;", SpeechConstant.KEY_TTS_REQUEST_HEADER, "Lcom/heytap/speech/engine/protocol/directive/exclusiveai/Header;", "getHeader", "()Lcom/heytap/speech/engine/protocol/directive/exclusiveai/Header;", "setHeader", "(Lcom/heytap/speech/engine/protocol/directive/exclusiveai/Header;)V", "copyContent", "getCopyContent", "setCopyContent", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class MemorySearchCard extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String copyContent;

    @Nullable
    private Header header;

    @Nullable
    private ArrayList<MemoryEntity> memoryList;

    @Nullable
    private String type;

    @Nullable
    public final String getCopyContent() {
        return this.copyContent;
    }

    @Nullable
    public final Header getHeader() {
        return this.header;
    }

    @Nullable
    public final ArrayList<MemoryEntity> getMemoryList() {
        return this.memoryList;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setCopyContent(@Nullable String str) {
        this.copyContent = str;
    }

    public final void setHeader(@Nullable Header header) {
        this.header = header;
    }

    public final void setMemoryList(@Nullable ArrayList<MemoryEntity> arrayList) {
        this.memoryList = arrayList;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
