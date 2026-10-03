package com.health.sleep_breath_rate.day.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.health.sleep_breath_rate.day.SleepBRDayFragment;
import com.health.sleep_breath_rate.day.viewmodel.SleepBRDayControlModel;
import com.health.sleep_breath_rate.day.viewmodel.SleepBRDayViewModel;
import com.heytap.databaseengine.model.newsleep.BreathRateStat;
import com.oplus.aiunit.vision.bdh;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.w0b;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 H2\u00020\u0001:\u0002\u001e$B'\u0012\u0006\u0010\"\u001a\u00020\u001d\u0012\u0006\u0010(\u001a\u00020#\u0012\u0006\u0010.\u001a\u00020)\u0012\u0006\u00104\u001a\u00020/¢\u0006\u0004\bF\u0010GJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\r\u001a\u00020\u0004H\u0002J\u001e\u0010\u0011\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\nH\u0002J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0002J\u0016\u0010\u001c\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015H\u0002R\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010(\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010.\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u00104\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00106\u001a\u0004\b;\u00108\"\u0004\b<\u0010:R8\u0010?\u001a&\u0012\f\u0012\n =*\u0004\u0018\u00010\u001a0\u001a =*\u0012\u0012\f\u0012\n =*\u0004\u0018\u00010\u001a0\u001a\u0018\u00010\u000e0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010>R\u0016\u0010@\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00106R\u0016\u0010B\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010AR \u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00150C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010D¨\u0006I"}, d2 = {"Lcom/health/sleep_breath_rate/day/util/SleepBRDataLoadUtils;", "", "", "defaultTime", "", "j", "(Ljava/lang/Long;)V", "timestamp", "f", "curTime", "", "rangeDay", "k", "p", "", "allDataList", "currentItem", "o", "borderStartTime", "borderEndTime", "curSelectTime", "", "h", "startTime", "endTime", "l", "Lcom/oplus/aiunit/vision/bdh;", "sleepHRDayBeanList", "g", "Lcom/health/sleep_breath_rate/day/SleepBRDayFragment;", "a", "Lcom/health/sleep_breath_rate/day/SleepBRDayFragment;", "getFragment", "()Lcom/health/sleep_breath_rate/day/SleepBRDayFragment;", "fragment", "Lcom/health/sleep_breath_rate/day/viewmodel/SleepBRDayViewModel;", "b", "Lcom/health/sleep_breath_rate/day/viewmodel/SleepBRDayViewModel;", "getDayViewModel", "()Lcom/health/sleep_breath_rate/day/viewmodel/SleepBRDayViewModel;", "dayViewModel", "Lcom/health/sleep_breath_rate/day/viewmodel/SleepBRDayControlModel;", "c", "Lcom/health/sleep_breath_rate/day/viewmodel/SleepBRDayControlModel;", "i", "()Lcom/health/sleep_breath_rate/day/viewmodel/SleepBRDayControlModel;", "sleepDayControlModel", "Lcom/health/sleep_breath_rate/day/util/SleepBRDataLoadUtils$b;", "d", "Lcom/health/sleep_breath_rate/day/util/SleepBRDataLoadUtils$b;", "getListener", "()Lcom/health/sleep_breath_rate/day/util/SleepBRDataLoadUtils$b;", "listener", "e", "J", "getBorderStartTime", "()J", "n", "(J)V", "getBorderEndTime", "m", "kotlin.jvm.PlatformType", "Ljava/util/List;", "dataCacheList", "curSelectDayTime", "I", "currentItemIndex", "Landroidx/lifecycle/Observer;", "Landroidx/lifecycle/Observer;", "sleepDataListObserver", "<init>", "(Lcom/health/sleep_breath_rate/day/SleepBRDayFragment;Lcom/health/sleep_breath_rate/day/viewmodel/SleepBRDayViewModel;Lcom/health/sleep_breath_rate/day/viewmodel/SleepBRDayControlModel;Lcom/health/sleep_breath_rate/day/util/SleepBRDataLoadUtils$b;)V", "Companion", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
public final class SleepBRDataLoadUtils {

    @NotNull
    public final SleepBRDayFragment a;

    @NotNull
    public final SleepBRDayViewModel b;

    @NotNull
    public final SleepBRDayControlModel c;

