package com.alipay.sdk.m.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.oplus.aiunit.vision.gc0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes12.dex */
public class b {
    public com.alipay.sdk.m.a.a a = null;
    public String b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f595c = null;
    public final Object d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ServiceConnection f596e = new a();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            b.this.a = com.alipay.sdk.m.a.a.AbstractBinderC0145a.a(iBinder);
            synchronized (b.this.d) {
                b.this.d.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            b.this.a = null;
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.a.b$b, reason: collision with other inner class name */
    public static class C0147b {
        public static final b a = new b(null);
    }

    public /* synthetic */ b(a aVar) {
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:45:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public synchronized String a(Context context, String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot run on MainThread");
        }
        if (this.a != null) {
            try {
                return c(context, str);
            } catch (RemoteException e2) {
                e2.printStackTrace();
                return "";
            }
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
        intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
        if (!context.bindService(intent, this.f596e, 1)) {
            if (this.a == null) {
                return "";
            }
            return c(context, str);
        }
        synchronized (this.d) {
            try {
                this.d.wait(3000L);
            } catch (InterruptedException e3) {
                e3.printStackTrace();
            }
        }
        if (this.a == null) {
            return "";
        }
        try {
            return c(context, str);
        } catch (RemoteException e4) {
            e4.printStackTrace();
            return "";
        }
        throw th;
    }

    public boolean b(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            return packageInfo != null && packageInfo.getLongVersionCode() >= 1;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final String c(Context context, String str) {
        Signature[] signatureArr;
        if (TextUtils.isEmpty(this.b)) {
            this.b = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.f595c)) {
            String string = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.b, 64).signatures;
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance(gc0.SHA1);
                    if (messageDigest != null) {
                        byte[] bArrDigest = messageDigest.digest(byteArray);
                        StringBuilder sb = new StringBuilder();
                        for (byte b : bArrDigest) {
                            sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
                        }
                        string = sb.toString();
                    }
                } catch (NoSuchAlgorithmException e3) {
                    e3.printStackTrace();
                }
            }
            this.f595c = string;
        }
        String strA = ((com.alipay.sdk.m.a.a.AbstractBinderC0145a.C0146a) this.a).a(this.b, this.f595c, str);
        return TextUtils.isEmpty(strA) ? "" : strA;
    }
}
