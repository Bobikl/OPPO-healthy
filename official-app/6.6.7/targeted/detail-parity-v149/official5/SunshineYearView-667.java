package com.heytap.health.sunshine.ui.detail;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.sunshine.SunshineStat;
import com.heytap.health.base.R$color;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.core.widget.charts.components.markerview.CommonMarkerView;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.heytap.health.sunshine.R$string;
import com.heytap.health.sunshine.ui.chart.BaseChart;
import com.heytap.health.sunshine.ui.chart.BaseStatChart;
import com.heytap.health.sunshine.ui.chart.HChartTouchListener;
import com.heytap.health.sunshine.ui.compose.StatDataAnalyzeKt;
import com.heytap.health.sunshine.ui.detail.SunshineYearView;
import com.heytap.health.sunshine.util.ChartType;
import com.heytap.health.sunshine.viewmodel.SunshineStatAnalyzeVM;
import com.heytap.sporthealth.blib.compose.composable.DatePickerKt;
import com.heytap.sporthealth.blib.compose.modifier.AutoClipContentModifierKt;
import com.heytap.sporthealth.blib.compose.modifier.OverScrollModifierKt;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.j7j;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.ohb;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.xp0;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.MapsKt__MapsJVMKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001\tB#\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\u0006\u0010!\u001a\u00020\u0015¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0002J\u001e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0016\u0010\u0010\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u001c\u0010\u0017\u001a\u00020\b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014H\u0002R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010!\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0005\u001a\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u00060"}, d2 = {"Lcom/heytap/health/sunshine/ui/detail/SunshineYearView;", "Lcom/heytap/health/sunshine/ui/chart/BaseStatChart;", "Lcom/heytap/health/sunshine/util/ChartType;", "type", "Landroid/view/View;", "J", "Lcom/heytap/health/sunshine/ui/chart/BaseChart;", "chart", "", "a", "N", "", "Lcom/heytap/databaseengine/model/sunshine/SunshineStat;", "list", SecureGcmConstants.MESSAGE_KEY, "", "O", "K", "dayStats", "I", "Lkotlin/Pair;", "", "rangePair", "Q", "Lcom/heytap/health/base/base/BaseFragment;", "s", "Lcom/heytap/health/base/base/BaseFragment;", "L", "()Lcom/heytap/health/base/base/BaseFragment;", "fragment", "t", "getLocationTime", "()J", "locationTime", "Landroidx/compose/runtime/MutableState;", "", "u", "Landroidx/compose/runtime/MutableState;", "mDateTitle", "Lcom/heytap/health/sunshine/viewmodel/SunshineStatAnalyzeVM;", "v", "Lcom/heytap/health/sunshine/viewmodel/SunshineStatAnalyzeVM;", "mStatFragmentVM", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "familyConfig", "<init>", "(Lcom/heytap/health/base/base/BaseFragment;Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;J)V", "Companion", "sunshine_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSunshineYearView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SunshineYearView.kt\ncom/heytap/health/sunshine/ui/detail/SunshineYearView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,329:1\n1477#2:330\n1502#2,3:331\n1505#2,3:341\n1963#2,14:348\n288#2,2:362\n288#2,2:364\n372#3,7:334\n125#4:344\n152#4,2:345\n154#4:366\n1#5:347\n*S KotlinDebug\n*F\n+ 1 SunshineYearView.kt\ncom/heytap/health/sunshine/ui/detail/SunshineYearView\n*L\n281#1:330\n281#1:331,3\n281#1:341,3\n292#1:348,14\n296#1:362,2\n297#1:364,2\n281#1:334,7\n284#1:344\n284#1:345,2\n284#1:366\n*E\n"})
public final class SunshineYearView extends BaseStatChart {

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final BaseFragment fragment;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final long locationTime;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final MutableState<String> mDateTitle;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final SunshineStatAnalyzeVM mStatFragmentVM;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/health/sunshine/ui/detail/SunshineYearView$b", "Lcom/oplus/aiunit/vision/ohb;", "Lcom/github/mikephil/charting/data/Entry;", "entry", "", "b", "a", "sunshine_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends ohb {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.ohb
        @NotNull
        public String a(@NotNull Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Object data = entry.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.TimeStampedData");
            return ((int) ((TimeStampedData) data).getY()) + SunshineYearView.this.getFragment().getString(R$string.health_sunshine_minute);
        }

        @Override // com.oplus.aiunit.vision.ohb
        @NotNull
        public String b(@NotNull Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            if (!(entry.getData() instanceof TimeStampedData)) {
                return "anything";
            }
            Object data = entry.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.TimeStampedData");
            String strG = lo9.g(((TimeStampedData) data).getTimestamp(), "yyyMMM");
            Intrinsics.checkNotNullExpressionValue(strG, "{\n                      …                        }");
            return strG;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.i = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p010kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.i;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.i.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SunshineYearView(@NotNull BaseFragment fragment, @Nullable FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBean, long j2) {
        super(fragment, familyMoreDataDetailConfigBean);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
        this.locationTime = j2;
        this.mDateTitle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.mStatFragmentVM = (SunshineStatAnalyzeVM) new ViewModelProvider(fragment).get(SunshineStatAnalyzeVM.class);
    }

    public static final String M(SunshineYearView this$0, int i, double d) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i2 = (int) d;
        if (i2 < 0 || this$0.o().size() <= i2) {
            return "";
        }
        long timestamp = this$0.o().get(i2).getTimestamp();
        return i == 0 ? lo9.g(timestamp, "MMM") : String.valueOf(LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()).toLocalDate().getMonthValue());
    }

