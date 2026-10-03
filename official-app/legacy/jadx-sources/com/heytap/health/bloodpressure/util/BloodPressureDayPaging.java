package com.heytap.health.bloodpressure.util;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.bloodpressure.bean.BloodPressureDayBean;
import com.heytap.health.bloodpressure.util.BloodPressureDayPaging;
import com.oplus.aiunit.vision.aq8;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.lq0;
import com.oplus.aiunit.vision.v05;
import io.protostuff.MapSchema;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 *2\u00020\u0001:\u0002\u0015\fB\u001f\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b(\u0010)J\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\nH\u0002J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\"\u0010$\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010 \u001a\u0004\b\u001a\u0010!\"\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010&¨\u0006+"}, d2 = {"Lcom/heytap/health/bloodpressure/util/BloodPressureDayPaging;", "", "", "startTime", "", "Lcom/heytap/health/bloodpressure/bean/BloodPressureDayBean;", b2n.g, "defaultStartTime", "", "f", "", "index", "b", "newDataList", "j", MapSchema.FIELD_NAME_ENTRY, "timestamp", "d", "position", b2n.f, "i", "a", "J", "mStartTime", "mEndTime", "Lcom/oplus/aiunit/vision/aq8;", "c", "Lcom/oplus/aiunit/vision/aq8;", "mListener", "", "Ljava/util/List;", "mDataList", "I", "()I", "setCurIndex", "(I)V", "curIndex", "Lcom/heytap/health/bloodpressure/util/BloodPressureDayPaging$b;", "Lcom/heytap/health/bloodpressure/util/BloodPressureDayPaging$b;", "mRequestType", "<init>", "(JJLcom/oplus/aiunit/vision/aq8;)V", "Companion", "blood_pressure_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBloodPressureDayPaging.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodPressureDayPaging.kt\ncom/heytap/health/bloodpressure/util/BloodPressureDayPaging\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,252:1\n1864#2,3:253\n1864#2,3:256\n1864#2,3:259\n*S KotlinDebug\n*F\n+ 1 BloodPressureDayPaging.kt\ncom/heytap/health/bloodpressure/util/BloodPressureDayPaging\n*L\n173#1:253,3\n186#1:256,3\n207#1:259,3\n*E\n"})
public final class BloodPressureDayPaging {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long mStartTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long mEndTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final aq8 mListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<BloodPressureDayBean> mDataList;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int curIndex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public b mRequestType;
    public static final int $stable = 8;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/bloodpressure/util/BloodPressureDayPaging$b;", "", "<init>", "()V", "a", "b", "c", "d", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/bloodpressure/util/BloodPressureDayPaging$b$a;", "Lcom/heytap/health/bloodpressure/util/BloodPressureDayPaging$b$b;", "Lcom/heytap/health/bloodpressure/util/BloodPressureDayPaging$b$c;", "Lcom/heytap/health/bloodpressure/util/BloodPressureDayPaging$b$d;", "Lcom/heytap/health/bloodpressure/util/BloodPressureDayPaging$b$e;", "blood_pressure_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class b {
        public static final int $stable = 0;

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/heytap/health/bloodpressure/util/BloodPressureDayPaging$b$a;", "Lcom/heytap/health/bloodpressure/util/BloodPressureDayPaging$b;", "", "a", "J", "()J", "dayStartTime", "<init>", "(J)V", "blood_pressure_release"}, k = 1, mv = {1, 8, 0})
        public static final class a extends b {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            public final long dayStartTime;

            public a(long j2) {
                super(null);
                this.dayStartTime = j2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final long getDayStartTime() {
                return this.dayStartTime;
            }
        }

        /* JADX INFO: renamed from: com.heytap.health.bloodpressure.util.BloodPressureDayPaging$b$b, reason: collision with other inner class name */
        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/heytap/health/bloodpressure/util/BloodPressureDayPaging$b$b;", "Lcom/heytap/health/bloodpressure/util/BloodPressureDayPaging$b;", "", "a", "J", "()J", "dayStartTime", "<init>", "(J)V", "blood_pressure_release"}, k = 1, mv = {1, 8, 0})
        public static final class C0308b extends b {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            public final long dayStartTime;

