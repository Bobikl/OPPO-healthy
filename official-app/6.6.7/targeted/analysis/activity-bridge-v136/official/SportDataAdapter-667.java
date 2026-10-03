package com.heytap.health.core.provider.adapter.open;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.SportDataStat;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.health.core.provider.auth.AuthHandler;
import com.heytap.health.operations.R$string;
import com.heytap.health.sport.StepProviderUtils.StepQueryData;
import com.heytap.health.sport.StepProviderUtils.StepStatData;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.i7k;
import com.oplus.aiunit.vision.kxi;
import com.oplus.aiunit.vision.m07;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.ocg;
import com.oplus.aiunit.vision.q15;
import com.oplus.aiunit.vision.rbi;
import com.oplus.aiunit.vision.ro0;
import com.oplus.aiunit.vision.s04;
import com.oplus.aiunit.vision.vd8;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes16.dex */
public class SportDataAdapter extends ocg<SportData> {
    public static final String CALORIE_KEY = "calorie";
    public static final String DISTANCE_KEY = "distance";
    public static final String DURATION_KEY = "duration";
    public static final String READ_SCOPE = "READ_SPORT_DATA";
    public static final String STEP_KEY = "step";

    @Keep
    public static class SportData {
        public int activityCount;
        public long calGoal;
        public double calorie;
        public double distance;
        public double duration;
        public long step;
        public long stepGoal;
        public long timeStamp = System.currentTimeMillis();

        public void reset() {
            this.timeStamp = System.currentTimeMillis();
            this.step = 0L;
            this.distance = 0.0d;
            this.calorie = 0.0d;
            this.duration = 0.0d;
            this.activityCount = 0;
        }

        public String toString() {
            return "timeStamp: " + this.timeStamp + ",step: " + this.step + ",distance: " + this.distance + ",calorie: " + this.calorie + ",stepGoal: " + this.stepGoal + ",calGoal: " + this.calGoal + ",duration: " + this.duration + ",activityCount: " + this.activityCount;
        }
    }

    public class a extends ro0<CommonBackBean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Bundle f4772j;
        public final /* synthetic */ int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f4773l;
        public final /* synthetic */ int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ SportData f4774n;
        public final /* synthetic */ MatrixCursor o;
        public final /* synthetic */ String[] p;

        public a(Bundle bundle, int i, int i2, int i3, SportData sportData, MatrixCursor matrixCursor, String[] strArr) {
            this.f4772j = bundle;
            this.k = i;
            this.f4773l = i2;
            this.m = i3;
            this.f4774n = sportData;
            this.o = matrixCursor;
            this.p = strArr;
        }

