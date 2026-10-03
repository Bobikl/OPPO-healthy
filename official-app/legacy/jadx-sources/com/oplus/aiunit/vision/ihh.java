package com.oplus.aiunit.vision;

import android.text.format.DateFormat;
import androidx.annotation.NonNull;
import com.heytap.health.core.widget.charts.data.SleepUnitData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class ihh {
    public final long a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<SleepUnitData> f12541c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12542e;
    public int f;
    public int g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12543j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12544l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f12545n;
    public long o;
    public Integer p;

    public ihh(long j2, long j3, @NonNull List<SleepUnitData> list) {
        ArrayList arrayList = new ArrayList();
        this.f12541c = arrayList;
        this.a = j2;
        this.b = j3;
        arrayList.clear();
        arrayList.addAll(list);
        if (!list.isEmpty()) {
            this.f12545n = list.get(0).getTimestamp();
            this.o = list.get(list.size() - 1).getTimestamp() + list.get(list.size() - 1).getDuration();
            this.p = list.get(0).getDeviceType();
            StringBuilder sb = new StringBuilder();
            sb.append("init date:");
            sb.append((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", j3));
            sb.append("/startTime:");
            sb.append((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", this.f12545n));
            sb.append("/endTime:");
            sb.append((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", this.o));
            sb.append("/deviceType:");
            sb.append(this.p);
        }
        q();
    }

    public final void a() {
        int i = this.d;
        if (i > 0) {
            int i2 = this.f12542e;
            if (i2 > 0) {
                this.k = (int) Math.ceil((i2 * 100.0f) / i);
            }
            int i3 = this.g;
            if (i3 > 0) {
                this.m = (int) Math.ceil((i3 * 100.0f) / this.d);
            }
        }
        this.f12544l = (100 - this.k) - this.m;
    }

    public int b() {
        return this.k;
    }

    public Integer c() {
        return this.p;
    }

    public long d() {
        if (this.f12541c.isEmpty()) {
            return 0L;
        }
        List<SleepUnitData> list = this.f12541c;
        SleepUnitData sleepUnitData = list.get(list.size() - 1);
        return sleepUnitData.getTimestamp() + sleepUnitData.getDuration();
    }

    public int e() {
        return this.f12544l;
    }

    public int f() {
        return this.m;
    }

    public long g() {
        return this.f12545n;
    }

    public long h() {
        return this.o;
    }

    public List<SleepUnitData> i() {
        return this.f12541c;
    }

    public long j() {
        if (this.f12541c.isEmpty()) {
            return 0L;
        }
        return this.f12541c.get(0).getTimestamp();
    }

    public int k() {
        return this.f12542e;
    }

    public int l() {
        return this.f;
    }

    public int m() {
        return this.g;
    }

    public int n() {
        return this.d;
    }

    public int o() {
        return this.h;
    }

    public int p() {
        return this.i;
    }

    public final void q() {
        for (int i = 0; i < this.f12541c.size(); i++) {
            SleepUnitData sleepUnitData = this.f12541c.get(i);
            if (sleepUnitData.getDuration() < 60000) {
                a7b.b("SleepFrgBean", "Sleep time is less than 1 minute");
                break;
            }
            int duration = (int) (sleepUnitData.getDuration() / 60000);
            int type = sleepUnitData.getType();
            if (type == 1) {
                this.f12542e += duration;
            } else if (type == 2) {
                this.f += duration;
            } else if (type == 3) {
                this.g += duration;
            } else if (type == 4) {
                this.h += duration;
                this.i++;
            }
        }
        int i2 = this.f12542e + this.f + this.g;
        this.d = i2;
        this.f12543j = i2 < 120;
        a();
    }

    public boolean r() {
        return this.f12543j;
    }

    @NonNull
    public String toString() {
        return "SleepFrgBean{date=" + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", this.b)) + "totalSleepTime=" + this.d + ", totalDeepSleepTime=" + this.f12542e + ", totalLightlySleepTime=" + this.f + ", totalRemSleepTime=" + this.g + ", totalWakeTime=" + this.h + ", wakeCount=" + this.i + '}';
    }
}
