package com.heytap.speech.engine.callback;

import com.heytap.speech.engine.connect.core.legacy.DmoutputEntity;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H'J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lcom/heytap/speech/engine/callback/IDirectiveFilter;", "", "onDirectiveFilter", "", "dmOutputEntity", "Lcom/heytap/speech/engine/connect/core/legacy/DmoutputEntity;", "sessionId", "", SpeechConstant.KEY_RECORD_ID, "nlpResult", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface IDirectiveFilter {
    @Deprecated(message = "please use onDirectiveFilter(sessionId: String, recordId: String, nlpResult:String) instead of this method.")
    boolean onDirectiveFilter(@Nullable DmoutputEntity dmOutputEntity);

    boolean onDirectiveFilter(@Nullable String sessionId, @Nullable String recordId, @NotNull String nlpResult);
}
