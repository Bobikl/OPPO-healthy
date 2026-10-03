package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;

/* JADX INFO: loaded from: classes6.dex */
public final class weg {
    public static final long DEFAULT_NR_DRS_PERIOD_MS = 7200000;
    public static final long DEFAULT_NR_STANDALONE_PERIOD_MS = 900000;
    public static final long DEFAULT_PSEUDO_PERIOD_MS = 300000;
    public static final double JITTER_RATIO = 0.1d;
    public static final double MAX_FIRST_DELAY_RATIO = 0.5d;
    public static final long MAX_JITTER_MS = 600000;
    public static final double SCALE_AFTERNOON = 0.95d;
    public static final double SCALE_EVENING_PEAK = 1.3d;
    public static final double SCALE_MIDNIGHT_AVOID = 1.2d;
    public static final double SCALE_MORNING_PEAK = 1.2d;
    public static final double SCALE_NIGHT_VALLEY = 0.75d;
    public static final long SCHEDULER_THRESHOLD_MS = 3600000;
    public static final int WINDOW_AFTERNOON_END = 960;
    public static final int WINDOW_AFTERNOON_START = 840;
    public static final int WINDOW_EVENING_PEAK_END = 1260;
    public static final int WINDOW_EVENING_PEAK_START = 1020;
    public static final int WINDOW_MIDNIGHT_END = 30;
    public static final int WINDOW_MIDNIGHT_START = 0;
    public static final int WINDOW_MORNING_PEAK_END = 750;
    public static final int WINDOW_MORNING_PEAK_START = 600;
    public static final int WINDOW_NIGHT_END = 1440;
    public static final int WINDOW_NIGHT_START = 1320;

    public static String a(long j2) {
        StringBuilder sb;
        if (j2 < 1000) {
            return j2 + "ms";
        }
        long j3 = j2 / 1000;
        if (j3 < 60) {
            return j3 + "s";
        }
        long j4 = j3 / 60;
        long j5 = j3 % 60;
        if (j4 < 60) {
            if (j5 <= 0) {
                return j4 + LogFieldKey.MESSAGE_KEY;
            }
            return j4 + LogFieldKey.MESSAGE_KEY + j5 + "s";
        }
        long j6 = j4 / 60;
        long j7 = j4 % 60;
        if (j7 > 0) {
            sb = new StringBuilder();
            sb.append(j6);
            sb.append(b2n.g);
            sb.append(j7);
            sb.append(LogFieldKey.MESSAGE_KEY);
        } else {
            sb = new StringBuilder();
            sb.append(j6);
            sb.append(b2n.g);
        }
        return sb.toString();
    }

    public static String b(int i) {
        return String.format("%02d:%02d", Integer.valueOf(i / 60), Integer.valueOf(i % 60));
    }
}
