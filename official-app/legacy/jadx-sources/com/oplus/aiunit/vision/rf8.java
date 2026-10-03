package com.oplus.aiunit.vision;

import com.heytap.speech.engine.process.OperationStatus;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/rf8;", "Lcom/oplus/aiunit/vision/bmd;", "", "process", "", "a", "Ljava/lang/String;", "tag", "<init>", "()V", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0})
public final class rf8 extends bmd {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String tag = "VAM_OP_ScheduleOpen";

    @Override // com.oplus.aiunit.vision.bmd, com.oplus.aiunit.vision.tmd
    public void process() {
        ye8.a(this, this.tag);
        setStatus(OperationStatus.SUCCESS);
    }
}
