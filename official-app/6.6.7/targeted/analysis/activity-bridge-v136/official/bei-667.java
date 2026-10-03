package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengine.model.UserGoalInfo;
import com.heytap.databaseengineservice.db.table.DBOneTimeSportStat;
import com.heytap.databaseengineservice.db.table.DBSportDataStat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.ToLongFunction;

/* JADX INFO: loaded from: classes15.dex */
public class bei extends phi {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f11035e = {-3, -4};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xdi f11036c = this.b.O0();
    public final tld d = this.b.Y0();

    @Override // com.oplus.aiunit.vision.sz9
    public synchronized void a(List<SportHealthData> list, boolean z) {
        ConcurrentHashMap<String, DBSportDataStat> concurrentHashMap = new ConcurrentHashMap<>();
        for (SportHealthData sportHealthData : list) {
            DBSportDataStat dBSportDataStat = (DBSportDataStat) sportHealthData;
            if (concurrentHashMap.get(dBSportDataStat.getSsoid() + "_" + dBSportDataStat.getDate() + "_" + dBSportDataStat.getSportMode()) == null) {
                for (DBSportDataStat dBSportDataStat2 : this.f11036c.d(dBSportDataStat.getSsoid(), dBSportDataStat.getDate(), dBSportDataStat.getDate())) {
                    concurrentHashMap.putIfAbsent(dBSportDataStat2.getSsoid() + "_" + dBSportDataStat2.getDate() + "_" + dBSportDataStat2.getSportMode(), dBSportDataStat2);
                }
            }
            k((DBSportDataStat) sportHealthData, concurrentHashMap, z, false);
        }
    }

