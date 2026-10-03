package com.heytap.health.heartrate.viewmodel;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.text.TextUtils;
import android.text.format.DateFormat;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.HeartRate;
import com.heytap.databaseengine.model.HeartRateDataStat;
import com.heytap.databaseengine.model.HeartRateWarning;
import com.heytap.databaseengine.model.SleepIndex;
import com.heytap.databaseengine.model.hrnewdaycard.HeartRateReadNewDayCard;
import com.heytap.databaseengine.model.newsleep.SleepHeartRateStat;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.healthbase.util.HealthFrgType;
import com.heytap.health.heartrate.model.HeartRateCardTransform;
import com.heytap.health.heartrate.viewmodel.HeartRateCardViewModel;
import com.oplus.aiunit.vision.a79;
import com.oplus.aiunit.vision.aq6;
import com.oplus.aiunit.vision.b24;
import com.oplus.aiunit.vision.be1;
import com.oplus.aiunit.vision.ddd;
import com.oplus.aiunit.vision.e3k;
import com.oplus.aiunit.vision.g59;
import com.oplus.aiunit.vision.gg8;
import com.oplus.aiunit.vision.gmk;
import com.oplus.aiunit.vision.h18;
import com.oplus.aiunit.vision.h59;
import com.oplus.aiunit.vision.k18;
import com.oplus.aiunit.vision.k39;
import com.oplus.aiunit.vision.kn1;
import com.oplus.aiunit.vision.o49;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.q15;
import com.oplus.aiunit.vision.sed;
import com.oplus.aiunit.vision.tdd;
import com.oplus.aiunit.vision.v39;
import com.oplus.aiunit.vision.w0b;
import com.oplus.aiunit.vision.wv8;
import com.oplusos.sau.common.utils.SauAarConstants;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class HeartRateCardViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final OLiveData<List<h59>> f5753l = new OLiveData<>();
    public final OLiveData<v39> m = new OLiveData<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final OLiveData<a79> f5754n = new OLiveData<>();
    public final OLiveData<List<g59>> o = new OLiveData<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o49 f5752j = new o49();
    public final HeartRateCardTransform k = new HeartRateCardTransform();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(List list, HealthFrgType healthFrgType, long j2, long j3, tdd tddVar) throws Throwable {
        long epochMilli;
        long j4;
        gg8.c("HeartRateCardViewModel", "fetchHeartRateHistoryData result size : " + list.size() + "/healthFrgType:" + healthFrgType);
        a79 a79Var = new a79();
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        boolean z = true;
        if (list.size() <= 0) {
            gg8.b("HeartRateCardViewModel", "fetchHeartRateDayLineData data is null");
            j4 = j2;
        } else {
            gg8.c("HeartRateCardViewModel", "fetchHeartRateDayLineData data succeed");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                g59 g59Var = (g59) it.next();
                TimeStampedData timeStampedData = new TimeStampedData();
                timeStampedData.setTimestamp(g59Var.k());
                timeStampedData.setY(g59Var.j());
                timeStampedData.setHeartRateType(1);
                arrayList.add(timeStampedData);
                e3k e3kVar = new e3k();
                e3kVar.v(g59Var.k());
                e3kVar.j(g59Var.f());
                e3kVar.k(g59Var.g());
                arrayList2.add(e3kVar);
                TimeStampedData timeStampedData2 = new TimeStampedData();
                timeStampedData2.setTimestamp(g59Var.k());
                timeStampedData2.setY(g59Var.b());
                timeStampedData2.setHeartRateType(4);
                arrayList3.add(timeStampedData2);
                TimeStampedData timeStampedData3 = new TimeStampedData();
                timeStampedData3.setTimestamp(g59Var.k());
                timeStampedData3.setY(g59Var.a());
                timeStampedData3.setHeartRateType(5);
                arrayList4.add(timeStampedData3);
            }
            a79Var.k(arrayList);
            a79Var.n(arrayList2);
            a79Var.o(arrayList3);
            a79Var.m(arrayList4);
            z = false;
            long jK = ((g59) list.get(0)).k();
            a79Var.j(LocalDateTime.ofInstant(Instant.ofEpochMilli(jK), zoneIdSystemDefault).toLocalDate().atStartOfDay().atZone(zoneIdSystemDefault).toInstant().toEpochMilli());
            if (healthFrgType == HealthFrgType.WEEK) {
                epochMilli = jK < j2 ? LocalDateTime.ofInstant(Instant.ofEpochMilli(jK), zoneIdSystemDefault).toLocalDate().with((TemporalAdjuster) DayOfWeek.MONDAY).atStartOfDay().atZone(zoneIdSystemDefault).toInstant().toEpochMilli() : j2;
                gg8.c("HeartRateCardViewModel", "week fill data startTime:" + q15.a(epochMilli, "yyyy-MM-dd HH:mm:ss"));
            } else if (healthFrgType == HealthFrgType.MONTH) {
                epochMilli = jK < j2 ? LocalDateTime.ofInstant(Instant.ofEpochMilli(jK), zoneIdSystemDefault).toLocalDate().with(TemporalAdjusters.firstDayOfMonth()).atStartOfDay().atZone(zoneIdSystemDefault).toInstant().toEpochMilli() : j2;
                gg8.c("HeartRateCardViewModel", "month fill data startTime:" + q15.a(epochMilli, "yyyy-MM-dd HH:mm:ss"));
            } else {
                epochMilli = jK < j2 ? LocalDateTime.ofInstant(Instant.ofEpochMilli(jK), zoneIdSystemDefault).toLocalDate().with(TemporalAdjusters.firstDayOfYear()).atStartOfDay().atZone(zoneIdSystemDefault).toInstant().toEpochMilli() : j2;
                gg8.c("HeartRateCardViewModel", "year fill data startTime:" + q15.a(epochMilli, "yyyy-MM-dd HH:mm:ss"));
            }
            j4 = epochMilli;
        }
        a79Var.l(z);
        a79Var.i(j4);
        tddVar.onNext(M(j4, j3, a79Var, healthFrgType));
        tddVar.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(long j2, long j3, Throwable th) throws Throwable {
        gg8.c("HeartRateCardViewModel", "throwable : " + th.getMessage());
        this.f5754n.postValue(new a79().a(j2, j3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List Q(long j2, long j3, boolean z, List list, List list2, List list3) throws Throwable {
        return Y(j2, j3, list, z, list2, new ArrayList(), 0, list3, new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(List list) throws Throwable {
        gg8.a("HeartRateCardViewModel", "fetchHeartRateDayLineData | accept");
        this.f5753l.postValue(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List S(long j2, long j3, List list, List list2, List list3, Long l2, List list4, List list5) throws Throwable {
        return Y(j2, j3, list, true, list2, list3, l2.intValue(), list4, list5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(List list) throws Throwable {
        gg8.a("HeartRateCardViewModel", "fetchHeartRateDayLineData | accept");
        this.f5753l.postValue(list);
    }

    public static /* synthetic */ List W(List list, List list2, Long l2) throws Throwable {
        if (!list.isEmpty()) {
            g59 g59Var = (g59) list.get(0);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                HeartRateWarning heartRateWarning = (HeartRateWarning) it.next();
                g59Var.c().add(heartRateWarning);
                if (heartRateWarning.getWarningType() == 1) {
                    g59Var.e().add(heartRateWarning);
                } else if (heartRateWarning.getWarningType() == 2) {
                    g59Var.d().add(heartRateWarning);
                }
            }
            g59Var.n(l2.intValue());
        }
        return list;
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void V(final List<g59> list, final long j2, final long j3, final HealthFrgType healthFrgType) {
        ddd dddVarK0 = ddd.w(new sed() { // from class: com.oplus.aiunit.vision.y49
            @Override // com.oplus.aiunit.vision.sed
            public final void a(tdd tddVar) throws Throwable {
                this.a.O(list, healthFrgType, j3, j2, tddVar);
            }
        }).K0(wv8.c());
        final OLiveData<a79> oLiveData = this.f5754n;
        Objects.requireNonNull(oLiveData);
        u(dddVarK0.b(new b24() { // from class: com.oplus.aiunit.vision.z49
            @Override // com.oplus.aiunit.vision.b24
            public final void accept(Object obj) {
                oLiveData.postValue((a79) obj);
            }
        }, new b24() { // from class: com.oplus.aiunit.vision.a59
            @Override // com.oplus.aiunit.vision.b24
            public final void accept(Object obj) throws Throwable {
                this.i.P(j2, j3, (Throwable) obj);
            }
        }));
    }

    @SuppressLint({"CheckResult"})
    public void F(long j2, long j3) {
        gg8.c("HeartRateCardViewModel", "fetchHeartRateCardData startTime:" + q15.a(j2, "yyyy-MM-dd HH:mm:ss") + "endTime:" + q15.a(j3, "yyyy-MM-dd HH:mm:ss"));
        ddd<List<HeartRate>> dddVarV = this.f5752j.v(j2, j3, 0);
        ddd<List<g59>> dddVarS = this.f5752j.s(j2, j3, 4);
        final HeartRateCardTransform heartRateCardTransform = this.k;
        Objects.requireNonNull(heartRateCardTransform);
        ddd dddVarJ1 = ddd.j1(dddVarV, dddVarS, new be1() { // from class: com.oplus.aiunit.vision.b59
            @Override // com.oplus.aiunit.vision.be1
            public final Object apply(Object obj, Object obj2) {
                return heartRateCardTransform.b((List) obj, (List) obj2);
            }
        });
        final OLiveData<v39> oLiveData = this.m;
        Objects.requireNonNull(oLiveData);
        u(dddVarJ1.a(new b24() { // from class: com.oplus.aiunit.vision.c59
            @Override // com.oplus.aiunit.vision.b24
            public final void accept(Object obj) {
                oLiveData.postValue((v39) obj);
            }
        }));
    }

    public OLiveData<List<h59>> G(final long j2, final long j3, final boolean z) {
        gg8.c("HeartRateCardViewModel", "fetchHeartRateDayLineData startTime:" + q15.a(j2, "yyyy-MM-dd HH:mm:ss") + " endTime:" + q15.a(j3, "yyyy-MM-dd HH:mm:ss"));
        u(ddd.k1(this.f5752j.u(j2, j3, -1), this.f5752j.t(j2, j3, 4, true), this.f5752j.y(j2, j3, 4), new h18() { // from class: com.oplus.aiunit.vision.u49
            @Override // com.oplus.aiunit.vision.h18
            public final Object a(Object obj, Object obj2, Object obj3) {
                return this.a.Q(j2, j3, z, (List) obj, (List) obj2, (List) obj3);
            }
        }).a(new b24() { // from class: com.oplus.aiunit.vision.v49
            @Override // com.oplus.aiunit.vision.b24
            public final void accept(Object obj) throws Throwable {
                this.i.R((List) obj);
            }
        }));
        return this.f5753l;
    }

    public OLiveData<List<h59>> H(final long j2, final long j3, int i) {
        gg8.c("HeartRateCardViewModel", "fetchHeartRateDayLineData startTime:" + q15.a(j2, "yyyy-MM-dd HH:mm:ss") + " endTime:" + q15.a(j3, "yyyy-MM-dd HH:mm:ss"));
        u(ddd.n1(this.f5752j.u(j2, j3, -1), this.f5752j.t(j2, j3, 4, true), this.f5752j.x(j2, j3, i), this.f5752j.w(j2, j3), this.f5752j.y(j2, j3, 4), this.f5752j.T(j2, j3, 4), new k18() { // from class: com.oplus.aiunit.vision.s49
            @Override // com.oplus.aiunit.vision.k18
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return this.a.S(j2, j3, (List) obj, (List) obj2, (List) obj3, (Long) obj4, (List) obj5, (List) obj6);
            }
        }).a(new b24() { // from class: com.oplus.aiunit.vision.t49
            @Override // com.oplus.aiunit.vision.b24
            public final void accept(Object obj) throws Throwable {
                this.i.T((List) obj);
            }
        }));
        return this.f5753l;
    }

    @SuppressLint({"CheckResult"})
    public void I(long j2, final long j3, int i, final long j4, final HealthFrgType healthFrgType) {
        gg8.c("HeartRateCardViewModel", "fetchHeartRateHistoryData startTime: " + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", j2)) + j2 + ",endTime: " + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", j3)) + j3);
        u(ddd.j1(this.f5752j.s(j2, j3, i), this.f5752j.y(j2, j3, i), new be1() { // from class: com.oplus.aiunit.vision.w49
            @Override // com.oplus.aiunit.vision.be1
            public final Object apply(Object obj, Object obj2) {
                return this.i.U(healthFrgType, (List) obj, (List) obj2);
            }
        }).a(new b24() { // from class: com.oplus.aiunit.vision.x49
            @Override // com.oplus.aiunit.vision.b24
            public final void accept(Object obj) throws Throwable {
                this.i.V(j3, j4, healthFrgType, (List) obj);
            }
        }));
    }

    @SuppressLint({"CheckResult"})
    public OLiveData<List<g59>> J(long j2, long j3, int i) {
        gg8.c("HeartRateCardViewModel", "fetchHeartRateHistoryStatData startTime: " + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", j2)) + j2 + ",endTime: " + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", j3)) + j3);
        ddd dddVarK1 = ddd.k1(this.f5752j.s(j2, j3, 8), this.f5752j.x(j2, j3, i), this.f5752j.w(j2, j3), new h18() { // from class: com.oplus.aiunit.vision.r49
            @Override // com.oplus.aiunit.vision.h18
            public final Object a(Object obj, Object obj2, Object obj3) {
                return HeartRateCardViewModel.W((List) obj, (List) obj2, (Long) obj3);
            }
        });
        OLiveData<List<g59>> oLiveData = this.o;
        Objects.requireNonNull(oLiveData);
        u(dddVarK1.a(new kn1(oLiveData)));
        return this.o;
    }

    public OLiveData<v39> K() {
        return this.m;
    }

    public OLiveData<a79> L() {
        return this.f5754n;
    }

    public a79 M(long j2, long j3, a79 a79Var, HealthFrgType healthFrgType) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(j3), zoneIdSystemDefault);
        LocalDateTime localDateTimeAtStartOfDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), zoneIdSystemDefault).toLocalDate().atStartOfDay();
        int totalMonths = healthFrgType == HealthFrgType.YEAR ? (int) (Period.between(localDateTimeAtStartOfDay.toLocalDate().withDayOfMonth(1), localDateTimeOfInstant.toLocalDate().withDayOfMonth(1)).toTotalMonths() + 1) : ((int) Math.ceil((localDateTimeOfInstant.atZone(zoneIdSystemDefault).toInstant().toEpochMilli() - localDateTimeAtStartOfDay.atZone(zoneIdSystemDefault).toInstant().toEpochMilli()) / 86400000)) + 1;
        ArrayList arrayList = new ArrayList(totalMonths);
        for (int i = 0; i < totalMonths; i++) {
            e3k e3kVar = new e3k();
            e3kVar.k(0.0f);
            e3kVar.j(0.0f);
            e3kVar.v(healthFrgType == HealthFrgType.YEAR ? localDateTimeAtStartOfDay.plusMonths(i).atZone(zoneIdSystemDefault).toInstant().toEpochMilli() : localDateTimeAtStartOfDay.plusDays(i).atZone(zoneIdSystemDefault).toInstant().toEpochMilli());
            arrayList.add(e3kVar);
        }
        for (e3k e3kVar2 : a79Var.f()) {
            LocalDateTime localDateTimeOfInstant2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(e3kVar2.h()), zoneIdSystemDefault);
            arrayList.set((int) (healthFrgType == HealthFrgType.YEAR ? Period.between(localDateTimeAtStartOfDay.toLocalDate().withDayOfMonth(1), localDateTimeOfInstant2.toLocalDate().withDayOfMonth(1)).toTotalMonths() : Math.ceil((localDateTimeOfInstant2.atZone(zoneIdSystemDefault).toInstant().toEpochMilli() - localDateTimeAtStartOfDay.atZone(zoneIdSystemDefault).toInstant().toEpochMilli()) / 86400000)), e3kVar2);
        }
        a79Var.n(arrayList);
        ArrayList arrayList2 = new ArrayList(totalMonths);
        for (int i2 = 0; i2 < totalMonths; i2++) {
            TimeStampedData timeStampedData = new TimeStampedData();
            timeStampedData.setY(0.0f);
            timeStampedData.setTimestamp(healthFrgType == HealthFrgType.YEAR ? localDateTimeAtStartOfDay.plusMonths(i2).atZone(zoneIdSystemDefault).toInstant().toEpochMilli() : localDateTimeAtStartOfDay.plusDays(i2).atZone(zoneIdSystemDefault).toInstant().toEpochMilli());
            arrayList2.add(timeStampedData);
        }
        for (TimeStampedData timeStampedData2 : a79Var.d()) {
            LocalDateTime localDateTimeOfInstant3 = LocalDateTime.ofInstant(Instant.ofEpochMilli(timeStampedData2.getTimestamp()), zoneIdSystemDefault);
            arrayList2.set((int) (healthFrgType == HealthFrgType.YEAR ? Period.between(localDateTimeAtStartOfDay.toLocalDate().withDayOfMonth(1), localDateTimeOfInstant3.toLocalDate().withDayOfMonth(1)).toTotalMonths() : Math.ceil((localDateTimeOfInstant3.atZone(zoneIdSystemDefault).toInstant().toEpochMilli() - localDateTimeAtStartOfDay.atZone(zoneIdSystemDefault).toInstant().toEpochMilli()) / 86400000)), timeStampedData2);
        }
        a79Var.k(arrayList2);
        ArrayList arrayList3 = new ArrayList(totalMonths);
        for (int i3 = 0; i3 < totalMonths; i3++) {
            TimeStampedData timeStampedData3 = new TimeStampedData();
            timeStampedData3.setY(0.0f);
            timeStampedData3.setTimestamp(healthFrgType == HealthFrgType.YEAR ? localDateTimeAtStartOfDay.plusMonths(i3).atZone(zoneIdSystemDefault).toInstant().toEpochMilli() : localDateTimeAtStartOfDay.plusDays(i3).atZone(zoneIdSystemDefault).toInstant().toEpochMilli());
            arrayList3.add(timeStampedData3);
        }
        for (TimeStampedData timeStampedData4 : a79Var.g()) {
            LocalDateTime localDateTimeOfInstant4 = LocalDateTime.ofInstant(Instant.ofEpochMilli(timeStampedData4.getTimestamp()), zoneIdSystemDefault);
            arrayList3.set((int) (healthFrgType == HealthFrgType.YEAR ? Period.between(localDateTimeAtStartOfDay.toLocalDate().withDayOfMonth(1), localDateTimeOfInstant4.toLocalDate().withDayOfMonth(1)).toTotalMonths() : Math.ceil((localDateTimeOfInstant4.atZone(zoneIdSystemDefault).toInstant().toEpochMilli() - localDateTimeAtStartOfDay.atZone(zoneIdSystemDefault).toInstant().toEpochMilli()) / 86400000)), timeStampedData4);
        }
        a79Var.o(arrayList3);
        ArrayList arrayList4 = new ArrayList(totalMonths);
        for (int i4 = 0; i4 < totalMonths; i4++) {
            TimeStampedData timeStampedData5 = new TimeStampedData();
            timeStampedData5.setY(0.0f);
            timeStampedData5.setTimestamp(healthFrgType == HealthFrgType.YEAR ? localDateTimeAtStartOfDay.plusMonths(i4).atZone(zoneIdSystemDefault).toInstant().toEpochMilli() : localDateTimeAtStartOfDay.plusDays(i4).atZone(zoneIdSystemDefault).toInstant().toEpochMilli());
            arrayList4.add(timeStampedData5);
        }
        for (TimeStampedData timeStampedData6 : a79Var.e()) {
            LocalDateTime localDateTimeOfInstant5 = LocalDateTime.ofInstant(Instant.ofEpochMilli(timeStampedData6.getTimestamp()), zoneIdSystemDefault);
            arrayList4.set((int) (healthFrgType == HealthFrgType.YEAR ? Period.between(localDateTimeAtStartOfDay.toLocalDate().withDayOfMonth(1), localDateTimeOfInstant5.toLocalDate().withDayOfMonth(1)).toTotalMonths() : Math.ceil((localDateTimeOfInstant5.atZone(zoneIdSystemDefault).toInstant().toEpochMilli() - localDateTimeAtStartOfDay.atZone(zoneIdSystemDefault).toInstant().toEpochMilli()) / 86400000)), timeStampedData6);
        }
        a79Var.m(arrayList4);
        return a79Var;
    }

    @NotNull
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final List<g59> U(List<g59> list, List<SleepIndex> list2, HealthFrgType healthFrgType) {
        long jK;
        long epochMilli;
        for (g59 g59Var : list) {
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            if (healthFrgType == HealthFrgType.YEAR) {
                jK = LocalDateTime.ofInstant(Instant.ofEpochMilli(g59Var.k()), zoneIdSystemDefault).toLocalDate().with(TemporalAdjusters.firstDayOfMonth()).atStartOfDay().atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
                epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(g59Var.k()), zoneIdSystemDefault).toLocalDate().with(TemporalAdjusters.lastDayOfMonth()).plusDays(1L).atStartOfDay().atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
            } else {
                jK = g59Var.k();
                epochMilli = 86400000 + jK;
            }
            if (g59Var.a() <= 0) {
                for (SleepIndex sleepIndex : list2) {
                    if (sleepIndex.getDataTimestamp() >= jK && sleepIndex.getDataTimestamp() < epochMilli) {
                        g59Var.m(gmk.b(sleepIndex.getAvgSleepHeartRate()));
                        break;
                    }
                }
            }
        }
        return list;
    }

    public final HeartRateReadNewDayCard X(List<HeartRateReadNewDayCard> list) {
        HeartRateReadNewDayCard heartRateReadNewDayCard = new HeartRateReadNewDayCard();
        for (HeartRateReadNewDayCard heartRateReadNewDayCard2 : list) {
            heartRateReadNewDayCard.getCurveHalfAnHour().addAll(heartRateReadNewDayCard2.getCurveHalfAnHour());
            heartRateReadNewDayCard.getRestHR().addAll(heartRateReadNewDayCard2.getRestHR());
            heartRateReadNewDayCard.getHistogramHalfAnHour().addAll(heartRateReadNewDayCard2.getHistogramHalfAnHour());
            heartRateReadNewDayCard.getWalkAvgAndSleepBaseHR().addAll(heartRateReadNewDayCard2.getWalkAvgAndSleepBaseHR());
        }
        return heartRateReadNewDayCard;
    }

    /* JADX WARN: Code duplicated, block: B:212:0x0564  */
    /* JADX WARN: Code duplicated, block: B:215:0x057d  */
    /* JADX WARN: Code duplicated, block: B:216:0x0585  */
    /* JADX WARN: Code duplicated, block: B:219:0x058e  */
    /* JADX WARN: Code duplicated, block: B:220:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:223:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:226:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:231:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:236:0x05f7 A[EDGE_INSN: B:236:0x05f7->B:241:0x0633 BREAK  A[LOOP:6: B:107:0x0358->B:237:0x05fa]] */
    /* JADX WARN: Code duplicated, block: B:237:0x05fa A[LOOP:6: B:107:0x0358->B:237:0x05fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:239:0x0622 A[EDGE_INSN: B:239:0x0622->B:241:0x0633 BREAK  A[LOOP:6: B:107:0x0358->B:237:0x05fa], PHI: r7 r8 r9 r18 r22 r26 r33 r36 r37 r38 r40 r43
  0x0622: PHI (r7v5 java.lang.String) = (r7v4 java.lang.String), (r7v7 java.lang.String) binds: [B:238:0x0612, B:235:0x05f5] A[DONT_GENERATE, DONT_INLINE]
  0x0622: PHI (r8v8 java.lang.String) = (r8v7 java.lang.String), (r8v11 java.lang.String) binds: [B:238:0x0612, B:235:0x05f5] A[DONT_GENERATE, DONT_INLINE]
  0x0622: PHI (r9v8 java.lang.String) = (r9v7 java.lang.String), (r9v10 java.lang.String) binds: [B:238:0x0612, B:235:0x05f5] A[DONT_GENERATE, DONT_INLINE]
  0x0622: PHI (r18v4 java.lang.String) = (r18v3 java.lang.String), (r18v5 java.lang.String) binds: [B:238:0x0612, B:235:0x05f5] A[DONT_GENERATE, DONT_INLINE]
  0x0622: PHI (r22v4 java.lang.String) = (r22v3 java.lang.String), (r22v5 java.lang.String) binds: [B:238:0x0612, B:235:0x05f5] A[DONT_GENERATE, DONT_INLINE]
  0x0622: PHI (r26v3 java.lang.String) = (r26v2 java.lang.String), (r26v4 java.lang.String) binds: [B:238:0x0612, B:235:0x05f5] A[DONT_GENERATE, DONT_INLINE]
  0x0622: PHI (r33v4 java.lang.String) = (r33v3 java.lang.String), (r33v5 java.lang.String) binds: [B:238:0x0612, B:235:0x05f5] A[DONT_GENERATE, DONT_INLINE]
  0x0622: PHI (r36v3 com.heytap.databaseengine.model.hrnewdaycard.HeartRateReadNewDayCard) = 
  (r36v2 com.heytap.databaseengine.model.hrnewdaycard.HeartRateReadNewDayCard)
  (r36v4 com.heytap.databaseengine.model.hrnewdaycard.HeartRateReadNewDayCard)
 binds: [B:238:0x0612, B:235:0x05f5] A[DONT_GENERATE, DONT_INLINE]
  0x0622: PHI (r37v3 java.lang.String) = (r37v2 java.lang.String), (r37v5 java.lang.String) binds: [B:238:0x0612, B:235:0x05f5] A[DONT_GENERATE, DONT_INLINE]
  0x0622: PHI (r38v3 long) = (r38v2 long), (r38v7 long) binds: [B:238:0x0612, B:235:0x05f5] A[DONT_GENERATE, DONT_INLINE]
  0x0622: PHI (r40v1 int) = (r40v0 int), (r40v2 int) binds: [B:238:0x0612, B:235:0x05f5] A[DONT_GENERATE, DONT_INLINE]
  0x0622: PHI (r43v3 long) = (r43v2 long), (r43v5 long) binds: [B:238:0x0612, B:235:0x05f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:243:0x0639  */
    /* JADX WARN: Code duplicated, block: B:244:0x0641  */
    /* JADX WARN: Code duplicated, block: B:248:0x064f  */
    /* JADX WARN: Code duplicated, block: B:250:0x0665  */
    /* JADX WARN: Code duplicated, block: B:294:0x05f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x066c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final List<h59> Y(long j2, long j3, List<HeartRateReadNewDayCard> list, boolean z, List<g59> list2, List<HeartRateWarning> list3, int i, List<SleepIndex> list4, List<SleepHeartRateStat> list5) {
        ZoneId zoneId;
        long j4;
        long j5;
        HeartRateReadNewDayCard heartRateReadNewDayCard;
        String str;
        String str2;
        String str3;
        long j6;
        long j7;
        int i2;
        long jG;
        int i3;
        float fC;
        int i4;
        Iterator<HeartRateWarning> it;
        long j8;
        boolean z2;
        HeartRateCardViewModel heartRateCardViewModel = this;
        String str4 = HeartRateDataStat.LOW_HR_WARN_MAX;
        String str5 = HeartRateDataStat.QUIET_HR_HIGH_TIME_END;
        String str6 = HeartRateDataStat.QUIET_HR_HIGH_TIME_START;
        String str7 = HeartRateDataStat.QUIET_HR_HIGH_MIN;
        String str8 = HeartRateDataStat.QUIET_HR_HIGH_MAX;
        Trace.beginSection("parseHeartRateDayData");
        gg8.c("HeartRateCardViewModel", "parseHeartRateDayData:" + q15.a(j2, "yyyy-MM-dd HH:mm:ss") + " endTime:" + q15.a(j3, "yyyy-MM-dd HH:mm:ss") + " tName is " + ThreadUtils.getName());
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        LocalDateTime localDateTimeAtStartOfDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), zoneIdSystemDefault).toLocalDate().atStartOfDay();
        long jAbs = Math.abs(LocalDateTime.ofInstant(Instant.ofEpochMilli(j3), zoneIdSystemDefault).toLocalDate().atStartOfDay().toLocalDate().toEpochDay() - localDateTimeAtStartOfDay.toLocalDate().toEpochDay()) + 1;
        gg8.c("HeartRateCardViewModel", "daysNum:" + jAbs + "/heartRateDataStatusBeanList:" + list2.size() + "/dayCardList:" + list.size());
        HeartRateReadNewDayCard heartRateReadNewDayCardX = heartRateCardViewModel.X(list);
        List<HeartRate> curveHalfAnHour = heartRateReadNewDayCardX.getCurveHalfAnHour();
        long j9 = z ? SauAarConstants.f : 1L;
        String str9 = HeartRateDataStat.LOW_HR_WARN_TIME_END;
        String str10 = HeartRateDataStat.LOW_HR_WARN_TIME_START;
        List<TimeStampedData> listC = k39.c(curveHalfAnHour, j9);
        ArrayList arrayList = new ArrayList();
        String str11 = HeartRateDataStat.LOW_HR_WARN_MIN;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            long j10 = i5;
            if (j10 >= jAbs) {
                gg8.a("HeartRateCardViewModel", "parseHeartRateDayData over");
                Trace.endSection();
                return arrayList;
            }
            long j11 = jAbs;
            h59 h59Var = new h59();
            String str12 = str4;
            long epochMilli = localDateTimeAtStartOfDay.plusDays(j10).withHour(0).withMinute(0).withSecond(0).withNano(0).atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
            int i10 = i5 + 1;
            String str13 = str5;
            String str14 = str6;
            long epochMilli2 = localDateTimeAtStartOfDay.plusDays(i10).withHour(0).withMinute(0).withSecond(0).withNano(0).atZone(zoneIdSystemDefault).toInstant().toEpochMilli() - 1000;
            h59Var.q(epochMilli, epochMilli2);
            int i11 = i6;
            while (true) {
                if (i11 >= list2.size()) {
                    localDateTimeAtStartOfDay = localDateTimeAtStartOfDay;
                    break;
                }
                g59 g59Var = list2.get(i11);
                long jK = g59Var.k();
                if (jK >= epochMilli && jK <= epochMilli2) {
                    g59Var.n(i);
                    h59Var.w(g59Var);
                }
                if (jK > epochMilli2) {
                    if (i11 <= 0) {
                        break;
                    }
                    i11--;
                    break;
                }
                i11++;
                localDateTimeAtStartOfDay = localDateTimeAtStartOfDay;
            }
            int i12 = i11;
            int i13 = 0;
            while (i13 < list3.size()) {
                HeartRateWarning heartRateWarning = list3.get(i13);
                long startTimestamp = heartRateWarning.getStartTimestamp();
                if (startTimestamp >= epochMilli && startTimestamp <= epochMilli2) {
                    g59 g59VarF = h59Var.f();
                    if (g59VarF == null) {
                        g59VarF = new g59();
                    }
                    g59 g59Var2 = g59VarF;
                    if (heartRateWarning.getWarningType() == 1) {
                        g59Var2.e().add(heartRateWarning);
                    } else if (heartRateWarning.getWarningType() == 2) {
                        g59Var2.d().add(heartRateWarning);
                    }
                    g59Var2.c().add(heartRateWarning);
                    h59Var.w(g59Var2);
                }
                i13++;
                str12 = str12;
            }
            String str15 = str12;
            g59 g59VarF2 = h59Var.f();
            if (g59VarF2 == null) {
                g59VarF2 = new g59();
            }
            if (g59VarF2.a() <= 0) {
                for (int i14 = 0; i14 < list4.size(); i14++) {
                    SleepIndex sleepIndex = list4.get(i14);
                    long dataTimestamp = sleepIndex.getDataTimestamp();
                    if (dataTimestamp >= epochMilli && dataTimestamp <= epochMilli2) {
                        g59VarF2.m(gmk.b(sleepIndex.getAvgSleepHeartRate()));
                    }
                }
            }
            h59Var.w(g59VarF2);
            ArrayList arrayList2 = new ArrayList();
            if (!w0b.a(listC)) {
                h59Var.x(listC.get(listC.size() - 1));
                int i15 = i7;
                float f = 0.0f;
                while (true) {
                    if (i15 < listC.size()) {
                        TimeStampedData timeStampedData = listC.get(i15);
                        if (timeStampedData.getTimestamp() < epochMilli || timeStampedData.getTimestamp() > epochMilli2) {
                            listC = listC;
                            zoneId = zoneIdSystemDefault;
                        } else {
                            arrayList2.add(timeStampedData);
                            if (timeStampedData.getY() > f) {
                                float y = timeStampedData.getY();
                                h59Var.z(y);
                                z2 = true;
                                h59Var.y(arrayList2.size() - 1);
                                f = y;
                            } else {
                                z2 = true;
                            }
                            zoneId = zoneIdSystemDefault;
                            if (timeStampedData.getHeartRateType() != 7) {
                                h59Var.v(z2);
                            }
                        }
                        if (timeStampedData.getTimestamp() > epochMilli2) {
                            if (i15 > 0) {
                                i7 = i15 - 1;
                                break;
                            }
                        } else {
                            i15++;
                            listC = listC;
                            zoneIdSystemDefault = zoneId;
                        }
                    } else {
                        listC = listC;
                        zoneId = zoneIdSystemDefault;
                    }
                    i7 = i15;
                    break;
                }
            }
            listC = listC;
            zoneId = zoneIdSystemDefault;
            if (arrayList2.size() <= 0) {
                h59Var.p(epochMilli, epochMilli2);
            } else {
                h59Var.J(arrayList2);
            }
            ArrayList arrayList3 = new ArrayList();
            List<HeartRate> restHR = heartRateReadNewDayCardX.getRestHR();
            if (!w0b.a(restHR)) {
                int i16 = i8;
                while (true) {
                    if (i16 < restHR.size()) {
                        HeartRate heartRate = restHR.get(i16);
                        if (heartRate.getDataCreatedTimestamp() >= epochMilli && heartRate.getDataCreatedTimestamp() <= epochMilli2) {
                            TimeStampedData timeStampedData2 = new TimeStampedData();
                            timeStampedData2.setTimestamp(heartRate.getDataCreatedTimestamp());
                            timeStampedData2.setY(heartRate.getHeartRateValue());
                            timeStampedData2.setHeartRateType(heartRate.getHeartRateType());
                            arrayList3.add(timeStampedData2);
                        }
                        if (heartRate.getDataCreatedTimestamp() > epochMilli2) {
                            if (i16 > 0) {
                                i8 = i16 - 1;
                                break;
                            }
                        } else {
                            i16++;
                            str7 = str7;
                            str8 = str8;
                        }
                    } else {
                        str7 = str7;
                        str8 = str8;
                    }
                    i8 = i16;
                    break;
                }
            }
            str7 = str7;
            str8 = str8;
            h59Var.G(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            List<HeartRateDataStat> histogramHalfAnHour = heartRateReadNewDayCardX.getHistogramHalfAnHour();
            if (!w0b.a(histogramHalfAnHour)) {
                float f2 = 210.0f;
                int i17 = i9;
                float f3 = 0.0f;
                float f4 = 0.0f;
                float f5 = 0.0f;
                float f6 = 0.0f;
                while (true) {
                    if (i17 < histogramHalfAnHour.size()) {
                        HeartRateDataStat heartRateDataStat = histogramHalfAnHour.get(i17);
                        List<HeartRateDataStat> list6 = histogramHalfAnHour;
                        heartRateReadNewDayCard = heartRateReadNewDayCardX;
                        str = str7;
                        long jA0 = heartRateCardViewModel.a0(((long) heartRateDataStat.getDate()) * 1000);
                        float f7 = f2;
                        i3 = i17;
                        long j12 = jA0 + aq6.CDP_MIN_MANUAL_SYNC_TIME_INTERVAL;
                        if (jA0 < epochMilli || jA0 > epochMilli2) {
                            j4 = epochMilli;
                            j5 = epochMilli2;
                            str2 = str10;
                            str3 = str13;
                            str6 = str14;
                            fC = f7;
                        } else {
                            e3k e3kVar = new e3k();
                            e3kVar.v(jA0);
                            e3kVar.i(j12);
                            j4 = epochMilli;
                            e3kVar.j(heartRateDataStat.getMaxHeartRate());
                            e3kVar.k(heartRateDataStat.getMinHeartRate());
                            if (h59Var.f() != null) {
                                g59 g59VarF3 = h59Var.f();
                                Iterator<HeartRateWarning> it2 = g59VarF3.d().iterator();
                                while (it2.hasNext()) {
                                    HeartRateWarning next = it2.next();
                                    if (next.getEndTimestamp() <= jA0 || next.getEndTimestamp() >= j12) {
                                        it = it2;
                                        j8 = epochMilli2;
                                    } else {
                                        it = it2;
                                        j8 = epochMilli2;
                                        if (next.getWarningType() == 2) {
                                            e3kVar.n(next.getMaxHeartRate());
                                            e3kVar.p(next.getMinHeartRate());
                                            e3kVar.r(next.getStartTimestamp());
                                            e3kVar.l(next.getEndTimestamp());
                                            e3kVar.t(next.getWarningHeartRateType());
                                        }
                                    }
                                    it2 = it;
                                    epochMilli2 = j8;
                                }
                                j5 = epochMilli2;
                                for (HeartRateWarning heartRateWarning2 : g59VarF3.e()) {
                                    if (heartRateWarning2.getEndTimestamp() > jA0 && heartRateWarning2.getEndTimestamp() < j12 && heartRateWarning2.getWarningType() == 1) {
                                        e3kVar.o(heartRateWarning2.getMaxHeartRate());
                                        e3kVar.q(heartRateWarning2.getMinHeartRate());
                                        e3kVar.s(heartRateWarning2.getStartTimestamp());
                                        e3kVar.m(heartRateWarning2.getEndTimestamp());
                                        e3kVar.u(heartRateWarning2.getWarningHeartRateType());
                                    }
                                }
                            } else {
                                j5 = epochMilli2;
                            }
                            String metadata = heartRateDataStat.getMetadata();
                            if (TextUtils.isEmpty(metadata)) {
                                str2 = str10;
                                str3 = str13;
                                str6 = str14;
                            } else {
                                try {
                                    JSONObject jSONObject = new JSONObject(metadata);
                                    String str16 = str8;
                                    try {
                                        if (jSONObject.has(str16)) {
                                            e3kVar.n(jSONObject.getInt(str16));
                                        }
                                        try {
                                            if (jSONObject.has(str)) {
                                                e3kVar.p(jSONObject.getInt(str));
                                            }
                                            str6 = str14;
                                            try {
                                                if (jSONObject.has(str6)) {
                                                    e3kVar.r(((long) jSONObject.getInt(str6)) * 1000);
                                                }
                                                str3 = str13;
                                                try {
                                                    if (jSONObject.has(str3)) {
                                                        str8 = str16;
                                                        str = str;
                                                        try {
                                                            e3kVar.l(((long) jSONObject.getInt(str3)) * 1000);
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            str2 = str10;
                                                            gg8.b("HeartRateCardViewModel", e.toString());
                                                            arrayList4.add(e3kVar);
                                                            if (e3kVar.b() > f3) {
                                                                float fB = e3kVar.b();
                                                                h59Var.t(fB);
                                                                h59Var.s(arrayList4.size() - 1);
                                                                f3 = fB;
                                                            }
                                                            if (e3kVar.c() < f7) {
                                                                fC = e3kVar.c();
                                                                h59Var.u(fC);
                                                            } else {
                                                                fC = f7;
                                                            }
                                                            if (e3kVar.d() > f4) {
                                                                float fD = e3kVar.d();
                                                                h59Var.E(fD);
                                                                i4 = 1;
                                                                h59Var.F(arrayList4.size() - 1);
                                                                f4 = fD;
                                                            } else {
                                                                i4 = 1;
                                                            }
                                                            if (e3kVar.e() > f5) {
                                                                float fE = e3kVar.e();
                                                                h59Var.A(fE);
                                                                h59Var.B(arrayList4.size() - i4);
                                                                f5 = fE;
                                                            }
                                                            if (e3kVar.g() <= 0.0f) {
                                                            }
                                                            if (jA0 > j5) {
                                                                if (i3 > 0) {
                                                                    i9 = i3;
                                                                    break;
                                                                }
                                                                i9 = i3 - 1;
                                                                break;
                                                                if (arrayList4.size() <= 0) {
                                                                    j6 = j4;
                                                                    j7 = j5;
                                                                    h59Var.o(j6, j7);
                                                                } else {
                                                                    j6 = j4;
                                                                    j7 = j5;
                                                                    h59Var.I(arrayList4);
                                                                }
                                                                for (i2 = 0; i2 < list5.size(); i2++) {
                                                                    SleepHeartRateStat sleepHeartRateStat = list5.get(i2);
                                                                    jG = pr8.INSTANCE.g(sleepHeartRateStat.getDate());
                                                                    if (jG < j6) {
                                                                    }
                                                                }
                                                                arrayList.add(h59Var);
                                                                heartRateCardViewModel = this;
                                                                jAbs = j11;
                                                                i5 = i10;
                                                                str5 = str3;
                                                                str10 = str2;
                                                                localDateTimeAtStartOfDay = localDateTimeAtStartOfDay;
                                                                str4 = str15;
                                                                listC = listC;
                                                                zoneIdSystemDefault = zoneId;
                                                                str8 = str8;
                                                                heartRateReadNewDayCardX = heartRateReadNewDayCard;
                                                                str7 = str;
                                                                i6 = i12;
                                                            } else {
                                                                str14 = str6;
                                                                str13 = str3;
                                                                str10 = str2;
                                                                histogramHalfAnHour = list6;
                                                                heartRateReadNewDayCardX = heartRateReadNewDayCard;
                                                                str7 = str;
                                                                epochMilli = j4;
                                                                epochMilli2 = j5;
                                                                f2 = fC;
                                                                i17 = i3 + 1;
                                                                heartRateCardViewModel = this;
                                                            }
                                                        }
                                                    } else {
                                                        str8 = str16;
                                                        str = str;
                                                    }
                                                    String str17 = str15;
                                                    try {
                                                        if (jSONObject.has(str17)) {
                                                            e3kVar.o(jSONObject.getInt(str17));
                                                        }
                                                        String str18 = str11;
                                                        try {
                                                            if (jSONObject.has(str18)) {
                                                                e3kVar.q(jSONObject.getInt(str18));
                                                            }
                                                            str2 = str10;
                                                            try {
                                                                if (jSONObject.has(str2)) {
                                                                    str15 = str17;
                                                                    str11 = str18;
                                                                    try {
                                                                        e3kVar.s(((long) jSONObject.getInt(str2)) * 1000);
                                                                    } catch (Exception e3) {
                                                                        e = e3;
                                                                        gg8.b("HeartRateCardViewModel", e.toString());
                                                                        arrayList4.add(e3kVar);
                                                                        if (e3kVar.b() > f3) {
                                                                            float fB2 = e3kVar.b();
                                                                            h59Var.t(fB2);
                                                                            h59Var.s(arrayList4.size() - 1);
                                                                            f3 = fB2;
                                                                        }
                                                                        if (e3kVar.c() < f7) {
                                                                            fC = e3kVar.c();
                                                                            h59Var.u(fC);
                                                                        } else {
                                                                            fC = f7;
                                                                        }
                                                                        if (e3kVar.d() > f4) {
                                                                            float fD2 = e3kVar.d();
                                                                            h59Var.E(fD2);
                                                                            i4 = 1;
                                                                            h59Var.F(arrayList4.size() - 1);
                                                                            f4 = fD2;
                                                                        } else {
                                                                            i4 = 1;
                                                                        }
                                                                        if (e3kVar.e() > f5) {
                                                                            float fE2 = e3kVar.e();
                                                                            h59Var.A(fE2);
                                                                            h59Var.B(arrayList4.size() - i4);
                                                                            f5 = fE2;
                                                                        }
                                                                        if (e3kVar.g() <= 0.0f) {
                                                                        }
                                                                        if (jA0 > j5) {
                                                                            if (i3 > 0) {
                                                                                i9 = i3;
                                                                                break;
                                                                            }
                                                                            i9 = i3 - 1;
                                                                            break;
                                                                            if (arrayList4.size() <= 0) {
                                                                                j6 = j4;
                                                                                j7 = j5;
                                                                                h59Var.o(j6, j7);
                                                                            } else {
                                                                                j6 = j4;
                                                                                j7 = j5;
                                                                                h59Var.I(arrayList4);
                                                                            }
                                                                            while (i2 < list5.size()) {
                                                                                SleepHeartRateStat sleepHeartRateStat2 = list5.get(i2);
                                                                                jG = pr8.INSTANCE.g(sleepHeartRateStat2.getDate());
                                                                                if (jG < j6) {
                                                                                }
                                                                            }
                                                                            arrayList.add(h59Var);
                                                                            heartRateCardViewModel = this;
                                                                            jAbs = j11;
                                                                            i5 = i10;
                                                                            str5 = str3;
                                                                            str10 = str2;
                                                                            localDateTimeAtStartOfDay = localDateTimeAtStartOfDay;
                                                                            str4 = str15;
                                                                            listC = listC;
                                                                            zoneIdSystemDefault = zoneId;
                                                                            str8 = str8;
                                                                            heartRateReadNewDayCardX = heartRateReadNewDayCard;
                                                                            str7 = str;
                                                                            i6 = i12;
                                                                        } else {
                                                                            str14 = str6;
                                                                            str13 = str3;
                                                                            str10 = str2;
                                                                            histogramHalfAnHour = list6;
                                                                            heartRateReadNewDayCardX = heartRateReadNewDayCard;
                                                                            str7 = str;
                                                                            epochMilli = j4;
                                                                            epochMilli2 = j5;
                                                                            f2 = fC;
                                                                            i17 = i3 + 1;
                                                                            heartRateCardViewModel = this;
                                                                        }
                                                                    }
                                                                } else {
                                                                    str15 = str17;
                                                                    str11 = str18;
                                                                }
                                                                String str19 = str9;
                                                                try {
                                                                    if (jSONObject.has(str19)) {
                                                                        str9 = str19;
                                                                        e3kVar.m(((long) jSONObject.getInt(str19)) * 1000);
                                                                    } else {
                                                                        str9 = str19;
                                                                    }
                                                                } catch (Exception e4) {
                                                                    e = e4;
                                                                    str9 = str19;
                                                                    gg8.b("HeartRateCardViewModel", e.toString());
                                                                }
                                                            } catch (Exception e5) {
                                                                e = e5;
                                                                str15 = str17;
                                                                str11 = str18;
                                                            }
                                                        } catch (Exception e6) {
                                                            e = e6;
                                                            str15 = str17;
                                                            str11 = str18;
                                                            str2 = str10;
                                                            gg8.b("HeartRateCardViewModel", e.toString());
                                                            arrayList4.add(e3kVar);
                                                            if (e3kVar.b() > f3) {
                                                                float fB3 = e3kVar.b();
                                                                h59Var.t(fB3);
                                                                h59Var.s(arrayList4.size() - 1);
                                                                f3 = fB3;
                                                            }
                                                            if (e3kVar.c() < f7) {
                                                                fC = e3kVar.c();
                                                                h59Var.u(fC);
                                                            } else {
                                                                fC = f7;
                                                            }
                                                            if (e3kVar.d() > f4) {
                                                                float fD3 = e3kVar.d();
                                                                h59Var.E(fD3);
                                                                i4 = 1;
                                                                h59Var.F(arrayList4.size() - 1);
                                                                f4 = fD3;
                                                            } else {
                                                                i4 = 1;
                                                            }
                                                            if (e3kVar.e() > f5) {
                                                                float fE3 = e3kVar.e();
                                                                h59Var.A(fE3);
                                                                h59Var.B(arrayList4.size() - i4);
                                                                f5 = fE3;
                                                            }
                                                            if (e3kVar.g() <= 0.0f) {
                                                            }
                                                            if (jA0 > j5) {
                                                                if (i3 > 0) {
                                                                    i9 = i3;
                                                                    break;
                                                                }
                                                                i9 = i3 - 1;
                                                                break;
                                                                if (arrayList4.size() <= 0) {
                                                                    j6 = j4;
                                                                    j7 = j5;
                                                                    h59Var.o(j6, j7);
                                                                } else {
                                                                    j6 = j4;
                                                                    j7 = j5;
                                                                    h59Var.I(arrayList4);
                                                                }
                                                                while (i2 < list5.size()) {
                                                                    SleepHeartRateStat sleepHeartRateStat3 = list5.get(i2);
                                                                    jG = pr8.INSTANCE.g(sleepHeartRateStat3.getDate());
                                                                    if (jG < j6) {
                                                                    }
                                                                }
                                                                arrayList.add(h59Var);
                                                                heartRateCardViewModel = this;
                                                                jAbs = j11;
                                                                i5 = i10;
                                                                str5 = str3;
                                                                str10 = str2;
                                                                localDateTimeAtStartOfDay = localDateTimeAtStartOfDay;
                                                                str4 = str15;
                                                                listC = listC;
                                                                zoneIdSystemDefault = zoneId;
                                                                str8 = str8;
                                                                heartRateReadNewDayCardX = heartRateReadNewDayCard;
                                                                str7 = str;
                                                                i6 = i12;
                                                            } else {
                                                                str14 = str6;
                                                                str13 = str3;
                                                                str10 = str2;
                                                                histogramHalfAnHour = list6;
                                                                heartRateReadNewDayCardX = heartRateReadNewDayCard;
                                                                str7 = str;
                                                                epochMilli = j4;
                                                                epochMilli2 = j5;
                                                                f2 = fC;
                                                                i17 = i3 + 1;
                                                                heartRateCardViewModel = this;
                                                            }
                                                        }
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                        str15 = str17;
                                                    }
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    str8 = str16;
                                                    str = str;
                                                }
                                            } catch (Exception e9) {
                                                e = e9;
                                                str8 = str16;
                                                str = str;
                                                str2 = str10;
                                                str3 = str13;
                                            }
                                        } catch (Exception e10) {
                                            e = e10;
                                            str8 = str16;
                                            str = str;
                                            str2 = str10;
                                            str3 = str13;
                                            str6 = str14;
                                            gg8.b("HeartRateCardViewModel", e.toString());
                                            arrayList4.add(e3kVar);
                                            if (e3kVar.b() > f3) {
                                                float fB4 = e3kVar.b();
                                                h59Var.t(fB4);
                                                h59Var.s(arrayList4.size() - 1);
                                                f3 = fB4;
                                            }
                                            if (e3kVar.c() < f7) {
                                                fC = e3kVar.c();
                                                h59Var.u(fC);
                                            } else {
                                                fC = f7;
                                            }
                                            if (e3kVar.d() > f4) {
                                                float fD4 = e3kVar.d();
                                                h59Var.E(fD4);
                                                i4 = 1;
                                                h59Var.F(arrayList4.size() - 1);
                                                f4 = fD4;
                                            } else {
                                                i4 = 1;
                                            }
                                            if (e3kVar.e() > f5) {
                                                float fE4 = e3kVar.e();
                                                h59Var.A(fE4);
                                                h59Var.B(arrayList4.size() - i4);
                                                f5 = fE4;
                                            }
                                            if (e3kVar.g() <= 0.0f) {
                                            }
                                            if (jA0 > j5) {
                                                if (i3 > 0) {
                                                    i9 = i3;
                                                    break;
                                                }
                                                i9 = i3 - 1;
                                                break;
                                                if (arrayList4.size() <= 0) {
                                                    j6 = j4;
                                                    j7 = j5;
                                                    h59Var.o(j6, j7);
                                                } else {
                                                    j6 = j4;
                                                    j7 = j5;
                                                    h59Var.I(arrayList4);
                                                }
                                                while (i2 < list5.size()) {
                                                    SleepHeartRateStat sleepHeartRateStat4 = list5.get(i2);
                                                    jG = pr8.INSTANCE.g(sleepHeartRateStat4.getDate());
                                                    if (jG < j6) {
                                                    }
                                                }
                                                arrayList.add(h59Var);
                                                heartRateCardViewModel = this;
                                                jAbs = j11;
                                                i5 = i10;
                                                str5 = str3;
                                                str10 = str2;
                                                localDateTimeAtStartOfDay = localDateTimeAtStartOfDay;
                                                str4 = str15;
                                                listC = listC;
                                                zoneIdSystemDefault = zoneId;
                                                str8 = str8;
                                                heartRateReadNewDayCardX = heartRateReadNewDayCard;
                                                str7 = str;
                                                i6 = i12;
                                            } else {
                                                str14 = str6;
                                                str13 = str3;
                                                str10 = str2;
                                                histogramHalfAnHour = list6;
                                                heartRateReadNewDayCardX = heartRateReadNewDayCard;
                                                str7 = str;
                                                epochMilli = j4;
                                                epochMilli2 = j5;
                                                f2 = fC;
                                                i17 = i3 + 1;
                                                heartRateCardViewModel = this;
                                            }
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        str8 = str16;
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                }
                            }
                            arrayList4.add(e3kVar);
                            if (e3kVar.b() > f3) {
                                float fB5 = e3kVar.b();
                                h59Var.t(fB5);
                                h59Var.s(arrayList4.size() - 1);
                                f3 = fB5;
                            }
                            if (e3kVar.c() < f7) {
                                fC = e3kVar.c();
                                h59Var.u(fC);
                            } else {
                                fC = f7;
                            }
                            if (e3kVar.d() > f4) {
                                float fD5 = e3kVar.d();
                                h59Var.E(fD5);
                                i4 = 1;
                                h59Var.F(arrayList4.size() - 1);
                                f4 = fD5;
                            } else {
                                i4 = 1;
                            }
                            if (e3kVar.e() > f5) {
                                float fE5 = e3kVar.e();
                                h59Var.A(fE5);
                                h59Var.B(arrayList4.size() - i4);
                                f5 = fE5;
                            }
                            if (e3kVar.g() <= 0.0f && (e3kVar.g() < f6 || f6 == 0.0f)) {
                                float fG = e3kVar.g();
                                h59Var.C(fG);
                                h59Var.D(arrayList4.size() - 1);
                                f6 = fG;
                            }
                        }
                        if (jA0 > j5) {
                            if (i3 > 0) {
                                i9 = i3 - 1;
                                break;
                            }
                        } else {
                            str14 = str6;
                            str13 = str3;
                            str10 = str2;
                            histogramHalfAnHour = list6;
                            heartRateReadNewDayCardX = heartRateReadNewDayCard;
                            str7 = str;
                            epochMilli = j4;
                            epochMilli2 = j5;
                            f2 = fC;
                            i17 = i3 + 1;
                            heartRateCardViewModel = this;
                        }
                    } else {
                        j4 = epochMilli;
                        j5 = epochMilli2;
                        i3 = i17;
                        heartRateReadNewDayCard = heartRateReadNewDayCardX;
                        str = str7;
                        str2 = str10;
                        str3 = str13;
                        str6 = str14;
                    }
                    i9 = i3;
                    break;
                }
            }
            j4 = epochMilli;
            j5 = epochMilli2;
            heartRateReadNewDayCard = heartRateReadNewDayCardX;
            str = str7;
            str2 = str10;
            str3 = str13;
            str6 = str14;
            if (arrayList4.size() <= 0) {
                j6 = j4;
                j7 = j5;
                h59Var.o(j6, j7);
            } else {
                j6 = j4;
                j7 = j5;
                h59Var.I(arrayList4);
            }
            while (i2 < list5.size()) {
                SleepHeartRateStat sleepHeartRateStat5 = list5.get(i2);
                jG = pr8.INSTANCE.g(sleepHeartRateStat5.getDate());
                if (jG < j6 && jG <= j7) {
                    h59Var.H(sleepHeartRateStat5);
                }
            }
            arrayList.add(h59Var);
            heartRateCardViewModel = this;
            jAbs = j11;
            i5 = i10;
            str5 = str3;
            str10 = str2;
            localDateTimeAtStartOfDay = localDateTimeAtStartOfDay;
            str4 = str15;
            listC = listC;
            zoneIdSystemDefault = zoneId;
            str8 = str8;
            heartRateReadNewDayCardX = heartRateReadNewDayCard;
            str7 = str;
            i6 = i12;
        }
    }

    public void Z(@NonNull String str) {
        this.f5752j.U(str);
    }

    public final long a0(long j2) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), zoneIdSystemDefault);
        int minute = localDateTimeOfInstant.getMinute();
        int i = 30;
        if (minute >= 0 && minute < 30) {
            i = 0;
        }
        return localDateTimeOfInstant.withMinute(i).withSecond(0).withNano(0).atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
    }
}