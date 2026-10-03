package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.ContentProviderClient;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.SportDataDetail;
import com.heytap.databaseengine.model.SportDataStat;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengine.option.DataInsertOption;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.sport.StepProviderUtils.StepData;
import com.heytap.health.sport.StepProviderUtils.StepQueryData;
import com.heytap.health.sport.StepProviderUtils.StepStatData;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes18.dex */
public class lz6 {
    public static final String EXTEND_LAST_INSERT_DATA_2_DB_TIME = "extendstep_last_insert_data2db_time";
    public static final String EXTEND_STEP_SP_NAME = "extend_step_sp";
    public static final String QUERY_DATA = "query_data";
    public static final String QUERY_STEP_MINUTE_DATA_URI = "method_call_by_assistantscreen_and_health_from_table_minute_step_data";
    public static final String QUERY_STEP_STAT_DATA_URI = "method_call_by_assistantscreen_and_health_from_table_day_step_data";
    public static final String RESULT_DAY_STEP_DATA = "query_result_from_table_day_step_data";
    public static final String RESULT_MINUTE_STEP_DATA = "query_result_from_table_minute_step_data";
    public static final String STEP_STATISTICS_TIME = "step_statistics_time";
    public static final Uri a = Uri.parse("content://com.coloros.healthservice.stepprovider/day_statistic");
    public static final Uri b = Uri.parse("content://com.oplus.healthservice.stepprovider/day_statistic");
    public static final Uri STEP_DATA_URI = Uri.parse("content://com.coloros.healthservice.stepprovider/step_data");
    public static final Uri STEP_DATA_URI_V1 = Uri.parse("content://com.oplus.healthservice.stepprovider/step_data");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f13886c = true;

    public class a extends ao0<CommonBackBean> {
        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(CommonBackBean commonBackBean) {
            a7b.f("ExtendStepCounterUtil", "getHistoryData errorCode:" + commonBackBean.getErrorCode() + "; result:" + commonBackBean.getObj().toString());
            v9g.x(lz6.EXTEND_STEP_SP_NAME).T("user_get_history_step_last_time", System.currentTimeMillis() - 86400000);
        }
    }

    public class b extends ao0<CommonBackBean> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ List f13887j;

        public b(List list) {
            this.f13887j = list;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(CommonBackBean commonBackBean) {
            if (commonBackBean.getErrorCode() == 0) {
                v9g v9gVarX = v9g.x(lz6.EXTEND_STEP_SP_NAME);
                List list = this.f13887j;
                v9gVarX.T(lz6.EXTEND_LAST_INSERT_DATA_2_DB_TIME, ((StepData) list.get(list.size() - 1)).getTimestamp());
                List list2 = this.f13887j;
                if (((StepData) list2.get(list2.size() - 1)).getOffset() > 0) {
                    lz6.I();
                }
            }
            lz6.H(true);
            a7b.f("ExtendStepCounterUtil", "insertMinuteStepData errorCode is: " + commonBackBean.getErrorCode());
            StringBuilder sb = new StringBuilder();
            sb.append("insertMinuteStepData Object is: ");
            sb.append(commonBackBean.getObj().toString());
        }
    }

    public class c extends ao0<List<SportDataStat>> {
        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(List<SportDataStat> list) {
            if (list.isEmpty()) {
                a7b.f("stepDataCollection", " read Sport stat data size is 0");
                return;
            }
            n7a.a(46, 15, list.get(0).getTotalSteps() + "步");
            n7a.a(49, 15, (list.get(0).getTotalCalories() / 1000) + "千卡");
        }
    }

    public static /* synthetic */ jdd A(List list) throws Throwable {
        DataInsertOption dataInsertOption = new DataInsertOption();
        dataInsertOption.setDatas(list);
        dataInsertOption.setDataTable(1002);
        return SportHealthDataAPI.getInstance().insertSportHealthData(dataInsertOption);
    }