    public final long b(DBSportDataStat dBSportDataStat, String str) {
        int i;
        int i2;
        int i3;
        int i4;
        if (mzi.r(dBSportDataStat.getTotalSteps(), dBSportDataStat.getTotalDistance(), dBSportDataStat.getTotalCalories(), dBSportDataStat.getTotalAltitudeOffset(), dBSportDataStat.getTotalWorkoutMinutes())) {
            sj4.d("SportDataStatProcess", "getInsertResult value is not right!");
            return 101001L;
        }
        if (dBSportDataStat.getModifiedTime() > 0 && dBSportDataStat.getUpdated() == 0) {
            return this.f11036c.t(dBSportDataStat).longValue();
        }
        ConcurrentHashMap<String, String> concurrentHashMapB = rei.INSTANCE.a().b(str, this.a, Arrays.asList(0, 5, 9, 10));
        if (dBSportDataStat.getCurrentDayStepsGoal() > 0) {
            i = dBSportDataStat.getTotalSteps() >= dBSportDataStat.getCurrentDayStepsGoal() ? 1 : 0;
        } else {
            int iX = mzi.x(concurrentHashMapB.get(str + "_0"));
            if (iX <= 0) {
                iX = mzi.x("8000");
            }
            int i5 = dBSportDataStat.getTotalSteps() >= iX ? 1 : 0;
            dBSportDataStat.setCurrentDayStepsGoal(iX);
            i = i5;
        }
        if (dBSportDataStat.getCurrentDayCaloriesGoal() > 0) {
            i2 = dBSportDataStat.getTotalCalories() >= ((long) dBSportDataStat.getCurrentDayCaloriesGoal()) ? 1 : 0;
        } else {
            int iX2 = mzi.x(concurrentHashMapB.get(str + "_5"));
            if (iX2 <= 0) {
                iX2 = mzi.x(UserGoalInfo.CONSUMPTION_GOAL_DEFAULT);
            }
            int i6 = dBSportDataStat.getTotalCalories() >= ((long) iX2) ? 1 : 0;
            dBSportDataStat.setCurrentDayCaloriesGoal(iX2);
            i2 = i6;
        }
        if (dBSportDataStat.getCurrentDayMoveAboutTimesGoal() > 0) {
            i3 = dBSportDataStat.getTotalMoveAboutTimes() >= dBSportDataStat.getCurrentDayMoveAboutTimesGoal() ? 1 : 0;
        } else {
            int iX3 = mzi.x(concurrentHashMapB.get(str + "_10"));
            if (iX3 <= 0) {
                iX3 = mzi.x("12");
            }
            int i7 = dBSportDataStat.getTotalMoveAboutTimes() >= (iX3 > 0 ? iX3 : 12) ? 1 : 0;
            dBSportDataStat.setCurrentDayMoveAboutTimesGoal(iX3);
            i3 = i7;
        }
        if (dBSportDataStat.getCurrentDayWorkoutGoal() > 0) {
            i4 = dBSportDataStat.getTotalWorkoutMinutes() >= dBSportDataStat.getCurrentDayWorkoutGoal() ? 1 : 0;
        } else {
            int iX4 = mzi.x(concurrentHashMapB.get(str + "_9"));
            if (iX4 <= 0) {
                iX4 = mzi.x(UserGoalInfo.WORKOUT_GOAL_DEFAULT);
            }
            int i8 = dBSportDataStat.getTotalWorkoutMinutes() >= (iX4 > 0 ? iX4 : 30) ? 1 : 0;
            dBSportDataStat.setCurrentDayWorkoutGoal(iX4);
            i4 = i8;
        }
        h(dBSportDataStat, Arrays.asList(8, 6, 7));
        dBSportDataStat.setStepsGoalComplete(i);
        dBSportDataStat.setCaloriesGoalComplete(i2);
        dBSportDataStat.setWorkoutGoalComplete(i4);
        dBSportDataStat.setMoveAboutTimesGoalComplete(i3);
        dBSportDataStat.setDayGoalComplete(i & i2 & i3 & i4);
        dBSportDataStat.setTimezone(o15.r(dBSportDataStat.getTimezone()));
        if (mzi.t(dBSportDataStat.getClientDataId())) {
            dBSportDataStat.setClientDataId(mzi.o());
        }
        m(dBSportDataStat);
        if (dBSportDataStat.getTotalStaticCal() == 0) {
            dqi.j(str, dqi.f(this.b.e1().query(str)), this.b.h1().k(str, 0L, System.currentTimeMillis()), dBSportDataStat);
        }
        return this.f11036c.t(dBSportDataStat).longValue();
    }

    public final long c(DBSportDataStat dBSportDataStat, int i, int i2, DBSportDataStat dBSportDataStat2) {
        if (dBSportDataStat.getUpdateTimestamp() > dBSportDataStat2.getUpdateTimestamp()) {
            dBSportDataStat2.setUpdateTimestamp(dBSportDataStat.getUpdateTimestamp());
        }
        if (dBSportDataStat.getSyncStatus() == 0 || dBSportDataStat.getUpdated() == 1) {
            dBSportDataStat2.setSyncStatus(0);
            if (dBSportDataStat2.getModifiedTime() > 0) {
                dBSportDataStat2.setUpdated(1);
            }
            sj4.c("SportDataStatProcess", "insertOrUpdate() old data need update sync cloud! sportMode = " + i + ", date = " + i2);
        } else if (dBSportDataStat.getSyncStatus() == 1 && d(dBSportDataStat2, dBSportDataStat)) {
            dBSportDataStat2.setUpdated(1);
            sj4.c("SportDataStatProcess", "insertOrUpdate() local has larger values than cloud, mark re-push! sportMode = " + i + ", date = " + i2);
        }
        if (!mzi.t(dBSportDataStat.getClientDataId()) && dBSportDataStat.getModifiedTime() > 0) {
            dBSportDataStat2.setClientDataId(dBSportDataStat.getClientDataId());
        }
        m(dBSportDataStat2);
        return this.f11036c.s(dBSportDataStat2);
    }

