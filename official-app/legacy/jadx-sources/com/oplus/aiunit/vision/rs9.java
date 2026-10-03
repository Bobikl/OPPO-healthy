package com.oplus.aiunit.vision;

import com.heytap.speech.engine.constant.EngineConstant;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J$\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/rs9;", "", "", "messageId", "", "onMessageSending", "onMessageSendSuccess", "", "errorCode", EngineConstant.REASON, "onMessageSendFailed", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public interface rs9 {
    void onMessageSendFailed(@Nullable String messageId, int errorCode, @Nullable String reason);

    void onMessageSendSuccess(@Nullable String messageId);

    void onMessageSending(@Nullable String messageId);
}
