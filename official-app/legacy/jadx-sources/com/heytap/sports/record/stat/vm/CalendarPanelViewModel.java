package com.heytap.sports.record.stat.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.oplus.aiunit.vision.a7b;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function4;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u000b\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002'(B\u0007¢\u0006\u0004\b$\u0010%J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004JN\u0010\u0010\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u000224\u0010\u000f\u001a0\b\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\tø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cRX\u0010#\u001a<\u0012\u0004\u0012\u00020\u0002\u00122\u00120\b\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\t0\u001e8BX\u0082\u0084\u0002ø\u0001\u0000¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/heytap/sports/record/stat/vm/CalendarPanelViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "key", "Ljava/time/LocalDate;", "date", "", "w", "dateKey", "Lkotlin/Function4;", "", "", "Lkotlin/coroutines/Continuation;", "", "", "dataLoad", "v", "(Ljava/lang/String;Lkotlin/jvm/functions/Function4;)V", "sportType", "startTime", "endTime", "z", "(Ljava/lang/String;IJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/base/livedata/OLiveData;", "Lcom/heytap/sports/record/stat/vm/CalendarPanelViewModel$b;", "j", "Lcom/heytap/health/base/livedata/OLiveData;", "y", "()Lcom/heytap/health/base/livedata/OLiveData;", "dateClickData", "", MapSchema.FIELD_NAME_KEY, "Lkotlin/Lazy;", "x", "()Ljava/util/Map;", "dataLoadForDateMap", "<init>", "()V", "Companion", "a", "b", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class CalendarPanelViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OLiveData<DateSelectedData> dateClickData = new OLiveData<>();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy dataLoadForDateMap = LazyKt__LazyJVMKt.lazy(new Function0<Map<String, Function4<? super Integer, ? super Long, ? super Long, ? super Continuation<? super Set<? extends LocalDate>>, ? extends Object>>>() { // from class: com.heytap.sports.record.stat.vm.CalendarPanelViewModel$dataLoadForDateMap$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Map<String, Function4<? super Integer, ? super Long, ? super Long, ? super Continuation<? super Set<? extends LocalDate>>, ? extends Object>> invoke() {
            return new LinkedHashMap();
        }
    });
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.heytap.sports.record.stat.vm.CalendarPanelViewModel$b, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/heytap/sports/record/stat/vm/CalendarPanelViewModel$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "key", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "date", "<init>", "(Ljava/lang/String;Ljava/time/LocalDate;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class DateSelectedData {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final LocalDate date;

        public DateSelectedData(@NotNull String key, @NotNull LocalDate date) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(date, "date");
            this.key = key;
            this.date = date;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getDate() {
            return this.date;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateSelectedData)) {
                return false;
            }
            DateSelectedData dateSelectedData = (DateSelectedData) other;
            return Intrinsics.areEqual(this.key, dateSelectedData.key) && Intrinsics.areEqual(this.date, dateSelectedData.date);
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.date.hashCode();
        }

        @NotNull
        public String toString() {
            return "DateSelectedData(key=" + this.key + ", date=" + this.date + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(@NotNull String dateKey, @NotNull Function4<? super Integer, ? super Long, ? super Long, ? super Continuation<? super Set<LocalDate>>, ? extends Object> dataLoad) {
        Intrinsics.checkNotNullParameter(dateKey, "dateKey");
        Intrinsics.checkNotNullParameter(dataLoad, "dataLoad");
        x().put(dateKey, dataLoad);
    }

    public final void w(@NotNull String key, @NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(date, "date");
        this.dateClickData.postValue(new DateSelectedData(key, date));
    }

    public final Map<String, Function4<Integer, Long, Long, Continuation<? super Set<LocalDate>>, Object>> x() {
        return (Map) this.dataLoadForDateMap.getValue();
    }

    @NotNull
    public final OLiveData<DateSelectedData> y() {
        return this.dateClickData;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object z(@NotNull String str, int i, long j2, long j3, @NotNull Continuation<? super Set<LocalDate>> continuation) {
        CalendarPanelViewModel$loadDataForDate$1 calendarPanelViewModel$loadDataForDate$1;
        if (continuation instanceof CalendarPanelViewModel$loadDataForDate$1) {
            calendarPanelViewModel$loadDataForDate$1 = (CalendarPanelViewModel$loadDataForDate$1) continuation;
            int i2 = calendarPanelViewModel$loadDataForDate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                calendarPanelViewModel$loadDataForDate$1.label = i2 - Integer.MIN_VALUE;
            } else {
                calendarPanelViewModel$loadDataForDate$1 = new CalendarPanelViewModel$loadDataForDate$1(this, continuation);
            }
        } else {
            calendarPanelViewModel$loadDataForDate$1 = new CalendarPanelViewModel$loadDataForDate$1(this, continuation);
        }
        Object objInvoke = calendarPanelViewModel$loadDataForDate$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = calendarPanelViewModel$loadDataForDate$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            Function4<Integer, Long, Long, Continuation<? super Set<LocalDate>>, Object> function4 = x().get(str);
            a7b.f("CalendarPanelViewModel", "loadDataForDate() " + str + ":" + function4);
            if (function4 != null) {
                Integer numBoxInt = Boxing.boxInt(i);
                Long lBoxLong = Boxing.boxLong(j2);
                Long lBoxLong2 = Boxing.boxLong(j3);
                calendarPanelViewModel$loadDataForDate$1.label = 1;
                objInvoke = function4.invoke(numBoxInt, lBoxLong, lBoxLong2, calendarPanelViewModel$loadDataForDate$1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return SetsKt__SetsKt.emptySet();
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objInvoke);
        Set set = (Set) objInvoke;
        if (set != null) {
            return set;
        }
        return SetsKt__SetsKt.emptySet();
    }
}
