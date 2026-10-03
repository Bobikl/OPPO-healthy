package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.databaseengine.model.SportDataDetail;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.protocol.dm.DMProto$DMCmdId;
import com.oplus.onet.IONetService;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;

/* JADX INFO: loaded from: classes15.dex */
public class ttk {
    public static final int a;
    public static final float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f17150c;
    public static final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f17151e;
    public static final float f;

    static {
        int iH;
        int iG;
        so9.c cVar = qa2.spData;
        if (cVar.m0(cVar.z0(), qa2.spData.a(), qa2.spData.h()) > 0) {
            so9.c cVar2 = qa2.spData;
            iH = cVar2.m0(cVar2.z0(), qa2.spData.a(), qa2.spData.h());
        } else {
            iH = qa2.spData.h();
        }
        a = iH;
        float f2 = iH * 3.0f;
        b = f2;
        f17150c = f2 * 1440.0f;
        so9.c cVar3 = qa2.spData;
        if (cVar3.m0(cVar3.z0(), qa2.spData.A(), qa2.spData.G()) > 0) {
            so9.c cVar4 = qa2.spData;
            iG = cVar4.m0(cVar4.z0(), qa2.spData.A(), qa2.spData.G());
        } else {
            iG = qa2.spData.G();
        }
        d = iG;
        float f3 = iH * 3.0f;
        f17151e = f3;
        f = f3 * 1440.0f;
    }

    public static boolean a(int i, SportHealthData sportHealthData) {
        if (i != 1001) {
            return true;
        }
        SportDataDetail sportDataDetail = (SportDataDetail) sportHealthData;
        if (j(sportDataDetail)) {
            return h((long) sportDataDetail.getSteps()) && f((long) sportDataDetail.getDistance()) && e(sportDataDetail.getCalories()) && b((double) sportDataDetail.getAltitudeOffset());
        }
        return false;
    }

    public static boolean b(double d2) {
        float f2 = f17151e;
        boolean z = d2 - ((double) f2) < 1.0E-6d;
        if (!z) {
            cj4.d("ValidatorUtil", "checkMaxAltitude altitude: " + d2 + ", MAX_ALTITUDE: " + f2);
        }
        return z;
    }

    public static boolean c(double d2) {
        float f2 = f;
        boolean z = d2 - ((double) f2) < 1.0E-6d;
        if (!z) {
            cj4.d("ValidatorUtil", "checkMaxAltitudeSum altitude: " + d2 + ", MAX_ALTITUDE_SUM: " + f2);
        }
        return z;
    }

    public static boolean d(long j2) {
        int i = d;
        boolean z = j2 <= ((long) i) * v05.u() && j2 < 9999000;
        if (!z) {
            cj4.d("ValidatorUtil", "checkMaxCalorieSum calorieSum: " + j2 + ", MAX_CALORIE_SUM: " + (((long) i) * v05.u()));
        }
        return z;
    }

    public static boolean e(long j2) {
        int i = d;
        boolean z = j2 <= ((long) i);
        if (!z) {
            cj4.d("ValidatorUtil", "checkMaxCalories calories: " + j2 + ", MAX_CALORIE: " + i);
        }
        return z;
    }

    public static boolean f(long j2) {
        float f2 = j2;
        float f3 = b;
        boolean z = f2 <= f3;
        if (!z) {
            cj4.d("ValidatorUtil", "checkMaxDistance distance: " + j2 + ", MAX_DISTANCE: " + f3);
        }
        return z;
    }

    public static boolean g(long j2) {
        float f2 = j2;
        float f3 = b;
        boolean z = f2 <= ((float) v05.u()) * f3 && f2 < f17150c;
        if (!z) {
            cj4.d("ValidatorUtil", "checkMaxDistanceSum distanceSum: " + j2 + ", MAX_DISTANCE_SUM: " + (f3 * v05.u()));
        }
        return z;
    }

    public static boolean h(long j2) {
        int i = a;
        boolean z = j2 <= ((long) i);
        if (!z) {
            cj4.d("ValidatorUtil", "checkMaxStep step: " + j2 + ", MAX_STEP: " + i);
        }
        return z;
    }

    public static boolean i(long j2) {
        int i = a;
        boolean z = j2 <= ((long) i) * v05.u() && j2 < 99999;
        if (!z) {
            cj4.d("ValidatorUtil", "checkMaxStepSum stepSum: " + j2 + ", MAX_STEP_SUM: " + (((long) i) * v05.u()));
        }
        return z;
    }

    public static boolean j(SportDataDetail sportDataDetail) {
        boolean z;
        if (sportDataDetail.getSteps() > a) {
            qa2.trackReport.f("PointDataMerge", 1, 1);
            z = true;
        } else {
            z = false;
        }
        if (sportDataDetail.getWorkout() < 0 || sportDataDetail.getWorkout() > 1) {
            qa2.trackReport.f("PointDataMerge", 1, 2);
            z = true;
        }
        if (sportDataDetail.getStartTimestamp() <= tvi.START_TIME_ERROR_BORDER || sportDataDetail.getEndTimestamp() >= LocalDateTime.now().plusYears(1L).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()) {
            qa2.trackReport.f("PointDataMerge", 1, 3);
            z = true;
        }
        if (sportDataDetail.getSportMode() < -10 || sportDataDetail.getSportMode() > 1100) {
            qa2.trackReport.f("PointDataMerge", 1, 4);
            z = true;
        }
        return !z;
    }

    public static boolean k(int i) {
        return Arrays.asList(1001, 1004, 1016, 1012, 1008, 1010, 1017, 1014, Integer.valueOf(IONetService.Stub.TRANSACTION_unregisterContinuousSearch), Integer.valueOf(IONetService.Stub.TRANSACTION_getLocalFullAbility), 1024, 1032, Integer.valueOf(IONetService.Stub.TRANSACTION_registerContinuousSearch), Integer.valueOf(IONetService.Stub.TRANSACTION_isAccountLogin), Integer.valueOf(IONetService.Stub.TRANSACTION_removeSenselessConnectionCallback), Integer.valueOf(IONetService.Stub.TRANSACTION_setSenselessConnectionCallback), Integer.valueOf(IONetService.Stub.TRANSACTION_deInit), 1058, 1060, 1061, 1062, 1063, 1068, 1066, 1067, 1069, 1070, 1072, Integer.valueOf(DMProto$DMCmdId.CID_DM_SYNC_PHONE_KEEP_ALIVE_SMALL_VALUE), 1079, 1080, 1081, 1083).contains(Integer.valueOf(i));
    }

    public static boolean l(UserInfo userInfo) {
        boolean z;
        int i = Integer.parseInt(userInfo.getHeight());
        int i2 = Integer.parseInt(userInfo.getWeight());
        if (i < 0 || i > 2500) {
            qa2.trackReport.f("UserInfoMerge", 1, 1);
            z = true;
        } else {
            z = false;
        }
        if (i2 < 0 || i2 > 330000) {
            qa2.trackReport.f("UserInfoMerge", 1, 2);
            z = true;
        }
        if (userInfo.getModifiedTime() != 0 && (userInfo.getModifiedTime() <= tvi.START_TIME_ERROR_BORDER || userInfo.getModifiedTime() >= LocalDateTime.now().plusYears(1L).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli())) {
            qa2.trackReport.f("UserInfoMerge", 1, 3);
            z = true;
        }
        if (!TextUtils.isEmpty(userInfo.getAccountName())) {
            return z;
        }
        cj4.d("ValidatorUtil", "AN is null or empty");
        qa2.trackReport.f("UserInfoMerge", 1, 4);
        return true;
    }
}
