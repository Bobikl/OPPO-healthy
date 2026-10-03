package com.heytap.health.core.widget.charts.data;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/* JADX INFO: loaded from: classes16.dex */
public enum TimeUnit {
    ORIGINAL(1.0d),
    MSEL(500.0d),
    SECOND(1000.0d),
    MINUTE(60000.0d),
    MINUTE_DECIMAL(60000.0d),
    HALF_AN_HOUR(1800000.0d),
    HOUR(3600000.0d),
    DAY(8.64E7d);

    private double unit;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            a = iArr;
            try {
                iArr[TimeUnit.ORIGINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[TimeUnit.MSEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[TimeUnit.SECOND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[TimeUnit.MINUTE_DECIMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[TimeUnit.MINUTE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[TimeUnit.HALF_AN_HOUR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[TimeUnit.HOUR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[TimeUnit.DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    TimeUnit(double d) {
        this.unit = d;
    }

    public double getUnit() {
        return this.unit;
    }

    public double timeStampToUnitDouble(long j2) {
        double epochMilli;
        double unit;
        switch (a.a[ordinal()]) {
            case 1:
                return j2;
            case 2:
                epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                unit = getUnit();
                break;
            case 3:
            case 4:
                epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).withNano(0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                unit = getUnit();
                break;
            case 5:
                epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).withSecond(0).withNano(0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                unit = getUnit();
                break;
            case 6:
                if (LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).getMinute() >= 30) {
                    epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).withMinute(30).withSecond(0).withNano(0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    unit = getUnit();
                } else {
                    epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).withMinute(0).withSecond(0).withNano(0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    unit = getUnit();
                }
                break;
            case 7:
                epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).withMinute(0).withSecond(0).withNano(0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                unit = getUnit();
                break;
            case 8:
                epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).withHour(0).withMinute(0).withSecond(0).withNano(0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                unit = getUnit();
                break;
            default:
                throw new IllegalArgumentException();
        }
        return epochMilli / unit;
    }
}
