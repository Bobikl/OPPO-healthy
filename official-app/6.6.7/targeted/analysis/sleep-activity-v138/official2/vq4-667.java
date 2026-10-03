package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.SportDataDetail;
import com.heytap.databaseengine.model.SportDataStat;
import com.heytap.databaseengine.model.SportMetaData;
import com.heytap.databaseengine.model.SportRecord;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.health.core.widget.charts.data.HealthGradientColor;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.daily.bean.DailyActivityDayBean;
import com.heytap.health.daily.bean.DailyActivityDetailBean;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b+\u0010,J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ:\u0010\u0018\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010H\u0002J2\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J$\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J2\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J.\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00102\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00102\u0006\u0010 \u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!H\u0002R\u0014\u0010&\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010*\u001a\n '*\u0004\u0018\u00010\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006."}, d2 = {"Lcom/oplus/aiunit/vision/vq4;", "", "", "ssoid", "", LogFieldKey.LEVEL_KEY, MapSchema.FIELD_NAME_KEY, "Ljava/time/LocalDate;", "date", "", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "Lcom/oplus/aiunit/vision/ddd;", "Lcom/heytap/health/daily/bean/DailyActivityDetailBean;", "i", "Lcom/heytap/health/daily/bean/DailyActivityDayBean;", c7n.g, "", "Lcom/heytap/databaseengine/model/SportDataDetail;", "halfHourDetails", "hourDetails", "", "start", "Lcom/heytap/databaseengine/model/SportRecord;", "sportRecords", "c", hq6.DETAIL_ENTRY, "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", MapSchema.FIELD_NAME_ENTRY, "f", "d", c7n.f, "list", "startTime", "Lcom/heytap/health/core/widget/charts/data/TimeUnit;", "timeUnit", "j", "a", "I", "HALF_AN_HOUR_MILL", "kotlin.jvm.PlatformType", "b", "Ljava/lang/String;", "mSsoid", "<init>", "()V", "Companion", "daily_release"}, k = 1, mv = {1, 8, 0})
public final class vq4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int HALF_AN_HOUR_MILL = 1800000;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public String mSsoid = cn.c().getSsoid();

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final List<String> f19291c = CollectionsKt__CollectionsJVMKt.listOf(kq5.WATCH);

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.vq4$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/vq4$a;", "", "", "Lcom/heytap/databaseengine/model/SportRecord;", "sportRecords", "", "isWear", "b", "", "TAG", "Ljava/lang/String;", "deviceScopes", "Ljava/util/List;", "<init>", "()V", "daily_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<SportRecord> b(List<? extends SportRecord> sportRecords, boolean isWear) {
            SportMetaData sportMetaData;
            ArrayList arrayList = new ArrayList();
            for (SportRecord sportRecord : sportRecords) {
                if (sportRecord.getDisplay() != 2) {
                    if (isWear) {
                        if (vq4.f19291c.contains(sportRecord.getDeviceType())) {
                            if (!hii.ALL_TRACK_TYPES.contains(Integer.valueOf(sportRecord.getTrackType())) || ((sportMetaData = (SportMetaData) vd8.a(sportRecord.getMetaData(), SportMetaData.class)) != null && (sportMetaData.getFitSourceType() != 1 || vq4.f19291c.contains(sportRecord.getDeviceType())))) {
                                if (sportRecord.getTrackType() != 9 || sportRecord.getTrackType() == 12) {
                                    arrayList.add(sportRecord);
                                }
                            }
                        }
                    } else if (vq4.f19291c.contains(sportRecord.getDeviceType()) || TextUtils.equals(sportRecord.getDeviceType(), kq5.PHONE)) {
                        if (!hii.ALL_TRACK_TYPES.contains(Integer.valueOf(sportRecord.getTrackType()))) {
                        }
                        if (sportRecord.getTrackType() != 9) {
                        }
                        arrayList.add(sportRecord);
                    }
                }
            }
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/heytap/databaseengine/model/CommonBackBean;", "commonBackBean", "Lcom/heytap/health/daily/bean/DailyActivityDayBean;", "a", "(Lcom/heytap/databaseengine/model/CommonBackBean;)Lcom/heytap/health/daily/bean/DailyActivityDayBean;"}, k = 3, mv = {1, 8, 0})
    public static final class b<T, R> implements g18 {
        public static final b<T, R> INSTANCE = new b<>();

        @Override // com.oplus.aiunit.vision.g18
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DailyActivityDayBean apply(@NotNull CommonBackBean commonBackBean) {
            Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.SportDataStat>");
            DailyActivityDayBean dailyActivityDayBean = new DailyActivityDayBean();
            dailyActivityDayBean.setTargetCalorie(300);
            dailyActivityDayBean.setTargetStep(8000);
            dailyActivityDayBean.setTargetActive(12);
            dailyActivityDayBean.setTargetTime(30);
            dailyActivityDayBean.setTargetStep(0);
            SportDataStat sportDataStat = (SportDataStat) ((List) obj).get(0);
            dailyActivityDayBean.setCurrentCalorie((int) (sportDataStat.getTotalCalories() / ((long) 1000)));
            dailyActivityDayBean.setCurrentStep(sportDataStat.getTotalSteps());
            dailyActivityDayBean.setCurrentActive(sportDataStat.getTotalMoveAboutTimes());
            dailyActivityDayBean.setCurrentTime(sportDataStat.getTotalWorkoutMinutes());
            dailyActivityDayBean.setTargetCalorie(sportDataStat.getCurrentDayCaloriesGoal() / 1000);
            dailyActivityDayBean.setTargetStep(sportDataStat.getCurrentDayStepsGoal());
            dailyActivityDayBean.setTargetActive(sportDataStat.getCurrentDayMoveAboutTimesGoal());
            dailyActivityDayBean.setTargetTime(sportDataStat.getCurrentDayWorkoutGoal());
            dailyActivityDayBean.setDistance(sportDataStat.getTotalDistance() / 1000);
            dailyActivityDayBean.setFloor(sportDataStat.getTotalAltitudeOffset() / 30);
            return dailyActivityDayBean;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lcom/heytap/health/daily/bean/DailyActivityDayBean;", "a", "(Ljava/lang/Throwable;)Lcom/heytap/health/daily/bean/DailyActivityDayBean;"}, k = 3, mv = {1, 8, 0})
    public static final class c<T, R> implements g18 {
        public static final c<T, R> INSTANCE = new c<>();

        @Override // com.oplus.aiunit.vision.g18
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DailyActivityDayBean apply(@Nullable Throwable th) {
            DailyActivityDayBean dailyActivityDayBean = new DailyActivityDayBean();
            dailyActivityDayBean.setTargetCalorie(300);
            dailyActivityDayBean.setTargetStep(8000);
            dailyActivityDayBean.setTargetActive(12);
            dailyActivityDayBean.setTargetTime(30);
            return dailyActivityDayBean;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcom/heytap/databaseengine/model/SportDataDetail;", "halfHourDetails", "hourDetails", "Lcom/heytap/databaseengine/model/SportRecord;", "fiveMinutes", "Lcom/heytap/health/daily/bean/DailyActivityDetailBean;", "b", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/heytap/health/daily/bean/DailyActivityDetailBean;"}, k = 3, mv = {1, 8, 0})
    public static final class d<T1, T2, T3, R> implements h18 {
        public final /* synthetic */ long b;

        public d(long j2) {
            this.b = j2;
        }

        @Override // com.oplus.aiunit.vision.h18
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DailyActivityDetailBean a(@NotNull List<? extends SportDataDetail> halfHourDetails, @NotNull List<? extends SportDataDetail> hourDetails, @NotNull List<? extends SportRecord> fiveMinutes) {
            Intrinsics.checkNotNullParameter(halfHourDetails, "halfHourDetails");
            Intrinsics.checkNotNullParameter(hourDetails, "hourDetails");
            Intrinsics.checkNotNullParameter(fiveMinutes, "fiveMinutes");
            return vq4.this.c(halfHourDetails, hourDetails, this.b, fiveMinutes);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/heytap/databaseengine/model/CommonBackBean;", "commonBackBean", "", "Lcom/heytap/databaseengine/model/SportDataDetail;", "a", "(Lcom/heytap/databaseengine/model/CommonBackBean;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class e<T, R> implements g18 {
        public static final e<T, R> INSTANCE = new e<>();

        @Override // com.oplus.aiunit.vision.g18
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<SportDataDetail> apply(@NotNull CommonBackBean commonBackBean) {
            Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
            int errorCode = commonBackBean.getErrorCode();
            StringBuilder sb = new StringBuilder();
            sb.append("get Cur steps ： errorCode ");
            sb.append(errorCode);
            if (commonBackBean.getObj() == null) {
                return new ArrayList();
            }
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.SportDataDetail>");
            return (List) obj;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "<anonymous parameter 0>", "", "Lcom/heytap/databaseengine/model/SportDataDetail;", "a", "(Ljava/lang/Throwable;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class f<T, R> implements g18 {
        public static final f<T, R> INSTANCE = new f<>();

        @Override // com.oplus.aiunit.vision.g18
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<SportDataDetail> apply(@Nullable Throwable th) {
            return new ArrayList();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/heytap/databaseengine/model/CommonBackBean;", "commonBackBean", "", "Lcom/heytap/databaseengine/model/SportDataDetail;", "a", "(Lcom/heytap/databaseengine/model/CommonBackBean;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class g<T, R> implements g18 {
        public static final g<T, R> INSTANCE = new g<>();

        @Override // com.oplus.aiunit.vision.g18
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<SportDataDetail> apply(@NotNull CommonBackBean commonBackBean) {
            Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
            int errorCode = commonBackBean.getErrorCode();
            StringBuilder sb = new StringBuilder();
            sb.append("get Cur steps ： errorCode ");
            sb.append(errorCode);
            if (commonBackBean.getObj() == null) {
                return new ArrayList();
            }
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.SportDataDetail>");
            return (List) obj;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "<anonymous parameter 0>", "", "Lcom/heytap/databaseengine/model/SportDataDetail;", "a", "(Ljava/lang/Throwable;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class h<T, R> implements g18 {
        public static final h<T, R> INSTANCE = new h<>();

        @Override // com.oplus.aiunit.vision.g18
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<SportDataDetail> apply(@Nullable Throwable th) {
            return new ArrayList();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/heytap/databaseengine/model/CommonBackBean;", "commonBackBean", "", "Lcom/heytap/databaseengine/model/SportRecord;", "a", "(Lcom/heytap/databaseengine/model/CommonBackBean;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class i<T, R> implements g18 {
        public static final i<T, R> INSTANCE = new i<>();

        @Override // com.oplus.aiunit.vision.g18
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<SportRecord> apply(@NotNull CommonBackBean commonBackBean) {
            List arrayList;
            Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
            int errorCode = commonBackBean.getErrorCode();
            StringBuilder sb = new StringBuilder();
            sb.append("get fiveMinute  ： errorCode ");
            sb.append(errorCode);
            if (commonBackBean.getObj() == null) {
                arrayList = new ArrayList();
            } else {
                Object obj = commonBackBean.getObj();
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.SportRecord>");
                arrayList = (List) obj;
            }
            return vq4.INSTANCE.b(arrayList, fdg.w().z("daily_step_sport_mode", -2) == -3);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "<anonymous parameter 0>", "", "Lcom/heytap/databaseengine/model/SportRecord;", "a", "(Ljava/lang/Throwable;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class j<T, R> implements g18 {
        public static final j<T, R> INSTANCE = new j<>();

        @Override // com.oplus.aiunit.vision.g18
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<SportRecord> apply(@Nullable Throwable th) {
            return new ArrayList();
        }
    }

    public final DailyActivityDetailBean c(List<? extends SportDataDetail> halfHourDetails, List<? extends SportDataDetail> hourDetails, long start, List<? extends SportRecord> sportRecords) {
        DailyActivityDetailBean dailyActivityDetailBean = new DailyActivityDetailBean();
        List<TimeStampedData> listE = e(halfHourDetails, sportRecords, start);
        TimeUnit timeUnit = TimeUnit.HALF_AN_HOUR;
        dailyActivityDetailBean.setCalories(j(listE, start, timeUnit));
        dailyActivityDetailBean.setSteps(j(f(halfHourDetails, start), start, timeUnit));
        dailyActivityDetailBean.setActives(j(d(hourDetails, start), start, TimeUnit.HOUR));
        dailyActivityDetailBean.setTimes(j(g(halfHourDetails, sportRecords, start), start, timeUnit));
        return dailyActivityDetailBean;
    }

    public final List<TimeStampedData> d(List<? extends SportDataDetail> details, long start) {
        ArrayList arrayList = new ArrayList();
        HealthGradientColor healthGradientColorB = new ml3(e88.a()).b();
        for (SportDataDetail sportDataDetail : details) {
            TimeStampedData timeStampedData = new TimeStampedData();
            long j2 = 3600000;
            timeStampedData.setTimestamp(((sportDataDetail.getStartTimestamp() - start) / j2) * j2);
            if (sportDataDetail.getMoveAbout() != 0) {
                timeStampedData.setY(1.0f);
                timeStampedData.setGradientColor(healthGradientColorB);
                arrayList.add(timeStampedData);
            }
        }
        return arrayList;
    }

    public final List<TimeStampedData> e(List<? extends SportDataDetail> details, List<? extends SportRecord> sportRecords, long start) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HealthGradientColor healthGradientColorD = new ml3(e88.a()).d();
        for (SportDataDetail sportDataDetail : details) {
            TimeStampedData timeStampedData = new TimeStampedData();
            long startTimestamp = sportDataDetail.getStartTimestamp() - start;
            int i2 = this.HALF_AN_HOUR_MILL;
            long j2 = (startTimestamp / ((long) i2)) * ((long) i2);
            timeStampedData.setTimestamp(j2);
            timeStampedData.setY(sportDataDetail.getCalories());
            timeStampedData.setGradientColor(healthGradientColorD);
            linkedHashMap.put(Long.valueOf(j2), timeStampedData);
        }
        for (SportRecord sportRecord : sportRecords) {
            long startTime = sportRecord.getStartTime() - start;
            int i3 = this.HALF_AN_HOUR_MILL;
            long j3 = (startTime / ((long) i3)) * ((long) i3);
            SportMetaData sportMetaData = (SportMetaData) vd8.a(sportRecord.getMetaData(), SportMetaData.class);
            if (sportMetaData != null) {
                if (linkedHashMap.containsKey(Long.valueOf(j3))) {
                    Object obj = linkedHashMap.get(Long.valueOf(j3));
                    Intrinsics.checkNotNull(obj);
                    Object obj2 = linkedHashMap.get(Long.valueOf(j3));
                    Intrinsics.checkNotNull(obj2);
                    ((TimeStampedData) obj).setY(((TimeStampedData) obj2).getY() + sportMetaData.getTrainedCalorie());
                } else {
                    TimeStampedData timeStampedData2 = new TimeStampedData();
                    timeStampedData2.setTimestamp(j3);
                    timeStampedData2.setY(sportMetaData.getTrainedCalorie());
                    timeStampedData2.setGradientColor(healthGradientColorD);
                    linkedHashMap.put(Long.valueOf(j3), timeStampedData2);
                }
            }
        }
        return new ArrayList(linkedHashMap.values());
    }

    public final List<TimeStampedData> f(List<? extends SportDataDetail> details, long start) {
        ArrayList arrayList = new ArrayList();
        HealthGradientColor healthGradientColorH = new ml3(e88.a()).h();
        for (SportDataDetail sportDataDetail : details) {
            TimeStampedData timeStampedData = new TimeStampedData();
            long startTimestamp = sportDataDetail.getStartTimestamp() - start;
            int i2 = this.HALF_AN_HOUR_MILL;
            timeStampedData.setTimestamp((startTimestamp / ((long) i2)) * ((long) i2));
            timeStampedData.setY(sportDataDetail.getSteps());
            timeStampedData.setGradientColor(healthGradientColorH);
            arrayList.add(timeStampedData);
        }
        return arrayList;
    }

    public final List<TimeStampedData> g(List<? extends SportDataDetail> details, List<? extends SportRecord> sportRecords, long start) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HealthGradientColor healthGradientColorF = new ml3(e88.a()).f();
        for (SportDataDetail sportDataDetail : details) {
            TimeStampedData timeStampedData = new TimeStampedData();
            long startTimestamp = sportDataDetail.getStartTimestamp() - start;
            int i2 = this.HALF_AN_HOUR_MILL;
            long j2 = (startTimestamp / ((long) i2)) * ((long) i2);
            timeStampedData.setTimestamp(j2);
            timeStampedData.setY(sportDataDetail.getWorkout());
            timeStampedData.setGradientColor(healthGradientColorF);
            linkedHashMap.put(Long.valueOf(j2), timeStampedData);
        }
        for (SportRecord sportRecord : sportRecords) {
            long startTime = sportRecord.getStartTime() - start;
            int i3 = this.HALF_AN_HOUR_MILL;
            long j3 = (startTime / ((long) i3)) * ((long) i3);
            SportMetaData sportMetaData = (SportMetaData) vd8.a(sportRecord.getMetaData(), SportMetaData.class);
            if (sportMetaData != null) {
                float trainedDuration = sportMetaData.getTrainedDuration() / 60000.0f;
                if (linkedHashMap.containsKey(Long.valueOf(j3))) {
                    Object obj = linkedHashMap.get(Long.valueOf(j3));
                    Intrinsics.checkNotNull(obj);
                    Object obj2 = linkedHashMap.get(Long.valueOf(j3));
                    Intrinsics.checkNotNull(obj2);
                    ((TimeStampedData) obj).setY(((TimeStampedData) obj2).getY() + trainedDuration);
                } else {
                    TimeStampedData timeStampedData2 = new TimeStampedData();
                    timeStampedData2.setTimestamp(j3);
                    timeStampedData2.setY(trainedDuration);
                    timeStampedData2.setGradientColor(healthGradientColorF);
                    linkedHashMap.put(Long.valueOf(j3), timeStampedData2);
                }
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            TimeStampedData timeStampedData3 = (TimeStampedData) ((Map.Entry) it.next()).getValue();
            if (timeStampedData3.getY() > 30.0f) {
                timeStampedData3.setY(30.0f);
            }
        }
        return new ArrayList(linkedHashMap.values());
    }

    @NotNull
    public final ddd<DailyActivityDayBean> h(@NotNull LocalDate date, int sportMode) {
        Intrinsics.checkNotNullParameter(date, "date");
        LocalDateTime localDateTimeAtStartOfDay = date.atStartOfDay();
        long epochMilli = localDateTimeAtStartOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        long epochMilli2 = localDateTimeAtStartOfDay.plusDays(1L).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - 1;
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.mSsoid);
        dataReadOption.setStartTime(epochMilli);
        dataReadOption.setEndTime(epochMilli2);
        dataReadOption.setReadSportMode(sportMode);
        dataReadOption.setAggregateType(108);
        dataReadOption.setDataTable(1002);
        ddd<DailyActivityDayBean> dddVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(b.INSTANCE).t0(c.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(dddVarT0, "getInstance()\n          …vityDayBean\n            }");
        return dddVarT0;
    }

    @NotNull
    public final ddd<DailyActivityDetailBean> i(@NotNull LocalDate date, int sportMode) {
        Intrinsics.checkNotNullParameter(date, "date");
        m8b.f("DailyActivityDetailRepo", "fetch calories  data begin");
        LocalDateTime localDateTimeAtStartOfDay = date.atStartOfDay();
        long epochMilli = localDateTimeAtStartOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        long epochMilli2 = localDateTimeAtStartOfDay.plusDays(1L).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - 1;
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.mSsoid);
        dataReadOption.setStartTime(epochMilli);
        dataReadOption.setEndTime(epochMilli2);
        dataReadOption.setReadSportMode(sportMode);
        dataReadOption.setDataTable(1001);
        dataReadOption.setGroupUnitType(11);
        if (o15.i(System.currentTimeMillis()) <= o15.i(epochMilli2)) {
            dataReadOption.setIsParse(2);
        }
        ddd dddVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(e.INSTANCE).t0(f.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(dddVarT0, "getInstance()\n          …rowable? -> ArrayList() }");
        DataReadOption dataReadOption2 = new DataReadOption();
        dataReadOption2.setSsoid(this.mSsoid);
        dataReadOption2.setStartTime(epochMilli);
        dataReadOption2.setEndTime(epochMilli2);
        dataReadOption2.setReadSportMode(-3);
        dataReadOption2.setDataTable(1001);
        dataReadOption2.setGroupUnitType(3);
        ddd dddVarT1 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption2).j0(g.INSTANCE).t0(h.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(dddVarT1, "getInstance()\n          …rowable? -> ArrayList() }");
        DataReadOption dataReadOption3 = new DataReadOption();
        dataReadOption3.setSsoid(this.mSsoid);
        dataReadOption3.setStartTime(epochMilli);
        dataReadOption3.setEndTime(epochMilli2);
        dataReadOption3.setReadSportMode(-2);
        dataReadOption3.setDataTable(1003);
        dataReadOption3.setGroupUnitType(11);
        ddd dddVarT2 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption3).j0(i.INSTANCE).t0(j.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(dddVarT2, "getInstance()\n          …rowable? -> ArrayList() }");
        ddd<DailyActivityDetailBean> dddVarK1 = ddd.k1(dddVarT0, dddVarT1, dddVarT2, new d(epochMilli));
        Intrinsics.checkNotNullExpressionValue(dddVarK1, "@Suppress(\"UNCHECKED_CAS…        )\n        }\n    }");
        return dddVarK1;
    }

    public final List<TimeStampedData> j(List<? extends TimeStampedData> list, long startTime, TimeUnit timeUnit) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        long unit = (long) timeUnit.getUnit();
        long j2 = startTime + (((long) (timeUnit == TimeUnit.HALF_AN_HOUR ? 49 : timeUnit == TimeUnit.HOUR ? 25 : 0)) * unit);
        for (long j3 = startTime; j3 < j2; j3 += unit) {
            arrayList.add(new TimeStampedData((long) (((j3 - startTime) / timeUnit.getUnit()) * timeUnit.getUnit()), 0.0f));
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            int timestamp = (int) (list.get(i2).getTimestamp() / unit);
            if (timestamp < 0) {
                return new ArrayList();
            }
            list.get(i2).setTimestamp((list.get(i2).getTimestamp() / unit) * unit);
            arrayList.set(timestamp, list.get(i2));
        }
        return arrayList;
    }

    @NotNull
    public final String k() {
        String mSsoid = this.mSsoid;
        Intrinsics.checkNotNullExpressionValue(mSsoid, "mSsoid");
        return mSsoid;
    }

    public final void l(@NotNull String ssoid) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.mSsoid = ssoid;
    }
}