    public final boolean d(DBSportDataStat dBSportDataStat, DBSportDataStat dBSportDataStat2) {
        return dBSportDataStat.getTotalSteps() > dBSportDataStat2.getTotalSteps() || dBSportDataStat.getTotalDistance() > dBSportDataStat2.getTotalDistance() || dBSportDataStat.getTotalCalories() > dBSportDataStat2.getTotalCalories() || dBSportDataStat.getTotalAltitudeOffset() > dBSportDataStat2.getTotalAltitudeOffset() || dBSportDataStat.getTotalDuration() > dBSportDataStat2.getTotalDuration() || dBSportDataStat.getTotalWorkoutMinutes() > dBSportDataStat2.getTotalWorkoutMinutes() || dBSportDataStat.getTotalMoveAboutTimes() > dBSportDataStat2.getTotalMoveAboutTimes() || dBSportDataStat.getTotalStaticCal() > dBSportDataStat2.getTotalStaticCal() || dBSportDataStat.getSedentaryCounts() > dBSportDataStat2.getSedentaryCounts() || dBSportDataStat.getSedentaryTotalDuration() > dBSportDataStat2.getSedentaryTotalDuration();
    }

    public final void e(DBSportDataStat dBSportDataStat, DBSportDataStat dBSportDataStat2) {
        if (dBSportDataStat.getStartTimestamp() < dBSportDataStat2.getStartTimestamp()) {
            dBSportDataStat.setStartTimestamp(dBSportDataStat2.getStartTimestamp());
        }
        if (dBSportDataStat.getEndTimestamp() < dBSportDataStat2.getEndTimestamp()) {
            dBSportDataStat.setEndTimestamp(dBSportDataStat2.getEndTimestamp());
        }
    }

