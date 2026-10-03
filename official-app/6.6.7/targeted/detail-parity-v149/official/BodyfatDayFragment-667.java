package com.heytap.health.bodyfat.ui.frg;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
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
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.heytap.databaseengine.model.weight.FamilyMemberInfo;
import com.heytap.databaseengine.model.weight.WeightBodyFat;
import com.heytap.databaseengine.model.weight.WeightGoal;
import com.heytap.databaseengine.model.weight.WeightLabel;
import com.heytap.health.base.pad.PadFeature;
import com.heytap.health.base.ui.widget.HealthButton;
import com.heytap.health.bodyfat.R$color;
import com.heytap.health.bodyfat.R$drawable;
import com.heytap.health.bodyfat.R$string;
import com.heytap.health.bodyfat.ui.BodyFatEvaluateActivity;
import com.heytap.health.bodyfat.ui.WeightGoalProgressActivity;
import com.heytap.health.bodyfat.viewmodel.BodyfatDayViewModel;
import com.heytap.health.bodyfat.viewmodel.BodyfatDetailsSharedViewModel;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import com.heytap.store.homemodule.data.HomeResponseData;
import com.oplus.aiunit.vision.AllWeightData;
import com.oplus.aiunit.vision.a5k;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.jt3;
import com.oplus.aiunit.vision.q12;
import com.oplus.aiunit.vision.rul;
import com.oplus.aiunit.vision.u5e;
import com.oplus.backup.sdk.common.utils.ModuleType;
import com.oplus.smartenginehelper.ParserTag;
import com.support.appcompat.R$attr;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;
import p010kotlin.text.StringsKt__StringNumberConversionsKt;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 W2\u00020\u0001:\u0001XB\u0007¢\u0006\u0004\bU\u0010VJi\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0003¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0002J\u008f\u0001\u0010,\u001a\u00020\u00132\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010#\u001a\u0004\u0018\u00010\u00052\b\u0010$\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020\n2\b\b\u0002\u0010&\u001a\u00020\n2\b\b\u0002\u0010'\u001a\u00020\n2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130(2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130(2\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130(H\u0003¢\u0006\u0004\b,\u0010-J?\u00102\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u000e2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\n2\b\b\u0002\u0010%\u001a\u00020\nH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0013H\u0003¢\u0006\u0004\b4\u00105J\u0014\u00108\u001a\u00020\u0013*\u0002062\u0006\u00107\u001a\u00020\nH\u0002J\u0013\u00109\u001a\u00020\u000e*\u00020\u0002H\u0003¢\u0006\u0004\b9\u0010:J\u001c\u0010<\u001a\u0004\u0018\u00010\f*\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010;\u001a\u00020\u0002H\u0002J\b\u0010=\u001a\u00020\u0013H\u0016J\f\u0010?\u001a\u00020\u0013*\u00020>H\u0014J\u000f\u0010@\u001a\u00020\u0013H\u0007¢\u0006\u0004\b@\u00105R\u0016\u0010C\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001b\u0010I\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010F\u001a\u0004\bL\u0010MR\"\u0010T\u001a\u0010\u0012\f\u0012\n Q*\u0004\u0018\u00010P0P0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Y"}, d2 = {"Lcom/heytap/health/bodyfat/ui/frg/BodyfatDayFragment;", "Lcom/heytap/health/bodyfat/ui/frg/BodyfatDetailsFragment;", "Ljava/time/LocalDate;", "anchorDate", "Lkotlin/Pair;", "", "recordMinMax", "", "Lcom/heytap/databaseengine/model/weight/WeightBodyFat;", "allDataList", "", "waitInitialData", "Lcom/heytap/databaseengine/model/weight/WeightGoal;", "weightGoalList", "", "userTagId", "", "unit", "precision", "", "s0", "(Ljava/time/LocalDate;Lkotlin/Pair;Ljava/util/List;ZLjava/util/List;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)V", "dayLatestRecord", "r0", "(Lcom/heytap/databaseengine/model/weight/WeightBodyFat;Landroidx/compose/runtime/Composer;I)V", "labelName", "valueText", "unitText", "statusText", "q0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "", "value", "Y0", "dataList", "initialWeightGrams", "targetWeightGrams", "memberHasAnyGoal", "isCurrentPage", "progressAnimated", "Lkotlin/Function0;", "onProgressAnimated", "onInitialWeightClick", "onTargetWeightClick", acl.KEY_A0, "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;IIZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", Feedback.WIDGET_LABEL, "Landroidx/compose/ui/graphics/Color;", ParserTag.TAG_TEXT_COLOR, "hasGoal", "z0", "(Ljava/lang/String;Ljava/lang/String;JZZLandroidx/compose/runtime/Composer;II)V", "x0", "(Landroidx/compose/runtime/Composer;I)V", "Landroid/view/View;", "disallowIntercept", "e1", "f1", "(Ljava/time/LocalDate;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "date", "X0", "initData", "Landroidx/compose/ui/platform/ComposeView;", "n0", "y0", LogFieldKey.PROCESS_NAME_KEY, "Z", "isPreview", "Lcom/heytap/health/bodyfat/viewmodel/BodyfatDetailsSharedViewModel;", "q", "Lkotlin/Lazy;", "Z0", "()Lcom/heytap/health/bodyfat/viewmodel/BodyfatDetailsSharedViewModel;", "sharedVm", "Lcom/heytap/health/bodyfat/viewmodel/BodyfatDayViewModel;", "r", "d1", "()Lcom/heytap/health/bodyfat/viewmodel/BodyfatDayViewModel;", "vm", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "s", "Landroidx/activity/result/ActivityResultLauncher;", "goalProgressLauncher", "<init>", "()V", "Companion", "a", "bodyfat_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBodyfatDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BodyfatDayFragment.kt\ncom/heytap/health/bodyfat/ui/frg/BodyfatDayFragment\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,930:1\n25#2:931\n25#2:938\n25#2:945\n83#2,3:954\n50#2:963\n49#2:964\n460#2,13:990\n460#2,13:1026\n473#2,3:1040\n473#2,3:1045\n460#2,13:1072\n460#2,13:1108\n460#2,13:1141\n25#2:1156\n460#2,13:1182\n473#2,3:1196\n473#2,3:1202\n473#2,3:1208\n473#2,3:1213\n460#2,13:1238\n460#2,13:1272\n473#2,3:1287\n473#2,3:1293\n25#2:1298\n460#2,13:1326\n83#2,3:1341\n460#2,13:1370\n473#2,3:1385\n460#2,13:1410\n25#2:1424\n36#2:1431\n460#2,13:1457\n473#2,3:1471\n25#2:1476\n36#2:1483\n460#2,13:1509\n473#2,3:1523\n473#2,3:1528\n473#2,3:1533\n460#2,13:1558\n460#2,13:1592\n473#2,3:1606\n473#2,3:1611\n25#2:1616\n1114#3,6:932\n1114#3,6:939\n1114#3,6:946\n1114#3,6:957\n1114#3,6:965\n1114#3,6:1157\n1114#3,6:1299\n1114#3,6:1344\n1114#3,6:1425\n1114#3,6:1432\n1114#3,6:1477\n1114#3,6:1484\n1114#3,6:1617\n76#4:952\n76#4:953\n76#4:978\n76#4:1014\n76#4:1051\n76#4:1060\n76#4:1096\n76#4:1129\n76#4:1170\n76#4:1226\n76#4:1260\n76#4:1314\n76#4:1358\n76#4:1398\n76#4:1445\n76#4:1497\n76#4:1546\n76#4:1580\n76#4:1627\n74#5,6:971\n80#5:1003\n74#5,6:1007\n80#5:1039\n84#5:1044\n84#5:1049\n74#5,6:1053\n80#5:1085\n75#5,5:1090\n80#5:1121\n84#5:1212\n84#5:1217\n74#5,6:1219\n80#5:1251\n84#5:1297\n74#5,6:1351\n80#5:1383\n84#5:1389\n74#5,6:1539\n80#5:1571\n84#5:1615\n75#6:977\n76#6,11:979\n75#6:1013\n76#6,11:1015\n89#6:1043\n89#6:1048\n75#6:1059\n76#6,11:1061\n75#6:1095\n76#6,11:1097\n75#6:1128\n76#6,11:1130\n75#6:1169\n76#6,11:1171\n89#6:1199\n89#6:1205\n89#6:1211\n89#6:1216\n75#6:1225\n76#6,11:1227\n75#6:1259\n76#6,11:1261\n89#6:1290\n89#6:1296\n75#6:1313\n76#6,11:1315\n75#6:1357\n76#6,11:1359\n89#6:1388\n75#6:1397\n76#6,11:1399\n75#6:1444\n76#6,11:1446\n89#6:1474\n75#6:1496\n76#6,11:1498\n89#6:1526\n89#6:1531\n89#6:1536\n75#6:1545\n76#6,11:1547\n75#6:1579\n76#6,11:1581\n89#6:1609\n89#6:1614\n766#7:1004\n857#7,2:1005\n1855#7:1122\n1855#7:1155\n1856#7:1201\n1856#7:1207\n766#7:1624\n857#7,2:1625\n1#8:1050\n154#9:1052\n154#9:1086\n154#9:1087\n154#9:1088\n154#9:1089\n154#9:1218\n154#9:1252\n154#9:1286\n154#9:1292\n154#9:1305\n154#9:1306\n154#9:1340\n154#9:1350\n154#9:1384\n154#9:1390\n154#9:1538\n154#9:1623\n76#10,5:1123\n81#10:1154\n85#10:1206\n75#10,6:1253\n81#10:1285\n85#10:1291\n75#10,6:1391\n81#10:1423\n85#10:1532\n74#10,7:1572\n81#10:1605\n85#10:1610\n67#11,6:1163\n73#11:1195\n77#11:1200\n67#11,6:1307\n73#11:1339\n67#11,6:1438\n73#11:1470\n77#11:1475\n67#11,6:1490\n73#11:1522\n77#11:1527\n77#11:1537\n76#12:1628\n102#12,2:1629\n76#12:1631\n102#12,2:1632\n*S KotlinDebug\n*F\n+ 1 BodyfatDayFragment.kt\ncom/heytap/health/bodyfat/ui/frg/BodyfatDayFragment\n*L\n205#1:931\n206#1:938\n208#1:945\n225#1:954,3\n248#1:963\n248#1:964\n261#1:990,13\n291#1:1026,13\n291#1:1040,3\n261#1:1045,3\n410#1:1072,13\n439#1:1108,13\n446#1:1141,13\n456#1:1156\n451#1:1182,13\n451#1:1196,3\n446#1:1202,3\n439#1:1208,3\n410#1:1213,3\n502#1:1238,13\n511#1:1272,13\n511#1:1287,3\n502#1:1293,3\n613#1:1298\n632#1:1326,13\n641#1:1341,3\n672#1:1370,13\n672#1:1385,3\n702#1:1410,13\n710#1:1424\n711#1:1431\n707#1:1457,13\n707#1:1471,3\n740#1:1476\n741#1:1483\n737#1:1509,13\n737#1:1523,3\n702#1:1528,3\n632#1:1533,3\n767#1:1558,13\n782#1:1592,13\n782#1:1606,3\n767#1:1611,3\n802#1:1616\n205#1:932,6\n206#1:939,6\n208#1:946,6\n225#1:957,6\n248#1:965,6\n456#1:1157,6\n613#1:1299,6\n641#1:1344,6\n710#1:1425,6\n711#1:1432,6\n740#1:1477,6\n741#1:1484,6\n802#1:1617,6\n212#1:952\n213#1:953\n261#1:978\n291#1:1014\n406#1:1051\n410#1:1060\n439#1:1096\n446#1:1129\n451#1:1170\n502#1:1226\n511#1:1260\n632#1:1314\n672#1:1358\n702#1:1398\n707#1:1445\n737#1:1497\n767#1:1546\n782#1:1580\n898#1:1627\n261#1:971,6\n261#1:1003\n291#1:1007,6\n291#1:1039\n291#1:1044\n261#1:1049\n410#1:1053,6\n410#1:1085\n439#1:1090,5\n439#1:1121\n439#1:1212\n410#1:1217\n502#1:1219,6\n502#1:1251\n502#1:1297\n672#1:1351,6\n672#1:1383\n672#1:1389\n767#1:1539,6\n767#1:1571\n767#1:1615\n261#1:977\n261#1:979,11\n291#1:1013\n291#1:1015,11\n291#1:1043\n261#1:1048\n410#1:1059\n410#1:1061,11\n439#1:1095\n439#1:1097,11\n446#1:1128\n446#1:1130,11\n451#1:1169\n451#1:1171,11\n451#1:1199\n446#1:1205\n439#1:1211\n410#1:1216\n502#1:1225\n502#1:1227,11\n511#1:1259\n511#1:1261,11\n511#1:1290\n502#1:1296\n632#1:1313\n632#1:1315,11\n672#1:1357\n672#1:1359,11\n672#1:1388\n702#1:1397\n702#1:1399,11\n707#1:1444\n707#1:1446,11\n707#1:1474\n737#1:1496\n737#1:1498,11\n737#1:1526\n702#1:1531\n632#1:1536\n767#1:1545\n767#1:1547,11\n782#1:1579\n782#1:1581,11\n782#1:1609\n767#1:1614\n289#1:1004\n289#1:1005,2\n445#1:1122\n450#1:1155\n450#1:1201\n445#1:1207\n873#1:1624\n873#1:1625,2\n413#1:1052\n424#1:1086\n433#1:1087\n442#1:1088\n443#1:1089\n503#1:1218\n513#1:1252\n525#1:1286\n534#1:1292\n631#1:1305\n634#1:1306\n640#1:1340\n676#1:1350\n699#1:1384\n705#1:1390\n768#1:1538\n810#1:1623\n446#1:1123,5\n446#1:1154\n446#1:1206\n511#1:1253,6\n511#1:1285\n511#1:1291\n702#1:1391,6\n702#1:1423\n702#1:1532\n782#1:1572,7\n782#1:1605\n782#1:1610\n451#1:1163,6\n451#1:1195\n451#1:1200\n632#1:1307,6\n632#1:1339\n707#1:1438,6\n707#1:1470\n707#1:1475\n737#1:1490,6\n737#1:1522\n737#1:1527\n632#1:1537\n205#1:1628\n205#1:1629,2\n206#1:1631\n206#1:1632,2\n*E\n"})
public final class BodyfatDayFragment extends BodyfatDetailsFragment {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean isPreview;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final Lazy sharedVm = LazyKt__LazyJVMKt.lazy(new Function0<BodyfatDetailsSharedViewModel>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$sharedVm$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final BodyfatDetailsSharedViewModel invoke() {
            FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            return (BodyfatDetailsSharedViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(BodyfatDetailsSharedViewModel.class);
        }
    });

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final Lazy vm = LazyKt__LazyJVMKt.lazy(new Function0<BodyfatDayViewModel>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$vm$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final BodyfatDayViewModel invoke() {
            return (BodyfatDayViewModel) new ViewModelProvider(this.this$0).get(BodyfatDayViewModel.class);
        }
    });

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final ActivityResultLauncher<Intent> goalProgressLauncher;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 BodyfatDayFragment.kt\ncom/heytap/health/bodyfat/ui/frg/BodyfatDayFragment\n*L\n1#1,328:1\n878#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((WeightGoal) t).getEffectiveDate()), Long.valueOf(((WeightGoal) t2).getEffectiveDate()));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n+ 2 BodyfatDayFragment.kt\ncom/heytap/health/bodyfat/ui/frg/BodyfatDayFragment\n*L\n1#1,328:1\n879#2:329\n*E\n"})
    public static final class c<T> implements Comparator {
        public final /* synthetic */ Comparator i;

        public c(Comparator comparator) {
            this.i = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.i.compare(t, t2);
            return iCompare != 0 ? iCompare : ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((WeightGoal) t).getCreatedAt()), Long.valueOf(((WeightGoal) t2).getCreatedAt()));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroidx/activity/result/ActivityResult;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class d implements ActivityResultCallback<ActivityResult> {
        public d() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(ActivityResult activityResult) {
            BodyfatDetailsSharedViewModel.c0(BodyfatDayFragment.this.Z0(), BodyfatDayFragment.this.Z0().W().getValue(), null, 2, null);
        }
    }

    public BodyfatDayFragment() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new d());
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResul…ifyDataChanged(uid)\n    }");
        this.goalProgressLauncher = activityResultLauncherRegisterForActivityResult;
    }

    public static final Integer t0(MutableState<Integer> mutableState) {
        return mutableState.getValue();
    }

    public static final void u0(MutableState<Integer> mutableState, Integer num) {
        mutableState.setValue(num);
    }

    public static final boolean v0(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void w0(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0291  */
    /* JADX WARN: Code duplicated, block: B:101:0x0295  */
    /* JADX WARN: Code duplicated, block: B:105:0x0305 A[LOOP:0: B:103:0x0302->B:105:0x0305, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x031d  */
    /* JADX WARN: Code duplicated, block: B:113:0x039f  */
    /* JADX WARN: Code duplicated, block: B:116:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:117:0x03af  */
    /* JADX WARN: Code duplicated, block: B:120:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:121:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:124:0x0434  */
    /* JADX WARN: Code duplicated, block: B:126:0x0437  */
    /* JADX WARN: Code duplicated, block: B:127:0x043a  */
    /* JADX WARN: Code duplicated, block: B:128:0x043d  */
    /* JADX WARN: Code duplicated, block: B:131:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:134:0x0504  */
    /* JADX WARN: Code duplicated, block: B:135:0x0508  */
    /* JADX WARN: Code duplicated, block: B:138:0x0556  */
    /* JADX WARN: Code duplicated, block: B:143:0x0582  */
    /* JADX WARN: Code duplicated, block: B:146:0x05df  */
    /* JADX WARN: Code duplicated, block: B:149:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:150:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:153:0x062d  */
    /* JADX WARN: Code duplicated, block: B:154:0x0636  */
    /* JADX WARN: Code duplicated, block: B:156:0x0639  */
    /* JADX WARN: Code duplicated, block: B:157:0x063c  */
    /* JADX WARN: Code duplicated, block: B:160:0x0685 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x0687  */
    /* JADX WARN: Code duplicated, block: B:162:0x0690  */
    /* JADX WARN: Code duplicated, block: B:164:0x0693  */
    /* JADX WARN: Code duplicated, block: B:165:0x0696  */
    /* JADX WARN: Code duplicated, block: B:169:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:174:0x0704  */
    /* JADX WARN: Code duplicated, block: B:177:0x075f  */
    /* JADX WARN: Code duplicated, block: B:180:0x076b  */
    /* JADX WARN: Code duplicated, block: B:181:0x076f  */
    /* JADX WARN: Code duplicated, block: B:184:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:185:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:187:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:188:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:191:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:195:0x0808  */
    /* JADX WARN: Code duplicated, block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00df  */
    /* JADX WARN: Code duplicated, block: B:86:0x0172  */
    /* JADX WARN: Code duplicated, block: B:87:0x017f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0182  */
    /* JADX WARN: Code duplicated, block: B:90:0x018f  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:97:0x0285  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void A0(final List<? extends WeightBodyFat> list, final Long l2, final Long l3, final int i, final int i2, boolean z, boolean z2, boolean z3, Function0<Unit> function0, Function0<Unit> function1, Function0<Unit> function2, Composer composer, final int i3, final int i4, final int i5) {
        Object objM6005constructorimpl;
        float fFloatValue;
        boolean z4;
        int i6;
        Float f;
        float fCoerceIn;
        float fH;
        Float fValueOf;
        Float fValueOf2;
        Object objRememberedValue;
        Float f2;
        final float fFloatValue2;
        final long jColorResource;
        final long jColorResource2;
        long jColorResource3;
        final float fM4104constructorimpl;
        final Function0<Unit> function3;
        final boolean z5;
        final boolean z6;
        Function0<ComposeUiNode> constructor;
        Object[] objArr;
        int i7;
        boolean zChanged;
        Object objRememberedValue2;
        Modifier.Companion companion;
        Float f3;
        Function0<ComposeUiNode> constructor2;
        final Function0<Unit> function4;
        String strE;
        int i8;
        Function0<ComposeUiNode> constructor3;
        RowScopeInstance rowScopeInstance;
        Object objRememberedValue3;
        Composer.Companion companion2;
        boolean zChanged2;
        Object objRememberedValue4;
        Function0<ComposeUiNode> constructor4;
        String strE2;
        String str;
        int i9;
        Object objRememberedValue5;
        boolean zChanged3;
        Object objRememberedValue6;
        Function0<ComposeUiNode> constructor5;
        String strE3;
        String str2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        String strE4;
        String str3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1568394803);
        boolean z7 = (i5 & 32) != 0 ? false : z;
        boolean z8 = (i5 & 64) != 0 ? true : z2;
        boolean z9 = (i5 & 128) != 0 ? false : z3;
        Function0<Unit> function5 = (i5 & 256) != 0 ? new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$WeightProgressCard$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0;
        Function0<Unit> function6 = (i5 & 512) != 0 ? new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$WeightProgressCard$2
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function1;
        Function0<Unit> function7 = (i5 & 1024) != 0 ? new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$WeightProgressCard$3
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1568394803, i3, i4, "com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment.WeightProgressCard (BodyfatDayFragment.kt:551)");
        }
        WeightBodyFat weightBodyFat = (WeightBodyFat) CollectionsKt___CollectionsKt.lastOrNull((List) list);
        if (weightBodyFat != null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                String weight = weightBodyFat.getWeight();
                Intrinsics.checkNotNullExpressionValue(weight, "it.weight");
                objM6005constructorimpl = Result.m6005constructorimpl(Float.valueOf(Float.parseFloat(weight) / 1000.0f));
            } catch (Throwable th) {
                Result.Companion companion4 = Result.INSTANCE;
                objM6005constructorimpl = Result.m6005constructorimpl(ResultKt.createFailure(th));
            }
            Float fValueOf3 = Float.valueOf(0.0f);
            if (Result.m6011isFailureimpl(objM6005constructorimpl)) {
                objM6005constructorimpl = fValueOf3;
            }
            fFloatValue = ((Number) objM6005constructorimpl).floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        Float fValueOf4 = l2 != null ? Float.valueOf(l2.longValue() / 1000.0f) : null;
        Float fValueOf5 = l3 != null ? Float.valueOf(l3.longValue() / 1000.0f) : null;
        boolean z10 = (fValueOf4 == null || fValueOf5 == null) ? false : true;
        if (z10) {
            Intrinsics.checkNotNull(fValueOf5);
            float fFloatValue3 = fValueOf5.floatValue();
            Intrinsics.checkNotNull(fValueOf4);
            if (fFloatValue3 > fValueOf4.floatValue()) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        Float fValueOf6 = (weightBodyFat == null || fValueOf4 == null) ? null : Float.valueOf(z4 ? q12.d(fValueOf4.floatValue(), fFloatValue, i, i2) : q12.d(fFloatValue, fValueOf4.floatValue(), i, i2));
        final Function0<Unit> function8 = function7;
        int i10 = z4 ? R$string.health_body_fat_gained_weight : R$string.health_body_fat_lost_weight;
        if (weightBodyFat != null) {
            i6 = i10;
            if (z4) {
                Intrinsics.checkNotNull(fValueOf5);
                float fFloatValue4 = fValueOf5.floatValue();
                Intrinsics.checkNotNull(fValueOf4);
                float fFloatValue5 = fFloatValue4 - fValueOf4.floatValue();
                if (fFloatValue5 > 0.0f) {
                    f = fValueOf6;
                    z7 = z7;
                    fCoerceIn = RangesKt___RangesKt.coerceIn((fFloatValue - fValueOf4.floatValue()) / fFloatValue5, 0.0f, 1.0f);
                }
            } else {
                z7 = z7;
                f = fValueOf6;
                fCoerceIn = (fValueOf4 == null || fValueOf5 == null || fValueOf4.floatValue() <= fValueOf5.floatValue()) ? 0.0f : RangesKt___RangesKt.coerceIn((fValueOf4.floatValue() - fFloatValue) / (fValueOf4.floatValue() - fValueOf5.floatValue()), 0.0f, 1.0f);
            }
            fH = q12.h(fFloatValue, i);
            if (fValueOf4 != null) {
                fValueOf = Float.valueOf(q12.h(fValueOf4.floatValue(), i));
            } else {
                fValueOf = null;
            }
            if (fValueOf5 != null) {
                fValueOf2 = Float.valueOf(q12.h(fValueOf5.floatValue(), i));
            } else {
                fValueOf2 = null;
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            f2 = fValueOf2;
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(animatableAnimatable$default);
                objRememberedValue = animatableAnimatable$default;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Animatable animatable = (Animatable) objRememberedValue;
            Boolean boolValueOf = Boolean.valueOf(z8);
            Boolean boolValueOf2 = Boolean.valueOf(z9);
            Float fValueOf7 = Float.valueOf(fCoerceIn);
            BodyfatDayFragment$WeightProgressCard$4 bodyfatDayFragment$WeightProgressCard$4 = new BodyfatDayFragment$WeightProgressCard$4(z9, animatable, fCoerceIn, z8, function5, null);
            int i11 = i3 >> 18;
            EffectsKt.LaunchedEffect(boolValueOf, boolValueOf2, fValueOf7, bodyfatDayFragment$WeightProgressCard$4, composerStartRestartGroup, (i11 & 14) | 4096 | (i11 & 112));
            fFloatValue2 = ((Number) animatable.getValue()).floatValue();
            jColorResource = ColorResources_androidKt.colorResource(R$color.health_body_fat_arc_progress, composerStartRestartGroup, 0);
            jColorResource2 = ColorResources_androidKt.colorResource(R$color.health_body_fat_arc_track, composerStartRestartGroup, 0);
            jColorResource3 = ColorResources_androidKt.colorResource(R$color.health_body_fat_black, composerStartRestartGroup, 0);
            fM4104constructorimpl = Dp.m4104constructorimpl(18);
            Modifier.Companion companion5 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m430paddingqDBjuR0$default(companion5, 0.0f, Dp.m4104constructorimpl(46), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion6 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion6.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            function3 = function5;
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            z5 = z9;
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
            z6 = z8;
            constructor = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierFillMaxWidth$default);
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
            Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion7.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl, density, companion7.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion7.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion7.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM469size3ABfNKs = SizeKt.m469size3ABfNKs(boxScopeInstance.align(companion5, companion6.getTopCenter()), Dp.m4104constructorimpl(210));
            objArr = new Object[]{Dp.m4102boximpl(fM4104constructorimpl), Color.m1608boximpl(jColorResource2), Float.valueOf(fFloatValue2), Color.m1608boximpl(jColorResource)};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            zChanged = false;
            for (i7 = 0; i7 < 4; i7++) {
                zChanged |= composerStartRestartGroup.changed(objArr[i7]);
            }
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$WeightProgressCard$5$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p010kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DrawScope Canvas) {
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        float fMo313toPx0680j_4 = Canvas.mo313toPx0680j_4(fM4104constructorimpl);
                        float fM1448getMinDimensionimpl = (Size.m1448getMinDimensionimpl(Canvas.mo2153getSizeNHjbRc()) - fMo313toPx0680j_4) / 2.0f;
                        float f4 = 2;
                        float f5 = fMo313toPx0680j_4 / 2.0f;
                        float fM1449getWidthimpl = (((Size.m1449getWidthimpl(Canvas.mo2153getSizeNHjbRc()) - (fM1448getMinDimensionimpl * f4)) - fMo313toPx0680j_4) / 2.0f) + f5;
                        float f6 = fM1448getMinDimensionimpl * 2.0f;
                        long jSize = androidx.compose.ui.geometry.SizeKt.Size(f6, f6);
                        float f7 = (30.0f * f4) + 180.0f;
                        long j2 = jColorResource2;
                        long jOffset = OffsetKt.Offset(fM1449getWidthimpl, f5);
                        StrokeCap.Companion companion8 = StrokeCap.Companion;
                        DrawScope.m2133drawArcyD3GUKo$default(Canvas, j2, 150.0f, f7, false, jOffset, jSize, 0.0f, new Stroke(fMo313toPx0680j_4, 0.0f, companion8.m1962getRoundKaPHkGw(), 0, null, 26, null), null, 0, HomeResponseData.MODEL_CODE_BRAND, null);
                        float f8 = fFloatValue2;
                        if (f8 > 0.0f) {
                            DrawScope.m2133drawArcyD3GUKo$default(Canvas, jColorResource, 150.0f, f7 * f8, false, OffsetKt.Offset(fM1449getWidthimpl, f5), jSize, 0.0f, new Stroke(fMo313toPx0680j_4, 0.0f, companion8.m1962getRoundKaPHkGw(), 0, null, 26, null), null, 0, HomeResponseData.MODEL_CODE_BRAND, null);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM469size3ABfNKs, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            Alignment.Companion companion8 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion8.getCenterHorizontally();
            companion = Modifier.INSTANCE;
            Modifier modifierM430paddingqDBjuR0$default = PaddingKt.m430paddingqDBjuR0$default(boxScopeInstance.align(companion, companion8.getTopCenter()), 0.0f, Dp.m4104constructorimpl(59), 0.0f, 0.0f, 13, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
            f3 = fValueOf;
            constructor2 = companion9.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default);
            function4 = function6;
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
            Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyColumnMeasurePolicy, companion9.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion9.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion9.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion9.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (weightBodyFat != null) {
                strE = q12.e(fH, i2);
            } else {
                strE = "--";
            }
            FontWeight.Companion companion10 = FontWeight.INSTANCE;
            FontWeight w500 = companion10.getW500();
            long sp = TextUnitKt.getSp(44);
            Intrinsics.checkNotNullExpressionValue(strE, "if (dayLatest != null) {…--\"\n                    }");
            TextKt.m1201Text4IGK_g(strE, (Modifier) null, jColorResource3, sp, (FontStyle) null, w500, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131026);
            if (i != 1) {
                i8 = R$string.health_body_fat_unit_500g;
            } else if (i != 2) {
                i8 = R$string.health_body_fat_unit_kg;
            } else {
                i8 = R$string.health_body_fat_unit_lb;
            }
            TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(i8, composerStartRestartGroup, 0), androidx.compose.foundation.layout.OffsetKt.m415offsetVpY3zN4$default(companion, 0.0f, Dp.m4104constructorimpl(-8), 1, null), jColorResource3, TextUnitKt.getSp(18), (FontStyle) null, companion10.getW500(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199728, 0, 131024);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            float f4 = 30;
            Modifier modifierM430paddingqDBjuR0$default2 = PaddingKt.m430paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m4104constructorimpl(f4), Dp.m4104constructorimpl(176), Dp.m4104constructorimpl(f4), 0.0f, 8, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion8.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor3 = companion9.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1259constructorimpl3 = Updater.m1259constructorimpl(composerStartRestartGroup);
            Updater.m1266setimpl(composerM1259constructorimpl3, measurePolicyRowMeasurePolicy, companion9.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl3, density3, companion9.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl3, layoutDirection3, companion9.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl3, viewConfiguration3, companion9.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf3.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            companion2 = Composer.INSTANCE;
            if (objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue3;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged2 = composerStartRestartGroup.changed(function4);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$WeightProgressCard$5$3$2$1
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
                        function4.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM185clickableO2vRcR0$default = ClickableKt.m185clickableO2vRcR0$default(companion, mutableInteractionSource, null, false, null, null, (Function0) objRememberedValue4, 28, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion8.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor4 = companion9.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1259constructorimpl4 = Updater.m1259constructorimpl(composerStartRestartGroup);
            Updater.m1266setimpl(composerM1259constructorimpl4, measurePolicyRememberBoxMeasurePolicy2, companion9.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl4, density4, companion9.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl4, layoutDirection4, companion9.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl4, viewConfiguration4, companion9.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf4.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            if (f3 != null) {
                strE2 = q12.e(f3.floatValue(), i2);
            } else {
                strE2 = null;
            }
            if (strE2 == null) {
                str = "--";
            } else {
                str = strE2;
            }
            i9 = (i3 >> 3) & 57344;
            int i12 = 262144 | i9;
            z0(str, StringResources_androidKt.stringResource(R$string.health_body_fat_initial_weight, composerStartRestartGroup, 0), jColorResource3, z10, z7, composerStartRestartGroup, i12, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            BoxKt.Box(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(298382246);
            if (z10 != 0) {
                if (f != null) {
                    strE4 = q12.e(f.floatValue(), i2);
                } else {
                    strE4 = null;
                }
                if (strE4 == null) {
                    str3 = "--";
                } else {
                    str3 = strE4;
                }
                z0(str3, StringResources_androidKt.stringResource(i6, composerStartRestartGroup, 0), jColorResource3, true, z7, composerStartRestartGroup, i9 | 265216, 0);
                BoxKt.Box(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion2.getEmpty()) {
                objRememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue5;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged3 = composerStartRestartGroup.changed(function8);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue6 == companion2.getEmpty()) {
                objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$WeightProgressCard$5$3$6$1
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
                        function8.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM185clickableO2vRcR0$default2 = ClickableKt.m185clickableO2vRcR0$default(companion, mutableInteractionSource2, null, false, null, null, (Function0) objRememberedValue6, 28, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion8.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor5 = companion9.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1259constructorimpl5 = Updater.m1259constructorimpl(composerStartRestartGroup);
            Updater.m1266setimpl(composerM1259constructorimpl5, measurePolicyRememberBoxMeasurePolicy3, companion9.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl5, density5, companion9.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl5, layoutDirection5, companion9.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl5, viewConfiguration5, companion9.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf5.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            if (f2 != null) {
                strE3 = q12.e(f2.floatValue(), i2);
            } else {
                strE3 = null;
            }
            if (strE3 == null) {
                str2 = "--";
            } else {
                str2 = strE3;
            }
            z0(str2, StringResources_androidKt.stringResource(R$string.health_body_fat_target_weight, composerStartRestartGroup, 0), jColorResource3, z10, z7, composerStartRestartGroup, i12, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
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
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final boolean z11 = z7;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$WeightProgressCard$6
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

                public final void invoke(@Nullable Composer composer2, int i13) {
                    this.$tmp0_rcvr.A0(list, l2, l3, i, i2, z11, z6, z5, function3, function4, function8, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                }
            });
        }
        i6 = i10;
        f = fValueOf6;
        fH = q12.h(fFloatValue, i);
        if (fValueOf4 != null) {
            fValueOf = Float.valueOf(q12.h(fValueOf4.floatValue(), i));
        } else {
            fValueOf = null;
        }
        if (fValueOf5 != null) {
            fValueOf2 = Float.valueOf(q12.h(fValueOf5.floatValue(), i));
        } else {
            fValueOf2 = null;
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        objRememberedValue = composerStartRestartGroup.rememberedValue();
        f2 = fValueOf2;
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Animatable animatableAnimatable$default2 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
            composerStartRestartGroup.updateRememberedValue(animatableAnimatable$default2);
            objRememberedValue = animatableAnimatable$default2;
        }
        composerStartRestartGroup.endReplaceableGroup();
        Animatable animatable2 = (Animatable) objRememberedValue;
        Boolean boolValueOf3 = Boolean.valueOf(z8);
        Boolean boolValueOf4 = Boolean.valueOf(z9);
        Float fValueOf8 = Float.valueOf(fCoerceIn);
        BodyfatDayFragment$WeightProgressCard$4 bodyfatDayFragment$WeightProgressCard$5 = new BodyfatDayFragment$WeightProgressCard$4(z9, animatable2, fCoerceIn, z8, function5, null);
        int i13 = i3 >> 18;
        EffectsKt.LaunchedEffect(boolValueOf3, boolValueOf4, fValueOf8, bodyfatDayFragment$WeightProgressCard$5, composerStartRestartGroup, (i13 & 14) | 4096 | (i13 & 112));
        fFloatValue2 = ((Number) animatable2.getValue()).floatValue();
        jColorResource = ColorResources_androidKt.colorResource(R$color.health_body_fat_arc_progress, composerStartRestartGroup, 0);
        jColorResource2 = ColorResources_androidKt.colorResource(R$color.health_body_fat_arc_track, composerStartRestartGroup, 0);
        jColorResource3 = ColorResources_androidKt.colorResource(R$color.health_body_fat_black, composerStartRestartGroup, 0);
        fM4104constructorimpl = Dp.m4104constructorimpl(18);
        Modifier.Companion companion11 = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m430paddingqDBjuR0$default(companion11, 0.0f, Dp.m4104constructorimpl(46), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion12 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion12.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        function3 = function5;
        LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        z5 = z9;
        ViewConfiguration viewConfiguration6 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
        z6 = z8;
        constructor = companion13.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifierFillMaxWidth$default2);
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
        Composer composerM1259constructorimpl6 = Updater.m1259constructorimpl(composerStartRestartGroup);
        Updater.m1266setimpl(composerM1259constructorimpl6, measurePolicyRememberBoxMeasurePolicy4, companion13.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl6, density6, companion13.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl6, layoutDirection6, companion13.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl6, viewConfiguration6, companion13.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf6.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
        Modifier modifierM469size3ABfNKs2 = SizeKt.m469size3ABfNKs(boxScopeInstance3.align(companion11, companion12.getTopCenter()), Dp.m4104constructorimpl(210));
        objArr = new Object[]{Dp.m4102boximpl(fM4104constructorimpl), Color.m1608boximpl(jColorResource2), Float.valueOf(fFloatValue2), Color.m1608boximpl(jColorResource)};
        composerStartRestartGroup.startReplaceableGroup(-568225417);
        zChanged = false;
        while (i7 < 4) {
            zChanged |= composerStartRestartGroup.changed(objArr[i7]);
        }
        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged) {
            objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$WeightProgressCard$5$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DrawScope Canvas) {
                    Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                    float fMo313toPx0680j_4 = Canvas.mo313toPx0680j_4(fM4104constructorimpl);
                    float fM1448getMinDimensionimpl = (Size.m1448getMinDimensionimpl(Canvas.mo2153getSizeNHjbRc()) - fMo313toPx0680j_4) / 2.0f;
                    float f5 = 2;
                    float f6 = fMo313toPx0680j_4 / 2.0f;
                    float fM1449getWidthimpl = (((Size.m1449getWidthimpl(Canvas.mo2153getSizeNHjbRc()) - (fM1448getMinDimensionimpl * f5)) - fMo313toPx0680j_4) / 2.0f) + f6;
                    float f7 = fM1448getMinDimensionimpl * 2.0f;
                    long jSize = androidx.compose.ui.geometry.SizeKt.Size(f7, f7);
                    float f8 = (30.0f * f5) + 180.0f;
                    long j2 = jColorResource2;
                    long jOffset = OffsetKt.Offset(fM1449getWidthimpl, f6);
                    StrokeCap.Companion companion14 = StrokeCap.Companion;
                    DrawScope.m2133drawArcyD3GUKo$default(Canvas, j2, 150.0f, f8, false, jOffset, jSize, 0.0f, new Stroke(fMo313toPx0680j_4, 0.0f, companion14.m1962getRoundKaPHkGw(), 0, null, 26, null), null, 0, HomeResponseData.MODEL_CODE_BRAND, null);
                    float f9 = fFloatValue2;
                    if (f9 > 0.0f) {
                        DrawScope.m2133drawArcyD3GUKo$default(Canvas, jColorResource, 150.0f, f8 * f9, false, OffsetKt.Offset(fM1449getWidthimpl, f6), jSize, 0.0f, new Stroke(fMo313toPx0680j_4, 0.0f, companion14.m1962getRoundKaPHkGw(), 0, null, 26, null), null, 0, HomeResponseData.MODEL_CODE_BRAND, null);
                    }
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        } else {
            objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$WeightProgressCard$5$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DrawScope Canvas) {
                    Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                    float fMo313toPx0680j_4 = Canvas.mo313toPx0680j_4(fM4104constructorimpl);
                    float fM1448getMinDimensionimpl = (Size.m1448getMinDimensionimpl(Canvas.mo2153getSizeNHjbRc()) - fMo313toPx0680j_4) / 2.0f;
                    float f5 = 2;
                    float f6 = fMo313toPx0680j_4 / 2.0f;
                    float fM1449getWidthimpl = (((Size.m1449getWidthimpl(Canvas.mo2153getSizeNHjbRc()) - (fM1448getMinDimensionimpl * f5)) - fMo313toPx0680j_4) / 2.0f) + f6;
                    float f7 = fM1448getMinDimensionimpl * 2.0f;
                    long jSize = androidx.compose.ui.geometry.SizeKt.Size(f7, f7);
                    float f8 = (30.0f * f5) + 180.0f;
                    long j2 = jColorResource2;
                    long jOffset = OffsetKt.Offset(fM1449getWidthimpl, f6);
                    StrokeCap.Companion companion14 = StrokeCap.Companion;
                    DrawScope.m2133drawArcyD3GUKo$default(Canvas, j2, 150.0f, f8, false, jOffset, jSize, 0.0f, new Stroke(fMo313toPx0680j_4, 0.0f, companion14.m1962getRoundKaPHkGw(), 0, null, 26, null), null, 0, HomeResponseData.MODEL_CODE_BRAND, null);
                    float f9 = fFloatValue2;
                    if (f9 > 0.0f) {
                        DrawScope.m2133drawArcyD3GUKo$default(Canvas, jColorResource, 150.0f, f8 * f9, false, OffsetKt.Offset(fM1449getWidthimpl, f6), jSize, 0.0f, new Stroke(fMo313toPx0680j_4, 0.0f, companion14.m1962getRoundKaPHkGw(), 0, null, 26, null), null, 0, HomeResponseData.MODEL_CODE_BRAND, null);
                    }
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        CanvasKt.Canvas(modifierM469size3ABfNKs2, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
        Alignment.Companion companion14 = Alignment.INSTANCE;
        Alignment.Horizontal centerHorizontally2 = companion14.getCenterHorizontally();
        companion = Modifier.INSTANCE;
        Modifier modifierM430paddingqDBjuR0$default3 = PaddingKt.m430paddingqDBjuR0$default(boxScopeInstance3.align(companion, companion14.getTopCenter()), 0.0f, Dp.m4104constructorimpl(59), 0.0f, 0.0f, 13, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement2 = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration7 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
        f3 = fValueOf;
        constructor2 = companion15.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default3);
        function4 = function6;
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
        Composer composerM1259constructorimpl7 = Updater.m1259constructorimpl(composerStartRestartGroup);
        Updater.m1266setimpl(composerM1259constructorimpl7, measurePolicyColumnMeasurePolicy2, companion15.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl7, density7, companion15.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl7, layoutDirection7, companion15.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl7, viewConfiguration7, companion15.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf7.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        if (weightBodyFat != null) {
            strE = q12.e(fH, i2);
        } else {
            strE = "--";
        }
        FontWeight.Companion companion16 = FontWeight.INSTANCE;
        FontWeight w501 = companion16.getW500();
        long sp2 = TextUnitKt.getSp(44);
        Intrinsics.checkNotNullExpressionValue(strE, "if (dayLatest != null) {…--\"\n                    }");
        TextKt.m1201Text4IGK_g(strE, (Modifier) null, jColorResource3, sp2, (FontStyle) null, w501, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131026);
        if (i != 1) {
            i8 = R$string.health_body_fat_unit_500g;
        } else if (i != 2) {
            i8 = R$string.health_body_fat_unit_kg;
        } else {
            i8 = R$string.health_body_fat_unit_lb;
        }
        TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(i8, composerStartRestartGroup, 0), androidx.compose.foundation.layout.OffsetKt.m415offsetVpY3zN4$default(companion, 0.0f, Dp.m4104constructorimpl(-8), 1, null), jColorResource3, TextUnitKt.getSp(18), (FontStyle) null, companion16.getW500(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199728, 0, 131024);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        float f5 = 30;
        Modifier modifierM430paddingqDBjuR0$default4 = PaddingKt.m430paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m4104constructorimpl(f5), Dp.m4104constructorimpl(176), Dp.m4104constructorimpl(f5), 0.0f, 8, null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion14.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density8 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection8 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration8 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        constructor3 = companion15.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf8 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default4);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor3);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM1259constructorimpl8 = Updater.m1259constructorimpl(composerStartRestartGroup);
        Updater.m1266setimpl(composerM1259constructorimpl8, measurePolicyRowMeasurePolicy2, companion15.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl8, density8, companion15.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl8, layoutDirection8, companion15.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl8, viewConfiguration8, companion15.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf8.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        rowScopeInstance = RowScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        companion2 = Composer.INSTANCE;
        if (objRememberedValue3 == companion2.getEmpty()) {
            objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableInteractionSource mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue3;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        zChanged2 = composerStartRestartGroup.changed(function4);
        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (zChanged2) {
            objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$WeightProgressCard$5$3$2$1
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
                    function4.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        } else {
            objRememberedValue4 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$WeightProgressCard$5$3$2$1
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
                    function4.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM185clickableO2vRcR0$default3 = ClickableKt.m185clickableO2vRcR0$default(companion, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue4, 28, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(companion14.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density9 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection9 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration9 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        constructor4 = companion15.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf9 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default3);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor4);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM1259constructorimpl9 = Updater.m1259constructorimpl(composerStartRestartGroup);
        Updater.m1266setimpl(composerM1259constructorimpl9, measurePolicyRememberBoxMeasurePolicy5, companion15.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl9, density9, companion15.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl9, layoutDirection9, companion15.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl9, viewConfiguration9, companion15.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf9.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
        if (f3 != null) {
            strE2 = q12.e(f3.floatValue(), i2);
        } else {
            strE2 = null;
        }
        if (strE2 == null) {
            str = "--";
        } else {
            str = strE2;
        }
        i9 = (i3 >> 3) & 57344;
        int i14 = 262144 | i9;
        z0(str, StringResources_androidKt.stringResource(R$string.health_body_fat_initial_weight, composerStartRestartGroup, 0), jColorResource3, z10, z7, composerStartRestartGroup, i14, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        BoxKt.Box(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(298382246);
        if (z10 != 0) {
            if (f != null) {
                strE4 = q12.e(f.floatValue(), i2);
            } else {
                strE4 = null;
            }
            if (strE4 == null) {
                str3 = "--";
            } else {
                str3 = strE4;
            }
            z0(str3, StringResources_androidKt.stringResource(i6, composerStartRestartGroup, 0), jColorResource3, true, z7, composerStartRestartGroup, i9 | 265216, 0);
            BoxKt.Box(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue5 == companion2.getEmpty()) {
            objRememberedValue5 = InteractionSourceKt.MutableInteractionSource();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableInteractionSource mutableInteractionSource4 = (MutableInteractionSource) objRememberedValue5;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        zChanged3 = composerStartRestartGroup.changed(function8);
        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
        if (zChanged3) {
            objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$WeightProgressCard$5$3$6$1
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
                    function8.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
        } else {
            objRememberedValue6 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$WeightProgressCard$5$3$6$1
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
                    function8.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM185clickableO2vRcR0$default4 = ClickableKt.m185clickableO2vRcR0$default(companion, mutableInteractionSource4, null, false, null, null, (Function0) objRememberedValue6, 28, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(companion14.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density10 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection10 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration10 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        constructor5 = companion15.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf10 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default4);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor5);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM1259constructorimpl10 = Updater.m1259constructorimpl(composerStartRestartGroup);
        Updater.m1266setimpl(composerM1259constructorimpl10, measurePolicyRememberBoxMeasurePolicy6, companion15.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl10, density10, companion15.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl10, layoutDirection10, companion15.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl10, viewConfiguration10, companion15.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf10.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        if (f2 != null) {
            strE3 = q12.e(f2.floatValue(), i2);
        } else {
            strE3 = null;
        }
        if (strE3 == null) {
            str2 = "--";
        } else {
            str2 = strE3;
        }
        z0(str2, StringResources_androidKt.stringResource(R$string.health_body_fat_target_weight, composerStartRestartGroup, 0), jColorResource3, z10, z7, composerStartRestartGroup, i14, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
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
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final boolean z12 = z7;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$WeightProgressCard$6
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

            public final void invoke(@Nullable Composer composer2, int i15) {
                this.$tmp0_rcvr.A0(list, l2, l3, i, i2, z12, z6, z5, function3, function4, function8, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
            }
        });
    }

    public final WeightGoal X0(List<WeightGoal> list, LocalDate localDate) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            WeightGoal weightGoal = (WeightGoal) obj;
            boolean z = false;
            boolean z2 = weightGoal.getEffectiveDate() <= 0 || localDate.compareTo((ChronoLocalDate) h15.D(weightGoal.getEffectiveDate())) >= 0;
            boolean z3 = weightGoal.getActualEndDate() <= 0 || localDate.compareTo((ChronoLocalDate) h15.D(weightGoal.getActualEndDate())) <= 0;
            if (z2 && z3) {
                z = true;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        return (WeightGoal) CollectionsKt___CollectionsKt.maxWithOrNull(arrayList, new c(new b()));
    }

    public final String Y0(double value) {
        long j2 = (long) value;
        return Math.abs(value - ((double) j2)) < 1.0E-6d ? String.valueOf(j2) : String.valueOf(value);
    }

    public final BodyfatDetailsSharedViewModel Z0() {
        return (BodyfatDetailsSharedViewModel) this.sharedVm.getValue();
    }

    public final BodyfatDayViewModel d1() {
        return (BodyfatDayViewModel) this.vm.getValue();
    }

    public final void e1(View view, boolean z) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Composable
    public final String f1(LocalDate localDate, Composer composer, int i) {
        composer.startReplaceableGroup(1399456865);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1399456865, i, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment.toDateWithWeek (BodyfatDayFragment.kt:856)");
        }
        String str = localDate.format(DateTimeFormatter.ofPattern(StringResources_androidKt.stringResource(localDate.getYear() == LocalDate.now().getYear() ? R$string.health_body_fat_page_date_format_month_day_week : R$string.health_body_fat_page_date_format_year_month_day_week, composer, 0), Locale.CHINA));
        Intrinsics.checkNotNullExpressionValue(str, "format(\n            Date…,\n            )\n        )");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return str;
    }

    @Override // com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment, com.heytap.health.base.base.BaseFragment
    public void initData() {
    }

    @Override // com.heytap.health.bodyfat.ui.frg.BodyfatDetailsFragment
    public void n0(@NotNull ComposeView composeView) {
        Intrinsics.checkNotNullParameter(composeView, "<this>");
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-2094327410, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$initComposeView$1

            /* JADX INFO: renamed from: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$initComposeView$1$1, reason: invalid class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$initComposeView$1$1", f = "BodyfatDayFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ MutableState<Pair<String, Long>> $latestLocatedKey$delegate;
                int label;
                final /* synthetic */ BodyfatDayFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BodyfatDayFragment bodyfatDayFragment, MutableState<Pair<String, Long>> mutableState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = bodyfatDayFragment;
                    this.$latestLocatedKey$delegate = mutableState;
                }

                @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$latestLocatedKey$delegate, continuation);
                }

                @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    BodyfatDayFragment$initComposeView$1.invoke$lambda$8(this.$latestLocatedKey$delegate, null);
                    BodyfatDayViewModel bodyfatDayViewModelD1 = this.this$0.d1();
                    LocalDate localDateNow = LocalDate.now();
                    Intrinsics.checkNotNullExpressionValue(localDateNow, "now()");
                    bodyfatDayViewModelD1.y(localDateNow);
                    return Unit.INSTANCE;
                }

                @Override // p010kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$initComposeView$1$2, reason: invalid class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$initComposeView$1$2", f = "BodyfatDayFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nBodyfatDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BodyfatDayFragment.kt\ncom/heytap/health/bodyfat/ui/frg/BodyfatDayFragment$initComposeView$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,930:1\n1#2:931\n*E\n"})
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ MutableState<Pair<String, Long>> $latestLocatedKey$delegate;
                final /* synthetic */ Long $latestRecordMillis;
                final /* synthetic */ State<Pair<String, LocalDate>> $pendingAnchorDate$delegate;
                final /* synthetic */ Pair<Long, Long> $recordMinMax;
                final /* synthetic */ State<String> $userTagId$delegate;
                final /* synthetic */ boolean $waitInitialData;
                int label;
                final /* synthetic */ BodyfatDayFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(boolean z, Pair<Long, Long> pair, BodyfatDayFragment bodyfatDayFragment, Long l2, State<Pair<String, LocalDate>> state, State<String> state2, MutableState<Pair<String, Long>> mutableState, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$waitInitialData = z;
                    this.$recordMinMax = pair;
                    this.this$0 = bodyfatDayFragment;
                    this.$latestRecordMillis = l2;
                    this.$pendingAnchorDate$delegate = state;
                    this.$userTagId$delegate = state2;
                    this.$latestLocatedKey$delegate = mutableState;
                }

                @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new AnonymousClass2(this.$waitInitialData, this.$recordMinMax, this.this$0, this.$latestRecordMillis, this.$pendingAnchorDate$delegate, this.$userTagId$delegate, this.$latestLocatedKey$delegate, continuation);
                }

                @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Pair<String, LocalDate> pairInvoke$lambda$2 = BodyfatDayFragment$initComposeView$1.invoke$lambda$2(this.$pendingAnchorDate$delegate);
                    if (pairInvoke$lambda$2 == null) {
                        return Unit.INSTANCE;
                    }
                    if (!Intrinsics.areEqual(pairInvoke$lambda$2.getFirst(), BodyfatDayFragment$initComposeView$1.invoke$lambda$1(this.$userTagId$delegate)) || this.$waitInitialData) {
                        return Unit.INSTANCE;
                    }
                    LocalDate localDateD = h15.D(this.$recordMinMax.getFirst().longValue());
                    LocalDate localDateNow = LocalDate.now();
                    if (!this.this$0.Z0().getAllWeightDataLoaded()) {
                        LocalDate second = pairInvoke$lambda$2.getSecond();
                        boolean z = false;
                        if (second.compareTo((Object) localDateD) >= 0 && second.compareTo((Object) localDateNow) <= 0) {
                            z = true;
                        }
                        if (!z) {
                            return Unit.INSTANCE;
                        }
                    }
                    this.this$0.d1().y((LocalDate) RangesKt___RangesKt.coerceIn(pairInvoke$lambda$2.getSecond(), localDateD, localDateNow));
                    Long l2 = this.$latestRecordMillis;
                    if (l2 != null) {
                        State<String> state = this.$userTagId$delegate;
                        BodyfatDayFragment$initComposeView$1.invoke$lambda$8(this.$latestLocatedKey$delegate, TuplesKt.to(BodyfatDayFragment$initComposeView$1.invoke$lambda$1(state), Boxing.boxLong(l2.longValue())));
                    }
                    this.this$0.Z0().H(pairInvoke$lambda$2);
                    return Unit.INSTANCE;
                }

                @Override // p010kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$initComposeView$1$3, reason: invalid class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$initComposeView$1$3", f = "BodyfatDayFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ MutableState<Pair<String, Long>> $latestLocatedKey$delegate;
                final /* synthetic */ LocalDate $latestRecordDate;
                final /* synthetic */ Long $latestRecordMillis;
                final /* synthetic */ State<Pair<String, LocalDate>> $pendingAnchorDate$delegate;
                final /* synthetic */ State<String> $userTagId$delegate;
                int label;
                final /* synthetic */ BodyfatDayFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(Long l2, LocalDate localDate, BodyfatDayFragment bodyfatDayFragment, State<Pair<String, LocalDate>> state, State<String> state2, MutableState<Pair<String, Long>> mutableState, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.$latestRecordMillis = l2;
                    this.$latestRecordDate = localDate;
                    this.this$0 = bodyfatDayFragment;
                    this.$pendingAnchorDate$delegate = state;
                    this.$userTagId$delegate = state2;
                    this.$latestLocatedKey$delegate = mutableState;
                }

                @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new AnonymousClass3(this.$latestRecordMillis, this.$latestRecordDate, this.this$0, this.$pendingAnchorDate$delegate, this.$userTagId$delegate, this.$latestLocatedKey$delegate, continuation);
                }

                @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Long l2;
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Pair pairInvoke$lambda$2 = BodyfatDayFragment$initComposeView$1.invoke$lambda$2(this.$pendingAnchorDate$delegate);
                    if (!Intrinsics.areEqual(pairInvoke$lambda$2 != null ? (String) pairInvoke$lambda$2.getFirst() : null, BodyfatDayFragment$initComposeView$1.invoke$lambda$1(this.$userTagId$delegate)) && (l2 = this.$latestRecordMillis) != null) {
                        long jLongValue = l2.longValue();
                        LocalDate localDate = this.$latestRecordDate;
                        if (localDate == null) {
                            return Unit.INSTANCE;
                        }
                        Pair pair = TuplesKt.to(BodyfatDayFragment$initComposeView$1.invoke$lambda$1(this.$userTagId$delegate), Boxing.boxLong(jLongValue));
                        if (!Intrinsics.areEqual(BodyfatDayFragment$initComposeView$1.invoke$lambda$7(this.$latestLocatedKey$delegate), pair)) {
                            BodyfatDayFragment$initComposeView$1.invoke$lambda$8(this.$latestLocatedKey$delegate, pair);
                            this.this$0.d1().y(localDate);
                        }
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }

                @Override // p010kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            {
                super(2);
            }

            private static final LocalDate invoke$lambda$0(State<LocalDate> state) {
                return state.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String invoke$lambda$1(State<String> state) {
                return state.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Pair<String, LocalDate> invoke$lambda$2(State<Pair<String, LocalDate>> state) {
                return state.getValue();
            }

            private static final AllWeightData invoke$lambda$3(State<AllWeightData> state) {
                return state.getValue();
            }

            private static final List<WeightGoal> invoke$lambda$5(State<? extends List<WeightGoal>> state) {
                return state.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Pair<String, Long> invoke$lambda$7(MutableState<Pair<String, Long>> mutableState) {
                return mutableState.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invoke$lambda$8(MutableState<Pair<String, Long>> mutableState, Pair<String, Long> pair) {
                mutableState.setValue(pair);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer, int i) {
                Object next;
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2094327410, i, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment.initComposeView.<anonymous> (BodyfatDayFragment.kt:110)");
                }
                State stateObserveAsState = LiveDataAdapterKt.observeAsState(this.this$0.d1().v(), LocalDate.now(), composer, 72);
                State stateObserveAsState2 = LiveDataAdapterKt.observeAsState(this.this$0.Z0().W(), null, composer, 56);
                State stateObserveAsState3 = LiveDataAdapterKt.observeAsState(this.this$0.Z0().S(), null, composer, 56);
                Pair pair = (Pair) LiveDataAdapterKt.observeAsState(this.this$0.Z0().U(), composer, 8).getValue();
                if (pair == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                AllWeightData allWeightDataInvoke$lambda$3 = invoke$lambda$3(LiveDataAdapterKt.observeAsState(this.this$0.Z0().N(), composer, 8));
                List<WeightBodyFat> listB = allWeightDataInvoke$lambda$3 != null ? allWeightDataInvoke$lambda$3.b() : null;
                if (listB == null) {
                    listB = CollectionsKt__CollectionsKt.emptyList();
                }
                List<WeightBodyFat> list = listB;
                Iterator<T> it = list.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        long measurementTime = ((WeightBodyFat) next).getMeasurementTime();
                        do {
                            Object next2 = it.next();
                            long measurementTime2 = ((WeightBodyFat) next2).getMeasurementTime();
                            if (measurementTime < measurementTime2) {
                                next = next2;
                                measurementTime = measurementTime2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                WeightBodyFat weightBodyFat = (WeightBodyFat) next;
                Long lValueOf = weightBodyFat != null ? Long.valueOf(weightBodyFat.getMeasurementTime()) : null;
                LocalDate localDateD = lValueOf != null ? h15.D(lValueOf.longValue()) : null;
                State stateObserveAsState4 = LiveDataAdapterKt.observeAsState(this.this$0.Z0().P(), 0, composer, 56);
                State stateObserveAsState5 = LiveDataAdapterKt.observeAsState(this.this$0.Z0().O(), 1, composer, 56);
                State stateObserveAsState6 = LiveDataAdapterKt.observeAsState(this.this$0.Z0().X(), CollectionsKt__CollectionsKt.emptyList(), composer, 56);
                String strInvoke$lambda$1 = invoke$lambda$1(stateObserveAsState2);
                boolean z = ((strInvoke$lambda$1 == null || strInvoke$lambda$1.length() == 0) || this.this$0.Z0().getAllWeightDataLoaded() || !list.isEmpty()) ? false : true;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                MutableState mutableState = (MutableState) objRememberedValue;
                EffectsKt.LaunchedEffect(invoke$lambda$1(stateObserveAsState2), new AnonymousClass1(this.this$0, mutableState, null), composer, 64);
                EffectsKt.LaunchedEffect(new Object[]{invoke$lambda$1(stateObserveAsState2), invoke$lambda$2(stateObserveAsState3), pair, Boolean.valueOf(z)}, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new AnonymousClass2(z, pair, this.this$0, lValueOf, stateObserveAsState3, stateObserveAsState2, mutableState, null), composer, 72);
                EffectsKt.LaunchedEffect(invoke$lambda$1(stateObserveAsState2), lValueOf, invoke$lambda$2(stateObserveAsState3), new AnonymousClass3(lValueOf, localDateD, this.this$0, stateObserveAsState3, stateObserveAsState2, mutableState, null), composer, 4608);
                BodyfatDayFragment bodyfatDayFragment = this.this$0;
                LocalDate anchorDate = invoke$lambda$0(stateObserveAsState);
                Intrinsics.checkNotNullExpressionValue(anchorDate, "anchorDate");
                List<WeightGoal> listInvoke$lambda$5 = invoke$lambda$5(stateObserveAsState6);
                String strInvoke$lambda$2 = invoke$lambda$1(stateObserveAsState2);
                Object value = stateObserveAsState4.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "unit.value");
                int iIntValue = ((Number) value).intValue();
                Object value2 = stateObserveAsState5.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "precision.value");
                bodyfatDayFragment.s0(anchorDate, pair, list, z, listInvoke$lambda$5, strInvoke$lambda$2, iIntValue, ((Number) value2).intValue(), composer, 134251016);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:66:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ed  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void q0(final String str, final String str2, final String str3, final String str4, Composer composer, final int i) {
        int i2;
        long jColor;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1601925339);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changed(str4) ? 2048 : 1024;
        }
        int i4 = i2;
        if ((i4 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1601925339, i4, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment.BodyAssessmentMetricItem (BodyfatDayFragment.kt:481)");
            }
            switch (str4) {
                case "偏高":
                    jColor = ColorKt.Color(4293234501L);
                    break;
                case "年轻":
                case "标准":
                case "理想":
                    jColor = ColorKt.Color(4283153751L);
                    break;
                case "肥胖":
                case "超重":
                case "超高":
                case "较高":
                case "偏大高":
                    jColor = ColorKt.Color(4293234501L);
                    break;
                default:
                    jColor = ColorKt.Color(4293242670L);
                    break;
            }
            long j2 = jColor;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM476widthInVpY3zN4$default = SizeKt.m476widthInVpY3zN4$default(companion, 0.0f, Dp.m4104constructorimpl(80), 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM476widthInVpY3zN4$default);
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
            Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl, density, companion3.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m1201Text4IGK_g(str, (Modifier) null, ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha54, composerStartRestartGroup, 0), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i4 & 14) | 3072, 0, 131058);
            Alignment.Vertical bottom = companion2.getBottom();
            Modifier modifierM430paddingqDBjuR0$default = PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(4), 0.0f, 0.0f, 13, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), bottom, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default);
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
            Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion3.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            long sp = TextUnitKt.getSp(18);
            int i5 = R$color.health_body_fat_black_alpha90;
            TextKt.m1201Text4IGK_g(str2, (Modifier) null, ColorResources_androidKt.colorResource(i5, composerStartRestartGroup, 0), sp, (FontStyle) null, (FontWeight) null, jt3.a(composerStartRestartGroup, 0), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i4 >> 3) & 14) | 3072, 0, 130994);
            composerStartRestartGroup.startReplaceableGroup(-246786727);
            if (str3.length() > 0) {
                float f = 2;
                i3 = 0;
                TextKt.m1201Text4IGK_g(str3, PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(f), 0.0f, 0.0f, Dp.m4104constructorimpl(f), 6, null), ColorResources_androidKt.colorResource(i5, composerStartRestartGroup, 0), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, jt3.a(composerStartRestartGroup, 0), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i4 >> 6) & 14) | 3120, 0, 130992);
            } else {
                i3 = 0;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            TextKt.m1201Text4IGK_g(str4, PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(6), 0.0f, 0.0f, 13, null), j2, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, jt3.a(composerStartRestartGroup, i3), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((i4 >> 9) & 14) | 3120, 0, 130992);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$BodyAssessmentMetricItem$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i6) {
                this.$tmp0_rcvr.q0(str, str2, str3, str4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void r0(final WeightBodyFat weightBodyFat, Composer composer, final int i) {
        List<WeightLabel> weightLabelList;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1312065738);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1312065738, i, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment.BodyAssessmentSection (BodyfatDayFragment.kt:403)");
        }
        if (weightBodyFat != null && (weightLabelList = weightBodyFat.getWeightLabelList()) != null) {
            if (!(!weightLabelList.isEmpty())) {
                weightLabelList = null;
            }
            if (weightLabelList != null) {
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                String bodyStyleText = weightBodyFat.getBodyStyleText();
                if (bodyStyleText == null) {
                    bodyStyleText = "";
                } else {
                    if (!(!StringsKt__StringsJVMKt.isBlank(bodyStyleText))) {
                        bodyStyleText = null;
                    }
                    if (bodyStyleText == null) {
                        bodyStyleText = "";
                    }
                }
                String bodyAdviceText = weightBodyFat.getBodyAdviceText();
                if (bodyAdviceText == null) {
                    bodyAdviceText = "";
                } else {
                    if (!(!StringsKt__StringsJVMKt.isBlank(bodyAdviceText))) {
                        bodyAdviceText = null;
                    }
                    if (bodyAdviceText == null) {
                        bodyAdviceText = "";
                    }
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                float f = 24;
                Modifier modifierM427paddingVpY3zN4 = PaddingKt.m427paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m4104constructorimpl(f), Dp.m4104constructorimpl(f));
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl, density, companion3.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                float f2 = 0.0f;
                TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(R$string.health_body_fat_body_assess, composerStartRestartGroup, 0), (Modifier) null, ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha90, composerStartRestartGroup, 0), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, jt3.a(composerStartRestartGroup, 0), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 130994);
                composerStartRestartGroup.startReplaceableGroup(1864639742);
                if (bodyStyleText.length() > 0) {
                    TextKt.m1201Text4IGK_g(bodyStyleText, PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(10), 0.0f, 0.0f, 13, null), ColorKt.Color(4292556844L), TextUnitKt.getSp(20), (FontStyle) null, (FontWeight) null, jt3.a(composerStartRestartGroup, 0), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3504, 0, 130992);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(1864640073);
                if (bodyAdviceText.length() > 0) {
                    TextKt.m1201Text4IGK_g(bodyAdviceText, PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(4), 0.0f, 0.0f, 13, null), ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha54, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, jt3.a(composerStartRestartGroup, 0), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 0, 130992);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM430paddingqDBjuR0$default = PaddingKt.m430paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m4104constructorimpl(f), 0.0f, 0.0f, 13, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM370spacedBy0680j_4 = arrangement.m370spacedBy0680j_4(Dp.m4104constructorimpl(f));
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                int i2 = 6;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM370spacedBy0680j_4, companion2.getStart(), composerStartRestartGroup, 6);
                int i3 = -1323940314;
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default);
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
                Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion3.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                for (List<WeightLabel> list : CollectionsKt___CollectionsKt.chunked(weightLabelList, 4)) {
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f2, 1, null);
                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composerStartRestartGroup, i2);
                    composerStartRestartGroup.startReplaceableGroup(i3);
                    Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxWidth$default);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1259constructorimpl3 = Updater.m1259constructorimpl(composerStartRestartGroup);
                    Updater.m1266setimpl(composerM1259constructorimpl3, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl3, density3, companion4.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl3, viewConfiguration3, companion4.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf3.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1864640991);
                    for (final WeightLabel weightLabel : list) {
                        Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierM185clickableO2vRcR0$default = ClickableKt.m185clickableO2vRcR0$default(modifierWeight$default, (MutableInteractionSource) objRememberedValue, null, false, null, null, new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$BodyAssessmentSection$1$1$1$1$1$2
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
                                context.startActivity(new Intent(context, (Class<?>) BodyFatEvaluateActivity.class).putExtra("WeightLabel", weightLabel));
                            }
                        }, 28, null);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(i3);
                        Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor4);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM1259constructorimpl4 = Updater.m1259constructorimpl(composerStartRestartGroup);
                        Updater.m1266setimpl(composerM1259constructorimpl4, measurePolicyRememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                        Updater.m1266setimpl(composerM1259constructorimpl4, density4, companion5.getSetDensity());
                        Updater.m1266setimpl(composerM1259constructorimpl4, layoutDirection4, companion5.getSetLayoutDirection());
                        Updater.m1266setimpl(composerM1259constructorimpl4, viewConfiguration4, companion5.getSetViewConfiguration());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf4.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        String label = weightLabel.getLabel();
                        if (label == null) {
                            label = "";
                        }
                        String strY0 = Y0(weightLabel.getLabelValue());
                        String labelUnit = weightLabel.getLabelUnit();
                        if (labelUnit == null) {
                            labelUnit = "";
                        }
                        String labelLevelName = weightLabel.getLabelLevelName();
                        Composer composer2 = composerStartRestartGroup;
                        q0(label, strY0, labelUnit, labelLevelName == null ? "" : labelLevelName, composerStartRestartGroup, 32768);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        context = context;
                        composerStartRestartGroup = composer2;
                        i3 = -1323940314;
                    }
                    Context context2 = context;
                    Composer composer3 = composerStartRestartGroup;
                    composer3.endReplaceableGroup();
                    int size = 4 - list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        BoxKt.Box(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer3, 0);
                    }
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composerStartRestartGroup = composer3;
                    context = context2;
                    f2 = 0.0f;
                    i2 = 6;
                    i3 = -1323940314;
                }
                Composer composer4 = composerStartRestartGroup;
                composer4.endReplaceableGroup();
                composer4.endNode();
                composer4.endReplaceableGroup();
                composer4.endReplaceableGroup();
                composer4.endReplaceableGroup();
                composer4.endNode();
                composer4.endReplaceableGroup();
                composer4.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$BodyAssessmentSection$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p010kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer5, int i5) {
                        this.$tmp2_rcvr.r0(weightBodyFat, composer5, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    }
                });
                return;
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$BodyAssessmentSection$labelList$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                invoke(composer5, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer5, int i5) {
                this.$tmp0_rcvr.r0(weightBodyFat, composer5, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void s0(final LocalDate localDate, final Pair<Long, Long> pair, final List<? extends WeightBodyFat> list, final boolean z, final List<WeightGoal> list2, final String str, final int i, final int i2, Composer composer, final int i3) {
        int i4;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(84032161);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(84032161, i3, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment.DayContent (BodyfatDayFragment.kt:182)");
        }
        ChronoLocalDate chronoLocalDateNow = LocalDate.now();
        final LocalDate localDateD = h15.D(pair.getFirst().longValue());
        final LocalDate localDate2 = (LocalDate) RangesKt___RangesKt.coerceIn(localDate, localDateD, chronoLocalDateNow);
        int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(((int) ChronoUnit.DAYS.between(localDateD, chronoLocalDateNow)) + 1, 1);
        int iCoerceIn = RangesKt___RangesKt.coerceIn((int) ChronoUnit.DAYS.between(localDateD, localDate2), 0, iCoerceAtLeast - 1);
        composerStartRestartGroup.startMovableGroup(1145101082, composerStartRestartGroup.joinKey(composerStartRestartGroup.joinKey(str, localDateD), Integer.valueOf(iCoerceAtLeast)));
        final PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(iCoerceIn, 0.0f, composerStartRestartGroup, 0, 2);
        composerStartRestartGroup.endMovableGroup();
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final MutableState mutableState2 = (MutableState) objRememberedValue2;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new LinkedHashSet();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final Set set = (Set) objRememberedValue3;
        EffectsKt.LaunchedEffect(str, new BodyfatDayFragment$DayContent$1(set, null), composerStartRestartGroup, ((i3 >> 15) & 14) | 64);
        final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
        boolean zIsAfter = localDate2.isAfter(localDateD);
        boolean zIsBefore = localDate2.isBefore(chronoLocalDateNow);
        EffectsKt.LaunchedEffect(localDate, localDate2, new BodyfatDayFragment$DayContent$2(localDate, localDate2, this, null), composerStartRestartGroup, 584);
        Integer numValueOf = Integer.valueOf(iCoerceIn);
        Integer numValueOf2 = Integer.valueOf(iCoerceAtLeast);
        Object[] objArr = {mutableState, pagerStateRememberPagerState, Integer.valueOf(iCoerceIn), mutableState2};
        composerStartRestartGroup.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i5 = 0; i5 < 4; i5++) {
            zChanged |= composerStartRestartGroup.changed(objArr[i5]);
        }
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = new BodyfatDayFragment$DayContent$3$1(pagerStateRememberPagerState, iCoerceIn, mutableState, mutableState2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(numValueOf, numValueOf2, (Function2) objRememberedValue4, composerStartRestartGroup, 512);
        EffectsKt.LaunchedEffect(Integer.valueOf(pagerStateRememberPagerState.getCurrentPage()), localDateD, t0(mutableState), new BodyfatDayFragment$DayContent$4(pagerStateRememberPagerState, iCoerceAtLeast, localDateD, localDate2, this, mutableState, null), composerStartRestartGroup, 4160);
        Integer numValueOf3 = Integer.valueOf(iCoerceAtLeast);
        Object objValueOf = Integer.valueOf(iCoerceAtLeast);
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged2 = composerStartRestartGroup.changed(objValueOf) | composerStartRestartGroup.changed(pagerStateRememberPagerState);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
            i4 = iCoerceAtLeast;
            objRememberedValue5 = new BodyfatDayFragment$DayContent$5$1(pagerStateRememberPagerState, i4, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        } else {
            i4 = iCoerceAtLeast;
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(pagerStateRememberPagerState, numValueOf3, (Function2) objRememberedValue5, composerStartRestartGroup, 512);
        Modifier modifierM163backgroundbw27NRU$default = BackgroundKt.m163backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_card_white_bg, composerStartRestartGroup, 0), null, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM163backgroundbw27NRU$default);
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
        Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl, density, companion2.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        f0(f1(localDate2, composerStartRestartGroup, 72), new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$DayContent$6$1
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
                BodyfatDayFragment.w0(mutableState2, true);
                this.this$0.d1().x();
            }
        }, new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$DayContent$6$2
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
                BodyfatDayFragment.w0(mutableState2, true);
                this.this$0.d1().w();
            }
        }, zIsAfter, zIsBefore, new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$DayContent$6$3
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
                BodyfatDayFragment bodyfatDayFragment = this.this$0;
                Context context2 = context;
                LocalDate localDate3 = localDate2;
                String str2 = str;
                Long first = pair.getFirst();
                final BodyfatDayFragment bodyfatDayFragment2 = this.this$0;
                bodyfatDayFragment.p0(context2, localDate3, str2, first, new Function1<LocalDate, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$DayContent$6$3.1
                    {
                        super(1);
                    }

                    @Override // p010kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LocalDate localDate4) {
                        invoke2(localDate4);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull LocalDate selectedDate) {
                        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
                        bodyfatDayFragment2.d1().y(selectedDate);
                    }
                });
            }
        }, composerStartRestartGroup, 2097152, 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(h15.D(((WeightBodyFat) obj).getMeasurementTime()), localDate2)) {
                arrayList.add(obj);
            }
        }
        WeightGoal weightGoalX0 = X0(list2, localDate2);
        Modifier.Companion companion3 = Modifier.INSTANCE;
        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierVerticalScroll$default);
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
        Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion4.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion4.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion4.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        final boolean z2 = !list2.isEmpty();
        final WeightGoal weightGoal = (WeightGoal) CollectionsKt___CollectionsKt.firstOrNull((List) list2);
        if (z) {
            composerStartRestartGroup.startReplaceableGroup(-1882141415);
            List<? extends WeightBodyFat> listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            Long lValueOf = weightGoalX0 != null ? Long.valueOf(weightGoalX0.getInitialWeightG()) : null;
            Long lValueOf2 = weightGoalX0 != null ? Long.valueOf(weightGoalX0.getTargetWeightG()) : null;
            int i6 = i3 >> 9;
            A0(listEmptyList, lValueOf, lValueOf2, i, i2, z2, false, false, null, null, null, composerStartRestartGroup, (i6 & 7168) | 6 | (i6 & 57344), 64, 1984);
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startReplaceableGroup(-1882140901);
            composer2 = composerStartRestartGroup;
            PagerKt.m668HorizontalPagerAlbwjTQ(i4, SuspendingPointerInputFilterKt.pointerInput(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Integer.valueOf(i4), new BodyfatDayFragment$DayContent$6$4$1(pagerStateRememberPagerState, this, view, i4, null)), pagerStateRememberPagerState, null, null, 0, 0.0f, null, null, false, false, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1312736912, true, new Function3<Integer, Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$DayContent$6$4$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // p010kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer3, Integer num2) {
                    invoke(num.intValue(), composer3, num2.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(int i7, @Nullable Composer composer3, int i8) {
                    if ((((i8 & 14) == 0 ? (composer3.changed(i7) ? 4 : 2) | i8 : i8) & 91) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1312736912, i8, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment.DayContent.<anonymous>.<anonymous>.<anonymous> (BodyfatDayFragment.kt:340)");
                    }
                    final LocalDate pageDate = localDateD.plusDays(i7);
                    List<WeightBodyFat> list3 = list;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list3) {
                        if (Intrinsics.areEqual(h15.D(((WeightBodyFat) obj2).getMeasurementTime()), pageDate)) {
                            arrayList2.add(obj2);
                        }
                    }
                    BodyfatDayFragment bodyfatDayFragment = this;
                    List<WeightGoal> list4 = list2;
                    Intrinsics.checkNotNullExpressionValue(pageDate, "pageDate");
                    final WeightGoal weightGoalX1 = bodyfatDayFragment.X0(list4, pageDate);
                    Long lValueOf3 = weightGoalX1 != null ? Long.valueOf(weightGoalX1.getInitialWeightG()) : null;
                    final Long lValueOf4 = weightGoalX1 != null ? Long.valueOf(weightGoalX1.getTargetWeightG()) : null;
                    final boolean z3 = (lValueOf3 == null || lValueOf4 == null) ? false : true;
                    final boolean z4 = z2;
                    final List<WeightBodyFat> list5 = list;
                    final Context context2 = context;
                    final BodyfatDayFragment bodyfatDayFragment2 = this;
                    final String str2 = str;
                    final WeightGoal weightGoal2 = weightGoal;
                    final Long l2 = lValueOf3;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$DayContent$6$4$2$onGoalAreaClick$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
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
                            Object obj3;
                            String weight;
                            Long longOrNull;
                            if (!z3 && z4) {
                                a5k.i(context2.getString(R$string.health_body_fat_no_goal_for_day));
                                return;
                            }
                            Iterator<T> it = list5.iterator();
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (it.hasNext()) {
                                    long measurementTime = ((WeightBodyFat) next).getMeasurementTime();
                                    do {
                                        Object next2 = it.next();
                                        long measurementTime2 = ((WeightBodyFat) next2).getMeasurementTime();
                                        if (measurementTime < measurementTime2) {
                                            next = next2;
                                            measurementTime = measurementTime2;
                                        }
                                    } while (it.hasNext());
                                }
                                obj3 = next;
                            } else {
                                obj3 = null;
                            }
                            WeightBodyFat weightBodyFat = (WeightBodyFat) obj3;
                            long jLongValue = (weightBodyFat == null || (weight = weightBodyFat.getWeight()) == null || (longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(weight)) == null) ? 0L : longOrNull.longValue();
                            Intent intent = new Intent(context2, (Class<?>) WeightGoalProgressActivity.class);
                            String str3 = str2;
                            boolean z5 = z3;
                            WeightGoal weightGoal3 = weightGoalX1;
                            WeightGoal weightGoal4 = weightGoal2;
                            BodyfatDayFragment bodyfatDayFragment3 = bodyfatDayFragment2;
                            Long l3 = lValueOf4;
                            Long l4 = l2;
                            intent.putExtra("userTagId", str3);
                            intent.putExtra(WeightGoalProgressActivity.KEY_HAS_GOAL, z5);
                            intent.putExtra("current_weight_g", jLongValue);
                            if (z5 && weightGoal3 != weightGoal4) {
                                intent.putExtra(WeightGoalProgressActivity.KEY_HISTORY_GOAL, weightGoal3);
                            }
                            FamilyMemberInfo value = bodyfatDayFragment3.Z0().Q().getValue();
                            if (value != null) {
                                intent.putExtra("FamilyMemberInfo", value);
                            }
                            if (z5) {
                                Intrinsics.checkNotNull(l3);
                                long jLongValue2 = l3.longValue();
                                Intrinsics.checkNotNull(l4);
                                intent.putExtra(WeightGoalProgressActivity.KEY_IS_PLUS_PLAN, jLongValue2 > l4.longValue());
                            }
                            bodyfatDayFragment2.goalProgressLauncher.launch(intent);
                        }
                    };
                    BodyfatDayFragment bodyfatDayFragment3 = this;
                    int i9 = i;
                    int i10 = i2;
                    boolean z5 = z2;
                    boolean z6 = i7 == pagerStateRememberPagerState.getCurrentPage();
                    boolean zContains = set.contains(pageDate);
                    final Set<LocalDate> set2 = set;
                    Function0<Unit> function1 = new Function0<Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$DayContent$6$4$2.1
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
                            Set<LocalDate> set3 = set2;
                            LocalDate pageDate2 = pageDate;
                            Intrinsics.checkNotNullExpressionValue(pageDate2, "pageDate");
                            set3.add(pageDate2);
                        }
                    };
                    int i11 = i3;
                    bodyfatDayFragment3.A0(arrayList2, lValueOf3, lValueOf4, i9, i10, z5, z6, zContains, function1, function0, function0, composer3, ((i11 >> 9) & 7168) | 8 | ((i11 >> 9) & 57344), 64, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer2, 0, 3072, 8184);
            composer2.endReplaceableGroup();
        }
        x0(composer2, 8);
        r0((WeightBodyFat) CollectionsKt___CollectionsKt.lastOrNull((List) arrayList), composer2, 72);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$DayContent$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i7) {
                this.$tmp1_rcvr.s0(localDate, pair, list, z, list2, str, i, i2, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void x0(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(630219235);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(630219235, i, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment.RecordButton (BodyfatDayFragment.kt:799)");
        }
        if (this.isPreview) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$RecordButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    this.$tmp0_rcvr.x0(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
            return;
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        if (composerStartRestartGroup.rememberedValue() == Composer.INSTANCE.getEmpty()) {
            composerStartRestartGroup.updateRememberedValue(Z0().Y());
        }
        composerStartRestartGroup.endReplaceableGroup();
        rul value = Z0().Y().getValue();
        if (value != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
            if (!u5e.d(contextRequireContext, PadFeature.BIND_SCALE_MEASURE)) {
                value = null;
            }
        } else {
            value = null;
        }
        float f = 32;
        AndroidView_androidKt.AndroidView(new Function1<Context, HealthButton>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$RecordButton$3
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final HealthButton invoke(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                HealthButton healthButton = new HealthButton(context, null, R$attr.couiButtonColorfulLargeStyle);
                healthButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return healthButton;
            }
        }, PaddingKt.m430paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4104constructorimpl(f), Dp.m4104constructorimpl(38), Dp.m4104constructorimpl(f), 0.0f, 8, null), new BodyfatDayFragment$RecordButton$4(value, this), composerStartRestartGroup, 54, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$RecordButton$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i2) {
                this.$tmp2_rcvr.x0(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 4293980658L, heightDp = 720, locale = "zh", showBackground = true, widthDp = 360)
    public final void y0(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1601266496);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1601266496, i, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment.TestUI (BodyfatDayFragment.kt:895)");
        }
        this.isPreview = true;
        e88.d((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        LocalDate localDateD = h15.D(System.currentTimeMillis());
        WeightBodyFat weightBodyFat = new WeightBodyFat();
        weightBodyFat.setWeight("52825");
        weightBodyFat.setMeasurementTime(System.currentTimeMillis());
        Unit unit = Unit.INSTANCE;
        WeightBodyFat weightBodyFat2 = new WeightBodyFat();
        weightBodyFat2.setWeight("64689");
        weightBodyFat2.setMeasurementTime(System.currentTimeMillis());
        List<? extends WeightBodyFat> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new WeightBodyFat[]{new WeightBodyFat(), weightBodyFat, weightBodyFat2});
        s0(localDateD, TuplesKt.to(Long.valueOf(((WeightBodyFat) CollectionsKt___CollectionsKt.first((List) listListOf)).getMeasurementTime()), Long.valueOf(((WeightBodyFat) CollectionsKt___CollectionsKt.last((List) listListOf)).getMeasurementTime())), listListOf, false, CollectionsKt__CollectionsJVMKt.listOf(new WeightGoal(null, null, localDateD.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli(), 79835, 50888, 0L, System.currentTimeMillis(), 0, 0, 0, 0L, 0, 0L, 8099, null)), null, 0, 1, composerStartRestartGroup, 148606472);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$TestUI$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i2) {
                this.$tmp0_rcvr.y0(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:106:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x011f  */
    /* JADX WARN: Code duplicated, block: B:76:0x012b  */
    /* JADX WARN: Code duplicated, block: B:77:0x012f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0178  */
    /* JADX WARN: Code duplicated, block: B:81:0x0181  */
    /* JADX WARN: Code duplicated, block: B:84:0x0188  */
    /* JADX WARN: Code duplicated, block: B:85:0x018b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0195  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:92:0x0230  */
    /* JADX WARN: Code duplicated, block: B:95:0x023c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0240  */
    /* JADX WARN: Code duplicated, block: B:99:0x02bc  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void z0(final String str, final String str2, final long j2, final boolean z, boolean z2, Composer composer, final int i, final int i2) {
        String str3;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3;
        int i7;
        final boolean z4;
        boolean z5;
        Function0<ComposeUiNode> constructor;
        String strStringResource;
        int i8;
        int i9;
        long jM1617copywmQWz5c$default;
        Function0<ComposeUiNode> constructor2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(711889480);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str3 = str;
        } else if ((i & 14) == 0) {
            str3 = str;
            i3 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= ModuleType.TYPE_SYSTEM_SETTING;
            } else if ((i & 896) == 0) {
                if (composerStartRestartGroup.changed(j2)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    z3 = z2;
                    if (composerStartRestartGroup.changed(z3)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((46811 & i3) == 9362 || !composerStartRestartGroup.getSkipping()) {
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(711889480, i3, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment.WeightMetricItem (BodyfatDayFragment.kt:757)");
                    }
                    if (!z || z4) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM455height3ABfNKs = SizeKt.m455height3ABfNKs(companion, Dp.m4104constructorimpl(45));
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM455height3ABfNKs);
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
                    Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl, density, companion3.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1687627930);
                    if (z5) {
                        strStringResource = StringResources_androidKt.stringResource(R$string.health_body_fat_not_set_goal_weight, composerStartRestartGroup, 0);
                    } else {
                        strStringResource = str3;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (z5) {
                        i8 = 16;
                    } else {
                        i8 = 20;
                    }
                    long sp = TextUnitKt.getSp(i8);
                    if (z5) {
                        i9 = 0;
                        jM1617copywmQWz5c$default = Color.m1617copywmQWz5c$default(j2, 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        i9 = 0;
                        jM1617copywmQWz5c$default = j2;
                    }
                    TextKt.m1201Text4IGK_g(strStringResource, (Modifier) null, jM1617copywmQWz5c$default, sp, (FontStyle) null, (FontWeight) null, jt3.a(composerStartRestartGroup, i9), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 130994);
                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
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
                    Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion3.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf(i9));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    TextKt.m1201Text4IGK_g(str2, (Modifier) null, j2, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, jt3.a(composerStartRestartGroup, i9), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i3 >> 3) & 14) | 3072 | (i3 & 896), 0, 130994);
                    if (z5) {
                        ImageKt.Image(PainterResources_androidKt.painterResource(R$drawable.health_body_fat_weight_goal_set, composerStartRestartGroup, i9), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 124);
                    }
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
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    z4 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$WeightMetricItem$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p010kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i10) {
                        this.$tmp0_rcvr.z0(str, str2, j2, z, z4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            z3 = z2;
            if ((46811 & i3) == 9362) {
                if (i6 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(711889480, i3, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment.WeightMetricItem (BodyfatDayFragment.kt:757)");
                }
                if (z) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierM455height3ABfNKs2 = SizeKt.m455height3ABfNKs(companion4, Dp.m4104constructorimpl(45));
                Alignment.Companion companion5 = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally2 = companion5.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                constructor = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierM455height3ABfNKs2);
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
                Updater.m1266setimpl(composerM1259constructorimpl3, measurePolicyColumnMeasurePolicy2, companion6.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl3, density3, companion6.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl3, layoutDirection3, companion6.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl3, viewConfiguration3, companion6.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf3.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1687627930);
                if (z5) {
                    strStringResource = StringResources_androidKt.stringResource(R$string.health_body_fat_not_set_goal_weight, composerStartRestartGroup, 0);
                } else {
                    strStringResource = str3;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (z5) {
                    i8 = 16;
                } else {
                    i8 = 20;
                }
                long sp2 = TextUnitKt.getSp(i8);
                if (z5) {
                    i9 = 0;
                    jM1617copywmQWz5c$default = Color.m1617copywmQWz5c$default(j2, 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    i9 = 0;
                    jM1617copywmQWz5c$default = j2;
                }
                TextKt.m1201Text4IGK_g(strStringResource, (Modifier) null, jM1617copywmQWz5c$default, sp2, (FontStyle) null, (FontWeight) null, jt3.a(composerStartRestartGroup, i9), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 130994);
                Alignment.Vertical centerVertically2 = companion5.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(companion4);
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
                Updater.m1266setimpl(composerM1259constructorimpl4, measurePolicyRowMeasurePolicy2, companion6.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl4, density4, companion6.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl4, layoutDirection4, companion6.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl4, viewConfiguration4, companion6.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf4.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf(i9));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                TextKt.m1201Text4IGK_g(str2, (Modifier) null, j2, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, jt3.a(composerStartRestartGroup, i9), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i3 >> 3) & 14) | 3072 | (i3 & 896), 0, 130994);
                if (z5) {
                    ImageKt.Image(PainterResources_androidKt.painterResource(R$drawable.health_body_fat_weight_goal_set, composerStartRestartGroup, i9), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 124);
                }
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
            } else {
                if (i6 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(711889480, i3, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment.WeightMetricItem (BodyfatDayFragment.kt:757)");
                }
                if (z) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                Modifier.Companion companion7 = Modifier.INSTANCE;
                Modifier modifierM455height3ABfNKs3 = SizeKt.m455height3ABfNKs(companion7, Dp.m4104constructorimpl(45));
                Alignment.Companion companion8 = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally3 = companion8.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Arrangement arrangement3 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), centerHorizontally3, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                constructor = companion9.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierM455height3ABfNKs3);
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
                Updater.m1266setimpl(composerM1259constructorimpl5, measurePolicyColumnMeasurePolicy3, companion9.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl5, density5, companion9.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl5, layoutDirection5, companion9.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl5, viewConfiguration5, companion9.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf5.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1687627930);
                if (z5) {
                    strStringResource = StringResources_androidKt.stringResource(R$string.health_body_fat_not_set_goal_weight, composerStartRestartGroup, 0);
                } else {
                    strStringResource = str3;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (z5) {
                    i8 = 16;
                } else {
                    i8 = 20;
                }
                long sp3 = TextUnitKt.getSp(i8);
                if (z5) {
                    i9 = 0;
                    jM1617copywmQWz5c$default = Color.m1617copywmQWz5c$default(j2, 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    i9 = 0;
                    jM1617copywmQWz5c$default = j2;
                }
                TextKt.m1201Text4IGK_g(strStringResource, (Modifier) null, jM1617copywmQWz5c$default, sp3, (FontStyle) null, (FontWeight) null, jt3.a(composerStartRestartGroup, i9), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 130994);
                Alignment.Vertical centerVertically3 = companion8.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement3.getStart(), centerVertically3, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration6 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion9.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(companion7);
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
                Updater.m1266setimpl(composerM1259constructorimpl6, measurePolicyRowMeasurePolicy3, companion9.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl6, density6, companion9.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl6, layoutDirection6, companion9.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl6, viewConfiguration6, companion9.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf6.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf(i9));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                TextKt.m1201Text4IGK_g(str2, (Modifier) null, j2, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, jt3.a(composerStartRestartGroup, i9), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i3 >> 3) & 14) | 3072 | (i3 & 896), 0, 130994);
                if (z5) {
                    ImageKt.Image(PainterResources_androidKt.painterResource(R$drawable.health_body_fat_weight_goal_set, composerStartRestartGroup, i9), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 124);
                }
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
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$WeightMetricItem$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i10) {
                    this.$tmp0_rcvr.z0(str, str2, j2, z, z4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        if ((i2 & 4) != 0) {
            i3 |= ModuleType.TYPE_SYSTEM_SETTING;
        } else if ((i & 896) == 0) {
            if (composerStartRestartGroup.changed(j2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (composerStartRestartGroup.changed(z)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((57344 & i) == 0) {
                z3 = z2;
                if (composerStartRestartGroup.changed(z3)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((46811 & i3) == 9362) {
                if (i6 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(711889480, i3, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment.WeightMetricItem (BodyfatDayFragment.kt:757)");
                }
                if (z) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                Modifier.Companion companion10 = Modifier.INSTANCE;
                Modifier modifierM455height3ABfNKs4 = SizeKt.m455height3ABfNKs(companion10, Dp.m4104constructorimpl(45));
                Alignment.Companion companion11 = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally4 = companion11.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Arrangement arrangement4 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement4.getTop(), centerHorizontally4, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration7 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                constructor = companion12.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifierM455height3ABfNKs4);
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
                Updater.m1266setimpl(composerM1259constructorimpl7, measurePolicyColumnMeasurePolicy4, companion12.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl7, density7, companion12.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl7, layoutDirection7, companion12.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl7, viewConfiguration7, companion12.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf7.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1687627930);
                if (z5) {
                    strStringResource = StringResources_androidKt.stringResource(R$string.health_body_fat_not_set_goal_weight, composerStartRestartGroup, 0);
                } else {
                    strStringResource = str3;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (z5) {
                    i8 = 16;
                } else {
                    i8 = 20;
                }
                long sp4 = TextUnitKt.getSp(i8);
                if (z5) {
                    i9 = 0;
                    jM1617copywmQWz5c$default = Color.m1617copywmQWz5c$default(j2, 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    i9 = 0;
                    jM1617copywmQWz5c$default = j2;
                }
                TextKt.m1201Text4IGK_g(strStringResource, (Modifier) null, jM1617copywmQWz5c$default, sp4, (FontStyle) null, (FontWeight) null, jt3.a(composerStartRestartGroup, i9), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 130994);
                Alignment.Vertical centerVertically4 = companion11.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement4.getStart(), centerVertically4, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density8 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection8 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration8 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion12.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf8 = LayoutKt.materializerOf(companion10);
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
                Updater.m1266setimpl(composerM1259constructorimpl8, measurePolicyRowMeasurePolicy4, companion12.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl8, density8, companion12.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl8, layoutDirection8, companion12.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl8, viewConfiguration8, companion12.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf8.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf(i9));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                TextKt.m1201Text4IGK_g(str2, (Modifier) null, j2, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, jt3.a(composerStartRestartGroup, i9), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i3 >> 3) & 14) | 3072 | (i3 & 896), 0, 130994);
                if (z5) {
                    ImageKt.Image(PainterResources_androidKt.painterResource(R$drawable.health_body_fat_weight_goal_set, composerStartRestartGroup, i9), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 124);
                }
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
            } else {
                if (i6 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(711889480, i3, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment.WeightMetricItem (BodyfatDayFragment.kt:757)");
                }
                if (z) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                Modifier.Companion companion13 = Modifier.INSTANCE;
                Modifier modifierM455height3ABfNKs5 = SizeKt.m455height3ABfNKs(companion13, Dp.m4104constructorimpl(45));
                Alignment.Companion companion14 = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally5 = companion14.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Arrangement arrangement5 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement5.getTop(), centerHorizontally5, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density9 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection9 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration9 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                constructor = companion15.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf9 = LayoutKt.materializerOf(modifierM455height3ABfNKs5);
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
                Updater.m1266setimpl(composerM1259constructorimpl9, measurePolicyColumnMeasurePolicy5, companion15.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl9, density9, companion15.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl9, layoutDirection9, companion15.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl9, viewConfiguration9, companion15.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf9.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1687627930);
                if (z5) {
                    strStringResource = StringResources_androidKt.stringResource(R$string.health_body_fat_not_set_goal_weight, composerStartRestartGroup, 0);
                } else {
                    strStringResource = str3;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (z5) {
                    i8 = 16;
                } else {
                    i8 = 20;
                }
                long sp5 = TextUnitKt.getSp(i8);
                if (z5) {
                    i9 = 0;
                    jM1617copywmQWz5c$default = Color.m1617copywmQWz5c$default(j2, 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    i9 = 0;
                    jM1617copywmQWz5c$default = j2;
                }
                TextKt.m1201Text4IGK_g(strStringResource, (Modifier) null, jM1617copywmQWz5c$default, sp5, (FontStyle) null, (FontWeight) null, jt3.a(composerStartRestartGroup, i9), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 130994);
                Alignment.Vertical centerVertically5 = companion14.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement5.getStart(), centerVertically5, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density10 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection10 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration10 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion15.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf10 = LayoutKt.materializerOf(companion13);
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
                Updater.m1266setimpl(composerM1259constructorimpl10, measurePolicyRowMeasurePolicy5, companion15.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl10, density10, companion15.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl10, layoutDirection10, companion15.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl10, viewConfiguration10, companion15.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf10.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf(i9));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                TextKt.m1201Text4IGK_g(str2, (Modifier) null, j2, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, jt3.a(composerStartRestartGroup, i9), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i3 >> 3) & 14) | 3072 | (i3 & 896), 0, 130994);
                if (z5) {
                    ImageKt.Image(PainterResources_androidKt.painterResource(R$drawable.health_body_fat_weight_goal_set, composerStartRestartGroup, i9), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 124);
                }
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
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$WeightMetricItem$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i10) {
                    this.$tmp0_rcvr.z0(str, str2, j2, z, z4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 24576;
        z3 = z2;
        if ((46811 & i3) == 9362) {
            if (i6 != 0) {
                z4 = false;
            } else {
                z4 = z3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(711889480, i3, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment.WeightMetricItem (BodyfatDayFragment.kt:757)");
            }
            if (z) {
                z5 = false;
            } else {
                z5 = false;
            }
            Modifier.Companion companion16 = Modifier.INSTANCE;
            Modifier modifierM455height3ABfNKs6 = SizeKt.m455height3ABfNKs(companion16, Dp.m4104constructorimpl(45));
            Alignment.Companion companion17 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally6 = companion17.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement6 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement6.getTop(), centerHorizontally6, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density11 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection11 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration11 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
            constructor = companion18.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11 = LayoutKt.materializerOf(modifierM455height3ABfNKs6);
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
            Updater.m1266setimpl(composerM1259constructorimpl11, measurePolicyColumnMeasurePolicy6, companion18.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl11, density11, companion18.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl11, layoutDirection11, companion18.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl11, viewConfiguration11, companion18.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf11.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1687627930);
            if (z5) {
                strStringResource = StringResources_androidKt.stringResource(R$string.health_body_fat_not_set_goal_weight, composerStartRestartGroup, 0);
            } else {
                strStringResource = str3;
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (z5) {
                i8 = 16;
            } else {
                i8 = 20;
            }
            long sp6 = TextUnitKt.getSp(i8);
            if (z5) {
                i9 = 0;
                jM1617copywmQWz5c$default = Color.m1617copywmQWz5c$default(j2, 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                i9 = 0;
                jM1617copywmQWz5c$default = j2;
            }
            TextKt.m1201Text4IGK_g(strStringResource, (Modifier) null, jM1617copywmQWz5c$default, sp6, (FontStyle) null, (FontWeight) null, jt3.a(composerStartRestartGroup, i9), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 130994);
            Alignment.Vertical centerVertically6 = companion17.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement6.getStart(), centerVertically6, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density12 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection12 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration12 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion18.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf12 = LayoutKt.materializerOf(companion16);
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
            Updater.m1266setimpl(composerM1259constructorimpl12, measurePolicyRowMeasurePolicy6, companion18.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl12, density12, companion18.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl12, layoutDirection12, companion18.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl12, viewConfiguration12, companion18.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf12.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf(i9));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
            TextKt.m1201Text4IGK_g(str2, (Modifier) null, j2, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, jt3.a(composerStartRestartGroup, i9), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i3 >> 3) & 14) | 3072 | (i3 & 896), 0, 130994);
            if (z5) {
                ImageKt.Image(PainterResources_androidKt.painterResource(R$drawable.health_body_fat_weight_goal_set, composerStartRestartGroup, i9), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 124);
            }
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
        } else {
            if (i6 != 0) {
                z4 = false;
            } else {
                z4 = z3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(711889480, i3, -1, "com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment.WeightMetricItem (BodyfatDayFragment.kt:757)");
            }
            if (z) {
                z5 = false;
            } else {
                z5 = false;
            }
            Modifier.Companion companion19 = Modifier.INSTANCE;
            Modifier modifierM455height3ABfNKs7 = SizeKt.m455height3ABfNKs(companion19, Dp.m4104constructorimpl(45));
            Alignment.Companion companion110 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally7 = companion110.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement7 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(arrangement7.getTop(), centerHorizontally7, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density13 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection13 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration13 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
            constructor = companion111.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf13 = LayoutKt.materializerOf(modifierM455height3ABfNKs7);
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
            Updater.m1266setimpl(composerM1259constructorimpl13, measurePolicyColumnMeasurePolicy7, companion111.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl13, density13, companion111.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl13, layoutDirection13, companion111.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl13, viewConfiguration13, companion111.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf13.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance7 = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1687627930);
            if (z5) {
                strStringResource = StringResources_androidKt.stringResource(R$string.health_body_fat_not_set_goal_weight, composerStartRestartGroup, 0);
            } else {
                strStringResource = str3;
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (z5) {
                i8 = 16;
            } else {
                i8 = 20;
            }
            long sp7 = TextUnitKt.getSp(i8);
            if (z5) {
                i9 = 0;
                jM1617copywmQWz5c$default = Color.m1617copywmQWz5c$default(j2, 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                i9 = 0;
                jM1617copywmQWz5c$default = j2;
            }
            TextKt.m1201Text4IGK_g(strStringResource, (Modifier) null, jM1617copywmQWz5c$default, sp7, (FontStyle) null, (FontWeight) null, jt3.a(composerStartRestartGroup, i9), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 130994);
            Alignment.Vertical centerVertically7 = companion110.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(arrangement7.getStart(), centerVertically7, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density14 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection14 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration14 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion111.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf14 = LayoutKt.materializerOf(companion19);
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
            Updater.m1266setimpl(composerM1259constructorimpl14, measurePolicyRowMeasurePolicy7, companion111.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl14, density14, companion111.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl14, layoutDirection14, companion111.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl14, viewConfiguration14, companion111.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf14.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf(i9));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance7 = RowScopeInstance.INSTANCE;
            TextKt.m1201Text4IGK_g(str2, (Modifier) null, j2, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, jt3.a(composerStartRestartGroup, i9), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i3 >> 3) & 14) | 3072 | (i3 & 896), 0, 130994);
            if (z5) {
                ImageKt.Image(PainterResources_androidKt.painterResource(R$drawable.health_body_fat_weight_goal_set, composerStartRestartGroup, i9), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 124);
            }
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
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.frg.BodyfatDayFragment$WeightMetricItem$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i10) {
                this.$tmp0_rcvr.z0(str, str2, j2, z, z4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }
}