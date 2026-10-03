package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.RunExtra;
import com.heytap.databaseengine.model.SportMetaData;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.Vo2MaxExtra;
import com.heytap.databaseengineservice.db.AppDatabase;
import com.heytap.databaseengineservice.db.table.DBOneTimeSport;
import com.heytap.databaseengineservice.db.table.DBTrackMetadata;
import com.heytap.databaseengineservice.db.table.DBUserInfo;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class tvi {
    public static final int EIGHT_NIGHT_HOUR = 20;
    public static final int EMPTY_DATA_INSERT = -1;
    public static final int SLEEP_IN_DEFAULT_MINUTES = 1200;
    public static final int SLEEP_OUT_DEFAULT_MINUTES = 1920;
    public static final long START_TIME_ERROR_BORDER = 1420041600000L;
    public static final Integer[] FitnessModes = {9, 12, 31, 32, 33, 34, 35, 38};
    public static final Integer[] NO_STEPS_SPORTS = {9, 12, 3};
    public static final Integer[] STEPS_STAT_MODE = {-2, -4, -3};

    public static void A(@NonNull JSONObject jSONObject, String str, int i) throws JSONException {
        if (p(Integer.valueOf(i))) {
            return;
        }
        jSONObject.put(str, i);
    }

    public static void B(@NonNull JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            int i = Integer.parseInt(str2);
            if (p(Integer.valueOf(i))) {
                return;
            }
            jSONObject.put(str, i);
        } catch (NumberFormatException unused) {
        }
    }

    public static boolean C(Float f) {
        return f == null || f.floatValue() < 0.0f || f.floatValue() > 26.0f;
    }

    public static void D(List<DBOneTimeSport> list) {
        cj4.c("StoreUtil", "saveSportMetadata start...");
        if (hz.b(list)) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        mei meiVar = new mei();
        for (DBOneTimeSport dBOneTimeSport : list) {
            if (!t(dBOneTimeSport.getClientDataId())) {
                if (2 == dBOneTimeSport.getDisplay()) {
                    meiVar.f13538c.P0().c(dBOneTimeSport.getSsoid(), dBOneTimeSport.getStartTimestamp(), dBOneTimeSport.getTimestamp(), dBOneTimeSport.getSportMode());
                } else {
                    f(copyOnWriteArrayList, dBOneTimeSport);
                }
            }
        }
        cj4.c("StoreUtil", "saveSportMetadata data list size:" + copyOnWriteArrayList.size());
        meiVar.c(copyOnWriteArrayList);
    }

    public static void E(List<DBTrackMetadata> list, DBOneTimeSport dBOneTimeSport) {
        SportMetaData sportMetaData = (SportMetaData) sc8.a(dBOneTimeSport.getMetaData(), SportMetaData.class);
        if (sportMetaData != null) {
            DBTrackMetadata dBTrackMetadata = new DBTrackMetadata();
            dBTrackMetadata.setAvgPace(sportMetaData.getModifiedTotalDistance() > 0 ? (int) (sportMetaData.getTotalTime() / ((long) sportMetaData.getModifiedTotalDistance())) : sportMetaData.getAvgPace());
            dBTrackMetadata.setBestPace(sportMetaData.getBestPace());
            dBTrackMetadata.setAvgHR(sportMetaData.getAvgHeartRate());
            dBTrackMetadata.setMaxHR(sportMetaData.getMaxHeartRate());
            dBTrackMetadata.setMinHR(sportMetaData.getMinHeartRate());
            dBTrackMetadata.setAvgStepRate(sportMetaData.getAvgStepRate());
            dBTrackMetadata.setBestStepRate(sportMetaData.getBestStepRate());
            dBTrackMetadata.setTotalDistance(sportMetaData.getModifiedTotalDistance() > 0 ? sportMetaData.getModifiedTotalDistance() : sportMetaData.getTotalDistance());
            dBTrackMetadata.setTotalCalories(sportMetaData.getModifiedTotalDistance() > 0 ? (long) (qa2.dataProcess.y(((double) sportMetaData.getModifiedTotalDistance()) / 1000.0d, dBOneTimeSport.getSportMode(), 0.0d) * 1000.0d) : sportMetaData.getTotalCalories());
            dBTrackMetadata.setTotalSteps(sportMetaData.getTotalSteps());
            dBTrackMetadata.setTotalTime(sportMetaData.getTotalTime());
            dBTrackMetadata.setTotalClimb(sportMetaData.getTotalClimb());
            dBTrackMetadata.setSportName(sportMetaData.getSportName());
            dBTrackMetadata.setAbnormalTrack(sportMetaData.getAbnormalTrack());
            dBTrackMetadata.setSsoid(dBOneTimeSport.getSsoid());
            dBTrackMetadata.setSportMode(dBOneTimeSport.getSportMode());
            dBTrackMetadata.setDeviceUniqueId(dBOneTimeSport.getDeviceUniqueId());
            dBTrackMetadata.setDeviceCategory(TextUtils.isEmpty(dBOneTimeSport.getDeviceType()) ? op5.PHONE : dBOneTimeSport.getDeviceType());
            dBTrackMetadata.setStartTimestamp(dBOneTimeSport.getStartTimestamp());
            dBTrackMetadata.setEndTimestamp(dBOneTimeSport.getTimestamp());
            dBTrackMetadata.setClientDataId(dBOneTimeSport.getClientDataId());
            dBTrackMetadata.setDate(v05.i(dBOneTimeSport.getStartTimestamp()));
            dBTrackMetadata.setTimezone(dBOneTimeSport.getTimezone());
            if (sportMetaData.getRunExtra() != null) {
                dBTrackMetadata.setRunExtra(sportMetaData.getRunExtra());
            }
            dBTrackMetadata.setExtension(String.valueOf(dBOneTimeSport.getSource()));
            list.add(dBTrackMetadata);
        }
    }

    public static void F(List<DBOneTimeSport> list) {
        cj4.c("StoreUtil", "saveTrackMetadata start...");
        if (hz.b(list)) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        p6k p6kVar = new p6k();
        for (DBOneTimeSport dBOneTimeSport : list) {
            if (!t(dBOneTimeSport.getClientDataId())) {
                if (2 == dBOneTimeSport.getDisplay()) {
                    p6kVar.f13538c.X0().c(dBOneTimeSport.getSsoid(), dBOneTimeSport.getStartTimestamp(), dBOneTimeSport.getTimestamp(), dBOneTimeSport.getSportMode());
                } else {
                    E(copyOnWriteArrayList, dBOneTimeSport);
                }
            }
        }
        cj4.c("StoreUtil", "saveTrackMetadata data list size:" + copyOnWriteArrayList.size());
        p6kVar.c(copyOnWriteArrayList);
    }

    public static void G(Context context, String str) {
        DBUserInfo dBUserInfoQuery = AppDatabase.K(context.getApplicationContext()).e1().query(str);
        if (dBUserInfoQuery == null) {
            cj4.c("StoreUtil", "sendBodyProperties2Device dbUserInfo is null!");
            return;
        }
        bt4.g(dBUserInfoQuery, 2);
        String birthday = dBUserInfoQuery.getBirthday();
        String height = dBUserInfoQuery.getHeight();
        String weight = dBUserInfoQuery.getWeight();
        if (TextUtils.isEmpty(birthday)) {
            birthday = UserInfo.BIRTHDAY_DEFAULT;
        }
        if (TextUtils.isEmpty(height)) {
            height = UserInfo.HEIGHT_DEFAULT;
        }
        if (TextUtils.isEmpty(weight)) {
            weight = "60000";
        }
        w62.w(context, birthday.replace("-", "") + "," + (x(height) / 10) + "," + (x(weight) / 1000) + "," + ("M".equals(dBUserInfoQuery.getSex()) ? 1 : 0) + "," + weight + "," + dBUserInfoQuery.getModifiedTime() + "," + dBUserInfoQuery.getBloodPressureType());
    }

    public static boolean H(Integer num) {
        return num == null || num.intValue() < 1073741824;
    }

    public static void I(List<DBSportMetadata> list, DBSportMetadata dBSportMetadata, int i, double d, double d2) {
        DBSportMetadata dBSportMetadataCopyData = dBSportMetadata.copyData();
        if (d > d2) {
            dBSportMetadataCopyData.setType(i);
            dBSportMetadataCopyData.setValue(d);
            list.add(dBSportMetadataCopyData);
        }
    }

    public static boolean J(Integer num) {
        return num == null || num.intValue() < 0 || num.intValue() > 255;
    }

    public static boolean K(Integer num) {
        return num == null || num.intValue() < 60 || num.intValue() > 100;
    }

    public static boolean L(Integer num) {
        return num == null || num.intValue() <= 0 || num.intValue() > 100;
    }

    public static String M(String str) {
        try {
            return w7m.c(str);
        } catch (Exception e2) {
            cj4.b("StoreUtil", "uncompressData Exception e = " + e2.getMessage());
            return null;
        }
    }

    public static String N(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            JSONObject jSONObject2 = !TextUtils.isEmpty(str) ? new JSONObject(str) : new JSONObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.put(next, jSONObject.getString(next));
            }
            return jSONObject2.toString();
        } catch (JSONException e2) {
            cj4.b("StoreUtil", "update metadata JSONException e = " + e2.getMessage());
            return str;
        } catch (Exception e3) {
            cj4.b("StoreUtil", "update metadata e = " + e3.getMessage());
            return str;
        }
    }

    public static boolean O(Integer num) {
        return num == null || num.intValue() <= 0 || num.intValue() > 10000;
    }

    public static boolean a(Integer num) {
        return num == null || num.intValue() < 0 || num.intValue() > 100;
    }

    public static boolean b(Integer num) {
        return num == null || num.intValue() <= 0 || num.intValue() > 140;
    }

    public static boolean c(Integer num) {
        return num == null || num.intValue() < 60 || num.intValue() > 300;
    }

    public static boolean d(Double d) {
        return d == null || d.doubleValue() <= 0.0d || d.doubleValue() > 120.0d;
    }

    public static boolean e(Integer num) {
        return num == null || num.intValue() < 60 || num.intValue() > 500;
    }

    public static void f(List<DBSportMetadata> list, DBOneTimeSport dBOneTimeSport) {
        SportMetaData sportMetaData = (SportMetaData) sc8.a(dBOneTimeSport.getMetaData(), SportMetaData.class);
        if (sportMetaData != null) {
            DBSportMetadata dBSportMetadata = new DBSportMetadata();
            dBSportMetadata.setSsoid(dBOneTimeSport.getSsoid());
            dBSportMetadata.setDataClient(dBOneTimeSport.getDeviceUniqueId());
            dBSportMetadata.setClientModel(TextUtils.isEmpty(dBOneTimeSport.getDeviceType()) ? op5.PHONE : dBOneTimeSport.getDeviceType());
            dBSportMetadata.setStartTimestamp(dBOneTimeSport.getStartTimestamp());
            dBSportMetadata.setEndTimestamp(dBOneTimeSport.getTimestamp());
            dBSportMetadata.setClientDataId(dBOneTimeSport.getClientDataId());
            dBSportMetadata.setSportMode(dBOneTimeSport.getSportMode());
            dBSportMetadata.setSportName(sportMetaData.getSportName());
            dBSportMetadata.setAbnormalTrack(sportMetaData.getAbnormalTrack());
            m(sportMetaData, list, dBSportMetadata);
            n(sportMetaData, list, dBSportMetadata);
            l(dBOneTimeSport, sportMetaData, list, dBSportMetadata);
        }
    }

    public static long g(long j2, boolean z) {
        String str = new SimpleDateFormat(v05.DATE_FORMAT_HOUR, Locale.ENGLISH).format(new Date(j2));
        if (hz.a(str)) {
            if (z) {
                return h27.FAMILY_PULL_REFRESH_DELAY;
            }
            return 1920L;
        }
        long j3 = Long.parseLong(str.split(":")[0]);
        if (j3 < 20) {
            j3 += 24;
        }
        return (j3 * 60) + Long.parseLong(str.split(":")[1]);
    }

    public static String h(String str) {
        try {
            return w7m.a(str);
        } catch (Exception e2) {
            cj4.b("StoreUtil", "compressData Exception e = " + e2.getMessage());
            return null;
        }
    }

    public static boolean i(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return false;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return true;
        }
        return !str.equals(str2);
    }

    public static boolean j(Integer num) {
        return num == null || num.intValue() < 0 || num.intValue() > 3;
    }

    public static boolean k(Integer num) {
        return num == null || num.intValue() < 0 || num.intValue() > 10;
    }

    public static void l(DBOneTimeSport dBOneTimeSport, SportMetaData sportMetaData, List<DBSportMetadata> list, DBSportMetadata dBSportMetadata) {
        I(list, dBSportMetadata, 600020, sportMetaData.getModifiedTotalDistance() > 0 ? (int) (sportMetaData.getTotalTime() / ((long) sportMetaData.getModifiedTotalDistance())) : sportMetaData.getAvgPace(), -1.0d);
        I(list, dBSportMetadata, 600021, sportMetaData.getBestPace(), 0.0d);
        I(list, dBSportMetadata, 600022, sportMetaData.getAvgHeartRate(), -1.0d);
        I(list, dBSportMetadata, 600023, sportMetaData.getMaxHeartRate(), 0.0d);
        I(list, dBSportMetadata, 600024, sportMetaData.getMinHeartRate(), 0.0d);
        I(list, dBSportMetadata, 600025, sportMetaData.getAvgStepRate(), -1.0d);
        I(list, dBSportMetadata, 600026, sportMetaData.getBestStepRate(), 0.0d);
        I(list, dBSportMetadata, 600027, sportMetaData.getModifiedTotalDistance() > 0 ? sportMetaData.getModifiedTotalDistance() : sportMetaData.getTotalDistance(), -1.0d);
        I(list, dBSportMetadata, 600028, sportMetaData.getModifiedTotalDistance() > 0 ? (long) (qa2.dataProcess.y(((double) sportMetaData.getModifiedTotalDistance()) / 1000.0d, dBOneTimeSport.getSportMode(), 0.0d) * 1000.0d) : sportMetaData.getTotalCalories(), -1.0d);
        I(list, dBSportMetadata, 600029, sportMetaData.getTotalSteps(), 0.0d);
        I(list, dBSportMetadata, 600030, sportMetaData.getTotalTime(), -1.0d);
        I(list, dBSportMetadata, 600031, sportMetaData.getTotalClimb(), 0.0d);
        I(list, dBSportMetadata, 600032, 1.0d, 0.0d);
        I(list, dBSportMetadata, 600045, sportMetaData.getFatigue(), -1.0d);
        I(list, dBSportMetadata, 600046, sportMetaData.getPhysicalFitness(), -1.0d);
        I(list, dBSportMetadata, 600047, sportMetaData.getExerciseLoad(), -1.0d);
    }

    public static void m(SportMetaData sportMetaData, List<DBSportMetadata> list, DBSportMetadata dBSportMetadata) {
        RunExtra runExtra = sportMetaData.getRunExtra() != null ? (RunExtra) sc8.a(sportMetaData.getRunExtra(), RunExtra.class) : null;
        if (runExtra == null) {
            return;
        }
        I(list, dBSportMetadata, 600001, runExtra.getActiveDuration(), 0.0d);
        I(list, dBSportMetadata, 600002, runExtra.getMaxSwingSpeed(), 0.0d);
        I(list, dBSportMetadata, 600003, runExtra.getAvgSwingFreq(), 0.0d);
        I(list, dBSportMetadata, 600004, runExtra.getMaxSwingFreq(), 0.0d);
        I(list, dBSportMetadata, 600005, runExtra.getMaxTribble(), 0.0d);
        I(list, dBSportMetadata, 600006, runExtra.getOverHandNum(), 0.0d);
        I(list, dBSportMetadata, 600007, runExtra.getUnderHandNum(), 0.0d);
        I(list, dBSportMetadata, 600008, runExtra.getForeHandNum(), 0.0d);
        I(list, dBSportMetadata, 600009, runExtra.getBackHandNum(), 0.0d);
        I(list, dBSportMetadata, 600012, runExtra.getAvgPower(), 0.0d);
        I(list, dBSportMetadata, 600013, runExtra.getAvgStance(), -1.0d);
        I(list, dBSportMetadata, 600014, runExtra.getAvgVertical(), -1.0d);
        I(list, dBSportMetadata, 600015, runExtra.getAvgVerticalRatio(), -1.0d);
        I(list, dBSportMetadata, 600016, runExtra.getAvgBalance(), -2.0d);
        I(list, dBSportMetadata, 600017, runExtra.getStanceTimeEvaluate(), 0.0d);
        I(list, dBSportMetadata, 600018, runExtra.getStanceBalanceEvaluate(), 0.0d);
        I(list, dBSportMetadata, 600019, runExtra.getVerticalEvaluate(), 0.0d);
        I(list, dBSportMetadata, 600033, runExtra.getFatTime(), 0.0d);
        I(list, dBSportMetadata, 600039, runExtra.getWarnUpHrmLower(), 0.0d);
        I(list, dBSportMetadata, 600040, runExtra.getWarnUpHrmUpper(), 0.0d);
        I(list, dBSportMetadata, 600041, runExtra.getReducingFatHrmUpper(), 0.0d);
        I(list, dBSportMetadata, 600042, runExtra.getStaminaHrmUpper(), 0.0d);
        I(list, dBSportMetadata, 600043, runExtra.getAerobicHrmUpper(), 0.0d);
        I(list, dBSportMetadata, 600044, runExtra.getLimitHrmUpper(), 0.0d);
        if (!hz.b(runExtra.getHrZone()) && runExtra.getHrZone().size() >= 5) {
            I(list, dBSportMetadata, 600034, runExtra.getHrZone().get(0).intValue(), 0.0d);
            I(list, dBSportMetadata, 600035, runExtra.getHrZone().get(1).intValue(), 0.0d);
            I(list, dBSportMetadata, 600036, runExtra.getHrZone().get(2).intValue(), 0.0d);
            I(list, dBSportMetadata, 600037, runExtra.getHrZone().get(3).intValue(), 0.0d);
            I(list, dBSportMetadata, 600038, runExtra.getHrZone().get(4).intValue(), 0.0d);
        }
        I(list, dBSportMetadata, 600048, runExtra.getBestFatBurningDuration(), -1.0d);
        I(list, dBSportMetadata, 600049, runExtra.getFatBurning(), -1.0d);
        I(list, dBSportMetadata, 600050, runExtra.getTotalCal(), -1.0d);
        I(list, dBSportMetadata, 600051, runExtra.getFatBurningHrmMin(), -1.0d);
        I(list, dBSportMetadata, 600052, runExtra.getFatBurningHrmMax(), -1.0d);
    }

    public static void n(SportMetaData sportMetaData, List<DBSportMetadata> list, DBSportMetadata dBSportMetadata) {
        Vo2MaxExtra vo2MaxExtra = sportMetaData.getVo2MaxExtra();
        if (vo2MaxExtra == null) {
            return;
        }
        I(list, dBSportMetadata, 600010, vo2MaxExtra.getAerobicTE(), -2.0d);
        I(list, dBSportMetadata, 600011, vo2MaxExtra.getVo2max(), -2.0d);
    }

    public static String o() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static boolean p(Integer num) {
        return num == null || num.intValue() < 40 || num.intValue() > 220;
    }

    public static boolean q(Integer num) {
        return num == null || num.intValue() < 16448 || num.intValue() > 65535;
    }

    public static boolean r(long j2, long j3, long j4, long j5, long j6) {
        return j2 == 0 && j3 == 0 && j4 == 0 && j5 == 0 && j6 == 0;
    }

    public static boolean s(long j2, long j3, long j4, long j5, long j6, long j7) {
        return j2 == 0 && j3 == 0 && j4 == 0 && j5 == 0 && j6 == 0 && j7 == 0;
    }

    public static boolean t(String str) {
        return hz.a(str) || str.trim().length() != 32;
    }

    public static boolean u(int i) {
        return Arrays.asList(NO_STEPS_SPORTS).contains(Integer.valueOf(i));
    }

    public static boolean v(String str) {
        if (str == null) {
            return false;
        }
        try {
            return Pattern.compile("\\d*").matcher(str).matches();
        } catch (Exception e2) {
            cj4.d("StoreUtil", "isNumeric e:" + e2.getMessage());
            return false;
        }
    }

    public static int w(Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static int x(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e2) {
            cj4.b("StoreUtil", "parseString2Int e = " + e2.getMessage());
            return 0;
        }
    }

    public static long y(String str) {
        try {
            return Long.parseLong(str);
        } catch (Exception e2) {
            cj4.b("StoreUtil", "parseString2Long e = " + e2.getMessage());
            return 0L;
        }
    }

    public static boolean z(Integer num) {
        return num == null || num.intValue() < 0 || num.intValue() > 255;
    }
}
