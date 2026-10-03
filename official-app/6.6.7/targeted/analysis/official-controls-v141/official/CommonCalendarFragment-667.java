package com.heytap.health.healthbase.view;

import android.content.Context;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.coui.appcompat.panel.COUIBottomSheetDialogFragment;
import com.coui.appcompat.panel.COUIPanelFragment;
import com.heytap.health.base.R$array;
import com.heytap.health.base.track.a;
import com.heytap.health.base.view.calendar.b;
import com.heytap.health.health_base.R$id;
import com.heytap.health.health_base.R$layout;
import com.heytap.health.health_base.R$string;
import com.heytap.health.healthbase.view.CommonCalendarFragment;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.as7;
import com.oplus.aiunit.vision.c7n;
import com.oplus.aiunit.vision.g15;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.qmg;
import com.oplus.aiunit.vision.xmk;
import com.oplus.aiunit.vision.yq2;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 22\u00020\u0001:\u0003345B\u008d\u0001\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012%\b\u0002\u0010#\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f\u0012'\b\u0002\u0010'\u001a!\u0012\u0013\u0012\u00110\b¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(%\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010\u001f¢\u0006\u0004\b0\u00101J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR1\u0010#\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R6\u0010'\u001a!\u0012\u0013\u0012\u00110\b¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(%\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010)R\u001e\u0010+\u001a\n **\u0004\u0018\u00010\b0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\nR\u001e\u0010,\u001a\n **\u0004\u0018\u00010\b0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\nR\u001a\u0010.\u001a\u00060-R\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/¨\u00066"}, d2 = {"Lcom/heytap/health/healthbase/view/CommonCalendarFragment;", "Lcom/coui/appcompat/panel/COUIPanelFragment;", "Landroid/view/View;", "parent", "", "inflateTextView", "panelView", "initView", "Ljava/time/LocalDate;", "selectDate", "Ljava/time/LocalDate;", "getSelectDate", "()Ljava/time/LocalDate;", "setSelectDate", "(Ljava/time/LocalDate;)V", "", "earliestTime", "Ljava/lang/Long;", "getEarliestTime", "()Ljava/lang/Long;", "", "", "mapDate", "Ljava/util/Map;", "getMapDate", "()Ljava/util/Map;", "", "color", "I", "getColor", "()I", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "date", "onClickDateCallBack", "Lkotlin/jvm/functions/Function1;", "monthStart", "", "monthSubtitleProvider", "getMonthSubtitleProvider", "()Lkotlin/jvm/functions/Function1;", "kotlin.jvm.PlatformType", "minDate", "maxDate", "Lcom/heytap/health/healthbase/view/CommonCalendarFragment$SimpleAdapter;", "mAdapter", "Lcom/heytap/health/healthbase/view/CommonCalendarFragment$SimpleAdapter;", "<init>", "(Ljava/time/LocalDate;Ljava/lang/Long;Ljava/util/Map;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "a", "SimpleAdapter", "SimpleHolder", "health_base_release"}, k = 1, mv = {1, 8, 0})
public final class CommonCalendarFragment extends COUIPanelFragment {

    @NotNull
    public static final String TAG = "CalendarPanelFragment";
    private final int color;

    @Nullable
    private final Long earliestTime;
    private SimpleAdapter mAdapter;

    @NotNull
    private final Map<LocalDate, Float> mapDate;
    private LocalDate maxDate;
    private LocalDate minDate;

    @Nullable
    private final Function1<LocalDate, CharSequence> monthSubtitleProvider;

    @Nullable
    private final Function1<LocalDate, Unit> onClickDateCallBack;

    @Nullable
    private LocalDate selectDate;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B<\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012#\u0010 \u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\n\u0018\u00010\u0018¢\u0006\u0004\b)\u0010*J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\"\u0010\u0012\u001a\u00020\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0011\u001a\u00020\u0005J\b\u0010\u0014\u001a\u00020\u0013H\u0002R\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R4\u0010 \u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\n\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R$\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\u0011\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/heytap/health/healthbase/view/CommonCalendarFragment$SimpleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/heytap/health/healthbase/view/CommonCalendarFragment$SimpleHolder;", "Landroid/view/ViewGroup;", "parent", "", ParserTag.VIEW_TYPE, "i", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "position", "", c7n.g, "getItemCount", "", "Ljava/time/LocalDate;", "", "data", "selectColor", "j", "Lcom/oplus/aiunit/vision/yq2;", "f", "Ljava/time/LocalDate;", "minDate", "maxDate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "date", MapSchema.FIELD_NAME_KEY, "Lkotlin/jvm/functions/Function1;", c7n.f, "()Lkotlin/jvm/functions/Function1;", "onClickDateCallBack", "Lcom/oplus/aiunit/vision/as7;", LogFieldKey.LEVEL_KEY, "Lcom/oplus/aiunit/vision/as7;", "monthViewBuilder", LogFieldKey.MESSAGE_KEY, "Ljava/util/Map;", "n", "I", "<init>", "(Lcom/heytap/health/healthbase/view/CommonCalendarFragment;Ljava/time/LocalDate;Ljava/time/LocalDate;Lkotlin/jvm/functions/Function1;)V", "health_base_release"}, k = 1, mv = {1, 8, 0})
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
        public Map<LocalDate, Float> data;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        public int selectColor;
        public final /* synthetic */ CommonCalendarFragment o;

