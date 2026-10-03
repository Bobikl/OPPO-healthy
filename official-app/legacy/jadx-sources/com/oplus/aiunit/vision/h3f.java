package com.oplus.aiunit.vision;

import com.oplus.drs.core.upload.UploadBatchAssembler;
import com.oplus.drs.core.upload.upload.ChannelType;
import com.oplus.drs.core.upload.upload.ContinueAction;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class h3f extends ukk {
    @Override // com.oplus.aiunit.vision.ukk
    public ChannelType c() {
        return ChannelType.PSEUDO;
    }

    @Override // com.oplus.aiunit.vision.ukk
    public void f() {
        super.f();
    }

    @Override // com.oplus.aiunit.vision.ukk
    public List<UploadBatchAssembler.a> j(UploadBatchAssembler uploadBatchAssembler, boolean z) {
        return uploadBatchAssembler.j(z, this.a.b(), this.a.c());
    }

    @Override // com.oplus.aiunit.vision.ukk
    public ContinueAction k(com.oplus.drs.core.upload.upload.a aVar) {
        return ContinueAction.YIELD_AND_CONTINUE;
    }
}
