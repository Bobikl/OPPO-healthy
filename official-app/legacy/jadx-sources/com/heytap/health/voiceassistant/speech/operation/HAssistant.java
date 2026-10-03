package com.heytap.health.voiceassistant.speech.operation;

import androidx.annotation.Keep;
import com.heytap.speech.engine.process.OperationStatus;
import com.oplus.aiunit.vision.bmd;
import com.oplus.aiunit.vision.ye8;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/health/voiceassistant/speech/operation/HAssistant;", "Lcom/oplus/aiunit/vision/bmd;", "", "process", "", "tag", "Ljava/lang/String;", "<init>", "()V", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0})
public final class HAssistant extends bmd {

    @NotNull
    private final String tag = "VAM_OP_Assistant";

    @Override // com.oplus.aiunit.vision.bmd, com.oplus.aiunit.vision.tmd
    public void process() {
        ye8.a(this, this.tag);
        setStatus(OperationStatus.SUCCESS);
    }
}