    public static /* synthetic */ void B(Integer num) throws Throwable {
        String strD;
        long jB = v9g.x(EXTEND_STEP_SP_NAME).B(EXTEND_LAST_INSERT_DATA_2_DB_TIME, x05.n(System.currentTimeMillis()));
        if (jB > System.currentTimeMillis()) {
            a7b.f("ExtendStepCounterUtil", "last time > current time  :" + jB);
            strD = null;
        } else {
            strD = x05.d(jB);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getPeriodStepCounts :");
        sb.append(strD);
        if (TextUtils.isEmpty(strD)) {
            strD = x05.d(System.currentTimeMillis() - 86400000);
        }
        if (um.c().getSsoid().isEmpty() || !o()) {
            return;
        }
        H(false);
        r(strD);
    }

    public static /* synthetic */ void C() {
        l().subscribe(new c());
    }

    @SuppressLint({"Range"})
    public static List<SportHealthData> D() {
        String strB = x05.b(System.currentTimeMillis() - 86400000, "yyyy-MM-dd", TimeZone.getDefault());
        String strB2 = x05.b(x05.n(v9g.x(EXTEND_STEP_SP_NAME).B("user_get_history_step_last_time", 0L)), "yyyy-MM-dd", TimeZone.getDefault());
        a7b.f("ExtendStepCounterUtil", "queryDayStepData nowTime = " + strB);
        a7b.f("ExtendStepCounterUtil", "queryDayStepData lastTime = " + strB2);
        if (strB.equals(strB2)) {
            return new ArrayList();
        }
        String[] strArr = {strB2, strB};
        ArrayList arrayList = new ArrayList();
        try {
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = b78.a().getContentResolver().acquireUnstableContentProviderClient(s());
            try {
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    ArrayList arrayList2 = new ArrayList();
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    return arrayList2;
                }
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(t(), null, " day_date between ? and ?", strArr, null);
                contentProviderClientAcquireUnstableContentProviderClient.close();
                StringBuilder sb = new StringBuilder();
                sb.append("queryDayStepData cursor = ");
                sb.append(cursorQuery == null ? "null" : Integer.valueOf(cursorQuery.getCount()));
                if (cursorQuery != null && cursorQuery.getCount() > 0) {
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("day_date"));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("day_timestamp"));
                        String string3 = cursorQuery.getString(cursorQuery.getColumnIndex("day_step"));
                        String string4 = cursorQuery.getString(cursorQuery.getColumnIndex("day_offset"));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("queryDayStepData date = ");
                        sb2.append(string);
                        sb2.append("; timestamp = ");
                        sb2.append(string2);
                        sb2.append("; step = ");
                        sb2.append(string3);
                        sb2.append("; offset = ");
                        sb2.append(string4);
                        j(arrayList, string, string4);
                    }
                }
                tti.a(cursorQuery);
                a7b.f("ExtendStepCounterUtil", "queryDayStepData data = " + arrayList.size());
                return arrayList;
            } catch (Throwable th) {
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    try {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (RemoteException | SecurityException e2) {
            a7b.b("ExtendStepCounterUtil", "queryDayStepData SecurityException = " + e2.getMessage());
            return arrayList;
        }
    }

    public static List<SportHealthData> E() {
        List<StepStatData> listD;
        String strB = x05.b(System.currentTimeMillis() - 86400000, "yyyy-MM-dd", TimeZone.getDefault());
        String strB2 = x05.b(x05.n(v9g.x(EXTEND_STEP_SP_NAME).B("user_get_history_step_last_time", 0L)), "yyyy-MM-dd", TimeZone.getDefault());
        a7b.f("ExtendStepCounterUtil", "callDayStepData nowTime = " + strB);
        a7b.f("ExtendStepCounterUtil", "callDayStepData lastTime = " + strB2);
        if (strB.equals(strB2)) {
            return new ArrayList();
        }
        Bundle bundle = new Bundle();
        StepQueryData stepQueryData = new StepQueryData();
        stepQueryData.setUri(t().toString());
        stepQueryData.setSelectionArgs(new String[]{strB2, strB});
        stepQueryData.setSelection(" day_date between ? and ?");
        bundle.putString(QUERY_DATA, sc8.g(stepQueryData));
        ArrayList arrayList = new ArrayList();
        try {
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = b78.a().getContentResolver().acquireUnstableContentProviderClient(s());
            try {
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    ArrayList arrayList2 = new ArrayList();
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    return arrayList2;
                }
                Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call(QUERY_STEP_STAT_DATA_URI, null, bundle);
                a7b.f("ExtendStepCounterUtil", "callDayStepData lastTime = " + strB2);
                if (bundleCall != null && bundleCall.getString(RESULT_DAY_STEP_DATA) != null && (listD = sc8.d(bundleCall.getString(RESULT_DAY_STEP_DATA), StepStatData.class)) != null && listD.size() > 0) {
                    a7b.f("ExtendStepCounterUtil", "callDayStepData size = " + listD.size());
                    StringBuilder sb = new StringBuilder();
                    sb.append("callDayStepData data = ");
                    sb.append(listD);
                    for (StepStatData stepStatData : listD) {
                        j(arrayList, stepStatData.getDate(), String.valueOf(stepStatData.getOffset()));
                    }
                }
                contentProviderClientAcquireUnstableContentProviderClient.close();
                return arrayList;
            } catch (Throwable th) {
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    try {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (RemoteException | SecurityException e2) {
            a7b.b("ExtendStepCounterUtil", "callDayStepData SecurityException = " + e2.getMessage());
            return arrayList;
        }
    }

    public static List<StepData> F(String str) {
        String strD = x05.d(System.currentTimeMillis());
        String[] strArr = {str, strD};
        a7b.f("ExtendStepCounterUtil", "queryPeriodStepData nowTime = " + strD);
        try {
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = b78.a().getContentResolver().acquireUnstableContentProviderClient(s());
            try {
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    ArrayList arrayList = new ArrayList();
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    return arrayList;
                }
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(s(), null, " minute_time between ? and ?", strArr, null);
                contentProviderClientAcquireUnstableContentProviderClient.close();
                a7b.f("ExtendStepCounterUtil", "queryPeriodStepData lastTime = " + str);
                StringBuilder sb = new StringBuilder();
                sb.append("queryPeriodStepData cursor = ");
                sb.append(cursorQuery == null ? "null" : Integer.valueOf(cursorQuery.getCount()));
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(x05.EXTENDSTEP_PATTERN, Locale.ENGLISH);
                if (cursorQuery == null || cursorQuery.getCount() <= 0) {
                    tti.a(cursorQuery);
                    return new ArrayList();
                }
                ArrayList arrayList2 = new ArrayList();
                while (cursorQuery.moveToNext()) {
                    String strM = m(cursorQuery, "minute_time");
                    String strM2 = m(cursorQuery, "minute_step");
                    String strM3 = m(cursorQuery, "minute_type");
                    String strM4 = m(cursorQuery, "minute_state");
                    String strM5 = m(cursorQuery, "minute_offset");
                    String strM6 = m(cursorQuery, "minute_step_run");
                    String strM7 = m(cursorQuery, "minute_step_walk");
                    String strM8 = m(cursorQuery, "minute_offset_run");
                    String strM9 = m(cursorQuery, "minute_offset_walk");
                    StepData stepData = new StepData();
                    if (strM != null) {
                        try {
                            Date date = simpleDateFormat.parse(strM);
                            Objects.requireNonNull(date);
                            stepData.setTimestamp(date.getTime());
                        } catch (ParseException e2) {
                            a7b.b("ExtendStepCounterUtil", "queryPeriodStepData  ParseException: " + e2.getMessage());
                        }
                    }
                    if (strM2 != null) {
                        stepData.setModifiedIndex(Integer.parseInt(strM2));
                    }
                    if (strM3 != null) {
                        stepData.setType(Integer.parseInt(strM3));
                    }
                    if (strM4 != null) {
                        stepData.setState(Integer.parseInt(strM4));
                    }
                    if (strM5 != null) {
                        stepData.setOffset(Integer.parseInt(strM5));
                    }
                    if (strM6 != null) {
                        stepData.setStepRun(Integer.parseInt(strM6));
                    }
                    if (strM7 != null) {
                        stepData.setStepWalk(Integer.parseInt(strM7));
                    }
                    if (strM8 != null) {
                        stepData.setOffsetRun(Integer.parseInt(strM8));
                    }
                    if (strM9 != null) {
                        stepData.setOffsetWalk(Integer.parseInt(strM9));
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("queryPeriodStepData  stepData = ");
                    sb2.append(stepData);
                    arrayList2.add(stepData);
                }
                tti.a(cursorQuery);
                return arrayList2;
            } catch (Throwable th) {
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    try {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (RemoteException | SecurityException e3) {
            a7b.b("ExtendStepCounterUtil", " queryPeriodStepData Exception e = " + e3.getMessage());
            return new ArrayList();
        }
    }

    public static List<StepData> G(String str) {
        String strD = x05.d(System.currentTimeMillis());
        String[] strArr = {str, strD};
        a7b.f("ExtendStepCounterUtil", "callPeriodStepData nowTime = " + strD);
        Bundle bundle = new Bundle();
        StepQueryData stepQueryData = new StepQueryData();
        stepQueryData.setUri(s().toString());
        stepQueryData.setSelectionArgs(strArr);
        stepQueryData.setSelection(" minute_time between ? and ?");
        bundle.putString(QUERY_DATA, sc8.g(stepQueryData));
        try {
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = b78.a().getContentResolver().acquireUnstableContentProviderClient(s());
            try {
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    ArrayList arrayList = new ArrayList();
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    return arrayList;
                }
                Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call(QUERY_STEP_MINUTE_DATA_URI, null, bundle);
                a7b.f("ExtendStepCounterUtil", "callPeriodStepData lastTime = " + str);
                if (bundleCall == null || bundleCall.getString(RESULT_MINUTE_STEP_DATA) == null) {
                    ArrayList arrayList2 = new ArrayList();
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                    return arrayList2;
                }
                List<StepData> listD = sc8.d(bundleCall.getString(RESULT_MINUTE_STEP_DATA), StepData.class);
                if (listD == null || listD.size() <= 0) {
                    ArrayList arrayList3 = new ArrayList();
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                    return arrayList3;
                }
                a7b.f("ExtendStepCounterUtil", "callPeriodStepData size = " + listD.size());
                StringBuilder sb = new StringBuilder();
                sb.append("callPeriodStepData lastTime = ");
                sb.append(listD);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(x05.EXTENDSTEP_PATTERN, Locale.ENGLISH);
                for (StepData stepData : listD) {
                    Date date = simpleDateFormat.parse(stepData.getTime());
                    Objects.requireNonNull(date);
                    stepData.setTimestamp(date.getTime());
                }
                contentProviderClientAcquireUnstableContentProviderClient.close();
                return listD;
            } catch (Throwable th) {
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    try {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            H(true);
            a7b.f("ExtendStepCounterUtil", " callPeriodStepData Exception e = " + e2.getMessage());
            return new ArrayList();
        }
    }

    public static void H(boolean z) {
        f13886c = z;
    }

    @SuppressLint({"CheckResult"})
    public static void I() {
        ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.iz6
            @Override // java.lang.Runnable
            public final void run() {
                lz6.C();
            }
        });
    }

    public static void j(List<SportHealthData> list, String str, String str2) {
        if (str2 == null || str2.equals("0")) {
            return;
        }
        SportDataStat sportDataStat = new SportDataStat();
        sportDataStat.setSsoid(um.c().getSsoid());
        sportDataStat.setDeviceUniqueId(ilj.g());
        sportDataStat.setDate(Integer.parseInt(str.replace("-", "")));
        sportDataStat.setSportMode(-2);
        int i = Integer.parseInt(str2);
        if (i > 0) {
            sportDataStat.setTotalSteps(i);
            int iG = (int) rti.g(i, 1);
            long jE = (long) rti.e(iG, 1, 0.0d);
            sportDataStat.setTotalDistance(iG * 1000);
            sportDataStat.setTotalCalories(jE * 1000);
            list.add(sportDataStat);
        }
    }

    public static boolean k() {
        return tti.c();
    }

    public static lbd<List<SportDataStat>> l() {
        long epochMilli = LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        long jCurrentTimeMillis = System.currentTimeMillis();
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(um.c().getSsoid());
        dataReadOption.setStartTime(epochMilli);
        dataReadOption.setEndTime(jCurrentTimeMillis);
        dataReadOption.setReadSportMode(-2);
        dataReadOption.setSortOrder(1);
        dataReadOption.setDataTable(1002);
        a7b.f("SedentaryCollection", "start =${TimeUtils.format(start)} end = ${TimeUtils.format(end)}");
        return SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new d08() { // from class: com.oplus.aiunit.vision.jz6
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return lz6.w((CommonBackBean) obj);
            }
        }).t0(new d08() { // from class: com.oplus.aiunit.vision.kz6
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return lz6.x((Throwable) obj);
            }
        });
    }

    @SuppressLint({"Range"})
    public static String m(Cursor cursor, String str) {
        if (cursor.getColumnIndex(str) == -1) {
            return null;
        }
        return cursor.getString(cursor.getColumnIndex(str));
    }

    @SuppressLint({"CheckResult"})
    public static synchronized void n() {
        a7b.f("ExtendStepCounterUtil", "getHistoryData enter ");
        lbd.h0(0).L0(su8.f()).j0(new d08() { // from class: com.oplus.aiunit.vision.ez6
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return lz6.y((Integer) obj);
            }
        }).P(new mpe() { // from class: com.oplus.aiunit.vision.fz6
            @Override // com.oplus.aiunit.vision.mpe
            public final boolean test(Object obj) {
                return lz6.z((List) obj);
            }
        }).Q(new d08() { // from class: com.oplus.aiunit.vision.gz6
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return lz6.A((List) obj);
            }
        }).subscribe(new a());
    }

    public static boolean o() {
        return f13886c;
    }

    @SuppressLint({"CheckResult"})
    public static void p() {
        lbd.h0(0).L0(su8.f()).a(new o14() { // from class: com.oplus.aiunit.vision.hz6
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                lz6.B((Integer) obj);
            }
        });
    }

    public static String q() {
        return tti.b() ? tti.PACKAGE_NAME_STEP_APP_V1 : tti.PACKAGE_NAME_STEP_APP;
    }

    public static void r(String str) {
        List<StepData> listG = v() ? G(str) : F(str);
        if (listG.size() > 0) {
            u(listG);
        } else {
            a7b.f("ExtendStepCounterUtil", "getStepCounts no new data");
        }
        H(true);
    }

    public static Uri s() {
        return tti.b() ? STEP_DATA_URI_V1 : STEP_DATA_URI;
    }

    public static Uri t() {
        return tti.b() ? b : a;
    }

    public static void u(List<StepData> list) {
        ArrayList arrayList = new ArrayList();
        for (Iterator<StepData> it = list.iterator(); it.hasNext(); it = it) {
            StepData next = it.next();
            if (next.getOffset() > 0) {
                SportDataDetail sportDataDetail = new SportDataDetail();
                sportDataDetail.setSsoid(um.c().getSsoid());
                sportDataDetail.setDeviceUniqueId(ilj.g());
                sportDataDetail.setDeviceType(op5.PHONE);
                sportDataDetail.setStartTimestamp(v05.h(next.getTimestamp()));
                sportDataDetail.setEndTimestamp(v05.h(next.getTimestamp()) + 60000);
                long offset = next.getOffset();
                int iH = rti.h(next.getState());
                double dG = rti.g(next.getOffsetRun(), 2) + rti.g(offset - ((long) next.getOffsetRun()), 1);
                double d = rti.d(next.getOffsetRun(), 2, 0.0d) + rti.d(offset - ((long) next.getOffsetRun()), 1, 0.0d);
                sportDataDetail.setSteps((int) offset);
                sportDataDetail.setCalories((long) (d * 1000.0d));
                sportDataDetail.setDistance((int) (dG * 1000.0d));
                sportDataDetail.setAltitudeOffset(0);
                sportDataDetail.setSportMode(iH);
                arrayList.add(sportDataDetail);
            }
        }
        a7b.f("ExtendStepCounterUtil", "insertMinuteStepData insertList.size() = " + arrayList.size());
        if (arrayList.size() == 0) {
            v9g.x(EXTEND_STEP_SP_NAME).T(EXTEND_LAST_INSERT_DATA_2_DB_TIME, list.get(list.size() - 1).getTimestamp());
            H(true);
        } else {
            DataInsertOption dataInsertOption = new DataInsertOption();
            dataInsertOption.setDataTable(1001);
            dataInsertOption.setDatas(arrayList);
            SportHealthDataAPI.getInstance().insertSportHealthData(dataInsertOption).subscribe(new b(list));
        }
    }

    public static boolean v() {
        try {
            return b78.a().getPackageManager().getApplicationInfo(q(), 128).metaData.getInt("CallMethodAvailable") == 1;
        } catch (PackageManager.NameNotFoundException unused) {
            a7b.f("ExtendStepCounterUtil", "isCallVersion NameNotFoundException");
            return false;
        }
    }

    public static /* synthetic */ List w(CommonBackBean commonBackBean) throws Throwable {
        a7b.f("SedentaryCollection", "DB read resultCode = " + commonBackBean.getErrorCode());
        if (commonBackBean.getErrorCode() == 0 && (commonBackBean.getObj() instanceof List)) {
            return (List) commonBackBean.getObj();
        }
        return new ArrayList();
    }

    public static /* synthetic */ List x(Throwable th) throws Throwable {
        a7b.f("SedentaryCollection", "Read Sport stat data failed: " + th.getMessage());
        return new ArrayList();
    }

    public static /* synthetic */ List y(Integer num) throws Throwable {
        return v() ? E() : D();
    }

    public static /* synthetic */ boolean z(List list) throws Throwable {
        if (list.size() != 0) {
            return true;
        }
        v9g.x(EXTEND_STEP_SP_NAME).W("user_had_get_history_step_v2", true);
        return false;
    }
}
