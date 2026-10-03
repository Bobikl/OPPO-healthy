package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Bundle;
import com.oplus.aiunit.vision.ckm;
import com.oplus.aiunit.vision.dkm;
import com.oplus.aiunit.vision.tnm;
import com.oplus.aiunit.vision.u4n;
import com.oplus.aiunit.vision.xsm;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends u4n implements f.a {
    public f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public dkm f666j;
    public tnm k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f667l;
    public Bundle m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f668n;

    public c(tnm tnmVar, Context context) {
        this.m = new Bundle();
        this.f668n = false;
        this.k = tnmVar;
        this.f667l = context;
    }

    public final void a() {
        this.f668n = true;
        f fVar = this.i;
        if (fVar != null) {
            fVar.d();
        } else {
            cancelTask();
        }
        dkm dkmVar = this.f666j;
        if (dkmVar != null) {
            dkmVar.b();
        }
    }

    public final void b() {
        Bundle bundle = this.m;
        if (bundle != null) {
            bundle.clear();
            this.m = null;
        }
    }

    @Override // com.amap.api.col.3sl.f.a
    public final void c() {
        dkm dkmVar = this.f666j;
        if (dkmVar != null) {
            dkmVar.h();
        }
    }

    public final String d() {
        return xsm.h0(this.f667l);
    }

    public final void e() throws IOException {
        f fVar = new f(new ckm(this.k.getUrl(), d(), this.k.v(), this.k.w()), this.k.getUrl(), this.f667l, this.k);
        this.i = fVar;
        fVar.c(this);
        tnm tnmVar = this.k;
        this.f666j = new dkm(tnmVar, tnmVar);
        if (this.f668n) {
            return;
        }
        this.i.a();
    }

    @Override // com.oplus.aiunit.vision.u4n
    public final void runTask() {
        if (this.k.u()) {
            this.k.a(cc.a.file_io_exception);
            return;
        }
        try {
            e();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public c(tnm tnmVar, Context context, byte b) {
        this(tnmVar, context);
    }
}
