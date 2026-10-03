package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.SportDataStat;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.health.daily.bean.DailyActivityCalendarDayBean;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class jq2 {
    public String a = um.c().getSsoid();

    public class a extends ao0<CommonBackBean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ LocalDate f12979j;
        public final /* synthetic */ int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f12980l;

        public a(LocalDate localDate, int i, MutableLiveData mutableLiveData) {
            this.f12979j = localDate;
            this.k = i;
            this.f12980l = mutableLiveData;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(CommonBackBean commonBackBean) {
            List<SportDataStat> list = (List) commonBackBean.getObj();
            HashMap map = new HashMap();
            LocalDate localDate = this.f12979j;
            for (int i = 0; i < this.k; i++) {
                int iLengthOfMonth = localDate.lengthOfMonth();
                for (int i2 = 0; i2 < iLengthOfMonth; i2++) {
                    DailyActivityCalendarDayBean dailyActivityCalendarDayBean = new DailyActivityCalendarDayBean();
                    dailyActivityCalendarDayBean.setCalories(0);
                    dailyActivityCalendarDayBean.setSteps(0);
                    dailyActivityCalendarDayBean.setActives(0);
                    dailyActivityCalendarDayBean.setTimes(0);
                    dailyActivityCalendarDayBean.setCaloriesTarget(100);
                    dailyActivityCalendarDayBean.setStepsTarget(100);
                    dailyActivityCalendarDayBean.setActivesTarget(100);
                    dailyActivityCalendarDayBean.setTimesTarget(100);
                    dailyActivityCalendarDayBean.setDate(localDate);
                    map.put(localDate, dailyActivityCalendarDayBean);
                    localDate.plusDays(1L);
                }
            }
            if (list != null) {
                for (SportDataStat sportDataStat : list) {
                    LocalDate localDateOf = LocalDate.of(sportDataStat.getDate() / 10000, (sportDataStat.getDate() / 100) % 100, sportDataStat.getDate() % 100);
                    DailyActivityCalendarDayBean dailyActivityCalendarDayBean2 = new DailyActivityCalendarDayBean();
                    dailyActivityCalendarDayBean2.setCalories((int) (sportDataStat.getTotalCalories() / 1000));
                    dailyActivityCalendarDayBean2.setSteps(sportDataStat.getTotalSteps());
                    dailyActivityCalendarDayBean2.setActives(sportDataStat.getTotalMoveAboutTimes());
                    dailyActivityCalendarDayBean2.setTimes(sportDataStat.getTotalWorkoutMinutes());
                    dailyActivityCalendarDayBean2.setCaloriesTarget(sportDataStat.getCurrentDayCaloriesGoal() / 1000);
                    dailyActivityCalendarDayBean2.setStepsTarget(sportDataStat.getCurrentDayStepsGoal());
                    dailyActivityCalendarDayBean2.setActivesTarget(sportDataStat.getCurrentDayMoveAboutTimesGoal());
                    dailyActivityCalendarDayBean2.setTimesTarget(sportDataStat.getCurrentDayWorkoutGoal());
                    dailyActivityCalendarDayBean2.setDate(localDateOf);
                    dailyActivityCalendarDayBean2.setGoalComplete(sportDataStat.getDayGoalComplete());
                    map.put(localDateOf, dailyActivityCalendarDayBean2);
                }
            }
            this.f12980l.postValue(map);
        }
    }

    public class b extends ao0<CommonBackBean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ LocalDate f12981j;
        public final /* synthetic */ int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f12982l;

        public b(LocalDate localDate, int i, MutableLiveData mutableLiveData) {
            this.f12981j = localDate;
            this.k = i;
            this.f12982l = mutableLiveData;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(CommonBackBean commonBackBean) {
            LocalDate localDate;
            int i;
            HashMap map;
            b bVar = this;
            List list = (List) commonBackBean.getObj();
            HashMap map2 = new HashMap();
            LocalDate localDatePlusMonths = bVar.f12981j;
            int i2 = 0;
            int i3 = 0;
            while (i3 < bVar.k) {
                qp4 qp4Var = new qp4();
                qp4Var.k(i2);
                qp4Var.n(i2);
                qp4Var.m(i2);
                qp4Var.o(i2);
                qp4Var.l(i2);
                qp4Var.j(localDatePlusMonths);
                qp4Var.r(i2);
                qp4Var.s(i2);
                qp4Var.q(i2);
                qp4Var.p(i2);
                qp4Var.t(i2);
                if (list != null) {
                    Iterator it = list.iterator();
                    int i4 = i2;
                    int dayGoalComplete = i4;
                    int totalSteps = dayGoalComplete;
                    int totalCalories = totalSteps;
                    int totalWorkoutMinutes = totalCalories;
                    int totalMoveAboutTimes = totalWorkoutMinutes;
                    int i5 = totalMoveAboutTimes;
                    int i6 = i5;
                    int i7 = i6;
                    while (it.hasNext()) {
                        SportDataStat sportDataStat = (SportDataStat) it.next();
                        Iterator it2 = it;
                        int date = (sportDataStat.getDate() / 100) % 100;
                        int date2 = sportDataStat.getDate() / 10000;
                        int i8 = i3;
                        int monthValue = localDatePlusMonths.getMonthValue();
                        HashMap map3 = map2;
                        int year = localDatePlusMonths.getYear();
                        if (date == monthValue && date2 == year) {
                            totalSteps += sportDataStat.getTotalSteps();
                            totalCalories += (int) (sportDataStat.getTotalCalories() / 1000);
                            totalWorkoutMinutes += sportDataStat.getTotalWorkoutMinutes();
                            totalMoveAboutTimes += sportDataStat.getTotalMoveAboutTimes();
                            if (sportDataStat.getTotalSteps() > 0 || sportDataStat.getTotalCalories() >= 1000 || sportDataStat.getTotalWorkoutMinutes() > 0 || sportDataStat.getTotalMoveAboutTimes() > 0) {
                                i5++;
                            }
                            if (sportDataStat.getTotalSteps() > 0) {
                                i6++;
                            }
                            if (sportDataStat.getTotalCalories() >= 1000) {
                                i7++;
                            }
                            if (sportDataStat.getTotalWorkoutMinutes() > 0) {
                                i4++;
                            }
                            if (sportDataStat.getTotalMoveAboutTimes() > 0) {
                                i2++;
                            }
                            dayGoalComplete += sportDataStat.getDayGoalComplete();
                        }
                        localDatePlusMonths = localDatePlusMonths;
                        i3 = i8;
                        it = it2;
                        map2 = map3;
                    }
                    localDate = localDatePlusMonths;
                    i = i3;
                    qp4Var.k(dayGoalComplete);
                    qp4Var.n(totalSteps);
                    qp4Var.m(totalCalories);
                    qp4Var.o(totalWorkoutMinutes);
                    qp4Var.l(totalMoveAboutTimes);
                    qp4Var.r(i5);
                    qp4Var.s(i6);
                    qp4Var.q(i7);
                    qp4Var.p(i2);
                    qp4Var.t(i4);
                    map = map2;
                } else {
                    localDate = localDatePlusMonths;
                    i = i3;
                    map = map2;
                }
                map.put(localDate, qp4Var);
                localDatePlusMonths = localDate.plusMonths(1L);
                i3 = i + 1;
                bVar = this;
                map2 = map;
                list = list;
                i2 = 0;
            }
            bVar.f12982l.postValue(map2);
        }
    }

    public void a(MutableLiveData<Map<LocalDate, DailyActivityCalendarDayBean>> mutableLiveData) {
        LocalDate localDateOf = LocalDate.of(2019, 1, 1);
        long epochMilli = localDateOf.with(TemporalAdjusters.firstDayOfMonth()).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        int iB = m05.INSTANCE.b(localDateOf, LocalDate.now()) + 1;
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.a);
        dataReadOption.setStartTime(epochMilli);
        dataReadOption.setEndTime(System.currentTimeMillis());
        dataReadOption.setReadSportMode(v9g.w().z("daily_step_sport_mode", -2));
        dataReadOption.setAggregateType(108);
        dataReadOption.setDataTable(1002);
        SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).L0(su8.c()).subscribe(new a(localDateOf, iB, mutableLiveData));
    }

    public void b(MutableLiveData<Map<LocalDate, qp4>> mutableLiveData) {
        LocalDate localDateOf = LocalDate.of(2019, 1, 1);
        long epochMilli = localDateOf.with(TemporalAdjusters.firstDayOfMonth()).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        int iB = m05.INSTANCE.b(localDateOf, LocalDate.now()) + 1;
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.a);
        dataReadOption.setStartTime(epochMilli);
        dataReadOption.setEndTime(System.currentTimeMillis());
        dataReadOption.setReadSportMode(v9g.w().z("daily_step_sport_mode", -2));
        dataReadOption.setAggregateType(108);
        dataReadOption.setDataTable(1002);
        SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).L0(su8.c()).subscribe(new b(localDateOf, iB, mutableLiveData));
    }

    public void c(@NonNull String str) {
        this.a = str;
    }
}
