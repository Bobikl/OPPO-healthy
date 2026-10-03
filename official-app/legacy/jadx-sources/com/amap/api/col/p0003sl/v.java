package com.amap.api.col.p0003sl;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.district.DistrictResult;
import com.amap.api.services.route.BusRouteResult;
import com.amap.api.services.route.BusRouteResultV2;
import com.amap.api.services.route.DistanceResult;
import com.amap.api.services.route.DriveRoutePlanResult;
import com.amap.api.services.route.DriveRouteResult;
import com.amap.api.services.route.DriveRouteResultV2;
import com.amap.api.services.route.RideRouteResult;
import com.amap.api.services.route.RideRouteResultV2;
import com.amap.api.services.route.TruckRouteRestult;
import com.amap.api.services.route.WalkRouteResult;
import com.amap.api.services.route.WalkRouteResultV2;
import com.heytap.health.core.provider.auth.AuthHandler;
import com.oplus.aiunit.vision.bzf;
import com.oplus.aiunit.vision.c1h;
import com.oplus.aiunit.vision.f58;
import com.oplus.aiunit.vision.gmc;
import com.oplus.aiunit.vision.j9a;
import com.oplus.aiunit.vision.pv5;
import com.oplus.aiunit.vision.qv5;
import com.oplus.aiunit.vision.qxm;
import com.oplus.aiunit.vision.sme;
import com.oplus.aiunit.vision.tme;
import com.oplus.aiunit.vision.vkf;
import com.oplus.aiunit.vision.xyf;
import com.oplus.aiunit.vision.yyf;
import com.oplus.aiunit.vision.zyf;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class v extends Handler {
    public static v a;

    public static class a {
    }

    public static class b {
    }

    public static class c {
    }

    public static class d {
    }

    public static class e {
    }

    public static class f {
        public f58.a a;
    }

    public static class g {
        public List<gmc> a;
    }

    public static class h {
        public PoiItem a;
        public tme.a b;
    }

    public static class i {
    }

    public static class j {
        public sme a;
        public tme.a b;
    }

    public static class k {
    }

    public static class l {
        public vkf a;
        public f58.a b;
    }

    public static class m {
    }

    public static class n {
    }

    public static class o {
    }

    public v() {
    }

    public static synchronized v a() {
        if (a == null) {
            if (Looper.myLooper() == null || Looper.myLooper() != Looper.getMainLooper()) {
                a = new v(Looper.getMainLooper());
            } else {
                a = new v();
            }
        }
        return a;
    }

    public static void b(Message message) {
        int i2 = message.arg2;
        c1h c1hVar = (c1h) message.obj;
        String string = message.getData().getString("shareurlkey");
        if (c1hVar == null) {
        }
        switch (message.what) {
            case 1100:
                c1hVar.e(string, i2);
                break;
            case 1101:
                c1hVar.c(string, i2);
                break;
            case 1102:
                c1hVar.b(string, i2);
                break;
            case 1103:
                c1hVar.f(string, i2);
                break;
            case AuthHandler.ResultCode.HEALTH_ACTIVITY_RECOGNITION_PERMISSION_NOT_GRANTED /* 1104 */:
                c1hVar.a(string, i2);
                break;
            case AuthHandler.ResultCode.HEALTH_DATA_REQUEST_TIMED_OUT /* 1105 */:
                c1hVar.d(string, i2);
                break;
        }
    }

    public static void c(Message message) {
        List list = (List) message.obj;
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((gmc) it.next()).a(message.what);
        }
    }

    public static void d(Message message) {
        List<gmc> list;
        g gVar = (g) message.obj;
        if (gVar == null || (list = gVar.a) == null || list.size() == 0) {
            return;
        }
        Iterator<gmc> it = list.iterator();
        while (it.hasNext()) {
            it.next().b(null, message.what);
        }
    }

    public static void e(Message message) {
        List list = (List) message.obj;
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((gmc) it.next()).c(message.what);
        }
    }

    public static void f(Message message) {
    }

    public static void g(Message message) {
        h hVar;
        tme.a aVar;
        Bundle data;
        int i2 = message.what;
        if (i2 == 600) {
            j jVar = (j) message.obj;
            if (jVar == null || (aVar = jVar.b) == null || (data = message.getData()) == null) {
                return;
            }
            aVar.a(jVar.a, data.getInt("errorCode"));
            return;
        }
        if (i2 != 602 || (hVar = (h) message.obj) == null) {
            return;
        }
        tme.a aVar2 = hVar.b;
        Bundle data2 = message.getData();
        if (data2 != null) {
            aVar2.b(hVar.a, data2.getInt("errorCode"));
        }
    }

    public static void h(Message message) {
        Bundle data;
        int i2 = message.what;
        if (i2 == 603) {
        } else {
            if (i2 != 604 || ((i) message.obj) == null || (data = message.getData()) == null) {
                return;
            }
            data.getInt("errorCode");
            throw null;
        }
    }

    public static void i(Message message) {
        Bundle data;
        if (message.what != 600 || ((a) message.obj) == null || (data = message.getData()) == null) {
            return;
        }
        data.getInt("errorCode");
    }

    public static void j(Message message) {
        j9a.a aVar = (j9a.a) message.obj;
        if (aVar == null) {
            return;
        }
        aVar.a(message.what == 1000 ? message.getData().getParcelableArrayList("result") : null, message.what);
    }

    public static void k(Message message) {
        f fVar;
        f58.a aVar;
        f58.a aVar2;
        int i2 = message.what;
        if (i2 == 201) {
            l lVar = (l) message.obj;
            if (lVar == null || (aVar2 = lVar.b) == null) {
                return;
            }
            aVar2.b(lVar.a, message.arg2);
            return;
        }
        if (i2 != 200 || (fVar = (f) message.obj) == null || (aVar = fVar.a) == null) {
            return;
        }
        aVar.a(null, message.arg2);
    }

    public static void l(Message message) {
        qv5 qv5Var = (qv5) message.obj;
        if (qv5Var == null) {
            return;
        }
        qv5Var.a((DistrictResult) message.getData().getParcelable("result"));
    }

    public static void m(Message message) {
    }

    public static void n(Message message) {
        Bundle data;
        yyf yyfVar = (yyf) message.obj;
        if (yyfVar == null) {
            return;
        }
        int i2 = message.what;
        if (i2 == 100) {
            Bundle data2 = message.getData();
            if (data2 != null) {
                yyfVar.b((BusRouteResult) message.getData().getParcelable("result"), data2.getInt("errorCode"));
                return;
            }
            return;
        }
        if (i2 == 101) {
            Bundle data3 = message.getData();
            if (data3 != null) {
                yyfVar.d((DriveRouteResult) message.getData().getParcelable("result"), data3.getInt("errorCode"));
                return;
            }
            return;
        }
        if (i2 == 102) {
            Bundle data4 = message.getData();
            if (data4 != null) {
                yyfVar.c((WalkRouteResult) message.getData().getParcelable("result"), data4.getInt("errorCode"));
                return;
            }
            return;
        }
        if (i2 == 103) {
            Bundle data5 = message.getData();
            if (data5 != null) {
                yyfVar.a((RideRouteResult) message.getData().getParcelable("result"), data5.getInt("errorCode"));
                return;
            }
            return;
        }
        if (i2 != 104 || (data = message.getData()) == null) {
            return;
        }
        yyfVar.a((RideRouteResult) message.getData().getParcelable("result"), data.getInt("errorCode"));
    }

    public static void o(Message message) {
        Bundle data;
        bzf bzfVar = (bzf) message.obj;
        if (bzfVar == null) {
            return;
        }
        int i2 = message.what;
        if (i2 == 101) {
            Bundle data2 = message.getData();
            if (data2 != null) {
                bzfVar.b((DriveRouteResultV2) message.getData().getParcelable("result"), data2.getInt("errorCode"));
                return;
            }
            return;
        }
        if (i2 == 100) {
            Bundle data3 = message.getData();
            if (data3 != null) {
                bzfVar.a((BusRouteResultV2) message.getData().getParcelable("result"), data3.getInt("errorCode"));
                return;
            }
            return;
        }
        if (i2 == 102) {
            Bundle data4 = message.getData();
            if (data4 != null) {
                bzfVar.c((WalkRouteResultV2) message.getData().getParcelable("result"), data4.getInt("errorCode"));
                return;
            }
            return;
        }
        if (i2 != 103 || (data = message.getData()) == null) {
            return;
        }
        bzfVar.d((RideRouteResultV2) message.getData().getParcelable("result"), data.getInt("errorCode"));
    }

    public static void p(Message message) {
        Bundle data;
        zyf zyfVar = (zyf) message.obj;
        if (zyfVar == null || message.what != 104 || (data = message.getData()) == null) {
            return;
        }
        zyfVar.a((TruckRouteRestult) message.getData().getParcelable("result"), data.getInt("errorCode"));
    }

    public static void q(Message message) {
        Bundle data;
        xyf xyfVar = (xyf) message.obj;
        if (xyfVar == null || message.what != 105 || (data = message.getData()) == null) {
            return;
        }
        xyfVar.a((DriveRoutePlanResult) message.getData().getParcelable("result"), data.getInt("errorCode"));
    }

    public static void r(Message message) {
        int i2 = message.what;
        if (i2 == 700) {
            if (((e) message.obj) != null) {
                throw null;
            }
        } else if (i2 == 701 && ((d) message.obj) != null) {
            throw null;
        }
    }

    public static void s(Message message) {
        int i2 = message.what;
        if (i2 == 1301) {
        } else if (i2 == 1302) {
        }
    }

    public static void t(Message message) {
    }

    public static void u(Message message) {
        Bundle data;
        pv5 pv5Var = (pv5) message.obj;
        if (pv5Var == null || message.what != 400 || (data = message.getData()) == null) {
            return;
        }
        pv5Var.a((DistanceResult) message.getData().getParcelable("result"), data.getInt("errorCode"));
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            int i2 = message.arg1;
            if (i2 == 101) {
                o(message);
                return;
            }
            switch (i2) {
                case 1:
                    n(message);
                    break;
                case 2:
                    k(message);
                    break;
                case 3:
                    m(message);
                    break;
                case 4:
                    l(message);
                    break;
                case 5:
                    j(message);
                    break;
                case 6:
                    g(message);
                    break;
                case 7:
                    f(message);
                    break;
                case 8:
                    e(message);
                    break;
                case 9:
                    d(message);
                    break;
                case 10:
                    c(message);
                    break;
                case 11:
                    b(message);
                    break;
                case 12:
                    r(message);
                    break;
                case 13:
                    s(message);
                    break;
                case 14:
                    t(message);
                    break;
                default:
                    switch (i2) {
                        case 16:
                            u(message);
                            break;
                        case 17:
                            p(message);
                            break;
                        case 18:
                            q(message);
                            break;
                        case 19:
                            h(message);
                            break;
                        case 20:
                            i(message);
                            break;
                        default:
                            break;
                    }
                    break;
            }
        } catch (Throwable th) {
            qxm.g(th, "MessageHandler", "handleMessage");
        }
    }

    public v(Looper looper) {
        super(looper);
    }
}