        @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/heytap/health/healthbase/view/CommonCalendarFragment$SimpleAdapter$a", "Lcom/oplus/aiunit/vision/yq2;", "", "a", "Landroid/view/View;", "dayParentView", "Lcom/heytap/health/base/view/calendar/a;", "c", "dayView", "Ljava/time/LocalDate;", "actualDay", "", "d", "monthParentView", "firstDayOfMonth", MapSchema.FIELD_NAME_ENTRY, "b", "()Ljava/lang/Integer;", "health_base_release"}, k = 1, mv = {1, 8, 0})
        public static final class a implements yq2 {
            public final /* synthetic */ CommonCalendarFragment b;

            /* JADX INFO: renamed from: com.heytap.health.healthbase.view.CommonCalendarFragment$SimpleAdapter$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/healthbase/view/CommonCalendarFragment$SimpleAdapter$a$a", "Lcom/heytap/health/base/view/calendar/a$c;", "Ljava/time/LocalDate;", "date", "", "a", "health_base_release"}, k = 1, mv = {1, 8, 0})
            public static final class C0448a implements com.heytap.health.base.view.calendar.a.c {
                public final /* synthetic */ CommonCalendarFragment i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ SimpleAdapter f5653j;

                public C0448a(CommonCalendarFragment commonCalendarFragment, SimpleAdapter simpleAdapter) {
                    this.i = commonCalendarFragment;
                    this.f5653j = simpleAdapter;
                }