        @Override // com.oplus.aiunit.vision.ro0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(CommonBackBean commonBackBean) {
            m8b.f("SportDataAdapter", "readSportHealthData");
            if (commonBackBean != null) {
                try {
                    if (commonBackBean.getObj() == null) {
                        this.f4772j.putString(DBHealthReviewPlan.DESC, "query sportData list is null  between startDate: " + this.k + ", endDate: " + this.f4773l);
                    } else {
                        List<SportDataStat> list = (List) commonBackBean.getObj();
                        ArrayList<String> arrayList = new ArrayList<>();
                        for (SportDataStat sportDataStat : list) {
                            if (sportDataStat.getDate() == this.m) {
                                this.f4774n.step = Math.max(sportDataStat.getTotalSteps(), this.f4774n.step);
                                this.f4774n.distance = Math.max(((double) sportDataStat.getTotalDistance()) / 1000.0d, this.f4774n.distance);
                                this.f4774n.calorie = Math.max(sportDataStat.getTotalCalories() / 1000, this.f4774n.calorie);
                                this.f4774n.stepGoal = sportDataStat.getCurrentDayStepsGoal();
                                this.f4774n.calGoal = sportDataStat.getCurrentDayCaloriesGoal();
                                arrayList.add(SportDataAdapter.J(this.f4774n));
                                SportDataAdapter.this.m(this.f4774n, "health_provider_preference", "sport");
                                SportDataAdapter.this.t(this.o, this.p, this.f4774n);
                            } else {
                                SportDataAdapter.this.u(this.o, this.p, sportDataStat);
                                arrayList.add(SportDataAdapter.this.I(sportDataStat));
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("data:");
                        sb.append(arrayList);
                        this.f4772j.putString(DBHealthReviewPlan.DESC, "query sportData list size = " + list.size() + " between startDate: " + this.k + ", endDate: " + this.f4773l);
                        this.f4772j.putStringArrayList("sportDataList", arrayList);
                    }
                } catch (Exception e2) {
                    this.f4772j.putInt("code", 0);
                    this.f4772j.putInt("subCode", 1002);
                    this.f4772j.putString(DBHealthReviewPlan.DESC, "Exception: " + e2.getMessage());
                    m8b.f("SportDataAdapter", "query Exception 4: " + e2.getMessage());
                    return;
                }
            } else {
                this.f4772j.putString(DBHealthReviewPlan.DESC, "query sportData list is null  between startDate: " + this.k + ", endDate: " + this.f4773l);
            }
            this.f4772j.putInt("code", 1);
        }

        @Override // com.oplus.aiunit.vision.ro0, com.oplus.aiunit.vision.rfd
        public void onError(Throwable th) {
            super.onError(th);
            this.f4772j.putInt("code", 0);
            this.f4772j.putInt("subCode", 1002);
            if (!(th instanceof TimeoutException)) {
                this.f4772j.putString(DBHealthReviewPlan.DESC, "Exception: " + th.getMessage());
                return;
            }
            this.f4772j.putString(DBHealthReviewPlan.DESC, "query timeout");
            m8b.b("SportDataAdapter", "query timeout, startDate: " + this.k + ", endDate: " + this.f4773l);
        }
    }

    public class b extends ro0<CommonBackBean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ SportData f4775j;

        public b(SportData sportData) {
            this.f4775j = sportData;
        }

