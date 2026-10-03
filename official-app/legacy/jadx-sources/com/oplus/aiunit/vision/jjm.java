package com.oplus.aiunit.vision;

import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;

/* JADX INFO: loaded from: classes12.dex */
public class jjm implements Runnable {
    public final /* synthetic */ DataReportRequest i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ anm f12929j;

    public jjm(anm anmVar, DataReportRequest dataReportRequest) {
        this.f12929j = anmVar;
        this.i = dataReportRequest;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            DataReportResult unused = anm.f9441e = this.f12929j.f9442c.reportData(this.i);
        } catch (Throwable th) {
            DataReportResult unused2 = anm.f9441e = new DataReportResult();
            anm.f9441e.success = false;
            anm.f9441e.resultCode = "static data rpc upload error, " + vam.a(th);
            vam.a(th);
        }
    }
}
