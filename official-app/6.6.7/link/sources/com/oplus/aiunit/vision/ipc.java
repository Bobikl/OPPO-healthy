package com.oplus.aiunit.vision;

import android.os.Trace;
import com.heytap.wearable.btnet.proto.ProxyACKReq;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.utils.HttpDataFactory;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ipc {
    public long a = 0;
    public long b = 0;
    public long c = 0;
    public long d = 0;
    public long e = 0;
    public cyg f;

    public ipc(cyg cygVar) {
        this.f = cygVar;
    }

    public void a(int i, long j, int i2) {
        long j2;
        long j3;
        if (i2 == 2) {
            long j4 = i;
            j2 = this.d + j4;
            this.d = j2;
            this.a += j4;
            cyg cygVar = this.f;
            j3 = (cygVar == null || !cygVar.t()) ? 204800L : 71680L;
        } else {
            long j5 = i;
            j2 = this.e + j5;
            this.e = j2;
            this.b += j5;
            j3 = 1468006;
        }
        if (j2 >= j3) {
            long jA = ixg.b().a();
            int i3 = (int) ((((j2 * 1.0f) / j3) * 1000.0f) + 1000.0f);
            if (g82.c()) {
                Trace.beginSection("BtNet_speedLimit_ackReq id=" + jA + " socketId=" + j + " sleep=" + i3 + " size=" + j2);
            }
            byte[] byteArray = ProxyACKReq.newBuilder().setId(jA).setNetPackageSz((int) j2).setSleep(i3).build().toByteArray();
            ok9 ok9VarB = HttpDataFactory.b(HttpDataFactory.HTTP_ACK_REQ, j, (byte) 0, byteArray.length, byteArray);
            cyg cygVar2 = this.f;
            if (cygVar2 == null || ok9VarB == null) {
                o5f.b("NetSpeedMonitor", "Https2ClientThread mServerTransportSession is null");
            } else {
                ok9VarB.f = i2;
                cygVar2.j(ok9VarB);
            }
            if (i2 == 2) {
                this.d = 0L;
            } else {
                this.e = 0L;
            }
            if (g82.c()) {
                Trace.endSection();
            }
        }
    }

    public void b() {
        this.a = 0L;
        this.b = 0L;
        this.c = System.currentTimeMillis();
    }
}
