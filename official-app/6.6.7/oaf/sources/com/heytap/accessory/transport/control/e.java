package com.heytap.accessory.transport.control;

import androidx.annotation.NonNull;
import com.health.health_seedlingcard.receiver.HealthDataRefreshReceiver;
import com.heytap.accessory.bean.TrafficControlConfig;
import com.heytap.accessory.bean.TrafficReport;
import java.util.Locale;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class e {
    public boolean a;
    public TrafficReport b;
    public int c;
    public final long d;
    public final a e = new a();
    public volatile long f;
    public final int g;
    public final long h;
    public final int i;
    public final int j;

    public static class a {
        public boolean a;

        public boolean a() {
            return this.a;
        }

        public void b() {
            this.a = true;
        }

        public void c() {
            this.a = false;
        }
    }

    public e(long j, int i, int i2, @NonNull TrafficControlConfig trafficControlConfig) {
        this.h = j;
        this.i = i;
        this.g = i2;
        long maxWindowSize = trafficControlConfig.getMaxWindowSize();
        this.d = maxWindowSize;
        this.a = trafficControlConfig.isEnable();
        int handleMsgTime = trafficControlConfig.getHandleMsgTime();
        this.j = handleMsgTime;
        int strategy = trafficControlConfig.getStrategy();
        if (!this.a) {
            this.c = -1;
        } else if (strategy == -1 || strategy == 1 || strategy == 2) {
            this.c = strategy;
        } else {
            if (maxWindowSize < 100000) {
                this.c = 2;
            } else {
                this.c = 1;
            }
            com.heytap.accessory.base.logging.a.a("Sender - TCTrack", "autoStrategy convert to:" + this.c);
        }
        com.heytap.accessory.base.logging.a.c("Sender - TCTrack", "[receive init] maxWindowSize: " + maxWindowSize + "; accId: " + j + "; channelId: " + i + "; transId: " + i2 + "; mockSleepTime: " + handleMsgTime + "; flag: " + strategy + "; the final flag is " + this.c);
    }

    public void a(b bVar) {
        int i;
        long j;
        long j2;
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.e("Sender - TCTrack", "[receive tc request] request is null. ignore tc request.");
            return;
        }
        if (!this.a || (i = this.c) == -1) {
            com.heytap.accessory.base.logging.a.a("Sender - TCTrack", "[receive tc request] ignore. tcEnable: " + this.a + ", flag: " + this.c);
            return;
        }
        if (i != 2) {
            com.heytap.accessory.base.logging.a.a("Sender - TCTrack", "[receive tc request] convert flag from " + this.c + " to 2");
            this.c = 2;
        }
        long j3 = this.d;
        if (j3 <= 0) {
            com.heytap.accessory.base.logging.a.e("Sender - TCTrack", "[receive tc request] mMaxWindowSize(" + this.d + ") not set. ignore tc request., transId: " + this.g + "; accId&channelId: " + this.h + "," + this.i);
            return;
        }
        TrafficReport trafficReport = new TrafficReport(j3, j3 - bVar.c());
        if (this.b == null) {
            this.b = new TrafficReport(this.d, 0L);
        }
        long usedSize = this.b.getUsedSize();
        long usedSize2 = trafficReport.getUsedSize();
        int delayTime = this.b.getDelayTime();
        com.heytap.accessory.base.logging.a.c("Sender - TCTrack", "[receive tc request], currPool: " + this.f + ", max: " + trafficReport.getMaxWindowSize() + ", tcSize: " + bVar.c() + ", transId: " + this.g + "; accId&channelId: " + this.h + ", " + this.i + "; ");
        synchronized (this.e) {
            try {
                if (this.e.a()) {
                    this.e.notify();
                }
            } catch (Exception e) {
                com.heytap.accessory.base.logging.a.e("Sender - TCTrack", e.toString());
            }
            this.f = Math.max(0L, this.f - trafficReport.getLeftWindowSize());
            com.heytap.accessory.base.logging.a.a("Sender - TCTrack", "put sender pool, accId&channelId: " + this.h + ", " + this.i + ", transId: " + this.g + ", newPool: " + this.f);
            long j4 = usedSize2 - usedSize;
            if (j4 > 0) {
                trafficReport.setTendency(TrafficReport.Tendency.INCREASING);
            } else if (j4 == 0) {
                trafficReport.setTendency(TrafficReport.Tendency.STABLE);
            } else {
                trafficReport.setTendency(TrafficReport.Tendency.DECREASING);
            }
            if (trafficReport.getTendency() != TrafficReport.Tendency.STABLE) {
                long j5 = 10;
                if (trafficReport.getTendency() == TrafficReport.Tendency.DECREASING) {
                    j2 = ((long) delayTime) - 10;
                } else {
                    if (this.b.getTendency() == TrafficReport.Tendency.INCREASING) {
                        j = delayTime;
                        j5 = 20;
                    } else {
                        j = delayTime;
                    }
                    j2 = j + j5;
                }
                delayTime = (int) j2;
            }
            if (delayTime < 0) {
                delayTime = 0;
            }
            trafficReport.setDelayTime(delayTime);
            this.b = trafficReport;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.String] */
    public void b(int i) {
        String str;
        if (this.a && this.c == 2) {
            if (this.d <= 0) {
                c.a("Sender - TCTrack", "[send data, ignore tc] maxWindowSize is illegal:" + this.d + ", ignore tc check");
                return;
            }
            synchronized (this.e) {
                this.f += (long) i;
                c.a("Sender - TCTrack", "[send data (tc)], pool: " + this.f + ", mMaxWindowSize: " + this.d + ", percent:" + String.format(Locale.CHINA, "%.2f", Float.valueOf((this.f / this.d) * 100.0f)) + "% single msg length:" + i + ", transId: " + this.g + "; accId&channelId: " + this.h + ", " + this.i);
                if (this.f > this.d) {
                    c.c("Sender - TCTrack", "[send data][tc locker], pool is full, lock sender, transId: " + this.g + "; accId&channelId: " + this.h + ", " + this.i);
                    try {
                        try {
                            this.e.b();
                            this.e.wait(HealthDataRefreshReceiver.ONE_MINUTE);
                            this.e.c();
                            str = "Sender - TCTrack";
                            this = "[tc locker], release sender, transId: " + this.g + "; accId&channelId: " + this.h + ", " + this.i;
                        } catch (Throwable th) {
                            this.e.c();
                            c.b("Sender - TCTrack", "[tc locker], release sender, transId: " + this.g + "; accId&channelId: " + this.h + ", " + this.i);
                            throw th;
                        }
                    } catch (InterruptedException e) {
                        com.heytap.accessory.base.logging.a.b("Sender - TCTrack", e);
                        this.e.c();
                        str = "Sender - TCTrack";
                        this = "[tc locker], release sender, transId: " + this.g + "; accId&channelId: " + this.h + ", " + this.i;
                    }
                    c.b(str, (String) this);
                }
            }
        }
    }

    public void a() {
        com.heytap.accessory.base.logging.a.a("Sender - TCTrack", "[cleanup tc cache], transId: " + this.g + "; accId&channelId: " + this.h + ", " + this.i);
        synchronized (this.e) {
            if (this.e.a()) {
                this.e.notify();
            }
        }
    }

    public int a(int i) {
        if (!this.a || this.c == -1) {
            com.heytap.accessory.base.logging.a.a("Sender - TCTrack", "calculatePackageLength, tc disable, use suggestion:" + i);
            return i;
        }
        if (this.d <= 0) {
            com.heytap.accessory.base.logging.a.e("Sender - TCTrack", "calculatePackageLength exception, mMaxWindowSize: " + this.d + ", key: " + this.h + ", " + this.i + ", suggestPackageLength: " + i);
            return i;
        }
        com.heytap.accessory.base.logging.a.a("Sender - TCTrack", "calculatePackageLength, suggestPackageLength:" + i + ", mMaxWindowSize:" + this.d);
        return (int) Math.min(i, this.d);
    }
}
