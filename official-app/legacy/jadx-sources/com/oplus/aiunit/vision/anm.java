package com.oplus.aiunit.vision;

import android.content.Context;
import com.alipay.tscenter.biz.rpc.deviceFp.BugTrackMessageService;
import com.alipay.tscenter.biz.rpc.report.general.DataReportService;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class anm implements x9m {
    public static anm d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static DataReportResult f9441e;
    public com.alipay.android.phone.mrpc.core.w a;
    public BugTrackMessageService b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DataReportService f9442c;

    public anm(Context context, String str) {
        this.a = null;
        this.b = null;
        this.f9442c = null;
        com.alipay.android.phone.mrpc.core.aa aaVar = new com.alipay.android.phone.mrpc.core.aa();
        aaVar.a(str);
        com.alipay.android.phone.mrpc.core.h hVar = new com.alipay.android.phone.mrpc.core.h(context);
        this.a = hVar;
        this.b = (BugTrackMessageService) hVar.a(BugTrackMessageService.class, aaVar);
        this.f9442c = (DataReportService) this.a.a(DataReportService.class, aaVar);
    }

    public static synchronized anm e(Context context, String str) {
        if (d == null) {
            d = new anm(context, str);
        }
        return d;
    }

    @Override // com.oplus.aiunit.vision.x9m
    public DataReportResult a(DataReportRequest dataReportRequest) throws InterruptedException {
        if (dataReportRequest == null) {
            return null;
        }
        if (this.f9442c != null) {
            f9441e = null;
            new Thread(new jjm(this, dataReportRequest)).start();
            for (int i = 300000; f9441e == null && i >= 0; i -= 50) {
                Thread.sleep(50L);
            }
        }
        return f9441e;
    }

    @Override // com.oplus.aiunit.vision.x9m
    public boolean logCollect(String str) {
        BugTrackMessageService bugTrackMessageService;
        String strLogCollect;
        if (vam.c(str) || (bugTrackMessageService = this.b) == null) {
            return false;
        }
        try {
            strLogCollect = bugTrackMessageService.logCollect(vam.j(str));
        } catch (Throwable unused) {
            strLogCollect = null;
        }
        if (vam.c(strLogCollect)) {
            return false;
        }
        return ((Boolean) new JSONObject(strLogCollect).get("success")).booleanValue();
    }
}
