package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;
import com.platform.usercenter.account.ams.ipc.support.AcIpcResponse;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class wj extends q7 {
    public tj b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18288c;
    public long d;

    public wj(JSONObject jSONObject, Context context, tj tjVar) {
        super(jSONObject, context);
        this.b = tjVar;
        try {
            this.f18288c = jSONObject.getInt("successCount");
            this.d = jSONObject.getLong("successFreq");
        } catch (Exception e2) {
            AcLogUtil.e("AcSuccessCtrlSty", "parse config failed! " + e2);
            this.f18288c = 2;
            this.d = 60000L;
        }
        AcLogUtil.i("AcSuccessCtrlSty", "init maxSuccessCount: " + this.f18288c + ", controlFeq: " + this.d);
    }

    @Override // com.oplus.aiunit.vision.jl9
    public void a(String str, AcIpcResponse acIpcResponse) {
        if (acIpcResponse.getCode() == ResponseEnum.SUCCESS.code) {
            h(str, g(str) + 1);
            if (f(str) == 0) {
                i(str, System.currentTimeMillis());
            }
        }
    }

    @Override // com.oplus.aiunit.vision.jl9
    public String b() {
        return v8.STRATEGY_SUCCESS;
    }

    @Override // com.oplus.aiunit.vision.jl9
    public void c(String str) {
    }

    @Override // com.oplus.aiunit.vision.jl9
    public boolean d(String str) {
        int iG = g(str);
        long jF = f(str);
        long jCurrentTimeMillis = System.currentTimeMillis() - jF;
        AcLogUtil.i("AcSuccessCtrlSty", "isInterrupted invoke, apiName: " + str + ", successCount: " + iG + ", firstSuccessTime: " + jF + ", duration: " + jCurrentTimeMillis);
        if (jCurrentTimeMillis < 0) {
            e(str);
            return false;
        }
        if (jF <= 0 || jCurrentTimeMillis <= this.d) {
            return iG >= this.f18288c;
        }
        e(str);
        return false;
    }

    public final void e(String str) {
        this.b.b(this.a).d(u8.g(str));
        this.b.b(this.a).d(u8.h(str));
    }

    public final long f(String str) {
        return ((Long) this.b.b(this.a).b(u8.h(str), 0L)).longValue();
    }

    public final int g(String str) {
        return ((Integer) this.b.b(this.a).b(u8.g(str), 0)).intValue();
    }

    public final void h(String str, int i) {
        this.b.b(this.a).c(u8.g(str), Integer.valueOf(i));
        AcLogUtil.i("AcSuccessCtrlSty", "updateCount apiName: " + str + ", count: " + i);
    }

    public final void i(String str, long j2) {
        this.b.b(this.a).c(u8.h(str), Long.valueOf(j2));
        AcLogUtil.i("AcSuccessCtrlSty", "updateTime apiName: " + str + ", time: " + j2);
    }
}
