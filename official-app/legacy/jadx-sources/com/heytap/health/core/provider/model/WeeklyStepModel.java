package com.heytap.health.core.provider.model;

import android.annotation.SuppressLint;
import com.heytap.health.base.utils.AsyncResult;
import com.heytap.health.core.provider.adapter.open.WeeklyStepAdapter;
import com.heytap.health.sport.model.DayStepData;
import com.heytap.health.sport.seedling.SeedlingStepService;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.mzj;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.wq8;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.x05;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0003J\u0016\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/core/provider/model/WeeklyStepModel;", "", "", b2n.g, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/base/utils/AsyncResult;", "Lcom/heytap/health/core/provider/adapter/open/WeeklyStepAdapter$WeeklyStepData;", b2n.f, "", "Lcom/heytap/health/sport/model/DayStepData;", "list", "d", "", "steps", "i", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "TAG", "b", "J", "millisecondsOnDay", "<init>", "()V", "operations_release"}, k = 1, mv = {1, 8, 0})
public final class WeeklyStepModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "WeeklyStepModel";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long millisecondsOnDay = 86400000;

    public final WeeklyStepAdapter.WeeklyStepData d(List<? extends DayStepData> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        int i = 0;
        int step = 0;
        int i2 = 0;
        int step2 = 0;
        int step3 = 0;
        int step4 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int step5 = list.get(i3).getStep();
            LocalDate date = list.get(i3).getDate();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("index = ");
            sb2.append(i3);
            sb2.append("  step = ");
            sb2.append(step5);
            sb2.append(" time = ");
            sb2.append(date);
            if (step < list.get(i3).getStep()) {
                step = list.get(i3).getStep();
            }
            if (i3 < 7) {
                step2 += list.get(i3).getStep();
                if (list.get(i3).getStep() > 0) {
                    i2++;
                }
            } else {
                sb.append(list.get(i3).getStep());
                if (i3 != list.size() - 1) {
                    sb.append(",");
                }
                if (step3 < list.get(i3).getStep()) {
                    step3 = list.get(i3).getStep();
                }
                step4 += list.get(i3).getStep();
                if (list.get(i3).getStep() > 0) {
                    i++;
                }
            }
        }
        int i4 = i > 0 ? step4 / i : 0;
        if (i2 > 0) {
            int i5 = step2 / i2;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("totalThisWeek = ");
        sb3.append(step4);
        sb3.append("  efficientDayThisWeek = ");
        sb3.append(i);
        sb3.append("  avgThisWeek = ");
        sb3.append(i4);
        String date2 = mzj.b(e(), "yyyyMMdd");
        Intrinsics.checkNotNullExpressionValue(date2, "date");
        int i6 = i(step3);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "stepChartList.toString()");
        return new WeeklyStepAdapter.WeeklyStepData(1, date2, i4, step4, step4 - step2, i6, string);
    }

    public final long e() {
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        Intrinsics.checkNotNullExpressionValue(localDateTimeNow, "now()");
        int value = localDateTimeNow.getDayOfWeek().getValue();
        a7b.f("WeeklyStepModel", "dayOfWeek " + value);
        return x05.n(System.currentTimeMillis()) - ((((long) (value - 1)) * this.millisecondsOnDay) + 1);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTAG() {
        return this.TAG;
    }

    @SuppressLint({"CheckResult"})
    public final AsyncResult<WeeklyStepAdapter.WeeklyStepData> g() {
        return new AsyncResult<>(new Function1<Function1<? super Result<? extends WeeklyStepAdapter.WeeklyStepData>, ? extends Unit>, Unit>() { // from class: com.heytap.health.core.provider.model.WeeklyStepModel$getWeeklyStepBean$1

            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/heytap/health/sport/model/DayStepData;", "it", "", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
            public static final class a<T> implements o14 {
                public final /* synthetic */ WeeklyStepModel i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ Function1<Result<WeeklyStepAdapter.WeeklyStepData>, Unit> f3738j;

                /* JADX WARN: Multi-variable type inference failed */
                public a(WeeklyStepModel weeklyStepModel, Function1<? super Result<WeeklyStepAdapter.WeeklyStepData>, Unit> function1) {
                    this.i = weeklyStepModel;
                    this.f3738j = function1;
                }

                @Override // com.oplus.aiunit.vision.o14
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(@NotNull List<? extends DayStepData> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.i.getTAG();
                    int size = it.size();
                    StringBuilder sb = new StringBuilder();
                    sb.append(" weekly step size = ");
                    sb.append(size);
                    if (!it.isEmpty()) {
                        Function1<Result<WeeklyStepAdapter.WeeklyStepData>, Unit> function1 = this.f3738j;
                        Result.Companion companion = Result.INSTANCE;
                        function1.invoke(Result.m5286boximpl(Result.m5287constructorimpl(this.i.d(it))));
                    } else {
                        Function1<Result<WeeklyStepAdapter.WeeklyStepData>, Unit> function2 = this.f3738j;
                        Result.Companion companion2 = Result.INSTANCE;
                        function2.invoke(Result.m5286boximpl(Result.m5287constructorimpl(new WeeklyStepAdapter.WeeklyStepData(0, null, 0, 0, 0, 0, null, 126, null))));
                    }
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
            public static final class b<T> implements o14 {
                public final /* synthetic */ Function1<Result<WeeklyStepAdapter.WeeklyStepData>, Unit> i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ WeeklyStepModel f3739j;

                /* JADX WARN: Multi-variable type inference failed */
                public b(Function1<? super Result<WeeklyStepAdapter.WeeklyStepData>, Unit> function1, WeeklyStepModel weeklyStepModel) {
                    this.i = function1;
                    this.f3739j = weeklyStepModel;
                }

                @Override // com.oplus.aiunit.vision.o14
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(@NotNull Throwable it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Function1<Result<WeeklyStepAdapter.WeeklyStepData>, Unit> function1 = this.i;
                    Result.Companion companion = Result.INSTANCE;
                    function1.invoke(Result.m5286boximpl(Result.m5287constructorimpl(new WeeklyStepAdapter.WeeklyStepData(0, null, 0, 0, 0, 0, null, 126, null))));
                    a7b.b(this.f3739j.getTAG(), String.valueOf(it.getMessage()));
                }
            }

            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Function1<? super Result<? extends WeeklyStepAdapter.WeeklyStepData>, ? extends Unit> function1) {
                invoke2((Function1<? super Result<WeeklyStepAdapter.WeeklyStepData>, Unit>) function1);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Function1<? super Result<WeeklyStepAdapter.WeeklyStepData>, Unit> block) {
                Intrinsics.checkNotNullParameter(block, "block");
                Object objNavigation = x0.d().b("/step/SeedlingStepService").navigation();
                Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.sport.seedling.SeedlingStepService");
                ((SeedlingStepService) objNavigation).a4(this.this$0.e()).L0(su8.c()).b(new a(this.this$0, block), new b(block, this.this$0));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object h(@NotNull Continuation<? super String> continuation) throws Throwable {
        WeeklyStepModel$getWeeklyStepData$1 weeklyStepModel$getWeeklyStepData$1;
        if (continuation instanceof WeeklyStepModel$getWeeklyStepData$1) {
            weeklyStepModel$getWeeklyStepData$1 = (WeeklyStepModel$getWeeklyStepData$1) continuation;
            int i = weeklyStepModel$getWeeklyStepData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                weeklyStepModel$getWeeklyStepData$1.label = i - Integer.MIN_VALUE;
            } else {
                weeklyStepModel$getWeeklyStepData$1 = new WeeklyStepModel$getWeeklyStepData$1(this, continuation);
            }
        } else {
            weeklyStepModel$getWeeklyStepData$1 = new WeeklyStepModel$getWeeklyStepData$1(this, continuation);
        }
        Object objWithContext = weeklyStepModel$getWeeklyStepData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = weeklyStepModel$getWeeklyStepData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContextB = wq8.INSTANCE.b("WeeklyStep");
            WeeklyStepModel$getWeeklyStepData$2 weeklyStepModel$getWeeklyStepData$2 = new WeeklyStepModel$getWeeklyStepData$2(this, null);
            weeklyStepModel$getWeeklyStepData$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContextB, weeklyStepModel$getWeeklyStepData$2, weeklyStepModel$getWeeklyStepData$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "suspend fun getWeeklySte…lt\")\n        result\n    }");
        return objWithContext;
    }

    public final int i(int steps) {
        StringBuilder sb = new StringBuilder();
        sb.append("step == ");
        sb.append(steps);
        return (int) (Math.ceil(((double) steps) / 1000.0d) * ((double) 1000));
    }
}
