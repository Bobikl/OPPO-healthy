package com.heytap.health.bloodoxygen.util;

import com.heytap.health.bloodoxygen.util.BloodOxygenDayPagerHelper;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.jq0;
import com.oplus.aiunit.vision.qk1;
import com.oplus.aiunit.vision.x05;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\u0018\u00002\u00020\u0001:\u0001\u0019B}\u00126\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00040\u0016\u0012<\u0010!\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070\u001e¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u0016¢\u0006\u0004\b:\u0010;J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ \u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002RG\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00040\u00168\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cRM\u0010!\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070\u001e¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u00168\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001a\u0010&\u001a\u00020\"8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010*\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010.\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\"\u00103\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010+\u001a\u0004\b0\u0010-\"\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00104R\u001c\u00107\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00106R\u0014\u00109\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010'¨\u0006<"}, d2 = {"Lcom/heytap/health/bloodoxygen/util/BloodOxygenDayPagerHelper;", "", "", "index", "", "b", "", "Lcom/oplus/aiunit/vision/qk1;", "newDataList", MapSchema.FIELD_NAME_ENTRY, "", "lastDataTime", "d", "Ljava/time/LocalDate;", "date", "c", "Lcom/heytap/health/bloodoxygen/util/BloodOxygenDayPagerHelper$a;", "requestType", "startTime", "endTime", b2n.g, b2n.f, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "a", "Lkotlin/jvm/functions/Function2;", "getRequestDataScope", "()Lkotlin/jvm/functions/Function2;", "requestDataScope", "", "dataList", "getOnDataCompleteCallBack", "onDataCompleteCallBack", "", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "J", "getONECE_REQUEST_COUNT", "()J", "ONECE_REQUEST_COUNT", "I", "getMAX_SIZE", "()I", "MAX_SIZE", "f", "getCurIndex", "setCurIndex", "(I)V", "curIndex", "Lcom/heytap/health/bloodoxygen/util/BloodOxygenDayPagerHelper$a;", "mRequestType", "Ljava/util/List;", "mDataList", "i", "MAX_DATE_TIME", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBloodOxygenDayPagerHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodOxygenDayPagerHelper.kt\ncom/heytap/health/bloodoxygen/util/BloodOxygenDayPagerHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,225:1\n1864#2,3:226\n1864#2,3:229\n*S KotlinDebug\n*F\n+ 1 BloodOxygenDayPagerHelper.kt\ncom/heytap/health/bloodoxygen/util/BloodOxygenDayPagerHelper\n*L\n153#1:226,3\n169#1:229,3\n*E\n"})
public final class BloodOxygenDayPagerHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function2<Long, Long, Unit> requestDataScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function2<List<qk1>, Integer, Unit> onDataCompleteCallBack;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final long ONECE_REQUEST_COUNT;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int MAX_SIZE;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int curIndex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public a mRequestType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public List<qk1> mDataList;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final long MAX_DATE_TIME;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/bloodoxygen/util/BloodOxygenDayPagerHelper$a;", "", "<init>", "()V", "a", "b", "c", "d", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/bloodoxygen/util/BloodOxygenDayPagerHelper$a$a;", "Lcom/heytap/health/bloodoxygen/util/BloodOxygenDayPagerHelper$a$b;", "Lcom/heytap/health/bloodoxygen/util/BloodOxygenDayPagerHelper$a$c;", "Lcom/heytap/health/bloodoxygen/util/BloodOxygenDayPagerHelper$a$d;", "Lcom/heytap/health/bloodoxygen/util/BloodOxygenDayPagerHelper$a$e;", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class a {

        /* JADX INFO: renamed from: com.heytap.health.bloodoxygen.util.BloodOxygenDayPagerHelper$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/heytap/health/bloodoxygen/util/BloodOxygenDayPagerHelper$a$a;", "Lcom/heytap/health/bloodoxygen/util/BloodOxygenDayPagerHelper$a;", "", "a", "J", "()J", "lastDataTime", "<init>", "(J)V", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
        public static final class C0302a extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            public final long lastDataTime;

            public C0302a(long j2) {
                super(null);
                this.lastDataTime = j2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final long getLastDataTime() {
                return this.lastDataTime;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/heytap/health/bloodoxygen/util/BloodOxygenDayPagerHelper$a$b;", "Lcom/heytap/health/bloodoxygen/util/BloodOxygenDayPagerHelper$a;", "", "a", "J", "()J", "dayStartTime", "<init>", "(J)V", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            public final long dayStartTime;

            public b(long j2) {
                super(null);
                this.dayStartTime = j2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final long getDayStartTime() {
                return this.dayStartTime;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/bloodoxygen/util/BloodOxygenDayPagerHelper$a$c;", "Lcom/heytap/health/bloodoxygen/util/BloodOxygenDayPagerHelper$a;", "<init>", "()V", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
        public static final class c extends a {

            @NotNull
            public static final c INSTANCE = new c();

            public c() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/bloodoxygen/util/BloodOxygenDayPagerHelper$a$d;", "Lcom/heytap/health/bloodoxygen/util/BloodOxygenDayPagerHelper$a;", "<init>", "()V", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
        public static final class d extends a {

            @NotNull
            public static final d INSTANCE = new d();

            public d() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/bloodoxygen/util/BloodOxygenDayPagerHelper$a$e;", "Lcom/heytap/health/bloodoxygen/util/BloodOxygenDayPagerHelper$a;", "<init>", "()V", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
        public static final class e extends a {

            @NotNull
            public static final e INSTANCE = new e();

            public e() {
                super(null);
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BloodOxygenDayPagerHelper(@NotNull Function2<? super Long, ? super Long, Unit> requestDataScope, @NotNull Function2<? super List<qk1>, ? super Integer, Unit> onDataCompleteCallBack) {
        Intrinsics.checkNotNullParameter(requestDataScope, "requestDataScope");
        Intrinsics.checkNotNullParameter(onDataCompleteCallBack, "onDataCompleteCallBack");
        this.requestDataScope = requestDataScope;
        this.onDataCompleteCallBack = onDataCompleteCallBack;
        this.TAG = "BloodOxygenDayPagerHelper";
        this.ONECE_REQUEST_COUNT = 5L;
        this.MAX_SIZE = 30;
        this.curIndex = -1;
        this.mRequestType = a.d.INSTANCE;
        this.mDataList = new ArrayList();
        com.heytap.health.bloodoxygen.util.a.Companion companion = com.heytap.health.bloodoxygen.util.a.INSTANCE;
        LocalDate localDatePlusDays = companion.a().plusDays(1L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "BODateUtil.getCurrentDate().plusDays(1)");
        this.MAX_DATE_TIME = companion.g(localDatePlusDays);
    }

    public static final int f(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    public final void b(int index) {
        this.curIndex = index;
        g(index);
    }

    public final void c(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        com.heytap.health.bloodoxygen.util.a.Companion companion = com.heytap.health.bloodoxygen.util.a.INSTANCE;
        this.mRequestType = new a.b(companion.g(date));
        long j2 = 2;
        LocalDate localDateMinusDays = date.minusDays(this.ONECE_REQUEST_COUNT / j2);
        Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "date.minusDays(ONECE_REQUEST_COUNT / 2)");
        long jMax = Math.max(companion.g(localDateMinusDays), companion.d());
        LocalDate localDatePlusDays = date.plusDays(this.ONECE_REQUEST_COUNT / j2);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "date.plusDays(ONECE_REQUEST_COUNT / 2)");
        h(new a.b(companion.g(date)), jMax, Math.min(companion.g(localDatePlusDays), this.MAX_DATE_TIME) - ((long) 1000));
    }

    public final void d(long lastDataTime) {
        if (Intrinsics.areEqual(this.mRequestType, a.d.INSTANCE)) {
            this.mRequestType = new a.C0302a(lastDataTime);
            com.heytap.health.bloodoxygen.util.a.Companion companion = com.heytap.health.bloodoxygen.util.a.INSTANCE;
            LocalDate localDateE = companion.e(lastDataTime);
            long j2 = 2;
            LocalDate localDateMinusDays = localDateE.minusDays(this.ONECE_REQUEST_COUNT / j2);
            Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "lastDate.minusDays(ONECE_REQUEST_COUNT / 2)");
            long jMax = Math.max(companion.g(localDateMinusDays), companion.d());
            LocalDate localDatePlusDays = localDateE.plusDays(this.ONECE_REQUEST_COUNT / j2);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "lastDate.plusDays(ONECE_REQUEST_COUNT / 2)");
            h(new a.C0302a(lastDataTime), jMax, Math.min(companion.g(localDatePlusDays), this.MAX_DATE_TIME) - ((long) 1000));
        }
    }

    public final void e(@NotNull List<? extends qk1> newDataList) {
        Intrinsics.checkNotNullParameter(newDataList, "newDataList");
        final BloodOxygenDayPagerHelper$notifyNewData$1 bloodOxygenDayPagerHelper$notifyNewData$1 = new Function2<qk1, qk1, Integer>() { // from class: com.heytap.health.bloodoxygen.util.BloodOxygenDayPagerHelper$notifyNewData$1
            @Override // p010kotlin.jvm.functions.Function2
            @NotNull
            public final Integer invoke(@NotNull qk1 o1, @NotNull qk1 o2) {
                Intrinsics.checkNotNullParameter(o1, "o1");
                Intrinsics.checkNotNullParameter(o2, "o2");
                return Integer.valueOf(Intrinsics.compare(o1.d(), o2.d()));
            }
        };
        CollectionsKt___CollectionsKt.sortedWith(newDataList, new Comparator() { // from class: com.oplus.aiunit.vision.hl1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return BloodOxygenDayPagerHelper.f(bloodOxygenDayPagerHelper$notifyNewData$1, obj, obj2);
            }
        });
        qk1 qk1Var = (qk1) CollectionsKt___CollectionsKt.firstOrNull((List) newDataList);
        if (qk1Var != null) {
            jq0.c(this.TAG, "setNewData() type=" + this.mRequestType + " startTime=" + x05.a(qk1Var.b(), "yyyy-MM-dd HH:mm:ss"));
        }
        qk1 qk1Var2 = (qk1) CollectionsKt___CollectionsKt.lastOrNull((List) newDataList);
        if (qk1Var2 != null) {
            jq0.c(this.TAG, "setNewData() type=" + this.mRequestType + " endTime=" + x05.a(qk1Var2.getChartEndTime(), "yyyy-MM-dd HH:mm:ss"));
        }
        a aVar = this.mRequestType;
        int i = 0;
        if (aVar instanceof a.e) {
            this.mDataList.addAll(0, newDataList);
            while (this.mDataList.size() > this.MAX_SIZE) {
                List<qk1> list = this.mDataList;
                list.remove(CollectionsKt__CollectionsKt.getLastIndex(list));
            }
            this.curIndex = Math.min(newDataList.size(), this.mDataList.size() - 1);
        } else if (aVar instanceof a.c) {
            int size = this.mDataList.size();
            this.mDataList.addAll(newDataList);
            int i2 = 0;
            while (this.mDataList.size() > this.MAX_SIZE) {
                i2++;
                this.mDataList.remove(0);
            }
            this.curIndex = (size - 1) - i2;
        } else if (aVar instanceof a.b) {
            this.mDataList.clear();
            this.mDataList.addAll(newDataList);
            this.curIndex = this.mDataList.size() / 2;
            a aVar2 = this.mRequestType;
            Intrinsics.checkNotNull(aVar2, "null cannot be cast to non-null type com.heytap.health.bloodoxygen.util.BloodOxygenDayPagerHelper.RequestType.JUMP");
            long dayStartTime = ((a.b) aVar2).getDayStartTime();
            for (Object obj : this.mDataList) {
                int i3 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                if (dayStartTime == ((qk1) obj).d()) {
                    jq0.c(this.TAG, "setNewData() findJumpIndex=" + this.curIndex + "; time=" + x05.a(dayStartTime, "yyyy-MM-dd HH:mm:ss"));
                    this.curIndex = i;
                }
                i = i3;
            }
        } else if (aVar instanceof a.C0302a) {
            this.mDataList.clear();
            this.mDataList.addAll(newDataList);
            a aVar3 = this.mRequestType;
            Intrinsics.checkNotNull(aVar3, "null cannot be cast to non-null type com.heytap.health.bloodoxygen.util.BloodOxygenDayPagerHelper.RequestType.DEFAULT");
            long lastDataTime = ((a.C0302a) aVar3).getLastDataTime();
            this.curIndex = this.mDataList.isEmpty() ? 0 : this.mDataList.size() - 1;
            int i4 = 0;
            for (Object obj2 : this.mDataList) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                qk1 qk1Var3 = (qk1) obj2;
                if (lastDataTime <= qk1Var3.c() && qk1Var3.d() <= lastDataTime) {
                    jq0.c(this.TAG, "setNewData() loadDefault=" + this.curIndex + "; lastDateTime=" + x05.a(lastDataTime, "yyyy-MM-dd HH:mm:ss"));
                    this.curIndex = i4;
                }
                i4 = i5;
            }
        }
        jq0.c(this.TAG, "setNewData() type=" + this.mRequestType + " newSize=" + newDataList.size() + "; dataSize=" + this.mDataList.size() + "; selectIndex=" + this.curIndex + ";");
        this.onDataCompleteCallBack.invoke(this.mDataList, Integer.valueOf(this.curIndex));
        this.mRequestType = a.d.INSTANCE;
    }

    public final void g(int index) {
        jq0.c(this.TAG, "onIndexChange() type=" + this.mRequestType + "; index=" + index + ";");
        if (this.mRequestType instanceof a.d) {
            qk1 qk1Var = (qk1) CollectionsKt___CollectionsKt.firstOrNull((List) this.mDataList);
            Long lValueOf = qk1Var != null ? Long.valueOf(qk1Var.d()) : null;
            qk1 qk1Var2 = (qk1) CollectionsKt___CollectionsKt.lastOrNull((List) this.mDataList);
            Long lValueOf2 = qk1Var2 != null ? Long.valueOf(qk1Var2.c() - 1000) : null;
            if (index == 0 && lValueOf != null) {
                long jLongValue = lValueOf.longValue();
                com.heytap.health.bloodoxygen.util.a.Companion companion = com.heytap.health.bloodoxygen.util.a.INSTANCE;
                if (jLongValue <= companion.d()) {
                    jq0.c(this.TAG, "onIndexChange() pre scroll to start!!");
                    return;
                }
                a.e eVar = a.e.INSTANCE;
                this.mRequestType = eVar;
                LocalDate localDateMinusDays = companion.e(lValueOf.longValue()).minusDays(this.ONECE_REQUEST_COUNT);
                Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "BODateUtil.getLocalDate(…Days(ONECE_REQUEST_COUNT)");
                h(eVar, Math.max(companion.g(localDateMinusDays), companion.d()), lValueOf.longValue() - ((long) 1000));
                return;
            }
            if (index != this.mDataList.size() - 1 || lValueOf2 == null) {
                return;
            }
            long jLongValue2 = lValueOf2.longValue();
            com.heytap.health.bloodoxygen.util.a.Companion companion2 = com.heytap.health.bloodoxygen.util.a.INSTANCE;
            if (jLongValue2 >= companion2.b()) {
                jq0.c(this.TAG, "onIndexChange() next scroll to end!! ");
                return;
            }
            a.c cVar = a.c.INSTANCE;
            this.mRequestType = cVar;
            LocalDate localDatePlusDays = companion2.e(lValueOf2.longValue()).plusDays(this.ONECE_REQUEST_COUNT);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "BODateUtil.getLocalDate(…Days(ONECE_REQUEST_COUNT)");
            h(cVar, lValueOf2.longValue(), Math.min(companion2.g(localDatePlusDays), this.MAX_DATE_TIME) - ((long) 1000));
        }
    }

    public final void h(a requestType, long startTime, long endTime) {
        this.mRequestType = requestType;
        jq0.c(this.TAG, "startRequestData() main thread=" + Thread.currentThread());
        this.requestDataScope.invoke(Long.valueOf(startTime), Long.valueOf(endTime));
    }
}