    public final boolean f(DBSportDataStat dBSportDataStat, boolean z, DBSportDataStat dBSportDataStat2) {
        boolean z2;
        int i;
        int i2;
        boolean z3 = true;
        if (dBSportDataStat.getTotalSteps() > dBSportDataStat2.getTotalSteps() || z) {
            dBSportDataStat2.setTotalSteps(dBSportDataStat.getTotalSteps());
            z2 = true;
        } else {
            z2 = false;
        }
        if (dBSportDataStat.getTotalDistance() > dBSportDataStat2.getTotalDistance() || z) {
            dBSportDataStat2.setTotalDistance(dBSportDataStat.getTotalDistance());
            z2 = true;
        }
        if (dBSportDataStat.getTotalCalories() > dBSportDataStat2.getTotalCalories() || z) {
            dBSportDataStat2.setTotalCalories(dBSportDataStat.getTotalCalories());
            z2 = true;
        }
        if (dBSportDataStat.getTotalAltitudeOffset() > dBSportDataStat2.getTotalAltitudeOffset() || z) {
            dBSportDataStat2.setTotalAltitudeOffset(dBSportDataStat.getTotalAltitudeOffset());
            z2 = true;
        }
        if (dBSportDataStat.getTotalDuration() > dBSportDataStat2.getTotalDuration() || z) {
            dBSportDataStat2.setTotalDuration(dBSportDataStat.getTotalDuration());
            z2 = true;
        }
        if (dBSportDataStat.getTotalWorkoutMinutes() > dBSportDataStat2.getTotalWorkoutMinutes() || z) {
            dBSportDataStat2.setTotalWorkoutMinutes(dBSportDataStat.getTotalWorkoutMinutes());
            z2 = true;
        }
        if (dBSportDataStat.getTotalMoveAboutTimes() > dBSportDataStat2.getTotalMoveAboutTimes() || z) {
            dBSportDataStat2.setTotalMoveAboutTimes(dBSportDataStat.getTotalMoveAboutTimes());
            z2 = true;
        }
        if (dBSportDataStat.getTotalAmountOfExercise() > dBSportDataStat2.getTotalAmountOfExercise() || z) {
            dBSportDataStat2.setTotalAmountOfExercise(dBSportDataStat.getTotalAmountOfExercise());
            z2 = true;
        }
        if (dBSportDataStat.getCurrentDayStepsGoal() > 0) {
            dBSportDataStat2.setCurrentDayStepsGoal(dBSportDataStat.getCurrentDayStepsGoal());
        }
        if (dBSportDataStat.getCurrentDayCaloriesGoal() > 0) {
            dBSportDataStat2.setCurrentDayCaloriesGoal(dBSportDataStat.getCurrentDayCaloriesGoal());
        }
        if (dBSportDataStat.getCurrentDayMoveAboutTimesGoal() > 0) {
            dBSportDataStat2.setCurrentDayMoveAboutTimesGoal(dBSportDataStat.getCurrentDayMoveAboutTimesGoal());
        }
        if (dBSportDataStat.getCurrentDayWorkoutGoal() > 0) {
            dBSportDataStat2.setCurrentDayWorkoutGoal(dBSportDataStat.getCurrentDayWorkoutGoal());
        }
        if (o15.i(System.currentTimeMillis()) == dBSportDataStat2.getDate()) {
            h(dBSportDataStat2, Arrays.asList(0, 5, 9, 10, 6, 7));
        }
        if (dBSportDataStat2.getCurrentDayStepsGoal() > 0) {
            i = dBSportDataStat2.getTotalSteps() >= dBSportDataStat2.getCurrentDayStepsGoal() ? 1 : 0;
            dBSportDataStat2.setStepsGoalComplete(i);
        } else {
            i = 0;
        }
        if (dBSportDataStat2.getCurrentDayCaloriesGoal() > 0) {
            i2 = dBSportDataStat2.getTotalCalories() >= ((long) dBSportDataStat2.getCurrentDayCaloriesGoal()) ? 1 : 0;
            dBSportDataStat2.setCaloriesGoalComplete(i2);
        } else {
            i2 = 0;
        }
        int i3 = dBSportDataStat2.getTotalWorkoutMinutes() >= (dBSportDataStat2.getCurrentDayWorkoutGoal() > 0 ? dBSportDataStat2.getCurrentDayWorkoutGoal() : 30) ? 1 : 0;
        dBSportDataStat2.setWorkoutGoalComplete(i3);
        int i4 = dBSportDataStat2.getTotalMoveAboutTimes() >= (dBSportDataStat2.getCurrentDayMoveAboutTimesGoal() > 0 ? dBSportDataStat2.getCurrentDayMoveAboutTimesGoal() : 12) ? 1 : 0;
        dBSportDataStat2.setMoveAboutTimesGoalComplete(i4);
        int i5 = i & i2 & i4 & i3;
        if (i5 != dBSportDataStat2.getDayGoalComplete()) {
            dBSportDataStat2.setDayGoalComplete(i5);
        }
        if (dBSportDataStat.getSedentaryTotalDuration() > dBSportDataStat2.getSedentaryTotalDuration() || z) {
            dBSportDataStat2.setSedentaryTotalDuration(dBSportDataStat.getSedentaryTotalDuration());
            z2 = true;
        }
        if (dBSportDataStat.getSedentaryCounts() > dBSportDataStat2.getSedentaryCounts() || z) {
            dBSportDataStat2.setSedentaryCounts(dBSportDataStat.getSedentaryCounts());
            z2 = true;
        }
        if (dBSportDataStat.getTotalStaticCal() > dBSportDataStat2.getTotalStaticCal() || z) {
            dBSportDataStat2.setTotalStaticCal(dBSportDataStat.getTotalStaticCal());
            z2 = true;
        }
        if (dBSportDataStat.getModifiedTime() > dBSportDataStat2.getModifiedTime()) {
            dBSportDataStat2.setModifiedTime(dBSportDataStat.getModifiedTime());
        } else {
            z3 = z2;
        }
        dBSportDataStat2.setTimezone(o15.r(dBSportDataStat.getTimezone()));
        return z3;
    }

