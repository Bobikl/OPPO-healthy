package com.heytap.store.homemodule.utils;

import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J.\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006¨\u0006\u0010"}, d2 = {"Lcom/heytap/store/homemodule/utils/TimeUtils;", "", "()V", "getHHmmssTime", "", "times", "", "getTime1", ClickApiEntity.TIME, "hm", "", "hms", "ms", "withUnit", "getTime3", "getTimeWithUnit", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TimeUtils {

    @NotNull
    public static final TimeUtils INSTANCE = new TimeUtils();

    private TimeUtils() {
    }

    @NotNull
    public final String getHHmmssTime(long times) {
        long j2 = times % ((long) 86400);
        long j3 = 3600;
        long j4 = 60;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / j3), Long.valueOf((j2 % j3) / j4), Long.valueOf(j2 % j4)}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }

    @NotNull
    public final String getTime1(long time, boolean hm, boolean hms, boolean ms, boolean withUnit) {
        long j2 = time / ((long) 1000);
        long j3 = 86400;
        long j4 = j2 / j3;
        long j5 = j2 % j3;
        long j6 = 3600;
        long j7 = j5 / j6;
        String strStringPlus = j7 < 10 ? Intrinsics.stringPlus("0", Long.valueOf(j7)) : Intrinsics.stringPlus("", Long.valueOf(j7));
        long j8 = j5 % j6;
        long j9 = 60;
        long j10 = j8 / j9;
        String strStringPlus2 = j10 < 10 ? Intrinsics.stringPlus("0", Long.valueOf(j10)) : Intrinsics.stringPlus("", Long.valueOf(j10));
        long j11 = j8 % j9;
        String strStringPlus3 = j11 < 10 ? Intrinsics.stringPlus("0", Long.valueOf(j11)) : Intrinsics.stringPlus("", Long.valueOf(j11));
        if (hm) {
            return strStringPlus + ':' + strStringPlus2;
        }
        if (hms) {
            return strStringPlus + ':' + strStringPlus2 + ':' + strStringPlus3;
        }
        if (ms) {
            if (j7 <= 0) {
                return strStringPlus2 + ':' + strStringPlus3;
            }
            return strStringPlus + ':' + strStringPlus2 + ':' + strStringPlus3;
        }
        if (j4 <= 0) {
            if (!withUnit) {
                return strStringPlus + ':' + strStringPlus2 + ':' + strStringPlus3;
            }
            return strStringPlus + (char) 26102 + strStringPlus2 + (char) 20998 + strStringPlus3 + (char) 31186;
        }
        if (!withUnit) {
            return j4 + (char) 22825 + strStringPlus + ':' + strStringPlus2 + ':' + strStringPlus3;
        }
        return j4 + (char) 22825 + strStringPlus + (char) 26102 + strStringPlus2 + (char) 20998 + strStringPlus3 + (char) 31186;
    }

    @NotNull
    public final String getTime3(long time) {
        long j2 = time / ((long) 1000);
        long j3 = 86400;
        long j4 = j2 / j3;
        long j5 = j2 % j3;
        long j6 = 3600;
        long j7 = j5 / j6;
        if (j4 >= 1) {
            j7 += ((long) 24) * j4;
        }
        String strStringPlus = j7 < 10 ? Intrinsics.stringPlus("0", Long.valueOf(j7)) : Intrinsics.stringPlus("", Long.valueOf(j7));
        long j8 = j5 % j6;
        long j9 = 60;
        long j10 = j8 / j9;
        String strStringPlus2 = j10 < 10 ? Intrinsics.stringPlus("0", Long.valueOf(j10)) : Intrinsics.stringPlus("", Long.valueOf(j10));
        long j11 = j8 % j9;
        String strStringPlus3 = j11 < 10 ? Intrinsics.stringPlus("0", Long.valueOf(j11)) : Intrinsics.stringPlus("", Long.valueOf(j11));
        if (j4 > 0) {
            return strStringPlus + ':' + strStringPlus2 + ':' + strStringPlus3;
        }
        return strStringPlus + ':' + strStringPlus2 + ':' + strStringPlus3;
    }

    @NotNull
    public final String getTimeWithUnit(long time) {
        return getTime1(time, false, false, false, true);
    }
}
