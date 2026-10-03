package com.heytap.health.hrv.ui.item;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCaller;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalAchievement;
import com.heytap.health.base.R$string;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.core.operation.space.SpaceView;
import com.heytap.health.hrv.viewmodel.StressDataAnalyzeVM;
import com.heytap.sporthealth.blib.compose.modifier.AutoClipContentModifierKt;
import com.heytap.sporthealth.blib.compose.modifier.OverScrollModifierKt;
import com.oplus.aiunit.vision.ir9;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/hrv/ui/item/StressDayDataView;", "", "Landroid/view/View;", "view", "c", "Lcom/heytap/health/base/base/BaseFragment;", "a", "Lcom/heytap/health/base/base/BaseFragment;", "fragment", "Lcom/heytap/health/hrv/viewmodel/StressDataAnalyzeVM;", "b", "Lcom/heytap/health/hrv/viewmodel/StressDataAnalyzeVM;", "mViewModel", "<init>", "(Lcom/heytap/health/base/base/BaseFragment;)V", "hrv_release"}, k = 1, mv = {1, 8, 0})
public final class StressDayDataView {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BaseFragment fragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final StressDataAnalyzeVM mViewModel;

    public StressDayDataView(@NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
        this.mViewModel = (StressDataAnalyzeVM) new ViewModelProvider(fragment).get(StressDataAnalyzeVM.class);
    }

