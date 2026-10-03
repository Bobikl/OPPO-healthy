package com.oplus.onet.onboarding;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.security.cryptauth.lib.securegcm.HandshakeException;
import com.google.security.cryptauth.lib.securegcm.Ukey2Handshake;
import com.heytap.accessory.pair.utils.SecurityUtils;
import com.oplus.aiunit.vision.mx9;
import com.oplus.aiunit.vision.mxm;
import com.oplus.onet.obcommon.IServerCallback;
import com.oplus.onet.obcommon.IWifiSupport;
import com.oplus.onet.obcommon.WifiConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes8.dex */
public class WifiClient {
    public static final String h = "WifiClient";
    public final com.oplus.onet.onboarding.a a;
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ServiceConnection f20044c;
    public mx9 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IWifiSupport f20045e;
    public SecretKeySpec f;
    public IvParameterSpec g;

    public class a implements ServiceConnection {

        /* JADX INFO: renamed from: com.oplus.onet.onboarding.WifiClient$a$a, reason: collision with other inner class name */
        public class BinderC0977a extends IServerCallback.Stub {
            public BinderC0977a() {
            }

            @Override // com.oplus.onet.obcommon.IServerCallback
            public final void onServerInitialized(int i, byte[] bArr) throws RemoteException {
                Log.d(WifiClient.h, "onServerResult: " + i);
                if (i == 1) {
                    WifiClient.this.a.b(bArr);
                }
            }
        }

        public a() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            byte[] nextHandshakeMessage;
            Log.d(WifiClient.h, "onServiceConnected");
            WifiClient.this.f20045e = IWifiSupport.Stub.asInterface(iBinder);
            com.oplus.onet.onboarding.a aVar = WifiClient.this.a;
            aVar.getClass();
            try {
                Ukey2Handshake ukey2HandshakeForInitiator = Ukey2Handshake.forInitiator(Ukey2Handshake.HandshakeCipher.P256_SHA512);
                aVar.f20046c = ukey2HandshakeForInitiator;
                nextHandshakeMessage = ukey2HandshakeForInitiator.getNextHandshakeMessage();
                aVar.a = nextHandshakeMessage;
            } catch (HandshakeException e2) {
                Log.e("UkeyClient", e2.getLocalizedMessage());
                nextHandshakeMessage = null;
            }
            String packageName = WifiClient.this.b.getPackageName();
            if (nextHandshakeMessage == null) {
                Log.d(WifiClient.h, "msg is null ");
                return;
            }
            if (WifiClient.this.f20045e == null) {
                Log.d(WifiClient.h, "mWifiSupport is null ");
                return;
            }
            try {
                WifiClient.this.f20045e.initializeServer(packageName, 10000, nextHandshakeMessage, new BinderC0977a());
            } catch (RemoteException e3) {
                Log.e(WifiClient.h, "Exception!", e3);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            Log.d(WifiClient.h, "onServiceDisconnected");
            if (WifiClient.this.f20045e != null) {
                WifiClient.this.f20045e = null;
            }
            WifiClient.this.i();
        }
    }

    public class b implements com.oplus.onet.onboarding.a.b {
        public b() {
        }

        public final void a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            IvParameterSpec ivParameterSpec;
            WifiClient.this.f = new SecretKeySpec(bArr2, SecurityUtils.AES_CBC_NOPADDING);
            WifiClient wifiClient = WifiClient.this;
            if (bArr3 == null || bArr3.length != 16) {
                Log.e("c", "seekerIvSpec size is wrong");
                ivParameterSpec = null;
            } else {
                ivParameterSpec = new IvParameterSpec(bArr3);
            }
            wifiClient.g = ivParameterSpec;
            if (WifiClient.this.f20045e == null) {
                Log.d(WifiClient.h, "mWifiSupport is null ");
                return;
            }
            try {
                WifiClient.this.f20045e.finalizeClient(bArr, new com.oplus.onet.onboarding.b(this));
            } catch (RemoteException e2) {
                Log.e(WifiClient.h, "Exception!", e2);
            }
        }
    }

    public WifiClient(Context context) {
        com.oplus.onet.onboarding.a aVar = com.oplus.onet.onboarding.a.C0978a.f150do;
        this.a = aVar;
        this.f20044c = new a();
        this.b = context.getApplicationContext();
        aVar.a(new b());
    }

    public void i() {
        mx9 mx9Var;
        Log.d(h, "bind ");
        j();
        if (this.f20045e == null) {
            Intent intent = new Intent();
            intent.setAction("com.oplus.onet.WIFI_CONFIG");
            intent.setPackage("com.oplus.onet");
            if (this.b.bindService(intent, this.f20044c, 1) || (mx9Var = this.d) == null) {
                return;
            }
            mx9Var.onFailure(1002);
        }
    }

    public final void j() {
        mx9 mx9Var;
        Log.d(h, "checkServicePermission ");
        PackageManager packageManager = this.b.getPackageManager();
        boolean z = packageManager.checkPermission("android.permission.READ_WIFI_CREDENTIAL", "com.oplus.onet") == 0;
        boolean z2 = packageManager.checkPermission("android.permission.ACCESS_FINE_LOCATION", "com.oplus.onet") == 0;
        boolean z3 = packageManager.checkPermission("android.permission.ACCESS_BACKGROUND_LOCATION", "com.oplus.onet") == 0;
        if ((z && z2 && z3) || (mx9Var = this.d) == null) {
            return;
        }
        mx9Var.onFailure(1003);
    }

    public List<WifiConfig> k(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        if (arrayList == null || arrayList.isEmpty()) {
            Log.d(h, "params is " + arrayList);
            return arrayList2;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("params", arrayList);
        IWifiSupport iWifiSupport = this.f20045e;
        if (iWifiSupport == null) {
            Log.d(h, "mWifiSupport is null ");
            return null;
        }
        try {
            List<WifiConfig> recordWifiConfigs = iWifiSupport.getRecordWifiConfigs(bundle);
            SecretKeySpec secretKeySpec = this.f;
            IvParameterSpec ivParameterSpec = this.g;
            ArrayList arrayList3 = new ArrayList();
            if (recordWifiConfigs != null) {
                Iterator<WifiConfig> it = recordWifiConfigs.iterator();
                while (it.hasNext()) {
                    arrayList3.add(mxm.a(secretKeySpec, ivParameterSpec, it.next()));
                }
            }
            return arrayList3;
        } catch (RemoteException e2) {
            Log.e(h, "Exception!", e2);
            return arrayList2;
        }
    }

    public WifiConfig l(ArrayList<String> arrayList) {
        WifiConfig wifiConfig = new WifiConfig();
        Bundle bundle = new Bundle();
        if (arrayList == null || arrayList.isEmpty()) {
            Log.d(h, "params is " + arrayList);
            return wifiConfig;
        }
        bundle.putStringArrayList("params", arrayList);
        IWifiSupport iWifiSupport = this.f20045e;
        if (iWifiSupport == null) {
            Log.d(h, "mWifiSupport is null ");
            return null;
        }
        try {
            return mxm.a(this.f, this.g, iWifiSupport.getSoftAPWifiConfig(bundle));
        } catch (RemoteException e2) {
            Log.e(h, "Exception!", e2);
            return wifiConfig;
        }
    }

    public void m(mx9 mx9Var) {
        this.d = mx9Var;
    }

    public void n() {
        Log.d(h, "unbind ");
        if (this.f20045e != null) {
            this.b.unbindService(this.f20044c);
            this.f20045e = null;
        }
    }
}
