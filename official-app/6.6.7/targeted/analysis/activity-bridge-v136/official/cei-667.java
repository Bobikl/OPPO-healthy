package com.oplus.aiunit.vision;

import com.heytap.databaseengine.apiv3.data.DataPoint;
import com.heytap.databaseengine.apiv3.data.DataSet;
import com.heytap.databaseengine.apiv3.data.DataType;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.databaseengine.model.SportDataStat;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengine.model.UserGoalInfo;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.databaseengineservice.db.AppDatabase;
import com.heytap.databaseengineservice.db.table.DBOneTimeSportStat;
import com.heytap.databaseengineservice.db.table.DBSportDataStat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes15.dex */
public class cei extends eei<DBSportDataStat, SportDataStat> {
    public final xdi d = this.f12345c.O0();

    public static long p(long j2, long j3) {
        return (j3 - j2) / 86400000;
    }

    @Override // com.oplus.aiunit.vision.eei, com.oplus.aiunit.vision.a0a
    public int c(List<SportDataStat> list) {
        sj4.c("SportDataStatStore", "saveSportHealthData list size is " + list.size());
        Iterator<SportDataStat> it = list.iterator();
        boolean zS = true;
        while (it.hasNext()) {
            zS = s(it.next());
        }
        return zS ? 0 : 101001;
    }

    @Override // com.oplus.aiunit.vision.eei
    public List<DataSet> f(List<DBSportDataStat> list, DataReadOption dataReadOption) {
        ArrayList arrayList = new ArrayList();
        DataSet.b bVarBuilder = DataSet.builder(DataType.TYPE_DAILY_ACTIVITY_COUNT);
        for (DBSportDataStat dBSportDataStat : list) {
            bVarBuilder.a(DataPoint.builder(DataType.TYPE_DAILY_ACTIVITY_COUNT).e(o15.a(dBSportDataStat.getDate())).f(j(o15.a(dBSportDataStat.getDate()), dataReadOption.getGroupUnitType(), 0L)).c(Element.ELEMENT_STEP, dBSportDataStat.getTotalSteps()).c(Element.ELEMENT_STEP_GOAL, dBSportDataStat.getCurrentDayStepsGoal()).c(Element.ELEMENT_DISTANCE, dBSportDataStat.getTotalDistance()).c(Element.ELEMENT_CALORIE, (int) dBSportDataStat.getTotalCalories()).c(Element.ELEMENT_CALORIE_GOAL, dBSportDataStat.getCurrentDayCaloriesGoal()).c(Element.ELEMENT_MOVE_TIME, dBSportDataStat.getTotalMoveAboutTimes()).c(Element.ELEMENT_WORK_MINUTE, dBSportDataStat.getTotalWorkoutMinutes()).a());
        }
        arrayList.add(bVarBuilder.c());
        return arrayList;
    }

    @Override // com.oplus.aiunit.vision.eei
    public List<SportDataStat> g(List<DBSportDataStat> list, DataReadOption dataReadOption) {
        return tx4.INSTANCE.N(list);
    }

    @Override // com.oplus.aiunit.vision.eei
    public List<DBSportDataStat> l(DataReadOption dataReadOption) {
        List<DBSportDataStat> listM;
        long jMax = Math.max(dataReadOption.getStartTime(), 1546272000000L);
        long endTime = dataReadOption.getEndTime();
        int readSportMode = dataReadOption.getReadSportMode();
        String ssoid = dataReadOption.getSsoid();
        int groupUnitType = dataReadOption.getGroupUnitType();
        int aggregateType = dataReadOption.getAggregateType();
        int iX = mzi.x(LocalDateTime.now().toLocalDate().format(DateTimeFormatter.ofPattern("yyyyMMdd")));
        sj4.c("SportDataStatStore", "readSportHealthData: type is " + dataReadOption.getDataTable() + ", interval: " + jMax + ", " + endTime + ", who is " + ssoid);
        int i = o15.i(jMax);
        int i2 = o15.i(endTime);
        List<DBSportDataStat> arrayList = new ArrayList<>();
        if (groupUnitType >= 1) {
            listM = this.d.m(u7f.d().j(dataReadOption));
            if (dataReadOption.getSortOrder() == 0) {
                u(iX, listM, listM.size() - 1);
            } else {
                u(iX, listM, 0);
            }
        } else {
            if (readSportMode == -2 && aggregateType == 108) {
                o(readSportMode, ssoid, i, i2, arrayList, this.d.o(ssoid, i, i2));
            } else if (readSportMode == -3) {
                o(readSportMode, ssoid, i, i2, arrayList, this.d.r(ssoid, i, i2, readSportMode));
            } else if (aggregateType == 102) {
                arrayList = this.d.r(ssoid, i, i2, -2);
            } else if (aggregateType != 109) {
                o(readSportMode, ssoid, i, i2, arrayList, this.d.r(ssoid, i, i2, readSportMode));
            } else {
                dqi.h(this.a, readSportMode, ssoid, i, i2, arrayList);
            }
            u(iX, arrayList, arrayList.size() - 1);
            listM = arrayList;
        }
        sj4.c("SportDataStatStore", "readSportHealthData: " + listM.size());
        return listM;
    }

