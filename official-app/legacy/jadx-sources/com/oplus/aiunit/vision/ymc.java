package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.store.base.core.http.HttpUtils;
import com.heytap.upgrade.UpgradeSDK;
import com.heytap.upgrade.exception.UpgradeException;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes19.dex */
public class ymc {

    public static class a implements rp9 {
        public String a;
        public long b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f19068c;
        public File d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public zs9 f19069e;
        public String f;
        public String g;

        public a(String str, long j2, File file, String str2, zs9 zs9Var) {
            this.a = str;
            this.f19068c = j2;
            this.d = file;
            this.f19069e = zs9Var;
            this.f = file.getName();
            this.g = str2;
        }

        @Override // com.oplus.aiunit.vision.rp9
        public void a(long j2) {
            u6b.b("upgrade_NetManager", "range from " + j2);
            this.b = j2;
        }

        @Override // com.oplus.aiunit.vision.rp9
        public void b() {
            u6b.b("upgrade_NetManager", this.f + " download interrupted");
            this.f19069e.h0();
        }

        @Override // com.oplus.aiunit.vision.rp9
        public void c(long j2) {
            long j3 = this.b + j2;
            int i = (int) ((100 * j3) / this.f19068c);
            if (!Thread.currentThread().isInterrupted()) {
                if (w81.stopDownload) {
                    return;
                }
                this.f19069e.f0(i, j3);
            } else {
                e6b.a("upgrade_NetManager", this.f + " pause download and return !");
                this.f19069e.onCanceled();
            }
        }

        @Override // com.oplus.aiunit.vision.rp9
        public void onComplete() {
            u6b.b("upgrade_NetManager", this.f + " download complete, start check md5");
            if (k26.a(this.d, this.g)) {
                this.f19069e.g(this.d);
            } else {
                this.f19069e.g0(20013);
            }
        }
    }

    public void a(String str, String str2, File file, String str3, long j2, zs9 zs9Var) throws Throwable {
        long length;
        if (file.exists()) {
            length = file.length();
        } else {
            u6b.a("NetManager#download(), downloadFile not exists, path=" + file.getAbsolutePath());
            length = 0L;
        }
        String name = file.getName();
        u6b.a("NetManager#download(), downloadFile=" + name + ",downSize=" + length);
        long j3 = length > 1024 ? length - 1024 : 0L;
        a aVar = new a(str, j2, file, str3, zs9Var);
        try {
            String str4 = "bytes=" + j3 + "-";
            u6b.a(str + ", headerRange=" + str4);
            UpgradeSDK upgradeSDK = UpgradeSDK.instance;
            if (upgradeSDK.inner.g()) {
                u6b.a(str + "," + name + " use proxy to download...");
                upgradeSDK.inner.f();
                throw null;
            }
            u6b.a(str + "," + name + " use default HttpUrlConnection to download...");
            unc.c(str, str2, str4, file, aVar);
        } catch (UpgradeException e2) {
            u6b.b("upgrade_NetManager", "download exception: " + e2);
            zs9Var.g0(e2.getErrorCode());
        }
    }

    public jkk b(String str, TreeMap<String, String> treeMap, TreeMap<String, String> treeMap2) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (treeMap != null) {
            for (Map.Entry<String, String> entry : treeMap.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                    sb.append(entry.getKey());
                    sb.append(HttpUtils.EQUAL_SIGN);
                    sb.append(entry.getValue());
                    sb.append("&");
                }
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        String strReplace = sb.toString().replace(" ", "");
        if (strReplace.length() != 0) {
            str = str.concat("?").concat(strReplace);
        }
        if (treeMap2 == null) {
            treeMap2 = new TreeMap<>();
        }
        String str2 = "" + System.currentTimeMillis();
        treeMap2.put("t", str2);
        StringBuilder sb2 = new StringBuilder();
        int[] iArr = p04.API_OAK_ARRAY;
        sb2.append(zba.a(iArr));
        sb2.append(zba.a(p04.API_SEC_ARRAY));
        sb2.append(str2);
        sb2.append(p04.API_INNER_UPGRADE);
        sb2.append(strReplace);
        String string = sb2.toString();
        treeMap2.put("sign", rqk.g((string + string.length()).getBytes()));
        treeMap2.put(dj8.KEY, zba.a(iArr));
        treeMap2.put(dj8.CHANNEL, p04.API_CHANNEL);
        u6b.b("upgrade_NetManager", "request url=" + str);
        u6b.b("upgrade_NetManager", "request headers:" + rqk.t(treeMap2));
        try {
            y7a initParam = UpgradeSDK.instance.getInitParam();
            if (initParam != null) {
                initParam.c();
            }
            e6b.a("upgrade_NetManager", "use HttpURLConnection to request");
            jkk jkkVarA = unc.a(str, treeMap2);
            u6b.b("upgrade_NetManager", "statusCode=" + jkkVarA.d);
            u6b.b("upgrade_NetManager", "response=" + jkkVarA.a);
            return jkkVarA;
        } catch (IOException e2) {
            e6b.a("upgrade_NetManager", "checkUpgrade exception:" + e2.getMessage());
            throw e2;
        }
    }
}
