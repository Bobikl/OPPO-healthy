package com.heytap.accessory.connectivity.wifi.socket;

import com.heytap.accessory.base.AccessoryManager;
import com.heytap.accessory.connectivity.interfaces.c;
import com.heytap.accessory.connectivity.params.e;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class b implements c {
    public static final String b = "b";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile b f2539c;
    public static Map<Integer, com.heytap.accessory.connectivity.interfaces.b> d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Map<Integer, Integer> f2540e = new ConcurrentHashMap();
    public Map<Integer, a> a = new ConcurrentHashMap();

    public static class a implements Runnable {
        public ServerSocket a;
        public Socket b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2541c;
        public int d;

        public a(int i) {
            this.d = i;
            try {
                ServerSocket serverSocket = new ServerSocket();
                this.a = serverSocket;
                serverSocket.setReuseAddress(true);
                if (i != 1) {
                    for (int i2 = 0; i2 < com.heytap.accessory.connectivity.wifi.tools.a.f2542c.length; i2++) {
                        try {
                            this.a.bind(null);
                            this.f2541c = true;
                            e eVar = new e();
                            eVar.a = i;
                            eVar.b = this.a.getLocalPort();
                            b.f2540e.put(Integer.valueOf(i), Integer.valueOf(eVar.b));
                            ((com.heytap.accessory.connectivity.interfaces.b) b.d.get(Integer.valueOf(i))).a(eVar, 1, 0);
                            return;
                        } catch (IOException e2) {
                            com.heytap.accessory.base.logging.a.b("error binding port(count):" + i2 + " " + e2.toString());
                            ((com.heytap.accessory.connectivity.interfaces.b) b.d.get(Integer.valueOf(i))).a((com.heytap.accessory.connectivity.params.c) null, 1, 1);
                        }
                    }
                    return;
                }
                int i3 = 0;
                while (true) {
                    int[] iArr = com.heytap.accessory.connectivity.wifi.tools.a.f2542c;
                    if (i3 >= iArr.length) {
                        return;
                    }
                    try {
                        this.a.bind(new InetSocketAddress(iArr[i3]));
                        com.heytap.accessory.base.logging.a.a("server binding port success:" + iArr[i3]);
                        this.f2541c = true;
                        ((com.heytap.accessory.connectivity.interfaces.b) b.d.get(Integer.valueOf(i))).a((com.heytap.accessory.connectivity.params.c) null, 1, 0);
                        return;
                    } catch (IOException e3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("error binding port:");
                        int[] iArr2 = com.heytap.accessory.connectivity.wifi.tools.a.f2542c;
                        sb.append(iArr2[i3]);
                        sb.append(" ");
                        sb.append(e3.toString());
                        com.heytap.accessory.base.logging.a.b(sb.toString());
                        if (i3 == iArr2.length - 1) {
                            ((com.heytap.accessory.connectivity.interfaces.b) b.d.get(Integer.valueOf(i))).a((com.heytap.accessory.connectivity.params.c) null, 1, 1);
                        }
                        i3++;
                    }
                }
            } catch (IOException e4) {
                com.heytap.accessory.base.logging.a.b(b.b, "AcceptListenerThread error:" + e4);
                this.f2541c = false;
                ((com.heytap.accessory.connectivity.interfaces.b) b.d.get(Integer.valueOf(i))).a((com.heytap.accessory.connectivity.params.c) null, 1, 1);
            }
            com.heytap.accessory.base.logging.a.b(b.b, "AcceptListenerThread error:" + e4);
            this.f2541c = false;
            ((com.heytap.accessory.connectivity.interfaces.b) b.d.get(Integer.valueOf(i))).a((com.heytap.accessory.connectivity.params.c) null, 1, 1);
        }

        @Override // java.lang.Runnable
        public void run() {
            while (this.f2541c) {
                a();
            }
        }

        public final void a() {
            try {
                ServerSocket serverSocket = this.a;
                if (serverSocket != null) {
                    this.b = serverSocket.accept();
                }
                if (this.b == null) {
                    return;
                }
                com.heytap.accessory.base.logging.a.a(b.b, "ServerSocketCallback: onConnect: " + this.b);
                if ("127.0.0.1".equals(this.b.getInetAddress().getHostAddress())) {
                    com.heytap.accessory.base.logging.a.e(b.b, "weird connect from 127.0.0.1.");
                    return;
                }
                com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(this.b.getInetAddress().getHostAddress(), 1, 0);
                if (bVarA == null) {
                    bVarA = new com.heytap.accessory.connectivity.wifi.a(this.b.getInetAddress().getHostAddress());
                }
                bVarA.a(this.b, this.d);
                if (b.d.get(Integer.valueOf(this.d)) != null) {
                    ((com.heytap.accessory.connectivity.interfaces.b) b.d.get(Integer.valueOf(this.d))).a(bVarA, this.d);
                }
            } catch (IOException e2) {
                com.heytap.accessory.base.logging.a.b(b.b, "listenForIncomingConnections error:" + e2);
                this.f2541c = false;
                if (b.d.get(Integer.valueOf(this.d)) != null) {
                    ((com.heytap.accessory.connectivity.interfaces.b) b.d.get(Integer.valueOf(this.d))).a(-1114, (com.heytap.accessory.base.bean.b) null, this.d);
                }
                try {
                    if (this.b != null) {
                        com.heytap.accessory.base.logging.a.c(b.b, "Stop listeneing on socket");
                        this.b.close();
                        this.b = null;
                    }
                } catch (IOException unused) {
                    if (b.d.get(Integer.valueOf(this.d)) != null) {
                        ((com.heytap.accessory.connectivity.interfaces.b) b.d.get(Integer.valueOf(this.d))).a(-1110, (com.heytap.accessory.base.bean.b) null, this.d);
                    }
                }
            }
        }
    }

    public static b d() {
        if (f2539c == null) {
            synchronized (b.class) {
                if (f2539c == null) {
                    f2539c = new b();
                }
            }
        }
        return f2539c;
    }

    public final boolean e() {
        return true;
    }

    @Override // com.heytap.accessory.connectivity.interfaces.c
    public void a(com.heytap.accessory.connectivity.interfaces.b bVar, int i) {
        d.put(Integer.valueOf(i), bVar);
    }

    @Override // com.heytap.accessory.connectivity.interfaces.c
    public boolean b(int i) {
        if (!e()) {
            return false;
        }
        c(i);
        return false;
    }

    public final void c(int i) {
        if (this.a.get(Integer.valueOf(i)) != null) {
            com.heytap.accessory.base.logging.a.c(b, "Already listening on socket");
            if (f2540e.get(Integer.valueOf(i)) == null || d.get(Integer.valueOf(i)) == null) {
                d.get(Integer.valueOf(i)).a((com.heytap.accessory.connectivity.params.c) null, 1, 1);
                return;
            }
            int iIntValue = f2540e.get(Integer.valueOf(i)).intValue();
            e eVar = new e();
            eVar.a = i;
            eVar.b = iIntValue;
            d.get(Integer.valueOf(i)).a(eVar, 1, 0);
            return;
        }
        a aVar = new a(i);
        boolean zA = com.heytap.accessory.base.thread.a.b().a("WIFI_SOCKET_SERVER" + i, aVar, 0L);
        this.a.put(Integer.valueOf(i), aVar);
        com.heytap.accessory.base.logging.a.c(b, "Socket StartListening Result:" + zA);
    }

    @Override // com.heytap.accessory.connectivity.interfaces.c
    public void a(int i) {
        d(i);
    }

    public final void d(int i) {
        a aVar = this.a.get(Integer.valueOf(i));
        if (aVar != null) {
            try {
                aVar.a.close();
            } catch (Exception e2) {
                String str = b;
                com.heytap.accessory.base.logging.a.a(str, "stop wifi ServerSocket Listening: channelType: " + i);
                com.heytap.accessory.base.logging.a.a(str, "stop wifi ServerSocket Listening: close exception " + e2.toString());
            }
            com.heytap.accessory.base.thread.a.b().e("WIFI_SOCKET_SERVER" + i);
            this.a.remove(Integer.valueOf(i));
        }
        if (d.get(Integer.valueOf(i)) != null) {
            d.remove(Integer.valueOf(i));
        }
        if (f2540e.get(Integer.valueOf(i)) != null) {
            f2540e.remove(Integer.valueOf(i));
        }
    }
}
