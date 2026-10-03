package com.heytap.health.stress.util;

import com.heytap.health.stress.bean.StressDayBean;
import com.heytap.health.stress.util.StressDayPaging;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a0j;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.x05;
import io.protostuff.MapSchema;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
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

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0017\u0018\u0000 62\u00020\u0001:\u0002\u001d\u0005B}\u00126\u0010\u001f\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00040\u001a\u0012<\u0010\"\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070 ¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u001a¢\u0006\u0004\b4\u00105J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ \u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\nH\u0002J\f\u0010\u0018\u001a\u00020\n*\u00020\rH\u0002J\b\u0010\u0019\u001a\u00020\nH\u0002RD\u0010\u001f\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eRJ\u0010\"\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070 ¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010$\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010#R\"\u0010)\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010#\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010*R\u0016\u0010.\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R(\u00103\u001a\b\u0012\u0004\u0012\u00020\u00070 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010/\u001a\u0004\b,\u00100\"\u0004\b1\u00102¨\u00067"}, d2 = {"Lcom/heytap/health/stress/util/StressDayPaging;", "", "", "index", "", "b", "", "Lcom/heytap/health/stress/bean/StressDayBean;", "newDataList", "i", "", "lastDataTime", b2n.g, "Ljava/time/LocalDate;", "date", b2n.f, "Lcom/heytap/health/stress/util/StressDayPaging$b;", "requestType", "startTime", "endTime", "n", MapSchema.FIELD_NAME_KEY, "timestamp", MapSchema.FIELD_NAME_ENTRY, LogFieldKey.MESSAGE_KEY, "c", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "a", "Lkotlin/jvm/functions/Function2;", "requestDataScope", "", "dataList", "onDataCompleteCallBack", "J", "MAX_DATE_TIME", "d", "()J", LogFieldKey.LEVEL_KEY, "(J)V", "firstDataTime", "I", "curIndex", "f", "Lcom/heytap/health/stress/util/StressDayPaging$b;", "mRequestType", "Ljava/util/List;", "()Ljava/util/List;", "setMDataList", "(Ljava/util/List;)V", "mDataList", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "Companion", "stress_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStressDayPaging.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StressDayPaging.kt\ncom/heytap/health/stress/util/StressDayPaging\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,267:1\n1864#2,3:268\n1864#2,3:271\n*S KotlinDebug\n*F\n+ 1 StressDayPaging.kt\ncom/heytap/health/stress/util/StressDayPaging\n*L\n164#1:268,3\n190#1:271,3\n*E\n"})
public final class StressDayPaging {
    public static final int MAX_SIZE = 30;
    public static final long SINGLE_REQUEST_COUNT = 10;

