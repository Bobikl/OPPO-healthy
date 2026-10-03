package com.health.sleep_breath_rate.view;

import android.content.Context;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.coui.appcompat.panel.COUIPanelFragment;
import com.health.sleep_breath_rate.R$color;
import com.health.sleep_breath_rate.R$id;
import com.health.sleep_breath_rate.R$layout;
import com.health.sleep_breath_rate.view.CalendarPanelFragment;
import com.health.sleep_breath_rate.week.viewmodel.SleepBRWeekViewModel;
import com.heytap.databaseengine.model.newsleep.BreathRateStat;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.base.view.calendar.b;
import com.heytap.health.health_base.R;
import com.oplus.aiunit.vision.adh;
import com.oplus.aiunit.vision.as7;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.qmg;
import com.oplus.aiunit.vision.yq2;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 -2\u00020\u0001:\u0003./0B[\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012:\b\u0002\u0010\"\u001a4\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001c¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\u000b\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\u0010\n\u001a\u00060\tR\u00020\u0000H\u0002J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bRI\u0010\"\u001a4\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u0010R\u0016\u0010'\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010\u0010R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u00061"}, d2 = {"Lcom/health/sleep_breath_rate/view/CalendarPanelFragment;", "Lcom/coui/appcompat/panel/COUIPanelFragment;", "Landroid/view/View;", "parent", "", "inflateTextView", "", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "data", "Lcom/health/sleep_breath_rate/view/CalendarPanelFragment$SimpleAdapter;", "adapter", "refreshMonthView", "panelView", "initView", "Ljava/time/LocalDate;", "selectDate", "Ljava/time/LocalDate;", "getSelectDate", "()Ljava/time/LocalDate;", "setSelectDate", "(Ljava/time/LocalDate;)V", "", "earliestTime", "Ljava/lang/Long;", "getEarliestTime", "()Ljava/lang/Long;", "setEarliestTime", "(Ljava/lang/Long;)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "date", "", "clickBackToday", "onClickDateCallBack", "Lkotlin/jvm/functions/Function2;", "getOnClickDateCallBack", "()Lkotlin/jvm/functions/Function2;", "minDate", "maxDate", "Lcom/health/sleep_breath_rate/week/viewmodel/SleepBRWeekViewModel;", "dataStatViewModel", "Lcom/health/sleep_breath_rate/week/viewmodel/SleepBRWeekViewModel;", "<init>", "(Ljava/time/LocalDate;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;)V", "Companion", "a", "SimpleAdapter", "SimpleHolder", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCalendarPanelFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarPanelFragment.kt\ncom/health/sleep_breath_rate/view/CalendarPanelFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,238:1\n1477#2:239\n1502#2,3:240\n1505#2,3:250\n372#3,7:243\n*S KotlinDebug\n*F\n+ 1 CalendarPanelFragment.kt\ncom/health/sleep_breath_rate/view/CalendarPanelFragment\n*L\n132#1:239\n132#1:240,3\n132#1:250,3\n132#1:243,7\n*E\n"})
public final class CalendarPanelFragment extends COUIPanelFragment {

    @NotNull
    public static final String TAG = "SleepBRCalendar";

    @Nullable
    private SleepBRWeekViewModel dataStatViewModel;

    @Nullable
    private Long earliestTime;
    private LocalDate maxDate;

    @NotNull
    private LocalDate minDate;

    @Nullable
    private final Function2<LocalDate, Boolean, Unit> onClickDateCallBack;

