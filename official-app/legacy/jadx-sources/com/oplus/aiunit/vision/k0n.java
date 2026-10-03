package com.oplus.aiunit.vision;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.amap.api.maps.CoordinateConverter;
import com.amap.api.maps.LocationSource;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.MyLocationStyle;
import com.amap.api.trace.LBSTraceBase;
import com.amap.api.trace.LBSTraceClient;
import com.amap.api.trace.TraceListener;
import com.amap.api.trace.TraceLocation;
import com.amap.api.trace.TraceStatusListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes12.dex */
public final class k0n implements LocationSource.OnLocationChangedListener, LBSTraceBase {
    public Context a;
    public CoordinateConverter b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.amap.api.col.p0003sl.q0 f13102c;
    public com.amap.api.col.p0003sl.q0 d;
    public TraceStatusListener g;
    public com.amap.api.col.p0003sl.a h;
    public c m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13103e = 2000;
    public int f = 5;
    public List<TraceLocation> i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13104j = 0;
    public int k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f13105l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TraceLocation f13106n = null;
    public List<LatLng> o = new ArrayList();
    public List<LatLng> p = new ArrayList();
    public List<LatLng> q = new ArrayList();
    public int r = Runtime.getRuntime().availableProcessors();
    public BlockingQueue<Runnable> s = new LinkedBlockingQueue();
    public BlockingQueue<Runnable> t = new LinkedBlockingQueue();

    public class a extends u4n {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f13107j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public List<TraceLocation> f13108l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public TraceListener f13109n;
        public List<TraceLocation> i = new ArrayList();
        public String m = erm.a();

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.k0n$a$a, reason: collision with other inner class name */
        public class C0890a extends u4n {
            public final /* synthetic */ j0n i;

            public C0890a(j0n j0nVar) {
                this.i = j0nVar;
            }

            @Override // com.oplus.aiunit.vision.u4n
            public final void runTask() {
                this.i.run();
            }
        }

        public a(int i, List<TraceLocation> list, int i2, TraceListener traceListener) {
            this.f13107j = i2;
            this.k = i;
            this.f13108l = list;
            this.f13109n = traceListener;
        }

        public static int e(List<TraceLocation> list) {
            int size = list.size();
            if (size <= 1) {
                return 0;
            }
            TraceLocation traceLocation = list.get(0);
            TraceLocation traceLocation2 = list.get(size - 1);
            if (traceLocation == null || traceLocation2 == null) {
                return 0;
            }
            return (int) ((traceLocation2.getTime() - traceLocation.getTime()) / 1000);
        }

        public final int d() {
            List<TraceLocation> list = this.f13108l;
            int iE = 0;
            if (list != null && list.size() != 0) {
                ArrayList arrayList = new ArrayList();
                for (TraceLocation traceLocation : this.f13108l) {
                    if (traceLocation != null) {
                        if (traceLocation.getSpeed() < 0.01d) {
                            arrayList.add(traceLocation);
                        } else {
                            iE += e(arrayList);
                            arrayList.clear();
                        }
                    }
                }
            }
            return iE;
        }

