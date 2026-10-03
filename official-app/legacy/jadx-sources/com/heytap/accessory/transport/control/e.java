package com.heytap.accessory.transport.control;

import androidx.annotation.NonNull;
import com.heytap.accessory.bean.TrafficControlConfig;
import com.heytap.accessory.bean.TrafficReport;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public class e {
    public boolean a;
    public TrafficReport b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2785c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f2786e = new a();
    public volatile long f;
    public final int g;
    public final long h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f2787j;

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

    public e(long j2, int i, int i2, @NonNull TrafficControlConfig trafficControlConfig) {
        this.h = j2;
        this.i = i;
        this.g = i2;
        long maxWindowSize = trafficControlConfig.getMaxWindowSize();
        this.d = maxWindowSize;
        this.a = trafficControlConfig.isEnable();
        int handleMsgTime = trafficControlConfig.getHandleMsgTime();
        this.f2787j = handleMsgTime;
        int strategy = trafficControlConfig.getStrategy();
        if (!this.a) {
            this.f2785c = -1;
        } else if (strategy == -1 || strategy == 1 || strategy == 2) {
            this.f2785c = strategy;
        } else {
            if (maxWindowSize < 100000) {
                this.f2785c = 2;
            } else {
                this.f2785c = 1;
            }
            com.heytap.accessory.base.logging.a.a("Sender - TCTrack", "autoStrategy convert to:" + this.f2785c);
        }
        com.heytap.accessory.base.logging.a.c("Sender - TCTrack", "[receive init] maxWindowSize: " + maxWindowSize + "; accId: " + j2 + "; channelId: " + i + "; transId: " + i2 + "; mockSleepTime: " + handleMsgTime + "; flag: " + strategy + "; the final flag is " + this.f2785c);
    }

    public void a(b bVar) {
        int i;
        long j2;
        long j3;
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.e("Sender - TCTrack", "[receive tc request] request is null. ignore tc request.");
            return;
        }
        if (!this.a || (i = this.f2785c) == -1) {
            com.heytap.accessory.base.logging.a.a("Sender - TCTrack", "[receive tc request] ignore. tcEnable: " + this.a + ", flag: " + this.f2785c);
            return;
        }
        if (i != 2) {
            com.heytap.accessory.base.logging.a.a("Sender - TCTrack", "[receive tc request] convert flag from " + this.f2785c + " to 2");
            this.f2785c = 2;
        }
        long j4 = this.d;
        if (j4 <= 0) {
            com.heytap.accessory.base.logging.a.e("Sender - TCTrack", "[receive tc request] mMaxWindowSize(" + this.d + ") not set. ignore tc request., transId: " + this.g + "; accId&channelId: " + this.h + "," + this.i);
            return;
        }
        TrafficReport trafficReport = new TrafficReport(j4, j4 - bVar.c());
        if (this.b == null) {
            this.b = new TrafficReport(this.d, 0L);
        }
        long usedSize = this.b.getUsedSize();
        long usedSize2 = trafficReport.getUsedSize();
        int delayTime = this.b.getDelayTime();
        com.heytap.accessory.base.logging.a.c("Sender - TCTrack", "[receive tc request], currPool: " + this.f + ", max: " + trafficReport.getMaxWindowSize() + ", tcSize: " + bVar.c() + ", transId: " + this.g + "; accId&channelId: " + this.h + ", " + this.i + "; ");
        synchronized (this.f2786e) {
            try {
                if (this.f2786e.a()) {
                    this.f2786e.notify();
                }
            } catch (Exception e2) {
                com.heytap.accessory.base.logging.a.e("Sender - TCTrack", e2.toString());
            }
            this.f = Math.max(0L, this.f - trafficReport.getLeftWindowSize());
            com.heytap.accessory.base.logging.a.a("Sender - TCTrack", "put sender pool, accId&channelId: " + this.h + ", " + this.i + ", transId: " + this.g + ", newPool: " + this.f);
            long j5 = usedSize2 - usedSize;
            if (j5 > 0) {
                trafficReport.setTendency(TrafficReport.Tendency.INCREASING);
            } else if (j5 == 0) {
                trafficReport.setTendency(TrafficReport.Tendency.STABLE);
            } else {
                trafficReport.setTendency(TrafficReport.Tendency.DECREASING);
            }
            if (trafficReport.getTendency() != TrafficReport.Tendency.STABLE) {
                long j6 = 10;
                if (trafficReport.getTendency() == TrafficReport.Tendency.DECREASING) {
                    j3 = ((long) delayTime) - 10;
                } else {
                    if (this.b.getTendency() == TrafficReport.Tendency.INCREASING) {
                        j2 = delayTime;
                        j6 = 20;
                    } else {
                        j2 = delayTime;
                    }
                    j3 = j2 + j6;
                }
                delayTime = (int) j3;
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
        if (this.a && this.f2785c == 2) {
            if (this.d <= 0) {
                c.a("Sender - TCTrack", "[send data, ignore tc] maxWindowSize is illegal:" + this.d + ", ignore tc check");
                return;
            }
            synchronized (this.f2786e) {
                this.f += (long) i;
                c.a("Sender - TCTrack", "[send data (tc)], pool: " + this.f + ", mMaxWindowSize: " + this.d + ", percent:" + String.format(Locale.CHINA, "%.2f", Float.valueOf((this.f / this.d) * 100.0f)) + "% single msg length:" + i + ", transId: " + this.g + "; accId&channelId: " + this.h + ", " + this.i);
                if (this.f > this.d) {
                    c.c("Sender - TCTrack", "[send data][tc locker], pool is full, lock sender, transId: " + this.g + "; accId&channelId: " + this.h + ", " + this.i);
                    try {
                        try {
                            this.f2786e.b();
                            this.f2786e.wait(60000L);
                            this.f2786e.c();
                            str = "Sender - TCTrack";
                            this = "[tc locker], release sender, transId: " + this.g + "; accId&channelId: " + this.h + ", " + this.i;
                        } catch (Throwable th) {
                            this.f2786e.c();
                            c.b("Sender - TCTrack", "[tc locker], release sender, transId: " + this.g + "; accId&channelId: " + this.h + ", " + this.i);
                            throw th;
                        }
                    } catch (InterruptedException e2) {
                        com.heytap.accessory.base.logging.a.b("Sender - TCTrack", e2);
                        this.f2786e.c();
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
        synchronized (this.f2786e) {
            if (this.f2786e.a()) {
                this.f2786e.notify();
            }
        }
    }

    public int a(int i) {
        if (!this.a || this.f2785c == -1) {
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
