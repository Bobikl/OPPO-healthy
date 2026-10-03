package com.oplus.aiunit.vision;

import android.os.RemoteException;
import android.text.TextUtils;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQueryBuilder;
import com.heytap.databaseengine.apiv3.data.DataPoint;
import com.heytap.databaseengine.apiv3.data.DataSet;
import com.heytap.databaseengine.apiv3.data.DataType;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.databaseengine.callback.IDataReadResultListener;
import com.heytap.databaseengine.model.SportDataDetail;
import com.heytap.databaseengine.model.StepFrequency;
import com.heytap.databaseengine.option.DataDeleteOption;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.databaseengineservice.db.table.DBAssessmentRecord;
import com.heytap.databaseengineservice.db.table.DBSportDataDetail;
import com.heytap.databaseengineservice.db.table.DBSportDataStat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class rdi extends eei<DBSportDataDetail, SportDataDetail> {
    public final ndi d = this.f12345c.N0();

    public rdi() {
        this.b = new dpe();
    }

    @Override // com.oplus.aiunit.vision.eei, com.oplus.aiunit.vision.c0a
    public int a(List<DataSet> list) {
        return c(h(list));
    }

    @Override // com.oplus.aiunit.vision.eei, com.oplus.aiunit.vision.a0a
    public int b(DataDeleteOption dataDeleteOption) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setStartTime(dataDeleteOption.getStartTime());
        dataReadOption.setEndTime(dataDeleteOption.getEndTime());
        dataReadOption.setDataTable(dataDeleteOption.getDataTable());
        dataReadOption.setReadSportMode(dataDeleteOption.getSportMode());
        dataReadOption.setSsoid(dataDeleteOption.getSsoid());
        return this.d.i(l(dataReadOption));
    }

    @Override // com.oplus.aiunit.vision.eei, com.oplus.aiunit.vision.a0a
    public int c(List<SportDataDetail> list) {
        sj4.c("SportDataDetailStore", "saveSportHealthData list size is " + list.size());
        return this.b.a(list) ? 0 : 101001;
    }

    @Override // com.oplus.aiunit.vision.eei
    public List<DataSet> f(List<DBSportDataDetail> list, DataReadOption dataReadOption) {
        ArrayList arrayList = new ArrayList();
        DataSet.b bVarBuilder = DataSet.builder(DataType.TYPE_DAILY_ACTIVITY);
        for (DBSportDataDetail dBSportDataDetail : list) {
            bVarBuilder.a(DataPoint.builder(DataType.TYPE_DAILY_ACTIVITY).e(dBSportDataDetail.getStartTimestamp()).f(j(dBSportDataDetail.getStartTimestamp(), dataReadOption.getGroupUnitType(), dBSportDataDetail.getEndTimestamp())).c(Element.ELEMENT_STEP, dBSportDataDetail.getSteps()).c(Element.ELEMENT_DISTANCE, dBSportDataDetail.getDistance()).c(Element.ELEMENT_CALORIE, (int) dBSportDataDetail.getCalories()).a());
        }
        arrayList.add(bVarBuilder.c());
        return arrayList;
    }

    @Override // com.oplus.aiunit.vision.eei
    public List<SportDataDetail> g(List<DBSportDataDetail> list, DataReadOption dataReadOption) {
        int groupUnitType = dataReadOption.getGroupUnitType();
        List<SportDataDetail> listO = tx4.INSTANCE.O(list);
        if (listO == null) {
            return null;
        }
        if (groupUnitType == 3 && dataReadOption.getReadSportMode() == -3) {
            int anchor = dataReadOption.getAnchor();
            int count = dataReadOption.getCount();
            String str = " start_time " + (dataReadOption.getSortOrder() == 0 ? " asc" : " desc");
            String strB = toi.b(groupUnitType, dataReadOption.getGroupUnitSize(), DBSportDataDetail.TABLE_NAME);
            if (count > anchor) {
                str = str + " limit " + anchor + "," + count;
            }
            List<DBSportDataStat> listM = this.d.m(q(dataReadOption.getSsoid(), 0, dataReadOption.getStartTime(), dataReadOption.getEndTime(), 0, 30, strB, str));
            if (!rz.b(listO)) {
                for (int i = 0; i < listO.size(); i++) {
                    if (!rz.b(listM)) {
                        sj4.a("SportDataDetailStore", String.format("daily event get hours move about times:%s", Integer.valueOf(listM.get(i).getTotalMoveAboutTimes())));
                        if (listM.get(i).getTotalMoveAboutTimes() > 0) {
                            listO.get(i).setMoveAbout(1);
                        }
                    }
                }
            }
        }
        return listO;
    }

    @Override // com.oplus.aiunit.vision.eei
    public List<SportDataDetail> h(List<DataSet> list) {
        return super.h(list);
    }

    @Override // com.oplus.aiunit.vision.eei
    public void i(int i, List<?> list, IDataReadResultListener iDataReadResultListener, DataReadOption dataReadOption) throws RemoteException {
        if (!"activity_step_frequency".equals(dataReadOption.getDataReadType())) {
            super.i(i, list, iDataReadResultListener, dataReadOption);
            return;
        }
        sj4.c("SportDataDetailStore", "read step frequency");
        List<DBSportDataDetail> listK = this.d.k(p(dataReadOption.getSsoid(), dataReadOption.getStartTime(), dataReadOption.getEndTime(), dataReadOption.getSortOrder() == 0 ? " asc" : " desc"));
        ArrayList arrayList = new ArrayList();
        if (!rz.b(listK)) {
            for (DBSportDataDetail dBSportDataDetail : listK) {
                arrayList.add(new StepFrequency(dBSportDataDetail.getSsoid(), dBSportDataDetail.getDeviceUniqueId(), o15.i(dBSportDataDetail.getStartTimestamp()), dBSportDataDetail.getSteps(), dBSportDataDetail.getDistance()));
            }
        }
        sj4.a("SportDataDetailStore", "freList:" + arrayList);
        qt4.k(i, arrayList, iDataReadResultListener);
    }

    @Override // com.oplus.aiunit.vision.eei
    public List<DBSportDataDetail> l(DataReadOption dataReadOption) {
        long startTime = dataReadOption.getStartTime();
        long endTime = dataReadOption.getEndTime();
        int readSportMode = dataReadOption.getReadSportMode();
        String ssoid = dataReadOption.getSsoid();
        int groupUnitType = dataReadOption.getGroupUnitType();
        int anchor = dataReadOption.getAnchor();
        int count = dataReadOption.getCount();
        int sortOrder = dataReadOption.getSortOrder();
        sj4.c("SportDataDetailStore", "readSportHealthData: type is " + dataReadOption.getDataTable() + ", interval: " + startTime + ", " + endTime);
        StringBuilder sb = new StringBuilder();
        sb.append("readSportHealthData: who is ");
        sb.append(ssoid);
        sj4.a("SportDataDetailStore", sb.toString());
        if (groupUnitType < 1) {
            if ("activity_step_frequency".equals(dataReadOption.getDataReadType())) {
                return null;
            }
            if ("one_day_or_one_data".equals(dataReadOption.getDataReadType())) {
                return count > 0 ? this.d.c(ssoid, startTime, endTime, 1, sortOrder, count) : this.d.j(ssoid, startTime, endTime, 1, sortOrder);
            }
            if (dataReadOption.getAggregateType() == 103) {
                return this.d.q(ssoid, startTime, endTime);
            }
            return dataReadOption.getAggregateType() == 107 ? this.d.l(ssoid, startTime, endTime) : this.d.h(ssoid, startTime, endTime);
        }
        String str = sortOrder == 0 ? " asc" : " desc";
        String strB = toi.b(groupUnitType, dataReadOption.getGroupUnitSize(), DBSportDataDetail.TABLE_NAME);
        String str2 = " start_time " + str;
        if (count > anchor) {
            str2 = str2 + " limit " + anchor + "," + count;
        }
        String str3 = str2;
        SupportSQLiteQuery supportSQLiteQueryO = readSportMode != -3 ? o(ssoid, startTime, endTime, readSportMode, strB, str3) : r(ssoid, startTime, endTime, strB, str3);
        sj4.a("SportDataDetailStore", "readSportDataDetail aggregate query str:" + supportSQLiteQueryO.getSql() + ", who is " + ssoid + " sportMode is " + readSportMode);
        return this.d.k(supportSQLiteQueryO);
    }

    public final SupportSQLiteQuery o(String str, long j2, long j3, int i, String str2, String str3) {
        String str4;
        if (i == -2) {
            str4 = " != " + i;
        } else {
            str4 = " = " + i;
        }
        return SupportSQLiteQueryBuilder.builder(DBSportDataDetail.TABLE_NAME).columns(new String[]{"_id", DBAssessmentRecord.DEVICE_UNIQUE_ID, "case when device_category = 'Band' then device_category end as device_category", "ssoid", "start_time", "end_time", i + " as sport_mode", "display", "timezone", "modified_time", "updated", "sum(steps) as steps", "sum(distance) as distance", "sum(calories) as calories", "sync_status", "sum(amount_of_exercise) as amount_of_exercise", "sum(altitude_offset) as altitude_offset", "sum(workout) as workout", "sum(sedentary_state) as sedentary_state"}).groupBy(!TextUtils.isEmpty(str2) ? str2 : null).orderBy(str3).selection("ssoid = ? and start_time between ? and ? and display = 1 and sport_mode" + str4, new Object[]{str, Long.valueOf(j2), Long.valueOf(j3)}).create();
    }

    public final SupportSQLiteQuery p(String str, long j2, long j3, String str2) {
        return SupportSQLiteQueryBuilder.builder(DBSportDataDetail.TABLE_NAME).columns(new String[]{DBAssessmentRecord.DEVICE_UNIQUE_ID, "ssoid", "start_time", "end_time", "min(steps) as steps", "max(steps) as distance"}).groupBy(toi.b(4, 0, DBSportDataDetail.TABLE_NAME)).orderBy("start_time" + str2).selection("ssoid = ? and start_time between ? and ? and display = 1 and steps > 0", new Object[]{str, Long.valueOf(j2), Long.valueOf(j3)}).create();
    }

    public SupportSQLiteQuery q(String str, int i, long j2, long j3, int i2, int i3, String str2, String str3) {
        return SupportSQLiteQueryBuilder.builder(DBSportDataDetail.TABLE_NAME).columns(new String[]{"0 as _id", "ssoid", DBAssessmentRecord.DEVICE_UNIQUE_ID, "sport_mode", i + " as date", "sum(case when device_category in ('Watch') then steps > " + i2 + " when device_category" + toi.NOT_IN_WATCH1_PHONE_DEVICE_CATEGORY + " then steps > " + i3 + " end) as total_move_about_times"}).groupBy(str2).orderBy(str3).selection("ssoid = ? and start_time between ? and ? and display = 1 and device_category not in ('Phone','mobile','')", new Object[]{str, Long.valueOf(j2), Long.valueOf(j3)}).create();
    }

    public final SupportSQLiteQuery r(String str, long j2, long j3, String str2, String str3) {
        return SupportSQLiteQueryBuilder.builder(DBSportDataDetail.TABLE_NAME).columns(new String[]{"_id", DBAssessmentRecord.DEVICE_UNIQUE_ID, "ssoid", "start_time", "end_time", "sport_mode", "display", "timezone", "sum(steps) as steps", "sum(distance) as distance", "sum(calories) as calories", "sync_status", Element.ELEMENT_NAME_DEVICE_CATEGORY, "sum(altitude_offset) as altitude_offset", "sum(amount_of_exercise) as amount_of_exercise", "sum(workout) as workout", "sum(sedentary_state) as sedentary_state"}).groupBy(str2).orderBy(str3).selection("ssoid = ? and start_time between ? and ? and display = 1 and device_category not in ('Phone','mobile','')", new Object[]{str, Long.valueOf(j2), Long.valueOf(j3)}).create();
    }
}