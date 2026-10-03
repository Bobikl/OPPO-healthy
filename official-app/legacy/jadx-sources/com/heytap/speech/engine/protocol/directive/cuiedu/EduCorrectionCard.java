package com.heytap.speech.engine.protocol.directive.cuiedu;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.ThinkingResult;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 /2\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b-\u0010.R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R0\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00061"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/cuiedu/EduCorrectionCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "summary", "Ljava/lang/String;", "getSummary", "()Ljava/lang/String;", "setSummary", "(Ljava/lang/String;)V", "docRecordId", "getDocRecordId", "setDocRecordId", "url", "getUrl", "setUrl", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/cuiedu/Answer;", "results", "Ljava/util/ArrayList;", "getResults", "()Ljava/util/ArrayList;", "setResults", "(Ljava/util/ArrayList;)V", "Ljava/util/HashMap;", "", "extend", "Ljava/util/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "", "rotationAngle", "Ljava/lang/Integer;", "getRotationAngle", "()Ljava/lang/Integer;", "setRotationAngle", "(Ljava/lang/Integer;)V", "Lcom/heytap/speech/engine/protocol/directive/common/ThinkingResult;", "thinkingResult", "Lcom/heytap/speech/engine/protocol/directive/common/ThinkingResult;", "getThinkingResult", "()Lcom/heytap/speech/engine/protocol/directive/common/ThinkingResult;", "setThinkingResult", "(Lcom/heytap/speech/engine/protocol/directive/common/ThinkingResult;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class EduCorrectionCard extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String docRecordId;

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private ArrayList<Answer> results;

    @Nullable
    private Integer rotationAngle;

    @Nullable
    private String summary;

    @Nullable
    private ThinkingResult thinkingResult;

    @Nullable
    private String url;

    @Nullable
    public final String getDocRecordId() {
        return this.docRecordId;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final ArrayList<Answer> getResults() {
        return this.results;
    }

    @Nullable
    public final Integer getRotationAngle() {
        return this.rotationAngle;
    }

    @Nullable
    public final String getSummary() {
        return this.summary;
    }

    @Nullable
    public final ThinkingResult getThinkingResult() {
        return this.thinkingResult;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setDocRecordId(@Nullable String str) {
        this.docRecordId = str;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setResults(@Nullable ArrayList<Answer> arrayList) {
        this.results = arrayList;
    }

    public final void setRotationAngle(@Nullable Integer num) {
        this.rotationAngle = num;
    }

    public final void setSummary(@Nullable String str) {
        this.summary = str;
    }

    public final void setThinkingResult(@Nullable ThinkingResult thinkingResult) {
        this.thinkingResult = thinkingResult;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }
}