    public final void o(int i, String str, int i2, int i3, List<DBSportDataStat> list, List<DBSportDataStat> list2) {
        ConcurrentHashMap<String, String> concurrentHashMapB = rei.INSTANCE.a().b(str, this.a, Arrays.asList(0, 5, 9, 10));
        int iX = mzi.x(concurrentHashMapB.get(str + "_0"));
        int iX2 = mzi.x(concurrentHashMapB.get(str + "_5"));
        int iX3 = mzi.x(concurrentHashMapB.get(str + "_9"));
        int iX4 = mzi.x(concurrentHashMapB.get(str + "_10"));
        for (int iM = i2; iM <= i3; iM = o15.m(o15.a(iM))) {
            DBSportDataStat dBSportDataStat = new DBSportDataStat();
            dBSportDataStat.setCurrentDayStepsGoal(iX > 0 ? iX : mzi.x("8000"));
            dBSportDataStat.setCurrentDayCaloriesGoal(iX2 > 0 ? iX2 : mzi.x(UserGoalInfo.CONSUMPTION_GOAL_DEFAULT));
            dBSportDataStat.setCurrentDayWorkoutGoal(iX3 > 0 ? iX3 : 30);
            dBSportDataStat.setCurrentDayMoveAboutTimesGoal(iX4 > 0 ? iX4 : 12);
            dBSportDataStat.setSportMode(i);
            dBSportDataStat.setDate(iM);
            list.add(dBSportDataStat);
        }
        for (DBSportDataStat dBSportDataStat2 : list2) {
            list.set((int) p(o15.a(i2), o15.a(dBSportDataStat2.getDate())), dBSportDataStat2);
        }
    }

    public final void q(DBSportDataStat dBSportDataStat, long j2, long j3) {
        if (dBSportDataStat.getStartTimestamp() != j2) {
            dBSportDataStat.setStartTimestamp(j2);
        }
        if (dBSportDataStat.getEndTimestamp() != j3) {
            dBSportDataStat.setEndTimestamp(j3);
        }
        dBSportDataStat.setSyncStatus(0);
    }

    public final void r(DBSportDataStat dBSportDataStat, String str) {
        dBSportDataStat.setSportMode(-2);
        dBSportDataStat.setDeviceUniqueId(eb2.dataProcess.w0());
        dBSportDataStat.setClientDataId("");
        dBSportDataStat.setSyncStatus(0);
        dBSportDataStat.setSsoid(str);
        ((bei) qhi.b(1002)).j(dBSportDataStat, false, true);
        sj4.c("SportDataStatStore", String.format("saveOneStatData save send broadcast insert, watch or band steps:%s, calories:%s, floor:%s, distance:%s, moveAbout:%s, exercise:%s ", Integer.valueOf(dBSportDataStat.getTotalSteps()), Long.valueOf(dBSportDataStat.getTotalCalories()), Integer.valueOf(dBSportDataStat.getTotalAltitudeOffset()), Integer.valueOf(dBSportDataStat.getTotalDistance()), Integer.valueOf(dBSportDataStat.getTotalMoveAboutTimes()), Integer.valueOf(dBSportDataStat.getTotalWorkoutMinutes())));
        k72.u(this.a);
    }

    public final boolean s(SportHealthData sportHealthData) {
        DBSportDataStat dBSportDataStat = (DBSportDataStat) vd8.a(vd8.g(sportHealthData), DBSportDataStat.class);
        if (dBSportDataStat == null || dBSportDataStat.getDate() == 0 || mzi.s(dBSportDataStat.getTotalSteps(), dBSportDataStat.getTotalDistance(), dBSportDataStat.getTotalCalories(), dBSportDataStat.getTotalAltitudeOffset(), dBSportDataStat.getTotalWorkoutMinutes(), dBSportDataStat.getTotalMoveAboutTimes())) {
            sj4.d("SportDataStatStore", "saveOneStatData data is null or date or value is not right!");
            return true;
        }
        sj4.a("SportDataStatStore", "saveOneStatData save sportStat: " + dBSportDataStat);
        int date = dBSportDataStat.getDate();
        String ssoid = dBSportDataStat.getSsoid();
        long jQ = o15.q(o15.a(date));
        q(dBSportDataStat, jQ, o15.l(jQ));
        boolean zJ = ((bei) qhi.b(1002)).j(dBSportDataStat, false, false);
        if (-2 == dBSportDataStat.getSportMode()) {
            t(dBSportDataStat, date, ssoid, System.currentTimeMillis(), "saveOneStatData save from phone, phone steps: ", false);
        } else if (-3 == dBSportDataStat.getSportMode()) {
            r(dBSportDataStat, ssoid);
        }
        return zJ;
    }

    public final void t(DBSportDataStat dBSportDataStat, int i, String str, long j2, String str2, boolean z) {
        DBOneTimeSportStat dBOneTimeSportStatI;
        dBSportDataStat.setSportMode(-4);
        dBSportDataStat.setDeviceUniqueId(eb2.dataProcess.w0());
        dBSportDataStat.setClientDataId("");
        if (z && (dBOneTimeSportStatI = AppDatabase.K(this.a).Y0().i(str, -4, i)) != null) {
            dBSportDataStat.setTotalCalories(dBSportDataStat.getTotalCalories() + dBOneTimeSportStatI.getTotalCalories());
        }
        dBSportDataStat.setUpdateTimestamp(j2);
        ((bei) qhi.b(1002)).j(dBSportDataStat, false, true);
        sj4.c("SportDataStatStore", str2 + dBSportDataStat.getTotalSteps() + ", date: " + dBSportDataStat.getDate());
    }

    public final void u(int i, List<DBSportDataStat> list, int i2) {
        if (rz.b(list)) {
            return;
        }
        DBSportDataStat dBSportDataStat = list.get(i2);
        if (dBSportDataStat.getDate() == i) {
            list.get(i2).setTotalStaticCal((dBSportDataStat.getTotalStaticCal() * o15.u()) / 1440);
        }
    }
}