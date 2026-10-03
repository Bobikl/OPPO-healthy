package com.oplus.aiunit.vision;

import com.oplus.drs.core.upload.UploadBatchAssembler;
import com.oplus.drs.core.upload.upload.ChannelType;
import com.oplus.drs.core.upload.upload.ContinueAction;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class yyc extends ukk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r73 f19196c = new r73();
    public final r73 d = new r73();

    @Override // com.oplus.aiunit.vision.ukk
    public ChannelType c() {
        return ChannelType.NON_REALTIME;
    }

    @Override // com.oplus.aiunit.vision.ukk
    public void f() {
        this.a.a();
        this.f19196c.e();
        this.d.e();
        super.f();
    }

    @Override // com.oplus.aiunit.vision.ukk
    public void g(String str) {
        f();
    }

    @Override // com.oplus.aiunit.vision.ukk
    public void h() {
        super.h();
        this.a.f();
        this.f19196c.f();
        this.d.f();
    }

    @Override // com.oplus.aiunit.vision.ukk
    public List<UploadBatchAssembler.a> j(UploadBatchAssembler uploadBatchAssembler, boolean z) {
        List<UploadBatchAssembler.a> listL = uploadBatchAssembler.l(z, this.f19196c.b(), this.f19196c.c());
        List<UploadBatchAssembler.a> listM = uploadBatchAssembler.m(z, this.d.b(), this.d.c());
        boolean z2 = (listL == null || listL.isEmpty()) ? false : true;
        boolean z3 = (listM == null || listM.isEmpty()) ? false : true;
        if (!z2 && !z3) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z2) {
            arrayList.addAll(listL);
        }
        if (z3) {
            arrayList.addAll(listM);
        }
        return arrayList;
    }

    @Override // com.oplus.aiunit.vision.ukk
    public ContinueAction k(com.oplus.drs.core.upload.upload.a aVar) {
        return ContinueAction.YIELD_AND_CONTINUE;
    }
}
