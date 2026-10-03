package com.oplus.aiunit.vision;

import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQueryBuilder;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.DBAssessmentRecord;
import com.heytap.databaseengineservice.db.table.DBOneTimeSportStat;
import com.heytap.databaseengineservice.db.table.DBSportDataDetail;
import com.heytap.databaseengineservice.db.table.DBSportDataStat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.ToLongFunction;

/* JADX INFO: loaded from: classes15.dex */
public class qdi extends phi {
    public static final int BAND_MOVE_ABOUT_STEPS = 30;
    public static final int MOVE_ABOUT_STEPS = 0;
    public boolean f = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rdi f17127c = new rdi();
    public final ndi d = this.b.N0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xdi f17128e = this.b.O0();
    public final tld g = this.b.Y0();

    @Override // com.oplus.aiunit.vision.sz9
    public void a(List<SportHealthData> list, boolean z) {
        k(list, z);
    }

    public final DBSportDataStat b(String str, String str2, long j2, long j3, int i, int i2, int i3, int i4, int i5, long j4, int i6, long j5, String str3, int i7, int i8, long j6, long j7) {
        DBSportDataStat dBSportDataStat = new DBSportDataStat();
        dBSportDataStat.setSsoid(str);
        dBSportDataStat.setDeviceUniqueId(str2);
        dBSportDataStat.setStartTimestamp(j2);
        dBSportDataStat.setEndTimestamp(j3);
        dBSportDataStat.setDate(i3);
        dBSportDataStat.setDisplay(i7);
        dBSportDataStat.setSportMode(i2);
        dBSportDataStat.setSyncStatus(i);
        dBSportDataStat.setTimezone(str3);
        dBSportDataStat.setTotalSteps(i4);
        dBSportDataStat.setTotalDistance(i5);
        dBSportDataStat.setTotalCalories(j4);
        dBSportDataStat.setTotalAltitudeOffset(i6);
        dBSportDataStat.setTotalDuration(j5);
        dBSportDataStat.setTotalWorkoutMinutes(i8);
        dBSportDataStat.setSedentaryTotalDuration(j6);
        dBSportDataStat.setTotalAmountOfExercise(j7);
        return dBSportDataStat;
    }

    public final void c(Map.Entry<Integer, List<DBSportDataDetail>> entry) {
        sj4.c("SportDataDetailStat", "doPrepareStat enter");
        j(entry);
    }

    public final void d(boolean z, Map.Entry<Integer, List<DBSportDataDetail>> entry) {
        ConcurrentHashMap<Integer, DBSportDataDetail> concurrentHashMap = new ConcurrentHashMap<>();
        for (DBSportDataDetail dBSportDataDetail : entry.getValue()) {
            concurrentHashMap.put(Integer.valueOf(dBSportDataDetail.getSportMode()), dBSportDataDetail);
        }
        h(entry.getValue().get(0), concurrentHashMap, z);
    }