    public void g(String str, int i, int i2, boolean z, long j2, long j3, String str2, String str3, int i3) {
        DBSportDataStat dBSportDataStat;
        long updateTimestamp;
        DBSportDataStat dBSportDataStat2;
        List<DBSportDataStat> listU = this.f11036c.u(str, i, j2, j3, str2, str3);
        List<DBSportDataStat> listK = this.f11036c.k(str, i, j2, j3);
        sj4.c("SportDataStatProcess", "saveTotalStat deviceStats = " + listK + ",\r\n dbSportDataStats: " + listU);
        if (rz.b(listU) && rz.b(listK)) {
            sj4.d("SportDataStatProcess", " saveTotalStat() data is null or empty, date is " + i);
            sj4.a("SportDataStatProcess", " saveTotalStat() data is null or empty, date is " + i + ", who = " + str);
            return;
        }
        if (rz.b(listU)) {
            dBSportDataStat = (DBSportDataStat) Collections.max(listK, Comparator.comparingLong(new ToLongFunction() { // from class: com.oplus.aiunit.vision.zdi
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return ((DBSportDataStat) obj).getTotalCalories();
                }
            }));
            updateTimestamp = ((DBSportDataStat) Collections.max(listK, Comparator.comparingLong(new ToLongFunction() { // from class: com.oplus.aiunit.vision.aei
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return ((DBSportDataStat) obj).getUpdateTimestamp();
                }
            }))).getUpdateTimestamp();
        } else if (rz.b(listK) || rz.b(listU)) {
            dBSportDataStat = (DBSportDataStat) Collections.max(listU, Comparator.comparingLong(new ToLongFunction() { // from class: com.oplus.aiunit.vision.zdi
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return ((DBSportDataStat) obj).getTotalCalories();
                }
            }));
            updateTimestamp = ((DBSportDataStat) Collections.max(listU, Comparator.comparingLong(new ToLongFunction() { // from class: com.oplus.aiunit.vision.aei
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return ((DBSportDataStat) obj).getUpdateTimestamp();
                }
            }))).getUpdateTimestamp();
        } else {
            dBSportDataStat = (DBSportDataStat) Collections.max(listU, Comparator.comparingLong(new ToLongFunction() { // from class: com.oplus.aiunit.vision.zdi
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return ((DBSportDataStat) obj).getTotalCalories();
                }
            }));
            DBSportDataStat dBSportDataStat3 = (DBSportDataStat) Collections.max(listU, Comparator.comparingLong(new ToLongFunction() { // from class: com.oplus.aiunit.vision.aei
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return ((DBSportDataStat) obj).getUpdateTimestamp();
                }
            }));
            DBSportDataStat dBSportDataStat4 = (DBSportDataStat) Collections.max(listK, Comparator.comparingLong(new ToLongFunction() { // from class: com.oplus.aiunit.vision.zdi
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return ((DBSportDataStat) obj).getTotalCalories();
                }
            }));
            DBSportDataStat dBSportDataStat5 = (DBSportDataStat) Collections.max(listK, Comparator.comparingLong(new ToLongFunction() { // from class: com.oplus.aiunit.vision.aei
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return ((DBSportDataStat) obj).getUpdateTimestamp();
                }
            }));
            if (dBSportDataStat.getTotalCalories() < dBSportDataStat4.getTotalCalories()) {
                dBSportDataStat = dBSportDataStat4;
            }
            updateTimestamp = Math.max(dBSportDataStat3.getUpdateTimestamp(), dBSportDataStat5.getUpdateTimestamp());
        }
        if (dBSportDataStat == null) {
            sj4.d("SportDataStatProcess", " saveTotalStat() dbSportDataStat is null, date is " + i);
            sj4.a("SportDataStatProcess", " saveTotalStat() dbSportDataStat is null, date is " + i + ", who = " + str);
            return;
        }
        dBSportDataStat.setUpdateTimestamp(updateTimestamp);
        dBSportDataStat.setSportMode(-2);
        dBSportDataStat.setTotalMoveAboutTimes(i3);
        dBSportDataStat.setSyncStatus(i2);
        DBSportDataStat dBSportDataStat6 = dBSportDataStat;
        if (mzi.s(dBSportDataStat.getTotalSteps(), dBSportDataStat.getTotalDistance(), dBSportDataStat.getTotalCalories(), dBSportDataStat.getTotalAltitudeOffset(), dBSportDataStat.getTotalWorkoutMinutes(), dBSportDataStat.getTotalMoveAboutTimes())) {
            DBSportDataStat dBSportDataStatI = this.f11036c.i(str, -2, i);
            if (dBSportDataStatI != null) {
                if (dBSportDataStatI.getSyncStatus() == 0) {
                    this.f11036c.v(dBSportDataStatI);
                    return;
                }
                dBSportDataStatI.setSyncStatus(2);
                dBSportDataStatI.setDisplay(2);
                this.f11036c.s(dBSportDataStatI);
                return;
            }
            return;
        }
        List<DBOneTimeSportStat> listA = this.d.a(str, f11035e, i);
        long totalCalories = dBSportDataStat6.getTotalCalories();
        int totalWorkoutMinutes = dBSportDataStat6.getTotalWorkoutMinutes();
        long totalCalories2 = dBSportDataStat6.getTotalCalories();
        if (rz.b(listA)) {
            dBSportDataStat2 = dBSportDataStat6;
        } else {
            for (DBOneTimeSportStat dBOneTimeSportStat : listA) {
                if (dBOneTimeSportStat.getSportMode() == -4) {
                    totalCalories += dBOneTimeSportStat.getTotalCalories();
                }
                totalCalories2 += dBOneTimeSportStat.getTotalCalories();
                totalWorkoutMinutes += (int) (dBOneTimeSportStat.getTotalDuration() / 60000);
            }
            dBSportDataStat2 = dBSportDataStat6;
            dBSportDataStat2.setTotalCalories(totalCalories2);
            dBSportDataStat2.setTotalWorkoutMinutes(totalWorkoutMinutes);
        }
        j(dBSportDataStat2, z, true);
        l(str, i, totalCalories, updateTimestamp);
    }

    public final void h(DBSportDataStat dBSportDataStat, List<Integer> list) {
        int iX;
        String ssoid = dBSportDataStat.getSsoid();
        ConcurrentHashMap<String, String> concurrentHashMapB = rei.INSTANCE.a().b(ssoid, this.a, list);
        for (Integer num : list) {
            String str = ssoid + "_" + num;
            int iIntValue = num.intValue();
            if (iIntValue == 0) {
                int iX2 = mzi.x(concurrentHashMapB.get(str));
                if (iX2 > 0) {
                    dBSportDataStat.setCurrentDayStepsGoal(iX2);
                }
            } else if (iIntValue == 5) {
                int iX3 = mzi.x(concurrentHashMapB.get(str));
                if (iX3 > 0) {
                    dBSportDataStat.setCurrentDayCaloriesGoal(iX3);
                }
            } else if (iIntValue == 6) {
                int iX4 = mzi.x(concurrentHashMapB.get(str));
                if (iX4 > 0) {
                    dBSportDataStat.setMjkTotalCaloriesGoal(iX4);
                }
            } else if (iIntValue == 7) {
                int iX5 = mzi.x(concurrentHashMapB.get(str));
                if (iX5 > 0) {
                    dBSportDataStat.setMjkIntakeCaloriesGoal(iX5);
                }
            } else if (iIntValue == 9) {
                int iX6 = mzi.x(concurrentHashMapB.get(str));
                if (iX6 > 0) {
                    dBSportDataStat.setCurrentDayWorkoutGoal(iX6);
                }
            } else if (iIntValue == 10 && (iX = mzi.x(concurrentHashMapB.get(str))) > 0) {
                dBSportDataStat.setCurrentDayMoveAboutTimesGoal(iX);
            }
        }
    }

    public synchronized void i(List<DBSportDataStat> list, boolean z, boolean z2) {
        ConcurrentHashMap<String, DBSportDataStat> concurrentHashMap = new ConcurrentHashMap<>();
        for (DBSportDataStat dBSportDataStat : list) {
            if (concurrentHashMap.get(dBSportDataStat.getSsoid() + "_" + dBSportDataStat.getDate() + "_" + dBSportDataStat.getSportMode()) == null) {
                for (DBSportDataStat dBSportDataStat2 : this.f11036c.d(dBSportDataStat.getSsoid(), dBSportDataStat.getDate(), dBSportDataStat.getDate())) {
                    concurrentHashMap.putIfAbsent(dBSportDataStat2.getSsoid() + "_" + dBSportDataStat2.getDate() + "_" + dBSportDataStat2.getSportMode(), dBSportDataStat2);
                }
            }
            k(dBSportDataStat, concurrentHashMap, z, z2);
        }
    }

    public boolean j(DBSportDataStat dBSportDataStat, boolean z, boolean z2) {
        return k(dBSportDataStat, null, z, z2);
    }

    public final synchronized boolean k(DBSportDataStat dBSportDataStat, ConcurrentHashMap<String, DBSportDataStat> concurrentHashMap, boolean z, boolean z2) {
        boolean z3;
        boolean zF;
        String ssoid = dBSportDataStat.getSsoid();
        int sportMode = dBSportDataStat.getSportMode();
        int date = dBSportDataStat.getDate();
        dBSportDataStat.setStartTimestamp(o15.q(o15.a(date)));
        dBSportDataStat.setEndTimestamp(o15.l(o15.a(date)));
        String str = dBSportDataStat.getSsoid() + "_" + dBSportDataStat.getDate() + "_" + dBSportDataStat.getSportMode();
        DBSportDataStat dBSportDataStatI = (concurrentHashMap == null || concurrentHashMap.get(str) == null) ? this.f11036c.i(ssoid, sportMode, date) : concurrentHashMap.get(str);
        sj4.c("SportDataStatProcess", String.format("insertOrUpdate() dbStat data:(date:%s, sportMode:%s, steps:%s, distance:%s, calories:%s, workouts:%s, floor:%s, syncStatus:%s, modifiedTime:%s, updateTimestamp:%s)", Integer.valueOf(date), Integer.valueOf(sportMode), Integer.valueOf(dBSportDataStat.getTotalSteps()), Integer.valueOf(dBSportDataStat.getTotalDistance()), Long.valueOf(dBSportDataStat.getTotalCalories()), Integer.valueOf(dBSportDataStat.getTotalWorkoutMinutes()), Integer.valueOf(dBSportDataStat.getTotalAltitudeOffset()), Integer.valueOf(dBSportDataStat.getSyncStatus()), Long.valueOf(dBSportDataStat.getModifiedTime()), Long.valueOf(dBSportDataStat.getUpdateTimestamp())));
        if (dBSportDataStatI != null) {
            sj4.c("SportDataStatProcess", String.format("insertOrUpdate() old data:(date:%s, sportMode:%s, steps:%s, distance:%s, calories:%s, workouts:%s, floor:%s, syncStatus:%s, modifiedTime:%s, updateTimestamp:%s)", Integer.valueOf(date), Integer.valueOf(sportMode), Integer.valueOf(dBSportDataStatI.getTotalSteps()), Integer.valueOf(dBSportDataStatI.getTotalDistance()), Long.valueOf(dBSportDataStatI.getTotalCalories()), Integer.valueOf(dBSportDataStatI.getTotalWorkoutMinutes()), Integer.valueOf(dBSportDataStatI.getTotalAltitudeOffset()), Integer.valueOf(dBSportDataStatI.getSyncStatus()), Long.valueOf(dBSportDataStatI.getModifiedTime()), Long.valueOf(dBSportDataStatI.getUpdateTimestamp())));
            e(dBSportDataStatI, dBSportDataStat);
            zF = f(dBSportDataStat, z, dBSportDataStatI);
            if (zF) {
                z3 = c(dBSportDataStat, sportMode, date, dBSportDataStatI) > 0;
                sj4.c("SportDataStatProcess", "insertOrUpdate() old data need update! sportMode = " + sportMode + ", date = " + date + ", result = " + z3);
            } else {
                z3 = true;
            }
        } else {
            z3 = b(dBSportDataStat, ssoid) > 0;
            sj4.c("SportDataStatProcess", " insertOrUpdate() insert result = " + z3 + ", date = " + date);
            zF = true;
        }
        if (z2 && zF && date == o15.i(System.currentTimeMillis())) {
            sj4.c("SportDataStatProcess", "insertOrUpdate() send stepSum changed broadcast");
            k72.f(this.a, 1, dBSportDataStat.getSsoid());
        }
        return z3;
    }

    public final void l(String str, int i, long j2, long j3) {
        DBSportDataStat dBSportDataStat = new DBSportDataStat();
        dBSportDataStat.setSportMode(-4);
        dBSportDataStat.setSsoid(str);
        dBSportDataStat.setTotalCalories(j2);
        dBSportDataStat.setDate(i);
        dBSportDataStat.setUpdateTimestamp(j3);
        dBSportDataStat.setSyncStatus(0);
        sj4.c("SportDataStatProcess", String.format("saveTotalStat() phoneConsumptionsStat data:(date:%s, sportMode:%s, steps:%s, distance:%s, calories:%s, workouts:%s, floor:%s, syncStatus:%s, modifiedTime:%s, updateTimestamp:%s)", Integer.valueOf(i), -4, Integer.valueOf(dBSportDataStat.getTotalSteps()), Integer.valueOf(dBSportDataStat.getTotalDistance()), Long.valueOf(dBSportDataStat.getTotalCalories()), Integer.valueOf(dBSportDataStat.getTotalWorkoutMinutes()), Integer.valueOf(dBSportDataStat.getTotalAltitudeOffset()), Integer.valueOf(dBSportDataStat.getSyncStatus()), Long.valueOf(dBSportDataStat.getModifiedTime()), Long.valueOf(dBSportDataStat.getUpdateTimestamp())));
        j(dBSportDataStat, false, false);
    }

    public final void m(DBSportDataStat dBSportDataStat) {
        if (dBSportDataStat.getDate() != o15.i(System.currentTimeMillis())) {
            sj4.c("SportDataStatProcess", "not today, don't check valid");
            return;
        }
        if (rxk.i(dBSportDataStat.getTotalSteps()) && rxk.g(dBSportDataStat.getTotalDistance()) && rxk.d(dBSportDataStat.getTotalCalories()) && rxk.c(dBSportDataStat.getTotalAltitudeOffset())) {
            if (dBSportDataStat.getSportMode() == -2) {
                yp9.c cVar = eb2.spData;
                cVar.W(cVar.B0(), eb2.spData.i0(), 0);
            }
            if (dBSportDataStat.getSyncStatus() == 2) {
                dBSportDataStat.setSyncStatus(0);
                return;
            }
            return;
        }
        if (dBSportDataStat.getDate() == o15.i(System.currentTimeMillis()) && dBSportDataStat.getSportMode() == -2) {
            yp9.c cVar2 = eb2.spData;
            cVar2.W(cVar2.B0(), eb2.spData.i0(), 1);
        }
        dBSportDataStat.setSyncStatus(2);
        dBSportDataStat.setUpdated(0);
    }
}