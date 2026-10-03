package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import com.oplus.drs.core.upload.UploadBatchAssembler;
import com.oplus.drs.core.upload.upload.ChannelType;
import com.oplus.drs.core.upload.upload.ContinueAction;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ukk {
    public final r73 a = new r73();
    public volatile boolean b = false;

    public boolean a() {
        return false;
    }

    public final r73 b() {
        return this.a;
    }

    public abstract ChannelType c();

    public final boolean d() {
        return this.b;
    }

    public final void e() {
        this.b = true;
    }

    public void f() {
        this.a.e();
    }

    public void g(String str) {
        this.a.e();
    }

    public void h() {
        this.b = false;
    }

    public void i(List<UploadBatchAssembler.a> list, UploadBatchAssembler uploadBatchAssembler, boolean z) {
    }

    @Nullable
    public abstract List<UploadBatchAssembler.a> j(UploadBatchAssembler uploadBatchAssembler, boolean z);

    public abstract ContinueAction k(com.oplus.drs.core.upload.upload.a aVar);

    public String toString() {
        return c().toString();
    }
}
