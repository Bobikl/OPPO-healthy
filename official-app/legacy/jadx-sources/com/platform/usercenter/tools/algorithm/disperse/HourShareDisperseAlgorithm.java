package com.platform.usercenter.tools.algorithm.disperse;

import com.platform.usercenter.tools.algorithm.RandomFactory;
import com.platform.usercenter.tools.datastructure.StringUtil;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.util.Calendar;

/* JADX INFO: loaded from: classes9.dex */
public class HourShareDisperseAlgorithm implements IDisperseSpi {
    private static final String TAG = "HourShareDisperseAlgorithm";

    private int getHitHourPoint(IDisperseSpi.DisperseParam disperseParam) {
        return Math.abs(disperseParam.deviceId.hashCode()) % disperseParam.batchCount;
    }

    private int getHourOfDayByTime(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        return calendar.get(11);
    }

    private int hour2Millis(int i) {
        return i * 60 * 60 * 1000;
    }

    @Override // com.platform.usercenter.tools.algorithm.disperse.IDisperseSpi
    public DisperseResponse disperse(IDisperseSpi.DisperseParam disperseParam) {
        if (disperseParam == null) {
            throw new NullPointerException("HourShareDisperseAlgorithm param is null");
        }
        if (StringUtil.isEmpty(disperseParam.deviceId)) {
            UCLogUtil.e(TAG, "deviceId is null");
            return DisperseResponse.create(false, 0L);
        }
        if (disperseParam.batchCount <= 0 || disperseParam.triggerRate <= 0 || disperseParam.escapeHour <= 0) {
            throw new RuntimeException("HourShareDisperseAlgorithm param exception, hourCount or triggerRate or escapeHour must be positive number");
        }
        return disperseInner(disperseParam);
    }

    public DisperseResponse disperseInner(IDisperseSpi.DisperseParam disperseParam) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - disperseParam.lastTriggerTime;
        if (j2 <= 0) {
            return DisperseResponse.create(false, disperseParam.nextTriggerTime);
        }
        int iHour2Millis = hour2Millis(disperseParam.triggerRate);
        int iHour2Millis2 = hour2Millis(disperseParam.escapeHour) + iHour2Millis;
        long j3 = disperseParam.nextTriggerTime;
        long j4 = iHour2Millis2;
        if (j3 - jCurrentTimeMillis > j4) {
            return DisperseResponse.create(false, 0L);
        }
        if (j2 < iHour2Millis) {
            return DisperseResponse.create(false, j3);
        }
        if (disperseParam.lastTriggerTime == 0 || j2 <= j4) {
            return enterDisperseProcess(disperseParam, jCurrentTimeMillis);
        }
        UCLogUtil.d(TAG, "escape trigger");
        return DisperseResponse.create(true, disperseParam.nextTriggerTime);
    }

    public DisperseResponse enterDisperseProcess(IDisperseSpi.DisperseParam disperseParam, long j2) {
        long j3 = disperseParam.lastTriggerTime;
        if (j2 < j3) {
            return enterHourPointHit(disperseParam, j2);
        }
        if ((j3 != 0 || disperseParam.nextTriggerTime != 0) && disperseParam.nextTriggerTime > j3) {
            return enterTimeCompare(disperseParam, j2);
        }
        return enterHourPointHit(disperseParam, j2);
    }

    public DisperseResponse enterHourPointHit(IDisperseSpi.DisperseParam disperseParam, long j2) {
        int hitHourPoint = getHitHourPoint(disperseParam);
        int hourOfDayByTime = getHourOfDayByTime(j2);
        int i = hitHourPoint;
        while (i < 24) {
            if (i == hourOfDayByTime) {
                UCLogUtil.d(TAG, "enterHourPointHit hourPoint:" + hitHourPoint);
                return DisperseResponse.create(false, j2 + (((long) RandomFactory.generateRandom().nextInt(3600)) * 1000));
            }
            i += disperseParam.batchCount;
        }
        return DisperseResponse.create(false, disperseParam.nextTriggerTime);
    }

    public DisperseResponse enterTimeCompare(IDisperseSpi.DisperseParam disperseParam, long j2) {
        if (j2 >= disperseParam.nextTriggerTime) {
            int i = disperseParam.batchCount;
            int hourOfDayByTime = getHourOfDayByTime(j2);
            for (int hitHourPoint = getHitHourPoint(disperseParam); hitHourPoint < 24; hitHourPoint += i) {
                int i2 = hitHourPoint + 2;
                if (i2 >= 24 && hourOfDayByTime <= i2 - 24) {
                    return DisperseResponse.create(true, disperseParam.nextTriggerTime);
                }
                if (hourOfDayByTime >= hitHourPoint && hourOfDayByTime <= i2) {
                    return DisperseResponse.create(true, disperseParam.nextTriggerTime);
                }
            }
        }
        return DisperseResponse.create(false, disperseParam.nextTriggerTime);
    }
}
