package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengineservice.db.AppDatabase;
import com.heytap.databaseengineservice.db.table.DBSportDataStat;
import com.heytap.databaseengineservice.db.table.DBUserInfo;
import com.heytap.databaseengineservice.db.table.weight.DBWeightBodyFat;
import com.heytap.databaseengineservice.store.stat.UserParaForStaticCal;
import com.xiaomi.mipush.sdk.Constants;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes15.dex */
public class dqi {
    public static final float[] MALE = {66.47f, 13.75f, 5.0f, 6.76f};
    public static final float[] FEMALE = {655.1f, 9.56f, 1.85f, 4.68f};

    public static int b(int i, int i2) {
        return ((i2 / 10000) - (i / 10000)) - (((i - 1) % 10000) / (i2 % 10000));
    }

    public static long c(long j2, long j3) {
        return (j3 - j2) / 86400000;
    }

    public static void d(List<DBWeightBodyFat> list, ConcurrentHashMap<Integer, Long> concurrentHashMap, String str, int i, int i2, int i3) {
        if (rz.b(list)) {
            return;
        }
        for (DBWeightBodyFat dBWeightBodyFat : list) {
            int iX = mzi.x(LocalDateTime.ofInstant(Instant.ofEpochMilli(dBWeightBodyFat.getMeasurementTime()), ZoneId.systemDefault()).toLocalDate().format(DateTimeFormatter.ofPattern("yyyyMMdd")));
            int iB = b(i, i3);
            int iX2 = mzi.x(dBWeightBodyFat.getWeight()) / 1000;
            if (UserInfo.SEX_FEMALE.equals(str)) {
                Integer numValueOf = Integer.valueOf(iX);
                float[] fArr = FEMALE;
                concurrentHashMap.put(numValueOf, Long.valueOf(((long) (((fArr[0] + (fArr[1] * iX2)) + (fArr[2] * i2)) - (fArr[3] * iB))) * 1000));
            } else {
                Integer numValueOf2 = Integer.valueOf(iX);
                float[] fArr2 = MALE;
                concurrentHashMap.put(numValueOf2, Long.valueOf(((long) (((fArr2[0] + (fArr2[1] * iX2)) + (fArr2[2] * i2)) - (fArr2[3] * iB))) * 1000));
            }
        }
    }

    public static long e(UserParaForStaticCal userParaForStaticCal, int i) {
        float weight;
        float f;
        int iB = b(userParaForStaticCal.getBirthday(), i);
        if (UserInfo.SEX_FEMALE.equals(userParaForStaticCal.getGender())) {
            float[] fArr = FEMALE;
            weight = fArr[0] + (fArr[1] * userParaForStaticCal.getWeight()) + (fArr[2] * userParaForStaticCal.getHeight());
            f = fArr[3];
        } else {
            float[] fArr2 = MALE;
            weight = fArr2[0] + (fArr2[1] * userParaForStaticCal.getWeight()) + (fArr2[2] * userParaForStaticCal.getHeight());
            f = fArr2[3];
        }
        return ((long) (weight - (f * iB))) * 1000;
    }

