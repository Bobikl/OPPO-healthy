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
public final class ydi implements xdi {
    public final RoomDatabase a;
    public final EntityInsertionAdapter<DBSportDataStat> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EntityDeletionOrUpdateAdapter<DBSportDataStat> f20359c;
    public final EntityDeletionOrUpdateAdapter<DBSportDataStat> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SharedSQLiteStatement f20360e;

    public class a extends EntityInsertionAdapter<DBSportDataStat> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, DBSportDataStat dBSportDataStat) {
            supportSQLiteStatement.bindLong(1, dBSportDataStat.getSportStatId());
            if (dBSportDataStat.getClientDataId() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, dBSportDataStat.getClientDataId());
            }
            if (dBSportDataStat.getSsoid() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, dBSportDataStat.getSsoid());
            }
            if (dBSportDataStat.getDeviceUniqueId() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, dBSportDataStat.getDeviceUniqueId());
            }
            supportSQLiteStatement.bindLong(5, dBSportDataStat.getStartTimestamp());
            supportSQLiteStatement.bindLong(6, dBSportDataStat.getEndTimestamp());
            supportSQLiteStatement.bindLong(7, dBSportDataStat.getDate());
            supportSQLiteStatement.bindLong(8, dBSportDataStat.getSportMode());
            supportSQLiteStatement.bindLong(9, dBSportDataStat.getTotalSteps());
            supportSQLiteStatement.bindLong(10, dBSportDataStat.getTotalDistance());
            supportSQLiteStatement.bindLong(11, dBSportDataStat.getTotalCalories());
            supportSQLiteStatement.bindLong(12, dBSportDataStat.getTotalAltitudeOffset());
            supportSQLiteStatement.bindLong(13, dBSportDataStat.getTotalDuration());
            supportSQLiteStatement.bindLong(14, dBSportDataStat.getTotalWorkoutMinutes());
            supportSQLiteStatement.bindLong(15, dBSportDataStat.getTotalMoveAboutTimes());
            supportSQLiteStatement.bindLong(16, dBSportDataStat.getDisplay());
            supportSQLiteStatement.bindLong(17, dBSportDataStat.getSyncStatus());
            if (dBSportDataStat.getTimezone() == null) {
                supportSQLiteStatement.bindNull(18);
            } else {
                supportSQLiteStatement.bindString(18, dBSportDataStat.getTimezone());
            }
            supportSQLiteStatement.bindLong(19, dBSportDataStat.getModifiedTime());
            supportSQLiteStatement.bindLong(20, dBSportDataStat.getCurrentDayStepsGoal());
            supportSQLiteStatement.bindLong(21, dBSportDataStat.getStepsGoalComplete());
            supportSQLiteStatement.bindLong(22, dBSportDataStat.getCurrentDayCaloriesGoal());
            supportSQLiteStatement.bindLong(23, dBSportDataStat.getCaloriesGoalComplete());
            supportSQLiteStatement.bindLong(24, dBSportDataStat.getCurrentDayWorkoutGoal());
            supportSQLiteStatement.bindLong(25, dBSportDataStat.getWorkoutGoalComplete());
            supportSQLiteStatement.bindLong(26, dBSportDataStat.getCurrentDayMoveAboutTimesGoal());
            supportSQLiteStatement.bindLong(27, dBSportDataStat.getMoveAboutTimesGoalComplete());
            supportSQLiteStatement.bindLong(28, dBSportDataStat.getTotalAmountOfExercise());
            supportSQLiteStatement.bindLong(29, dBSportDataStat.getDayGoalComplete());
            supportSQLiteStatement.bindLong(30, dBSportDataStat.getSedentaryTotalDuration());
            supportSQLiteStatement.bindLong(31, dBSportDataStat.getSedentaryCounts());
            supportSQLiteStatement.bindLong(32, dBSportDataStat.getTotalStaticCal());
            supportSQLiteStatement.bindLong(33, dBSportDataStat.getMjkTotalCaloriesGoal());
            supportSQLiteStatement.bindLong(34, dBSportDataStat.getMjkIntakeCaloriesGoal());
            supportSQLiteStatement.bindLong(35, dBSportDataStat.getStaticCalSource());
            if (dBSportDataStat.getExtension() == null) {
                supportSQLiteStatement.bindNull(36);
            } else {
                supportSQLiteStatement.bindString(36, dBSportDataStat.getExtension());
            }
            supportSQLiteStatement.bindLong(37, dBSportDataStat.getUpdated());
            supportSQLiteStatement.bindLong(38, dBSportDataStat.getUpdateTimestamp());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `DBSportDataStat` (`_id`,`client_data_id`,`ssoid`,`device_unique_id`,`start_time`,`end_time`,`date`,`sport_mode`,`total_steps`,`total_distance`,`total_calories`,`total_altitude_offset`,`total_duration`,`total_workout_minutes`,`total_move_about_times`,`display`,`sync_status`,`timezone`,`modified_time`,`current_day_steps_goal`,`steps_goal_complete`,`current_day_calories_goal`,`calories_goal_complete`,`current_day_workout_goal`,`workout_goal_complete`,`current_day_move_about_times_goal`,`move_about_times_goal_complete`,`total_amount_of_exercise`,`day_goal_complete`,`sedentary_total_duration`,`sedentary_counts`,`total_static_cal`,`mjk_total_calories_goal`,`mjk_intake_calories_goal`,`static_cal_source`,`extension`,`updated`,`update_timestamp`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeletionOrUpdateAdapter<DBSportDataStat> {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, DBSportDataStat dBSportDataStat) {
            supportSQLiteStatement.bindLong(1, dBSportDataStat.getSportStatId());
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM `DBSportDataStat` WHERE `_id` = ?";
        }
    }

    public class c extends EntityDeletionOrUpdateAdapter<DBSportDataStat> {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, DBSportDataStat dBSportDataStat) {
            supportSQLiteStatement.bindLong(1, dBSportDataStat.getSportStatId());
            if (dBSportDataStat.getClientDataId() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, dBSportDataStat.getClientDataId());
            }
            if (dBSportDataStat.getSsoid() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, dBSportDataStat.getSsoid());
            }
            if (dBSportDataStat.getDeviceUniqueId() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, dBSportDataStat.getDeviceUniqueId());
            }
            supportSQLiteStatement.bindLong(5, dBSportDataStat.getStartTimestamp());
            supportSQLiteStatement.bindLong(6, dBSportDataStat.getEndTimestamp());
            supportSQLiteStatement.bindLong(7, dBSportDataStat.getDate());
            supportSQLiteStatement.bindLong(8, dBSportDataStat.getSportMode());
            supportSQLiteStatement.bindLong(9, dBSportDataStat.getTotalSteps());
            supportSQLiteStatement.bindLong(10, dBSportDataStat.getTotalDistance());
            supportSQLiteStatement.bindLong(11, dBSportDataStat.getTotalCalories());
            supportSQLiteStatement.bindLong(12, dBSportDataStat.getTotalAltitudeOffset());
            supportSQLiteStatement.bindLong(13, dBSportDataStat.getTotalDuration());
            supportSQLiteStatement.bindLong(14, dBSportDataStat.getTotalWorkoutMinutes());
            supportSQLiteStatement.bindLong(15, dBSportDataStat.getTotalMoveAboutTimes());
            supportSQLiteStatement.bindLong(16, dBSportDataStat.getDisplay());
            supportSQLiteStatement.bindLong(17, dBSportDataStat.getSyncStatus());
            if (dBSportDataStat.getTimezone() == null) {
                supportSQLiteStatement.bindNull(18);
            } else {
                supportSQLiteStatement.bindString(18, dBSportDataStat.getTimezone());
            }
            supportSQLiteStatement.bindLong(19, dBSportDataStat.getModifiedTime());
            supportSQLiteStatement.bindLong(20, dBSportDataStat.getCurrentDayStepsGoal());
            supportSQLiteStatement.bindLong(21, dBSportDataStat.getStepsGoalComplete());
            supportSQLiteStatement.bindLong(22, dBSportDataStat.getCurrentDayCaloriesGoal());
            supportSQLiteStatement.bindLong(23, dBSportDataStat.getCaloriesGoalComplete());
            supportSQLiteStatement.bindLong(24, dBSportDataStat.getCurrentDayWorkoutGoal());
            supportSQLiteStatement.bindLong(25, dBSportDataStat.getWorkoutGoalComplete());
            supportSQLiteStatement.bindLong(26, dBSportDataStat.getCurrentDayMoveAboutTimesGoal());
            supportSQLiteStatement.bindLong(27, dBSportDataStat.getMoveAboutTimesGoalComplete());
            supportSQLiteStatement.bindLong(28, dBSportDataStat.getTotalAmountOfExercise());
            supportSQLiteStatement.bindLong(29, dBSportDataStat.getDayGoalComplete());
            supportSQLiteStatement.bindLong(30, dBSportDataStat.getSedentaryTotalDuration());
            supportSQLiteStatement.bindLong(31, dBSportDataStat.getSedentaryCounts());
            supportSQLiteStatement.bindLong(32, dBSportDataStat.getTotalStaticCal());
            supportSQLiteStatement.bindLong(33, dBSportDataStat.getMjkTotalCaloriesGoal());
            supportSQLiteStatement.bindLong(34, dBSportDataStat.getMjkIntakeCaloriesGoal());
            supportSQLiteStatement.bindLong(35, dBSportDataStat.getStaticCalSource());
            if (dBSportDataStat.getExtension() == null) {
                supportSQLiteStatement.bindNull(36);
            } else {
                supportSQLiteStatement.bindString(36, dBSportDataStat.getExtension());
            }
            supportSQLiteStatement.bindLong(37, dBSportDataStat.getUpdated());
            supportSQLiteStatement.bindLong(38, dBSportDataStat.getUpdateTimestamp());
            supportSQLiteStatement.bindLong(39, dBSportDataStat.getSportStatId());
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR REPLACE `DBSportDataStat` SET `_id` = ?,`client_data_id` = ?,`ssoid` = ?,`device_unique_id` = ?,`start_time` = ?,`end_time` = ?,`date` = ?,`sport_mode` = ?,`total_steps` = ?,`total_distance` = ?,`total_calories` = ?,`total_altitude_offset` = ?,`total_duration` = ?,`total_workout_minutes` = ?,`total_move_about_times` = ?,`display` = ?,`sync_status` = ?,`timezone` = ?,`modified_time` = ?,`current_day_steps_goal` = ?,`steps_goal_complete` = ?,`current_day_calories_goal` = ?,`calories_goal_complete` = ?,`current_day_workout_goal` = ?,`workout_goal_complete` = ?,`current_day_move_about_times_goal` = ?,`move_about_times_goal_complete` = ?,`total_amount_of_exercise` = ?,`day_goal_complete` = ?,`sedentary_total_duration` = ?,`sedentary_counts` = ?,`total_static_cal` = ?,`mjk_total_calories_goal` = ?,`mjk_intake_calories_goal` = ?,`static_cal_source` = ?,`extension` = ?,`updated` = ?,`update_timestamp` = ? WHERE `_id` = ?";
        }
    }

    public class d extends SharedSQLiteStatement {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from DBSportDataStat where ssoid = ?";
        }
    }

    public ydi(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.f20359c = new b(roomDatabase);
        this.d = new c(roomDatabase);
        this.f20360e = new d(roomDatabase);
    }

    public static List<Class<?>> x() {
        return Collections.emptyList();
    }

    @Override // com.oplus.aiunit.vision.xdi
    public List<Long> a(List<DBSportDataStat> list) {
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

    @Override // com.oplus.aiunit.vision.xdi
    public int b(List<DBSportDataStat> list) {
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

    @Override // com.oplus.aiunit.vision.xdi
    public long c(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select MAX(modified_time) from DBSportDataStat where ssoid = ?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getLong(0) : 0L;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.oplus.aiunit.vision.xdi
    public List<DBSportDataStat> d(String str, int i, int i2) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from DBSportDataStat where ssoid = ? and date between ? and ?", 3);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, i);
        roomSQLiteQueryAcquire.bindLong(3, i2);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBSportMetadata.CLIENT_DATA_ID);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ssoid");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBAssessmentRecord.DEVICE_UNIQUE_ID);
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "start_time");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "end_time");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sport_mode");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_steps");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_distance");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_calories");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_altitude_offset");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBSunshineStat.TOTAL_DURATION);
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_workout_minutes");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_move_about_times");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "display");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sync_status");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timezone");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "modified_time");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "current_day_steps_goal");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "steps_goal_complete");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "current_day_calories_goal");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "calories_goal_complete");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "current_day_workout_goal");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "workout_goal_complete");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "current_day_move_about_times_goal");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "move_about_times_goal_complete");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_amount_of_exercise");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "day_goal_complete");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sedentary_total_duration");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sedentary_counts");
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_static_cal");
                int columnIndexOrThrow33 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mjk_total_calories_goal");
                int columnIndexOrThrow34 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mjk_intake_calories_goal");
                int columnIndexOrThrow35 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "static_cal_source");
                int columnIndexOrThrow36 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBSportMetadata.EXTENSION);
                int columnIndexOrThrow37 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "updated");
                int columnIndexOrThrow38 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "update_timestamp");
                int i3 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    DBSportDataStat dBSportDataStat = new DBSportDataStat();
                    int i4 = columnIndexOrThrow12;
                    int i5 = columnIndexOrThrow13;
                    dBSportDataStat.setSportStatId(cursorQuery.getLong(columnIndexOrThrow));
                    dBSportDataStat.setClientDataId(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    dBSportDataStat.setSsoid(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    dBSportDataStat.setDeviceUniqueId(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                    dBSportDataStat.setStartTimestamp(cursorQuery.getLong(columnIndexOrThrow5));
                    dBSportDataStat.setEndTimestamp(cursorQuery.getLong(columnIndexOrThrow6));
                    dBSportDataStat.setDate(cursorQuery.getInt(columnIndexOrThrow7));
                    dBSportDataStat.setSportMode(cursorQuery.getInt(columnIndexOrThrow8));
                    dBSportDataStat.setTotalSteps(cursorQuery.getInt(columnIndexOrThrow9));
                    dBSportDataStat.setTotalDistance(cursorQuery.getInt(columnIndexOrThrow10));
                    dBSportDataStat.setTotalCalories(cursorQuery.getLong(columnIndexOrThrow11));
                    columnIndexOrThrow12 = i4;
                    dBSportDataStat.setTotalAltitudeOffset(cursorQuery.getInt(columnIndexOrThrow12));
                    int i6 = columnIndexOrThrow2;
                    columnIndexOrThrow13 = i5;
                    int i7 = columnIndexOrThrow3;
                    dBSportDataStat.setTotalDuration(cursorQuery.getLong(columnIndexOrThrow13));
                    int i8 = i3;
                    dBSportDataStat.setTotalWorkoutMinutes(cursorQuery.getInt(i8));
                    int i9 = columnIndexOrThrow15;
                    int i10 = columnIndexOrThrow;
                    dBSportDataStat.setTotalMoveAboutTimes(cursorQuery.getInt(i9));
                    int i11 = columnIndexOrThrow16;
                    i3 = i8;
                    dBSportDataStat.setDisplay(cursorQuery.getInt(i11));
                    int i12 = columnIndexOrThrow17;
                    columnIndexOrThrow16 = i11;
                    dBSportDataStat.setSyncStatus(cursorQuery.getInt(i12));
                    int i13 = columnIndexOrThrow18;
                    dBSportDataStat.setTimezone(cursorQuery.isNull(i13) ? null : cursorQuery.getString(i13));
                    int i14 = columnIndexOrThrow19;
                    dBSportDataStat.setModifiedTime(cursorQuery.getLong(i14));
                    int i15 = columnIndexOrThrow20;
                    dBSportDataStat.setCurrentDayStepsGoal(cursorQuery.getInt(i15));
                    int i16 = columnIndexOrThrow21;
                    dBSportDataStat.setStepsGoalComplete(cursorQuery.getInt(i16));
                    int i17 = columnIndexOrThrow22;
                    dBSportDataStat.setCurrentDayCaloriesGoal(cursorQuery.getInt(i17));
                    columnIndexOrThrow22 = i17;
                    int i18 = columnIndexOrThrow23;
                    dBSportDataStat.setCaloriesGoalComplete(cursorQuery.getInt(i18));
                    columnIndexOrThrow23 = i18;
                    int i19 = columnIndexOrThrow24;
                    dBSportDataStat.setCurrentDayWorkoutGoal(cursorQuery.getInt(i19));
                    columnIndexOrThrow24 = i19;
                    int i20 = columnIndexOrThrow25;
                    dBSportDataStat.setWorkoutGoalComplete(cursorQuery.getInt(i20));
                    columnIndexOrThrow25 = i20;
                    int i21 = columnIndexOrThrow26;
                    dBSportDataStat.setCurrentDayMoveAboutTimesGoal(cursorQuery.getInt(i21));
                    columnIndexOrThrow26 = i21;
                    int i22 = columnIndexOrThrow27;
                    dBSportDataStat.setMoveAboutTimesGoalComplete(cursorQuery.getInt(i22));
                    int i23 = columnIndexOrThrow28;
                    dBSportDataStat.setTotalAmountOfExercise(cursorQuery.getLong(i23));
                    int i24 = columnIndexOrThrow29;
                    dBSportDataStat.setDayGoalComplete(cursorQuery.getInt(i24));
                    int i25 = columnIndexOrThrow4;
                    int i26 = columnIndexOrThrow30;
                    int i27 = columnIndexOrThrow5;
                    dBSportDataStat.setSedentaryTotalDuration(cursorQuery.getLong(i26));
                    int i28 = columnIndexOrThrow31;
                    dBSportDataStat.setSedentaryCounts(cursorQuery.getLong(i28));
                    int i29 = columnIndexOrThrow32;
                    dBSportDataStat.setTotalStaticCal(cursorQuery.getLong(i29));
                    int i30 = columnIndexOrThrow33;
                    dBSportDataStat.setMjkTotalCaloriesGoal(cursorQuery.getInt(i30));
                    int i31 = columnIndexOrThrow34;
                    dBSportDataStat.setMjkIntakeCaloriesGoal(cursorQuery.getInt(i31));
                    int i32 = columnIndexOrThrow35;
                    dBSportDataStat.setStaticCalSource(cursorQuery.getInt(i32));
                    int i33 = columnIndexOrThrow36;
                    dBSportDataStat.setExtension(cursorQuery.isNull(i33) ? null : cursorQuery.getString(i33));
                    int i34 = columnIndexOrThrow37;
                    dBSportDataStat.setUpdated(cursorQuery.getInt(i34));
                    int i35 = columnIndexOrThrow38;
                    dBSportDataStat.setUpdateTimestamp(cursorQuery.getLong(i35));
                    arrayList.add(dBSportDataStat);
                    columnIndexOrThrow4 = i25;
                    columnIndexOrThrow3 = i7;
                    columnIndexOrThrow29 = i24;
                    columnIndexOrThrow5 = i27;
                    columnIndexOrThrow30 = i26;
                    columnIndexOrThrow31 = i28;
                    columnIndexOrThrow32 = i29;
                    columnIndexOrThrow34 = i31;
                    columnIndexOrThrow38 = i35;
                    columnIndexOrThrow2 = i6;
                    columnIndexOrThrow = i10;
                    columnIndexOrThrow15 = i9;
                    columnIndexOrThrow18 = i13;
                    columnIndexOrThrow17 = i12;
                    columnIndexOrThrow19 = i14;
                    columnIndexOrThrow20 = i15;
                    columnIndexOrThrow21 = i16;
                    columnIndexOrThrow27 = i22;
                    columnIndexOrThrow28 = i23;
                    columnIndexOrThrow33 = i30;
                    columnIndexOrThrow37 = i34;
                    columnIndexOrThrow36 = i33;
                    columnIndexOrThrow35 = i32;
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

    @Override // com.oplus.aiunit.vision.xdi
    public List<DBSportDataStat> e(int i, int i2, int i3, int i4, String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select _id, client_data_id, start_time, end_time, date, sport_mode, total_steps, total_distance, total_calories, total_altitude_offset, total_duration, total_amount_of_exercise, total_move_about_times, total_workout_minutes, display, sync_status, current_day_steps_goal, steps_goal_complete, current_day_calories_goal, current_day_workout_goal, workout_goal_complete, current_day_move_about_times_goal, move_about_times_goal_complete, calories_goal_complete, day_goal_complete, sedentary_total_duration, sedentary_counts, total_static_cal, updated, modified_time, update_timestamp, mjk_total_calories_goal, mjk_intake_calories_goal, static_cal_source from DBSportDataStat where ssoid = ? and (sync_status = 0 or updated = 1) and start_time > 0 and date between ? and ? order by case when ? = 1 then date end desc, case when ? = 0 then date end asc limit ?", 6);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, i);
        roomSQLiteQueryAcquire.bindLong(3, i2);
        long j2 = i4;
        roomSQLiteQueryAcquire.bindLong(4, j2);
        roomSQLiteQueryAcquire.bindLong(5, j2);
        roomSQLiteQueryAcquire.bindLong(6, i3);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                DBSportDataStat dBSportDataStat = new DBSportDataStat();
                dBSportDataStat.setSportStatId(cursorQuery.getLong(0));
                dBSportDataStat.setClientDataId(cursorQuery.isNull(1) ? null : cursorQuery.getString(1));
                dBSportDataStat.setStartTimestamp(cursorQuery.getLong(2));
                dBSportDataStat.setEndTimestamp(cursorQuery.getLong(3));
                dBSportDataStat.setDate(cursorQuery.getInt(4));
                dBSportDataStat.setSportMode(cursorQuery.getInt(5));
                dBSportDataStat.setTotalSteps(cursorQuery.getInt(6));
                dBSportDataStat.setTotalDistance(cursorQuery.getInt(7));
                dBSportDataStat.setTotalCalories(cursorQuery.getLong(8));
                dBSportDataStat.setTotalAltitudeOffset(cursorQuery.getInt(9));
                dBSportDataStat.setTotalDuration(cursorQuery.getLong(10));
                dBSportDataStat.setTotalAmountOfExercise(cursorQuery.getLong(11));
                dBSportDataStat.setTotalMoveAboutTimes(cursorQuery.getInt(12));
                dBSportDataStat.setTotalWorkoutMinutes(cursorQuery.getInt(13));
                dBSportDataStat.setDisplay(cursorQuery.getInt(14));
                dBSportDataStat.setSyncStatus(cursorQuery.getInt(15));
                dBSportDataStat.setCurrentDayStepsGoal(cursorQuery.getInt(16));
                dBSportDataStat.setStepsGoalComplete(cursorQuery.getInt(17));
                dBSportDataStat.setCurrentDayCaloriesGoal(cursorQuery.getInt(18));
                dBSportDataStat.setCurrentDayWorkoutGoal(cursorQuery.getInt(19));
                dBSportDataStat.setWorkoutGoalComplete(cursorQuery.getInt(20));
                dBSportDataStat.setCurrentDayMoveAboutTimesGoal(cursorQuery.getInt(21));
                dBSportDataStat.setMoveAboutTimesGoalComplete(cursorQuery.getInt(22));
                dBSportDataStat.setCaloriesGoalComplete(cursorQuery.getInt(23));
                dBSportDataStat.setDayGoalComplete(cursorQuery.getInt(24));
                dBSportDataStat.setSedentaryTotalDuration(cursorQuery.getLong(25));
                dBSportDataStat.setSedentaryCounts(cursorQuery.getLong(26));
                dBSportDataStat.setTotalStaticCal(cursorQuery.getLong(27));
                dBSportDataStat.setUpdated(cursorQuery.getInt(28));
                dBSportDataStat.setModifiedTime(cursorQuery.getLong(29));
                dBSportDataStat.setUpdateTimestamp(cursorQuery.getLong(30));
                dBSportDataStat.setMjkTotalCaloriesGoal(cursorQuery.getInt(31));
                dBSportDataStat.setMjkIntakeCaloriesGoal(cursorQuery.getInt(32));
                dBSportDataStat.setStaticCalSource(cursorQuery.getInt(33));
                arrayList.add(dBSportDataStat);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.oplus.aiunit.vision.xdi
    public int f(String str) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f20360e.acquire();
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
            this.f20360e.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.oplus.aiunit.vision.xdi
    public List<DBSportDataStat> g(List<Integer> list, String str) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("select * from DBSportDataStat where ssoid = ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" and date in (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(") and (sync_status = 0 or updated = 1)");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size + 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        int i = 2;
        for (Integer num : list) {
            if (num == null) {
                roomSQLiteQueryAcquire.bindNull(i);
            } else {
                roomSQLiteQueryAcquire.bindLong(i, num.intValue());
            }
            i++;
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBSportMetadata.CLIENT_DATA_ID);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ssoid");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBAssessmentRecord.DEVICE_UNIQUE_ID);
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "start_time");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "end_time");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sport_mode");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_steps");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_distance");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_calories");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_altitude_offset");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBSunshineStat.TOTAL_DURATION);
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_workout_minutes");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_move_about_times");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "display");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sync_status");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timezone");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "modified_time");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "current_day_steps_goal");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "steps_goal_complete");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "current_day_calories_goal");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "calories_goal_complete");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "current_day_workout_goal");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "workout_goal_complete");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "current_day_move_about_times_goal");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "move_about_times_goal_complete");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_amount_of_exercise");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "day_goal_complete");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sedentary_total_duration");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sedentary_counts");
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_static_cal");
                int columnIndexOrThrow33 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mjk_total_calories_goal");
                int columnIndexOrThrow34 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mjk_intake_calories_goal");
                int columnIndexOrThrow35 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "static_cal_source");
                int columnIndexOrThrow36 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBSportMetadata.EXTENSION);
                int columnIndexOrThrow37 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "updated");
                int columnIndexOrThrow38 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "update_timestamp");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    DBSportDataStat dBSportDataStat = new DBSportDataStat();
                    int i3 = columnIndexOrThrow12;
                    int i4 = columnIndexOrThrow13;
                    dBSportDataStat.setSportStatId(cursorQuery.getLong(columnIndexOrThrow));
                    dBSportDataStat.setClientDataId(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    dBSportDataStat.setSsoid(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    dBSportDataStat.setDeviceUniqueId(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                    dBSportDataStat.setStartTimestamp(cursorQuery.getLong(columnIndexOrThrow5));
                    dBSportDataStat.setEndTimestamp(cursorQuery.getLong(columnIndexOrThrow6));
                    dBSportDataStat.setDate(cursorQuery.getInt(columnIndexOrThrow7));
                    dBSportDataStat.setSportMode(cursorQuery.getInt(columnIndexOrThrow8));
                    dBSportDataStat.setTotalSteps(cursorQuery.getInt(columnIndexOrThrow9));
                    dBSportDataStat.setTotalDistance(cursorQuery.getInt(columnIndexOrThrow10));
                    dBSportDataStat.setTotalCalories(cursorQuery.getLong(columnIndexOrThrow11));
                    columnIndexOrThrow12 = i3;
                    dBSportDataStat.setTotalAltitudeOffset(cursorQuery.getInt(columnIndexOrThrow12));
                    int i5 = columnIndexOrThrow2;
                    columnIndexOrThrow13 = i4;
                    int i6 = columnIndexOrThrow3;
                    dBSportDataStat.setTotalDuration(cursorQuery.getLong(columnIndexOrThrow13));
                    int i7 = i2;
                    dBSportDataStat.setTotalWorkoutMinutes(cursorQuery.getInt(i7));
                    int i8 = columnIndexOrThrow15;
                    int i9 = columnIndexOrThrow;
                    dBSportDataStat.setTotalMoveAboutTimes(cursorQuery.getInt(i8));
                    int i10 = columnIndexOrThrow16;
                    i2 = i7;
                    dBSportDataStat.setDisplay(cursorQuery.getInt(i10));
                    columnIndexOrThrow16 = i10;
                    int i11 = columnIndexOrThrow17;
                    dBSportDataStat.setSyncStatus(cursorQuery.getInt(i11));
                    columnIndexOrThrow18 = columnIndexOrThrow18;
                    dBSportDataStat.setTimezone(cursorQuery.isNull(columnIndexOrThrow18) ? null : cursorQuery.getString(columnIndexOrThrow18));
                    int i12 = columnIndexOrThrow19;
                    dBSportDataStat.setModifiedTime(cursorQuery.getLong(i12));
                    int i13 = columnIndexOrThrow20;
                    dBSportDataStat.setCurrentDayStepsGoal(cursorQuery.getInt(i13));
                    int i14 = columnIndexOrThrow21;
                    dBSportDataStat.setStepsGoalComplete(cursorQuery.getInt(i14));
                    int i15 = columnIndexOrThrow22;
                    dBSportDataStat.setCurrentDayCaloriesGoal(cursorQuery.getInt(i15));
                    columnIndexOrThrow22 = i15;
                    int i16 = columnIndexOrThrow23;
                    dBSportDataStat.setCaloriesGoalComplete(cursorQuery.getInt(i16));
                    columnIndexOrThrow23 = i16;
                    int i17 = columnIndexOrThrow24;
                    dBSportDataStat.setCurrentDayWorkoutGoal(cursorQuery.getInt(i17));
                    columnIndexOrThrow24 = i17;
                    int i18 = columnIndexOrThrow25;
                    dBSportDataStat.setWorkoutGoalComplete(cursorQuery.getInt(i18));
                    columnIndexOrThrow25 = i18;
                    int i19 = columnIndexOrThrow26;
                    dBSportDataStat.setCurrentDayMoveAboutTimesGoal(cursorQuery.getInt(i19));
                    columnIndexOrThrow26 = i19;
                    int i20 = columnIndexOrThrow27;
                    dBSportDataStat.setMoveAboutTimesGoalComplete(cursorQuery.getInt(i20));
                    int i21 = columnIndexOrThrow28;
                    dBSportDataStat.setTotalAmountOfExercise(cursorQuery.getLong(i21));
                    int i22 = columnIndexOrThrow29;
                    dBSportDataStat.setDayGoalComplete(cursorQuery.getInt(i22));
                    int i23 = columnIndexOrThrow4;
                    int i24 = columnIndexOrThrow30;
                    int i25 = columnIndexOrThrow5;
                    dBSportDataStat.setSedentaryTotalDuration(cursorQuery.getLong(i24));
                    int i26 = columnIndexOrThrow31;
                    dBSportDataStat.setSedentaryCounts(cursorQuery.getLong(i26));
                    int i27 = columnIndexOrThrow32;
                    dBSportDataStat.setTotalStaticCal(cursorQuery.getLong(i27));
                    int i28 = columnIndexOrThrow33;
                    dBSportDataStat.setMjkTotalCaloriesGoal(cursorQuery.getInt(i28));
                    int i29 = columnIndexOrThrow34;
                    dBSportDataStat.setMjkIntakeCaloriesGoal(cursorQuery.getInt(i29));
                    int i30 = columnIndexOrThrow35;
                    dBSportDataStat.setStaticCalSource(cursorQuery.getInt(i30));
                    int i31 = columnIndexOrThrow36;
                    dBSportDataStat.setExtension(cursorQuery.isNull(i31) ? null : cursorQuery.getString(i31));
                    int i32 = columnIndexOrThrow37;
                    dBSportDataStat.setUpdated(cursorQuery.getInt(i32));
                    int i33 = columnIndexOrThrow38;
                    dBSportDataStat.setUpdateTimestamp(cursorQuery.getLong(i33));
                    arrayList.add(dBSportDataStat);
                    columnIndexOrThrow4 = i23;
                    columnIndexOrThrow3 = i6;
                    columnIndexOrThrow29 = i22;
                    columnIndexOrThrow5 = i25;
                    columnIndexOrThrow30 = i24;
                    columnIndexOrThrow31 = i26;
                    columnIndexOrThrow32 = i27;
                    columnIndexOrThrow34 = i29;
                    columnIndexOrThrow38 = i33;
                    columnIndexOrThrow2 = i5;
                    columnIndexOrThrow = i9;
                    columnIndexOrThrow15 = i8;
                    columnIndexOrThrow17 = i11;
                    columnIndexOrThrow19 = i12;
                    columnIndexOrThrow20 = i13;
                    columnIndexOrThrow21 = i14;
                    columnIndexOrThrow27 = i20;
                    columnIndexOrThrow28 = i21;
                    columnIndexOrThrow33 = i28;
                    columnIndexOrThrow37 = i32;
                    columnIndexOrThrow36 = i31;
                    columnIndexOrThrow35 = i30;
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

    @Override // com.oplus.aiunit.vision.xdi
    public int h(String str, int i) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select min(date) from DBSportDataStat where ssoid = ? and date >= ?", 2);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, i);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getInt(0) : 0;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.oplus.aiunit.vision.xdi
    public DBSportDataStat i(String str, int i, int i2) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        DBSportDataStat dBSportDataStat;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from DBSportDataStat where ssoid = ? and sport_mode = ? and date = ? order by date asc", 3);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, i);
        roomSQLiteQueryAcquire.bindLong(3, i2);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBSportMetadata.CLIENT_DATA_ID);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ssoid");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBAssessmentRecord.DEVICE_UNIQUE_ID);
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "start_time");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "end_time");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sport_mode");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_steps");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_distance");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_calories");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_altitude_offset");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBSunshineStat.TOTAL_DURATION);
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_workout_minutes");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_move_about_times");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "display");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sync_status");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timezone");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "modified_time");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "current_day_steps_goal");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "steps_goal_complete");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "current_day_calories_goal");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "calories_goal_complete");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "current_day_workout_goal");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "workout_goal_complete");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "current_day_move_about_times_goal");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "move_about_times_goal_complete");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_amount_of_exercise");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "day_goal_complete");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sedentary_total_duration");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sedentary_counts");
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_static_cal");
                int columnIndexOrThrow33 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mjk_total_calories_goal");
                int columnIndexOrThrow34 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mjk_intake_calories_goal");
                int columnIndexOrThrow35 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "static_cal_source");
                int columnIndexOrThrow36 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBSportMetadata.EXTENSION);
                int columnIndexOrThrow37 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "updated");
                int columnIndexOrThrow38 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "update_timestamp");
                if (cursorQuery.moveToFirst()) {
                    DBSportDataStat dBSportDataStat2 = new DBSportDataStat();
                    dBSportDataStat2.setSportStatId(cursorQuery.getLong(columnIndexOrThrow));
                    dBSportDataStat2.setClientDataId(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    dBSportDataStat2.setSsoid(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    dBSportDataStat2.setDeviceUniqueId(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                    dBSportDataStat2.setStartTimestamp(cursorQuery.getLong(columnIndexOrThrow5));
                    dBSportDataStat2.setEndTimestamp(cursorQuery.getLong(columnIndexOrThrow6));
                    dBSportDataStat2.setDate(cursorQuery.getInt(columnIndexOrThrow7));
                    dBSportDataStat2.setSportMode(cursorQuery.getInt(columnIndexOrThrow8));
                    dBSportDataStat2.setTotalSteps(cursorQuery.getInt(columnIndexOrThrow9));
                    dBSportDataStat2.setTotalDistance(cursorQuery.getInt(columnIndexOrThrow10));
                    dBSportDataStat2.setTotalCalories(cursorQuery.getLong(columnIndexOrThrow11));
                    dBSportDataStat2.setTotalAltitudeOffset(cursorQuery.getInt(columnIndexOrThrow12));
                    dBSportDataStat2.setTotalDuration(cursorQuery.getLong(columnIndexOrThrow13));
                    dBSportDataStat2.setTotalWorkoutMinutes(cursorQuery.getInt(columnIndexOrThrow14));
                    dBSportDataStat2.setTotalMoveAboutTimes(cursorQuery.getInt(columnIndexOrThrow15));
                    dBSportDataStat2.setDisplay(cursorQuery.getInt(columnIndexOrThrow16));
                    dBSportDataStat2.setSyncStatus(cursorQuery.getInt(columnIndexOrThrow17));
                    dBSportDataStat2.setTimezone(cursorQuery.isNull(columnIndexOrThrow18) ? null : cursorQuery.getString(columnIndexOrThrow18));
                    dBSportDataStat2.setModifiedTime(cursorQuery.getLong(columnIndexOrThrow19));
                    dBSportDataStat2.setCurrentDayStepsGoal(cursorQuery.getInt(columnIndexOrThrow20));
                    dBSportDataStat2.setStepsGoalComplete(cursorQuery.getInt(columnIndexOrThrow21));
                    dBSportDataStat2.setCurrentDayCaloriesGoal(cursorQuery.getInt(columnIndexOrThrow22));
                    dBSportDataStat2.setCaloriesGoalComplete(cursorQuery.getInt(columnIndexOrThrow23));
                    dBSportDataStat2.setCurrentDayWorkoutGoal(cursorQuery.getInt(columnIndexOrThrow24));
                    dBSportDataStat2.setWorkoutGoalComplete(cursorQuery.getInt(columnIndexOrThrow25));
                    dBSportDataStat2.setCurrentDayMoveAboutTimesGoal(cursorQuery.getInt(columnIndexOrThrow26));
                    dBSportDataStat2.setMoveAboutTimesGoalComplete(cursorQuery.getInt(columnIndexOrThrow27));
                    dBSportDataStat2.setTotalAmountOfExercise(cursorQuery.getLong(columnIndexOrThrow28));
                    dBSportDataStat2.setDayGoalComplete(cursorQuery.getInt(columnIndexOrThrow29));
                    dBSportDataStat2.setSedentaryTotalDuration(cursorQuery.getLong(columnIndexOrThrow30));
                    dBSportDataStat2.setSedentaryCounts(cursorQuery.getLong(columnIndexOrThrow31));
                    dBSportDataStat2.setTotalStaticCal(cursorQuery.getLong(columnIndexOrThrow32));
                    dBSportDataStat2.setMjkTotalCaloriesGoal(cursorQuery.getInt(columnIndexOrThrow33));
                    dBSportDataStat2.setMjkIntakeCaloriesGoal(cursorQuery.getInt(columnIndexOrThrow34));
                    dBSportDataStat2.setStaticCalSource(cursorQuery.getInt(columnIndexOrThrow35));
                    dBSportDataStat2.setExtension(cursorQuery.isNull(columnIndexOrThrow36) ? null : cursorQuery.getString(columnIndexOrThrow36));
                    dBSportDataStat2.setUpdated(cursorQuery.getInt(columnIndexOrThrow37));
                    dBSportDataStat2.setUpdateTimestamp(cursorQuery.getLong(columnIndexOrThrow38));
                    dBSportDataStat = dBSportDataStat2;
                } else {
                    dBSportDataStat = null;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return dBSportDataStat;
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

    @Override // com.oplus.aiunit.vision.xdi
    public int j(String str, int i) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select MAX(date) from DBSportDataStat where ssoid = ? and date <= ?", 2);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, i);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getInt(0) : 0;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.oplus.aiunit.vision.xdi
    public List<DBSportDataStat> k(String str, int i, long j2, long j3) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select 0 as _id,  ssoid, device_unique_id, start_time, end_time, sport_mode, sync_status, ? as date, display, timezone, 0 as modified_time, updated, sum(steps) as total_steps, 0 as current_day_steps_goal, 0 as steps_goal_complete, sum(distance) as total_distance, 0 as current_day_workout_goal, 0 as workout_goal_complete, 0 as current_day_move_about_times_goal, 0 as move_about_times_goal_complete, sum(calories) as total_calories, sum(workout) as total_workout_minutes, 0 as total_amount_of_exercise, sum(altitude_offset) as total_altitude_offset, sum(end_time - start_time) as total_duration, 0 as current_day_calories_goal, 0 as calories_goal_complete, 0 as day_goal_complete, 0 as sedentary_total_duration, 0 as sedentary_counts, 0 as total_static_cal, 0 as total_move_about_times, max(start_time) as update_timestamp, 0 as mjk_total_calories_goal, 0 as mjk_intake_calories_goal, 0 as static_cal_source from (select * from DBSportDataDetail where ssoid = ? and start_time between ? and ? group by device_unique_id, start_time) group by device_unique_id order by start_time desc", 4);
        roomSQLiteQueryAcquire.bindLong(1, i);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, str);
        }
        roomSQLiteQueryAcquire.bindLong(3, j2);
        roomSQLiteQueryAcquire.bindLong(4, j3);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                DBSportDataStat dBSportDataStat = new DBSportDataStat();
                dBSportDataStat.setSportStatId(cursorQuery.getLong(0));
                dBSportDataStat.setSsoid(cursorQuery.isNull(1) ? null : cursorQuery.getString(1));
                dBSportDataStat.setDeviceUniqueId(cursorQuery.isNull(2) ? null : cursorQuery.getString(2));
                dBSportDataStat.setStartTimestamp(cursorQuery.getLong(3));
                dBSportDataStat.setEndTimestamp(cursorQuery.getLong(4));
                dBSportDataStat.setSportMode(cursorQuery.getInt(5));
                dBSportDataStat.setSyncStatus(cursorQuery.getInt(6));
                dBSportDataStat.setDate(cursorQuery.getInt(7));
                dBSportDataStat.setDisplay(cursorQuery.getInt(8));
                dBSportDataStat.setTimezone(cursorQuery.isNull(9) ? null : cursorQuery.getString(9));
                dBSportDataStat.setModifiedTime(cursorQuery.getLong(10));
                dBSportDataStat.setUpdated(cursorQuery.getInt(11));
                dBSportDataStat.setTotalSteps(cursorQuery.getInt(12));
                dBSportDataStat.setCurrentDayStepsGoal(cursorQuery.getInt(13));
                dBSportDataStat.setStepsGoalComplete(cursorQuery.getInt(14));
                dBSportDataStat.setTotalDistance(cursorQuery.getInt(15));
                dBSportDataStat.setCurrentDayWorkoutGoal(cursorQuery.getInt(16));
                dBSportDataStat.setWorkoutGoalComplete(cursorQuery.getInt(17));
                dBSportDataStat.setCurrentDayMoveAboutTimesGoal(cursorQuery.getInt(18));
                dBSportDataStat.setMoveAboutTimesGoalComplete(cursorQuery.getInt(19));
                dBSportDataStat.setTotalCalories(cursorQuery.getLong(20));
                dBSportDataStat.setTotalWorkoutMinutes(cursorQuery.getInt(21));
                dBSportDataStat.setTotalAmountOfExercise(cursorQuery.getLong(22));
                dBSportDataStat.setTotalAltitudeOffset(cursorQuery.getInt(23));
                dBSportDataStat.setTotalDuration(cursorQuery.getLong(24));
                dBSportDataStat.setCurrentDayCaloriesGoal(cursorQuery.getInt(25));
                dBSportDataStat.setCaloriesGoalComplete(cursorQuery.getInt(26));
                dBSportDataStat.setDayGoalComplete(cursorQuery.getInt(27));
                dBSportDataStat.setSedentaryTotalDuration(cursorQuery.getLong(28));
                dBSportDataStat.setSedentaryCounts(cursorQuery.getLong(29));
                dBSportDataStat.setTotalStaticCal(cursorQuery.getLong(30));
                dBSportDataStat.setTotalMoveAboutTimes(cursorQuery.getInt(31));
                dBSportDataStat.setUpdateTimestamp(cursorQuery.getLong(32));
                dBSportDataStat.setMjkTotalCaloriesGoal(cursorQuery.getInt(33));
                dBSportDataStat.setMjkIntakeCaloriesGoal(cursorQuery.getInt(34));
                dBSportDataStat.setStaticCalSource(cursorQuery.getInt(35));
                arrayList.add(dBSportDataStat);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.oplus.aiunit.vision.xdi
    public List<DBSportDataDetail> l(String str, long j2, long j3) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from DBSportDataDetail where ssoid = ? and start_time between ? and ? group by device_unique_id order by start_time desc", 3);
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

    @Override // com.oplus.aiunit.vision.xdi
    public List<DBSportDataStat> m(SupportSQLiteQuery supportSQLiteQuery) {
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, supportSQLiteQuery, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(w(cursorQuery));
            }
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    @Override // com.oplus.aiunit.vision.xdi
    public List<DBSportDataStat> n(String str, int i, int i2, int i3) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from DBSportDataStat where ssoid = ? and date between ? and ? and sport_mode = ? order by date asc", 4);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, i);
        roomSQLiteQueryAcquire.bindLong(3, i2);
        roomSQLiteQueryAcquire.bindLong(4, i3);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBSportMetadata.CLIENT_DATA_ID);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ssoid");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBAssessmentRecord.DEVICE_UNIQUE_ID);
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "start_time");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "end_time");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sport_mode");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_steps");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_distance");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_calories");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_altitude_offset");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBSunshineStat.TOTAL_DURATION);
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_workout_minutes");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_move_about_times");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "display");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sync_status");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timezone");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "modified_time");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "current_day_steps_goal");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "steps_goal_complete");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "current_day_calories_goal");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "calories_goal_complete");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "current_day_workout_goal");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "workout_goal_complete");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "current_day_move_about_times_goal");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "move_about_times_goal_complete");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_amount_of_exercise");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "day_goal_complete");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sedentary_total_duration");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sedentary_counts");
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_static_cal");
                int columnIndexOrThrow33 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mjk_total_calories_goal");
                int columnIndexOrThrow34 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mjk_intake_calories_goal");
                int columnIndexOrThrow35 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "static_cal_source");
                int columnIndexOrThrow36 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBSportMetadata.EXTENSION);
                int columnIndexOrThrow37 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "updated");
                int columnIndexOrThrow38 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "update_timestamp");
                int i4 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    DBSportDataStat dBSportDataStat = new DBSportDataStat();
                    int i5 = columnIndexOrThrow12;
                    int i6 = columnIndexOrThrow13;
                    dBSportDataStat.setSportStatId(cursorQuery.getLong(columnIndexOrThrow));
                    dBSportDataStat.setClientDataId(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    dBSportDataStat.setSsoid(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    dBSportDataStat.setDeviceUniqueId(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                    dBSportDataStat.setStartTimestamp(cursorQuery.getLong(columnIndexOrThrow5));
                    dBSportDataStat.setEndTimestamp(cursorQuery.getLong(columnIndexOrThrow6));
                    dBSportDataStat.setDate(cursorQuery.getInt(columnIndexOrThrow7));
                    dBSportDataStat.setSportMode(cursorQuery.getInt(columnIndexOrThrow8));
                    dBSportDataStat.setTotalSteps(cursorQuery.getInt(columnIndexOrThrow9));
                    dBSportDataStat.setTotalDistance(cursorQuery.getInt(columnIndexOrThrow10));
                    dBSportDataStat.setTotalCalories(cursorQuery.getLong(columnIndexOrThrow11));
                    columnIndexOrThrow12 = i5;
                    dBSportDataStat.setTotalAltitudeOffset(cursorQuery.getInt(columnIndexOrThrow12));
                    int i7 = columnIndexOrThrow2;
                    columnIndexOrThrow13 = i6;
                    int i8 = columnIndexOrThrow3;
                    dBSportDataStat.setTotalDuration(cursorQuery.getLong(columnIndexOrThrow13));
                    int i9 = i4;
                    dBSportDataStat.setTotalWorkoutMinutes(cursorQuery.getInt(i9));
                    int i10 = columnIndexOrThrow15;
                    int i11 = columnIndexOrThrow;
                    dBSportDataStat.setTotalMoveAboutTimes(cursorQuery.getInt(i10));
                    int i12 = columnIndexOrThrow16;
                    i4 = i9;
                    dBSportDataStat.setDisplay(cursorQuery.getInt(i12));
                    int i13 = columnIndexOrThrow17;
                    columnIndexOrThrow16 = i12;
                    dBSportDataStat.setSyncStatus(cursorQuery.getInt(i13));
                    columnIndexOrThrow18 = columnIndexOrThrow18;
                    dBSportDataStat.setTimezone(cursorQuery.isNull(columnIndexOrThrow18) ? null : cursorQuery.getString(columnIndexOrThrow18));
                    columnIndexOrThrow17 = i13;
                    int i14 = columnIndexOrThrow19;
                    dBSportDataStat.setModifiedTime(cursorQuery.getLong(i14));
                    int i15 = columnIndexOrThrow20;
                    dBSportDataStat.setCurrentDayStepsGoal(cursorQuery.getInt(i15));
                    int i16 = columnIndexOrThrow21;
                    dBSportDataStat.setStepsGoalComplete(cursorQuery.getInt(i16));
                    int i17 = columnIndexOrThrow22;
                    dBSportDataStat.setCurrentDayCaloriesGoal(cursorQuery.getInt(i17));
                    columnIndexOrThrow22 = i17;
                    int i18 = columnIndexOrThrow23;
                    dBSportDataStat.setCaloriesGoalComplete(cursorQuery.getInt(i18));
                    columnIndexOrThrow23 = i18;
                    int i19 = columnIndexOrThrow24;
                    dBSportDataStat.setCurrentDayWorkoutGoal(cursorQuery.getInt(i19));
                    columnIndexOrThrow24 = i19;
                    int i20 = columnIndexOrThrow25;
                    dBSportDataStat.setWorkoutGoalComplete(cursorQuery.getInt(i20));
                    columnIndexOrThrow25 = i20;
                    int i21 = columnIndexOrThrow26;
                    dBSportDataStat.setCurrentDayMoveAboutTimesGoal(cursorQuery.getInt(i21));
                    columnIndexOrThrow26 = i21;
                    int i22 = columnIndexOrThrow27;
                    dBSportDataStat.setMoveAboutTimesGoalComplete(cursorQuery.getInt(i22));
                    int i23 = columnIndexOrThrow28;
                    dBSportDataStat.setTotalAmountOfExercise(cursorQuery.getLong(i23));
                    int i24 = columnIndexOrThrow29;
                    dBSportDataStat.setDayGoalComplete(cursorQuery.getInt(i24));
                    int i25 = columnIndexOrThrow4;
                    int i26 = columnIndexOrThrow30;
                    int i27 = columnIndexOrThrow5;
                    dBSportDataStat.setSedentaryTotalDuration(cursorQuery.getLong(i26));
                    int i28 = columnIndexOrThrow31;
                    dBSportDataStat.setSedentaryCounts(cursorQuery.getLong(i28));
                    int i29 = columnIndexOrThrow32;
                    dBSportDataStat.setTotalStaticCal(cursorQuery.getLong(i29));
                    int i30 = columnIndexOrThrow33;
                    dBSportDataStat.setMjkTotalCaloriesGoal(cursorQuery.getInt(i30));
                    int i31 = columnIndexOrThrow34;
                    dBSportDataStat.setMjkIntakeCaloriesGoal(cursorQuery.getInt(i31));
                    int i32 = columnIndexOrThrow35;
                    dBSportDataStat.setStaticCalSource(cursorQuery.getInt(i32));
                    int i33 = columnIndexOrThrow36;
                    dBSportDataStat.setExtension(cursorQuery.isNull(i33) ? null : cursorQuery.getString(i33));
                    int i34 = columnIndexOrThrow37;
                    dBSportDataStat.setUpdated(cursorQuery.getInt(i34));
                    int i35 = columnIndexOrThrow38;
                    dBSportDataStat.setUpdateTimestamp(cursorQuery.getLong(i35));
                    arrayList.add(dBSportDataStat);
                    columnIndexOrThrow4 = i25;
                    columnIndexOrThrow3 = i8;
                    columnIndexOrThrow29 = i24;
                    columnIndexOrThrow5 = i27;
                    columnIndexOrThrow30 = i26;
                    columnIndexOrThrow31 = i28;
                    columnIndexOrThrow32 = i29;
                    columnIndexOrThrow34 = i31;
                    columnIndexOrThrow38 = i35;
                    columnIndexOrThrow2 = i7;
                    columnIndexOrThrow = i11;
                    columnIndexOrThrow15 = i10;
                    columnIndexOrThrow19 = i14;
                    columnIndexOrThrow20 = i15;
                    columnIndexOrThrow21 = i16;
                    columnIndexOrThrow27 = i22;
                    columnIndexOrThrow28 = i23;
                    columnIndexOrThrow33 = i30;
                    columnIndexOrThrow37 = i34;
                    columnIndexOrThrow36 = i33;
                    columnIndexOrThrow35 = i32;
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

    @Override // com.oplus.aiunit.vision.xdi
    public List<DBSportDataStat> o(String str, int i, int i2) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select _id, client_data_id, ssoid, device_unique_id, start_time, end_time, date, sport_mode, max(total_steps) as total_steps, max(total_distance) as total_distance, max(total_calories) as total_calories, max(total_altitude_offset) as total_altitude_offset, max(total_duration) as total_duration, max(total_move_about_times) as total_move_about_times, max(total_workout_minutes) as total_workout_minutes, display, sync_status, current_day_steps_goal, steps_goal_complete, current_day_calories_goal, timezone, current_day_workout_goal, workout_goal_complete, current_day_move_about_times_goal, move_about_times_goal_complete, calories_goal_complete, updated, day_goal_complete, sedentary_total_duration, sedentary_counts, total_static_cal, mjk_total_calories_goal, mjk_intake_calories_goal, static_cal_source, extension, modified_time, update_timestamp, max(total_amount_of_exercise) as total_amount_of_exercise from DBSportDataStat where ssoid = ? and date between ? and ? and sport_mode between -3 and -2 group by date order by date asc", 3);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, i);
        roomSQLiteQueryAcquire.bindLong(3, i2);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                DBSportDataStat dBSportDataStat = new DBSportDataStat();
                dBSportDataStat.setSportStatId(cursorQuery.getLong(0));
                dBSportDataStat.setClientDataId(cursorQuery.isNull(1) ? null : cursorQuery.getString(1));
                dBSportDataStat.setSsoid(cursorQuery.isNull(2) ? null : cursorQuery.getString(2));
                dBSportDataStat.setDeviceUniqueId(cursorQuery.isNull(3) ? null : cursorQuery.getString(3));
                dBSportDataStat.setStartTimestamp(cursorQuery.getLong(4));
                dBSportDataStat.setEndTimestamp(cursorQuery.getLong(5));
                dBSportDataStat.setDate(cursorQuery.getInt(6));
                dBSportDataStat.setSportMode(cursorQuery.getInt(7));
                dBSportDataStat.setTotalSteps(cursorQuery.getInt(8));
                dBSportDataStat.setTotalDistance(cursorQuery.getInt(9));
                dBSportDataStat.setTotalCalories(cursorQuery.getLong(10));
                dBSportDataStat.setTotalAltitudeOffset(cursorQuery.getInt(11));
                dBSportDataStat.setTotalDuration(cursorQuery.getLong(12));
                dBSportDataStat.setTotalMoveAboutTimes(cursorQuery.getInt(13));
                dBSportDataStat.setTotalWorkoutMinutes(cursorQuery.getInt(14));
                dBSportDataStat.setDisplay(cursorQuery.getInt(15));
                dBSportDataStat.setSyncStatus(cursorQuery.getInt(16));
                dBSportDataStat.setCurrentDayStepsGoal(cursorQuery.getInt(17));
                dBSportDataStat.setStepsGoalComplete(cursorQuery.getInt(18));
                dBSportDataStat.setCurrentDayCaloriesGoal(cursorQuery.getInt(19));
                dBSportDataStat.setTimezone(cursorQuery.isNull(20) ? null : cursorQuery.getString(20));
                dBSportDataStat.setCurrentDayWorkoutGoal(cursorQuery.getInt(21));
                dBSportDataStat.setWorkoutGoalComplete(cursorQuery.getInt(22));
                dBSportDataStat.setCurrentDayMoveAboutTimesGoal(cursorQuery.getInt(23));
                dBSportDataStat.setMoveAboutTimesGoalComplete(cursorQuery.getInt(24));
                dBSportDataStat.setCaloriesGoalComplete(cursorQuery.getInt(25));
                dBSportDataStat.setUpdated(cursorQuery.getInt(26));
                dBSportDataStat.setDayGoalComplete(cursorQuery.getInt(27));
                dBSportDataStat.setSedentaryTotalDuration(cursorQuery.getLong(28));
                dBSportDataStat.setSedentaryCounts(cursorQuery.getLong(29));
                dBSportDataStat.setTotalStaticCal(cursorQuery.getLong(30));
                dBSportDataStat.setMjkTotalCaloriesGoal(cursorQuery.getInt(31));
                dBSportDataStat.setMjkIntakeCaloriesGoal(cursorQuery.getInt(32));
                dBSportDataStat.setStaticCalSource(cursorQuery.getInt(33));
                dBSportDataStat.setExtension(cursorQuery.isNull(34) ? null : cursorQuery.getString(34));
                dBSportDataStat.setModifiedTime(cursorQuery.getLong(35));
                dBSportDataStat.setUpdateTimestamp(cursorQuery.getLong(36));
                dBSportDataStat.setTotalAmountOfExercise(cursorQuery.getLong(37));
                arrayList.add(dBSportDataStat);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.oplus.aiunit.vision.xdi
    public List<DBSportDataStat> p(String str, List<Integer> list, int i) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("select * from DBSportDataStat where ssoid = ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" and sport_mode in (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(") and date = ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" order by date asc");
        int i2 = 2;
        int i3 = size + 2;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), i3);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        for (Integer num : list) {
            if (num == null) {
                roomSQLiteQueryAcquire.bindNull(i2);
            } else {
                roomSQLiteQueryAcquire.bindLong(i2, num.intValue());
            }
            i2++;
        }
        roomSQLiteQueryAcquire.bindLong(i3, i);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBSportMetadata.CLIENT_DATA_ID);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ssoid");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBAssessmentRecord.DEVICE_UNIQUE_ID);
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "start_time");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "end_time");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sport_mode");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_steps");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_distance");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_calories");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_altitude_offset");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBSunshineStat.TOTAL_DURATION);
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_workout_minutes");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_move_about_times");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "display");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sync_status");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timezone");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "modified_time");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "current_day_steps_goal");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "steps_goal_complete");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "current_day_calories_goal");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "calories_goal_complete");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "current_day_workout_goal");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "workout_goal_complete");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "current_day_move_about_times_goal");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "move_about_times_goal_complete");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_amount_of_exercise");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "day_goal_complete");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sedentary_total_duration");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sedentary_counts");
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "total_static_cal");
                int columnIndexOrThrow33 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mjk_total_calories_goal");
                int columnIndexOrThrow34 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mjk_intake_calories_goal");
                int columnIndexOrThrow35 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "static_cal_source");
                int columnIndexOrThrow36 = CursorUtil.getColumnIndexOrThrow(cursorQuery, DBSportMetadata.EXTENSION);
                int columnIndexOrThrow37 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "updated");
                int columnIndexOrThrow38 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "update_timestamp");
                int i4 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    DBSportDataStat dBSportDataStat = new DBSportDataStat();
                    int i5 = columnIndexOrThrow12;
                    int i6 = columnIndexOrThrow13;
                    dBSportDataStat.setSportStatId(cursorQuery.getLong(columnIndexOrThrow));
                    dBSportDataStat.setClientDataId(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                    dBSportDataStat.setSsoid(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    dBSportDataStat.setDeviceUniqueId(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4));
                    dBSportDataStat.setStartTimestamp(cursorQuery.getLong(columnIndexOrThrow5));
                    dBSportDataStat.setEndTimestamp(cursorQuery.getLong(columnIndexOrThrow6));
                    dBSportDataStat.setDate(cursorQuery.getInt(columnIndexOrThrow7));
                    dBSportDataStat.setSportMode(cursorQuery.getInt(columnIndexOrThrow8));
                    dBSportDataStat.setTotalSteps(cursorQuery.getInt(columnIndexOrThrow9));
                    dBSportDataStat.setTotalDistance(cursorQuery.getInt(columnIndexOrThrow10));
                    dBSportDataStat.setTotalCalories(cursorQuery.getLong(columnIndexOrThrow11));
                    columnIndexOrThrow12 = i5;
                    dBSportDataStat.setTotalAltitudeOffset(cursorQuery.getInt(columnIndexOrThrow12));
                    int i7 = columnIndexOrThrow2;
                    columnIndexOrThrow13 = i6;
                    int i8 = columnIndexOrThrow3;
                    dBSportDataStat.setTotalDuration(cursorQuery.getLong(columnIndexOrThrow13));
                    int i9 = i4;
                    dBSportDataStat.setTotalWorkoutMinutes(cursorQuery.getInt(i9));
                    int i10 = columnIndexOrThrow15;
                    int i11 = columnIndexOrThrow;
                    dBSportDataStat.setTotalMoveAboutTimes(cursorQuery.getInt(i10));
                    int i12 = columnIndexOrThrow16;
                    i4 = i9;
                    dBSportDataStat.setDisplay(cursorQuery.getInt(i12));
                    int i13 = columnIndexOrThrow17;
                    columnIndexOrThrow16 = i12;
                    dBSportDataStat.setSyncStatus(cursorQuery.getInt(i13));
                    int i14 = columnIndexOrThrow18;
                    dBSportDataStat.setTimezone(cursorQuery.isNull(i14) ? null : cursorQuery.getString(i14));
                    int i15 = columnIndexOrThrow19;
                    dBSportDataStat.setModifiedTime(cursorQuery.getLong(i15));
                    int i16 = columnIndexOrThrow20;
                    dBSportDataStat.setCurrentDayStepsGoal(cursorQuery.getInt(i16));
                    int i17 = columnIndexOrThrow21;
                    dBSportDataStat.setStepsGoalComplete(cursorQuery.getInt(i17));
                    int i18 = columnIndexOrThrow22;
                    dBSportDataStat.setCurrentDayCaloriesGoal(cursorQuery.getInt(i18));
                    columnIndexOrThrow22 = i18;
                    int i19 = columnIndexOrThrow23;
                    dBSportDataStat.setCaloriesGoalComplete(cursorQuery.getInt(i19));
                    columnIndexOrThrow23 = i19;
                    int i20 = columnIndexOrThrow24;
                    dBSportDataStat.setCurrentDayWorkoutGoal(cursorQuery.getInt(i20));
                    columnIndexOrThrow24 = i20;
                    int i21 = columnIndexOrThrow25;
                    dBSportDataStat.setWorkoutGoalComplete(cursorQuery.getInt(i21));
                    columnIndexOrThrow25 = i21;
                    int i22 = columnIndexOrThrow26;
                    dBSportDataStat.setCurrentDayMoveAboutTimesGoal(cursorQuery.getInt(i22));
                    columnIndexOrThrow26 = i22;
                    int i23 = columnIndexOrThrow27;
                    dBSportDataStat.setMoveAboutTimesGoalComplete(cursorQuery.getInt(i23));
                    int i24 = columnIndexOrThrow28;
                    dBSportDataStat.setTotalAmountOfExercise(cursorQuery.getLong(i24));
                    int i25 = columnIndexOrThrow29;
                    dBSportDataStat.setDayGoalComplete(cursorQuery.getInt(i25));
                    int i26 = columnIndexOrThrow4;
                    int i27 = columnIndexOrThrow30;
                    int i28 = columnIndexOrThrow5;
                    dBSportDataStat.setSedentaryTotalDuration(cursorQuery.getLong(i27));
                    int i29 = columnIndexOrThrow31;
                    dBSportDataStat.setSedentaryCounts(cursorQuery.getLong(i29));
                    int i30 = columnIndexOrThrow32;
                    dBSportDataStat.setTotalStaticCal(cursorQuery.getLong(i30));
                    int i31 = columnIndexOrThrow33;
                    dBSportDataStat.setMjkTotalCaloriesGoal(cursorQuery.getInt(i31));
                    int i32 = columnIndexOrThrow34;
                    dBSportDataStat.setMjkIntakeCaloriesGoal(cursorQuery.getInt(i32));
                    int i33 = columnIndexOrThrow35;
                    dBSportDataStat.setStaticCalSource(cursorQuery.getInt(i33));
                    int i34 = columnIndexOrThrow36;
                    dBSportDataStat.setExtension(cursorQuery.isNull(i34) ? null : cursorQuery.getString(i34));
                    int i35 = columnIndexOrThrow37;
                    dBSportDataStat.setUpdated(cursorQuery.getInt(i35));
                    int i36 = columnIndexOrThrow38;
                    dBSportDataStat.setUpdateTimestamp(cursorQuery.getLong(i36));
                    arrayList.add(dBSportDataStat);
                    columnIndexOrThrow4 = i26;
                    columnIndexOrThrow3 = i8;
                    columnIndexOrThrow29 = i25;
                    columnIndexOrThrow5 = i28;
                    columnIndexOrThrow30 = i27;
                    columnIndexOrThrow31 = i29;
                    columnIndexOrThrow32 = i30;
                    columnIndexOrThrow34 = i32;
                    columnIndexOrThrow38 = i36;
                    columnIndexOrThrow2 = i7;
                    columnIndexOrThrow = i11;
                    columnIndexOrThrow15 = i10;
                    columnIndexOrThrow18 = i14;
                    columnIndexOrThrow17 = i13;
                    columnIndexOrThrow19 = i15;
                    columnIndexOrThrow20 = i16;
                    columnIndexOrThrow21 = i17;
                    columnIndexOrThrow27 = i23;
                    columnIndexOrThrow28 = i24;
                    columnIndexOrThrow33 = i31;
                    columnIndexOrThrow37 = i35;
                    columnIndexOrThrow36 = i34;
                    columnIndexOrThrow35 = i33;
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

    @Override // com.oplus.aiunit.vision.xdi
    public DBSportDataStat q(String str, int i, long j2, long j3, String[] strArr, String str2) {
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("select 0 as _id,  ssoid, device_unique_id, start_time, end_time, -3 as sport_mode, sync_status, ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" as date, display, timezone, 0 as modified_time, updated, sum(steps) as total_steps, 0 as current_day_steps_goal, 0 as steps_goal_complete, sum(distance) as total_distance, sum(calories) as total_calories, 0 as total_amount_of_exercise, sum(workout) as total_workout_minutes, sum(sedentary_state) as sedentary_total_duration, sum(altitude_offset) as total_altitude_offset, sum(end_time - start_time) as total_duration, 0 as current_day_calories_goal, 0 as calories_goal_complete, 0 as day_goal_complete, 0 as sedentary_total_duration, 0 as sedentary_counts, 0 as mjk_total_calories_goal, 0 as mjk_intake_calories_goal, 0 as static_cal_source,0 as current_day_workout_goal, 0 as workout_goal_complete, 0 as current_day_move_about_times_goal, 0 as move_about_times_goal_complete, 0 as total_static_cal, 0 as total_move_about_times, 0 as update_timestamp from (select * from DBSportDataDetail where ssoid = ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" and start_time between ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" and ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" and display = 1 and device_category not in (");
        int length = strArr.length;
        StringUtil.appendPlaceholders(sbNewStringBuilder, length);
        sbNewStringBuilder.append(") group by device_unique_id, start_time) group by ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" order by start_time desc limit 1");
        int i2 = length + 5;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), i2);
        roomSQLiteQueryAcquire.bindLong(1, i);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, str);
        }
        roomSQLiteQueryAcquire.bindLong(3, j2);
        roomSQLiteQueryAcquire.bindLong(4, j3);
        int i3 = 5;
        for (String str3 : strArr) {
            if (str3 == null) {
                roomSQLiteQueryAcquire.bindNull(i3);
            } else {
                roomSQLiteQueryAcquire.bindString(i3, str3);
            }
            i3++;
        }
        if (str2 == null) {
            roomSQLiteQueryAcquire.bindNull(i2);
        } else {
            roomSQLiteQueryAcquire.bindString(i2, str2);
        }
        this.a.assertNotSuspendingTransaction();
        DBSportDataStat dBSportDataStat = null;
        String string = null;
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            if (cursorQuery.moveToFirst()) {
                DBSportDataStat dBSportDataStat2 = new DBSportDataStat();
                dBSportDataStat2.setSportStatId(cursorQuery.getLong(0));
                dBSportDataStat2.setSsoid(cursorQuery.isNull(1) ? null : cursorQuery.getString(1));
                dBSportDataStat2.setDeviceUniqueId(cursorQuery.isNull(2) ? null : cursorQuery.getString(2));
                dBSportDataStat2.setStartTimestamp(cursorQuery.getLong(3));
                dBSportDataStat2.setEndTimestamp(cursorQuery.getLong(4));
                dBSportDataStat2.setSportMode(cursorQuery.getInt(5));
                dBSportDataStat2.setSyncStatus(cursorQuery.getInt(6));
                dBSportDataStat2.setDate(cursorQuery.getInt(7));
                dBSportDataStat2.setDisplay(cursorQuery.getInt(8));
                if (!cursorQuery.isNull(9)) {
                    string = cursorQuery.getString(9);
                }
                dBSportDataStat2.setTimezone(string);
                dBSportDataStat2.setModifiedTime(cursorQuery.getLong(10));
                dBSportDataStat2.setUpdated(cursorQuery.getInt(11));
                dBSportDataStat2.setTotalSteps(cursorQuery.getInt(12));
                dBSportDataStat2.setCurrentDayStepsGoal(cursorQuery.getInt(13));
                dBSportDataStat2.setStepsGoalComplete(cursorQuery.getInt(14));
                dBSportDataStat2.setTotalDistance(cursorQuery.getInt(15));
                dBSportDataStat2.setTotalCalories(cursorQuery.getLong(16));
                dBSportDataStat2.setTotalAmountOfExercise(cursorQuery.getLong(17));
                dBSportDataStat2.setTotalWorkoutMinutes(cursorQuery.getInt(18));
                dBSportDataStat2.setSedentaryTotalDuration(cursorQuery.getLong(19));
                dBSportDataStat2.setTotalAltitudeOffset(cursorQuery.getInt(20));
                dBSportDataStat2.setTotalDuration(cursorQuery.getLong(21));
                dBSportDataStat2.setCurrentDayCaloriesGoal(cursorQuery.getInt(22));
                dBSportDataStat2.setCaloriesGoalComplete(cursorQuery.getInt(23));
                dBSportDataStat2.setDayGoalComplete(cursorQuery.getInt(24));
                dBSportDataStat2.setSedentaryCounts(cursorQuery.getLong(26));
                dBSportDataStat2.setMjkTotalCaloriesGoal(cursorQuery.getInt(27));
                dBSportDataStat2.setMjkIntakeCaloriesGoal(cursorQuery.getInt(28));
                dBSportDataStat2.setStaticCalSource(cursorQuery.getInt(29));
                dBSportDataStat2.setCurrentDayWorkoutGoal(cursorQuery.getInt(30));
                dBSportDataStat2.setWorkoutGoalComplete(cursorQuery.getInt(31));
                dBSportDataStat2.setCurrentDayMoveAboutTimesGoal(cursorQuery.getInt(32));
                dBSportDataStat2.setMoveAboutTimesGoalComplete(cursorQuery.getInt(33));
                dBSportDataStat2.setTotalStaticCal(cursorQuery.getLong(34));
                dBSportDataStat2.setTotalMoveAboutTimes(cursorQuery.getInt(35));
                dBSportDataStat2.setUpdateTimestamp(cursorQuery.getLong(36));
                dBSportDataStat = dBSportDataStat2;
            }
            return dBSportDataStat;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.oplus.aiunit.vision.xdi
    public List<DBSportDataStat> r(String str, int i, int i2, int i3) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select _id, client_data_id, ssoid, device_unique_id, start_time, end_time, date, sport_mode, max(total_steps) as total_steps, max(total_distance) as total_distance, max(total_calories) as total_calories, max(total_altitude_offset) as total_altitude_offset, max(total_duration) as total_duration, max(total_move_about_times) as total_move_about_times, max(total_workout_minutes) as total_workout_minutes, display, sync_status, max(current_day_steps_goal) as current_day_steps_goal, steps_goal_complete, max(current_day_calories_goal) as current_day_calories_goal, timezone, max(current_day_workout_goal) as current_day_workout_goal, workout_goal_complete, max(current_day_move_about_times_goal) as current_day_move_about_times_goal, move_about_times_goal_complete, calories_goal_complete, updated, day_goal_complete, max(sedentary_total_duration) as sedentary_total_duration, max(sedentary_counts) as sedentary_counts, max(total_static_cal) as total_static_cal, max(mjk_total_calories_goal) as mjk_total_calories_goal, max(mjk_intake_calories_goal) as mjk_intake_calories_goal, static_cal_source, extension, modified_time, max(update_timestamp) as update_timestamp, max(total_amount_of_exercise) as total_amount_of_exercise from DBSportDataStat where ssoid = ? and date between ? and ? and sport_mode = ? group by date order by date asc", 4);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, i);
        roomSQLiteQueryAcquire.bindLong(3, i2);
        roomSQLiteQueryAcquire.bindLong(4, i3);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                DBSportDataStat dBSportDataStat = new DBSportDataStat();
                dBSportDataStat.setSportStatId(cursorQuery.getLong(0));
                dBSportDataStat.setClientDataId(cursorQuery.isNull(1) ? null : cursorQuery.getString(1));
                dBSportDataStat.setSsoid(cursorQuery.isNull(2) ? null : cursorQuery.getString(2));
                dBSportDataStat.setDeviceUniqueId(cursorQuery.isNull(3) ? null : cursorQuery.getString(3));
                dBSportDataStat.setStartTimestamp(cursorQuery.getLong(4));
                dBSportDataStat.setEndTimestamp(cursorQuery.getLong(5));
                dBSportDataStat.setDate(cursorQuery.getInt(6));
                dBSportDataStat.setSportMode(cursorQuery.getInt(7));
                dBSportDataStat.setTotalSteps(cursorQuery.getInt(8));
                dBSportDataStat.setTotalDistance(cursorQuery.getInt(9));
                dBSportDataStat.setTotalCalories(cursorQuery.getLong(10));
                dBSportDataStat.setTotalAltitudeOffset(cursorQuery.getInt(11));
                dBSportDataStat.setTotalDuration(cursorQuery.getLong(12));
                dBSportDataStat.setTotalMoveAboutTimes(cursorQuery.getInt(13));
                dBSportDataStat.setTotalWorkoutMinutes(cursorQuery.getInt(14));
                dBSportDataStat.setDisplay(cursorQuery.getInt(15));
                dBSportDataStat.setSyncStatus(cursorQuery.getInt(16));
                dBSportDataStat.setCurrentDayStepsGoal(cursorQuery.getInt(17));
                dBSportDataStat.setStepsGoalComplete(cursorQuery.getInt(18));
                dBSportDataStat.setCurrentDayCaloriesGoal(cursorQuery.getInt(19));
                dBSportDataStat.setTimezone(cursorQuery.isNull(20) ? null : cursorQuery.getString(20));
                dBSportDataStat.setCurrentDayWorkoutGoal(cursorQuery.getInt(21));
                dBSportDataStat.setWorkoutGoalComplete(cursorQuery.getInt(22));
                dBSportDataStat.setCurrentDayMoveAboutTimesGoal(cursorQuery.getInt(23));
                dBSportDataStat.setMoveAboutTimesGoalComplete(cursorQuery.getInt(24));
                dBSportDataStat.setCaloriesGoalComplete(cursorQuery.getInt(25));
                dBSportDataStat.setUpdated(cursorQuery.getInt(26));
                dBSportDataStat.setDayGoalComplete(cursorQuery.getInt(27));
                dBSportDataStat.setSedentaryTotalDuration(cursorQuery.getLong(28));
                dBSportDataStat.setSedentaryCounts(cursorQuery.getLong(29));
                dBSportDataStat.setTotalStaticCal(cursorQuery.getLong(30));
                dBSportDataStat.setMjkTotalCaloriesGoal(cursorQuery.getInt(31));
                dBSportDataStat.setMjkIntakeCaloriesGoal(cursorQuery.getInt(32));
                dBSportDataStat.setStaticCalSource(cursorQuery.getInt(33));
                dBSportDataStat.setExtension(cursorQuery.isNull(34) ? null : cursorQuery.getString(34));
                dBSportDataStat.setModifiedTime(cursorQuery.getLong(35));
                dBSportDataStat.setUpdateTimestamp(cursorQuery.getLong(36));
                dBSportDataStat.setTotalAmountOfExercise(cursorQuery.getLong(37));
                arrayList.add(dBSportDataStat);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.oplus.aiunit.vision.xdi
    public int s(DBSportDataStat dBSportDataStat) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            int iHandle = this.d.handle(dBSportDataStat) + 0;
            this.a.setTransactionSuccessful();
            return iHandle;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.oplus.aiunit.vision.xdi
    public Long t(DBSportDataStat dBSportDataStat) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            long jInsertAndReturnId = this.b.insertAndReturnId(dBSportDataStat);
            this.a.setTransactionSuccessful();
            return Long.valueOf(jInsertAndReturnId);
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.oplus.aiunit.vision.xdi
    public List<DBSportDataStat> u(String str, int i, long j2, long j3, String str2, String str3) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select 0 as _id,  ssoid, device_unique_id, start_time, end_time, -2 as sport_mode, sync_status, ? as date, display, timezone, 0 as modified_time, updated, sum(steps) as total_steps, 0 as current_day_steps_goal, 0 as steps_goal_complete, sum(distance) as total_distance, sum(calories) as total_calories, 0 as total_amount_of_exercise, sum(workout) as total_workout_minutes, sum(sedentary_state) as sedentary_total_duration, sum(altitude_offset) as total_altitude_offset, sum(end_time - start_time) as total_duration, 0 as current_day_calories_goal, 0 as current_day_workout_goal, 0 as workout_goal_complete, 0 as current_day_move_about_times_goal, 0 as move_about_times_goal_complete, 0 as calories_goal_complete, 0 as day_goal_complete, 0 as sedentary_total_duration, 0 as sedentary_counts, 0 as total_static_cal, 0 as total_move_about_times, 0 as mjk_total_calories_goal, 0 as mjk_intake_calories_goal, 0 as static_cal_source, max(start_time) as update_timestamp from (select * from DBSportDataDetail where ssoid = ? and start_time between ? and ? and display = 1 group by device_unique_id, start_time) group by ? order by ?", 6);
        roomSQLiteQueryAcquire.bindLong(1, i);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, str);
        }
        roomSQLiteQueryAcquire.bindLong(3, j2);
        roomSQLiteQueryAcquire.bindLong(4, j3);
        if (str2 == null) {
            roomSQLiteQueryAcquire.bindNull(5);
        } else {
            roomSQLiteQueryAcquire.bindString(5, str2);
        }
        if (str3 == null) {
            roomSQLiteQueryAcquire.bindNull(6);
        } else {
            roomSQLiteQueryAcquire.bindString(6, str3);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                DBSportDataStat dBSportDataStat = new DBSportDataStat();
                dBSportDataStat.setSportStatId(cursorQuery.getLong(0));
                dBSportDataStat.setSsoid(cursorQuery.isNull(1) ? null : cursorQuery.getString(1));
                dBSportDataStat.setDeviceUniqueId(cursorQuery.isNull(2) ? null : cursorQuery.getString(2));
                dBSportDataStat.setStartTimestamp(cursorQuery.getLong(3));
                dBSportDataStat.setEndTimestamp(cursorQuery.getLong(4));
                dBSportDataStat.setSportMode(cursorQuery.getInt(5));
                dBSportDataStat.setSyncStatus(cursorQuery.getInt(6));
                dBSportDataStat.setDate(cursorQuery.getInt(7));
                dBSportDataStat.setDisplay(cursorQuery.getInt(8));
                dBSportDataStat.setTimezone(cursorQuery.isNull(9) ? null : cursorQuery.getString(9));
                dBSportDataStat.setModifiedTime(cursorQuery.getLong(10));
                dBSportDataStat.setUpdated(cursorQuery.getInt(11));
                dBSportDataStat.setTotalSteps(cursorQuery.getInt(12));
                dBSportDataStat.setCurrentDayStepsGoal(cursorQuery.getInt(13));
                dBSportDataStat.setStepsGoalComplete(cursorQuery.getInt(14));
                dBSportDataStat.setTotalDistance(cursorQuery.getInt(15));
                dBSportDataStat.setTotalCalories(cursorQuery.getLong(16));
                dBSportDataStat.setTotalAmountOfExercise(cursorQuery.getLong(17));
                dBSportDataStat.setTotalWorkoutMinutes(cursorQuery.getInt(18));
                dBSportDataStat.setSedentaryTotalDuration(cursorQuery.getLong(19));
                dBSportDataStat.setTotalAltitudeOffset(cursorQuery.getInt(20));
                dBSportDataStat.setTotalDuration(cursorQuery.getLong(21));
                dBSportDataStat.setCurrentDayCaloriesGoal(cursorQuery.getInt(22));
                dBSportDataStat.setCurrentDayWorkoutGoal(cursorQuery.getInt(23));
                dBSportDataStat.setWorkoutGoalComplete(cursorQuery.getInt(24));
                dBSportDataStat.setCurrentDayMoveAboutTimesGoal(cursorQuery.getInt(25));
                dBSportDataStat.setMoveAboutTimesGoalComplete(cursorQuery.getInt(26));
                dBSportDataStat.setCaloriesGoalComplete(cursorQuery.getInt(27));
                dBSportDataStat.setDayGoalComplete(cursorQuery.getInt(28));
                dBSportDataStat.setSedentaryCounts(cursorQuery.getLong(30));
                dBSportDataStat.setTotalStaticCal(cursorQuery.getLong(31));
                dBSportDataStat.setTotalMoveAboutTimes(cursorQuery.getInt(32));
                dBSportDataStat.setMjkTotalCaloriesGoal(cursorQuery.getInt(33));
                dBSportDataStat.setMjkIntakeCaloriesGoal(cursorQuery.getInt(34));
                dBSportDataStat.setStaticCalSource(cursorQuery.getInt(35));
                dBSportDataStat.setUpdateTimestamp(cursorQuery.getLong(36));
                arrayList.add(dBSportDataStat);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.oplus.aiunit.vision.xdi
    public int v(DBSportDataStat dBSportDataStat) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            int iHandle = this.f20359c.handle(dBSportDataStat) + 0;
            this.a.setTransactionSuccessful();
            return iHandle;
        } finally {
            this.a.endTransaction();
        }
    }

    public final DBSportDataStat w(Cursor cursor) {
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