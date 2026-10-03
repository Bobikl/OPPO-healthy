package com.oplus.aiunit.vision;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.heytap.health.base.encrypt.AesGcmAndroidKeyStore;
import com.heytap.speech.engine.constant.EngineConstant;
import java.util.UUID;

/* JADX INFO: loaded from: classes15.dex */
public class wna {
    public static final String b = "KEY_ERROR_SP_NAME" + gxe.c();
    public volatile String a;

    public static class a {
        public static final wna a = new wna();
    }

    public static wna b() {
        return a.a;
    }

    public static void e() {
        a7b.m("KeyCryptUtil", "killAndRecord");
        SharedPreferences.Editor editorEdit = b78.a().getSharedPreferences(b, 0).edit();
        editorEdit.putString("KEY_ERROR_MSG_SP_KEY", "get mmkv k is null.Time: " + System.currentTimeMillis());
        editorEdit.commit();
        gxe.p("get mmkv k is null");
    }

    public static void h() {
        a7b.f("KeyCryptUtil", "reportKeyStoreEn");
        SharedPreferences sharedPreferences = b78.a().getSharedPreferences("KS_EN_SP_NAME", 0);
        String string = sharedPreferences.getString("KS_EnK", "");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        a7b.f("KeyCryptUtil", "reportKeyStoreEn -- report");
        com.heytap.health.base.track.a.p().a("type", "KEY_STORE_ENCRYPT").a(f04.JSON_KEY_RKE_IS_ENCRYPT, string).b();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.clear();
        editorEdit.commit();
    }

    public static void i() {
        a7b.f("KeyCryptUtil", "reportKeyStoreError");
        SharedPreferences sharedPreferences = b78.a().getSharedPreferences(b, 0);
        String string = sharedPreferences.getString("KEY_ERROR_MSG_SP_KEY", "");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        a7b.f("KeyCryptUtil", "reportKeyStoreError -- report");
        com.heytap.health.base.track.a.p().a("type", "KEY_STORE").a("KeyCrypt", string).a("ProcessName", gxe.c()).b();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.clear();
        editorEdit.commit();
    }

    public final void a() {
        SharedPreferences sharedPreferences = b78.a().getSharedPreferences(b, 0);
        if (sharedPreferences.getLong("KEY_FIRST_FAILURE_TIME", 0L) != 0) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.remove("KEY_FIRST_FAILURE_TIME");
            editorEdit.apply();
            a7b.f("KeyCryptUtil", "cleared failure record");
        }
    }

    public String c() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    d();
                }
            }
        }
        return this.a;
    }

    public final void d() {
        AesGcmAndroidKeyStore aesGcmAndroidKeyStoreG = AesGcmAndroidKeyStore.g();
        aesGcmAndroidKeyStoreG.k();
        try {
            boolean zI = aesGcmAndroidKeyStoreG.i(ooa.UNIQUE_KEY, null);
            if (zI) {
                this.a = aesGcmAndroidKeyStoreG.b(ooa.UNIQUE_KEY, null);
                if (this.a != null) {
                    a();
                } else if (l()) {
                    a7b.m("KeyCryptUtil", "decrypt failed over 1 min, resetting key");
                    j(aesGcmAndroidKeyStoreG);
                } else {
                    a7b.m("KeyCryptUtil", "decrypt failed, waiting for retry");
                    f();
                }
            } else {
                this.a = UUID.randomUUID().toString().replace("-", "");
                k(aesGcmAndroidKeyStoreG.c(ooa.UNIQUE_KEY, this.a, null));
                a();
            }
            aesGcmAndroidKeyStoreG.n();
            StringBuilder sb = new StringBuilder();
            sb.append("[KeyUtil] key ");
            sb.append(this.a);
            sb.append(", hasKey is ");
            sb.append(zI);
        } catch (Throwable th) {
            aesGcmAndroidKeyStoreG.n();
            throw th;
        }
    }

    public final void f() {
        SharedPreferences sharedPreferences = b78.a().getSharedPreferences(b, 0);
        if (sharedPreferences.getLong("KEY_FIRST_FAILURE_TIME", 0L) == 0) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putLong("KEY_FIRST_FAILURE_TIME", System.currentTimeMillis());
            editorEdit.commit();
            a7b.m("KeyCryptUtil", "recorded first failure time");
        }
    }

    public final void g() {
        try {
            com.heytap.health.base.track.a.p().a("type", "KEY_STORE_RESET").a(EngineConstant.REASON, "decrypt_failed_over_1min").a("ProcessName", gxe.c()).b();
        } catch (Exception e2) {
            a7b.b("KeyCryptUtil", "reportKeyReset error: " + e2.getMessage());
        }
    }

    public final void j(AesGcmAndroidKeyStore aesGcmAndroidKeyStore) {
        try {
            aesGcmAndroidKeyStore.l(ooa.UNIQUE_KEY);
            a7b.m("KeyCryptUtil", "removed old KeyStore key");
        } catch (Exception e2) {
            a7b.b("KeyCryptUtil", "remove old key error: " + e2.getMessage());
        }
        this.a = UUID.randomUUID().toString().replace("-", "");
        k(aesGcmAndroidKeyStore.c(ooa.UNIQUE_KEY, this.a, null));
        a();
        g();
    }

    public final void k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a7b.f("KeyCryptUtil", "encrypt:" + str);
        SharedPreferences.Editor editorEdit = b78.a().getSharedPreferences("KS_EN_SP_NAME", 0).edit();
        editorEdit.putString("KS_EnK", str);
        editorEdit.commit();
    }

    public final boolean l() {
        long j2 = b78.a().getSharedPreferences(b, 0).getLong("KEY_FIRST_FAILURE_TIME", 0L);
        if (j2 == 0) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j2;
        a7b.m("KeyCryptUtil", "shouldResetKey elapsed: " + jCurrentTimeMillis + "ms");
        return jCurrentTimeMillis >= 60000;
    }

    public wna() {
    }
}