    public static UserParaForStaticCal f(DBUserInfo dBUserInfo) {
        int iX;
        int iX2;
        int iX3;
        String sex;
        sj4.c("StatStaticCalories", "userParaForStaticCal initUserInfo!");
        rt4.g(dBUserInfo, 2);
        String strReplace = UserInfo.BIRTHDAY_DEFAULT.replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
        if (dBUserInfo != null) {
            if (TextUtils.isEmpty(dBUserInfo.getHeight())) {
                dBUserInfo = AppDatabase.K(eb2.common.c()).e1().query(dBUserInfo.getSsoid());
                rt4.e(dBUserInfo, 2, eb2.dbDataEncrypt.D());
            }
            int iX4 = mzi.x(dBUserInfo.getHeight());
            int iX5 = mzi.x(dBUserInfo.getWeight());
            sex = dBUserInfo.getSex();
            iX3 = dBUserInfo.getBirthday() != null ? mzi.x(dBUserInfo.getBirthday().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "")) : 0;
            if (iX4 <= 0) {
                iX4 = mzi.x(UserInfo.HEIGHT_DEFAULT);
            }
            iX = iX4 / 10;
            if (iX5 <= 0) {
                iX5 = mzi.x("60000");
            }
            iX2 = iX5 / 1000;
            if (iX3 <= 0) {
                iX3 = mzi.x(strReplace);
            }
            rt4.g(dBUserInfo, 1);
            AppDatabase.K(eb2.common.c()).e1().b(dBUserInfo);
        } else {
            iX = mzi.x(UserInfo.HEIGHT_DEFAULT) / 10;
            iX2 = mzi.x("60000") / 1000;
            iX3 = mzi.x(strReplace);
            sex = "M";
        }
        UserParaForStaticCal userParaForStaticCal = new UserParaForStaticCal();
        userParaForStaticCal.setHeight(iX);
        userParaForStaticCal.setWeight(iX2);
        userParaForStaticCal.setGender(sex);
        userParaForStaticCal.setBirthday(iX3);
        sj4.a("StatStaticCalories", "userParaForStaticCal: " + userParaForStaticCal);
        return userParaForStaticCal;
    }

    public static /* synthetic */ int g(Integer num, Integer num2) {
        return Long.compare(num2.intValue(), num.intValue());
    }

    public static void h(Context context, int i, String str, int i2, int i3, List<DBSportDataStat> list) {
        sj4.c("StatStaticCalories", "setMjkStaticCal enter!");
        AppDatabase appDatabaseK = AppDatabase.K(context.getApplicationContext());
        List<DBSportDataStat> listR = appDatabaseK.O0().r(str, i2, i3, i);
        DBUserInfo dBUserInfoQuery = appDatabaseK.e1().query(str);
        List<DBWeightBodyFat> listK = appDatabaseK.h1().k(str, 0L, System.currentTimeMillis());
        UserParaForStaticCal userParaForStaticCalF = f(dBUserInfoQuery);
        int iM = i2;
        while (iM <= i3) {
            sj4.a("StatStaticCalories", "setMjkStaticCal, startDate start " + iM);
            DBSportDataStat dBSportDataStat = new DBSportDataStat();
            dBSportDataStat.setSportMode(i);
            dBSportDataStat.setDate(iM);
            j(str, userParaForStaticCalF, listK, dBSportDataStat);
            list.add(dBSportDataStat);
            iM = o15.m(o15.a(iM));
            sj4.a("StatStaticCalories", "setMjkStaticCal, startDate after " + iM);
        }
        if (rz.b(listR)) {
            return;
        }
        for (DBSportDataStat dBSportDataStat2 : listR) {
            list.set((int) c(o15.a(i2), o15.a(dBSportDataStat2.getDate())), dBSportDataStat2);
        }
    }

    public static void i(DBSportDataStat dBSportDataStat, ConcurrentHashMap<Integer, Long> concurrentHashMap, long j2) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Integer, Long>> it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.oplus.aiunit.vision.cqi
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return dqi.g((Integer) obj, (Integer) obj2);
            }
        });
        int date = dBSportDataStat.getDate();
        Long l2 = concurrentHashMap.get(Integer.valueOf(dBSportDataStat.getDate()));
        long jY = l2 != null ? mzi.y(String.valueOf(l2)) : 0L;
        boolean z = true;
        if (arrayList.size() == 1) {
            dBSportDataStat.setTotalStaticCal(jY);
            return;
        }
        if (arrayList.size() <= 1) {
            dBSportDataStat.setTotalStaticCal(j2);
            return;
        }
        int i = 0;
        while (true) {
            if (i >= arrayList.size() - 1) {
                z = false;
                break;
            }
            if (((Integer) arrayList.get(i)).intValue() > date) {
                int i2 = i + 1;
                if (((Integer) arrayList.get(i2)).intValue() < date) {
                    dBSportDataStat.setTotalStaticCal(mzi.y(String.valueOf(concurrentHashMap.get(arrayList.get(i2)))));
                    break;
                }
            }
            i++;
        }
        if (z) {
            return;
        }
        dBSportDataStat.setTotalStaticCal(j2);
    }

    public static void j(String str, UserParaForStaticCal userParaForStaticCal, List<DBWeightBodyFat> list, DBSportDataStat dBSportDataStat) {
        if (TextUtils.isEmpty(str)) {
            sj4.d("StatStaticCalories", "setTotalStaticCal ssoid is not valid!");
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        int date = dBSportDataStat.getDate();
        long jK = k(list, concurrentHashMap, userParaForStaticCal, date);
        sj4.c("StatStaticCalories", "today is: " + date + ", user info static cal: " + jK + ", weight static cal map: " + concurrentHashMap);
        i(dBSportDataStat, concurrentHashMap, jK);
    }

    public static long k(List<DBWeightBodyFat> list, ConcurrentHashMap<Integer, Long> concurrentHashMap, UserParaForStaticCal userParaForStaticCal, int i) {
        long jE = e(userParaForStaticCal, i);
        d(list, concurrentHashMap, userParaForStaticCal.getGender(), userParaForStaticCal.getBirthday(), userParaForStaticCal.getHeight(), i);
        return jE;
    }

    public static void l(Context context, DBUserInfo dBUserInfo, DBWeightBodyFat dBWeightBodyFat, List<Integer> list) {
        sj4.c("StatStaticCalories", "updateSportDataWhenUpdateUserInfoOrWeight enter!");
        AppDatabase appDatabaseK = AppDatabase.K(context.getApplicationContext());
        int iX = mzi.x(LocalDateTime.now().toLocalDate().format(DateTimeFormatter.ofPattern("yyyyMMdd")));
        List<DBSportDataStat> listP = appDatabaseK.O0().p(dBUserInfo.getSsoid(), list, iX);
        if (rz.b(listP)) {
            return;
        }
        UserParaForStaticCal userParaForStaticCalF = f(dBUserInfo);
        if (dBWeightBodyFat != null) {
            userParaForStaticCalF.setWeight(mzi.x(dBWeightBodyFat.getWeight()) / 1000);
        }
        long jE = e(userParaForStaticCalF, iX);
        for (DBSportDataStat dBSportDataStat : listP) {
            dBSportDataStat.setTotalStaticCal(jE);
            dBSportDataStat.setStaticCalSource(300);
            dBSportDataStat.setSyncStatus(0);
            dBSportDataStat.setUpdated(1);
        }
        sj4.c("StatStaticCalories", "updateSportDataWhenUpdateUserInfoOrWeight date: " + iX + ", static cal: " + jE);
        appDatabaseK.O0().b(listP);
    }
}