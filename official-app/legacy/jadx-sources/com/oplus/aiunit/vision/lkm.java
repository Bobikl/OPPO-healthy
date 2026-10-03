package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.oplus.smartenginehelper.ParserTag;

/* JADX INFO: loaded from: classes12.dex */
public class lkm {
    public static String A = null;
    public static volatile lkm B = null;
    public static volatile zgm C = null;
    public static final String a = "VMS_IDLG_SDK_Client";
    public static final String b = "content://com.vivo.vms.IdProvider/IdentifierId";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f13753c = "persist.sys.identifierid.supported";
    public static final String d = "appid";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f13754e = "type";
    public static final String f = "OAID";
    public static final String g = "VAID";
    public static final String h = "AAID";
    public static final int i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f13755j = 1;
    public static final int k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f13756l = 4;
    public static final int m = 11;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f13757n = 2000;
    public static Context o = null;
    public static boolean p = false;
    public static wom q;
    public static wom r;
    public static wom s;
    public static Object t = new Object();
    public static HandlerThread u;
    public static Handler v;
    public static String w;
    public static String x;
    public static String y;
    public static String z;

    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 11) {
                Log.e(lkm.a, "message type valid");
                return;
            }
            String unused = lkm.w = lkm.C.a(message.getData().getInt("type"), message.getData().getString("appid"));
            synchronized (lkm.t) {
                lkm.t.notify();
            }
        }
    }

    public static lkm a(Context context) {
        if (B == null) {
            synchronized (lkm.class) {
                o = context.getApplicationContext();
                B = new lkm();
            }
        }
        if (C == null) {
            synchronized (lkm.class) {
                o = context.getApplicationContext();
                l();
                C = new zgm(o);
                k();
            }
        }
        return B;
    }

    public static String c(String str, String str2) {
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return (String) cls.getMethod(ParserTag.TAG_GET, String.class, String.class).invoke(cls, str, "unknown");
            } catch (Exception e2) {
                e2.printStackTrace();
                return str2;
            }
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static void e(Context context, int i2, String str) {
        if (i2 == 0) {
            q = new wom(B, 0, null);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, q);
            return;
        }
        if (i2 == 1) {
            r = new wom(B, 1, str);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str), false, r);
            return;
        }
        if (i2 != 2) {
            return;
        }
        s = new wom(B, 2, str);
        context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + str), false, s);
    }

    public static void k() {
        p = "1".equals(c(f13753c, "0"));
    }

    public static void l() {
        HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
        u = handlerThread;
        handlerThread.start();
        v = new a(u.getLooper());
    }

    public String b() {
        if (!h()) {
            return null;
        }
        String str = x;
        if (str != null) {
            return str;
        }
        d(0, null);
        if (q == null) {
            e(o, 0, null);
        }
        return x;
    }

    public void d(int i2, String str) {
        synchronized (t) {
            f(i2, str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                t.wait(2000L);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
            if (SystemClock.uptimeMillis() - jUptimeMillis >= 2000) {
                Log.d(a, "query timeout");
            } else if (i2 == 0) {
                x = w;
                w = null;
            } else if (i2 != 1) {
                if (i2 == 2) {
                    String str2 = w;
                    if (str2 != null) {
                        z = str2;
                        w = null;
                    } else {
                        Log.e(a, "get aaid failed");
                    }
                } else if (i2 != 4) {
                }
                A = w;
                w = null;
            } else {
                String str3 = w;
                if (str3 != null) {
                    y = str3;
                    w = null;
                } else {
                    Log.e(a, "get vaid failed");
                }
            }
        }
    }

    public final void f(int i2, String str) {
        Message messageObtainMessage = v.obtainMessage();
        messageObtainMessage.what = 11;
        Bundle bundle = new Bundle();
        bundle.putInt("type", i2);
        if (i2 == 1 || i2 == 2) {
            bundle.putString("appid", str);
        }
        messageObtainMessage.setData(bundle);
        v.sendMessage(messageObtainMessage);
    }

    public boolean h() {
        return p;
    }
}
