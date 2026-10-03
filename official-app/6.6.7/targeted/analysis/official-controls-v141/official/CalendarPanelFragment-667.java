package com.heytap.health.sleep.view;

import android.content.Context;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.coui.appcompat.panel.COUIBottomSheetDialogFragment;
import com.coui.appcompat.panel.COUIPanelFragment;
import com.heytap.databaseengine.model.SleepDataStat;
import com.heytap.health.base.R$array;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.base.view.calendar.b;
import com.heytap.health.sleep.R$color;
import com.heytap.health.sleep.R$id;
import com.heytap.health.sleep.R$layout;
import com.heytap.health.sleep.R$string;
import com.heytap.health.sleep.view.CalendarPanelFragment;
import com.heytap.health.sleep.week.viewmodel.SleepWeekViewModel;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.as7;
import com.oplus.aiunit.vision.c7n;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.qmg;
import com.oplus.aiunit.vision.yq2;
import com.oplus.aiunit.vision.zeh;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 32\u00020\u0001:\u0003456BR\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012%\b\u0002\u0010$\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u0004\u0018\u00010 ¢\u0006\u0004\b1\u00102J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\u000b\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\u0010\n\u001a\u00060\tR\u00020\u0000H\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR4\u0010$\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u0016R\u0016\u0010)\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010\u0016R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00100\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0018¨\u00067"}, d2 = {"Lcom/heytap/health/sleep/view/CalendarPanelFragment;", "Lcom/coui/appcompat/panel/COUIPanelFragment;", "Landroid/view/View;", "parent", "", "inflateTextView", "", "Lcom/heytap/databaseengine/model/SleepDataStat;", "data", "Lcom/heytap/health/sleep/view/CalendarPanelFragment$SimpleAdapter;", "adapter", "refreshMonthView", "Ljava/time/LocalDate;", "getCurDayLocalDate", "panelView", "initView", "", "ssoid", "Ljava/lang/String;", "getSsoid", "()Ljava/lang/String;", "selectDate", "Ljava/time/LocalDate;", "getSelectDate", "()Ljava/time/LocalDate;", "setSelectDate", "(Ljava/time/LocalDate;)V", "", "earliestTime", "Ljava/lang/Long;", "getEarliestTime", "()Ljava/lang/Long;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "date", "onClickDateCallBack", "Lkotlin/jvm/functions/Function1;", "getOnClickDateCallBack", "()Lkotlin/jvm/functions/Function1;", "minDate", "maxDate", "Lcom/heytap/health/sleep/week/viewmodel/SleepWeekViewModel;", "sleepWeekViewModel", "Lcom/heytap/health/sleep/week/viewmodel/SleepWeekViewModel;", "curLocalDate$delegate", "Lkotlin/Lazy;", "getCurLocalDate", "curLocalDate", "<init>", "(Ljava/lang/String;Ljava/time/LocalDate;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", "Companion", "a", "SimpleAdapter", "SimpleHolder", "sleep_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCalendarPanelFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarPanelFragment.kt\ncom/heytap/health/sleep/view/CalendarPanelFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,260:1\n1477#2:261\n1502#2,3:262\n1505#2,3:272\n372#3,7:265\n*S KotlinDebug\n*F\n+ 1 CalendarPanelFragment.kt\ncom/heytap/health/sleep/view/CalendarPanelFragment\n*L\n152#1:261\n152#1:262,3\n152#1:272,3\n152#1:265,7\n*E\n"})
public final class CalendarPanelFragment extends COUIPanelFragment {

    @NotNull
    public static final String TAG = "SleepCalendar";

