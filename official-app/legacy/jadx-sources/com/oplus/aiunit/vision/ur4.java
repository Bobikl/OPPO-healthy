package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.text.format.DateUtils;
import android.util.Pair;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.SportDataStat;
import com.heytap.databaseengine.option.DataReadOption;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes17.dex */
public class ur4 {

    public class a extends ao0<CommonBackBean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ List f17573j;
        public final /* synthetic */ CountDownLatch k;

        public a(List list, CountDownLatch countDownLatch) {
            this.f17573j = list;
            this.k = countDownLatch;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(CommonBackBean commonBackBean) {
            List<SportDataStat> list = (List) commonBackBean.getObj();
            if (list != null) {
                oqb.b("MedalLogic:DailySportAccomplishUtil", Integer.valueOf(list.size()));
                for (SportDataStat sportDataStat : list) {
                    if (ur4.e(sportDataStat)) {
                        this.f17573j.add(sportDataStat);
                        oqb.b("MedalLogic:DailySportAccomplishUtil", "reachGoal time ", Integer.valueOf(sportDataStat.getDate()));
                    }
                }
            }
            this.k.countDown();
        }
    }

    public static class b {
        public boolean a = false;
        public int b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17574c = -1;
        public int d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f17575e = 0;

        public int g() {
            return this.b;
        }

        public int h() {
            return this.f17574c;
        }

        public long i() {
            return this.f17575e;
        }

        public int j() {
            return this.d;
        }

        public String toString() {
            return "AccomplishMark{ahDate=" + this.b + ", ahLastDate=" + this.f17574c + ", times=" + this.d + '}';
        }
    }

