package com.heytap.speech.engine.protocol.event.payload.devicedata;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/devicedata/AiSearchCardContent;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "()V", "references", "Ljava/util/ArrayList;", "", "getReferences", "()Ljava/util/ArrayList;", "setReferences", "(Ljava/util/ArrayList;)V", "resultContent", "getResultContent", "()Ljava/lang/String;", "setResultContent", "(Ljava/lang/String;)V", "suggestQueries", "getSuggestQueries", "setSuggestQueries", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AiSearchCardContent extends Payload {

    @Nullable
    private ArrayList<String> references;

    @Nullable
    private String resultContent;

    @Nullable
    private ArrayList<String> suggestQueries;

    @Nullable
    public final ArrayList<String> getReferences() {
        return this.references;
    }

    @Nullable
    public final String getResultContent() {
        return this.resultContent;
    }

    @Nullable
    public final ArrayList<String> getSuggestQueries() {
        return this.suggestQueries;
    }

    public final void setReferences(@Nullable ArrayList<String> arrayList) {
        this.references = arrayList;
    }

    public final void setResultContent(@Nullable String str) {
        this.resultContent = str;
    }

    public final void setSuggestQueries(@Nullable ArrayList<String> arrayList) {
        this.suggestQueries = arrayList;
    }
}
