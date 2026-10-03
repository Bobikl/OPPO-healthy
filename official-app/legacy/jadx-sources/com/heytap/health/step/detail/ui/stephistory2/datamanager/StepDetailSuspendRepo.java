package com.heytap.health.step.detail.ui.stephistory2.datamanager;

import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.HeartRateDataStat;
import com.heytap.databaseengine.model.SportDataDetail;
import com.heytap.databaseengine.model.SportDataStat;
import com.heytap.databaseengine.model.StepFrequency;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.step.card.bean.StepCardDetailsBean;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.StepStat;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.asi;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.v05;
import com.oplus.aiunit.vision.wq8;
import com.oplus.smartenginehelper.entity.TextEntity;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 12\u00020\u0001:\u0003*2(B\u0011\u0012\b\b\u0002\u0010.\u001a\u00020)¢\u0006\u0004\b/\u00100J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJF\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\bJ$\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005H\u0002J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\fH\u0002J)\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b!\u0010\bJ\u0018\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00052\u0006\u0010#\u001a\u00020\"H\u0002J3\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0082@ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0018J.\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00190\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u0010H\u0002R\u0017\u0010.\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lcom/heytap/health/step/detail/ui/stephistory2/datamanager/StepDetailSuspendRepo;", "", "Ljava/time/LocalDate;", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "", "Lcom/oplus/aiunit/vision/hti;", LogFieldKey.PROCESS_NAME_KEY, "(Ljava/time/LocalDate;Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", b2n.g, "Lcom/heytap/databaseengine/model/SportDataStat;", "statFromDaily", "Lcom/heytap/databaseengine/model/HeartRateDataStat;", "statFromHeart", "Lcom/heytap/databaseengine/model/StepFrequency;", "statFreq", "", "f", "Lcom/heytap/health/step/card/bean/StepCardDetailsBean;", "n", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "groupUnitType", LogFieldKey.LEVEL_KEY, "(Ljava/time/LocalDate;Ljava/time/LocalDate;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "i", "stepStat", "stepFreq", "", b2n.f, "heartRateStat", "d", "o", "Lcom/heytap/databaseengine/model/CommonBackBean;", "result", MapSchema.FIELD_NAME_ENTRY, "j", "Lcom/heytap/databaseengine/model/SportDataDetail;", "sportDetails", "c", "", "a", "Ljava/lang/String;", "getMSsoid", "()Ljava/lang/String;", "mSsoid", "<init>", "(Ljava/lang/String;)V", "Companion", "b", "step_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStepDetailSuspendRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepDetailSuspendRepo.kt\ncom/heytap/health/step/detail/ui/stephistory2/datamanager/StepDetailSuspendRepo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,442:1\n766#2:443\n857#2,2:444\n*S KotlinDebug\n*F\n+ 1 StepDetailSuspendRepo.kt\ncom/heytap/health/step/detail/ui/stephistory2/datamanager/StepDetailSuspendRepo\n*L\n189#1:443\n189#1:444,2\n*E\n"})
public final class StepDetailSuspendRepo {
    public static final int DEFAULT_VALUE = -1;

    @NotNull
    public static final String TAG = "StepDetailRepository";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String mSsoid;

