package com.heytap.accessory.sdk;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.heytap.accessory.BaseAgent;
import com.heytap.accessory.BaseSocket;
import com.heytap.accessory.api.IPeerAgentAuthCallback;
import com.heytap.accessory.api.IPeerAgentCallback;
import com.heytap.accessory.api.IServiceChannelCallback;
import com.heytap.accessory.api.IServiceConnectionCallback;
import com.heytap.accessory.base.FrameworkConnection;
import com.heytap.accessory.base.bean.FrameworkServiceDescription;
import com.heytap.accessory.bean.PeerAgent;
import com.heytap.accessory.logging.SdkLog;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.platform.MessageJobService;
import com.heytap.accessory.sdp.service.protocol.ServiceDiscoveryUtils;
import com.heytap.accessory.utils.HexUtils;
import com.heytap.accessory.utils.buffer.Buffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class SdkWrapper {
    public static final String a = "SdkWrapper";
    public static Map<Long, b> b = new ConcurrentHashMap();

    public static final class PeerAgentAuthReceiver extends ResultReceiver {
        public IPeerAgentAuthCallback a;
        public PeerAgent b;
        public long c;

        public PeerAgentAuthReceiver(IPeerAgentAuthCallback iPeerAgentAuthCallback, PeerAgent peerAgent, long j) {
            super(null);
            this.a = iPeerAgentAuthCallback;
            this.b = peerAgent;
            this.c = j;
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            if (this.a == null) {
                com.heytap.accessory.base.logging.a.e(SdkWrapper.a, "No Authentication callback found. Ignoring response!");
                return;
            }
            int i2 = bundle.getInt("CERT_TYPE");
            byte[] byteArray = bundle.getByteArray("PEER_AGENT_KEY");
            int i3 = 1;
            if (i2 != 1) {
                i3 = 2;
                if (i2 != 2) {
                    i3 = 0;
                }
            }
            bundle.putInt("CERT_TYPE", i3);
            bundle.putParcelable("peerAgent", this.b);
            bundle.putByteArray("PEER_AGENT_KEY", byteArray);
            bundle.putLong("transactionId", this.c);
            try {
                this.a.onPeerAgentAuthenticated(bundle);
            } catch (RemoteException e) {
                com.heytap.accessory.base.logging.a.e(SdkWrapper.a, "Failed to notify Auth response! -" + e.getMessage());
            }
        }
    }

    public static final class a {
        public boolean a = false;
        public IPeerAgentCallback b;
        public FrameworkServiceDescription c;

        public a(IPeerAgentCallback iPeerAgentCallback, FrameworkServiceDescription frameworkServiceDescription) {
            this.b = iPeerAgentCallback;
            this.c = frameworkServiceDescription;
        }

        public boolean a() {
            return this.a;
        }

        public void b() {
            this.a = true;
        }

        public void c() {
            this.a = false;
        }

        public void a(int i, List<com.heytap.accessory.base.bean.b> list) {
            if (i != 102) {
                if (i != 0 && i != 1) {
                    c();
                    Bundle bundle = new Bundle();
                    bundle.putInt("errorcode", i);
                    try {
                        this.b.onPeerAgentsFound(bundle);
                        return;
                    } catch (RemoteException e) {
                        SdkLog.w(SdkWrapper.a, e);
                        return;
                    }
                }
                if (list == null) {
                    com.heytap.accessory.base.logging.a.e(SdkWrapper.a, "supportedAccessories is null in incremental update");
                    return;
                }
                com.heytap.accessory.base.bean.b bVar = list.get(0);
                if (bVar == null) {
                    com.heytap.accessory.base.logging.a.e(SdkWrapper.a, "Could not unmarshall accessory in incremental update");
                    return;
                }
                if (bVar.x() == null || bVar.x().isEmpty()) {
                    com.heytap.accessory.base.logging.a.e(SdkWrapper.a, "No service record found in incremental update");
                    return;
                }
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(bVar.x().size());
                for (FrameworkServiceDescription frameworkServiceDescription : bVar.x()) {
                    arrayList.add(new PeerAgent(frameworkServiceDescription.a(), frameworkServiceDescription.d(), frameworkServiceDescription.c(), frameworkServiceDescription.n(), com.heytap.accessory.sdk.a.a(bVar), bVar.a(frameworkServiceDescription.j()), bVar.b(frameworkServiceDescription.r())));
                    bVar = bVar;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putParcelableArrayList("peerAgents", arrayList);
                bundle2.putInt("peerAgentStatus", i);
                try {
                    this.b.onPeerAgentUpdated(bundle2);
                    return;
                } catch (RemoteException e2) {
                    com.heytap.accessory.base.logging.a.b(SdkWrapper.a, "Failed to notify Incremental update : " + this.c.m() + " Role:" + this.c.o() + " Status:" + i + " " + e2.getMessage());
                    return;
                }
            }
            c();
            Bundle bundle3 = new Bundle();
            if (list == null || list.isEmpty()) {
                bundle3.putInt("errorcode", 10001);
                try {
                    this.b.onPeerAgentsFound(bundle3);
                    return;
                } catch (RemoteException e3) {
                    com.heytap.accessory.base.logging.a.b(SdkWrapper.a, "Failed to notify findPeer response for profile : " + this.c.m() + " Role : " + this.c.o() + " " + e3.getMessage());
                    return;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            com.heytap.accessory.base.logging.a.a(SdkWrapper.a, "find target[ profileId:" + this.c.m() + ",connectivityFlags:" + this.c.i() + ",role:" + this.c.o() + ",awakeable:" + this.c.e() + "]");
            Iterator<com.heytap.accessory.base.bean.b> it = list.iterator();
            ArrayList<? extends Parcelable> arrayList3 = null;
            while (it.hasNext()) {
                com.heytap.accessory.base.bean.b next = it.next();
                for (FrameworkServiceDescription frameworkServiceDescription2 : next.x()) {
                    int iMatchRemoteServiceDesc = ServiceDiscoveryUtils.matchRemoteServiceDesc(frameworkServiceDescription2, this.c);
                    if (iMatchRemoteServiceDesc == 2) {
                        com.heytap.accessory.base.logging.a.a(SdkWrapper.a, "not matchRemoteServiceDesc, getConnectivityFlags:" + frameworkServiceDescription2.i() + "; getProfileId:" + frameworkServiceDescription2.m() + "; getRole:" + frameworkServiceDescription2.o() + "; getAwakenable:" + frameworkServiceDescription2.e());
                    }
                    if (iMatchRemoteServiceDesc != 0) {
                        arrayList2.add(frameworkServiceDescription2.m());
                    } else {
                        com.heytap.accessory.base.logging.a.c(SdkWrapper.a, "Found a service :" + frameworkServiceDescription2.m() + ",appName:" + frameworkServiceDescription2.d() + ",in attached device : (" + next.k() + ",address:" + HexUtils.hideAddress(next.d()) + ",uuidType:" + next.F() + ", accId:" + next.l() + ")");
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList<>();
                        }
                        arrayList3.add(new PeerAgent(frameworkServiceDescription2.a(), frameworkServiceDescription2.d(), frameworkServiceDescription2.c(), frameworkServiceDescription2.n(), com.heytap.accessory.sdk.a.a(next), next.a(frameworkServiceDescription2.j()), next.b(frameworkServiceDescription2.r())));
                    }
                    it = it;
                }
            }
            if (arrayList3 == null || arrayList3.isEmpty()) {
                com.heytap.accessory.base.logging.a.a(SdkWrapper.a, "findPeerAgent failed, not match list:" + arrayList2);
                bundle3.putInt("errorcode", 10002);
            } else {
                bundle3.putParcelableArrayList("peerAgents", arrayList3);
            }
            try {
                this.b.onPeerAgentsFound(bundle3);
            } catch (RemoteException e4) {
                com.heytap.accessory.base.logging.a.b(SdkWrapper.a, "Failed to notify findPeer response for profile : " + this.c.m() + " Role : " + this.c.o() + " " + e4.getMessage());
            }
        }
    }

    public static void c(String str) {
        b.remove(Long.valueOf(Long.parseLong(str)));
    }

    public boolean b(String str) {
        return b.containsKey(Long.valueOf(Long.parseLong(str)));
    }

    public static a a(IPeerAgentCallback iPeerAgentCallback, FrameworkServiceDescription frameworkServiceDescription) {
        return new a(iPeerAgentCallback, frameworkServiceDescription);
    }

    public synchronized int a(FrameworkConnection frameworkConnection, String str, PeerAgent peerAgent, IServiceConnectionCallback iServiceConnectionCallback, IServiceChannelCallback iServiceChannelCallback) {
        int iA;
        FrameworkServiceDescription frameworkServiceDescriptionI = frameworkConnection.i(str);
        if (frameworkServiceDescriptionI != null && frameworkServiceDescriptionI.f() != null) {
            b bVar = new b(frameworkConnection, frameworkServiceDescriptionI, iServiceConnectionCallback, iServiceChannelCallback);
            Bundle bundleA = frameworkConnection.a(peerAgent.getAccessory().getId(), str, peerAgent.getAgentId(), bVar.f(), bVar.e(), bVar.d(), bVar.f());
            if (bundleA.getBoolean("status")) {
                b.put(Long.valueOf(com.heytap.accessory.misc.utils.c.a(peerAgent.getAccessory().getId(), str, peerAgent.getAgentId())), bVar);
                iA = 0;
            } else {
                iA = b.a(bundleA.getInt("errorcode"));
            }
        } else {
            com.heytap.accessory.base.logging.a.b(a, "Failed to retrieve service description - request");
            iA = BaseAgent.CONNECTION_FAILURE_LOCAL_AGENT_NOT_FOUND;
        }
        return iA;
    }

    public synchronized Bundle a(FrameworkConnection frameworkConnection, String str, PeerAgent peerAgent, long j, IServiceConnectionCallback iServiceConnectionCallback, IServiceChannelCallback iServiceChannelCallback) {
        String str2 = a;
        com.heytap.accessory.base.logging.a.a(str2, "prepareConnectionAccept, localAgentId = " + str);
        Bundle bundle = new Bundle();
        FrameworkServiceDescription frameworkServiceDescriptionI = frameworkConnection.i(str);
        if (frameworkServiceDescriptionI != null && frameworkServiceDescriptionI.f() != null) {
            b bVar = new b(frameworkConnection, frameworkServiceDescriptionI, iServiceConnectionCallback, iServiceChannelCallback);
            Bundle bundleA = frameworkConnection.a(peerAgent.getAccessory().getId(), peerAgent.getAgentId(), str, true, bVar.e(), (List<?>) bVar.d(), (Object) bVar.f(), j);
            String string = bundleA.getString("connectionId");
            if (string != null && !"".equals(string)) {
                long jA = com.heytap.accessory.misc.utils.c.a(peerAgent.getAccessory().getId(), str, peerAgent.getAgentId());
                bVar.a(string);
                b.put(Long.valueOf(jA), bVar);
                bundle.putString("connectionId", string);
                bundle.putLongArray("channelId", bundleA.getLongArray("channelId"));
                return bundle;
            }
            int iA = b.a(bundleA.getInt("errorcode"));
            com.heytap.accessory.base.logging.a.b(str2, "Error code " + iA);
            bundle.putInt("errorcode", iA);
            if (iA == 20001) {
                com.heytap.accessory.base.logging.a.b(str2, "ERROR_FATAL # " + frameworkServiceDescriptionI.m());
            } else if (iA != 0) {
                com.heytap.accessory.base.logging.a.b(str2, iA + " # " + PlatformUtils.getsBuildVersion() + " # " + PlatformUtils.getsSapVersionName() + " # " + frameworkServiceDescriptionI.m());
            }
            return bundle;
        }
        com.heytap.accessory.base.logging.a.b(str2, "Failed to retrieve service description - accept");
        bundle.putInt("errorcode", BaseAgent.CONNECTION_FAILURE_LOCAL_AGENT_NOT_FOUND);
        return bundle;
    }

    public int a(String str, long j, byte[] bArr, boolean z, int i, int i2, int i3, boolean z2) {
        if (z2) {
            return MessageJobService.scheduleJob(PlatformUtils.getContext(), b, str, j, bArr, z, i, i2, i3);
        }
        b bVar = b.get(Long.valueOf(Long.parseLong(str)));
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.e(a, "Service connection not found for connection id : " + str);
            return BaseSocket.ERROR_CONNECTION_ALREADY_CLOSED;
        }
        b.d dVarA = bVar.a(j);
        if (dVarA != null) {
            return dVarA.a(bArr, z, i, i2, i3);
        }
        com.heytap.accessory.base.logging.a.e(a, "Channel not found for connection id : " + str + " channel : " + j);
        return BaseSocket.ERROR_INVALID_CHANNEL;
    }

    public int a(String str, FrameworkConnection frameworkConnection, long j, String str2, byte[] bArr, int i, int i2, boolean z) {
        return frameworkConnection.a(str, j, str2, bArr, i, i2, z).getStatus();
    }

    public void a(FrameworkConnection frameworkConnection, long j, int i, int i2) {
        frameworkConnection.a(j, i, i2);
    }

    public void a(String str, long j) {
        try {
            b bVar = b.get(Long.valueOf(Long.parseLong(str)));
            if (bVar == null) {
                com.heytap.accessory.base.logging.a.b(a, new IllegalArgumentException("Service connection not found for connection id : " + str));
                return;
            }
            b.d dVarA = bVar.a(j);
            if (dVarA == null) {
                com.heytap.accessory.base.logging.a.b(a, new IllegalArgumentException("Channel not found for connection id : " + str + " channel : " + j));
                return;
            }
            dVarA.b();
        } catch (NumberFormatException e) {
            com.heytap.accessory.base.logging.a.a(a, e);
        }
    }

    public int a(String str) {
        b bVar = b.get(Long.valueOf(Long.parseLong(str)));
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.e(a, "Service connection record not found. Connection must already be closed");
            return BaseSocket.ERROR_CONNECTION_ALREADY_CLOSED;
        }
        int iC = bVar.c();
        b.remove(Long.valueOf(Long.parseLong(str)));
        return iC;
    }

    public int a(FrameworkConnection frameworkConnection, String str, PeerAgent peerAgent, IPeerAgentAuthCallback iPeerAgentAuthCallback, long j) {
        PeerAgentAuthReceiver peerAgentAuthReceiver = new PeerAgentAuthReceiver(iPeerAgentAuthCallback, peerAgent, j);
        FrameworkServiceDescription frameworkServiceDescriptionI = frameworkConnection.i(str);
        if (frameworkServiceDescriptionI == null) {
            com.heytap.accessory.base.logging.a.b(a, "Failed to fetch service description for agent : " + str + ". Aborting auth request");
            return 10014;
        }
        Bundle bundleA = frameworkConnection.a(str, peerAgent.getAgentId(), frameworkServiceDescriptionI.m(), peerAgent.getAccessory().getId(), peerAgentAuthReceiver);
        boolean z = bundleA.getBoolean("status");
        int i = bundleA.getInt("errorcode");
        if (z) {
            return 0;
        }
        if (i == 10015) {
            return BaseAgent.AUTHENTICATION_FAILURE_PEER_AGENT_NOT_SUPPORTED;
        }
        return 10014;
    }

    public static byte a(Buffer buffer) {
        return buffer.getBuffer()[buffer.getOffset()];
    }

    public static synchronized Intent a(com.heytap.accessory.base.bean.b bVar, FrameworkServiceDescription frameworkServiceDescription, int i, long j) {
        Intent intent;
        FrameworkServiceDescription next;
        synchronized (SdkWrapper.class) {
            intent = new Intent("com.heytap.accessory.action.SERVICE_CONNECTION_REQUESTED");
            Iterator<FrameworkServiceDescription> it = bVar.x().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next != null && next.a().equals(String.valueOf(i))) {
                    break;
                }
            }
            if (next == null) {
                intent = null;
            } else {
                PeerAgent peerAgent = new PeerAgent(next.a(), next.d(), next.c(), next.n(), com.heytap.accessory.sdk.a.a(bVar), bVar.a(next.j()), bVar.b(next.r()));
                intent.setPackage(frameworkServiceDescription.d());
                intent.putExtra("transactionId", j);
                intent.putExtra("agentId", frameworkServiceDescription.a());
                intent.putExtra("peerAgent", peerAgent);
                intent.setFlags(32);
            }
        }
        return intent;
        return intent;
    }

    public static boolean a(a aVar) {
        return aVar.a();
    }
}
