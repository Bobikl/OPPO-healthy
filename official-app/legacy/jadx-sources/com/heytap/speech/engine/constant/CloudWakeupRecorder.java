package com.heytap.speech.engine.constant;

import com.heytap.speech.engine.protocol.directive.Directive;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0017\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R(\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/heytap/speech/engine/constant/CloudWakeupRecorder;", "", "()V", "cloudCheckTimerId", "", "getCloudCheckTimerId", "()J", "setCloudCheckTimerId", "(J)V", "oneshotFirstRoundAsrFinal", "", "getOneshotFirstRoundAsrFinal", "()Z", "setOneshotFirstRoundAsrFinal", "(Z)V", "recognizeOriginal", "", "getRecognizeOriginal", "()Ljava/lang/String;", "setRecognizeOriginal", "(Ljava/lang/String;)V", "recognizeResultDirective", "Lcom/heytap/speech/engine/protocol/directive/Directive;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "getRecognizeResultDirective", "()Lcom/heytap/speech/engine/protocol/directive/Directive;", "setRecognizeResultDirective", "(Lcom/heytap/speech/engine/protocol/directive/Directive;)V", SpeechConstant.KEY_RECORD_ID, "getRecordId", "setRecordId", "tempLiveData", "", "getTempLiveData", "()Ljava/util/Map;", "setTempLiveData", "(Ljava/util/Map;)V", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CloudWakeupRecorder {

    @NotNull
    public static final CloudWakeupRecorder INSTANCE = new CloudWakeupRecorder();
    private static volatile long cloudCheckTimerId;
    private static boolean oneshotFirstRoundAsrFinal;

    @Nullable
    private static String recognizeOriginal;

    @Nullable
    private static Directive<? extends DirectivePayload> recognizeResultDirective;

    @Nullable
    private static String recordId;

    @Nullable
    private static Map<String, ? extends Object> tempLiveData;

    private CloudWakeupRecorder() {
    }

    public final long getCloudCheckTimerId() {
        return cloudCheckTimerId;
    }

    public final boolean getOneshotFirstRoundAsrFinal() {
        return oneshotFirstRoundAsrFinal;
    }

    @Nullable
    public final String getRecognizeOriginal() {
        return recognizeOriginal;
    }

    @Nullable
    public final Directive<? extends DirectivePayload> getRecognizeResultDirective() {
        return recognizeResultDirective;
    }

    @Nullable
    public final String getRecordId() {
        return recordId;
    }

    @Nullable
    public final Map<String, Object> getTempLiveData() {
        return tempLiveData;
    }

    public final void setCloudCheckTimerId(long j2) {
        cloudCheckTimerId = j2;
    }

    public final void setOneshotFirstRoundAsrFinal(boolean z) {
        oneshotFirstRoundAsrFinal = z;
    }

    public final void setRecognizeOriginal(@Nullable String str) {
        recognizeOriginal = str;
    }

    public final void setRecognizeResultDirective(@Nullable Directive<? extends DirectivePayload> directive) {
        recognizeResultDirective = directive;
    }

    public final void setRecordId(@Nullable String str) {
        recordId = str;
    }

    public final void setTempLiveData(@Nullable Map<String, ? extends Object> map) {
        tempLiveData = map;
    }
}
