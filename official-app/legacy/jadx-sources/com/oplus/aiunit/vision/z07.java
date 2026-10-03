package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.oplus.drs.core.upload.executor.FailureScenarioClassifier;
import com.oplus.drs.core.upload.upload.ChannelType;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class z07 {
    public static final z07 DEFAULT = a();
    public final Map<ChannelType, Map<FailureScenarioClassifier.FailureScenario, int[]>> a;
    public final int b;

    public z07(Map<ChannelType, Map<FailureScenarioClassifier.FailureScenario, int[]>> map, int i) {
        this.a = map;
        this.b = i;
    }

    @NonNull
    public static z07 a() {
        EnumMap enumMap = new EnumMap(ChannelType.class);
        enumMap.put(ChannelType.REALTIME, d());
        enumMap.put(ChannelType.PSEUDO, c());
        enumMap.put(ChannelType.NON_REALTIME, b());
        return new z07(enumMap, 3);
    }

    @NonNull
    public static Map<FailureScenarioClassifier.FailureScenario, int[]> b() {
        EnumMap enumMap = new EnumMap(FailureScenarioClassifier.FailureScenario.class);
        enumMap.put(FailureScenarioClassifier.FailureScenario.TRANSIENT_CONNECTION_FAILURE, new int[]{0, 60, 120});
        enumMap.put(FailureScenarioClassifier.FailureScenario.CONNECTION_REFUSED, new int[]{60, 120, 240});
        enumMap.put(FailureScenarioClassifier.FailureScenario.GATEWAY_FAILURE, new int[]{0, 60, 120});
        enumMap.put(FailureScenarioClassifier.FailureScenario.DNS_TEMPORARY_FAILURE, new int[]{30, 60, 120});
        enumMap.put(FailureScenarioClassifier.FailureScenario.HOST_UNRESOLVABLE, new int[]{30, 60, 120});
        enumMap.put(FailureScenarioClassifier.FailureScenario.CERTIFICATE_INVALID, new int[]{30, 60, 120});
        enumMap.put(FailureScenarioClassifier.FailureScenario.UNKNOWN, new int[]{60, 120, 240});
        enumMap.put(FailureScenarioClassifier.FailureScenario.NO_NETWORK, new int[0]);
        enumMap.put(FailureScenarioClassifier.FailureScenario.PRECHECK_GATE_BLOCKED, new int[0]);
        enumMap.put(FailureScenarioClassifier.FailureScenario.APP_RATE_LIMITED, new int[]{180, 360, 720});
        enumMap.put(FailureScenarioClassifier.FailureScenario.SERVER_BACKOFF, new int[]{180, 360, 720});
        enumMap.put(FailureScenarioClassifier.FailureScenario.REQUEST_BUILD_FAILED, new int[0]);
        enumMap.put(FailureScenarioClassifier.FailureScenario.APP_DATA_INVALID, new int[0]);
        enumMap.put(FailureScenarioClassifier.FailureScenario.APP_ID_REJECTED, new int[0]);
        return enumMap;
    }

    @NonNull
    public static Map<FailureScenarioClassifier.FailureScenario, int[]> c() {
        EnumMap enumMap = new EnumMap(FailureScenarioClassifier.FailureScenario.class);
        enumMap.put(FailureScenarioClassifier.FailureScenario.TRANSIENT_CONNECTION_FAILURE, new int[]{0, 60, 120});
        enumMap.put(FailureScenarioClassifier.FailureScenario.CONNECTION_REFUSED, new int[]{60, 120, 240});
        enumMap.put(FailureScenarioClassifier.FailureScenario.GATEWAY_FAILURE, new int[]{0, 60, 120});
        enumMap.put(FailureScenarioClassifier.FailureScenario.DNS_TEMPORARY_FAILURE, new int[]{30, 60, 120});
        enumMap.put(FailureScenarioClassifier.FailureScenario.HOST_UNRESOLVABLE, new int[]{30, 60, 120});
        enumMap.put(FailureScenarioClassifier.FailureScenario.CERTIFICATE_INVALID, new int[]{30, 60, 120});
        enumMap.put(FailureScenarioClassifier.FailureScenario.UNKNOWN, new int[]{60, 120, 240});
        enumMap.put(FailureScenarioClassifier.FailureScenario.NO_NETWORK, new int[0]);
        enumMap.put(FailureScenarioClassifier.FailureScenario.PRECHECK_GATE_BLOCKED, new int[0]);
        enumMap.put(FailureScenarioClassifier.FailureScenario.APP_RATE_LIMITED, new int[]{60, 120, 240});
        enumMap.put(FailureScenarioClassifier.FailureScenario.SERVER_BACKOFF, new int[]{60, 120, 240});
        enumMap.put(FailureScenarioClassifier.FailureScenario.REQUEST_BUILD_FAILED, new int[0]);
        enumMap.put(FailureScenarioClassifier.FailureScenario.APP_DATA_INVALID, new int[0]);
        enumMap.put(FailureScenarioClassifier.FailureScenario.APP_ID_REJECTED, new int[0]);
        return enumMap;
    }

    @NonNull
    public static Map<FailureScenarioClassifier.FailureScenario, int[]> d() {
        EnumMap enumMap = new EnumMap(FailureScenarioClassifier.FailureScenario.class);
        enumMap.put(FailureScenarioClassifier.FailureScenario.TRANSIENT_CONNECTION_FAILURE, new int[]{0, 3, 10});
        enumMap.put(FailureScenarioClassifier.FailureScenario.CONNECTION_REFUSED, new int[]{3, 10, 20});
        enumMap.put(FailureScenarioClassifier.FailureScenario.GATEWAY_FAILURE, new int[]{0, 3, 10});
        enumMap.put(FailureScenarioClassifier.FailureScenario.DNS_TEMPORARY_FAILURE, new int[]{3, 10, 20});
        enumMap.put(FailureScenarioClassifier.FailureScenario.HOST_UNRESOLVABLE, new int[]{3, 10, 20});
        enumMap.put(FailureScenarioClassifier.FailureScenario.CERTIFICATE_INVALID, new int[]{3, 10, 20});
        enumMap.put(FailureScenarioClassifier.FailureScenario.UNKNOWN, new int[]{5, 15, 30});
        enumMap.put(FailureScenarioClassifier.FailureScenario.NO_NETWORK, new int[0]);
        enumMap.put(FailureScenarioClassifier.FailureScenario.PRECHECK_GATE_BLOCKED, new int[0]);
        enumMap.put(FailureScenarioClassifier.FailureScenario.APP_RATE_LIMITED, new int[]{5, 15, 45});
        enumMap.put(FailureScenarioClassifier.FailureScenario.SERVER_BACKOFF, new int[]{5, 15, 45});
        enumMap.put(FailureScenarioClassifier.FailureScenario.REQUEST_BUILD_FAILED, new int[0]);
        enumMap.put(FailureScenarioClassifier.FailureScenario.APP_DATA_INVALID, new int[0]);
        enumMap.put(FailureScenarioClassifier.FailureScenario.APP_ID_REJECTED, new int[0]);
        return enumMap;
    }

    @NonNull
    public static z07 e() {
        return DEFAULT;
    }

    public int f() {
        return this.b;
    }

    public long g(@NonNull ChannelType channelType, @NonNull FailureScenarioClassifier.FailureScenario failureScenario, int i) {
        return 28800000L;
    }

    public int h(@NonNull ChannelType channelType, @NonNull FailureScenarioClassifier.FailureScenario failureScenario) {
        return j(channelType, failureScenario).length;
    }

    public long i(@NonNull ChannelType channelType, @NonNull FailureScenarioClassifier.FailureScenario failureScenario, int i, long j2) {
        if (j2 > 0) {
            return j2;
        }
        int[] iArrJ = j(channelType, failureScenario);
        if (i < 0 || i >= iArrJ.length) {
            return 0L;
        }
        return ((long) iArrJ[i]) * 1000;
    }

    @NonNull
    public int[] j(@NonNull ChannelType channelType, @NonNull FailureScenarioClassifier.FailureScenario failureScenario) {
        Map<FailureScenarioClassifier.FailureScenario, int[]> map = this.a.get(channelType);
        if (map == null) {
            throw new IllegalStateException("No retry schedule config for channelType=" + channelType);
        }
        int[] iArr = map.get(failureScenario);
        if (iArr == null) {
            iArr = map.get(FailureScenarioClassifier.FailureScenario.UNKNOWN);
        }
        if (iArr != null) {
            return iArr;
        }
        throw new IllegalStateException("No UNKNOWN retry schedule for channelType=" + channelType);
    }
}
