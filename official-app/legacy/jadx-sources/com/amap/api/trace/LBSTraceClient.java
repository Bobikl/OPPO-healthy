package com.amap.api.trace;

import android.content.Context;
import com.amap.api.col.p0003sl.f0;
import com.amap.api.col.p0003sl.iu;
import com.oplus.aiunit.vision.k0n;
import com.oplus.aiunit.vision.xsm;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class LBSTraceClient {
    public static final String LOCATE_TIMEOUT_ERROR = "定位超时";
    public static final String MIN_GRASP_POINT_ERROR = "轨迹点太少或距离太近,轨迹纠偏失败";
    public static final String TRACE_SUCCESS = "纠偏成功";
    public static final int TYPE_AMAP = 1;
    public static final int TYPE_BAIDU = 3;
    public static final int TYPE_GPS = 2;
    private static LBSTraceBase a;
    private static volatile LBSTraceClient b;

    public LBSTraceClient(Context context) throws Exception {
        a(context);
    }

    private static void a(Context context) throws Exception {
        f0 f0VarA = iu.a(context, xsm.t());
        if (f0VarA.a != iu.c.SuccessCode) {
            throw new Exception(f0VarA.b);
        }
        if (context != null) {
            a = new k0n(context.getApplicationContext());
        }
    }

    public static LBSTraceClient getInstance(Context context) throws Exception {
        if (b == null) {
            synchronized (LBSTraceClient.class) {
                if (b == null) {
                    a(context);
                    b = new LBSTraceClient();
                }
            }
        }
        return b;
    }

    public void destroy() {
        LBSTraceBase lBSTraceBase = a;
        if (lBSTraceBase != null) {
            lBSTraceBase.destroy();
            a();
        }
    }

    public void queryProcessedTrace(int i, List<TraceLocation> list, int i2, TraceListener traceListener) {
        LBSTraceBase lBSTraceBase = a;
        if (lBSTraceBase != null) {
            lBSTraceBase.queryProcessedTrace(i, list, i2, traceListener);
        }
    }

    public void startTrace(TraceStatusListener traceStatusListener) {
        LBSTraceBase lBSTraceBase = a;
        if (lBSTraceBase != null) {
            lBSTraceBase.startTrace(traceStatusListener);
        }
    }

    public void stopTrace() {
        LBSTraceBase lBSTraceBase = a;
        if (lBSTraceBase != null) {
            lBSTraceBase.stopTrace();
        }
    }

    private LBSTraceClient() {
    }

    private static void a() {
        a = null;
        b = null;
    }
}
