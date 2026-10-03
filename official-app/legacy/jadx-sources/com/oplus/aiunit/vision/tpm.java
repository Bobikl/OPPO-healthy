package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes10.dex */
public class tpm {

    public static final class a {
        public static final boolean a(int i, int i2) {
            return i2 == (i & i2);
        }
    }

    public static final class b {
        public static boolean a() {
            String externalStorageState = Environment.getExternalStorageState();
            return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
        }

        public static c b() {
            if (a()) {
                return c.e(Environment.getExternalStorageDirectory());
            }
            return null;
        }
    }

    public static class c {
        public File a;
        public long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f17107c;

        public static c e(File file) {
            c cVar = new c();
            cVar.c(file);
            StatFs statFs = new StatFs(file.getAbsolutePath());
            long blockSize = statFs.getBlockSize();
            long blockCount = statFs.getBlockCount();
            long availableBlocks = statFs.getAvailableBlocks();
            cVar.b(blockCount * blockSize);
            cVar.f(availableBlocks * blockSize);
            return cVar;
        }

        public File a() {
            return this.a;
        }

        public void b(long j2) {
            this.b = j2;
        }

        public void c(File file) {
            this.a = file;
        }

        public long d() {
            return this.b;
        }

        public void f(long j2) {
            this.f17107c = j2;
        }

        public long g() {
            return this.f17107c;
        }

        public String toString() {
            return String.format("[%s : %d / %d]", a().getAbsolutePath(), Long.valueOf(g()), Long.valueOf(d()));
        }
    }

    public static final class d {
        @SuppressLint({"SimpleDateFormat"})
        public static SimpleDateFormat a(String str) {
            return new SimpleDateFormat(str);
        }
    }

    public static boolean a(Bundle bundle) {
        return bundle.containsKey(s04.PARAM_ACCESS_TOKEN) || bundle.containsKey("pay_token") || bundle.containsKey("pfkey") || bundle.containsKey(s04.PARAM_EXPIRES_IN) || bundle.containsKey("openid") || bundle.containsKey("proxy_code") || bundle.containsKey("proxy_expires_in");
    }

    public static boolean b(String str) {
        return str.contains(s04.PARAM_ACCESS_TOKEN) || str.contains("pay_token") || str.contains("pfkey") || str.contains(s04.PARAM_EXPIRES_IN) || str.contains("openid") || str.contains("proxy_code") || str.contains("proxy_expires_in");
    }

    public static Bundle c(Bundle bundle) {
        if (!a(bundle)) {
            return bundle;
        }
        Bundle bundle2 = new Bundle(bundle);
        bundle2.remove(s04.PARAM_ACCESS_TOKEN);
        bundle2.remove("pay_token");
        bundle2.remove("pfkey");
        bundle2.remove(s04.PARAM_EXPIRES_IN);
        bundle2.remove("openid");
        bundle2.remove("proxy_code");
        bundle2.remove("proxy_expires_in");
        return bundle2;
    }
}