        @Override // com.oplus.aiunit.vision.u4n
        public final void runTask() {
            try {
                k0n.this.m.a(this.f13109n);
                int iD = d();
                List<TraceLocation> list = this.f13108l;
                if (list != null && list.size() >= 2) {
                    Iterator<TraceLocation> it = this.f13108l.iterator();
                    while (it.hasNext()) {
                        TraceLocation traceLocationCopy = it.next().copy();
                        if (traceLocationCopy != null && traceLocationCopy.getLatitude() > 0.0d && traceLocationCopy.getLongitude() > 0.0d) {
                            this.i.add(traceLocationCopy);
                        }
                    }
                    int size = (this.i.size() - 2) / 500;
                    l0n.b().d(this.m, this.k, size, iD);
                    int i = 0;
                    int size2 = 500;
                    while (i <= size) {
                        if (i == size) {
                            size2 = this.i.size();
                        }
                        int i2 = size2;
                        ArrayList arrayList = new ArrayList();
                        for (int i3 = 0; i3 < i2; i3++) {
                            TraceLocation traceLocationRemove = this.i.remove(0);
                            if (traceLocationRemove != null) {
                                int i4 = this.f13107j;
                                if (i4 != 1) {
                                    if (i4 == 3) {
                                        k0n.this.b.from(CoordinateConverter.CoordType.BAIDU);
                                    } else if (i4 == 2) {
                                        k0n.this.b.from(CoordinateConverter.CoordType.GPS);
                                    }
                                    k0n.this.b.coord(new LatLng(traceLocationRemove.getLatitude(), traceLocationRemove.getLongitude()));
                                    LatLng latLngConvert = k0n.this.b.convert();
                                    if (latLngConvert != null) {
                                        traceLocationRemove.setLatitude(latLngConvert.latitude);
                                        traceLocationRemove.setLongitude(latLngConvert.longitude);
                                    }
                                }
                                arrayList.add(traceLocationRemove);
                            }
                        }
                        if (arrayList.size() >= 2 && arrayList.size() <= 500) {
                            k0n.this.d.b(new C0890a(new j0n(k0n.this.a, k0n.this.m, arrayList, this.m, this.k, i)));
                            i++;
                            try {
                                Thread.sleep(50L);
                            } catch (InterruptedException e2) {
                                e2.printStackTrace();
                            }
                        }
                        size2 = i2;
                    }
                    return;
                }
                l0n.b();
                l0n.c(k0n.this.m, this.k, LBSTraceClient.MIN_GRASP_POINT_ERROR);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class b implements TraceListener {
        public final List<TraceLocation> a;

        public b(List<TraceLocation> list) {
            this.a = list;
        }

        public final void a(int i, List<LatLng> list) {
            try {
                synchronized (k0n.this.q) {
                    k0n.this.q.clear();
                    k0n.this.q.addAll(list);
                }
                k0n.this.p.clear();
                if (i == 0) {
                    k0n.this.p.addAll(k0n.this.q);
                } else {
                    k0n.this.p.addAll(k0n.this.o);
                    k0n.this.p.addAll(k0n.this.q);
                }
                k0n.this.g.onTraceStatus(k0n.this.i, k0n.this.p, LBSTraceClient.TRACE_SUCCESS);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // com.amap.api.trace.TraceListener
        public final void onFinished(int i, List<LatLng> list, int i2, int i3) {
            a(i, list);
        }

        @Override // com.amap.api.trace.TraceListener
        public final void onRequestFailed(int i, String str) {
            ArrayList arrayList = new ArrayList();
            if (k0n.this.q != null) {
                arrayList.addAll(k0n.this.q);
            }
            List<TraceLocation> list = this.a;
            if (list != null) {
                int size = list.size();
                if (this.a.size() > k0n.this.f) {
                    for (int i2 = size - k0n.this.f; i2 < size; i2++) {
                        TraceLocation traceLocation = this.a.get(i2);
                        if (traceLocation != null) {
                            arrayList.add(new LatLng(traceLocation.getLatitude(), traceLocation.getLongitude()));
                        }
                    }
                }
            }
            a(i, arrayList);
        }

        @Override // com.amap.api.trace.TraceListener
        public final void onTraceProcessing(int i, int i2, List<LatLng> list) {
        }
    }

    public static class c extends Handler {
        public TraceListener a;

        public c(Looper looper) {
            super(looper);
        }

        public final void a(TraceListener traceListener) {
            this.a = traceListener;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Bundle data;
            try {
                if (this.a == null || (data = message.getData()) == null) {
                    return;
                }
                int i = data.getInt("lineID");
                switch (message.what) {
                    case 100:
                        this.a.onTraceProcessing(i, message.arg1, (List) message.obj);
                        break;
                    case 101:
                        this.a.onFinished(i, (List) message.obj, message.arg1, message.arg2);
                        break;
                    case 102:
                        this.a.onRequestFailed(i, (String) message.obj);
                        break;
                    default:
                        break;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public k0n(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new CoordinateConverter(applicationContext);
        this.m = new c(Looper.getMainLooper());
        r0n.a().c(this.a);
        this.f13102c = com.amap.api.col.p0003sl.r.a(this.r * 2, this.s, "AMapTraceManagerProcess");
        this.d = com.amap.api.col.p0003sl.r.a(this.r * 2, this.t, "AMapTraceManagerRequest");
    }

    public static double a(double d, double d2, double d3, double d4) {
        double d5 = d > d3 ? d - d3 : d3 - d;
        double d6 = d2 > d4 ? d2 - d4 : d4 - d2;
        return Math.sqrt((d5 * d5) + (d6 * d6));
    }

    public static boolean e(TraceLocation traceLocation, TraceLocation traceLocation2) {
        return traceLocation != null && traceLocation.getLatitude() == traceLocation2.getLatitude() && traceLocation.getLongitude() == traceLocation2.getLongitude();
    }

    public final void c() {
        int size = this.i.size();
        if (size < this.f) {
            return;
        }
        if (size <= 50) {
            ArrayList arrayList = new ArrayList(this.i);
            queryProcessedTrace(0, arrayList, 1, new b(arrayList));
            return;
        }
        int i = size - 50;
        if (i < 0) {
            return;
        }
        d(new ArrayList(this.i.subList(i - this.f, i)));
        ArrayList arrayList2 = new ArrayList(this.i.subList(i, size));
        queryProcessedTrace(i, arrayList2, 1, new b(arrayList2));
    }

    public final void d(List<TraceLocation> list) {
        synchronized (this.q) {
            if (list.size() <= 0) {
                return;
            }
            if (this.q.size() <= 0) {
                return;
            }
            LatLng latLng = null;
            double dA = 0.0d;
            TraceLocation traceLocation = null;
            double d = 0.0d;
            for (TraceLocation traceLocation2 : list) {
                if (traceLocation2 != null) {
                    if (traceLocation != null) {
                        double dA2 = a(traceLocation.getLatitude(), traceLocation.getLongitude(), traceLocation2.getLatitude(), traceLocation2.getLongitude());
                        if (dA2 <= 100.0d) {
                            d += dA2;
                        }
                    }
                    traceLocation = traceLocation2;
                }
            }
            Iterator<LatLng> it = this.q.iterator();
            while (it.hasNext()) {
                LatLng next = it.next();
                if (next == null) {
                    it.remove();
                } else {
                    if (latLng != null) {
                        Iterator<LatLng> it2 = it;
                        dA += a(latLng.latitude, latLng.longitude, next.latitude, next.longitude);
                        if (dA >= d) {
                            break;
                        }
                        this.o.add(next);
                        it2.remove();
                        it = it2;
                    } else {
                        this.o.add(next);
                        it.remove();
                    }
                    latLng = next;
                }
            }
        }
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void destroy() {
        try {
            stopTrace();
            com.amap.api.col.p0003sl.q0 q0Var = this.f13102c;
            if (q0Var != null) {
                q0Var.g();
                this.f13102c = null;
            }
            com.amap.api.col.p0003sl.q0 q0Var2 = this.d;
            if (q0Var2 != null) {
                q0Var2.g();
                this.d = null;
            }
            this.i = null;
            this.g = null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.a = null;
        this.b = null;
    }

    public final void g() {
        com.amap.api.col.p0003sl.a aVar = this.h;
        if (aVar != null) {
            aVar.deactivate();
            this.h = null;
        }
    }

    public final void i() {
        this.s.clear();
        this.t.clear();
        List<TraceLocation> list = this.i;
        if (list != null) {
            synchronized (list) {
                List<TraceLocation> list2 = this.i;
                if (list2 != null) {
                    list2.clear();
                }
                this.k = 0;
                this.f13104j = 0;
                this.f13105l = 0L;
                this.f13106n = null;
            }
        }
    }

    @Override // com.amap.api.maps.LocationSource.OnLocationChangedListener
    public final void onLocationChanged(Location location) {
        TraceStatusListener traceStatusListener;
        if (this.g != null) {
            try {
                if (System.currentTimeMillis() - this.f13105l >= 30000 && (traceStatusListener = this.g) != null) {
                    traceStatusListener.onTraceStatus(null, null, LBSTraceClient.LOCATE_TIMEOUT_ERROR);
                }
                this.f13105l = System.currentTimeMillis();
                Bundle extras = location.getExtras();
                int i = extras.getInt("errorCode");
                if (i != 0) {
                    Log.w("LBSTraceClient", "Locate failed [errorCode:\"" + i + "\"  errorInfo:" + extras.getString(MyLocationStyle.ERROR_INFO) + "\"]");
                    return;
                }
                synchronized (this.i) {
                    TraceLocation traceLocation = new TraceLocation(location.getLatitude(), location.getLongitude(), location.getSpeed(), location.getBearing(), location.getTime());
                    if (e(this.f13106n, traceLocation)) {
                        return;
                    }
                    this.i.add(traceLocation);
                    this.f13106n = traceLocation;
                    int i2 = this.f13104j + 1;
                    this.f13104j = i2;
                    if (i2 == this.f) {
                        this.k += i2;
                        c();
                        this.f13104j = 0;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void queryProcessedTrace(int i, List<TraceLocation> list, int i2, TraceListener traceListener) {
        try {
            this.f13102c.b(new a(i, list, i2, traceListener));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void setLocationInterval(long j2) {
        this.f13103e = j2;
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void setTraceStatusInterval(int i) {
        this.f = Math.max(i, 2);
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void startTrace(TraceStatusListener traceStatusListener) {
        if (this.a == null) {
            Log.w("LBSTraceClient", "Context need to be initialized");
            return;
        }
        this.f13105l = System.currentTimeMillis();
        this.g = traceStatusListener;
        if (this.h == null) {
            com.amap.api.col.p0003sl.a aVar = new com.amap.api.col.p0003sl.a(this.a);
            this.h = aVar;
            aVar.d(this.f13103e);
            this.h.activate(this);
        }
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void stopTrace() {
        g();
        i();
    }
}
