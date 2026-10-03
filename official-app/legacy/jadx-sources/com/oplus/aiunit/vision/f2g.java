package com.oplus.aiunit.vision;

import androidx.lifecycle.LiveData;
import com.heytap.databaseengine.model.OneTimeSport;
import com.heytap.sports.move.treadmill.manager.RunData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class f2g implements e2g {
    public static final String TAG = "RunSessionImpl";
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11180c = 0;
    public long f = -1;
    public String a = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i1g f11181e = new i1g();
    public a d = new a(this.a);

    public static class a {
        public final String a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f11182c;
        public int d;
        public long b = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<Long> f11183e = new ArrayList();
        public final List<Integer> f = new ArrayList();
        public final List<Float> g = new ArrayList();
        public final List<Integer> h = new ArrayList();
        public final List<Integer> i = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final List<Integer> f11184j = new ArrayList();
        public final List<Integer> k = new ArrayList();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f11185l = 10;

        public a(String str) {
            this.a = str;
        }

        public int a() {
            int iG = g();
            if (iG == 0) {
                return 0;
            }
            return (int) Math.round(j() / ((double) iG));
        }

        public long b() {
            if (this.f11183e.size() <= 0) {
                return 0L;
            }
            List<Long> list = this.f11183e;
            return list.get(list.size() - 1).longValue();
        }

        public Map<Integer, Integer> c() {
            if (this.h.size() == 0) {
                return null;
            }
            HashMap map = new HashMap();
            if (g() <= 1000) {
                map.put(0, Integer.valueOf(a()));
                return map;
            }
            int iIntValue = this.h.get(0).intValue();
            long jLongValue = this.f11183e.get(0).longValue();
            int i = 0;
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                if (this.h.get(i2).intValue() - iIntValue >= 1000) {
                    map.put(Integer.valueOf(i), Integer.valueOf((int) Math.round((this.f11183e.get(i2).longValue() - jLongValue) / 1000.0d)));
                    i++;
                    iIntValue = this.h.get(i2).intValue();
                    jLongValue = this.f11183e.get(i2).longValue();
                }
            }
            List<Integer> list = this.h;
            if (iIntValue != list.get(list.size() - 1).intValue()) {
                List<Integer> list2 = this.h;
                map.put(Integer.valueOf(i), Integer.valueOf((int) Math.round((((this.f11183e.get(this.h.size() - 1).longValue() - jLongValue) / 1000.0d) / ((double) (list2.get(list2.size() - 1).intValue() - iIntValue))) * 1000.0d)));
            }
            return map;
        }

        public float d() {
            if (this.f11183e.size() < 10) {
                return 0.0f;
            }
            int size = this.f11183e.size() - 1;
            int size2 = this.f11183e.size() - 10;
            int iIntValue = this.f11184j.get(size).intValue() - this.f11184j.get(size2).intValue();
            if (iIntValue == 0) {
                return 0.0f;
            }
            return (60000.0f / (this.f11183e.get(size).longValue() - this.f11183e.get(size2).longValue())) * iIntValue;
        }

        public long e() {
            if (this.f11183e.size() > 0) {
                return this.f11183e.get(0).longValue();
            }
            return 0L;
        }

        public String f() {
            if (this.f11184j.size() == 0) {
                return null;
            }
            StringBuilder sb = new StringBuilder("2,time,frequency");
            long jLongValue = this.f11183e.get(0).longValue();
            int iIntValue = 0;
            int i = 0;
            for (int i2 = 0; i2 < this.f11184j.size(); i2++) {
                if (this.f11184j.get(i2).intValue() >= 0) {
                    long jLongValue2 = this.f11183e.get(i2).longValue();
                    long j2 = jLongValue2 - jLongValue;
                    if (j2 >= 60000) {
                        i = (int) (((long) i) + j2);
                        int iIntValue2 = this.f11184j.get(i2).intValue() - iIntValue;
                        iIntValue = this.f11184j.get(i2).intValue();
                        sb.append(",");
                        sb.append(i);
                        sb.append(",");
                        sb.append(iIntValue2);
                        jLongValue = jLongValue2;
                    }
                }
            }
            List<Long> list = this.f11183e;
            if (jLongValue != list.get(list.size() - 1).longValue()) {
                List<Integer> list2 = this.f11184j;
                int iIntValue3 = list2.get(list2.size() - 1).intValue();
                if (iIntValue <= 0) {
                    iIntValue = this.f11184j.get(0).intValue();
                }
                int i3 = iIntValue3 - iIntValue;
                List<Long> list3 = this.f11183e;
                long jLongValue3 = list3.get(list3.size() - 1).longValue();
                if (jLongValue <= 0) {
                    jLongValue = this.f11183e.get(0).longValue();
                }
                long j3 = jLongValue3 - jLongValue;
                int iRound = (int) Math.round(((double) i3) / (j3 / 60000.0d));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("last step rate:");
                sb2.append(iRound);
                sb2.append(", last minute step:");
                sb2.append(i3);
                sb2.append(", last minute seconds:");
                sb2.append(j3 / 1000);
                sb.append(",");
                sb.append(((long) i) + j3);
                sb.append(",");
                sb.append(iRound);
            }
            return sb.toString();
        }

        public int g() {
            if (this.h.size() <= 0) {
                return 0;
            }
            List<Integer> list = this.h;
            return list.get(list.size() - 1).intValue();
        }

        public int h() {
            if (this.k.size() <= 0) {
                return 0;
            }
            List<Integer> list = this.k;
            return list.get(list.size() - 1).intValue();
        }

        public int i() {
            if (this.f11184j.size() <= 0) {
                return 0;
            }
            List<Integer> list = this.f11184j;
            return list.get(list.size() - 1).intValue();
        }

        public long j() {
            if (this.f11183e.size() > 1) {
                return this.b * 1000;
            }
            return 0L;
        }

        public String toString() {
            return "RunSessionData{timeList=" + this.f11183e + ", elapsedTimeList=" + this.f + ", speedList=" + this.g + ", distanceList=" + this.h + ", statusList=" + this.i + ", stepList=" + this.f11184j + ", energyList=" + this.k + '}';
        }
    }

    @Override // com.oplus.aiunit.vision.e2g
    public void a() {
        this.f11181e.z(this.d);
    }

    @Override // com.oplus.aiunit.vision.e2g
    public void b(RunData runData) {
        if (g(runData)) {
            this.b++;
            this.d.f11183e.add(Long.valueOf(runData.createTime));
            this.d.g.add(Float.valueOf(runData.speed));
            this.d.i.add(Integer.valueOf(runData.isPaused ? 1 : 0));
            this.d.h.add(Integer.valueOf(runData.totalDistance));
            this.d.f11184j.add(Integer.valueOf(runData.step));
            this.d.k.add(Integer.valueOf(runData.totalEnergy));
            this.d.f.add(Integer.valueOf(runData.elapsedTime));
            a aVar = this.d;
            aVar.b = runData.elapsedTime;
            aVar.d = runData.totalEnergy;
            int i = this.b;
            if (i - this.f11180c > 5) {
                this.f11180c = i;
                this.f11181e.z(aVar);
            }
        }
    }

    public void c() {
        this.f11181e.m(this.a);
    }

    public void d() {
        this.f11181e.n();
    }

    public float e() {
        return this.d.d();
    }

    public a f() {
        return this.d;
    }

    public final boolean g(RunData runData) {
        return runData.elapsedTime > 0;
    }

    public void h() {
        this.f11181e.A(this.d);
    }

    public LiveData<OneTimeSport> i() {
        return this.f11181e.B(this.d);
    }

    public void j(String str) {
        this.f11181e.C(this.d, str);
    }

    public void k(String str) {
        this.d.f11182c = str;
    }
}
