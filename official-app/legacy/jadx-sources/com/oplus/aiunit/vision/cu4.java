package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.ECGRecord;
import com.heytap.databaseengine.model.HeartRate;
import com.heytap.databaseengine.model.HeartRateDataStat;
import com.heytap.databaseengine.model.OneTimeSportStat;
import com.heytap.databaseengine.model.Sleep;
import com.heytap.databaseengine.model.SportDataDetail;
import com.heytap.databaseengine.model.SportDataStat;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengine.model.SportRecord;
import com.heytap.databaseengine.model.bloodoxygensaturation.BloodOxygenSaturation;
import com.heytap.databaseengine.model.proxy.BloodOxygenSaturationProxy;
import com.heytap.databaseengine.model.proxy.ECGRecordProxy;
import com.heytap.databaseengine.model.proxy.HeartRateDataStatProxy;
import com.heytap.databaseengine.model.proxy.HeartRateProxy;
import com.heytap.databaseengine.model.proxy.OneTimeSportStatProxy;
import com.heytap.databaseengine.model.proxy.SleepProxy;
import com.heytap.databaseengine.model.proxy.SportDataDetailProxy;
import com.heytap.databaseengine.model.proxy.SportDataStatProxy;
import com.heytap.databaseengine.model.proxy.SportDataStatProxyV2;
import com.heytap.databaseengine.model.proxy.SportRecordProxy;
import com.heytap.databaseengine.model.proxy.StressProxy;
import com.heytap.databaseengine.model.proxy.WeightBodyFatProxy;
import com.heytap.databaseengine.model.stress.Stress;
import com.heytap.databaseengine.model.weight.WeightBodyFat;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes15.dex */
public class cu4 {
    public static int version;

    public static int l(int i) {
        if (1 <= i && i <= 3) {
            return i;
        }
        if ((5 <= i && i <= 10) || i == 12 || i == 19) {
            return i;
        }
        if (31 > i || i > 37) {
            return 0;
        }
        return i;
    }

    public static /* synthetic */ SportDataDetailProxy m(SportHealthData sportHealthData) {
        return new SportDataDetailProxy((SportDataDetail) sportHealthData);
    }

    public static /* synthetic */ SportDataStatProxy n(SportHealthData sportHealthData) {
        return version <= 1000800 ? new SportDataStatProxy((SportDataStat) sportHealthData) : new SportDataStatProxyV2((SportDataStat) sportHealthData);
    }

    public static /* synthetic */ WeightBodyFatProxy o(SportHealthData sportHealthData) {
        return new WeightBodyFatProxy((WeightBodyFat) sportHealthData);
    }

    public static /* synthetic */ SportRecordProxy p(SportHealthData sportHealthData) {
        return new SportRecordProxy((SportRecord) sportHealthData);
    }

    public static /* synthetic */ OneTimeSportStatProxy q(SportHealthData sportHealthData) {
        return new OneTimeSportStatProxy((OneTimeSportStat) sportHealthData);
    }

    public static /* synthetic */ HeartRateProxy r(SportHealthData sportHealthData) {
        return new HeartRateProxy((HeartRate) sportHealthData);
    }

    public static /* synthetic */ HeartRateDataStatProxy s(SportHealthData sportHealthData) {
        return new HeartRateDataStatProxy((HeartRateDataStat) sportHealthData);
    }

    public static /* synthetic */ SleepProxy t(SportHealthData sportHealthData) {
        return new SleepProxy((Sleep) sportHealthData);
    }

    public static /* synthetic */ ECGRecordProxy u(SportHealthData sportHealthData) {
        return new ECGRecordProxy((ECGRecord) sportHealthData);
    }

    public static /* synthetic */ BloodOxygenSaturationProxy v(SportHealthData sportHealthData) {
        return new BloodOxygenSaturationProxy((BloodOxygenSaturation) sportHealthData);
    }

    public static /* synthetic */ StressProxy w(SportHealthData sportHealthData) {
        return new StressProxy((Stress) sportHealthData);
    }

    public static List<SportHealthData> x(List<SportHealthData> list, int i) {
        me8.e("DataParseUtil", "type:" + i);
        if (i == 1005) {
            return (List) list.stream().map(new Function() { // from class: com.oplus.aiunit.vision.wt4
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return cu4.q((SportHealthData) obj);
                }
            }).collect(Collectors.toList());
        }
        if (i == 1012) {
            return (List) list.stream().map(new Function() { // from class: com.oplus.aiunit.vision.au4
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return cu4.u((SportHealthData) obj);
                }
            }).collect(Collectors.toList());
        }
        if (i == 1014) {
            return (List) list.stream().map(new Function() { // from class: com.oplus.aiunit.vision.bu4
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return cu4.v((SportHealthData) obj);
                }
            }).collect(Collectors.toList());
        }
        if (i == 1017) {
            return (List) list.stream().map(new Function() { // from class: com.oplus.aiunit.vision.st4
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return cu4.w((SportHealthData) obj);
                }
            }).collect(Collectors.toList());
        }
        if (i == 1021) {
            return (List) list.stream().map(new Function() { // from class: com.oplus.aiunit.vision.tt4
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return cu4.o((SportHealthData) obj);
                }
            }).collect(Collectors.toList());
        }
        switch (i) {
            case 1001:
                return (List) list.stream().map(new Function() { // from class: com.oplus.aiunit.vision.rt4
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return cu4.m((SportHealthData) obj);
                    }
                }).collect(Collectors.toList());
            case 1002:
                return (List) list.stream().map(new Function() { // from class: com.oplus.aiunit.vision.ut4
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return cu4.n((SportHealthData) obj);
                    }
                }).collect(Collectors.toList());
            case 1003:
                return (List) list.stream().map(new Function() { // from class: com.oplus.aiunit.vision.vt4
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return cu4.p((SportHealthData) obj);
                    }
                }).collect(Collectors.toList());
            default:
                switch (i) {
                    case 1008:
                        return (List) list.stream().map(new Function() { // from class: com.oplus.aiunit.vision.xt4
                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return cu4.r((SportHealthData) obj);
                            }
                        }).collect(Collectors.toList());
                    case 1009:
                        return (List) list.stream().map(new Function() { // from class: com.oplus.aiunit.vision.yt4
                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return cu4.s((SportHealthData) obj);
                            }
                        }).collect(Collectors.toList());
                    case 1010:
                        return (List) list.stream().map(new Function() { // from class: com.oplus.aiunit.vision.zt4
                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return cu4.t((SportHealthData) obj);
                            }
                        }).collect(Collectors.toList());
                    default:
                        return new ArrayList();
                }
        }
    }
}