    public final List<SunshineStat> I(List<SunshineStat> dayStats) {
        Integer numValueOf;
        Object next;
        Integer numValueOf2;
        Object next2;
        String ssoid;
        String dataClient;
        if (dayStats.isEmpty()) {
            return new ArrayList();
        }
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyyMMdd");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : dayStats) {
            LocalDate localDateWith = h15.D(o15.a(((SunshineStat) obj).getDate())).with(TemporalAdjusters.firstDayOfMonth());
            Object arrayList = linkedHashMap.get(localDateWith);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(localDateWith, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        SortedMap sortedMap = MapsKt__MapsJVMKt.toSortedMap(linkedHashMap);
        ArrayList arrayList2 = new ArrayList(sortedMap.size());
        for (Map.Entry entry : sortedMap.entrySet()) {
            LocalDate localDate = (LocalDate) entry.getKey();
            List values = (List) entry.getValue();
            String str = localDate.format(dateTimeFormatterOfPattern);
            Intrinsics.checkNotNullExpressionValue(str, "monthDate.format(formatter)");
            SunshineStat sunshineStat = new SunshineStat(null, null, null, Integer.parseInt(str), 0, 0, 0, 0, 0L, 0, 0, 0, 0, 8183, null);
            Intrinsics.checkNotNullExpressionValue(values, "values");
            List list = values;
            Iterator it = list.iterator();
            int totalDuration = 0;
            while (it.hasNext()) {
                totalDuration += ((SunshineStat) it.next()).getTotalDuration();
            }
            sunshineStat.setTotalDuration(totalDuration);
            Iterator it2 = list.iterator();
            Object obj2 = null;
            if (it2.hasNext()) {
                numValueOf = Integer.valueOf(((SunshineStat) it2.next()).getTargetDuration());
                while (it2.hasNext()) {
                    Integer numValueOf3 = Integer.valueOf(((SunshineStat) it2.next()).getTargetDuration());
                    if (numValueOf.compareTo(numValueOf3) < 0) {
                        numValueOf = numValueOf3;
                    }
                }
            } else {
                numValueOf = null;
            }
            Integer num = numValueOf;
            sunshineStat.setTargetDuration(num != null ? num.intValue() : 0);
            Iterator it3 = list.iterator();
            int vitaminD = 0;
            while (it3.hasNext()) {
                vitaminD += ((SunshineStat) it3.next()).getVitaminD();
            }
            sunshineStat.setVitaminD(vitaminD);
            Iterator it4 = list.iterator();
            if (it4.hasNext()) {
                next = it4.next();
                if (it4.hasNext()) {
                    long vitaminDIngestionTime = ((SunshineStat) next).getVitaminDIngestionTime();
                    do {
                        Object next3 = it4.next();
                        long vitaminDIngestionTime2 = ((SunshineStat) next3).getVitaminDIngestionTime();
                        if (vitaminDIngestionTime < vitaminDIngestionTime2) {
                            next = next3;
                            vitaminDIngestionTime = vitaminDIngestionTime2;
                        }
                    } while (it4.hasNext());
                }
            } else {
                next = null;
            }
            SunshineStat sunshineStat2 = (SunshineStat) next;
            sunshineStat.setVitaminDIngestion(sunshineStat2 != null ? sunshineStat2.getVitaminDIngestion() : 0);
            sunshineStat.setVitaminDIngestionTime(sunshineStat2 != null ? sunshineStat2.getVitaminDIngestionTime() : 0L);
            Iterator it5 = list.iterator();
            if (it5.hasNext()) {
                numValueOf2 = Integer.valueOf(((SunshineStat) it5.next()).getGoalComplete());
                while (it5.hasNext()) {
                    Integer numValueOf4 = Integer.valueOf(((SunshineStat) it5.next()).getGoalComplete());
                    if (numValueOf2.compareTo(numValueOf4) < 0) {
                        numValueOf2 = numValueOf4;
                    }
                }
            } else {
                numValueOf2 = null;
            }
            Integer num2 = numValueOf2;
            sunshineStat.setGoalComplete(num2 != null ? num2.intValue() : 0);
            Iterator it6 = list.iterator();
            do {
                if (!it6.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it6.next();
            } while (!(((SunshineStat) next2).getSsoid().length() > 0));
            SunshineStat sunshineStat3 = (SunshineStat) next2;
            String str2 = "";
            if (sunshineStat3 == null || (ssoid = sunshineStat3.getSsoid()) == null) {
                ssoid = "";
            }
            sunshineStat.setSsoid(ssoid);
            for (Object obj3 : list) {
                if (((SunshineStat) obj3).getDataClient().length() > 0) {
                    obj2 = obj3;
                    break;
                }
            }
            SunshineStat sunshineStat4 = (SunshineStat) obj2;
            if (sunshineStat4 != null && (dataClient = sunshineStat4.getDataClient()) != null) {
                str2 = dataClient;
            }
            sunshineStat.setDataClient(str2);
            arrayList2.add(sunshineStat);
        }
        return CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
    }

    @NotNull
    public View J() {
        Context contextRequireContext = this.fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "fragment.requireContext()");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1179152522, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.detail.SunshineYearView$createView$1$1
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer, int i) {
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1179152522, i, -1, "com.heytap.health.sunshine.ui.detail.SunshineYearView.createView.<anonymous>.<anonymous> (SunshineYearView.kt:73)");
                }
                final SunshineYearView sunshineYearView = this.this$0;
                composer.startReplaceableGroup(-483455358);
                Modifier.Companion companion = Modifier.INSTANCE;
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                composer.disableReusing();
                Composer composerM1259constructorimpl = Updater.m1259constructorimpl(composer);
                Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl, density, companion3.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
                composer.enableReusing();
                function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifierB = AutoClipContentModifierKt.b(BackgroundKt.m163backgroundbw27NRU$default(companion, ColorResources_androidKt.colorResource(R$color.lib_base_card_white_bg, composer, 0), null, 2, null));
                composer.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierB);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                composer.disableReusing();
                Composer composerM1259constructorimpl2 = Updater.m1259constructorimpl(composer);
                Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion3.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                composer.enableReusing();
                function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                DatePickerKt.a(sunshineYearView.mDateTitle, new Function0<Unit>() { // from class: com.heytap.health.sunshine.ui.detail.SunshineYearView$createView$1$1$1$1$1
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sunshineYearView.q(false);
                    }
                }, new Function0<Unit>() { // from class: com.heytap.health.sunshine.ui.detail.SunshineYearView$createView$1$1$1$1$2
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sunshineYearView.q(true);
                    }
                }, sunshineYearView.n(), 0L, new Function0<Unit>() { // from class: com.heytap.health.sunshine.ui.detail.SunshineYearView$createView$1$1$1$1$3
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        sunshineYearView.t();
                    }
                }, composer, 0, 16);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                LazyDslKt.LazyColumn(OverScrollModifierKt.b(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), false, null, 0.0f, 0.0f, null, null, 63, null), null, null, false, null, null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.heytap.health.sunshine.ui.detail.SunshineYearView$createView$1$1$1$2
                    {
                        super(1);
                    }

                    @Override // p010kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                        invoke2(lazyListScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull LazyListScope LazyColumn) {
                        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                        final SunshineYearView sunshineYearView2 = sunshineYearView;
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(17643308, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.detail.SunshineYearView$createView$1$1$1$2.1
                            {
                                super(3);
                            }

                            @Override // p010kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer2, Integer num) {
                                invoke(lazyItemScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull LazyItemScope item, @Nullable Composer composer2, int i2) {
                                Intrinsics.checkNotNullParameter(item, "$this$item");
                                if ((i2 & 81) == 16 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(17643308, i2, -1, "com.heytap.health.sunshine.ui.detail.SunshineYearView.createView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SunshineYearView.kt:89)");
                                }
                                sunshineYearView2.c(composer2, 8);
                                StatDataAnalyzeKt.a(AutoClipContentModifierKt.b(Modifier.INSTANCE), 7, sunshineYearView2.mStatFragmentVM.M(), composer2, 512, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 3, null);
                    }
                }, composer, 0, 254);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return composeView;
    }

    public final void K() {
        getMViewModel().F().observe(this.fragment, new c(new Function1<List<? extends SunshineStat>, Unit>() { // from class: com.heytap.health.sunshine.ui.detail.SunshineYearView$dataChangeListener$1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends SunshineStat> list) {
                invoke2((List<SunshineStat>) list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<SunshineStat> list) {
                SunshineYearView sunshineYearView = this.this$0;
                Intrinsics.checkNotNullExpressionValue(list, "list");
                List listI = sunshineYearView.I(list);
                this.this$0.O(listI);
                SunshineYearView sunshineYearView2 = this.this$0;
                sunshineYearView2.P(sunshineYearView2.m(), listI);
            }
        }));
        this.mStatFragmentVM.N().observe(this.fragment, new c(new Function1<Pair<? extends Long, ? extends Long>, Unit>() { // from class: com.heytap.health.sunshine.ui.detail.SunshineYearView$dataChangeListener$2
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Long, ? extends Long> pair) {
                invoke2((Pair<Long, Long>) pair);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Pair<Long, Long> rangePair) {
                SunshineYearView sunshineYearView = this.this$0;
                Intrinsics.checkNotNullExpressionValue(rangePair, "rangePair");
                sunshineYearView.Q(rangePair);
                j7j j7jVar = j7j.INSTANCE;
                LocalDate localDateY = h15.y(j7jVar.c(rangePair.getFirst().longValue()));
                LocalDate localDateH = h15.h(j7jVar.c(rangePair.getSecond().longValue()));
                List<SunshineStat> value = this.this$0.getMViewModel().F().getValue();
                if (value != null) {
                    SunshineStatAnalyzeVM sunshineStatAnalyzeVM = this.this$0.mStatFragmentVM;
                    String str = localDateY.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
                    Intrinsics.checkNotNullExpressionValue(str, "startLocalDate.format(Da…er.ofPattern(\"yyyyMMdd\"))");
                    int i = Integer.parseInt(str);
                    String str2 = localDateH.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
                    Intrinsics.checkNotNullExpressionValue(str2, "endLocalDate.format(Date…er.ofPattern(\"yyyyMMdd\"))");
                    sunshineStatAnalyzeVM.E(value, i, Integer.parseInt(str2), 7);
                }
                this.this$0.m().moveViewToX(this.this$0.v(rangePair.getFirst().longValue()));
                long jH = h15.H(h15.y(j7jVar.c(rangePair.getFirst().longValue())));
                long jH2 = h15.H(h15.h(j7jVar.c(rangePair.getSecond().longValue())));
                this.this$0.x(rangePair.getFirst().longValue(), rangePair.getSecond().longValue());
                this.this$0.w(jH, jH2);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: L, reason: from getter */
    public final BaseFragment getFragment() {
        return this.fragment;
    }

    public final void N() {
        K();
    }

    public final void O(List<SunshineStat> list) {
        if (list.isEmpty()) {
            return;
        }
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate localDateD = h15.D(o15.a(((SunshineStat) CollectionsKt___CollectionsKt.last((List) list)).getDate()));
        int monthValue = 12 - localDateD.getMonthValue();
        int i = 1;
        if (1 > monthValue) {
            return;
        }
        while (true) {
            String date = localDateD.plusMonths(i).format(dateTimeFormatterOfPattern);
            Intrinsics.checkNotNullExpressionValue(date, "date");
            list.add(new SunshineStat(null, null, null, Integer.parseInt(date), 0, 0, 0, 0, 0L, 0, 0, 0, 0, 8183, null));
            if (i == monthValue) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void P(BaseChart chart, List<SunshineStat> list) {
        int date;
        long jT;
        Pair<Long, Long> value;
        m8b.f("SunshineYearView", "updateChartData list:" + list);
        if (list.isEmpty()) {
            return;
        }
        long jA = o15.a(((SunshineStat) CollectionsKt___CollectionsKt.first((List) list)).getDate());
        j7j j7jVar = j7j.INSTANCE;
        long jBetween = ChronoUnit.MONTHS.between(j7jVar.c(jA), j7jVar.c(j7jVar.b(o15.a(((SunshineStat) CollectionsKt___CollectionsKt.last((List) list)).getDate()))));
        chart.setTimeXAxisMinimum(0L);
        chart.setTimeXAxisMaximum(jBetween);
        chart.setVisibleXRange(12.0f, 12.0f);
        o().clear();
        o().addAll(CollectionsKt___CollectionsKt.toMutableList((Collection) k(list)));
        chart.setBarEntryDataYear(o());
        if (getInitedTime() && (value = this.mStatFragmentVM.N().getValue()) != null) {
            LocalDate localDateY = h15.y(j7jVar.c(value.getFirst().longValue()));
            LocalDate localDateH = h15.h(j7jVar.c(value.getSecond().longValue()));
            List<SunshineStat> value2 = getMViewModel().F().getValue();
            if (value2 != null) {
                SunshineStatAnalyzeVM sunshineStatAnalyzeVM = this.mStatFragmentVM;
                String str = localDateY.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
                Intrinsics.checkNotNullExpressionValue(str, "startLocalDate.format(Da…er.ofPattern(\"yyyyMMdd\"))");
                int i = Integer.parseInt(str);
                String str2 = localDateH.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
                Intrinsics.checkNotNullExpressionValue(str2, "endLocalDate.format(Date…er.ofPattern(\"yyyyMMdd\"))");
                sunshineStatAnalyzeVM.E(value2, i, Integer.parseInt(str2), 7);
                return;
            }
            return;
        }
        r(true);
        long j2 = this.locationTime;
        if (j2 > 0) {
            LocalDate localDatePlusMonths = h15.D(j2).plusMonths(11L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusMonths, "locationTime.toLocalDate().plusMonths(11)");
            jT = h15.H(localDatePlusMonths);
        } else {
            int size = list.size() - 1;
            while (true) {
                if (-1 >= size) {
                    date = 0;
                    break;
                }
                SunshineStat sunshineStat = list.get(size);
                if (StringsKt__StringsKt.contains$default((CharSequence) sunshineStat.getDataClient(), (CharSequence) ":", false, 2, (Object) null)) {
                    date = sunshineStat.getDate();
                    break;
                }
                size--;
            }
            if (date == 0) {
                for (int size2 = list.size() - 1; -1 < size2; size2--) {
                    SunshineStat sunshineStat2 = list.get(size2);
                    if (sunshineStat2.getSsoid().length() > 0) {
                        date = sunshineStat2.getDate();
                        break;
                    }
                }
            }
            if (date == 0) {
                SunshineStat sunshineStat3 = (SunshineStat) CollectionsKt___CollectionsKt.lastOrNull((List) list);
                date = sunshineStat3 != null ? sunshineStat3.getDate() : 0;
            }
            pr8 pr8Var = pr8.INSTANCE;
            long jG = pr8Var.g(date);
            StringBuilder sb = new StringBuilder();
            sb.append("lastValidTime:");
            sb.append(jG);
            long jU = pr8Var.u(jG);
            jT = pr8Var.t(jG);
            j2 = jU;
        }
        this.mStatFragmentVM.P(new Pair<>(Long.valueOf(j2), Long.valueOf(jT)));
    }

    public final void Q(Pair<Long, Long> rangePair) {
        String strG;
        String strG2;
        String str;
        j7j j7jVar = j7j.INSTANCE;
        LocalDate localDateC = j7jVar.c(rangePair.getFirst().longValue());
        LocalDate localDateA = j7jVar.a();
        if (localDateC.getMonthValue() == 1) {
            strG = lo9.g(rangePair.getFirst().longValue(), "yyyy");
            Intrinsics.checkNotNullExpressionValue(strG, "localeDateFormat(rangePair.first, \"yyyy\")");
            strG2 = lo9.g(rangePair.getSecond().longValue(), "yyyy");
            Intrinsics.checkNotNullExpressionValue(strG2, "localeDateFormat(rangePair.second, \"yyyy\")");
        } else if (localDateC.getYear() == localDateA.getYear()) {
            strG = lo9.g(rangePair.getFirst().longValue(), "MMM");
            Intrinsics.checkNotNullExpressionValue(strG, "localeDateFormat(rangePair.first, \"MMM\")");
            strG2 = lo9.g(rangePair.getSecond().longValue(), "MMM");
            Intrinsics.checkNotNullExpressionValue(strG2, "localeDateFormat(rangePair.second, \"MMM\")");
        } else {
            strG = lo9.g(rangePair.getFirst().longValue(), "yyyyMMM");
            Intrinsics.checkNotNullExpressionValue(strG, "localeDateFormat(rangePair.first, \"yyyyMMM\")");
            strG2 = lo9.g(rangePair.getSecond().longValue(), "yyyyMMM");
            Intrinsics.checkNotNullExpressionValue(strG2, "localeDateFormat(rangePair.second, \"yyyyMMM\")");
        }
        if (localDateC.getMonthValue() == 1) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("%1$s", Arrays.copyOf(new Object[]{strG}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        } else {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            str = String.format("%1$s-%2$s", Arrays.copyOf(new Object[]{strG, strG2}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        }
        this.mDateTitle.setValue(str);
    }

    @Override // com.oplus.aiunit.vision.tz9
    public void a(@NotNull BaseChart chart) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        chart.getXAxis().setLabelCount(12);
        chart.setExtraSpace(0.5f);
        CommonMarkerView commonMarkerView = new CommonMarkerView(chart.getContext(), new b());
        chart.setMarker(commonMarkerView);
        commonMarkerView.setChartView(chart);
        chart.setXAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.w7j
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return SunshineYearView.M(this.a, i, d);
            }
        });
        BaseFragment baseFragment = this.fragment;
        BaseChart baseChartM = m();
        ViewPortHandler viewPortHandler = m().getViewPortHandler();
        chart.setOnTouchListener(new HChartTouchListener(baseFragment, baseChartM, viewPortHandler != null ? viewPortHandler.getMatrixTouch() : null, 3.0f, 2, 0, 32, null));
        N();
    }

    @Override // com.oplus.aiunit.vision.tz9
    @NotNull
    public ChartType type() {
        return ChartType.YEAR;
    }
}