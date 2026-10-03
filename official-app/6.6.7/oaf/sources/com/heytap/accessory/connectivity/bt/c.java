package com.heytap.accessory.connectivity.bt;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import com.heytap.accessory.base.AccessoryManager;
import com.heytap.accessory.connectivity.params.d;
import com.heytap.accessory.misc.utils.PlatformUtils;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class c implements com.heytap.accessory.connectivity.interfaces.c {
    public static final String e = "c";
    public static volatile c f;
    public Map<Integer, com.heytap.accessory.connectivity.interfaces.b> a = new ConcurrentHashMap();
    public Map<Integer, a> b = new ConcurrentHashMap();
    public BluetoothAdapter c = BluetoothAdapter.getDefaultAdapter();
    public static final Object d = new Object();
    public static Map<Integer, UUID> g = new ConcurrentHashMap();

    public class a implements Runnable {
        public boolean a;
        public BluetoothServerSocket b;
        public com.heytap.accessory.connectivity.params.b c;
        public int d;
        public int e;
        public final /* synthetic */ c f;

        public a(c cVar, int i, int i2) {
            this.f = cVar;
            this.a = false;
            this.b = null;
            this.c = null;
            int iA = cVar.a(i, i2);
            this.d = i;
            this.e = i2;
            this.c = a(i, i2);
            try {
                try {
                    if (cVar.c != null) {
                        com.heytap.accessory.base.logging.a.d(c.e, "start listening on UUID：  " + this.c.b);
                        this.b = cVar.c.listenUsingRfcommWithServiceRecord("AFP", this.c.b);
                        com.heytap.accessory.base.logging.a.a(c.e, "listenUsingRfcommWithServiceRecord");
                        this.a = true;
                        c.g.put(Integer.valueOf(iA), this.c.b);
                        ((com.heytap.accessory.connectivity.interfaces.b) cVar.a.get(Integer.valueOf(i))).a(this.c, 2, 0);
                        com.heytap.accessory.base.logging.a.a(c.e, "start listening ok");
                    }
                } catch (Exception e) {
                    com.heytap.accessory.base.logging.a.a(c.e, "start listening exception", e);
                    this.a = false;
                    ((com.heytap.accessory.connectivity.interfaces.b) cVar.a.get(Integer.valueOf(i))).a(-1113, (com.heytap.accessory.base.bean.b) null, this.d);
                    ((com.heytap.accessory.connectivity.interfaces.b) cVar.a.get(Integer.valueOf(i))).a(this.c, 2, 1);
                }
            } finally {
                com.heytap.accessory.base.logging.a.a(c.e, "start listening finish");
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            while (this.a) {
                a();
            }
        }

        public final com.heytap.accessory.connectivity.params.b a(int i, int i2) {
            return (com.heytap.accessory.connectivity.params.b) d.a(2, i, i2);
        }

        public final void a() {
            BluetoothSocket bluetoothSocketA;
            com.heytap.accessory.base.bean.b bVarA;
            try {
                BluetoothServerSocket bluetoothServerSocket = this.b;
                if (bluetoothServerSocket != null) {
                    bluetoothSocketA = this.f.a(bluetoothServerSocket);
                    com.heytap.accessory.base.logging.a.c(c.e, "new connection accepted for UUID " + this.c.b);
                } else {
                    bluetoothSocketA = null;
                }
                if (bluetoothSocketA == null) {
                    return;
                }
                com.heytap.accessory.base.logging.a.a(c.e, "listenForIncomingConnections mChannelType:" + this.d);
                if (this.d == 1) {
                    bVarA = new com.heytap.accessory.connectivity.bt.a(bluetoothSocketA.getRemoteDevice().getAddress());
                    bVarA.f(2);
                } else {
                    bVarA = AccessoryManager.h().a(bluetoothSocketA.getRemoteDevice().getAddress(), 2, this.e);
                }
                if (bVarA == null) {
                    com.heytap.accessory.base.logging.a.b(c.e, "accessory cannot found!");
                    return;
                }
                bVarA.a(bluetoothSocketA, this.d);
                bVarA.o(this.e);
                ((com.heytap.accessory.connectivity.interfaces.b) this.f.a.get(Integer.valueOf(this.d))).a(bVarA, this.d);
            } catch (IOException e) {
                this.a = false;
                com.heytap.accessory.base.logging.a.a(c.e, "listen connection exception in UUID " + this.c.b, e);
                try {
                    if (this.f.a.get(Integer.valueOf(this.d)) != null) {
                        ((com.heytap.accessory.connectivity.interfaces.b) this.f.a.get(Integer.valueOf(this.d))).a(-1114, (com.heytap.accessory.base.bean.b) null, this.d);
                    }
                    if (this.b != null) {
                        com.heytap.accessory.base.logging.a.b(c.e, "Stop listening on " + this.c.b);
                        this.b.close();
                        this.b = null;
                    }
                } catch (IOException e2) {
                    com.heytap.accessory.base.logging.a.a("listening error.", e2);
                    ((com.heytap.accessory.connectivity.interfaces.b) this.f.a.get(Integer.valueOf(this.d))).a(-1110, (com.heytap.accessory.base.bean.b) null, this.d);
                } catch (Exception e3) {
                    com.heytap.accessory.base.logging.a.a(c.e, "cancel error.", e3);
                }
            }
        }
    }

    public c() {
        com.heytap.accessory.base.logging.a.a(e, "BtServerListener()");
    }

    public static c c() {
        if (f == null) {
            synchronized (d) {
                if (f == null) {
                    f = new c();
                }
            }
        }
        return f;
    }

    public final int a(int i, int i2) {
        return (i * 10) + i2;
    }

    @Override // com.heytap.accessory.connectivity.interfaces.c
    public boolean b(int i) {
        if (this.c == null && this.a.get(Integer.valueOf(i)) != null) {
            com.heytap.accessory.base.logging.a.b(e, "BT Adapter is null");
            this.a.get(Integer.valueOf(i)).a(-1107, (com.heytap.accessory.base.bean.b) null, i);
            return false;
        }
        if (!PlatformUtils.isRuntimePermissionAcquired()) {
            com.heytap.accessory.base.logging.a.e(e, "Lack of runtime permissions, start abort.");
            return false;
        }
        if (this.c.isEnabled()) {
            com.heytap.accessory.base.logging.a.c(e, "BT Is ON");
            return b(i, 0);
        }
        c(i, 0);
        com.heytap.accessory.base.logging.a.c(e, "BT Is OFF");
        return false;
    }

    @Override // com.heytap.accessory.connectivity.interfaces.c
    public void a(com.heytap.accessory.connectivity.interfaces.b bVar, int i) {
        this.a.put(Integer.valueOf(i), bVar);
    }

    @Override // com.heytap.accessory.connectivity.interfaces.c
    public void a(int i) {
        c(i, 0);
    }

    public BluetoothSocket a(BluetoothServerSocket bluetoothServerSocket) throws IOException {
        return bluetoothServerSocket.accept();
    }

    public final void c(int i, int i2) {
        int iA = a(i, i2);
        a aVar = this.b.get(Integer.valueOf(iA));
        if (aVar != null) {
            try {
                aVar.b.close();
            } catch (Exception e2) {
                String str = e;
                com.heytap.accessory.base.logging.a.a(str, "Bt ServerSocket close, channelType: " + i);
                com.heytap.accessory.base.logging.a.a(str, "Bt ServerSocket close, close exception " + e2.toString());
            }
            com.heytap.accessory.base.thread.a.b().e("BT_SERVER" + iA);
            this.b.remove(Integer.valueOf(iA));
        }
        if (this.a.get(Integer.valueOf(i)) != null) {
            this.a.remove(Integer.valueOf(i));
        }
        if (g.get(Integer.valueOf(iA)) != null) {
            g.remove(Integer.valueOf(iA));
        }
    }

    public final boolean b(int i, int i2) {
        int iA = a(i, i2);
        if (this.b.get(Integer.valueOf(iA)) == null) {
            a aVar = new a(this, i, i2);
            boolean zA = com.heytap.accessory.base.thread.a.b().a("BT_SERVER" + iA, aVar, 0L);
            this.b.put(Integer.valueOf(iA), aVar);
            com.heytap.accessory.base.logging.a.c(e, "Bt StartListening Result:" + zA);
            return true;
        }
        com.heytap.accessory.base.logging.a.c(e, "Already listening on socket");
        if (g.get(Integer.valueOf(iA)) != null && this.a.get(Integer.valueOf(i)) != null) {
            UUID uuid = g.get(Integer.valueOf(iA));
            com.heytap.accessory.connectivity.params.b bVar = new com.heytap.accessory.connectivity.params.b();
            bVar.b = uuid;
            this.a.get(Integer.valueOf(i)).a(bVar, 2, 0);
        } else {
            this.a.get(Integer.valueOf(i)).a((com.heytap.accessory.connectivity.params.c) null, 2, 1);
        }
        return false;
    }
}