    public static void b(List<SportDataStat> list, List<b> list2) {
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i + 3;
            if (i2 > size) {
                return;
            }
            int date = list.get(i2 - 1).getDate();
            int date2 = list.get(i).getDate();
            long jAbs = Math.abs(d(date, date2)) + 1;
            if (jAbs == 3) {
                oqb.a("MedalLogic:DailySportAccomplishUtil", "getAccomplishMark startDate: " + date2 + ",endDate: " + date + ",days: " + jAbs);
                b bVar = new b();
                SportDataStat sportDataStat = null;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    SportDataStat sportDataStat2 = list.get(i);
                    oqb.c("MedalLogic:DailySportAccomplishUtil", "find continuously check date", Integer.valueOf(sportDataStat2.getDate()));
                    if (i != size - 1) {
                        if (!(i3 < 3 || Math.abs(d(sportDataStat.getDate(), sportDataStat2.getDate())) == 1)) {
                            bVar.b = list.get(i - i4).getDate();
                            bVar.f17574c = sportDataStat.getDate();
                            bVar.d = i4;
                            list2.add(bVar);
                            oqb.c("MedalLogic:DailySportAccomplishUtil", "find continuously data times", Integer.valueOf(i4), "end data ", Integer.valueOf(sportDataStat.getDate()));
                            i--;
                            break;
                        }
                        i4++;
                        i++;
                        i3++;
                        sportDataStat = sportDataStat2;
                    } else {
                        int i5 = i4 + 1;
                        bVar.b = list.get((i - i5) + 1).getDate();
                        bVar.f17574c = list.get(i).getDate();
                        bVar.d = i5;
                        list2.add(bVar);
                        oqb.c("MedalLogic:DailySportAccomplishUtil", "find last one continuously data times", Integer.valueOf(i5), "end data ", Integer.valueOf(sportDataStat2.getDate()));
                        break;
                    }
                }
            }
            i++;
        }
    }

    public static Pair<b, List<b>> c(long j2, long j3) {
        long j4 = j2 - 86400000;
        List<SportDataStat> listF = f(j4, j3);
        ArrayList arrayList = new ArrayList();
        b bVar = new b();
        int i = 0;
        if (!e93.b(listF)) {
            return Pair.create(bVar, arrayList);
        }
        SportDataStat sportDataStat = listF.get(listF.size() - 1);
        if (DateUtils.isToday(v05.a(sportDataStat.getDate())) || DateUtils.isToday(v05.a(sportDataStat.getDate()) + 86400000)) {
            bVar.f17574c = sportDataStat.getDate();
            int size = listF.size() - 1;
            SportDataStat sportDataStat2 = null;
            int i2 = 0;
            while (size >= 0) {
                SportDataStat sportDataStat3 = listF.get(size);
                if (!(sportDataStat2 == null || Math.abs(d(sportDataStat2.getDate(), sportDataStat3.getDate())) == 1)) {
                    break;
                }
                i2++;
                listF.remove(size);
                bVar.b = sportDataStat3.getDate();
                size--;
                sportDataStat2 = sportDataStat3;
            }
            i = i2;
        }
        bVar.f17575e = j2;
        bVar.d = i;
        if (Math.abs(j4 - v05.a(bVar.b)) < 1) {
            i(bVar, v05.a(bVar.b));
        }
        oqb.c("MedalLogic:DailySportAccomplishUtil", "continuouslyAccomplishMarks ==> progress ", bVar);
        b(listF, arrayList);
        oqb.c("MedalLogic:DailySportAccomplishUtil", "continuouslyAccomplishMarks ", arrayList);
        return Pair.create(bVar, arrayList);
    }

    public static int d(int i, int i2) {
        return (int) ((v05.a(i2) - v05.a(i)) / 86400000);
    }

    public static boolean e(SportDataStat sportDataStat) {
        return sportDataStat.getTotalSteps() >= sportDataStat.getCurrentDayStepsGoal() && sportDataStat.getTotalCalories() >= ((long) sportDataStat.getCurrentDayCaloriesGoal()) && sportDataStat.getTotalMoveAboutTimes() >= sportDataStat.getCurrentDayMoveAboutTimesGoal() && sportDataStat.getTotalWorkoutMinutes() >= sportDataStat.getCurrentDayWorkoutGoal();
    }

    @SuppressLint({"DefaultLocale"})
    public static List<SportDataStat> f(long j2, long j3) {
        return g(j2, System.currentTimeMillis(), j3);
    }

    public static List<SportDataStat> g(long j2, long j3, long j4) {
        ArrayList arrayList = new ArrayList();
        String ssoid = um.c().getSsoid();
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(ssoid);
        dataReadOption.setStartTime(Math.min(j2, j3 - 86400000));
        dataReadOption.setEndTime(j3);
        dataReadOption.setReadSportMode(-3);
        dataReadOption.setDataTable(1002);
        dataReadOption.setReadSportMode(-2);
        dataReadOption.setAggregateType(106);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).subscribe(new a(arrayList, countDownLatch));
        try {
            countDownLatch.await(j4, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            oqb.d(e2);
        }
        oqb.a("MedalLogic:DailySportAccomplishUtil", String.format("读取每日活动 > 开始时间:%tD  , end time:%tD ", Long.valueOf(j2), Long.valueOf(System.currentTimeMillis())));
        if (e93.b(arrayList)) {
            oqb.a("MedalLogic:DailySportAccomplishUtil", String.format("loadStat readTime:%tD, data size:%d", Long.valueOf(j2), Integer.valueOf(arrayList.size())));
        }
        return arrayList;
    }

    public static int h(int i, int i2) {
        return v05.i(v05.a(i) + (((long) i2) * 86400000));
    }

    public static void i(b bVar, long j2) {
        long j3 = j2 - 86400000;
        oqb.c("MedalLogic:DailySportAccomplishUtil", "find readMoreData data times", bVar, "end data ", Long.valueOf(j3));
        List<SportDataStat> listG = g(j2 - 691200000, j3, 10000L);
        if (e93.b(listG) && Math.abs(v05.a(bVar.b) - v05.a(listG.get(listG.size() - 1).getDate())) == 1) {
            for (int size = listG.size() - 1; size >= 0; size--) {
                SportDataStat sportDataStat = listG.get(size);
                if (!(sportDataStat == null || Math.abs(d(sportDataStat.getDate(), sportDataStat.getDate())) == 1)) {
                    return;
                }
                bVar.d++;
                listG.remove(size);
                bVar.b = sportDataStat.getDate();
            }
        }
    }
}
