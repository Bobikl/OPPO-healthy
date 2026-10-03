package com.heytap.accessory.sdk;

import android.os.Bundle;
import android.os.RemoteException;
import com.heytap.accessory.BaseAgent;
import com.heytap.accessory.WriteStatus;
import com.heytap.accessory.api.IServiceChannelCallback;
import com.heytap.accessory.api.IServiceConnectionCallback;
import com.heytap.accessory.base.FrameworkConnection;
import com.heytap.accessory.base.bean.FrameworkServiceChannelDescription;
import com.heytap.accessory.base.bean.FrameworkServiceDescription;
import com.heytap.accessory.misc.constants.FrameworkServiceConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public static final String g = "b";
    public Map<Long, d> a;
    public IServiceConnectionCallback b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2627c = "-1";
    public c d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FrameworkConnection f2628e;
    public boolean f;

    public class a implements c {
        public a() {
        }

        @Override // com.heytap.accessory.sdk.b.c
        public void a(int i, Bundle bundle) {
            if (b.this.b == null) {
                com.heytap.accessory.base.logging.a.b(b.g, "Connection callback not found!");
                return;
            }
            if (i == 100) {
                String string = bundle.getString(FrameworkServiceConstants.SERVICE_CONNECTION_ID);
                long[] longArray = bundle.getLongArray("channelId");
                b.this.a(string);
                bundle.clear();
                bundle.putString("connectionId", string);
                bundle.putLongArray("channelId", longArray);
                String str = b.g;
                StringBuilder sb = new StringBuilder();
                sb.append("onConnectionEvent:  channelIdSize");
                sb.append(longArray != null ? longArray.length : 0);
                com.heytap.accessory.base.logging.a.a(str, sb.toString());
                try {
                    b.this.b.onConnectionResponse(bundle);
                    return;
                } catch (RemoteException e2) {
                    com.heytap.accessory.base.logging.a.e(b.g, "Failed to notify connection success:" + e2.getMessage());
                    return;
                }
            }
            if (i == 101) {
                int i2 = bundle.getInt(FrameworkServiceConstants.EXTRA_ERROR);
                bundle.clear();
                bundle.putInt("errorcode", b.a(i2));
                try {
                    b.this.b.onConnectionResponse(bundle);
                    return;
                } catch (RemoteException e3) {
                    com.heytap.accessory.base.logging.a.e(b.g, "Failed to notify connection failure:" + e3.getMessage());
                    return;
                }
            }
            if (i != 203) {
                if (i != 300) {
                    com.heytap.accessory.base.logging.a.b(b.g, "Unknown connection event result code");
                    return;
                }
                b.this.f = false;
                b.this.b();
                if (b.this.f2627c != null) {
                    SdkWrapper.c(b.this.f2627c);
                } else {
                    com.heytap.accessory.base.logging.a.e(b.g, "Connection Id not found on disconnect");
                }
                bundle.clear();
                bundle.putInt("errorcode", 0);
                try {
                    bundle.putLong("connectionId", Long.parseLong(b.this.f2627c));
                    b.this.b.onConnectionLost(bundle);
                    return;
                } catch (RemoteException e4) {
                    com.heytap.accessory.base.logging.a.e(b.g, "Failed to notify Disconnection:" + e4.toString());
                    return;
                }
            }
            b.this.f = false;
            b.this.b();
            if (b.this.f2627c != null) {
                SdkWrapper.c(b.this.f2627c);
            } else {
                com.heytap.accessory.base.logging.a.e(b.g, "Connection Id not found on error");
            }
            int i3 = bundle.getInt(FrameworkServiceConstants.CONNECTION_ERROR_KEY);
            bundle.clear();
            if (i3 == 203) {
                bundle.putInt("errorcode", 1);
            } else if (i3 == 204) {
                bundle.putInt("errorcode", 2);
            } else {
                bundle.putInt("errorcode", 3);
            }
            try {
                bundle.putLong("connectionId", Long.parseLong(b.this.f2627c));
                b.this.b.onConnectionLost(bundle);
            } catch (RemoteException e5) {
                com.heytap.accessory.base.logging.a.e(b.g, "Failed to notify Connection error:" + e5.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.heytap.accessory.sdk.b$b, reason: collision with other inner class name */
    public interface InterfaceC0252b {
        void a(int i, Bundle bundle);
    }

    public interface c {
        void a(int i, Bundle bundle);
    }

    public static class d {
        public static final String g = "b$d";
        public IServiceChannelCallback a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f2629c;
        public WeakReference<b> d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2630e;
        public InterfaceC0252b b = new a();
        public int f = 2;

        public class a implements InterfaceC0252b {
            public a() {
            }

            @Override // com.heytap.accessory.sdk.b.InterfaceC0252b
            public void a(int i, Bundle bundle) {
                if (d.this.a == null) {
                    com.heytap.accessory.base.logging.a.b(d.g, "Channel callback not found!");
                    return;
                }
                if (i == 201) {
                    bundle.putInt("com.heytap.accessory.adapter.extra.READ_OFFSET", bundle.getInt("com.heytap.accessory.adapter.extra.READ_OFFSET") + 1);
                    bundle.putInt("com.heytap.accessory.adapter.extra.READ_LENGHT", bundle.getInt("com.heytap.accessory.adapter.extra.READ_LENGHT") - 1);
                    bundle.putLong("channelId", d.this.f2629c);
                    bundle.putInt("priority", d.this.f2630e);
                    try {
                        d.this.a.onRead(bundle);
                        return;
                    } catch (RemoteException e2) {
                        com.heytap.accessory.base.logging.a.e(d.g, "Failed to notify incoming data: " + e2.getMessage());
                        return;
                    }
                }
                if (i != 202) {
                    com.heytap.accessory.base.logging.a.b(d.g, "Unhandled channel event: " + i);
                    return;
                }
                boolean z = bundle.getBoolean(FrameworkServiceConstants.EXTRA_SEND_TIMEOUT);
                synchronized (d.this) {
                    if (z) {
                        d.this.f = 0;
                    } else {
                        d.this.f = 1;
                    }
                    com.heytap.accessory.base.logging.a.a(d.g, "ServiceChannel notify" + d.this);
                    try {
                        d.this.notify();
                    } catch (Exception unused) {
                        com.heytap.accessory.base.logging.a.a(d.g, "no need to notify " + d.this);
                    }
                }
            }
        }

        public d(long j2, int i, IServiceChannelCallback iServiceChannelCallback, b bVar) {
            this.f2629c = j2;
            this.f2630e = i;
            this.a = iServiceChannelCallback;
            this.d = new WeakReference<>(bVar);
        }

        public final byte a(boolean z) {
            return z ? (byte) 4 : (byte) 0;
        }

        public synchronized void b() {
            b bVar = this.d.get();
            if (bVar != null && bVar.f) {
                bVar.f2628e.a(bVar.f2627c, this.f2629c);
                this.f = 4;
                com.heytap.accessory.base.logging.a.a(g, "cleanSessionCache reset writeStatus to WRITE_CANCELLED, and notify channel:" + this);
                try {
                    notify();
                } catch (Exception unused) {
                    com.heytap.accessory.base.logging.a.a(g, "no need to notify " + this);
                }
                return;
            }
            com.heytap.accessory.base.logging.a.b(g, "Service Connection object is null!");
        }

        public InterfaceC0252b c() {
            return this.b;
        }

        public synchronized int a(byte[] bArr, boolean z, int i, int i2, int i3) {
            int i4;
            int i5;
            if (bArr != null) {
                if (bArr.length > 1) {
                    if (i2 >= 1 && i2 < bArr.length) {
                        b bVar = this.d.get();
                        if (bVar != null && bVar.f) {
                            this.f = 2;
                            int length = i + 1;
                            int i6 = i2 - 1;
                            bArr[i6] = a(z);
                            WriteStatus writeStatusA = bVar.f2628e.a(bVar.f2627c, this.f2629c, bArr, i6, length, i3);
                            int status = writeStatusA.getStatus();
                            if (status == 0) {
                                com.heytap.accessory.base.logging.a.d(g, "from:" + bVar.f2628e.m() + ",channelId:" + this.f2629c + ",send len:" + bArr.length);
                                return 0;
                            }
                            int i7 = 4;
                            if (status == -2) {
                                com.heytap.accessory.base.logging.a.a(g, "PEER_STATE_UNAVAILABLE,should cancel send");
                                return 4;
                            }
                            int i8 = -1;
                            if (status == -1) {
                                if (z) {
                                    length = writeStatusA.getLength();
                                }
                                while (this.f != 0) {
                                    try {
                                        this.f = 2;
                                        String str = g;
                                        com.heytap.accessory.base.logging.a.a(str, "start wait:" + this + ", ChannelId:" + this.f2629c);
                                        wait(60000L);
                                        com.heytap.accessory.base.logging.a.a(str, "end wait:" + this + ", ChannelId:" + this.f2629c);
                                        int i9 = this.f;
                                        if (i9 == 3) {
                                            return 20005;
                                        }
                                        if (i9 == 2) {
                                            return 20007;
                                        }
                                        if (i9 == i7) {
                                            return 20008;
                                        }
                                        if (i9 == 0) {
                                            i4 = i8;
                                            i5 = i7;
                                            try {
                                                int iA = bVar.f2628e.a(bVar.f2627c, this.f2629c, bArr, i6, length);
                                                if (iA == 0) {
                                                    return 0;
                                                }
                                                if (iA == i4) {
                                                    this.f = 2;
                                                } else {
                                                    this.f = 20005;
                                                }
                                            } catch (InterruptedException unused) {
                                                com.heytap.accessory.base.logging.a.e(g, "Write interrupted on channel:" + this.f2629c);
                                            }
                                        } else {
                                            com.heytap.accessory.base.logging.a.c(str, "Notified to wait for another 180000 seconds for channel: " + this.f2629c);
                                            i4 = i8;
                                            i5 = i7;
                                        }
                                        i8 = i4;
                                        i7 = i5;
                                    } catch (InterruptedException unused2) {
                                        i4 = i8;
                                        i5 = i7;
                                    }
                                }
                                return 20005;
                            }
                            com.heytap.accessory.base.logging.a.b(g, "Invalid data received! returning ...");
                            return 2817;
                        }
                        com.heytap.accessory.base.logging.a.b(g, "Service Connection object is null!");
                        return 20005;
                    }
                    com.heytap.accessory.base.logging.a.b(g, "Invalid offset received! Offset: " + i2);
                    return 2817;
                }
            }
            com.heytap.accessory.base.logging.a.b(g, "Invalid data received! returning ...");
            return 2817;
        }
    }

    public b(FrameworkConnection frameworkConnection, FrameworkServiceDescription frameworkServiceDescription, IServiceConnectionCallback iServiceConnectionCallback, IServiceChannelCallback iServiceChannelCallback) {
        this.f2628e = frameworkConnection;
        this.b = iServiceConnectionCallback;
        this.a = Collections.synchronizedMap(new HashMap(frameworkServiceDescription.f().size()));
        for (FrameworkServiceChannelDescription frameworkServiceChannelDescription : frameworkServiceDescription.f()) {
            this.a.put(Long.valueOf(frameworkServiceChannelDescription.a()), new d(frameworkServiceChannelDescription.a(), frameworkServiceChannelDescription.c(), iServiceChannelCallback, this));
        }
        this.f = false;
    }

    public c f() {
        return this.d;
    }

    public final void b() {
        Iterator<Map.Entry<Long, d>> it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            d value = it.next().getValue();
            synchronized (value) {
                value.f = 3;
                value.notify();
            }
        }
    }

    public synchronized int c() {
        int i;
        synchronized (this) {
            this.f = false;
            i = this.f2628e.b(this.f2627c) ? 0 : 20005;
        }
        return i;
        return i;
    }

    public List<InterfaceC0252b> d() {
        ArrayList arrayList = new ArrayList(this.a.size());
        Iterator<Map.Entry<Long, d>> it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue().c());
        }
        return arrayList;
    }

    public List<String> e() {
        ArrayList arrayList = new ArrayList(this.a.size());
        Iterator<Long> it = this.a.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        return arrayList;
    }

    public void a(String str) {
        this.f = true;
        this.f2627c = str;
    }

    public d a(long j2) {
        return this.a.get(Long.valueOf(j2));
    }

    public static int a(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 10011) {
            com.heytap.accessory.base.logging.a.b(g, "ChannelId mismatch occurred.");
            return 10011;
        }
        if (i == 10013) {
            com.heytap.accessory.base.logging.a.b(g, "Connection Failed due to invalid prameters");
            return 10013;
        }
        if (i == 10017) {
            com.heytap.accessory.base.logging.a.b(g, "Local agent registration details not found");
            return BaseAgent.CONNECTION_FAILURE_LOCAL_AGENT_NOT_FOUND;
        }
        if (i == 1038) {
            com.heytap.accessory.base.logging.a.b(g, "Local connection limit reached.Connection rejected.");
            return 10010;
        }
        if (i != 1039) {
            switch (i) {
                case 10004:
                    com.heytap.accessory.base.logging.a.b(g, "Requested device is not reachable");
                    return 10004;
                case 10005:
                    com.heytap.accessory.base.logging.a.b(g, "Connection already exists");
                    return 10005;
                case 10006:
                    com.heytap.accessory.base.logging.a.b(g, "Connection Request timed out");
                    return 10006;
                case 10007:
                    com.heytap.accessory.base.logging.a.b(g, "Peer rejected the connection request");
                    return 10007;
                case 10008:
                    com.heytap.accessory.base.logging.a.b(g, "Peer is null");
                    return 10008;
                case 10009:
                    com.heytap.accessory.base.logging.a.b(g, "Duplicate Connection request.Previous connection request is still being processed");
                    return 10009;
                default:
                    com.heytap.accessory.base.logging.a.b(g, "Connection failed! ErrorCode = " + i);
                    return 10012;
            }
        }
        com.heytap.accessory.base.logging.a.b(g, "Connection Limit reached at Peer.Connection rejected.");
        return 10010;
    }
}
