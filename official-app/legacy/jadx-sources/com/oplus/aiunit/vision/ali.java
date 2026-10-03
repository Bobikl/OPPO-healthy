package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes15.dex */
public class ali {
    public static final String NOT_IN_PHONE_DEVICE_CATEGORY = " not in ('Phone','mobile','')";
    public static final String NOT_IN_WATCH1_PHONE_DEVICE_CATEGORY = " not in ('Watch','Phone','mobile','')";

    public static String a(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
                return "date";
            case 6:
                return "date/100";
            case 7:
                return "date/10000";
            case 8:
                return "date/10000000000";
            case 9:
            default:
                return "";
            case 10:
                return "strftime('%Y-%W', substr(date,1,4)-substr(date,5,2)-substr(date,7,2))";
        }
    }

    public static String b(int i, int i2, String str) {
        String strD = d(str);
        if (i == 11) {
            return "strftime('%Y%m%d', " + strD + "*10000+(strftime('%H', " + strD + "*60+strftime('%M', " + strD + ")/30";
        }
        switch (i) {
            case 2:
                if (i2 <= 0) {
                    i2 = 1;
                }
                return "strftime('%Y%m%d', " + strD + "*10000+(strftime('%H', " + strD + "*60+strftime('%M', " + strD + ")/" + i2;
            case 3:
                return "strftime('%Y-%m-%d %H', " + strD;
            case 4:
                return "strftime('%Y-%m-%d', " + strD;
            case 5:
                return "strftime('%Y-%W', " + strD;
            case 6:
                return "strftime('%Y-%m', " + strD;
            case 7:
                return "strftime('%Y', " + strD;
            case 8:
                return "strftime('AGG_ALL', " + strD;
            default:
                return "";
        }
    }

    public static String c() {
        return ", 'unixepoch', 'localtime'))";
    }

    @NonNull
    public static String d(String str) {
        str.hashCode();
        switch (str) {
            case "DBRelax":
            case "DBPhysicalMentalStatus":
            case "DBExerciseIntensity":
            case "DBDisturbSleep":
            case "DBCervicalSpine":
            case "DBSportMetadata":
            case "DBWristTemperature":
                return "datetime(start_timestamp/1000" + c();
            case "DBSunshineDetail":
            case "DBBloodSugar":
            case "DBSleepIndex":
            case "DBStressTable":
            case "DBHeartRate":
            case "DBBloodOxygenSaturation":
            case "DBBreathRate":
            case "DBHearingHealthTable":
                return "datetime(data_created_timestamp/1000" + c();
            case "DBBloodPressure":
                return "datetime(measure_timestamp/1000" + c();
            default:
                return "datetime(start_time/1000" + c();
        }
    }

    public static String e(int i) {
        if (i == -2) {
            return " not in(-2,-3,-4)";
        }
        if (i == 11) {
            return " in(2,40,10)";
        }
        switch (i) {
            case 100:
                return " in(2,10,16,15,18,17,14,13,22,127,43,44,21,40,909)";
            case 101:
                return " in(1,41,19)";
            case 102:
                return " in(3,34)";
            case 103:
                return " in(9,32,33,35,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,5,42,290)";
            case 104:
                return " in(7,809)";
            case 105:
                return " in(31,8,601,602,603,604,605,606,607,608,609,610,611,612,613)";
            case 106:
                return " in(36,37,501,502,503,504,505,506)";
            case 107:
                return " in(12,301,302,303,304,305,306,307,308,309,310,311,312,313)";
            case 108:
                return " in(401,402,403,404,405,406,407,408,409,410)";
            case 109:
                return " in(701,702,703,704,705,706,707)";
            case 110:
                return " in(801,802,803,804,805,806,807,808)";
            case 111:
                return " in(901,902,903,904,905,906,907,908)";
            case 112:
                return " in(38)";
            case 113:
                return " in(1001,1002,1003)";
            default:
                return " = " + i;
        }
    }
}