    @NotNull
    public final b d;
    public long e;
    public long f;
    public final List<bdh> g;
    public long h;
    public int i;

    @NotNull
    public final Observer<List<bdh>> j;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J(\u0010\u000f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\nH&J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\nH&J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0013"}, d2 = {"Lcom/health/sleep_breath_rate/day/util/SleepBRDataLoadUtils$b;", "", "", "", "allDataList", "", "currentItem", "", "a", "", "Lcom/oplus/aiunit/vision/bdh;", "dataList", "", "needRefreshView", "curData", "c", "d", "timestamp", "b", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
        void a(@NotNull List<Long> allDataList, int currentItem);

        void b(long timestamp, int currentItem);

        void c(@NotNull List<bdh> dataList, boolean needRefreshView, @Nullable bdh curData);

        void d(@NotNull bdh curData);
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public c(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "function");
            this.i = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.i;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.i.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/oplus/aiunit/vision/bdh;", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class d implements Observer<List<bdh>> {
        public d() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@NotNull List<bdh> list) {
            Intrinsics.checkNotNullParameter(list, "it");
            m8b.f("SleepBRDataLoadUtils", "getDayList size:" + list.size());
            SleepBRDataLoadUtils.this.g(list);
        }
    }

    public SleepBRDataLoadUtils(@NotNull SleepBRDayFragment sleepBRDayFragment, @NotNull SleepBRDayViewModel sleepBRDayViewModel, @NotNull SleepBRDayControlModel sleepBRDayControlModel, @NotNull b bVar) {
        Intrinsics.checkNotNullParameter(sleepBRDayFragment, "fragment");
        Intrinsics.checkNotNullParameter(sleepBRDayViewModel, "dayViewModel");
        Intrinsics.checkNotNullParameter(sleepBRDayControlModel, "sleepDayControlModel");
        Intrinsics.checkNotNullParameter(bVar, "listener");
        this.a = sleepBRDayFragment;
        this.b = sleepBRDayViewModel;
        this.c = sleepBRDayControlModel;
        this.d = bVar;
        this.g = Collections.synchronizedList(new ArrayList());
        this.j = new d();
    }

    public final void f(long timestamp) {
        int iM = (int) pr8.INSTANCE.m(this.e, timestamp);
        this.i = iM;
        this.d.b(timestamp, iM);
    }

    public final void g(List<bdh> sleepHRDayBeanList) {
        bdh bdhVar;
        int size = sleepHRDayBeanList.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                bdhVar = null;
                break;
            }
            bdhVar = sleepHRDayBeanList.get(i);
            m8b.f("SleepBRDataLoadUtils", "callBackDataList curSelectDayTime:" + this.h + " ,timestamp:" + bdhVar.getA());
            if (this.h == bdhVar.getA()) {
                z = true;
                break;
            }
            i++;
        }
        this.g.clear();
        this.g.addAll(sleepHRDayBeanList);
        if (z) {
            b bVar = this.d;
            Intrinsics.checkNotNull(bdhVar);
            bVar.d(bdhVar);
        }
        b bVar2 = this.d;
        List<bdh> list = this.g;
        Intrinsics.checkNotNullExpressionValue(list, "dataCacheList");
        bVar2.c(list, z, bdhVar);
    }

    public final List<Long> h(long borderStartTime, long borderEndTime, long curSelectTime) {
        this.e = borderStartTime;
        this.f = borderEndTime;
        long jM = pr8.INSTANCE.m(borderStartTime, borderEndTime);
        ArrayList arrayList = new ArrayList();
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(borderStartTime), zoneIdSystemDefault);
        long j = 0;
        if (0 <= jM) {
            while (true) {
                arrayList.add(Long.valueOf(LocalDateTime.of(localDateTimeOfInstant.toLocalDate().plusDays(j), LocalTime.MIN).atZone(zoneIdSystemDefault).toInstant().toEpochMilli()));
                if (j == jM) {
                    break;
                }
                j++;
            }
        }
        pr8 pr8Var = pr8.INSTANCE;
        int iM = (int) pr8Var.m(borderStartTime, curSelectTime);
        this.i = iM;
        if (iM >= arrayList.size()) {
            this.i = arrayList.size() - 1;
        }
        m8b.f("SleepBRDataLoadUtils", "borderStartTime:" + pr8Var.q(borderStartTime, "yyy-MM-dd HH:mm") + " ,borderEndTime:" + pr8Var.q(borderEndTime, "yyy-MM-dd HH:mm") + " ,daysNum:" + jM + " ,currentItemIndex:" + this.i);
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final SleepBRDayControlModel getC() {
        return this.c;
    }

    public final void j(@Nullable final Long defaultTime) {
        this.b.x().observe(this.a, new c(new Function1<List<BreathRateStat>, Unit>() { // from class: com.health.sleep_breath_rate.day.util.SleepBRDataLoadUtils$initLastDataTime$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<BreathRateStat>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(List<BreathRateStat> list) {
                if (w0b.a(list)) {
                    this.this$0.p();
                    return;
                }
                pr8 pr8Var = pr8.INSTANCE;
                long jG = pr8Var.g(list.get(0).getDate());
                long jG2 = pr8Var.g(list.get(list.size() - 1).getDate());
                m8b.f("SleepBRDataLoadUtils", "fetchLastDataTime firstDataTime:" + jG + " ,lastDataTime:" + jG2);
                long jC = pr8Var.c(System.currentTimeMillis());
                this.this$0.getC().A(jG);
                this.this$0.getC().z(jC);
                this.this$0.n(jG);
                this.this$0.m(jC);
                SleepBRDataLoadUtils sleepBRDataLoadUtils = this.this$0;
                Long l = defaultTime;
                List listH = sleepBRDataLoadUtils.h(jG, jC, l != null ? l.longValue() : jG2);
                SleepBRDataLoadUtils sleepBRDataLoadUtils2 = this.this$0;
                sleepBRDataLoadUtils2.o(listH, sleepBRDataLoadUtils2.i);
            }
        }));
        this.b.w().observe(this.a, this.j);
        if (System.currentTimeMillis() < 1546257600000L) {
            p();
        } else {
            this.b.A();
        }
    }

    public final void k(long curTime, int rangeDay) {
        this.h = curTime;
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            bdh bdhVar = this.g.get(i);
            if (bdhVar.getA() == curTime) {
                m8b.f("SleepBRDataLoadUtils", "cache has data");
                b bVar = this.d;
                Intrinsics.checkNotNullExpressionValue(bdhVar, "data");
                bVar.d(bdhVar);
                return;
            }
        }
        long j = (rangeDay / 2) * 86400000;
        l(curTime - j, curTime + j);
    }

    public final void l(long startTime, long endTime) {
        long j = this.e;
        if (endTime < j) {
            m8b.f("SleepBRDataLoadUtils", "end of start time");
            return;
        }
        long j2 = this.f;
        if (1 <= j2 && j2 < startTime) {
            m8b.f("SleepBRDataLoadUtils", "end time end");
            return;
        }
        if (startTime < j) {
            startTime = j;
        }
        if (1 <= j2 && j2 < endTime) {
            endTime = j2;
        }
        pr8 pr8Var = pr8.INSTANCE;
        m8b.f("SleepBRDataLoadUtils", "loading borderStartTime:" + pr8Var.q(j, "yyy-MM-dd HH:mm") + ", borderEndTime:" + pr8Var.q(this.f, "yyy-MM-dd HH:mm") + ", sendStartTimestamp:" + pr8Var.q(startTime, "yyy-MM-dd HH:mm") + ", sendEndTimestamp:" + pr8Var.q(endTime, "yyy-MM-dd HH:mm"));
        this.b.z(pr8Var.o(startTime), pr8Var.n(endTime));
    }

    public final void m(long j) {
        this.f = j;
    }

    public final void n(long j) {
        this.e = j;
    }

    public final void o(List<Long> allDataList, int currentItem) {
        m8b.f("SleepBRDataLoadUtils", "allDataList:" + allDataList.size() + " ,currentItemIndex:" + currentItem);
        this.d.a(allDataList, currentItem);
    }

    public final void p() {
        m8b.f("SleepBRDataLoadUtils", "updateChartEmptyData");
        long jC = pr8.INSTANCE.c(System.currentTimeMillis());
        o(h(jC, jC, jC), this.i);
    }
}