    @Nullable
    private LocalDate selectDate;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001BQ\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u00128\u0010#\u001a4\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\n\u0018\u00010\u0019¢\u0006\u0004\b*\u0010+J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J \u0010\u0012\u001a\u00020\n2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\rJ\b\u0010\u0014\u001a\u00020\u0013H\u0002R\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015RI\u0010#\u001a4\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\n\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R*\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/health/sleep_breath_rate/view/CalendarPanelFragment$SimpleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/health/sleep_breath_rate/view/CalendarPanelFragment$SimpleHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "h", "holder", "position", "", "g", "getItemCount", "", "Ljava/time/LocalDate;", "", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "data", "i", "Lcom/oplus/aiunit/vision/yq2;", "e", "Ljava/time/LocalDate;", "minDate", "j", "maxDate", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "date", "", "clickBackToday", "k", "Lkotlin/jvm/functions/Function2;", "f", "()Lkotlin/jvm/functions/Function2;", "onClickDateCallBack", "Lcom/oplus/aiunit/vision/as7;", "l", "Lcom/oplus/aiunit/vision/as7;", "fixedMonthBuilder", "m", "Ljava/util/Map;", "<init>", "(Lcom/health/sleep_breath_rate/view/CalendarPanelFragment;Ljava/time/LocalDate;Ljava/time/LocalDate;Lkotlin/jvm/functions/Function2;)V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
    public final class SimpleAdapter extends RecyclerView.Adapter<SimpleHolder> {

        @NotNull
        public final LocalDate i;

        @NotNull
        public final LocalDate j;

        @Nullable
        public final Function2<LocalDate, Boolean, Unit> k;

        @NotNull
        public final as7 l;

        @Nullable
        public Map<LocalDate, ? extends List<BreathRateStat>> m;
        public final /* synthetic */ CalendarPanelFragment n;

        @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0011\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\tH\u0016¨\u0006\u0012"}, d2 = {"com/health/sleep_breath_rate/view/CalendarPanelFragment$SimpleAdapter$a", "Lcom/oplus/aiunit/vision/yq2;", "", "a", "Landroid/view/View;", "dayParentView", "Lcom/heytap/health/base/view/calendar/a;", "c", "dayView", "Ljava/time/LocalDate;", "actualDay", "", "d", "b", "()Ljava/lang/Integer;", "monthParentView", "firstDayOfMonth", "e", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
        public static final class a implements yq2 {
            public final /* synthetic */ CalendarPanelFragment a;
            public final /* synthetic */ SimpleAdapter b;

            @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/health/sleep_breath_rate/view/CalendarPanelFragment$SimpleAdapter$a$a", "Lcom/heytap/health/base/view/calendar/a$c;", "Ljava/time/LocalDate;", "date", "", "a", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
            public static final class a implements com.heytap.health.base.view.calendar.a.c {
                public final /* synthetic */ CalendarPanelFragment i;
                public final /* synthetic */ SimpleAdapter j;

                public a(CalendarPanelFragment calendarPanelFragment, SimpleAdapter simpleAdapter) {
                    this.i = calendarPanelFragment;
                    this.j = simpleAdapter;
                }

                public void a(@NotNull LocalDate date) {
                    Function2<LocalDate, Boolean, Unit> function2F;
                    Intrinsics.checkNotNullParameter(date, "date");
                    if (this.i.getEarliestTime() != null) {
                        pr8 pr8Var = pr8.INSTANCE;
                        Long earliestTime = this.i.getEarliestTime();
                        Intrinsics.checkNotNull(earliestTime);
                        if (date.isBefore(pr8Var.j(earliestTime.longValue()))) {
                            return;
                        }
                    }
                    if (date.isAfter(LocalDate.now()) || (function2F = this.j.f()) == null) {
                        return;
                    }
                    function2F.invoke(date, Boolean.FALSE);
                }
            }

            public a(CalendarPanelFragment calendarPanelFragment, SimpleAdapter simpleAdapter) {
                this.a = calendarPanelFragment;
                this.b = simpleAdapter;
            }

            public int a() {
                return R$layout.health_sleep_br_calendar_month_layout;
            }

            @Nullable
            public Integer b() {
                return null;
            }

            @NotNull
            public com.heytap.health.base.view.calendar.a c(@NotNull View dayParentView) {
                Intrinsics.checkNotNullParameter(dayParentView, "dayParentView");
                float fA = qmg.a(dayParentView.getContext(), 5.0f);
                Context context = dayParentView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "dayParentView.context");
                b bVar = new b(context, dayParentView.getContext().getColor(R$color.health_sleep_br_0066FF), new RectF(fA, fA, fA, fA));
                bVar.setOnClickDayListener(new a(this.a, this.b));
                return bVar;
            }

