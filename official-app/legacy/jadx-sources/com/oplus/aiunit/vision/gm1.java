package com.oplus.aiunit.vision;

import android.text.format.DateFormat;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.Spo2Warning;
import com.heytap.databaseengine.model.bloodoxygensaturation.BloodOxygenSaturation;
import com.heytap.databaseengine.model.bloodoxygensaturation.BloodOxygenSaturationDataStat;
import com.heytap.databaseengine.option.DataReadOption;
import com.oplus.onet.IONetService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

/* JADX INFO: loaded from: classes15.dex */
public class gm1 implements uy9 {
    public static /* synthetic */ List A(Throwable th) throws Throwable {
        return new ArrayList();
    }

    public static /* synthetic */ Long B(CommonBackBean commonBackBean) throws Throwable {
        if (commonBackBean.getObj() != null) {
            List list = (List) commonBackBean.getObj();
            a7b.f("BloodOxygenRepository", "fetchLastDataTime result: dataList.size() is " + list.size());
            if (list.size() > 0) {
                return Long.valueOf(v05.a(((BloodOxygenSaturationDataStat) list.get(0)).getDate()));
            }
        }
        return Long.MIN_VALUE;
    }

    public static /* synthetic */ List C(CommonBackBean commonBackBean) throws Throwable {
        List arrayList;
        int errorCode = commonBackBean.getErrorCode();
        if (commonBackBean.getObj() != null) {
            arrayList = (List) commonBackBean.getObj();
            Collections.sort(arrayList, Comparator.comparingInt(new ToIntFunction() { // from class: com.oplus.aiunit.vision.fm1
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    return ((BloodOxygenSaturationDataStat) obj).getDate();
                }
            }));
        } else {
            arrayList = new ArrayList();
        }
        jq0.c("BloodOxygenRepository", "queryStatData, result ：" + errorCode + "/" + arrayList.size());
        return arrayList;
    }

    public static /* synthetic */ List D(Throwable th) throws Throwable {
        return new ArrayList();
    }

    public static /* synthetic */ List r(CommonBackBean commonBackBean) throws Throwable {
        List arrayList = new ArrayList();
        if (commonBackBean.getObj() != null) {
            arrayList = (List) commonBackBean.getObj();
        }
        a7b.f("BloodOxygenRepository", "fetchLastSpo2StatData result : " + arrayList.size());
        return arrayList;
    }

    public static /* synthetic */ List s(Throwable th) throws Throwable {
        return new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    public static /* synthetic */ Long t(CommonBackBean commonBackBean) throws Throwable {
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
        a7b.f("BloodOxygenRepository", "fetchSpo2WarnCount end:" + jLongValue);
        return Long.valueOf(jLongValue);
    }

    public static /* synthetic */ Long u(Throwable th) throws Throwable {
        return 0L;
    }

    public static /* synthetic */ List v(int i, CommonBackBean commonBackBean) throws Throwable {
        List arrayList = new ArrayList();
        if (commonBackBean.getObj() != null) {
            arrayList = (List) commonBackBean.getObj();
        }
        a7b.f("BloodOxygenRepository", "fetchSpo2Warning result : " + arrayList.size() + "/type:" + i);
        return arrayList;
    }

    public static /* synthetic */ List w(Throwable th) throws Throwable {
        return new ArrayList();
    }

    public static /* synthetic */ List x(CommonBackBean commonBackBean) throws Throwable {
        jq0.c("BloodOxygenRepository", "queryBloodOxygenData, errorCode is ：" + commonBackBean.getErrorCode());
        return commonBackBean.getObj() != null ? (List) commonBackBean.getObj() : new ArrayList();
    }

    public static /* synthetic */ List y(Throwable th) throws Throwable {
        return new ArrayList();
    }

    public static /* synthetic */ List z(CommonBackBean commonBackBean) throws Throwable {
        jq0.c("BloodOxygenRepository", "queryBloodOxygenData, errorCode is ：" + commonBackBean.getErrorCode());
        return commonBackBean.getObj() != null ? (List) commonBackBean.getObj() : new ArrayList();
    }

    public lbd<List<BloodOxygenSaturation>> E(String str, long j2, long j3, int i) {
        return F(str, j2, j3, i, -1, 0);
    }

    public lbd<List<BloodOxygenSaturation>> F(String str, long j2, long j3, int i, int i2, int i3) {
        if (j2 < 1546272000000L) {
            j2 = 1546272000000L;
        }
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setDataTable(1014);
        dataReadOption.setStartTime(j2);
        dataReadOption.setSsoid(str);
        dataReadOption.setEndTime(j3);
        if (i > 0) {
            dataReadOption.setCount(i);
        }
        dataReadOption.setReadHealthDataType(i2);
        dataReadOption.setSortOrder(i3);
        if (v05.i(j3) >= v05.i(System.currentTimeMillis())) {
            dataReadOption.setIsParse(2);
        }
        return SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new d08() { // from class: com.oplus.aiunit.vision.dm1
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return gm1.x((CommonBackBean) obj);
            }
        }).t0(new d08() { // from class: com.oplus.aiunit.vision.em1
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return gm1.y((Throwable) obj);
            }
        });
    }

    public lbd<List<BloodOxygenSaturation>> G() {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(um.c().getSsoid());
        dataReadOption.setCount(1);
        dataReadOption.setDataTable(1014);
        dataReadOption.setDataReadType("one_day_or_one_data");
        dataReadOption.setSortOrder(1);
        return SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new d08() { // from class: com.oplus.aiunit.vision.zl1
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return gm1.z((CommonBackBean) obj);
            }
        }).t0(new d08() { // from class: com.oplus.aiunit.vision.am1
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return gm1.A((Throwable) obj);
            }
        });
    }

    public lbd<List<BloodOxygenSaturationDataStat>> H(String str, long j2, long j3, int i) {
        if (j2 < 1546272000000L) {
            j2 = 1546272000000L;
        }
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setDataTable(1015);
        dataReadOption.setStartTime(j2);
        dataReadOption.setEndTime(j3);
        dataReadOption.setGroupUnitType(i);
        dataReadOption.setSsoid(str);
        dataReadOption.setSortOrder(0);
        return SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new d08() { // from class: com.oplus.aiunit.vision.bm1
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return gm1.C((CommonBackBean) obj);
            }
        }).t0(new d08() { // from class: com.oplus.aiunit.vision.cm1
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return gm1.D((Throwable) obj);
            }
        });
    }

    @Override // com.oplus.aiunit.vision.uy9
    @NonNull
    public lbd<Long> a() {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(um.c().getSsoid());
        dataReadOption.setStartTime(1546257600000L);
        dataReadOption.setEndTime(System.currentTimeMillis());
        dataReadOption.setCount(1);
        dataReadOption.setDataTable(1015);
        dataReadOption.setGroupUnitType(4);
        dataReadOption.setSortOrder(1);
        return SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new d08() { // from class: com.oplus.aiunit.vision.sl1
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return gm1.B((CommonBackBean) obj);
            }
        });
    }

    public lbd<List<BloodOxygenSaturationDataStat>> o() {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(um.c().getSsoid());
        dataReadOption.setStartTime(1546257600000L);
        dataReadOption.setEndTime(System.currentTimeMillis());
        dataReadOption.setCount(1);
        dataReadOption.setDataTable(1015);
        dataReadOption.setGroupUnitType(4);
        dataReadOption.setSortOrder(1);
        return SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new d08() { // from class: com.oplus.aiunit.vision.xl1
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return gm1.r((CommonBackBean) obj);
            }
        }).t0(new d08() { // from class: com.oplus.aiunit.vision.yl1
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return gm1.s((Throwable) obj);
            }
        });
    }

    public lbd<Long> p(String str, long j2, long j3) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(str);
        dataReadOption.setStartTime(j2);
        dataReadOption.setEndTime(j3);
        dataReadOption.setDataTable(IONetService.Stub.TRANSACTION_removeSenselessConnectionCallback);
        dataReadOption.setDataReadType("number_of_warnings");
        if (v05.i(System.currentTimeMillis()) <= v05.i(j3)) {
            dataReadOption.setIsParse(2);
        }
        return SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new d08() { // from class: com.oplus.aiunit.vision.vl1
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return gm1.t((CommonBackBean) obj);
            }
        }).t0(new d08() { // from class: com.oplus.aiunit.vision.wl1
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return gm1.u((Throwable) obj);
            }
        });
    }

    public lbd<List<Spo2Warning>> q(String str, long j2, long j3, final int i, int i2) {
        if (j2 < 1546272000000L) {
            j2 = 1546272000000L;
        }
        jq0.c("BloodOxygenRepository", "fetchSpo2Warning: ,startTime: " + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", j2)) + ",endTime: " + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", j3)) + "/type:" + i);
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(str);
        dataReadOption.setStartTime(j2);
        dataReadOption.setEndTime(j3);
        dataReadOption.setCount(i2);
        dataReadOption.setDataTable(IONetService.Stub.TRANSACTION_removeSenselessConnectionCallback);
        dataReadOption.setSortOrder(1);
        if (v05.i(j3) >= v05.i(System.currentTimeMillis())) {
            dataReadOption.setIsParse(2);
        }
        return SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new d08() { // from class: com.oplus.aiunit.vision.tl1
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return gm1.v(i, (CommonBackBean) obj);
            }
        }).t0(new d08() { // from class: com.oplus.aiunit.vision.ul1
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return gm1.w((Throwable) obj);
            }
        });
    }
}
