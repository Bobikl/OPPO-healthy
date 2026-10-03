package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import com.heytap.speech.engine.HeytapSpeechEngine;
import com.heytap.speech.engine.connect.core.manager.MessageCacheManager;
import com.heytap.speech.engine.connect.core.manager.MessageQueueManager;
import com.heytap.speech.engine.constant.CloudWakeupRecorder;
import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.speech.engine.constant.StreamASRBean;
import com.heytap.speech.engine.constant.StreamAsrRecorder;
import com.heytap.speech.engine.nodes.DmParameter;
import com.heytap.speech.engine.protocol.directive.Directive;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.activepush.PushData;
import com.heytap.speech.engine.protocol.directive.command.AckPublish;
import com.heytap.speech.engine.protocol.directive.speechrecognizer.RecognizeResult;
import com.heytap.speech.engine.protocol.directive.speechsynthesizer.OutputSpeech;
import com.heytap.speech.engine.protocol.event.Message;
import com.heytap.speech.engine.protocol.event.payload.command.AckPuback;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.platform.usercenter.bizuws.executor.dialog.ShowDialogExecutor;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 92\u00020\u0001:\u0001&B\u000f\u0012\u0006\u00102\u001a\u00020,¢\u0006\u0004\b8\u00101J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010\u000b\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J \u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J$\u0010\u0018\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002J5\u0010 \u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010!J,\u0010%\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u00022\u0006\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010&\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u0002J\u001a\u0010'\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002J\u001a\u0010(\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002J\u001a\u0010)\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u0002J\u001a\u0010*\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010+\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u0002R\"\u00102\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0016\u00104\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00103R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00106¨\u0006:"}, d2 = {"Lcom/oplus/aiunit/vision/lyb;", "", "", "messageContent", "", "n", "originData", "Lorg/json/JSONArray;", "directivesJsonArray", "Lcom/oplus/aiunit/vision/ca4;", "conversationInfo", LogFieldKey.LEVEL_KEY, "", "j", "Lorg/json/JSONObject;", "messageObj", "Lkotlin/Pair;", LogFieldKey.PROCESS_NAME_KEY, "q", "r", SpeechConstant.KEY_RECORD_ID, "s", SpeechConstant.KEY_TTS_REQUEST_HEADER, "payload", "f", MapSchema.FIELD_NAME_KEY, "b", b2n.f, "type", "", "oneshotRound", "content", "i", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/oplus/aiunit/vision/ca4;)V", "nlg", "shouldEndSession", EngineConstant.REASON, LogFieldKey.MESSAGE_KEY, "a", "c", MapSchema.FIELD_NAME_ENTRY, "d", b2n.g, "o", "Lcom/oplus/aiunit/vision/r43;", "Lcom/oplus/aiunit/vision/r43;", "getMNode", "()Lcom/oplus/aiunit/vision/r43;", "setMNode", "(Lcom/oplus/aiunit/vision/r43;)V", "mNode", "Z", "asrBegin", "Lcom/oplus/aiunit/vision/lva;", "Lcom/oplus/aiunit/vision/lva;", "legacyMessageProcessor", "<init>", "Companion", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class lyb {

    @NotNull
    public static final String MIC_ON = "on";

    @NotNull
    public static final String TAG = "MessageProcessor";

    @NotNull
    public static final String TYPE_FINAL = "FINAL";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public r43 mNode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean asrBegin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final lva legacyMessageProcessor;

    @NotNull
    public static final String[] d = {"SpeechRecognizer.ExpectSpeech", "Command.UploadEvent", "SpeechRecognizer.VadControl", "SpeechRecognizer.CloudWakeup", "Command.AckPublish", "CustomerData.UploadResult"};

    public lyb(@NotNull r43 mNode) {
        Intrinsics.checkNotNullParameter(mNode, "mNode");
        this.mNode = mNode;
        this.asrBegin = true;
        this.legacyMessageProcessor = new lva(this.mNode);
        umd.INSTANCE.a().m(this.mNode);
    }

    public final String a(JSONObject payload) {
        if (payload == null) {
            return "";
        }
        r43 r43Var = this.mNode;
        String string = new JSONObject().put(EngineConstant.TTS_TIMBRE, payload.optString(EngineConstant.TTS_TIMBRE, "")).put("ttsLanguage", payload.optString("language", "")).toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject().put(TTS_TIM…anguage\", \"\")).toString()");
        r43Var.r("tts.ctrl", "change", string);
        if (kp3.INSTANCE.d(payload.optString(EngineConstant.TTS_TYPE_SSML, ""))) {
            String string2 = new JSONObject().put(EngineConstant.SSML_FLAG_VALUE_STR, payload.optString(EngineConstant.TTS_TYPE_SSML, "")).put(EngineConstant.ROLL_BACK_FLAG_VALUE_STR, payload.optString("text", "")).put(EngineConstant.USER_TIMBRE_STR, payload.optString("userTimbre", "")).put("emotion", payload.optString("emotion", "")).toString();
            Intrinsics.checkNotNullExpressionValue(string2, "{\n                    JS…tring()\n                }");
            return string2;
        }
        String strOptString = payload.optString("text", "");
        Intrinsics.checkNotNullExpressionValue(strOptString, "payload.optString(\"text\", \"\")");
        if (!(strOptString.length() > 0)) {
            return "";
        }
        String string3 = new JSONObject().put(EngineConstant.ROLL_BACK_FLAG_VALUE_STR, payload.optString("text", "")).put(EngineConstant.USER_TIMBRE_STR, payload.optString("userTimbre", "")).put("emotion", payload.optString("emotion", "")).toString();
        Intrinsics.checkNotNullExpressionValue(string3, "{\n                    JS…tring()\n                }");
        return string3;
    }

    public final void b(JSONObject payload, ConversationInfo conversationInfo) throws JSONException {
        i(payload == null ? null : payload.optString("type"), null, payload == null ? null : payload.optString("content"), conversationInfo);
    }

    public final boolean c(JSONObject payload, ConversationInfo conversationInfo) throws JSONException {
        t7b t7bVar = t7b.INSTANCE;
        t7bVar.b(TAG, Intrinsics.stringPlus("errorInfo is ", payload));
        Integer numValueOf = payload == null ? null : Integer.valueOf(payload.optInt("code"));
        if (numValueOf != null && 100057 == numValueOf.intValue()) {
            da4 da4Var = da4.INSTANCE;
            String strH = da4Var.h();
            String str = strH != null ? strH : "";
            hzb hzbVar = hzb.INSTANCE;
            if (hzbVar.b(str)) {
                if (hzbVar.c(str)) {
                    t7bVar.k(TAG, "onReceived retry message , but message has  retry 5 times.");
                    return true;
                }
                t7bVar.k(TAG, "onReceived retry message , message has a retry message.");
            }
            if (str.length() == 0) {
                t7bVar.k(TAG, "current record is empty.");
                return true;
            }
            String strA = hzbVar.a(str);
            da4Var.u(strA);
            da4Var.p(strA);
            this.mNode.s(strA);
            MessageCacheManager.INSTANCE.l(str, strA);
            return true;
        }
        if (numValueOf != null && 100003 == numValueOf.intValue()) {
            t7bVar.b(TAG, "onReceived no voice input error");
            payload.put("code", 2000003);
            return false;
        }
        if (numValueOf != null && 100062 == numValueOf.intValue()) {
            return true;
        }
        if ((numValueOf == null || 100101 != numValueOf.intValue()) && ((numValueOf == null || 100102 != numValueOf.intValue()) && (numValueOf == null || 100104 != numValueOf.intValue()))) {
            return false;
        }
        t7bVar.b(TAG, "onReceived cloud wakeup exception");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", "confirm");
        jSONObject.put("confidence", 0.0d);
        jSONObject.put("errorCode", numValueOf.intValue());
        r43 r43Var = this.mNode;
        String[] strArr = new String[3];
        strArr[0] = "exception";
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "paramObj.toString()");
        strArr[1] = string;
        String recordId = conversationInfo.getRecordId();
        strArr[2] = recordId != null ? recordId : "";
        r43Var.r("cloudCheck.info", strArr);
        return true;
    }

    public final void d(ConversationInfo conversationInfo, JSONObject payload) {
        this.legacyMessageProcessor.a(conversationInfo.getRecordId(), conversationInfo.getSessionId(), conversationInfo.getCurrentRecordId(), payload == null ? null : payload.toString());
    }

    public final void e(JSONObject payload, ConversationInfo conversationInfo) {
        String strOptString = payload == null ? null : payload.optString(EngineConstant.WAKEUP_TYPE_COMMAND);
        if (strOptString != null) {
            int iHashCode = strOptString.hashCode();
            if (iHashCode == -66277176) {
                strOptString.equals("waitAsrResult");
                return;
            }
            if (iHashCode == 1116840762) {
                if (strOptString.equals("waitNlpResult")) {
                    this.mNode.r("oneshot.wait.nlp.result", new String[0]);
                    return;
                }
                return;
            }
            if (iHashCode == 1189544099 && strOptString.equals("nextAudio")) {
                t7b t7bVar = t7b.INSTANCE;
                da4 da4Var = da4.INSTANCE;
                t7bVar.b(TAG, Intrinsics.stringPlus("oneshot state = ", Integer.valueOf(da4Var.g())));
                DmParameter dmParameter = new DmParameter("", null, null, null, 14, null);
                String recordId = conversationInfo.getRecordId();
                if (recordId == null) {
                    recordId = "";
                }
                dmParameter.setRecordId(recordId);
                String sessionId = conversationInfo.getSessionId();
                if (sessionId == null) {
                    sessionId = "";
                }
                dmParameter.setSessionId(sessionId);
                dmParameter.setRequestType(EngineConstant.ONESHOT);
                dmParameter.setRound("2");
                String strK = da4Var.k();
                if (strK == null) {
                    strK = "";
                }
                dmParameter.setWakeupWord(strK);
                String strA = da4Var.a();
                dmParameter.setAiType(strA != null ? strA : "");
                this.mNode.t(dmParameter);
                this.mNode.r("oneshot.next.audio", new String[0]);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void f(JSONObject header, JSONObject payload, ConversationInfo conversationInfo) throws JSONException {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) (header == null ? null : header.optString(usm.f17592j)));
        sb.append('.');
        sb.append((Object) (header != null ? header.optString("name") : null));
        String string = sb.toString();
        switch (string.hashCode()) {
            case -1930408027:
                if (string.equals("SpeechRecognizer.RecognizeCommand")) {
                    e(payload, conversationInfo);
                    break;
                }
                break;
            case 837341923:
                if (string.equals("SpeechRecognizer.StreamRecognizeResult")) {
                    g(payload, conversationInfo);
                    break;
                }
                break;
            case 1268874252:
                if (string.equals("SpeechRecognizer.CloudWakeup")) {
                    k(payload, conversationInfo);
                    break;
                }
                break;
            case 1327948931:
                if (string.equals("SpeechRecognizer.RecognizeResult")) {
                    b(payload, conversationInfo);
                    break;
                }
                break;
        }
    }

    public final void g(JSONObject payload, ConversationInfo conversationInfo) throws JSONException {
        String text;
        String strOptString = payload == null ? null : payload.optString("content");
        String strOptString2 = payload == null ? null : payload.optString("type");
        String strOptString3 = payload == null ? null : payload.optString("mode");
        Integer numValueOf = payload == null ? null : Integer.valueOf(payload.optInt("seqNo"));
        Integer numValueOf2 = payload == null ? null : Integer.valueOf(payload.optInt("replaceIndex"));
        Integer numValueOf3 = payload == null ? null : Integer.valueOf(payload.optInt("oneshotRound"));
        StreamAsrRecorder streamAsrRecorder = StreamAsrRecorder.INSTANCE;
        String recordId = conversationInfo.getRecordId();
        streamAsrRecorder.updateStreamASRBean(recordId == null ? "" : recordId, strOptString == null ? "" : strOptString, strOptString3 == null ? "" : strOptString3, numValueOf == null ? 0 : numValueOf.intValue(), numValueOf2 != null ? numValueOf2.intValue() : 0);
        if (payload != null) {
            StreamASRBean streamASRBean = streamAsrRecorder.getStreamASRBean();
            if (streamASRBean == null || (text = streamASRBean.getText()) == null) {
                text = "";
            }
            payload.put("content", text);
        }
        StreamASRBean streamASRBean2 = streamAsrRecorder.getStreamASRBean();
        i(strOptString2, numValueOf3, streamASRBean2 != null ? streamASRBean2.getText() : null, conversationInfo);
    }

    public final void h(JSONObject payload, ConversationInfo conversationInfo) {
        int length;
        JSONArray jSONArrayOptJSONArray = payload == null ? null : payload.optJSONArray("type");
        if (jSONArrayOptJSONArray == null || (length = jSONArrayOptJSONArray.length()) <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (Intrinsics.areEqual(AckPublish.TYPE_SKILL_REC, jSONArrayOptJSONArray.get(i))) {
                pxb pxbVar = pxb.INSTANCE;
                String currentRecordId = conversationInfo.getCurrentRecordId();
                if (currentRecordId == null) {
                    currentRecordId = "";
                }
                Message messageO = pxbVar.o(currentRecordId, new AckPuback(CollectionsKt__CollectionsKt.mutableListOf(AckPublish.TYPE_SKILL_REC)), conversationInfo.getSequenceId());
                messageO.setLogout(false);
                MessageQueueManager messageQueueManagerA = MessageQueueManager.INSTANCE.a();
                if (messageQueueManagerA == null) {
                    return;
                }
                MessageQueueManager.d(messageQueueManagerA, messageO, false, null, false, 14, null);
                return;
            }
            if (i2 >= length) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public final void i(String type, Integer oneshotRound, String content, ConversationInfo conversationInfo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SpeechConstant.KEY_RECORD_ID, conversationInfo.getRecordId());
        jSONObject.put("sessionId", conversationInfo.getSessionId());
        jSONObject.put("pinyin", "");
        jSONObject.put("text", content);
        if (!Intrinsics.areEqual(TYPE_FINAL, type)) {
            if (this.asrBegin) {
                bee.INSTANCE.a();
                this.asrBegin = false;
                this.mNode.r("sys.asr.begin", new String[0]);
            }
            jSONObject.put("eof", "0");
            r43 r43Var = this.mNode;
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "speakJson.toString()");
            r43Var.r("asr.speech.text", string);
            if (da4.INSTANCE.g() == 1) {
                CloudWakeupRecorder.INSTANCE.setOneshotFirstRoundAsrFinal(false);
                return;
            }
            return;
        }
        this.asrBegin = true;
        bee.INSTANCE.b();
        this.mNode.r("sys.asr.end", new String[0]);
        jSONObject.put("eof", "1");
        r43 r43Var2 = this.mNode;
        String string2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "speakJson.toString()");
        r43Var2.r("asr.speech.result", string2);
        if (da4.INSTANCE.g() == 1) {
            CloudWakeupRecorder.INSTANCE.setOneshotFirstRoundAsrFinal(true);
        }
        if (oneshotRound != null && oneshotRound.intValue() == 1) {
            StreamAsrRecorder.INSTANCE.clearTextWhenOneshotFinal();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean j(JSONArray directivesJsonArray, ConversationInfo conversationInfo) {
        int length = directivesJsonArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JSONObject jSONObjectOptJSONObject = directivesJsonArray.optJSONObject(i);
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.optJSONObject(SpeechConstant.KEY_TTS_REQUEST_HEADER);
                String strOptString = jSONObjectOptJSONObject2 == null ? null : jSONObjectOptJSONObject2.optString(usm.f17592j);
                String strOptString2 = jSONObjectOptJSONObject2 == null ? null : jSONObjectOptJSONObject2.optString("name");
                StringBuilder sb = new StringBuilder();
                sb.append((Object) strOptString);
                sb.append('.');
                sb.append((Object) strOptString2);
                String string = sb.toString();
                if (Intrinsics.areEqual(strOptString, "Command") && Intrinsics.areEqual(string, "Command.AckPublish")) {
                    h(jSONObjectOptJSONObject.optJSONObject("payload"), conversationInfo);
                    sq mAgent = HeytapSpeechEngine.INSTANCE.getInstance().getMAgent();
                    if (mAgent != null) {
                        mAgent.onReceiveNlpResults(conversationInfo);
                    }
                } else if (Intrinsics.areEqual(strOptString, "SpeechRecognizer") && Intrinsics.areEqual(string, "SpeechRecognizer.RecognizeResult")) {
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("payload");
                    String strOptString3 = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optString("type") : null;
                    sq mAgent2 = HeytapSpeechEngine.INSTANCE.getInstance().getMAgent();
                    if (mAgent2 != null) {
                        mAgent2.onReceiveAsrResults(Intrinsics.areEqual(TYPE_FINAL, strOptString3), conversationInfo);
                    }
                } else if (Intrinsics.areEqual(strOptString, "SpeechRecognizer") && Intrinsics.areEqual(string, "SpeechRecognizer.StreamRecognizeResult")) {
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("payload");
                    String strOptString4 = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString("type") : null;
                    sq mAgent3 = HeytapSpeechEngine.INSTANCE.getInstance().getMAgent();
                    if (mAgent3 != null) {
                        mAgent3.onReceiveAsrResults(Intrinsics.areEqual(TYPE_FINAL, strOptString4), conversationInfo);
                    }
                } else if (Intrinsics.areEqual(strOptString, "Exception") && Intrinsics.areEqual(string, "Exception.ServiceStatus")) {
                    JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject.optJSONObject("payload");
                    Integer numValueOf = jSONObjectOptJSONObject5 != null ? Integer.valueOf(jSONObjectOptJSONObject5.optInt("code")) : null;
                    if (numValueOf != null && 100062 == numValueOf.intValue()) {
                        Message messageG = pxb.INSTANCE.g();
                        MessageQueueManager messageQueueManagerA = MessageQueueManager.INSTANCE.a();
                        if (messageQueueManagerA != null) {
                            MessageQueueManager.d(messageQueueManagerA, messageG, false, 0, false, 8, null);
                        }
                        return true;
                    }
                } else if (Intrinsics.areEqual("CustomerData", strOptString)) {
                    JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject.optJSONObject("payload");
                    ilk.INSTANCE.c(jSONObjectOptJSONObject6 != null ? jSONObjectOptJSONObject6.toString() : null);
                    return true;
                }
                if (i2 < length) {
                    i = i2;
                }
            }
        }
        return false;
    }

    public final void k(JSONObject payload, ConversationInfo conversationInfo) {
        r43 r43Var = this.mNode;
        String[] strArr = new String[3];
        strArr[0] = "result";
        strArr[1] = String.valueOf(payload);
        String recordId = conversationInfo.getRecordId();
        if (recordId == null) {
            recordId = "";
        }
        strArr[2] = recordId;
        r43Var.r("cloudCheck.info", strArr);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0077  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a8 A[LOOP:0: B:7:0x0024->B:82:0x01a8, LOOP_END] */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0116, code lost:
    
        if (c(r10.optJSONObject("payload"), r24) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0118, code lost:
    
        r18 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011c, code lost:
    
        r12 = r19;
        r13 = r20;
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0135, code lost:
    
        if (com.oplus.aiunit.vision.ilk.INSTANCE.b(r10.optJSONObject("payload")) != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(@Nullable String originData, @Nullable JSONArray directivesJsonArray, @NotNull ConversationInfo conversationInfo) throws JSONException {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        boolean z4;
        sq mAgent;
        String str2;
        boolean z5;
        boolean z6;
        boolean z7;
        JSONObject jSONObjectOptJSONObject;
        Directive<? extends DirectivePayload> directive;
        boolean z8;
        JSONArray jSONArray = directivesJsonArray;
        Intrinsics.checkNotNullParameter(conversationInfo, "conversationInfo");
        if (jSONArray != null) {
            int length = directivesJsonArray.length();
            List<Directive<? extends DirectivePayload>> arrayList = new ArrayList<>();
            String str3 = "";
            if (length > 0) {
                String strA = "";
                int i = 0;
                boolean z9 = true;
                z = false;
                z2 = false;
                z4 = true;
                String strOptString = null;
                while (true) {
                    int i2 = i + 1;
                    JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(SpeechConstant.KEY_TTS_REQUEST_HEADER)) == null) {
                        str2 = str3;
                        z5 = z9;
                        z6 = z;
                        z7 = z2;
                    } else {
                        String strOptString2 = jSONObjectOptJSONObject.optString(usm.f17592j);
                        String strOptString3 = jSONObjectOptJSONObject.optString("name");
                        str2 = str3;
                        StringBuilder sb = new StringBuilder();
                        sb.append(strOptString2);
                        z5 = z9;
                        sb.append('.');
                        sb.append((Object) strOptString3);
                        String string = sb.toString();
                        z6 = z;
                        z7 = z2;
                        if (Intrinsics.areEqual(string, "SpeechRecognizer.ExpectSpeech")) {
                            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("payload");
                            if (jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optBoolean("newAi", false) : false) {
                                z8 = true;
                            } else {
                                JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject2.optJSONObject("payload");
                                if (Intrinsics.areEqual(jSONObjectOptJSONObject4 == null ? null : jSONObjectOptJSONObject4.optString("micAct"), "on")) {
                                    z8 = false;
                                } else {
                                    z8 = true;
                                }
                            }
                            JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject2.optJSONObject("payload");
                            strOptString = jSONObjectOptJSONObject5 == null ? null : jSONObjectOptJSONObject5.optString(EngineConstant.REASON);
                            if (ptk.INSTANCE.a()) {
                                z2 = z7;
                                z = true;
                                z4 = true;
                            } else {
                                z4 = z8;
                                z2 = z7;
                                z = true;
                            }
                        } else if (Intrinsics.areEqual(string, "SpeechSynthesizer.OutputSpeech")) {
                            JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject2.optJSONObject("payload");
                            boolean zOptBoolean = jSONObjectOptJSONObject6 == null ? false : jSONObjectOptJSONObject6.optBoolean("newAi", false);
                            strA = zOptBoolean ? str2 : a(jSONObjectOptJSONObject2.optJSONObject("payload"));
                            z = z6;
                            z2 = true;
                            if (!zOptBoolean) {
                            }
                            if (i2 >= length) {
                                str = strOptString;
                                str3 = strA;
                                z3 = z5;
                                break;
                            } else {
                                jSONArray = directivesJsonArray;
                                i = i2;
                                str3 = str2;
                                z9 = z5;
                            }
                        } else {
                            if (Intrinsics.areEqual(string, "SpeechRecognizer.VadControl")) {
                                o(jSONObjectOptJSONObject2.optJSONObject("payload"));
                            } else {
                                if (Intrinsics.areEqual(strOptString2, "SpeechRecognizer")) {
                                    f(jSONObjectOptJSONObject, jSONObjectOptJSONObject2.optJSONObject("payload"), conversationInfo);
                                } else if (!Intrinsics.areEqual(strOptString2, "Exception")) {
                                    if (!Intrinsics.areEqual(string, "Command.UploadEvent")) {
                                        if (!Intrinsics.areEqual(string, "CustomerData.UploadResult")) {
                                            if (Intrinsics.areEqual(strOptString2, "Legacy")) {
                                                d(conversationInfo, jSONObjectOptJSONObject2.optJSONObject("payload"));
                                                z3 = false;
                                                str = strOptString;
                                                str3 = strA;
                                                z = z6;
                                                z2 = z7;
                                                break;
                                            }
                                        }
                                    }
                                }
                                z5 = false;
                            }
                            z = z6;
                            z2 = z7;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((Object) strOptString2);
                        sb2.append('.');
                        sb2.append((Object) strOptString3);
                        String string2 = sb2.toString();
                        if (!ArraysKt___ArraysKt.contains(d, string2) && (directive = (Directive) gia.c(jSONObjectOptJSONObject2.toString(), Directive.class, l78.INSTANCE.c(string2))) != null) {
                            arrayList.add(directive);
                        }
                        if (i2 >= length) {
                            str = strOptString;
                            str3 = strA;
                            z3 = z5;
                            break;
                        } else {
                            jSONArray = directivesJsonArray;
                            i = i2;
                            str3 = str2;
                            z9 = z5;
                        }
                    }
                    z = z6;
                    z2 = z7;
                    if (i2 >= length) {
                        str = strOptString;
                        str3 = strA;
                        z3 = z5;
                        break;
                    } else {
                        jSONArray = directivesJsonArray;
                        i = i2;
                        str3 = str2;
                        z9 = z5;
                    }
                }
            } else {
                z = false;
                z2 = false;
                str = null;
                z3 = true;
                z4 = true;
            }
            if (z3 && (mAgent = HeytapSpeechEngine.INSTANCE.getInstance().getMAgent()) != null) {
                mAgent.onDirectivesReceived(originData);
            }
            if (da4.INSTANCE.g() == 1 && CloudWakeupRecorder.INSTANCE.getCloudCheckTimerId() > 0) {
                t7b.INSTANCE.b(TAG, "processDirectives asr oneshot ignore RecognizeResult");
                for (Directive<? extends DirectivePayload> directive2 : arrayList) {
                    if (directive2.getPayload() instanceof RecognizeResult) {
                        CloudWakeupRecorder cloudWakeupRecorder = CloudWakeupRecorder.INSTANCE;
                        cloudWakeupRecorder.setRecognizeResultDirective(directive2);
                        cloudWakeupRecorder.setRecognizeOriginal(originData);
                    }
                }
                Directive<? extends DirectivePayload> recognizeResultDirective = CloudWakeupRecorder.INSTANCE.getRecognizeResultDirective();
                if (recognizeResultDirective != null) {
                    arrayList.remove(recognizeResultDirective);
                }
            }
            if (z) {
                m(str3, z4, str, conversationInfo);
            }
            if (arrayList.size() > 0) {
                t7b.INSTANCE.b(TAG, "directiveList.size " + arrayList.size() + ", hasExpectSpeech is " + z + ", hasOutputSpeech is " + z2);
                if (z && z2) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (!(((Directive) obj).getPayload() instanceof OutputSpeech)) {
                            arrayList2.add(obj);
                        }
                    }
                    arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
                }
                HeytapSpeechEngine.Companion companion = HeytapSpeechEngine.INSTANCE;
                companion.getInstance().getClass();
                companion.getInstance().preProcess$speechEngine_release(arrayList);
                umd.INSTANCE.a().k(arrayList, originData);
            }
        }
    }

    public final void m(String nlg, boolean shouldEndSession, String reason, ConversationInfo conversationInfo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("shouldEndSession", shouldEndSession);
        jSONObject.put("nlg", nlg);
        if (reason != null) {
            jSONObject.put(EngineConstant.REASON, reason);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("dm", jSONObject);
        jSONObject2.put(SpeechConstant.KEY_RECORD_ID, conversationInfo.getRecordId());
        jSONObject2.put("sessionId", conversationInfo.getSessionId());
        r43 r43Var = this.mNode;
        String string = jSONObject2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "dmJson.toString()");
        r43Var.r("dm.output", string);
        da4.INSTANCE.s(!shouldEndSession);
        bee beeVar = bee.INSTANCE;
        beeVar.g();
        beeVar.c();
    }

    public final void n(@NotNull String messageContent) {
        Iterator<String> itKeys;
        Intrinsics.checkNotNullParameter(messageContent, "messageContent");
        try {
            sq mAgent = HeytapSpeechEngine.INSTANCE.getInstance().getMAgent();
            if (mAgent != null) {
                mAgent.m(null);
            }
            JSONObject jSONObject = new JSONObject(messageContent);
            String strOptString = jSONObject.optString(SpeechConstant.KEY_ORIGINAL_RECORD_ID);
            String strOptString2 = jSONObject.optString("sessionId");
            String strOptString3 = jSONObject.optString(SpeechConstant.KEY_RECORD_ID);
            String strOptString4 = jSONObject.optString("roomId");
            String strOptString5 = jSONObject.optString("uniqueId");
            int iOptInt = jSONObject.optInt("sequenceId", -1);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extend");
            HashMap map = new HashMap();
            if (jSONObjectOptJSONObject != null && (itKeys = jSONObjectOptJSONObject.keys()) != null) {
                while (itKeys.hasNext()) {
                    String item = itKeys.next();
                    Intrinsics.checkNotNullExpressionValue(item, "item");
                    String strOptString6 = jSONObjectOptJSONObject.optString(item, "");
                    Intrinsics.checkNotNullExpressionValue(strOptString6, "extend.optString(item, \"\")");
                    map.put(item, strOptString6);
                }
            }
            da4 da4Var = da4.INSTANCE;
            ConversationInfo conversationInfo = new ConversationInfo(strOptString, strOptString3, strOptString2, da4Var.b(), da4Var.d(), strOptString4, strOptString5, iOptInt >= 0 ? Integer.valueOf(iOptInt) : null, map);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("directives");
            if (jSONArrayOptJSONArray != null && j(jSONArrayOptJSONArray, conversationInfo)) {
                return;
            }
            HeytapSpeechEngine.Companion companion = HeytapSpeechEngine.INSTANCE;
            if (companion.getInstance().onDirectiveFilter$speechEngine_release(da4Var.j(), da4Var.h(), messageContent)) {
                t7b.INSTANCE.b(TAG, "processMessage , onDirectiveFilter , return.");
                sq mAgent2 = companion.getInstance().getMAgent();
                if (mAgent2 != null) {
                    mAgent2.onAppIntercept(conversationInfo);
                }
                this.mNode.r("cancel.dm.timeout", new String[0]);
                return;
            }
            Pair<Boolean, Boolean> pairP = p(jSONObject, messageContent);
            if (pairP.getFirst().booleanValue() && pairP.getSecond().booleanValue()) {
                if (iOptInt >= 0) {
                    da4Var.v(Integer.valueOf(iOptInt));
                }
                da4Var.o(jSONObject.optString("conversationId", ""));
                da4Var.q(jSONObject.optString(ShowDialogExecutor.JSON_DIALOG_ID_KEY, ""));
                da4Var.p(strOptString3);
                conversationInfo.i(da4Var.d());
                conversationInfo.g(da4Var.b());
                l(messageContent, jSONArrayOptJSONArray, conversationInfo);
                return;
            }
            if (!pairP.getFirst().booleanValue()) {
                t7b.INSTANCE.k(TAG, Intrinsics.stringPlus("recordId is change , new record id is ", da4Var.h()));
                sq mAgent3 = companion.getInstance().getMAgent();
                if (mAgent3 != null) {
                    mAgent3.onDirectivesDiscard(messageContent, 1, conversationInfo);
                }
            }
            if (!pairP.getSecond().booleanValue()) {
                t7b.INSTANCE.k(TAG, Intrinsics.stringPlus("sequenceId error , sequenceId is ", da4Var.i()));
            }
            this.mNode.r("cancel.dm.timeout", new String[0]);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void o(JSONObject payload) {
        if (da4.INSTANCE.g() == 1) {
            return;
        }
        Integer numValueOf = payload == null ? null : Integer.valueOf(payload.optInt("status"));
        if (numValueOf != null && numValueOf.intValue() == 2) {
            this.mNode.r("sys.vad.end", new String[0]);
        }
    }

    public final Pair<Boolean, Boolean> p(JSONObject messageObj, String messageContent) throws JSONException {
        String recordId = messageObj.optString(SpeechConstant.KEY_ORIGINAL_RECORD_ID);
        Intrinsics.checkNotNullExpressionValue(recordId, "recordId");
        boolean zR = true;
        if (!(recordId.length() > 0) || Intrinsics.areEqual(da4.INSTANCE.h(), recordId)) {
            if (recordId.length() == 0) {
                zR = r(messageObj);
            }
        } else {
            zR = s(messageObj, messageContent, recordId);
        }
        return new Pair<>(Boolean.valueOf(zR), Boolean.valueOf(q(messageObj)));
    }

    public final boolean q(JSONObject messageObj) {
        int iOptInt = messageObj.optInt("sequenceId", -1);
        if (iOptInt == -1 || iOptInt == 0) {
            return true;
        }
        if (Intrinsics.areEqual(HeytapSpeechEngine.INSTANCE.getInstance().getEngineConfig().getConfig(EngineConstant.KEY_VALID_SEQUENCE_TYPE, ""), EngineConstant.SEQUENCE_TYPE_CONTINUOUS)) {
            Integer numI = da4.INSTANCE.i();
            if (iOptInt == (numI == null ? 0 : numI.intValue() + 1)) {
                return true;
            }
        } else {
            Integer numI2 = da4.INSTANCE.i();
            if (iOptInt > (numI2 != null ? numI2.intValue() : -1)) {
                return true;
            }
        }
        return false;
    }

    public final boolean r(JSONObject messageObj) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = messageObj.optJSONArray("directives");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return false;
        }
        JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(0);
        String strOptString = null;
        if (jSONObject != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject(SpeechConstant.KEY_TTS_REQUEST_HEADER)) != null) {
            strOptString = jSONObjectOptJSONObject.optString(usm.f17592j);
        }
        return Intrinsics.areEqual("Exception", strOptString) || Intrinsics.areEqual("Recommend", strOptString);
    }

    public final boolean s(JSONObject messageObj, String messageContent, String recordId) throws JSONException {
        int length;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray = messageObj.optJSONArray("directives");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0 && (length = jSONArrayOptJSONArray.length()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                String strOptString = (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject(SpeechConstant.KEY_TTS_REQUEST_HEADER)) == null) ? null : jSONObjectOptJSONObject.optString(usm.f17592j);
                String strOptString2 = (jSONObject == null || (jSONObjectOptJSONObject2 = jSONObject.optJSONObject(SpeechConstant.KEY_TTS_REQUEST_HEADER)) == null) ? null : jSONObjectOptJSONObject2.optString("name");
                StringBuilder sb = new StringBuilder();
                sb.append((Object) strOptString);
                sb.append('.');
                sb.append((Object) strOptString2);
                if (Intrinsics.areEqual("SpeechRecognizer.CloudWakeup", sb.toString())) {
                    break;
                }
                CloudWakeupRecorder cloudWakeupRecorder = CloudWakeupRecorder.INSTANCE;
                if (Intrinsics.areEqual(cloudWakeupRecorder.getRecordId(), recordId)) {
                    break;
                }
                if (Intrinsics.areEqual("Exception", strOptString)) {
                    JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("payload");
                    Integer numValueOf = jSONObjectOptJSONObject3 != null ? Integer.valueOf(jSONObjectOptJSONObject3.optInt("code")) : null;
                    if ((numValueOf != null && 100101 == numValueOf.intValue()) || ((numValueOf != null && 100102 == numValueOf.intValue()) || ((numValueOf != null && 100104 == numValueOf.intValue()) || Intrinsics.areEqual(cloudWakeupRecorder.getRecordId(), recordId)))) {
                        return true;
                    }
                } else if (Intrinsics.areEqual("ActivePush", strOptString)) {
                    JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("payload");
                    if (Intrinsics.areEqual(jSONObjectOptJSONObject4 != null ? Boolean.valueOf(jSONObjectOptJSONObject4.optBoolean("ignoreVerificationRecordId", false)) : null, Boolean.TRUE)) {
                        z3f.INSTANCE.a((PushData) gia.b(jSONObjectOptJSONObject4.getJSONObject("data").toString(), PushData.class), messageContent);
                        return false;
                    }
                }
                if (i2 < length) {
                    i = i2;
                }
            }
            return true;
        }
        return false;
    }
}
