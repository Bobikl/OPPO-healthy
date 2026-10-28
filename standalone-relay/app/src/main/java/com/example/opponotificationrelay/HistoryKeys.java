package com.example.opponotificationrelay;
import java.util.*;
/** Business identities pinned to the supported cloud DTOs. Unknown auto-ID tables remain raw sources. */
final class HistoryKeys {
    static List<String> known(String table){switch(table){
        case "DBBloodOxygenSaturation":return Arrays.asList("ssoid","device_unique_id","data_created_timestamp","blood_oxygen_saturation_type");
        case "DBBloodOxygenSaturationDataStat":return Arrays.asList("ssoid","date");
        case "DBBloodSugar":return Arrays.asList("ssoid","data_client","data_created_timestamp");
        case "DBBloodSugarStat":return Arrays.asList("ssoid","date");
        case "DBBloodSugarWarning":return Arrays.asList("ssoid","data_client","type","timestamp");
        case "DBCervicalSpine":return Arrays.asList("ssoid","start_timestamp");
        case "DBCervicalSpineAction":return Arrays.asList("ssoid","start_timestamp");
        case "DBExerciseIntensity":return Arrays.asList("ssoid","data_client","start_timestamp");
        case "DBHealthArchiveRecord":return Arrays.asList("ssoid","doc_id");
        case "DBHearingHealthStatTable":return Arrays.asList("ssoid","date");
        case "DBHearingHealthTable":return Arrays.asList("ssoid","device_unique_id","data_created_timestamp");
        case "DBHeartRate":return Arrays.asList("ssoid","device_unique_id","data_created_timestamp","heart_rate_type");
        case "DBHeartRateDataStatTable":return Arrays.asList("ssoid","date");
        case "DBHeartRateWarning":return Arrays.asList("ssoid","device_unique_id","start_timestamp","warning_type");
        case "DBHrvTable":return Arrays.asList("ssoid","device_unique_id","start_timestamp","hrv_type");
        case "DBMenstrualCycle":return Arrays.asList("ssoid","data_client","start_timestamp");
        case "DBMenstrualCycleSymptom":return Arrays.asList("ssoid","data_client","data_created_timestamp","type");
        case "DBOneTimeSportStat":return Arrays.asList("ssoid","date","sport_mode");
        case "DBOsaResult":return Arrays.asList("ssoid","date","version");
        case "DBPhysicalMentalStat":return Arrays.asList("ssoid","data_client","date");
        case "DBPhysicalMentalStatus":return Arrays.asList("ssoid","data_client","start_timestamp");
        case "DBSleepAdvice":return Arrays.asList("ssoid","data_client","data_timestamp");
        case "DBSleepDataStatTable":return Arrays.asList("ssoid","date");
        case "DBSleepHeartRateStat":return Arrays.asList("ssoid","date");
        case "DBSleepRRInterval":return Arrays.asList("ssoid","data_client","data_created_timestamp");
        case "DBSleepTable":return Arrays.asList("ssoid","device_unique_id","start_time","sleep_type");
        case "DBSportDataDetail":return Arrays.asList("ssoid","device_unique_id","start_time");
        case "DBSportDataStat":return Arrays.asList("ssoid","date","sport_mode");
        case "DBStressDataStatTable":return Arrays.asList("ssoid","date");
        case "DBStressTable":return Arrays.asList("ssoid","device_unique_id","data_created_timestamp","stress_type");
        case "DBSunshineDetail":return Arrays.asList("ssoid","data_client","data_created_timestamp");
        case "DBSunshineStat":return Arrays.asList("ssoid","data_client","date");
        case "DBUserGoalInfo":return Arrays.asList("ssoid","type");
        case "DBUserInfo":return Arrays.asList("ssoid");
        case "DBUserPreference":return Arrays.asList("ssoid","preference_key");
        case "DBWristTemperature":return Arrays.asList("ssoid","data_client","start_timestamp");
        case "DBWristTemperatureStat":return Arrays.asList("ssoid","date");
        default:return null;
    }}
}