    public final HashMap<Integer, List<DBSportDataDetail>> e(List<SportHealthData> list) {
        if (rz.b(list)) {
            return new HashMap<>();
        }
        HashMap<Integer, List<DBSportDataDetail>> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            DBSportDataDetail dBSportDataDetail = (DBSportDataDetail) list.get(i);
            if (rz.a(dBSportDataDetail.getTimezone())) {
                dBSportDataDetail.setTimezone(o15.r(null));
            }
            if (mzi.t(dBSportDataDetail.getClientDataId())) {
                dBSportDataDetail.setClientDataId(mzi.o());
            }
            int i2 = o15.i(dBSportDataDetail.getStartTimestamp());
            List<DBSportDataDetail> list2 = map.get(Integer.valueOf(i2));
            if (list2 == null) {
                map.put(Integer.valueOf(i2), new ArrayList(Collections.singletonList(dBSportDataDetail)));
            } else if (!g(list2, dBSportDataDetail)) {
                list2.add(dBSportDataDetail);
            }
        }
        return map;
    }

    public final SupportSQLiteQuery f(String str, int i, long j2, long j3, int i2, String str2, String str3) {
        return SupportSQLiteQueryBuilder.builder(DBSportDataDetail.TABLE_NAME).distinct().columns(new String[]{"0 as _id", "ssoid", DBAssessmentRecord.DEVICE_UNIQUE_ID, "start_time", "end_time", "sport_mode", "sync_status", "0 as total_amount_of_exercise", "0 as current_day_steps_goal", "display", "timezone", "0 as modified_time", "updated", i + " as date", "sum(steps) as total_steps", "0 as steps_goal_complete", "sum(distance) as total_distance", "sum(calories) as total_calories", "sum(workout) as total_workout_minutes", "sum(sedentary_state) as sedentary_state", "sum(altitude_offset) as total_altitude_offset", "sum(end_time - start_time) as total_duration", "0 as current_day_calories_goal", "0 as calories_goal_complete"}).groupBy(str2).orderBy(str3).selection("ssoid = ? and start_time between ? and ? and display = 1 and sport_mode = ?", new Object[]{str, Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i2)}).create();
    }

    public final boolean g(List<DBSportDataDetail> list, DBSportDataDetail dBSportDataDetail) {
        for (DBSportDataDetail dBSportDataDetail2 : list) {
            if (dBSportDataDetail2.getDeviceUniqueId().equals(dBSportDataDetail.getDeviceUniqueId()) && dBSportDataDetail2.getStartTimestamp() == dBSportDataDetail.getStartTimestamp()) {
                return true;
            }
        }
        return false;
    }

    public final void h(DBSportDataDetail dBSportDataDetail, ConcurrentHashMap<Integer, DBSportDataDetail> concurrentHashMap, boolean z) {
        long j2;
        long j3;
        String ssoid = dBSportDataDetail.getSsoid();
        int display = dBSportDataDetail.getDisplay();
        int syncStatus = dBSportDataDetail.getSyncStatus();
        long jQ = o15.q(dBSportDataDetail.getStartTimestamp());
        long jL = o15.l(dBSportDataDetail.getStartTimestamp());
        int i = o15.i(dBSportDataDetail.getStartTimestamp());
        String strR = o15.r(dBSportDataDetail.getTimezone());
        String strB = toi.b(4, 0, DBSportDataDetail.TABLE_NAME);
        Iterator<DBSportDataStat> it = this.d.m(this.f17127c.q(ssoid, i, jQ, jL, 0, 30, toi.b(3, 0, DBSportDataDetail.TABLE_NAME), "start_time asc")).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().getTotalMoveAboutTimes() > 0) {
                i2++;
            }
        }
        DBSportDataStat dBSportDataStatQ = this.f17128e.q(ssoid, i, jQ, jL, kq5.PHONE_DEVICE, strB);
        DBOneTimeSportStat dBOneTimeSportStatI = this.g.i(ssoid, -3, i);
        if (dBSportDataStatQ != null) {
            dBSportDataStatQ.setTotalMoveAboutTimes(i2);
            j2 = jQ;
            dBSportDataStatQ.setStartTimestamp(j2);
            dBSportDataStatQ.setEndTimestamp(j3);
            if (dBOneTimeSportStatI != null) {
                j3 = jL;
                dBSportDataStatQ.setTotalCalories(dBSportDataStatQ.getTotalCalories() + dBOneTimeSportStatI.getTotalCalories());
                dBSportDataStatQ.setTotalWorkoutMinutes(dBSportDataStatQ.getTotalWorkoutMinutes() + ((int) (dBOneTimeSportStatI.getTotalDuration() / 60000)));
            }
            j3 = jL;
            dBSportDataStatQ.setDisplay(display);
            dBSportDataStatQ.setSportMode(-3);
            if (kq5.d(dBSportDataDetail.getDeviceType())) {
                dBSportDataStatQ.setSyncStatus(syncStatus);
            }
            dBSportDataStatQ.setTimezone(strR);
            qhi.b(1002).a(Collections.singletonList(dBSportDataStatQ), false);
        } else {
            j2 = jQ;
            j3 = jL;
        }
        Iterator<DBSportDataDetail> it2 = concurrentHashMap.values().iterator();
        while (it2.hasNext()) {
            i(it2.next(), z, strB, "start_time asc");
        }
        ((bei) qhi.b(1002)).g(ssoid, i, syncStatus, z, j2, j3, strB, "start_time asc", i2);
        if (i == o15.i(System.currentTimeMillis())) {
            this.f = true;
        }
    }

    public final void i(DBSportDataDetail dBSportDataDetail, boolean z, String str, String str2) {
        String ssoid = dBSportDataDetail.getSsoid();
        String deviceUniqueId = dBSportDataDetail.getDeviceUniqueId();
        int display = dBSportDataDetail.getDisplay();
        int syncStatus = dBSportDataDetail.getSyncStatus();
        int sportMode = dBSportDataDetail.getSportMode();
        long jQ = o15.q(dBSportDataDetail.getStartTimestamp());
        long jL = o15.l(dBSportDataDetail.getStartTimestamp());
        int i = o15.i(dBSportDataDetail.getStartTimestamp());
        String strR = o15.r(dBSportDataDetail.getTimezone());
        List<DBSportDataStat> listP = this.d.p(f(ssoid, i, jQ, jL, sportMode, str, str2));
        if (rz.b(listP)) {
            sj4.d("SportDataDetailStat", "saveOneStat() sportDataStats is null or empty! sport mode is " + sportMode + ", date is " + i);
            return;
        }
        DBSportDataStat dBSportDataStat = listP.get(0);
        int totalSteps = dBSportDataStat.getTotalSteps();
        int totalDistance = dBSportDataStat.getTotalDistance();
        long totalCalories = dBSportDataStat.getTotalCalories();
        int totalAltitudeOffset = dBSportDataStat.getTotalAltitudeOffset();
        long totalDuration = dBSportDataStat.getTotalDuration();
        int totalWorkoutMinutes = dBSportDataStat.getTotalWorkoutMinutes();
        long sedentaryTotalDuration = dBSportDataStat.getSedentaryTotalDuration();
        long totalAmountOfExercise = dBSportDataStat.getTotalAmountOfExercise();
        if (!mzi.s(totalSteps, totalDistance, totalCalories, totalAltitudeOffset, totalWorkoutMinutes, dBSportDataStat.getTotalMoveAboutTimes())) {
            sj4.c("SportDataDetailStat", String.format("data:(date:%s, sportMode:%s, steps:%s, distance:%s, calories:%s, workouts:%s, detail data's startTimestamp:%s)", Integer.valueOf(i), Integer.valueOf(sportMode), Integer.valueOf(totalSteps), Integer.valueOf(totalDistance), Long.valueOf(totalCalories), Integer.valueOf(totalWorkoutMinutes), Long.valueOf(dBSportDataDetail.getStartTimestamp())));
            qhi.b(1002).a(Collections.singletonList(b(ssoid, deviceUniqueId, jQ, jL, syncStatus, sportMode, i, totalSteps, totalDistance, totalCalories, totalAltitudeOffset, totalDuration, strR, display, totalWorkoutMinutes, sedentaryTotalDuration, totalAmountOfExercise)), z);
            return;
        }
        DBSportDataStat dBSportDataStatI = this.f17128e.i(ssoid, sportMode, i);
        if (dBSportDataStatI != null) {
            if (dBSportDataStatI.getSyncStatus() == 0) {
                this.f17128e.v(dBSportDataStatI);
                return;
            }
            dBSportDataStatI.setSyncStatus(2);
            dBSportDataStatI.setDisplay(2);
            this.f17128e.s(dBSportDataStatI);
        }
    }

    public final void j(Map.Entry<Integer, List<DBSportDataDetail>> entry) {
        sj4.c("SportDataDetailStat", "statDetailDataIfNoOldData start");
        DBSportDataDetail dBSportDataDetail = (DBSportDataDetail) Collections.max(entry.getValue(), Comparator.comparingLong(new ToLongFunction() { // from class: com.oplus.aiunit.vision.pdi
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return ((DBSportDataDetail) obj).getStartTimestamp();
            }
        }));
        String ssoid = dBSportDataDetail.getSsoid();
        int i = o15.i(dBSportDataDetail.getStartTimestamp());
        int syncStatus = dBSportDataDetail.getSyncStatus();
        long startTimestamp = dBSportDataDetail.getStartTimestamp();
        DBSportDataStat dBSportDataStatI = this.f17128e.i(ssoid, -4, i);
        sj4.a("SportDataDetailStat", "statDetailDataIfNoOldData statPhoneCalories: " + dBSportDataStatI);
        if (dBSportDataStatI == null) {
            dBSportDataStatI = new DBSportDataStat();
            dBSportDataStatI.setSsoid(ssoid);
            dBSportDataStatI.setDate(i);
            dBSportDataStatI.setSportMode(-4);
        } else if (dBSportDataStatI.getUpdateTimestamp() == 0) {
            dBSportDataStatI.setUpdateTimestamp(dBSportDataStatI.getDate() < o15.i(System.currentTimeMillis()) ? o15.l(o15.a(dBSportDataStatI.getDate())) : System.currentTimeMillis());
        }
        for (DBSportDataDetail dBSportDataDetail2 : entry.getValue()) {
            if (dBSportDataDetail2.getStartTimestamp() > dBSportDataStatI.getUpdateTimestamp() && dBSportDataDetail2.getCalories() > 0 && dBSportDataDetail2.getDisplay() == 1) {
                dBSportDataStatI.setTotalAltitudeOffset(dBSportDataStatI.getTotalAltitudeOffset() + dBSportDataDetail2.getAltitudeOffset());
                dBSportDataStatI.setTotalCalories(dBSportDataStatI.getTotalCalories() + dBSportDataDetail2.getCalories());
                dBSportDataStatI.setTotalDistance(dBSportDataStatI.getTotalDistance() + dBSportDataDetail2.getDistance());
                dBSportDataStatI.setTotalDuration(dBSportDataStatI.getTotalDuration() + 60000);
                dBSportDataStatI.setTotalSteps(dBSportDataStatI.getTotalSteps() + dBSportDataDetail2.getSteps());
            }
        }
        dBSportDataStatI.setUpdateTimestamp(startTimestamp);
        dBSportDataStatI.setSyncStatus(syncStatus);
        l(dBSportDataStatI);
    }

    public final void k(List<SportHealthData> list, boolean z) {
        sj4.c("SportDataDetailStat", "stat start size is " + list.size());
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap<Integer, List<DBSportDataDetail>> mapE = e(list);
        this.f = false;
        for (Map.Entry<Integer, List<DBSportDataDetail>> entry : mapE.entrySet()) {
            sj4.c("SportDataDetailStat", "SportDetailStat realCalculateData size also need cal days is:" + mapE.size() + ", current date is:" + entry.getKey());
            c(entry);
            d(z, entry);
        }
        if (this.f) {
            sj4.c("SportDataDetailStat", "stat() send stepSum change broadcast");
            k72.e(this.a, 1);
        }
        sj4.c("SportDataDetailStat", "saveStat size = " + list.size() + ", totalTime = " + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public final void l(DBSportDataStat dBSportDataStat) {
        if (mzi.s(dBSportDataStat.getTotalSteps(), dBSportDataStat.getTotalDistance(), dBSportDataStat.getTotalCalories(), dBSportDataStat.getTotalAltitudeOffset(), dBSportDataStat.getTotalWorkoutMinutes(), dBSportDataStat.getTotalMoveAboutTimes())) {
            sj4.d("SportDataDetailStat", "updateStatData value is not right!");
            return;
        }
        int i = (dBSportDataStat.getCurrentDayStepsGoal() <= 0 || dBSportDataStat.getTotalSteps() <= dBSportDataStat.getCurrentDayStepsGoal()) ? 0 : 1;
        int i2 = (dBSportDataStat.getCurrentDayCaloriesGoal() <= 0 || dBSportDataStat.getTotalCalories() <= ((long) dBSportDataStat.getCurrentDayCaloriesGoal())) ? 0 : 1;
        dBSportDataStat.setStepsGoalComplete(i);
        dBSportDataStat.setCaloriesGoalComplete(i2);
        sj4.a("SportDataDetailStat", "statDetailDataIfNoOldData: " + dBSportDataStat);
        qhi.b(1002).a(Collections.singletonList(dBSportDataStat), false);
        dBSportDataStat.setSportMode(-2);
        ((bei) qhi.b(1002)).j(dBSportDataStat, false, false);
    }
}