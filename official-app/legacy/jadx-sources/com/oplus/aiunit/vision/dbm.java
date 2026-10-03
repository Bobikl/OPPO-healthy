package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.PushService;
import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.store.base.core.http.HttpConst;

/* JADX INFO: loaded from: classes19.dex */
public class dbm extends hlm {
    public static final String a = "dbm";

    @Override // com.oplus.aiunit.vision.bpm
    public com.heytap.msp.push.mode.a a(Context context, int i, Intent intent) {
        if (4105 == i) {
            return c(intent, i);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public com.heytap.msp.push.mode.a c(Intent intent, int i) {
        khm khmVar;
        Exception e2;
        String str;
        khm khmVar2 = null;
        try {
            khmVar = new khm();
            try {
                try {
                    khmVar.b(Integer.parseInt(mhm.f(intent.getStringExtra(EngineConstant.WAKEUP_TYPE_COMMAND))));
                    khmVar.d(Integer.parseInt(mhm.f(intent.getStringExtra("code"))));
                    khmVar.g(mhm.f(intent.getStringExtra("content")));
                    khmVar.c(mhm.f(intent.getStringExtra(HttpConst.APP_KEY)));
                    khmVar.e(mhm.f(intent.getStringExtra(f04.JSON_KEY_APP_SECRET)));
                    khmVar.k(mhm.f(intent.getStringExtra("appPackage")));
                    String str2 = a;
                    cpm.b(str2, "parseMessageByIntent() finally will get miniProgramPkg");
                    try {
                        cpm.b(str2, "parseMessageByIntent() miniProgramPkg : message is not null and will get miniProgramPkg from intent .");
                        khmVar.i(intent.getStringExtra(PushService.MINI_PROGRAM_PKG));
                        cpm.a("OnHandleIntent-message:" + khmVar.toString());
                    } catch (Exception e3) {
                        cpm.a("OnHandleIntent--" + e3.getMessage() + " ");
                    }
                    return khmVar;
                } catch (Exception e4) {
                    e2 = e4;
                    cpm.a("OnHandleIntent--" + e2.getMessage());
                    String str3 = a;
                    cpm.b(str3, "parseMessageByIntent() finally will get miniProgramPkg");
                    if (khmVar != null) {
                        try {
                            cpm.b(str3, "parseMessageByIntent() miniProgramPkg : message is not null and will get miniProgramPkg from intent .");
                            khmVar.i(intent.getStringExtra(PushService.MINI_PROGRAM_PKG));
                            cpm.a("OnHandleIntent-message:" + khmVar.toString());
                        } catch (Exception e5) {
                            cpm.a("OnHandleIntent--" + e5.getMessage() + " ");
                        }
                    }
                    return khmVar;
                }
            } catch (Throwable unused) {
                khmVar2 = khmVar;
                str = a;
                cpm.b(str, "parseMessageByIntent() finally will get miniProgramPkg");
                if (khmVar2 != null) {
                    try {
                        cpm.b(str, "parseMessageByIntent() miniProgramPkg : message is not null and will get miniProgramPkg from intent .");
                        khmVar2.i(intent.getStringExtra(PushService.MINI_PROGRAM_PKG));
                        cpm.a("OnHandleIntent-message:" + khmVar2.toString());
                    } catch (Exception e6) {
                        cpm.a("OnHandleIntent--" + e6.getMessage() + " ");
                    }
                }
                return khmVar2;
            }
        } catch (Exception e7) {
            khmVar = null;
            e2 = e7;
        } catch (Throwable unused2) {
            str = a;
            cpm.b(str, "parseMessageByIntent() finally will get miniProgramPkg");
            if (khmVar2 != null) {
                cpm.b(str, "parseMessageByIntent() miniProgramPkg : message is not null and will get miniProgramPkg from intent .");
                khmVar2.i(intent.getStringExtra(PushService.MINI_PROGRAM_PKG));
                cpm.a("OnHandleIntent-message:" + khmVar2.toString());
            }
            return khmVar2;
        }
    }
}
