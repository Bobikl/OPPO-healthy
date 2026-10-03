package com.heytap.accessory.sdk;

import android.os.Bundle;
import android.os.RemoteException;
import com.health.health_seedlingcard.receiver.HealthDataRefreshReceiver;
import com.heytap.accessory.BaseAgent;
import com.heytap.accessory.BaseSocket;
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

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class b {
    public static final String g = "b";
    public Map<Long, d> a;
    public IServiceConnectionCallback b;
    public String c = "-1";
    public c d = new a();
    public FrameworkConnection e;
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
                } catch (RemoteException e) {
                    com.heytap.accessory.base.logging.a.e(b.g, "Failed to notify connection success:" + e.getMessage());
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
                } catch (RemoteException e2) {
                    com.heytap.accessory.base.logging.a.e(b.g, "Failed to notify connection failure:" + e2.getMessage());
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
                if (b.this.c != null) {
                    SdkWrapper.c(b.this.c);
                } else {
                    com.heytap.accessory.base.logging.a.e(b.g, "Connection Id not found on disconnect");
                }
                bundle.clear();
                bundle.putInt("errorcode", 0);
                try {
                    bundle.putLong("connectionId", Long.parseLong(b.this.c));
                    b.this.b.onConnectionLost(bundle);
                    return;
                } catch (RemoteException e3) {
                    com.heytap.accessory.base.logging.a.e(b.g, "Failed to notify Disconnection:" + e3.toString());
                    return;
                }
            }
            b.this.f = false;
            b.this.b();
            if (b.this.c != null) {
                SdkWrapper.c(b.this.c);
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
                bundle.putLong("connectionId", Long.parseLong(b.this.c));
                b.this.b.onConnectionLost(bundle);
            } catch (RemoteException e4) {
                com.heytap.accessory.base.logging.a.e(b.g, "Failed to notify Connection error:" + e4.getMessage());
            }
        }
    }

    public interface b {
        void a(int i, Bundle bundle);
    }

    public interface c {
        void a(int i, Bundle bundle);
    }

    public static class d {
        public static final String g = "b$d";
        public IServiceChannelCallback a;
        public long c;
        public WeakReference<b> d;
        public int e;
        public b b = new a();
        public int f = 2;

        public class a implements b {
            public a() {
            }

            @Override // com.heytap.accessory.sdk.b.b
            public void a(int i, Bundle bundle) {
                if (d.this.a == null) {
                    com.heytap.accessory.base.logging.a.b(d.g, "Channel callback not found!");
                    return;
                }
                if (i == 201) {
                    bundle.putInt("com.heytap.accessory.adapter.extra.READ_OFFSET", bundle.getInt("com.heytap.accessory.adapter.extra.READ_OFFSET") + 1);
                    bundle.putInt("com.heytap.accessory.adapter.extra.READ_LENGHT", bundle.getInt("com.heytap.accessory.adapter.extra.READ_LENGHT") - 1);
                    bundle.putLong("channelId", d.this.c);
                    bundle.putInt("priority", d.this.e);
                    try {
                        d.this.a.onRead(bundle);
                        return;
                    } catch (RemoteException e) {
                        com.heytap.accessory.base.logging.a.e(d.g, "Failed to notify incoming data: " + e.getMessage());
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

        public d(long j, int i, IServiceChannelCallback iServiceChannelCallback, b bVar) {
            this.c = j;
            this.e = i;
            this.a = iServiceChannelCallback;
            this.d = new WeakReference<>(bVar);
        }

        public final byte a(boolean z) {
            return z ? (byte) 4 : (byte) 0;
        }

        public synchronized void b() {
            b bVar = this.d.get();
            if (bVar != null && bVar.f) {
                bVar.e.a(bVar.c, this.c);
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

        public b c() {
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
                            WriteStatus writeStatusA = bVar.e.a(bVar.c, this.c, bArr, i6, length, i3);
                            int status = writeStatusA.getStatus();
                            if (status == 0) {
                                com.heytap.accessory.base.logging.a.d(g, "from:" + bVar.e.m() + ",channelId:" + this.c + ",send len:" + bArr.length);
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
                                        com.heytap.accessory.base.logging.a.a(str, "start wait:" + this + ", ChannelId:" + this.c);
                                        wait(HealthDataRefreshReceiver.ONE_MINUTE);
                                        com.heytap.accessory.base.logging.a.a(str, "end wait:" + this + ", ChannelId:" + this.c);
                                        int i9 = this.f;
                                        if (i9 == 3) {
                                            return BaseSocket.ERROR_CONNECTION_ALREADY_CLOSED;
                                        }
                                        if (i9 == 2) {
                                            return BaseSocket.ERROR_WRITE_TIMEDOUT;
                                        }
                                        if (i9 == i7) {
                                            return BaseSocket.ERROR_CANCELLED;
                                        }
                                        if (i9 == 0) {
                                            i4 = i8;
                                            i5 = i7;
                                            try {
                                                int iA = bVar.e.a(bVar.c, this.c, bArr, i6, length);
                                                if (iA == 0) {
                                                    return 0;
                                                }
                                                if (iA == i4) {
                                                    this.f = 2;
                                                } else {
                                                    this.f = BaseSocket.ERROR_CONNECTION_ALREADY_CLOSED;
                                                }
                                            } catch (InterruptedException unused) {
                                                com.heytap.accessory.base.logging.a.e(g, "Write interrupted on channel:" + this.c);
                                            }
                                        } else {
                                            com.heytap.accessory.base.logging.a.c(str, "Notified to wait for another 180000 seconds for channel: " + this.c);
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
                                return BaseSocket.ERROR_CONNECTION_ALREADY_CLOSED;
                            }
                            com.heytap.accessory.base.logging.a.b(g, "Invalid data received! returning ...");
                            return 2817;
                        }
                        com.heytap.accessory.base.logging.a.b(g, "Service Connection object is null!");
                        return BaseSocket.ERROR_CONNECTION_ALREADY_CLOSED;
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
        this.e = frameworkConnection;
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
            i = this.e.b(this.c) ? 0 : BaseSocket.ERROR_CONNECTION_ALREADY_CLOSED;
        }
        return i;
        return i;
    }

    public List<b> d() {
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
        this.c = str;
    }

    public d a(long j) {
        return this.a.get(Long.valueOf(j));
    }

    public static int a(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 10011) {
            com.heytap.accessory.base.logging.a.b(g, "ChannelId mismatch occurred.");
            return BaseAgent.CONNECTION_FAILURE_CHANNELID_MISMATCH;
        }
        if (i == 10013) {
            com.heytap.accessory.base.logging.a.b(g, "Connection Failed due to invalid prameters");
            return BaseAgent.ERROR_CONNECTION_INVALID_PARAM;
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