    /* JADX INFO: renamed from: com.heytap.health.step.detail.ui.stephistory2.datamanager.StepDetailSuspendRepo$b, reason: from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001a¨\u0006\""}, d2 = {"Lcom/heytap/health/step/detail/ui/stephistory2/datamanager/StepDetailSuspendRepo$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/time/LocalDateTime;", "a", "Ljava/time/LocalDateTime;", "getStart", "()Ljava/time/LocalDateTime;", "setStart", "(Ljava/time/LocalDateTime;)V", "start", "b", "getEnd", "setEnd", TextEntity.ELLIPSIZE_END, "c", "I", "getMode", "()I", "setMode", "(I)V", "mode", "d", "getStep", "setStep", "step", "<init>", "(Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;II)V", "step_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class SimpleDetail {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public LocalDateTime start;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public LocalDateTime end;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public int mode;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        public int step;

        public SimpleDetail(@NotNull LocalDateTime start, @NotNull LocalDateTime end, int i, int i2) {
            Intrinsics.checkNotNullParameter(start, "start");
            Intrinsics.checkNotNullParameter(end, "end");
            this.start = start;
            this.end = end;
            this.mode = i;
            this.step = i2;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SimpleDetail)) {
                return false;
            }
            SimpleDetail simpleDetail = (SimpleDetail) other;
            return Intrinsics.areEqual(this.start, simpleDetail.start) && Intrinsics.areEqual(this.end, simpleDetail.end) && this.mode == simpleDetail.mode && this.step == simpleDetail.step;
        }

        public int hashCode() {
            return (((((this.start.hashCode() * 31) + this.end.hashCode()) * 31) + Integer.hashCode(this.mode)) * 31) + Integer.hashCode(this.step);
        }

        @NotNull
        public String toString() {
            return "SimpleDetail(start=" + this.start + ", end=" + this.end + ", mode=" + this.mode + ", step=" + this.step + ")";
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.step.detail.ui.stephistory2.datamanager.StepDetailSuspendRepo$c, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/heytap/health/step/detail/ui/stephistory2/datamanager/StepDetailSuspendRepo$c;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/time/LocalDateTime;", "a", "Ljava/time/LocalDateTime;", "getLocalDate", "()Ljava/time/LocalDateTime;", "localDate", "b", "I", "getStep", "()I", "step", "c", "getStepGoal", "stepGoal", "", "d", UserInfo.SEX_FEMALE, "getDistance", "()F", "distance", MapSchema.FIELD_NAME_ENTRY, "getAltitude", "altitude", "", "f", "J", "getDuration", "()J", "duration", "<init>", "(Ljava/time/LocalDateTime;IIFIJ)V", "step_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class SimpleStepStat {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final LocalDateTime localDate;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int step;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final int stepGoal;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        public final float distance;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final int altitude;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        public final long duration;

        public SimpleStepStat(@NotNull LocalDateTime localDate, int i, int i2, float f, int i3, long j2) {
            Intrinsics.checkNotNullParameter(localDate, "localDate");
            this.localDate = localDate;
            this.step = i;
            this.stepGoal = i2;
            this.distance = f;
            this.altitude = i3;
            this.duration = j2;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SimpleStepStat)) {
                return false;
            }
            SimpleStepStat simpleStepStat = (SimpleStepStat) other;
            return Intrinsics.areEqual(this.localDate, simpleStepStat.localDate) && this.step == simpleStepStat.step && this.stepGoal == simpleStepStat.stepGoal && Float.compare(this.distance, simpleStepStat.distance) == 0 && this.altitude == simpleStepStat.altitude && this.duration == simpleStepStat.duration;
        }

        public int hashCode() {
            return (((((((((this.localDate.hashCode() * 31) + Integer.hashCode(this.step)) * 31) + Integer.hashCode(this.stepGoal)) * 31) + Float.hashCode(this.distance)) * 31) + Integer.hashCode(this.altitude)) * 31) + Long.hashCode(this.duration);
        }

        @NotNull
        public String toString() {
            return "SimpleStepStat(localDate=" + this.localDate + ", step=" + this.step + ", stepGoal=" + this.stepGoal + ", distance=" + this.distance + ", altitude=" + this.altitude + ", duration=" + this.duration + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StepDetailSuspendRepo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Object k(StepDetailSuspendRepo stepDetailSuspendRepo, LocalDate localDate, LocalDate localDate2, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 4;
        }
        return stepDetailSuspendRepo.j(localDate, localDate2, i, continuation);
    }

    public static /* synthetic */ Object m(StepDetailSuspendRepo stepDetailSuspendRepo, LocalDate localDate, LocalDate localDate2, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 4;
        }
        return stepDetailSuspendRepo.l(localDate, localDate2, i, continuation);
    }

    public final List<TimeStampedData> c(LocalDate startDate, LocalDate endDate, List<SportDataDetail> sportDetails) {
        ArrayList arrayList = new ArrayList();
        List<SportDataDetail> list = sportDetails;
        if (list == null || list.isEmpty()) {
            while (startDate.isBefore(endDate)) {
                arrayList.add(new TimeStampedData(a.INSTANCE.p(startDate), -1.0f));
                startDate = startDate.plusDays(1L);
                Intrinsics.checkNotNullExpressionValue(startDate, "tempDate.plusDays(1)");
            }
            return arrayList;
        }
        SportDataDetail sportDataDetail = sportDetails.get(0);
        while (startDate.isBefore(endDate)) {
            for (SportDataDetail sportDataDetail2 : sportDetails) {
                a.Companion companion = a.INSTANCE;
                LocalDate localDateJ = companion.j(sportDataDetail2.getStartTimestamp());
                if (Intrinsics.areEqual(startDate, localDateJ)) {
                    arrayList.add(new TimeStampedData(sportDataDetail2.getStartTimestamp(), sportDataDetail2.getSteps()));
                    sportDataDetail = sportDataDetail2;
                } else if (localDateJ.isAfter(startDate) || sportDataDetail2 == CollectionsKt___CollectionsKt.last((List) sportDetails)) {
                    if (!Intrinsics.areEqual(companion.j(sportDataDetail.getStartTimestamp()), startDate)) {
                        arrayList.add(new TimeStampedData(companion.p(startDate), -1.0f));
                        break;
                    }
                }
            }
            startDate = startDate.plusDays(1L);
            Intrinsics.checkNotNullExpressionValue(startDate, "tempDate.plusDays(1)");
        }
        return arrayList;
    }

    public final int d(HeartRateDataStat heartRateStat) {
        String metadata = heartRateStat.getMetadata();
        if (metadata == null) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(metadata);
            if (jSONObject.has(HeartRateDataStat.WALK_AVG_HR)) {
                return jSONObject.getInt(HeartRateDataStat.WALK_AVG_HR);
            }
            return 0;
        } catch (Exception e2) {
            a7b.b("StepDetailRepository", "getWalkAvgHeartRate:" + e2.getMessage());
            return 0;
        }
    }

    public final List<Object> e(CommonBackBean result) {
        if (result.getErrorCode() != 0 || !(result.getObj() instanceof List)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Object obj = result.getObj();
        List<Object> list = obj instanceof List ? (List) obj : null;
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    @NotNull
    public final List<StepStat> f(@NotNull LocalDate startDate, @NotNull LocalDate endDate, @NotNull List<? extends SportDataStat> statFromDaily, @NotNull List<? extends HeartRateDataStat> statFromHeart, @NotNull List<StepFrequency> statFreq) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(statFromDaily, "statFromDaily");
        Intrinsics.checkNotNullParameter(statFromHeart, "statFromHeart");
        Intrinsics.checkNotNullParameter(statFreq, "statFreq");
        a7b.f("StepDetailRepository", "handleStat begin");
        ArrayList arrayList = new ArrayList();
        List<? extends SportDataStat> list = statFromDaily;
        if (list.isEmpty() && statFromHeart.isEmpty()) {
            arrayList.add(new StepStat(a.INSTANCE.p(endDate), 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0, 0, 0L, null, 0, 0, 0, 262142, null));
        } else if (!list.isEmpty() || statFromHeart.isEmpty()) {
            int i = 1000;
            if (list.isEmpty() || !statFromHeart.isEmpty()) {
                for (SportDataStat sportDataStat : statFromDaily) {
                    for (HeartRateDataStat heartRateDataStat : statFromHeart) {
                        if (sportDataStat.getDate() == heartRateDataStat.getDate()) {
                            arrayList.add(new StepStat(v05.a(sportDataStat.getDate()), sportDataStat.getTotalSteps(), sportDataStat.getTotalSteps(), sportDataStat.getTotalSteps(), 0, sportDataStat.getCurrentDayStepsGoal(), (int) (sportDataStat.getTotalCalories() / ((long) 1000)), sportDataStat.getCurrentDayCaloriesGoal() / 1000, sportDataStat.getTotalDistance() / 1000, 0, sportDataStat.getTotalAltitudeOffset() / 30, 0, d(heartRateDataStat), sportDataStat.getTotalDuration() / ((long) 60000), null, 0, 0, 0, 245760, null));
                            break;
                        }
                        if (heartRateDataStat == CollectionsKt___CollectionsKt.last((List) statFromHeart)) {
                            arrayList.add(new StepStat(v05.a(sportDataStat.getDate()), sportDataStat.getTotalSteps(), sportDataStat.getTotalSteps(), sportDataStat.getTotalSteps(), 0, sportDataStat.getCurrentDayStepsGoal(), (int) (sportDataStat.getTotalCalories() / ((long) 1000)), sportDataStat.getCurrentDayCaloriesGoal() / 1000, sportDataStat.getTotalDistance() / 1000, 0, sportDataStat.getTotalAltitudeOffset() / 30, 0, -1, sportDataStat.getTotalDuration() / ((long) 60000), null, 0, 0, 0, 245760, null));
                        }
                    }
                }
            } else {
                Iterator<? extends SportDataStat> it = statFromDaily.iterator();
                while (it.hasNext()) {
                    SportDataStat next = it.next();
                    arrayList.add(new StepStat(v05.a(next.getDate()), next.getTotalSteps(), 0, 0, 0, next.getCurrentDayStepsGoal(), (int) (next.getTotalCalories() / ((long) i)), next.getCurrentDayCaloriesGoal() / i, next.getTotalDistance() / i, 0, next.getTotalAltitudeOffset() / 30, 0, 0, next.getTotalDuration() / ((long) 60000), null, 0, 0, 0, 252444, null));
                    it = it;
                    i = 1000;
                }
            }
        } else {
            for (HeartRateDataStat heartRateDataStat2 : statFromHeart) {
                arrayList.add(new StepStat(v05.a(heartRateDataStat2.getDate()), 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0, d(heartRateDataStat2), 0L, null, 0, 0, 0, 258046, null));
            }
        }
        a7b.f("StepDetailRepository", "handleStat,startDate:" + startDate + ",endDate:" + endDate + ",stepStatSize:" + arrayList.size());
        g(arrayList, statFreq);
        return arrayList;
    }

    public final void g(List<StepStat> stepStat, List<StepFrequency> stepFreq) {
        List<StepStat> list = stepStat;
        if (list == null || list.isEmpty()) {
            return;
        }
        List<StepFrequency> list2 = stepFreq;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        for (StepStat stepStat2 : stepStat) {
            for (StepFrequency stepFrequency : stepFreq) {
                if (a.INSTANCE.x(v05.a(stepFrequency.getDate()), stepStat2.getTimeStamp())) {
                    stepStat2.x(RangesKt___RangesKt.coerceAtMost(stepFrequency.getMin(), stepFrequency.getMax()));
                    stepStat2.w(RangesKt___RangesKt.coerceAtLeast(stepFrequency.getMax(), stepFrequency.getMin()));
                    break;
                }
            }
        }
    }

    @Nullable
    public final Object h(@NotNull LocalDate localDate, @NotNull LocalDate localDate2, @NotNull Continuation<? super List<StepStat>> continuation) {
        return BuildersKt.withContext(wq8.INSTANCE.e(), new StepDetailSuspendRepo$queryDayStat$2(this, localDate, localDate2, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Nullable
    public final Object i(@NotNull LocalDate localDate, @NotNull LocalDate localDate2, @NotNull Continuation<? super List<? extends TimeStampedData>> continuation) {
        StepDetailSuspendRepo$queryDetail$1 stepDetailSuspendRepo$queryDetail$1;
        long j2;
        StepDetailSuspendRepo stepDetailSuspendRepo = this;
        LocalDate localDate3 = localDate;
        LocalDate localDate4 = localDate2;
        if (continuation instanceof StepDetailSuspendRepo$queryDetail$1) {
            stepDetailSuspendRepo$queryDetail$1 = (StepDetailSuspendRepo$queryDetail$1) continuation;
            int i = stepDetailSuspendRepo$queryDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stepDetailSuspendRepo$queryDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                stepDetailSuspendRepo$queryDetail$1 = new StepDetailSuspendRepo$queryDetail$1(stepDetailSuspendRepo, continuation);
            }
        } else {
            stepDetailSuspendRepo$queryDetail$1 = new StepDetailSuspendRepo$queryDetail$1(stepDetailSuspendRepo, continuation);
        }
        Object objC = stepDetailSuspendRepo$queryDetail$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stepDetailSuspendRepo$queryDetail$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            long jCurrentTimeMillis = System.currentTimeMillis();
            a7b.f("StepDetailRepository", "queryDetail " + localDate3 + " - " + localDate4 + ", " + jCurrentTimeMillis);
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(stepDetailSuspendRepo.mSsoid);
            a.Companion companion = a.INSTANCE;
            dataReadOption.setStartTime(companion.p(localDate3));
            LocalDate localDatePlusDays = localDate4.plusDays(1L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "endDate.plusDays(1)");
            dataReadOption.setEndTime(companion.p(localDatePlusDays));
            dataReadOption.setDataTable(1001);
            dataReadOption.setGroupUnitType(11);
            dataReadOption.setReadSportMode(-2);
            dataReadOption.setIsParse(Intrinsics.areEqual(localDate4, LocalDate.now()) ? 2 : 0);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(dataReadOption)");
            stepDetailSuspendRepo$queryDetail$1.L$0 = stepDetailSuspendRepo;
            stepDetailSuspendRepo$queryDetail$1.L$1 = localDate3;
            stepDetailSuspendRepo$queryDetail$1.L$2 = localDate4;
            j2 = jCurrentTimeMillis;
            stepDetailSuspendRepo$queryDetail$1.J$0 = j2;
            stepDetailSuspendRepo$queryDetail$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, stepDetailSuspendRepo$queryDetail$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = stepDetailSuspendRepo$queryDetail$1.J$0;
            localDate4 = (LocalDate) stepDetailSuspendRepo$queryDetail$1.L$2;
            LocalDate localDate5 = (LocalDate) stepDetailSuspendRepo$queryDetail$1.L$1;
            StepDetailSuspendRepo stepDetailSuspendRepo2 = (StepDetailSuspendRepo) stepDetailSuspendRepo$queryDetail$1.L$0;
            ResultKt.throwOnFailure(objC);
            j2 = j3;
            stepDetailSuspendRepo = stepDetailSuspendRepo2;
            localDate3 = localDate5;
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance().readSportH…taReadOption).awaitOnce()");
        List<? extends SportDataDetail> listE = stepDetailSuspendRepo.e((CommonBackBean) objC);
        Intrinsics.checkNotNull(listE, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.SportDataDetail>");
        asi.INSTANCE.a(localDate3, localDate4, listE);
        a7b.f("StepDetailRepository", "queryDetail " + localDate3 + ", data size = " + listE.size() + " cost:" + (System.currentTimeMillis() - j2));
        LocalDate localDatePlusDays2 = localDate4.plusDays(1L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays2, "endDate.plusDays(1)");
        return stepDetailSuspendRepo.c(localDate3, localDatePlusDays2, CollectionsKt___CollectionsKt.toMutableList((Collection) listE));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(LocalDate localDate, LocalDate localDate2, int i, Continuation<? super List<? extends HeartRateDataStat>> continuation) {
        StepDetailSuspendRepo$queryHeartRateHistoryStatData$1 stepDetailSuspendRepo$queryHeartRateHistoryStatData$1;
        StepDetailSuspendRepo stepDetailSuspendRepo;
        long j2;
        if (continuation instanceof StepDetailSuspendRepo$queryHeartRateHistoryStatData$1) {
            stepDetailSuspendRepo$queryHeartRateHistoryStatData$1 = (StepDetailSuspendRepo$queryHeartRateHistoryStatData$1) continuation;
            int i2 = stepDetailSuspendRepo$queryHeartRateHistoryStatData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stepDetailSuspendRepo$queryHeartRateHistoryStatData$1.label = i2 - Integer.MIN_VALUE;
            } else {
                stepDetailSuspendRepo$queryHeartRateHistoryStatData$1 = new StepDetailSuspendRepo$queryHeartRateHistoryStatData$1(this, continuation);
            }
        } else {
            stepDetailSuspendRepo$queryHeartRateHistoryStatData$1 = new StepDetailSuspendRepo$queryHeartRateHistoryStatData$1(this, continuation);
        }
        Object objC = stepDetailSuspendRepo$queryHeartRateHistoryStatData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = stepDetailSuspendRepo$queryHeartRateHistoryStatData$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objC);
            long jCurrentTimeMillis = System.currentTimeMillis();
            a7b.f("StepDetailRepository", "queryHeartRateHistoryStatData " + localDate + "-" + localDate2 + ", " + jCurrentTimeMillis);
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(this.mSsoid);
            a.Companion companion = a.INSTANCE;
            dataReadOption.setStartTime(companion.p(localDate));
            dataReadOption.setEndTime(companion.p(localDate2));
            dataReadOption.setDataTable(1009);
            dataReadOption.setGroupUnitType(i);
            dataReadOption.setSortOrder(0);
            boolean z = v05.i(System.currentTimeMillis()) <= v05.i(dataReadOption.getEndTime());
            if (z) {
                dataReadOption.setIsParse(2);
            }
            a7b.f("StepDetailRepository", "queryHeartRateHistoryStatData sameDay is " + z);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(dataReadOption)");
            stepDetailSuspendRepo$queryHeartRateHistoryStatData$1.L$0 = this;
            stepDetailSuspendRepo$queryHeartRateHistoryStatData$1.J$0 = jCurrentTimeMillis;
            stepDetailSuspendRepo$queryHeartRateHistoryStatData$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, stepDetailSuspendRepo$queryHeartRateHistoryStatData$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
            stepDetailSuspendRepo = this;
            j2 = jCurrentTimeMillis;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = stepDetailSuspendRepo$queryHeartRateHistoryStatData$1.J$0;
            stepDetailSuspendRepo = (StepDetailSuspendRepo) stepDetailSuspendRepo$queryHeartRateHistoryStatData$1.L$0;
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance().readSportH…taReadOption).awaitOnce()");
        a7b.f("StepDetailRepository", "queryHeartRateHistoryStatData cost:" + (System.currentTimeMillis() - j2));
        List<Object> listE = stepDetailSuspendRepo.e((CommonBackBean) objC);
        Intrinsics.checkNotNull(listE, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.HeartRateDataStat>");
        return listE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object l(@NotNull LocalDate localDate, @NotNull LocalDate localDate2, int i, @NotNull Continuation<? super List<? extends SportDataStat>> continuation) {
        StepDetailSuspendRepo$queryStatInDailyActTable$1 stepDetailSuspendRepo$queryStatInDailyActTable$1;
        LocalDate localDate3;
        long j2;
        if (continuation instanceof StepDetailSuspendRepo$queryStatInDailyActTable$1) {
            stepDetailSuspendRepo$queryStatInDailyActTable$1 = (StepDetailSuspendRepo$queryStatInDailyActTable$1) continuation;
            int i2 = stepDetailSuspendRepo$queryStatInDailyActTable$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stepDetailSuspendRepo$queryStatInDailyActTable$1.label = i2 - Integer.MIN_VALUE;
            } else {
                stepDetailSuspendRepo$queryStatInDailyActTable$1 = new StepDetailSuspendRepo$queryStatInDailyActTable$1(this, continuation);
            }
        } else {
            stepDetailSuspendRepo$queryStatInDailyActTable$1 = new StepDetailSuspendRepo$queryStatInDailyActTable$1(this, continuation);
        }
        Object objC = stepDetailSuspendRepo$queryStatInDailyActTable$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = stepDetailSuspendRepo$queryStatInDailyActTable$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objC);
            long jCurrentTimeMillis = System.currentTimeMillis();
            a7b.f("StepDetailRepository", "queryStatInDailyActTable " + localDate + "-" + localDate2 + ", curTime:" + jCurrentTimeMillis);
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(this.mSsoid);
            a.Companion companion = a.INSTANCE;
            dataReadOption.setStartTime(companion.p(localDate));
            dataReadOption.setEndTime(companion.p(localDate2));
            dataReadOption.setReadSportMode(-2);
            dataReadOption.setDataTable(1002);
            dataReadOption.setAggregateType(108);
            if (v05.i(System.currentTimeMillis()) <= v05.i(dataReadOption.getEndTime())) {
                dataReadOption.setIsParse(2);
            }
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(dataReadOption)");
            stepDetailSuspendRepo$queryStatInDailyActTable$1.L$0 = localDate;
            stepDetailSuspendRepo$queryStatInDailyActTable$1.J$0 = jCurrentTimeMillis;
            stepDetailSuspendRepo$queryStatInDailyActTable$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, stepDetailSuspendRepo$queryStatInDailyActTable$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
            localDate3 = localDate;
            j2 = jCurrentTimeMillis;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = stepDetailSuspendRepo$queryStatInDailyActTable$1.J$0;
            localDate3 = (LocalDate) stepDetailSuspendRepo$queryStatInDailyActTable$1.L$0;
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance().readSportH…\n            .awaitOnce()");
        CommonBackBean commonBackBean = (CommonBackBean) objC;
        a7b.f("StepDetailRepository", "queryStatInDailyActTable " + localDate3 + ", cost:" + (System.currentTimeMillis() - j2));
        if (commonBackBean.getErrorCode() != 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Object obj = commonBackBean.getObj();
        List list = obj instanceof List ? (List) obj : null;
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    @Nullable
    public final Object n(@NotNull Continuation<? super StepCardDetailsBean> continuation) {
        HashMap map = new HashMap();
        map.put("queryMonth", "");
        map.put("checkInType", Boxing.boxInt(1));
        return BuildersKt.withContext(wq8.INSTANCE.e(), new StepDetailSuspendRepo$queryStepCardData$2(map, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(LocalDate localDate, LocalDate localDate2, Continuation<? super List<StepFrequency>> continuation) {
        StepDetailSuspendRepo$queryStepFreq$1 stepDetailSuspendRepo$queryStepFreq$1;
        StepDetailSuspendRepo stepDetailSuspendRepo;
        LocalDate localDate3;
        long j2;
        if (continuation instanceof StepDetailSuspendRepo$queryStepFreq$1) {
            stepDetailSuspendRepo$queryStepFreq$1 = (StepDetailSuspendRepo$queryStepFreq$1) continuation;
            int i = stepDetailSuspendRepo$queryStepFreq$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stepDetailSuspendRepo$queryStepFreq$1.label = i - Integer.MIN_VALUE;
            } else {
                stepDetailSuspendRepo$queryStepFreq$1 = new StepDetailSuspendRepo$queryStepFreq$1(this, continuation);
            }
        } else {
            stepDetailSuspendRepo$queryStepFreq$1 = new StepDetailSuspendRepo$queryStepFreq$1(this, continuation);
        }
        Object objC = stepDetailSuspendRepo$queryStepFreq$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stepDetailSuspendRepo$queryStepFreq$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            long jCurrentTimeMillis = System.currentTimeMillis();
            a7b.f("StepDetailRepository", "queryStepFreq " + localDate + "-" + localDate2 + ", curTime:" + jCurrentTimeMillis);
            DataReadOption dataReadOption = new DataReadOption();
            dataReadOption.setSsoid(this.mSsoid);
            dataReadOption.setStartTime(b.o(localDate));
            dataReadOption.setEndTime(b.c(b.o(localDate2)));
            dataReadOption.setDataTable(1001);
            dataReadOption.setSortOrder(0);
            dataReadOption.setDataReadType("activity_step_frequency");
            boolean z = v05.i(System.currentTimeMillis()) <= v05.i(dataReadOption.getEndTime());
            dataReadOption.setIsParse(0);
            StringBuilder sb = new StringBuilder();
            sb.append("queryStepFreq sameDay is ");
            sb.append(z);
            lbd<CommonBackBean> sportHealthData = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption);
            Intrinsics.checkNotNullExpressionValue(sportHealthData, "getInstance().readSportHealthData(dataReadOption)");
            stepDetailSuspendRepo$queryStepFreq$1.L$0 = this;
            stepDetailSuspendRepo$queryStepFreq$1.L$1 = localDate;
            stepDetailSuspendRepo$queryStepFreq$1.J$0 = jCurrentTimeMillis;
            stepDetailSuspendRepo$queryStepFreq$1.label = 1;
            objC = RxExtendKt.c(sportHealthData, stepDetailSuspendRepo$queryStepFreq$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
            stepDetailSuspendRepo = this;
            localDate3 = localDate;
            j2 = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = stepDetailSuspendRepo$queryStepFreq$1.J$0;
            localDate3 = (LocalDate) stepDetailSuspendRepo$queryStepFreq$1.L$1;
            stepDetailSuspendRepo = (StepDetailSuspendRepo) stepDetailSuspendRepo$queryStepFreq$1.L$0;
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "getInstance().readSportH…taReadOption).awaitOnce()");
        a7b.f("StepDetailRepository", "queryStepFreq " + localDate3 + ", cost:" + (System.currentTimeMillis() - j2));
        List<Object> listE = stepDetailSuspendRepo.e((CommonBackBean) objC);
        Intrinsics.checkNotNull(listE, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.StepFrequency>");
        return listE;
    }

    @Nullable
    public final Object p(@NotNull LocalDate localDate, @NotNull LocalDate localDate2, @NotNull Continuation<? super List<StepStat>> continuation) {
        return BuildersKt.withContext(wq8.INSTANCE.e(), new StepDetailSuspendRepo$queryWeekStat$2(this, localDate, localDate2, null), continuation);
    }

    public StepDetailSuspendRepo(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.mSsoid = mSsoid;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StepDetailSuspendRepo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = um.c().getSsoid();
            Intrinsics.checkNotNullExpressionValue(str, "getAccountManager().ssoid");
        }
        this(str);
    }
}
