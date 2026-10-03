package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class fgm {

    public static class a implements tam.a<Object, Boolean> {
        @Override // com.oplus.aiunit.vision.tam.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    public static class b implements Callable<String> {
        public final /* synthetic */ Context i;

        public b(Context context) {
            this.i = context;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            return fmm.a(this.i);
        }
    }

    public static class c implements tam.a<Object, Boolean> {
        @Override // com.oplus.aiunit.vision.tam.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof NetworkInfo) || obj == null);
        }
    }

    public static class d implements Callable<NetworkInfo> {
        public final /* synthetic */ Context i;

        public d(Context context) {
            this.i = context;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NetworkInfo call() {
            return ((ConnectivityManager) this.i.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        }
    }

    public static class e implements tam.a<Object, Boolean> {
        @Override // com.oplus.aiunit.vision.tam.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    public static class f implements Callable<String> {
        public final /* synthetic */ Context i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ qam f11351j;

        public f(Context context, qam qamVar) {
            this.i = context;
            this.f11351j = qamVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            try {
                return lam.b(this.i);
            } catch (Throwable th) {
                l9m.h(this.f11351j, sgm.o, sgm.u, th.getClass().getName());
                return "";
            }
        }
    }

    public static class g implements tam.a<Object, Boolean> {
        @Override // com.oplus.aiunit.vision.tam.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    public static class h implements Callable<String> {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f11352j;
        public final /* synthetic */ Context k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ qam f11353l;

        public class a implements APSecuritySdk.InitResultListener {
            public final /* synthetic */ String[] a;
            public final /* synthetic */ ConditionVariable b;

            public a(String[] strArr, ConditionVariable conditionVariable) {
                this.a = strArr;
                this.b = conditionVariable;
            }

            @Override // com.alipay.apmobilesecuritysdk.face.APSecuritySdk.InitResultListener
            public void onResult(APSecuritySdk.TokenResult tokenResult) {
                if (tokenResult != null) {
                    this.a[0] = tokenResult.apdidToken;
                }
                this.b.open();
            }
        }

        public h(String str, String str2, Context context, qam qamVar) {
            this.i = str;
            this.f11352j = str2;
            this.k = context;
            this.f11353l = qamVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            HashMap map = new HashMap();
            map.put("tid", this.i);
            map.put("utdid", this.f11352j);
            String[] strArr = {""};
            try {
                APSecuritySdk aPSecuritySdk = APSecuritySdk.getInstance(this.k);
                ConditionVariable conditionVariable = new ConditionVariable();
                aPSecuritySdk.initToken(0, map, new a(strArr, conditionVariable));
                conditionVariable.block(3000L);
            } catch (Throwable th) {
                qrm.d(th);
                l9m.h(this.f11353l, sgm.o, sgm.r, th.getClass().getName());
            }
            if (TextUtils.isEmpty(strArr[0])) {
                l9m.h(this.f11353l, sgm.o, sgm.s, "missing token");
            }
            return strArr[0];
        }
    }

    public static NetworkInfo a(qam qamVar, Context context) {
        Context contextA = tam.a(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (NetworkInfo) tam.c(2, 10L, timeUnit, new c(), new d(contextA), false, 10L, timeUnit, qamVar, false);
    }

    public static String b(qam qamVar, Context context, String str, String str2) {
        Context contextA = tam.a(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (String) tam.c(4, 10L, timeUnit, new g(), new h(str, str2, contextA, qamVar), true, 3L, timeUnit, qamVar, true);
    }

    public static String c(qam qamVar, Context context) {
        if (!h9m.I().D()) {
            return "";
        }
        return (String) tam.c(1, 1L, TimeUnit.DAYS, new a(), new b(tam.a(context)), true, 200L, TimeUnit.MILLISECONDS, qamVar, true);
    }

    public static String d(qam qamVar, Context context) {
        return (String) tam.c(3, 1L, TimeUnit.DAYS, new e(), new f(tam.a(context), qamVar), true, 3L, TimeUnit.SECONDS, qamVar, false);
    }
}
