package com.heytap.accessory.transport.control;

import androidx.annotation.NonNull;
import com.heytap.accessory.bean.TrafficControlConfig;
import com.heytap.accessory.bean.TrafficReport;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class d {
    public boolean a;
    public final int b;
    public int c;
    public final int d;
    public volatile long e;
    public final int f;
    public final long g;
    public final int h;

    public d(long j, int i, int i2, @NonNull TrafficControlConfig trafficControlConfig) {
        this.a = false;
        this.g = j;
        this.h = i;
        this.f = i2;
        int strategy = trafficControlConfig.getStrategy();
        this.b = strategy;
        this.c = strategy;
        this.d = trafficControlConfig.getMaxWindowSize();
        this.a = trafficControlConfig.isEnable();
    }

    public void a(TrafficReport trafficReport, long j, a aVar) {
        int i;
        if (!this.a || (i = this.c) == -1) {
            return;
        }
        if (i == 0) {
            if (trafficReport.getMaxWindowSize() < 100000) {
                this.c = 2;
            } else {
                this.c = 1;
            }
            com.heytap.accessory.base.logging.a.a("Receiver - TCTrack", "autoStrategy convert to:" + this.c);
        }
        this.e += j;
        c.a("Receiver - TCTrack", "[report] strategy: " + this.c + "; receivedData: " + this.e + ", transId: " + this.f + "; accId&channelId: " + this.g + "," + this.h + "; maxWindowSize: " + trafficReport.getMaxWindowSize() + "; percent:" + trafficReport.getUsedPercentString(2));
        if (this.c == 2) {
            if (this.e >= (trafficReport.getMaxWindowSize() * 30) / 100) {
                b bVar = new b(this.g, this.h, this.f, this.e);
                com.heytap.accessory.base.logging.a.c("Receiver - TCTrack", "[send addition tcRequest]  , transId: " + this.f + ", accId&channelId: " + this.g + "," + this.h + "length:" + this.e);
                aVar.a(bVar);
                this.e = 0L;
                return;
            }
            return;
        }
        float usedPercent = trafficReport.getUsedPercent();
        float[] fArr = c.b;
        if (usedPercent > fArr[0]) {
            this.c = 2;
            com.heytap.accessory.base.logging.a.c("Receiver - TCTrack", "user percent over " + fArr[0] + "%, transId: " + this.f + ", accId&channelId: " + this.g + "," + this.h + " convert the strategy to addition control");
            long jMin = Math.min(this.e, trafficReport.getMaxWindowSize());
            b bVar2 = new b(this.g, this.h, this.f, jMin);
            com.heytap.accessory.base.logging.a.c("Receiver - TCTrack", "[send addition tcRequest]  , transId: " + this.f + ", accId&channelId: " + this.g + "," + this.h + "; length:" + jMin);
            aVar.a(bVar2);
        }
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.b;
    }

    public void a() {
        com.heytap.accessory.base.logging.a.a("Receiver - TCTrack", "[cleanup tc cache]; transId: " + this.f + "; accId&channelId: " + this.g + ", " + this.h);
    }
}
