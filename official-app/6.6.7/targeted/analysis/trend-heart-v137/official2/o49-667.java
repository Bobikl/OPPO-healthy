package com.oplus.aiunit.vision;

import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.HeartRate;
import com.heytap.databaseengine.model.HeartRateDataStat;
import com.heytap.databaseengine.model.HeartRateWarning;
import com.heytap.databaseengine.model.SleepIndex;
import com.heytap.databaseengine.model.hrnewdaycard.HeartRateReadNewDayCard;
import com.heytap.databaseengine.model.newsleep.SleepHeartRateStat;
import com.heytap.databaseengine.option.DataReadOption;
import com.oplus.onet.IONetService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class o49 {
    public String a = cn.c().getSsoid();

    public static /* synthetic */ List A(Throwable th) throws Throwable {
        m8b.f("HeartRateCardRepository", "fetchHeartRateHistoryStatData error:" + th.getMessage());
        return new ArrayList();
    }

    public static /* synthetic */ List B(CommonBackBean commonBackBean) throws Throwable {
        gg8.c("HeartRateCardRepository", "fetchHeartRateLineData, errorCode is ：" + commonBackBean.getErrorCode());
        List<HeartRateReadNewDayCard> arrayList = (List) commonBackBean.getObj();
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        for (HeartRateReadNewDayCard heartRateReadNewDayCard : arrayList) {
            int size = 0;
            int size2 = heartRateReadNewDayCard.getCurveHalfAnHour() != null ? heartRateReadNewDayCard.getCurveHalfAnHour().size() : 0;
            int size3 = heartRateReadNewDayCard.getHistogramHalfAnHour() != null ? heartRateReadNewDayCard.getHistogramHalfAnHour().size() : 0;
            if (heartRateReadNewDayCard.getRestHR() != null) {
                size = heartRateReadNewDayCard.getRestHR().size();
            }
            gg8.c("HeartRateCardRepository", "fetchHeartRateLineData size:" + size2 + "/" + size3 + "/" + size);
        }
        return arrayList;
    }

    public static /* synthetic */ List C(Throwable th) throws Throwable {
        return new ArrayList();
    }

    public static /* synthetic */ List D(CommonBackBean commonBackBean) throws Throwable {
        gg8.c("HeartRateCardRepository", "fetchHeartRateLineData2, errorCode is ：" + commonBackBean.getErrorCode());
        List arrayList = (List) commonBackBean.getObj();
        if (w0b.a(arrayList)) {
            arrayList = new ArrayList();
        }
        if (arrayList.size() > 0) {
            HeartRate heartRate = (HeartRate) arrayList.get(0);
            gg8.c("HeartRateCardRepository", "fetchHeartRateLineData2 ：" + heartRate.getHeartRateValue() + "/" + heartRate.getHeartRateType() + "/" + heartRate.getDataCreatedTimestamp());
        }
        return arrayList;
    }

    public static /* synthetic */ List E(Throwable th) throws Throwable {
        return new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    public static /* synthetic */ Long F(CommonBackBean commonBackBean) throws Throwable {
        long jLongValue;
        if (commonBackBean.getObj() != null) {
            List list = (List) commonBackBean.getObj();
            if (list.isEmpty()) {
                jLongValue = 0;
            } else {
                jLongValue = ((Long) list.get(0)).longValue();
            }
        } else {
            jLongValue = 0;
        }
        m8b.f("HeartRateCardRepository", "fetchHeartRateWarnCount end:" + jLongValue);
        return Long.valueOf(jLongValue);
    }

    public static /* synthetic */ Long G(Throwable th) throws Throwable {
        return 0L;
    }

    public static /* synthetic */ List H(CommonBackBean commonBackBean) throws Throwable {
        List arrayList = new ArrayList();
        if (commonBackBean.getObj() != null) {
            arrayList = (List) commonBackBean.getObj();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("fetchHeartRateWarning end：");
        sb.append(arrayList.size());
        return arrayList;
    }

    public static /* synthetic */ List I(Throwable th) throws Throwable {
        return new ArrayList();
    }

    public static /* synthetic */ List J(int i, CommonBackBean commonBackBean) throws Throwable {
        List<? extends SleepIndex> arrayList = new ArrayList<>();
        if (commonBackBean.getErrorCode() == 0 && commonBackBean.getObj() != null) {
            arrayList = (List) commonBackBean.getObj();
        }
        m8b.f("HeartRateCardRepository", "getSleepIndex result size:" + arrayList.size() + "/" + commonBackBean.getErrorCode());
        return 4 == i ? new onh().c(arrayList) : arrayList;
    }

    public static /* synthetic */ List K(Throwable th) throws Throwable {
        m8b.f("HeartRateCardRepository", "getSleepIndex error:" + th.getMessage());
        return new ArrayList();
    }

    public static /* synthetic */ List L(CommonBackBean commonBackBean) throws Throwable {
        gg8.c("HeartRateCardRepository", "queryLastHeartRate, errorCode is ：" + commonBackBean.getErrorCode());
        List arrayList = (List) commonBackBean.getObj();
        if (w0b.a(arrayList)) {
            arrayList = new ArrayList();
        }
        if (arrayList.size() > 0) {
            HeartRate heartRate = (HeartRate) arrayList.get(0);
            gg8.c("HeartRateCardRepository", "queryLastHeartRate ：" + heartRate.getHeartRateValue() + "/" + heartRate.getHeartRateType() + "/" + heartRate.getDataCreatedTimestamp());
        }
        return arrayList;
    }

    public static /* synthetic */ List M(Throwable th) throws Throwable {
        return new ArrayList();
    }

    public static /* synthetic */ List N(CommonBackBean commonBackBean) throws Throwable {
        List arrayList = new ArrayList();
        if (commonBackBean.getObj() != null) {
            arrayList = (List) commonBackBean.getObj();
        }
        gg8.c("HeartRateCardRepository", "queryLastHeartRateStat ：" + arrayList.size());
        return arrayList;
    }

    public static /* synthetic */ List O(Throwable th) throws Throwable {
        return new ArrayList();
    }

    public static /* synthetic */ List P(CommonBackBean commonBackBean) throws Throwable {
        List arrayList = new ArrayList();
        if (commonBackBean.getErrorCode() == 0 && commonBackBean.getObj() != null) {
            arrayList = (List) commonBackBean.getObj();
        }
        m8b.f("HeartRateCardRepository", "querySleepHRStatList result size:" + arrayList.size() + "/" + commonBackBean.getErrorCode());
        return arrayList;
    }

    public static /* synthetic */ List Q(Throwable th) throws Throwable {
        m8b.f("HeartRateCardRepository", "querySleepHRStatList error:" + th.getMessage());
        return new ArrayList();
    }

    public static /* synthetic */ List z(int i, boolean z, CommonBackBean commonBackBean) throws Throwable {
        gg8.c("HeartRateCardRepository", "fetchHeartRateHistoryStatData end： errorCode " + commonBackBean.getErrorCode());
        List<HeartRateDataStat> arrayList = new ArrayList();
        if (commonBackBean.getObj() != null) {
            arrayList = (List) commonBackBean.getObj();
        }
        ArrayList arrayList2 = new ArrayList();
        for (HeartRateDataStat heartRateDataStat : arrayList) {
            g59 g59Var = new g59(heartRateDataStat);
            arrayList2.add(g59Var);
            if (8 == i) {
                StringBuilder sb = new StringBuilder();
                sb.append("type:");
                sb.append(i);
                sb.append("item:");
                sb.append(g59Var);
            }
            if (z) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("HeartRateStat item:");
                sb2.append(heartRateDataStat);
            }
        }
        if (i == 4) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("fetchHeartRateHistoryStatData:");
            sb3.append(arrayList2.size());
            sb3.append("type:");
            sb3.append(i);
        } else if (i == 6) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("fetchHeartRateHistoryStatData:");
            sb4.append(arrayList2.size());
            sb4.append("type:");
            sb4.append(i);
        }
        return arrayList2;
    }

    public ddd<List<HeartRate>> R() {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.a);
        dataReadOption.setCount(1);
        dataReadOption.setDataTable(1008);
        dataReadOption.setDataReadType("one_day_or_one_data");
        dataReadOption.setSortOrder(1);
        return SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.k49
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return o49.L((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.l49
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return o49.M((Throwable) obj);
            }
        });
    }

    public ddd<List<HeartRateDataStat>> S() {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.a);
        dataReadOption.setCount(1);
        dataReadOption.setStartTime(1546272000000L);
        dataReadOption.setEndTime(System.currentTimeMillis());
        dataReadOption.setDataTable(1009);
        dataReadOption.setGroupUnitType(4);
        dataReadOption.setSortOrder(1);
        return SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.i49
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return o49.N((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.j49
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return o49.O((Throwable) obj);
            }
        });
    }

    public ddd<List<SleepHeartRateStat>> T(long j2, long j3, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("querySleepHRStatList: start:");
        sb.append(j2);
        sb.append(" endTime = ");
        sb.append(j3);
        if (j2 < 1546257600000L) {
            j2 = 1546257600000L;
        }
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.a);
        dataReadOption.setDataTable(1071);
        dataReadOption.setStartTime(j2);
        dataReadOption.setEndTime(j3);
        dataReadOption.setGroupUnitType(i);
        dataReadOption.setSortOrder(0);
        pr8 pr8Var = pr8.INSTANCE;
        if (pr8Var.e(j3) >= pr8Var.e(System.currentTimeMillis())) {
            dataReadOption.setIsParse(2);
        }
        return SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.d49
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return o49.P((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.e49
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return o49.Q((Throwable) obj);
            }
        });
    }

    public void U(String str) {
        this.a = str;
    }

    public ddd<List<g59>> s(long j2, long j3, int i) {
        return t(j2, j3, i, false);
    }

    public ddd<List<g59>> t(long j2, long j3, final int i, final boolean z) {
        if (j2 < 1546272000000L) {
            j2 = 1546272000000L;
        }
        gg8.c("HeartRateCardRepository", "fetchHeartRateHistoryStatData begin");
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.a);
        dataReadOption.setStartTime(j2);
        dataReadOption.setEndTime(j3);
        dataReadOption.setDataTable(1009);
        dataReadOption.setGroupUnitType(i);
        dataReadOption.setSortOrder(0);
        if (o15.i(System.currentTimeMillis()) <= o15.i(j3)) {
            dataReadOption.setIsParse(2);
        }
        return SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.g49
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return o49.z(i, z, (CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.h49
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return o49.A((Throwable) obj);
            }
        });
    }

    public ddd<List<HeartRateReadNewDayCard>> u(long j2, long j3, int i) {
        if (j2 < 1546272000000L) {
            j2 = 1546272000000L;
        }
        gg8.c("HeartRateCardRepository", "fetchHeartRateLineData begin");
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.a);
        dataReadOption.setStartTime(j2);
        dataReadOption.setAggregateType(105);
        dataReadOption.setEndTime(j3);
        dataReadOption.setSortOrder(0);
        if (o15.i(System.currentTimeMillis()) <= o15.i(j3)) {
            dataReadOption.setIsParse(2);
        }
        if (i > 0) {
            dataReadOption.setCount(i);
        }
        dataReadOption.setDataTable(1008);
        return SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.x39
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return o49.B((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.y39
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return o49.C((Throwable) obj);
            }
        });
    }

    public ddd<List<HeartRate>> v(long j2, long j3, int i) {
        if (j2 < 1546272000000L) {
            j2 = 1546272000000L;
        }
        gg8.c("HeartRateCardRepository", "fetchHeartRateLineData2 begin");
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.a);
        dataReadOption.setStartTime(j2);
        dataReadOption.setEndTime(j3);
        dataReadOption.setSortOrder(0);
        if (i > 0) {
            dataReadOption.setCount(i);
        }
        dataReadOption.setDataTable(1008);
        return SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.b49
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return o49.D((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.c49
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return o49.E((Throwable) obj);
            }
        });
    }

    public ddd<Long> w(long j2, long j3) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.a);
        dataReadOption.setStartTime(j2);
        dataReadOption.setEndTime(j3);
        dataReadOption.setDataTable(1019);
        dataReadOption.setSortOrder(1);
        dataReadOption.setDataReadType("number_of_warnings");
        if (o15.i(System.currentTimeMillis()) <= o15.i(j3)) {
            dataReadOption.setIsParse(2);
        }
        return SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.z39
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return o49.F((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.a49
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return o49.G((Throwable) obj);
            }
        });
    }

    public ddd<List<HeartRateWarning>> x(long j2, long j3, int i) {
        if (j2 < 1546272000000L) {
            j2 = 1546272000000L;
        }
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.a);
        dataReadOption.setStartTime(j2);
        dataReadOption.setEndTime(j3);
        dataReadOption.setCount(i);
        dataReadOption.setDataTable(1019);
        dataReadOption.setSortOrder(1);
        if (o15.i(System.currentTimeMillis()) <= o15.i(j3)) {
            dataReadOption.setIsParse(2);
        }
        return SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.m49
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return o49.H((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.n49
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return o49.I((Throwable) obj);
            }
        });
    }

    public ddd<List<SleepIndex>> y(long j2, long j3, final int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("getSleepIndex: start:");
        sb.append(j2);
        sb.append(" endTime = ");
        sb.append(j3);
        if (j2 < 1546257600000L) {
            j2 = 1546257600000L;
        }
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.a);
        dataReadOption.setDataTable(IONetService.Stub.TRANSACTION_setSenselessConnectionCallback);
        dataReadOption.setStartTime(j2);
        dataReadOption.setEndTime(j3);
        dataReadOption.setGroupUnitType(i);
        pr8 pr8Var = pr8.INSTANCE;
        if (pr8Var.e(j3) >= pr8Var.e(System.currentTimeMillis())) {
            dataReadOption.setIsParse(2);
        }
        return SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.w39
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return o49.J(i, (CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.f49
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return o49.K((Throwable) obj);
            }
        });
    }
}