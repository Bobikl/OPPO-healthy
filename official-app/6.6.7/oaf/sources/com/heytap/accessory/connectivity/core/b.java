package com.heytap.accessory.connectivity.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.heytap.accessory.accessorymanager.ConnectConfig;
import com.heytap.accessory.base.AccessoryManager;
import com.heytap.accessory.connectivity.autoconnect.AutoConnectionManager;
import com.heytap.accessory.connectivity.constant.ConnectConstant;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.misc.utils.e;
import com.heytap.accessory.misc.utils.g;
import com.heytap.accessory.sdp.endpoint.d;
import com.heytap.accessory.security.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class b {
    public static final String a = "b";
    public static AccessoryManager c;
    public static AutoConnectionManager d;
    public static volatile Handler g;
    public static b h;
    public static com.heytap.accessory.sdp.endpoint.c i;
    public static k j;
    public static com.heytap.accessory.connectivity.core.util.b k;
    public static final com.heytap.accessory.connectivity.core.interfaces.a b = new b(null);
    public static com.heytap.accessory.connectivity.core.data.b f = new com.heytap.accessory.connectivity.core.data.b();
    public static com.heytap.accessory.connectivity.core.data.b e = new com.heytap.accessory.connectivity.core.data.b();

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 106) {
                b.e().d(message);
            }
            if (i == 109) {
                b.h(message);
                return;
            }
            if (i == 130) {
                b.f(message);
                return;
            }
            if (i == 111) {
                b.e().i(message);
                return;
            }
            if (i == 112) {
                com.heytap.accessory.base.logging.a.a(b.a, "handling msg: DEVICE_CONNECTION_TIMEOUT...");
                return;
            }
            switch (i) {
                case 119:
                    com.heytap.accessory.base.logging.a.a(b.a, "handling msg: DEVICE_ACCEPTED");
                    b.e().e(message);
                    break;
                case 120:
                    b.g(message);
                    break;
                case 121:
                    b.e().b((ConnectConfig) message.obj);
                    break;
                case 122:
                    b.e().a((ConnectConfig) message.obj);
                    break;
                case 123:
                    b.j(message);
                    break;
                default:
                    com.heytap.accessory.base.logging.a.e(b.a, "unknown event received : " + message.what);
                    break;
            }
        }
    }

    public static class b implements com.heytap.accessory.connectivity.core.interfaces.a {
        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.heytap.accessory.connectivity.core.interfaces.a
        public void a(com.heytap.accessory.base.bean.b bVar, int i) {
            Message messageObtainMessage = b.g.obtainMessage();
            messageObtainMessage.what = 111;
            messageObtainMessage.obj = bVar;
            messageObtainMessage.arg1 = i;
            b.g.sendMessage(messageObtainMessage);
        }

        @Override // com.heytap.accessory.connectivity.core.interfaces.a
        public void b(com.heytap.accessory.base.bean.b bVar) {
            b.e().e(bVar);
        }

        @Override // com.heytap.accessory.connectivity.core.interfaces.a
        public void c(com.heytap.accessory.base.bean.b bVar) {
            if (b.d.a(bVar.h()) && b.d.j(bVar.d(), bVar.h(), bVar.F())) {
                b.d.n(bVar.d(), bVar.h(), bVar.F());
            }
        }

        @Override // com.heytap.accessory.connectivity.core.interfaces.a
        public void d(com.heytap.accessory.base.bean.b bVar) {
            Message messageObtainMessage = b.g.obtainMessage();
            messageObtainMessage.what = 119;
            messageObtainMessage.obj = bVar;
            b.g.sendMessage(messageObtainMessage);
        }

        public b() {
        }

        @Override // com.heytap.accessory.connectivity.core.interfaces.a
        public void a(com.heytap.accessory.base.bean.b bVar) {
            b.e().c(bVar);
        }
    }

    public b() {
        if (g == null) {
            String str = a;
            com.heytap.accessory.base.logging.a.e(str, "Handler is null.try to create TYPE_DAEMON Looper");
            Looper looperB = com.heytap.accessory.base.thread.a.b().b("daemon");
            if (looperB == null) {
                com.heytap.accessory.base.logging.a.e(str, "TYPE_DAEMON looper create error, get the main looper");
                looperB = Looper.getMainLooper();
            }
            a(looperB);
        } else {
            com.heytap.accessory.base.logging.a.a(a, "Handle is not null. ConnectionCoreNative init it");
        }
        com.heytap.accessory.connectivity.core.interfaces.a aVar = b;
        i = com.heytap.accessory.sdp.endpoint.c.a(aVar);
        d = AutoConnectionManager.c();
        j = k.a(aVar);
        d.a(g);
        c = AccessoryManager.h();
        com.heytap.accessory.connectivity.core.a.a(g);
        k = com.heytap.accessory.connectivity.core.util.b.a(g);
        b(com.heytap.accessory.connectivity.core.util.a.b());
    }

    public static Handler d() {
        return g;
    }

    public static synchronized b e() {
        if (h == null) {
            synchronized (b.class) {
                if (h == null) {
                    h = new b();
                }
            }
        }
        return h;
    }

    public static void f(Message message) {
        com.heytap.accessory.base.logging.a.a(a, "handling msg: DEVICE_BOND_STATE_CHANGED...");
        if (message.arg1 == 6) {
            Object obj = message.obj;
            String str = obj instanceof String ? (String) obj : "";
            h.a(str, 2);
            h.a(str, 4);
        }
    }

    public static void g(Message message) {
        Object obj = message.obj;
        if (obj == null) {
            com.heytap.accessory.base.logging.a.b(a, "Received null accessory on connection request!");
            return;
        }
        if (!(obj instanceof com.heytap.accessory.base.bean.b)) {
            com.heytap.accessory.base.logging.a.b(a, "Received invalid accessory on connection request!");
            return;
        }
        com.heytap.accessory.base.bean.b bVar = (com.heytap.accessory.base.bean.b) obj;
        if (f.b(bVar) != null) {
            com.heytap.accessory.base.logging.a.b(a, "Accessory address already present in wait list! hence ignoring the connection request...");
            return;
        }
        com.heytap.accessory.base.bean.b bVarB = e.b(bVar);
        int iA = bVarB != null ? bVarB.A() : 0;
        String str = a;
        com.heytap.accessory.base.logging.a.d(str, "Device state: " + iA);
        switch (iA) {
            case 0:
            case 1:
                e().e(bVar.d(), bVar.h(), bVar.F());
                break;
            case 2:
                f.a(bVar);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                com.heytap.accessory.base.logging.a.e(str, "Device already connected\\In progress! ignoring the connect request...");
                break;
            default:
                com.heytap.accessory.base.logging.a.e(str, "Unknown device state: " + iA);
                break;
        }
    }

    public static void h(Message message) {
        long jL;
        String str = a;
        com.heytap.accessory.base.logging.a.a(str, "handling msg: DEVICE_STATE_CHANGED...");
        int i2 = message.arg2;
        if (i2 == 1) {
            if (1 == message.arg1) {
                com.heytap.accessory.base.logging.a.a(str, "received DEVICE_STATE_OFF TYPE_WIFI");
                long jLongValue = ((Long) message.obj).longValue();
                com.heytap.accessory.base.bean.b bVarA = e.a(jLongValue);
                if (bVarA == null) {
                    return;
                }
                if (bVarA.A() >= 5 && bVarA.A() <= 10) {
                    bVarA.b((byte) 0);
                    if (c.b(bVarA, 0) == -1) {
                        e.d(bVarA);
                    }
                }
                com.heytap.accessory.connectivity.negotiation.b.b().e(jLongValue, 1);
                return;
            }
            return;
        }
        if (i2 != 6) {
            return;
        }
        int[] iArr = {2, 4};
        if (1 == message.arg1) {
            com.heytap.accessory.base.logging.a.a(str, "received DEVICE_STATE_OFF TYPE_BLUETOOTH");
            for (int i3 = 0; i3 < 2; i3++) {
                int i4 = iArr[i3];
                d.b(i4);
                h.b(i4);
                for (com.heytap.accessory.base.bean.b bVar : e.a(i4)) {
                    if (bVar == null || bVar.A() < 5 || bVar.A() > 10) {
                        jL = 0;
                    } else {
                        jL = bVar.l();
                        bVar.b((byte) 0);
                        if (c.b(bVar, 0) == -1) {
                            e.d(bVar);
                        }
                    }
                    com.heytap.accessory.connectivity.negotiation.b.b().e(jL, i4);
                }
            }
            return;
        }
        com.heytap.accessory.base.logging.a.a(str, "received DEVICE_STATE_ON TYPE_BLUETOOTH");
        if (!PlatformUtils.getContext().getPackageName().equals("com.heytap.accessory")) {
            com.heytap.accessory.base.logging.a.c(str, "use oaf transport in third app, so server will not start!");
            return;
        }
        for (int i5 = 0; i5 < 2; i5++) {
            h.a(iArr[i5]);
        }
        for (ConnectConfig connectConfig : com.heytap.accessory.connectivity.core.util.a.b()) {
            int transportType = connectConfig.getTransportType();
            if (transportType == 2 || transportType == 4) {
                com.heytap.accessory.base.logging.a.c(a, "bt enable, internalReconnectDevice:" + connectConfig);
                h.c(connectConfig);
            }
        }
    }

    public static void j(Message message) {
        ConnectConfig connectConfig = (ConnectConfig) message.obj;
        if (com.heytap.accessory.connectivity.core.util.a.c(connectConfig.getAddress(), connectConfig.getTransportType(), connectConfig.getUidType()) != null) {
            d.b(connectConfig.getAddress(), connectConfig.getTransportType(), connectConfig.getRetryMode(), connectConfig.getUidType());
            return;
        }
        com.heytap.accessory.base.logging.a.c(a, "Cached info not found. Ignoring auto-connection for device: " + PlatformUtils.getPeerParams(connectConfig.getAddress(), connectConfig.getTransportType(), connectConfig.getUidType()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:53:0x0143  */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x0143, please report this as an issue */
    public final void i(Message message) {
        int i2 = message.arg1;
        String str = a;
        com.heytap.accessory.base.logging.a.b(str, "handling msg: DEVICE_ERROR(error code=0x" + i2 + ")...");
        Object obj = message.obj;
        com.heytap.accessory.base.bean.b bVar = obj instanceof com.heytap.accessory.base.bean.b ? (com.heytap.accessory.base.bean.b) obj : null;
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.b(str, "handling msg: DEVICE_ERROR for NULL accessory with (error code=" + i2 + ")... ");
            return;
        }
        if (bVar.h() == 1 && (i2 == -1126 || i2 == -1110)) {
            int iA = com.heytap.accessory.connectivity.wifi.tools.a.b().a();
            if (bVar.u() == 1) {
                int[] iArr = com.heytap.accessory.connectivity.wifi.tools.a.c;
                if (iA < iArr.length - 1) {
                    int i3 = iA + 1;
                    com.heytap.accessory.connectivity.wifi.tools.a.b().a(i3);
                    com.heytap.accessory.base.logging.a.a(str, "tring to fix port in use, new port:" + iArr[i3]);
                    String strD = bVar.d();
                    a(bVar);
                    com.heytap.accessory.connectivity.core.util.a.a(bVar, ConnectConstant.ERROR_DISCOVERY_ACCESSORY_FRAMEWORK_INCOMPATIBLE, message.arg1);
                    e(strD, 1, bVar.F());
                    return;
                }
            }
        }
        if (i2 == -1121 || !f(bVar)) {
            if (bVar.A() == 1 || bVar.A() == 2) {
                com.heytap.accessory.base.logging.a.a(str, "Accessory already cleaned up. Returning...");
                return;
            }
            switch (i2) {
                case ConnectConstant.ERROR_CHANNEL_AUTH_RESPONSE_INVALID /* -2110 */:
                case ConnectConstant.ERROR_CHANNEL_AUTH_INVALID_STATE /* -2109 */:
                case ConnectConstant.ERROR_CHANNEL_AUTH_TIMEOUT /* -2108 */:
                case ConnectConstant.ERROR_CHANNEL_AUTH_DISCONNECTED_UNEXPECTED /* -2107 */:
                case ConnectConstant.ERROR_CHANNEL_AUTH_REACH_MAX_TRY /* -2106 */:
                    break;
                default:
                    if (i2 != -2104) {
                        if (i2 != -1115) {
                            if (i2 == -1012) {
                                com.heytap.accessory.base.logging.a.e(str, "ERROR_AUTOCONNECT_INVALID_MODE : error=" + Integer.toHexString(message.arg1) + "; deviceAddress: " + PlatformUtils.getAddrforLog(bVar.d()));
                                com.heytap.accessory.connectivity.core.util.a.a(bVar, ConnectConstant.ERROR_AUTOCONNECT_INVALID_MODE, message.arg1);
                                return;
                            }
                            if (i2 == -1010) {
                                com.heytap.accessory.base.logging.a.e(str, "ERROR_AUTOCONNECT_CONNECTIVITY_NOT_SUPPORTED : error=" + Integer.toHexString(message.arg1) + "; deviceAddress: " + PlatformUtils.getAddrforLog(bVar.d()));
                                com.heytap.accessory.connectivity.core.util.a.a(bVar, ConnectConstant.ERROR_AUTOCONNECT_CONNECTIVITY_NOT_SUPPORTED, message.arg1);
                                return;
                            }
                            if (i2 != 104) {
                                if (i2 != 113) {
                                    switch (i2) {
                                        case ConnectConstant.ERROR_DISCOVERY_VERSION_INCOMPATIBLE /* -1127 */:
                                            com.heytap.accessory.base.logging.a.e(str, "Version not compatible ");
                                            a(bVar);
                                            com.heytap.accessory.connectivity.core.util.a.a(bVar, ConnectConstant.ERROR_DISCOVERY_VERSION_INCOMPATIBLE, message.arg1);
                                            break;
                                        case ConnectConstant.ERROR_DISCOVERY_SELF_PEER_DESCRIPTION_FAILED /* -1126 */:
                                            break;
                                        case -1125:
                                            a(bVar);
                                            com.heytap.accessory.base.logging.a.e(str, "Socket creation failed : " + i2);
                                            com.heytap.accessory.connectivity.core.util.a.a(bVar, -1106, message.arg1);
                                            break;
                                        case ConnectConstant.ERROR_DISCOVERY_EXCEED_MAX_CONNECTIONS /* -1124 */:
                                            com.heytap.accessory.base.logging.a.e(str, "PeerDescription Max connection reached");
                                            a(bVar);
                                            com.heytap.accessory.connectivity.core.util.a.a(bVar, ConnectConstant.ERROR_DISCOVERY_EXCEED_MAX_CONNECTIONS, message.arg1);
                                            break;
                                        case ConnectConstant.ERROR_DISCOVERY_DEVICE_NOT_PAIRED /* -1123 */:
                                            com.heytap.accessory.base.logging.a.a(str, "device not paired");
                                            a(bVar);
                                            com.heytap.accessory.connectivity.core.util.a.a(bVar, ConnectConstant.ERROR_DISCOVERY_DEVICE_NOT_PAIRED, message.arg1);
                                            break;
                                        case ConnectConstant.ERROR_DISCOVERY_DEVICE_DISCONNECTION_IN_PROGRESS /* -1122 */:
                                        case ConnectConstant.ERROR_DISCOVERY_DEVICE_CONNECTION_IN_PROGRESS /* -1121 */:
                                            com.heytap.accessory.connectivity.core.util.a.a(bVar, ConnectConstant.ERROR_DISCOVERY_DEVICE_CONNECTION_IN_PROGRESS, message.arg1);
                                            break;
                                        case ConnectConstant.ERROR_DISCOVERY_DEVICE_ALREADY_DISCONNECTED /* -1120 */:
                                            com.heytap.accessory.connectivity.core.util.a.a(bVar, ConnectConstant.ERROR_DISCOVERY_DEVICE_ALREADY_DISCONNECTED, message.arg1);
                                            break;
                                        case ConnectConstant.ERROR_DISCOVERY_DEVICE_ALREADY_CONNECTED /* -1119 */:
                                            com.heytap.accessory.connectivity.core.util.a.a(bVar, ConnectConstant.ERROR_DISCOVERY_DEVICE_ALREADY_CONNECTED, message.arg1);
                                            break;
                                        case ConnectConstant.ERROR_DISCOVERY_CATEGORY_NOT_ALLOWED /* -1118 */:
                                            com.heytap.accessory.base.logging.a.e(str, "PeerDescription category is not allowed");
                                            a(bVar);
                                            com.heytap.accessory.connectivity.core.util.a.a(bVar, ConnectConstant.ERROR_DISCOVERY_CATEGORY_NOT_ALLOWED, message.arg1);
                                            break;
                                        case ConnectConstant.ERROR_DISCOVERY_BT_SOCKET_WRITE_FAILED /* -1117 */:
                                            break;
                                        default:
                                            switch (i2) {
                                                case -1113:
                                                case ConnectConstant.ERROR_DISCOVERY_BT_CREATE_STREAM_FAILED /* -1109 */:
                                                    com.heytap.accessory.base.logging.a.e(str, "Socket creation failed : ");
                                                    a(bVar);
                                                    com.heytap.accessory.connectivity.core.util.a.a(bVar, -1113, message.arg1);
                                                    break;
                                                case ConnectConstant.ERROR_DISCOVERY_BT_SOCKET_CONNECT_TIMEOUT /* -1112 */:
                                                    com.heytap.accessory.base.logging.a.e(str, "Socket connection timeout expired");
                                                    a(bVar);
                                                    com.heytap.accessory.connectivity.core.util.a.a(bVar, ConnectConstant.ERROR_DISCOVERY_BT_SOCKET_CONNECT_TIMEOUT, message.arg1);
                                                    break;
                                                case -1111:
                                                    break;
                                                case -1110:
                                                case ConnectConstant.ERROR_DISCOVERY_BT_CLOSE_STREAM_FAILED /* -1108 */:
                                                    com.heytap.accessory.base.logging.a.e(str, "socket or stream close is failed");
                                                    a(bVar);
                                                    com.heytap.accessory.connectivity.core.util.a.a(bVar, -1110, message.arg1);
                                                    break;
                                                case -1107:
                                                case -1106:
                                                case ConnectConstant.ERROR_DISCOVERY_BLE_CREATE_STREAM_FAILED /* -1105 */:
                                                    a(bVar);
                                                    com.heytap.accessory.base.logging.a.e(str, "Socket creation failed : " + i2);
                                                    com.heytap.accessory.connectivity.core.util.a.a(bVar, -1106, message.arg1);
                                                    break;
                                                default:
                                                    switch (i2) {
                                                        case ConnectConstant.ERROR_DISCOVERY_AUTHENTICATION_SELF_CREDENTIALS_FAILED /* -1103 */:
                                                        case ConnectConstant.ERROR_DISCOVERY_AUTHENTICATION_REMOTE_CREDENTIALS_FAILED /* -1102 */:
                                                            break;
                                                        case ConnectConstant.ERROR_DISCOVERY_ALREADY_ONGOING_CONNECTION /* -1101 */:
                                                            com.heytap.accessory.base.logging.a.e(str, "Already ongoing connections : not allowed");
                                                            a(bVar);
                                                            com.heytap.accessory.connectivity.core.util.a.a(bVar, ConnectConstant.ERROR_DISCOVERY_ALREADY_ONGOING_CONNECTION, message.arg1);
                                                            break;
                                                        default:
                                                            com.heytap.accessory.base.logging.a.e(str, "Un-handled error. breaking ...");
                                                            a(bVar);
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                }
                                com.heytap.accessory.base.logging.a.e(str, "Socket connection failed");
                                a(bVar);
                                com.heytap.accessory.connectivity.core.util.a.a(bVar, -1111, message.arg1);
                                return;
                            }
                            com.heytap.accessory.base.logging.a.e(str, "PeerDescription exchange is failed");
                            a(bVar);
                            com.heytap.accessory.connectivity.core.util.a.a(bVar, ConnectConstant.ERROR_DISCOVERY_ACCESSORY_FRAMEWORK_INCOMPATIBLE, message.arg1);
                            return;
                        }
                        com.heytap.accessory.base.logging.a.e(str, "Socket Read/Write failed : ");
                        a(bVar);
                        com.heytap.accessory.connectivity.core.util.a.a(bVar, ConnectConstant.ERROR_DISCOVERY_BT_SOCKET_READ_WRITE_FAILED, message.arg1);
                        return;
                    }
                    break;
            }
            com.heytap.accessory.base.logging.a.e(str, "Authentication failed, errorCode:" + message.arg1);
            bVar.a(false);
            a(bVar);
            com.heytap.accessory.connectivity.core.util.a.a(bVar, ConnectConstant.ERROR_DISCOVERY_AUTHENTICATION_REMOTE_CREDENTIALS_FAILED, message.arg1);
        }
    }

    public final void k(com.heytap.accessory.base.bean.b bVar) {
        com.heytap.accessory.base.logging.a.c(a, "DY connection : flag " + bVar.h() + " , mode " + ((int) bVar.o()));
        if (bVar.o() == 1 && bVar.u() == 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ConnectConstant.CHANNEL_NAME_STREAMING);
            arrayList.add(ConnectConstant.CHANNEL_NAME_FILETRANSFER);
            com.heytap.accessory.connectivity.negotiation.b.b().c(bVar.l(), arrayList);
        }
    }

    public void l(com.heytap.accessory.base.bean.b bVar) {
        if (d.b(bVar)) {
            com.heytap.accessory.connectivity.core.util.a.a(bVar.d(), bVar.h(), bVar.F());
        }
    }

    public final void d(Message message) {
        String str = a;
        com.heytap.accessory.base.logging.a.a(str, "handling msg: DEVICE_ACCESSORY_LOST...");
        int i2 = message.arg1;
        Object obj = message.obj;
        com.heytap.accessory.base.bean.b bVar = obj instanceof com.heytap.accessory.base.bean.b ? (com.heytap.accessory.base.bean.b) obj : null;
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.b(str, "accessory or accessory address is null");
            return;
        }
        com.heytap.accessory.base.bean.b bVarB = e.b(bVar);
        if (bVarB == null) {
            com.heytap.accessory.base.logging.a.e(str, "handleAccessoryLost, but deviceMap cannot find the accessory.");
            return;
        }
        if (message.arg1 != 10) {
            i2 = 258;
        } else {
            if (bVarB.A() == 3) {
                com.heytap.accessory.base.logging.a.b(str, "Disconnecting accessory while PD is in progress");
                if (i.b(bVarB)) {
                    a(bVarB);
                    c.a(bVarB, "com.heytap.accessory.device.action.ACCESSORY_DETACHED", i2);
                    return;
                }
                return;
            }
            if (bVarB.A() == 4) {
                com.heytap.accessory.base.logging.a.b(str, "Disconnecting accessory while Auth is in progress");
                if (j.d(bVarB)) {
                    a(bVarB);
                    c.a(bVarB, "com.heytap.accessory.device.action.ACCESSORY_DETACHED", i2);
                    return;
                }
                return;
            }
        }
        com.heytap.accessory.base.logging.a.a(str, "[oaf_conn]Disconnect accessory:" + PlatformUtils.getAddrforLog(bVarB.d()) + " uuid = " + bVarB.F() + " errorCode = " + i2);
        long jL = bVarB.l();
        int iH = bVarB.h();
        long jB = c.b(bVarB, i2);
        com.heytap.accessory.base.logging.a.a(str, "Accessory[" + jB + "] removed is " + PlatformUtils.getAddrforLog(bVarB.d()));
        if (jB == -1) {
            com.heytap.accessory.base.logging.a.c(str, "Removed Accessory with address : " + PlatformUtils.getAddrforLog(bVarB.d()));
            e.d(bVarB);
        }
        com.heytap.accessory.connectivity.negotiation.b.b().e(jL, iH);
    }

    public final void c(com.heytap.accessory.base.bean.b bVar, com.heytap.accessory.base.bean.b bVar2) {
        String strD = bVar.d();
        int iH = bVar.h();
        int iF = bVar.F();
        if (d.f(strD, iH, iF) && (d.j(strD, iH, iF) || d.i(strD, iH, iF))) {
            com.heytap.accessory.base.logging.a.e(a, "Connection to same device already in progress! Disconnecting device " + PlatformUtils.getAddrforLog(strD) + " : " + iH);
            i.b(bVar);
            return;
        }
        com.heytap.accessory.base.bean.b bVarA = c.a(bVar.d(), bVar.h(), bVar.F());
        if (bVarA != null) {
            bVarA.a(bVar.e());
            bVar = bVarA;
        }
        if (a(bVar, false)) {
            i.e(bVar);
        }
    }

    public final void b(ConnectConfig connectConfig) {
        if (connectConfig.getTransportType() == 1) {
            com.heytap.accessory.connectivity.wifi.tools.a.b().c();
        }
        ConnectConfig connectConfigC = com.heytap.accessory.connectivity.core.util.a.c(connectConfig.getAddress(), connectConfig.getTransportType(), connectConfig.getUidType());
        com.heytap.accessory.connectivity.core.util.a.a(connectConfig.getAddress(), connectConfig.getTransportType(), connectConfig.getUidType(), connectConfigC);
        com.heytap.accessory.base.bean.b bVarA = e.a(connectConfig.getAddress(), connectConfig.getTransportType(), connectConfig.getUidType());
        if (bVarA != null && bVarA.h() == connectConfig.getTransportType() && Objects.equals(bVarA.d(), connectConfig.getAddress()) && bVarA.A() >= 3) {
            com.heytap.accessory.base.logging.a.c(a, "Device: " + PlatformUtils.getAddrforLog(connectConfig.getAddress()) + " for tranport: " + connectConfig.getTransportType() + " already connected or connection in progress. Ignoring auto-connection!");
            d.p(connectConfig.getAddress(), connectConfig.getTransportType(), connectConfig.getUidType());
            return;
        }
        if (d.f(connectConfig.getAddress(), connectConfig.getTransportType(), connectConfig.getUidType())) {
            if (!d.h(connectConfig.getAddress(), connectConfig.getTransportType(), connectConfig.getUidType())) {
                com.heytap.accessory.base.logging.a.e(a, "handleReconnectDevice state is not intent queued!");
                return;
            }
            String str = a;
            com.heytap.accessory.base.logging.a.e(str, "Reconnecting device: " + PlatformUtils.getAddrforLog(connectConfig.getAddress()) + " for tranport: " + connectConfig.getTransportType());
            com.heytap.accessory.base.bean.b bVarA2 = com.heytap.accessory.base.bean.b.a(connectConfig.getAddress(), connectConfig.getTransportType(), connectConfig.getUidType());
            if (bVarA2 != null && a(bVarA2, true)) {
                d.a(bVarA2);
                com.heytap.accessory.base.logging.a.e(str, "setReconnectRequested: " + bVarA2.d());
                i.a(bVarA2);
                return;
            }
            if (bVarA2 == null) {
                com.heytap.accessory.base.logging.a.e(str, "handleReconnectDevice FrameworkAccessory.createAccessory failed, restarting the timer");
            } else {
                com.heytap.accessory.base.logging.a.e(str, "handleReconnectDevice setupDefaultSession failed, restarting the timer");
                a(bVarA2.l());
            }
            d.p(connectConfig.getAddress(), connectConfig.getTransportType(), connectConfigC.getUidType());
        }
    }

    public static void a(Looper looper) {
        g = new a(looper);
    }

    public static void a(com.heytap.accessory.base.bean.b bVar, com.heytap.accessory.base.bean.b bVar2) {
        if (bVar2.h() == bVar.h() && bVar2.F() == bVar.F()) {
            com.heytap.accessory.base.logging.a.e(a, "Connection to same device already in progress!(ConnectivityFlags Same ed) Disconnecting device " + PlatformUtils.getAddrforLog(bVar.d()));
            i.b(bVar);
            return;
        }
        f.a(bVar);
        h.b(bVar2.d(), bVar2.h(), bVar2.F());
    }

    public static void j(com.heytap.accessory.base.bean.b bVar) {
        c.h(bVar);
    }

    public final void e(Message message) {
        Object obj = message.obj;
        com.heytap.accessory.base.bean.b bVar = obj instanceof com.heytap.accessory.base.bean.b ? (com.heytap.accessory.base.bean.b) obj : null;
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.b(a, "device or device address is null");
        }
        if (g(bVar)) {
            com.heytap.accessory.base.logging.a.e(a, "handleDeviceAccepted,current device is connecting,ignore request...");
            return;
        }
        com.heytap.accessory.base.bean.b bVarA = e.a(bVar.l());
        int iA = bVarA != null ? bVarA.A() : 0;
        String str = a;
        com.heytap.accessory.base.logging.a.d(str, "HandleDeviceAccepted - Device state: " + iA);
        switch (iA) {
            case 0:
            case 1:
                c(bVar, bVarA);
                break;
            case 2:
                f.a(bVar);
                break;
            case 3:
            case 4:
                b(bVar, bVarA);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                a(bVar, bVarA);
                break;
            default:
                com.heytap.accessory.base.logging.a.e(str, "Unknown device state: " + iA);
                break;
        }
    }

    public final boolean f(com.heytap.accessory.base.bean.b bVar) {
        if (!d.f(bVar.d(), bVar.h(), bVar.F())) {
            return false;
        }
        if (d.g(bVar.d(), bVar.h(), bVar.F())) {
            a(bVar.l());
            d.a(bVar.d(), bVar.h(), bVar.F());
            return false;
        }
        if (d.j(bVar.d(), bVar.h(), bVar.F())) {
            a(bVar.l());
            d.p(bVar.d(), bVar.h(), bVar.F());
            return true;
        }
        if (d.i(bVar.d(), bVar.h(), bVar.F())) {
            a(bVar);
            d.p(bVar.d(), bVar.h(), bVar.F());
            return true;
        }
        if (!d.k(bVar.d(), bVar.h(), bVar.F())) {
            return false;
        }
        a(bVar);
        com.heytap.accessory.connectivity.core.util.a.a(bVar, ConnectConstant.ERROR_AUTOCONNECT_CONNECT_FAILED, ConnectConstant.ERROR_AUTOCONNECT_CONNECT_FAILED);
        d.a(bVar.d(), bVar.h(), bVar.F());
        return true;
    }

    public void a(ConnectConfig connectConfig) {
        String address = connectConfig.getAddress();
        int transportType = connectConfig.getTransportType();
        int retryMode = connectConfig.getRetryMode();
        int uidType = connectConfig.getUidType();
        com.heytap.accessory.connectivity.core.util.a.a(address, transportType, uidType, connectConfig);
        com.heytap.accessory.base.logging.a.a(a, "Connect device: " + PlatformUtils.getAddrforLog(address) + " transport: " + transportType + " (retry_mode: " + retryMode + ")");
        if (transportType == 1) {
            com.heytap.accessory.connectivity.wifi.tools.a.b().c();
        }
        if (retryMode >= 0 && retryMode <= 2) {
            if (!d.a(transportType)) {
                if (retryMode != 0) {
                    com.heytap.accessory.base.bean.b bVarA = com.heytap.accessory.base.bean.b.a(address, transportType, uidType);
                    if (bVarA != null) {
                        a(ConnectConstant.ERROR_AUTOCONNECT_CONNECTIVITY_NOT_SUPPORTED, bVarA);
                        return;
                    }
                    return;
                }
                e(address, transportType, uidType);
                return;
            }
            com.heytap.accessory.base.bean.b bVarA2 = e.a(address, transportType, uidType);
            int iA = (bVarA2 == null || bVarA2.h() != transportType) ? 0 : bVarA2.A();
            com.heytap.accessory.connectivity.core.util.a.a(connectConfig, iA);
            d.c(address, transportType, retryMode, uidType, iA);
            if (retryMode != 0) {
                a(com.heytap.accessory.base.bean.b.a(address, transportType, uidType), iA);
                return;
            } else if (d.f(address, transportType, uidType)) {
                a(ConnectConstant.ERROR_DISCOVERY_DEVICE_CONNECTION_IN_PROGRESS, com.heytap.accessory.base.bean.b.a(address, transportType, uidType));
                return;
            } else {
                e(address, transportType, uidType);
                return;
            }
        }
        com.heytap.accessory.base.bean.b bVarA3 = com.heytap.accessory.base.bean.b.a(address, transportType, uidType);
        if (bVarA3 != null) {
            a(ConnectConstant.ERROR_AUTOCONNECT_INVALID_MODE, bVarA3);
        }
    }

    public final void c(com.heytap.accessory.base.bean.b bVar) {
        String str = a;
        com.heytap.accessory.base.logging.a.c(str, "handling msg: DEVICE_ACCESSORY_FOUND...");
        if (e.b(bVar) != null) {
            if (bVar.J()) {
                bVar.b(bVar.f());
            } else {
                bVar.b(true);
            }
            g.g(bVar.d());
            com.heytap.accessory.connectivity.c.b().d(bVar);
            long jA = c.a(bVar);
            if (jA == -1) {
                com.heytap.accessory.base.logging.a.e(str, "Add Accessory id:" + PlatformUtils.getAddrforLog(bVar.d()) + " failed! (E_INVALID_ACCESSORY | E_ACCESSORY_ALREADY_PRESENT)");
            } else if (bVar.l() == jA) {
                com.heytap.accessory.base.logging.a.c(str, "Successfully added Accessory id:" + PlatformUtils.getAddrforLog(bVar.d()));
            }
            if (d.g(bVar.d(), bVar.h(), bVar.F())) {
                com.heytap.accessory.base.logging.a.c(str, "Removing Accessory id:" + PlatformUtils.getAddrforLog(bVar.d()) + " as disconnect was called during AutoConnect");
                Message messageObtainMessage = g.obtainMessage();
                messageObtainMessage.what = 106;
                messageObtainMessage.obj = e.b(bVar);
                messageObtainMessage.arg1 = 10;
                d(messageObtainMessage);
                d.a(bVar.d(), bVar.h(), bVar.F());
            }
            k(bVar);
            return;
        }
        com.heytap.accessory.base.logging.a.e(str, "No device(" + PlatformUtils.getAddrforLog(bVar.d()) + ") found in the map!");
    }

    public boolean g(com.heytap.accessory.base.bean.b bVar) {
        return e.c(bVar);
    }

    public final void e(com.heytap.accessory.base.bean.b bVar) {
        String str = a;
        com.heytap.accessory.base.logging.a.a(str, "handling msg: DEVICE_PEER_DESCRIPTION_SUCCESS...");
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.b(str, "device or device address is null");
            return;
        }
        g.e(bVar.d());
        e.a(bVar);
        bVar.l(4);
        j.c(bVar);
        if (bVar.h() == 2 || bVar.h() == 4) {
            e.a(bVar, new d.a(bVar.p(), bVar.H()));
        }
    }

    public final void e(String str, int i2, int i3) {
        int iA;
        com.heytap.accessory.base.bean.b bVarA = e.a(str, i2, i3);
        if (bVarA != null) {
            iA = bVarA.A();
        } else {
            bVarA = com.heytap.accessory.base.bean.b.a(str, i2, i3);
            iA = 0;
        }
        if (bVarA == null || !a(bVarA, iA)) {
            return;
        }
        if (a(bVarA, false)) {
            i.a(bVarA);
            return;
        }
        com.heytap.accessory.base.logging.a.e(a, "Connect failed! Setting up the default session failed for the device :" + str);
    }

    public final void b(com.heytap.accessory.base.bean.b bVar, com.heytap.accessory.base.bean.b bVar2) {
        if (bVar2.h() == bVar.h()) {
            com.heytap.accessory.base.logging.a.e(a, "Connection to same device already in progress!(ConnectivityFlags Same ing) Disconnecting device " + PlatformUtils.getAddrforLog(bVar.d()));
            i.b(bVar);
            return;
        }
        i.b(bVar2);
        e.d(bVar2);
        if (i.d(bVar)) {
            com.heytap.accessory.base.logging.a.e(a, "Connection to same device already in progress!(ConnectionInProgress ing) Disconnecting device " + PlatformUtils.getAddrforLog(bVar.d()));
            i.b(bVar);
            return;
        }
        if (a(bVar, false)) {
            i.e(bVar);
        }
    }

    public void d(com.heytap.accessory.base.bean.b bVar) {
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.e(a, "Received a NULL Accessory to handle DETACH!");
            return;
        }
        String str = a;
        com.heytap.accessory.base.logging.a.d(str, "Removing device: " + PlatformUtils.getAddrforLog(bVar.d()) + " transport: " + bVar.h());
        com.heytap.accessory.base.bean.b bVarB = e.b(bVar);
        if (bVarB != null && bVarB.h() == bVar.h()) {
            bVarB.b((byte) 0);
            e.d(bVar);
        }
        j.a(bVar.l());
        i.a(bVar.l());
        com.heytap.accessory.base.logging.a.c(str, "Successfully removed Accessory Id: " + PlatformUtils.getAddrforLog(bVar.d()));
        h(bVar);
        if (d.f(bVar.d(), bVar.h(), bVar.F())) {
            d.l(bVar.d(), bVar.h(), bVar.F());
            d.p(bVar.d(), bVar.h(), bVar.F());
        }
    }

    public static com.heytap.accessory.base.bean.b c(String str, int i2, int i3) {
        return c.a(str, i2, i3);
    }

    public void a(boolean z) {
        com.heytap.accessory.base.bean.c.a().a(z);
        List<com.heytap.accessory.base.bean.b> listB = c.b(255);
        com.heytap.accessory.base.logging.a.a(a, "getConnectedAccessories size=" + listB.size());
        Iterator<com.heytap.accessory.base.bean.b> it = listB.iterator();
        while (it.hasNext()) {
            com.heytap.accessory.session.g.o().a(it.next().l(), 0, 0, z);
        }
    }

    public final void c(ConnectConfig connectConfig) {
        Message messageObtainMessage = g.obtainMessage(122);
        messageObtainMessage.obj = connectConfig;
        g.sendMessage(messageObtainMessage);
    }

    public final void h(com.heytap.accessory.base.bean.b bVar) {
        com.heytap.accessory.base.bean.b bVarD = f.d(bVar);
        if (bVarD == null || !a(bVarD, false)) {
            return;
        }
        i.e(bVarD);
    }

    public void b(String str, int i2, int i3) {
        if (a(str, i2, i3)) {
            return;
        }
        com.heytap.accessory.base.bean.b bVarA = e.a(str, i2, i3);
        if (bVarA != null && bVarA.h() == i2) {
            g.removeMessages(105, bVarA);
            if (bVarA.A() == 1) {
                com.heytap.accessory.base.logging.a.e(a, "Device is already disconnected!");
                a(ConnectConstant.ERROR_DISCOVERY_DEVICE_ALREADY_DISCONNECTED, bVarA);
                return;
            }
            if (bVarA.A() == 2) {
                com.heytap.accessory.base.logging.a.e(a, "Device disconnection is in progress");
                a(ConnectConstant.ERROR_DISCOVERY_DEVICE_DISCONNECTION_IN_PROGRESS, bVarA);
                return;
            }
            com.heytap.accessory.base.logging.a.a(a, "disconnecting device: " + PlatformUtils.getAddrforLog(str) + " from transport:" + i2 + ",uuid=" + i3);
            Message messageObtainMessage = g.obtainMessage();
            messageObtainMessage.what = 106;
            messageObtainMessage.obj = bVarA;
            messageObtainMessage.arg1 = 10;
            messageObtainMessage.sendToTarget();
            return;
        }
        com.heytap.accessory.base.logging.a.e(a, "Cannot disconnect device: " + PlatformUtils.getAddrforLog(str) + " for tranport: " + i2 + " Not found in the map!");
        a(ConnectConstant.ERROR_DISCOVERY_DEVICE_ALREADY_DISCONNECTED, com.heytap.accessory.base.bean.b.a(str, i2, i3));
    }

    public void a(long j2, boolean z) {
        com.heytap.accessory.base.bean.b bVarA = c.a(j2);
        if (bVarA != null) {
            bVarA.d(z);
        }
    }

    public final boolean a(com.heytap.accessory.base.bean.b bVar, boolean z) {
        g.f(bVar.d());
        bVar.l(3);
        if (bVar.l() == -1) {
            bVar.a(c.e());
        }
        boolean zA = com.heytap.accessory.session.g.o().a(bVar);
        if (!zA) {
            bVar.l(0);
        } else if (!z) {
            com.heytap.accessory.base.logging.a.a(a, "add accessory:" + bVar.l());
            bVar.a(true);
            e.a(bVar);
        }
        return zA;
    }

    public static com.heytap.accessory.base.bean.b d(String str, int i2, int i3) {
        return c.b(str, i2, i3);
    }

    public final boolean a(com.heytap.accessory.base.bean.b bVar, int i2) {
        if (bVar == null) {
            return false;
        }
        if (i2 != 3 && i2 != 4) {
            if (com.heytap.accessory.security.b.b(bVar)) {
                com.heytap.accessory.base.logging.a.e(a, "auth retry arrive max time, ignore connect request");
                a(ConnectConstant.ERROR_CHANNEL_AUTH_REACH_MAX_TRY, bVar);
                return false;
            }
            if (i2 < 5) {
                return true;
            }
            if (i2 == 10) {
                com.heytap.accessory.base.logging.a.e(a, "Device is already connected! returning ...");
                a(ConnectConstant.ERROR_DISCOVERY_DEVICE_ALREADY_CONNECTED, bVar);
                return false;
            }
            com.heytap.accessory.base.logging.a.e(a, "Accessory connection is in between Auth and Capex! Accessory State - " + i2);
            a(ConnectConstant.ERROR_DISCOVERY_DEVICE_CONNECTION_IN_PROGRESS, bVar);
            return false;
        }
        com.heytap.accessory.base.logging.a.e(a, "A connect attempt is already in progress to this device! returning ...");
        a(ConnectConstant.ERROR_DISCOVERY_DEVICE_CONNECTION_IN_PROGRESS, bVar);
        return false;
    }

    public int b(com.heytap.accessory.base.bean.b bVar) {
        return d.e(bVar.d(), bVar.h(), bVar.F());
    }

    public static com.heytap.accessory.base.bean.b b(long j2) {
        com.heytap.accessory.base.bean.b bVarA = e.a(j2);
        if (bVarA == null) {
            return null;
        }
        if (bVarA.A() == 3 || bVarA.A() == 4) {
            return bVarA;
        }
        return null;
    }

    public boolean a(String str, int i2) {
        return a(str, i2, 0) && a(str, i2, 1);
    }

    public final void b(List<ConnectConfig> list) {
        com.heytap.accessory.base.logging.a.a(a, "cacheConnectDevices: " + list.toString() + " size = " + list.size());
        Iterator<ConnectConfig> it = list.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public final boolean a(String str, int i2, int i3) {
        if (!d.f(str, i2, i3)) {
            com.heytap.accessory.base.logging.a.a(a, "disableAutoConnect, Details is not Present, ignore., address" + str + ", connectivity" + i2 + ", uuid" + i3);
            return false;
        }
        if (d.g(str, i2, i3)) {
            a(ConnectConstant.ERROR_DISCOVERY_DEVICE_CONNECTION_IN_PROGRESS, com.heytap.accessory.base.bean.b.a(str, i2, i3));
            return true;
        }
        com.heytap.accessory.connectivity.core.util.a.a(str, i2, i3);
        if (d.j(str, i2, i3)) {
            com.heytap.accessory.base.logging.a.e(a, "disableAutoConnect");
            d.m(str, i2, i3);
            return true;
        }
        d.a(str, i2, i3);
        return false;
    }

    public void b(int i2) {
        com.heytap.accessory.base.logging.a.a(a, "Stop advertising(type:  " + i2 + ")  ...");
        i.b(i2);
    }

    public void i(com.heytap.accessory.base.bean.b bVar) {
        if (k == null || bVar.h() != 1) {
            return;
        }
        k.b();
    }

    public boolean a(int i2) {
        com.heytap.accessory.base.logging.a.a(a, "Start advertising(type:  " + i2 + ")  ...");
        return i.a(i2);
    }

    public void a(List<String> list) {
        com.heytap.accessory.base.logging.a.c(a, "CM has died... cleanUp AC mode & Connect in Progress");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String[] strArrSplit = it.next().split("&");
            if (strArrSplit.length < 3 || TextUtils.isEmpty(strArrSplit[0]) || TextUtils.isEmpty(strArrSplit[1])) {
                return;
            }
            if (d.b(strArrSplit[0], Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]))) {
                com.heytap.accessory.connectivity.core.util.a.a(strArrSplit[0], Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
            }
        }
    }

    public final void a(com.heytap.accessory.base.bean.b bVar) {
        com.heytap.accessory.base.bean.b bVarB = e.b(bVar);
        if (bVarB != null && bVarB.h() == bVar.h()) {
            bVarB.l(1);
            bVarB.b((byte) 0);
            e.d(bVar);
        }
        com.heytap.accessory.session.g.o().d(bVar.l());
    }

    public final void a(long j2) {
        com.heytap.accessory.base.bean.b bVarA = e.a(j2);
        if (bVarA != null) {
            bVarA.l(1);
            bVarA.b((byte) 0);
        }
        com.heytap.accessory.session.g.o().d(j2);
    }

    public final void a(int i2, com.heytap.accessory.base.bean.b bVar) {
        Message messageObtainMessage = g.obtainMessage();
        messageObtainMessage.what = 111;
        messageObtainMessage.obj = bVar;
        messageObtainMessage.arg1 = i2;
        messageObtainMessage.sendToTarget();
    }
}
