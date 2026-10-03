package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.oplus.accountsdk.base.common.constants.AcBaseConstants;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.platform.usercenter.account.ams.ipc.AcAccountInfo;
import com.platform.usercenter.account.ams.ipc.AcAuthResponse;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ya {
    public static final Object d = new Object();
    public final String a;
    public AcAccountInfo b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SecretKey f18933c;

    public class a implements Runnable {
        public final /* synthetic */ Context i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f18934j;

        public a(Context context, String str) {
            this.i = context;
            this.f18934j = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ya.this.d(this.i, this.f18934j);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ Context i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f18935j;
        public final /* synthetic */ String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f18936l;

        public b(Context context, String str, String str2, String str3) {
            this.i = context;
            this.f18935j = str;
            this.k = str2;
            this.f18936l = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            bb.j(this.i, this.f18935j, this.k, this.f18936l);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ Context i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f18937j;
        public final /* synthetic */ String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f18938l;

        public c(Context context, String str, String str2, String str3) {
            this.i = context;
            this.f18937j = str;
            this.k = str2;
            this.f18938l = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            bb.j(this.i, this.f18937j, this.k, this.f18938l);
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ Context i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f18939j;
        public final /* synthetic */ String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f18940l;

        public d(Context context, String str, String str2, String str3) {
            this.i = context;
            this.f18939j = str;
            this.k = str2;
            this.f18940l = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            bb.j(this.i, this.f18939j, this.k, this.f18940l);
        }
    }

    public ya(String str) {
        this.a = str;
    }

    public void A(SecretKey secretKey) {
        this.f18933c = secretKey;
    }

    public void b(Context context) {
        bb.b(context, f("AC_ACCOUNT_AUTH_FILE_NAME"));
        bb.b(context, f(AcBaseConstants.b.SETTINGS_HASH_FILE));
        p();
    }

    public void c(Context context, String str) {
        if (zj.a().d()) {
            zj.a().g(new a(context, str));
        } else {
            d(context, str);
        }
    }

    public final void d(Context context, String str) {
        e(context, f("AC_ACCOUNT_AUTH_FILE_NAME"), str);
        e(context, f(AcBaseConstants.b.SETTINGS_HASH_FILE), AcBaseConstants.b.SETTINGS_TOKEN_HASH_VALUE);
        p();
    }

    public final void e(Context context, String str, String str2) {
        bb.c(context, str, str2);
    }

    public String f(String str) {
        return this.a.toLowerCase() + "_" + str;
    }

    @WorkerThread
    public AcAuthResponse g(Context context, String str) {
        return (AcAuthResponse) j(context, f("AC_ACCOUNT_AUTH_FILE_NAME"), str, AcAuthResponse.class);
    }

    @WorkerThread
    public String h(Context context, String str) {
        return bb.e(context, f("AC_ACCOUNT_DEFAULT_CACHE"), str);
    }

    @WorkerThread
    public String i(Context context, String str, String str2) {
        String strE = bb.e(context, str, str2);
        if (TextUtils.isEmpty(strE)) {
            AcLogUtil.e("AcLocalCacheInstance", "load cache " + str + " , content is null");
            return null;
        }
        AcLogUtil.i("AcLocalCacheInstance", "load cache " + str + " finish");
        return strE;
    }

    @WorkerThread
    public <T> T j(Context context, String str, String str2, Class<T> cls) {
        String strE = bb.e(context, str, str2);
        if (TextUtils.isEmpty(strE)) {
            AcLogUtil.e("AcLocalCacheInstance", "load cache " + str + " , content is null");
            return null;
        }
        T t = (T) xa.c(strE, cls);
        StringBuilder sb = new StringBuilder();
        sb.append("load cache ");
        sb.append(str);
        sb.append(" finish, bean is null? ");
        sb.append(t == null);
        AcLogUtil.i("AcLocalCacheInstance", sb.toString());
        return t;
    }

    @WorkerThread
    public Integer k(Context context) {
        String strE = bb.e(context, f(AcBaseConstants.b.SETTINGS_HASH_FILE), AcBaseConstants.b.SETTINGS_INFO_HASH_VALUE);
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strE));
        } catch (NumberFormatException e2) {
            AcLogUtil.e("AcLocalCacheInstance", "loadInfoHashCache parse error: " + e2.getMessage());
            return null;
        }
    }

    @WorkerThread
    public String l(Context context) {
        String strE = bb.e(context, f(AcBaseConstants.b.SETTINGS_HASH_FILE), AcBaseConstants.b.SETTINGS_INFO_HASH_VALUE);
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        return strE;
    }

    @WorkerThread
    public String m(Context context) {
        return i(context, f(AcBaseConstants.b.SETTINGS_HASH_FILE), AcBaseConstants.b.SETTINGS_TOKEN_HASH_VALUE);
    }

    @WorkerThread
    public String n(Context context) {
        return h(context, "user_region_key");
    }

    public AcAccountInfo o(Context context, String str) {
        if (this.b != null) {
            AcLogUtil.i("AcLocalCacheInstance", "return local info cache", str);
            return this.b;
        }
        if (this.f18933c == null) {
            AcLogUtil.i("AcLocalCacheInstance", "sSecretKey not init", str);
            return null;
        }
        String str2 = (String) j(context, f("AC_ACCOUNT_INFO_FILE_NAME"), "account_info_key", String.class);
        if (TextUtils.isEmpty(str2)) {
            AcLogUtil.i("AcLocalCacheInstance", "encrypt is null", str);
            return null;
        }
        synchronized (d) {
            if (this.b != null) {
                AcLogUtil.i("AcLocalCacheInstance", "return local info cache synchronized", str);
                return this.b;
            }
            AcAccountInfo acAccountInfo = (AcAccountInfo) xa.c(b7.a(str2, this.f18933c), AcAccountInfo.class);
            this.b = acAccountInfo;
            return acAccountInfo;
        }
    }

    public void p() {
        this.b = null;
    }

    public abstract void q(Context context, AcAuthResponse acAuthResponse, String str);

    public void r(Context context, Object obj, String str, String str2) {
        try {
            String strD = xa.d(obj);
            if (zj.a().d()) {
                zj.a().g(new c(context, str, str2, strD));
            } else {
                bb.j(context, str, str2, strD);
            }
        } catch (Exception e2) {
            AcLogUtil.e("AcLocalCacheInstance", ("write " + str + " error") + ":" + e2.getMessage());
        }
    }

    public void s(Context context, String str, String str2) {
        String strF = f("AC_ACCOUNT_DEFAULT_CACHE");
        if (zj.a().d()) {
            zj.a().g(new b(context, strF, str, str2));
        } else {
            bb.j(context, strF, str, str2);
        }
    }

    public void t(Context context, AcAccountInfo acAccountInfo) {
        this.b = acAccountInfo;
        if (this.f18933c == null) {
            AcLogUtil.i("AcLocalCacheInstance", "sSecretKey not init");
            return;
        }
        String strB = b7.b(xa.d(acAccountInfo), this.f18933c);
        if (TextUtils.isEmpty(strB)) {
            AcLogUtil.e("AcLocalCacheInstance", "encrypt fail, isEmpty");
        } else {
            r(context, strB, f("AC_ACCOUNT_INFO_FILE_NAME"), "account_info_key");
        }
    }

    public void u(Context context, String str) {
        if (str == null) {
            return;
        }
        v(context, str, f(AcBaseConstants.b.SETTINGS_HASH_FILE), AcBaseConstants.b.SETTINGS_INFO_HASH_VALUE);
    }

    public void v(Context context, String str, String str2, String str3) {
        try {
            if (zj.a().d()) {
                zj.a().g(new d(context, str2, str3, str));
            } else {
                bb.j(context, str2, str3, str);
            }
        } catch (Exception e2) {
            AcLogUtil.e("AcLocalCacheInstance", ("write " + str2 + " error") + ":" + e2.getMessage());
        }
    }

    public void w(Context context, int i) {
        v(context, i + "", f(AcBaseConstants.b.SETTINGS_HASH_FILE), AcBaseConstants.b.SETTINGS_TOKEN_HASH_VALUE);
    }

    public void x(Context context, String str) {
        if (str == null) {
            return;
        }
        v(context, str, f(AcBaseConstants.b.SETTINGS_HASH_FILE), AcBaseConstants.b.SETTINGS_TOKEN_HASH_VALUE);
    }

    public void y(Context context, String str) {
        s(context, "user_region_key", str);
    }

    public abstract void z(Context context, AcAccountInfo acAccountInfo);
}
