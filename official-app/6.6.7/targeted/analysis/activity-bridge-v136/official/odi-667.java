package com.oplus.aiunit.vision;

import android.database.Cursor;
import androidx.core.app.NotificationCompat;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.databaseengineservice.db.table.DBAssessmentRecord;
import com.heytap.databaseengineservice.db.table.DBSportDataDetail;
import com.heytap.databaseengineservice.db.table.DBSportDataStat;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import com.heytap.databaseengineservice.db.table.sunshine.DBSunshineStat;
import com.heytap.sports.record.details.bean.SportSummaryBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class odi implements ndi {
    public final RoomDatabase a;
    public final EntityInsertionAdapter<DBSportDataDetail> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EntityDeletionOrUpdateAdapter<DBSportDataDetail> f16347c;
    public final EntityDeletionOrUpdateAdapter<DBSportDataDetail> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SharedSQLiteStatement f16348e;

    public class a extends EntityInsertionAdapter<DBSportDataDetail> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, DBSportDataDetail dBSportDataDetail) {
            supportSQLiteStatement.bindLong(1, dBSportDataDetail.getSportDetailId());
            if (dBSportDataDetail.getClientDataId() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, dBSportDataDetail.getClientDataId());
            }
            if (dBSportDataDetail.getSsoid() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, dBSportDataDetail.getSsoid());
            }
            if (dBSportDataDetail.getDeviceUniqueId() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, dBSportDataDetail.getDeviceUniqueId());
            }
            if (dBSportDataDetail.getDeviceType() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, dBSportDataDetail.getDeviceType());
            }
            supportSQLiteStatement.bindLong(6, dBSportDataDetail.getStartTimestamp());
            supportSQLiteStatement.bindLong(7, dBSportDataDetail.getEndTimestamp());
            supportSQLiteStatement.bindLong(8, dBSportDataDetail.getSportMode());
            supportSQLiteStatement.bindLong(9, dBSportDataDetail.getSteps());
            supportSQLiteStatement.bindLong(10, dBSportDataDetail.getDistance());
            supportSQLiteStatement.bindLong(11, dBSportDataDetail.getCalories());
            supportSQLiteStatement.bindLong(12, dBSportDataDetail.getAltitudeOffset());
            supportSQLiteStatement.bindLong(13, dBSportDataDetail.getDisplay());
            supportSQLiteStatement.bindLong(14, dBSportDataDetail.getSyncStatus());
            if (dBSportDataDetail.getTimezone() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, dBSportDataDetail.getTimezone());
            }
            supportSQLiteStatement.bindLong(16, dBSportDataDetail.getModifiedTime());
            supportSQLiteStatement.bindLong(17, dBSportDataDetail.getUpdated());
            supportSQLiteStatement.bindLong(18, dBSportDataDetail.getDataVersion());
            supportSQLiteStatement.bindLong(19, dBSportDataDetail.getWorkout());
            supportSQLiteStatement.bindLong(20, dBSportDataDetail.getSedentaryState());
            supportSQLiteStatement.bindLong(21, dBSportDataDetail.getAmountOfExercise());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `DBSportDataDetail` (`_id`,`client_data_id`,`ssoid`,`device_unique_id`,`device_category`,`start_time`,`end_time`,`sport_mode`,`steps`,`distance`,`calories`,`altitude_offset`,`display`,`sync_status`,`timezone`,`modified_time`,`updated`,`data_version`,`workout`,`sedentary_state`,`amount_of_exercise`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeletionOrUpdateAdapter<DBSportDataDetail> {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, DBSportDataDetail dBSportDataDetail) {
            if (dBSportDataDetail.getSsoid() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, dBSportDataDetail.getSsoid());
            }
            if (dBSportDataDetail.getDeviceUniqueId() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, dBSportDataDetail.getDeviceUniqueId());
            }
            supportSQLiteStatement.bindLong(3, dBSportDataDetail.getStartTimestamp());
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM `DBSportDataDetail` WHERE `ssoid` = ? AND `device_unique_id` = ? AND `start_time` = ?";
        }
    }

    public class c extends EntityDeletionOrUpdateAdapter<DBSportDataDetail> {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, DBSportDataDetail dBSportDataDetail) {
            supportSQLiteStatement.bindLong(1, dBSportDataDetail.getSportDetailId());
            if (dBSportDataDetail.getClientDataId() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, dBSportDataDetail.getClientDataId());
            }
            if (dBSportDataDetail.getSsoid() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, dBSportDataDetail.getSsoid());
            }
            if (dBSportDataDetail.getDeviceUniqueId() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, dBSportDataDetail.getDeviceUniqueId());
            }
            if (dBSportDataDetail.getDeviceType() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, dBSportDataDetail.getDeviceType());
            }
            supportSQLiteStatement.bindLong(6, dBSportDataDetail.getStartTimestamp());
            supportSQLiteStatement.bindLong(7, dBSportDataDetail.getEndTimestamp());
            supportSQLiteStatement.bindLong(8, dBSportDataDetail.getSportMode());
            supportSQLiteStatement.bindLong(9, dBSportDataDetail.getSteps());
            supportSQLiteStatement.bindLong(10, dBSportDataDetail.getDistance());
            supportSQLiteStatement.bindLong(11, dBSportDataDetail.getCalories());
            supportSQLiteStatement.bindLong(12, dBSportDataDetail.getAltitudeOffset());
            supportSQLiteStatement.bindLong(13, dBSportDataDetail.getDisplay());
            supportSQLiteStatement.bindLong(14, dBSportDataDetail.getSyncStatus());
            if (dBSportDataDetail.getTimezone() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, dBSportDataDetail.getTimezone());
            }
            supportSQLiteStatement.bindLong(16, dBSportDataDetail.getModifiedTime());
            supportSQLiteStatement.bindLong(17, dBSportDataDetail.getUpdated());
            supportSQLiteStatement.bindLong(18, dBSportDataDetail.getDataVersion());
            supportSQLiteStatement.bindLong(19, dBSportDataDetail.getWorkout());
            supportSQLiteStatement.bindLong(20, dBSportDataDetail.getSedentaryState());
            supportSQLiteStatement.bindLong(21, dBSportDataDetail.getAmountOfExercise());
            if (dBSportDataDetail.getSsoid() == null) {
                supportSQLiteStatement.bindNull(22);
            } else {
                supportSQLiteStatement.bindString(22, dBSportDataDetail.getSsoid());
            }
            if (dBSportDataDetail.getDeviceUniqueId() == null) {
                supportSQLiteStatement.bindNull(23);
            } else {
                supportSQLiteStatement.bindString(23, dBSportDataDetail.getDeviceUniqueId());
            }
            supportSQLiteStatement.bindLong(24, dBSportDataDetail.getStartTimestamp());
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR ABORT `DBSportDataDetail` SET `_id` = ?,`client_data_id` = ?,`ssoid` = ?,`device_unique_id` = ?,`device_category` = ?,`start_time` = ?,`end_time` = ?,`sport_mode` = ?,`steps` = ?,`distance` = ?,`calories` = ?,`altitude_offset` = ?,`display` = ?,`sync_status` = ?,`timezone` = ?,`modified_time` = ?,`updated` = ?,`data_version` = ?,`workout` = ?,`sedentary_state` = ?,`amount_of_exercise` = ? WHERE `ssoid` = ? AND `device_unique_id` = ? AND `start_time` = ?";
        }
    }

    public class d extends SharedSQLiteStatement {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from DBSportDataDetail where ssoid = ?";
        }
    }

    public odi(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.f16347c = new b(roomDatabase);
        this.d = new c(roomDatabase);
        this.f16348e = new d(roomDatabase);
    }

    public static List<Class<?>> t() {
        return Collections.emptyList();
    }

    @Override // com.oplus.aiunit.vision.ndi
    public List<Long> a(List<DBSportDataDetail> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            List<Long> listInsertAndReturnIdsList = this.b.insertAndReturnIdsList(list);
            this.a.setTransactionSuccessful();
            return listInsertAndReturnIdsList;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.oplus.aiunit.vision.ndi
    public int b(List<DBSportDataDetail> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            int iHandleMultiple = this.d.handleMultiple(list) + 0;
            this.a.setTransactionSuccessful();
            return iHandleMultiple;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.oplus.aiunit.vision.ndi
    public List<DBSportDataDetail> c(String str, long j2, long j3, int i, int i2, int i3) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from DBSportDataDetail where ssoid = ? and start_time between ? and ? and display = ? order by case when ? = 1 then start_time end desc, case when ? = 0 then start_time end asc limit ?", 7);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, j2);
        roomSQLiteQueryAcquire.bindLong(3, j3);
        roomSQLiteQueryAcquire.bindLong(4, i);
        long j4 = i2;
        roomSQLiteQueryAcquire.bindLong(5, j4);
        roomSQLiteQueryAcquire.bindLong(6, j4);
        roomSQLiteQueryAcquire.bindLong(7, i3);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBSportMetadata.CLIENT_DATA_ID);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ssoid");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBAssessmentRecord.DEVICE_UNIQUE_ID);
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Element.ELEMENT_NAME_DEVICE_CATEGORY);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "start_time");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "end_time");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sport_mode");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "steps");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "distance");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, SportSummaryBean.CALORIES);
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "altitude_offset");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "display");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sync_status");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timezone");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "modified_time");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "updated");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data_version");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, NotificationCompat.CATEGORY_WORKOUT);
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sedentary_state");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "amount_of_exercise");
                int i4 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    DBSportDataDetail dBSportDataDetail = new DBSportDataDetail();
                    int i5 = columnIndexOrThrow12;
                    int i6 = columnIndexOrThrow13;
                    dBSportDataDetail.setSportDetailId(cursorQuery.getLong(columnIndexOrThrow));
                    dBSportDataDetail.setClientDataId(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    dBSportDataDetail.setSsoid(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    dBSportDataDetail.setDeviceUniqueId(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                    dBSportDataDetail.setDeviceType(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5));
                    dBSportDataDetail.setStartTimestamp(cursorQuery.getLong(columnIndexOrThrow6));
                    dBSportDataDetail.setEndTimestamp(cursorQuery.getLong(columnIndexOrThrow7));
                    dBSportDataDetail.setSportMode(cursorQuery.getInt(columnIndexOrThrow8));
                    dBSportDataDetail.setSteps(cursorQuery.getInt(columnIndexOrThrow9));
                    dBSportDataDetail.setDistance(cursorQuery.getInt(columnIndexOrThrow10));
                    dBSportDataDetail.setCalories(cursorQuery.getLong(columnIndexOrThrow11));
                    columnIndexOrThrow12 = i5;
                    dBSportDataDetail.setAltitudeOffset(cursorQuery.getInt(columnIndexOrThrow12));
                    int i7 = columnIndexOrThrow;
                    columnIndexOrThrow13 = i6;
                    dBSportDataDetail.setDisplay(cursorQuery.getInt(columnIndexOrThrow13));
                    int i8 = i4;
                    int i9 = columnIndexOrThrow2;
                    dBSportDataDetail.setSyncStatus(cursorQuery.getInt(i8));
                    int i10 = columnIndexOrThrow15;
                    dBSportDataDetail.setTimezone(cursorQuery.isNull(i10) ? null : cursorQuery.getString(i10));
                    int i11 = columnIndexOrThrow16;
                    int i12 = columnIndexOrThrow3;
                    dBSportDataDetail.setModifiedTime(cursorQuery.getLong(i11));
                    int i13 = columnIndexOrThrow17;
                    dBSportDataDetail.setUpdated(cursorQuery.getInt(i13));
                    int i14 = columnIndexOrThrow18;
                    dBSportDataDetail.setDataVersion(cursorQuery.getInt(i14));
                    int i15 = columnIndexOrThrow19;
                    dBSportDataDetail.setWorkout(cursorQuery.getInt(i15));
                    int i16 = columnIndexOrThrow20;
                    columnIndexOrThrow19 = i15;
                    dBSportDataDetail.setSedentaryState(cursorQuery.getInt(i16));
                    int i17 = columnIndexOrThrow21;
                    columnIndexOrThrow20 = i16;
                    dBSportDataDetail.setAmountOfExercise(cursorQuery.getInt(i17));
                    arrayList.add(dBSportDataDetail);
                    columnIndexOrThrow2 = i9;
                    columnIndexOrThrow21 = i17;
                    columnIndexOrThrow = i7;
                    i4 = i8;
                    columnIndexOrThrow15 = i10;
                    columnIndexOrThrow3 = i12;
                    columnIndexOrThrow16 = i11;
                    columnIndexOrThrow17 = i13;
                    columnIndexOrThrow18 = i14;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.oplus.aiunit.vision.ndi
    public List<DBSportDataDetail> d(long j2, long j3, int i, int i2, String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select _id, '' as ssoid, client_data_id, device_unique_id, device_category, start_time, end_time, sport_mode, steps, distance, calories, altitude_offset, display, sync_status, updated, data_version, workout, sedentary_state, amount_of_exercise, modified_time, timezone from DBSportDataDetail where ssoid = ? and (sync_status = 0 or updated = 1) and start_time between ? and ? order by case when ? = 1 then start_time end desc, case when ? = 0 then start_time end asc limit ?", 6);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, j2);
        roomSQLiteQueryAcquire.bindLong(3, j3);
        long j4 = i2;
        roomSQLiteQueryAcquire.bindLong(4, j4);
        roomSQLiteQueryAcquire.bindLong(5, j4);
        roomSQLiteQueryAcquire.bindLong(6, i);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                DBSportDataDetail dBSportDataDetail = new DBSportDataDetail();
                dBSportDataDetail.setSportDetailId(cursorQuery.getLong(0));
                dBSportDataDetail.setSsoid(cursorQuery.isNull(1) ? null : cursorQuery.getString(1));
                dBSportDataDetail.setClientDataId(cursorQuery.isNull(2) ? null : cursorQuery.getString(2));
                dBSportDataDetail.setDeviceUniqueId(cursorQuery.isNull(3) ? null : cursorQuery.getString(3));
                dBSportDataDetail.setDeviceType(cursorQuery.isNull(4) ? null : cursorQuery.getString(4));
                dBSportDataDetail.setStartTimestamp(cursorQuery.getLong(5));
                dBSportDataDetail.setEndTimestamp(cursorQuery.getLong(6));
                dBSportDataDetail.setSportMode(cursorQuery.getInt(7));
                dBSportDataDetail.setSteps(cursorQuery.getInt(8));
                dBSportDataDetail.setDistance(cursorQuery.getInt(9));
                dBSportDataDetail.setCalories(cursorQuery.getLong(10));
                dBSportDataDetail.setAltitudeOffset(cursorQuery.getInt(11));
                dBSportDataDetail.setDisplay(cursorQuery.getInt(12));
                dBSportDataDetail.setSyncStatus(cursorQuery.getInt(13));
                dBSportDataDetail.setUpdated(cursorQuery.getInt(14));
                dBSportDataDetail.setDataVersion(cursorQuery.getInt(15));
                dBSportDataDetail.setWorkout(cursorQuery.getInt(16));
                dBSportDataDetail.setSedentaryState(cursorQuery.getInt(17));
                dBSportDataDetail.setAmountOfExercise(cursorQuery.getInt(18));
                dBSportDataDetail.setModifiedTime(cursorQuery.getLong(19));
                dBSportDataDetail.setTimezone(cursorQuery.isNull(20) ? null : cursorQuery.getString(20));
                arrayList.add(dBSportDataDetail);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.oplus.aiunit.vision.ndi
    public List<DBSportDataDetail> e(String str, long j2, long j3) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from DBSportDataDetail where ssoid = ? and start_time >= ? and end_time <= ? and display = 1 order by start_time desc", 3);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, j2);
        roomSQLiteQueryAcquire.bindLong(3, j3);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBSportMetadata.CLIENT_DATA_ID);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ssoid");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBAssessmentRecord.DEVICE_UNIQUE_ID);
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Element.ELEMENT_NAME_DEVICE_CATEGORY);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "start_time");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "end_time");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sport_mode");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "steps");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "distance");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, SportSummaryBean.CALORIES);
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "altitude_offset");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "display");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sync_status");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timezone");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "modified_time");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "updated");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data_version");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, NotificationCompat.CATEGORY_WORKOUT);
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sedentary_state");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "amount_of_exercise");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    DBSportDataDetail dBSportDataDetail = new DBSportDataDetail();
                    int i2 = columnIndexOrThrow12;
                    int i3 = columnIndexOrThrow13;
                    dBSportDataDetail.setSportDetailId(cursorQuery.getLong(columnIndexOrThrow));
                    dBSportDataDetail.setClientDataId(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    dBSportDataDetail.setSsoid(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    dBSportDataDetail.setDeviceUniqueId(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                    dBSportDataDetail.setDeviceType(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5));
                    dBSportDataDetail.setStartTimestamp(cursorQuery.getLong(columnIndexOrThrow6));
                    dBSportDataDetail.setEndTimestamp(cursorQuery.getLong(columnIndexOrThrow7));
                    dBSportDataDetail.setSportMode(cursorQuery.getInt(columnIndexOrThrow8));
                    dBSportDataDetail.setSteps(cursorQuery.getInt(columnIndexOrThrow9));
                    dBSportDataDetail.setDistance(cursorQuery.getInt(columnIndexOrThrow10));
                    dBSportDataDetail.setCalories(cursorQuery.getLong(columnIndexOrThrow11));
                    columnIndexOrThrow12 = i2;
                    dBSportDataDetail.setAltitudeOffset(cursorQuery.getInt(columnIndexOrThrow12));
                    int i4 = columnIndexOrThrow;
                    columnIndexOrThrow13 = i3;
                    dBSportDataDetail.setDisplay(cursorQuery.getInt(columnIndexOrThrow13));
                    int i5 = i;
                    int i6 = columnIndexOrThrow2;
                    dBSportDataDetail.setSyncStatus(cursorQuery.getInt(i5));
                    int i7 = columnIndexOrThrow15;
                    dBSportDataDetail.setTimezone(cursorQuery.isNull(i7) ? null : cursorQuery.getString(i7));
                    int i8 = columnIndexOrThrow16;
                    int i9 = columnIndexOrThrow3;
                    dBSportDataDetail.setModifiedTime(cursorQuery.getLong(i8));
                    int i10 = columnIndexOrThrow17;
                    dBSportDataDetail.setUpdated(cursorQuery.getInt(i10));
                    int i11 = columnIndexOrThrow18;
                    dBSportDataDetail.setDataVersion(cursorQuery.getInt(i11));
                    int i12 = columnIndexOrThrow19;
                    dBSportDataDetail.setWorkout(cursorQuery.getInt(i12));
                    columnIndexOrThrow19 = i12;
                    int i13 = columnIndexOrThrow20;
                    dBSportDataDetail.setSedentaryState(cursorQuery.getInt(i13));
                    columnIndexOrThrow20 = i13;
                    int i14 = columnIndexOrThrow21;
                    dBSportDataDetail.setAmountOfExercise(cursorQuery.getInt(i14));
                    arrayList.add(dBSportDataDetail);
                    columnIndexOrThrow21 = i14;
                    columnIndexOrThrow2 = i6;
                    columnIndexOrThrow = i4;
                    i = i5;
                    columnIndexOrThrow15 = i7;
                    columnIndexOrThrow3 = i9;
                    columnIndexOrThrow16 = i8;
                    columnIndexOrThrow17 = i10;
                    columnIndexOrThrow18 = i11;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.oplus.aiunit.vision.ndi
    public int f(String str) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f16348e.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        this.a.beginTransaction();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.a.endTransaction();
            this.f16348e.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.oplus.aiunit.vision.ndi
    public long g(String str, long j2, long j3) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select MAX(modified_time) from DBSportDataDetail where ssoid = ? and modified_time between ? and ?", 3);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, j2);
        roomSQLiteQueryAcquire.bindLong(3, j3);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getLong(0) : 0L;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.oplus.aiunit.vision.ndi
    public List<DBSportDataDetail> h(String str, long j2, long j3) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from DBSportDataDetail where ssoid = ? and start_time between ? and ? order by start_time desc", 3);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, j2);
        roomSQLiteQueryAcquire.bindLong(3, j3);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBSportMetadata.CLIENT_DATA_ID);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ssoid");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBAssessmentRecord.DEVICE_UNIQUE_ID);
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Element.ELEMENT_NAME_DEVICE_CATEGORY);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "start_time");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "end_time");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sport_mode");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "steps");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "distance");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, SportSummaryBean.CALORIES);
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "altitude_offset");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "display");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sync_status");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timezone");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "modified_time");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "updated");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data_version");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, NotificationCompat.CATEGORY_WORKOUT);
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sedentary_state");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "amount_of_exercise");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    DBSportDataDetail dBSportDataDetail = new DBSportDataDetail();
                    int i2 = columnIndexOrThrow12;
                    int i3 = columnIndexOrThrow13;
                    dBSportDataDetail.setSportDetailId(cursorQuery.getLong(columnIndexOrThrow));
                    dBSportDataDetail.setClientDataId(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    dBSportDataDetail.setSsoid(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    dBSportDataDetail.setDeviceUniqueId(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                    dBSportDataDetail.setDeviceType(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5));
                    dBSportDataDetail.setStartTimestamp(cursorQuery.getLong(columnIndexOrThrow6));
                    dBSportDataDetail.setEndTimestamp(cursorQuery.getLong(columnIndexOrThrow7));
                    dBSportDataDetail.setSportMode(cursorQuery.getInt(columnIndexOrThrow8));
                    dBSportDataDetail.setSteps(cursorQuery.getInt(columnIndexOrThrow9));
                    dBSportDataDetail.setDistance(cursorQuery.getInt(columnIndexOrThrow10));
                    dBSportDataDetail.setCalories(cursorQuery.getLong(columnIndexOrThrow11));
                    columnIndexOrThrow12 = i2;
                    dBSportDataDetail.setAltitudeOffset(cursorQuery.getInt(columnIndexOrThrow12));
                    int i4 = columnIndexOrThrow;
                    columnIndexOrThrow13 = i3;
                    dBSportDataDetail.setDisplay(cursorQuery.getInt(columnIndexOrThrow13));
                    int i5 = i;
                    int i6 = columnIndexOrThrow2;
                    dBSportDataDetail.setSyncStatus(cursorQuery.getInt(i5));
                    int i7 = columnIndexOrThrow15;
                    dBSportDataDetail.setTimezone(cursorQuery.isNull(i7) ? null : cursorQuery.getString(i7));
                    int i8 = columnIndexOrThrow16;
                    int i9 = columnIndexOrThrow3;
                    dBSportDataDetail.setModifiedTime(cursorQuery.getLong(i8));
                    int i10 = columnIndexOrThrow17;
                    dBSportDataDetail.setUpdated(cursorQuery.getInt(i10));
                    int i11 = columnIndexOrThrow18;
                    dBSportDataDetail.setDataVersion(cursorQuery.getInt(i11));
                    int i12 = columnIndexOrThrow19;
                    dBSportDataDetail.setWorkout(cursorQuery.getInt(i12));
                    columnIndexOrThrow19 = i12;
                    int i13 = columnIndexOrThrow20;
                    dBSportDataDetail.setSedentaryState(cursorQuery.getInt(i13));
                    columnIndexOrThrow20 = i13;
                    int i14 = columnIndexOrThrow21;
                    dBSportDataDetail.setAmountOfExercise(cursorQuery.getInt(i14));
                    arrayList.add(dBSportDataDetail);
                    columnIndexOrThrow21 = i14;
                    columnIndexOrThrow2 = i6;
                    columnIndexOrThrow = i4;
                    i = i5;
                    columnIndexOrThrow15 = i7;
                    columnIndexOrThrow3 = i9;
                    columnIndexOrThrow16 = i8;
                    columnIndexOrThrow17 = i10;
                    columnIndexOrThrow18 = i11;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.oplus.aiunit.vision.ndi
    public int i(List<DBSportDataDetail> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            int iHandleMultiple = this.f16347c.handleMultiple(list) + 0;
            this.a.setTransactionSuccessful();
            return iHandleMultiple;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.oplus.aiunit.vision.ndi
    public List<DBSportDataDetail> j(String str, long j2, long j3, int i, int i2) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from DBSportDataDetail where ssoid = ? and start_time between ? and ? and display = ? group by start_time order by case when ? = 1 then start_time end desc, case when ? = 0 then start_time end asc", 6);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, j2);
        roomSQLiteQueryAcquire.bindLong(3, j3);
        roomSQLiteQueryAcquire.bindLong(4, i);
        long j4 = i2;
        roomSQLiteQueryAcquire.bindLong(5, j4);
        roomSQLiteQueryAcquire.bindLong(6, j4);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBSportMetadata.CLIENT_DATA_ID);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ssoid");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBAssessmentRecord.DEVICE_UNIQUE_ID);
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Element.ELEMENT_NAME_DEVICE_CATEGORY);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "start_time");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "end_time");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sport_mode");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "steps");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "distance");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, SportSummaryBean.CALORIES);
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "altitude_offset");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "display");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sync_status");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timezone");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "modified_time");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "updated");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data_version");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, NotificationCompat.CATEGORY_WORKOUT);
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sedentary_state");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "amount_of_exercise");
                int i3 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    DBSportDataDetail dBSportDataDetail = new DBSportDataDetail();
                    int i4 = columnIndexOrThrow12;
                    int i5 = columnIndexOrThrow13;
                    dBSportDataDetail.setSportDetailId(cursorQuery.getLong(columnIndexOrThrow));
                    dBSportDataDetail.setClientDataId(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    dBSportDataDetail.setSsoid(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    dBSportDataDetail.setDeviceUniqueId(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                    dBSportDataDetail.setDeviceType(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5));
                    dBSportDataDetail.setStartTimestamp(cursorQuery.getLong(columnIndexOrThrow6));
                    dBSportDataDetail.setEndTimestamp(cursorQuery.getLong(columnIndexOrThrow7));
                    dBSportDataDetail.setSportMode(cursorQuery.getInt(columnIndexOrThrow8));
                    dBSportDataDetail.setSteps(cursorQuery.getInt(columnIndexOrThrow9));
                    dBSportDataDetail.setDistance(cursorQuery.getInt(columnIndexOrThrow10));
                    dBSportDataDetail.setCalories(cursorQuery.getLong(columnIndexOrThrow11));
                    columnIndexOrThrow12 = i4;
                    dBSportDataDetail.setAltitudeOffset(cursorQuery.getInt(columnIndexOrThrow12));
                    int i6 = columnIndexOrThrow;
                    columnIndexOrThrow13 = i5;
                    dBSportDataDetail.setDisplay(cursorQuery.getInt(columnIndexOrThrow13));
                    int i7 = i3;
                    int i8 = columnIndexOrThrow2;
                    dBSportDataDetail.setSyncStatus(cursorQuery.getInt(i7));
                    int i9 = columnIndexOrThrow15;
                    dBSportDataDetail.setTimezone(cursorQuery.isNull(i9) ? null : cursorQuery.getString(i9));
                    int i10 = columnIndexOrThrow16;
                    int i11 = columnIndexOrThrow3;
                    dBSportDataDetail.setModifiedTime(cursorQuery.getLong(i10));
                    int i12 = columnIndexOrThrow17;
                    dBSportDataDetail.setUpdated(cursorQuery.getInt(i12));
                    int i13 = columnIndexOrThrow18;
                    dBSportDataDetail.setDataVersion(cursorQuery.getInt(i13));
                    int i14 = columnIndexOrThrow19;
                    dBSportDataDetail.setWorkout(cursorQuery.getInt(i14));
                    int i15 = columnIndexOrThrow20;
                    columnIndexOrThrow19 = i14;
                    dBSportDataDetail.setSedentaryState(cursorQuery.getInt(i15));
                    int i16 = columnIndexOrThrow21;
                    columnIndexOrThrow20 = i15;
                    dBSportDataDetail.setAmountOfExercise(cursorQuery.getInt(i16));
                    arrayList.add(dBSportDataDetail);
                    columnIndexOrThrow21 = i16;
                    columnIndexOrThrow2 = i8;
                    columnIndexOrThrow = i6;
                    i3 = i7;
                    columnIndexOrThrow15 = i9;
                    columnIndexOrThrow3 = i11;
                    columnIndexOrThrow16 = i10;
                    columnIndexOrThrow17 = i12;
                    columnIndexOrThrow18 = i13;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.oplus.aiunit.vision.ndi
    public List<DBSportDataDetail> k(SupportSQLiteQuery supportSQLiteQuery) {
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, supportSQLiteQuery, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(r(cursorQuery));
            }
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    @Override // com.oplus.aiunit.vision.ndi
    public List<DBSportDataDetail> l(String str, long j2, long j3) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from DBSportDataDetail where ssoid = ? and start_time >= ? and end_time <= ? and display = 1 order by start_time desc", 3);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, j2);
        roomSQLiteQueryAcquire.bindLong(3, j3);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBSportMetadata.CLIENT_DATA_ID);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ssoid");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBAssessmentRecord.DEVICE_UNIQUE_ID);
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Element.ELEMENT_NAME_DEVICE_CATEGORY);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "start_time");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "end_time");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sport_mode");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "steps");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "distance");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, SportSummaryBean.CALORIES);
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "altitude_offset");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "display");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sync_status");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timezone");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "modified_time");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "updated");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data_version");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, NotificationCompat.CATEGORY_WORKOUT);
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sedentary_state");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "amount_of_exercise");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    DBSportDataDetail dBSportDataDetail = new DBSportDataDetail();
                    int i2 = columnIndexOrThrow12;
                    int i3 = columnIndexOrThrow13;
                    dBSportDataDetail.setSportDetailId(cursorQuery.getLong(columnIndexOrThrow));
                    dBSportDataDetail.setClientDataId(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    dBSportDataDetail.setSsoid(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    dBSportDataDetail.setDeviceUniqueId(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                    dBSportDataDetail.setDeviceType(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5));
                    dBSportDataDetail.setStartTimestamp(cursorQuery.getLong(columnIndexOrThrow6));
                    dBSportDataDetail.setEndTimestamp(cursorQuery.getLong(columnIndexOrThrow7));
                    dBSportDataDetail.setSportMode(cursorQuery.getInt(columnIndexOrThrow8));
                    dBSportDataDetail.setSteps(cursorQuery.getInt(columnIndexOrThrow9));
                    dBSportDataDetail.setDistance(cursorQuery.getInt(columnIndexOrThrow10));
                    dBSportDataDetail.setCalories(cursorQuery.getLong(columnIndexOrThrow11));
                    columnIndexOrThrow12 = i2;
                    dBSportDataDetail.setAltitudeOffset(cursorQuery.getInt(columnIndexOrThrow12));
                    int i4 = columnIndexOrThrow;
                    columnIndexOrThrow13 = i3;
                    dBSportDataDetail.setDisplay(cursorQuery.getInt(columnIndexOrThrow13));
                    int i5 = i;
                    int i6 = columnIndexOrThrow2;
                    dBSportDataDetail.setSyncStatus(cursorQuery.getInt(i5));
                    int i7 = columnIndexOrThrow15;
                    dBSportDataDetail.setTimezone(cursorQuery.isNull(i7) ? null : cursorQuery.getString(i7));
                    int i8 = columnIndexOrThrow16;
                    int i9 = columnIndexOrThrow3;
                    dBSportDataDetail.setModifiedTime(cursorQuery.getLong(i8));
                    int i10 = columnIndexOrThrow17;
                    dBSportDataDetail.setUpdated(cursorQuery.getInt(i10));
                    int i11 = columnIndexOrThrow18;
                    dBSportDataDetail.setDataVersion(cursorQuery.getInt(i11));
                    int i12 = columnIndexOrThrow19;
                    dBSportDataDetail.setWorkout(cursorQuery.getInt(i12));
                    columnIndexOrThrow19 = i12;
                    int i13 = columnIndexOrThrow20;
                    dBSportDataDetail.setSedentaryState(cursorQuery.getInt(i13));
                    columnIndexOrThrow20 = i13;
                    int i14 = columnIndexOrThrow21;
                    dBSportDataDetail.setAmountOfExercise(cursorQuery.getInt(i14));
                    arrayList.add(dBSportDataDetail);
                    columnIndexOrThrow21 = i14;
                    columnIndexOrThrow2 = i6;
                    columnIndexOrThrow = i4;
                    i = i5;
                    columnIndexOrThrow15 = i7;
                    columnIndexOrThrow3 = i9;
                    columnIndexOrThrow16 = i8;
                    columnIndexOrThrow17 = i10;
                    columnIndexOrThrow18 = i11;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.oplus.aiunit.vision.ndi
    public List<DBSportDataStat> m(SupportSQLiteQuery supportSQLiteQuery) {
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, supportSQLiteQuery, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(s(cursorQuery));
            }
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    @Override // com.oplus.aiunit.vision.ndi
    public List<DBSportDataDetail> n(String str, List<String> list, List<Long> list2) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("select * from DBSportDataDetail where ssoid = ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" and device_unique_id in (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(") and start_time in (");
        int size2 = list2.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size2);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size + 1 + size2);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        int i = 2;
        for (String str2 : list) {
            if (str2 == null) {
                roomSQLiteQueryAcquire.bindNull(i);
            } else {
                roomSQLiteQueryAcquire.bindString(i, str2);
            }
            i++;
        }
        int i2 = size + 2;
        for (Long l2 : list2) {
            if (l2 == null) {
                roomSQLiteQueryAcquire.bindNull(i2);
            } else {
                roomSQLiteQueryAcquire.bindLong(i2, l2.longValue());
            }
            i2++;
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBSportMetadata.CLIENT_DATA_ID);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ssoid");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBAssessmentRecord.DEVICE_UNIQUE_ID);
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Element.ELEMENT_NAME_DEVICE_CATEGORY);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "start_time");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "end_time");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sport_mode");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "steps");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "distance");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, SportSummaryBean.CALORIES);
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "altitude_offset");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "display");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sync_status");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timezone");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "modified_time");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "updated");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data_version");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, NotificationCompat.CATEGORY_WORKOUT);
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sedentary_state");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "amount_of_exercise");
                int i3 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    DBSportDataDetail dBSportDataDetail = new DBSportDataDetail();
                    int i4 = columnIndexOrThrow12;
                    int i5 = columnIndexOrThrow13;
                    dBSportDataDetail.setSportDetailId(cursorQuery.getLong(columnIndexOrThrow));
                    dBSportDataDetail.setClientDataId(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    dBSportDataDetail.setSsoid(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    dBSportDataDetail.setDeviceUniqueId(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                    dBSportDataDetail.setDeviceType(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5));
                    dBSportDataDetail.setStartTimestamp(cursorQuery.getLong(columnIndexOrThrow6));
                    dBSportDataDetail.setEndTimestamp(cursorQuery.getLong(columnIndexOrThrow7));
                    dBSportDataDetail.setSportMode(cursorQuery.getInt(columnIndexOrThrow8));
                    dBSportDataDetail.setSteps(cursorQuery.getInt(columnIndexOrThrow9));
                    dBSportDataDetail.setDistance(cursorQuery.getInt(columnIndexOrThrow10));
                    dBSportDataDetail.setCalories(cursorQuery.getLong(columnIndexOrThrow11));
                    columnIndexOrThrow12 = i4;
                    dBSportDataDetail.setAltitudeOffset(cursorQuery.getInt(columnIndexOrThrow12));
                    int i6 = columnIndexOrThrow;
                    columnIndexOrThrow13 = i5;
                    dBSportDataDetail.setDisplay(cursorQuery.getInt(columnIndexOrThrow13));
                    int i7 = i3;
                    int i8 = columnIndexOrThrow2;
                    dBSportDataDetail.setSyncStatus(cursorQuery.getInt(i7));
                    int i9 = columnIndexOrThrow15;
                    dBSportDataDetail.setTimezone(cursorQuery.isNull(i9) ? null : cursorQuery.getString(i9));
                    int i10 = columnIndexOrThrow16;
                    int i11 = columnIndexOrThrow3;
                    dBSportDataDetail.setModifiedTime(cursorQuery.getLong(i10));
                    int i12 = columnIndexOrThrow17;
                    dBSportDataDetail.setUpdated(cursorQuery.getInt(i12));
                    int i13 = columnIndexOrThrow18;
                    dBSportDataDetail.setDataVersion(cursorQuery.getInt(i13));
                    columnIndexOrThrow17 = i12;
                    int i14 = columnIndexOrThrow19;
                    dBSportDataDetail.setWorkout(cursorQuery.getInt(i14));
                    columnIndexOrThrow19 = i14;
                    int i15 = columnIndexOrThrow20;
                    dBSportDataDetail.setSedentaryState(cursorQuery.getInt(i15));
                    columnIndexOrThrow20 = i15;
                    int i16 = columnIndexOrThrow21;
                    dBSportDataDetail.setAmountOfExercise(cursorQuery.getInt(i16));
                    arrayList.add(dBSportDataDetail);
                    columnIndexOrThrow21 = i16;
                    columnIndexOrThrow2 = i8;
                    columnIndexOrThrow = i6;
                    i3 = i7;
                    columnIndexOrThrow15 = i9;
                    columnIndexOrThrow3 = i11;
                    columnIndexOrThrow16 = i10;
                    columnIndexOrThrow18 = i13;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.oplus.aiunit.vision.ndi
    public long o(long j2, String str, String str2) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select count(device_unique_id) from DBSportDataDetail where ssoid = ? and device_unique_id = ? and start_time >= ?", 3);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        if (str2 == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, str2);
        }
        roomSQLiteQueryAcquire.bindLong(3, j2);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getLong(0) : 0L;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.oplus.aiunit.vision.ndi
    public List<DBSportDataStat> p(SupportSQLiteQuery supportSQLiteQuery) {
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, supportSQLiteQuery, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(s(cursorQuery));
            }
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    @Override // com.oplus.aiunit.vision.ndi
    public List<DBSportDataDetail> q(String str, long j2, long j3) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from DBSportDataDetail where ssoid = ? and steps > 0 and start_time between ? and ? group by device_unique_id", 3);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, j2);
        roomSQLiteQueryAcquire.bindLong(3, j3);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBSportMetadata.CLIENT_DATA_ID);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ssoid");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBAssessmentRecord.DEVICE_UNIQUE_ID);
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Element.ELEMENT_NAME_DEVICE_CATEGORY);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "start_time");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "end_time");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sport_mode");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "steps");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "distance");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, SportSummaryBean.CALORIES);
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "altitude_offset");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "display");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sync_status");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timezone");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "modified_time");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "updated");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data_version");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, NotificationCompat.CATEGORY_WORKOUT);
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sedentary_state");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "amount_of_exercise");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    DBSportDataDetail dBSportDataDetail = new DBSportDataDetail();
                    int i2 = columnIndexOrThrow12;
                    int i3 = columnIndexOrThrow13;
                    dBSportDataDetail.setSportDetailId(cursorQuery.getLong(columnIndexOrThrow));
                    dBSportDataDetail.setClientDataId(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    dBSportDataDetail.setSsoid(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    dBSportDataDetail.setDeviceUniqueId(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                    dBSportDataDetail.setDeviceType(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5));
                    dBSportDataDetail.setStartTimestamp(cursorQuery.getLong(columnIndexOrThrow6));
                    dBSportDataDetail.setEndTimestamp(cursorQuery.getLong(columnIndexOrThrow7));
                    dBSportDataDetail.setSportMode(cursorQuery.getInt(columnIndexOrThrow8));
                    dBSportDataDetail.setSteps(cursorQuery.getInt(columnIndexOrThrow9));
                    dBSportDataDetail.setDistance(cursorQuery.getInt(columnIndexOrThrow10));
                    dBSportDataDetail.setCalories(cursorQuery.getLong(columnIndexOrThrow11));
                    columnIndexOrThrow12 = i2;
                    dBSportDataDetail.setAltitudeOffset(cursorQuery.getInt(columnIndexOrThrow12));
                    int i4 = columnIndexOrThrow;
                    columnIndexOrThrow13 = i3;
                    dBSportDataDetail.setDisplay(cursorQuery.getInt(columnIndexOrThrow13));
                    int i5 = i;
                    int i6 = columnIndexOrThrow2;
                    dBSportDataDetail.setSyncStatus(cursorQuery.getInt(i5));
                    int i7 = columnIndexOrThrow15;
                    dBSportDataDetail.setTimezone(cursorQuery.isNull(i7) ? null : cursorQuery.getString(i7));
                    int i8 = columnIndexOrThrow16;
                    int i9 = columnIndexOrThrow3;
                    dBSportDataDetail.setModifiedTime(cursorQuery.getLong(i8));
                    int i10 = columnIndexOrThrow17;
                    dBSportDataDetail.setUpdated(cursorQuery.getInt(i10));
                    int i11 = columnIndexOrThrow18;
                    dBSportDataDetail.setDataVersion(cursorQuery.getInt(i11));
                    int i12 = columnIndexOrThrow19;
                    dBSportDataDetail.setWorkout(cursorQuery.getInt(i12));
                    columnIndexOrThrow19 = i12;
                    int i13 = columnIndexOrThrow20;
                    dBSportDataDetail.setSedentaryState(cursorQuery.getInt(i13));
                    columnIndexOrThrow20 = i13;
                    int i14 = columnIndexOrThrow21;
                    dBSportDataDetail.setAmountOfExercise(cursorQuery.getInt(i14));
                    arrayList.add(dBSportDataDetail);
                    columnIndexOrThrow21 = i14;
                    columnIndexOrThrow2 = i6;
                    columnIndexOrThrow = i4;
                    i = i5;
                    columnIndexOrThrow15 = i7;
                    columnIndexOrThrow3 = i9;
                    columnIndexOrThrow16 = i8;
                    columnIndexOrThrow17 = i10;
                    columnIndexOrThrow18 = i11;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    public final DBSportDataDetail r(Cursor cursor) {
        int columnIndex = CursorUtil.getColumnIndex(cursor, "_id");
        int columnIndex2 = CursorUtil.getColumnIndex(cursor, DBSportMetadata.CLIENT_DATA_ID);
        int columnIndex3 = CursorUtil.getColumnIndex(cursor, "ssoid");
        int columnIndex4 = CursorUtil.getColumnIndex(cursor, DBAssessmentRecord.DEVICE_UNIQUE_ID);
        int columnIndex5 = CursorUtil.getColumnIndex(cursor, Element.ELEMENT_NAME_DEVICE_CATEGORY);
        int columnIndex6 = CursorUtil.getColumnIndex(cursor, "start_time");
        int columnIndex7 = CursorUtil.getColumnIndex(cursor, "end_time");
        int columnIndex8 = CursorUtil.getColumnIndex(cursor, "sport_mode");
        int columnIndex9 = CursorUtil.getColumnIndex(cursor, "steps");
        int columnIndex10 = CursorUtil.getColumnIndex(cursor, "distance");
        int columnIndex11 = CursorUtil.getColumnIndex(cursor, SportSummaryBean.CALORIES);
        int columnIndex12 = CursorUtil.getColumnIndex(cursor, "altitude_offset");
        int columnIndex13 = CursorUtil.getColumnIndex(cursor, "display");
        int columnIndex14 = CursorUtil.getColumnIndex(cursor, "sync_status");
        int columnIndex15 = CursorUtil.getColumnIndex(cursor, "timezone");
        int columnIndex16 = CursorUtil.getColumnIndex(cursor, "modified_time");
        int columnIndex17 = CursorUtil.getColumnIndex(cursor, "updated");
        int columnIndex18 = CursorUtil.getColumnIndex(cursor, "data_version");
        int columnIndex19 = CursorUtil.getColumnIndex(cursor, NotificationCompat.CATEGORY_WORKOUT);
        int columnIndex20 = CursorUtil.getColumnIndex(cursor, "sedentary_state");
        int columnIndex21 = CursorUtil.getColumnIndex(cursor, "amount_of_exercise");
        DBSportDataDetail dBSportDataDetail = new DBSportDataDetail();
        if (columnIndex != -1) {
            dBSportDataDetail.setSportDetailId(cursor.getLong(columnIndex));
        }
        if (columnIndex2 != -1) {
            dBSportDataDetail.setClientDataId(cursor.isNull(columnIndex2) ? null : cursor.getString(columnIndex2));
        }
        if (columnIndex3 != -1) {
            dBSportDataDetail.setSsoid(cursor.isNull(columnIndex3) ? null : cursor.getString(columnIndex3));
        }
        if (columnIndex4 != -1) {
            dBSportDataDetail.setDeviceUniqueId(cursor.isNull(columnIndex4) ? null : cursor.getString(columnIndex4));
        }
        if (columnIndex5 != -1) {
            dBSportDataDetail.setDeviceType(cursor.isNull(columnIndex5) ? null : cursor.getString(columnIndex5));
        }
        if (columnIndex6 != -1) {
            dBSportDataDetail.setStartTimestamp(cursor.getLong(columnIndex6));
        }
        if (columnIndex7 != -1) {
            dBSportDataDetail.setEndTimestamp(cursor.getLong(columnIndex7));
        }
        if (columnIndex8 != -1) {
            dBSportDataDetail.setSportMode(cursor.getInt(columnIndex8));
        }
        if (columnIndex9 != -1) {
            dBSportDataDetail.setSteps(cursor.getInt(columnIndex9));
        }
        if (columnIndex10 != -1) {
            dBSportDataDetail.setDistance(cursor.getInt(columnIndex10));
        }
        if (columnIndex11 != -1) {
            dBSportDataDetail.setCalories(cursor.getLong(columnIndex11));
        }
        if (columnIndex12 != -1) {
            dBSportDataDetail.setAltitudeOffset(cursor.getInt(columnIndex12));
        }
        if (columnIndex13 != -1) {
            dBSportDataDetail.setDisplay(cursor.getInt(columnIndex13));
        }
        if (columnIndex14 != -1) {
            dBSportDataDetail.setSyncStatus(cursor.getInt(columnIndex14));
        }
        if (columnIndex15 != -1) {
            dBSportDataDetail.setTimezone(cursor.isNull(columnIndex15) ? null : cursor.getString(columnIndex15));
        }
        if (columnIndex16 != -1) {
            dBSportDataDetail.setModifiedTime(cursor.getLong(columnIndex16));
        }
        if (columnIndex17 != -1) {
            dBSportDataDetail.setUpdated(cursor.getInt(columnIndex17));
        }
        if (columnIndex18 != -1) {
            dBSportDataDetail.setDataVersion(cursor.getInt(columnIndex18));
        }
        if (columnIndex19 != -1) {
            dBSportDataDetail.setWorkout(cursor.getInt(columnIndex19));
        }
        if (columnIndex20 != -1) {
            dBSportDataDetail.setSedentaryState(cursor.getInt(columnIndex20));
        }
        if (columnIndex21 != -1) {
            dBSportDataDetail.setAmountOfExercise(cursor.getInt(columnIndex21));
        }
        return dBSportDataDetail;
    }

    public final DBSportDataStat s(Cursor cursor) {
        int columnIndex = CursorUtil.getColumnIndex(cursor, "_id");
        int columnIndex2 = CursorUtil.getColumnIndex(cursor, DBSportMetadata.CLIENT_DATA_ID);
        int columnIndex3 = CursorUtil.getColumnIndex(cursor, "ssoid");
        int columnIndex4 = CursorUtil.getColumnIndex(cursor, DBAssessmentRecord.DEVICE_UNIQUE_ID);
        int columnIndex5 = CursorUtil.getColumnIndex(cursor, "start_time");
        int columnIndex6 = CursorUtil.getColumnIndex(cursor, "end_time");
        int columnIndex7 = CursorUtil.getColumnIndex(cursor, "date");
        int columnIndex8 = CursorUtil.getColumnIndex(cursor, "sport_mode");
        int columnIndex9 = CursorUtil.getColumnIndex(cursor, "total_steps");
        int columnIndex10 = CursorUtil.getColumnIndex(cursor, "total_distance");
        int columnIndex11 = CursorUtil.getColumnIndex(cursor, "total_calories");
        int columnIndex12 = CursorUtil.getColumnIndex(cursor, "total_altitude_offset");
        int columnIndex13 = CursorUtil.getColumnIndex(cursor, DBSunshineStat.TOTAL_DURATION);
        int columnIndex14 = CursorUtil.getColumnIndex(cursor, "total_workout_minutes");
        int columnIndex15 = CursorUtil.getColumnIndex(cursor, "total_move_about_times");
        int columnIndex16 = CursorUtil.getColumnIndex(cursor, "display");
        int columnIndex17 = CursorUtil.getColumnIndex(cursor, "sync_status");
        int columnIndex18 = CursorUtil.getColumnIndex(cursor, "timezone");
        int columnIndex19 = CursorUtil.getColumnIndex(cursor, "modified_time");
        int columnIndex20 = CursorUtil.getColumnIndex(cursor, "current_day_steps_goal");
        int columnIndex21 = CursorUtil.getColumnIndex(cursor, "steps_goal_complete");
        int columnIndex22 = CursorUtil.getColumnIndex(cursor, "current_day_calories_goal");
        int columnIndex23 = CursorUtil.getColumnIndex(cursor, "calories_goal_complete");
        int columnIndex24 = CursorUtil.getColumnIndex(cursor, "current_day_workout_goal");
        int columnIndex25 = CursorUtil.getColumnIndex(cursor, "workout_goal_complete");
        int columnIndex26 = CursorUtil.getColumnIndex(cursor, "current_day_move_about_times_goal");
        int columnIndex27 = CursorUtil.getColumnIndex(cursor, "move_about_times_goal_complete");
        int columnIndex28 = CursorUtil.getColumnIndex(cursor, "total_amount_of_exercise");
        int columnIndex29 = CursorUtil.getColumnIndex(cursor, "day_goal_complete");
        int columnIndex30 = CursorUtil.getColumnIndex(cursor, "sedentary_total_duration");
        int columnIndex31 = CursorUtil.getColumnIndex(cursor, "sedentary_counts");
        int columnIndex32 = CursorUtil.getColumnIndex(cursor, "total_static_cal");
        int columnIndex33 = CursorUtil.getColumnIndex(cursor, "mjk_total_calories_goal");
        int columnIndex34 = CursorUtil.getColumnIndex(cursor, "mjk_intake_calories_goal");
        int columnIndex35 = CursorUtil.getColumnIndex(cursor, "static_cal_source");
        int columnIndex36 = CursorUtil.getColumnIndex(cursor, DBSportMetadata.EXTENSION);
        int columnIndex37 = CursorUtil.getColumnIndex(cursor, "updated");
        int columnIndex38 = CursorUtil.getColumnIndex(cursor, "update_timestamp");
        DBSportDataStat dBSportDataStat = new DBSportDataStat();
        if (columnIndex != -1) {
            dBSportDataStat.setSportStatId(cursor.getLong(columnIndex));
        }
        if (columnIndex2 != -1) {
            dBSportDataStat.setClientDataId(cursor.isNull(columnIndex2) ? null : cursor.getString(columnIndex2));
        }
        if (columnIndex3 != -1) {
            dBSportDataStat.setSsoid(cursor.isNull(columnIndex3) ? null : cursor.getString(columnIndex3));
        }
        if (columnIndex4 != -1) {
            dBSportDataStat.setDeviceUniqueId(cursor.isNull(columnIndex4) ? null : cursor.getString(columnIndex4));
        }
        if (columnIndex5 != -1) {
            dBSportDataStat.setStartTimestamp(cursor.getLong(columnIndex5));
        }
        if (columnIndex6 != -1) {
            dBSportDataStat.setEndTimestamp(cursor.getLong(columnIndex6));
        }
        if (columnIndex7 != -1) {
            dBSportDataStat.setDate(cursor.getInt(columnIndex7));
        }
        if (columnIndex8 != -1) {
            dBSportDataStat.setSportMode(cursor.getInt(columnIndex8));
        }
        if (columnIndex9 != -1) {
            dBSportDataStat.setTotalSteps(cursor.getInt(columnIndex9));
        }
        if (columnIndex10 != -1) {
            dBSportDataStat.setTotalDistance(cursor.getInt(columnIndex10));
        }
        if (columnIndex11 != -1) {
            dBSportDataStat.setTotalCalories(cursor.getLong(columnIndex11));
        }
        if (columnIndex12 != -1) {
            dBSportDataStat.setTotalAltitudeOffset(cursor.getInt(columnIndex12));
        }
        if (columnIndex13 != -1) {
            dBSportDataStat.setTotalDuration(cursor.getLong(columnIndex13));
        }
        if (columnIndex14 != -1) {
            dBSportDataStat.setTotalWorkoutMinutes(cursor.getInt(columnIndex14));
        }
        if (columnIndex15 != -1) {
            dBSportDataStat.setTotalMoveAboutTimes(cursor.getInt(columnIndex15));
        }
        if (columnIndex16 != -1) {
            dBSportDataStat.setDisplay(cursor.getInt(columnIndex16));
        }
        if (columnIndex17 != -1) {
            dBSportDataStat.setSyncStatus(cursor.getInt(columnIndex17));
        }
        if (columnIndex18 != -1) {
            dBSportDataStat.setTimezone(cursor.isNull(columnIndex18) ? null : cursor.getString(columnIndex18));
        }
        if (columnIndex19 != -1) {
            dBSportDataStat.setModifiedTime(cursor.getLong(columnIndex19));
        }
        if (columnIndex20 != -1) {
            dBSportDataStat.setCurrentDayStepsGoal(cursor.getInt(columnIndex20));
        }
        if (columnIndex21 != -1) {
            dBSportDataStat.setStepsGoalComplete(cursor.getInt(columnIndex21));
        }
        if (columnIndex22 != -1) {
            dBSportDataStat.setCurrentDayCaloriesGoal(cursor.getInt(columnIndex22));
        }
        if (columnIndex23 != -1) {
            dBSportDataStat.setCaloriesGoalComplete(cursor.getInt(columnIndex23));
        }
        if (columnIndex24 != -1) {
            dBSportDataStat.setCurrentDayWorkoutGoal(cursor.getInt(columnIndex24));
        }
        if (columnIndex25 != -1) {
            dBSportDataStat.setWorkoutGoalComplete(cursor.getInt(columnIndex25));
        }
        if (columnIndex26 != -1) {
            dBSportDataStat.setCurrentDayMoveAboutTimesGoal(cursor.getInt(columnIndex26));
        }
        if (columnIndex27 != -1) {
            dBSportDataStat.setMoveAboutTimesGoalComplete(cursor.getInt(columnIndex27));
        }
        if (columnIndex28 != -1) {
            dBSportDataStat.setTotalAmountOfExercise(cursor.getLong(columnIndex28));
        }
        if (columnIndex29 != -1) {
            dBSportDataStat.setDayGoalComplete(cursor.getInt(columnIndex29));
        }
        if (columnIndex30 != -1) {
            dBSportDataStat.setSedentaryTotalDuration(cursor.getLong(columnIndex30));
        }
        if (columnIndex31 != -1) {
            dBSportDataStat.setSedentaryCounts(cursor.getLong(columnIndex31));
        }
        if (columnIndex32 != -1) {
            dBSportDataStat.setTotalStaticCal(cursor.getLong(columnIndex32));
        }
        if (columnIndex33 != -1) {
            dBSportDataStat.setMjkTotalCaloriesGoal(cursor.getInt(columnIndex33));
        }
        if (columnIndex34 != -1) {
            dBSportDataStat.setMjkIntakeCaloriesGoal(cursor.getInt(columnIndex34));
        }
        if (columnIndex35 != -1) {
            dBSportDataStat.setStaticCalSource(cursor.getInt(columnIndex35));
        }
        if (columnIndex36 != -1) {
            dBSportDataStat.setExtension(cursor.isNull(columnIndex36) ? null : cursor.getString(columnIndex36));
        }
        if (columnIndex37 != -1) {
            dBSportDataStat.setUpdated(cursor.getInt(columnIndex37));
        }
        if (columnIndex38 != -1) {
            dBSportDataStat.setUpdateTimestamp(cursor.getLong(columnIndex38));
        }
        return dBSportDataStat;
    }
}