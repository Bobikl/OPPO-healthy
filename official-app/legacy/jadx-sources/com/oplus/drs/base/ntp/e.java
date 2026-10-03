package com.oplus.drs.base.ntp;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class e {
    public final d a;
    public List<String> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f19697c;
    public Long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f19698e;
    public boolean f;

    public e(d dVar, long j2, List<String> list, boolean z) {
        this.f19697c = null;
        this.d = null;
        this.f = false;
        if (dVar == null) {
            throw new IllegalArgumentException("message cannot be null");
        }
        this.f19698e = j2;
        this.a = dVar;
        this.b = list;
        if (z) {
            a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b3  */
    public void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        if (this.b == null) {
            this.b = new ArrayList();
        }
        TimeStamp timeStampA = this.a.a();
        long time = timeStampA.getTime();
        TimeStamp timeStampD = this.a.d();
        long time2 = timeStampD.getTime();
        TimeStamp timeStampE = this.a.e();
        long time3 = timeStampE.getTime();
        long j2 = 0;
        if (timeStampA.ntpValue() == 0) {
            if (timeStampE.ntpValue() == 0) {
                this.b.add("Error: zero orig time -- cannot compute delay/offset");
                return;
            } else {
                this.d = Long.valueOf(time3 - this.f19698e);
                this.b.add("Error: zero orig time -- cannot compute delay");
                return;
            }
        }
        if (timeStampD.ntpValue() == 0 || timeStampE.ntpValue() == 0) {
            this.b.add("Warning: zero rcvNtpTime or xmitNtpTime");
            long j3 = this.f19698e;
            if (time > j3) {
                this.b.add("Error: OrigTime > DestRcvTime");
            } else {
                this.f19697c = Long.valueOf(j3 - time);
            }
            if (timeStampD.ntpValue() != 0) {
                this.d = Long.valueOf(time2 - time);
                return;
            } else {
                if (timeStampE.ntpValue() != 0) {
                    this.d = Long.valueOf(time3 - this.f19698e);
                    return;
                }
                return;
            }
        }
        long j4 = this.f19698e - time;
        if (time3 >= time2) {
            long j5 = time3 - time2;
            if (j5 <= j4) {
                j2 = j4 - j5;
            } else if (j5 - j4 != 1) {
                this.b.add("Warning: processing time > total network time");
            } else if (j4 != 0) {
                this.b.add("Info: processing time > total network time by 1 ms -> assume zero delay");
            }
            this.f19697c = Long.valueOf(j2);
            if (time > this.f19698e) {
                this.b.add("Error: OrigTime > DestRcvTime");
            }
            this.d = Long.valueOf(((time2 - time) + (time3 - this.f19698e)) / 2);
        }
        this.b.add("Error: xmitTime < rcvTime");
        j2 = j4;
        this.f19697c = Long.valueOf(j2);
        if (time > this.f19698e) {
            this.b.add("Error: OrigTime > DestRcvTime");
        }
        this.d = Long.valueOf(((time2 - time) + (time3 - this.f19698e)) / 2);
    }

    public d b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f19698e == eVar.f19698e && this.a.equals(eVar.a);
    }

    public int hashCode() {
        return (((int) this.f19698e) * 31) + this.a.hashCode();
    }

    public e(d dVar, long j2, boolean z) {
        this(dVar, j2, null, z);
    }
}
