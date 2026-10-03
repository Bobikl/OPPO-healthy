package com.heytap.speech.engine.callback;

import androidx.annotation.WorkerThread;
import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.speech.engine.protocol.directive.Directive;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.ConversationInfo;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J$\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H'J\u001a\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH'J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&J&\u0010\u0019\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H'J.\u0010\u001b\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001a\u001a\u00020\rH'J\u0012\u0010\u001c\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H&J\"\u0010\u001d\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H&J \u0010\"\u001a\u00020\u00072\u000e\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u001e2\u0006\u0010!\u001a\u00020\u0005H&J-\u0010'\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/heytap/speech/engine/callback/ConversationEventListener;", "", "", "requestType", "aiType", "Lcom/oplus/aiunit/vision/ca4;", UTraceSQLiteHelperKt.COL_INFO, "", "onConversationStart", "onVoiceUploadStart", "", "voiceSteam", "onVoiceUpload", "", SpeechConstant.KEY_VOLUME, "onVolume", "onVoiceUploadEnd", "", "isFinal", "onReceiveAsrResults", "onReceiveNlpResults", "onAppIntercept", "skill", "intent", "results", "onNLPResults", EngineConstant.REASON, "onNLPResultsDiscard", "onDirectivesReceived", "onDirectivesDiscard", "Lcom/heytap/speech/engine/protocol/directive/Directive;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "payload", "conversationInfo", "onDirectiveNotFound", "state", "", "confidence", "errorCode", "onCloudWakeup", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;)V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public interface ConversationEventListener {
    void onAppIntercept(@NotNull ConversationInfo info);

    void onCloudWakeup(@Nullable String state, @Nullable Double confidence, @Nullable Integer errorCode);

    void onConversationStart(@Nullable String requestType, @Nullable String aiType, @NotNull ConversationInfo info);

    void onDirectiveNotFound(@NotNull Directive<? extends DirectivePayload> payload, @NotNull ConversationInfo conversationInfo);

    void onDirectivesDiscard(@Nullable String results, int reason, @NotNull ConversationInfo info);

    void onDirectivesReceived(@Nullable String results);

    @Deprecated(message = "please use ProcessListener instead of this method.")
    void onNLPResults(@Nullable String skill, @Nullable String intent, @Nullable String results);

    @Deprecated(message = "onNLPResults has deprecated")
    void onNLPResultsDiscard(@Nullable String skill, @Nullable String intent, @Nullable String results, int reason);

    void onReceiveAsrResults(boolean isFinal, @NotNull ConversationInfo info);

    void onReceiveNlpResults(@NotNull ConversationInfo info);

    @WorkerThread
    void onVoiceUpload(@Nullable byte[] voiceSteam, @NotNull ConversationInfo info);

    @WorkerThread
    void onVoiceUploadEnd(@NotNull ConversationInfo info);

    @WorkerThread
    void onVoiceUploadStart(@NotNull ConversationInfo info);

    @WorkerThread
    void onVolume(int volume);
}
