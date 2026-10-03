package com.heytap.speech.engine.internal.data;

import androidx.annotation.Keep;
import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bq\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010%J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010t\u001a\u00020\u0017HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010v\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010~\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010-J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003JØ\u0002\u0010\u0088\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0003\u0010\u0089\u0001J\u0015\u0010\u008a\u0001\u001a\u00020\u00172\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u008c\u0001\u001a\u00030\u008d\u0001HÖ\u0001J\n\u0010\u008e\u0001\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R\u001e\u0010\"\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010'\"\u0004\b>\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010'\"\u0004\b@\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010'\"\u0004\bF\u0010)R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010'\"\u0004\bH\u0010)R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010'\"\u0004\bJ\u0010)R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010'\"\u0004\bL\u0010)R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010'\"\u0004\bN\u0010)R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010'\"\u0004\bP\u0010)R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010'\"\u0004\bR\u0010)R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010'\"\u0004\bX\u0010)R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010'\"\u0004\b^\u0010)R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010'\"\u0004\b`\u0010)R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010'\"\u0004\bb\u0010)R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010'\"\u0004\bd\u0010)R\u001e\u0010$\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\be\u0010-\"\u0004\bf\u0010/R\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010'\"\u0004\bh\u0010)R\u001c\u0010!\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010'\"\u0004\bj\u0010)R\u001c\u0010#\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010'\"\u0004\bl\u0010)¨\u0006\u008f\u0001"}, d2 = {"Lcom/heytap/speech/engine/internal/data/Task;", "", "audioText", "", "audioUrl", EngineConstant.WAKEUP_TYPE_COMMAND, "Lcom/heytap/speech/engine/internal/data/Command;", "endSessionReason", "Lcom/heytap/speech/engine/internal/data/EndSessionReason;", "error", "Lcom/heytap/speech/engine/internal/data/Error;", "intentName", "listen", "nativeapi", "Lcom/heytap/speech/engine/internal/data/Nativeapi;", "nlg", "nlu", EngineConstant.ONESHOT, SpeechConstant.KEY_RECORD_ID, "refText", "runSequence", "sessionId", "shouldEndSession", "", "skillId", "speakList", "", "Lcom/heytap/speech/engine/internal/data/Speak;", "speakType", "speakUrl", "speech", EngineConstant.TTS_TYPE_SSML, "taskId", "tips", EngineConstant.CLOUD_CHECK, "wakeupWord", "startVad", "(Ljava/lang/String;Ljava/lang/String;Lcom/heytap/speech/engine/internal/data/Command;Lcom/heytap/speech/engine/internal/data/EndSessionReason;Lcom/heytap/speech/engine/internal/data/Error;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/speech/engine/internal/data/Nativeapi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAudioText", "()Ljava/lang/String;", "setAudioText", "(Ljava/lang/String;)V", "getAudioUrl", "setAudioUrl", "getCloudCheck", "()Ljava/lang/Boolean;", "setCloudCheck", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getCommand", "()Lcom/heytap/speech/engine/internal/data/Command;", "setCommand", "(Lcom/heytap/speech/engine/internal/data/Command;)V", "getEndSessionReason", "()Lcom/heytap/speech/engine/internal/data/EndSessionReason;", "setEndSessionReason", "(Lcom/heytap/speech/engine/internal/data/EndSessionReason;)V", "getError", "()Lcom/heytap/speech/engine/internal/data/Error;", "setError", "(Lcom/heytap/speech/engine/internal/data/Error;)V", "getIntentName", "setIntentName", "getListen", "setListen", "getNativeapi", "()Lcom/heytap/speech/engine/internal/data/Nativeapi;", "setNativeapi", "(Lcom/heytap/speech/engine/internal/data/Nativeapi;)V", "getNlg", "setNlg", "getNlu", "setNlu", "getOneshot", "setOneshot", "getRecordId", "setRecordId", "getRefText", "setRefText", "getRunSequence", "setRunSequence", "getSessionId", "setSessionId", "getShouldEndSession", "()Z", "setShouldEndSession", "(Z)V", "getSkillId", "setSkillId", "getSpeakList", "()Ljava/util/List;", "setSpeakList", "(Ljava/util/List;)V", "getSpeakType", "setSpeakType", "getSpeakUrl", "setSpeakUrl", "getSpeech", "setSpeech", "getSsml", "setSsml", "getStartVad", "setStartVad", "getTaskId", "setTaskId", "getTips", "setTips", "getWakeupWord", "setWakeupWord", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/heytap/speech/engine/internal/data/Command;Lcom/heytap/speech/engine/internal/data/EndSessionReason;Lcom/heytap/speech/engine/internal/data/Error;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/speech/engine/internal/data/Nativeapi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/heytap/speech/engine/internal/data/Task;", "equals", "other", "hashCode", "", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Task {

    @Nullable
    private String audioText;

    @Nullable
    private String audioUrl;

    @Nullable
    private Boolean cloudCheck;

    @Nullable
    private Command command;

    @Nullable
    private EndSessionReason endSessionReason;

    @Nullable
    private Error error;

    @Nullable
    private String intentName;

    @Nullable
    private String listen;

    @Nullable
    private Nativeapi nativeapi;

    @Nullable
    private String nlg;

    @Nullable
    private String nlu;

    @Nullable
    private String oneshot;

    @Nullable
    private String recordId;

    @Nullable
    private String refText;

    @Nullable
    private String runSequence;

    @Nullable
    private String sessionId;
    private boolean shouldEndSession;

    @Nullable
    private String skillId;

    @Nullable
    private List<Speak> speakList;

    @Nullable
    private String speakType;

    @Nullable
    private String speakUrl;

    @Nullable
    private String speech;

    @Nullable
    private String ssml;

    @Nullable
    private Boolean startVad;

    @Nullable
    private String taskId;

    @Nullable
    private String tips;

    @Nullable
    private String wakeupWord;

    public Task() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 134217727, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAudioText() {
        return this.audioText;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getNlu() {
        return this.nlu;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getOneshot() {
        return this.oneshot;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getRecordId() {
        return this.recordId;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getRefText() {
        return this.refText;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getRunSequence() {
        return this.runSequence;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getShouldEndSession() {
        return this.shouldEndSession;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getSkillId() {
        return this.skillId;
    }

    @Nullable
    public final List<Speak> component18() {
        return this.speakList;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getSpeakType() {
        return this.speakType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAudioUrl() {
        return this.audioUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getSpeakUrl() {
        return this.speakUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getSpeech() {
        return this.speech;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getSsml() {
        return this.ssml;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Boolean getCloudCheck() {
        return this.cloudCheck;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getWakeupWord() {
        return this.wakeupWord;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Boolean getStartVad() {
        return this.startVad;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Command getCommand() {
        return this.command;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EndSessionReason getEndSessionReason() {
        return this.endSessionReason;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Error getError() {
        return this.error;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIntentName() {
        return this.intentName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getListen() {
        return this.listen;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Nativeapi getNativeapi() {
        return this.nativeapi;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getNlg() {
        return this.nlg;
    }

    @NotNull
    public final Task copy(@Nullable String audioText, @Nullable String audioUrl, @Nullable Command command, @Nullable EndSessionReason endSessionReason, @Nullable Error error, @Nullable String intentName, @Nullable String listen, @Nullable Nativeapi nativeapi, @Nullable String nlg, @Nullable String nlu, @Nullable String oneshot, @Nullable String recordId, @Nullable String refText, @Nullable String runSequence, @Nullable String sessionId, boolean shouldEndSession, @Nullable String skillId, @Nullable List<Speak> speakList, @Nullable String speakType, @Nullable String speakUrl, @Nullable String speech, @Nullable String ssml, @Nullable String taskId, @Nullable String tips, @Nullable Boolean cloudCheck, @Nullable String wakeupWord, @Nullable Boolean startVad) {
        return new Task(audioText, audioUrl, command, endSessionReason, error, intentName, listen, nativeapi, nlg, nlu, oneshot, recordId, refText, runSequence, sessionId, shouldEndSession, skillId, speakList, speakType, speakUrl, speech, ssml, taskId, tips, cloudCheck, wakeupWord, startVad);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Task)) {
            return false;
        }
        Task task = (Task) other;
        return Intrinsics.areEqual(this.audioText, task.audioText) && Intrinsics.areEqual(this.audioUrl, task.audioUrl) && Intrinsics.areEqual(this.command, task.command) && Intrinsics.areEqual(this.endSessionReason, task.endSessionReason) && Intrinsics.areEqual(this.error, task.error) && Intrinsics.areEqual(this.intentName, task.intentName) && Intrinsics.areEqual(this.listen, task.listen) && Intrinsics.areEqual(this.nativeapi, task.nativeapi) && Intrinsics.areEqual(this.nlg, task.nlg) && Intrinsics.areEqual(this.nlu, task.nlu) && Intrinsics.areEqual(this.oneshot, task.oneshot) && Intrinsics.areEqual(this.recordId, task.recordId) && Intrinsics.areEqual(this.refText, task.refText) && Intrinsics.areEqual(this.runSequence, task.runSequence) && Intrinsics.areEqual(this.sessionId, task.sessionId) && this.shouldEndSession == task.shouldEndSession && Intrinsics.areEqual(this.skillId, task.skillId) && Intrinsics.areEqual(this.speakList, task.speakList) && Intrinsics.areEqual(this.speakType, task.speakType) && Intrinsics.areEqual(this.speakUrl, task.speakUrl) && Intrinsics.areEqual(this.speech, task.speech) && Intrinsics.areEqual(this.ssml, task.ssml) && Intrinsics.areEqual(this.taskId, task.taskId) && Intrinsics.areEqual(this.tips, task.tips) && Intrinsics.areEqual(this.cloudCheck, task.cloudCheck) && Intrinsics.areEqual(this.wakeupWord, task.wakeupWord) && Intrinsics.areEqual(this.startVad, task.startVad);
    }

    @Nullable
    public final String getAudioText() {
        return this.audioText;
    }

    @Nullable
    public final String getAudioUrl() {
        return this.audioUrl;
    }

    @Nullable
    public final Boolean getCloudCheck() {
        return this.cloudCheck;
    }

    @Nullable
    public final Command getCommand() {
        return this.command;
    }

    @Nullable
    public final EndSessionReason getEndSessionReason() {
        return this.endSessionReason;
    }

    @Nullable
    public final Error getError() {
        return this.error;
    }

    @Nullable
    public final String getIntentName() {
        return this.intentName;
    }

    @Nullable
    public final String getListen() {
        return this.listen;
    }

    @Nullable
    public final Nativeapi getNativeapi() {
        return this.nativeapi;
    }

    @Nullable
    public final String getNlg() {
        return this.nlg;
    }

    @Nullable
    public final String getNlu() {
        return this.nlu;
    }

    @Nullable
    public final String getOneshot() {
        return this.oneshot;
    }

    @Nullable
    public final String getRecordId() {
        return this.recordId;
    }

    @Nullable
    public final String getRefText() {
        return this.refText;
    }

    @Nullable
    public final String getRunSequence() {
        return this.runSequence;
    }

    @Nullable
    public final String getSessionId() {
        return this.sessionId;
    }

    public final boolean getShouldEndSession() {
        return this.shouldEndSession;
    }

    @Nullable
    public final String getSkillId() {
        return this.skillId;
    }

    @Nullable
    public final List<Speak> getSpeakList() {
        return this.speakList;
    }

    @Nullable
    public final String getSpeakType() {
        return this.speakType;
    }

    @Nullable
    public final String getSpeakUrl() {
        return this.speakUrl;
    }

    @Nullable
    public final String getSpeech() {
        return this.speech;
    }

    @Nullable
    public final String getSsml() {
        return this.ssml;
    }

    @Nullable
    public final Boolean getStartVad() {
        return this.startVad;
    }

    @Nullable
    public final String getTaskId() {
        return this.taskId;
    }

    @Nullable
    public final String getTips() {
        return this.tips;
    }

    @Nullable
    public final String getWakeupWord() {
        return this.wakeupWord;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [int] */
    /* JADX WARN: Type inference failed for: r2v43, types: [int] */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r2v99 */
    public int hashCode() {
        String str = this.audioText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.audioUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Command command = this.command;
        int iHashCode3 = (iHashCode2 + (command == null ? 0 : command.hashCode())) * 31;
        EndSessionReason endSessionReason = this.endSessionReason;
        int iHashCode4 = (iHashCode3 + (endSessionReason == null ? 0 : endSessionReason.hashCode())) * 31;
        Error error = this.error;
        int iHashCode5 = (iHashCode4 + (error == null ? 0 : error.hashCode())) * 31;
        String str3 = this.intentName;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.listen;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Nativeapi nativeapi = this.nativeapi;
        int iHashCode8 = (iHashCode7 + (nativeapi == null ? 0 : nativeapi.hashCode())) * 31;
        String str5 = this.nlg;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.nlu;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.oneshot;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.recordId;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.refText;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.runSequence;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.sessionId;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        boolean z = this.shouldEndSession;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode15 + r2) * 31;
        String str12 = this.skillId;
        int iHashCode16 = (i + (str12 == null ? 0 : str12.hashCode())) * 31;
        List<Speak> list = this.speakList;
        int iHashCode17 = (iHashCode16 + (list == null ? 0 : list.hashCode())) * 31;
        String str13 = this.speakType;
        int iHashCode18 = (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.speakUrl;
        int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.speech;
        int iHashCode20 = (iHashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.ssml;
        int iHashCode21 = (iHashCode20 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.taskId;
        int iHashCode22 = (iHashCode21 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.tips;
        int iHashCode23 = (iHashCode22 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Boolean bool = this.cloudCheck;
        int iHashCode24 = (iHashCode23 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str19 = this.wakeupWord;
        int iHashCode25 = (iHashCode24 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Boolean bool2 = this.startVad;
        return iHashCode25 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final void setAudioText(@Nullable String str) {
        this.audioText = str;
    }

    public final void setAudioUrl(@Nullable String str) {
        this.audioUrl = str;
    }

    public final void setCloudCheck(@Nullable Boolean bool) {
        this.cloudCheck = bool;
    }

    public final void setCommand(@Nullable Command command) {
        this.command = command;
    }

    public final void setEndSessionReason(@Nullable EndSessionReason endSessionReason) {
        this.endSessionReason = endSessionReason;
    }

    public final void setError(@Nullable Error error) {
        this.error = error;
    }

    public final void setIntentName(@Nullable String str) {
        this.intentName = str;
    }

    public final void setListen(@Nullable String str) {
        this.listen = str;
    }

    public final void setNativeapi(@Nullable Nativeapi nativeapi) {
        this.nativeapi = nativeapi;
    }

    public final void setNlg(@Nullable String str) {
        this.nlg = str;
    }

    public final void setNlu(@Nullable String str) {
        this.nlu = str;
    }

    public final void setOneshot(@Nullable String str) {
        this.oneshot = str;
    }

    public final void setRecordId(@Nullable String str) {
        this.recordId = str;
    }

    public final void setRefText(@Nullable String str) {
        this.refText = str;
    }

    public final void setRunSequence(@Nullable String str) {
        this.runSequence = str;
    }

    public final void setSessionId(@Nullable String str) {
        this.sessionId = str;
    }

    public final void setShouldEndSession(boolean z) {
        this.shouldEndSession = z;
    }

    public final void setSkillId(@Nullable String str) {
        this.skillId = str;
    }

    public final void setSpeakList(@Nullable List<Speak> list) {
        this.speakList = list;
    }

    public final void setSpeakType(@Nullable String str) {
        this.speakType = str;
    }

    public final void setSpeakUrl(@Nullable String str) {
        this.speakUrl = str;
    }

    public final void setSpeech(@Nullable String str) {
        this.speech = str;
    }

    public final void setSsml(@Nullable String str) {
        this.ssml = str;
    }

    public final void setStartVad(@Nullable Boolean bool) {
        this.startVad = bool;
    }

    public final void setTaskId(@Nullable String str) {
        this.taskId = str;
    }

    public final void setTips(@Nullable String str) {
        this.tips = str;
    }

    public final void setWakeupWord(@Nullable String str) {
        this.wakeupWord = str;
    }

    @NotNull
    public String toString() {
        return "Task(audioText=" + ((Object) this.audioText) + ", audioUrl=" + ((Object) this.audioUrl) + ", command=" + this.command + ", endSessionReason=" + this.endSessionReason + ", error=" + this.error + ", intentName=" + ((Object) this.intentName) + ", listen=" + ((Object) this.listen) + ", nativeapi=" + this.nativeapi + ", nlg=" + ((Object) this.nlg) + ", nlu=" + ((Object) this.nlu) + ", oneshot=" + ((Object) this.oneshot) + ", recordId=" + ((Object) this.recordId) + ", refText=" + ((Object) this.refText) + ", runSequence=" + ((Object) this.runSequence) + ", sessionId=" + ((Object) this.sessionId) + ", shouldEndSession=" + this.shouldEndSession + ", skillId=" + ((Object) this.skillId) + ", speakList=" + this.speakList + ", speakType=" + ((Object) this.speakType) + ", speakUrl=" + ((Object) this.speakUrl) + ", speech=" + ((Object) this.speech) + ", ssml=" + ((Object) this.ssml) + ", taskId=" + ((Object) this.taskId) + ", tips=" + ((Object) this.tips) + ", cloudCheck=" + this.cloudCheck + ", wakeupWord=" + ((Object) this.wakeupWord) + ", startVad=" + this.startVad + ')';
    }

    public Task(@Nullable String str, @Nullable String str2, @Nullable Command command, @Nullable EndSessionReason endSessionReason, @Nullable Error error, @Nullable String str3, @Nullable String str4, @Nullable Nativeapi nativeapi, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, boolean z, @Nullable String str12, @Nullable List<Speak> list, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable Boolean bool, @Nullable String str19, @Nullable Boolean bool2) {
        this.audioText = str;
        this.audioUrl = str2;
        this.command = command;
        this.endSessionReason = endSessionReason;
        this.error = error;
        this.intentName = str3;
        this.listen = str4;
        this.nativeapi = nativeapi;
        this.nlg = str5;
        this.nlu = str6;
        this.oneshot = str7;
        this.recordId = str8;
        this.refText = str9;
        this.runSequence = str10;
        this.sessionId = str11;
        this.shouldEndSession = z;
        this.skillId = str12;
        this.speakList = list;
        this.speakType = str13;
        this.speakUrl = str14;
        this.speech = str15;
        this.ssml = str16;
        this.taskId = str17;
        this.tips = str18;
        this.cloudCheck = bool;
        this.wakeupWord = str19;
        this.startVad = bool2;
    }

    public /* synthetic */ Task(String str, String str2, Command command, EndSessionReason endSessionReason, Error error, String str3, String str4, Nativeapi nativeapi, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, String str12, List list, String str13, String str14, String str15, String str16, String str17, String str18, Boolean bool, String str19, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : command, (i & 8) != 0 ? null : endSessionReason, (i & 16) != 0 ? null : error, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : nativeapi, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (i & 32768) != 0 ? false : z, (i & 65536) != 0 ? null : str12, (i & 131072) != 0 ? null : list, (i & 262144) != 0 ? null : str13, (i & 524288) != 0 ? null : str14, (i & 1048576) != 0 ? null : str15, (i & 2097152) != 0 ? null : str16, (i & 4194304) != 0 ? null : str17, (i & 8388608) != 0 ? null : str18, (i & 16777216) != 0 ? null : bool, (i & 33554432) != 0 ? null : str19, (i & 67108864) != 0 ? null : bool2);
    }
}