        @Override // com.oplus.aiunit.vision.ro0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(CommonBackBean commonBackBean) {
            if (commonBackBean != null) {
                try {
                    if (commonBackBean.getObj() == null) {
                        return;
                    }
                    List list = (List) commonBackBean.getObj();
                    if (list.isEmpty()) {
                        return;
                    }
                    SportDataStat sportDataStat = (SportDataStat) list.get(0);
                    SportData sportData = this.f4775j;
                    sportData.duration = Math.max(sportData.duration, sportDataStat.getTotalWorkoutMinutes());
                    this.f4775j.activityCount = sportDataStat.getTotalMoveAboutTimes();
                } catch (Exception e2) {
                    m8b.b("SportDataAdapter", "fillTodayDailyActivityData Exception: " + e2.getMessage());
                }
            }
        }

        @Override // com.oplus.aiunit.vision.ro0, com.oplus.aiunit.vision.rfd
        public void onError(Throwable th) {
            super.onError(th);
            m8b.b("SportDataAdapter", "fillTodayDailyActivityData error: " + th.getMessage());
        }
    }

    public SportDataAdapter(ContentProvider contentProvider) {
        super(contentProvider);
    }

    public static long B(long j2, TimeZone timeZone) {
        StringBuilder sb = new StringBuilder();
        sb.append("getStartTimeOfDay---time: ");
        sb.append(j2);
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j2);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static Bundle G(Context context) {
        return H();
    }

    public static Bundle H() {
        Bundle bundle = new Bundle();
        SportData sportData = (SportData) vd8.a(fdg.x("health_provider_preference").D("sport"), SportData.class);
        if (sportData == null) {
            sportData = new SportData();
        }
        m8b.f("SportDataAdapter", "queryTodaySportData---sportData: " + sportData.step);
        if (!x(sportData.timeStamp)) {
            sportData.reset();
            String strG = vd8.g(sportData);
            if (!TextUtils.isEmpty(strG)) {
                fdg.x("health_provider_preference").U("sport", strG);
            }
        }
        bundle.putLong("step", sportData.step);
        bundle.putDouble("distance", sportData.distance);
        bundle.putDouble("calorie", sportData.calorie);
        bundle.putDouble("duration", sportData.duration);
        long j2 = sportData.stepGoal;
        if (j2 == 0) {
            j2 = 8000;
        }
        bundle.putLong("stepGoal", j2);
        long j3 = sportData.calGoal;
        if (j3 == 0) {
            j3 = 300000;
        }
        bundle.putLong("calGoal", j3);
        bundle.putLong(SpeechConstant.KEY_TTS_TIMESTAMP, sportData.timeStamp);
        return bundle;
    }

    public static String J(SportData sportData) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("date", Integer.valueOf(Integer.parseInt(LocalDateTime.ofEpochSecond(sportData.timeStamp / 1000, 0, ZoneOffset.UTC).toLocalDate().format(DateTimeFormatter.ofPattern("yyyyMMdd")))));
        jsonObject.addProperty("step", Long.valueOf(sportData.step));
        jsonObject.addProperty("distance", Double.valueOf(sportData.distance));
        jsonObject.addProperty("calorie", Double.valueOf(sportData.calorie));
        jsonObject.addProperty("duration", Double.valueOf(sportData.duration));
        jsonObject.addProperty("activityCount", Integer.valueOf(sportData.activityCount));
        return jsonObject.toString();
    }

    public static void K(Context context, ContentValues contentValues) {
        if (context != null) {
            m8b.f("SportHealthProvider", "updateSportProvider---ContentValues: " + contentValues.get("step"));
            try {
                context.getApplicationContext().getContentResolver().update(Uri.parse("content://com.heytap.health.sporthealthprovider/self/sport"), contentValues, null, null);
            } catch (Exception e2) {
                m8b.b("SportDataAdapter", "updateSportData e = " + e2.getMessage());
            }
        }
    }

    public static void L(Context context, ContentValues contentValues) {
        if (context != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("updateSportDataWhenLogout---ContentValues: ");
            sb.append(contentValues.toString());
            try {
                context.getApplicationContext().getContentResolver().update(Uri.parse("content://com.heytap.health.sporthealthprovider/self/sport"), contentValues, null, null);
                SportData sportData = new SportData();
                sportData.step = 0L;
                sportData.calorie = 0.0d;
                sportData.distance = 0.0d;
                sportData.duration = 0.0d;
                sportData.stepGoal = 8000L;
                sportData.calGoal = 300000L;
                fdg.x("health_provider_preference").U("sport", vd8.g(sportData));
            } catch (Exception e2) {
                m8b.b("SportDataAdapter", "updateSportDataWhenLogout e = " + e2.getMessage());
            }
        }
    }

    public static boolean x(long j2) {
        long jB = B(j2, TimeZone.getDefault());
        long jB2 = B(System.currentTimeMillis(), TimeZone.getDefault());
        StringBuilder sb = new StringBuilder();
        sb.append("checkDateValid---saveStartTime: ");
        sb.append(jB);
        sb.append(",currStartTime: ");
        sb.append(jB2);
        return jB == jB2;
    }

    public SportData A() {
        SportData sportData = new SportData();
        int iD = D(d().getContext());
        if (iD == -1) {
            iD = C();
        }
        if (iD == -1) {
            return null;
        }
        sportData.step = iD;
        m8b.f("SportDataAdapter", "getRawSportData: " + iD);
        sportData.calorie = kxi.d(sportData.step, 0, 0.0d);
        sportData.distance = kxi.g(sportData.step, 0);
        return sportData;
    }

    @SuppressLint({"Range"})
    public int C() {
        m8b.b("SportDataAdapter", "getStepFromAssScreen");
        int i = -1;
        try {
            Cursor cursorQuery = d().getContext().getContentResolver().query(Uri.parse("content://com.coloros.assistantscreen.export.stepprovider/day_statistic"), null, null, null, null);
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("getTodayStepForAssScreen total data number = ");
                sb.append(cursorQuery == null ? "null" : Integer.valueOf(cursorQuery.getCount()));
                m8b.f("SportDataAdapter", sb.toString());
                if (cursorQuery != null && cursorQuery.getCount() > 0) {
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("amount"));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("date"));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("getTodayStepForAssScreen date = ");
                        sb2.append(string2);
                        sb2.append(", amount = ");
                        sb2.append(string);
                        if (string2.equals(q15.g("yyyy-MM-dd")) && !string.isEmpty()) {
                            i = Integer.parseInt(string);
                            break;
                        }
                    }
                } else {
                    m8b.b("SportDataAdapter", "getTodayStepForAssScreen no data");
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SecurityException e2) {
            m8b.b("SportDataAdapter", "SecurityException no permission :" + e2.getMessage());
        } catch (Exception e3) {
            m8b.b("SportDataAdapter", "getStepFromAssScreen Exception " + e3.getMessage());
        }
        return i;
    }

    public int D(Context context) {
        m8b.f("SportDataAdapter", "getHistoryData enter ");
        long epochMilli = LocalDateTime.of(LocalDate.now(), LocalTime.MIN).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        long epochMilli2 = LocalDateTime.of(LocalDate.now(), LocalTime.MAX).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        String strB = q15.b(epochMilli, "yyyy-MM-dd", TimeZone.getDefault());
        String strB2 = q15.b(epochMilli2, "yyyy-MM-dd", TimeZone.getDefault());
        return E() ? w(strB, strB2) : F(context, strB, strB2);
    }

    public boolean E() {
        try {
            return e88.a().getPackageManager().getApplicationInfo(m07.q(), 128).metaData.getInt("CallMethodAvailable") == 1;
        } catch (PackageManager.NameNotFoundException unused) {
            m8b.f("SportDataAdapter", "isCallVersion NameNotFoundException");
            return false;
        }
    }

    @SuppressLint({"Range"})
    public final int F(Context context, String str, String str2) {
        m8b.f("SportDataAdapter", "queryDayStepData: " + str + ", " + str2);
        String[] strArr = {str, str2};
        new ArrayList();
        Cursor cursorQuery = null;
        int i = -1;
        try {
            try {
                cursorQuery = context.getContentResolver().query(m07.t(), null, " day_date between ? and ?", strArr, null);
                StringBuilder sb = new StringBuilder();
                sb.append("queryDayStepData cursor = ");
                sb.append(cursorQuery == null ? "null" : Integer.valueOf(cursorQuery.getCount()));
                if (cursorQuery != null && cursorQuery.getCount() > 0) {
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("day_offset"));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("queryDayStepData offset = ");
                        sb2.append(string);
                        i += Integer.parseInt(string);
                    }
                }
                return i;
            } catch (SecurityException e2) {
                m8b.b("SportDataAdapter", "queryDayStepData SecurityException = " + e2.getMessage());
                return i;
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public final String I(SportDataStat sportDataStat) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("date", Integer.valueOf(sportDataStat.getDate()));
        jsonObject.addProperty("step", Integer.valueOf(sportDataStat.getTotalSteps()));
        jsonObject.addProperty("distance", Integer.valueOf(sportDataStat.getTotalDistance() / 1000));
        jsonObject.addProperty("calorie", Long.valueOf(sportDataStat.getTotalCalories() / 1000));
        jsonObject.addProperty("duration", Integer.valueOf(sportDataStat.getTotalWorkoutMinutes()));
        jsonObject.addProperty("activityCount", Integer.valueOf(sportDataStat.getTotalMoveAboutTimes()));
        return jsonObject.toString();
    }

    @Override // com.oplus.aiunit.vision.s74
    public int b(@Nullable String str, @Nullable String[] strArr) {
        m(null, "health_provider_preference", "sport");
        return 1;
    }

    @Override // com.oplus.aiunit.vision.s74
    public String c() {
        return d().getContext().getString(R$string.lib_core_provider_content_sport_data);
    }

    @Override // com.oplus.aiunit.vision.s74
    public boolean e(@Nullable ContentValues contentValues) {
        if (contentValues == null) {
            return false;
        }
        if (!(fdg.w().r("has_launched", false) && (cn.c().x() || i7k.x()))) {
            return false;
        }
        SportData sportDataK = k("health_provider_preference", "sport", SportData.class);
        if (sportDataK == null) {
            sportDataK = new SportData();
        }
        try {
            sportDataK.timeStamp = System.currentTimeMillis();
            n(sportDataK, contentValues);
            m(sportDataK, "health_provider_preference", "sport");
            return true;
        } catch (Exception e2) {
            m8b.c("SportDataAdapter", "insert exception: ", e2);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x009d  */
    @Override // com.oplus.aiunit.vision.s74
    public Cursor f(@Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        boolean z;
        String str3;
        String str4;
        Bundle bundle;
        MatrixCursor matrixCursorV;
        String str5;
        SportData sportDataA;
        m8b.f("SportDataAdapter", "query: " + str + ", args: " + str2);
        if (i7k.I()) {
            m8b.f("SportDataAdapter", "health app has no permission ACTIVITY_RECOGNITION");
            Bundle bundle2 = new Bundle();
            MatrixCursor matrixCursor = new MatrixCursor(new String[0], 1);
            bundle2.putInt("code", 0);
            bundle2.putInt("subCode", AuthHandler.ResultCode.HEALTH_ACTIVITY_RECOGNITION_PERMISSION_NOT_GRANTED);
            bundle2.putString(DBHealthReviewPlan.DESC, "health app not have ACTIVITY_RECOGNITION permission please grant it to health app first");
            matrixCursor.setExtras(bundle2);
            return matrixCursor;
        }
        boolean z2 = str == null;
        if (TextUtils.isEmpty(str2)) {
            z = false;
        } else {
            try {
                JsonObject asJsonObject = new JsonParser().parse(str2).getAsJsonObject();
                if (asJsonObject.has("rawData") && asJsonObject.get("rawData").getAsBoolean()) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Exception e2) {
                m8b.f("SportDataAdapter", "query sortOrder parse exception: " + e2.getMessage());
            }
        }
        if (z2) {
            SportData sportDataK = k("health_provider_preference", "sport", SportData.class);
            StringBuilder sb = new StringBuilder();
            sb.append("query---sportData: ");
            sb.append(sportDataK);
            if (sportDataK == null) {
                sportDataK = new SportData();
            }
            if (!x(sportDataK.timeStamp)) {
                sportDataK.reset();
                m(sportDataK, "health_provider_preference", "sport");
            }
            m8b.f("SportDataAdapter", "query: isRawData---" + z + ", step=" + sportDataK.step);
            if ((z || (sportDataK.step == 0 && m07.k())) && (sportDataA = A()) != null && sportDataA.step >= sportDataK.step) {
                sportDataK = sportDataA;
            }
            y(sportDataK);
            m8b.f("SportDataAdapter", "query: " + sportDataK.step);
            Cursor cursorJ = j(strArr, sportDataK);
            if (cursorJ == null) {
                return null;
            }
            Bundle bundle3 = new Bundle();
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(J(sportDataK));
            bundle3.putInt("code", 1);
            bundle3.putString(DBHealthReviewPlan.DESC, "query today sportData success ...");
            bundle3.putStringArrayList("sportDataList", arrayList);
            cursorJ.setExtras(bundle3);
            return cursorJ;
        }
        MatrixCursor matrixCursor2 = new MatrixCursor(new String[0], 1);
        Bundle bundle4 = new Bundle();
        try {
            JsonObject asJsonObject2 = new JsonParser().parse(str).getAsJsonObject();
            int asInt = asJsonObject2.get(s04.JSON_KEY_DIGITAL_KEY_START_TIME).getAsInt();
            int asInt2 = asJsonObject2.get("endDate").getAsInt();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("startDate: ");
            sb2.append(asInt);
            sb2.append(",endDate: ");
            sb2.append(asInt2);
            int i = Integer.parseInt(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")));
            if (asInt2 < asInt || asInt > i) {
                str3 = "SportDataAdapter";
                str5 = "subCode";
                bundle = bundle4;
                try {
                    bundle.putInt("code", 0);
                    str4 = str5;
                    try {
                        bundle.putInt(str4, 1003);
                        bundle.putString(DBHealthReviewPlan.DESC, "param is illegal, please check startDate or endDate, startDate should not be greater than today, and endDate should not be less than startDate");
                        matrixCursor2.setExtras(bundle);
                        return matrixCursor2;
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Exception e4) {
                    e = e4;
                    str4 = str5;
                }
            } else {
                if (asInt2 > i) {
                    asInt2 = i;
                }
                try {
                    DataReadOption dataReadOption = new DataReadOption();
                    str3 = "SportDataAdapter";
                    try {
                        str5 = "subCode";
                        try {
                            dataReadOption.setSsoid(fdg.w().D("user_ssoid"));
                            dataReadOption.setStartTime(o15.a(asInt));
                            dataReadOption.setEndTime(o15.a(asInt2));
                            dataReadOption.setDataTable(1002);
                            dataReadOption.setReadSportMode(-2);
                            dataReadOption.setGroupUnitType(4);
                            if (asInt == i && asInt2 == i) {
                                SportData sportDataK2 = k("health_provider_preference", "sport", SportData.class);
                                if (sportDataK2 == null) {
                                    sportDataK2 = new SportData();
                                }
                                if (!x(sportDataK2.timeStamp)) {
                                    sportDataK2.reset();
                                    m(sportDataK2, "health_provider_preference", "sport");
                                }
                                y(sportDataK2);
                                String strJ = J(sportDataK2);
                                ArrayList<String> arrayList2 = new ArrayList<>();
                                arrayList2.add(strJ);
                                bundle4.putInt("code", 1);
                                bundle4.putString(DBHealthReviewPlan.DESC, "query today sportData success ...");
                                bundle4.putStringArrayList("sportDataList", arrayList2);
                                matrixCursor2.setExtras(bundle4);
                                return matrixCursor2;
                            }
                            SportData sportDataK3 = k("health_provider_preference", "sport", SportData.class);
                            if (sportDataK3 == null) {
                                sportDataK3 = new SportData();
                            }
                            SportData sportData = sportDataK3;
                            matrixCursorV = v(strArr);
                            bundle = bundle4;
                            try {
                                z(matrixCursorV, strArr, bundle4, i, dataReadOption, asInt, asInt2, sportData);
                            } catch (Exception e5) {
                                e = e5;
                                matrixCursor2 = matrixCursorV;
                                str4 = str5;
                                m8b.b(str3, "query Exception 3: " + e.getMessage());
                                bundle.putInt("code", 0);
                                bundle.putInt(str4, 1002);
                                bundle.putString(DBHealthReviewPlan.DESC, "Exception: " + e.getMessage());
                                matrixCursorV = matrixCursor2;
                            }
                            matrixCursorV.setExtras(bundle);
                            return matrixCursorV;
                        } catch (Exception e6) {
                            e = e6;
                            bundle = bundle4;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        str5 = "subCode";
                        bundle = bundle4;
                        str4 = str5;
                        m8b.b(str3, "query Exception 3: " + e.getMessage());
                        bundle.putInt("code", 0);
                        bundle.putInt(str4, 1002);
                        bundle.putString(DBHealthReviewPlan.DESC, "Exception: " + e.getMessage());
                        matrixCursorV = matrixCursor2;
                        matrixCursorV.setExtras(bundle);
                        return matrixCursorV;
                    }
                } catch (Exception e8) {
                    e = e8;
                    str3 = "SportDataAdapter";
                }
            }
            str4 = str5;
        } catch (Exception e9) {
            e = e9;
            str3 = "SportDataAdapter";
            str4 = "subCode";
            bundle = bundle4;
        }
        m8b.b(str3, "query Exception 3: " + e.getMessage());
        bundle.putInt("code", 0);
        bundle.putInt(str4, 1002);
        bundle.putString(DBHealthReviewPlan.DESC, "Exception: " + e.getMessage());
        matrixCursorV = matrixCursor2;
        matrixCursorV.setExtras(bundle);
        return matrixCursorV;
    }

    @Override // com.oplus.aiunit.vision.s74
    public String g() {
        return READ_SCOPE;
    }

    @Override // com.oplus.aiunit.vision.s74
    public int h(@Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        m8b.f("SportDataAdapter", rbi.UPDATE);
        if (contentValues == null) {
            return 0;
        }
        SportData sportDataK = k("health_provider_preference", "sport", SportData.class);
        if (sportDataK == null) {
            sportDataK = new SportData();
        }
        m8b.f("SportDataAdapter", "last sportData：" + sportDataK.step);
        try {
            sportDataK.timeStamp = System.currentTimeMillis();
            n(sportDataK, contentValues);
            m(sportDataK, "health_provider_preference", "sport");
            return 1;
        } catch (Exception e2) {
            m8b.c("SportDataAdapter", "update exception: ", e2);
            return 0;
        }
    }

    public final void t(MatrixCursor matrixCursor, String[] strArr, SportData sportData) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (strArr == null) {
            Field[] fields = SportData.class.getFields();
            int length = fields.length;
            while (i < length) {
                arrayList.add(l(fields[i], sportData));
                i++;
            }
        } else {
            int length2 = strArr.length;
            while (i < length2) {
                try {
                    arrayList.add(l(SportData.class.getField(strArr[i]), sportData));
                } catch (NoSuchFieldException e2) {
                    m8b.b("SportDataAdapter", "addRowToCursor Exception : " + e2.getMessage());
                    arrayList.add(null);
                }
                i++;
            }
        }
        matrixCursor.addRow(arrayList);
    }

    public final void u(MatrixCursor matrixCursor, String[] strArr, SportDataStat sportDataStat) {
        SportData sportData = new SportData();
        sportData.timeStamp = o15.a(sportDataStat.getDate());
        sportData.step = sportDataStat.getTotalSteps();
        sportData.distance = ((double) sportDataStat.getTotalDistance()) / 1000.0d;
        sportData.calorie = sportDataStat.getTotalCalories() / 1000.0d;
        sportData.stepGoal = sportDataStat.getCurrentDayStepsGoal();
        sportData.calGoal = sportDataStat.getCurrentDayCaloriesGoal();
        sportData.duration = sportDataStat.getTotalWorkoutMinutes();
        sportData.activityCount = sportDataStat.getTotalMoveAboutTimes();
        t(matrixCursor, strArr, sportData);
    }

    public final MatrixCursor v(String[] strArr) {
        if (strArr == null) {
            Field[] fields = SportData.class.getFields();
            strArr = new String[fields.length];
            for (int i = 0; i < fields.length; i++) {
                strArr[i] = fields[i].getName();
            }
        }
        return new MatrixCursor(strArr);
    }

    public final int w(String str, String str2) {
        List listD;
        m8b.f("SportDataAdapter", "callDayStepData: " + str + ", " + str2);
        Bundle bundle = new Bundle();
        StepQueryData stepQueryData = new StepQueryData();
        stepQueryData.setUri(m07.t().toString());
        stepQueryData.setSelectionArgs(new String[]{str, str2});
        stepQueryData.setSelection(" day_date between ? and ?");
        bundle.putString(m07.QUERY_DATA, vd8.g(stepQueryData));
        int offset = -1;
        try {
            Bundle bundleCall = e88.a().getContentResolver().call(m07.t(), m07.QUERY_STEP_STAT_DATA_URI, (String) null, bundle);
            m8b.f("SportDataAdapter", "callDayStepData startTime = " + str);
            if (bundleCall != null && bundleCall.getString(m07.RESULT_DAY_STEP_DATA) != null && (listD = vd8.d(bundleCall.getString(m07.RESULT_DAY_STEP_DATA), StepStatData.class)) != null && listD.size() > 0) {
                m8b.f("SportDataAdapter", "callDayStepData size = " + listD.size());
                StringBuilder sb = new StringBuilder();
                sb.append("callDayStepData data = ");
                sb.append(listD);
                Iterator it = listD.iterator();
                while (it.hasNext()) {
                    offset += ((StepStatData) it.next()).getOffset();
                }
            }
            return offset;
        } catch (SecurityException e2) {
            m8b.b("SportDataAdapter", "callDayStepData SecurityException = " + e2.getMessage());
            return offset;
        }
    }

    public final void y(SportData sportData) {
        int i = Integer.parseInt(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")));
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(fdg.w().D("user_ssoid"));
        dataReadOption.setStartTime(o15.a(i));
        dataReadOption.setEndTime(o15.a(i));
        dataReadOption.setDataTable(1002);
        dataReadOption.setReadSportMode(-2);
        dataReadOption.setGroupUnitType(4);
        dataReadOption.setAggregateType(108);
        SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).X0(2L, TimeUnit.SECONDS).h(new b(sportData));
    }

    public final void z(MatrixCursor matrixCursor, String[] strArr, Bundle bundle, int i, DataReadOption dataReadOption, int i2, int i3, SportData sportData) {
        SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).X0(2L, TimeUnit.SECONDS).h(new a(bundle, i2, i3, i, sportData, matrixCursor, strArr));
    }
}