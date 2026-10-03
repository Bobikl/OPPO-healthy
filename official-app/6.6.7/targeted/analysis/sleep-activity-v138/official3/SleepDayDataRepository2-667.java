package com.heytap.health.sleep.day.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.HealthOriginData;
import com.heytap.databaseengine.model.HeartRate;
import com.heytap.databaseengine.model.Sleep;
import com.heytap.databaseengine.model.SleepDataStat;
import com.heytap.databaseengine.model.SleepIndex;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.bloodoxygensaturation.BloodOxygenSaturation;
import com.heytap.databaseengine.model.newsleep.SleepAdvice;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalStat;
import com.heytap.databaseengine.model.snore.HrvData;
import com.heytap.databaseengine.model.snore.OsaResultBean;
import com.heytap.databaseengine.model.snore.SensorOsaData;
import com.heytap.databaseengine.model.snore.SnoreFeature;
import com.heytap.databaseengine.model.snore.SnoreOsaModel;
import com.heytap.databaseengine.model.snore.SnoreOsaSummarize;
import com.heytap.databaseengine.option.DataInsertOption;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.databaseengine.option.DataReadOptionV2;
import com.heytap.health.sleep.day.model.SleepDayDataRepository2;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.ddd;
import com.oplus.aiunit.vision.g14;
import com.oplus.aiunit.vision.g18;
import com.oplus.aiunit.vision.geh;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.neh;
import com.oplus.aiunit.vision.onh;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.vd8;
import com.oplus.onet.IONetService;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 D2\u00020\u0001:\u00015B\u0007¢\u0006\u0004\bB\u0010CJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\"\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ.\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\"\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\"\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000b0\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\"\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000b0\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ.\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000b0\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\"\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u000b0\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\"\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u000b0\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ.\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u000b0\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ.\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u000b0\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ.\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u000b0\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\"\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u000b0\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\"\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u000b0\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\"\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u000b0\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\"\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010-\u001a\u00020\u0016J\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u000bJ\u0012\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000b0\u0002J\"\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u000b0\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bR\"\u0010;\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001b\u0010A\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006E"}, d2 = {"Lcom/heytap/health/sleep/day/model/SleepDayDataRepository2;", "", "Lcom/oplus/aiunit/vision/ddd;", "Lcom/heytap/databaseengine/model/UserInfo;", "C0", "", "isFromFamily", "D0", "", "startTime", "endTime", "", "Lcom/heytap/databaseengine/model/Sleep;", "l0", "", g14.DEVICE_UNIQUE_ID, "m0", "i0", "Lcom/oplus/aiunit/vision/geh;", "Q", "Lcom/heytap/databaseengine/model/SleepDataStat;", "s0", "Lcom/heytap/databaseengine/model/snore/OsaResultBean;", "f0", "Lcom/heytap/databaseengine/model/bloodoxygensaturation/BloodOxygenSaturation;", "z0", "Lcom/heytap/databaseengine/model/SleepIndex;", "v0", "Lcom/heytap/databaseengine/model/newsleep/SleepAdvice;", "p0", "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;", ExifInterface.LONGITUDE_WEST, "Lcom/heytap/databaseengine/model/HealthOriginData;", "X0", "Lcom/heytap/databaseengine/model/snore/HrvData;", "H0", "Lcom/heytap/databaseengine/model/snore/SensorOsaData;", "K0", "Lcom/heytap/databaseengine/model/snore/SnoreFeature;", "O0", "Lcom/heytap/databaseengine/model/snore/SnoreOsaModel;", "R0", "Lcom/heytap/databaseengine/model/snore/SnoreOsaSummarize;", "U0", "c0", "osaResultBean", "a1", "Lcom/heytap/databaseengine/model/SportHealthData;", "spo2DataList", "d1", "Z", "Lcom/heytap/databaseengine/model/HeartRate;", ExifInterface.GPS_DIRECTION_TRUE, "a", "Ljava/lang/String;", "G0", "()Ljava/lang/String;", "g1", "(Ljava/lang/String;)V", "mSsoId", "Lcom/oplus/aiunit/vision/neh;", "b", "Lkotlin/Lazy;", "N0", "()Lcom/oplus/aiunit/vision/neh;", "sleepCalibrationTransform", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class SleepDayDataRepository2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String mSsoId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy sleepCalibrationTransform;
    public static final int $stable = 8;

    public SleepDayDataRepository2() {
        String ssoid = cn.c().getSsoid();
        Intrinsics.checkNotNullExpressionValue(ssoid, "getAccountManager().getSsoid()");
        this.mSsoId = ssoid;
        this.sleepCalibrationTransform = LazyKt__LazyJVMKt.lazy(new Function0<neh>() { // from class: com.heytap.health.sleep.day.model.SleepDayDataRepository2$sleepCalibrationTransform$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final neh invoke() {
                return new neh();
            }
        });
    }

    public static final List A0(CommonBackBean commonBackBean) {
        List arrayList;
        Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
        if (commonBackBean.getErrorCode() != 0 || commonBackBean.getObj() == null) {
            arrayList = new ArrayList();
        } else {
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.heytap.databaseengine.model.bloodoxygensaturation.BloodOxygenSaturation>");
            arrayList = TypeIntrinsics.asMutableList(obj);
        }
        m8b.f("SleepDayRes2", "fetchSpo2List size:" + arrayList.size() + ", code:" + commonBackBean.getErrorCode());
        return arrayList;
    }

    public static final List B0(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m8b.f("SleepDayRes2", "fetchSpo2List error:" + throwable.getMessage());
        return new ArrayList();
    }

    public static final UserInfo E0(CommonBackBean commonBackBean) {
        Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
        UserInfo userInfo = new UserInfo();
        if (commonBackBean.getErrorCode() != 0 || commonBackBean.getObj() == null) {
            return userInfo;
        }
        Object obj = commonBackBean.getObj();
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.heytap.databaseengine.model.UserInfo>");
        return (UserInfo) TypeIntrinsics.asMutableList(obj).get(0);
    }

    public static final UserInfo F0(Throwable th) {
        return new UserInfo();
    }

    public static final List I0(CommonBackBean commonBackBean) {
        List arrayList;
        Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
        if (commonBackBean.getErrorCode() != 0 || commonBackBean.getObj() == null) {
            arrayList = new ArrayList();
        } else {
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.heytap.databaseengine.model.snore.HrvData>");
            arrayList = TypeIntrinsics.asMutableList(obj);
        }
        m8b.f("SleepDayRes2", "getOldHrvData size:" + arrayList.size() + ", code:" + commonBackBean.getErrorCode());
        return arrayList;
    }

    public static final List J0(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m8b.f("SleepDayRes2", "getOldHrvData error:" + throwable.getMessage());
        return new ArrayList();
    }

    public static final List L0(CommonBackBean commonBackBean) {
        List arrayList;
        Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
        if (commonBackBean.getErrorCode() != 0 || commonBackBean.getObj() == null) {
            arrayList = new ArrayList();
        } else {
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.heytap.databaseengine.model.snore.SensorOsaData>");
            arrayList = TypeIntrinsics.asMutableList(obj);
        }
        m8b.f("SleepDayRes2", "getSensorOsaData size:" + arrayList.size() + ", code:" + commonBackBean.getErrorCode());
        return arrayList;
    }

    public static final List M0(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m8b.f("SleepDayRes2", "getSensorOsaData error:" + throwable.getMessage());
        return new ArrayList();
    }

    public static final List P0(CommonBackBean commonBackBean) {
        List arrayList;
        Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
        if (commonBackBean.getErrorCode() != 0 || commonBackBean.getObj() == null) {
            arrayList = new ArrayList();
        } else {
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.heytap.databaseengine.model.snore.SnoreFeature>");
            arrayList = TypeIntrinsics.asMutableList(obj);
        }
        m8b.f("SleepDayRes2", "getSnoreFeature size:" + arrayList.size() + ", code:" + commonBackBean.getErrorCode());
        return arrayList;
    }

    public static final List Q0(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m8b.f("SleepDayRes2", "getSnoreFeature error:" + throwable.getMessage());
        return new ArrayList();
    }

    public static final geh R(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m8b.f("SleepDayRes2", "fetchCalibrationData error:" + throwable.getMessage());
        return new geh();
    }

    public static final geh S(SleepDayDataRepository2 this$0, long j2, long j3, CommonBackBean commonBackBean) {
        List<SleepDataStat> arrayList;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
        if (commonBackBean.getErrorCode() != 0 || commonBackBean.getObj() == null) {
            arrayList = new ArrayList<>();
        } else {
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.heytap.databaseengine.model.SleepDataStat>");
            arrayList = TypeIntrinsics.asMutableList(obj);
        }
        List<SleepDataStat> list = arrayList;
        m8b.f("SleepDayRes2", "fetchCalibrationData size:" + list.size() + ", code:" + commonBackBean.getErrorCode());
        return this$0.N0().c(j2, j3, list);
    }

    public static final List S0(CommonBackBean commonBackBean) {
        List arrayList;
        Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
        if (commonBackBean.getErrorCode() != 0 || commonBackBean.getObj() == null) {
            arrayList = new ArrayList();
        } else {
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.heytap.databaseengine.model.snore.SnoreOsaModel>");
            arrayList = TypeIntrinsics.asMutableList(obj);
        }
        m8b.f("SleepDayRes2", "getSnoreOsaModelList size:" + arrayList.size() + ", code:" + commonBackBean.getErrorCode());
        return arrayList;
    }

    public static final List T0(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m8b.f("SleepDayRes2", "getSnoreOsaModelList error:" + throwable.getMessage());
        return new ArrayList();
    }

    public static final List U(CommonBackBean commonBackBean) {
        List arrayList;
        Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
        if (commonBackBean.getErrorCode() != 0 || commonBackBean.getObj() == null) {
            arrayList = new ArrayList();
        } else {
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.heytap.databaseengine.model.HeartRate>");
            arrayList = TypeIntrinsics.asMutableList(obj);
        }
        m8b.f("SleepDayRes2", "fetchHeartRateLineData size:" + arrayList.size() + ", code:" + commonBackBean.getErrorCode());
        return arrayList;
    }

    public static final List V(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m8b.f("SleepDayRes2", "fetchHeartRateLineData error:" + throwable.getMessage());
        return new ArrayList();
    }

    public static final List V0(CommonBackBean commonBackBean) {
        List arrayList;
        Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
        if (commonBackBean.getErrorCode() != 0 || commonBackBean.getObj() == null) {
            arrayList = new ArrayList();
        } else {
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.heytap.databaseengine.model.snore.SnoreOsaSummarize>");
            arrayList = TypeIntrinsics.asMutableList(obj);
        }
        m8b.f("SleepDayRes2", "getSnoreOsaSummarizeList size:" + arrayList.size() + ", code:" + commonBackBean.getErrorCode());
        return arrayList;
    }

    public static final List W0(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m8b.f("SleepDayRes2", "getSnoreOsaSummarizeList error:" + throwable.getMessage());
        return new ArrayList();
    }

    public static final List X(CommonBackBean commonBackBean) {
        List arrayList;
        Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
        if (commonBackBean.getErrorCode() != 0 || commonBackBean.getObj() == null) {
            arrayList = new ArrayList();
        } else {
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.heytap.databaseengine.model.physicalMental.PhysicalMentalStat>");
            arrayList = TypeIntrinsics.asMutableList(obj);
        }
        m8b.f("SleepDayRes2", "fetchHrvStatList size:" + arrayList.size() + ", code:" + commonBackBean.getErrorCode());
        return arrayList;
    }

    public static final List Y(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m8b.f("SleepDayRes2", "fetchHrvStatList error:" + throwable.getMessage());
        return new ArrayList();
    }

    public static final List Y0(CommonBackBean commonBackBean) {
        List arrayList;
        Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
        if (commonBackBean.getErrorCode() != 0 || commonBackBean.getObj() == null) {
            arrayList = new ArrayList();
        } else {
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.heytap.databaseengine.model.HealthOriginData>");
            arrayList = TypeIntrinsics.asMutableList(obj);
        }
        m8b.f("SleepDayRes2", "queryOriginalSpo2Data size:" + arrayList.size() + ", code:" + commonBackBean.getErrorCode());
        return arrayList;
    }

    public static final List Z0(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m8b.f("SleepDayRes2", "queryOriginalSpo2Data error:" + throwable.getMessage());
        return new ArrayList();
    }

    public static final List a0(CommonBackBean commonBackBean) {
        List arrayList;
        Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
        if (commonBackBean.getErrorCode() != 0 || commonBackBean.getObj() == null) {
            arrayList = new ArrayList();
        } else {
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.heytap.databaseengine.model.SleepDataStat>");
            arrayList = TypeIntrinsics.asMutableList(obj);
        }
        m8b.f("SleepDayRes2", "fetchLastStatData size:" + arrayList.size() + ", code:" + commonBackBean.getErrorCode());
        return arrayList;
    }

    public static final List b0(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m8b.f("SleepDayRes2", "fetchLastStatData error:" + throwable.getMessage());
        return new ArrayList();
    }

    public static final Boolean b1(CommonBackBean commonBackBean) {
        Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
        return Boolean.valueOf(commonBackBean.getErrorCode() == 0);
    }

    public static final Boolean c1(Throwable th) {
        return Boolean.FALSE;
    }

    public static final List d0(CommonBackBean commonBackBean) {
        List arrayList;
        Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
        if (commonBackBean.getErrorCode() != 0 || commonBackBean.getObj() == null) {
            arrayList = new ArrayList();
        } else {
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.heytap.databaseengine.model.snore.OsaResultBean>");
            arrayList = TypeIntrinsics.asMutableList(obj);
        }
        m8b.f("SleepDayRes2", "fetchOsaLevels size:" + arrayList.size() + ", code:" + commonBackBean.getErrorCode());
        return arrayList;
    }

    public static final List e0(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m8b.f("SleepDayRes2", "fetchOsaLevels error:" + throwable.getMessage());
        return new ArrayList();
    }

    public static final Boolean e1(CommonBackBean commonBackBean) {
        Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
        m8b.f("SleepDayRes2", "saveSnoreSpo2DataList code:" + commonBackBean.getErrorCode());
        return Boolean.valueOf(commonBackBean.getErrorCode() == 0);
    }

    public static final Boolean f1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m8b.f("SleepDayRes2", "saveSnoreSpo2DataList error:" + throwable.getMessage());
        return Boolean.FALSE;
    }

    public static final List g0(CommonBackBean commonBackBean) {
        List arrayList;
        Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
        if (commonBackBean.getErrorCode() != 0 || commonBackBean.getObj() == null) {
            arrayList = new ArrayList();
        } else {
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.heytap.databaseengine.model.snore.OsaResultBean>");
            arrayList = TypeIntrinsics.asMutableList(obj);
        }
        m8b.f("SleepDayRes2", "fetchOsaResultList size:" + arrayList.size() + ", code:" + commonBackBean.getErrorCode());
        return arrayList;
    }

    public static final List h0(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m8b.f("SleepDayRes2", "fetchOsaResultList error:" + throwable.getMessage());
        return new ArrayList();
    }

    public static final List j0(CommonBackBean commonBackBean) {
        List arrayList;
        Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
        if (commonBackBean.getErrorCode() != 0 || commonBackBean.getObj() == null) {
            arrayList = new ArrayList();
        } else {
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.heytap.databaseengine.model.Sleep>");
            arrayList = TypeIntrinsics.asMutableList(obj);
        }
        m8b.f("SleepDayRes2", "fetchPhoneSleep size:" + arrayList.size() + ", code:" + commonBackBean.getErrorCode());
        return arrayList;
    }

    public static final List k0(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m8b.f("SleepDayRes2", "fetchPhoneSleep error:" + throwable.getMessage());
        return new ArrayList();
    }

    public static final List n0(CommonBackBean commonBackBean) {
        List arrayList;
        Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
        if (commonBackBean.getErrorCode() != 0 || commonBackBean.getObj() == null) {
            arrayList = new ArrayList();
        } else {
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.heytap.databaseengine.model.Sleep>");
            arrayList = TypeIntrinsics.asMutableList(obj);
        }
        m8b.f("SleepDayRes2", "fetchSleep size:" + arrayList.size() + ", code:" + commonBackBean.getErrorCode());
        return arrayList;
    }

    public static final List o0(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m8b.f("SleepDayRes2", "fetchSleep error:" + throwable.getMessage());
        return new ArrayList();
    }

    public static final List q0(CommonBackBean commonBackBean) {
        List arrayList;
        Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
        if (commonBackBean.getErrorCode() != 0 || commonBackBean.getObj() == null) {
            arrayList = new ArrayList();
        } else {
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.heytap.databaseengine.model.newsleep.SleepAdvice>");
            arrayList = TypeIntrinsics.asMutableList(obj);
        }
        m8b.f("SleepDayRes2", "fetchSleepAdviceList size:" + arrayList.size() + ", code:" + commonBackBean.getErrorCode());
        return arrayList;
    }

    public static final List r0(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m8b.f("SleepDayRes2", "fetchSleepAdviceList error:" + throwable.getMessage());
        return new ArrayList();
    }

    public static final List t0(CommonBackBean commonBackBean) {
        List arrayList;
        Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
        if (commonBackBean.getErrorCode() != 0 || commonBackBean.getObj() == null) {
            arrayList = new ArrayList();
        } else {
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.heytap.databaseengine.model.SleepDataStat>");
            arrayList = TypeIntrinsics.asMutableList(obj);
        }
        m8b.f("SleepDayRes2", "fetchSleepDataStatList size:" + arrayList.size() + ", code:" + commonBackBean.getErrorCode());
        return arrayList;
    }

    public static final List u0(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m8b.f("SleepDayRes2", "fetchSleepDataStatList error:" + throwable.getMessage());
        return new ArrayList();
    }

    public static /* synthetic */ ddd w0(SleepDayDataRepository2 sleepDayDataRepository2, long j2, long j3, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return sleepDayDataRepository2.v0(j2, j3, str);
    }

    public static final List x0(CommonBackBean commonBackBean) {
        List<? extends SleepIndex> arrayList;
        Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
        if (commonBackBean.getErrorCode() != 0 || commonBackBean.getObj() == null) {
            arrayList = new ArrayList<>();
        } else {
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.heytap.databaseengine.model.SleepIndex>");
            arrayList = TypeIntrinsics.asMutableList(obj);
        }
        m8b.f("SleepDayRes2", "fetchSleepIndexList size:" + arrayList.size() + ", code:" + commonBackBean.getErrorCode());
        return new onh().c(arrayList);
    }

    public static final List y0(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m8b.f("SleepDayRes2", "fetchSleepIndexList error:" + throwable.getMessage());
        return new ArrayList();
    }

    @NotNull
    public final ddd<UserInfo> C0() {
        return D0(false);
    }

    @NotNull
    public final ddd<UserInfo> D0(boolean isFromFamily) {
        if (isFromFamily) {
            ddd<UserInfo> dddVarH0 = ddd.h0(new UserInfo());
            Intrinsics.checkNotNullExpressionValue(dddVarH0, "just<UserInfo>(UserInfo())");
            return dddVarH0;
        }
        ddd<UserInfo> dddVarT0 = SportHealthDataAPI.getInstance().getUserInfo(this.mSsoId).j0(new g18() { // from class: com.oplus.aiunit.vision.rhh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.E0((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.shh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.F0((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(dddVarT0, "getInstance()\n          …rowable? -> UserInfo() })");
        return dddVarT0;
    }

    @NotNull
    /* JADX INFO: renamed from: G0, reason: from getter */
    public final String getMSsoId() {
        return this.mSsoId;
    }

    @NotNull
    public final ddd<List<HrvData>> H0(long startTime, long endTime, @Nullable String deviceUniqueId) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.mSsoId);
        dataReadOption.setStartTime(startTime);
        dataReadOption.setEndTime(endTime);
        dataReadOption.setSortOrder(0);
        dataReadOption.setDataTable(1032);
        pr8 pr8Var = pr8.INSTANCE;
        if (pr8Var.e(endTime) >= pr8Var.e(System.currentTimeMillis())) {
            dataReadOption.setIsParse(2);
        }
        if (deviceUniqueId != null) {
            dataReadOption.setDeviceUniqueId(deviceUniqueId);
        }
        ddd<List<HrvData>> dddVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.chh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.I0((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.dhh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.J0((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(dddVarT0, "getInstance()\n          …HrvData>()\n            })");
        return dddVarT0;
    }

    @NotNull
    public final ddd<List<SensorOsaData>> K0(long startTime, long endTime, @Nullable String deviceUniqueId) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.mSsoId);
        dataReadOption.setStartTime(startTime);
        dataReadOption.setEndTime(endTime);
        dataReadOption.setSortOrder(0);
        dataReadOption.setDataTable(IONetService.Stub.TRANSACTION_getQrCodeMessage);
        if (deviceUniqueId != null) {
            dataReadOption.setDeviceUniqueId(deviceUniqueId);
        }
        ddd<List<SensorOsaData>> dddVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.thh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.L0((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.uhh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.M0((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(dddVarT0, "getInstance()\n          …OsaData>()\n            })");
        return dddVarT0;
    }

    public final neh N0() {
        return (neh) this.sleepCalibrationTransform.getValue();
    }

    @NotNull
    public final ddd<List<SnoreFeature>> O0(long startTime, long endTime) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.mSsoId);
        dataReadOption.setStartTime(startTime);
        dataReadOption.setEndTime(endTime);
        dataReadOption.setSortOrder(0);
        dataReadOption.setDataTable(IONetService.Stub.TRANSACTION_resetConnection);
        ddd<List<SnoreFeature>> dddVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.ihh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.P0((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.jhh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.Q0((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(dddVarT0, "getInstance()\n          …Feature>()\n            })");
        return dddVarT0;
    }

    @NotNull
    public final ddd<geh> Q(final long startTime, final long endTime) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.mSsoId);
        dataReadOption.setStartTime(startTime);
        dataReadOption.setEndTime(endTime);
        dataReadOption.setDataTable(1011);
        dataReadOption.setGroupUnitType(4);
        ddd<geh> dddVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.cih
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.S(this.i, startTime, endTime, (CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.dih
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.R((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(dddVarT0, "getInstance()\n          …tionBean()\n            })");
        return dddVarT0;
    }

    @NotNull
    public final ddd<List<SnoreOsaModel>> R0(long startTime, long endTime) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.mSsoId);
        dataReadOption.setStartTime(startTime);
        dataReadOption.setEndTime(endTime);
        dataReadOption.setSortOrder(0);
        dataReadOption.setDataTable(1066);
        dataReadOption.setGroupUnitType(4);
        ddd<List<SnoreOsaModel>> dddVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.eih
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.S0((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.fih
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.T0((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(dddVarT0, "getInstance()\n          …saModel>()\n            })");
        return dddVarT0;
    }

    @NotNull
    public final ddd<List<HeartRate>> T(long startTime, long endTime) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.mSsoId);
        dataReadOption.setStartTime(startTime);
        dataReadOption.setEndTime(endTime);
        dataReadOption.setSortOrder(0);
        dataReadOption.setDataTable(1008);
        pr8 pr8Var = pr8.INSTANCE;
        if (pr8Var.e(endTime) >= pr8Var.e(System.currentTimeMillis())) {
            dataReadOption.setIsParse(2);
        }
        ddd<List<HeartRate>> dddVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.vhh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.U((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.whh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.V((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(dddVarT0, "getInstance()\n          …artRate>()\n            })");
        return dddVarT0;
    }

    @NotNull
    public final ddd<List<SnoreOsaSummarize>> U0(long startTime, long endTime) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.mSsoId);
        dataReadOption.setStartTime(startTime);
        dataReadOption.setEndTime(endTime);
        dataReadOption.setSortOrder(0);
        dataReadOption.setDataTable(1067);
        dataReadOption.setGroupUnitType(4);
        ddd<List<SnoreOsaSummarize>> dddVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.tgh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.V0((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.ugh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.W0((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(dddVarT0, "getInstance()\n          …mmarize>()\n            })");
        return dddVarT0;
    }

    @NotNull
    public final ddd<List<PhysicalMentalStat>> W(long startTime, long endTime) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.mSsoId);
        dataReadOption.setStartTime(startTime);
        dataReadOption.setEndTime(endTime);
        dataReadOption.setSortOrder(0);
        dataReadOption.setDataTable(1074);
        dataReadOption.setGroupUnitType(4);
        pr8 pr8Var = pr8.INSTANCE;
        if (pr8Var.e(endTime) >= pr8Var.e(System.currentTimeMillis())) {
            dataReadOption.setIsParse(2);
        }
        ddd<List<PhysicalMentalStat>> dddVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.qgh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.X((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.bhh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.Y((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(dddVarT0, "getInstance()\n          …talStat>()\n            })");
        return dddVarT0;
    }

    @NotNull
    public final ddd<List<HealthOriginData>> X0(long startTime, long endTime, @Nullable String deviceUniqueId) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.mSsoId);
        dataReadOption.setStartTime(startTime);
        dataReadOption.setEndTime(endTime);
        dataReadOption.setSortOrder(0);
        dataReadOption.setDataTable(1016);
        dataReadOption.setReadHealthDataType(1);
        if (deviceUniqueId != null) {
            dataReadOption.setDeviceUniqueId(deviceUniqueId);
        }
        ddd<List<HealthOriginData>> dddVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.vgh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.Y0((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.wgh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.Z0((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(dddVarT0, "getInstance()\n          …ginData>()\n            })");
        return dddVarT0;
    }

    @NotNull
    public final ddd<List<SleepDataStat>> Z() {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.mSsoId);
        dataReadOption.setStartTime(1546272000000L);
        dataReadOption.setEndTime(pr8.INSTANCE.n(System.currentTimeMillis()));
        dataReadOption.setCount(1);
        dataReadOption.setSortOrder(1);
        dataReadOption.setDataTable(1011);
        dataReadOption.setGroupUnitType(4);
        ddd<List<SleepDataStat>> dddVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.zgh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.a0((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.ahh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.b0((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(dddVarT0, "getInstance()\n          …leListOf()\n            })");
        return dddVarT0;
    }

    @NotNull
    public final ddd<Boolean> a1(@NotNull OsaResultBean osaResultBean) {
        Intrinsics.checkNotNullParameter(osaResultBean, "osaResultBean");
        m8b.f("SleepDayRes2", "saveSnoreOsaResult");
        if (osaResultBean.getSnoreResultBean().getSnoreDbBuff() != null) {
            m8b.f("SleepDayRes2", "snoreDbBuffer size =:" + osaResultBean.getSnoreResultBean().getSnoreDbBuff().size() + " ");
            m8b.f("SleepDayRes2", "snoreDbBuffer length =:" + osaResultBean.getSnoreResultBean().getSnoreDbBuffLen() + " ");
        }
        m8b.f("SleepDayRes2", "recordTimeInterval:" + vd8.g(osaResultBean.getRecordTimeInterval()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(osaResultBean);
        DataInsertOption dataInsertOption = new DataInsertOption();
        dataInsertOption.setDatas(arrayList);
        dataInsertOption.setDataTable(1030);
        ddd<Boolean> dddVarT0 = SportHealthDataAPI.getInstance().insertSportHealthData(dataInsertOption).j0(new g18() { // from class: com.oplus.aiunit.vision.nhh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.b1((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.ohh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.c1((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(dddVarT0, "getInstance()\n          …e: Throwable? -> false })");
        return dddVarT0;
    }

    @NotNull
    public final ddd<List<OsaResultBean>> c0(long startTime, long endTime) {
        DataReadOptionV2 dataReadOptionV2 = new DataReadOptionV2();
        dataReadOptionV2.setSsoid(this.mSsoId);
        dataReadOptionV2.setStartTime(startTime);
        dataReadOptionV2.setEndTime(endTime);
        dataReadOptionV2.setSortOrder(0);
        dataReadOptionV2.setDataTable(1030);
        dataReadOptionV2.setDataReadType("osa_level");
        dataReadOptionV2.setGroupUnitType(4);
        ddd<List<OsaResultBean>> dddVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOptionV2).j0(new g18() { // from class: com.oplus.aiunit.vision.mhh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.d0((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.xhh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.e0((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(dddVarT0, "getInstance()\n          …ultBean>()\n            })");
        return dddVarT0;
    }

    @NotNull
    public final ddd<Boolean> d1(@NotNull List<SportHealthData> spo2DataList) {
        Intrinsics.checkNotNullParameter(spo2DataList, "spo2DataList");
        m8b.f("SleepDayRes2", "saveSnoreSpo2DataList spo2DataList size:" + spo2DataList.size());
        DataInsertOption dataInsertOption = new DataInsertOption();
        dataInsertOption.setDataTable(1014);
        dataInsertOption.setDatas(spo2DataList);
        ddd<Boolean> dddVarT0 = SportHealthDataAPI.getInstance().insertSportHealthData(dataInsertOption).j0(new g18() { // from class: com.oplus.aiunit.vision.xgh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.e1((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.ygh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.f1((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(dddVarT0, "getInstance()\n          …     false\n            })");
        return dddVarT0;
    }

    @NotNull
    public final ddd<List<OsaResultBean>> f0(long startTime, long endTime) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.mSsoId);
        dataReadOption.setStartTime(startTime);
        dataReadOption.setEndTime(endTime);
        dataReadOption.setSortOrder(0);
        dataReadOption.setDataTable(1030);
        pr8 pr8Var = pr8.INSTANCE;
        if (pr8Var.e(endTime) >= pr8Var.e(System.currentTimeMillis())) {
            dataReadOption.setIsParse(2);
        }
        ddd<List<OsaResultBean>> dddVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.aih
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.g0((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.bih
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.h0((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(dddVarT0, "getInstance()\n          …ultBean>()\n            })");
        return dddVarT0;
    }

    public final void g1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mSsoId = str;
    }

    @NotNull
    public final ddd<List<Sleep>> i0(long startTime, long endTime) {
        m8b.f("SleepDayRes2", "fetch phone sleep begin");
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.mSsoId);
        dataReadOption.setStartTime(startTime);
        dataReadOption.setEndTime(endTime);
        dataReadOption.setSortOrder(0);
        pr8 pr8Var = pr8.INSTANCE;
        if (pr8Var.e(endTime) >= pr8Var.e(System.currentTimeMillis())) {
            dataReadOption.setIsParse(2);
        }
        dataReadOption.setDataTable(1010);
        dataReadOption.setDataReadType("0");
        ddd<List<Sleep>> dddVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.khh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.j0((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.lhh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.k0((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(dddVarT0, "getInstance()\n          …leListOf()\n            })");
        return dddVarT0;
    }

    @NotNull
    public final ddd<List<Sleep>> l0(long startTime, long endTime) {
        return m0(startTime, endTime, null);
    }

    @NotNull
    public final ddd<List<Sleep>> m0(long startTime, long endTime, @Nullable String deviceUniqueId) {
        m8b.f("SleepDayRes2", "fetch sleep day data begin");
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.mSsoId);
        dataReadOption.setStartTime(startTime);
        dataReadOption.setEndTime(endTime);
        dataReadOption.setSortOrder(0);
        pr8 pr8Var = pr8.INSTANCE;
        if (pr8Var.e(endTime) >= pr8Var.e(System.currentTimeMillis())) {
            dataReadOption.setIsParse(2);
        }
        dataReadOption.setDataTable(1010);
        if (deviceUniqueId != null) {
            dataReadOption.setDeviceUniqueId(deviceUniqueId);
        }
        ddd<List<Sleep>> dddVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.rgh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.n0((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.sgh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.o0((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(dddVarT0, "getInstance()\n          …leListOf()\n            })");
        return dddVarT0;
    }

    @NotNull
    public final ddd<List<SleepAdvice>> p0(long startTime, long endTime) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.mSsoId);
        dataReadOption.setStartTime(startTime);
        dataReadOption.setEndTime(endTime);
        dataReadOption.setSortOrder(0);
        dataReadOption.setDataTable(1072);
        dataReadOption.setGroupUnitType(4);
        pr8 pr8Var = pr8.INSTANCE;
        if (pr8Var.e(endTime) >= pr8Var.e(System.currentTimeMillis())) {
            dataReadOption.setIsParse(2);
        }
        ddd<List<SleepAdvice>> dddVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.ehh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.q0((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.fhh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.r0((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(dddVarT0, "getInstance()\n          …pAdvice>()\n            })");
        return dddVarT0;
    }

    @NotNull
    public final ddd<List<SleepDataStat>> s0(long startTime, long endTime) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.mSsoId);
        dataReadOption.setStartTime(startTime);
        dataReadOption.setEndTime(endTime);
        dataReadOption.setSortOrder(0);
        dataReadOption.setDataTable(1011);
        dataReadOption.setGroupUnitType(4);
        ddd<List<SleepDataStat>> dddVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.phh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.t0((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.qhh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.u0((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(dddVarT0, "getInstance()\n          …ataStat>()\n            })");
        return dddVarT0;
    }

    @NotNull
    public final ddd<List<SleepIndex>> v0(long startTime, long endTime, @Nullable String deviceUniqueId) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.mSsoId);
        dataReadOption.setStartTime(startTime);
        dataReadOption.setEndTime(endTime);
        dataReadOption.setSortOrder(0);
        dataReadOption.setDataTable(IONetService.Stub.TRANSACTION_setSenselessConnectionCallback);
        dataReadOption.setGroupUnitType(4);
        pr8 pr8Var = pr8.INSTANCE;
        if (pr8Var.e(endTime) >= pr8Var.e(System.currentTimeMillis())) {
            dataReadOption.setIsParse(2);
        }
        if (deviceUniqueId != null) {
            dataReadOption.setDeviceUniqueId(deviceUniqueId);
        }
        ddd<List<SleepIndex>> dddVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.yhh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.x0((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.zhh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.y0((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(dddVarT0, "getInstance()\n          …epIndex>()\n            })");
        return dddVarT0;
    }

    @NotNull
    public final ddd<List<BloodOxygenSaturation>> z0(long startTime, long endTime) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.mSsoId);
        dataReadOption.setStartTime(startTime);
        dataReadOption.setEndTime(endTime);
        dataReadOption.setSortOrder(0);
        dataReadOption.setDataTable(1014);
        dataReadOption.setReadHealthDataType(0);
        pr8 pr8Var = pr8.INSTANCE;
        if (pr8Var.e(endTime) >= pr8Var.e(System.currentTimeMillis())) {
            dataReadOption.setIsParse(2);
        }
        ddd<List<BloodOxygenSaturation>> dddVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(new g18() { // from class: com.oplus.aiunit.vision.ghh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.A0((CommonBackBean) obj);
            }
        }).t0(new g18() { // from class: com.oplus.aiunit.vision.hhh
            @Override // com.oplus.aiunit.vision.g18
            public final Object apply(Object obj) {
                return SleepDayDataRepository2.B0((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(dddVarT0, "getInstance()\n          …uration>()\n            })");
        return dddVarT0;
    }
}