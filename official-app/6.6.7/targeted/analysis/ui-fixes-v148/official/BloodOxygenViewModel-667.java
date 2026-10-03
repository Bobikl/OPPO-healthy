package com.heytap.health.bloodoxygen.viewmodel;

import android.annotation.SuppressLint;
import android.text.format.DateFormat;
import androidx.lifecycle.LiveData;
import com.heytap.databaseengine.model.Spo2Warning;
import com.heytap.databaseengine.model.bloodoxygensaturation.BloodOxygenSaturation;
import com.heytap.databaseengine.model.bloodoxygensaturation.BloodOxygenSaturationDataStat;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.bloodoxygen.viewmodel.BloodOxygenViewModel;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.oplus.aiunit.vision.Spo2WarnBean;
import com.oplus.aiunit.vision.ar0;
import com.oplus.aiunit.vision.b24;
import com.oplus.aiunit.vision.be1;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.ddd;
import com.oplus.aiunit.vision.f59;
import com.oplus.aiunit.vision.fl1;
import com.oplus.aiunit.vision.g18;
import com.oplus.aiunit.vision.h18;
import com.oplus.aiunit.vision.kn1;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.nci;
import com.oplus.aiunit.vision.vm1;
import com.oplus.aiunit.vision.w0b;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public class BloodOxygenViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f4462j = "BloodOxygenViewModel";
    public final OLiveData<List<fl1>> k = new OLiveData<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final OLiveData<List<BloodOxygenSaturation>> f4463l = new OLiveData<>();
    public final OLiveData<List<Spo2Warning>> m = new OLiveData<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final OLiveData<Spo2WarnBean> f4464n = new OLiveData<>();
    public final OLiveData<TimeStampedData> o = new OLiveData<>();
    public String r = cn.c().getSsoid();
    public final vm1 p = new vm1();
    public final nci q = new nci();

    public static /* synthetic */ Spo2WarnBean E(List list, Long l2) throws Throwable {
        return new Spo2WarnBean(l2.intValue(), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Spo2WarnBean F(Throwable th) throws Throwable {
        m8b.f("BloodOxygenViewModel", "fetchSpo2WarnBean error:" + th.getMessage());
        return new Spo2WarnBean(0, new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List G(long j2, long j3, List list, List list2, Long l2) throws Throwable {
        return this.q.b(j2, j3, list, list2, l2.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List H(long j2, long j3, Throwable th) throws Throwable {
        m8b.f("BloodOxygenViewModel", "queryBloodDetailAllData error:" + th.getMessage());
        return this.q.b(j2, j3, new ArrayList(), new ArrayList(), 0);
    }

    public static /* synthetic */ TimeStampedData I(List list) throws Throwable {
        if (w0b.a(list)) {
            return new TimeStampedData(0L, 0.0f);
        }
        BloodOxygenSaturation bloodOxygenSaturation = (BloodOxygenSaturation) list.get(list.size() - 1);
        TimeStampedData timeStampedData = new TimeStampedData();
        timeStampedData.setTimestamp(bloodOxygenSaturation.getDataCreatedTimestamp());
        timeStampedData.setY(bloodOxygenSaturation.getBloodOxygenSaturationValue());
        return timeStampedData;
    }

    public static /* synthetic */ List J(Throwable th) throws Throwable {
        return new ArrayList();
    }

    @SuppressLint({"CheckResult"})
    public LiveData<Spo2WarnBean> B(long j2, long j3, int i, int i2) {
        ar0.c("BloodOxygenViewModel", "fetchSpo2WarnBean: ,startTime: " + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", j2)) + ",endTime: " + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", j3)));
        ddd dddVarT0 = ddd.j1(this.p.q(this.r, j2, j3, i, i2), this.p.p(this.r, j2, j3), new be1() { // from class: com.oplus.aiunit.vision.nn1
            @Override // com.oplus.aiunit.vision.be1
            public final Object apply(Object obj, Object obj2) {
                return BloodOxygenViewModel.E((List) obj, (Long) obj2);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.on1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return this.i.F((Throwable) obj);
            }
        });
        final OLiveData<Spo2WarnBean> oLiveData = this.f4464n;
        Objects.requireNonNull(oLiveData);
        u(dddVarT0.a(new b24() { // from class: com.oplus.aiunit.vision.pn1
            @Override // com.oplus.aiunit.vision.b24
            public final void accept(Object obj) {
                oLiveData.postValue((Spo2WarnBean) obj);
            }
        }));
        return this.f4464n;
    }

    public OLiveData<TimeStampedData> C() {
        return this.o;
    }

    public List<f59> D(long j2, long j3, List<f59> list) {
        if (list == null || list.isEmpty()) {
            return list;
        }
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(j3), ZoneId.systemDefault());
        LocalDateTime localDateTimeAtStartOfDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).toLocalDate().atStartOfDay();
        int totalMonths = (int) (Period.between(localDateTimeAtStartOfDay.toLocalDate().withDayOfMonth(1), localDateTimeOfInstant.toLocalDate().withDayOfMonth(1)).toTotalMonths() + 1);
        ArrayList arrayList = new ArrayList(totalMonths);
        for (int i = 0; i < totalMonths; i++) {
            f59 f59Var = new f59();
            f59Var.e(0);
            f59Var.d(0);
            f59Var.f(localDateTimeAtStartOfDay.plusMonths(i).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
            arrayList.add(f59Var);
        }
        for (f59 f59Var2 : list) {
            int totalMonths2 = (int) Period.between(localDateTimeAtStartOfDay.toLocalDate().withDayOfMonth(1), LocalDateTime.ofInstant(Instant.ofEpochMilli(f59Var2.c()), ZoneId.systemDefault()).toLocalDate().withDayOfMonth(1)).toTotalMonths();
            if (totalMonths2 < totalMonths) {
                arrayList.set(totalMonths2, f59Var2);
            }
        }
        return arrayList;
    }

    @SuppressLint({"CheckResult"})
    public LiveData<List<fl1>> K(long j2, final long j3, int i) {
        long j4 = j2 < 1546272000000L ? 1546272000000L : j2;
        ar0.c("BloodOxygenViewModel", "queryBloodDetailAllData: ,startTime: " + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", j4)) + ",endTime: " + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", j3)));
        final long j5 = j4;
        final long j6 = j4;
        ddd dddVarT0 = ddd.k1(this.p.E(this.r, j5, j3, 0), this.p.q(this.r, j5, j3, 3, i), this.p.p(this.r, j5, j3), new h18() { // from class: com.oplus.aiunit.vision.ln1
            @Override // com.oplus.aiunit.vision.h18
            public final Object a(Object obj, Object obj2, Object obj3) {
                return this.a.G(j6, j3, (List) obj, (List) obj2, (Long) obj3);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.mn1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return this.i.H(j5, j3, (Throwable) obj);
            }
        });
        OLiveData<List<fl1>> oLiveData = this.k;
        Objects.requireNonNull(oLiveData);
        dddVarT0.a(new kn1(oLiveData));
        return this.k;
    }

    @SuppressLint({"CheckResult"})
    public void L() {
        ar0.c("BloodOxygenViewModel", "queryLastSpo2CardData: ");
        ddd<R> dddVarJ0 = this.p.G().j0(new g18() { // from class: com.oplus.aiunit.vision.qn1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return BloodOxygenViewModel.I((List) obj);
            }
        });
        final OLiveData<TimeStampedData> oLiveData = this.o;
        Objects.requireNonNull(oLiveData);
        dddVarJ0.a(new b24() { // from class: com.oplus.aiunit.vision.rn1
            @Override // com.oplus.aiunit.vision.b24
            public final void accept(Object obj) {
                oLiveData.postValue((TimeStampedData) obj);
            }
        });
    }

    @SuppressLint({"CheckResult"})
    public LiveData<List<BloodOxygenSaturationDataStat>> M(long j2, long j3, int i) {
        long j4 = j2 < 1546257600000L ? 1546257600000L : j2;
        OLiveData oLiveData = new OLiveData();
        ar0.c("BloodOxygenViewModel", "queryStatData: ,startTime: " + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", j4)) + ",endTime: " + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", j3)));
        this.p.H(this.r, j4, j3, i).t0(new g18() { // from class: com.oplus.aiunit.vision.jn1
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return BloodOxygenViewModel.J((Throwable) obj);
            }
        }).a(new kn1(oLiveData));
        return oLiveData;
    }

    public void N(String str) {
        this.r = str;
    }
}