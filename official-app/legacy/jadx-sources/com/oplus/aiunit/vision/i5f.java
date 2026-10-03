package com.oplus.aiunit.vision;

import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQueryBuilder;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.databaseengineservice.db.table.DBSportDataStat;
import com.heytap.databaseengineservice.db.table.sunshine.DBSunshineStat;

/* JADX INFO: loaded from: classes15.dex */
public class i5f {
    public final String a = "QueryDBSportDataStatHandler";

    public static class a {
        public static final i5f a = new i5f();
    }

    public static i5f d() {
        return a.a;
    }

    public final SupportSQLiteQuery a(String str, int i, int i2, int i3, String str2, String str3) {
        return SupportSQLiteQueryBuilder.builder(DBSportDataStat.TABLE_NAME).columns(new String[]{"_id", "ssoid", "start_time", "end_time", "date", "sport_mode", "sum(total_move_about_times) as total_move_about_times", "sync_status", "count(case when total_move_about_times >= 12 then total_move_about_times end) as calories_goal_complete", "timezone", "display", "avg(case when total_move_about_times >= 1 then total_move_about_times end) as total_steps", "avg(case when sedentary_counts >= 1 then sedentary_counts end) as sedentary_counts", "sum(total_calories) as total_calories", "max(total_calories) as total_distance", "avg(current_day_calories_goal) as current_day_calories_goal"}).groupBy(str2).orderBy(str3).selection("ssoid = ? and date between ? and ? and sport_mode = ?", new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}).create();
    }

    public final SupportSQLiteQuery b(String str, int i, int i2, int i3, String str2, String str3) {
        String str4;
        if (i3 == -2) {
            str4 = "(select _id, ssoid, start_time, end_time, date, -2 as sport_mode, max(total_steps) as total_steps, max(total_distance) as total_distance, max(total_calories) as total_calories, max(total_altitude_offset) as total_altitude_offset, max(total_duration) as total_duration, max(total_move_about_times) as total_move_about_times, max(total_workout_minutes) as total_workout_minutes, display, sync_status, current_day_steps_goal, steps_goal_complete, current_day_calories_goal, timezone, current_day_workout_goal, workout_goal_complete, current_day_move_about_times_goal, move_about_times_goal_complete, calories_goal_complete, updated, day_goal_complete, sedentary_total_duration, sedentary_counts, total_static_cal, mjk_total_calories_goal, mjk_intake_calories_goal, static_cal_source, extension, modified_time, update_timestamp, max(total_amount_of_exercise) as total_amount_of_exercise from DBSportDataStat where ssoid = " + str + " and date between " + i + " and " + i2 + " and sport_mode between -3 and -2 group by date order by date asc)";
        } else {
            str4 = DBSportDataStat.TABLE_NAME;
        }
        return SupportSQLiteQueryBuilder.builder(str4).columns(new String[]{"_id", "ssoid", "start_time", "end_time", "date", "sport_mode", "count(case when total_calories >= 1000 then date end) as sync_status", "sum(calories_goal_complete) as calories_goal_complete", "timezone", "display", "avg(case when total_calories >= 1000 then total_calories end) as total_steps", "sum(total_calories) as total_calories", "max(total_calories) as total_distance", "avg(current_day_calories_goal) as current_day_calories_goal"}).groupBy(str2).orderBy(str3).selection("ssoid = ? and date between ? and ? and sport_mode = ?", new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}).create();
    }

    public final SupportSQLiteQuery c(String str, int i, int i2, int i3, String str2, String str3) {
        return SupportSQLiteQueryBuilder.builder(DBSportDataStat.TABLE_NAME).columns(new String[]{"_id", "ssoid", "start_time", "end_time", "date", "sport_mode", "sum(total_workout_minutes) as total_workout_minutes", "sync_status", "count(case when total_workout_minutes >= 30 then total_workout_minutes end) as calories_goal_complete", "timezone", "display", "avg(case when total_workout_minutes >= 1 then total_workout_minutes end) as total_steps", "sum(total_calories) as total_calories", "max(total_calories) as total_distance", "avg(current_day_calories_goal) as current_day_calories_goal"}).groupBy(str2).orderBy(str3).selection("ssoid = ? and date between ? and ? and sport_mode = ?", new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}).create();
    }

    public final SupportSQLiteQuery e(String str, int i, int i2, int i3, String str2, String str3) {
        return SupportSQLiteQueryBuilder.builder(DBSportDataStat.TABLE_NAME).columns(new String[]{"ssoid", "start_time", "end_time", "date", "sport_mode", "current_day_steps_goal", "count(total_steps) as total_altitude_offset", "timezone", "display", "total_distance", "total_calories", DBSunshineStat.TOTAL_DURATION, "sync_status", "modified_time", "steps_goal_complete", "updated", "avg(total_steps) as total_steps"}).groupBy(str2).orderBy(str3).selection("ssoid = ? and date between ? and ? and sport_mode = ?", new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}).create();
    }

    public final SupportSQLiteQuery f(String str, int i, int i2, int i3, String str2, String str3) {
        String str4;
        if (i3 == -2) {
            str4 = "(select _id, ssoid, start_time, end_time, date, -2 as sport_mode, max(total_steps) as total_steps, max(total_distance) as total_distance, max(total_calories) as total_calories, max(total_altitude_offset) as total_altitude_offset, max(total_duration) as total_duration, max(total_move_about_times) as total_move_about_times, max(total_workout_minutes) as total_workout_minutes, display, sync_status, current_day_steps_goal, steps_goal_complete, current_day_calories_goal, timezone, current_day_workout_goal, workout_goal_complete, current_day_move_about_times_goal, move_about_times_goal_complete, calories_goal_complete, updated, day_goal_complete, sedentary_total_duration, sedentary_counts, total_static_cal, mjk_total_calories_goal, mjk_intake_calories_goal, static_cal_source, extension, modified_time, update_timestamp, max(total_amount_of_exercise) as total_amount_of_exercise from DBSportDataStat where ssoid = " + str + " and date between " + i + " and " + i2 + " and sport_mode between -3 and -2 group by date order by date asc)";
        } else {
            str4 = DBSportDataStat.TABLE_NAME;
        }
        return SupportSQLiteQueryBuilder.builder(str4).columns(new String[]{"_id", "ssoid", "start_time", "end_time", "date", "sport_mode", "current_day_calories_goal", "sync_status", "current_day_steps_goal", "timezone", "display", "modified_time", "updated", "sum(total_steps) as total_steps", "sum(steps_goal_complete) as steps_goal_complete", "sum(calories_goal_complete) as calories_goal_complete", "sum(day_goal_complete) as day_goal_complete", "sum(total_distance) as total_distance", "sum(total_calories) as total_calories", "sum(total_move_about_times) as total_move_about_times", "sum(total_workout_minutes) as total_workout_minutes", "sum(total_altitude_offset) as total_altitude_offset", "sum(total_duration) as total_duration"}).groupBy(str2).orderBy(str3).selection("ssoid = ? and date between ? and ? and sport_mode = ?", new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}).create();
    }

    public final SupportSQLiteQuery g(String str, int i, int i2, int i3, String str2, String str3) {
        return SupportSQLiteQueryBuilder.builder(DBSportDataStat.TABLE_NAME).columns(new String[]{"ssoid", "start_time", "end_time", "date", "sport_mode", "current_day_calories_goal", "sync_status", "current_day_steps_goal", "timezone", "display", "modified_time", "updated", "max(total_steps) as total_steps", "steps_goal_complete", "calories_goal_complete", "total_distance", "total_calories", "total_altitude_offset", DBSunshineStat.TOTAL_DURATION}).groupBy(str2).orderBy(str3).selection("ssoid = ? and date between ? and ? and sport_mode = ? and sync_status != 2", new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}).create();
    }

    public final SupportSQLiteQuery h(String str, int i, int i2, int i3, String str2, String str3) {
        return SupportSQLiteQueryBuilder.builder(DBSportDataStat.TABLE_NAME).columns(new String[]{"_id", "ssoid", "start_time", "end_time", "date", "sport_mode", "current_day_calories_goal", "sync_status", "current_day_steps_goal", "timezone", "display", "modified_time", "updated", "sum(total_steps) as total_steps", "steps_goal_complete", "calories_goal_complete", "sum(total_distance) as total_distance", "sum(total_calories) as total_calories", "sum(total_altitude_offset) as total_altitude_offset", "sum(total_duration) as total_duration"}).groupBy(str2).orderBy(str3).selection("ssoid = ? and date between ? and ? and sport_mode = ? and sync_status != 2", new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}).create();
    }

    public final SupportSQLiteQuery i(String str, int i, int i2, int i3, String str2, String str3) {
        return SupportSQLiteQueryBuilder.builder(DBSportDataStat.TABLE_NAME).columns(new String[]{"_id", "ssoid", "start_time", "end_time", "date", "sport_mode", "sync_status", "sum(steps_goal_complete) as current_day_steps_goal", "timezone", "display", "modified_time", "updated", "avg(total_steps) as total_steps", "steps_goal_complete", "sum(total_distance) as total_distance", "avg(total_calories) as total_calories", "count(total_steps) as total_altitude_offset", DBSunshineStat.TOTAL_DURATION}).groupBy(str2).orderBy(str3).selection("ssoid = ? and date between ? and ? and sport_mode = ?", new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}).create();
    }

    public SupportSQLiteQuery j(DataReadOption dataReadOption) {
        int readSportMode = dataReadOption.getReadSportMode();
        String ssoid = dataReadOption.getSsoid();
        int groupUnitType = dataReadOption.getGroupUnitType();
        int anchor = dataReadOption.getAnchor();
        int count = dataReadOption.getCount();
        int i = v05.i(dataReadOption.getStartTime());
        int i2 = v05.i(dataReadOption.getEndTime());
        String str = dataReadOption.getSortOrder() == 0 ? " asc" : " desc";
        String strA = ali.a(groupUnitType);
        String str2 = " date " + str;
        if (count > anchor) {
            str2 = str2 + " limit " + anchor + "," + count;
        }
        int aggregateType = dataReadOption.getAggregateType();
        if (aggregateType == -4) {
            SupportSQLiteQuery supportSQLiteQueryA = a(ssoid, i, i2, readSportMode, strA, str2);
            cj4.a("QueryDBSportDataStatHandler", "getCaloriesWMYCardData: " + supportSQLiteQueryA.getQuery() + ", who is " + ssoid);
            return supportSQLiteQueryA;
        }
        if (aggregateType == -3) {
            SupportSQLiteQuery supportSQLiteQueryC = c(ssoid, i, i2, readSportMode, strA, str2);
            cj4.a("QueryDBSportDataStatHandler", "getCaloriesWMYCardData: " + supportSQLiteQueryC.getQuery() + ", who is " + ssoid);
            return supportSQLiteQueryC;
        }
        if (aggregateType == -2) {
            SupportSQLiteQuery supportSQLiteQueryB = b(ssoid, i, i2, readSportMode, strA, str2);
            cj4.a("QueryDBSportDataStatHandler", "getCaloriesWMYCardData: " + supportSQLiteQueryB.getQuery() + ", who is " + ssoid);
            return supportSQLiteQueryB;
        }
        if (aggregateType == -1) {
            if (groupUnitType == 6) {
                SupportSQLiteQuery supportSQLiteQueryE = e(ssoid, i, i2, readSportMode, strA, str2);
                cj4.a("QueryDBSportDataStatHandler", "getYearFragmentAVGMonthStat: " + supportSQLiteQueryE.getQuery() + ", who is " + ssoid);
                return supportSQLiteQueryE;
            }
            SupportSQLiteQuery supportSQLiteQueryI = i(ssoid, i, i2, readSportMode, strA, str2);
            cj4.a("QueryDBSportDataStatHandler", "getYearFragmentStat: " + supportSQLiteQueryI.getQuery() + ", who is " + ssoid);
            return supportSQLiteQueryI;
        }
        if (aggregateType == 106) {
            SupportSQLiteQuery supportSQLiteQueryH = h(ssoid, i, i2, readSportMode, strA, str2);
            cj4.a("QueryDBSportDataStatHandler", "readSportStatData steps medal: " + supportSQLiteQueryH.getQuery() + ", who is " + ssoid);
            return supportSQLiteQueryH;
        }
        if (aggregateType != 110) {
            SupportSQLiteQuery supportSQLiteQueryF = f(ssoid, i, i2, readSportMode, strA, str2);
            cj4.a("QueryDBSportDataStatHandler", "readSportStatData aggregate query str:" + supportSQLiteQueryF.getQuery() + ", who is " + ssoid);
            return supportSQLiteQueryF;
        }
        SupportSQLiteQuery supportSQLiteQueryG = g(ssoid, i, i2, readSportMode, strA, str2);
        cj4.a("QueryDBSportDataStatHandler", "readSportStatData steps max: " + supportSQLiteQueryG.getQuery() + ", who is " + ssoid);
        return supportSQLiteQueryG;
    }
}
