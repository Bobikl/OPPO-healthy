package com.oplus.aiunit.vision;

import com.oplus.drs.core.upload.UploadBatchAssembler;
import com.oplus.drs.core.upload.upload.ChannelType;
import com.oplus.drs.core.upload.upload.ContinueAction;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class fdf extends ukk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f11303c = 0;
    public final AtomicInteger d = new AtomicInteger(0);

    @Override // com.oplus.aiunit.vision.ukk
    public boolean a() {
        return this.d.getAndSet(0) > 0;
    }

    @Override // com.oplus.aiunit.vision.ukk
    public ChannelType c() {
        return ChannelType.REALTIME;
    }

    @Override // com.oplus.aiunit.vision.ukk
    public void f() {
        this.a.a();
        super.f();
        z6b.q("RealtimeChannel", "onTaskComplete");
    }

    @Override // com.oplus.aiunit.vision.ukk
    public void g(String str) {
        this.a.a();
        super.g(str);
        z6b.q("RealtimeChannel", "onTaskError: " + str);
    }

    @Override // com.oplus.aiunit.vision.ukk
    public void h() {
        super.h();
        this.a.f();
        this.f11303c = 0;
        this.d.set(0);
        z6b.q("RealtimeChannel", "onTaskStart");
    }

    @Override // com.oplus.aiunit.vision.ukk
    public void i(List<UploadBatchAssembler.a> list, UploadBatchAssembler uploadBatchAssembler, boolean z) {
        Iterator<UploadBatchAssembler.a> it = list.iterator();
        while (it.hasNext()) {
            uploadBatchAssembler.e(it.next(), z);
        }
    }

    @Override // com.oplus.aiunit.vision.ukk
    public List<UploadBatchAssembler.a> j(UploadBatchAssembler uploadBatchAssembler, boolean z) {
        return uploadBatchAssembler.p(z, this.a.b(), this.a.c());
    }

    @Override // com.oplus.aiunit.vision.ukk
    public ContinueAction k(com.oplus.drs.core.upload.upload.a aVar) {
        this.f11303c++;
        if (this.f11303c < 30) {
            return ContinueAction.CONTINUE_NOW;
        }
        z6b.q("RealtimeChannel", "shouldContinue: reached MAX_CONSECUTIVE_LOOPS (30), yield current task by YIELD_AND_CONTINUE");
        this.f11303c = 0;
        return ContinueAction.YIELD_AND_CONTINUE;
    }

    public void l() {
        this.d.incrementAndGet();
    }
}
