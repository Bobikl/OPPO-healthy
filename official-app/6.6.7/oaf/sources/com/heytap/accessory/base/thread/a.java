package com.heytap.accessory.base.thread;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.heytap.accessory.utils.XmlReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public static final String d = "a";
    public static a e;
    public Map<String, HandlerThread> a = new HashMap();
    public Map<String, Handler> b = new HashMap();
    public ExecutorService c;

    public static a b() {
        synchronized (a.class) {
            if (e == null) {
                e = new a();
            }
        }
        return e;
    }

    public synchronized String a(int i, String str, String str2, int i2) {
        int i3;
        String strA = a(i, str, str2);
        if (!d(strA)) {
            return null;
        }
        int i4 = -1;
        for (String str3 : this.a.keySet()) {
            if (str3.contains(strA)) {
                String[] strArrSplit = str3.split("-");
                if (strArrSplit.length == 5 && (i3 = Integer.parseInt(strArrSplit[3])) > i4) {
                    i4 = i3;
                }
            }
        }
        String str4 = strA + "-" + (i4 + 1) + "-" + i2;
        com.heytap.accessory.base.logging.a.a(d, "getThreadNameForConnection: " + str4);
        return str4;
    }

    public final synchronized HandlerThread c(String str) {
        if (!d(str)) {
            return null;
        }
        HandlerThread handlerThread = this.a.get(str);
        if (handlerThread == null) {
            handlerThread = new HandlerThread(str);
            handlerThread.start();
            this.a.put(str, handlerThread);
        }
        return handlerThread;
    }

    public final boolean d(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    public synchronized boolean e(String str) {
        boolean zQuitSafely = false;
        if (!d(str)) {
            return false;
        }
        HandlerThread handlerThreadC = c(str);
        if (handlerThreadC != null) {
            zQuitSafely = handlerThreadC.quitSafely();
            this.a.remove(str);
            this.b.remove(str);
        }
        return zQuitSafely;
    }

    public synchronized Looper b(String str) {
        HandlerThread handlerThreadC;
        handlerThreadC = c(str);
        return handlerThreadC != null ? handlerThreadC.getLooper() : null;
    }

    public final String a(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (i == 1) {
            sb.append(XmlReader.TRANSPORT_WIFI);
        } else if (i == 2) {
            sb.append(XmlReader.TRANSPORT_BT);
        } else if (i != 4) {
            sb.append("UnknownConnectType");
        } else {
            sb.append(XmlReader.TRANSPORT_BLE);
        }
        sb.append("-");
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        return sb.toString();
    }

    public synchronized Handler a(String str) {
        if (!d(str)) {
            return null;
        }
        Handler handler = this.b.get(str);
        if (handler == null) {
            handler = new Handler(b(str));
            this.b.put(str, handler);
        }
        return handler;
    }

    public synchronized boolean a(String str, Runnable runnable, long j) {
        boolean zPost = false;
        if (d(str) && runnable != null) {
            Handler handlerA = a(str);
            if (handlerA != null) {
                if (j > 0) {
                    zPost = handlerA.postDelayed(runnable, j);
                } else {
                    zPost = handlerA.post(runnable);
                }
            }
            return zPost;
        }
        return false;
    }

    public synchronized ExecutorService a() {
        if (this.c == null) {
            this.c = Executors.newCachedThreadPool();
        }
        return this.c;
    }
}