    /* JADX INFO: renamed from: curLocalDate$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy curLocalDate;

    @Nullable
    private final Long earliestTime;
    private LocalDate maxDate;

    @NotNull
    private LocalDate minDate;

    @Nullable
    private final Function1<LocalDate, Unit> onClickDateCallBack;

    @Nullable
    private LocalDate selectDate;

    @Nullable
    private SleepWeekViewModel sleepWeekViewModel;

    @Nullable
    private final String ssoid;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B<\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012#\u0010!\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\n\u0018\u00010\u0019¢\u0006\u0004\b(\u0010)J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J \u0010\u0012\u001a\u00020\n2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\rJ\b\u0010\u0014\u001a\u00020\u0013H\u0002R\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R4\u0010!\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\n\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R*\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/heytap/health/sleep/view/CalendarPanelFragment$SimpleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/heytap/health/sleep/view/CalendarPanelFragment$SimpleHolder;", "Landroid/view/ViewGroup;", "parent", "", ParserTag.VIEW_TYPE, c7n.g, BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "position", "", c7n.f, "getItemCount", "", "Ljava/time/LocalDate;", "", "Lcom/heytap/databaseengine/model/SleepDataStat;", "data", "i", "Lcom/oplus/aiunit/vision/yq2;", MapSchema.FIELD_NAME_ENTRY, "Ljava/time/LocalDate;", "minDate", "j", "maxDate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "date", MapSchema.FIELD_NAME_KEY, "Lkotlin/jvm/functions/Function1;", "f", "()Lkotlin/jvm/functions/Function1;", "onClickDateCallBack", "Lcom/oplus/aiunit/vision/as7;", LogFieldKey.LEVEL_KEY, "Lcom/oplus/aiunit/vision/as7;", "monthViewBuilder", LogFieldKey.MESSAGE_KEY, "Ljava/util/Map;", "<init>", "(Lcom/heytap/health/sleep/view/CalendarPanelFragment;Ljava/time/LocalDate;Ljava/time/LocalDate;Lkotlin/jvm/functions/Function1;)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public final class SimpleAdapter extends RecyclerView.Adapter<SimpleHolder> {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final LocalDate minDate;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final LocalDate maxDate;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @Nullable
        public final Function1<LocalDate, Unit> onClickDateCallBack;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final as7 monthViewBuilder;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @Nullable
        public Map<LocalDate, ? extends List<? extends SleepDataStat>> data;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ CalendarPanelFragment f6952n;

        @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/heytap/health/sleep/view/CalendarPanelFragment$SimpleAdapter$a", "Lcom/oplus/aiunit/vision/yq2;", "", "a", "Landroid/view/View;", "dayParentView", "Lcom/heytap/health/base/view/calendar/a;", "c", "dayView", "Ljava/time/LocalDate;", "actualDay", "", "d", "monthParentView", "firstDayOfMonth", MapSchema.FIELD_NAME_ENTRY, "b", "()Ljava/lang/Integer;", "sleep_release"}, k = 1, mv = {1, 8, 0})
        public static final class a implements yq2 {
            public final /* synthetic */ CalendarPanelFragment a;
            public final /* synthetic */ SimpleAdapter b;

            /* JADX INFO: renamed from: com.heytap.health.sleep.view.CalendarPanelFragment$SimpleAdapter$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/sleep/view/CalendarPanelFragment$SimpleAdapter$a$a", "Lcom/heytap/health/base/view/calendar/a$c;", "Ljava/time/LocalDate;", "date", "", "a", "sleep_release"}, k = 1, mv = {1, 8, 0})
            public static final class C0640a implements com.heytap.health.base.view.calendar.a.c {
                public final /* synthetic */ CalendarPanelFragment i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ SimpleAdapter f6953j;

                public C0640a(CalendarPanelFragment calendarPanelFragment, SimpleAdapter simpleAdapter) {
                    this.i = calendarPanelFragment;
                    this.f6953j = simpleAdapter;
                }

