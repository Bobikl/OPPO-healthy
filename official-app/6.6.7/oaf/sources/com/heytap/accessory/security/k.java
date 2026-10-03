package com.heytap.accessory.security;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.heytap.accessory.connectivity.constant.ConnectConstant;
import com.heytap.accessory.utils.buffer.Buffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class k implements g {
    public static final String a = "k";
    public static k c;

    @Nullable
    public static com.heytap.accessory.connectivity.core.interfaces.a e;
    public static b f;
    public static final Object b = new Object();
    public static Map<Long, f> d = new ConcurrentHashMap();
    public static com.heytap.accessory.connectivity.interfaces.a g = new a();

    public static class b implements Runnable {
        public static final String b = "b";
        public long a;

        public b(long j) {
            this.a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar;
            synchronized (k.b) {
                fVar = (f) k.d.get(Long.valueOf(this.a));
            }
            if (fVar == null) {
                com.heytap.accessory.base.logging.a.c(b, "State already cleaned up");
            } else {
                fVar.a();
            }
        }
    }

    public k(@Nullable com.heytap.accessory.connectivity.core.interfaces.a aVar) {
        e = aVar;
    }

    public boolean d(com.heytap.accessory.base.bean.b bVar) {
        f fVar;
        long jL = bVar.l();
        synchronized (b) {
            fVar = d.get(Long.valueOf(jL));
        }
        if (fVar == null) {
            e(bVar);
            return true;
        }
        if (fVar.b()) {
            return false;
        }
        b(jL);
        a(jL);
        g();
        return true;
    }

    public final Handler e() {
        return com.heytap.accessory.connectivity.core.b.d();
    }

    public final f f() {
        return new m(this);
    }

    public void g() {
        e().removeCallbacks(f);
    }

    public static synchronized k a(@Nullable com.heytap.accessory.connectivity.core.interfaces.a aVar) {
        k kVar;
        synchronized (k.class) {
            if (c == null) {
                c = new k(aVar);
            }
            kVar = c;
        }
        return kVar;
        return kVar;
    }

    public int b(long j, long j2, long j3, byte[] bArr, int i, int i2) {
        f fVar;
        synchronized (b) {
            fVar = d.get(Long.valueOf(j));
        }
        if (fVar != null) {
            return fVar.a(j2, j3, bArr, i, i2);
        }
        com.heytap.accessory.base.logging.a.b(a, "No Security Store found for accessoryId : " + j);
        return -1;
    }

    public void c(com.heytap.accessory.base.bean.b bVar) {
        f fVarD;
        synchronized (b) {
            fVarD = bVar.u() == 1 ? d() : f();
            d.put(Long.valueOf(bVar.l()), fVarD);
        }
        int iA = fVarD.a(bVar, 0);
        if (iA != 0) {
            a(bVar, iA);
        }
        com.heytap.accessory.connectivity.c.b().a(bVar.l(), 1, g);
    }

    public final void e(com.heytap.accessory.base.bean.b bVar) {
        com.heytap.accessory.connectivity.c.b().b(bVar);
    }

    public int a(long j, long j2, long j3, byte[] bArr, int i, int i2) {
        f fVar;
        synchronized (b) {
            fVar = d.get(Long.valueOf(j));
        }
        return fVar.b(j2, j3, bArr, i, i2);
    }

    @Override // com.heytap.accessory.security.g
    public void b(com.heytap.accessory.base.bean.b bVar) {
        f = new b(bVar.l());
        e().postDelayed(f, 10000);
    }

    public class a implements com.heytap.accessory.connectivity.interfaces.a {
        @Override // com.heytap.accessory.connectivity.interfaces.a
        public int a(long j, int i, Buffer buffer) {
            com.heytap.accessory.base.logging.a.a(k.a, "onMessageReceived()  for accessoryId : " + j);
            try {
                f fVarC = k.c.c(j);
                if (fVarC == null) {
                    return -1;
                }
                if (fVarC.b()) {
                    buffer.recycle();
                    return -1;
                }
                fVarC.a(buffer);
                buffer.recycle();
                return 0;
            } finally {
                buffer.recycle();
            }
        }

        @Override // com.heytap.accessory.connectivity.interfaces.a
        public void a(long j, int i, long j2, com.heytap.accessory.message.b bVar) {
            com.heytap.accessory.base.logging.a.c(k.a, "onMessageDispatched() to mAccessory Id : " + j);
            try {
                f fVarC = k.c.c(j);
                if (fVarC != null) {
                    fVarC.a(bVar);
                    bVar.c().f().recycle();
                }
            } finally {
                bVar.c().f().recycle();
            }
        }

        @Override // com.heytap.accessory.connectivity.interfaces.a
        public void a(long j, int i, int i2, int i3) {
            f fVar;
            synchronized (k.b) {
                fVar = (f) k.d.get(Long.valueOf(j));
            }
            if (fVar == null) {
                com.heytap.accessory.base.logging.a.a(k.a, "Security mState handler already cleaned up.");
            } else {
                fVar.a(i2, i3);
            }
        }
    }

    public final byte b(long j) {
        return com.heytap.accessory.connectivity.c.b().b(j);
    }

    public final f d() {
        return new j(this);
    }

    public boolean a(long j, long j2, long j3) {
        f fVar;
        synchronized (b) {
            fVar = d.get(Long.valueOf(j));
        }
        if (fVar == null) {
            com.heytap.accessory.base.logging.a.b(a, "No Security Store found for accessoryId : " + j);
            return false;
        }
        return fVar.a(j2, j3);
    }

    public f c(long j) {
        f fVar;
        synchronized (b) {
            fVar = d.get(Long.valueOf(j));
        }
        if (fVar != null) {
            return fVar;
        }
        com.heytap.accessory.base.logging.a.b(a, "Accessory id : " + j + " not intialized for authentication! closing down connection...");
        b(j);
        com.heytap.accessory.base.bean.b bVarB = com.heytap.accessory.connectivity.core.b.b(j);
        if (bVarB == null) {
            return null;
        }
        a(bVarB, ConnectConstant.ERROR_CHANNEL_AUTH_INVALID_STATE);
        return null;
    }

    public void a(long j) {
        f fVarRemove;
        com.heytap.accessory.base.logging.a.d(a, "Removing entry from security store for mAccessory id : " + j);
        synchronized (b) {
            fVarRemove = d.remove(Long.valueOf(j));
        }
        if (fVarRemove != null) {
            fVarRemove.c();
        }
    }

    @Override // com.heytap.accessory.security.g
    public void a(com.heytap.accessory.base.bean.b bVar) {
        g();
        com.heytap.accessory.connectivity.core.interfaces.a aVar = e;
        if (aVar != null) {
            aVar.a(bVar);
        }
    }

    @Override // com.heytap.accessory.security.g
    public void a(com.heytap.accessory.base.bean.b bVar, int i) {
        g();
        b(bVar.l());
        synchronized (b) {
            d.remove(Long.valueOf(bVar.l()));
        }
        com.heytap.accessory.connectivity.core.interfaces.a aVar = e;
        if (aVar != null) {
            aVar.a(bVar, i);
        }
    }
}