            /* JADX WARN: Code duplicated, block: B:21:0x0086  */
            public void d(@NotNull com.heytap.health.base.view.calendar.a dayView, @NotNull LocalDate actualDay) {
                Boolean boolValueOf;
                boolean z;
                BreathRateStat breathRateStat;
                Intrinsics.checkNotNullParameter(dayView, "dayView");
                Intrinsics.checkNotNullParameter(actualDay, "actualDay");
                boolean zAreEqual = Intrinsics.areEqual(actualDay, this.a.getSelectDate());
                Map map = this.b.m;
                boolean z2 = true;
                if (map != null) {
                    List list = (List) map.get(actualDay);
                    boolValueOf = Boolean.valueOf((list == null || (breathRateStat = (BreathRateStat) list.get(0)) == null || ((double) breathRateStat.getMax()) <= 0.0d) ? false : true);
                } else {
                    boolValueOf = null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("reflateDayLayout() actualDay=");
                sb.append(actualDay);
                sb.append(" showDot=");
                sb.append(zAreEqual);
                sb.append(" haveDate=");
                sb.append(boolValueOf);
                if (dayView instanceof b) {
                    if (this.a.getEarliestTime() != null) {
                        pr8 pr8Var = pr8.INSTANCE;
                        Long earliestTime = this.a.getEarliestTime();
                        Intrinsics.checkNotNull(earliestTime);
                        if (actualDay.isBefore(pr8Var.j(earliestTime.longValue()))) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (!actualDay.isAfter(LocalDate.now()) && !z) {
                        z2 = false;
                    }
                    ((b) dayView).A(z2, Intrinsics.areEqual(boolValueOf, Boolean.TRUE), actualDay, zAreEqual);
                }
            }

            public void e(@NotNull View monthParentView, @NotNull LocalDate firstDayOfMonth) {
                Intrinsics.checkNotNullParameter(monthParentView, "monthParentView");
                Intrinsics.checkNotNullParameter(firstDayOfMonth, "firstDayOfMonth");
                ((TextView) monthParentView.findViewById(R$id.month_value)).setText(lo9.g(pr8.INSTANCE.p(firstDayOfMonth), "MMM"));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SimpleAdapter(@NotNull CalendarPanelFragment calendarPanelFragment, @NotNull LocalDate localDate, @Nullable LocalDate localDate2, Function2<? super LocalDate, ? super Boolean, Unit> function2) {
            Intrinsics.checkNotNullParameter(localDate, "minDate");
            Intrinsics.checkNotNullParameter(localDate2, "maxDate");
            this.n = calendarPanelFragment;
            this.i = localDate;
            this.j = localDate2;
            this.k = function2;
            this.l = new as7(e(), false, 2, (DefaultConstructorMarker) null);
        }

        public final yq2 e() {
            return new a(this.n, this);
        }

        @Nullable
        public final Function2<LocalDate, Boolean, Unit> f() {
            return this.k;
        }

        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull SimpleHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            as7 as7Var = this.l;
            LocalDate localDatePlusMonths = this.i.plusMonths(position);
            Intrinsics.checkNotNullExpressionValue(localDatePlusMonths, "minDate.plusMonths(position.toLong())");
            holder.b(as7Var, localDatePlusMonths);
        }

        public int getItemCount() {
            return pr8.INSTANCE.f(this.i, this.j) + 1;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public SimpleHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new SimpleHolder(as7.c(this.l, parent, 0.0f, 0.0f, 6, (Object) null));
        }

        public final void i(@NotNull Map<LocalDate, ? extends List<BreathRateStat>> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.m = data;
            notifyItemRangeChanged(0, data.size());
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/health/sleep_breath_rate/view/CalendarPanelFragment$SimpleHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/oplus/aiunit/vision/as7;", "monthBuilder", "Ljava/time/LocalDate;", "date", "", "b", "i", "Ljava/time/LocalDate;", "a", "()Ljava/time/LocalDate;", "setDate", "(Ljava/time/LocalDate;)V", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
    public static final class SimpleHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        @Nullable
        public LocalDate i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SimpleHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getI() {
            return this.i;
        }

        public final void b(@NotNull as7 monthBuilder, @NotNull LocalDate date) {
            Intrinsics.checkNotNullParameter(monthBuilder, "monthBuilder");
            Intrinsics.checkNotNullParameter(date, "date");
            this.i = date;
            View view = ((RecyclerView.ViewHolder) this).itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
            monthBuilder.e((ViewGroup) view, date);
        }
    }

    public CalendarPanelFragment() {
        this(null, null, null, 7, null);
    }

    private final void inflateTextView(View parent) {
        TextView textView = (TextView) parent.findViewById(R$id.calendar_year_value);
        TextView textView2 = (TextView) parent.findViewById(R$id.back_to_today);
        LocalDate localDate = this.selectDate;
        if (localDate != null && textView != null) {
            pr8 pr8Var = pr8.INSTANCE;
            textView.setText(pr8Var.y(pr8Var.p(localDate), "yyyy"));
        }
        if (textView2 != null) {
            textView2.setText(parent.getContext().getString(R.string.health_base_back_to_today));
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.mr2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CalendarPanelFragment.inflateTextView$lambda$4(this.i, view);
            }
        });
        ConstraintLayout constraintLayoutFindViewById = parent.findViewById(R$id.week_day_text);
        String[] stringArray = parent.getContext().getResources().getStringArray(com.heytap.health.base.R.array.lib_base_week_sun_to_sat);
        Intrinsics.checkNotNullExpressionValue(stringArray, "parent.context.resources…lib_base_week_sun_to_sat)");
        int childCount = constraintLayoutFindViewById.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (constraintLayoutFindViewById.getChildAt(i) instanceof TextView) {
                View childAt = constraintLayoutFindViewById.getChildAt(i);
                Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
                ((TextView) childAt).setText(stringArray[RangesKt.coerceAtMost(i, stringArray.length - 1)]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    public static final void inflateTextView$lambda$4(CalendarPanelFragment calendarPanelFragment, View view) {
        Intrinsics.checkNotNullParameter(calendarPanelFragment, "this$0");
        LocalDate localDateNow = LocalDate.now();
        Function2<LocalDate, Boolean, Unit> function2 = calendarPanelFragment.onClickDateCallBack;
        if (function2 != null) {
            Intrinsics.checkNotNullExpressionValue(localDateNow, "toDay");
            function2.invoke(localDateNow, Boolean.TRUE);
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    private final void refreshMonthView(List<BreathRateStat> data, SimpleAdapter adapter) {
        List<BreathRateStat> list = data;
        if (list == null || list.isEmpty()) {
            return;
        }
        m8b.f(TAG, "refreshMonthView,data size:" + data.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : data) {
            LocalDate localDateJ = pr8.INSTANCE.j(o15.a(((BreathRateStat) obj).getDate()));
            Object arrayList = linkedHashMap.get(localDateJ);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(localDateJ, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.earliestTime = Long.valueOf(pr8.INSTANCE.g(data.get(0).getDate()));
        adapter.i(linkedHashMap);
    }

    @Nullable
    public final Long getEarliestTime() {
        return this.earliestTime;
    }

    @Nullable
    public final Function2<LocalDate, Boolean, Unit> getOnClickDateCallBack() {
        return this.onClickDateCallBack;
    }

    @Nullable
    public final LocalDate getSelectDate() {
        return this.selectDate;
    }

    public void initView(@Nullable View panelView) {
        OLiveData<adh> oLiveDataX;
        super.initView(panelView);
        pr8 pr8Var = pr8.INSTANCE;
        LocalDate localDateWith = LocalDateTime.ofInstant(Instant.ofEpochMilli(pr8Var.n(System.currentTimeMillis())), pr8Var.d()).toLocalDate().with(TemporalAdjusters.lastDayOfMonth());
        Intrinsics.checkNotNullExpressionValue(localDateWith, "ofInstant(Instant.ofEpoc…justers.lastDayOfMonth())");
        this.maxDate = localDateWith;
        if (panelView != null) {
            final View viewInflate = LayoutInflater.from(panelView.getContext()).inflate(R$layout.health_sleep_br_calendar_layout, (ViewGroup) null, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "parentView");
            inflateTextView(viewInflate);
            RecyclerView recyclerViewFindViewById = viewInflate.findViewById(R$id.recycler_view);
            Intrinsics.checkNotNull(recyclerViewFindViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView recyclerView = recyclerViewFindViewById;
            recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.health.sleep_breath_rate.view.CalendarPanelFragment$initView$1$1
                public void onScrollStateChanged(@NotNull RecyclerView recyclerView2, int newState) {
                    Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                    m8b.f(CalendarPanelFragment.TAG, "recyclerView onScrollStateChanged");
                    LinearLayoutManager layoutManager = recyclerView2.getLayoutManager();
                    Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = recyclerView2.findViewHolderForLayoutPosition(layoutManager.findFirstVisibleItemPosition());
                    Intrinsics.checkNotNull(viewHolderFindViewHolderForLayoutPosition, "null cannot be cast to non-null type com.health.sleep_breath_rate.view.CalendarPanelFragment.SimpleHolder");
                    TextView textView = (TextView) viewInflate.findViewById(R$id.calendar_year_value);
                    LocalDate i = ((CalendarPanelFragment.SimpleHolder) viewHolderFindViewHolderForLayoutPosition).getI();
                    if (i != null) {
                        m8b.f(CalendarPanelFragment.TAG, "recyclerView date:" + i);
                        if (textView == null) {
                            return;
                        }
                        pr8 pr8Var2 = pr8.INSTANCE;
                        textView.setText(pr8Var2.y(pr8Var2.p(i), "yyyy"));
                    }
                }
            });
            LocalDate localDate = this.minDate;
            LocalDate localDate2 = this.maxDate;
            if (localDate2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("maxDate");
                localDate2 = null;
            }
            SimpleAdapter simpleAdapter = new SimpleAdapter(this, localDate, localDate2, this.onClickDateCallBack);
            recyclerView.setAdapter(simpleAdapter);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(panelView.getContext());
            linearLayoutManager.setOrientation(1);
            recyclerView.setLayoutManager(linearLayoutManager);
            LocalDate localDate3 = this.minDate;
            LocalDate localDate4 = this.selectDate;
            if (localDate4 == null && (localDate4 = this.maxDate) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("maxDate");
                localDate4 = null;
            }
            recyclerView.scrollToPosition(pr8Var.f(localDate3, localDate4));
            View contentView = getContentView();
            ViewGroup viewGroup = contentView instanceof ViewGroup ? (ViewGroup) contentView : null;
            if (viewGroup != null) {
                viewGroup.addView(viewInflate);
            }
            FragmentActivity activity = getActivity();
            if (activity != null) {
                Intrinsics.checkNotNullExpressionValue(activity, "this");
                SleepBRWeekViewModel sleepBRWeekViewModel = new ViewModelProvider(activity).get(SleepBRWeekViewModel.class);
                this.dataStatViewModel = sleepBRWeekViewModel;
                adh adhVar = (sleepBRWeekViewModel == null || (oLiveDataX = sleepBRWeekViewModel.x()) == null) ? null : (adh) oLiveDataX.getValue();
                refreshMonthView(adhVar != null ? adhVar.a() : null, simpleAdapter);
            }
        }
    }

    public final void setEarliestTime(@Nullable Long l) {
        this.earliestTime = l;
    }

    public final void setSelectDate(@Nullable LocalDate localDate) {
        this.selectDate = localDate;
    }

    public /* synthetic */ CalendarPanelFragment(LocalDate localDate, Long l, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : localDate, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CalendarPanelFragment(@Nullable LocalDate localDate, @Nullable Long l, @Nullable Function2<? super LocalDate, ? super Boolean, Unit> function2) {
        this.selectDate = localDate;
        this.earliestTime = l;
        this.onClickDateCallBack = function2;
        this.minDate = pr8.INSTANCE.i();
    }
}