    @NotNull
    public static final String TAG = "StressDayPaging";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function2<Long, Long, Unit> requestDataScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function2<List<StressDayBean>, Integer, Unit> onDataCompleteCallBack;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long MAX_DATE_TIME;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long firstDataTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int curIndex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public b mRequestType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public List<StressDayBean> mDataList;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/stress/util/StressDayPaging$b;", "", "<init>", "()V", "a", "b", "c", "d", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/stress/util/StressDayPaging$b$a;", "Lcom/heytap/health/stress/util/StressDayPaging$b$b;", "Lcom/heytap/health/stress/util/StressDayPaging$b$c;", "Lcom/heytap/health/stress/util/StressDayPaging$b$d;", "Lcom/heytap/health/stress/util/StressDayPaging$b$e;", "stress_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/heytap/health/stress/util/StressDayPaging$b$a;", "Lcom/heytap/health/stress/util/StressDayPaging$b;", "", "a", "J", "()J", "lastDataTime", "<init>", "(J)V", "stress_release"}, k = 1, mv = {1, 8, 0})
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            public final long lastDataTime;

            public a(long j2) {
                super(null);
                this.lastDataTime = j2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final long getLastDataTime() {
                return this.lastDataTime;
            }
        }

        /* JADX INFO: renamed from: com.heytap.health.stress.util.StressDayPaging$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/heytap/health/stress/util/StressDayPaging$b$b;", "Lcom/heytap/health/stress/util/StressDayPaging$b;", "", "a", "J", "()J", "dayStartTime", "<init>", "(J)V", "stress_release"}, k = 1, mv = {1, 8, 0})
        public static final class C0650b extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            public final long dayStartTime;

            public C0650b(long j2) {
                super(null);
                this.dayStartTime = j2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final long getDayStartTime() {
                return this.dayStartTime;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/stress/util/StressDayPaging$b$c;", "Lcom/heytap/health/stress/util/StressDayPaging$b;", "<init>", "()V", "stress_release"}, k = 1, mv = {1, 8, 0})
        public static final class c extends b {

            @NotNull
            public static final c INSTANCE = new c();

            public c() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/stress/util/StressDayPaging$b$d;", "Lcom/heytap/health/stress/util/StressDayPaging$b;", "<init>", "()V", "stress_release"}, k = 1, mv = {1, 8, 0})
        public static final class d extends b {

            @NotNull
            public static final d INSTANCE = new d();

            public d() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/stress/util/StressDayPaging$b$e;", "Lcom/heytap/health/stress/util/StressDayPaging$b;", "<init>", "()V", "stress_release"}, k = 1, mv = {1, 8, 0})
        public static final class e extends b {

            @NotNull
            public static final e INSTANCE = new e();

            public e() {
                super(null);
            }
        }

        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StressDayPaging(@NotNull Function2<? super Long, ? super Long, Unit> requestDataScope, @NotNull Function2<? super List<StressDayBean>, ? super Integer, Unit> onDataCompleteCallBack) {
        Intrinsics.checkNotNullParameter(requestDataScope, "requestDataScope");
        Intrinsics.checkNotNullParameter(onDataCompleteCallBack, "onDataCompleteCallBack");
        this.requestDataScope = requestDataScope;
        this.onDataCompleteCallBack = onDataCompleteCallBack;
        LocalDate localDatePlusDays = LocalDate.now().plusDays(1L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "now().plusDays(1)");
        this.MAX_DATE_TIME = m(localDatePlusDays);
        this.firstDataTime = 1546272000000L;
        this.curIndex = -1;
        this.mRequestType = b.d.INSTANCE;
        this.mDataList = new ArrayList();
    }

    public static final int j(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    public final void b(int index) {
        this.curIndex = index;
        k(index);
    }

    public final long c() {
        return LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getFirstDataTime() {
        return this.firstDataTime;
    }

    public final LocalDate e(long timestamp) {
        LocalDate localDate = LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()).toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "ofInstant(Instant.ofEpoc…           .toLocalDate()");
        return localDate;
    }

    @NotNull
    public final List<StressDayBean> f() {
        return this.mDataList;
    }

    public final void g(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.mRequestType = new b.C0650b(m(date));
        LocalDate localDateMinusDays = date.minusDays(5L);
        Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "date.minusDays(SINGLE_REQUEST_COUNT / 2)");
        long jMax = Math.max(m(localDateMinusDays), this.firstDataTime);
        LocalDate localDatePlusDays = date.plusDays(5L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "date.plusDays(SINGLE_REQUEST_COUNT / 2)");
        n(new b.C0650b(m(date)), jMax, Math.min(m(localDatePlusDays), this.MAX_DATE_TIME) - ((long) 1000));
    }

    public final void h(long lastDataTime) {
        this.mRequestType = new b.a(lastDataTime);
        LocalDate localDateE = e(lastDataTime);
        LocalDate localDateMinusDays = localDateE.minusDays(5L);
        Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "lastDate.minusDays(SINGLE_REQUEST_COUNT / 2)");
        long jMax = Math.max(m(localDateMinusDays), this.firstDataTime);
        LocalDate localDatePlusDays = localDateE.plusDays(5L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "lastDate.plusDays(SINGLE_REQUEST_COUNT / 2)");
        n(new b.a(lastDataTime), jMax, Math.min(m(localDatePlusDays), this.MAX_DATE_TIME) - ((long) 1000));
    }

    public final void i(@NotNull List<? extends StressDayBean> newDataList) {
        Intrinsics.checkNotNullParameter(newDataList, "newDataList");
        final StressDayPaging$notifyNewData$1 stressDayPaging$notifyNewData$1 = new Function2<StressDayBean, StressDayBean, Integer>() { // from class: com.heytap.health.stress.util.StressDayPaging$notifyNewData$1
            @Override // p010kotlin.jvm.functions.Function2
            @NotNull
            public final Integer invoke(@NotNull StressDayBean o1, @NotNull StressDayBean o2) {
                Intrinsics.checkNotNullParameter(o1, "o1");
                Intrinsics.checkNotNullParameter(o2, "o2");
                return Integer.valueOf(Intrinsics.compare(o1.getStartTime(), o2.getStartTime()));
            }
        };
        CollectionsKt___CollectionsKt.sortedWith(newDataList, new Comparator() { // from class: com.oplus.aiunit.vision.txi
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return StressDayPaging.j(stressDayPaging$notifyNewData$1, obj, obj2);
            }
        });
        StressDayBean stressDayBean = (StressDayBean) CollectionsKt___CollectionsKt.firstOrNull((List) newDataList);
        if (stressDayBean != null) {
            a0j.c(TAG, "setNewData() type=" + this.mRequestType + " startTime=" + x05.a(stressDayBean.getStartTime(), "yyyy-MM-dd HH:mm:ss"));
        }
        StressDayBean stressDayBean2 = (StressDayBean) CollectionsKt___CollectionsKt.lastOrNull((List) newDataList);
        if (stressDayBean2 != null) {
            a0j.c(TAG, "setNewData() type=" + this.mRequestType + " endTime=" + x05.a(stressDayBean2.getChartEndTime(), "yyyy-MM-dd HH:mm:ss"));
        }
        b bVar = this.mRequestType;
        int i = 0;
        if (bVar instanceof b.e) {
            this.mDataList.addAll(0, newDataList);
            this.curIndex = newDataList.size();
        } else if (bVar instanceof b.c) {
            int size = this.mDataList.size();
            this.mDataList.addAll(newDataList);
            this.curIndex = (size - 1) - 0;
        } else if (bVar instanceof b.C0650b) {
            this.mDataList.clear();
            this.mDataList.addAll(newDataList);
            this.curIndex = this.mDataList.size() / 2;
            b bVar2 = this.mRequestType;
            Intrinsics.checkNotNull(bVar2, "null cannot be cast to non-null type com.heytap.health.stress.util.StressDayPaging.RequestType.JUMP");
            long dayStartTime = ((b.C0650b) bVar2).getDayStartTime();
            for (Object obj : this.mDataList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                if (dayStartTime == ((StressDayBean) obj).getStartTime()) {
                    a0j.c(TAG, "setNewData() findJumpIndex=" + this.curIndex + "; time=" + x05.a(dayStartTime, "yyyy-MM-dd HH:mm:ss"));
                    this.curIndex = i;
                }
                i = i2;
            }
        } else if (bVar instanceof b.a) {
            this.mDataList.clear();
            this.mDataList.addAll(newDataList);
            b bVar3 = this.mRequestType;
            Intrinsics.checkNotNull(bVar3, "null cannot be cast to non-null type com.heytap.health.stress.util.StressDayPaging.RequestType.DEFAULT");
            long lastDataTime = ((b.a) bVar3).getLastDataTime();
            this.curIndex = this.mDataList.isEmpty() ? 0 : this.mDataList.size() - 1;
            LocalDate localDateE = e(lastDataTime);
            a0j.c(TAG, "setNewData() loadDefault=" + this.curIndex + "; lastDateTime=" + localDateE);
            for (Object obj2 : this.mDataList) {
                int i3 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                StressDayBean stressDayBean3 = (StressDayBean) obj2;
                if (e(stressDayBean3.getStartTime()).isEqual(localDateE)) {
                    a0j.c(TAG, "setNewData() loadDefault=" + this.curIndex + "; equal stressDateTime=" + stressDayBean3.getStartTime());
                    this.curIndex = i;
                }
                i = i3;
            }
        }
        a0j.c(TAG, "setNewData() type=" + this.mRequestType + " newSize=" + newDataList.size() + "; dataSize=" + this.mDataList.size() + "; selectIndex=" + this.curIndex + ";");
        this.onDataCompleteCallBack.invoke(this.mDataList, Integer.valueOf(this.curIndex));
        this.mRequestType = b.d.INSTANCE;
    }

    public final void k(int index) {
        a0j.c(TAG, "onIndexChange() type=" + this.mRequestType + "; index=" + index + ";");
        if (this.mRequestType instanceof b.d) {
            StressDayBean stressDayBean = (StressDayBean) CollectionsKt___CollectionsKt.firstOrNull((List) this.mDataList);
            Long lValueOf = stressDayBean != null ? Long.valueOf(stressDayBean.getStartTime()) : null;
            StressDayBean stressDayBean2 = (StressDayBean) CollectionsKt___CollectionsKt.lastOrNull((List) this.mDataList);
            Long lValueOf2 = stressDayBean2 != null ? Long.valueOf(stressDayBean2.getChartEndTime() - 1000) : null;
            if (index == 0 && lValueOf != null) {
                if (lValueOf.longValue() <= this.firstDataTime) {
                    a0j.c(TAG, "onIndexChange() pre scroll to start!!");
                    return;
                }
                b.e eVar = b.e.INSTANCE;
                this.mRequestType = eVar;
                LocalDate localDateMinusDays = e(lValueOf.longValue()).minusDays(10L);
                Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "getLocalDate(dataStartTi…ays(SINGLE_REQUEST_COUNT)");
                n(eVar, Math.max(m(localDateMinusDays), this.firstDataTime), lValueOf.longValue() - ((long) 1000));
                return;
            }
            if (index != this.mDataList.size() - 1 || lValueOf2 == null) {
                return;
            }
            if (lValueOf2.longValue() >= c()) {
                a0j.c(TAG, "onIndexChange() next scroll to end!! ");
                return;
            }
            b.c cVar = b.c.INSTANCE;
            this.mRequestType = cVar;
            LocalDate localDatePlusDays = e(lValueOf2.longValue()).plusDays(10L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "getLocalDate(dataEndTime…ays(SINGLE_REQUEST_COUNT)");
            long jMin = Math.min(m(localDatePlusDays), this.MAX_DATE_TIME);
            LocalDate localDatePlusDays2 = e(lValueOf2.longValue()).plusDays(1L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays2, "getLocalDate(dataEndTime).plusDays(1)");
            n(cVar, m(localDatePlusDays2), jMin - ((long) 1000));
        }
    }

    public final void l(long j2) {
        this.firstDataTime = j2;
    }

    public final long m(LocalDate localDate) {
        return localDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public final void n(b requestType, long startTime, long endTime) {
        this.mRequestType = requestType;
        a0j.c(TAG, "startRequestData() main thread=" + Thread.currentThread());
        this.requestDataScope.invoke(Long.valueOf(startTime), Long.valueOf(endTime));
    }
}