            public C0308b(long j2) {
                super(null);
                this.dayStartTime = j2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final long getDayStartTime() {
                return this.dayStartTime;
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/bloodpressure/util/BloodPressureDayPaging$b$c;", "Lcom/heytap/health/bloodpressure/util/BloodPressureDayPaging$b;", "<init>", "()V", "blood_pressure_release"}, k = 1, mv = {1, 8, 0})
        public static final class c extends b {
            public static final int $stable = 0;

            @NotNull
            public static final c INSTANCE = new c();

            public c() {
                super(null);
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/bloodpressure/util/BloodPressureDayPaging$b$d;", "Lcom/heytap/health/bloodpressure/util/BloodPressureDayPaging$b;", "<init>", "()V", "blood_pressure_release"}, k = 1, mv = {1, 8, 0})
        public static final class d extends b {
            public static final int $stable = 0;

            @NotNull
            public static final d INSTANCE = new d();

            public d() {
                super(null);
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/bloodpressure/util/BloodPressureDayPaging$b$e;", "Lcom/heytap/health/bloodpressure/util/BloodPressureDayPaging$b;", "<init>", "()V", "blood_pressure_release"}, k = 1, mv = {1, 8, 0})
        public static final class e extends b {
            public static final int $stable = 0;

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

    public BloodPressureDayPaging(long j2, long j3, @NotNull aq8 mListener) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.mStartTime = j2;
        this.mEndTime = j3;
        this.mListener = mListener;
        this.mDataList = new ArrayList();
        this.curIndex = -1;
        this.mRequestType = b.d.INSTANCE;
    }

    public static final int k(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    public final void b(int index) {
        this.curIndex = index;
        g(index);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCurIndex() {
        return this.curIndex;
    }

    public final long d(long timestamp) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()).toLocalDate().atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public final int e(long startTime) {
        int i = 0;
        int i2 = -1;
        for (Object obj : this.mDataList) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (startTime == d(((BloodPressureDayBean) obj).getStartTime())) {
                i2 = i;
            }
            i = i3;
        }
        if (i2 == -1) {
            this.mRequestType = new b.C0308b(startTime);
            i(startTime);
        }
        return i2;
    }

    public final void f(long defaultStartTime) {
        if (Intrinsics.areEqual(this.mRequestType, b.d.INSTANCE)) {
            this.mRequestType = new b.a(defaultStartTime);
            i(defaultStartTime);
        }
    }

    public final void g(int position) {
        if (this.mRequestType instanceof b.d) {
            BloodPressureDayBean bloodPressureDayBean = (BloodPressureDayBean) CollectionsKt___CollectionsKt.firstOrNull((List) this.mDataList);
            BloodPressureDayBean bloodPressureDayBean2 = (BloodPressureDayBean) CollectionsKt___CollectionsKt.lastOrNull((List) this.mDataList);
            if (position == 0 && bloodPressureDayBean != null) {
                long jD = d(bloodPressureDayBean.getStartTime());
                if (jD <= this.mStartTime) {
                    return;
                }
                this.mRequestType = b.e.INSTANCE;
                this.mListener.a(Math.max(LocalDateTime.ofInstant(Instant.ofEpochMilli(jD), ZoneId.systemDefault()).toLocalDate().minusDays(2L).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli(), this.mStartTime), jD - ((long) 1000));
                return;
            }
            if (position != this.mDataList.size() - 1 || bloodPressureDayBean2 == null) {
                return;
            }
            LocalDate localDatePlusDays = LocalDateTime.ofInstant(Instant.ofEpochMilli(bloodPressureDayBean2.getStartTime()), ZoneId.systemDefault()).toLocalDate().plusDays(1L);
            long j2 = 1000;
            if (localDatePlusDays.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli() - j2 >= this.mEndTime) {
                return;
            }
            this.mRequestType = b.c.INSTANCE;
            this.mListener.a(localDatePlusDays.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli(), Math.min(localDatePlusDays.plusDays(2L).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli() - j2, this.mEndTime));
        }
    }

    @Nullable
    public final List<BloodPressureDayBean> h(long startTime) {
        long j2 = this.mStartTime;
        this.mStartTime = startTime;
        if (startTime <= j2) {
            return null;
        }
        Iterator<BloodPressureDayBean> it = this.mDataList.iterator();
        long jD = d(startTime);
        int i = 0;
        while (it.hasNext() && d(it.next().getStartTime()) < jD) {
            it.remove();
            i++;
        }
        if (i <= 0) {
            return null;
        }
        this.curIndex = RangesKt___RangesKt.coerceAtLeast(this.curIndex - i, 0);
        return this.mDataList;
    }

    public final void i(long timestamp) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        LocalDate localDate = LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), zoneIdSystemDefault).toLocalDate();
        long jMax = Math.max(localDate.minusDays(1L).atStartOfDay(zoneIdSystemDefault).toInstant().toEpochMilli(), this.mStartTime);
        long jMin = Math.min(localDate.plusDays(2L).atStartOfDay(zoneIdSystemDefault).toInstant().toEpochMilli() - ((long) 1000), this.mEndTime);
        this.mListener.a(jMax, jMin);
        lq0.a("BloodPressureDayPaging", "startRequest: " + v05.i(timestamp) + ", startTime: " + v05.i(jMax) + ", endTime: " + v05.i(jMin));
    }

    @NotNull
    public final List<BloodPressureDayBean> j(@NotNull List<? extends BloodPressureDayBean> newDataList) {
        Intrinsics.checkNotNullParameter(newDataList, "newDataList");
        final BloodPressureDayPaging$updateData$1 bloodPressureDayPaging$updateData$1 = new Function2<BloodPressureDayBean, BloodPressureDayBean, Integer>() { // from class: com.heytap.health.bloodpressure.util.BloodPressureDayPaging$updateData$1
            @Override // p010kotlin.jvm.functions.Function2
            @NotNull
            public final Integer invoke(@NotNull BloodPressureDayBean o1, @NotNull BloodPressureDayBean o2) {
                Intrinsics.checkNotNullParameter(o1, "o1");
                Intrinsics.checkNotNullParameter(o2, "o2");
                return Integer.valueOf(Intrinsics.compare(o1.getStartTime(), o2.getStartTime()));
            }
        };
        CollectionsKt___CollectionsKt.sortedWith(newDataList, new Comparator() { // from class: com.oplus.aiunit.vision.jp1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return BloodPressureDayPaging.k(bloodPressureDayPaging$updateData$1, obj, obj2);
            }
        });
        b bVar = this.mRequestType;
        int i = 0;
        if (bVar instanceof b.e) {
            this.mDataList.addAll(0, newDataList);
            while (this.mDataList.size() > 30) {
                List<BloodPressureDayBean> list = this.mDataList;
                list.remove(CollectionsKt__CollectionsKt.getLastIndex(list));
            }
            this.curIndex = Math.min(newDataList.size(), this.mDataList.size() - 1);
        } else if (bVar instanceof b.c) {
            int size = this.mDataList.size();
            this.mDataList.addAll(newDataList);
            int i2 = 0;
            while (this.mDataList.size() > 30) {
                i2++;
                this.mDataList.remove(0);
            }
            this.curIndex = (size - 1) - i2;
        } else if (bVar instanceof b.C0308b) {
            this.mDataList.clear();
            this.mDataList.addAll(newDataList);
            this.curIndex = this.mDataList.size() / 2;
            b bVar2 = this.mRequestType;
            Intrinsics.checkNotNull(bVar2, "null cannot be cast to non-null type com.heytap.health.bloodpressure.util.BloodPressureDayPaging.RequestType.JUMP");
            long dayStartTime = ((b.C0308b) bVar2).getDayStartTime();
            for (Object obj : this.mDataList) {
                int i3 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                if (dayStartTime == d(((BloodPressureDayBean) obj).getStartTime())) {
                    this.curIndex = i;
                }
                i = i3;
            }
        } else if (bVar instanceof b.a) {
            this.mDataList.clear();
            this.mDataList.addAll(newDataList);
            b bVar3 = this.mRequestType;
            Intrinsics.checkNotNull(bVar3, "null cannot be cast to non-null type com.heytap.health.bloodpressure.util.BloodPressureDayPaging.RequestType.DEFAULT");
            long dayStartTime2 = ((b.a) bVar3).getDayStartTime();
            this.curIndex = this.mDataList.isEmpty() ? 0 : this.mDataList.size() - 1;
            for (Object obj2 : this.mDataList) {
                int i4 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                if (d(dayStartTime2) == d(((BloodPressureDayBean) obj2).getStartTime())) {
                    this.curIndex = i;
                }
                i = i4;
            }
        } else {
            lq0.a("BloodPressureDayPaging", "updateData, request type is NONE ");
        }
        lq0.a("BloodPressureDayPaging", "updateData, size: " + this.mDataList.size() + ", index: " + this.curIndex);
        this.mRequestType = b.d.INSTANCE;
        return this.mDataList;
    }
}
