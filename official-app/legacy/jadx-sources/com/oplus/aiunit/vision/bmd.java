package com.oplus.aiunit.vision;

import androidx.core.app.FrameMetricsAggregator;
import com.heytap.speech.engine.process.OperationStatus;
import com.heytap.speech.engine.protocol.directive.Directive;
import com.heytap.speech.engine.protocol.directive.DirectiveHeader;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.conditional.GeneralCondition;
import com.heytap.speech.engine.protocol.directive.speechsynthesizer.OutputSpeech;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\f\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b?\u0010@J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016J\u0012\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\u0005H&J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u0012\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0016J \u0010\u0018\u001a\u00020\u00052\u0016\u0010\u0017\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0018\u00010\u0016H\u0016J\u0018\u0010\u0019\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0018\u00010\u0016H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u000bH\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\n\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\b\u0010#\u001a\u00020\u0010H\u0016J\n\u0010%\u001a\u0004\u0018\u00010$H\u0016R \u0010&\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R&\u0010*\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010)R\u0018\u0010/\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010)R\u0018\u00100\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010)R\u0018\u00101\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010)R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R$\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010)R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010)R\u0016\u0010=\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lcom/oplus/aiunit/vision/bmd;", "Lcom/oplus/aiunit/vision/tmd;", "Lcom/heytap/speech/engine/protocol/directive/Directive;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "directive", "", "setDirective", "getDirective", "Lcom/heytap/speech/engine/process/OperationStatus;", "status", "setStatus", "", "resultExtra", "getStatus", "process", "cancel", "", "isCancelled", "isFinish", "data", "setOrigin", "getOrigin", "", "directives", "setDirectiveGroup", "getDirectiveGroup", "getRecordId", "getCurrentRecordId", "getSessionId", "getConversationId", "getDirectiveId", "Lcom/oplus/aiunit/vision/ca4;", "getConversationInfo", "Lcom/heytap/speech/engine/protocol/directive/conditional/GeneralCondition;", "getGeneralCondition", "isMicOn", "Lcom/heytap/speech/engine/protocol/directive/speechsynthesizer/OutputSpeech;", "getOutPutSpeech", "directiveData", "Lcom/heytap/speech/engine/protocol/directive/Directive;", "originData", "Ljava/lang/String;", "directiveGroup", "Ljava/util/List;", SpeechConstant.KEY_RECORD_ID, "currentRecordId", "sessionId", "conversationId", "roomId", "uniqueId", "", "sequenceId", "Ljava/lang/Integer;", "", "extend", "Ljava/util/Map;", "micOn", "Ljava/lang/Boolean;", "outputSpeech", "Lcom/heytap/speech/engine/protocol/directive/speechsynthesizer/OutputSpeech;", "directiveId", "statusData", "Lcom/heytap/speech/engine/process/OperationStatus;", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public abstract class bmd implements tmd {

    @Nullable
    private String conversationId;

    @Nullable
    private String currentRecordId;

    @Nullable
    private Directive<? extends DirectivePayload> directiveData;

    @Nullable
    private List<? extends Directive<? extends DirectivePayload>> directiveGroup;

    @Nullable
    private String directiveId;

    @Nullable
    private Map<String, String> extend;

    @Nullable
    private Boolean micOn;

    @Nullable
    private String originData;

    @Nullable
    private OutputSpeech outputSpeech;

    @Nullable
    private String recordId;

    @Nullable
    private String resultExtra;

    @Nullable
    private String roomId;

    @Nullable
    private Integer sequenceId;

    @Nullable
    private String sessionId;

    @NotNull
    private OperationStatus statusData = OperationStatus.UNKNOWN;

    @Nullable
    private String uniqueId;

    @Override // com.oplus.aiunit.vision.tmd
    public void cancel() {
        Directive<? extends DirectivePayload> directive = this.directiveData;
        if (directive == null) {
            return;
        }
        umd.INSTANCE.a().c(directive);
    }

    @Nullable
    public String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    public ConversationInfo getConversationInfo() {
        ConversationInfo conversationInfo = new ConversationInfo(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
        conversationInfo.g(this.conversationId);
        conversationInfo.n(this.sessionId);
        conversationInfo.k(this.recordId);
        conversationInfo.h(this.currentRecordId);
        conversationInfo.m(this.sequenceId);
        conversationInfo.o(this.uniqueId);
        conversationInfo.l(this.roomId);
        conversationInfo.j(this.extend);
        return conversationInfo;
    }

    @Nullable
    public String getCurrentRecordId() {
        return this.currentRecordId;
    }

    @Nullable
    public Directive<? extends DirectivePayload> getDirective() {
        return this.directiveData;
    }

    @Nullable
    public List<Directive<? extends DirectivePayload>> getDirectiveGroup() {
        return this.directiveGroup;
    }

    @Nullable
    public String getDirectiveId() {
        return this.directiveId;
    }

    @Nullable
    public GeneralCondition getGeneralCondition() {
        List<? extends Directive<? extends DirectivePayload>> list = this.directiveGroup;
        if (list == null) {
            return null;
        }
        for (Directive<? extends DirectivePayload> directive : list) {
            if (Intrinsics.areEqual("Conditional.GeneralCondition", directive.getHeader().getNamespace() + '.' + directive.getHeader().getName())) {
                DirectivePayload payload = directive.getPayload();
                if (payload != null) {
                    return (GeneralCondition) payload;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.heytap.speech.engine.protocol.directive.conditional.GeneralCondition");
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: getOrigin, reason: from getter */
    public String getOriginData() {
        return this.originData;
    }

    @Nullable
    /* JADX INFO: renamed from: getOutPutSpeech, reason: from getter */
    public OutputSpeech getOutputSpeech() {
        return this.outputSpeech;
    }

    @Nullable
    public String getRecordId() {
        return this.recordId;
    }

    @Nullable
    public String getSessionId() {
        return this.sessionId;
    }

    @Override // com.oplus.aiunit.vision.tmd
    @NotNull
    /* JADX INFO: renamed from: getStatus, reason: from getter */
    public OperationStatus getStatusData() {
        return this.statusData;
    }

    @Override // com.oplus.aiunit.vision.tmd
    public boolean isCancelled() {
        return false;
    }

    public boolean isFinish() {
        OperationStatus operationStatus = this.statusData;
        return operationStatus == OperationStatus.SUCCESS || operationStatus == OperationStatus.FAIL;
    }

    public boolean isMicOn() {
        Boolean bool = this.micOn;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.oplus.aiunit.vision.tmd
    public abstract void process();

    @Override // com.oplus.aiunit.vision.tmd
    public void setDirective(@NotNull Directive<? extends DirectivePayload> directive) {
        DirectiveHeader header;
        Intrinsics.checkNotNullParameter(directive, "directive");
        this.directiveData = directive;
        String id = null;
        if (directive != null && (header = directive.getHeader()) != null) {
            id = header.getId();
        }
        this.directiveId = id;
    }

    @Override // com.oplus.aiunit.vision.tmd
    public void setDirectiveGroup(@Nullable List<? extends Directive<? extends DirectivePayload>> directives) {
        this.directiveGroup = directives;
    }

    @Override // com.oplus.aiunit.vision.tmd
    public void setOrigin(@Nullable String data) {
        JSONObject jSONObject;
        Iterator<String> itKeys;
        JSONObject jSONObjectOptJSONObject;
        this.originData = data;
        if (data == null) {
            jSONObject = null;
        } else {
            try {
                jSONObject = new JSONObject(data);
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        this.recordId = jSONObject == null ? null : jSONObject.optString(SpeechConstant.KEY_ORIGINAL_RECORD_ID);
        this.currentRecordId = jSONObject == null ? null : jSONObject.optString(SpeechConstant.KEY_RECORD_ID);
        this.sessionId = jSONObject == null ? null : jSONObject.optString("sessionId");
        this.conversationId = jSONObject == null ? null : jSONObject.optString("conversationId");
        this.roomId = jSONObject == null ? null : jSONObject.optString("roomId");
        this.uniqueId = jSONObject == null ? null : jSONObject.optString("uniqueId");
        this.sequenceId = jSONObject == null ? null : Integer.valueOf(jSONObject.optInt("sequenceId", -1));
        JSONObject jSONObjectOptJSONObject2 = jSONObject == null ? null : jSONObject.optJSONObject("extend");
        if (jSONObjectOptJSONObject2 != null && (itKeys = jSONObjectOptJSONObject2.keys()) != null) {
            this.extend = new HashMap();
            while (itKeys.hasNext()) {
                String item = itKeys.next();
                Map<String, String> map = this.extend;
                if (map != null) {
                    Intrinsics.checkNotNullExpressionValue(item, "item");
                    String strOptString = jSONObjectOptJSONObject2.optString(item, "");
                    Intrinsics.checkNotNullExpressionValue(strOptString, "extendObj.optString(item, \"\")");
                    map.put(item, strOptString);
                }
            }
        }
        JSONArray jSONArrayOptJSONArray = jSONObject == null ? null : jSONObject.optJSONArray("directives");
        int i = 0;
        int length = jSONArrayOptJSONArray == null ? 0 : jSONArrayOptJSONArray.length();
        if (length <= 0) {
            return;
        }
        while (true) {
            int i2 = i + 1;
            JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray == null ? null : jSONArrayOptJSONArray.optJSONObject(i);
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3 == null ? null : jSONObjectOptJSONObject3.optJSONObject(SpeechConstant.KEY_TTS_REQUEST_HEADER);
            String strOptString2 = jSONObjectOptJSONObject4 == null ? null : jSONObjectOptJSONObject4.optString(usm.f17592j);
            String strOptString3 = jSONObjectOptJSONObject4 == null ? null : jSONObjectOptJSONObject4.optString("name");
            StringBuilder sb = new StringBuilder();
            sb.append((Object) strOptString2);
            sb.append('.');
            sb.append((Object) strOptString3);
            String string = sb.toString();
            if (Intrinsics.areEqual(string, "SpeechSynthesizer.OutputSpeech")) {
                this.outputSpeech = (OutputSpeech) gia.b(String.valueOf(jSONObjectOptJSONObject3 == null ? null : jSONObjectOptJSONObject3.optJSONObject("payload")), OutputSpeech.class);
            } else if (Intrinsics.areEqual(string, "SpeechRecognizer.ExpectSpeech")) {
                this.micOn = Boolean.valueOf(Intrinsics.areEqual((jSONObjectOptJSONObject3 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("payload")) == null) ? null : jSONObjectOptJSONObject.optString("micAct"), "on"));
            }
            if (i2 >= length) {
                return;
            } else {
                i = i2;
            }
        }
    }

    @Override // com.oplus.aiunit.vision.tmd
    public void setStatus(@NotNull OperationStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        setStatus(status, null);
    }

    public void setStatus(@NotNull OperationStatus status, @Nullable String resultExtra) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.statusData = status;
        this.resultExtra = resultExtra;
    }
}
