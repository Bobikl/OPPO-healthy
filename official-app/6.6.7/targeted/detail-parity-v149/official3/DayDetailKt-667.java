package com.heytap.health.sunshine.ui.compose;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ClickableKt;
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
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.sunshine.SunshineStat;
import com.heytap.health.base.R$color;
import com.heytap.health.base.R$string;
import com.heytap.health.base.ui.dialog.HealthBottomSheetDialog;
import com.heytap.health.sunshine.R$drawable;
import com.heytap.health.sunshine.R$id;
import com.heytap.health.sunshine.R$layout;
import com.heytap.health.sunshine.ui.compose.DayDetailKt;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sporthealth.blib.compose.modifier.AutoClipContentModifierKt;
import com.oplus.aiunit.vision.SunshineAdviceItem;
import com.oplus.aiunit.vision.c7n;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.swf;
import com.oplus.backup.sdk.common.utils.ModuleType;
import com.oplus.drs.core.net.entity.UploadStateAware;
import com.support.panel.R$style;
import io.protostuff.MapSchema;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.IntIterator;
import p010kotlin.coroutines.Continuation;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.math.MathKt__MathJVMKt;
import p010kotlin.ranges.IntRange;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aR\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0013\b\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00020\u0011¢\u0006\u0002\b\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010 \u001a\u00020\u00022\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0007¢\u0006\u0004\b \u0010!\u001a\u0010\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0002\u001a\u001c\u0010&\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010\u0005H\u0002ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001a\u001d\u0010(\u001a\u00020\u00022\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0007¢\u0006\u0004\b(\u0010)\u001a\u000f\u0010*\u001a\u00020\u0002H\u0003¢\u0006\u0004\b*\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lcom/heytap/databaseengine/model/sunshine/SunshineStat;", "stat", "", "c", "(Lcom/heytap/databaseengine/model/sunshine/SunshineStat;Landroidx/compose/runtime/Composer;I)V", "", "currentMinutes", "targetMinutes", "", "hasData", "f", "(IIZLandroidx/compose/runtime/Composer;II)V", "current", "target", "Landroidx/compose/ui/graphics/Color;", "color", "gradientColor", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "b", "(IIJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "s", "(Lcom/heytap/databaseengine/model/sunshine/SunshineStat;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "modifier", "synthesisPercentage", MapSchema.FIELD_NAME_ENTRY, "(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "", "Lcom/oplus/aiunit/vision/e7j;", "items", c7n.f, "(Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "Landroid/content/Context;", "context", UserInfo.SEX_FEMALE, "uvIndex", "H", "(Ljava/lang/Integer;)J", LogFieldKey.LEVEL_KEY, "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "d", "(Landroidx/compose/runtime/Composer;I)V", "sunshine_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDayDetail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DayDetail.kt\ncom/heytap/health/sunshine/ui/compose/DayDetailKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 12 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,948:1\n154#2:949\n154#2:983\n154#2:984\n154#2:990\n154#2:1133\n164#2:1139\n154#2:1140\n154#2:1141\n154#2:1180\n154#2:1221\n154#2:1255\n154#2:1256\n154#2:1257\n154#2:1258\n154#2:1269\n154#2:1343\n154#2:1410\n164#2:1423\n154#2:1424\n154#2:1458\n154#2:1498\n154#2:1504\n154#2:1505\n154#2:1581\n154#2:1634\n164#2:1635\n154#2:1636\n154#2:1637\n74#3,6:950\n80#3:982\n84#3:989\n78#3,2:1025\n80#3:1053\n84#3:1058\n74#3,6:1064\n80#3:1096\n84#3:1146\n74#3,6:1147\n80#3:1179\n84#3:1319\n74#3,6:1344\n80#3:1376\n74#3,6:1425\n80#3:1457\n84#3:1463\n74#3,6:1464\n80#3:1496\n84#3:1503\n84#3:1548\n75#4:956\n76#4,11:958\n89#4:988\n75#4:996\n76#4,11:998\n75#4:1027\n76#4,11:1029\n89#4:1057\n89#4:1062\n75#4:1070\n76#4,11:1072\n75#4:1106\n76#4,11:1108\n89#4:1137\n89#4:1145\n75#4:1153\n76#4,11:1155\n75#4:1187\n76#4,11:1189\n75#4:1228\n76#4,11:1230\n89#4:1262\n89#4:1267\n75#4:1276\n76#4,11:1278\n89#4:1313\n89#4:1318\n75#4:1350\n76#4,11:1352\n75#4:1383\n76#4,11:1385\n89#4:1421\n75#4:1431\n76#4,11:1433\n89#4:1462\n75#4:1470\n76#4,11:1472\n89#4:1502\n75#4:1512\n76#4,11:1514\n89#4:1542\n89#4:1547\n75#4:1595\n76#4,11:1597\n75#4:1644\n76#4,11:1646\n89#4:1674\n89#4:1679\n76#5:957\n76#5:997\n76#5:1028\n76#5:1071\n76#5:1107\n76#5:1154\n76#5:1188\n76#5:1229\n76#5:1277\n76#5:1334\n76#5:1351\n76#5:1384\n76#5:1432\n76#5:1471\n76#5:1513\n76#5:1596\n76#5:1622\n76#5:1623\n76#5:1645\n460#6,13:969\n473#6,3:985\n460#6,13:1009\n460#6,13:1040\n473#6,3:1054\n473#6,3:1059\n460#6,13:1083\n25#6:1097\n460#6,13:1119\n473#6,3:1134\n473#6,3:1142\n460#6,13:1166\n460#6,13:1200\n36#6:1214\n460#6,13:1241\n473#6,3:1259\n473#6,3:1264\n460#6,13:1289\n36#6:1303\n473#6,3:1310\n473#6,3:1315\n25#6:1320\n25#6:1327\n50#6:1335\n49#6:1336\n460#6,13:1363\n460#6,13:1396\n25#6:1411\n473#6,3:1418\n460#6,13:1444\n473#6,3:1459\n460#6,13:1483\n473#6,3:1499\n460#6,13:1525\n473#6,3:1539\n473#6,3:1544\n36#6:1549\n36#6:1556\n25#6:1563\n25#6:1570\n36#6:1582\n460#6,13:1608\n67#6,3:1624\n66#6:1627\n460#6,13:1657\n473#6,3:1671\n473#6,3:1676\n68#7,5:991\n73#7:1022\n77#7:1063\n67#7,6:1181\n73#7:1213\n67#7,6:1222\n73#7:1254\n77#7:1263\n77#7:1268\n67#7,6:1270\n73#7:1302\n77#7:1314\n67#7,6:1506\n73#7:1538\n77#7:1543\n67#7,6:1589\n73#7:1621\n67#7,6:1638\n73#7:1670\n77#7:1675\n77#7:1680\n37#8,2:1023\n1114#9,6:1098\n1114#9,6:1215\n1114#9,6:1304\n1114#9,6:1321\n1114#9,6:1328\n1114#9,6:1337\n1114#9,6:1412\n1114#9,6:1550\n1114#9,6:1557\n1114#9,6:1564\n1114#9,3:1571\n1117#9,3:1578\n1114#9,6:1583\n1114#9,6:1628\n79#10,2:1104\n81#10:1132\n85#10:1138\n75#10,6:1377\n81#10:1409\n85#10:1422\n1#11:1497\n1549#12:1574\n1620#12,3:1575\n76#13:1681\n102#13,2:1682\n76#13:1684\n102#13,2:1685\n76#13:1687\n102#13,2:1688\n76#13:1690\n102#13,2:1691\n76#13:1693\n102#13,2:1694\n*S KotlinDebug\n*F\n+ 1 DayDetail.kt\ncom/heytap/health/sunshine/ui/compose/DayDetailKt\n*L\n99#1:949\n112#1:983\n117#1:984\n174#1:990\n237#1:1133\n244#1:1139\n245#1:1140\n261#1:1141\n279#1:1180\n309#1:1221\n315#1:1255\n320#1:1256\n329#1:1257\n332#1:1258\n338#1:1269\n430#1:1343\n454#1:1410\n466#1:1423\n467#1:1424\n478#1:1458\n551#1:1498\n565#1:1504\n566#1:1505\n611#1:1581\n893#1:1634\n894#1:1635\n894#1:1636\n895#1:1637\n98#1:950,6\n98#1:982\n98#1:989\n191#1:1025,2\n191#1:1053\n191#1:1058\n206#1:1064,6\n206#1:1096\n206#1:1146\n274#1:1147,6\n274#1:1179\n274#1:1319\n432#1:1344,6\n432#1:1376\n471#1:1425,6\n471#1:1457\n471#1:1463\n487#1:1464,6\n487#1:1496\n487#1:1503\n432#1:1548\n98#1:956\n98#1:958,11\n98#1:988\n173#1:996\n173#1:998,11\n191#1:1027\n191#1:1029,11\n191#1:1057\n173#1:1062\n206#1:1070\n206#1:1072,11\n212#1:1106\n212#1:1108,11\n212#1:1137\n206#1:1145\n274#1:1153\n274#1:1155,11\n278#1:1187\n278#1:1189,11\n308#1:1228\n308#1:1230,11\n308#1:1262\n278#1:1267\n341#1:1276\n341#1:1278,11\n341#1:1313\n274#1:1318\n432#1:1350\n432#1:1352,11\n437#1:1383\n437#1:1385,11\n437#1:1421\n471#1:1431\n471#1:1433,11\n471#1:1462\n487#1:1470\n487#1:1472,11\n487#1:1502\n562#1:1512\n562#1:1514,11\n562#1:1542\n432#1:1547\n608#1:1595\n608#1:1597,11\n861#1:1644\n861#1:1646,11\n861#1:1674\n608#1:1679\n98#1:957\n173#1:997\n191#1:1028\n206#1:1071\n212#1:1107\n274#1:1154\n278#1:1188\n308#1:1229\n341#1:1277\n400#1:1334\n432#1:1351\n437#1:1384\n471#1:1432\n487#1:1471\n562#1:1513\n608#1:1596\n645#1:1622\n859#1:1623\n861#1:1645\n98#1:969,13\n98#1:985,3\n173#1:1009,13\n191#1:1040,13\n191#1:1054,3\n173#1:1059,3\n206#1:1083,13\n215#1:1097\n212#1:1119,13\n212#1:1134,3\n206#1:1142,3\n274#1:1166,13\n278#1:1200,13\n287#1:1214\n308#1:1241,13\n308#1:1259,3\n278#1:1264,3\n341#1:1289,13\n364#1:1303\n341#1:1310,3\n274#1:1315,3\n398#1:1320\n399#1:1327\n402#1:1335\n402#1:1336\n432#1:1363,13\n437#1:1396,13\n457#1:1411\n437#1:1418,3\n471#1:1444,13\n471#1:1459,3\n487#1:1483,13\n487#1:1499,3\n562#1:1525,13\n562#1:1539,3\n432#1:1544,3\n597#1:1549\n598#1:1556\n599#1:1563\n602#1:1570\n612#1:1582\n608#1:1608,13\n863#1:1624,3\n863#1:1627\n861#1:1657,13\n861#1:1671,3\n608#1:1676,3\n173#1:991,5\n173#1:1022\n173#1:1063\n278#1:1181,6\n278#1:1213\n308#1:1222,6\n308#1:1254\n308#1:1263\n278#1:1268\n341#1:1270,6\n341#1:1302\n341#1:1314\n562#1:1506,6\n562#1:1538\n562#1:1543\n608#1:1589,6\n608#1:1621\n861#1:1638,6\n861#1:1670\n861#1:1675\n608#1:1680\n186#1:1023,2\n215#1:1098,6\n287#1:1215,6\n364#1:1304,6\n398#1:1321,6\n399#1:1328,6\n402#1:1337,6\n457#1:1412,6\n597#1:1550,6\n598#1:1557,6\n599#1:1564,6\n602#1:1571,3\n602#1:1578,3\n612#1:1583,6\n863#1:1628,6\n212#1:1104,2\n212#1:1132\n212#1:1138\n437#1:1377,6\n437#1:1409\n437#1:1422\n604#1:1574\n604#1:1575,3\n398#1:1681\n398#1:1682,2\n399#1:1684\n399#1:1685,2\n597#1:1687\n597#1:1688,2\n598#1:1690\n598#1:1691,2\n599#1:1693\n599#1:1694,2\n*E\n"})
public final class DayDetailKt {
    public static final void F(Context context) {
        final HealthBottomSheetDialog healthBottomSheetDialog = new HealthBottomSheetDialog(context, R$style.DefaultBottomSheetDialog);
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.health_sunshine_advice_dialog, (ViewGroup) null);
        viewInflate.findViewById(R$id.btn_close).setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.a25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DayDetailKt.G(healthBottomSheetDialog, view);
            }
        });
        healthBottomSheetDialog.setContentView(viewInflate);
        healthBottomSheetDialog.show();
    }

    public static final void G(HealthBottomSheetDialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public static final long H(Integer num) {
        if (num == null) {
            return ColorKt.Color(4279687754L);
        }
        if (num.intValue() >= 11) {
            return ColorKt.Color(4288423856L);
        }
        if (num.intValue() >= 8) {
            return ColorKt.Color(4294198070L);
        }
        if (num.intValue() >= 6) {
            return ColorKt.Color(4293619200L);
        }
        return num.intValue() >= 3 ? ColorKt.Color(4294954022L) : ColorKt.Color(4279687754L);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x014e  */
    /* JADX WARN: Code duplicated, block: B:85:0x015a  */
    /* JADX WARN: Code duplicated, block: B:86:0x015e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0278  */
    /* JADX WARN: Code duplicated, block: B:92:0x0284  */
    /* JADX WARN: Code duplicated, block: B:93:0x0288  */
    /* JADX WARN: Code duplicated, block: B:96:0x02ee  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void b(int i, int i2, long j2, long j3, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        long j4;
        int i8;
        int i9;
        long j5;
        int i10;
        int i11;
        Function2<? super Composer, ? super Integer, Unit> function3;
        int i12;
        int i13;
        long jColor;
        long jColor2;
        Function2<? super Composer, ? super Integer, Unit> function2B;
        Function0<ComposeUiNode> constructor;
        int i14;
        Function0<ComposeUiNode> constructor2;
        final long j6;
        final Function2<? super Composer, ? super Integer, Unit> function4;
        final int i15;
        final long j7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(626469225);
        int i16 = i4 & 1;
        if (i16 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i17 = i4 & 2;
        if (i17 == 0) {
            if ((i3 & 112) == 0) {
                i6 = i2;
                i5 |= composerStartRestartGroup.changed(i6) ? 32 : 16;
            }
            i7 = i4 & 4;
            if (i7 != 0) {
                if ((i3 & 896) == 0) {
                    j4 = j2;
                    if (composerStartRestartGroup.changed(j4)) {
                        i8 = 256;
                    } else {
                        i8 = 128;
                    }
                    i5 |= i8;
                }
                i9 = i4 & 8;
                if (i9 != 0) {
                    if ((i3 & 7168) == 0) {
                        j5 = j3;
                        if (composerStartRestartGroup.changed(j5)) {
                            i10 = 2048;
                        } else {
                            i10 = 1024;
                        }
                        i5 |= i10;
                    }
                    i11 = i4 & 16;
                    if (i11 != 0) {
                        if ((57344 & i3) == 0) {
                            function3 = function2;
                            if (composerStartRestartGroup.changedInstance(function3)) {
                                i12 = 16384;
                            } else {
                                i12 = 8192;
                            }
                            i5 |= i12;
                        }
                        if ((i5 & 46811) == 9362 || !composerStartRestartGroup.getSkipping()) {
                            if (i16 != 0) {
                                i13 = 20;
                            } else {
                                i13 = i;
                            }
                            if (i17 != 0) {
                                i6 = 30;
                            }
                            if (i7 != 0) {
                                jColor = ColorKt.Color(4279687754L);
                            } else {
                                jColor = j4;
                            }
                            if (i9 != 0) {
                                jColor2 = ColorKt.Color(4286438656L);
                            } else {
                                jColor2 = j5;
                            }
                            if (i11 != 0) {
                                function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                            } else {
                                function2B = function3;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM469size3ABfNKs = SizeKt.m469size3ABfNKs(companion, Dp.m4104constructorimpl(210));
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment center = companion2.getCenter();
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM469size3ABfNKs);
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
                            Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m1266setimpl(composerM1259constructorimpl, density, companion3.getSetDensity());
                            Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                            Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
                            composerStartRestartGroup.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            float f = i13 / i6;
                            long jM1617copywmQWz5c$default = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                            Brush.Companion companion4 = Brush.INSTANCE;
                            i14 = i13;
                            Pair[] pairArr = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                            long j8 = jColor;
                            RoundProgressViewKt.a(f, jColor, jM1617copywmQWz5c$default, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion4, (Pair[]) Arrays.copyOf(pairArr, pairArr.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                            composerStartRestartGroup.startReplaceableGroup(-483455358);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, centerHorizontally, composerStartRestartGroup, 54);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            constructor2 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierFillMaxSize$default);
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
                            Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion3.getSetDensity());
                            Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                            Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                            composerStartRestartGroup.enableReusing();
                            function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                            j6 = j8;
                            function4 = function2B;
                            i15 = i6;
                            j7 = jColor2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            i14 = i;
                            i15 = i6;
                            j6 = j4;
                            j7 = j5;
                            function4 = function3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final int i18 = i14;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$CircleProgress$2
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

                            public final void invoke(@Nullable Composer composer2, int i19) {
                                DayDetailKt.b(i18, i15, j6, j7, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                            }
                        });
                    }
                    i5 |= 24576;
                    function3 = function2;
                    if ((i5 & 46811) == 9362) {
                        if (i16 != 0) {
                            i13 = 20;
                        } else {
                            i13 = i;
                        }
                        if (i17 != 0) {
                            i6 = 30;
                        }
                        if (i7 != 0) {
                            jColor = ColorKt.Color(4279687754L);
                        } else {
                            jColor = j4;
                        }
                        if (i9 != 0) {
                            jColor2 = ColorKt.Color(4286438656L);
                        } else {
                            jColor2 = j5;
                        }
                        if (i11 != 0) {
                            function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                        } else {
                            function2B = function3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                        }
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        Modifier modifierM469size3ABfNKs2 = SizeKt.m469size3ABfNKs(companion5, Dp.m4104constructorimpl(210));
                        Alignment.Companion companion6 = Alignment.INSTANCE;
                        Alignment center2 = companion6.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                        constructor = companion7.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierM469size3ABfNKs2);
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
                        Updater.m1266setimpl(composerM1259constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion7.getSetMeasurePolicy());
                        Updater.m1266setimpl(composerM1259constructorimpl3, density3, companion7.getSetDensity());
                        Updater.m1266setimpl(composerM1259constructorimpl3, layoutDirection3, companion7.getSetLayoutDirection());
                        Updater.m1266setimpl(composerM1259constructorimpl3, viewConfiguration3, companion7.getSetViewConfiguration());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf3.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        float f2 = i13 / i6;
                        long jM1617copywmQWz5c$default2 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                        Brush.Companion companion8 = Brush.INSTANCE;
                        i14 = i13;
                        Pair[] pairArr2 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                        long j9 = jColor;
                        RoundProgressViewKt.a(f2, jColor, jM1617copywmQWz5c$default2, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion8, (Pair[]) Arrays.copyOf(pairArr2, pairArr2.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally2 = companion6.getCenterHorizontally();
                        Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(top2, centerHorizontally2, composerStartRestartGroup, 54);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        constructor2 = companion7.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierFillMaxSize$default2);
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
                        Updater.m1266setimpl(composerM1259constructorimpl4, measurePolicyColumnMeasurePolicy2, companion7.getSetMeasurePolicy());
                        Updater.m1266setimpl(composerM1259constructorimpl4, density4, companion7.getSetDensity());
                        Updater.m1266setimpl(composerM1259constructorimpl4, layoutDirection4, companion7.getSetLayoutDirection());
                        Updater.m1266setimpl(composerM1259constructorimpl4, viewConfiguration4, companion7.getSetViewConfiguration());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf4.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                        j6 = j9;
                        function4 = function2B;
                        i15 = i6;
                        j7 = jColor2;
                    } else {
                        if (i16 != 0) {
                            i13 = 20;
                        } else {
                            i13 = i;
                        }
                        if (i17 != 0) {
                            i6 = 30;
                        }
                        if (i7 != 0) {
                            jColor = ColorKt.Color(4279687754L);
                        } else {
                            jColor = j4;
                        }
                        if (i9 != 0) {
                            jColor2 = ColorKt.Color(4286438656L);
                        } else {
                            jColor2 = j5;
                        }
                        if (i11 != 0) {
                            function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                        } else {
                            function2B = function3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                        }
                        Modifier.Companion companion9 = Modifier.INSTANCE;
                        Modifier modifierM469size3ABfNKs3 = SizeKt.m469size3ABfNKs(companion9, Dp.m4104constructorimpl(210));
                        Alignment.Companion companion10 = Alignment.INSTANCE;
                        Alignment center3 = companion10.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center3, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                        constructor = companion11.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierM469size3ABfNKs3);
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
                        Updater.m1266setimpl(composerM1259constructorimpl5, measurePolicyRememberBoxMeasurePolicy3, companion11.getSetMeasurePolicy());
                        Updater.m1266setimpl(composerM1259constructorimpl5, density5, companion11.getSetDensity());
                        Updater.m1266setimpl(composerM1259constructorimpl5, layoutDirection5, companion11.getSetLayoutDirection());
                        Updater.m1266setimpl(composerM1259constructorimpl5, viewConfiguration5, companion11.getSetViewConfiguration());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf5.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                        float f3 = i13 / i6;
                        long jM1617copywmQWz5c$default3 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                        Brush.Companion companion12 = Brush.INSTANCE;
                        i14 = i13;
                        Pair[] pairArr3 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                        long j10 = jColor;
                        RoundProgressViewKt.a(f3, jColor, jM1617copywmQWz5c$default3, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion12, (Pair[]) Arrays.copyOf(pairArr3, pairArr3.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                        Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(companion9, 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally3 = companion10.getCenterHorizontally();
                        Arrangement.Vertical top3 = Arrangement.INSTANCE.getTop();
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(top3, centerHorizontally3, composerStartRestartGroup, 54);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration6 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        constructor2 = companion11.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifierFillMaxSize$default3);
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
                        Updater.m1266setimpl(composerM1259constructorimpl6, measurePolicyColumnMeasurePolicy3, companion11.getSetMeasurePolicy());
                        Updater.m1266setimpl(composerM1259constructorimpl6, density6, companion11.getSetDensity());
                        Updater.m1266setimpl(composerM1259constructorimpl6, layoutDirection6, companion11.getSetLayoutDirection());
                        Updater.m1266setimpl(composerM1259constructorimpl6, viewConfiguration6, companion11.getSetViewConfiguration());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf6.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                        function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                        j6 = j10;
                        function4 = function2B;
                        i15 = i6;
                        j7 = jColor2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final int i19 = i14;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$CircleProgress$2
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

                        public final void invoke(@Nullable Composer composer2, int i110) {
                            DayDetailKt.b(i19, i15, j6, j7, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                        }
                    });
                }
                i5 |= 3072;
                j5 = j3;
                i11 = i4 & 16;
                if (i11 != 0) {
                    if ((57344 & i3) == 0) {
                        function3 = function2;
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i12 = 16384;
                        } else {
                            i12 = 8192;
                        }
                        i5 |= i12;
                    }
                    if ((i5 & 46811) == 9362) {
                        if (i16 != 0) {
                            i13 = 20;
                        } else {
                            i13 = i;
                        }
                        if (i17 != 0) {
                            i6 = 30;
                        }
                        if (i7 != 0) {
                            jColor = ColorKt.Color(4279687754L);
                        } else {
                            jColor = j4;
                        }
                        if (i9 != 0) {
                            jColor2 = ColorKt.Color(4286438656L);
                        } else {
                            jColor2 = j5;
                        }
                        if (i11 != 0) {
                            function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                        } else {
                            function2B = function3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                        }
                        Modifier.Companion companion13 = Modifier.INSTANCE;
                        Modifier modifierM469size3ABfNKs4 = SizeKt.m469size3ABfNKs(companion13, Dp.m4104constructorimpl(210));
                        Alignment.Companion companion14 = Alignment.INSTANCE;
                        Alignment center4 = companion14.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center4, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration7 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                        constructor = companion15.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifierM469size3ABfNKs4);
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
                        Updater.m1266setimpl(composerM1259constructorimpl7, measurePolicyRememberBoxMeasurePolicy4, companion15.getSetMeasurePolicy());
                        Updater.m1266setimpl(composerM1259constructorimpl7, density7, companion15.getSetDensity());
                        Updater.m1266setimpl(composerM1259constructorimpl7, layoutDirection7, companion15.getSetLayoutDirection());
                        Updater.m1266setimpl(composerM1259constructorimpl7, viewConfiguration7, companion15.getSetViewConfiguration());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf7.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                        float f4 = i13 / i6;
                        long jM1617copywmQWz5c$default4 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                        Brush.Companion companion16 = Brush.INSTANCE;
                        i14 = i13;
                        Pair[] pairArr4 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                        long j11 = jColor;
                        RoundProgressViewKt.a(f4, jColor, jM1617copywmQWz5c$default4, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion16, (Pair[]) Arrays.copyOf(pairArr4, pairArr4.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                        Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(companion13, 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally4 = companion14.getCenterHorizontally();
                        Arrangement.Vertical top4 = Arrangement.INSTANCE.getTop();
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(top4, centerHorizontally4, composerStartRestartGroup, 54);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        Density density8 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection8 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration8 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        constructor2 = companion15.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf8 = LayoutKt.materializerOf(modifierFillMaxSize$default4);
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
                        Updater.m1266setimpl(composerM1259constructorimpl8, measurePolicyColumnMeasurePolicy4, companion15.getSetMeasurePolicy());
                        Updater.m1266setimpl(composerM1259constructorimpl8, density8, companion15.getSetDensity());
                        Updater.m1266setimpl(composerM1259constructorimpl8, layoutDirection8, companion15.getSetLayoutDirection());
                        Updater.m1266setimpl(composerM1259constructorimpl8, viewConfiguration8, companion15.getSetViewConfiguration());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf8.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                        function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                        j6 = j11;
                        function4 = function2B;
                        i15 = i6;
                        j7 = jColor2;
                    } else {
                        if (i16 != 0) {
                            i13 = 20;
                        } else {
                            i13 = i;
                        }
                        if (i17 != 0) {
                            i6 = 30;
                        }
                        if (i7 != 0) {
                            jColor = ColorKt.Color(4279687754L);
                        } else {
                            jColor = j4;
                        }
                        if (i9 != 0) {
                            jColor2 = ColorKt.Color(4286438656L);
                        } else {
                            jColor2 = j5;
                        }
                        if (i11 != 0) {
                            function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                        } else {
                            function2B = function3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                        }
                        Modifier.Companion companion17 = Modifier.INSTANCE;
                        Modifier modifierM469size3ABfNKs5 = SizeKt.m469size3ABfNKs(companion17, Dp.m4104constructorimpl(210));
                        Alignment.Companion companion18 = Alignment.INSTANCE;
                        Alignment center5 = companion18.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(center5, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        Density density9 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection9 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration9 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                        constructor = companion19.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf9 = LayoutKt.materializerOf(modifierM469size3ABfNKs5);
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
                        Updater.m1266setimpl(composerM1259constructorimpl9, measurePolicyRememberBoxMeasurePolicy5, companion19.getSetMeasurePolicy());
                        Updater.m1266setimpl(composerM1259constructorimpl9, density9, companion19.getSetDensity());
                        Updater.m1266setimpl(composerM1259constructorimpl9, layoutDirection9, companion19.getSetLayoutDirection());
                        Updater.m1266setimpl(composerM1259constructorimpl9, viewConfiguration9, companion19.getSetViewConfiguration());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf9.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                        float f5 = i13 / i6;
                        long jM1617copywmQWz5c$default5 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                        Brush.Companion companion110 = Brush.INSTANCE;
                        i14 = i13;
                        Pair[] pairArr5 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                        long j12 = jColor;
                        RoundProgressViewKt.a(f5, jColor, jM1617copywmQWz5c$default5, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion110, (Pair[]) Arrays.copyOf(pairArr5, pairArr5.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                        Modifier modifierFillMaxSize$default5 = SizeKt.fillMaxSize$default(companion17, 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally5 = companion18.getCenterHorizontally();
                        Arrangement.Vertical top5 = Arrangement.INSTANCE.getTop();
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(top5, centerHorizontally5, composerStartRestartGroup, 54);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        Density density10 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection10 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration10 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        constructor2 = companion19.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf10 = LayoutKt.materializerOf(modifierFillMaxSize$default5);
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
                        Updater.m1266setimpl(composerM1259constructorimpl10, measurePolicyColumnMeasurePolicy5, companion19.getSetMeasurePolicy());
                        Updater.m1266setimpl(composerM1259constructorimpl10, density10, companion19.getSetDensity());
                        Updater.m1266setimpl(composerM1259constructorimpl10, layoutDirection10, companion19.getSetLayoutDirection());
                        Updater.m1266setimpl(composerM1259constructorimpl10, viewConfiguration10, companion19.getSetViewConfiguration());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf10.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                        function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                        j6 = j12;
                        function4 = function2B;
                        i15 = i6;
                        j7 = jColor2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final int i110 = i14;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$CircleProgress$2
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

                        public final void invoke(@Nullable Composer composer2, int i111) {
                            DayDetailKt.b(i110, i15, j6, j7, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                        }
                    });
                }
                i5 |= 24576;
                function3 = function2;
                if ((i5 & 46811) == 9362) {
                    if (i16 != 0) {
                        i13 = 20;
                    } else {
                        i13 = i;
                    }
                    if (i17 != 0) {
                        i6 = 30;
                    }
                    if (i7 != 0) {
                        jColor = ColorKt.Color(4279687754L);
                    } else {
                        jColor = j4;
                    }
                    if (i9 != 0) {
                        jColor2 = ColorKt.Color(4286438656L);
                    } else {
                        jColor2 = j5;
                    }
                    if (i11 != 0) {
                        function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                    } else {
                        function2B = function3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                    }
                    Modifier.Companion companion111 = Modifier.INSTANCE;
                    Modifier modifierM469size3ABfNKs6 = SizeKt.m469size3ABfNKs(companion111, Dp.m4104constructorimpl(210));
                    Alignment.Companion companion112 = Alignment.INSTANCE;
                    Alignment center6 = companion112.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(center6, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density11 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection11 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration11 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                    constructor = companion113.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11 = LayoutKt.materializerOf(modifierM469size3ABfNKs6);
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
                    Updater.m1266setimpl(composerM1259constructorimpl11, measurePolicyRememberBoxMeasurePolicy6, companion113.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl11, density11, companion113.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl11, layoutDirection11, companion113.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl11, viewConfiguration11, companion113.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf11.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                    float f6 = i13 / i6;
                    long jM1617copywmQWz5c$default6 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                    Brush.Companion companion114 = Brush.INSTANCE;
                    i14 = i13;
                    Pair[] pairArr6 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                    long j13 = jColor;
                    RoundProgressViewKt.a(f6, jColor, jM1617copywmQWz5c$default6, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion114, (Pair[]) Arrays.copyOf(pairArr6, pairArr6.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                    Modifier modifierFillMaxSize$default6 = SizeKt.fillMaxSize$default(companion111, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally6 = companion112.getCenterHorizontally();
                    Arrangement.Vertical top6 = Arrangement.INSTANCE.getTop();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(top6, centerHorizontally6, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density12 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection12 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration12 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion113.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf12 = LayoutKt.materializerOf(modifierFillMaxSize$default6);
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
                    Updater.m1266setimpl(composerM1259constructorimpl12, measurePolicyColumnMeasurePolicy6, companion113.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl12, density12, companion113.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl12, layoutDirection12, companion113.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl12, viewConfiguration12, companion113.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf12.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
                    function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                    j6 = j13;
                    function4 = function2B;
                    i15 = i6;
                    j7 = jColor2;
                } else {
                    if (i16 != 0) {
                        i13 = 20;
                    } else {
                        i13 = i;
                    }
                    if (i17 != 0) {
                        i6 = 30;
                    }
                    if (i7 != 0) {
                        jColor = ColorKt.Color(4279687754L);
                    } else {
                        jColor = j4;
                    }
                    if (i9 != 0) {
                        jColor2 = ColorKt.Color(4286438656L);
                    } else {
                        jColor2 = j5;
                    }
                    if (i11 != 0) {
                        function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                    } else {
                        function2B = function3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                    }
                    Modifier.Companion companion115 = Modifier.INSTANCE;
                    Modifier modifierM469size3ABfNKs7 = SizeKt.m469size3ABfNKs(companion115, Dp.m4104constructorimpl(210));
                    Alignment.Companion companion116 = Alignment.INSTANCE;
                    Alignment center7 = companion116.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(center7, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density13 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection13 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration13 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                    constructor = companion117.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf13 = LayoutKt.materializerOf(modifierM469size3ABfNKs7);
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
                    Updater.m1266setimpl(composerM1259constructorimpl13, measurePolicyRememberBoxMeasurePolicy7, companion117.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl13, density13, companion117.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl13, layoutDirection13, companion117.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl13, viewConfiguration13, companion117.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf13.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                    float f7 = i13 / i6;
                    long jM1617copywmQWz5c$default7 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                    Brush.Companion companion118 = Brush.INSTANCE;
                    i14 = i13;
                    Pair[] pairArr7 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                    long j14 = jColor;
                    RoundProgressViewKt.a(f7, jColor, jM1617copywmQWz5c$default7, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion118, (Pair[]) Arrays.copyOf(pairArr7, pairArr7.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                    Modifier modifierFillMaxSize$default7 = SizeKt.fillMaxSize$default(companion115, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally7 = companion116.getCenterHorizontally();
                    Arrangement.Vertical top7 = Arrangement.INSTANCE.getTop();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(top7, centerHorizontally7, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density14 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection14 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration14 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion117.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf14 = LayoutKt.materializerOf(modifierFillMaxSize$default7);
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
                    Updater.m1266setimpl(composerM1259constructorimpl14, measurePolicyColumnMeasurePolicy7, companion117.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl14, density14, companion117.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl14, layoutDirection14, companion117.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl14, viewConfiguration14, companion117.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf14.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance7 = ColumnScopeInstance.INSTANCE;
                    function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                    j6 = j14;
                    function4 = function2B;
                    i15 = i6;
                    j7 = jColor2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i111 = i14;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$CircleProgress$2
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

                    public final void invoke(@Nullable Composer composer2, int i112) {
                        DayDetailKt.b(i111, i15, j6, j7, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    }
                });
            }
            i5 |= ModuleType.TYPE_SYSTEM_SETTING;
            j4 = j2;
            i9 = i4 & 8;
            if (i9 != 0) {
                if ((i3 & 7168) == 0) {
                    j5 = j3;
                    if (composerStartRestartGroup.changed(j5)) {
                        i10 = 2048;
                    } else {
                        i10 = 1024;
                    }
                    i5 |= i10;
                }
                i11 = i4 & 16;
                if (i11 != 0) {
                    if ((57344 & i3) == 0) {
                        function3 = function2;
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i12 = 16384;
                        } else {
                            i12 = 8192;
                        }
                        i5 |= i12;
                    }
                    if ((i5 & 46811) == 9362) {
                        if (i16 != 0) {
                            i13 = 20;
                        } else {
                            i13 = i;
                        }
                        if (i17 != 0) {
                            i6 = 30;
                        }
                        if (i7 != 0) {
                            jColor = ColorKt.Color(4279687754L);
                        } else {
                            jColor = j4;
                        }
                        if (i9 != 0) {
                            jColor2 = ColorKt.Color(4286438656L);
                        } else {
                            jColor2 = j5;
                        }
                        if (i11 != 0) {
                            function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                        } else {
                            function2B = function3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                        }
                        Modifier.Companion companion119 = Modifier.INSTANCE;
                        Modifier modifierM469size3ABfNKs8 = SizeKt.m469size3ABfNKs(companion119, Dp.m4104constructorimpl(210));
                        Alignment.Companion companion1110 = Alignment.INSTANCE;
                        Alignment center8 = companion1110.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy8 = BoxKt.rememberBoxMeasurePolicy(center8, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        Density density15 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection15 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration15 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion1111 = ComposeUiNode.INSTANCE;
                        constructor = companion1111.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf15 = LayoutKt.materializerOf(modifierM469size3ABfNKs8);
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
                        Updater.m1266setimpl(composerM1259constructorimpl15, measurePolicyRememberBoxMeasurePolicy8, companion1111.getSetMeasurePolicy());
                        Updater.m1266setimpl(composerM1259constructorimpl15, density15, companion1111.getSetDensity());
                        Updater.m1266setimpl(composerM1259constructorimpl15, layoutDirection15, companion1111.getSetLayoutDirection());
                        Updater.m1266setimpl(composerM1259constructorimpl15, viewConfiguration15, companion1111.getSetViewConfiguration());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf15.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                        float f8 = i13 / i6;
                        long jM1617copywmQWz5c$default8 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                        Brush.Companion companion1112 = Brush.INSTANCE;
                        i14 = i13;
                        Pair[] pairArr8 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                        long j15 = jColor;
                        RoundProgressViewKt.a(f8, jColor, jM1617copywmQWz5c$default8, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion1112, (Pair[]) Arrays.copyOf(pairArr8, pairArr8.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                        Modifier modifierFillMaxSize$default8 = SizeKt.fillMaxSize$default(companion119, 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally8 = companion1110.getCenterHorizontally();
                        Arrangement.Vertical top8 = Arrangement.INSTANCE.getTop();
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyColumnMeasurePolicy8 = ColumnKt.columnMeasurePolicy(top8, centerHorizontally8, composerStartRestartGroup, 54);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        Density density16 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection16 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration16 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        constructor2 = companion1111.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf16 = LayoutKt.materializerOf(modifierFillMaxSize$default8);
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
                        Updater.m1266setimpl(composerM1259constructorimpl16, measurePolicyColumnMeasurePolicy8, companion1111.getSetMeasurePolicy());
                        Updater.m1266setimpl(composerM1259constructorimpl16, density16, companion1111.getSetDensity());
                        Updater.m1266setimpl(composerM1259constructorimpl16, layoutDirection16, companion1111.getSetLayoutDirection());
                        Updater.m1266setimpl(composerM1259constructorimpl16, viewConfiguration16, companion1111.getSetViewConfiguration());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf16.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ColumnScopeInstance columnScopeInstance8 = ColumnScopeInstance.INSTANCE;
                        function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                        j6 = j15;
                        function4 = function2B;
                        i15 = i6;
                        j7 = jColor2;
                    } else {
                        if (i16 != 0) {
                            i13 = 20;
                        } else {
                            i13 = i;
                        }
                        if (i17 != 0) {
                            i6 = 30;
                        }
                        if (i7 != 0) {
                            jColor = ColorKt.Color(4279687754L);
                        } else {
                            jColor = j4;
                        }
                        if (i9 != 0) {
                            jColor2 = ColorKt.Color(4286438656L);
                        } else {
                            jColor2 = j5;
                        }
                        if (i11 != 0) {
                            function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                        } else {
                            function2B = function3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                        }
                        Modifier.Companion companion1113 = Modifier.INSTANCE;
                        Modifier modifierM469size3ABfNKs9 = SizeKt.m469size3ABfNKs(companion1113, Dp.m4104constructorimpl(210));
                        Alignment.Companion companion1114 = Alignment.INSTANCE;
                        Alignment center9 = companion1114.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy9 = BoxKt.rememberBoxMeasurePolicy(center9, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        Density density17 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection17 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration17 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion1115 = ComposeUiNode.INSTANCE;
                        constructor = companion1115.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf17 = LayoutKt.materializerOf(modifierM469size3ABfNKs9);
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
                        Updater.m1266setimpl(composerM1259constructorimpl17, measurePolicyRememberBoxMeasurePolicy9, companion1115.getSetMeasurePolicy());
                        Updater.m1266setimpl(composerM1259constructorimpl17, density17, companion1115.getSetDensity());
                        Updater.m1266setimpl(composerM1259constructorimpl17, layoutDirection17, companion1115.getSetLayoutDirection());
                        Updater.m1266setimpl(composerM1259constructorimpl17, viewConfiguration17, companion1115.getSetViewConfiguration());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf17.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                        float f9 = i13 / i6;
                        long jM1617copywmQWz5c$default9 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                        Brush.Companion companion1116 = Brush.INSTANCE;
                        i14 = i13;
                        Pair[] pairArr9 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                        long j16 = jColor;
                        RoundProgressViewKt.a(f9, jColor, jM1617copywmQWz5c$default9, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion1116, (Pair[]) Arrays.copyOf(pairArr9, pairArr9.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                        Modifier modifierFillMaxSize$default9 = SizeKt.fillMaxSize$default(companion1113, 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally9 = companion1114.getCenterHorizontally();
                        Arrangement.Vertical top9 = Arrangement.INSTANCE.getTop();
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyColumnMeasurePolicy9 = ColumnKt.columnMeasurePolicy(top9, centerHorizontally9, composerStartRestartGroup, 54);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        Density density18 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection18 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration18 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        constructor2 = companion1115.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf18 = LayoutKt.materializerOf(modifierFillMaxSize$default9);
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
                        Updater.m1266setimpl(composerM1259constructorimpl18, measurePolicyColumnMeasurePolicy9, companion1115.getSetMeasurePolicy());
                        Updater.m1266setimpl(composerM1259constructorimpl18, density18, companion1115.getSetDensity());
                        Updater.m1266setimpl(composerM1259constructorimpl18, layoutDirection18, companion1115.getSetLayoutDirection());
                        Updater.m1266setimpl(composerM1259constructorimpl18, viewConfiguration18, companion1115.getSetViewConfiguration());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf18.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ColumnScopeInstance columnScopeInstance9 = ColumnScopeInstance.INSTANCE;
                        function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                        j6 = j16;
                        function4 = function2B;
                        i15 = i6;
                        j7 = jColor2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final int i112 = i14;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$CircleProgress$2
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

                        public final void invoke(@Nullable Composer composer2, int i113) {
                            DayDetailKt.b(i112, i15, j6, j7, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                        }
                    });
                }
                i5 |= 24576;
                function3 = function2;
                if ((i5 & 46811) == 9362) {
                    if (i16 != 0) {
                        i13 = 20;
                    } else {
                        i13 = i;
                    }
                    if (i17 != 0) {
                        i6 = 30;
                    }
                    if (i7 != 0) {
                        jColor = ColorKt.Color(4279687754L);
                    } else {
                        jColor = j4;
                    }
                    if (i9 != 0) {
                        jColor2 = ColorKt.Color(4286438656L);
                    } else {
                        jColor2 = j5;
                    }
                    if (i11 != 0) {
                        function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                    } else {
                        function2B = function3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                    }
                    Modifier.Companion companion1117 = Modifier.INSTANCE;
                    Modifier modifierM469size3ABfNKs10 = SizeKt.m469size3ABfNKs(companion1117, Dp.m4104constructorimpl(210));
                    Alignment.Companion companion1118 = Alignment.INSTANCE;
                    Alignment center10 = companion1118.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy10 = BoxKt.rememberBoxMeasurePolicy(center10, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density19 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection19 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration19 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion1119 = ComposeUiNode.INSTANCE;
                    constructor = companion1119.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf19 = LayoutKt.materializerOf(modifierM469size3ABfNKs10);
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
                    Updater.m1266setimpl(composerM1259constructorimpl19, measurePolicyRememberBoxMeasurePolicy10, companion1119.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl19, density19, companion1119.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl19, layoutDirection19, companion1119.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl19, viewConfiguration19, companion1119.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf19.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                    float f10 = i13 / i6;
                    long jM1617copywmQWz5c$default10 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                    Brush.Companion companion11110 = Brush.INSTANCE;
                    i14 = i13;
                    Pair[] pairArr10 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                    long j17 = jColor;
                    RoundProgressViewKt.a(f10, jColor, jM1617copywmQWz5c$default10, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion11110, (Pair[]) Arrays.copyOf(pairArr10, pairArr10.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                    Modifier modifierFillMaxSize$default10 = SizeKt.fillMaxSize$default(companion1117, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally10 = companion1118.getCenterHorizontally();
                    Arrangement.Vertical top10 = Arrangement.INSTANCE.getTop();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy10 = ColumnKt.columnMeasurePolicy(top10, centerHorizontally10, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration110 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion1119.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf110 = LayoutKt.materializerOf(modifierFillMaxSize$default10);
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
                    Updater.m1266setimpl(composerM1259constructorimpl110, measurePolicyColumnMeasurePolicy10, companion1119.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl110, density110, companion1119.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl110, layoutDirection110, companion1119.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl110, viewConfiguration110, companion1119.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf110.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance10 = ColumnScopeInstance.INSTANCE;
                    function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                    j6 = j17;
                    function4 = function2B;
                    i15 = i6;
                    j7 = jColor2;
                } else {
                    if (i16 != 0) {
                        i13 = 20;
                    } else {
                        i13 = i;
                    }
                    if (i17 != 0) {
                        i6 = 30;
                    }
                    if (i7 != 0) {
                        jColor = ColorKt.Color(4279687754L);
                    } else {
                        jColor = j4;
                    }
                    if (i9 != 0) {
                        jColor2 = ColorKt.Color(4286438656L);
                    } else {
                        jColor2 = j5;
                    }
                    if (i11 != 0) {
                        function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                    } else {
                        function2B = function3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                    }
                    Modifier.Companion companion11111 = Modifier.INSTANCE;
                    Modifier modifierM469size3ABfNKs11 = SizeKt.m469size3ABfNKs(companion11111, Dp.m4104constructorimpl(210));
                    Alignment.Companion companion11112 = Alignment.INSTANCE;
                    Alignment center11 = companion11112.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy11 = BoxKt.rememberBoxMeasurePolicy(center11, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection111 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration111 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion11113 = ComposeUiNode.INSTANCE;
                    constructor = companion11113.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111 = LayoutKt.materializerOf(modifierM469size3ABfNKs11);
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
                    Updater.m1266setimpl(composerM1259constructorimpl111, measurePolicyRememberBoxMeasurePolicy11, companion11113.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl111, density111, companion11113.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl111, layoutDirection111, companion11113.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl111, viewConfiguration111, companion11113.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf111.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                    float f11 = i13 / i6;
                    long jM1617copywmQWz5c$default11 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                    Brush.Companion companion11114 = Brush.INSTANCE;
                    i14 = i13;
                    Pair[] pairArr11 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                    long j18 = jColor;
                    RoundProgressViewKt.a(f11, jColor, jM1617copywmQWz5c$default11, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion11114, (Pair[]) Arrays.copyOf(pairArr11, pairArr11.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                    Modifier modifierFillMaxSize$default11 = SizeKt.fillMaxSize$default(companion11111, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally11 = companion11112.getCenterHorizontally();
                    Arrangement.Vertical top11 = Arrangement.INSTANCE.getTop();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy11 = ColumnKt.columnMeasurePolicy(top11, centerHorizontally11, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection112 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration112 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion11113.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf112 = LayoutKt.materializerOf(modifierFillMaxSize$default11);
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
                    Updater.m1266setimpl(composerM1259constructorimpl112, measurePolicyColumnMeasurePolicy11, companion11113.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl112, density112, companion11113.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl112, layoutDirection112, companion11113.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl112, viewConfiguration112, companion11113.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf112.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance11 = ColumnScopeInstance.INSTANCE;
                    function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                    j6 = j18;
                    function4 = function2B;
                    i15 = i6;
                    j7 = jColor2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i113 = i14;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$CircleProgress$2
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

                    public final void invoke(@Nullable Composer composer2, int i114) {
                        DayDetailKt.b(i113, i15, j6, j7, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    }
                });
            }
            i5 |= 3072;
            j5 = j3;
            i11 = i4 & 16;
            if (i11 != 0) {
                if ((57344 & i3) == 0) {
                    function3 = function2;
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i5 |= i12;
                }
                if ((i5 & 46811) == 9362) {
                    if (i16 != 0) {
                        i13 = 20;
                    } else {
                        i13 = i;
                    }
                    if (i17 != 0) {
                        i6 = 30;
                    }
                    if (i7 != 0) {
                        jColor = ColorKt.Color(4279687754L);
                    } else {
                        jColor = j4;
                    }
                    if (i9 != 0) {
                        jColor2 = ColorKt.Color(4286438656L);
                    } else {
                        jColor2 = j5;
                    }
                    if (i11 != 0) {
                        function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                    } else {
                        function2B = function3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                    }
                    Modifier.Companion companion11115 = Modifier.INSTANCE;
                    Modifier modifierM469size3ABfNKs12 = SizeKt.m469size3ABfNKs(companion11115, Dp.m4104constructorimpl(210));
                    Alignment.Companion companion11116 = Alignment.INSTANCE;
                    Alignment center12 = companion11116.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy12 = BoxKt.rememberBoxMeasurePolicy(center12, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection113 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration113 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion11117 = ComposeUiNode.INSTANCE;
                    constructor = companion11117.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf113 = LayoutKt.materializerOf(modifierM469size3ABfNKs12);
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
                    Updater.m1266setimpl(composerM1259constructorimpl113, measurePolicyRememberBoxMeasurePolicy12, companion11117.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl113, density113, companion11117.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl113, layoutDirection113, companion11117.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl113, viewConfiguration113, companion11117.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf113.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                    float f12 = i13 / i6;
                    long jM1617copywmQWz5c$default12 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                    Brush.Companion companion11118 = Brush.INSTANCE;
                    i14 = i13;
                    Pair[] pairArr12 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                    long j19 = jColor;
                    RoundProgressViewKt.a(f12, jColor, jM1617copywmQWz5c$default12, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion11118, (Pair[]) Arrays.copyOf(pairArr12, pairArr12.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                    Modifier modifierFillMaxSize$default12 = SizeKt.fillMaxSize$default(companion11115, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally12 = companion11116.getCenterHorizontally();
                    Arrangement.Vertical top12 = Arrangement.INSTANCE.getTop();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy12 = ColumnKt.columnMeasurePolicy(top12, centerHorizontally12, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density114 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection114 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration114 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion11117.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf114 = LayoutKt.materializerOf(modifierFillMaxSize$default12);
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
                    Updater.m1266setimpl(composerM1259constructorimpl114, measurePolicyColumnMeasurePolicy12, companion11117.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl114, density114, companion11117.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl114, layoutDirection114, companion11117.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl114, viewConfiguration114, companion11117.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf114.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance12 = ColumnScopeInstance.INSTANCE;
                    function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                    j6 = j19;
                    function4 = function2B;
                    i15 = i6;
                    j7 = jColor2;
                } else {
                    if (i16 != 0) {
                        i13 = 20;
                    } else {
                        i13 = i;
                    }
                    if (i17 != 0) {
                        i6 = 30;
                    }
                    if (i7 != 0) {
                        jColor = ColorKt.Color(4279687754L);
                    } else {
                        jColor = j4;
                    }
                    if (i9 != 0) {
                        jColor2 = ColorKt.Color(4286438656L);
                    } else {
                        jColor2 = j5;
                    }
                    if (i11 != 0) {
                        function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                    } else {
                        function2B = function3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                    }
                    Modifier.Companion companion11119 = Modifier.INSTANCE;
                    Modifier modifierM469size3ABfNKs13 = SizeKt.m469size3ABfNKs(companion11119, Dp.m4104constructorimpl(210));
                    Alignment.Companion companion111110 = Alignment.INSTANCE;
                    Alignment center13 = companion111110.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy13 = BoxKt.rememberBoxMeasurePolicy(center13, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density115 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection115 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration115 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion111111 = ComposeUiNode.INSTANCE;
                    constructor = companion111111.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf115 = LayoutKt.materializerOf(modifierM469size3ABfNKs13);
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
                    Updater.m1266setimpl(composerM1259constructorimpl115, measurePolicyRememberBoxMeasurePolicy13, companion111111.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl115, density115, companion111111.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl115, layoutDirection115, companion111111.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl115, viewConfiguration115, companion111111.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf115.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                    float f13 = i13 / i6;
                    long jM1617copywmQWz5c$default13 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                    Brush.Companion companion111112 = Brush.INSTANCE;
                    i14 = i13;
                    Pair[] pairArr13 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                    long j110 = jColor;
                    RoundProgressViewKt.a(f13, jColor, jM1617copywmQWz5c$default13, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion111112, (Pair[]) Arrays.copyOf(pairArr13, pairArr13.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                    Modifier modifierFillMaxSize$default13 = SizeKt.fillMaxSize$default(companion11119, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally13 = companion111110.getCenterHorizontally();
                    Arrangement.Vertical top13 = Arrangement.INSTANCE.getTop();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy13 = ColumnKt.columnMeasurePolicy(top13, centerHorizontally13, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density116 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection116 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration116 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion111111.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf116 = LayoutKt.materializerOf(modifierFillMaxSize$default13);
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
                    Updater.m1266setimpl(composerM1259constructorimpl116, measurePolicyColumnMeasurePolicy13, companion111111.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl116, density116, companion111111.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl116, layoutDirection116, companion111111.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl116, viewConfiguration116, companion111111.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf116.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance13 = ColumnScopeInstance.INSTANCE;
                    function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                    j6 = j110;
                    function4 = function2B;
                    i15 = i6;
                    j7 = jColor2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i114 = i14;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$CircleProgress$2
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

                    public final void invoke(@Nullable Composer composer2, int i115) {
                        DayDetailKt.b(i114, i15, j6, j7, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    }
                });
            }
            i5 |= 24576;
            function3 = function2;
            if ((i5 & 46811) == 9362) {
                if (i16 != 0) {
                    i13 = 20;
                } else {
                    i13 = i;
                }
                if (i17 != 0) {
                    i6 = 30;
                }
                if (i7 != 0) {
                    jColor = ColorKt.Color(4279687754L);
                } else {
                    jColor = j4;
                }
                if (i9 != 0) {
                    jColor2 = ColorKt.Color(4286438656L);
                } else {
                    jColor2 = j5;
                }
                if (i11 != 0) {
                    function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                } else {
                    function2B = function3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                }
                Modifier.Companion companion111113 = Modifier.INSTANCE;
                Modifier modifierM469size3ABfNKs14 = SizeKt.m469size3ABfNKs(companion111113, Dp.m4104constructorimpl(210));
                Alignment.Companion companion111114 = Alignment.INSTANCE;
                Alignment center14 = companion111114.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy14 = BoxKt.rememberBoxMeasurePolicy(center14, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density117 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection117 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration117 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion111115 = ComposeUiNode.INSTANCE;
                constructor = companion111115.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf117 = LayoutKt.materializerOf(modifierM469size3ABfNKs14);
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
                Updater.m1266setimpl(composerM1259constructorimpl117, measurePolicyRememberBoxMeasurePolicy14, companion111115.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl117, density117, companion111115.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl117, layoutDirection117, companion111115.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl117, viewConfiguration117, companion111115.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf117.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
                float f14 = i13 / i6;
                long jM1617copywmQWz5c$default14 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                Brush.Companion companion111116 = Brush.INSTANCE;
                i14 = i13;
                Pair[] pairArr14 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                long j111 = jColor;
                RoundProgressViewKt.a(f14, jColor, jM1617copywmQWz5c$default14, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion111116, (Pair[]) Arrays.copyOf(pairArr14, pairArr14.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                Modifier modifierFillMaxSize$default14 = SizeKt.fillMaxSize$default(companion111113, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally14 = companion111114.getCenterHorizontally();
                Arrangement.Vertical top14 = Arrangement.INSTANCE.getTop();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy14 = ColumnKt.columnMeasurePolicy(top14, centerHorizontally14, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density118 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection118 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration118 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion111115.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf118 = LayoutKt.materializerOf(modifierFillMaxSize$default14);
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
                Updater.m1266setimpl(composerM1259constructorimpl118, measurePolicyColumnMeasurePolicy14, companion111115.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl118, density118, companion111115.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl118, layoutDirection118, companion111115.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl118, viewConfiguration118, companion111115.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf118.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance14 = ColumnScopeInstance.INSTANCE;
                function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                j6 = j111;
                function4 = function2B;
                i15 = i6;
                j7 = jColor2;
            } else {
                if (i16 != 0) {
                    i13 = 20;
                } else {
                    i13 = i;
                }
                if (i17 != 0) {
                    i6 = 30;
                }
                if (i7 != 0) {
                    jColor = ColorKt.Color(4279687754L);
                } else {
                    jColor = j4;
                }
                if (i9 != 0) {
                    jColor2 = ColorKt.Color(4286438656L);
                } else {
                    jColor2 = j5;
                }
                if (i11 != 0) {
                    function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                } else {
                    function2B = function3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                }
                Modifier.Companion companion111117 = Modifier.INSTANCE;
                Modifier modifierM469size3ABfNKs15 = SizeKt.m469size3ABfNKs(companion111117, Dp.m4104constructorimpl(210));
                Alignment.Companion companion111118 = Alignment.INSTANCE;
                Alignment center15 = companion111118.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy15 = BoxKt.rememberBoxMeasurePolicy(center15, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density119 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection119 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration119 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion111119 = ComposeUiNode.INSTANCE;
                constructor = companion111119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf119 = LayoutKt.materializerOf(modifierM469size3ABfNKs15);
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
                Updater.m1266setimpl(composerM1259constructorimpl119, measurePolicyRememberBoxMeasurePolicy15, companion111119.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl119, density119, companion111119.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl119, layoutDirection119, companion111119.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl119, viewConfiguration119, companion111119.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf119.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
                float f15 = i13 / i6;
                long jM1617copywmQWz5c$default15 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                Brush.Companion companion1111110 = Brush.INSTANCE;
                i14 = i13;
                Pair[] pairArr15 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                long j112 = jColor;
                RoundProgressViewKt.a(f15, jColor, jM1617copywmQWz5c$default15, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion1111110, (Pair[]) Arrays.copyOf(pairArr15, pairArr15.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                Modifier modifierFillMaxSize$default15 = SizeKt.fillMaxSize$default(companion111117, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally15 = companion111118.getCenterHorizontally();
                Arrangement.Vertical top15 = Arrangement.INSTANCE.getTop();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy15 = ColumnKt.columnMeasurePolicy(top15, centerHorizontally15, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density1110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection1110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration1110 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion111119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1110 = LayoutKt.materializerOf(modifierFillMaxSize$default15);
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
                Updater.m1266setimpl(composerM1259constructorimpl1110, measurePolicyColumnMeasurePolicy15, companion111119.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl1110, density1110, companion111119.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl1110, layoutDirection1110, companion111119.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl1110, viewConfiguration1110, companion111119.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf1110.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance15 = ColumnScopeInstance.INSTANCE;
                function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                j6 = j112;
                function4 = function2B;
                i15 = i6;
                j7 = jColor2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final int i115 = i14;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$CircleProgress$2
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

                public final void invoke(@Nullable Composer composer2, int i116) {
                    DayDetailKt.b(i115, i15, j6, j7, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
        i5 |= 48;
        i6 = i2;
        i7 = i4 & 4;
        if (i7 != 0) {
            if ((i3 & 896) == 0) {
                j4 = j2;
                if (composerStartRestartGroup.changed(j4)) {
                    i8 = 256;
                } else {
                    i8 = 128;
                }
                i5 |= i8;
            }
            i9 = i4 & 8;
            if (i9 != 0) {
                if ((i3 & 7168) == 0) {
                    j5 = j3;
                    if (composerStartRestartGroup.changed(j5)) {
                        i10 = 2048;
                    } else {
                        i10 = 1024;
                    }
                    i5 |= i10;
                }
                i11 = i4 & 16;
                if (i11 != 0) {
                    if ((57344 & i3) == 0) {
                        function3 = function2;
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i12 = 16384;
                        } else {
                            i12 = 8192;
                        }
                        i5 |= i12;
                    }
                    if ((i5 & 46811) == 9362) {
                        if (i16 != 0) {
                            i13 = 20;
                        } else {
                            i13 = i;
                        }
                        if (i17 != 0) {
                            i6 = 30;
                        }
                        if (i7 != 0) {
                            jColor = ColorKt.Color(4279687754L);
                        } else {
                            jColor = j4;
                        }
                        if (i9 != 0) {
                            jColor2 = ColorKt.Color(4286438656L);
                        } else {
                            jColor2 = j5;
                        }
                        if (i11 != 0) {
                            function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                        } else {
                            function2B = function3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                        }
                        Modifier.Companion companion1111111 = Modifier.INSTANCE;
                        Modifier modifierM469size3ABfNKs16 = SizeKt.m469size3ABfNKs(companion1111111, Dp.m4104constructorimpl(210));
                        Alignment.Companion companion1111112 = Alignment.INSTANCE;
                        Alignment center16 = companion1111112.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy16 = BoxKt.rememberBoxMeasurePolicy(center16, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        Density density1111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection1111 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration1111 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion1111113 = ComposeUiNode.INSTANCE;
                        constructor = companion1111113.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1111 = LayoutKt.materializerOf(modifierM469size3ABfNKs16);
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
                        Composer composerM1259constructorimpl1111 = Updater.m1259constructorimpl(composerStartRestartGroup);
                        Updater.m1266setimpl(composerM1259constructorimpl1111, measurePolicyRememberBoxMeasurePolicy16, companion1111113.getSetMeasurePolicy());
                        Updater.m1266setimpl(composerM1259constructorimpl1111, density1111, companion1111113.getSetDensity());
                        Updater.m1266setimpl(composerM1259constructorimpl1111, layoutDirection1111, companion1111113.getSetLayoutDirection());
                        Updater.m1266setimpl(composerM1259constructorimpl1111, viewConfiguration1111, companion1111113.getSetViewConfiguration());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf1111.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance16 = BoxScopeInstance.INSTANCE;
                        float f16 = i13 / i6;
                        long jM1617copywmQWz5c$default16 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                        Brush.Companion companion1111114 = Brush.INSTANCE;
                        i14 = i13;
                        Pair[] pairArr16 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                        long j113 = jColor;
                        RoundProgressViewKt.a(f16, jColor, jM1617copywmQWz5c$default16, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion1111114, (Pair[]) Arrays.copyOf(pairArr16, pairArr16.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                        Modifier modifierFillMaxSize$default16 = SizeKt.fillMaxSize$default(companion1111111, 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally16 = companion1111112.getCenterHorizontally();
                        Arrangement.Vertical top16 = Arrangement.INSTANCE.getTop();
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyColumnMeasurePolicy16 = ColumnKt.columnMeasurePolicy(top16, centerHorizontally16, composerStartRestartGroup, 54);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        Density density1112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection1112 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration1112 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        constructor2 = companion1111113.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1112 = LayoutKt.materializerOf(modifierFillMaxSize$default16);
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
                        Composer composerM1259constructorimpl1112 = Updater.m1259constructorimpl(composerStartRestartGroup);
                        Updater.m1266setimpl(composerM1259constructorimpl1112, measurePolicyColumnMeasurePolicy16, companion1111113.getSetMeasurePolicy());
                        Updater.m1266setimpl(composerM1259constructorimpl1112, density1112, companion1111113.getSetDensity());
                        Updater.m1266setimpl(composerM1259constructorimpl1112, layoutDirection1112, companion1111113.getSetLayoutDirection());
                        Updater.m1266setimpl(composerM1259constructorimpl1112, viewConfiguration1112, companion1111113.getSetViewConfiguration());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf1112.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ColumnScopeInstance columnScopeInstance16 = ColumnScopeInstance.INSTANCE;
                        function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                        j6 = j113;
                        function4 = function2B;
                        i15 = i6;
                        j7 = jColor2;
                    } else {
                        if (i16 != 0) {
                            i13 = 20;
                        } else {
                            i13 = i;
                        }
                        if (i17 != 0) {
                            i6 = 30;
                        }
                        if (i7 != 0) {
                            jColor = ColorKt.Color(4279687754L);
                        } else {
                            jColor = j4;
                        }
                        if (i9 != 0) {
                            jColor2 = ColorKt.Color(4286438656L);
                        } else {
                            jColor2 = j5;
                        }
                        if (i11 != 0) {
                            function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                        } else {
                            function2B = function3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                        }
                        Modifier.Companion companion1111115 = Modifier.INSTANCE;
                        Modifier modifierM469size3ABfNKs17 = SizeKt.m469size3ABfNKs(companion1111115, Dp.m4104constructorimpl(210));
                        Alignment.Companion companion1111116 = Alignment.INSTANCE;
                        Alignment center17 = companion1111116.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy17 = BoxKt.rememberBoxMeasurePolicy(center17, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        Density density1113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection1113 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration1113 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion1111117 = ComposeUiNode.INSTANCE;
                        constructor = companion1111117.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1113 = LayoutKt.materializerOf(modifierM469size3ABfNKs17);
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
                        Composer composerM1259constructorimpl1113 = Updater.m1259constructorimpl(composerStartRestartGroup);
                        Updater.m1266setimpl(composerM1259constructorimpl1113, measurePolicyRememberBoxMeasurePolicy17, companion1111117.getSetMeasurePolicy());
                        Updater.m1266setimpl(composerM1259constructorimpl1113, density1113, companion1111117.getSetDensity());
                        Updater.m1266setimpl(composerM1259constructorimpl1113, layoutDirection1113, companion1111117.getSetLayoutDirection());
                        Updater.m1266setimpl(composerM1259constructorimpl1113, viewConfiguration1113, companion1111117.getSetViewConfiguration());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf1113.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance17 = BoxScopeInstance.INSTANCE;
                        float f17 = i13 / i6;
                        long jM1617copywmQWz5c$default17 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                        Brush.Companion companion1111118 = Brush.INSTANCE;
                        i14 = i13;
                        Pair[] pairArr17 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                        long j114 = jColor;
                        RoundProgressViewKt.a(f17, jColor, jM1617copywmQWz5c$default17, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion1111118, (Pair[]) Arrays.copyOf(pairArr17, pairArr17.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                        Modifier modifierFillMaxSize$default17 = SizeKt.fillMaxSize$default(companion1111115, 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally17 = companion1111116.getCenterHorizontally();
                        Arrangement.Vertical top17 = Arrangement.INSTANCE.getTop();
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyColumnMeasurePolicy17 = ColumnKt.columnMeasurePolicy(top17, centerHorizontally17, composerStartRestartGroup, 54);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        Density density1114 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection1114 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration1114 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        constructor2 = companion1111117.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1114 = LayoutKt.materializerOf(modifierFillMaxSize$default17);
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
                        Composer composerM1259constructorimpl1114 = Updater.m1259constructorimpl(composerStartRestartGroup);
                        Updater.m1266setimpl(composerM1259constructorimpl1114, measurePolicyColumnMeasurePolicy17, companion1111117.getSetMeasurePolicy());
                        Updater.m1266setimpl(composerM1259constructorimpl1114, density1114, companion1111117.getSetDensity());
                        Updater.m1266setimpl(composerM1259constructorimpl1114, layoutDirection1114, companion1111117.getSetLayoutDirection());
                        Updater.m1266setimpl(composerM1259constructorimpl1114, viewConfiguration1114, companion1111117.getSetViewConfiguration());
                        composerStartRestartGroup.enableReusing();
                        function3MaterializerOf1114.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ColumnScopeInstance columnScopeInstance17 = ColumnScopeInstance.INSTANCE;
                        function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                        j6 = j114;
                        function4 = function2B;
                        i15 = i6;
                        j7 = jColor2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final int i116 = i14;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$CircleProgress$2
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

                        public final void invoke(@Nullable Composer composer2, int i117) {
                            DayDetailKt.b(i116, i15, j6, j7, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                        }
                    });
                }
                i5 |= 24576;
                function3 = function2;
                if ((i5 & 46811) == 9362) {
                    if (i16 != 0) {
                        i13 = 20;
                    } else {
                        i13 = i;
                    }
                    if (i17 != 0) {
                        i6 = 30;
                    }
                    if (i7 != 0) {
                        jColor = ColorKt.Color(4279687754L);
                    } else {
                        jColor = j4;
                    }
                    if (i9 != 0) {
                        jColor2 = ColorKt.Color(4286438656L);
                    } else {
                        jColor2 = j5;
                    }
                    if (i11 != 0) {
                        function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                    } else {
                        function2B = function3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                    }
                    Modifier.Companion companion1111119 = Modifier.INSTANCE;
                    Modifier modifierM469size3ABfNKs18 = SizeKt.m469size3ABfNKs(companion1111119, Dp.m4104constructorimpl(210));
                    Alignment.Companion companion11111110 = Alignment.INSTANCE;
                    Alignment center18 = companion11111110.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy18 = BoxKt.rememberBoxMeasurePolicy(center18, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density1115 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection1115 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration1115 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion11111111 = ComposeUiNode.INSTANCE;
                    constructor = companion11111111.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1115 = LayoutKt.materializerOf(modifierM469size3ABfNKs18);
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
                    Composer composerM1259constructorimpl1115 = Updater.m1259constructorimpl(composerStartRestartGroup);
                    Updater.m1266setimpl(composerM1259constructorimpl1115, measurePolicyRememberBoxMeasurePolicy18, companion11111111.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl1115, density1115, companion11111111.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl1115, layoutDirection1115, companion11111111.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl1115, viewConfiguration1115, companion11111111.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf1115.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance18 = BoxScopeInstance.INSTANCE;
                    float f18 = i13 / i6;
                    long jM1617copywmQWz5c$default18 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                    Brush.Companion companion11111112 = Brush.INSTANCE;
                    i14 = i13;
                    Pair[] pairArr18 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                    long j115 = jColor;
                    RoundProgressViewKt.a(f18, jColor, jM1617copywmQWz5c$default18, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion11111112, (Pair[]) Arrays.copyOf(pairArr18, pairArr18.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                    Modifier modifierFillMaxSize$default18 = SizeKt.fillMaxSize$default(companion1111119, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally18 = companion11111110.getCenterHorizontally();
                    Arrangement.Vertical top18 = Arrangement.INSTANCE.getTop();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy18 = ColumnKt.columnMeasurePolicy(top18, centerHorizontally18, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density1116 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection1116 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration1116 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion11111111.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1116 = LayoutKt.materializerOf(modifierFillMaxSize$default18);
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
                    Composer composerM1259constructorimpl1116 = Updater.m1259constructorimpl(composerStartRestartGroup);
                    Updater.m1266setimpl(composerM1259constructorimpl1116, measurePolicyColumnMeasurePolicy18, companion11111111.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl1116, density1116, companion11111111.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl1116, layoutDirection1116, companion11111111.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl1116, viewConfiguration1116, companion11111111.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf1116.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance18 = ColumnScopeInstance.INSTANCE;
                    function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                    j6 = j115;
                    function4 = function2B;
                    i15 = i6;
                    j7 = jColor2;
                } else {
                    if (i16 != 0) {
                        i13 = 20;
                    } else {
                        i13 = i;
                    }
                    if (i17 != 0) {
                        i6 = 30;
                    }
                    if (i7 != 0) {
                        jColor = ColorKt.Color(4279687754L);
                    } else {
                        jColor = j4;
                    }
                    if (i9 != 0) {
                        jColor2 = ColorKt.Color(4286438656L);
                    } else {
                        jColor2 = j5;
                    }
                    if (i11 != 0) {
                        function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                    } else {
                        function2B = function3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                    }
                    Modifier.Companion companion11111113 = Modifier.INSTANCE;
                    Modifier modifierM469size3ABfNKs19 = SizeKt.m469size3ABfNKs(companion11111113, Dp.m4104constructorimpl(210));
                    Alignment.Companion companion11111114 = Alignment.INSTANCE;
                    Alignment center19 = companion11111114.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy19 = BoxKt.rememberBoxMeasurePolicy(center19, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density1117 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection1117 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration1117 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion11111115 = ComposeUiNode.INSTANCE;
                    constructor = companion11111115.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1117 = LayoutKt.materializerOf(modifierM469size3ABfNKs19);
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
                    Composer composerM1259constructorimpl1117 = Updater.m1259constructorimpl(composerStartRestartGroup);
                    Updater.m1266setimpl(composerM1259constructorimpl1117, measurePolicyRememberBoxMeasurePolicy19, companion11111115.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl1117, density1117, companion11111115.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl1117, layoutDirection1117, companion11111115.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl1117, viewConfiguration1117, companion11111115.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf1117.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance19 = BoxScopeInstance.INSTANCE;
                    float f19 = i13 / i6;
                    long jM1617copywmQWz5c$default19 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                    Brush.Companion companion11111116 = Brush.INSTANCE;
                    i14 = i13;
                    Pair[] pairArr19 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                    long j116 = jColor;
                    RoundProgressViewKt.a(f19, jColor, jM1617copywmQWz5c$default19, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion11111116, (Pair[]) Arrays.copyOf(pairArr19, pairArr19.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                    Modifier modifierFillMaxSize$default19 = SizeKt.fillMaxSize$default(companion11111113, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally19 = companion11111114.getCenterHorizontally();
                    Arrangement.Vertical top19 = Arrangement.INSTANCE.getTop();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy19 = ColumnKt.columnMeasurePolicy(top19, centerHorizontally19, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density1118 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection1118 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration1118 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion11111115.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1118 = LayoutKt.materializerOf(modifierFillMaxSize$default19);
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
                    Composer composerM1259constructorimpl1118 = Updater.m1259constructorimpl(composerStartRestartGroup);
                    Updater.m1266setimpl(composerM1259constructorimpl1118, measurePolicyColumnMeasurePolicy19, companion11111115.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl1118, density1118, companion11111115.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl1118, layoutDirection1118, companion11111115.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl1118, viewConfiguration1118, companion11111115.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf1118.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance19 = ColumnScopeInstance.INSTANCE;
                    function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                    j6 = j116;
                    function4 = function2B;
                    i15 = i6;
                    j7 = jColor2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i117 = i14;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$CircleProgress$2
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

                    public final void invoke(@Nullable Composer composer2, int i118) {
                        DayDetailKt.b(i117, i15, j6, j7, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    }
                });
            }
            i5 |= 3072;
            j5 = j3;
            i11 = i4 & 16;
            if (i11 != 0) {
                if ((57344 & i3) == 0) {
                    function3 = function2;
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i5 |= i12;
                }
                if ((i5 & 46811) == 9362) {
                    if (i16 != 0) {
                        i13 = 20;
                    } else {
                        i13 = i;
                    }
                    if (i17 != 0) {
                        i6 = 30;
                    }
                    if (i7 != 0) {
                        jColor = ColorKt.Color(4279687754L);
                    } else {
                        jColor = j4;
                    }
                    if (i9 != 0) {
                        jColor2 = ColorKt.Color(4286438656L);
                    } else {
                        jColor2 = j5;
                    }
                    if (i11 != 0) {
                        function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                    } else {
                        function2B = function3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                    }
                    Modifier.Companion companion11111117 = Modifier.INSTANCE;
                    Modifier modifierM469size3ABfNKs110 = SizeKt.m469size3ABfNKs(companion11111117, Dp.m4104constructorimpl(210));
                    Alignment.Companion companion11111118 = Alignment.INSTANCE;
                    Alignment center110 = companion11111118.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy110 = BoxKt.rememberBoxMeasurePolicy(center110, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density1119 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection1119 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration1119 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion11111119 = ComposeUiNode.INSTANCE;
                    constructor = companion11111119.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1119 = LayoutKt.materializerOf(modifierM469size3ABfNKs110);
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
                    Composer composerM1259constructorimpl1119 = Updater.m1259constructorimpl(composerStartRestartGroup);
                    Updater.m1266setimpl(composerM1259constructorimpl1119, measurePolicyRememberBoxMeasurePolicy110, companion11111119.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl1119, density1119, companion11111119.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl1119, layoutDirection1119, companion11111119.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl1119, viewConfiguration1119, companion11111119.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf1119.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance110 = BoxScopeInstance.INSTANCE;
                    float f110 = i13 / i6;
                    long jM1617copywmQWz5c$default110 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                    Brush.Companion companion111111110 = Brush.INSTANCE;
                    i14 = i13;
                    Pair[] pairArr110 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                    long j117 = jColor;
                    RoundProgressViewKt.a(f110, jColor, jM1617copywmQWz5c$default110, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion111111110, (Pair[]) Arrays.copyOf(pairArr110, pairArr110.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                    Modifier modifierFillMaxSize$default110 = SizeKt.fillMaxSize$default(companion11111117, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally110 = companion11111118.getCenterHorizontally();
                    Arrangement.Vertical top110 = Arrangement.INSTANCE.getTop();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy110 = ColumnKt.columnMeasurePolicy(top110, centerHorizontally110, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density11110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection11110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration11110 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion11111119.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11110 = LayoutKt.materializerOf(modifierFillMaxSize$default110);
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
                    Composer composerM1259constructorimpl11110 = Updater.m1259constructorimpl(composerStartRestartGroup);
                    Updater.m1266setimpl(composerM1259constructorimpl11110, measurePolicyColumnMeasurePolicy110, companion11111119.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl11110, density11110, companion11111119.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl11110, layoutDirection11110, companion11111119.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl11110, viewConfiguration11110, companion11111119.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf11110.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance110 = ColumnScopeInstance.INSTANCE;
                    function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                    j6 = j117;
                    function4 = function2B;
                    i15 = i6;
                    j7 = jColor2;
                } else {
                    if (i16 != 0) {
                        i13 = 20;
                    } else {
                        i13 = i;
                    }
                    if (i17 != 0) {
                        i6 = 30;
                    }
                    if (i7 != 0) {
                        jColor = ColorKt.Color(4279687754L);
                    } else {
                        jColor = j4;
                    }
                    if (i9 != 0) {
                        jColor2 = ColorKt.Color(4286438656L);
                    } else {
                        jColor2 = j5;
                    }
                    if (i11 != 0) {
                        function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                    } else {
                        function2B = function3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                    }
                    Modifier.Companion companion111111111 = Modifier.INSTANCE;
                    Modifier modifierM469size3ABfNKs111 = SizeKt.m469size3ABfNKs(companion111111111, Dp.m4104constructorimpl(210));
                    Alignment.Companion companion111111112 = Alignment.INSTANCE;
                    Alignment center111 = companion111111112.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy111 = BoxKt.rememberBoxMeasurePolicy(center111, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density11111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection11111 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration11111 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion111111113 = ComposeUiNode.INSTANCE;
                    constructor = companion111111113.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11111 = LayoutKt.materializerOf(modifierM469size3ABfNKs111);
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
                    Composer composerM1259constructorimpl11111 = Updater.m1259constructorimpl(composerStartRestartGroup);
                    Updater.m1266setimpl(composerM1259constructorimpl11111, measurePolicyRememberBoxMeasurePolicy111, companion111111113.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl11111, density11111, companion111111113.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl11111, layoutDirection11111, companion111111113.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl11111, viewConfiguration11111, companion111111113.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf11111.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance111 = BoxScopeInstance.INSTANCE;
                    float f111 = i13 / i6;
                    long jM1617copywmQWz5c$default111 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                    Brush.Companion companion111111114 = Brush.INSTANCE;
                    i14 = i13;
                    Pair[] pairArr111 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                    long j118 = jColor;
                    RoundProgressViewKt.a(f111, jColor, jM1617copywmQWz5c$default111, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion111111114, (Pair[]) Arrays.copyOf(pairArr111, pairArr111.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                    Modifier modifierFillMaxSize$default111 = SizeKt.fillMaxSize$default(companion111111111, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally111 = companion111111112.getCenterHorizontally();
                    Arrangement.Vertical top111 = Arrangement.INSTANCE.getTop();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy111 = ColumnKt.columnMeasurePolicy(top111, centerHorizontally111, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density11112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection11112 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration11112 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion111111113.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11112 = LayoutKt.materializerOf(modifierFillMaxSize$default111);
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
                    Composer composerM1259constructorimpl11112 = Updater.m1259constructorimpl(composerStartRestartGroup);
                    Updater.m1266setimpl(composerM1259constructorimpl11112, measurePolicyColumnMeasurePolicy111, companion111111113.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl11112, density11112, companion111111113.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl11112, layoutDirection11112, companion111111113.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl11112, viewConfiguration11112, companion111111113.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf11112.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance111 = ColumnScopeInstance.INSTANCE;
                    function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                    j6 = j118;
                    function4 = function2B;
                    i15 = i6;
                    j7 = jColor2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i118 = i14;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$CircleProgress$2
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

                    public final void invoke(@Nullable Composer composer2, int i119) {
                        DayDetailKt.b(i118, i15, j6, j7, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    }
                });
            }
            i5 |= 24576;
            function3 = function2;
            if ((i5 & 46811) == 9362) {
                if (i16 != 0) {
                    i13 = 20;
                } else {
                    i13 = i;
                }
                if (i17 != 0) {
                    i6 = 30;
                }
                if (i7 != 0) {
                    jColor = ColorKt.Color(4279687754L);
                } else {
                    jColor = j4;
                }
                if (i9 != 0) {
                    jColor2 = ColorKt.Color(4286438656L);
                } else {
                    jColor2 = j5;
                }
                if (i11 != 0) {
                    function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                } else {
                    function2B = function3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                }
                Modifier.Companion companion111111115 = Modifier.INSTANCE;
                Modifier modifierM469size3ABfNKs112 = SizeKt.m469size3ABfNKs(companion111111115, Dp.m4104constructorimpl(210));
                Alignment.Companion companion111111116 = Alignment.INSTANCE;
                Alignment center112 = companion111111116.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy112 = BoxKt.rememberBoxMeasurePolicy(center112, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density11113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection11113 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration11113 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion111111117 = ComposeUiNode.INSTANCE;
                constructor = companion111111117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11113 = LayoutKt.materializerOf(modifierM469size3ABfNKs112);
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
                Composer composerM1259constructorimpl11113 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl11113, measurePolicyRememberBoxMeasurePolicy112, companion111111117.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl11113, density11113, companion111111117.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl11113, layoutDirection11113, companion111111117.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl11113, viewConfiguration11113, companion111111117.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf11113.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance112 = BoxScopeInstance.INSTANCE;
                float f112 = i13 / i6;
                long jM1617copywmQWz5c$default112 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                Brush.Companion companion111111118 = Brush.INSTANCE;
                i14 = i13;
                Pair[] pairArr112 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                long j119 = jColor;
                RoundProgressViewKt.a(f112, jColor, jM1617copywmQWz5c$default112, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion111111118, (Pair[]) Arrays.copyOf(pairArr112, pairArr112.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                Modifier modifierFillMaxSize$default112 = SizeKt.fillMaxSize$default(companion111111115, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally112 = companion111111116.getCenterHorizontally();
                Arrangement.Vertical top112 = Arrangement.INSTANCE.getTop();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy112 = ColumnKt.columnMeasurePolicy(top112, centerHorizontally112, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density11114 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection11114 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration11114 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion111111117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11114 = LayoutKt.materializerOf(modifierFillMaxSize$default112);
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
                Composer composerM1259constructorimpl11114 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl11114, measurePolicyColumnMeasurePolicy112, companion111111117.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl11114, density11114, companion111111117.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl11114, layoutDirection11114, companion111111117.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl11114, viewConfiguration11114, companion111111117.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf11114.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance112 = ColumnScopeInstance.INSTANCE;
                function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                j6 = j119;
                function4 = function2B;
                i15 = i6;
                j7 = jColor2;
            } else {
                if (i16 != 0) {
                    i13 = 20;
                } else {
                    i13 = i;
                }
                if (i17 != 0) {
                    i6 = 30;
                }
                if (i7 != 0) {
                    jColor = ColorKt.Color(4279687754L);
                } else {
                    jColor = j4;
                }
                if (i9 != 0) {
                    jColor2 = ColorKt.Color(4286438656L);
                } else {
                    jColor2 = j5;
                }
                if (i11 != 0) {
                    function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                } else {
                    function2B = function3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                }
                Modifier.Companion companion111111119 = Modifier.INSTANCE;
                Modifier modifierM469size3ABfNKs113 = SizeKt.m469size3ABfNKs(companion111111119, Dp.m4104constructorimpl(210));
                Alignment.Companion companion1111111110 = Alignment.INSTANCE;
                Alignment center113 = companion1111111110.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy113 = BoxKt.rememberBoxMeasurePolicy(center113, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density11115 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection11115 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration11115 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion1111111111 = ComposeUiNode.INSTANCE;
                constructor = companion1111111111.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11115 = LayoutKt.materializerOf(modifierM469size3ABfNKs113);
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
                Composer composerM1259constructorimpl11115 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl11115, measurePolicyRememberBoxMeasurePolicy113, companion1111111111.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl11115, density11115, companion1111111111.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl11115, layoutDirection11115, companion1111111111.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl11115, viewConfiguration11115, companion1111111111.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf11115.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance113 = BoxScopeInstance.INSTANCE;
                float f113 = i13 / i6;
                long jM1617copywmQWz5c$default113 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                Brush.Companion companion1111111112 = Brush.INSTANCE;
                i14 = i13;
                Pair[] pairArr113 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                long j1110 = jColor;
                RoundProgressViewKt.a(f113, jColor, jM1617copywmQWz5c$default113, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion1111111112, (Pair[]) Arrays.copyOf(pairArr113, pairArr113.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                Modifier modifierFillMaxSize$default113 = SizeKt.fillMaxSize$default(companion111111119, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally113 = companion1111111110.getCenterHorizontally();
                Arrangement.Vertical top113 = Arrangement.INSTANCE.getTop();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy113 = ColumnKt.columnMeasurePolicy(top113, centerHorizontally113, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density11116 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection11116 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration11116 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion1111111111.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11116 = LayoutKt.materializerOf(modifierFillMaxSize$default113);
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
                Composer composerM1259constructorimpl11116 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl11116, measurePolicyColumnMeasurePolicy113, companion1111111111.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl11116, density11116, companion1111111111.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl11116, layoutDirection11116, companion1111111111.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl11116, viewConfiguration11116, companion1111111111.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf11116.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance113 = ColumnScopeInstance.INSTANCE;
                function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                j6 = j1110;
                function4 = function2B;
                i15 = i6;
                j7 = jColor2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final int i119 = i14;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$CircleProgress$2
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

                public final void invoke(@Nullable Composer composer2, int i1110) {
                    DayDetailKt.b(i119, i15, j6, j7, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
        i5 |= ModuleType.TYPE_SYSTEM_SETTING;
        j4 = j2;
        i9 = i4 & 8;
        if (i9 != 0) {
            if ((i3 & 7168) == 0) {
                j5 = j3;
                if (composerStartRestartGroup.changed(j5)) {
                    i10 = 2048;
                } else {
                    i10 = 1024;
                }
                i5 |= i10;
            }
            i11 = i4 & 16;
            if (i11 != 0) {
                if ((57344 & i3) == 0) {
                    function3 = function2;
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i12 = 16384;
                    } else {
                        i12 = 8192;
                    }
                    i5 |= i12;
                }
                if ((i5 & 46811) == 9362) {
                    if (i16 != 0) {
                        i13 = 20;
                    } else {
                        i13 = i;
                    }
                    if (i17 != 0) {
                        i6 = 30;
                    }
                    if (i7 != 0) {
                        jColor = ColorKt.Color(4279687754L);
                    } else {
                        jColor = j4;
                    }
                    if (i9 != 0) {
                        jColor2 = ColorKt.Color(4286438656L);
                    } else {
                        jColor2 = j5;
                    }
                    if (i11 != 0) {
                        function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                    } else {
                        function2B = function3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                    }
                    Modifier.Companion companion1111111113 = Modifier.INSTANCE;
                    Modifier modifierM469size3ABfNKs114 = SizeKt.m469size3ABfNKs(companion1111111113, Dp.m4104constructorimpl(210));
                    Alignment.Companion companion1111111114 = Alignment.INSTANCE;
                    Alignment center114 = companion1111111114.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy114 = BoxKt.rememberBoxMeasurePolicy(center114, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density11117 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection11117 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration11117 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion1111111115 = ComposeUiNode.INSTANCE;
                    constructor = companion1111111115.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11117 = LayoutKt.materializerOf(modifierM469size3ABfNKs114);
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
                    Composer composerM1259constructorimpl11117 = Updater.m1259constructorimpl(composerStartRestartGroup);
                    Updater.m1266setimpl(composerM1259constructorimpl11117, measurePolicyRememberBoxMeasurePolicy114, companion1111111115.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl11117, density11117, companion1111111115.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl11117, layoutDirection11117, companion1111111115.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl11117, viewConfiguration11117, companion1111111115.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf11117.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance114 = BoxScopeInstance.INSTANCE;
                    float f114 = i13 / i6;
                    long jM1617copywmQWz5c$default114 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                    Brush.Companion companion1111111116 = Brush.INSTANCE;
                    i14 = i13;
                    Pair[] pairArr114 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                    long j1111 = jColor;
                    RoundProgressViewKt.a(f114, jColor, jM1617copywmQWz5c$default114, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion1111111116, (Pair[]) Arrays.copyOf(pairArr114, pairArr114.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                    Modifier modifierFillMaxSize$default114 = SizeKt.fillMaxSize$default(companion1111111113, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally114 = companion1111111114.getCenterHorizontally();
                    Arrangement.Vertical top114 = Arrangement.INSTANCE.getTop();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy114 = ColumnKt.columnMeasurePolicy(top114, centerHorizontally114, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density11118 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection11118 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration11118 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion1111111115.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11118 = LayoutKt.materializerOf(modifierFillMaxSize$default114);
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
                    Composer composerM1259constructorimpl11118 = Updater.m1259constructorimpl(composerStartRestartGroup);
                    Updater.m1266setimpl(composerM1259constructorimpl11118, measurePolicyColumnMeasurePolicy114, companion1111111115.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl11118, density11118, companion1111111115.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl11118, layoutDirection11118, companion1111111115.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl11118, viewConfiguration11118, companion1111111115.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf11118.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance114 = ColumnScopeInstance.INSTANCE;
                    function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                    j6 = j1111;
                    function4 = function2B;
                    i15 = i6;
                    j7 = jColor2;
                } else {
                    if (i16 != 0) {
                        i13 = 20;
                    } else {
                        i13 = i;
                    }
                    if (i17 != 0) {
                        i6 = 30;
                    }
                    if (i7 != 0) {
                        jColor = ColorKt.Color(4279687754L);
                    } else {
                        jColor = j4;
                    }
                    if (i9 != 0) {
                        jColor2 = ColorKt.Color(4286438656L);
                    } else {
                        jColor2 = j5;
                    }
                    if (i11 != 0) {
                        function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                    } else {
                        function2B = function3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                    }
                    Modifier.Companion companion1111111117 = Modifier.INSTANCE;
                    Modifier modifierM469size3ABfNKs115 = SizeKt.m469size3ABfNKs(companion1111111117, Dp.m4104constructorimpl(210));
                    Alignment.Companion companion1111111118 = Alignment.INSTANCE;
                    Alignment center115 = companion1111111118.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy115 = BoxKt.rememberBoxMeasurePolicy(center115, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density11119 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection11119 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration11119 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion1111111119 = ComposeUiNode.INSTANCE;
                    constructor = companion1111111119.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11119 = LayoutKt.materializerOf(modifierM469size3ABfNKs115);
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
                    Composer composerM1259constructorimpl11119 = Updater.m1259constructorimpl(composerStartRestartGroup);
                    Updater.m1266setimpl(composerM1259constructorimpl11119, measurePolicyRememberBoxMeasurePolicy115, companion1111111119.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl11119, density11119, companion1111111119.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl11119, layoutDirection11119, companion1111111119.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl11119, viewConfiguration11119, companion1111111119.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf11119.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance115 = BoxScopeInstance.INSTANCE;
                    float f115 = i13 / i6;
                    long jM1617copywmQWz5c$default115 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                    Brush.Companion companion11111111110 = Brush.INSTANCE;
                    i14 = i13;
                    Pair[] pairArr115 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                    long j1112 = jColor;
                    RoundProgressViewKt.a(f115, jColor, jM1617copywmQWz5c$default115, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion11111111110, (Pair[]) Arrays.copyOf(pairArr115, pairArr115.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                    Modifier modifierFillMaxSize$default115 = SizeKt.fillMaxSize$default(companion1111111117, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally115 = companion1111111118.getCenterHorizontally();
                    Arrangement.Vertical top115 = Arrangement.INSTANCE.getTop();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy115 = ColumnKt.columnMeasurePolicy(top115, centerHorizontally115, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density111110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection111110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration111110 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion1111111119.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111110 = LayoutKt.materializerOf(modifierFillMaxSize$default115);
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
                    Composer composerM1259constructorimpl111110 = Updater.m1259constructorimpl(composerStartRestartGroup);
                    Updater.m1266setimpl(composerM1259constructorimpl111110, measurePolicyColumnMeasurePolicy115, companion1111111119.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl111110, density111110, companion1111111119.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl111110, layoutDirection111110, companion1111111119.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl111110, viewConfiguration111110, companion1111111119.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf111110.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance115 = ColumnScopeInstance.INSTANCE;
                    function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                    j6 = j1112;
                    function4 = function2B;
                    i15 = i6;
                    j7 = jColor2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i1110 = i14;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$CircleProgress$2
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

                    public final void invoke(@Nullable Composer composer2, int i1111) {
                        DayDetailKt.b(i1110, i15, j6, j7, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    }
                });
            }
            i5 |= 24576;
            function3 = function2;
            if ((i5 & 46811) == 9362) {
                if (i16 != 0) {
                    i13 = 20;
                } else {
                    i13 = i;
                }
                if (i17 != 0) {
                    i6 = 30;
                }
                if (i7 != 0) {
                    jColor = ColorKt.Color(4279687754L);
                } else {
                    jColor = j4;
                }
                if (i9 != 0) {
                    jColor2 = ColorKt.Color(4286438656L);
                } else {
                    jColor2 = j5;
                }
                if (i11 != 0) {
                    function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                } else {
                    function2B = function3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                }
                Modifier.Companion companion11111111111 = Modifier.INSTANCE;
                Modifier modifierM469size3ABfNKs116 = SizeKt.m469size3ABfNKs(companion11111111111, Dp.m4104constructorimpl(210));
                Alignment.Companion companion11111111112 = Alignment.INSTANCE;
                Alignment center116 = companion11111111112.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy116 = BoxKt.rememberBoxMeasurePolicy(center116, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density111111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection111111 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration111111 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion11111111113 = ComposeUiNode.INSTANCE;
                constructor = companion11111111113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111111 = LayoutKt.materializerOf(modifierM469size3ABfNKs116);
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
                Composer composerM1259constructorimpl111111 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl111111, measurePolicyRememberBoxMeasurePolicy116, companion11111111113.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl111111, density111111, companion11111111113.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl111111, layoutDirection111111, companion11111111113.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl111111, viewConfiguration111111, companion11111111113.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf111111.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance116 = BoxScopeInstance.INSTANCE;
                float f116 = i13 / i6;
                long jM1617copywmQWz5c$default116 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                Brush.Companion companion11111111114 = Brush.INSTANCE;
                i14 = i13;
                Pair[] pairArr116 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                long j1113 = jColor;
                RoundProgressViewKt.a(f116, jColor, jM1617copywmQWz5c$default116, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion11111111114, (Pair[]) Arrays.copyOf(pairArr116, pairArr116.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                Modifier modifierFillMaxSize$default116 = SizeKt.fillMaxSize$default(companion11111111111, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally116 = companion11111111112.getCenterHorizontally();
                Arrangement.Vertical top116 = Arrangement.INSTANCE.getTop();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy116 = ColumnKt.columnMeasurePolicy(top116, centerHorizontally116, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density111112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection111112 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration111112 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion11111111113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111112 = LayoutKt.materializerOf(modifierFillMaxSize$default116);
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
                Composer composerM1259constructorimpl111112 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl111112, measurePolicyColumnMeasurePolicy116, companion11111111113.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl111112, density111112, companion11111111113.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl111112, layoutDirection111112, companion11111111113.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl111112, viewConfiguration111112, companion11111111113.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf111112.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance116 = ColumnScopeInstance.INSTANCE;
                function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                j6 = j1113;
                function4 = function2B;
                i15 = i6;
                j7 = jColor2;
            } else {
                if (i16 != 0) {
                    i13 = 20;
                } else {
                    i13 = i;
                }
                if (i17 != 0) {
                    i6 = 30;
                }
                if (i7 != 0) {
                    jColor = ColorKt.Color(4279687754L);
                } else {
                    jColor = j4;
                }
                if (i9 != 0) {
                    jColor2 = ColorKt.Color(4286438656L);
                } else {
                    jColor2 = j5;
                }
                if (i11 != 0) {
                    function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                } else {
                    function2B = function3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                }
                Modifier.Companion companion11111111115 = Modifier.INSTANCE;
                Modifier modifierM469size3ABfNKs117 = SizeKt.m469size3ABfNKs(companion11111111115, Dp.m4104constructorimpl(210));
                Alignment.Companion companion11111111116 = Alignment.INSTANCE;
                Alignment center117 = companion11111111116.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy117 = BoxKt.rememberBoxMeasurePolicy(center117, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density111113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection111113 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration111113 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion11111111117 = ComposeUiNode.INSTANCE;
                constructor = companion11111111117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111113 = LayoutKt.materializerOf(modifierM469size3ABfNKs117);
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
                Composer composerM1259constructorimpl111113 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl111113, measurePolicyRememberBoxMeasurePolicy117, companion11111111117.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl111113, density111113, companion11111111117.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl111113, layoutDirection111113, companion11111111117.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl111113, viewConfiguration111113, companion11111111117.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf111113.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance117 = BoxScopeInstance.INSTANCE;
                float f117 = i13 / i6;
                long jM1617copywmQWz5c$default117 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                Brush.Companion companion11111111118 = Brush.INSTANCE;
                i14 = i13;
                Pair[] pairArr117 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                long j1114 = jColor;
                RoundProgressViewKt.a(f117, jColor, jM1617copywmQWz5c$default117, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion11111111118, (Pair[]) Arrays.copyOf(pairArr117, pairArr117.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                Modifier modifierFillMaxSize$default117 = SizeKt.fillMaxSize$default(companion11111111115, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally117 = companion11111111116.getCenterHorizontally();
                Arrangement.Vertical top117 = Arrangement.INSTANCE.getTop();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy117 = ColumnKt.columnMeasurePolicy(top117, centerHorizontally117, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density111114 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection111114 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration111114 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion11111111117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111114 = LayoutKt.materializerOf(modifierFillMaxSize$default117);
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
                Composer composerM1259constructorimpl111114 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl111114, measurePolicyColumnMeasurePolicy117, companion11111111117.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl111114, density111114, companion11111111117.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl111114, layoutDirection111114, companion11111111117.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl111114, viewConfiguration111114, companion11111111117.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf111114.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance117 = ColumnScopeInstance.INSTANCE;
                function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                j6 = j1114;
                function4 = function2B;
                i15 = i6;
                j7 = jColor2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final int i1111 = i14;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$CircleProgress$2
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

                public final void invoke(@Nullable Composer composer2, int i1112) {
                    DayDetailKt.b(i1111, i15, j6, j7, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
        i5 |= 3072;
        j5 = j3;
        i11 = i4 & 16;
        if (i11 != 0) {
            if ((57344 & i3) == 0) {
                function3 = function2;
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i12 = 16384;
                } else {
                    i12 = 8192;
                }
                i5 |= i12;
            }
            if ((i5 & 46811) == 9362) {
                if (i16 != 0) {
                    i13 = 20;
                } else {
                    i13 = i;
                }
                if (i17 != 0) {
                    i6 = 30;
                }
                if (i7 != 0) {
                    jColor = ColorKt.Color(4279687754L);
                } else {
                    jColor = j4;
                }
                if (i9 != 0) {
                    jColor2 = ColorKt.Color(4286438656L);
                } else {
                    jColor2 = j5;
                }
                if (i11 != 0) {
                    function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                } else {
                    function2B = function3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                }
                Modifier.Companion companion11111111119 = Modifier.INSTANCE;
                Modifier modifierM469size3ABfNKs118 = SizeKt.m469size3ABfNKs(companion11111111119, Dp.m4104constructorimpl(210));
                Alignment.Companion companion111111111110 = Alignment.INSTANCE;
                Alignment center118 = companion111111111110.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy118 = BoxKt.rememberBoxMeasurePolicy(center118, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density111115 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection111115 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration111115 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion111111111111 = ComposeUiNode.INSTANCE;
                constructor = companion111111111111.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111115 = LayoutKt.materializerOf(modifierM469size3ABfNKs118);
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
                Composer composerM1259constructorimpl111115 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl111115, measurePolicyRememberBoxMeasurePolicy118, companion111111111111.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl111115, density111115, companion111111111111.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl111115, layoutDirection111115, companion111111111111.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl111115, viewConfiguration111115, companion111111111111.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf111115.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance118 = BoxScopeInstance.INSTANCE;
                float f118 = i13 / i6;
                long jM1617copywmQWz5c$default118 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                Brush.Companion companion111111111112 = Brush.INSTANCE;
                i14 = i13;
                Pair[] pairArr118 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                long j1115 = jColor;
                RoundProgressViewKt.a(f118, jColor, jM1617copywmQWz5c$default118, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion111111111112, (Pair[]) Arrays.copyOf(pairArr118, pairArr118.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                Modifier modifierFillMaxSize$default118 = SizeKt.fillMaxSize$default(companion11111111119, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally118 = companion111111111110.getCenterHorizontally();
                Arrangement.Vertical top118 = Arrangement.INSTANCE.getTop();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy118 = ColumnKt.columnMeasurePolicy(top118, centerHorizontally118, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density111116 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection111116 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration111116 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion111111111111.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111116 = LayoutKt.materializerOf(modifierFillMaxSize$default118);
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
                Composer composerM1259constructorimpl111116 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl111116, measurePolicyColumnMeasurePolicy118, companion111111111111.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl111116, density111116, companion111111111111.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl111116, layoutDirection111116, companion111111111111.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl111116, viewConfiguration111116, companion111111111111.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf111116.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance118 = ColumnScopeInstance.INSTANCE;
                function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                j6 = j1115;
                function4 = function2B;
                i15 = i6;
                j7 = jColor2;
            } else {
                if (i16 != 0) {
                    i13 = 20;
                } else {
                    i13 = i;
                }
                if (i17 != 0) {
                    i6 = 30;
                }
                if (i7 != 0) {
                    jColor = ColorKt.Color(4279687754L);
                } else {
                    jColor = j4;
                }
                if (i9 != 0) {
                    jColor2 = ColorKt.Color(4286438656L);
                } else {
                    jColor2 = j5;
                }
                if (i11 != 0) {
                    function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
                } else {
                    function2B = function3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
                }
                Modifier.Companion companion111111111113 = Modifier.INSTANCE;
                Modifier modifierM469size3ABfNKs119 = SizeKt.m469size3ABfNKs(companion111111111113, Dp.m4104constructorimpl(210));
                Alignment.Companion companion111111111114 = Alignment.INSTANCE;
                Alignment center119 = companion111111111114.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy119 = BoxKt.rememberBoxMeasurePolicy(center119, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density111117 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection111117 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration111117 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion111111111115 = ComposeUiNode.INSTANCE;
                constructor = companion111111111115.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111117 = LayoutKt.materializerOf(modifierM469size3ABfNKs119);
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
                Composer composerM1259constructorimpl111117 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl111117, measurePolicyRememberBoxMeasurePolicy119, companion111111111115.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl111117, density111117, companion111111111115.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl111117, layoutDirection111117, companion111111111115.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl111117, viewConfiguration111117, companion111111111115.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf111117.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance119 = BoxScopeInstance.INSTANCE;
                float f119 = i13 / i6;
                long jM1617copywmQWz5c$default119 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                Brush.Companion companion111111111116 = Brush.INSTANCE;
                i14 = i13;
                Pair[] pairArr119 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
                long j1116 = jColor;
                RoundProgressViewKt.a(f119, jColor, jM1617copywmQWz5c$default119, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion111111111116, (Pair[]) Arrays.copyOf(pairArr119, pairArr119.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
                Modifier modifierFillMaxSize$default119 = SizeKt.fillMaxSize$default(companion111111111113, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally119 = companion111111111114.getCenterHorizontally();
                Arrangement.Vertical top119 = Arrangement.INSTANCE.getTop();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy119 = ColumnKt.columnMeasurePolicy(top119, centerHorizontally119, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density111118 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection111118 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration111118 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion111111111115.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111118 = LayoutKt.materializerOf(modifierFillMaxSize$default119);
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
                Composer composerM1259constructorimpl111118 = Updater.m1259constructorimpl(composerStartRestartGroup);
                Updater.m1266setimpl(composerM1259constructorimpl111118, measurePolicyColumnMeasurePolicy119, companion111111111115.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl111118, density111118, companion111111111115.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl111118, layoutDirection111118, companion111111111115.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl111118, viewConfiguration111118, companion111111111115.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf111118.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance119 = ColumnScopeInstance.INSTANCE;
                function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
                j6 = j1116;
                function4 = function2B;
                i15 = i6;
                j7 = jColor2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final int i1112 = i14;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$CircleProgress$2
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

                public final void invoke(@Nullable Composer composer2, int i1113) {
                    DayDetailKt.b(i1112, i15, j6, j7, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
        i5 |= 24576;
        function3 = function2;
        if ((i5 & 46811) == 9362) {
            if (i16 != 0) {
                i13 = 20;
            } else {
                i13 = i;
            }
            if (i17 != 0) {
                i6 = 30;
            }
            if (i7 != 0) {
                jColor = ColorKt.Color(4279687754L);
            } else {
                jColor = j4;
            }
            if (i9 != 0) {
                jColor2 = ColorKt.Color(4286438656L);
            } else {
                jColor2 = j5;
            }
            if (i11 != 0) {
                function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
            } else {
                function2B = function3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
            }
            Modifier.Companion companion111111111117 = Modifier.INSTANCE;
            Modifier modifierM469size3ABfNKs1110 = SizeKt.m469size3ABfNKs(companion111111111117, Dp.m4104constructorimpl(210));
            Alignment.Companion companion111111111118 = Alignment.INSTANCE;
            Alignment center1110 = companion111111111118.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy1110 = BoxKt.rememberBoxMeasurePolicy(center1110, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density111119 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection111119 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration111119 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion111111111119 = ComposeUiNode.INSTANCE;
            constructor = companion111111111119.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111119 = LayoutKt.materializerOf(modifierM469size3ABfNKs1110);
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
            Composer composerM1259constructorimpl111119 = Updater.m1259constructorimpl(composerStartRestartGroup);
            Updater.m1266setimpl(composerM1259constructorimpl111119, measurePolicyRememberBoxMeasurePolicy1110, companion111111111119.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl111119, density111119, companion111111111119.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl111119, layoutDirection111119, companion111111111119.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl111119, viewConfiguration111119, companion111111111119.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf111119.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance1110 = BoxScopeInstance.INSTANCE;
            float f1110 = i13 / i6;
            long jM1617copywmQWz5c$default1110 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
            Brush.Companion companion1111111111110 = Brush.INSTANCE;
            i14 = i13;
            Pair[] pairArr1110 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
            long j1117 = jColor;
            RoundProgressViewKt.a(f1110, jColor, jM1617copywmQWz5c$default1110, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion1111111111110, (Pair[]) Arrays.copyOf(pairArr1110, pairArr1110.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
            Modifier modifierFillMaxSize$default1110 = SizeKt.fillMaxSize$default(companion111111111117, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally1110 = companion111111111118.getCenterHorizontally();
            Arrangement.Vertical top1110 = Arrangement.INSTANCE.getTop();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy1110 = ColumnKt.columnMeasurePolicy(top1110, centerHorizontally1110, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density1111110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection1111110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration1111110 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion111111111119.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1111110 = LayoutKt.materializerOf(modifierFillMaxSize$default1110);
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
            Composer composerM1259constructorimpl1111110 = Updater.m1259constructorimpl(composerStartRestartGroup);
            Updater.m1266setimpl(composerM1259constructorimpl1111110, measurePolicyColumnMeasurePolicy1110, companion111111111119.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl1111110, density1111110, companion111111111119.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl1111110, layoutDirection1111110, companion111111111119.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl1111110, viewConfiguration1111110, companion111111111119.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf1111110.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance1110 = ColumnScopeInstance.INSTANCE;
            function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
            j6 = j1117;
            function4 = function2B;
            i15 = i6;
            j7 = jColor2;
        } else {
            if (i16 != 0) {
                i13 = 20;
            } else {
                i13 = i;
            }
            if (i17 != 0) {
                i6 = 30;
            }
            if (i7 != 0) {
                jColor = ColorKt.Color(4279687754L);
            } else {
                jColor = j4;
            }
            if (i9 != 0) {
                jColor2 = ColorKt.Color(4286438656L);
            } else {
                jColor2 = j5;
            }
            if (i11 != 0) {
                function2B = ComposableSingletons$DayDetailKt.INSTANCE.b();
            } else {
                function2B = function3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(626469225, i5, -1, "com.heytap.health.sunshine.ui.compose.CircleProgress (DayDetail.kt:165)");
            }
            Modifier.Companion companion1111111111111 = Modifier.INSTANCE;
            Modifier modifierM469size3ABfNKs1111 = SizeKt.m469size3ABfNKs(companion1111111111111, Dp.m4104constructorimpl(210));
            Alignment.Companion companion1111111111112 = Alignment.INSTANCE;
            Alignment center1111 = companion1111111111112.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy1111 = BoxKt.rememberBoxMeasurePolicy(center1111, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density1111111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection1111111 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration1111111 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion1111111111113 = ComposeUiNode.INSTANCE;
            constructor = companion1111111111113.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1111111 = LayoutKt.materializerOf(modifierM469size3ABfNKs1111);
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
            Composer composerM1259constructorimpl1111111 = Updater.m1259constructorimpl(composerStartRestartGroup);
            Updater.m1266setimpl(composerM1259constructorimpl1111111, measurePolicyRememberBoxMeasurePolicy1111, companion1111111111113.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl1111111, density1111111, companion1111111111113.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl1111111, layoutDirection1111111, companion1111111111113.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl1111111, viewConfiguration1111111, companion1111111111113.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf1111111.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance1111 = BoxScopeInstance.INSTANCE;
            float f1111 = i13 / i6;
            long jM1617copywmQWz5c$default1111 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composerStartRestartGroup, 0), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
            Brush.Companion companion1111111111114 = Brush.INSTANCE;
            i14 = i13;
            Pair[] pairArr1111 = (Pair[]) CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(jColor2)), TuplesKt.to(Float.valueOf(0.5f), Color.m1608boximpl(jColor)), TuplesKt.to(Float.valueOf(0.75f), Color.m1608boximpl(jColor2))}).toArray(new Pair[0]);
            long j1118 = jColor;
            RoundProgressViewKt.a(f1111, jColor, jM1617copywmQWz5c$default1111, Brush.Companion.m1574sweepGradientUv8p0NA$default(companion1111111111114, (Pair[]) Arrays.copyOf(pairArr1111, pairArr1111.length), 0L, 2, (Object) null), composerStartRestartGroup, (i5 >> 3) & 112, 0);
            Modifier modifierFillMaxSize$default1111 = SizeKt.fillMaxSize$default(companion1111111111111, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally1111 = companion1111111111112.getCenterHorizontally();
            Arrangement.Vertical top1111 = Arrangement.INSTANCE.getTop();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy1111 = ColumnKt.columnMeasurePolicy(top1111, centerHorizontally1111, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density1111112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection1111112 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration1111112 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion1111111111113.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1111112 = LayoutKt.materializerOf(modifierFillMaxSize$default1111);
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
            Composer composerM1259constructorimpl1111112 = Updater.m1259constructorimpl(composerStartRestartGroup);
            Updater.m1266setimpl(composerM1259constructorimpl1111112, measurePolicyColumnMeasurePolicy1111, companion1111111111113.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl1111112, density1111112, companion1111111111113.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl1111112, layoutDirection1111112, companion1111111111113.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl1111112, viewConfiguration1111112, companion1111111111113.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf1111112.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance1111 = ColumnScopeInstance.INSTANCE;
            function2B.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
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
            j6 = j1118;
            function4 = function2B;
            i15 = i6;
            j7 = jColor2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final int i1113 = i14;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$CircleProgress$2
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

            public final void invoke(@Nullable Composer composer2, int i1114) {
                DayDetailKt.b(i1113, i15, j6, j7, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(@NotNull final SunshineStat stat, @Nullable Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(stat, "stat");
        Composer composerStartRestartGroup = composer.startRestartGroup(761848897);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(761848897, i, -1, "com.heytap.health.sunshine.ui.compose.DayDetailView (DayDetail.kt:96)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 16;
        Modifier modifierM430paddingqDBjuR0$default = PaddingKt.m430paddingqDBjuR0$default(AutoClipContentModifierKt.b(companion), Dp.m4104constructorimpl(f), Dp.m4104constructorimpl(20), Dp.m4104constructorimpl(f), 0.0f, 8, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
        Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl, density, companion2.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        s(stat, composerStartRestartGroup, 8, 0);
        AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, o15.i(System.currentTimeMillis()) == stat.getDate(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableSingletons$DayDetailKt.INSTANCE.a(), composerStartRestartGroup, 1600518, 18);
        SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion, Dp.m4104constructorimpl(f)), composerStartRestartGroup, 6);
        KnowledgeItemKt.a("00", StringResources_androidKt.stringResource(R$string.lib_base_code_sunshine, composerStartRestartGroup, 0), composerStartRestartGroup, 6);
        SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion, Dp.m4104constructorimpl(f)), composerStartRestartGroup, 6);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$DayDetailView$2
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
                DayDetailKt.c(stat, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(showBackground = false, uiMode = 32)
    public static final void d(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1450271375);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1450271375, i, -1, "com.heytap.health.sunshine.ui.compose.PreviewView (DayDetail.kt:917)");
            }
            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$PreviewView$1
                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                    invoke2(lazyListScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LazyListScope LazyColumn) {
                    Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                    ComposableSingletons$DayDetailKt composableSingletons$DayDetailKt = ComposableSingletons$DayDetailKt.INSTANCE;
                    LazyListScope.item$default(LazyColumn, null, null, composableSingletons$DayDetailKt.c(), 3, null);
                    LazyListScope.item$default(LazyColumn, null, null, composableSingletons$DayDetailKt.d(), 3, null);
                    LazyListScope.item$default(LazyColumn, null, null, composableSingletons$DayDetailKt.e(), 3, null);
                }
            }, composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$PreviewView$2
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
                DayDetailKt.d(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:48:0x017a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0186  */
    /* JADX WARN: Code duplicated, block: B:52:0x018a  */
    /* JADX WARN: Code duplicated, block: B:55:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:57:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:59:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:63:0x025c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0268  */
    /* JADX WARN: Code duplicated, block: B:67:0x026c  */
    /* JADX WARN: Code duplicated, block: B:70:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x047b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0481  */
    /* JADX WARN: Code duplicated, block: B:82:0x0484  */
    /* JADX WARN: Code duplicated, block: B:84:0x04df  */
    /* JADX WARN: Code duplicated, block: B:86:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:88:0x052b  */
    /* JADX WARN: Code duplicated, block: B:91:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:96:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:82:0x0484, please report this as an issue */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void e(Modifier modifier, int i, Composer composer, final int i2, final int i3) {
        final Modifier modifier2;
        int i4;
        final int i5;
        Modifier modifier3;
        final int i6;
        Alignment.Companion companion;
        Function0<ComposeUiNode> constructor;
        Modifier.Companion companion2;
        Function0<ComposeUiNode> constructor2;
        BoxScopeInstance boxScopeInstance;
        Function0<ComposeUiNode> constructor3;
        int i7;
        Function0<ComposeUiNode> constructor4;
        FontWeight.Companion companion3;
        final int i8;
        boolean z;
        Composer composer2;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChanged2;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1162466703);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 == 0) {
            if ((i2 & 112) == 0) {
                i5 = i;
                i4 |= composerStartRestartGroup.changed(i5) ? 32 : 16;
            }
            if ((i4 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i9 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i10 != 0) {
                    i6 = 50;
                } else {
                    i6 = i5;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1162466703, i4, -1, "com.heytap.health.sunshine.ui.compose.Progress (DayDetail.kt:268)");
                }
                int i11 = i4 & 14;
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                companion = Alignment.INSTANCE;
                int i12 = i11 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, (i12 & 112) | (i12 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                constructor = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier3);
                int i13 = ((((i11 << 3) & 112) << 9) & 7168) | 6;
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
                Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl, density, companion4.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion4.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion4.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i13 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                companion2 = Modifier.INSTANCE;
                Modifier modifierM455height3ABfNKs = SizeKt.m455height3ABfNKs(companion2, Dp.m4104constructorimpl(30));
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM455height3ABfNKs);
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
                Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion4.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion4.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion4.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                boxScopeInstance = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(353296818);
                if (i6 > 0) {
                    Modifier modifierAlign = boxScopeInstance.align(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), companion.getTopStart());
                    Integer numValueOf = Integer.valueOf(i6);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(numValueOf);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$Progress$1$1$1$1
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
                                float fMo313toPx0680j_4 = Canvas.mo313toPx0680j_4(Dp.m4104constructorimpl(8));
                                float fMo313toPx0680j_5 = Canvas.mo313toPx0680j_4(Dp.m4104constructorimpl(6));
                                float fM1449getWidthimpl = Size.m1449getWidthimpl(Canvas.mo2153getSizeNHjbRc()) * (i6 / 100.0f);
                                Path Path = AndroidPath_androidKt.Path();
                                Path.moveTo(fM1449getWidthimpl, fMo313toPx0680j_5);
                                float f = fMo313toPx0680j_4 / 2;
                                Path.lineTo(fM1449getWidthimpl - f, 0.0f);
                                Path.lineTo(fM1449getWidthimpl + f, 0.0f);
                                Path.close();
                                DrawScope.m2144drawPathLG529CI$default(Canvas, Path, ColorKt.Color(swf.f(R$color.lib_base_colorBlack)), 0.0f, null, null, 0, 60, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierAlign, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                float f = 4;
                Modifier modifierClip = ClipKt.clip(companion2, RoundedCornerShapeKt.m700RoundedCornerShape0680j_4(Dp.m4104constructorimpl(f)));
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor3 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierClip);
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
                Updater.m1266setimpl(composerM1259constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl3, density3, companion4.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl3, viewConfiguration3, companion4.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf3.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                float f2 = 8;
                Modifier modifierM430paddingqDBjuR0$default = PaddingKt.m430paddingqDBjuR0$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), 0.0f, Dp.m4104constructorimpl(f2), 0.0f, 0.0f, 13, null);
                i7 = R$color.lib_base_colorBlack;
                BoxKt.Box(BackgroundKt.m162backgroundbw27NRU(modifierM430paddingqDBjuR0$default, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i7, composerStartRestartGroup, 0), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m700RoundedCornerShape0680j_4(Dp.m4104constructorimpl(f))), composerStartRestartGroup, 0);
                BoxKt.Box(BackgroundKt.background$default(PaddingKt.m430paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth(companion2, i6 / 100.0f), 0.0f, 1, null), 0.0f, Dp.m4104constructorimpl(f2), 0.0f, 0.0f, 13, null), Brush.Companion.m1567horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorKt.Color(4286438656L)), Color.m1608boximpl(ColorKt.Color(4279687754L))}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.m702RoundedCornerShapea9UjIt4$default(Dp.m4104constructorimpl(f), 0.0f, 0.0f, Dp.m4104constructorimpl(f), 6, null), 0.0f, 4, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion2, Dp.m4104constructorimpl(f)), composerStartRestartGroup, 6);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor4 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierFillMaxWidth$default);
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
                Updater.m1266setimpl(composerM1259constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, companion4.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl4, density4, companion4.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl4, layoutDirection4, companion4.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl4, viewConfiguration4, companion4.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf4.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                long sp = TextUnitKt.getSp(10);
                companion3 = FontWeight.INSTANCE;
                i8 = i6;
                TextKt.m1201Text4IGK_g("0", boxScopeInstance.align(companion2, companion.getCenterStart()), Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i7, composerStartRestartGroup, 0), 0.26f, 0.0f, 0.0f, 0.0f, 14, null), sp, (FontStyle) null, companion3.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(14), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199686, 6, 130000);
                if (1 <= i8 || i8 >= 100) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    composerStartRestartGroup.startReplaceableGroup(1263291204);
                    String str = i8 + "%";
                    long sp2 = TextUnitKt.getSp(10);
                    FontWeight normal = companion3.getNormal();
                    long jM1617copywmQWz5c$default = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i7, composerStartRestartGroup, 0), 0.26f, 0.0f, 0.0f, 0.0f, 14, null);
                    long sp3 = TextUnitKt.getSp(14);
                    int iM3998getCentere0LSkKk = TextAlign.INSTANCE.m3998getCentere0LSkKk();
                    Integer numValueOf2 = Integer.valueOf(i8);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$Progress$1$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // p010kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                return m4656invoke3p2s80s(measureScope, measurable, constraints.getValue());
                            }

                            @NotNull
                            /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
                            public final MeasureResult m4656invoke3p2s80s(@NotNull MeasureScope layout, @NotNull Measurable measurable, long j2) {
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                Intrinsics.checkNotNullParameter(measurable, "measurable");
                                final Placeable placeableMo3132measureBRTryo0 = measurable.mo3132measureBRTryo0(j2);
                                final int iCoerceIn = RangesKt___RangesKt.coerceIn(((int) ((Constraints.m4060getMaxWidthimpl(j2) * i8) / 100.0f)) - (placeableMo3132measureBRTryo0.getWidth() / 2), 0, Constraints.m4060getMaxWidthimpl(j2) - placeableMo3132measureBRTryo0.getWidth());
                                return MeasureScope.layout$default(layout, placeableMo3132measureBRTryo0.getWidth(), placeableMo3132measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$Progress$1$2$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // p010kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        invoke2(placementScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull Placeable.PlacementScope layout2) {
                                        Intrinsics.checkNotNullParameter(layout2, "$this$layout");
                                        Placeable.PlacementScope.placeRelative$default(layout2, placeableMo3132measureBRTryo0, iCoerceIn, 0, 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    TextKt.m1201Text4IGK_g(str, LayoutModifierKt.layout(companion2, (Function3) objRememberedValue), jM1617copywmQWz5c$default, sp2, (FontStyle) null, normal, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3991boximpl(iM3998getCentere0LSkKk), sp3, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 6, 129488);
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1263292302);
                    long sp4 = TextUnitKt.getSp(10);
                    FontWeight normal2 = companion3.getNormal();
                    long jM1617copywmQWz5c$default2 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i7, composerStartRestartGroup, 0), 0.26f, 0.0f, 0.0f, 0.0f, 14, null);
                    long sp5 = TextUnitKt.getSp(14);
                    Modifier modifierAlign2 = boxScopeInstance.align(companion2, companion.getCenterEnd());
                    composer2 = composerStartRestartGroup;
                    TextKt.m1201Text4IGK_g("100%", modifierAlign2, jM1617copywmQWz5c$default2, sp4, (FontStyle) null, normal2, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp5, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199686, 6, 130000);
                    composer2.endReplaceableGroup();
                }
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
                modifier2 = modifier3;
                i5 = i8;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$Progress$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i14) {
                    DayDetailKt.e(modifier2, i5, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
        i4 |= 48;
        i5 = i;
        if ((i4 & 91) == 18) {
            if (i9 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i10 != 0) {
                i6 = 50;
            } else {
                i6 = i5;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1162466703, i4, -1, "com.heytap.health.sunshine.ui.compose.Progress (DayDetail.kt:268)");
            }
            int i14 = i4 & 14;
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
            companion = Alignment.INSTANCE;
            int i15 = i14 >> 3;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(top2, companion.getStart(), composerStartRestartGroup, (i15 & 112) | (i15 & 14));
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            constructor = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifier3);
            int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
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
            Updater.m1266setimpl(composerM1259constructorimpl5, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl5, density5, companion5.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl5, layoutDirection5, companion5.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl5, viewConfiguration5, companion5.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf5.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i16 >> 3) & 112));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            companion2 = Modifier.INSTANCE;
            Modifier modifierM455height3ABfNKs2 = SizeKt.m455height3ABfNKs(companion2, Dp.m4104constructorimpl(30));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration6 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifierM455height3ABfNKs2);
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
            Updater.m1266setimpl(composerM1259constructorimpl6, measurePolicyRememberBoxMeasurePolicy4, companion5.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl6, density6, companion5.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl6, layoutDirection6, companion5.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl6, viewConfiguration6, companion5.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf6.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(353296818);
            if (i6 > 0) {
                Modifier modifierAlign3 = boxScopeInstance.align(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), companion.getTopStart());
                Integer numValueOf3 = Integer.valueOf(i6);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(numValueOf3);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$Progress$1$1$1$1
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
                            float fMo313toPx0680j_4 = Canvas.mo313toPx0680j_4(Dp.m4104constructorimpl(8));
                            float fMo313toPx0680j_5 = Canvas.mo313toPx0680j_4(Dp.m4104constructorimpl(6));
                            float fM1449getWidthimpl = Size.m1449getWidthimpl(Canvas.mo2153getSizeNHjbRc()) * (i6 / 100.0f);
                            Path Path = AndroidPath_androidKt.Path();
                            Path.moveTo(fM1449getWidthimpl, fMo313toPx0680j_5);
                            float f3 = fMo313toPx0680j_4 / 2;
                            Path.lineTo(fM1449getWidthimpl - f3, 0.0f);
                            Path.lineTo(fM1449getWidthimpl + f3, 0.0f);
                            Path.close();
                            DrawScope.m2144drawPathLG529CI$default(Canvas, Path, ColorKt.Color(swf.f(R$color.lib_base_colorBlack)), 0.0f, null, null, 0, 60, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$Progress$1$1$1$1
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
                            float fMo313toPx0680j_4 = Canvas.mo313toPx0680j_4(Dp.m4104constructorimpl(8));
                            float fMo313toPx0680j_5 = Canvas.mo313toPx0680j_4(Dp.m4104constructorimpl(6));
                            float fM1449getWidthimpl = Size.m1449getWidthimpl(Canvas.mo2153getSizeNHjbRc()) * (i6 / 100.0f);
                            Path Path = AndroidPath_androidKt.Path();
                            Path.moveTo(fM1449getWidthimpl, fMo313toPx0680j_5);
                            float f3 = fMo313toPx0680j_4 / 2;
                            Path.lineTo(fM1449getWidthimpl - f3, 0.0f);
                            Path.lineTo(fM1449getWidthimpl + f3, 0.0f);
                            Path.close();
                            DrawScope.m2144drawPathLG529CI$default(Canvas, Path, ColorKt.Color(swf.f(R$color.lib_base_colorBlack)), 0.0f, null, null, 0, 60, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierAlign3, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            float f3 = 4;
            Modifier modifierClip2 = ClipKt.clip(companion2, RoundedCornerShapeKt.m700RoundedCornerShape0680j_4(Dp.m4104constructorimpl(f3)));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration7 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor3 = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifierClip2);
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
            Composer composerM1259constructorimpl7 = Updater.m1259constructorimpl(composerStartRestartGroup);
            Updater.m1266setimpl(composerM1259constructorimpl7, measurePolicyRememberBoxMeasurePolicy5, companion5.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl7, density7, companion5.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl7, layoutDirection7, companion5.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl7, viewConfiguration7, companion5.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf7.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            float f4 = 8;
            Modifier modifierM430paddingqDBjuR0$default2 = PaddingKt.m430paddingqDBjuR0$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), 0.0f, Dp.m4104constructorimpl(f4), 0.0f, 0.0f, 13, null);
            i7 = R$color.lib_base_colorBlack;
            BoxKt.Box(BackgroundKt.m162backgroundbw27NRU(modifierM430paddingqDBjuR0$default2, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i7, composerStartRestartGroup, 0), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m700RoundedCornerShape0680j_4(Dp.m4104constructorimpl(f3))), composerStartRestartGroup, 0);
            BoxKt.Box(BackgroundKt.background$default(PaddingKt.m430paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth(companion2, i6 / 100.0f), 0.0f, 1, null), 0.0f, Dp.m4104constructorimpl(f4), 0.0f, 0.0f, 13, null), Brush.Companion.m1567horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorKt.Color(4286438656L)), Color.m1608boximpl(ColorKt.Color(4279687754L))}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.m702RoundedCornerShapea9UjIt4$default(Dp.m4104constructorimpl(f3), 0.0f, 0.0f, Dp.m4104constructorimpl(f3), 6, null), 0.0f, 4, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion2, Dp.m4104constructorimpl(f3)), composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density8 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection8 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration8 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor4 = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf8 = LayoutKt.materializerOf(modifierFillMaxWidth$default2);
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
            Composer composerM1259constructorimpl8 = Updater.m1259constructorimpl(composerStartRestartGroup);
            Updater.m1266setimpl(composerM1259constructorimpl8, measurePolicyRememberBoxMeasurePolicy6, companion5.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl8, density8, companion5.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl8, layoutDirection8, companion5.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl8, viewConfiguration8, companion5.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf8.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            long sp6 = TextUnitKt.getSp(10);
            companion3 = FontWeight.INSTANCE;
            i8 = i6;
            TextKt.m1201Text4IGK_g("0", boxScopeInstance.align(companion2, companion.getCenterStart()), Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i7, composerStartRestartGroup, 0), 0.26f, 0.0f, 0.0f, 0.0f, 14, null), sp6, (FontStyle) null, companion3.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(14), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199686, 6, 130000);
            if (1 <= i8) {
                z = false;
            } else {
                z = false;
            }
            if (z) {
                composerStartRestartGroup.startReplaceableGroup(1263291204);
                String str2 = i8 + "%";
                long sp7 = TextUnitKt.getSp(10);
                FontWeight normal3 = companion3.getNormal();
                long jM1617copywmQWz5c$default3 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i7, composerStartRestartGroup, 0), 0.26f, 0.0f, 0.0f, 0.0f, 14, null);
                long sp8 = TextUnitKt.getSp(14);
                int iM3998getCentere0LSkKk2 = TextAlign.INSTANCE.m3998getCentere0LSkKk();
                Integer numValueOf4 = Integer.valueOf(i8);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$Progress$1$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // p010kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                            return m4656invoke3p2s80s(measureScope, measurable, constraints.getValue());
                        }

                        @NotNull
                        /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
                        public final MeasureResult m4656invoke3p2s80s(@NotNull MeasureScope layout, @NotNull Measurable measurable, long j2) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            Intrinsics.checkNotNullParameter(measurable, "measurable");
                            final Placeable placeableMo3132measureBRTryo0 = measurable.mo3132measureBRTryo0(j2);
                            final int iCoerceIn = RangesKt___RangesKt.coerceIn(((int) ((Constraints.m4060getMaxWidthimpl(j2) * i8) / 100.0f)) - (placeableMo3132measureBRTryo0.getWidth() / 2), 0, Constraints.m4060getMaxWidthimpl(j2) - placeableMo3132measureBRTryo0.getWidth());
                            return MeasureScope.layout$default(layout, placeableMo3132measureBRTryo0.getWidth(), placeableMo3132measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$Progress$1$2$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // p010kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull Placeable.PlacementScope layout2) {
                                    Intrinsics.checkNotNullParameter(layout2, "$this$layout");
                                    Placeable.PlacementScope.placeRelative$default(layout2, placeableMo3132measureBRTryo0, iCoerceIn, 0, 0.0f, 4, null);
                                }
                            }, 4, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$Progress$1$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // p010kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                            return m4656invoke3p2s80s(measureScope, measurable, constraints.getValue());
                        }

                        @NotNull
                        /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
                        public final MeasureResult m4656invoke3p2s80s(@NotNull MeasureScope layout, @NotNull Measurable measurable, long j2) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            Intrinsics.checkNotNullParameter(measurable, "measurable");
                            final Placeable placeableMo3132measureBRTryo0 = measurable.mo3132measureBRTryo0(j2);
                            final int iCoerceIn = RangesKt___RangesKt.coerceIn(((int) ((Constraints.m4060getMaxWidthimpl(j2) * i8) / 100.0f)) - (placeableMo3132measureBRTryo0.getWidth() / 2), 0, Constraints.m4060getMaxWidthimpl(j2) - placeableMo3132measureBRTryo0.getWidth());
                            return MeasureScope.layout$default(layout, placeableMo3132measureBRTryo0.getWidth(), placeableMo3132measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$Progress$1$2$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // p010kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull Placeable.PlacementScope layout2) {
                                    Intrinsics.checkNotNullParameter(layout2, "$this$layout");
                                    Placeable.PlacementScope.placeRelative$default(layout2, placeableMo3132measureBRTryo0, iCoerceIn, 0, 0.0f, 4, null);
                                }
                            }, 4, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextKt.m1201Text4IGK_g(str2, LayoutModifierKt.layout(companion2, (Function3) objRememberedValue), jM1617copywmQWz5c$default3, sp7, (FontStyle) null, normal3, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3991boximpl(iM3998getCentere0LSkKk2), sp8, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 6, 129488);
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceableGroup(1263292302);
                long sp9 = TextUnitKt.getSp(10);
                FontWeight normal4 = companion3.getNormal();
                long jM1617copywmQWz5c$default4 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i7, composerStartRestartGroup, 0), 0.26f, 0.0f, 0.0f, 0.0f, 14, null);
                long sp10 = TextUnitKt.getSp(14);
                Modifier modifierAlign4 = boxScopeInstance.align(companion2, companion.getCenterEnd());
                composer2 = composerStartRestartGroup;
                TextKt.m1201Text4IGK_g("100%", modifierAlign4, jM1617copywmQWz5c$default4, sp9, (FontStyle) null, normal4, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp10, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199686, 6, 130000);
                composer2.endReplaceableGroup();
            }
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
            modifier2 = modifier3;
            i5 = i8;
        } else {
            if (i9 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i10 != 0) {
                i6 = 50;
            } else {
                i6 = i5;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1162466703, i4, -1, "com.heytap.health.sunshine.ui.compose.Progress (DayDetail.kt:268)");
            }
            int i17 = i4 & 14;
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement.Vertical top3 = Arrangement.INSTANCE.getTop();
            companion = Alignment.INSTANCE;
            int i18 = i17 >> 3;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(top3, companion.getStart(), composerStartRestartGroup, (i18 & 112) | (i18 & 14));
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density9 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection9 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration9 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            constructor = companion6.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf9 = LayoutKt.materializerOf(modifier3);
            int i19 = ((((i17 << 3) & 112) << 9) & 7168) | 6;
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
            Updater.m1266setimpl(composerM1259constructorimpl9, measurePolicyColumnMeasurePolicy3, companion6.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl9, density9, companion6.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl9, layoutDirection9, companion6.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl9, viewConfiguration9, companion6.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf9.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i19 >> 3) & 112));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            companion2 = Modifier.INSTANCE;
            Modifier modifierM455height3ABfNKs3 = SizeKt.m455height3ABfNKs(companion2, Dp.m4104constructorimpl(30));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density10 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection10 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration10 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion6.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf10 = LayoutKt.materializerOf(modifierM455height3ABfNKs3);
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
            Updater.m1266setimpl(composerM1259constructorimpl10, measurePolicyRememberBoxMeasurePolicy7, companion6.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl10, density10, companion6.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl10, layoutDirection10, companion6.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl10, viewConfiguration10, companion6.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf10.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(353296818);
            if (i6 > 0) {
                Modifier modifierAlign5 = boxScopeInstance.align(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), companion.getTopStart());
                Integer numValueOf5 = Integer.valueOf(i6);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(numValueOf5);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$Progress$1$1$1$1
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
                            float fMo313toPx0680j_4 = Canvas.mo313toPx0680j_4(Dp.m4104constructorimpl(8));
                            float fMo313toPx0680j_5 = Canvas.mo313toPx0680j_4(Dp.m4104constructorimpl(6));
                            float fM1449getWidthimpl = Size.m1449getWidthimpl(Canvas.mo2153getSizeNHjbRc()) * (i6 / 100.0f);
                            Path Path = AndroidPath_androidKt.Path();
                            Path.moveTo(fM1449getWidthimpl, fMo313toPx0680j_5);
                            float f5 = fMo313toPx0680j_4 / 2;
                            Path.lineTo(fM1449getWidthimpl - f5, 0.0f);
                            Path.lineTo(fM1449getWidthimpl + f5, 0.0f);
                            Path.close();
                            DrawScope.m2144drawPathLG529CI$default(Canvas, Path, ColorKt.Color(swf.f(R$color.lib_base_colorBlack)), 0.0f, null, null, 0, 60, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$Progress$1$1$1$1
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
                            float fMo313toPx0680j_4 = Canvas.mo313toPx0680j_4(Dp.m4104constructorimpl(8));
                            float fMo313toPx0680j_5 = Canvas.mo313toPx0680j_4(Dp.m4104constructorimpl(6));
                            float fM1449getWidthimpl = Size.m1449getWidthimpl(Canvas.mo2153getSizeNHjbRc()) * (i6 / 100.0f);
                            Path Path = AndroidPath_androidKt.Path();
                            Path.moveTo(fM1449getWidthimpl, fMo313toPx0680j_5);
                            float f5 = fMo313toPx0680j_4 / 2;
                            Path.lineTo(fM1449getWidthimpl - f5, 0.0f);
                            Path.lineTo(fM1449getWidthimpl + f5, 0.0f);
                            Path.close();
                            DrawScope.m2144drawPathLG529CI$default(Canvas, Path, ColorKt.Color(swf.f(R$color.lib_base_colorBlack)), 0.0f, null, null, 0, 60, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierAlign5, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            float f5 = 4;
            Modifier modifierClip3 = ClipKt.clip(companion2, RoundedCornerShapeKt.m700RoundedCornerShape0680j_4(Dp.m4104constructorimpl(f5)));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy8 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density11 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection11 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration11 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor3 = companion6.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11 = LayoutKt.materializerOf(modifierClip3);
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
            Composer composerM1259constructorimpl11 = Updater.m1259constructorimpl(composerStartRestartGroup);
            Updater.m1266setimpl(composerM1259constructorimpl11, measurePolicyRememberBoxMeasurePolicy8, companion6.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl11, density11, companion6.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl11, layoutDirection11, companion6.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl11, viewConfiguration11, companion6.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf11.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            float f6 = 8;
            Modifier modifierM430paddingqDBjuR0$default3 = PaddingKt.m430paddingqDBjuR0$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), 0.0f, Dp.m4104constructorimpl(f6), 0.0f, 0.0f, 13, null);
            i7 = R$color.lib_base_colorBlack;
            BoxKt.Box(BackgroundKt.m162backgroundbw27NRU(modifierM430paddingqDBjuR0$default3, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i7, composerStartRestartGroup, 0), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m700RoundedCornerShape0680j_4(Dp.m4104constructorimpl(f5))), composerStartRestartGroup, 0);
            BoxKt.Box(BackgroundKt.background$default(PaddingKt.m430paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth(companion2, i6 / 100.0f), 0.0f, 1, null), 0.0f, Dp.m4104constructorimpl(f6), 0.0f, 0.0f, 13, null), Brush.Companion.m1567horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorKt.Color(4286438656L)), Color.m1608boximpl(ColorKt.Color(4279687754L))}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.m702RoundedCornerShapea9UjIt4$default(Dp.m4104constructorimpl(f5), 0.0f, 0.0f, Dp.m4104constructorimpl(f5), 6, null), 0.0f, 4, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion2, Dp.m4104constructorimpl(f5)), composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy9 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density12 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection12 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration12 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor4 = companion6.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf12 = LayoutKt.materializerOf(modifierFillMaxWidth$default3);
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
            Composer composerM1259constructorimpl12 = Updater.m1259constructorimpl(composerStartRestartGroup);
            Updater.m1266setimpl(composerM1259constructorimpl12, measurePolicyRememberBoxMeasurePolicy9, companion6.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl12, density12, companion6.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl12, layoutDirection12, companion6.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl12, viewConfiguration12, companion6.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf12.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            long sp11 = TextUnitKt.getSp(10);
            companion3 = FontWeight.INSTANCE;
            i8 = i6;
            TextKt.m1201Text4IGK_g("0", boxScopeInstance.align(companion2, companion.getCenterStart()), Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i7, composerStartRestartGroup, 0), 0.26f, 0.0f, 0.0f, 0.0f, 14, null), sp11, (FontStyle) null, companion3.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(14), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199686, 6, 130000);
            if (1 <= i8) {
                z = false;
            } else {
                z = false;
            }
            if (z) {
                composerStartRestartGroup.startReplaceableGroup(1263291204);
                String str3 = i8 + "%";
                long sp12 = TextUnitKt.getSp(10);
                FontWeight normal5 = companion3.getNormal();
                long jM1617copywmQWz5c$default5 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i7, composerStartRestartGroup, 0), 0.26f, 0.0f, 0.0f, 0.0f, 14, null);
                long sp13 = TextUnitKt.getSp(14);
                int iM3998getCentere0LSkKk3 = TextAlign.INSTANCE.m3998getCentere0LSkKk();
                Integer numValueOf6 = Integer.valueOf(i8);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf6);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$Progress$1$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // p010kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                            return m4656invoke3p2s80s(measureScope, measurable, constraints.getValue());
                        }

                        @NotNull
                        /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
                        public final MeasureResult m4656invoke3p2s80s(@NotNull MeasureScope layout, @NotNull Measurable measurable, long j2) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            Intrinsics.checkNotNullParameter(measurable, "measurable");
                            final Placeable placeableMo3132measureBRTryo0 = measurable.mo3132measureBRTryo0(j2);
                            final int iCoerceIn = RangesKt___RangesKt.coerceIn(((int) ((Constraints.m4060getMaxWidthimpl(j2) * i8) / 100.0f)) - (placeableMo3132measureBRTryo0.getWidth() / 2), 0, Constraints.m4060getMaxWidthimpl(j2) - placeableMo3132measureBRTryo0.getWidth());
                            return MeasureScope.layout$default(layout, placeableMo3132measureBRTryo0.getWidth(), placeableMo3132measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$Progress$1$2$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // p010kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull Placeable.PlacementScope layout2) {
                                    Intrinsics.checkNotNullParameter(layout2, "$this$layout");
                                    Placeable.PlacementScope.placeRelative$default(layout2, placeableMo3132measureBRTryo0, iCoerceIn, 0, 0.0f, 4, null);
                                }
                            }, 4, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$Progress$1$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // p010kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                            return m4656invoke3p2s80s(measureScope, measurable, constraints.getValue());
                        }

                        @NotNull
                        /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
                        public final MeasureResult m4656invoke3p2s80s(@NotNull MeasureScope layout, @NotNull Measurable measurable, long j2) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            Intrinsics.checkNotNullParameter(measurable, "measurable");
                            final Placeable placeableMo3132measureBRTryo0 = measurable.mo3132measureBRTryo0(j2);
                            final int iCoerceIn = RangesKt___RangesKt.coerceIn(((int) ((Constraints.m4060getMaxWidthimpl(j2) * i8) / 100.0f)) - (placeableMo3132measureBRTryo0.getWidth() / 2), 0, Constraints.m4060getMaxWidthimpl(j2) - placeableMo3132measureBRTryo0.getWidth());
                            return MeasureScope.layout$default(layout, placeableMo3132measureBRTryo0.getWidth(), placeableMo3132measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$Progress$1$2$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // p010kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull Placeable.PlacementScope layout2) {
                                    Intrinsics.checkNotNullParameter(layout2, "$this$layout");
                                    Placeable.PlacementScope.placeRelative$default(layout2, placeableMo3132measureBRTryo0, iCoerceIn, 0, 0.0f, 4, null);
                                }
                            }, 4, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextKt.m1201Text4IGK_g(str3, LayoutModifierKt.layout(companion2, (Function3) objRememberedValue), jM1617copywmQWz5c$default5, sp12, (FontStyle) null, normal5, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3991boximpl(iM3998getCentere0LSkKk3), sp13, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 6, 129488);
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceableGroup(1263292302);
                long sp14 = TextUnitKt.getSp(10);
                FontWeight normal6 = companion3.getNormal();
                long jM1617copywmQWz5c$default6 = Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i7, composerStartRestartGroup, 0), 0.26f, 0.0f, 0.0f, 0.0f, 14, null);
                long sp15 = TextUnitKt.getSp(14);
                Modifier modifierAlign6 = boxScopeInstance.align(companion2, companion.getCenterEnd());
                composer2 = composerStartRestartGroup;
                TextKt.m1201Text4IGK_g("100%", modifierAlign6, jM1617copywmQWz5c$default6, sp14, (FontStyle) null, normal6, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp15, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199686, 6, 130000);
                composer2.endReplaceableGroup();
            }
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
            modifier2 = modifier3;
            i5 = i8;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$Progress$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i110) {
                DayDetailKt.e(modifier2, i5, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void f(int i, int i2, boolean z, @Nullable Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        final int i10;
        final int i11;
        final boolean z3;
        int i12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1708437815);
        int i13 = i4 & 1;
        if (i13 != 0) {
            i6 = i3 | 6;
            i5 = i;
        } else if ((i3 & 14) == 0) {
            i5 = i;
            i6 = (composerStartRestartGroup.changed(i5) ? 4 : 2) | i3;
        } else {
            i5 = i;
            i6 = i3;
        }
        int i14 = i4 & 2;
        if (i14 == 0) {
            if ((i3 & 112) == 0) {
                i7 = i2;
                i6 |= composerStartRestartGroup.changed(i7) ? 32 : 16;
            }
            i8 = i4 & 4;
            if (i8 != 0) {
                if ((i3 & 896) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i9 = 256;
                    } else {
                        i9 = 128;
                    }
                    i6 |= i9;
                }
                if ((i6 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                    if (i13 != 0) {
                        i10 = 20;
                    } else {
                        i10 = i5;
                    }
                    if (i14 != 0) {
                        i11 = 30;
                    } else {
                        i11 = i7;
                    }
                    if (i8 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1708437815, i6, -1, "com.heytap.health.sunshine.ui.compose.SunCircleProgress (DayDetail.kt:121)");
                    }
                    if (z3) {
                        i12 = i10;
                    } else {
                        i12 = 0;
                    }
                    b(i12, i11, ColorKt.Color(4294945830L), ColorKt.Color(4294954022L), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 870169033, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$SunCircleProgress$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p010kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i15) {
                            String str;
                            if ((i15 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(870169033, i15, -1, "com.heytap.health.sunshine.ui.compose.SunCircleProgress.<anonymous> (DayDetail.kt:131)");
                            }
                            Painter painterPainterResource = PainterResources_androidKt.painterResource(R$drawable.health_sunshine_progress_icon, composer2, 0);
                            long jColor = ColorKt.Color(4294954022L);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            IconKt.m1053Iconww6aTOc(painterPainterResource, (String) null, SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(42), 0.0f, 0.0f, 13, null), Dp.m4104constructorimpl(36)), jColor, composer2, 3512, 0);
                            SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion, Dp.m4104constructorimpl(4)), composer2, 6);
                            composer2.startReplaceableGroup(1849789825);
                            if (z3) {
                                str = i10 + StringResources_androidKt.stringResource(com.heytap.health.sunshine.R$string.health_sunshine_minutes_unit, composer2, 0);
                            } else {
                                str = "--";
                            }
                            composer2.endReplaceableGroup();
                            long sp = TextUnitKt.getSp(32);
                            FontWeight.Companion companion2 = FontWeight.INSTANCE;
                            FontWeight semiBold = companion2.getSemiBold();
                            int i16 = R$color.lib_base_colorBlack;
                            TextKt.m1201Text4IGK_g(str, (Modifier) null, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i16, composer2, 0), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), sp, (FontStyle) null, semiBold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(46), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 6, 130002);
                            SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion, Dp.m4104constructorimpl(2)), composer2, 6);
                            TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(com.heytap.health.sunshine.R$string.health_sunshine_target_minutes, new Object[]{Integer.valueOf(i11)}, composer2, 64), (Modifier) null, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i16, composer2, 0), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(14), (FontStyle) null, companion2.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(21), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 6, 130002);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, (i6 & 112) | 28032, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    i10 = i5;
                    i11 = i7;
                    z3 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i15 = i10;
                final int i16 = i11;
                final boolean z4 = z3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$SunCircleProgress$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p010kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i17) {
                        DayDetailKt.f(i15, i16, z4, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                    }
                });
            }
            i6 |= ModuleType.TYPE_SYSTEM_SETTING;
            z2 = z;
            if ((i6 & 731) == 146) {
                if (i13 != 0) {
                    i10 = 20;
                } else {
                    i10 = i5;
                }
                if (i14 != 0) {
                    i11 = 30;
                } else {
                    i11 = i7;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1708437815, i6, -1, "com.heytap.health.sunshine.ui.compose.SunCircleProgress (DayDetail.kt:121)");
                }
                if (z3) {
                    i12 = i10;
                } else {
                    i12 = 0;
                }
                b(i12, i11, ColorKt.Color(4294945830L), ColorKt.Color(4294954022L), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 870169033, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$SunCircleProgress$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p010kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i17) {
                        String str;
                        if ((i17 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(870169033, i17, -1, "com.heytap.health.sunshine.ui.compose.SunCircleProgress.<anonymous> (DayDetail.kt:131)");
                        }
                        Painter painterPainterResource = PainterResources_androidKt.painterResource(R$drawable.health_sunshine_progress_icon, composer2, 0);
                        long jColor = ColorKt.Color(4294954022L);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        IconKt.m1053Iconww6aTOc(painterPainterResource, (String) null, SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(42), 0.0f, 0.0f, 13, null), Dp.m4104constructorimpl(36)), jColor, composer2, 3512, 0);
                        SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion, Dp.m4104constructorimpl(4)), composer2, 6);
                        composer2.startReplaceableGroup(1849789825);
                        if (z3) {
                            str = i10 + StringResources_androidKt.stringResource(com.heytap.health.sunshine.R$string.health_sunshine_minutes_unit, composer2, 0);
                        } else {
                            str = "--";
                        }
                        composer2.endReplaceableGroup();
                        long sp = TextUnitKt.getSp(32);
                        FontWeight.Companion companion2 = FontWeight.INSTANCE;
                        FontWeight semiBold = companion2.getSemiBold();
                        int i18 = R$color.lib_base_colorBlack;
                        TextKt.m1201Text4IGK_g(str, (Modifier) null, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i18, composer2, 0), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), sp, (FontStyle) null, semiBold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(46), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 6, 130002);
                        SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion, Dp.m4104constructorimpl(2)), composer2, 6);
                        TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(com.heytap.health.sunshine.R$string.health_sunshine_target_minutes, new Object[]{Integer.valueOf(i11)}, composer2, 64), (Modifier) null, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i18, composer2, 0), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(14), (FontStyle) null, companion2.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(21), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 6, 130002);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i6 & 112) | 28032, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (i13 != 0) {
                    i10 = 20;
                } else {
                    i10 = i5;
                }
                if (i14 != 0) {
                    i11 = 30;
                } else {
                    i11 = i7;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1708437815, i6, -1, "com.heytap.health.sunshine.ui.compose.SunCircleProgress (DayDetail.kt:121)");
                }
                if (z3) {
                    i12 = i10;
                } else {
                    i12 = 0;
                }
                b(i12, i11, ColorKt.Color(4294945830L), ColorKt.Color(4294954022L), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 870169033, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$SunCircleProgress$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p010kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i17) {
                        String str;
                        if ((i17 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(870169033, i17, -1, "com.heytap.health.sunshine.ui.compose.SunCircleProgress.<anonymous> (DayDetail.kt:131)");
                        }
                        Painter painterPainterResource = PainterResources_androidKt.painterResource(R$drawable.health_sunshine_progress_icon, composer2, 0);
                        long jColor = ColorKt.Color(4294954022L);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        IconKt.m1053Iconww6aTOc(painterPainterResource, (String) null, SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(42), 0.0f, 0.0f, 13, null), Dp.m4104constructorimpl(36)), jColor, composer2, 3512, 0);
                        SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion, Dp.m4104constructorimpl(4)), composer2, 6);
                        composer2.startReplaceableGroup(1849789825);
                        if (z3) {
                            str = i10 + StringResources_androidKt.stringResource(com.heytap.health.sunshine.R$string.health_sunshine_minutes_unit, composer2, 0);
                        } else {
                            str = "--";
                        }
                        composer2.endReplaceableGroup();
                        long sp = TextUnitKt.getSp(32);
                        FontWeight.Companion companion2 = FontWeight.INSTANCE;
                        FontWeight semiBold = companion2.getSemiBold();
                        int i18 = R$color.lib_base_colorBlack;
                        TextKt.m1201Text4IGK_g(str, (Modifier) null, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i18, composer2, 0), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), sp, (FontStyle) null, semiBold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(46), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 6, 130002);
                        SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion, Dp.m4104constructorimpl(2)), composer2, 6);
                        TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(com.heytap.health.sunshine.R$string.health_sunshine_target_minutes, new Object[]{Integer.valueOf(i11)}, composer2, 64), (Modifier) null, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i18, composer2, 0), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(14), (FontStyle) null, companion2.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(21), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 6, 130002);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i6 & 112) | 28032, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final int i17 = i10;
            final int i18 = i11;
            final boolean z5 = z3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$SunCircleProgress$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i19) {
                    DayDetailKt.f(i17, i18, z5, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
        i6 |= 48;
        i7 = i2;
        i8 = i4 & 4;
        if (i8 != 0) {
            if ((i3 & 896) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i9 = 256;
                } else {
                    i9 = 128;
                }
                i6 |= i9;
            }
            if ((i6 & 731) == 146) {
                if (i13 != 0) {
                    i10 = 20;
                } else {
                    i10 = i5;
                }
                if (i14 != 0) {
                    i11 = 30;
                } else {
                    i11 = i7;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1708437815, i6, -1, "com.heytap.health.sunshine.ui.compose.SunCircleProgress (DayDetail.kt:121)");
                }
                if (z3) {
                    i12 = i10;
                } else {
                    i12 = 0;
                }
                b(i12, i11, ColorKt.Color(4294945830L), ColorKt.Color(4294954022L), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 870169033, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$SunCircleProgress$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p010kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i19) {
                        String str;
                        if ((i19 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(870169033, i19, -1, "com.heytap.health.sunshine.ui.compose.SunCircleProgress.<anonymous> (DayDetail.kt:131)");
                        }
                        Painter painterPainterResource = PainterResources_androidKt.painterResource(R$drawable.health_sunshine_progress_icon, composer2, 0);
                        long jColor = ColorKt.Color(4294954022L);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        IconKt.m1053Iconww6aTOc(painterPainterResource, (String) null, SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(42), 0.0f, 0.0f, 13, null), Dp.m4104constructorimpl(36)), jColor, composer2, 3512, 0);
                        SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion, Dp.m4104constructorimpl(4)), composer2, 6);
                        composer2.startReplaceableGroup(1849789825);
                        if (z3) {
                            str = i10 + StringResources_androidKt.stringResource(com.heytap.health.sunshine.R$string.health_sunshine_minutes_unit, composer2, 0);
                        } else {
                            str = "--";
                        }
                        composer2.endReplaceableGroup();
                        long sp = TextUnitKt.getSp(32);
                        FontWeight.Companion companion2 = FontWeight.INSTANCE;
                        FontWeight semiBold = companion2.getSemiBold();
                        int i110 = R$color.lib_base_colorBlack;
                        TextKt.m1201Text4IGK_g(str, (Modifier) null, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i110, composer2, 0), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), sp, (FontStyle) null, semiBold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(46), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 6, 130002);
                        SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion, Dp.m4104constructorimpl(2)), composer2, 6);
                        TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(com.heytap.health.sunshine.R$string.health_sunshine_target_minutes, new Object[]{Integer.valueOf(i11)}, composer2, 64), (Modifier) null, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i110, composer2, 0), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(14), (FontStyle) null, companion2.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(21), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 6, 130002);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i6 & 112) | 28032, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (i13 != 0) {
                    i10 = 20;
                } else {
                    i10 = i5;
                }
                if (i14 != 0) {
                    i11 = 30;
                } else {
                    i11 = i7;
                }
                if (i8 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1708437815, i6, -1, "com.heytap.health.sunshine.ui.compose.SunCircleProgress (DayDetail.kt:121)");
                }
                if (z3) {
                    i12 = i10;
                } else {
                    i12 = 0;
                }
                b(i12, i11, ColorKt.Color(4294945830L), ColorKt.Color(4294954022L), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 870169033, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$SunCircleProgress$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p010kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i19) {
                        String str;
                        if ((i19 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(870169033, i19, -1, "com.heytap.health.sunshine.ui.compose.SunCircleProgress.<anonymous> (DayDetail.kt:131)");
                        }
                        Painter painterPainterResource = PainterResources_androidKt.painterResource(R$drawable.health_sunshine_progress_icon, composer2, 0);
                        long jColor = ColorKt.Color(4294954022L);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        IconKt.m1053Iconww6aTOc(painterPainterResource, (String) null, SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(42), 0.0f, 0.0f, 13, null), Dp.m4104constructorimpl(36)), jColor, composer2, 3512, 0);
                        SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion, Dp.m4104constructorimpl(4)), composer2, 6);
                        composer2.startReplaceableGroup(1849789825);
                        if (z3) {
                            str = i10 + StringResources_androidKt.stringResource(com.heytap.health.sunshine.R$string.health_sunshine_minutes_unit, composer2, 0);
                        } else {
                            str = "--";
                        }
                        composer2.endReplaceableGroup();
                        long sp = TextUnitKt.getSp(32);
                        FontWeight.Companion companion2 = FontWeight.INSTANCE;
                        FontWeight semiBold = companion2.getSemiBold();
                        int i110 = R$color.lib_base_colorBlack;
                        TextKt.m1201Text4IGK_g(str, (Modifier) null, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i110, composer2, 0), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), sp, (FontStyle) null, semiBold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(46), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 6, 130002);
                        SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion, Dp.m4104constructorimpl(2)), composer2, 6);
                        TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(com.heytap.health.sunshine.R$string.health_sunshine_target_minutes, new Object[]{Integer.valueOf(i11)}, composer2, 64), (Modifier) null, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i110, composer2, 0), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(14), (FontStyle) null, companion2.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(21), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 6, 130002);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, (i6 & 112) | 28032, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final int i19 = i10;
            final int i110 = i11;
            final boolean z6 = z3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$SunCircleProgress$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i111) {
                    DayDetailKt.f(i19, i110, z6, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
        i6 |= ModuleType.TYPE_SYSTEM_SETTING;
        z2 = z;
        if ((i6 & 731) == 146) {
            if (i13 != 0) {
                i10 = 20;
            } else {
                i10 = i5;
            }
            if (i14 != 0) {
                i11 = 30;
            } else {
                i11 = i7;
            }
            if (i8 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1708437815, i6, -1, "com.heytap.health.sunshine.ui.compose.SunCircleProgress (DayDetail.kt:121)");
            }
            if (z3) {
                i12 = i10;
            } else {
                i12 = 0;
            }
            b(i12, i11, ColorKt.Color(4294945830L), ColorKt.Color(4294954022L), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 870169033, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$SunCircleProgress$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i111) {
                    String str;
                    if ((i111 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(870169033, i111, -1, "com.heytap.health.sunshine.ui.compose.SunCircleProgress.<anonymous> (DayDetail.kt:131)");
                    }
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(R$drawable.health_sunshine_progress_icon, composer2, 0);
                    long jColor = ColorKt.Color(4294954022L);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    IconKt.m1053Iconww6aTOc(painterPainterResource, (String) null, SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(42), 0.0f, 0.0f, 13, null), Dp.m4104constructorimpl(36)), jColor, composer2, 3512, 0);
                    SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion, Dp.m4104constructorimpl(4)), composer2, 6);
                    composer2.startReplaceableGroup(1849789825);
                    if (z3) {
                        str = i10 + StringResources_androidKt.stringResource(com.heytap.health.sunshine.R$string.health_sunshine_minutes_unit, composer2, 0);
                    } else {
                        str = "--";
                    }
                    composer2.endReplaceableGroup();
                    long sp = TextUnitKt.getSp(32);
                    FontWeight.Companion companion2 = FontWeight.INSTANCE;
                    FontWeight semiBold = companion2.getSemiBold();
                    int i112 = R$color.lib_base_colorBlack;
                    TextKt.m1201Text4IGK_g(str, (Modifier) null, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i112, composer2, 0), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), sp, (FontStyle) null, semiBold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(46), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 6, 130002);
                    SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion, Dp.m4104constructorimpl(2)), composer2, 6);
                    TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(com.heytap.health.sunshine.R$string.health_sunshine_target_minutes, new Object[]{Integer.valueOf(i11)}, composer2, 64), (Modifier) null, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i112, composer2, 0), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(14), (FontStyle) null, companion2.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(21), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 6, 130002);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, (i6 & 112) | 28032, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i13 != 0) {
                i10 = 20;
            } else {
                i10 = i5;
            }
            if (i14 != 0) {
                i11 = 30;
            } else {
                i11 = i7;
            }
            if (i8 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1708437815, i6, -1, "com.heytap.health.sunshine.ui.compose.SunCircleProgress (DayDetail.kt:121)");
            }
            if (z3) {
                i12 = i10;
            } else {
                i12 = 0;
            }
            b(i12, i11, ColorKt.Color(4294945830L), ColorKt.Color(4294954022L), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 870169033, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$SunCircleProgress$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i111) {
                    String str;
                    if ((i111 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(870169033, i111, -1, "com.heytap.health.sunshine.ui.compose.SunCircleProgress.<anonymous> (DayDetail.kt:131)");
                    }
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(R$drawable.health_sunshine_progress_icon, composer2, 0);
                    long jColor = ColorKt.Color(4294954022L);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    IconKt.m1053Iconww6aTOc(painterPainterResource, (String) null, SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(42), 0.0f, 0.0f, 13, null), Dp.m4104constructorimpl(36)), jColor, composer2, 3512, 0);
                    SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion, Dp.m4104constructorimpl(4)), composer2, 6);
                    composer2.startReplaceableGroup(1849789825);
                    if (z3) {
                        str = i10 + StringResources_androidKt.stringResource(com.heytap.health.sunshine.R$string.health_sunshine_minutes_unit, composer2, 0);
                    } else {
                        str = "--";
                    }
                    composer2.endReplaceableGroup();
                    long sp = TextUnitKt.getSp(32);
                    FontWeight.Companion companion2 = FontWeight.INSTANCE;
                    FontWeight semiBold = companion2.getSemiBold();
                    int i112 = R$color.lib_base_colorBlack;
                    TextKt.m1201Text4IGK_g(str, (Modifier) null, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i112, composer2, 0), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), sp, (FontStyle) null, semiBold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(46), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 6, 130002);
                    SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion, Dp.m4104constructorimpl(2)), composer2, 6);
                    TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(com.heytap.health.sunshine.R$string.health_sunshine_target_minutes, new Object[]{Integer.valueOf(i11)}, composer2, 64), (Modifier) null, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i112, composer2, 0), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(14), (FontStyle) null, companion2.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(21), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 6, 130002);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, (i6 & 112) | 28032, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final int i111 = i10;
        final int i112 = i11;
        final boolean z7 = z3;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$SunCircleProgress$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i113) {
                DayDetailKt.f(i111, i112, z7, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void g(@Nullable List<SunshineAdviceItem> list, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Object next;
        int i4;
        int i5;
        int i6;
        int i7;
        Composer composer2;
        Integer uvIndex;
        Composer composer3;
        final List<SunshineAdviceItem> list2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-944518889);
        int i8 = i2 & 1;
        int i9 = i8 != 0 ? i | 2 : i;
        if (i8 == 1 && (i9 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            list2 = list;
            composer3 = composerStartRestartGroup;
        } else {
            List<SunshineAdviceItem> listEmptyList = i8 != 0 ? CollectionsKt__CollectionsKt.emptyList() : list;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-944518889, i, -1, "com.heytap.health.sunshine.ui.compose.SunshineAdvice (DayDetail.kt:394)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(listEmptyList, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(0L, 0L), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(mutableState2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new DayDetailKt$SunshineAdvice$1$1(mutableState, mutableState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 70);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion2, Dp.m4104constructorimpl(16)), composerStartRestartGroup, 6);
            Modifier modifierM = StatDataAnalyzeKt.m(SizeKt.wrapContentHeight$default(companion2, null, false, 3, null));
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM);
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
            Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl, density, companion4.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion4.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion4.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            Alignment.Vertical centerVertically = companion3.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierFillMaxWidth$default);
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
            Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion4.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion4.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion4.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Modifier modifierWeight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, companion2, 1.0f, false, 2, null);
            String strStringResource = StringResources_androidKt.stringResource(com.heytap.health.sunshine.R$string.health_sunshine_advice_title_label, composerStartRestartGroup, 0);
            long sp = TextUnitKt.getSp(16);
            FontWeight.Companion companion5 = FontWeight.INSTANCE;
            FontWeight medium = companion5.getMedium();
            int i10 = R$color.lib_base_colorBlack;
            List<SunshineAdviceItem> list3 = listEmptyList;
            TextKt.m1201Text4IGK_g(strStringResource, modifierWeight$default, ColorResources_androidKt.colorResource(i10, composerStartRestartGroup, 0), sp, (FontStyle) null, medium, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131024);
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R$drawable.health_sunshine_info_icon, composerStartRestartGroup, 0);
            long jColorResource = ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black, composerStartRestartGroup, 0);
            Modifier modifierM469size3ABfNKs = SizeKt.m469size3ABfNKs(companion2, Dp.m4104constructorimpl(20));
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            IconKt.m1053Iconww6aTOc(painterPainterResource, (String) null, ClickableKt.m185clickableO2vRcR0$default(modifierM469size3ABfNKs, (MutableInteractionSource) objRememberedValue4, null, false, null, null, new Function0<Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$SunshineAdvice$2$1$2
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
                    DayDetailKt.F(context);
                }
            }, 28, null), jColorResource, composerStartRestartGroup, 56, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            DividerKt.m1008DivideroMI9zvI(PaddingKt.m428paddingVpY3zN4$default(companion2, 0.0f, Dp.m4104constructorimpl(12), 1, null), Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i10, composerStartRestartGroup, 0), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl((float) 0.33d), 0.0f, composerStartRestartGroup, 390, 8);
            if (h(mutableState).isEmpty()) {
                composerStartRestartGroup.startReplaceableGroup(1886919595);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxWidth$default2);
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
                Updater.m1266setimpl(composerM1259constructorimpl3, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl3, density3, companion4.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl3, viewConfiguration3, companion4.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf3.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                i3 = 14;
                composer2 = composerStartRestartGroup;
                TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(com.heytap.health.sunshine.R$string.health_sunshine_advice_empty_title, composerStartRestartGroup, 0), (Modifier) null, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i10, composerStartRestartGroup, 0), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(20), (FontStyle) null, companion5.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
                SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion2, Dp.m4104constructorimpl(4)), composer2, 6);
                TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(com.heytap.health.sunshine.R$string.health_sunshine_advice_empty_desc, composer2, 0), (Modifier) null, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i10, composer2, 0), 0.54f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 6, 130034);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            } else {
                i3 = 14;
                composerStartRestartGroup.startReplaceableGroup(1886920384);
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierFillMaxWidth$default3);
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
                Updater.m1266setimpl(composerM1259constructorimpl4, measurePolicyColumnMeasurePolicy3, companion4.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl4, density4, companion4.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl4, layoutDirection4, companion4.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl4, viewConfiguration4, companion4.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf4.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                long jCurrentTimeMillis = System.currentTimeMillis();
                Pair<Long, Long> pairJ = j(mutableState2);
                long jLongValue = pairJ.component1().longValue();
                long jLongValue2 = pairJ.component2().longValue();
                boolean z = jLongValue > 0 && jLongValue2 > 0 && jCurrentTimeMillis > jLongValue2;
                boolean z2 = jLongValue > 0 && jLongValue2 > 0 && jCurrentTimeMillis < jLongValue;
                int i11 = Calendar.getInstance().get(11);
                Iterator<T> it = h(mutableState).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((SunshineAdviceItem) next).getHour() == i11));
                SunshineAdviceItem sunshineAdviceItem = (SunshineAdviceItem) next;
                int iIntValue = (sunshineAdviceItem == null || (uvIndex = sunshineAdviceItem.getUvIndex()) == null) ? 0 : uvIndex.intValue();
                if (z) {
                    i6 = com.heytap.health.sunshine.R$string.health_sunshine_green_rest_moment;
                    i7 = com.heytap.health.sunshine.R$string.health_sunshine_advice_night_desc;
                } else if (z2) {
                    i6 = com.heytap.health.sunshine.R$string.health_sunshine_dawn_moment;
                    i7 = com.heytap.health.sunshine.R$string.health_sunshine_advice_dawn_desc;
                } else {
                    if (iIntValue >= 0 && iIntValue < 3) {
                        i6 = com.heytap.health.sunshine.R$string.health_sunshine_advice_level_0_2_title;
                        i7 = com.heytap.health.sunshine.R$string.health_sunshine_advice_level_0_2_desc;
                    } else {
                        if (3 <= iIntValue && iIntValue < 6) {
                            i6 = com.heytap.health.sunshine.R$string.health_sunshine_advice_level_3_5_title;
                            i7 = com.heytap.health.sunshine.R$string.health_sunshine_advice_level_3_5_desc;
                        } else {
                            if (6 <= iIntValue && iIntValue < 8) {
                                i4 = com.heytap.health.sunshine.R$string.health_sunshine_advice_level_6_7_title;
                                i5 = com.heytap.health.sunshine.R$string.health_sunshine_advice_level_6_7_desc;
                            } else {
                                if (8 <= iIntValue && iIntValue < 11) {
                                    i4 = com.heytap.health.sunshine.R$string.health_sunshine_advice_level_8_10_title;
                                    i5 = com.heytap.health.sunshine.R$string.health_sunshine_advice_level_8_10_desc;
                                } else {
                                    i4 = com.heytap.health.sunshine.R$string.health_sunshine_advice_level_11_plus_title;
                                    i5 = com.heytap.health.sunshine.R$string.health_sunshine_advice_level_11_plus_desc;
                                }
                            }
                        }
                        String strStringResource2 = StringResources_androidKt.stringResource(i4, composerStartRestartGroup, 0);
                        long sp2 = TextUnitKt.getSp(20);
                        FontWeight medium2 = FontWeight.INSTANCE.getMedium();
                        int i12 = R$color.lib_base_colorBlack;
                        composer2 = composerStartRestartGroup;
                        TextKt.m1201Text4IGK_g(strStringResource2, (Modifier) null, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i12, composerStartRestartGroup, 0), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), sp2, (FontStyle) null, medium2, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
                        SpacerKt.Spacer(SizeKt.m455height3ABfNKs(Modifier.INSTANCE, Dp.m4104constructorimpl(4)), composer2, 6);
                        TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(i5, composer2, 0), (Modifier) null, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i12, composer2, 0), 0.54f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 6, 130034);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                }
                i5 = i7;
                i4 = i6;
                String strStringResource3 = StringResources_androidKt.stringResource(i4, composerStartRestartGroup, 0);
                long sp3 = TextUnitKt.getSp(20);
                FontWeight medium3 = FontWeight.INSTANCE.getMedium();
                int i13 = R$color.lib_base_colorBlack;
                composer2 = composerStartRestartGroup;
                TextKt.m1201Text4IGK_g(strStringResource3, (Modifier) null, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i13, composerStartRestartGroup, 0), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), sp3, (FontStyle) null, medium3, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
                SpacerKt.Spacer(SizeKt.m455height3ABfNKs(Modifier.INSTANCE, Dp.m4104constructorimpl(4)), composer2, 6);
                TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(i5, composer2, 0), (Modifier) null, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i13, composer2, 0), 0.54f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 6, 130034);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            }
            Modifier modifierM455height3ABfNKs = SizeKt.m455height3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m4104constructorimpl(i3), 0.0f, 0.0f, 13, null), Dp.m4104constructorimpl(152));
            composer3 = composer2;
            composer3.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
            composer3.startReplaceableGroup(-1323940314);
            Density density5 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection5 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration5 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierM455height3ABfNKs);
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor5);
            } else {
                composer3.useNode();
            }
            composer3.disableReusing();
            Composer composerM1259constructorimpl5 = Updater.m1259constructorimpl(composer3);
            Updater.m1266setimpl(composerM1259constructorimpl5, measurePolicyRememberBoxMeasurePolicy, companion6.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl5, density5, companion6.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl5, layoutDirection5, companion6.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl5, viewConfiguration5, companion6.getSetViewConfiguration());
            composer3.enableReusing();
            function3MaterializerOf5.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer3)), composer3, 0);
            composer3.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            l(h(mutableState), composer3, 8);
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            list2 = list3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$SunshineAdvice$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                invoke(composer4, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer4, int i14) {
                DayDetailKt.g(list2, composer4, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    public static final List<SunshineAdviceItem> h(MutableState<List<SunshineAdviceItem>> mutableState) {
        return mutableState.getValue();
    }

    public static final void i(MutableState<List<SunshineAdviceItem>> mutableState, List<SunshineAdviceItem> list) {
        mutableState.setValue(list);
    }

    public static final Pair<Long, Long> j(MutableState<Pair<Long, Long>> mutableState) {
        return mutableState.getValue();
    }

    public static final void k(MutableState<Pair<Long, Long>> mutableState, Pair<Long, Long> pair) {
        mutableState.setValue(pair);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void l(@NotNull final List<SunshineAdviceItem> items, @Nullable Composer composer, final int i) {
        Integer numValueOf;
        final List<SunshineAdviceItem> list;
        Composer composer2;
        Intrinsics.checkNotNullParameter(items, "items");
        Composer composerStartRestartGroup = composer.startRestartGroup(1551420331);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1551420331, i, -1, "com.heytap.health.sunshine.ui.compose.SunshineAdviceChart (DayDetail.kt:592)");
        }
        Iterator<T> it = items.iterator();
        if (it.hasNext()) {
            Integer uvIndex = ((SunshineAdviceItem) it.next()).getUvIndex();
            numValueOf = Integer.valueOf(uvIndex != null ? uvIndex.intValue() : 0);
            while (it.hasNext()) {
                Integer uvIndex2 = ((SunshineAdviceItem) it.next()).getUvIndex();
                Integer numValueOf2 = Integer.valueOf(uvIndex2 != null ? uvIndex2.intValue() : 0);
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
        } else {
            numValueOf = null;
        }
        Integer num = numValueOf;
        final int iMax = Math.max(8, num != null ? num.intValue() : 0);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(items);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(-1, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged2 = composerStartRestartGroup.changed(items);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m1369boximpl(OffsetKt.Offset(0.0f, 0.0f)), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final MutableState mutableState2 = (MutableState) objRememberedValue2;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m4256boximpl(IntSize.INSTANCE.m4269getZeroYbymL2g()), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final MutableState mutableState3 = (MutableState) objRememberedValue3;
        final boolean zIsEmpty = items.isEmpty();
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            int hour = LocalDateTime.now().getHour();
            IntRange intRangeUntil = RangesKt___RangesKt.until(0, 7);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it2 = intRangeUntil.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(((IntIterator) it2).nextInt() + hour));
            }
            composerStartRestartGroup.updateRememberedValue(arrayList);
            objRememberedValue4 = arrayList;
        }
        composerStartRestartGroup.endReplaceableGroup();
        final List list2 = (List) objRememberedValue4;
        final int size = zIsEmpty ? list2.size() : items.size();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierM428paddingVpY3zN4$default = PaddingKt.m428paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), Dp.m4104constructorimpl(16), 0.0f, 2, null);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged3 = composerStartRestartGroup.changed(mutableState3);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue5 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$SunshineAdviceChart$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                    m4657invokeozmzZPI(intSize.getPackedValue());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                public final void m4657invokeozmzZPI(long j2) {
                    DayDetailKt.r(mutableState3, j2);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(OnRemeasuredModifierKt.onSizeChanged(modifierM428paddingVpY3zN4$default, (Function1) objRememberedValue5), items, IntSize.m4256boximpl(q(mutableState3)), new DayDetailKt$SunshineAdviceChart$2(items, iMax, mutableState3, mutableState, null));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierPointerInput);
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
        Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl, density, companion4.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion4.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion4.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        final long jColorResource = ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_white, composerStartRestartGroup, 0);
        final long jColorResource2 = ColorResources_androidKt.colorResource(com.heytap.health.ui.R$color.black_10alpha, composerStartRestartGroup, 0);
        CanvasKt.Canvas(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), new Function1<DrawScope, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$SunshineAdviceChart$3$1
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
                float f;
                DayDetailKt$SunshineAdviceChart$3$1 dayDetailKt$SunshineAdviceChart$3$1;
                ArrayList arrayList2;
                float f2;
                ArrayList arrayList3;
                int i2;
                int i3;
                DrawScope drawScope;
                Paint paint;
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                float fM1449getWidthimpl = Size.m1449getWidthimpl(Canvas.mo2153getSizeNHjbRc());
                float fMo313toPx0680j_4 = Canvas.mo313toPx0680j_4(Dp.m4104constructorimpl(40));
                float fMo313toPx0680j_5 = Canvas.mo313toPx0680j_4(Dp.m4104constructorimpl(0));
                float fM1446getHeightimpl = (Size.m1446getHeightimpl(Canvas.mo2153getSizeNHjbRc()) - fMo313toPx0680j_4) - fMo313toPx0680j_5;
                int i4 = size;
                float f3 = i4 > 1 ? fM1449getWidthimpl / (i4 - 1) : 0.0f;
                List<SunshineAdviceItem> list3 = items;
                int i5 = iMax;
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                int i6 = 0;
                for (Object obj : list3) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    float f4 = i6 * f3;
                    float f5 = fMo313toPx0680j_5 + fM1446getHeightimpl;
                    Integer uvIndex3 = ((SunshineAdviceItem) obj).getUvIndex();
                    arrayList4.add(Offset.m1369boximpl(OffsetKt.Offset(f4, f5 - (((uvIndex3 != null ? uvIndex3.intValue() : 0) / i5) * fM1446getHeightimpl))));
                    i6 = i7;
                }
                float f6 = 4;
                PathEffect pathEffectDashPathEffect = PathEffect.Companion.dashPathEffect(new float[]{Canvas.mo313toPx0680j_4(Dp.m4104constructorimpl(f6)), Canvas.mo313toPx0680j_4(Dp.m4104constructorimpl(f6))}, 0.0f);
                long j2 = jColorResource2;
                float f7 = fMo313toPx0680j_5 + fM1446getHeightimpl;
                float f8 = 1;
                float f9 = fMo313toPx0680j_5;
                DrawScope.m2140drawLineNGM6Ib0$default(Canvas, j2, OffsetKt.Offset(0.0f, fMo313toPx0680j_5), OffsetKt.Offset(fM1449getWidthimpl, fMo313toPx0680j_5), Canvas.mo313toPx0680j_4(Dp.m4104constructorimpl(f8)), 0, pathEffectDashPathEffect, 0.0f, null, 0, 464, null);
                float f10 = f7;
                DrawScope.m2140drawLineNGM6Ib0$default(Canvas, j2, OffsetKt.Offset(0.0f, f7), OffsetKt.Offset(fM1449getWidthimpl, f7), Canvas.mo313toPx0680j_4(Dp.m4104constructorimpl(f8)), 0, pathEffectDashPathEffect, 0.0f, null, 0, 464, null);
                DayDetailKt$SunshineAdviceChart$3$1 dayDetailKt$SunshineAdviceChart$3$2 = this;
                DrawScope drawScope2 = Canvas;
                if (zIsEmpty) {
                    int i8 = 0;
                    while (i8 < size) {
                        float f11 = i8 * f3;
                        float f12 = f9;
                        int i9 = i8;
                        float f13 = f10;
                        DayDetailKt$SunshineAdviceChart$3$1 dayDetailKt$SunshineAdviceChart$3$3 = dayDetailKt$SunshineAdviceChart$3$2;
                        DrawScope.m2140drawLineNGM6Ib0$default(Canvas, j2, OffsetKt.Offset(f11, f12), OffsetKt.Offset(f11, f10), drawScope2.mo313toPx0680j_4(Dp.m4104constructorimpl(f8)), 0, pathEffectDashPathEffect, 0.0f, null, 0, 464, null);
                        int iIntValue = list2.get(i9).intValue();
                        String string = context.getString(com.heytap.health.sunshine.R$string.health_sunshine_hour_suffix_2, Integer.valueOf(iIntValue));
                        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…hine_hour_suffix_2, hour)");
                        if (i9 != 0) {
                            string = String.valueOf(iIntValue);
                        }
                        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(Canvas.getDrawContext().getCanvas());
                        drawScope2 = Canvas;
                        float fM1446getHeightimpl2 = Size.m1446getHeightimpl(Canvas.mo2153getSizeNHjbRc()) - drawScope2.mo313toPx0680j_4(Dp.m4104constructorimpl(5));
                        Paint paint2 = new Paint();
                        paint2.setColor(swf.f(com.heytap.health.health_base.R$color.health_base_black_26alpha));
                        paint2.setTextSize(drawScope2.mo312toPxR2X_6o(TextUnitKt.getSp(10)));
                        paint2.setTextAlign(Paint.Align.CENTER);
                        Unit unit = Unit.INSTANCE;
                        nativeCanvas.drawText(string, f11, fM1446getHeightimpl2, paint2);
                        i8 = i9 + 1;
                        f9 = f12;
                        dayDetailKt$SunshineAdviceChart$3$2 = dayDetailKt$SunshineAdviceChart$3$3;
                        f10 = f13;
                    }
                    f = f10;
                    dayDetailKt$SunshineAdviceChart$3$1 = dayDetailKt$SunshineAdviceChart$3$2;
                } else {
                    f = f10;
                    dayDetailKt$SunshineAdviceChart$3$1 = dayDetailKt$SunshineAdviceChart$3$2;
                    float f14 = f9;
                    if (!arrayList4.isEmpty()) {
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            long packedValue = ((Offset) it3.next()).getPackedValue();
                            float f15 = f14;
                            float f16 = f;
                            DrawScope.m2140drawLineNGM6Ib0$default(Canvas, j2, OffsetKt.Offset(Offset.m1380getXimpl(packedValue), f15), OffsetKt.Offset(Offset.m1380getXimpl(packedValue), f16), drawScope2.mo313toPx0680j_4(Dp.m4104constructorimpl(f8)), 0, pathEffectDashPathEffect, 0.0f, null, 0, 464, null);
                            drawScope2 = Canvas;
                            f14 = f15;
                            f = f16;
                        }
                    }
                }
                float f17 = f;
                if (DayDetailKt.m(mutableState) == -1 || DayDetailKt.m(mutableState) >= arrayList4.size()) {
                    arrayList2 = arrayList4;
                    f2 = f17;
                } else {
                    long packedValue2 = ((Offset) arrayList4.get(DayDetailKt.m(mutableState))).getPackedValue();
                    DayDetailKt.p(mutableState2, packedValue2);
                    f2 = f17;
                    arrayList2 = arrayList4;
                    DrawScope.m2140drawLineNGM6Ib0$default(Canvas, ColorKt.Color(4292401368L), OffsetKt.Offset(Offset.m1380getXimpl(packedValue2), Offset.m1381getYimpl(packedValue2)), OffsetKt.Offset(Offset.m1380getXimpl(packedValue2), f17), Canvas.mo313toPx0680j_4(Dp.m4104constructorimpl(f8)), 0, pathEffectDashPathEffect, 0.0f, null, 0, 464, null);
                }
                if (!arrayList2.isEmpty()) {
                    List<SunshineAdviceItem> list4 = items;
                    i2 = 10;
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                    Iterator<T> it4 = list4.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(Color.m1608boximpl(DayDetailKt.H(((SunshineAdviceItem) it4.next()).getUvIndex())));
                    }
                    Path Path = AndroidPath_androidKt.Path();
                    arrayList3 = arrayList2;
                    i3 = 0;
                    Path.moveTo(Offset.m1380getXimpl(((Offset) arrayList3.get(0)).getPackedValue()), Offset.m1381getYimpl(((Offset) arrayList3.get(0)).getPackedValue()));
                    int size2 = arrayList3.size() - 1;
                    int i10 = 0;
                    while (i10 < size2) {
                        i10++;
                        long packedValue3 = ((Offset) arrayList3.get(i10)).getPackedValue();
                        Path.lineTo(Offset.m1380getXimpl(packedValue3), Offset.m1381getYimpl(packedValue3));
                    }
                    float f18 = f2;
                    Path.lineTo(Offset.m1380getXimpl(((Offset) CollectionsKt___CollectionsKt.last((List) arrayList3)).getPackedValue()), f18);
                    Path.lineTo(Offset.m1380getXimpl(((Offset) arrayList3.get(0)).getPackedValue()), f18);
                    Path.close();
                    Brush.Companion companion5 = Brush.INSTANCE;
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
                    Iterator it5 = arrayList5.iterator();
                    while (it5.hasNext()) {
                        arrayList6.add(Color.m1608boximpl(Color.m1617copywmQWz5c$default(((Color) it5.next()).m1628unboximpl(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null)));
                    }
                    DrawScope.m2143drawPathGBMwjPU$default(Canvas, Path, Brush.Companion.m1567horizontalGradient8A3gB4$default(companion5, arrayList6, Offset.m1380getXimpl(((Offset) CollectionsKt___CollectionsKt.first((List) arrayList3)).getPackedValue()), Offset.m1380getXimpl(((Offset) CollectionsKt___CollectionsKt.last((List) arrayList3)).getPackedValue()), 0, 8, (Object) null), 0.0f, null, null, 0, 60, null);
                } else {
                    arrayList3 = arrayList2;
                    i2 = 10;
                    i3 = 0;
                }
                if (arrayList3.size() >= 2) {
                    List<SunshineAdviceItem> list5 = items;
                    ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, i2));
                    Iterator<T> it6 = list5.iterator();
                    while (it6.hasNext()) {
                        arrayList7.add(Color.m1608boximpl(DayDetailKt.H(((SunshineAdviceItem) it6.next()).getUvIndex())));
                    }
                    DrawScope drawScope3 = Canvas;
                    float fMo313toPx0680j_6 = drawScope3.mo313toPx0680j_4(Dp.m4104constructorimpl(2));
                    int size3 = arrayList3.size() - 1;
                    int i11 = i3;
                    while (i11 < size3) {
                        long packedValue4 = ((Offset) arrayList3.get(i11)).getPackedValue();
                        int i12 = i11 + 1;
                        long packedValue5 = ((Offset) arrayList3.get(i12)).getPackedValue();
                        DrawScope.m2139drawLine1RTmtNc$default(Canvas, Brush.Companion.m1569linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(((Color) arrayList7.get(i11)).m1628unboximpl()), Color.m1608boximpl(((Color) arrayList7.get(i12)).m1628unboximpl())}), packedValue4, packedValue5, 0, 8, (Object) null), packedValue4, packedValue5, fMo313toPx0680j_6, StrokeCap.Companion.m1962getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                        drawScope3 = drawScope3;
                        size3 = size3;
                        arrayList7 = arrayList7;
                        i3 = i3;
                        arrayList3 = arrayList3;
                        i11 = i12;
                    }
                    drawScope = drawScope3;
                } else {
                    drawScope = Canvas;
                }
                int i13 = i3;
                List<SunshineAdviceItem> list6 = items;
                long j3 = jColorResource;
                Context context2 = context;
                MutableState<Integer> mutableState4 = mutableState;
                int i14 = i13;
                for (Object obj2 : arrayList3) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    long packedValue6 = ((Offset) obj2).getPackedValue();
                    SunshineAdviceItem sunshineAdviceItem = list6.get(i14);
                    int i16 = i14 == DayDetailKt.m(mutableState4) ? 1 : i13;
                    long jH = DayDetailKt.H(sunshineAdviceItem.getUvIndex());
                    if (i16 != 0) {
                        DrawScope.m2135drawCircleVaOC9Bg$default(Canvas, j3, drawScope.mo313toPx0680j_4(Dp.m4104constructorimpl(18)), packedValue6, 0.0f, null, null, 0, 120, null);
                        DrawScope.m2135drawCircleVaOC9Bg$default(Canvas, jH, drawScope.mo313toPx0680j_4(Dp.m4104constructorimpl(16)), packedValue6, 0.0f, null, null, 0, 120, null);
                        paint = new Paint();
                        paint.setColor(-1);
                        paint.setTextSize(drawScope.mo312toPxR2X_6o(TextUnitKt.getSp(16)));
                        paint.setTextAlign(Paint.Align.CENTER);
                        paint.setTypeface(Typeface.DEFAULT_BOLD);
                    } else {
                        DrawScope.m2135drawCircleVaOC9Bg$default(Canvas, jH, drawScope.mo313toPx0680j_4(Dp.m4104constructorimpl(14)), packedValue6, 0.0f, new Stroke(drawScope.mo313toPx0680j_4(Dp.m4104constructorimpl(f8)), 0.0f, 0, 0, null, 30, null), null, 0, 104, null);
                        DrawScope.m2135drawCircleVaOC9Bg$default(Canvas, j3, drawScope.mo313toPx0680j_4(Dp.m4104constructorimpl(13)), packedValue6, 0.0f, null, null, 0, 120, null);
                        paint = new Paint();
                        paint.setColor(ColorKt.m1672toArgb8_81llA(jH));
                        paint.setTextSize(drawScope.mo312toPxR2X_6o(TextUnitKt.getSp(12)));
                        paint.setTextAlign(Paint.Align.CENTER);
                        paint.setTypeface(Typeface.DEFAULT_BOLD);
                    }
                    AndroidCanvas_androidKt.getNativeCanvas(Canvas.getDrawContext().getCanvas()).drawText(String.valueOf(sunshineAdviceItem.getUvIndex()), Offset.m1380getXimpl(packedValue6), Offset.m1381getYimpl(packedValue6) - ((paint.ascent() + paint.descent()) / 2), paint);
                    String string2 = context2.getString(com.heytap.health.sunshine.R$string.health_sunshine_hour_suffix_2, Integer.valueOf(sunshineAdviceItem.getHour()));
                    Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…hour_suffix_2, item.hour)");
                    if (i14 != 0) {
                        string2 = String.valueOf(sunshineAdviceItem.getHour());
                    }
                    Canvas nativeCanvas2 = AndroidCanvas_androidKt.getNativeCanvas(Canvas.getDrawContext().getCanvas());
                    float fM1380getXimpl = Offset.m1380getXimpl(packedValue6);
                    float fM1446getHeightimpl3 = Size.m1446getHeightimpl(Canvas.mo2153getSizeNHjbRc()) - drawScope.mo313toPx0680j_4(Dp.m4104constructorimpl(5));
                    Paint paint3 = new Paint();
                    paint3.setColor(swf.f(com.heytap.health.health_base.R$color.health_base_black_26alpha));
                    paint3.setTextSize(drawScope.mo312toPxR2X_6o(TextUnitKt.getSp(10)));
                    paint3.setTextAlign(Paint.Align.CENTER);
                    Unit unit2 = Unit.INSTANCE;
                    nativeCanvas2.drawText(string2, fM1380getXimpl, fM1446getHeightimpl3, paint3);
                    context2 = context2;
                    i14 = i15;
                    mutableState4 = mutableState4;
                    list6 = list6;
                }
            }
        }, composerStartRestartGroup, 6);
        if (m(mutableState) < 0 || m(mutableState) >= items.size()) {
            list = items;
            composer2 = composerStartRestartGroup;
        } else {
            list = items;
            SunshineAdviceItem sunshineAdviceItem = list.get(m(mutableState));
            final Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            boolean zChanged4 = composerStartRestartGroup.changed(mutableState3) | composerStartRestartGroup.changed(density2) | composerStartRestartGroup.changed(mutableState2);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$SunshineAdviceChart$3$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // p010kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                        return m4659invoke3p2s80s(measureScope, measurable, constraints.getValue());
                    }

                    @NotNull
                    /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
                    public final MeasureResult m4659invoke3p2s80s(@NotNull MeasureScope layout, @NotNull Measurable measurable, long j2) {
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        Intrinsics.checkNotNullParameter(measurable, "measurable");
                        final Placeable placeableMo3132measureBRTryo0 = measurable.mo3132measureBRTryo0(j2);
                        float fM4264getWidthimpl = IntSize.m4264getWidthimpl(DayDetailKt.q(mutableState3));
                        float fM4263getHeightimpl = IntSize.m4263getHeightimpl(DayDetailKt.q(mutableState3));
                        float fMo313toPx0680j_4 = density2.mo313toPx0680j_4(Dp.m4104constructorimpl(18));
                        float fMo313toPx0680j_5 = density2.mo313toPx0680j_4(Dp.m4104constructorimpl(8));
                        final Ref.FloatRef floatRef = new Ref.FloatRef();
                        float fM1380getXimpl = Offset.m1380getXimpl(DayDetailKt.o(mutableState2)) - (placeableMo3132measureBRTryo0.getWidth() / 2);
                        floatRef.element = fM1380getXimpl;
                        floatRef.element = RangesKt___RangesKt.coerceIn(fM1380getXimpl, -fMo313toPx0680j_4, RangesKt___RangesKt.coerceAtLeast(fM4264getWidthimpl - placeableMo3132measureBRTryo0.getWidth(), 0.0f) + fMo313toPx0680j_4);
                        final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                        float fM1381getYimpl = ((Offset.m1381getYimpl(DayDetailKt.o(mutableState2)) - fMo313toPx0680j_4) - fMo313toPx0680j_5) - placeableMo3132measureBRTryo0.getHeight();
                        floatRef2.element = fM1381getYimpl;
                        if (fM1381getYimpl < 0.0f) {
                            floatRef2.element = Offset.m1381getYimpl(DayDetailKt.o(mutableState2)) + fMo313toPx0680j_4 + fMo313toPx0680j_5;
                        }
                        floatRef2.element = RangesKt___RangesKt.coerceAtMost(floatRef2.element, RangesKt___RangesKt.coerceAtLeast(fM4263getHeightimpl - placeableMo3132measureBRTryo0.getHeight(), 0.0f));
                        return MeasureScope.layout$default(layout, placeableMo3132measureBRTryo0.getWidth(), placeableMo3132measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$SunshineAdviceChart$3$2$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p010kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Placeable.PlacementScope layout2) {
                                Intrinsics.checkNotNullParameter(layout2, "$this$layout");
                                Placeable.PlacementScope.placeRelative$default(layout2, placeableMo3132measureBRTryo0, MathKt__MathJVMKt.roundToInt(floatRef.element), MathKt__MathJVMKt.roundToInt(floatRef2.element), 0.0f, 4, null);
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            float f = 4;
            Modifier modifierM427paddingVpY3zN4 = PaddingKt.m427paddingVpY3zN4(BorderKt.m173borderxT4_qwU(BackgroundKt.m162backgroundbw27NRU(LayoutModifierKt.layout(companion2, (Function3) objRememberedValue6), ColorResources_androidKt.colorResource(R$color.lib_base_space_card_bg, composerStartRestartGroup, 0), RoundedCornerShapeKt.m700RoundedCornerShape0680j_4(Dp.m4104constructorimpl(f))), Dp.m4104constructorimpl((float) 0.5d), ColorKt.Color(4293651435L), RoundedCornerShapeKt.m700RoundedCornerShape0680j_4(Dp.m4104constructorimpl(f))), Dp.m4104constructorimpl(8), Dp.m4104constructorimpl(6));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM427paddingVpY3zN4);
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
            Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl2, density3, companion4.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion4.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion4.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            int i2 = com.heytap.health.sunshine.R$string.health_sunshine_tooltip_pattern;
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(sunshineAdviceItem.getHour());
            objArr[1] = sunshineAdviceItem.getWeather();
            objArr[2] = sunshineAdviceItem.getTemperature() != null ? String.valueOf(sunshineAdviceItem.getTemperature()) : "--";
            composer2 = composerStartRestartGroup;
            TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(i2, objArr, composerStartRestartGroup, 64), (Modifier) null, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(R$color.lib_base_colorBlack, composer2, 0), 0.54f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
        }
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$SunshineAdviceChart$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num2) {
                invoke(composer3, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i3) {
                DayDetailKt.l(list, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    public static final int m(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    public static final void n(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    public static final long o(MutableState<Offset> mutableState) {
        return mutableState.getValue().getPackedValue();
    }

    public static final void p(MutableState<Offset> mutableState, long j2) {
        mutableState.setValue(Offset.m1369boximpl(j2));
    }

    public static final long q(MutableState<IntSize> mutableState) {
        return mutableState.getValue().getPackedValue();
    }

    public static final void r(MutableState<IntSize> mutableState, long j2) {
        mutableState.setValue(IntSize.m4256boximpl(j2));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:35:0x0137  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:41:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:42:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:45:0x0336  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void s(@Nullable SunshineStat sunshineStat, @Nullable Composer composer, final int i, final int i2) {
        final SunshineStat sunshineStat2;
        Function0<ComposeUiNode> constructor;
        Object objRememberedValue;
        Function0<ComposeUiNode> constructor2;
        Composer composer2;
        final SunshineStat sunshineStat3;
        Composer composerStartRestartGroup = composer.startRestartGroup(193961762);
        int i3 = i2 & 1;
        int i4 = i3 != 0 ? i | 2 : i;
        if (i3 == 1 && (i4 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            sunshineStat3 = sunshineStat;
            composer2 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i3 != 0) {
                    sunshineStat2 = new SunshineStat(null, null, null, 0, 0, 0, 0, 0, 0L, 0, 0, 0, 0, 8191, null);
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(193961762, i, -1, "com.heytap.health.sunshine.ui.compose.VitaminDView (DayDetail.kt:201)");
                }
                int vitaminD = sunshineStat2.getVitaminD();
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM = StatDataAnalyzeKt.m(SizeKt.wrapContentHeight$default(companion, null, false, 3, null));
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
                constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM);
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
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM185clickableO2vRcR0$default = ClickableKt.m185clickableO2vRcR0$default(companion, (MutableInteractionSource) objRememberedValue, null, false, null, null, new Function0<Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$VitaminDView$1$2
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
                        e1.d().b("/sunshine/VitaminDActivity").withLong("jump_date", o15.a(sunshineStat2.getDate())).navigation();
                    }
                }, 28, null);
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion3.getConstructor();
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
                Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion3.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                Modifier modifierWeight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
                String strStringResource = StringResources_androidKt.stringResource(com.heytap.health.sunshine.R$string.health_sunshine_vitamin_d_synthesis, composerStartRestartGroup, 0);
                long sp = TextUnitKt.getSp(16);
                FontWeight.Companion companion4 = FontWeight.INSTANCE;
                FontWeight medium = companion4.getMedium();
                int i5 = R$color.lib_base_colorBlack;
                SunshineStat sunshineStat4 = sunshineStat2;
                TextKt.m1201Text4IGK_g(strStringResource, modifierWeight$default, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i5, composerStartRestartGroup, 0), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), sp, (FontStyle) null, medium, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131024);
                float f = 14;
                IconKt.m1053Iconww6aTOc(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_arrow_right, composerStartRestartGroup, 0), "", SizeKt.m469size3ABfNKs(companion, Dp.m4104constructorimpl(f)), ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composerStartRestartGroup, 0), composerStartRestartGroup, UploadStateAware.HTTP_DECRYPT_FAILED, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                DividerKt.m1008DivideroMI9zvI(PaddingKt.m428paddingVpY3zN4$default(companion, 0.0f, Dp.m4104constructorimpl(12), 1, null), Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i5, composerStartRestartGroup, 0), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl((float) 0.33d), 0.0f, composerStartRestartGroup, 390, 8);
                TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(com.heytap.health.sunshine.R$string.health_sunshine_vitamin_d_synthesis_description, new Object[]{Integer.valueOf(vitaminD)}, composerStartRestartGroup, 64), (Modifier) null, ColorResources_androidKt.colorResource(R$color.lib_base_black_55alpha, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, companion4.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 6, 130002);
                composer2 = composerStartRestartGroup;
                SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion, Dp.m4104constructorimpl(f)), composer2, 6);
                e(companion, Math.min(vitaminD, 100), composer2, 6, 0);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                sunshineStat3 = sunshineStat4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            sunshineStat2 = sunshineStat;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(193961762, i, -1, "com.heytap.health.sunshine.ui.compose.VitaminDView (DayDetail.kt:201)");
            }
            int vitaminD2 = sunshineStat2.getVitaminD();
            Modifier.Companion companion5 = Modifier.INSTANCE;
            Modifier modifierM2 = StatDataAnalyzeKt.m(SizeKt.wrapContentHeight$default(companion5, null, false, 3, null));
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion6 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(top2, companion6.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
            constructor = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierM2);
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
            Updater.m1266setimpl(composerM1259constructorimpl3, measurePolicyColumnMeasurePolicy2, companion7.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl3, density3, companion7.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl3, layoutDirection3, companion7.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl3, viewConfiguration3, companion7.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf3.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM185clickableO2vRcR0$default2 = ClickableKt.m185clickableO2vRcR0$default(companion5, (MutableInteractionSource) objRememberedValue, null, false, null, null, new Function0<Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$VitaminDView$1$2
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
                    e1.d().b("/sunshine/VitaminDActivity").withLong("jump_date", o15.a(sunshineStat2.getDate())).navigation();
                }
            }, 28, null);
            Alignment.Vertical centerVertically2 = companion6.getCenterVertically();
            Arrangement.HorizontalOrVertical spaceBetween2 = arrangement2.getSpaceBetween();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically2, composerStartRestartGroup, 54);
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
            Updater.m1266setimpl(composerM1259constructorimpl4, measurePolicyRowMeasurePolicy2, companion7.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl4, density4, companion7.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl4, layoutDirection4, companion7.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl4, viewConfiguration4, companion7.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf4.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Modifier modifierWeight$default2 = RowScope.weight$default(RowScopeInstance.INSTANCE, companion5, 1.0f, false, 2, null);
            String strStringResource2 = StringResources_androidKt.stringResource(com.heytap.health.sunshine.R$string.health_sunshine_vitamin_d_synthesis, composerStartRestartGroup, 0);
            long sp2 = TextUnitKt.getSp(16);
            FontWeight.Companion companion8 = FontWeight.INSTANCE;
            FontWeight medium2 = companion8.getMedium();
            int i6 = R$color.lib_base_colorBlack;
            SunshineStat sunshineStat5 = sunshineStat2;
            TextKt.m1201Text4IGK_g(strStringResource2, modifierWeight$default2, Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i6, composerStartRestartGroup, 0), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), sp2, (FontStyle) null, medium2, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131024);
            float f2 = 14;
            IconKt.m1053Iconww6aTOc(PainterResources_androidKt.painterResource(com.heytap.health.base.R$drawable.lib_base_ic_arrow_right, composerStartRestartGroup, 0), "", SizeKt.m469size3ABfNKs(companion5, Dp.m4104constructorimpl(f2)), ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composerStartRestartGroup, 0), composerStartRestartGroup, UploadStateAware.HTTP_DECRYPT_FAILED, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            DividerKt.m1008DivideroMI9zvI(PaddingKt.m428paddingVpY3zN4$default(companion5, 0.0f, Dp.m4104constructorimpl(12), 1, null), Color.m1617copywmQWz5c$default(ColorResources_androidKt.colorResource(i6, composerStartRestartGroup, 0), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Dp.m4104constructorimpl((float) 0.33d), 0.0f, composerStartRestartGroup, 390, 8);
            TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(com.heytap.health.sunshine.R$string.health_sunshine_vitamin_d_synthesis_description, new Object[]{Integer.valueOf(vitaminD2)}, composerStartRestartGroup, 64), (Modifier) null, ColorResources_androidKt.colorResource(R$color.lib_base_black_55alpha, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, companion8.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 6, 130002);
            composer2 = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m455height3ABfNKs(companion5, Dp.m4104constructorimpl(f2)), composer2, 6);
            e(companion5, Math.min(vitaminD2, 100), composer2, 6, 0);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            sunshineStat3 = sunshineStat5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.sunshine.ui.compose.DayDetailKt$VitaminDView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i7) {
                DayDetailKt.s(sunshineStat3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }
}