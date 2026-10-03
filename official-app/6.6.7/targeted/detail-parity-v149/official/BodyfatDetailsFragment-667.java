package com.heytap.health.bodyfat.ui.frg;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.profileinstaller.ProfileVerifier;
import com.coui.appcompat.panel.COUIBottomSheetDialogFragment;
import com.heytap.databaseengine.model.weight.WeightBodyFat;
import com.heytap.databaseengine.model.weight.WeightLabel;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.bodyfat.R$color;
import com.heytap.health.bodyfat.R$drawable;
import com.heytap.health.bodyfat.R$layout;
import com.heytap.health.bodyfat.R$plurals;
import com.heytap.health.bodyfat.R$string;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.jt3;
import com.oplus.aiunit.vision.q12;
import com.oplus.aiunit.vision.s04;
import com.oplus.backup.sdk.common.utils.ModuleType;
import com.oplus.drs.core.net.entity.UploadStateAware;
import com.xiaomi.mipush.sdk.Constants;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Triple;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0017\u0018\u0000 F2\u00020\u0001:\u0001GB\u0007¢\u0006\u0004\bD\u0010EJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\f\u0010\n\u001a\u00020\u0006*\u00020\tH\u0014JW\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0006*\u00020\u0016H\u0005¢\u0006\u0004\b\u0017\u0010\u0018JC\u0010\"\u001a\u00020\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u00022\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0005¢\u0006\u0004\b\"\u0010#JA\u0010+\u001a\u00020\u0006*\u00020$2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u0010H\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,JG\u00105\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\b\u00101\u001a\u0004\u0018\u00010\u000b2\b\u00102\u001a\u0004\u0018\u00010\u001a2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000603H\u0004¢\u0006\u0004\b5\u00106JA\u0010:\u001a\u00020\u00062\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u00108\u001a\u00020/2\u0006\u00109\u001a\u00020/2\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u0002H\u0007¢\u0006\u0004\b:\u0010;J#\u0010=\u001a\u00020\u00062\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000603H\u0003¢\u0006\u0004\b=\u0010>R \u0010C\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0004X\u0084\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006H"}, d2 = {"Lcom/heytap/health/bodyfat/ui/frg/BodyfatDetailsFragment;", "Lcom/heytap/health/base/base/BaseFragment;", "", "getLayoutId", "Landroid/view/View;", "view", "", "initView", "initData", "Landroidx/compose/ui/platform/ComposeView;", "n0", "", "title", "Lkotlin/Function0;", "onPrev", "onNext", "", "showPrev", "showNext", "onTitleClick", "f0", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/BoxScope;", "e0", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/MutableState;", "", "startStat", "visibleDays", "", "Lcom/heytap/databaseengine/model/weight/WeightBodyFat;", "list", "unit", "precision", "d0", "(Landroidx/compose/runtime/MutableState;ILjava/util/List;IILandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/ui/graphics/Color;", "weightCurveColor", "fatCurveColor", "hasWeight", "hasFatRate", "hasDevice", "g0", "(Landroidx/compose/foundation/layout/ColumnScope;JJZZZLandroidx/compose/runtime/Composer;I)V", "Landroid/content/Context;", "context", "Ljava/time/LocalDate;", "selectDate", "userTagId", "earliestTime", "Lkotlin/Function1;", "onDateSelected", "p0", "(Landroid/content/Context;Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", "allData", s04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "h0", "(Ljava/util/List;Ljava/time/LocalDate;Ljava/time/LocalDate;IILandroidx/compose/runtime/Composer;II)V", "callback", "c0", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "o", "Landroidx/compose/runtime/MutableState;", "k0", "()Landroidx/compose/runtime/MutableState;", "dataTopInDay", "<init>", "()V", "Companion", "a", "bodyfat_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBodyfatDetailsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BodyfatDetailsFragment.kt\ncom/heytap/health/bodyfat/ui/frg/BodyfatDetailsFragment\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 11 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,487:1\n154#2:488\n154#2:522\n154#2:523\n154#2:538\n154#2:539\n154#2:592\n154#2:593\n154#2:608\n154#2:609\n154#2:627\n154#2:668\n154#2:674\n154#2:675\n154#2:696\n154#2:764\n154#2:775\n154#2:809\n154#2:810\n154#2:811\n154#2:812\n154#2:813\n154#2:837\n154#2:838\n154#2:839\n154#2:926\n154#2:927\n75#3,6:489\n81#3:521\n75#3,6:554\n81#3:586\n85#3:591\n85#3:614\n75#3,6:635\n81#3:667\n85#3:673\n74#3,7:730\n81#3:763\n85#3:769\n75#3,6:776\n81#3:808\n85#3:818\n75#3,6:840\n81#3:872\n85#3:933\n75#4:495\n76#4,11:497\n75#4:560\n76#4,11:562\n89#4:590\n89#4:613\n75#4:641\n76#4,11:643\n89#4:672\n75#4:703\n76#4,11:705\n75#4:737\n76#4,11:739\n89#4:768\n89#4:773\n75#4:782\n76#4,11:784\n89#4:817\n75#4:846\n76#4,11:848\n75#4:881\n76#4,11:883\n89#4:924\n89#4:932\n76#5:496\n76#5:561\n76#5:626\n76#5:642\n76#5:693\n76#5:695\n76#5:704\n76#5:738\n76#5:783\n76#5:821\n76#5:847\n76#5:882\n460#6,13:508\n25#6:524\n36#6:531\n25#6:540\n36#6:547\n460#6,13:573\n473#6,3:587\n25#6:594\n36#6:601\n473#6,3:610\n25#6:615\n25#6:628\n460#6,13:654\n473#6,3:669\n36#6:676\n25#6:683\n460#6,13:716\n460#6,13:750\n473#6,3:765\n473#6,3:770\n460#6,13:795\n473#6,3:814\n460#6,13:859\n460#6,13:894\n473#6,3:921\n473#6,3:929\n1114#7,6:525\n1114#7,6:532\n1114#7,6:541\n1114#7,6:548\n1114#7,6:595\n1114#7,6:602\n1114#7,6:616\n1114#7,6:629\n1114#7,6:677\n1114#7,6:684\n1549#8:622\n1620#8,3:623\n766#8:690\n857#8,2:691\n1855#8,2:819\n1603#8,9:822\n1855#8:831\n288#8,2:832\n1856#8:835\n1612#8:836\n1864#8,2:873\n1866#8:928\n1#9:694\n1#9:834\n74#10,6:697\n80#10:729\n84#10:774\n74#10,6:875\n80#10:907\n84#10:925\n1098#11:908\n927#11,6:909\n927#11,6:915\n*S KotlinDebug\n*F\n+ 1 BodyfatDetailsFragment.kt\ncom/heytap/health/bodyfat/ui/frg/BodyfatDetailsFragment\n*L\n95#1:488\n101#1:522\n102#1:523\n115#1:538\n116#1:539\n144#1:592\n145#1:593\n158#1:608\n159#1:609\n182#1:627\n211#1:668\n223#1:674\n224#1:675\n251#1:696\n271#1:764\n291#1:775\n297#1:809\n307#1:810\n310#1:811\n314#1:812\n325#1:813\n436#1:837\n439#1:838\n441#1:839\n471#1:926\n472#1:927\n91#1:489,6\n91#1:521\n120#1:554,6\n120#1:586\n120#1:591\n91#1:614\n179#1:635,6\n179#1:667\n179#1:673\n258#1:730,7\n258#1:763\n258#1:769\n288#1:776,6\n288#1:808\n288#1:818\n433#1:840,6\n433#1:872\n433#1:933\n91#1:495\n91#1:497,11\n120#1:560\n120#1:562,11\n120#1:590\n91#1:613\n179#1:641\n179#1:643,11\n179#1:672\n251#1:703\n251#1:705,11\n258#1:737\n258#1:739,11\n258#1:768\n251#1:773\n288#1:782\n288#1:784,11\n288#1:817\n433#1:846\n433#1:848,11\n444#1:881\n444#1:883,11\n444#1:924\n433#1:932\n91#1:496\n120#1:561\n177#1:626\n179#1:642\n235#1:693\n244#1:695\n251#1:704\n258#1:738\n288#1:783\n393#1:821\n433#1:847\n444#1:882\n91#1:508,13\n104#1:524\n106#1:531\n122#1:540\n124#1:547\n120#1:573,13\n120#1:587,3\n147#1:594\n149#1:601\n91#1:610,3\n168#1:615\n186#1:628\n179#1:654,13\n179#1:669,3\n225#1:676\n231#1:683\n251#1:716,13\n258#1:750,13\n258#1:765,3\n251#1:770,3\n288#1:795,13\n288#1:814,3\n433#1:859,13\n444#1:894,13\n444#1:921,3\n433#1:929,3\n104#1:525,6\n106#1:532,6\n122#1:541,6\n124#1:548,6\n147#1:595,6\n149#1:602,6\n168#1:616,6\n186#1:629,6\n225#1:677,6\n231#1:684,6\n173#1:622\n173#1:623,3\n232#1:690\n232#1:691,2\n376#1:819,2\n401#1:822,9\n401#1:831\n403#1:832,2\n401#1:835\n401#1:836\n443#1:873,2\n443#1:928\n401#1:834\n251#1:697,6\n251#1:729\n251#1:774\n444#1:875,6\n444#1:907\n444#1:925\n454#1:908\n455#1:909,6\n458#1:915,6\n*E\n"})
public class BodyfatDetailsFragment extends BaseFragment {
    public static final int $stable = 0;
    public static final long DAY_MS = 86400000;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final MutableState<Integer> dataTopInDay = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void c0(final Function1<? super View, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1606375259);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1606375259, i2, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment.AnchorView (BodyfatDetailsFragment.kt:218)");
            }
            BodyfatDetailsFragment$AnchorView$1 bodyfatDetailsFragment$AnchorView$1 = new Function1<Context, View>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$AnchorView$1
                @Override // p010kotlin.jvm.functions.Function1
                @NotNull
                public final View invoke(@NotNull Context c2) {
                    Intrinsics.checkNotNullParameter(c2, "c");
                    return new View(c2);
                }
            };
            Modifier modifierM455height3ABfNKs = SizeKt.m455height3ABfNKs(SizeKt.m474width3ABfNKs(Modifier.INSTANCE, Dp.m4104constructorimpl(0)), Dp.m4104constructorimpl(3));
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(function1);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<View, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$AnchorView$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // p010kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(View view) {
                        invoke2(view);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull View it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        function1.invoke(it);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView(bodyfatDetailsFragment$AnchorView$1, modifierM455height3ABfNKs, (Function1) objRememberedValue, composerStartRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$AnchorView$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i3) {
                this.$tmp0_rcvr.c0(function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void d0(@NotNull final MutableState<Long> startStat, final int i, @NotNull final List<? extends WeightBodyFat> list, final int i2, final int i3, @Nullable Composer composer, final int i4) {
        Object objM6005constructorimpl;
        Object objM6005constructorimpl2;
        String str;
        String strStringResource;
        Object objM6005constructorimpl3;
        Object objM6005constructorimpl4;
        Intrinsics.checkNotNullParameter(startStat, "startStat");
        Intrinsics.checkNotNullParameter(list, "list");
        Composer composerStartRestartGroup = composer.startRestartGroup(213700935);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(213700935, i4, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment.ChartDesc (BodyfatDetailsFragment.kt:229)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        if (composerStartRestartGroup.rememberedValue() == Composer.INSTANCE.getEmpty()) {
            composerStartRestartGroup.updateRememberedValue(startStat);
        }
        composerStartRestartGroup.endReplaceableGroup();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            long jLongValue = startStat.getValue().longValue();
            LocalDate localDateV = h15.v(startStat.getValue().longValue(), i);
            Intrinsics.checkNotNullExpressionValue(localDateV, "startStat.value.plusDays(visibleDays)");
            long jH = h15.H(localDateV);
            long measurementTime = ((WeightBodyFat) obj).getMeasurementTime();
            if (jLongValue <= measurementTime && measurementTime < jH) {
                arrayList.add(obj);
            }
        }
        boolean z = ((LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection())) == LayoutDirection.Ltr;
        if (arrayList.isEmpty()) {
            composerStartRestartGroup.startReplaceableGroup(-364172808);
            strStringResource = StringResources_androidKt.stringResource(R$string.health_body_fat_no_data, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            str = "";
        } else {
            composerStartRestartGroup.startReplaceableGroup(-364172705);
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            WeightBodyFat weightBodyFat = (WeightBodyFat) it.next();
            try {
                Result.Companion companion = Result.INSTANCE;
                String weight = weightBodyFat.getWeight();
                Intrinsics.checkNotNullExpressionValue(weight, "it.weight");
                objM6005constructorimpl = Result.m6005constructorimpl(Float.valueOf(Float.parseFloat(weight) / 1000.0f));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM6005constructorimpl = Result.m6005constructorimpl(ResultKt.createFailure(th));
            }
            Float fValueOf = Float.valueOf(0.0f);
            if (Result.m6011isFailureimpl(objM6005constructorimpl)) {
                objM6005constructorimpl = fValueOf;
            }
            float fFloatValue = ((Number) objM6005constructorimpl).floatValue();
            while (it.hasNext()) {
                WeightBodyFat weightBodyFat2 = (WeightBodyFat) it.next();
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    String weight2 = weightBodyFat2.getWeight();
                    Intrinsics.checkNotNullExpressionValue(weight2, "it.weight");
                    objM6005constructorimpl4 = Result.m6005constructorimpl(Float.valueOf(Float.parseFloat(weight2) / 1000.0f));
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    objM6005constructorimpl4 = Result.m6005constructorimpl(ResultKt.createFailure(th2));
                }
                Float fValueOf2 = Float.valueOf(0.0f);
                if (Result.m6011isFailureimpl(objM6005constructorimpl4)) {
                    objM6005constructorimpl4 = fValueOf2;
                }
                fFloatValue = Math.min(fFloatValue, ((Number) objM6005constructorimpl4).floatValue());
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            WeightBodyFat weightBodyFat3 = (WeightBodyFat) it2.next();
            try {
                Result.Companion companion5 = Result.INSTANCE;
                String weight3 = weightBodyFat3.getWeight();
                Intrinsics.checkNotNullExpressionValue(weight3, "it.weight");
                objM6005constructorimpl2 = Result.m6005constructorimpl(Float.valueOf(Float.parseFloat(weight3) / 1000.0f));
            } catch (Throwable th3) {
                Result.Companion companion6 = Result.INSTANCE;
                objM6005constructorimpl2 = Result.m6005constructorimpl(ResultKt.createFailure(th3));
            }
            Float fValueOf3 = Float.valueOf(0.0f);
            if (Result.m6011isFailureimpl(objM6005constructorimpl2)) {
                objM6005constructorimpl2 = fValueOf3;
            }
            float fFloatValue2 = ((Number) objM6005constructorimpl2).floatValue();
            while (it2.hasNext()) {
                WeightBodyFat weightBodyFat4 = (WeightBodyFat) it2.next();
                try {
                    Result.Companion companion7 = Result.INSTANCE;
                    String weight4 = weightBodyFat4.getWeight();
                    Intrinsics.checkNotNullExpressionValue(weight4, "it.weight");
                    objM6005constructorimpl3 = Result.m6005constructorimpl(Float.valueOf(Float.parseFloat(weight4) / 1000.0f));
                } catch (Throwable th4) {
                    Result.Companion companion8 = Result.INSTANCE;
                    objM6005constructorimpl3 = Result.m6005constructorimpl(ResultKt.createFailure(th4));
                }
                Float fValueOf4 = Float.valueOf(0.0f);
                if (Result.m6011isFailureimpl(objM6005constructorimpl3)) {
                    objM6005constructorimpl3 = fValueOf4;
                }
                fFloatValue2 = Math.max(fFloatValue2, ((Number) objM6005constructorimpl3).floatValue());
            }
            String strG = q12.g((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), (int) fFloatValue2, i2, "");
            Intrinsics.checkNotNullExpressionValue(strG, "getWeightUnitStr( LocalC… maxKg.toInt(), unit, \"\")");
            float fH = q12.h(fFloatValue, i2);
            float fH2 = q12.h(fFloatValue2, i2);
            String strE = q12.e(z ? fH : fH2, i3);
            if (z) {
                fH = fH2;
            }
            String str2 = strE + Constants.ACCEPT_TIME_SEPARATOR_SERVER + q12.e(fH, i3);
            composerStartRestartGroup.endReplaceableGroup();
            str = strG;
            strStringResource = str2;
        }
        Modifier.Companion companion9 = Modifier.INSTANCE;
        Modifier modifierM430paddingqDBjuR0$default = PaddingKt.m430paddingqDBjuR0$default(companion9, Dp.m4104constructorimpl(16), Dp.m4104constructorimpl(18), 0.0f, 0.0f, 12, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion10 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion10.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion11.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM1259constructorimpl = Updater.m1259constructorimpl(composerStartRestartGroup);
        Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyColumnMeasurePolicy, companion11.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl, density, companion11.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion11.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion11.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        String strStringResource2 = StringResources_androidKt.stringResource(R$string.health_body_fat_chart_desc_title, composerStartRestartGroup, 0);
        FontWeight.Companion companion12 = FontWeight.INSTANCE;
        TextKt.m1201Text4IGK_g(strStringResource2, (Modifier) null, ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha55, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, companion12.getW400(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131026);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion10.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor2 = companion11.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion9);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM1259constructorimpl2 = Updater.m1259constructorimpl(composerStartRestartGroup);
        Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyRowMeasurePolicy, companion11.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion11.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion11.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion11.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        FontWeight w500 = companion12.getW500();
        long sp = TextUnitKt.getSp(34);
        int i5 = R$color.health_body_fat_black_alpha85;
        TextKt.m1201Text4IGK_g(strStringResource, (Modifier) null, ColorResources_androidKt.colorResource(i5, composerStartRestartGroup, 0), sp, (FontStyle) null, w500, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131026);
        FontWeight w501 = companion12.getW500();
        TextKt.m1201Text4IGK_g(str, rowScopeInstance.align(PaddingKt.m430paddingqDBjuR0$default(companion9, Dp.m4104constructorimpl(2), 0.0f, 0.0f, Dp.m4104constructorimpl(6), 6, null), companion10.getBottom()), ColorResources_androidKt.colorResource(i5, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, w501, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131024);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$ChartDesc$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i6) {
                this.$tmp2_rcvr.d0(startStat, i, list, i2, i3, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void e0(@NotNull final BoxScope boxScope, @Nullable Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2121916527);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2121916527, i3, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment.DataTopInDay (BodyfatDetailsFragment.kt:166)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            if (composerStartRestartGroup.rememberedValue() == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(k0());
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1720410564);
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R$string.health_body_fat_weight_daily_latest), Integer.valueOf(R$string.health_body_fat_weight_daily_lightest), Integer.valueOf(R$string.health_body_fat_weight_daily_heaviest)});
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOf, 10));
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                arrayList.add(StringResources_androidKt.stringResource(((Number) it.next()).intValue(), composerStartRestartGroup, 0));
            }
            composerStartRestartGroup.endReplaceableGroup();
            int iIntValue = this.dataTopInDay.getValue().intValue();
            String str = (String) ((iIntValue < 0 || iIntValue > CollectionsKt__CollectionsKt.getLastIndex(arrayList)) ? (String) CollectionsKt___CollectionsKt.first((List) arrayList) : arrayList.get(iIntValue));
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierAlign = boxScope.align(PaddingKt.m430paddingqDBjuR0$default(companion2, 0.0f, Dp.m4104constructorimpl(18), Dp.m4104constructorimpl(16), 0.0f, 9, null), companion.getTopEnd());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM185clickableO2vRcR0$default = ClickableKt.m185clickableO2vRcR0$default(modifierAlign, (MutableInteractionSource) objRememberedValue, null, false, null, null, new BodyfatDetailsFragment$DataTopInDay$3(context, arrayList, objectRef, this), 28, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1259constructorimpl = Updater.m1259constructorimpl(composerStartRestartGroup);
            Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl, density, companion3.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m1201Text4IGK_g(str, (Modifier) null, ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha55, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getW400(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131026);
            composer2 = composerStartRestartGroup;
            ImageKt.Image(PainterResources_androidKt.painterResource(R$drawable.health_body_fat_arrow_down, composer2, 0), (String) null, PaddingKt.m430paddingqDBjuR0$default(companion2, Dp.m4104constructorimpl(2), 0.0f, 0.0f, 0.0f, 14, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, UploadStateAware.HTTP_DECRYPT_FAILED, 120);
            c0(new Function1<View, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DataTopInDay$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke2(view);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull View it2) {
                    Intrinsics.checkNotNullParameter(it2, "it");
                    objectRef.element = it2;
                }
            }, composer2, i3 & 112);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DataTopInDay$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i4) {
                this.$tmp1_rcvr.e0(boxScope, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:0x022e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0279  */
    /* JADX WARN: Code duplicated, block: B:106:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:109:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:111:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:114:0x0360  */
    /* JADX WARN: Code duplicated, block: B:117:0x036c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0370  */
    /* JADX WARN: Code duplicated, block: B:121:0x0431  */
    /* JADX WARN: Code duplicated, block: B:123:0x0467  */
    /* JADX WARN: Code duplicated, block: B:126:0x048a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0490  */
    /* JADX WARN: Code duplicated, block: B:130:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:133:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:138:0x050e  */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x0175  */
    /* JADX WARN: Code duplicated, block: B:90:0x0181  */
    /* JADX WARN: Code duplicated, block: B:91:0x0185  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:96:0x0205  */
    /* JADX WARN: Code duplicated, block: B:99:0x0228  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void f0(@NotNull final String title, @NotNull final Function0<Unit> onPrev, @NotNull final Function0<Unit> onNext, boolean z, boolean z2, @Nullable Function0<Unit> function0, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        final boolean z4;
        int i5;
        int i6;
        Function0<Unit> function1;
        int i7;
        int i8;
        boolean z5;
        boolean z6;
        Function0<Unit> function2;
        Modifier.Companion companion;
        Function0<ComposeUiNode> constructor;
        Object objRememberedValue;
        Composer.Companion companion2;
        final Function0<Unit> function3;
        boolean zChanged;
        Object objRememberedValue2;
        Function0<ComposeUiNode> constructor2;
        Composer composer2;
        final boolean z7;
        final Function0<Unit> function4;
        Object objRememberedValue3;
        boolean zChanged2;
        Object objRememberedValue4;
        Object objRememberedValue5;
        Composer.Companion companion3;
        boolean zChanged3;
        Object objRememberedValue6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onPrev, "onPrev");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Composer composerStartRestartGroup = composer.startRestartGroup(-562645762);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPrev) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= ModuleType.TYPE_SYSTEM_SETTING;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onNext) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 == 0) {
            if ((i & 7168) == 0) {
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((57344 & i) == 0) {
                    z4 = z2;
                    if (composerStartRestartGroup.changed(z4)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((458752 & i) == 0) {
                        function1 = function0;
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    i8 = i3;
                    if ((374491 & i8) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        if (i9 != 0) {
                            z5 = true;
                        } else {
                            z5 = z3;
                        }
                        if (i4 != 0) {
                            z6 = true;
                        } else {
                            z6 = z4;
                        }
                        if (i6 != 0) {
                            function2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$1
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                }

                                @Override // p010kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            function2 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-562645762, i8, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment.DateGroup (BodyfatDetailsFragment.kt:82)");
                        }
                        companion = Modifier.INSTANCE;
                        Modifier modifierM430paddingqDBjuR0$default = PaddingKt.m430paddingqDBjuR0$default(BackgroundKt.m163backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_card_white_bg, composerStartRestartGroup, 0), null, 2, null), 0.0f, Dp.m4104constructorimpl(18), 0.0f, 0.0f, 13, null);
                        Alignment.Companion companion4 = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically = companion4.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        constructor = companion5.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM1259constructorimpl = Updater.m1259constructorimpl(composerStartRestartGroup);
                        Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                        Updater.m1266setimpl(composerM1259constructorimpl, density, companion5.getSetDensity());
                        Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion5.getSetLayoutDirection());
                        Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion5.getSetViewConfiguration());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        if (z5) {
                            composerStartRestartGroup.startReplaceableGroup(238818622);
                            Modifier modifierM469size3ABfNKs = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24));
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            companion3 = Composer.INSTANCE;
                            if (objRememberedValue5 == companion3.getEmpty()) {
                                objRememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue5;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged3 = composerStartRestartGroup.changed(onPrev);
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (zChanged3 || objRememberedValue6 == companion3.getEmpty()) {
                                objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                        onPrev.invoke();
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_last, composerStartRestartGroup, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs, mutableInteractionSource, null, false, null, null, (Function0) objRememberedValue6, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(238819217);
                            BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24)), composerStartRestartGroup, 6);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        BoxKt.Box(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion2 = Composer.INSTANCE;
                        if (objRememberedValue == companion2.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        function3 = function2;
                        zChanged = composerStartRestartGroup.changed(function3);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                            objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    function3.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierM185clickableO2vRcR0$default = ClickableKt.m185clickableO2vRcR0$default(companion, mutableInteractionSource2, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                        Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        constructor2 = companion5.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM1259constructorimpl2 = Updater.m1259constructorimpl(composerStartRestartGroup);
                        Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyRowMeasurePolicy2, companion5.getSetMeasurePolicy());
                        Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion5.getSetDensity());
                        Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion5.getSetLayoutDirection());
                        Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion5.getSetViewConfiguration());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        TextKt.m1201Text4IGK_g(title, (Modifier) null, ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha90, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getW400(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i8 & 14) | 199680, 0, 131026);
                        composer2 = composerStartRestartGroup;
                        ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_arrow_down, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 124);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        BoxKt.Box(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composer2, 0);
                        if (z6) {
                            composer2.startReplaceableGroup(238820279);
                            Modifier modifierM469size3ABfNKs2 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24));
                            composer2.startReplaceableGroup(-492369756);
                            objRememberedValue3 = composer2.rememberedValue();
                            if (objRememberedValue3 == companion2.getEmpty()) {
                                objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceableGroup();
                            MutableInteractionSource mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue3;
                            composer2.startReplaceableGroup(1157296644);
                            zChanged2 = composer2.changed(onNext);
                            objRememberedValue4 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue4 == companion2.getEmpty()) {
                                objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                        onNext.invoke();
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue4);
                            }
                            composer2.endReplaceableGroup();
                            ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_next, composer2, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs2, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue4, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(238820872);
                            BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24)), composer2, 6);
                            composer2.endReplaceableGroup();
                        }
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z7 = z5;
                        z4 = z6;
                        function4 = function3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        z7 = z3;
                        function4 = function1;
                        composer2 = composerStartRestartGroup;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p010kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i10) {
                            this.$tmp0_rcvr.f0(title, onPrev, onNext, z7, z4, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function1 = function0;
                i8 = i3;
                if ((374491 & i8) == 74898) {
                    if (i9 != 0) {
                        z5 = true;
                    } else {
                        z5 = z3;
                    }
                    if (i4 != 0) {
                        z6 = true;
                    } else {
                        z6 = z4;
                    }
                    if (i6 != 0) {
                        function2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                            }

                            @Override // p010kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-562645762, i8, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment.DateGroup (BodyfatDetailsFragment.kt:82)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierM430paddingqDBjuR0$default2 = PaddingKt.m430paddingqDBjuR0$default(BackgroundKt.m163backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_card_white_bg, composerStartRestartGroup, 0), null, 2, null), 0.0f, Dp.m4104constructorimpl(18), 0.0f, 0.0f, 13, null);
                    Alignment.Companion companion6 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically3 = companion6.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement2.getStart(), centerVertically3, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    constructor = companion7.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1259constructorimpl3 = Updater.m1259constructorimpl(composerStartRestartGroup);
                    Updater.m1266setimpl(composerM1259constructorimpl3, measurePolicyRowMeasurePolicy3, companion7.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl3, density3, companion7.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl3, layoutDirection3, companion7.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl3, viewConfiguration3, companion7.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf3.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    if (z5) {
                        composerStartRestartGroup.startReplaceableGroup(238818622);
                        Modifier modifierM469size3ABfNKs3 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24));
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        companion3 = Composer.INSTANCE;
                        if (objRememberedValue5 == companion3.getEmpty()) {
                            objRememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MutableInteractionSource mutableInteractionSource4 = (MutableInteractionSource) objRememberedValue5;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged3 = composerStartRestartGroup.changed(onPrev);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    onPrev.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    onPrev.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_last, composerStartRestartGroup, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs3, mutableInteractionSource4, null, false, null, null, (Function0) objRememberedValue6, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(238819217);
                        BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24)), composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    BoxKt.Box(RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion2 = Composer.INSTANCE;
                    if (objRememberedValue == companion2.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableInteractionSource mutableInteractionSource5 = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    function3 = function2;
                    zChanged = composerStartRestartGroup.changed(function3);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                function3.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                function3.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierM185clickableO2vRcR0$default2 = ClickableKt.m185clickableO2vRcR0$default(companion, mutableInteractionSource5, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                    Alignment.Vertical centerVertically4 = companion6.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement2.getStart(), centerVertically4, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion7.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1259constructorimpl4 = Updater.m1259constructorimpl(composerStartRestartGroup);
                    Updater.m1266setimpl(composerM1259constructorimpl4, measurePolicyRowMeasurePolicy4, companion7.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl4, density4, companion7.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl4, layoutDirection4, companion7.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl4, viewConfiguration4, companion7.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf4.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    TextKt.m1201Text4IGK_g(title, (Modifier) null, ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha90, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getW400(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i8 & 14) | 199680, 0, 131026);
                    composer2 = composerStartRestartGroup;
                    ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_arrow_down, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 124);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    BoxKt.Box(RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null), composer2, 0);
                    if (z6) {
                        composer2.startReplaceableGroup(238820279);
                        Modifier modifierM469size3ABfNKs4 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24));
                        composer2.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composer2.rememberedValue();
                        if (objRememberedValue3 == companion2.getEmpty()) {
                            objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        MutableInteractionSource mutableInteractionSource6 = (MutableInteractionSource) objRememberedValue3;
                        composer2.startReplaceableGroup(1157296644);
                        zChanged2 = composer2.changed(onNext);
                        objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    onNext.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    onNext.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceableGroup();
                        ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_next, composer2, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs4, mutableInteractionSource6, null, false, null, null, (Function0) objRememberedValue4, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(238820872);
                        BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24)), composer2, 6);
                        composer2.endReplaceableGroup();
                    }
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z7 = z5;
                    z4 = z6;
                    function4 = function3;
                } else {
                    if (i9 != 0) {
                        z5 = true;
                    } else {
                        z5 = z3;
                    }
                    if (i4 != 0) {
                        z6 = true;
                    } else {
                        z6 = z4;
                    }
                    if (i6 != 0) {
                        function2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                            }

                            @Override // p010kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-562645762, i8, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment.DateGroup (BodyfatDetailsFragment.kt:82)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierM430paddingqDBjuR0$default3 = PaddingKt.m430paddingqDBjuR0$default(BackgroundKt.m163backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_card_white_bg, composerStartRestartGroup, 0), null, 2, null), 0.0f, Dp.m4104constructorimpl(18), 0.0f, 0.0f, 13, null);
                    Alignment.Companion companion8 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically5 = companion8.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Arrangement arrangement3 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement3.getStart(), centerVertically5, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    constructor = companion9.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default3);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1259constructorimpl5 = Updater.m1259constructorimpl(composerStartRestartGroup);
                    Updater.m1266setimpl(composerM1259constructorimpl5, measurePolicyRowMeasurePolicy5, companion9.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl5, density5, companion9.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl5, layoutDirection5, companion9.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl5, viewConfiguration5, companion9.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf5.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                    if (z5) {
                        composerStartRestartGroup.startReplaceableGroup(238818622);
                        Modifier modifierM469size3ABfNKs5 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24));
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        companion3 = Composer.INSTANCE;
                        if (objRememberedValue5 == companion3.getEmpty()) {
                            objRememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MutableInteractionSource mutableInteractionSource7 = (MutableInteractionSource) objRememberedValue5;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged3 = composerStartRestartGroup.changed(onPrev);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    onPrev.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    onPrev.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_last, composerStartRestartGroup, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs5, mutableInteractionSource7, null, false, null, null, (Function0) objRememberedValue6, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(238819217);
                        BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24)), composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    BoxKt.Box(RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion2 = Composer.INSTANCE;
                    if (objRememberedValue == companion2.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableInteractionSource mutableInteractionSource8 = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    function3 = function2;
                    zChanged = composerStartRestartGroup.changed(function3);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                function3.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                function3.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierM185clickableO2vRcR0$default3 = ClickableKt.m185clickableO2vRcR0$default(companion, mutableInteractionSource8, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                    Alignment.Vertical centerVertically6 = companion8.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement3.getStart(), centerVertically6, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration6 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion9.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default3);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1259constructorimpl6 = Updater.m1259constructorimpl(composerStartRestartGroup);
                    Updater.m1266setimpl(composerM1259constructorimpl6, measurePolicyRowMeasurePolicy6, companion9.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl6, density6, companion9.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl6, layoutDirection6, companion9.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl6, viewConfiguration6, companion9.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf6.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    TextKt.m1201Text4IGK_g(title, (Modifier) null, ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha90, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getW400(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i8 & 14) | 199680, 0, 131026);
                    composer2 = composerStartRestartGroup;
                    ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_arrow_down, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 124);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    BoxKt.Box(RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null), composer2, 0);
                    if (z6) {
                        composer2.startReplaceableGroup(238820279);
                        Modifier modifierM469size3ABfNKs6 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24));
                        composer2.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composer2.rememberedValue();
                        if (objRememberedValue3 == companion2.getEmpty()) {
                            objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        MutableInteractionSource mutableInteractionSource9 = (MutableInteractionSource) objRememberedValue3;
                        composer2.startReplaceableGroup(1157296644);
                        zChanged2 = composer2.changed(onNext);
                        objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    onNext.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    onNext.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceableGroup();
                        ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_next, composer2, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs6, mutableInteractionSource9, null, false, null, null, (Function0) objRememberedValue4, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(238820872);
                        BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24)), composer2, 6);
                        composer2.endReplaceableGroup();
                    }
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z7 = z5;
                    z4 = z6;
                    function4 = function3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p010kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i10) {
                        this.$tmp0_rcvr.f0(title, onPrev, onNext, z7, z4, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            z4 = z2;
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((458752 & i) == 0) {
                    function1 = function0;
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if ((374491 & i8) == 74898) {
                    if (i9 != 0) {
                        z5 = true;
                    } else {
                        z5 = z3;
                    }
                    if (i4 != 0) {
                        z6 = true;
                    } else {
                        z6 = z4;
                    }
                    if (i6 != 0) {
                        function2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                            }

                            @Override // p010kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-562645762, i8, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment.DateGroup (BodyfatDetailsFragment.kt:82)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierM430paddingqDBjuR0$default4 = PaddingKt.m430paddingqDBjuR0$default(BackgroundKt.m163backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_card_white_bg, composerStartRestartGroup, 0), null, 2, null), 0.0f, Dp.m4104constructorimpl(18), 0.0f, 0.0f, 13, null);
                    Alignment.Companion companion10 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically7 = companion10.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Arrangement arrangement4 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(arrangement4.getStart(), centerVertically7, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration7 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    constructor = companion11.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default4);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1259constructorimpl7 = Updater.m1259constructorimpl(composerStartRestartGroup);
                    Updater.m1266setimpl(composerM1259constructorimpl7, measurePolicyRowMeasurePolicy7, companion11.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl7, density7, companion11.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl7, layoutDirection7, companion11.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl7, viewConfiguration7, companion11.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf7.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                    if (z5) {
                        composerStartRestartGroup.startReplaceableGroup(238818622);
                        Modifier modifierM469size3ABfNKs7 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24));
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        companion3 = Composer.INSTANCE;
                        if (objRememberedValue5 == companion3.getEmpty()) {
                            objRememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MutableInteractionSource mutableInteractionSource10 = (MutableInteractionSource) objRememberedValue5;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged3 = composerStartRestartGroup.changed(onPrev);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    onPrev.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    onPrev.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_last, composerStartRestartGroup, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs7, mutableInteractionSource10, null, false, null, null, (Function0) objRememberedValue6, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(238819217);
                        BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24)), composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    BoxKt.Box(RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion2 = Composer.INSTANCE;
                    if (objRememberedValue == companion2.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableInteractionSource mutableInteractionSource11 = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    function3 = function2;
                    zChanged = composerStartRestartGroup.changed(function3);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                function3.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                function3.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierM185clickableO2vRcR0$default4 = ClickableKt.m185clickableO2vRcR0$default(companion, mutableInteractionSource11, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                    Alignment.Vertical centerVertically8 = companion10.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy8 = RowKt.rowMeasurePolicy(arrangement4.getStart(), centerVertically8, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density8 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection8 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration8 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion11.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf8 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default4);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1259constructorimpl8 = Updater.m1259constructorimpl(composerStartRestartGroup);
                    Updater.m1266setimpl(composerM1259constructorimpl8, measurePolicyRowMeasurePolicy8, companion11.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl8, density8, companion11.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl8, layoutDirection8, companion11.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl8, viewConfiguration8, companion11.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf8.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    TextKt.m1201Text4IGK_g(title, (Modifier) null, ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha90, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getW400(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i8 & 14) | 199680, 0, 131026);
                    composer2 = composerStartRestartGroup;
                    ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_arrow_down, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 124);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    BoxKt.Box(RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null), composer2, 0);
                    if (z6) {
                        composer2.startReplaceableGroup(238820279);
                        Modifier modifierM469size3ABfNKs8 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24));
                        composer2.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composer2.rememberedValue();
                        if (objRememberedValue3 == companion2.getEmpty()) {
                            objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        MutableInteractionSource mutableInteractionSource12 = (MutableInteractionSource) objRememberedValue3;
                        composer2.startReplaceableGroup(1157296644);
                        zChanged2 = composer2.changed(onNext);
                        objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    onNext.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    onNext.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceableGroup();
                        ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_next, composer2, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs8, mutableInteractionSource12, null, false, null, null, (Function0) objRememberedValue4, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(238820872);
                        BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24)), composer2, 6);
                        composer2.endReplaceableGroup();
                    }
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z7 = z5;
                    z4 = z6;
                    function4 = function3;
                } else {
                    if (i9 != 0) {
                        z5 = true;
                    } else {
                        z5 = z3;
                    }
                    if (i4 != 0) {
                        z6 = true;
                    } else {
                        z6 = z4;
                    }
                    if (i6 != 0) {
                        function2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                            }

                            @Override // p010kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-562645762, i8, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment.DateGroup (BodyfatDetailsFragment.kt:82)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierM430paddingqDBjuR0$default5 = PaddingKt.m430paddingqDBjuR0$default(BackgroundKt.m163backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_card_white_bg, composerStartRestartGroup, 0), null, 2, null), 0.0f, Dp.m4104constructorimpl(18), 0.0f, 0.0f, 13, null);
                    Alignment.Companion companion12 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically9 = companion12.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Arrangement arrangement5 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy9 = RowKt.rowMeasurePolicy(arrangement5.getStart(), centerVertically9, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density9 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection9 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration9 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                    constructor = companion13.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf9 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default5);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1259constructorimpl9 = Updater.m1259constructorimpl(composerStartRestartGroup);
                    Updater.m1266setimpl(composerM1259constructorimpl9, measurePolicyRowMeasurePolicy9, companion13.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl9, density9, companion13.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl9, layoutDirection9, companion13.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl9, viewConfiguration9, companion13.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf9.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                    if (z5) {
                        composerStartRestartGroup.startReplaceableGroup(238818622);
                        Modifier modifierM469size3ABfNKs9 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24));
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        companion3 = Composer.INSTANCE;
                        if (objRememberedValue5 == companion3.getEmpty()) {
                            objRememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MutableInteractionSource mutableInteractionSource13 = (MutableInteractionSource) objRememberedValue5;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged3 = composerStartRestartGroup.changed(onPrev);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    onPrev.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    onPrev.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_last, composerStartRestartGroup, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs9, mutableInteractionSource13, null, false, null, null, (Function0) objRememberedValue6, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(238819217);
                        BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24)), composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    BoxKt.Box(RowScope.weight$default(rowScopeInstance5, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion2 = Composer.INSTANCE;
                    if (objRememberedValue == companion2.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableInteractionSource mutableInteractionSource14 = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    function3 = function2;
                    zChanged = composerStartRestartGroup.changed(function3);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                function3.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                function3.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierM185clickableO2vRcR0$default5 = ClickableKt.m185clickableO2vRcR0$default(companion, mutableInteractionSource14, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                    Alignment.Vertical centerVertically10 = companion12.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy10 = RowKt.rowMeasurePolicy(arrangement5.getStart(), centerVertically10, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density10 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection10 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration10 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion13.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf10 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default5);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1259constructorimpl10 = Updater.m1259constructorimpl(composerStartRestartGroup);
                    Updater.m1266setimpl(composerM1259constructorimpl10, measurePolicyRowMeasurePolicy10, companion13.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl10, density10, companion13.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl10, layoutDirection10, companion13.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl10, viewConfiguration10, companion13.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf10.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    TextKt.m1201Text4IGK_g(title, (Modifier) null, ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha90, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getW400(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i8 & 14) | 199680, 0, 131026);
                    composer2 = composerStartRestartGroup;
                    ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_arrow_down, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 124);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    BoxKt.Box(RowScope.weight$default(rowScopeInstance5, companion, 1.0f, false, 2, null), composer2, 0);
                    if (z6) {
                        composer2.startReplaceableGroup(238820279);
                        Modifier modifierM469size3ABfNKs10 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24));
                        composer2.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composer2.rememberedValue();
                        if (objRememberedValue3 == companion2.getEmpty()) {
                            objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        MutableInteractionSource mutableInteractionSource15 = (MutableInteractionSource) objRememberedValue3;
                        composer2.startReplaceableGroup(1157296644);
                        zChanged2 = composer2.changed(onNext);
                        objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    onNext.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    onNext.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceableGroup();
                        ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_next, composer2, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs10, mutableInteractionSource15, null, false, null, null, (Function0) objRememberedValue4, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(238820872);
                        BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24)), composer2, 6);
                        composer2.endReplaceableGroup();
                    }
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z7 = z5;
                    z4 = z6;
                    function4 = function3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p010kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i10) {
                        this.$tmp0_rcvr.f0(title, onPrev, onNext, z7, z4, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function1 = function0;
            i8 = i3;
            if ((374491 & i8) == 74898) {
                if (i9 != 0) {
                    z5 = true;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    z6 = true;
                } else {
                    z6 = z4;
                }
                if (i6 != 0) {
                    function2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-562645762, i8, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment.DateGroup (BodyfatDetailsFragment.kt:82)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM430paddingqDBjuR0$default6 = PaddingKt.m430paddingqDBjuR0$default(BackgroundKt.m163backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_card_white_bg, composerStartRestartGroup, 0), null, 2, null), 0.0f, Dp.m4104constructorimpl(18), 0.0f, 0.0f, 13, null);
                Alignment.Companion companion14 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically11 = companion14.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement arrangement6 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy11 = RowKt.rowMeasurePolicy(arrangement6.getStart(), centerVertically11, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density11 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection11 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration11 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                constructor = companion15.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default6);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1259constructorimpl11 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl11, measurePolicyRowMeasurePolicy11, companion15.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl11, density11, companion15.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl11, layoutDirection11, companion15.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl11, viewConfiguration11, companion15.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf11.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
                if (z5) {
                    composerStartRestartGroup.startReplaceableGroup(238818622);
                    Modifier modifierM469size3ABfNKs11 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24));
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    companion3 = Composer.INSTANCE;
                    if (objRememberedValue5 == companion3.getEmpty()) {
                        objRememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableInteractionSource mutableInteractionSource16 = (MutableInteractionSource) objRememberedValue5;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged3 = composerStartRestartGroup.changed(onPrev);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                onPrev.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                onPrev.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_last, composerStartRestartGroup, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs11, mutableInteractionSource16, null, false, null, null, (Function0) objRememberedValue6, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(238819217);
                    BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24)), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                BoxKt.Box(RowScope.weight$default(rowScopeInstance6, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion2 = Composer.INSTANCE;
                if (objRememberedValue == companion2.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableInteractionSource mutableInteractionSource17 = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                function3 = function2;
                zChanged = composerStartRestartGroup.changed(function3);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            function3.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            function3.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM185clickableO2vRcR0$default6 = ClickableKt.m185clickableO2vRcR0$default(companion, mutableInteractionSource17, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                Alignment.Vertical centerVertically12 = companion14.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy12 = RowKt.rowMeasurePolicy(arrangement6.getStart(), centerVertically12, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density12 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection12 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration12 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion15.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf12 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default6);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1259constructorimpl12 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl12, measurePolicyRowMeasurePolicy12, companion15.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl12, density12, companion15.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl12, layoutDirection12, companion15.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl12, viewConfiguration12, companion15.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf12.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                TextKt.m1201Text4IGK_g(title, (Modifier) null, ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha90, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getW400(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i8 & 14) | 199680, 0, 131026);
                composer2 = composerStartRestartGroup;
                ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_arrow_down, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 124);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                BoxKt.Box(RowScope.weight$default(rowScopeInstance6, companion, 1.0f, false, 2, null), composer2, 0);
                if (z6) {
                    composer2.startReplaceableGroup(238820279);
                    Modifier modifierM469size3ABfNKs12 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24));
                    composer2.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composer2.rememberedValue();
                    if (objRememberedValue3 == companion2.getEmpty()) {
                        objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    MutableInteractionSource mutableInteractionSource18 = (MutableInteractionSource) objRememberedValue3;
                    composer2.startReplaceableGroup(1157296644);
                    zChanged2 = composer2.changed(onNext);
                    objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                onNext.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                onNext.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_next, composer2, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs12, mutableInteractionSource18, null, false, null, null, (Function0) objRememberedValue4, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(238820872);
                    BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24)), composer2, 6);
                    composer2.endReplaceableGroup();
                }
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z7 = z5;
                z4 = z6;
                function4 = function3;
            } else {
                if (i9 != 0) {
                    z5 = true;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    z6 = true;
                } else {
                    z6 = z4;
                }
                if (i6 != 0) {
                    function2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-562645762, i8, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment.DateGroup (BodyfatDetailsFragment.kt:82)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM430paddingqDBjuR0$default7 = PaddingKt.m430paddingqDBjuR0$default(BackgroundKt.m163backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_card_white_bg, composerStartRestartGroup, 0), null, 2, null), 0.0f, Dp.m4104constructorimpl(18), 0.0f, 0.0f, 13, null);
                Alignment.Companion companion16 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically13 = companion16.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement arrangement7 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy13 = RowKt.rowMeasurePolicy(arrangement7.getStart(), centerVertically13, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density13 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection13 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration13 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                constructor = companion17.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf13 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default7);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1259constructorimpl13 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl13, measurePolicyRowMeasurePolicy13, companion17.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl13, density13, companion17.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl13, layoutDirection13, companion17.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl13, viewConfiguration13, companion17.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf13.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance7 = RowScopeInstance.INSTANCE;
                if (z5) {
                    composerStartRestartGroup.startReplaceableGroup(238818622);
                    Modifier modifierM469size3ABfNKs13 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24));
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    companion3 = Composer.INSTANCE;
                    if (objRememberedValue5 == companion3.getEmpty()) {
                        objRememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableInteractionSource mutableInteractionSource19 = (MutableInteractionSource) objRememberedValue5;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged3 = composerStartRestartGroup.changed(onPrev);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                onPrev.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                onPrev.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_last, composerStartRestartGroup, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs13, mutableInteractionSource19, null, false, null, null, (Function0) objRememberedValue6, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(238819217);
                    BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24)), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                BoxKt.Box(RowScope.weight$default(rowScopeInstance7, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion2 = Composer.INSTANCE;
                if (objRememberedValue == companion2.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableInteractionSource mutableInteractionSource110 = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                function3 = function2;
                zChanged = composerStartRestartGroup.changed(function3);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            function3.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            function3.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM185clickableO2vRcR0$default7 = ClickableKt.m185clickableO2vRcR0$default(companion, mutableInteractionSource110, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                Alignment.Vertical centerVertically14 = companion16.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy14 = RowKt.rowMeasurePolicy(arrangement7.getStart(), centerVertically14, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density14 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection14 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration14 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion17.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf14 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default7);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1259constructorimpl14 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl14, measurePolicyRowMeasurePolicy14, companion17.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl14, density14, companion17.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl14, layoutDirection14, companion17.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl14, viewConfiguration14, companion17.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf14.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                TextKt.m1201Text4IGK_g(title, (Modifier) null, ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha90, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getW400(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i8 & 14) | 199680, 0, 131026);
                composer2 = composerStartRestartGroup;
                ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_arrow_down, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 124);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                BoxKt.Box(RowScope.weight$default(rowScopeInstance7, companion, 1.0f, false, 2, null), composer2, 0);
                if (z6) {
                    composer2.startReplaceableGroup(238820279);
                    Modifier modifierM469size3ABfNKs14 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24));
                    composer2.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composer2.rememberedValue();
                    if (objRememberedValue3 == companion2.getEmpty()) {
                        objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    MutableInteractionSource mutableInteractionSource111 = (MutableInteractionSource) objRememberedValue3;
                    composer2.startReplaceableGroup(1157296644);
                    zChanged2 = composer2.changed(onNext);
                    objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                onNext.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                onNext.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_next, composer2, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs14, mutableInteractionSource111, null, false, null, null, (Function0) objRememberedValue4, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(238820872);
                    BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24)), composer2, 6);
                    composer2.endReplaceableGroup();
                }
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z7 = z5;
                z4 = z6;
                function4 = function3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i10) {
                    this.$tmp0_rcvr.f0(title, onPrev, onNext, z7, z4, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        z3 = z;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((57344 & i) == 0) {
                z4 = z2;
                if (composerStartRestartGroup.changed(z4)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((458752 & i) == 0) {
                    function1 = function0;
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if ((374491 & i8) == 74898) {
                    if (i9 != 0) {
                        z5 = true;
                    } else {
                        z5 = z3;
                    }
                    if (i4 != 0) {
                        z6 = true;
                    } else {
                        z6 = z4;
                    }
                    if (i6 != 0) {
                        function2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                            }

                            @Override // p010kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-562645762, i8, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment.DateGroup (BodyfatDetailsFragment.kt:82)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierM430paddingqDBjuR0$default8 = PaddingKt.m430paddingqDBjuR0$default(BackgroundKt.m163backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_card_white_bg, composerStartRestartGroup, 0), null, 2, null), 0.0f, Dp.m4104constructorimpl(18), 0.0f, 0.0f, 13, null);
                    Alignment.Companion companion18 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically15 = companion18.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Arrangement arrangement8 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy15 = RowKt.rowMeasurePolicy(arrangement8.getStart(), centerVertically15, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density15 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection15 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration15 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                    constructor = companion19.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf15 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default8);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1259constructorimpl15 = Updater.m1259constructorimpl(composerStartRestartGroup);
                    Updater.m1266setimpl(composerM1259constructorimpl15, measurePolicyRowMeasurePolicy15, companion19.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl15, density15, companion19.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl15, layoutDirection15, companion19.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl15, viewConfiguration15, companion19.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf15.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance8 = RowScopeInstance.INSTANCE;
                    if (z5) {
                        composerStartRestartGroup.startReplaceableGroup(238818622);
                        Modifier modifierM469size3ABfNKs15 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24));
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        companion3 = Composer.INSTANCE;
                        if (objRememberedValue5 == companion3.getEmpty()) {
                            objRememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MutableInteractionSource mutableInteractionSource112 = (MutableInteractionSource) objRememberedValue5;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged3 = composerStartRestartGroup.changed(onPrev);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    onPrev.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    onPrev.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_last, composerStartRestartGroup, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs15, mutableInteractionSource112, null, false, null, null, (Function0) objRememberedValue6, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(238819217);
                        BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24)), composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    BoxKt.Box(RowScope.weight$default(rowScopeInstance8, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion2 = Composer.INSTANCE;
                    if (objRememberedValue == companion2.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableInteractionSource mutableInteractionSource113 = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    function3 = function2;
                    zChanged = composerStartRestartGroup.changed(function3);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                function3.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                function3.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierM185clickableO2vRcR0$default8 = ClickableKt.m185clickableO2vRcR0$default(companion, mutableInteractionSource113, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                    Alignment.Vertical centerVertically16 = companion18.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy16 = RowKt.rowMeasurePolicy(arrangement8.getStart(), centerVertically16, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density16 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection16 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration16 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion19.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf16 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default8);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1259constructorimpl16 = Updater.m1259constructorimpl(composerStartRestartGroup);
                    Updater.m1266setimpl(composerM1259constructorimpl16, measurePolicyRowMeasurePolicy16, companion19.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl16, density16, companion19.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl16, layoutDirection16, companion19.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl16, viewConfiguration16, companion19.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf16.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    TextKt.m1201Text4IGK_g(title, (Modifier) null, ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha90, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getW400(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i8 & 14) | 199680, 0, 131026);
                    composer2 = composerStartRestartGroup;
                    ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_arrow_down, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 124);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    BoxKt.Box(RowScope.weight$default(rowScopeInstance8, companion, 1.0f, false, 2, null), composer2, 0);
                    if (z6) {
                        composer2.startReplaceableGroup(238820279);
                        Modifier modifierM469size3ABfNKs16 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24));
                        composer2.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composer2.rememberedValue();
                        if (objRememberedValue3 == companion2.getEmpty()) {
                            objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        MutableInteractionSource mutableInteractionSource114 = (MutableInteractionSource) objRememberedValue3;
                        composer2.startReplaceableGroup(1157296644);
                        zChanged2 = composer2.changed(onNext);
                        objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    onNext.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    onNext.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceableGroup();
                        ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_next, composer2, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs16, mutableInteractionSource114, null, false, null, null, (Function0) objRememberedValue4, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(238820872);
                        BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24)), composer2, 6);
                        composer2.endReplaceableGroup();
                    }
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z7 = z5;
                    z4 = z6;
                    function4 = function3;
                } else {
                    if (i9 != 0) {
                        z5 = true;
                    } else {
                        z5 = z3;
                    }
                    if (i4 != 0) {
                        z6 = true;
                    } else {
                        z6 = z4;
                    }
                    if (i6 != 0) {
                        function2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                            }

                            @Override // p010kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-562645762, i8, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment.DateGroup (BodyfatDetailsFragment.kt:82)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierM430paddingqDBjuR0$default9 = PaddingKt.m430paddingqDBjuR0$default(BackgroundKt.m163backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_card_white_bg, composerStartRestartGroup, 0), null, 2, null), 0.0f, Dp.m4104constructorimpl(18), 0.0f, 0.0f, 13, null);
                    Alignment.Companion companion110 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically17 = companion110.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Arrangement arrangement9 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy17 = RowKt.rowMeasurePolicy(arrangement9.getStart(), centerVertically17, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density17 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection17 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration17 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                    constructor = companion111.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf17 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default9);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1259constructorimpl17 = Updater.m1259constructorimpl(composerStartRestartGroup);
                    Updater.m1266setimpl(composerM1259constructorimpl17, measurePolicyRowMeasurePolicy17, companion111.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl17, density17, companion111.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl17, layoutDirection17, companion111.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl17, viewConfiguration17, companion111.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf17.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance9 = RowScopeInstance.INSTANCE;
                    if (z5) {
                        composerStartRestartGroup.startReplaceableGroup(238818622);
                        Modifier modifierM469size3ABfNKs17 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24));
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        companion3 = Composer.INSTANCE;
                        if (objRememberedValue5 == companion3.getEmpty()) {
                            objRememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MutableInteractionSource mutableInteractionSource115 = (MutableInteractionSource) objRememberedValue5;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged3 = composerStartRestartGroup.changed(onPrev);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    onPrev.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    onPrev.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_last, composerStartRestartGroup, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs17, mutableInteractionSource115, null, false, null, null, (Function0) objRememberedValue6, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(238819217);
                        BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24)), composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    BoxKt.Box(RowScope.weight$default(rowScopeInstance9, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion2 = Composer.INSTANCE;
                    if (objRememberedValue == companion2.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableInteractionSource mutableInteractionSource116 = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    function3 = function2;
                    zChanged = composerStartRestartGroup.changed(function3);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                function3.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                function3.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierM185clickableO2vRcR0$default9 = ClickableKt.m185clickableO2vRcR0$default(companion, mutableInteractionSource116, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                    Alignment.Vertical centerVertically18 = companion110.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy18 = RowKt.rowMeasurePolicy(arrangement9.getStart(), centerVertically18, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density18 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection18 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration18 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion111.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf18 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default9);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1259constructorimpl18 = Updater.m1259constructorimpl(composerStartRestartGroup);
                    Updater.m1266setimpl(composerM1259constructorimpl18, measurePolicyRowMeasurePolicy18, companion111.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl18, density18, companion111.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl18, layoutDirection18, companion111.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl18, viewConfiguration18, companion111.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf18.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    TextKt.m1201Text4IGK_g(title, (Modifier) null, ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha90, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getW400(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i8 & 14) | 199680, 0, 131026);
                    composer2 = composerStartRestartGroup;
                    ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_arrow_down, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 124);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    BoxKt.Box(RowScope.weight$default(rowScopeInstance9, companion, 1.0f, false, 2, null), composer2, 0);
                    if (z6) {
                        composer2.startReplaceableGroup(238820279);
                        Modifier modifierM469size3ABfNKs18 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24));
                        composer2.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composer2.rememberedValue();
                        if (objRememberedValue3 == companion2.getEmpty()) {
                            objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        MutableInteractionSource mutableInteractionSource117 = (MutableInteractionSource) objRememberedValue3;
                        composer2.startReplaceableGroup(1157296644);
                        zChanged2 = composer2.changed(onNext);
                        objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    onNext.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    onNext.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceableGroup();
                        ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_next, composer2, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs18, mutableInteractionSource117, null, false, null, null, (Function0) objRememberedValue4, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(238820872);
                        BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24)), composer2, 6);
                        composer2.endReplaceableGroup();
                    }
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z7 = z5;
                    z4 = z6;
                    function4 = function3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p010kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i10) {
                        this.$tmp0_rcvr.f0(title, onPrev, onNext, z7, z4, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function1 = function0;
            i8 = i3;
            if ((374491 & i8) == 74898) {
                if (i9 != 0) {
                    z5 = true;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    z6 = true;
                } else {
                    z6 = z4;
                }
                if (i6 != 0) {
                    function2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-562645762, i8, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment.DateGroup (BodyfatDetailsFragment.kt:82)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM430paddingqDBjuR0$default10 = PaddingKt.m430paddingqDBjuR0$default(BackgroundKt.m163backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_card_white_bg, composerStartRestartGroup, 0), null, 2, null), 0.0f, Dp.m4104constructorimpl(18), 0.0f, 0.0f, 13, null);
                Alignment.Companion companion112 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically19 = companion112.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement arrangement10 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy19 = RowKt.rowMeasurePolicy(arrangement10.getStart(), centerVertically19, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density19 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection19 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration19 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                constructor = companion113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf19 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default10);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1259constructorimpl19 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl19, measurePolicyRowMeasurePolicy19, companion113.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl19, density19, companion113.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl19, layoutDirection19, companion113.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl19, viewConfiguration19, companion113.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf19.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance10 = RowScopeInstance.INSTANCE;
                if (z5) {
                    composerStartRestartGroup.startReplaceableGroup(238818622);
                    Modifier modifierM469size3ABfNKs19 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24));
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    companion3 = Composer.INSTANCE;
                    if (objRememberedValue5 == companion3.getEmpty()) {
                        objRememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableInteractionSource mutableInteractionSource118 = (MutableInteractionSource) objRememberedValue5;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged3 = composerStartRestartGroup.changed(onPrev);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                onPrev.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                onPrev.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_last, composerStartRestartGroup, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs19, mutableInteractionSource118, null, false, null, null, (Function0) objRememberedValue6, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(238819217);
                    BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24)), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                BoxKt.Box(RowScope.weight$default(rowScopeInstance10, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion2 = Composer.INSTANCE;
                if (objRememberedValue == companion2.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableInteractionSource mutableInteractionSource119 = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                function3 = function2;
                zChanged = composerStartRestartGroup.changed(function3);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            function3.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            function3.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM185clickableO2vRcR0$default10 = ClickableKt.m185clickableO2vRcR0$default(companion, mutableInteractionSource119, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                Alignment.Vertical centerVertically110 = companion112.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy110 = RowKt.rowMeasurePolicy(arrangement10.getStart(), centerVertically110, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration110 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf110 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default10);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1259constructorimpl110 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl110, measurePolicyRowMeasurePolicy110, companion113.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl110, density110, companion113.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl110, layoutDirection110, companion113.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl110, viewConfiguration110, companion113.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf110.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                TextKt.m1201Text4IGK_g(title, (Modifier) null, ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha90, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getW400(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i8 & 14) | 199680, 0, 131026);
                composer2 = composerStartRestartGroup;
                ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_arrow_down, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 124);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                BoxKt.Box(RowScope.weight$default(rowScopeInstance10, companion, 1.0f, false, 2, null), composer2, 0);
                if (z6) {
                    composer2.startReplaceableGroup(238820279);
                    Modifier modifierM469size3ABfNKs110 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24));
                    composer2.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composer2.rememberedValue();
                    if (objRememberedValue3 == companion2.getEmpty()) {
                        objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    MutableInteractionSource mutableInteractionSource1110 = (MutableInteractionSource) objRememberedValue3;
                    composer2.startReplaceableGroup(1157296644);
                    zChanged2 = composer2.changed(onNext);
                    objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                onNext.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                onNext.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_next, composer2, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs110, mutableInteractionSource1110, null, false, null, null, (Function0) objRememberedValue4, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(238820872);
                    BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24)), composer2, 6);
                    composer2.endReplaceableGroup();
                }
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z7 = z5;
                z4 = z6;
                function4 = function3;
            } else {
                if (i9 != 0) {
                    z5 = true;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    z6 = true;
                } else {
                    z6 = z4;
                }
                if (i6 != 0) {
                    function2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-562645762, i8, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment.DateGroup (BodyfatDetailsFragment.kt:82)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM430paddingqDBjuR0$default11 = PaddingKt.m430paddingqDBjuR0$default(BackgroundKt.m163backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_card_white_bg, composerStartRestartGroup, 0), null, 2, null), 0.0f, Dp.m4104constructorimpl(18), 0.0f, 0.0f, 13, null);
                Alignment.Companion companion114 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically111 = companion114.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement arrangement11 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy111 = RowKt.rowMeasurePolicy(arrangement11.getStart(), centerVertically111, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection111 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration111 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion115 = ComposeUiNode.INSTANCE;
                constructor = companion115.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default11);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1259constructorimpl111 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl111, measurePolicyRowMeasurePolicy111, companion115.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl111, density111, companion115.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl111, layoutDirection111, companion115.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl111, viewConfiguration111, companion115.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf111.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance11 = RowScopeInstance.INSTANCE;
                if (z5) {
                    composerStartRestartGroup.startReplaceableGroup(238818622);
                    Modifier modifierM469size3ABfNKs111 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24));
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    companion3 = Composer.INSTANCE;
                    if (objRememberedValue5 == companion3.getEmpty()) {
                        objRememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableInteractionSource mutableInteractionSource1111 = (MutableInteractionSource) objRememberedValue5;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged3 = composerStartRestartGroup.changed(onPrev);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                onPrev.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                onPrev.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_last, composerStartRestartGroup, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs111, mutableInteractionSource1111, null, false, null, null, (Function0) objRememberedValue6, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(238819217);
                    BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24)), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                BoxKt.Box(RowScope.weight$default(rowScopeInstance11, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion2 = Composer.INSTANCE;
                if (objRememberedValue == companion2.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableInteractionSource mutableInteractionSource1112 = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                function3 = function2;
                zChanged = composerStartRestartGroup.changed(function3);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            function3.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            function3.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM185clickableO2vRcR0$default11 = ClickableKt.m185clickableO2vRcR0$default(companion, mutableInteractionSource1112, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                Alignment.Vertical centerVertically112 = companion114.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy112 = RowKt.rowMeasurePolicy(arrangement11.getStart(), centerVertically112, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection112 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration112 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion115.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf112 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default11);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1259constructorimpl112 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl112, measurePolicyRowMeasurePolicy112, companion115.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl112, density112, companion115.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl112, layoutDirection112, companion115.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl112, viewConfiguration112, companion115.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf112.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                TextKt.m1201Text4IGK_g(title, (Modifier) null, ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha90, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getW400(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i8 & 14) | 199680, 0, 131026);
                composer2 = composerStartRestartGroup;
                ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_arrow_down, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 124);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                BoxKt.Box(RowScope.weight$default(rowScopeInstance11, companion, 1.0f, false, 2, null), composer2, 0);
                if (z6) {
                    composer2.startReplaceableGroup(238820279);
                    Modifier modifierM469size3ABfNKs112 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24));
                    composer2.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composer2.rememberedValue();
                    if (objRememberedValue3 == companion2.getEmpty()) {
                        objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    MutableInteractionSource mutableInteractionSource1113 = (MutableInteractionSource) objRememberedValue3;
                    composer2.startReplaceableGroup(1157296644);
                    zChanged2 = composer2.changed(onNext);
                    objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                onNext.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                onNext.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_next, composer2, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs112, mutableInteractionSource1113, null, false, null, null, (Function0) objRememberedValue4, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(238820872);
                    BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24)), composer2, 6);
                    composer2.endReplaceableGroup();
                }
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z7 = z5;
                z4 = z6;
                function4 = function3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i10) {
                    this.$tmp0_rcvr.f0(title, onPrev, onNext, z7, z4, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 24576;
        z4 = z2;
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((458752 & i) == 0) {
                function1 = function0;
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            i8 = i3;
            if ((374491 & i8) == 74898) {
                if (i9 != 0) {
                    z5 = true;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    z6 = true;
                } else {
                    z6 = z4;
                }
                if (i6 != 0) {
                    function2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-562645762, i8, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment.DateGroup (BodyfatDetailsFragment.kt:82)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM430paddingqDBjuR0$default12 = PaddingKt.m430paddingqDBjuR0$default(BackgroundKt.m163backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_card_white_bg, composerStartRestartGroup, 0), null, 2, null), 0.0f, Dp.m4104constructorimpl(18), 0.0f, 0.0f, 13, null);
                Alignment.Companion companion116 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically113 = companion116.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement arrangement12 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy113 = RowKt.rowMeasurePolicy(arrangement12.getStart(), centerVertically113, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection113 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration113 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                constructor = companion117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf113 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default12);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1259constructorimpl113 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl113, measurePolicyRowMeasurePolicy113, companion117.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl113, density113, companion117.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl113, layoutDirection113, companion117.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl113, viewConfiguration113, companion117.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf113.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance12 = RowScopeInstance.INSTANCE;
                if (z5) {
                    composerStartRestartGroup.startReplaceableGroup(238818622);
                    Modifier modifierM469size3ABfNKs113 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24));
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    companion3 = Composer.INSTANCE;
                    if (objRememberedValue5 == companion3.getEmpty()) {
                        objRememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableInteractionSource mutableInteractionSource1114 = (MutableInteractionSource) objRememberedValue5;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged3 = composerStartRestartGroup.changed(onPrev);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                onPrev.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                onPrev.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_last, composerStartRestartGroup, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs113, mutableInteractionSource1114, null, false, null, null, (Function0) objRememberedValue6, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(238819217);
                    BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24)), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                BoxKt.Box(RowScope.weight$default(rowScopeInstance12, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion2 = Composer.INSTANCE;
                if (objRememberedValue == companion2.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableInteractionSource mutableInteractionSource1115 = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                function3 = function2;
                zChanged = composerStartRestartGroup.changed(function3);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            function3.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            function3.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM185clickableO2vRcR0$default12 = ClickableKt.m185clickableO2vRcR0$default(companion, mutableInteractionSource1115, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                Alignment.Vertical centerVertically114 = companion116.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy114 = RowKt.rowMeasurePolicy(arrangement12.getStart(), centerVertically114, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density114 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection114 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration114 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf114 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default12);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1259constructorimpl114 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl114, measurePolicyRowMeasurePolicy114, companion117.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl114, density114, companion117.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl114, layoutDirection114, companion117.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl114, viewConfiguration114, companion117.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf114.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                TextKt.m1201Text4IGK_g(title, (Modifier) null, ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha90, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getW400(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i8 & 14) | 199680, 0, 131026);
                composer2 = composerStartRestartGroup;
                ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_arrow_down, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 124);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                BoxKt.Box(RowScope.weight$default(rowScopeInstance12, companion, 1.0f, false, 2, null), composer2, 0);
                if (z6) {
                    composer2.startReplaceableGroup(238820279);
                    Modifier modifierM469size3ABfNKs114 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24));
                    composer2.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composer2.rememberedValue();
                    if (objRememberedValue3 == companion2.getEmpty()) {
                        objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    MutableInteractionSource mutableInteractionSource1116 = (MutableInteractionSource) objRememberedValue3;
                    composer2.startReplaceableGroup(1157296644);
                    zChanged2 = composer2.changed(onNext);
                    objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                onNext.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                onNext.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_next, composer2, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs114, mutableInteractionSource1116, null, false, null, null, (Function0) objRememberedValue4, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(238820872);
                    BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24)), composer2, 6);
                    composer2.endReplaceableGroup();
                }
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z7 = z5;
                z4 = z6;
                function4 = function3;
            } else {
                if (i9 != 0) {
                    z5 = true;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    z6 = true;
                } else {
                    z6 = z4;
                }
                if (i6 != 0) {
                    function2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-562645762, i8, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment.DateGroup (BodyfatDetailsFragment.kt:82)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM430paddingqDBjuR0$default13 = PaddingKt.m430paddingqDBjuR0$default(BackgroundKt.m163backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_card_white_bg, composerStartRestartGroup, 0), null, 2, null), 0.0f, Dp.m4104constructorimpl(18), 0.0f, 0.0f, 13, null);
                Alignment.Companion companion118 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically115 = companion118.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement arrangement13 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy115 = RowKt.rowMeasurePolicy(arrangement13.getStart(), centerVertically115, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density115 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection115 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration115 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion119 = ComposeUiNode.INSTANCE;
                constructor = companion119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf115 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default13);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1259constructorimpl115 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl115, measurePolicyRowMeasurePolicy115, companion119.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl115, density115, companion119.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl115, layoutDirection115, companion119.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl115, viewConfiguration115, companion119.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf115.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance13 = RowScopeInstance.INSTANCE;
                if (z5) {
                    composerStartRestartGroup.startReplaceableGroup(238818622);
                    Modifier modifierM469size3ABfNKs115 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24));
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    companion3 = Composer.INSTANCE;
                    if (objRememberedValue5 == companion3.getEmpty()) {
                        objRememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableInteractionSource mutableInteractionSource1117 = (MutableInteractionSource) objRememberedValue5;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged3 = composerStartRestartGroup.changed(onPrev);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                onPrev.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                onPrev.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_last, composerStartRestartGroup, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs115, mutableInteractionSource1117, null, false, null, null, (Function0) objRememberedValue6, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(238819217);
                    BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24)), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                BoxKt.Box(RowScope.weight$default(rowScopeInstance13, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion2 = Composer.INSTANCE;
                if (objRememberedValue == companion2.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableInteractionSource mutableInteractionSource1118 = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                function3 = function2;
                zChanged = composerStartRestartGroup.changed(function3);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            function3.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            function3.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM185clickableO2vRcR0$default13 = ClickableKt.m185clickableO2vRcR0$default(companion, mutableInteractionSource1118, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                Alignment.Vertical centerVertically116 = companion118.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy116 = RowKt.rowMeasurePolicy(arrangement13.getStart(), centerVertically116, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density116 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection116 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration116 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf116 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default13);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1259constructorimpl116 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl116, measurePolicyRowMeasurePolicy116, companion119.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl116, density116, companion119.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl116, layoutDirection116, companion119.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl116, viewConfiguration116, companion119.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf116.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                TextKt.m1201Text4IGK_g(title, (Modifier) null, ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha90, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getW400(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i8 & 14) | 199680, 0, 131026);
                composer2 = composerStartRestartGroup;
                ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_arrow_down, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 124);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                BoxKt.Box(RowScope.weight$default(rowScopeInstance13, companion, 1.0f, false, 2, null), composer2, 0);
                if (z6) {
                    composer2.startReplaceableGroup(238820279);
                    Modifier modifierM469size3ABfNKs116 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24));
                    composer2.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composer2.rememberedValue();
                    if (objRememberedValue3 == companion2.getEmpty()) {
                        objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    MutableInteractionSource mutableInteractionSource1119 = (MutableInteractionSource) objRememberedValue3;
                    composer2.startReplaceableGroup(1157296644);
                    zChanged2 = composer2.changed(onNext);
                    objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                onNext.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                onNext.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_next, composer2, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs116, mutableInteractionSource1119, null, false, null, null, (Function0) objRememberedValue4, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(238820872);
                    BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24)), composer2, 6);
                    composer2.endReplaceableGroup();
                }
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z7 = z5;
                z4 = z6;
                function4 = function3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i10) {
                    this.$tmp0_rcvr.f0(title, onPrev, onNext, z7, z4, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        function1 = function0;
        i8 = i3;
        if ((374491 & i8) == 74898) {
            if (i9 != 0) {
                z5 = true;
            } else {
                z5 = z3;
            }
            if (i4 != 0) {
                z6 = true;
            } else {
                z6 = z4;
            }
            if (i6 != 0) {
                function2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                };
            } else {
                function2 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-562645762, i8, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment.DateGroup (BodyfatDetailsFragment.kt:82)");
            }
            companion = Modifier.INSTANCE;
            Modifier modifierM430paddingqDBjuR0$default14 = PaddingKt.m430paddingqDBjuR0$default(BackgroundKt.m163backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_card_white_bg, composerStartRestartGroup, 0), null, 2, null), 0.0f, Dp.m4104constructorimpl(18), 0.0f, 0.0f, 13, null);
            Alignment.Companion companion1110 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically117 = companion1110.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement14 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy117 = RowKt.rowMeasurePolicy(arrangement14.getStart(), centerVertically117, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density117 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection117 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration117 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion1111 = ComposeUiNode.INSTANCE;
            constructor = companion1111.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf117 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default14);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1259constructorimpl117 = Updater.m1259constructorimpl(composerStartRestartGroup);
            Updater.m1266setimpl(composerM1259constructorimpl117, measurePolicyRowMeasurePolicy117, companion1111.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl117, density117, companion1111.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl117, layoutDirection117, companion1111.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl117, viewConfiguration117, companion1111.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf117.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance14 = RowScopeInstance.INSTANCE;
            if (z5) {
                composerStartRestartGroup.startReplaceableGroup(238818622);
                Modifier modifierM469size3ABfNKs117 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24));
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                companion3 = Composer.INSTANCE;
                if (objRememberedValue5 == companion3.getEmpty()) {
                    objRememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableInteractionSource mutableInteractionSource11110 = (MutableInteractionSource) objRememberedValue5;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged3 = composerStartRestartGroup.changed(onPrev);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            onPrev.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            onPrev.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_last, composerStartRestartGroup, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs117, mutableInteractionSource11110, null, false, null, null, (Function0) objRememberedValue6, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(238819217);
                BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24)), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            }
            BoxKt.Box(RowScope.weight$default(rowScopeInstance14, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableInteractionSource mutableInteractionSource11111 = (MutableInteractionSource) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            function3 = function2;
            zChanged = composerStartRestartGroup.changed(function3);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        function3.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        function3.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM185clickableO2vRcR0$default14 = ClickableKt.m185clickableO2vRcR0$default(companion, mutableInteractionSource11111, null, false, null, null, (Function0) objRememberedValue2, 28, null);
            Alignment.Vertical centerVertically118 = companion1110.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy118 = RowKt.rowMeasurePolicy(arrangement14.getStart(), centerVertically118, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density118 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection118 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration118 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion1111.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf118 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default14);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1259constructorimpl118 = Updater.m1259constructorimpl(composerStartRestartGroup);
            Updater.m1266setimpl(composerM1259constructorimpl118, measurePolicyRowMeasurePolicy118, companion1111.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl118, density118, companion1111.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl118, layoutDirection118, companion1111.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl118, viewConfiguration118, companion1111.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf118.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            TextKt.m1201Text4IGK_g(title, (Modifier) null, ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha90, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getW400(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i8 & 14) | 199680, 0, 131026);
            composer2 = composerStartRestartGroup;
            ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_arrow_down, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 124);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            BoxKt.Box(RowScope.weight$default(rowScopeInstance14, companion, 1.0f, false, 2, null), composer2, 0);
            if (z6) {
                composer2.startReplaceableGroup(238820279);
                Modifier modifierM469size3ABfNKs118 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24));
                composer2.startReplaceableGroup(-492369756);
                objRememberedValue3 = composer2.rememberedValue();
                if (objRememberedValue3 == companion2.getEmpty()) {
                    objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceableGroup();
                MutableInteractionSource mutableInteractionSource11112 = (MutableInteractionSource) objRememberedValue3;
                composer2.startReplaceableGroup(1157296644);
                zChanged2 = composer2.changed(onNext);
                objRememberedValue4 = composer2.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            onNext.invoke();
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            onNext.invoke();
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceableGroup();
                ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_next, composer2, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs118, mutableInteractionSource11112, null, false, null, null, (Function0) objRememberedValue4, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(238820872);
                BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24)), composer2, 6);
                composer2.endReplaceableGroup();
            }
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z7 = z5;
            z4 = z6;
            function4 = function3;
        } else {
            if (i9 != 0) {
                z5 = true;
            } else {
                z5 = z3;
            }
            if (i4 != 0) {
                z6 = true;
            } else {
                z6 = z4;
            }
            if (i6 != 0) {
                function2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                };
            } else {
                function2 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-562645762, i8, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment.DateGroup (BodyfatDetailsFragment.kt:82)");
            }
            companion = Modifier.INSTANCE;
            Modifier modifierM430paddingqDBjuR0$default15 = PaddingKt.m430paddingqDBjuR0$default(BackgroundKt.m163backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_card_white_bg, composerStartRestartGroup, 0), null, 2, null), 0.0f, Dp.m4104constructorimpl(18), 0.0f, 0.0f, 13, null);
            Alignment.Companion companion1112 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically119 = companion1112.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement15 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy119 = RowKt.rowMeasurePolicy(arrangement15.getStart(), centerVertically119, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density119 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection119 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration119 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion1113 = ComposeUiNode.INSTANCE;
            constructor = companion1113.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf119 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default15);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1259constructorimpl119 = Updater.m1259constructorimpl(composerStartRestartGroup);
            Updater.m1266setimpl(composerM1259constructorimpl119, measurePolicyRowMeasurePolicy119, companion1113.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl119, density119, companion1113.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl119, layoutDirection119, companion1113.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl119, viewConfiguration119, companion1113.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf119.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance15 = RowScopeInstance.INSTANCE;
            if (z5) {
                composerStartRestartGroup.startReplaceableGroup(238818622);
                Modifier modifierM469size3ABfNKs119 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24));
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                companion3 = Composer.INSTANCE;
                if (objRememberedValue5 == companion3.getEmpty()) {
                    objRememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableInteractionSource mutableInteractionSource11113 = (MutableInteractionSource) objRememberedValue5;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged3 = composerStartRestartGroup.changed(onPrev);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            onPrev.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            onPrev.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_last, composerStartRestartGroup, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs119, mutableInteractionSource11113, null, false, null, null, (Function0) objRememberedValue6, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(238819217);
                BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl(24)), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            }
            BoxKt.Box(RowScope.weight$default(rowScopeInstance15, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableInteractionSource mutableInteractionSource11114 = (MutableInteractionSource) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            function3 = function2;
            zChanged = composerStartRestartGroup.changed(function3);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        function3.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        function3.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM185clickableO2vRcR0$default15 = ClickableKt.m185clickableO2vRcR0$default(companion, mutableInteractionSource11114, null, false, null, null, (Function0) objRememberedValue2, 28, null);
            Alignment.Vertical centerVertically1110 = companion1112.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy1110 = RowKt.rowMeasurePolicy(arrangement15.getStart(), centerVertically1110, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density1110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection1110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration1110 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion1113.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1110 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default15);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1259constructorimpl1110 = Updater.m1259constructorimpl(composerStartRestartGroup);
            Updater.m1266setimpl(composerM1259constructorimpl1110, measurePolicyRowMeasurePolicy1110, companion1113.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl1110, density1110, companion1113.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl1110, layoutDirection1110, companion1113.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl1110, viewConfiguration1110, companion1113.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf1110.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            TextKt.m1201Text4IGK_g(title, (Modifier) null, ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha90, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getW400(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i8 & 14) | 199680, 0, 131026);
            composer2 = composerStartRestartGroup;
            ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_arrow_down, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 124);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            BoxKt.Box(RowScope.weight$default(rowScopeInstance15, companion, 1.0f, false, 2, null), composer2, 0);
            if (z6) {
                composer2.startReplaceableGroup(238820279);
                Modifier modifierM469size3ABfNKs1110 = SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24));
                composer2.startReplaceableGroup(-492369756);
                objRememberedValue3 = composer2.rememberedValue();
                if (objRememberedValue3 == companion2.getEmpty()) {
                    objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceableGroup();
                MutableInteractionSource mutableInteractionSource11115 = (MutableInteractionSource) objRememberedValue3;
                composer2.startReplaceableGroup(1157296644);
                zChanged2 = composer2.changed(onNext);
                objRememberedValue4 = composer2.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            onNext.invoke();
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$2$7$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            onNext.invoke();
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceableGroup();
                ImageKt.Image(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_next, composer2, 0), (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs1110, mutableInteractionSource11115, null, false, null, null, (Function0) objRememberedValue4, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(238820872);
                BoxKt.Box(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null), Dp.m4104constructorimpl(24)), composer2, 6);
                composer2.endReplaceableGroup();
            }
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z7 = z5;
            z4 = z6;
            function4 = function3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$DateGroup$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i10) {
                this.$tmp0_rcvr.f0(title, onPrev, onNext, z7, z4, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void g0(@NotNull final ColumnScope Indicator, final long j2, final long j3, final boolean z, final boolean z2, final boolean z3, @Nullable Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(Indicator, "$this$Indicator");
        Composer composerStartRestartGroup = composer.startRestartGroup(1839824291);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(Indicator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(j3) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
        }
        if ((i2 & 374491) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1839824291, i, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment.Indicator (BodyfatDetailsFragment.kt:278)");
            }
            if (!z3 && !z2) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$Indicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p010kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i3) {
                        this.$tmp0_rcvr.g0(Indicator, j2, j3, z, z2, z3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    }
                });
                return;
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierM430paddingqDBjuR0$default = PaddingKt.m430paddingqDBjuR0$default(Indicator.align(companion, companion2.getCenterHorizontally()), 0.0f, Dp.m4104constructorimpl(10), 0.0f, 0.0f, 13, null);
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1259constructorimpl = Updater.m1259constructorimpl(composerStartRestartGroup);
            Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl, density, companion3.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f = z ? 1.0f : 0.5f;
            float f2 = 6;
            BoxKt.Box(BackgroundKt.m162backgroundbw27NRU(AlphaKt.alpha(SizeKt.m469size3ABfNKs(companion, Dp.m4104constructorimpl(f2)), f), j2, RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
            String strStringResource = StringResources_androidKt.stringResource(R$string.health_body_fat_weight, composerStartRestartGroup, 0);
            long sp = TextUnitKt.getSp(12);
            FontWeight.Companion companion4 = FontWeight.INSTANCE;
            FontWeight w400 = companion4.getW400();
            int i3 = R$color.health_body_fat_black_alpha55;
            float f3 = 4;
            TextKt.m1201Text4IGK_g(strStringResource, AlphaKt.alpha(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(f3), 0.0f, 0.0f, 0.0f, 14, null), f), ColorResources_androidKt.colorResource(i3, composerStartRestartGroup, 0), sp, (FontStyle) null, w400, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131024);
            BoxKt.Box(SizeKt.m474width3ABfNKs(companion, Dp.m4104constructorimpl(30)), composerStartRestartGroup, 6);
            float f4 = z2 ? 1.0f : 0.5f;
            BoxKt.Box(BackgroundKt.m162backgroundbw27NRU(AlphaKt.alpha(SizeKt.m469size3ABfNKs(companion, Dp.m4104constructorimpl(f2)), f4), j3, RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
            TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(R$string.health_body_fat, composerStartRestartGroup, 0), AlphaKt.alpha(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(f3), 0.0f, 0.0f, 0.0f, 14, null), f4), ColorResources_androidKt.colorResource(i3, composerStartRestartGroup, 0), TextUnitKt.getSp(12), (FontStyle) null, companion4.getW400(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131024);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$Indicator$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i4) {
                this.$tmp2_rcvr.g0(Indicator, j2, j3, z, z2, z3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public int getLayoutId() {
        return R$layout.health_body_fat_frg_details_compose_v;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x014b  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void h0(@NotNull final List<? extends WeightBodyFat> allData, @NotNull final LocalDate startDate, @NotNull final LocalDate endDate, int i, int i2, @Nullable Composer composer, final int i3, final int i4) {
        String strG;
        String strE;
        String str;
        Float fValueOf;
        Object next;
        Intrinsics.checkNotNullParameter(allData, "allData");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Composer composerStartRestartGroup = composer.startRestartGroup(-264871542);
        Integer num = 0;
        int i5 = (i4 & 8) != 0 ? 0 : i;
        int i6 = (i4 & 16) != 0 ? 1 : i2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-264871542, i3, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment.SummaryCard (BodyfatDetailsFragment.kt:365)");
        }
        ArrayList arrayList = new ArrayList();
        long jH = h15.H(startDate);
        long jH2 = h15.H(endDate) - 1;
        for (WeightBodyFat weightBodyFat : allData) {
            long measurementTime = weightBodyFat.getMeasurementTime();
            if (jH <= measurementTime && measurementTime <= jH2) {
                arrayList.add(weightBodyFat);
            }
        }
        int size = arrayList.size();
        String strValueOf = String.valueOf(size);
        String quantityString = jt3.c(composerStartRestartGroup, 0).getQuantityString(R$plurals.health_body_fat_summary_unit_days, size, strValueOf);
        Intrinsics.checkNotNullExpressionValue(quantityString, "Res().getQuantityString(…ays, daysValStr\n        )");
        composerStartRestartGroup.startReplaceableGroup(127534823);
        String str2 = "";
        if (size > 1) {
            String weight = ((WeightBodyFat) CollectionsKt___CollectionsKt.last((List) arrayList)).getWeight();
            Intrinsics.checkNotNullExpressionValue(weight, "showDataList.last().weight");
            double d = Double.parseDouble(weight);
            String weight2 = ((WeightBodyFat) CollectionsKt___CollectionsKt.first((List) arrayList)).getWeight();
            Intrinsics.checkNotNullExpressionValue(weight2, "showDataList.first().weight");
            float fH = q12.h((float) ((d - Double.parseDouble(weight2)) / 1000.0d), i5);
            strE = q12.e(fH, i6);
            Intrinsics.checkNotNullExpressionValue(strE, "formatWeightValue(diffDisplay, precision)");
            strG = q12.g((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), (int) fH, i5, strE);
        } else {
            strG = "--";
            strE = "";
        }
        composerStartRestartGroup.endReplaceableGroup();
        ArrayList arrayList2 = new ArrayList();
        for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
            List<WeightLabel> weightLabelList = ((WeightBodyFat) it.next()).getWeightLabelList();
            if (weightLabelList != null) {
                Iterator<T> it2 = weightLabelList.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.areEqual(((WeightLabel) next).getLabel(), "体脂率"));
                WeightLabel weightLabel = (WeightLabel) next;
                if (weightLabel != null) {
                    fValueOf = Float.valueOf((float) weightLabel.getLabelValue());
                } else {
                    fValueOf = null;
                }
            } else {
                fValueOf = null;
            }
            Float f = (fValueOf == null || fValueOf.floatValue() <= 0.0f) ? null : fValueOf;
            if (f != null) {
                arrayList2.add(f);
            }
        }
        if (arrayList2.size() > 1) {
            float fFloatValue = ((Number) CollectionsKt___CollectionsKt.last((List) arrayList2)).floatValue() - ((Number) CollectionsKt___CollectionsKt.first((List) arrayList2)).floatValue();
            str2 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(fFloatValue)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            str = String.format("%.1f%%", Arrays.copyOf(new Object[]{Float.valueOf(fFloatValue)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        } else {
            str = null;
        }
        List listListOf = str == null ? CollectionsKt__CollectionsKt.listOf((Object[]) new Triple[]{new Triple(Integer.valueOf(R$string.health_body_fat_summary_label_days), strValueOf, quantityString), new Triple(Integer.valueOf(R$string.health_body_fat_summary_label_weight_change), strE, strG)}) : CollectionsKt__CollectionsKt.listOf((Object[]) new Triple[]{new Triple(Integer.valueOf(R$string.health_body_fat_summary_label_days), strValueOf, quantityString), new Triple(Integer.valueOf(R$string.health_body_fat_summary_label_weight_change), strE, strG), new Triple(Integer.valueOf(R$string.health_body_fat_summary_label_fat_rate_change), str2, str)});
        float f2 = 16;
        int i7 = i6;
        Modifier modifierM427paddingVpY3zN4 = PaddingKt.m427paddingVpY3zN4(BackgroundKt.m162backgroundbw27NRU(PaddingKt.m430paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4104constructorimpl(f2), Dp.m4104constructorimpl(20), Dp.m4104constructorimpl(f2), 0.0f, 8, null), ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_card_white_bg, composerStartRestartGroup, 0), RoundedCornerShapeKt.m700RoundedCornerShape0680j_4(Dp.m4104constructorimpl(f2))), Dp.m4104constructorimpl(7), Dp.m4104constructorimpl(17));
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
        int i8 = -1323940314;
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM427paddingVpY3zN4);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM1259constructorimpl = Updater.m1259constructorimpl(composerStartRestartGroup);
        Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl, density, companion.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, num);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        int i9 = 0;
        for (Object obj : listListOf) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Triple triple = (Triple) obj;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion2, 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(i8);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierWeight$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1259constructorimpl2 = Updater.m1259constructorimpl(composerStartRestartGroup);
            Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion4.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion4.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion4.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, num);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierAlign = columnScopeInstance.align(companion2, companion3.getCenterHorizontally());
            String strStringResource = StringResources_androidKt.stringResource(((Number) triple.getFirst()).intValue(), composerStartRestartGroup, 0);
            long sp = TextUnitKt.getSp(16);
            FontWeight.Companion companion5 = FontWeight.INSTANCE;
            int i11 = i5;
            int i12 = i9;
            int i13 = i7;
            Integer num2 = num;
            TextKt.m1201Text4IGK_g(strStringResource, modifierAlign, ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha55, composerStartRestartGroup, 0), sp, (FontStyle) null, companion5.getW500(), jt3.a(composerStartRestartGroup, 0), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 130960);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            int iPushStyle = builder.pushStyle(new SpanStyle(0L, TextUnitKt.getSp(20), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16381, (DefaultConstructorMarker) null));
            try {
                builder.append((String) triple.getSecond());
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                int iPushStyle2 = builder.pushStyle(new SpanStyle(0L, TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, BaselineShift.m3887boximpl(BaselineShift.m3888constructorimpl(0.112f)), (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16125, (DefaultConstructorMarker) null));
                try {
                    builder.append(StringsKt__StringsJVMKt.replace$default((String) triple.getThird(), (String) triple.getSecond(), "", false, 4, (Object) null));
                    builder.pop(iPushStyle2);
                    TextKt.m1202TextIbK3jfQ(builder.toAnnotatedString(), columnScopeInstance.align(companion2, companion3.getCenterHorizontally()), ColorResources_androidKt.colorResource(R$color.health_body_fat_black, composerStartRestartGroup, 0), 0L, null, companion5.getW500(), jt3.a(composerStartRestartGroup, 0), 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 262040);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (i12 != listListOf.size() - 1) {
                        BoxKt.Box(rowScopeInstance.align(BackgroundKt.m163backgroundbw27NRU$default(SizeKt.m455height3ABfNKs(SizeKt.m474width3ABfNKs(companion2, Dp.m4104constructorimpl(1)), Dp.m4104constructorimpl(30)), ColorResources_androidKt.colorResource(com.heytap.health.ui.R$color.black_12alpha, composerStartRestartGroup, 0), null, 2, null), companion3.getCenterVertically()), composerStartRestartGroup, 0);
                    }
                    i9 = i10;
                    i5 = i11;
                    i7 = i13;
                    i8 = -1323940314;
                    num = num2;
                } catch (Throwable th) {
                    builder.pop(iPushStyle2);
                    throw th;
                }
            } catch (Throwable th2) {
                builder.pop(iPushStyle);
                throw th2;
            }
        }
        final int i14 = i5;
        final int i15 = i7;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$SummaryCard$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num3) {
                invoke(composer2, num3.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i16) {
                this.$tmp1_rcvr.h0(allData, startDate, endDate, i14, i15, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
            }
        });
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initData() {
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initView(@Nullable View view) {
        ComposeView composeView = view instanceof ComposeView ? (ComposeView) view : null;
        if (composeView != null) {
            n0(composeView);
        }
    }

    @NotNull
    public final MutableState<Integer> k0() {
        return this.dataTopInDay;
    }

    public void n0(@NotNull ComposeView composeView) {
        Intrinsics.checkNotNullParameter(composeView, "<this>");
    }

    public final void p0(@NotNull Context context, @NotNull LocalDate selectDate, @Nullable String userTagId, @Nullable Long earliestTime, @NotNull final Function1<? super LocalDate, Unit> onDateSelected) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(selectDate, "selectDate");
        Intrinsics.checkNotNullParameter(onDateSelected, "onDateSelected");
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity == null) {
            return;
        }
        Fragment fragmentFindFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag(BodyfatCalendarPanelFragment.TAG);
        COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment = fragmentFindFragmentByTag instanceof COUIBottomSheetDialogFragment ? (COUIBottomSheetDialogFragment) fragmentFindFragmentByTag : null;
        if (cOUIBottomSheetDialogFragment != null) {
            cOUIBottomSheetDialogFragment.dismiss();
        }
        final COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment2 = new COUIBottomSheetDialogFragment();
        cOUIBottomSheetDialogFragment2.setMainPanelFragment(new BodyfatCalendarPanelFragment(userTagId, selectDate, earliestTime, new Function1<LocalDate, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment$showCalendar$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LocalDate localDate) {
                invoke2(localDate);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LocalDate date) {
                Intrinsics.checkNotNullParameter(date, "date");
                onDateSelected.invoke(date);
                cOUIBottomSheetDialogFragment2.dismiss();
            }
        }));
        cOUIBottomSheetDialogFragment2.show(fragmentActivity.getSupportFragmentManager(), BodyfatCalendarPanelFragment.TAG);
    }
}