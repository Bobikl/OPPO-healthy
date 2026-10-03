package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class wd implements ql9 {
    public long a;

    @Override // com.oplus.aiunit.vision.ql9
    public void a(String str, String str2, Context context, long j2, Object obj, Map<String, String> map) {
        try {
            AcLogUtil.i("AcOpenCoreTraceHandlerImpl", "Method exit: duration=" + j2 + "ms, result=" + obj);
            xd.b(context).report(str, str2, map);
        } catch (Exception e2) {
            AcLogUtil.e("AcOpenCoreTraceHandlerImpl", "Trace exit failed for method: " + map.get("methodName"), e2);
        }
    }

    @Override // com.oplus.aiunit.vision.ql9
    public void b(String str, String str2, Context context, Map<String, String> map) {
        try {
            this.a = System.currentTimeMillis();
            AcLogUtil.i("AcOpenCoreTraceHandlerImpl", "Method entry: appId=" + str + ", traceId=" + str2);
            xd.b(context).report(str, str2, map);
        } catch (Exception e2) {
            AcLogUtil.e("AcOpenCoreTraceHandlerImpl", "Trace entry failed for method: " + map.get("methodName"), e2);
        }
    }

    @Override // com.oplus.aiunit.vision.ql9
    public long c(long j2) {
        return System.currentTimeMillis() - j2;
    }

    @Override // com.oplus.aiunit.vision.ql9
    public long getStartTime() {
        return this.a;
    }
}
