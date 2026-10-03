package com.oplus.phonenoareainquire;

import android.content.Context;
import android.content.IntentFilter;
import android.preference.PreferenceManager;
import android.util.ArraySet;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.bs8;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.g3e;
import com.oplus.aiunit.vision.h5f;
import com.oplus.aiunit.vision.mb5;
import com.oplus.aiunit.vision.mm4;
import com.oplus.aiunit.vision.pnk;
import com.oplus.aiunit.vision.roj;
import com.oplus.aiunit.vision.svc;
import com.oplus.aiunit.vision.wl4;
import com.oplus.aiunit.vision.yje;
import com.oplus.wearable.linkservice.sdk.Node;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class c {
    public static boolean DEBUG = false;
    public static final String LOG_SWITCH = "phonenumberattribution.log.switch";

    public class a implements mm4.b {
        public a() {
        }

        public mb5 getInterestingStatus(@NonNull ArraySet<svc> arraySet) {
            arraySet.add(svc.a.INSTANCE);
            return mb5.a.INSTANCE;
        }

        public void onNodeStatusChanged(@NonNull mb5.c cVar, @NonNull Node node, @NonNull svc svcVar) {
            wl4.deviceMultiple.a.c(this);
            c.this.g();
        }
    }

    public static class b {
        public static final c a = new c();
    }

    public class c implements Runnable {
        public void a() {
            bs8.a().execute(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            Context contextA = e88.a();
            boolean zD = c.this.d(contextA);
            if (c.DEBUG) {
                g3e.a("PhoneNoApplication", "update_success = " + zD);
            }
            if (!zD) {
                pnk pnkVar = new pnk(contextA);
                int iJ = pnkVar.j();
                pnkVar.h(true);
                g3e.a("PhoneNoApplication", "revert database result = " + iJ);
            }
            new yje().b();
        }

        public c() {
        }
    }

    public static InputStream b(String str, String str2) {
        try {
            if (!new File(str2).exists()) {
                h5f.a(str, str2);
            }
            return new FileInputStream(str2);
        } catch (Exception e) {
            g3e.b("PhoneNoApplication", "Exception when open file " + str2 + " " + e);
            return null;
        }
    }

    public static c c() {
        return b.a;
    }

    public final boolean d(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("update_state", true);
    }

    public void e() {
        wl4.deviceMultiple.a.e(new a());
        e88.a().registerReceiver(new UpdateMultiLanguageUtils(), new IntentFilter("android.intent.action.LOCALE_CHANGED"));
    }

    public final void f() {
        try {
            boolean z = com.oplus.phonenoareainquire.a.c.a(2).b.getInt(e88.a().getContentResolver(), LOG_SWITCH, 0) == 1 || roj.b("persist.sys.assert.panic", false);
            DEBUG = z;
            PhoneNoInquireProvider.DEBUG = z;
            g3e.b("PhoneNoApplication", "initDebugParam DEBUG " + DEBUG);
        } catch (Exception e) {
            g3e.b("PhoneNoApplication", "initDebugParam error" + e);
        }
    }

    public void g() {
        g3e.c("PhoneNoApplication", "onCreate");
        f();
        new c().a();
    }

    public c() {
    }
}