    @NotNull
    public final View c(@NotNull final View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        final LiveData<String> liveDataN = this.mViewModel.N();
        final LiveData<Integer> liveDataL = this.mViewModel.L();
        final LiveData<Integer> liveDataO = this.mViewModel.O();
        ActivityResultCaller activityResultCaller = this.fragment;
        final boolean zU5 = activityResultCaller instanceof ir9 ? ((ir9) activityResultCaller).u5() : false;
        final LiveData<List<Integer>> liveDataM = this.mViewModel.M();
        final LiveData<List<Integer>> liveDataK = this.mViewModel.K();
        final LiveData<PhysicalMentalAchievement> liveDataP = this.mViewModel.P();
        final SpaceView spaceView = new SpaceView(this.fragment.requireActivity());
        spaceView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        spaceView.setCardCode("01");
        spaceView.setPageCode(this.fragment.requireContext().getString(R$string.lib_base_code_hrv));
        spaceView.b();
        Context contextRequireContext = this.fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "fragment.requireContext()");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1961190867, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataView$create$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    ComposerKt.traceEventStart(-1961190867, i, -1, "com.heytap.health.hrv.ui.item.StressDayDataView.create.<anonymous>.<anonymous> (StressDayDataView.kt:135)");
                }
                View view2 = view;
                composer.startReplaceableGroup(-492369756);
                if (composer.rememberedValue() == Composer.Companion.getEmpty()) {
                    composer.updateRememberedValue(view2);
                }
                composer.endReplaceableGroup();
                Modifier modifierB = OverScrollModifierKt.b(PaddingKt.m430paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dp.m4104constructorimpl(20), 7, null), false, null, 0.0f, 0.75f, null, null, 55, null);
                LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer, 0, 3);
                final boolean z = zU5;
                final View view3 = view;
                final LiveData<PhysicalMentalAchievement> liveData = liveDataP;
                final LiveData<List<Integer>> liveData2 = liveDataM;
                final LiveData<List<Integer>> liveData3 = liveDataK;
                final LiveData<String> liveData4 = liveDataN;
                final LiveData<Integer> liveData5 = liveDataO;
                final LiveData<Integer> liveData6 = liveDataL;
                final StressDayDataView stressDayDataView = this;
                final SpaceView spaceView2 = spaceView;
                LazyDslKt.LazyColumn(modifierB, lazyListStateRememberLazyListState, null, false, null, null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataView$create$1$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        final View view4 = view3;
                        LazyListScope.item$default(LazyColumn, "AndroidView", null, ComposableLambdaKt.composableLambdaInstance(-1590321215, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataView.create.1.1.2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    ComposerKt.traceEventStart(-1590321215, i2, -1, "com.heytap.health.hrv.ui.item.StressDayDataView.create.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StressDayDataView.kt:144)");
                                }
                                final View view5 = view4;
                                AndroidView_androidKt.AndroidView(new Function1<Context, View>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataView.create.1.1.2.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // p010kotlin.jvm.functions.Function1
                                    @NotNull
                                    public final View invoke(@NotNull Context it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        View view6 = view5;
                                        view6.setSaveEnabled(false);
                                        return view6;
                                    }
                                }, SizeKt.m455height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m4104constructorimpl((float) 248.5d)), null, composer2, 48, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 2, null);
                        ComposableSingletons$StressDayDataViewKt composableSingletons$StressDayDataViewKt = ComposableSingletons$StressDayDataViewKt.INSTANCE;
                        LazyListScope.item$default(LazyColumn, "StatusLevel", null, composableSingletons$StressDayDataViewKt.a(), 2, null);
                        LazyListScope.item$default(LazyColumn, "Tips", null, composableSingletons$StressDayDataViewKt.b(), 2, null);
                        if (!z) {
                            final LiveData<PhysicalMentalAchievement> liveData7 = liveData;
                            LazyListScope.item$default(LazyColumn, "AchievementCard", null, ComposableLambdaKt.composableLambdaInstance(-2102781348, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataView.create.1.1.2.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                        ComposerKt.traceEventStart(-2102781348, i2, -1, "com.heytap.health.hrv.ui.item.StressDayDataView.create.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StressDayDataView.kt:172)");
                                    }
                                    Modifier modifierB2 = AutoClipContentModifierKt.b(Modifier.Companion);
                                    LiveData<PhysicalMentalAchievement> liveData8 = liveData7;
                                    composer2.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
                                    composer2.startReplaceableGroup(-1323940314);
                                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierB2);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    Composer composerM1259constructorimpl = Updater.m1259constructorimpl(composer2);
                                    Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m1266setimpl(composerM1259constructorimpl, density, companion.getSetDensity());
                                    Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                    Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                    composer2.enableReusing();
                                    function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    StressDayDataViewKt.a(liveData8, composer2, 8);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), 2, null);
                        }
                        final LiveData<List<Integer>> liveData8 = liveData2;
                        final LiveData<List<Integer>> liveData9 = liveData3;
                        LazyListScope.item$default(LazyColumn, "StatusPercent", null, ComposableLambdaKt.composableLambdaInstance(613101754, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataView.create.1.1.2.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    ComposerKt.traceEventStart(613101754, i2, -1, "com.heytap.health.hrv.ui.item.StressDayDataView.create.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StressDayDataView.kt:179)");
                                }
                                Modifier modifierB2 = AutoClipContentModifierKt.b(Modifier.Companion);
                                LiveData<List<Integer>> liveData10 = liveData8;
                                LiveData<List<Integer>> liveData11 = liveData9;
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierB2);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM1259constructorimpl = Updater.m1259constructorimpl(composer2);
                                Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m1266setimpl(composerM1259constructorimpl, density, companion.getSetDensity());
                                Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                StressDayDataViewKt.n(liveData10, liveData11, composer2, 72, 0);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 2, null);
                        final LiveData<String> liveData10 = liveData4;
                        final LiveData<Integer> liveData11 = liveData5;
                        final LiveData<Integer> liveData12 = liveData6;
                        final boolean z2 = z;
                        LazyListScope.item$default(LazyColumn, "StatusAnalyze", null, ComposableLambdaKt.composableLambdaInstance(-451865477, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataView.create.1.1.2.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    ComposerKt.traceEventStart(-451865477, i2, -1, "com.heytap.health.hrv.ui.item.StressDayDataView.create.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StressDayDataView.kt:185)");
                                }
                                Modifier modifierB2 = AutoClipContentModifierKt.b(Modifier.Companion);
                                LiveData<String> liveData13 = liveData10;
                                LiveData<Integer> liveData14 = liveData11;
                                LiveData<Integer> liveData15 = liveData12;
                                boolean z3 = z2;
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierB2);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM1259constructorimpl = Updater.m1259constructorimpl(composer2);
                                Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m1266setimpl(composerM1259constructorimpl, density, companion.getSetDensity());
                                Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                StressDayDataViewKt.m(liveData13, liveData14, liveData15, z3, composer2, 584, 0);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 2, null);
                        final StressDayDataView stressDayDataView2 = stressDayDataView;
                        final boolean z3 = z;
                        LazyListScope.item$default(LazyColumn, "DataDetail", null, ComposableLambdaKt.composableLambdaInstance(-1516832708, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataView.create.1.1.2.5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    ComposerKt.traceEventStart(-1516832708, i2, -1, "com.heytap.health.hrv.ui.item.StressDayDataView.create.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StressDayDataView.kt:191)");
                                }
                                Modifier modifierB2 = AutoClipContentModifierKt.b(Modifier.Companion);
                                StressDayDataView stressDayDataView3 = stressDayDataView2;
                                boolean z4 = z3;
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierB2);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM1259constructorimpl = Updater.m1259constructorimpl(composer2);
                                Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m1266setimpl(composerM1259constructorimpl, density, companion.getSetDensity());
                                Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                Context contextRequireContext2 = stressDayDataView3.fragment.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "fragment.requireContext()");
                                StressDayDataViewKt.f(contextRequireContext2, stressDayDataView3.mViewModel.Q(), z4, composer2, 72, 0);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 2, null);
                        final SpaceView spaceView3 = spaceView2;
                        LazyListScope.item$default(LazyColumn, "KnowledgeCard", null, ComposableLambdaKt.composableLambdaInstance(1713167357, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataView.create.1.1.2.6
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
                                    ComposerKt.traceEventStart(1713167357, i2, -1, "com.heytap.health.hrv.ui.item.StressDayDataView.create.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StressDayDataView.kt:197)");
                                }
                                Modifier modifierB2 = AutoClipContentModifierKt.b(Modifier.Companion);
                                SpaceView spaceView4 = spaceView3;
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierB2);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer composerM1259constructorimpl = Updater.m1259constructorimpl(composer2);
                                Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m1266setimpl(composerM1259constructorimpl, density, companion.getSetDensity());
                                Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                composer2.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                StressDayDataViewKt.j(spaceView4, composer2, 8);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 2, null);
                    }
                }, composer, 0, 252);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return composeView;
    }
}