package com.heytap.log.core;

import android.text.TextUtils;
import android.util.Log;
import com.heytap.log.consts.OplusLogConfig;
import com.heytap.log.util.AppUtil;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjuster;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes19.dex */
public class FileStrategy {
    private static final long FAST_PATH_INTERVAL_MS = 60000;
    private static final String TAG = "FileStrategy";
    private static final ThreadLocal<SimpleDateFormat> sDateFormat = new ThreadLocal<SimpleDateFormat>() { // from class: com.heytap.log.core.FileStrategy.1
        @Override // java.lang.ThreadLocal
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy_MM_dd_HH", Locale.getDefault());
        }
    };
    private Calendar mCalendar;
    private int prevDay;
    private int prevHour;
    private int prevMonth;
    private int prevYear;
    private long nextHourInterval = 0;
    private long lastCheckTime = 0;
    private volatile boolean mJustDeletedLogFile = false;
    private long prevTimeStamp = System.currentTimeMillis();

    public static String buildFileNamePrefix(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            String strReplaceSpecialChars = replaceSpecialChars(str);
            sb.append(strReplaceSpecialChars);
            if (!strReplaceSpecialChars.endsWith("_")) {
                sb.append("_");
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(replaceSpecialChars(str2));
            sb.append("_");
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append(replaceSpecialChars(str3));
            sb.append("_");
        }
        return sb.toString();
    }

    public static String makeZipFileName(String str) {
        return "opluslog_" + str + "_" + UUID.randomUUID() + ".zip";
    }

    private long nextHour() {
        try {
            LocalDateTime localDateTimeNow = LocalDateTime.now(ZoneId.systemDefault());
            Duration durationBetween = Duration.between(localDateTimeNow, localDateTimeNow.getHour() < 23 ? localDateTimeNow.with((TemporalAdjuster) LocalTime.of(localDateTimeNow.getHour() + 1, 0, 0)) : localDateTimeNow.with((TemporalAdjuster) LocalTime.of(0, 0, 0)).plusDays(1L));
            return ((durationBetween.toMinutes() * 60) + (durationBetween.getSeconds() % 60)) * 1000;
        } catch (Exception e2) {
            Log.e(TAG, "nextHour: ", e2);
            return 0L;
        }
    }

    public static String replaceSpecialChars(String str) {
        return TextUtils.isEmpty(str) ? str : str.replace(".", "_").replace(":", "_");
    }

    public String makeFileName(String str, long j2) {
        String strMyProcessName = AppUtil.myProcessName(AppUtil.getAppContext());
        String optimizedProcessName = AppUtil.getOptimizedProcessName(AppUtil.getAppContext());
        StringBuilder sb = new StringBuilder();
        sb.append(buildFileNamePrefix(str, strMyProcessName, optimizedProcessName));
        SimpleDateFormat simpleDateFormat = sDateFormat.get();
        synchronized (simpleDateFormat) {
            sb.append(simpleDateFormat.format(new Date(j2)));
            sb.append(OplusLogConfig.FILE_EXT);
        }
        if (!StandardCharsets.UTF_8.newEncoder().canEncode(sb.toString())) {
            sb = new StringBuilder(new String(sb.toString().getBytes(), StandardCharsets.UTF_8));
        }
        if (!sb.toString().endsWith(OplusLogConfig.FILE_EXT)) {
            int iLastIndexOf = sb.toString().lastIndexOf(".");
            if (iLastIndexOf > 0) {
                sb = new StringBuilder(sb.substring(0, iLastIndexOf));
            }
            sb.append(OplusLogConfig.FILE_EXT);
        }
        File file = new File(sb.toString());
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                Log.e(TAG, "" + e2.toString());
            }
        }
        return sb.toString();
    }

    public void setJustDeletedLogFile(boolean z) {
        this.mJustDeletedLogFile = z;
    }

    public boolean shouldOpenNewFile() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.mJustDeletedLogFile) {
            long j2 = this.lastCheckTime;
            if (jCurrentTimeMillis >= j2 && jCurrentTimeMillis - j2 < 60000) {
                return false;
            }
        }
        if (this.mJustDeletedLogFile) {
            this.mJustDeletedLogFile = false;
            this.lastCheckTime = jCurrentTimeMillis;
            return true;
        }
        long j3 = this.prevTimeStamp;
        if (jCurrentTimeMillis > j3) {
            long j4 = this.nextHourInterval;
            if (j4 > 0 && jCurrentTimeMillis - j3 < j4) {
                return false;
            }
        }
        this.prevTimeStamp = jCurrentTimeMillis;
        this.nextHourInterval = nextHour();
        this.lastCheckTime = jCurrentTimeMillis;
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(jCurrentTimeMillis), ZoneId.systemDefault());
        int year = localDateTimeOfInstant.getYear();
        int monthValue = localDateTimeOfInstant.getMonthValue();
        int dayOfMonth = localDateTimeOfInstant.getDayOfMonth();
        int hour = localDateTimeOfInstant.getHour();
        if (this.prevYear == year && this.prevMonth == monthValue && this.prevDay == dayOfMonth && this.prevHour == hour) {
            return false;
        }
        this.prevYear = year;
        this.prevMonth = monthValue;
        this.prevDay = dayOfMonth;
        this.prevHour = hour;
        return true;
    }
}