                @Override // com.heytap.health.base.view.calendar.a.c
                public void a(@NotNull LocalDate date) {
                    Intrinsics.checkNotNullParameter(date, "date");
                    if ((this.i.getEarliestTime() == null || !date.isBefore(h15.D(this.i.getEarliestTime().longValue()))) && !date.isAfter(LocalDate.now())) {
                        com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 3).a(xmk.TAG_POSTION1, 3).a(xmk.TAG_POSTION2, 2).a("element", date.toString()).b();
                        Function1<LocalDate, Unit> function1G = this.f5653j.g();
                        if (function1G != null) {
                            function1G.invoke(date);
                        }
                    }
                }
            }

            public a(CommonCalendarFragment commonCalendarFragment) {
                this.b = commonCalendarFragment;
            }

            @Override // com.oplus.aiunit.vision.yq2
            public int a() {
                return R$layout.health_calendar_month_layout;
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
                b bVar = new b(context, SimpleAdapter.this.selectColor, new RectF(fA, fA, fA, fA));
                bVar.setOnClickDayListener(new C0448a(this.b, SimpleAdapter.this));
                return bVar;
            }

            @Override // com.oplus.aiunit.vision.yq2
            public void d(@NotNull com.heytap.health.base.view.calendar.a dayView, @NotNull LocalDate actualDay) {
                Float f;
                Intrinsics.checkNotNullParameter(dayView, "dayView");
                Intrinsics.checkNotNullParameter(actualDay, "actualDay");
                boolean zAreEqual = Intrinsics.areEqual(actualDay, this.b.getSelectDate());
                Map map = SimpleAdapter.this.data;
                float fFloatValue = (map == null || (f = (Float) map.get(actualDay)) == null) ? 0.0f : f.floatValue();
                if (dayView instanceof b) {
                    boolean z = true;
                    boolean z2 = this.b.getEarliestTime() != null && actualDay.isBefore(h15.D(this.b.getEarliestTime().longValue()));
                    if (!actualDay.isAfter(LocalDate.now()) && !z2) {
                        z = false;
                    }
                    ((b) dayView).z(z, fFloatValue, actualDay, zAreEqual);
                }
            }

            @Override // com.oplus.aiunit.vision.yq2
            public void e(@NotNull View monthParentView, @NotNull LocalDate firstDayOfMonth) {
                Intrinsics.checkNotNullParameter(monthParentView, "monthParentView");
                Intrinsics.checkNotNullParameter(firstDayOfMonth, "firstDayOfMonth");
                ((TextView) monthParentView.findViewById(R$id.month_value)).setText(lo9.g(g15.j(firstDayOfMonth), "MMM"));
                TextView textView = (TextView) monthParentView.findViewById(R$id.congratulation);
                Function1<LocalDate, CharSequence> monthSubtitleProvider = this.b.getMonthSubtitleProvider();
                CharSequence charSequenceInvoke = monthSubtitleProvider != null ? monthSubtitleProvider.invoke(firstDayOfMonth) : null;
                if (charSequenceInvoke == null || StringsKt__StringsJVMKt.isBlank(charSequenceInvoke)) {
                    textView.setVisibility(8);
                    textView.setText("");
                } else {
                    textView.setVisibility(0);
                    textView.setText(charSequenceInvoke);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SimpleAdapter(@NotNull CommonCalendarFragment commonCalendarFragment, @NotNull LocalDate minDate, @Nullable LocalDate maxDate, Function1<? super LocalDate, Unit> function1) {
            Intrinsics.checkNotNullParameter(minDate, "minDate");
            Intrinsics.checkNotNullParameter(maxDate, "maxDate");
            this.o = commonCalendarFragment;
            this.minDate = minDate;
            this.maxDate = maxDate;
            this.onClickDateCallBack = function1;
            this.monthViewBuilder = new as7(f(), false, 2, null);
            this.selectColor = 16739125;
        }

        public final yq2 f() {
            return new a(this.o);
        }

        @Nullable
        public final Function1<LocalDate, Unit> g() {
            return this.onClickDateCallBack;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return g15.INSTANCE.b(this.minDate, this.maxDate) + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull SimpleHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            as7 as7Var = this.monthViewBuilder;
            LocalDate localDatePlusMonths = this.minDate.plusMonths(position);
            Intrinsics.checkNotNullExpressionValue(localDatePlusMonths, "minDate.plusMonths(position.toLong())");
            holder.b(as7Var, localDatePlusMonths);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public SimpleHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new SimpleHolder(as7.c(this.monthViewBuilder, parent, 0.0f, 0.0f, 6, null));
        }

        public final void j(@NotNull Map<LocalDate, Float> data, int selectColor) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
            this.selectColor = selectColor;
            notifyDataSetChanged();
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/healthbase/view/CommonCalendarFragment$SimpleHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/oplus/aiunit/vision/as7;", "monthBuilder", "Ljava/time/LocalDate;", "date", "", "b", "i", "Ljava/time/LocalDate;", "a", "()Ljava/time/LocalDate;", "setDate", "(Ljava/time/LocalDate;)V", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "health_base_release"}, k = 1, mv = {1, 8, 0})
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

    public /* synthetic */ CommonCalendarFragment(LocalDate localDate, Long l2, Map map, int i, Function1 function1, Function1 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : localDate, (i2 & 2) != 0 ? null : l2, map, (i2 & 8) != 0 ? 16739125 : i, (i2 & 16) != 0 ? null : function1, (i2 & 32) != 0 ? null : function2);
    }

    private final void inflateTextView(View parent) {
        TextView textView = (TextView) parent.findViewById(R$id.calendar_year_value);
        TextView textView2 = (TextView) parent.findViewById(R$id.back_to_today);
        if (textView != null) {
            LocalDate localDate = this.selectDate;
            textView.setText(lo9.g(localDate != null ? h15.x(localDate) : System.currentTimeMillis(), "yyyy"));
        }
        if (textView2 != null) {
            textView2.setText(parent.getContext().getString(R$string.health_base_back_to_today));
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.in3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonCalendarFragment.inflateTextView$lambda$1(this.i, view);
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
    public static final void inflateTextView$lambda$1(CommonCalendarFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a.k().a(xmk.TAG_MODULE_ID, 3).a(xmk.TAG_POSTION1, 3).a(xmk.TAG_POSTION2, 1).b();
        LocalDate toDay = LocalDate.now();
        Function1<LocalDate, Unit> function1 = this$0.onClickDateCallBack;
        if (function1 != null) {
            Intrinsics.checkNotNullExpressionValue(toDay, "toDay");
            function1.invoke(toDay);
        }
    }

    public final int getColor() {
        return this.color;
    }

    @Nullable
    public final Long getEarliestTime() {
        return this.earliestTime;
    }

    @NotNull
    public final Map<LocalDate, Float> getMapDate() {
        return this.mapDate;
    }

    @Nullable
    public final Function1<LocalDate, CharSequence> getMonthSubtitleProvider() {
        return this.monthSubtitleProvider;
    }

    @Nullable
    public final LocalDate getSelectDate() {
        return this.selectDate;
    }

    @Override // com.coui.appcompat.panel.COUIPanelFragment
    public void initView(@Nullable View panelView) {
        super.initView(panelView);
        if (this.onClickDateCallBack == null && getActivity() != null) {
            m8b.f("CalendarPanelFragment", "onClickDateCallBack is null, activity is not null");
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
        SimpleAdapter simpleAdapter = null;
        if (panelView != null) {
            final View parentView = LayoutInflater.from(panelView.getContext()).inflate(R$layout.health_calendar_layout, (ViewGroup) null, false);
            Intrinsics.checkNotNullExpressionValue(parentView, "parentView");
            inflateTextView(parentView);
            View viewFindViewById = parentView.findViewById(R$id.recycler_view);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView recyclerView = (RecyclerView) viewFindViewById;
            recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.heytap.health.healthbase.view.CommonCalendarFragment$initView$1$1
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(@NotNull RecyclerView recyclerView2, int newState) {
                    Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                    m8b.f("CalendarPanelFragment", "recyclerView onScrollStateChanged");
                    RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                    Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = recyclerView2.findViewHolderForLayoutPosition(((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition());
                    Intrinsics.checkNotNull(viewHolderFindViewHolderForLayoutPosition, "null cannot be cast to non-null type com.heytap.health.healthbase.view.CommonCalendarFragment.SimpleHolder");
                    TextView textView = (TextView) parentView.findViewById(R$id.calendar_year_value);
                    LocalDate date = ((CommonCalendarFragment.SimpleHolder) viewHolderFindViewHolderForLayoutPosition).getDate();
                    if (date == null || textView == null) {
                        return;
                    }
                    textView.setText(lo9.g(g15.j(date), "yyyy"));
                }
            });
            LocalDate minDate = this.minDate;
            Intrinsics.checkNotNullExpressionValue(minDate, "minDate");
            LocalDate maxDate = this.maxDate;
            Intrinsics.checkNotNullExpressionValue(maxDate, "maxDate");
            SimpleAdapter simpleAdapter2 = new SimpleAdapter(this, minDate, maxDate, this.onClickDateCallBack);
            this.mAdapter = simpleAdapter2;
            recyclerView.setAdapter(simpleAdapter2);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(panelView.getContext());
            linearLayoutManager.setOrientation(1);
            recyclerView.setLayoutManager(linearLayoutManager);
            g15 g15Var = g15.INSTANCE;
            LocalDate minDate2 = this.minDate;
            Intrinsics.checkNotNullExpressionValue(minDate2, "minDate");
            LocalDate localDate = this.selectDate;
            if (localDate == null) {
                localDate = this.maxDate;
            }
            Intrinsics.checkNotNullExpressionValue(localDate, "selectDate?:maxDate");
            recyclerView.scrollToPosition(g15Var.b(minDate2, localDate));
            View contentView = getContentView();
            ViewGroup viewGroup = contentView instanceof ViewGroup ? (ViewGroup) contentView : null;
            if (viewGroup != null) {
                viewGroup.addView(parentView);
            }
        }
        SimpleAdapter simpleAdapter3 = this.mAdapter;
        if (simpleAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            simpleAdapter = simpleAdapter3;
        }
        simpleAdapter.j(this.mapDate, this.color);
    }

    public final void setSelectDate(@Nullable LocalDate localDate) {
        this.selectDate = localDate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommonCalendarFragment(@Nullable LocalDate localDate, @Nullable Long l2, @NotNull Map<LocalDate, Float> mapDate, int i, @Nullable Function1<? super LocalDate, Unit> function1, @Nullable Function1<? super LocalDate, ? extends CharSequence> function2) {
        Intrinsics.checkNotNullParameter(mapDate, "mapDate");
        this.selectDate = localDate;
        this.earliestTime = l2;
        this.mapDate = mapDate;
        this.color = i;
        this.onClickDateCallBack = function1;
        this.monthSubtitleProvider = function2;
        this.minDate = LocalDate.of(2023, 1, 1);
        this.maxDate = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
    }
}