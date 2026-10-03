package com.heytap.accessory.sdp.endpoint;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.heytap.accessory.connectivity.constant.ConnectConstant;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.sdp.endpoint.i;
import com.heytap.accessory.utils.HexUtils;
import java.net.SocketException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class i {
    public static final String a = "i";
    public static final Object b = new Object();
    public static String c = "02:00:00:00:00:00";

    public interface a {
        void a(byte[] bArr);
    }

    public static String a() {
        final String[] strArr = {null};
        HandlerThread handlerThread = new HandlerThread("getP2pMac");
        handlerThread.start();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        try {
            a(new a() { // from class: com.oplus.aiunit.vision.j4n
                @Override // com.heytap.accessory.sdp.endpoint.i.a
                public final void a(byte[] bArr) {
                    i.a(strArr, atomicBoolean, bArr);
                }
            }, handlerThread.getLooper());
        } catch (SocketException e) {
            com.heytap.accessory.base.logging.a.e(a, "getP2pAddress Exception1:" + e);
        }
        if (!atomicBoolean.get()) {
            Object obj = b;
            synchronized (obj) {
                if (!atomicBoolean.get()) {
                    try {
                        obj.wait(2000L);
                    } catch (InterruptedException e2) {
                        com.heytap.accessory.base.logging.a.e(a, "getP2pAddress Exception2:" + e2);
                    }
                }
            }
        }
        handlerThread.quitSafely();
        return strArr[0];
    }

    public static String b() {
        if (!ConnectConstant.DEFAULT_WIFI_LOCAL_ADDRESS.equals(c)) {
            return c;
        }
        String strA = a();
        return strA == null ? ConnectConstant.DEFAULT_WIFI_LOCAL_ADDRESS : strA;
    }

    public static /* synthetic */ void a(String[] strArr, AtomicBoolean atomicBoolean, byte[] bArr) {
        strArr[0] = HexUtils.macByteToStr(bArr);
        atomicBoolean.set(true);
        Object obj = b;
        synchronized (obj) {
            obj.notify();
        }
    }

    @SuppressLint({"MissingPermission"})
    public static void a(final a aVar, Looper looper) throws SocketException {
        Context context = PlatformUtils.getContext();
        WifiP2pManager wifiP2pManager = (WifiP2pManager) context.getSystemService("wifip2p");
        if (looper == null) {
            com.heytap.accessory.base.logging.a.a(a, "queryP2pAddress: looper == null");
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            looper = new Handler().getLooper();
        }
        WifiP2pManager.Channel channelInitialize = wifiP2pManager.initialize(context, looper, null);
        com.heytap.accessory.base.logging.a.a(a, "call for address from manager");
        wifiP2pManager.requestDeviceInfo(channelInitialize, new WifiP2pManager.DeviceInfoListener() { // from class: com.oplus.aiunit.vision.i4n
            @Override // android.net.wifi.p2p.WifiP2pManager.DeviceInfoListener
            public final void onDeviceInfoAvailable(WifiP2pDevice wifiP2pDevice) {
                i.a(aVar, wifiP2pDevice);
            }
        });
    }

    public static /* synthetic */ void a(a aVar, WifiP2pDevice wifiP2pDevice) {
        if (wifiP2pDevice != null) {
            com.heytap.accessory.base.logging.a.a(a, "address from manager : " + wifiP2pDevice.deviceAddress);
            aVar.a(HexUtils.macStrToByte(wifiP2pDevice.deviceAddress));
            c = wifiP2pDevice.deviceAddress;
            return;
        }
        com.heytap.accessory.base.logging.a.a(a, "address from manager : device is null");
        aVar.a(null);
    }
}
