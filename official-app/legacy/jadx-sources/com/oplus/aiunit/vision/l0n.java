package com.oplus.aiunit.vision;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.maps.model.LatLng;
import com.amap.api.trace.LBSTraceClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class l0n {
    public static volatile l0n b;
    public Map<String, a> a;

    public class a {
        public int a;
        public int b;
        public int d;
        public HashMap<Integer, List<LatLng>> f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13469c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13470e = 0;
        public List<LatLng> g = new ArrayList();

        public a(int i, int i2, int i3, HashMap<Integer, List<LatLng>> map) {
            this.a = 0;
            this.b = 0;
            this.d = 0;
            this.a = i2;
            this.f = map;
            this.b = i;
            this.d = i3;
        }

        public final HashMap<Integer, List<LatLng>> a() {
            return this.f;
        }

        public final void b(Handler handler) {
            List<LatLng> list;
            for (int i = this.f13469c; i <= this.a && (list = this.f.get(Integer.valueOf(i))) != null; i++) {
                this.g.addAll(list);
                c(handler, list);
            }
            if (this.f13469c == this.a + 1) {
                d(handler);
            }
        }

        public final void c(Handler handler, List<LatLng> list) {
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.obj = list;
            messageObtainMessage.what = 100;
            messageObtainMessage.arg1 = this.f13469c;
            Bundle bundle = new Bundle();
            bundle.putInt("lineID", this.b);
            messageObtainMessage.setData(bundle);
            handler.sendMessage(messageObtainMessage);
            this.f13469c++;
            this.f13470e++;
        }

        public final void d(Handler handler) {
            if (this.f13470e <= 0) {
                l0n.c(handler, this.b, LBSTraceClient.MIN_GRASP_POINT_ERROR);
                return;
            }
            int iA = i0n.a(this.g);
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.obj = this.g;
            messageObtainMessage.what = 101;
            messageObtainMessage.arg1 = iA;
            messageObtainMessage.arg2 = this.d;
            Bundle bundle = new Bundle();
            bundle.putInt("lineID", this.b);
            messageObtainMessage.setData(bundle);
            handler.sendMessage(messageObtainMessage);
        }
    }

    public l0n() {
        this.a = null;
        this.a = Collections.synchronizedMap(new HashMap());
    }

    public static l0n b() {
        if (b == null) {
            synchronized (l0n.class) {
                if (b == null) {
                    b = new l0n();
                }
            }
        }
        return b;
    }

    public static void c(Handler handler, int i, String str) {
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.obj = str;
        messageObtainMessage.what = 102;
        Bundle bundle = new Bundle();
        bundle.putInt("lineID", i);
        messageObtainMessage.setData(bundle);
        handler.sendMessage(messageObtainMessage);
    }

    public final synchronized a a(String str) {
        Map<String, a> map = this.a;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public final synchronized void d(String str, int i, int i2, int i3) {
        Map<String, a> map = this.a;
        if (map != null) {
            map.put(str, new a(i, i2, i3, new HashMap(16)));
        }
    }

    public final synchronized void e(String str, int i, List<LatLng> list) {
        Map<String, a> map = this.a;
        if (map != null) {
            map.get(str).a().put(Integer.valueOf(i), list);
        }
    }
}
