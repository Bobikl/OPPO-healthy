package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.DBSportDataDetail;
import com.heytap.databaseengineservice.db.table.DBSportDataStat;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface gai {
    @Insert(onConflict = 1)
    List<Long> a(List<DBSportDataStat> list);

    @Update(onConflict = 1)
    int b(List<DBSportDataStat> list);

    @Query("select MAX(modified_time) from DBSportDataStat where ssoid = :ssoid")
    long c(String str);

    @Query("select * from DBSportDataStat where ssoid = :ssoid and date between :startDate and :endDate")
    List<DBSportDataStat> d(String str, int i, int i2);

    @Query("select _id, client_data_id, start_time, end_time, date, sport_mode, total_steps, total_distance, total_calories, total_altitude_offset, total_duration, total_amount_of_exercise, total_move_about_times, total_workout_minutes, display, sync_status, current_day_steps_goal, steps_goal_complete, current_day_calories_goal, current_day_workout_goal, workout_goal_complete, current_day_move_about_times_goal, move_about_times_goal_complete, calories_goal_complete, day_goal_complete, sedentary_total_duration, sedentary_counts, total_static_cal, updated, modified_time, update_timestamp, mjk_total_calories_goal, mjk_intake_calories_goal, static_cal_source from DBSportDataStat where ssoid = :ssoid and (sync_status = 0 or updated = 1) and start_time > 0 and date between :startDate and :endDate order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :limitCount")
    List<DBSportDataStat> e(int i, int i2, int i3, int i4, String str);

    @Query("delete from DBSportDataStat where ssoid = :ssoid")
    int f(String str);

    @Query("select * from DBSportDataStat where ssoid = :ssoid and date in (:dateList) and (sync_status = 0 or updated = 1)")
    List<DBSportDataStat> g(List<Integer> list, String str);

    @Query("select min(date) from DBSportDataStat where ssoid = :ssoid and date >= :oldestDay")
    int h(String str, int i);

    @Query("select * from DBSportDataStat where ssoid = :ssoid and sport_mode = :sportMode and date = :date order by date asc")
    DBSportDataStat i(String str, int i, int i2);

    @Query("select MAX(date) from DBSportDataStat where ssoid = :ssoid and date <= :today")
    int j(String str, int i);

    @Query("select 0 as _id,  ssoid, device_unique_id, start_time, end_time, sport_mode, sync_status, :date as date, display, timezone, 0 as modified_time, updated, sum(steps) as total_steps, 0 as current_day_steps_goal, 0 as steps_goal_complete, sum(distance) as total_distance, 0 as current_day_workout_goal, 0 as workout_goal_complete, 0 as current_day_move_about_times_goal, 0 as move_about_times_goal_complete, sum(calories) as total_calories, sum(workout) as total_workout_minutes, 0 as total_amount_of_exercise, sum(altitude_offset) as total_altitude_offset, sum(end_time - start_time) as total_duration, 0 as current_day_calories_goal, 0 as calories_goal_complete, 0 as day_goal_complete, 0 as sedentary_total_duration, 0 as sedentary_counts, 0 as total_static_cal, 0 as total_move_about_times, max(start_time) as update_timestamp, 0 as mjk_total_calories_goal, 0 as mjk_intake_calories_goal, 0 as static_cal_source from (select * from DBSportDataDetail where ssoid = :ssoid and start_time between :startTime and :endTime group by device_unique_id, start_time) group by device_unique_id order by start_time desc")
    List<DBSportDataStat> k(String str, int i, long j2, long j3);

    @Query("select * from DBSportDataDetail where ssoid = :ssoid and start_time between :startTime and :endTime group by device_unique_id order by start_time desc")
    List<DBSportDataDetail> l(String str, long j2, long j3);

    @RawQuery
    List<DBSportDataStat> m(SupportSQLiteQuery supportSQLiteQuery);

    @Query("select * from DBSportDataStat where ssoid = :ssoid and date between :startDate and :endDate and sport_mode = :sportMode order by date asc")
    List<DBSportDataStat> n(String str, int i, int i2, int i3);

    @Query("select _id, client_data_id, ssoid, device_unique_id, start_time, end_time, date, sport_mode, max(total_steps) as total_steps, max(total_distance) as total_distance, max(total_calories) as total_calories, max(total_altitude_offset) as total_altitude_offset, max(total_duration) as total_duration, max(total_move_about_times) as total_move_about_times, max(total_workout_minutes) as total_workout_minutes, display, sync_status, current_day_steps_goal, steps_goal_complete, current_day_calories_goal, timezone, current_day_workout_goal, workout_goal_complete, current_day_move_about_times_goal, move_about_times_goal_complete, calories_goal_complete, updated, day_goal_complete, sedentary_total_duration, sedentary_counts, total_static_cal, mjk_total_calories_goal, mjk_intake_calories_goal, static_cal_source, extension, modified_time, update_timestamp, max(total_amount_of_exercise) as total_amount_of_exercise from DBSportDataStat where ssoid = :ssoid and date between :startDate and :endDate and sport_mode between -3 and -2 group by date order by date asc")
    List<DBSportDataStat> o(String str, int i, int i2);

    @Query("select * from DBSportDataStat where ssoid = :ssoid and sport_mode in (:sportMode) and date = :date order by date asc")
    List<DBSportDataStat> p(String str, List<Integer> list, int i);

    @Query("select 0 as _id,  ssoid, device_unique_id, start_time, end_time, -3 as sport_mode, sync_status, :date as date, display, timezone, 0 as modified_time, updated, sum(steps) as total_steps, 0 as current_day_steps_goal, 0 as steps_goal_complete, sum(distance) as total_distance, sum(calories) as total_calories, 0 as total_amount_of_exercise, sum(workout) as total_workout_minutes, sum(sedentary_state) as sedentary_total_duration, sum(altitude_offset) as total_altitude_offset, sum(end_time - start_time) as total_duration, 0 as current_day_calories_goal, 0 as calories_goal_complete, 0 as day_goal_complete, 0 as sedentary_total_duration, 0 as sedentary_counts, 0 as mjk_total_calories_goal, 0 as mjk_intake_calories_goal, 0 as static_cal_source,0 as current_day_workout_goal, 0 as workout_goal_complete, 0 as current_day_move_about_times_goal, 0 as move_about_times_goal_complete, 0 as total_static_cal, 0 as total_move_about_times, 0 as update_timestamp from (select * from DBSportDataDetail where ssoid = :ssoid and start_time between :startTime and :endTime and display = 1 and device_category not in (:deviceCategory) group by device_unique_id, start_time) group by :groupBy order by start_time desc limit 1")
    DBSportDataStat q(String str, int i, long j2, long j3, String[] strArr, String str2);

    @Query("select _id, client_data_id, ssoid, device_unique_id, start_time, end_time, date, sport_mode, max(total_steps) as total_steps, max(total_distance) as total_distance, max(total_calories) as total_calories, max(total_altitude_offset) as total_altitude_offset, max(total_duration) as total_duration, max(total_move_about_times) as total_move_about_times, max(total_workout_minutes) as total_workout_minutes, display, sync_status, max(current_day_steps_goal) as current_day_steps_goal, steps_goal_complete, max(current_day_calories_goal) as current_day_calories_goal, timezone, max(current_day_workout_goal) as current_day_workout_goal, workout_goal_complete, max(current_day_move_about_times_goal) as current_day_move_about_times_goal, move_about_times_goal_complete, calories_goal_complete, updated, day_goal_complete, max(sedentary_total_duration) as sedentary_total_duration, max(sedentary_counts) as sedentary_counts, max(total_static_cal) as total_static_cal, max(mjk_total_calories_goal) as mjk_total_calories_goal, max(mjk_intake_calories_goal) as mjk_intake_calories_goal, static_cal_source, extension, modified_time, max(update_timestamp) as update_timestamp, max(total_amount_of_exercise) as total_amount_of_exercise from DBSportDataStat where ssoid = :ssoid and date between :startDate and :endDate and sport_mode = :sportMode group by date order by date asc")
    List<DBSportDataStat> r(String str, int i, int i2, int i3);

    @Update(onConflict = 1)
    int s(DBSportDataStat dBSportDataStat);

    @Insert(onConflict = 1)
    Long t(DBSportDataStat dBSportDataStat);

    @Query("select 0 as _id,  ssoid, device_unique_id, start_time, end_time, -2 as sport_mode, sync_status, :date as date, display, timezone, 0 as modified_time, updated, sum(steps) as total_steps, 0 as current_day_steps_goal, 0 as steps_goal_complete, sum(distance) as total_distance, sum(calories) as total_calories, 0 as total_amount_of_exercise, sum(workout) as total_workout_minutes, sum(sedentary_state) as sedentary_total_duration, sum(altitude_offset) as total_altitude_offset, sum(end_time - start_time) as total_duration, 0 as current_day_calories_goal, 0 as current_day_workout_goal, 0 as workout_goal_complete, 0 as current_day_move_about_times_goal, 0 as move_about_times_goal_complete, 0 as calories_goal_complete, 0 as day_goal_complete, 0 as sedentary_total_duration, 0 as sedentary_counts, 0 as total_static_cal, 0 as total_move_about_times, 0 as mjk_total_calories_goal, 0 as mjk_intake_calories_goal, 0 as static_cal_source, max(start_time) as update_timestamp from (select * from DBSportDataDetail where ssoid = :ssoid and start_time between :startTime and :endTime and display = 1 group by device_unique_id, start_time) group by :groupBy order by :sortOrderAndLimit")
    List<DBSportDataStat> u(String str, int i, long j2, long j3, String str2, String str3);

    @Delete
    int v(DBSportDataStat dBSportDataStat);
}