                @Override // com.heytap.health.base.view.calendar.a.c
                public void a(@NotNull LocalDate date) {
                    Function1<LocalDate, Unit> function1F;
                    Intrinsics.checkNotNullParameter(date, "date");
                    if ((this.i.getEarliestTime() != null && date.isBefore(pr8.INSTANCE.j(this.i.getEarliestTime().longValue()))) || date.isAfter(this.i.getCurLocalDate()) || (function1F = this.f6953j.f()) == null) {
                        return;
                    }
                    function1F.invoke(date);
                }
            }

            public a(CalendarPanelFragment calendarPanelFragment, SimpleAdapter simpleAdapter) {
                this.a = calendarPanelFragment;
                this.b = simpleAdapter;
            }

            @Override // com.oplus.aiunit.vision.yq2
            public int a() {
                return R$layout.health_sleep_calendar_month_layout;
            }

            @Override // com.oplus.aiunit.vision.yq2
            @Nullable
            public Integer b() {
                return null;
            }

            @Override // com.oplus.aiunit.vision.yq2
            @NotNull
            public com.heytap.health.base.view.calendar.a c(@NotNull View dayParentView) {
                Intrinsics.checkNotNullParameter(dayParentView, "dayParentView");
                float fA = qmg.a(dayParentView.getContext(), 5.0f);
                Context context = dayParentView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "dayParentView.context");
                b bVar = new b(context, dayParentView.getContext().getColor(R$color.health_sleep_5d64e9), new RectF(fA, fA, fA, fA));
                bVar.setOnClickDayListener(new C0640a(this.a, this.b));
                return bVar;
            }

            @Override // com.oplus.aiunit.vision.yq2
            public void d(@NotNull com.heytap.health.base.view.calendar.a dayView, @NotNull LocalDate actualDay) {
                Boolean boolValueOf;
                SleepDataStat sleepDataStat;
                Intrinsics.checkNotNullParameter(dayView, "dayView");
                Intrinsics.checkNotNullParameter(actualDay, "actualDay");
                boolean zAreEqual = Intrinsics.areEqual(actualDay, this.a.getSelectDate());
                Map map = this.b.data;
                boolean z = true;
                if (map != null) {
                    List list = (List) map.get(actualDay);
                    boolValueOf = Boolean.valueOf((list == null || (sleepDataStat = (SleepDataStat) list.get(0)) == null || sleepDataStat.getTotalSleepTime() <= 0) ? false : true);
                } else {
                    boolValueOf = null;
                }
                LocalDate curLocalDate = this.a.getCurLocalDate();
                StringBuilder sb = new StringBuilder();
                sb.append("reflateDayLayout() actualDay=");
                sb.append(actualDay);
                sb.append(" showDot=");
                sb.append(zAreEqual);
                sb.append(" haveDate=");
                sb.append(boolValueOf);
                sb.append(", curLocalDate:");
                sb.append(curLocalDate);
                if (dayView instanceof b) {
                    boolean z2 = this.a.getEarliestTime() != null && actualDay.isBefore(pr8.INSTANCE.j(this.a.getEarliestTime().longValue()));
                    if (!actualDay.isAfter(this.a.getCurLocalDate()) && !z2) {
                        z = false;
                    }
                    ((b) dayView).A(z, Intrinsics.areEqual(boolValueOf, Boolean.TRUE), actualDay, zAreEqual);
                }
            }

            @Override // com.oplus.aiunit.vision.yq2
            public void e(@NotNull View monthParentView, @NotNull LocalDate firstDayOfMonth) {
                Intrinsics.checkNotNullParameter(monthParentView, "monthParentView");
                Intrinsics.checkNotNullParameter(firstDayOfMonth, "firstDayOfMonth");
                ((TextView) monthParentView.findViewById(R$id.month_value)).setText(lo9.g(pr8.INSTANCE.p(firstDayOfMonth), "MMM"));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SimpleAdapter(@NotNull CalendarPanelFragment calendarPanelFragment, @NotNull LocalDate minDate, @Nullable LocalDate maxDate, Function1<? super LocalDate, Unit> function1) {
            Intrinsics.checkNotNullParameter(minDate, "minDate");
            Intrinsics.checkNotNullParameter(maxDate, "maxDate");
            this.f6952n = calendarPanelFragment;
            this.minDate = minDate;
            this.maxDate = maxDate;
            this.onClickDateCallBack = function1;
            this.monthViewBuilder = new as7(e(), false, 2, null);
        }

        public final yq2 e() {
            return new a(this.f6952n, this);
        }

        @Nullable
        public final Function1<LocalDate, Unit> f() {
            return this.onClickDateCallBack;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull SimpleHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            as7 as7Var = this.monthViewBuilder;
            LocalDate localDatePlusMonths = this.minDate.plusMonths(position);
            Intrinsics.checkNotNullExpressionValue(localDatePlusMonths, "minDate.plusMonths(position.toLong())");
            holder.b(as7Var, localDatePlusMonths);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return pr8.INSTANCE.f(this.minDate, this.maxDate) + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public SimpleHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new SimpleHolder(as7.c(this.monthViewBuilder, parent, 0.0f, 0.0f, 6, null));
        }

        public final void i(@NotNull Map<LocalDate, ? extends List<? extends SleepDataStat>> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
            notifyItemRangeChanged(0, data.size());
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/sleep/view/CalendarPanelFragment$SimpleHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/oplus/aiunit/vision/as7;", "monthBuilder", "Ljava/time/LocalDate;", "date", "", "b", "i", "Ljava/time/LocalDate;", "a", "()Ljava/time/LocalDate;", "setDate", "(Ljava/time/LocalDate;)V", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public static final class SimpleHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public LocalDate date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SimpleHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getDate() {
            return this.date;
        }

        public final void b(@NotNull as7 monthBuilder, @NotNull LocalDate date) {
            Intrinsics.checkNotNullParameter(monthBuilder, "monthBuilder");
            Intrinsics.checkNotNullParameter(date, "date");
            this.date = date;
            View view = this.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
            monthBuilder.e((ViewGroup) view, date);
        }
    }

    public CalendarPanelFragment() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocalDate getCurDayLocalDate() {
        pr8 pr8Var = pr8.INSTANCE;
        return pr8Var.j(pr8Var.c(pr8Var.n(System.currentTimeMillis())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocalDate getCurLocalDate() {
        return (LocalDate) this.curLocalDate.getValue();
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
            textView2.setText(parent.getContext().getString(R$string.health_sleep_back_to_today));
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.lr2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CalendarPanelFragment.inflateTextView$lambda$4(this.i, view);
            }
        });
        ConstraintLayout constraintLayout = (ConstraintLayout) parent.findViewById(R$id.week_day_text);
        String[] stringArray = parent.getContext().getResources().getStringArray(R$array.lib_base_week_sun_to_sat);
        Intrinsics.checkNotNullExpressionValue(stringArray, "parent.context.resources…lib_base_week_sun_to_sat)");
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (constraintLayout.getChildAt(i) instanceof TextView) {
                View childAt = constraintLayout.getChildAt(i);
                Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
                ((TextView) childAt).setText(stringArray[RangesKt___RangesKt.coerceAtMost(i, stringArray.length - 1)]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void inflateTextView$lambda$4(CalendarPanelFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LocalDate toDay = LocalDate.now();
        Function1<LocalDate, Unit> function1 = this$0.onClickDateCallBack;
        if (function1 != null) {
            Intrinsics.checkNotNullExpressionValue(toDay, "toDay");
            function1.invoke(toDay);
        }
    }

    private final void refreshMonthView(List<? extends SleepDataStat> data, SimpleAdapter adapter) {
        if (data == null) {
            return;
        }
        m8b.f("SleepCalendar", "refreshMonthView,data size:" + data.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : data) {
            LocalDate localDateJ = pr8.INSTANCE.j(o15.a(((SleepDataStat) obj).getDate()));
            Object arrayList = linkedHashMap.get(localDateJ);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(localDateJ, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        adapter.i(linkedHashMap);
    }

    @Nullable
    public final Long getEarliestTime() {
        return this.earliestTime;
    }

    @Nullable
    public final Function1<LocalDate, Unit> getOnClickDateCallBack() {
        return this.onClickDateCallBack;
    }

    @Nullable
    public final LocalDate getSelectDate() {
        return this.selectDate;
    }

    @Nullable
    public final String getSsoid() {
        return this.ssoid;
    }

    @Override // com.coui.appcompat.panel.COUIPanelFragment
    public void initView(@Nullable View panelView) {
        OLiveData<zeh> oLiveDataA;
        super.initView(panelView);
        if (this.onClickDateCallBack == null && getActivity() != null) {
            m8b.f("SleepCalendar", "onClickDateCallBack is null, activity is not null");
            if (getParentFragment() instanceof COUIBottomSheetDialogFragment) {
                Fragment parentFragment = getParentFragment();
                Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type com.coui.appcompat.panel.COUIBottomSheetDialogFragment");
                COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment = (COUIBottomSheetDialogFragment) parentFragment;
                cOUIBottomSheetDialogFragment.dismiss();
                cOUIBottomSheetDialogFragment.onDestroyView();
                cOUIBottomSheetDialogFragment.onDestroy();
                return;
            }
            return;
        }
        pr8 pr8Var = pr8.INSTANCE;
        LocalDate localDateWith = LocalDateTime.ofInstant(Instant.ofEpochMilli(pr8Var.n(System.currentTimeMillis())), ZoneId.systemDefault()).toLocalDate().with(TemporalAdjusters.lastDayOfMonth());
        Intrinsics.checkNotNullExpressionValue(localDateWith, "ofInstant(Instant.ofEpoc…justers.lastDayOfMonth())");
        this.maxDate = localDateWith;
        if (panelView != null) {
            final View parentView = LayoutInflater.from(panelView.getContext()).inflate(R$layout.health_sleep_calendar_layout, (ViewGroup) null, false);
            Intrinsics.checkNotNullExpressionValue(parentView, "parentView");
            inflateTextView(parentView);
            View viewFindViewById = parentView.findViewById(R$id.recycler_view);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView recyclerView = (RecyclerView) viewFindViewById;
            recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.heytap.health.sleep.view.CalendarPanelFragment$initView$1$1
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(@NotNull RecyclerView recyclerView2, int newState) {
                    Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                    m8b.f("SleepCalendar", "recyclerView onScrollStateChanged");
                    RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                    Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = recyclerView2.findViewHolderForLayoutPosition(((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition());
                    Intrinsics.checkNotNull(viewHolderFindViewHolderForLayoutPosition, "null cannot be cast to non-null type com.heytap.health.sleep.view.CalendarPanelFragment.SimpleHolder");
                    TextView textView = (TextView) parentView.findViewById(R$id.calendar_year_value);
                    LocalDate date = ((CalendarPanelFragment.SimpleHolder) viewHolderFindViewHolderForLayoutPosition).getDate();
                    if (date != null) {
                        m8b.f("SleepCalendar", "recyclerView date:" + date);
                        if (textView == null) {
                            return;
                        }
                        pr8 pr8Var2 = pr8.INSTANCE;
                        textView.setText(pr8Var2.y(pr8Var2.p(date), "yyyy"));
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
                viewGroup.addView(parentView);
            }
            FragmentActivity activity = getActivity();
            if (activity != null) {
                Intrinsics.checkNotNullExpressionValue(activity, "this");
                SleepWeekViewModel sleepWeekViewModel = (SleepWeekViewModel) new ViewModelProvider(activity).get(SleepWeekViewModel.class);
                this.sleepWeekViewModel = sleepWeekViewModel;
                if (sleepWeekViewModel != null) {
                    sleepWeekViewModel.F(this.ssoid);
                }
                SleepWeekViewModel sleepWeekViewModel2 = this.sleepWeekViewModel;
                zeh value = (sleepWeekViewModel2 == null || (oLiveDataA = sleepWeekViewModel2.A()) == null) ? null : oLiveDataA.getValue();
                refreshMonthView(value != null ? value.f() : null, simpleAdapter);
            }
        }
    }

    public final void setSelectDate(@Nullable LocalDate localDate) {
        this.selectDate = localDate;
    }

    public /* synthetic */ CalendarPanelFragment(String str, LocalDate localDate, Long l2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : localDate, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CalendarPanelFragment(@Nullable String str, @Nullable LocalDate localDate, @Nullable Long l2, @Nullable Function1<? super LocalDate, Unit> function1) {
        this.ssoid = str;
        this.selectDate = localDate;
        this.earliestTime = l2;
        this.onClickDateCallBack = function1;
        this.minDate = pr8.INSTANCE.i();
        this.curLocalDate = LazyKt__LazyJVMKt.lazy(new Function0<LocalDate>() { // from class: com.heytap.health.sleep.view.CalendarPanelFragment$curLocalDate$2
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final LocalDate invoke() {
                return this.this$0.getCurDayLocalDate();
            }
        });
    }
}