package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;
import com.platform.usercenter.account.ams.ipc.support.AcIpcResponse;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class r8 extends q7 {
    public tj b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16118c;
    public long d;

    public r8(JSONObject jSONObject, Context context, tj tjVar) {
        super(jSONObject, context);
        this.b = tjVar;
        try {
            this.f16118c = jSONObject.getInt("errorCount");
            this.d = jSONObject.getLong("errorFreq");
        } catch (Exception e2) {
            AcLogUtil.e("AcFailCtrlSty", "parse config failed! " + e2);
            this.f16118c = 10;
            this.d = 60000L;
        }
        AcLogUtil.i("AcFailCtrlSty", "init maxFailCount: " + this.f16118c + ", controlFeq: " + this.d);
    }

    @Override // com.oplus.aiunit.vision.jl9
    public void a(String str, AcIpcResponse acIpcResponse) {
        if (acIpcResponse.getCode() != ResponseEnum.SUCCESS.code) {
            h(str, f(str) + 1);
            if (g(str) == 0) {
                i(str, System.currentTimeMillis());
            }
        }
    }

    @Override // com.oplus.aiunit.vision.jl9
    public String b() {
        return v8.STRATEGY_FAIL;
    }

    @Override // com.oplus.aiunit.vision.jl9
    public void c(String str) {
    }

    @Override // com.oplus.aiunit.vision.jl9
    public boolean d(String str) {
        int iF = f(str);
        long jG = g(str);
        long jCurrentTimeMillis = System.currentTimeMillis() - jG;
        AcLogUtil.i("AcFailCtrlSty", "isInterrupted invoke, apiName: " + str + ", failCount: " + iF + ", firstFailTime: " + jG + ", duration: " + jCurrentTimeMillis);
        if (jCurrentTimeMillis < 0) {
            e(str);
            return false;
        }
        if (jG <= 0 || jCurrentTimeMillis <= this.d) {
            return iF >= this.f16118c;
        }
        e(str);
        return false;
    }

    public final void e(String str) {
        this.b.a(this.a).d(u8.b(str));
        this.b.a(this.a).d(u8.c(str));
    }

    public final int f(String str) {
        return ((Integer) this.b.a(this.a).b(u8.b(str), 0)).intValue();
    }

    public final long g(String str) {
        return ((Long) this.b.a(this.a).b(u8.c(str), 0L)).longValue();
    }

    public final void h(String str, int i) {
        this.b.a(this.a).c(u8.b(str), Integer.valueOf(i));
        AcLogUtil.i("AcFailCtrlSty", "updateCount apiName: " + str + ", count: " + i);
    }

    public final void i(String str, long j2) {
        this.b.a(this.a).c(u8.c(str), Long.valueOf(j2));
        AcLogUtil.i("AcFailCtrlSty", "updateTime apiName: " + str + ", time: " + j2);
    }
}
