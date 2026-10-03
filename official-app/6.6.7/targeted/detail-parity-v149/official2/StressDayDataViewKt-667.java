package com.heytap.health.hrv.ui.item;

import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.DividerKt;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.profileinstaller.ProfileVerifier;
import com.coui.appcompat.imageview.COUIRoundImageView;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalAchievement;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalStat;
import com.heytap.health.account.AccountUserInfo;
import com.heytap.health.core.operation.space.SpaceView;
import com.heytap.health.hrv.R$color;
import com.heytap.health.hrv.R$drawable;
import com.heytap.health.hrv.R$plurals;
import com.heytap.health.hrv.R$string;
import com.heytap.health.hrv.constant.HrvConstant;
import com.heytap.health.hrv.hrv.HrvHistoryActivity;
import com.heytap.health.hrv.ui.achievement.AchievementHistoryActivity;
import com.heytap.health.hrv.ui.detail.StressDetailDescriptionActivity;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.buf;
import com.oplus.aiunit.vision.c7n;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.kr8;
import com.oplus.aiunit.vision.l05;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.puk;
import com.oplus.aiunit.vision.swf;
import com.oplus.aiunit.vision.th7;
import com.oplus.aiunit.vision.xmk;
import com.oplus.aiunit.vision.z5a;
import com.oplus.backup.sdk.common.utils.ModuleType;
import com.oplus.drs.core.net.entity.UploadStateAware;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.random.Random;
import p010kotlin.ranges.IntRange;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0001\u0010\u0002\u001a;\u0010\b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\f\u0010\u0010\u001a\u00020\u000f*\u00020\u000fH\u0002\u001a\u001f\u0010\u0012\u001a\u00020\u00002\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001aI\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u001d\u0010!\u001a\u00020\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003H\u0003¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010$\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bH\u0003¢\u0006\u0004\b$\u0010%\u001a1\u0010*\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b*\u0010+\u001a1\u0010/\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010-H\u0003¢\u0006\u0004\b/\u00100\u001a\u0017\u00103\u001a\u00020\u00002\u0006\u00102\u001a\u000201H\u0003¢\u0006\u0004\b3\u00104\u001a\u001d\u00107\u001a\u00020\u00002\f\u00106\u001a\b\u0012\u0004\u0012\u0002050\u0003H\u0003¢\u0006\u0004\b7\u0010\"\u001a\u0017\u00109\u001a\u00020\u00002\u0006\u00108\u001a\u000205H\u0003¢\u0006\u0004\b9\u0010:\u001a\u000f\u0010;\u001a\u00020\u0000H\u0007¢\u0006\u0004\b;\u0010\u0002\u001a\u0017\u0010=\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u000bH\u0007¢\u0006\u0004\b=\u0010>\u001a+\u0010B\u001a\u00020\u0014*\u00020\u00142\b\b\u0002\u0010@\u001a\u00020?2\b\b\u0002\u0010A\u001a\u00020?ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010C\u001a\u000f\u0010D\u001a\u00020\u0000H\u0007¢\u0006\u0004\bD\u0010\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006E"}, d2 = {"", "o", "(Landroidx/compose/runtime/Composer;I)V", "Landroidx/lifecycle/LiveData;", "", "", "percentLD", "countsLD", "n", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;Landroidx/compose/runtime/Composer;II)V", "titleID", "", "content", LogFieldKey.LEVEL_KEY, "(ILjava/lang/String;Landroidx/compose/runtime/Composer;I)V", "", "G", ParserTag.TAG_PERCENT, MapSchema.FIELD_NAME_KEY, "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Brush;", "gradient", "i", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/runtime/Composer;II)V", "statusContentLD", "statusPercentLD", "increaseLD", "", "isFamily", LogFieldKey.MESSAGE_KEY, "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;ZLandroidx/compose/runtime/Composer;II)V", MapSchema.FIELD_NAME_ENTRY, "(Landroidx/lifecycle/LiveData;Landroidx/compose/runtime/Composer;I)V", "index", c7n.g, "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Landroid/content/Context;", "context", "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;", "statLD", "f", "(Landroid/content/Context;Landroidx/lifecycle/LiveData;ZLandroidx/compose/runtime/Composer;II)V", "title", "Lkotlin/Function0;", ParserTag.TAG_ONCLICK, c7n.f, "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lcom/heytap/health/core/operation/space/SpaceView;", "spaceView", "j", "(Lcom/heytap/health/core/operation/space/SpaceView;Landroidx/compose/runtime/Composer;I)V", "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalAchievement;", "dataLD", "a", "data", "b", "(Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalAchievement;Landroidx/compose/runtime/Composer;I)V", "c", "text", "d", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/Dp;", "paddingHorizontal", "paddingVertical", "H", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "r", "hrv_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStressDayDataView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StressDayDataView.kt\ncom/heytap/health/hrv/ui/item/StressDayDataViewKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 11 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1068:1\n76#2:1069\n76#2:1084\n76#2:1121\n76#2:1160\n76#2:1201\n76#2:1237\n76#2:1271\n76#2:1304\n76#2:1343\n76#2:1404\n76#2:1438\n76#2:1471\n76#2:1510\n76#2:1554\n76#2:1607\n76#2:1644\n76#2:1723\n76#2:1772\n76#2:1805\n76#2:1849\n76#2:1859\n76#2:1892\n76#2:1926\n76#2:1959\n76#2:2004\n76#2:2053\n76#2:2088\n76#2:2122\n76#2:2161\n76#2:2211\n76#2:2220\n76#2:2254\n25#3:1070\n460#3,13:1096\n473#3,3:1112\n460#3,13:1133\n473#3,3:1147\n460#3,13:1172\n473#3,3:1186\n460#3,13:1213\n460#3,13:1249\n460#3,13:1283\n460#3,13:1316\n473#3,3:1330\n460#3,13:1355\n473#3,3:1369\n473#3,3:1374\n473#3,3:1379\n473#3,3:1384\n25#3:1389\n460#3,13:1416\n460#3,13:1450\n460#3,13:1483\n473#3,3:1497\n460#3,13:1522\n473#3,3:1536\n473#3,3:1541\n460#3,13:1566\n25#3:1580\n36#3:1590\n460#3,13:1619\n460#3,13:1656\n36#3:1670\n473#3,3:1677\n473#3,3:1682\n473#3,3:1687\n473#3,3:1692\n460#3,13:1735\n473#3,3:1751\n25#3:1757\n36#3:1764\n460#3,13:1784\n460#3,13:1817\n473#3,3:1831\n473#3,3:1837\n25#3:1842\n460#3,13:1871\n460#3,13:1904\n460#3,13:1938\n460#3,13:1971\n473#3,3:1985\n473#3,3:1991\n460#3,13:2016\n473#3,3:2030\n473#3,3:2035\n473#3,3:2040\n460#3,13:2065\n460#3,13:2100\n460#3,13:2134\n473#3,3:2148\n460#3,13:2173\n473#3,3:2191\n473#3,3:2196\n473#3,3:2201\n460#3,13:2232\n460#3,13:2266\n473#3,3:2280\n473#3,3:2285\n1114#4,6:1071\n1114#4,6:1390\n1114#4,6:1581\n1114#4,6:1591\n1114#4,6:1671\n1114#4,6:1758\n1114#4,6:1843\n74#5,6:1077\n80#5:1109\n84#5:1116\n74#5,6:1194\n80#5:1226\n74#5,6:1230\n80#5:1262\n74#5,6:1297\n80#5:1329\n84#5:1334\n84#5:1383\n84#5:1388\n74#5,6:1397\n80#5:1429\n74#5,6:1464\n80#5:1496\n84#5:1501\n84#5:1696\n74#5,6:1716\n80#5:1748\n84#5:1755\n74#5,6:1885\n80#5:1917\n84#5:2039\n74#5,6:2081\n80#5:2113\n84#5:2200\n73#5,7:2212\n80#5:2245\n84#5:2289\n75#6:1083\n76#6,11:1085\n89#6:1115\n75#6:1120\n76#6,11:1122\n89#6:1150\n75#6:1159\n76#6,11:1161\n89#6:1189\n75#6:1200\n76#6,11:1202\n75#6:1236\n76#6,11:1238\n75#6:1270\n76#6,11:1272\n75#6:1303\n76#6,11:1305\n89#6:1333\n75#6:1342\n76#6,11:1344\n89#6:1372\n89#6:1377\n89#6:1382\n89#6:1387\n75#6:1403\n76#6,11:1405\n75#6:1437\n76#6,11:1439\n75#6:1470\n76#6,11:1472\n89#6:1500\n75#6:1509\n76#6,11:1511\n89#6:1539\n89#6:1544\n75#6:1553\n76#6,11:1555\n75#6:1606\n76#6,11:1608\n75#6:1643\n76#6,11:1645\n89#6:1680\n89#6:1685\n89#6:1690\n89#6:1695\n75#6:1722\n76#6,11:1724\n89#6:1754\n75#6:1771\n76#6,11:1773\n75#6:1804\n76#6,11:1806\n89#6:1834\n89#6:1840\n75#6:1858\n76#6,11:1860\n75#6:1891\n76#6,11:1893\n75#6:1925\n76#6,11:1927\n75#6:1958\n76#6,11:1960\n89#6:1988\n89#6:1994\n75#6:2003\n76#6,11:2005\n89#6:2033\n89#6:2038\n89#6:2043\n75#6:2052\n76#6,11:2054\n75#6:2087\n76#6,11:2089\n75#6:2121\n76#6,11:2123\n89#6:2151\n75#6:2160\n76#6,11:2162\n89#6:2194\n89#6:2199\n89#6:2204\n75#6:2219\n76#6,11:2221\n75#6:2253\n76#6,11:2255\n89#6:2283\n89#6:2288\n164#7:1110\n154#7:1111\n154#7:1117\n154#7:1191\n154#7:1192\n154#7:1193\n164#7:1227\n154#7:1228\n154#7:1229\n154#7:1396\n154#7:1430\n154#7:1546\n154#7:1587\n154#7:1588\n154#7:1589\n154#7:1597\n154#7:1599\n154#7:1633\n154#7:1634\n154#7:1635\n154#7:1636\n164#7:1749\n154#7:1750\n154#7:1756\n154#7:1836\n154#7:1850\n154#7:1851\n154#7:1918\n154#7:1990\n154#7:2079\n154#7:2080\n154#7:2153\n154#7:2187\n154#7:2188\n154#7:2189\n154#7:2190\n154#7:2206\n154#7:2207\n154#7:2208\n154#7:2209\n154#7:2210\n154#7:2246\n79#8,2:1118\n81#8:1146\n85#8:1151\n74#8,7:1152\n81#8:1185\n85#8:1190\n74#8,7:1263\n81#8:1296\n74#8,7:1335\n81#8:1368\n85#8:1373\n85#8:1378\n75#8,6:1431\n81#8:1463\n74#8,7:1502\n81#8:1535\n85#8:1540\n85#8:1545\n75#8,6:1765\n81#8:1797\n85#8:1841\n75#8,6:1919\n81#8:1951\n85#8:1995\n74#8,7:2045\n81#8:2078\n74#8,7:2114\n81#8:2147\n85#8:2152\n85#8:2205\n67#9,6:1547\n73#9:1579\n67#9,6:1600\n73#9:1632\n67#9,6:1637\n73#9:1669\n77#9:1681\n77#9:1686\n77#9:1691\n67#9,6:1798\n73#9:1830\n77#9:1835\n67#9,6:1852\n73#9:1884\n67#9,6:1952\n73#9:1984\n77#9:1989\n66#9,7:1996\n73#9:2029\n77#9:2034\n77#9:2044\n67#9,6:2154\n73#9:2186\n77#9:2195\n67#9,6:2247\n73#9:2279\n77#9:2284\n51#10:1598\n1098#11:1697\n927#11,6:1698\n927#11,6:1704\n927#11,6:1710\n76#12:2290\n102#12,2:2291\n*S KotlinDebug\n*F\n+ 1 StressDayDataView.kt\ncom/heytap/health/hrv/ui/item/StressDayDataViewKt\n*L\n211#1:1069\n282#1:1084\n345#1:1121\n375#1:1160\n445#1:1201\n467#1:1237\n470#1:1271\n473#1:1304\n499#1:1343\n527#1:1404\n537#1:1438\n541#1:1471\n569#1:1510\n578#1:1554\n612#1:1607\n626#1:1644\n700#1:1723\n783#1:1772\n791#1:1805\n829#1:1849\n830#1:1859\n853#1:1892\n856#1:1926\n861#1:1959\n881#1:2004\n895#1:2053\n911#1:2088\n916#1:2122\n954#1:2161\n1030#1:2211\n1054#1:2220\n1055#1:2254\n213#1:1070\n282#1:1096,13\n282#1:1112,3\n345#1:1133,13\n345#1:1147,3\n375#1:1172,13\n375#1:1186,3\n445#1:1213,13\n467#1:1249,13\n470#1:1283,13\n473#1:1316,13\n473#1:1330,3\n499#1:1355,13\n499#1:1369,3\n470#1:1374,3\n467#1:1379,3\n445#1:1384,3\n524#1:1389\n527#1:1416,13\n537#1:1450,13\n541#1:1483,13\n541#1:1497,3\n569#1:1522,13\n569#1:1536,3\n537#1:1541,3\n578#1:1566,13\n581#1:1580\n598#1:1590\n612#1:1619,13\n626#1:1656,13\n642#1:1670\n626#1:1677,3\n612#1:1682,3\n578#1:1687,3\n527#1:1692,3\n700#1:1735,13\n700#1:1751,3\n788#1:1757\n788#1:1764\n783#1:1784,13\n791#1:1817,13\n791#1:1831,3\n783#1:1837,3\n827#1:1842\n830#1:1871,13\n853#1:1904,13\n856#1:1938,13\n861#1:1971,13\n861#1:1985,3\n856#1:1991,3\n881#1:2016,13\n881#1:2030,3\n853#1:2035,3\n830#1:2040,3\n895#1:2065,13\n911#1:2100,13\n916#1:2134,13\n916#1:2148,3\n954#1:2173,13\n954#1:2191,3\n911#1:2196,3\n895#1:2201,3\n1054#1:2232,13\n1055#1:2266,13\n1055#1:2280,3\n1054#1:2285,3\n213#1:1071,6\n524#1:1390,6\n581#1:1581,6\n598#1:1591,6\n642#1:1671,6\n788#1:1758,6\n827#1:1843,6\n282#1:1077,6\n282#1:1109\n282#1:1116\n445#1:1194,6\n445#1:1226\n467#1:1230,6\n467#1:1262\n473#1:1297,6\n473#1:1329\n473#1:1334\n467#1:1383\n445#1:1388\n527#1:1397,6\n527#1:1429\n541#1:1464,6\n541#1:1496\n541#1:1501\n527#1:1696\n700#1:1716,6\n700#1:1748\n700#1:1755\n853#1:1885,6\n853#1:1917\n853#1:2039\n911#1:2081,6\n911#1:2113\n911#1:2200\n1054#1:2212,7\n1054#1:2245\n1054#1:2289\n282#1:1083\n282#1:1085,11\n282#1:1115\n345#1:1120\n345#1:1122,11\n345#1:1150\n375#1:1159\n375#1:1161,11\n375#1:1189\n445#1:1200\n445#1:1202,11\n467#1:1236\n467#1:1238,11\n470#1:1270\n470#1:1272,11\n473#1:1303\n473#1:1305,11\n473#1:1333\n499#1:1342\n499#1:1344,11\n499#1:1372\n470#1:1377\n467#1:1382\n445#1:1387\n527#1:1403\n527#1:1405,11\n537#1:1437\n537#1:1439,11\n541#1:1470\n541#1:1472,11\n541#1:1500\n569#1:1509\n569#1:1511,11\n569#1:1539\n537#1:1544\n578#1:1553\n578#1:1555,11\n612#1:1606\n612#1:1608,11\n626#1:1643\n626#1:1645,11\n626#1:1680\n612#1:1685\n578#1:1690\n527#1:1695\n700#1:1722\n700#1:1724,11\n700#1:1754\n783#1:1771\n783#1:1773,11\n791#1:1804\n791#1:1806,11\n791#1:1834\n783#1:1840\n830#1:1858\n830#1:1860,11\n853#1:1891\n853#1:1893,11\n856#1:1925\n856#1:1927,11\n861#1:1958\n861#1:1960,11\n861#1:1988\n856#1:1994\n881#1:2003\n881#1:2005,11\n881#1:2033\n853#1:2038\n830#1:2043\n895#1:2052\n895#1:2054,11\n911#1:2087\n911#1:2089,11\n916#1:2121\n916#1:2123,11\n916#1:2151\n954#1:2160\n954#1:2162,11\n954#1:2194\n911#1:2199\n895#1:2204\n1054#1:2219\n1054#1:2221,11\n1055#1:2253\n1055#1:2255,11\n1055#1:2283\n1054#1:2288\n287#1:1110\n288#1:1111\n348#1:1117\n428#1:1191\n429#1:1192\n430#1:1193\n448#1:1227\n449#1:1228\n456#1:1229\n529#1:1396\n539#1:1430\n579#1:1546\n586#1:1587\n587#1:1588\n596#1:1589\n608#1:1597\n615#1:1599\n619#1:1633\n620#1:1634\n628#1:1635\n629#1:1636\n703#1:1749\n704#1:1750\n785#1:1756\n803#1:1836\n832#1:1850\n833#1:1851\n858#1:1918\n875#1:1990\n906#1:2079\n914#1:2080\n957#1:2153\n962#1:2187\n966#1:2188\n973#1:2189\n982#1:2190\n993#1:2206\n1017#1:2207\n1021#1:2208\n1012#1:2209\n1013#1:2210\n1057#1:2246\n345#1:1118,2\n345#1:1146\n345#1:1151\n375#1:1152,7\n375#1:1185\n375#1:1190\n470#1:1263,7\n470#1:1296\n499#1:1335,7\n499#1:1368\n499#1:1373\n470#1:1378\n537#1:1431,6\n537#1:1463\n569#1:1502,7\n569#1:1535\n569#1:1540\n537#1:1545\n783#1:1765,6\n783#1:1797\n783#1:1841\n856#1:1919,6\n856#1:1951\n856#1:1995\n895#1:2045,7\n895#1:2078\n916#1:2114,7\n916#1:2147\n916#1:2152\n895#1:2205\n578#1:1547,6\n578#1:1579\n612#1:1600,6\n612#1:1632\n626#1:1637,6\n626#1:1669\n626#1:1681\n612#1:1686\n578#1:1691\n791#1:1798,6\n791#1:1830\n791#1:1835\n830#1:1852,6\n830#1:1884\n861#1:1952,6\n861#1:1984\n861#1:1989\n881#1:1996,7\n881#1:2029\n881#1:2034\n830#1:2044\n954#1:2154,6\n954#1:2186\n954#1:2195\n1055#1:2247,6\n1055#1:2279\n1055#1:2284\n608#1:1598\n659#1:1697\n660#1:1698,6\n668#1:1704,6\n678#1:1710,6\n213#1:2290\n213#1:2291,2\n*E\n"})
public final class StressDayDataViewKt {
    public static final float G(float f) {
        return Math.max(f, 0.01f);
    }

    @NotNull
    public static final Modifier H(@NotNull Modifier shadowCard, float f, float f2) {
        Intrinsics.checkNotNullParameter(shadowCard, "$this$shadowCard");
        return SizeKt.fillMaxWidth$default(PaddingKt.m427paddingVpY3zN4(BackgroundKt.m162backgroundbw27NRU(IntrinsicKt.height(PaddingKt.m430paddingqDBjuR0$default(shadowCard, 0.0f, Dp.m4104constructorimpl(8), 0.0f, 0.0f, 13, null), IntrinsicSize.Max), ColorKt.Color(e88.a().getColor(R$color.health_hrv_FAFAFA)), RoundedCornerShapeKt.m700RoundedCornerShape0680j_4(Dp.m4104constructorimpl(12))), f, f2), 0.0f, 1, null);
    }

    public static /* synthetic */ Modifier I(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m4104constructorimpl(12);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m4104constructorimpl(12);
        }
        return H(modifier, f, f2);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final LiveData<PhysicalMentalAchievement> liveData, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2059451835);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2059451835, i, -1, "com.heytap.health.hrv.ui.item.AchievementCard (StressDayDataView.kt:824)");
        }
        State stateObserveAsState = LiveDataAdapterKt.observeAsState(liveData, composerStartRestartGroup, 8);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        if (composerStartRestartGroup.rememberedValue() == Composer.INSTANCE.getEmpty()) {
            composerStartRestartGroup.updateRememberedValue(stateObserveAsState);
        }
        composerStartRestartGroup.endReplaceableGroup();
        PhysicalMentalAchievement physicalMentalAchievement = (PhysicalMentalAchievement) stateObserveAsState.getValue();
        if (physicalMentalAchievement == null) {
            physicalMentalAchievement = new PhysicalMentalAchievement();
        }
        final PhysicalMentalAchievement physicalMentalAchievement2 = physicalMentalAchievement;
        final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 16;
        float f2 = 12;
        Modifier modifierM187clickableXHw0xAI$default = ClickableKt.m187clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(BackgroundKt.m162backgroundbw27NRU(PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(f), Dp.m4104constructorimpl(f2), Dp.m4104constructorimpl(f), 0.0f, 8, null), Color.INSTANCE.m1653getTransparent0d7_KjU(), RoundedCornerShapeKt.m700RoundedCornerShape0680j_4(Dp.m4104constructorimpl(f2))), 0.0f, 1, null), false, null, null, new Function0<Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$AchievementCard$2
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
                com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 4).a(xmk.TAG_POSTION1, 1).b();
                Intent intent = new Intent(context, (Class<?>) AchievementHistoryActivity.class);
                intent.putExtra("date", String.valueOf(physicalMentalAchievement2.getDate()));
                context.startActivity(intent);
            }
        }, 7, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM187clickableXHw0xAI$default);
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
        ImageKt.Image(PainterResources_androidKt.painterResource(R$drawable.health_hrv_ach_enter_bg, composerStartRestartGroup, 0), (String) null, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25016, 104);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
        Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion3.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier modifierM430paddingqDBjuR0$default = PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(f), Dp.m4104constructorimpl(f), Dp.m4104constructorimpl(f), 0.0f, 8, null);
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default);
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
        Updater.m1266setimpl(composerM1259constructorimpl3, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl3, density3, companion3.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf3.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Modifier modifierWeight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierWeight$default);
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
        Updater.m1266setimpl(composerM1259constructorimpl4, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl4, density4, companion3.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl4, layoutDirection4, companion3.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl4, viewConfiguration4, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf4.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(R$string.health_hrv_achiev_enter_today, composerStartRestartGroup, 0), (Modifier) null, ColorKt.Color(3875536895L), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getW500(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 200064, 0, 131026);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(R$string.health_hrv_achiev_enter_detail, composerStartRestartGroup, 0), (Modifier) null, ColorKt.Color(2365587455L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3456, 0, 131058);
        ImageKt.Image(PainterResources_androidKt.painterResource(R$drawable.health_hrv_ach_enter_right_icon, composerStartRestartGroup, 0), "", PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, UploadStateAware.HTTP_DECRYPT_FAILED, 120);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(companion);
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
        Updater.m1266setimpl(composerM1259constructorimpl5, measurePolicyRememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl5, density5, companion3.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl5, layoutDirection5, companion3.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl5, viewConfiguration5, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf5.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        if (l05.e(physicalMentalAchievement2)) {
            composerStartRestartGroup.startReplaceableGroup(-1210034744);
            c(composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-1210034818);
            b(physicalMentalAchievement2, composerStartRestartGroup, 8);
            composerStartRestartGroup.endReplaceableGroup();
        }
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$AchievementCard$4
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
                StressDayDataViewKt.a(liveData, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0285  */
    /* JADX WARN: Code duplicated, block: B:59:0x0295 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0297  */
    /* JADX WARN: Code duplicated, block: B:61:0x02a7  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(final PhysicalMentalAchievement physicalMentalAchievement, Composer composer, final int i) {
        int i2;
        int i3;
        boolean z;
        String strStringResource;
        Composer composerStartRestartGroup = composer.startRestartGroup(355959677);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(355959677, i, -1, "com.heytap.health.hrv.ui.item.AchievementDataContent (StressDayDataView.kt:893)");
        }
        Alignment.Companion companion = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion2);
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
        int iN = l05.n(physicalMentalAchievement);
        if (iN >= 0 && iN < 80) {
            i2 = R$drawable.health_hrv_ach_enter_normal_icon;
        } else {
            if (80 <= iN && iN < 100) {
                i2 = R$drawable.health_hrv_ach_enter_good_icon;
            } else {
                i2 = iN == 100 ? R$drawable.health_hrv_ach_enter_perfect_icon : R$drawable.health_hrv_ach_enter_normal_icon;
            }
        }
        ImageKt.Image(PainterResources_androidKt.painterResource(i2, composerStartRestartGroup, 0), "", SizeKt.m469size3ABfNKs(companion2, Dp.m4104constructorimpl(88)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, UploadStateAware.HTTP_DECRYPT_FAILED, 120);
        Modifier modifierM430paddingqDBjuR0$default = PaddingKt.m430paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance, companion2, 1.0f, false, 2, null), 0.0f, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 11, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
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
        Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion3.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Alignment.Vertical centerVertically2 = companion.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(companion2);
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
        Updater.m1266setimpl(composerM1259constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl3, density3, companion3.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf3.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        int iN2 = l05.n(physicalMentalAchievement);
        if (iN2 >= 0 && iN2 < 80) {
            composerStartRestartGroup.startReplaceableGroup(-841070352);
            strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_achiev_normal_day, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            if (80 <= iN2) {
                i3 = 100;
                if (iN2 < 100) {
                    z = true;
                }
                if (z) {
                    composerStartRestartGroup.startReplaceableGroup(-841070260);
                    strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_achiev_good_day, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (iN2 == i3) {
                    composerStartRestartGroup.startReplaceableGroup(-841070176);
                    strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_achiev_perfect_day, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-841070088);
                    strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_achiev_normal_day, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            } else {
                i3 = 100;
            }
            z = false;
            if (z) {
                composerStartRestartGroup.startReplaceableGroup(-841070260);
                strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_achiev_good_day, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (iN2 == i3) {
                composerStartRestartGroup.startReplaceableGroup(-841070176);
                strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_achiev_perfect_day, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-841070088);
                strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_achiev_normal_day, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            }
        }
        String str = strStringResource;
        Brush.Companion companion4 = Brush.INSTANCE;
        Brush brushM1567horizontalGradient8A3gB4$default = Brush.Companion.m1567horizontalGradient8A3gB4$default(companion4, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorKt.Color(4294963380L)), Color.m1608boximpl(ColorKt.Color(4294960517L))}), 0.0f, 0.0f, 0, 14, (Object) null);
        FontWeight.Companion companion5 = FontWeight.INSTANCE;
        TextKt.m1201Text4IGK_g(str, RowScope.weight$default(rowScopeInstance, companion2, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(brushM1567horizontalGradient8A3gB4$default, 0.0f, TextUnitKt.getSp(16), companion5.getW700(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 33554418, null), composerStartRestartGroup, 0, 0, 65532);
        TextKt.m1201Text4IGK_g(l05.n(physicalMentalAchievement) + "%", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(Brush.Companion.m1567horizontalGradient8A3gB4$default(companion4, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorKt.Color(4294963380L)), Color.m1608boximpl(ColorKt.Color(4294960517L))}), 0.0f, 0.0f, 0, 14, (Object) null), 0.0f, TextUnitKt.getSp(16), companion5.getW700(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 33554418, null), composerStartRestartGroup, 0, 0, 65534);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        float f = 10;
        Modifier modifierM430paddingqDBjuR0$default2 = PaddingKt.m430paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, Dp.m4104constructorimpl(f), 0.0f, 0.0f, 13, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default2);
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
        Updater.m1266setimpl(composerM1259constructorimpl4, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl4, density4, companion3.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl4, layoutDirection4, companion3.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl4, viewConfiguration4, companion3.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf4.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        float f2 = 14;
        BoxKt.Box(BackgroundKt.m162backgroundbw27NRU(boxScopeInstance.align(SizeKt.m455height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m4104constructorimpl(f2)), companion.getBottomEnd()), ColorKt.Color(4283914071L), RoundedCornerShapeKt.m700RoundedCornerShape0680j_4(Dp.m4104constructorimpl(f))), composerStartRestartGroup, 0);
        BoxKt.Box(BackgroundKt.background$default(boxScopeInstance.align(SizeKt.m455height3ABfNKs(SizeKt.fillMaxWidth(companion2, l05.n(physicalMentalAchievement) / 100.0f), Dp.m4104constructorimpl(f2)), companion.getTopStart()), Brush.Companion.m1567horizontalGradient8A3gB4$default(companion4, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorKt.Color(4294963380L)), Color.m1608boximpl(ColorKt.Color(4294960517L))}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.m700RoundedCornerShape0680j_4(Dp.m4104constructorimpl(f)), 0.0f, 4, null), composerStartRestartGroup, 0);
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$AchievementDataContent$2
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
                StressDayDataViewKt.b(physicalMentalAchievement, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(@Nullable Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-359288681);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-359288681, i, -1, "com.heytap.health.hrv.ui.item.AchievementNoDataContent (StressDayDataView.kt:990)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(R$string.health_hrv_achiev_no_data_day, composerStartRestartGroup, 0), PaddingKt.m430paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m4104constructorimpl(16), Dp.m4104constructorimpl(24), 0.0f, 0.0f, 12, null), ColorKt.Color(4294963125L), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getW700(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200112, 0, 131024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$AchievementNoDataContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i2) {
                StressDayDataViewKt.c(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void d(@NotNull final String text, @Nullable Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1737207469);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1737207469, i2, -1, "com.heytap.health.hrv.ui.item.CardTitle (StressDayDataView.kt:1001)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m1201Text4IGK_g(text, (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_85alpha, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getW500(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i2 & 14) | 199680, 0, 131026);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$CardTitle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i3) {
                StressDayDataViewKt.d(text, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1 */
    /* JADX WARN: Type inference failed for: r33v2 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void e(final LiveData<Integer> liveData, Composer composer, final int i) {
        String str;
        Composer composer2;
        ?? r15;
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1713317258);
        int currentMarker = composerStartRestartGroup.getCurrentMarker();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1713317258, i, -1, "com.heytap.health.hrv.ui.item.CompareWithAge (StressDayDataView.kt:519)");
        }
        State stateObserveAsState = LiveDataAdapterKt.observeAsState(liveData, composerStartRestartGroup, 8);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            composerStartRestartGroup.updateRememberedValue(stateObserveAsState);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Integer num = (Integer) stateObserveAsState.getValue();
        boolean z = num != null && num.intValue() == 20113;
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierM187clickableXHw0xAI$default = ClickableKt.m187clickableXHw0xAI$default(I(companion2, Dp.m4104constructorimpl(0), 0.0f, 2, null), z, null, null, new Function0<Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$CompareWithAge$2
            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                e1.d().b("/settings/me/PersonalProfileActivity").navigation();
            }
        }, 6, null);
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
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM187clickableXHw0xAI$default);
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
        Alignment.Vertical centerVertically = companion3.getCenterVertically();
        Modifier modifierM428paddingVpY3zN4$default = PaddingKt.m428paddingVpY3zN4$default(companion2, Dp.m4104constructorimpl(12), 0.0f, 2, null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM428paddingVpY3zN4$default);
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
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierWeight$default);
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
        composerStartRestartGroup.startReplaceableGroup(311892661);
        if (num == null || !new IntRange(0, 100).contains(num.intValue())) {
            str = StringResources_androidKt.stringResource(R$string.health_hrv_no_data_content, composerStartRestartGroup, 0) + " ";
        } else {
            str = num + "%";
        }
        composerStartRestartGroup.endReplaceableGroup();
        h(StringResources_androidKt.stringResource(R$string.health_hrv_compare_with_same_age, new Object[]{str}, composerStartRestartGroup, 64), str, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(311893199);
        String strStringResource = (num != null && num.intValue() == 20113) ? StringResources_androidKt.stringResource(R$string.health_hrv_enter_infomation, composerStartRestartGroup, 0) : "";
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(311893396);
        if (strStringResource.length() > 0) {
            composer2 = composerStartRestartGroup;
            TextKt.m1201Text4IGK_g(strStringResource, (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_55alpha, composerStartRestartGroup, 0), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
        } else {
            composer2 = composerStartRestartGroup;
        }
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        Alignment.Vertical centerVertically2 = companion3.getCenterVertically();
        Composer composer3 = composer2;
        composer3.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composer3, 48);
        composer3.startReplaceableGroup(-1323940314);
        Density density4 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection4 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration4 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(companion2);
        if (!(composer3.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer3.startReusableNode();
        if (composer3.getInserting()) {
            composer3.createNode(constructor4);
        } else {
            composer3.useNode();
        }
        composer3.disableReusing();
        Composer composerM1259constructorimpl4 = Updater.m1259constructorimpl(composer3);
        Updater.m1266setimpl(composerM1259constructorimpl4, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl4, density4, companion4.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl4, layoutDirection4, companion4.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl4, viewConfiguration4, companion4.getSetViewConfiguration());
        composer3.enableReusing();
        function3MaterializerOf4.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer3)), composer3, Integer.valueOf((int) r13));
        composer3.startReplaceableGroup(2058660585);
        composer3.startReplaceableGroup(311893800);
        if (num == null || num.intValue() < 50 || num.intValue() > 100) {
            r15 = r13;
        } else {
            r15 = 0;
            ImageKt.Image(PainterResources_androidKt.painterResource(R$drawable.health_hrv_ic_like, composer3, 0), "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 124);
        }
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        composer3.endNode();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        composer3.endNode();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        Modifier modifierM430paddingqDBjuR0$default = PaddingKt.m430paddingqDBjuR0$default(companion2, 0.0f, Dp.m4104constructorimpl(16), 0.0f, 0.0f, 13, null);
        composer3.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), r15, composer3, r15);
        composer3.startReplaceableGroup(-1323940314);
        Density density5 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection5 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration5 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default);
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
        Updater.m1266setimpl(composerM1259constructorimpl5, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl5, density5, companion4.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl5, layoutDirection5, companion4.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl5, viewConfiguration5, companion4.getSetViewConfiguration());
        composer3.enableReusing();
        function3MaterializerOf5.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer3)), composer3, Integer.valueOf((int) r15));
        composer3.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composer3.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composer3.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            obj = null;
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf((int) r15), null, 2, null);
            composer3.updateRememberedValue(objRememberedValue2);
        } else {
            obj = null;
        }
        composer3.endReplaceableGroup();
        final MutableState mutableState = (MutableState) objRememberedValue2;
        float f = 28;
        Modifier modifierM455height3ABfNKs = SizeKt.m455height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, obj), Dp.m4104constructorimpl(f));
        float f2 = 14;
        float fM4104constructorimpl = Dp.m4104constructorimpl(f2);
        float fM4104constructorimpl2 = Dp.m4104constructorimpl(f2);
        float f3 = 10;
        Modifier modifierBackground$default = BackgroundKt.background$default(boxScopeInstance.align(PaddingKt.m430paddingqDBjuR0$default(modifierM455height3ABfNKs, fM4104constructorimpl, 0.0f, fM4104constructorimpl2, Dp.m4104constructorimpl(f3), 2, null), companion3.getBottomEnd()), Brush.Companion.m1567horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorKt.Color(4288932015L)), Color.m1608boximpl(ColorKt.Color(4280929640L))}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.m700RoundedCornerShape0680j_4(Dp.m4104constructorimpl(f3)), 0.0f, 4, null);
        composer3.startReplaceableGroup(1157296644);
        boolean zChanged = composer3.changed(mutableState);
        Object objRememberedValue3 = composer3.rememberedValue();
        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$CompareWithAge$3$2$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                    m4639invokeozmzZPI(intSize.getPackedValue());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                public final void m4639invokeozmzZPI(long j2) {
                    mutableState.setValue(Integer.valueOf(IntSize.m4264getWidthimpl(j2)));
                }
            };
            composer3.updateRememberedValue(objRememberedValue3);
        }
        composer3.endReplaceableGroup();
        BoxKt.Box(OnRemeasuredModifierKt.onSizeChanged(modifierBackground$default, (Function1) objRememberedValue3), composer3, r15);
        float fIntValue = (num == null || !new IntRange(r15, 100).contains(num.intValue())) ? 0.0f : num.intValue() / 100.0f;
        float fM4104constructorimpl3 = Dp.m4104constructorimpl(Dp.m4104constructorimpl(swf.s(((Number) mutableState.getValue()).floatValue() * fIntValue)) + Dp.m4104constructorimpl(f));
        if ((fIntValue == 0.0f ? 1 : r15) != 0) {
            composer3.endToMarker(currentMarker);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$CompareWithAge$3$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num2) {
                    invoke(composer4, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer4, int i2) {
                    StressDayDataViewKt.e(liveData, composer4, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
            return;
        }
        Modifier modifierM455height3ABfNKs2 = SizeKt.m455height3ABfNKs(SizeKt.m474width3ABfNKs(companion2, fM4104constructorimpl3), Dp.m4104constructorimpl(46));
        composer3.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), r15, composer3, r15);
        composer3.startReplaceableGroup(-1323940314);
        Density density6 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection6 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration6 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor6 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifierM455height3ABfNKs2);
        if (!(composer3.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer3.startReusableNode();
        if (composer3.getInserting()) {
            composer3.createNode(constructor6);
        } else {
            composer3.useNode();
        }
        composer3.disableReusing();
        Composer composerM1259constructorimpl6 = Updater.m1259constructorimpl(composer3);
        Updater.m1266setimpl(composerM1259constructorimpl6, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl6, density6, companion4.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl6, layoutDirection6, companion4.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl6, viewConfiguration6, companion4.getSetViewConfiguration());
        composer3.enableReusing();
        function3MaterializerOf6.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer3)), composer3, Integer.valueOf((int) r15));
        composer3.startReplaceableGroup(2058660585);
        ImageKt.Image(PainterResources_androidKt.painterResource(R$drawable.health_hrv_age_compare_icon, composer3, r15), "", boxScopeInstance.align(SizeKt.m474width3ABfNKs(SizeKt.m455height3ABfNKs(companion2, Dp.m4104constructorimpl(40)), Dp.m4104constructorimpl(f)), companion3.getTopEnd()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
        AccountUserInfo value = cn.c().getAccountInfo().getValue();
        final String str2 = value != null ? value.avatarUrl : null;
        float f4 = 3;
        Modifier modifierAlign = boxScopeInstance.align(SizeKt.m469size3ABfNKs(PaddingKt.m430paddingqDBjuR0$default(companion2, 0.0f, Dp.m4104constructorimpl(f4), Dp.m4104constructorimpl(f4), 0.0f, 9, null), Dp.m4104constructorimpl(22)), companion3.getTopEnd());
        composer3.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), r15, composer3, r15);
        composer3.startReplaceableGroup(-1323940314);
        Density density7 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection7 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration7 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor7 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifierAlign);
        if (!(composer3.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer3.startReusableNode();
        if (composer3.getInserting()) {
            composer3.createNode(constructor7);
        } else {
            composer3.useNode();
        }
        composer3.disableReusing();
        Composer composerM1259constructorimpl7 = Updater.m1259constructorimpl(composer3);
        Updater.m1266setimpl(composerM1259constructorimpl7, measurePolicyRememberBoxMeasurePolicy3, companion4.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl7, density7, companion4.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl7, layoutDirection7, companion4.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl7, viewConfiguration7, companion4.getSetViewConfiguration());
        composer3.enableReusing();
        function3MaterializerOf7.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer3)), composer3, Integer.valueOf((int) r15));
        composer3.startReplaceableGroup(2058660585);
        StressDayDataViewKt$CompareWithAge$3$2$3$1$1 stressDayDataViewKt$CompareWithAge$3$2$3$1$1 = new Function1<Context, COUIRoundImageView>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$CompareWithAge$3$2$3$1$1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final COUIRoundImageView invoke(@NotNull Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                COUIRoundImageView cOUIRoundImageView = new COUIRoundImageView(it);
                cOUIRoundImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                cOUIRoundImageView.setImageResource(com.heytap.health.base.R$drawable.lib_base_avatar_def);
                return cOUIRoundImageView;
            }
        };
        composer3.startReplaceableGroup(1157296644);
        boolean zChanged2 = composer3.changed(str2);
        Object objRememberedValue4 = composer3.rememberedValue();
        if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new Function1<COUIRoundImageView, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$CompareWithAge$3$2$3$1$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(COUIRoundImageView cOUIRoundImageView) {
                    invoke2(cOUIRoundImageView);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull COUIRoundImageView it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    buf bufVar = new buf();
                    int i2 = com.heytap.health.base.R$drawable.lib_base_avatar_def;
                    buf bufVarS0 = bufVar.h0(i2).q(i2).s0(true);
                    Intrinsics.checkNotNullExpressionValue(bufVarS0, "RequestOptions()\n       …   .skipMemoryCache(true)");
                    z5a.i(it.getContext(), str2, it, bufVarS0);
                }
            };
            composer3.updateRememberedValue(objRememberedValue4);
        }
        composer3.endReplaceableGroup();
        AndroidView_androidKt.AndroidView(stressDayDataViewKt$CompareWithAge$3$2$3$1$1, null, (Function1) objRememberedValue4, composer3, 6, 2);
        composer3.endReplaceableGroup();
        composer3.endNode();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        composer3.endNode();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$CompareWithAge$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num2) {
                invoke(composer4, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer4, int i2) {
                StressDayDataViewKt.e(liveData, composer4, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void f(final Context context, LiveData<PhysicalMentalStat> liveData, boolean z, Composer composer, final int i, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-227171868);
        LiveData<PhysicalMentalStat> mutableLiveData = (i2 & 2) != 0 ? new MutableLiveData(new PhysicalMentalStat(null, 0, null, null, 0, 0, 0, 0, 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16777215, null)) : liveData;
        boolean z2 = (i2 & 4) != 0 ? false : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-227171868, i, -1, "com.heytap.health.hrv.ui.item.DataDetail (StressDayDataView.kt:694)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierD = ComposeItemKt.d(companion);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierD);
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
        d(StringResources_androidKt.stringResource(R$string.health_hrv_data_detail_title, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
        DividerKt.m1008DivideroMI9zvI(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(10), 0.0f, Dp.m4104constructorimpl(5), 5, null), ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_10alpha, composerStartRestartGroup, 0), Dp.m4104constructorimpl((float) 0.33d), 0.0f, composerStartRestartGroup, 390, 8);
        State stateObserveAsState = LiveDataAdapterKt.observeAsState(mutableLiveData, composerStartRestartGroup, 8);
        PhysicalMentalStat physicalMentalStat = (PhysicalMentalStat) stateObserveAsState.getValue();
        int date = physicalMentalStat != null ? physicalMentalStat.getDate() : 0;
        final long jG = date > 0 ? pr8.INSTANCE.g(date) : 0L;
        PhysicalMentalStat physicalMentalStat2 = (PhysicalMentalStat) stateObserveAsState.getValue();
        String strValueOf = String.valueOf(physicalMentalStat2 != null ? Integer.valueOf(physicalMentalStat2.getAvgHrv()) : null);
        composerStartRestartGroup.startReplaceableGroup(-2127048684);
        String strStringResource = l05.i(strValueOf) ? StringResources_androidKt.stringResource(R$string.health_hrv_data_detail_avg_hrv_v1, new Object[]{strValueOf}, composerStartRestartGroup, 64) : l05.l(strValueOf);
        composerStartRestartGroup.endReplaceableGroup();
        if (z2) {
            composerStartRestartGroup.startReplaceableGroup(775201782);
            g(StringResources_androidKt.stringResource(R$string.health_hrv_all_day_avg_hrv, composerStartRestartGroup, 0), strStringResource, null, composerStartRestartGroup, 0, 4);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(775201956);
            g(StringResources_androidKt.stringResource(R$string.health_hrv_all_day_avg_hrv, composerStartRestartGroup, 0), strStringResource, new Function0<Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$DataDetail$1$1
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
                    com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 5).a(xmk.TAG_POSTION1, 1).b();
                    HrvHistoryActivity.Companion.a(context, jG, true);
                }
            }, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceableGroup();
        }
        PhysicalMentalStat physicalMentalStat3 = (PhysicalMentalStat) stateObserveAsState.getValue();
        String strValueOf2 = String.valueOf(physicalMentalStat3 != null ? Integer.valueOf(physicalMentalStat3.getAvgSleepHrv()) : null);
        composerStartRestartGroup.startReplaceableGroup(-2127047810);
        String strStringResource2 = l05.i(strValueOf2) ? StringResources_androidKt.stringResource(R$string.health_hrv_data_detail_avg_hrv_v1, new Object[]{strValueOf2}, composerStartRestartGroup, 64) : l05.l(strValueOf2);
        composerStartRestartGroup.endReplaceableGroup();
        if (z2) {
            composerStartRestartGroup.startReplaceableGroup(775202662);
            g(StringResources_androidKt.stringResource(R$string.health_hrv_sleep_hrv, composerStartRestartGroup, 0), strStringResource2, null, composerStartRestartGroup, 0, 4);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(775202832);
            g(StringResources_androidKt.stringResource(R$string.health_hrv_sleep_hrv, composerStartRestartGroup, 0), strStringResource2, new Function0<Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$DataDetail$1$2
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
                    com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 5).a(xmk.TAG_POSTION1, 2).b();
                    HrvHistoryActivity.Companion.a(context, jG, false);
                }
            }, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceableGroup();
        }
        PhysicalMentalStat physicalMentalStat4 = (PhysicalMentalStat) stateObserveAsState.getValue();
        String strValueOf3 = String.valueOf(physicalMentalStat4 != null ? Integer.valueOf(physicalMentalStat4.getAvgRestingHeartRate()) : null);
        composerStartRestartGroup.startReplaceableGroup(-2127046919);
        String strStringResource3 = l05.i(strValueOf3) ? StringResources_androidKt.stringResource(R$string.health_hrv_data_detail_avg_heart_rate_v1, new Object[]{strValueOf3}, composerStartRestartGroup, r7) : l05.l(strValueOf3);
        composerStartRestartGroup.endReplaceableGroup();
        g(StringResources_androidKt.stringResource(R$string.health_hrv_rest_heart_rate, composerStartRestartGroup, 0), strStringResource3, null, composerStartRestartGroup, 0, 4);
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
        final LiveData<PhysicalMentalStat> liveData2 = mutableLiveData;
        final boolean z3 = z2;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$DataDetail$2
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
                StressDayDataViewKt.f(context, liveData2, z3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x0134  */
    /* JADX WARN: Code duplicated, block: B:60:0x0140  */
    /* JADX WARN: Code duplicated, block: B:61:0x0144  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:71:0x0279  */
    /* JADX WARN: Code duplicated, block: B:74:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:79:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void g(final String str, final String str2, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Function0<Unit> function1;
        int i5;
        final Function0<Unit> function2;
        Modifier.Companion companion;
        Object objRememberedValue;
        Composer.Companion companion2;
        boolean zChanged;
        Object objRememberedValue2;
        Function0<ComposeUiNode> constructor;
        Function0<Unit> function3;
        Function0<ComposeUiNode> constructor2;
        final Function0<Unit> function4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1367483110);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    function1 = function0;
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i3 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                    if (i4 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1367483110, i3, -1, "com.heytap.health.hrv.ui.item.DataDetailItem (StressDayDataView.kt:777)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierM455height3ABfNKs = SizeKt.m455height3ABfNKs(companion, Dp.m4104constructorimpl(48));
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion2 = Composer.INSTANCE;
                    if (objRememberedValue == companion2.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$DataDetailItem$2$1
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
                                Function0<Unit> function5 = function2;
                                if (function5 != null) {
                                    function5.invoke();
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierM185clickableO2vRcR0$default = ClickableKt.m185clickableO2vRcR0$default(modifierM455height3ABfNKs, mutableInteractionSource, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically = companion3.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    constructor = companion4.getConstructor();
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
                    Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl, density, companion4.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion4.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion4.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    function3 = function2;
                    Modifier modifierWeight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion4.getConstructor();
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
                    Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion4.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion4.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion4.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    TextKt.m1201Text4IGK_g(str, (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composerStartRestartGroup, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i3 & 14, 0, 131066);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    TextKt.m1201Text4IGK_g(str2, (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_55alpha, composerStartRestartGroup, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 >> 3) & 14, 0, 131066);
                    if (function3 != null) {
                        ImageKt.Image(PainterResources_androidKt.painterResource(R$drawable.health_hrv_ic_arrow_right, composerStartRestartGroup, 0), "", PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, UploadStateAware.HTTP_DECRYPT_FAILED, 120);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function4 = function1;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$DataDetailItem$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p010kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i6) {
                        StressDayDataViewKt.g(str, str2, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= ModuleType.TYPE_SYSTEM_SETTING;
            function1 = function0;
            if ((i3 & 731) == 146) {
                if (i4 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1367483110, i3, -1, "com.heytap.health.hrv.ui.item.DataDetailItem (StressDayDataView.kt:777)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM455height3ABfNKs2 = SizeKt.m455height3ABfNKs(companion, Dp.m4104constructorimpl(48));
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
                zChanged = composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$DataDetailItem$2$1
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
                            Function0<Unit> function5 = function2;
                            if (function5 != null) {
                                function5.invoke();
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$DataDetailItem$2$1
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
                            Function0<Unit> function5 = function2;
                            if (function5 != null) {
                                function5.invoke();
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM185clickableO2vRcR0$default2 = ClickableKt.m185clickableO2vRcR0$default(modifierM455height3ABfNKs2, mutableInteractionSource2, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                Alignment.Companion companion5 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically2 = companion5.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                constructor = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default2);
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
                Updater.m1266setimpl(composerM1259constructorimpl3, measurePolicyRowMeasurePolicy2, companion6.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl3, density3, companion6.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl3, layoutDirection3, companion6.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl3, viewConfiguration3, companion6.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf3.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                function3 = function2;
                Modifier modifierWeight$default2 = RowScope.weight$default(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion5.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierWeight$default2);
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
                Updater.m1266setimpl(composerM1259constructorimpl4, measurePolicyRememberBoxMeasurePolicy2, companion6.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl4, density4, companion6.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl4, layoutDirection4, companion6.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl4, viewConfiguration4, companion6.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf4.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                TextKt.m1201Text4IGK_g(str, (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composerStartRestartGroup, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i3 & 14, 0, 131066);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                TextKt.m1201Text4IGK_g(str2, (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_55alpha, composerStartRestartGroup, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 >> 3) & 14, 0, 131066);
                if (function3 != null) {
                    ImageKt.Image(PainterResources_androidKt.painterResource(R$drawable.health_hrv_ic_arrow_right, composerStartRestartGroup, 0), "", PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, UploadStateAware.HTTP_DECRYPT_FAILED, 120);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function3;
            } else {
                if (i4 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1367483110, i3, -1, "com.heytap.health.hrv.ui.item.DataDetailItem (StressDayDataView.kt:777)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM455height3ABfNKs3 = SizeKt.m455height3ABfNKs(companion, Dp.m4104constructorimpl(48));
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion2 = Composer.INSTANCE;
                if (objRememberedValue == companion2.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableInteractionSource mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$DataDetailItem$2$1
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
                            Function0<Unit> function5 = function2;
                            if (function5 != null) {
                                function5.invoke();
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$DataDetailItem$2$1
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
                            Function0<Unit> function5 = function2;
                            if (function5 != null) {
                                function5.invoke();
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM185clickableO2vRcR0$default3 = ClickableKt.m185clickableO2vRcR0$default(modifierM455height3ABfNKs3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                Alignment.Companion companion7 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically3 = companion7.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                constructor = companion8.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default3);
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
                Updater.m1266setimpl(composerM1259constructorimpl5, measurePolicyRowMeasurePolicy3, companion8.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl5, density5, companion8.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl5, layoutDirection5, companion8.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl5, viewConfiguration5, companion8.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf5.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                function3 = function2;
                Modifier modifierWeight$default3 = RowScope.weight$default(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion7.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration6 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion8.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifierWeight$default3);
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
                Updater.m1266setimpl(composerM1259constructorimpl6, measurePolicyRememberBoxMeasurePolicy3, companion8.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl6, density6, companion8.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl6, layoutDirection6, companion8.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl6, viewConfiguration6, companion8.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf6.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                TextKt.m1201Text4IGK_g(str, (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composerStartRestartGroup, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i3 & 14, 0, 131066);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                TextKt.m1201Text4IGK_g(str2, (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_55alpha, composerStartRestartGroup, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 >> 3) & 14, 0, 131066);
                if (function3 != null) {
                    ImageKt.Image(PainterResources_androidKt.painterResource(R$drawable.health_hrv_ic_arrow_right, composerStartRestartGroup, 0), "", PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, UploadStateAware.HTTP_DECRYPT_FAILED, 120);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$DataDetailItem$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i6) {
                    StressDayDataViewKt.g(str, str2, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                function1 = function0;
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i3 & 731) == 146) {
                if (i4 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1367483110, i3, -1, "com.heytap.health.hrv.ui.item.DataDetailItem (StressDayDataView.kt:777)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM455height3ABfNKs4 = SizeKt.m455height3ABfNKs(companion, Dp.m4104constructorimpl(48));
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion2 = Composer.INSTANCE;
                if (objRememberedValue == companion2.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableInteractionSource mutableInteractionSource4 = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$DataDetailItem$2$1
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
                            Function0<Unit> function5 = function2;
                            if (function5 != null) {
                                function5.invoke();
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$DataDetailItem$2$1
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
                            Function0<Unit> function5 = function2;
                            if (function5 != null) {
                                function5.invoke();
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM185clickableO2vRcR0$default4 = ClickableKt.m185clickableO2vRcR0$default(modifierM455height3ABfNKs4, mutableInteractionSource4, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                Alignment.Companion companion9 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically4 = companion9.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically4, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration7 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                constructor = companion10.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default4);
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
                Updater.m1266setimpl(composerM1259constructorimpl7, measurePolicyRowMeasurePolicy4, companion10.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl7, density7, companion10.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl7, layoutDirection7, companion10.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl7, viewConfiguration7, companion10.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf7.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                function3 = function2;
                Modifier modifierWeight$default4 = RowScope.weight$default(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion9.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density8 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection8 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration8 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion10.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf8 = LayoutKt.materializerOf(modifierWeight$default4);
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
                Updater.m1266setimpl(composerM1259constructorimpl8, measurePolicyRememberBoxMeasurePolicy4, companion10.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl8, density8, companion10.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl8, layoutDirection8, companion10.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl8, viewConfiguration8, companion10.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf8.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                TextKt.m1201Text4IGK_g(str, (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composerStartRestartGroup, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i3 & 14, 0, 131066);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                TextKt.m1201Text4IGK_g(str2, (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_55alpha, composerStartRestartGroup, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 >> 3) & 14, 0, 131066);
                if (function3 != null) {
                    ImageKt.Image(PainterResources_androidKt.painterResource(R$drawable.health_hrv_ic_arrow_right, composerStartRestartGroup, 0), "", PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, UploadStateAware.HTTP_DECRYPT_FAILED, 120);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function3;
            } else {
                if (i4 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1367483110, i3, -1, "com.heytap.health.hrv.ui.item.DataDetailItem (StressDayDataView.kt:777)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM455height3ABfNKs5 = SizeKt.m455height3ABfNKs(companion, Dp.m4104constructorimpl(48));
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
                zChanged = composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$DataDetailItem$2$1
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
                            Function0<Unit> function5 = function2;
                            if (function5 != null) {
                                function5.invoke();
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$DataDetailItem$2$1
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
                            Function0<Unit> function5 = function2;
                            if (function5 != null) {
                                function5.invoke();
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM185clickableO2vRcR0$default5 = ClickableKt.m185clickableO2vRcR0$default(modifierM455height3ABfNKs5, mutableInteractionSource5, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                Alignment.Companion companion11 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically5 = companion11.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically5, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density9 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection9 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration9 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                constructor = companion12.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf9 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default5);
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
                Updater.m1266setimpl(composerM1259constructorimpl9, measurePolicyRowMeasurePolicy5, companion12.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl9, density9, companion12.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl9, layoutDirection9, companion12.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl9, viewConfiguration9, companion12.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf9.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                function3 = function2;
                Modifier modifierWeight$default5 = RowScope.weight$default(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(companion11.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density10 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection10 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration10 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion12.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf10 = LayoutKt.materializerOf(modifierWeight$default5);
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
                Updater.m1266setimpl(composerM1259constructorimpl10, measurePolicyRememberBoxMeasurePolicy5, companion12.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl10, density10, companion12.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl10, layoutDirection10, companion12.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl10, viewConfiguration10, companion12.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf10.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                TextKt.m1201Text4IGK_g(str, (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composerStartRestartGroup, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i3 & 14, 0, 131066);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                TextKt.m1201Text4IGK_g(str2, (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_55alpha, composerStartRestartGroup, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 >> 3) & 14, 0, 131066);
                if (function3 != null) {
                    ImageKt.Image(PainterResources_androidKt.painterResource(R$drawable.health_hrv_ic_arrow_right, composerStartRestartGroup, 0), "", PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, UploadStateAware.HTTP_DECRYPT_FAILED, 120);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$DataDetailItem$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i6) {
                    StressDayDataViewKt.g(str, str2, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= ModuleType.TYPE_SYSTEM_SETTING;
        function1 = function0;
        if ((i3 & 731) == 146) {
            if (i4 != 0) {
                function2 = null;
            } else {
                function2 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1367483110, i3, -1, "com.heytap.health.hrv.ui.item.DataDetailItem (StressDayDataView.kt:777)");
            }
            companion = Modifier.INSTANCE;
            Modifier modifierM455height3ABfNKs6 = SizeKt.m455height3ABfNKs(companion, Dp.m4104constructorimpl(48));
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableInteractionSource mutableInteractionSource6 = (MutableInteractionSource) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(function2);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$DataDetailItem$2$1
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
                        Function0<Unit> function5 = function2;
                        if (function5 != null) {
                            function5.invoke();
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$DataDetailItem$2$1
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
                        Function0<Unit> function5 = function2;
                        if (function5 != null) {
                            function5.invoke();
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM185clickableO2vRcR0$default6 = ClickableKt.m185clickableO2vRcR0$default(modifierM455height3ABfNKs6, mutableInteractionSource6, null, false, null, null, (Function0) objRememberedValue2, 28, null);
            Alignment.Companion companion13 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically6 = companion13.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically6, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density11 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection11 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration11 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
            constructor = companion14.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default6);
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
            Updater.m1266setimpl(composerM1259constructorimpl11, measurePolicyRowMeasurePolicy6, companion14.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl11, density11, companion14.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl11, layoutDirection11, companion14.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl11, viewConfiguration11, companion14.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf11.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            function3 = function2;
            Modifier modifierWeight$default6 = RowScope.weight$default(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(companion13.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density12 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection12 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration12 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion14.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf12 = LayoutKt.materializerOf(modifierWeight$default6);
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
            Updater.m1266setimpl(composerM1259constructorimpl12, measurePolicyRememberBoxMeasurePolicy6, companion14.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl12, density12, companion14.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl12, layoutDirection12, companion14.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl12, viewConfiguration12, companion14.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf12.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
            TextKt.m1201Text4IGK_g(str, (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composerStartRestartGroup, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i3 & 14, 0, 131066);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            TextKt.m1201Text4IGK_g(str2, (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_55alpha, composerStartRestartGroup, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 >> 3) & 14, 0, 131066);
            if (function3 != null) {
                ImageKt.Image(PainterResources_androidKt.painterResource(R$drawable.health_hrv_ic_arrow_right, composerStartRestartGroup, 0), "", PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, UploadStateAware.HTTP_DECRYPT_FAILED, 120);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function4 = function3;
        } else {
            if (i4 != 0) {
                function2 = null;
            } else {
                function2 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1367483110, i3, -1, "com.heytap.health.hrv.ui.item.DataDetailItem (StressDayDataView.kt:777)");
            }
            companion = Modifier.INSTANCE;
            Modifier modifierM455height3ABfNKs7 = SizeKt.m455height3ABfNKs(companion, Dp.m4104constructorimpl(48));
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableInteractionSource mutableInteractionSource7 = (MutableInteractionSource) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(function2);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$DataDetailItem$2$1
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
                        Function0<Unit> function5 = function2;
                        if (function5 != null) {
                            function5.invoke();
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$DataDetailItem$2$1
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
                        Function0<Unit> function5 = function2;
                        if (function5 != null) {
                            function5.invoke();
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM185clickableO2vRcR0$default7 = ClickableKt.m185clickableO2vRcR0$default(modifierM455height3ABfNKs7, mutableInteractionSource7, null, false, null, null, (Function0) objRememberedValue2, 28, null);
            Alignment.Companion companion15 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically7 = companion15.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically7, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density13 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection13 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration13 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
            constructor = companion16.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf13 = LayoutKt.materializerOf(modifierM185clickableO2vRcR0$default7);
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
            Updater.m1266setimpl(composerM1259constructorimpl13, measurePolicyRowMeasurePolicy7, companion16.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl13, density13, companion16.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl13, layoutDirection13, companion16.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl13, viewConfiguration13, companion16.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf13.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            function3 = function2;
            Modifier modifierWeight$default7 = RowScope.weight$default(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(companion15.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density14 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection14 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration14 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion16.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf14 = LayoutKt.materializerOf(modifierWeight$default7);
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
            Updater.m1266setimpl(composerM1259constructorimpl14, measurePolicyRememberBoxMeasurePolicy7, companion16.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl14, density14, companion16.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl14, layoutDirection14, companion16.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl14, viewConfiguration14, companion16.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf14.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
            TextKt.m1201Text4IGK_g(str, (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composerStartRestartGroup, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i3 & 14, 0, 131066);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            TextKt.m1201Text4IGK_g(str2, (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_55alpha, composerStartRestartGroup, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 >> 3) & 14, 0, 131066);
            if (function3 != null) {
                ImageKt.Image(PainterResources_androidKt.painterResource(R$drawable.health_hrv_ic_arrow_right, composerStartRestartGroup, 0), "", PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, UploadStateAware.HTTP_DECRYPT_FAILED, 120);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function4 = function3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$DataDetailItem$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i6) {
                StressDayDataViewKt.g(str, str2, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void h(final String str, final String str2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2044720449);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2044720449, i, -1, "com.heytap.health.hrv.ui.item.FormatterString (StressDayDataView.kt:655)");
            }
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{str2}, false, 0, 6, (Object) null);
            if (listSplit$default.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$FormatterString$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p010kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i3) {
                        StressDayDataViewKt.h(str, str2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    }
                });
                return;
            }
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            int i3 = com.heytap.health.health_base.R$color.health_base_black_55alpha;
            int iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(i3, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16380, (DefaultConstructorMarker) null));
            try {
                builder.append((String) listSplit$default.get(0));
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                int iPushStyle2 = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composerStartRestartGroup, 0), TextUnitKt.getSp(24), FontWeight.INSTANCE.getW500(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16376, (DefaultConstructorMarker) null));
                try {
                    builder.append(str2);
                    builder.pop(iPushStyle2);
                    if (listSplit$default.size() == 2) {
                        int iPushStyle3 = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(i3, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16380, (DefaultConstructorMarker) null));
                        try {
                            builder.append((String) listSplit$default.get(1));
                            builder.pop(iPushStyle3);
                        } catch (Throwable th) {
                            builder.pop(iPushStyle3);
                            throw th;
                        }
                    }
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    composer2 = composerStartRestartGroup;
                    TextKt.m1202TextIbK3jfQ(annotatedString, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer2, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } catch (Throwable th2) {
                    builder.pop(iPushStyle2);
                    throw th2;
                }
            } catch (Throwable th3) {
                builder.pop(iPushStyle);
                throw th3;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$FormatterString$3
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
                StressDayDataViewKt.h(str, str2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void i(Modifier modifier, Brush brush, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Brush brush2;
        final Modifier modifier3;
        final Brush brushM1575verticalGradient8A3gB4$default;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(818958713);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 112) == 0) {
                brush2 = brush;
                i3 |= composerStartRestartGroup.changed(brush2) ? 32 : 16;
            }
            if ((i3 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i5 != 0) {
                    Brush.Companion companion = Brush.INSTANCE;
                    Color.Companion companion2 = Color.INSTANCE;
                    brushM1575verticalGradient8A3gB4$default = Brush.Companion.m1575verticalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(companion2.m1652getRed0d7_KjU()), Color.m1608boximpl(companion2.m1645getBlue0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null);
                } else {
                    brushM1575verticalGradient8A3gB4$default = brush2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(818958713, i, -1, "com.heytap.health.hrv.ui.item.GradientCylinder (StressDayDataView.kt:421)");
                }
                BoxKt.Box(BackgroundKt.background$default(PaddingKt.m426padding3ABfNKs(SizeKt.m455height3ABfNKs(modifier3, Dp.m4104constructorimpl(18)), Dp.m4104constructorimpl(1)), brushM1575verticalGradient8A3gB4$default, RoundedCornerShapeKt.m700RoundedCornerShape0680j_4(Dp.m4104constructorimpl(10)), 0.0f, 4, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                brushM1575verticalGradient8A3gB4$default = brush2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$GradientCylinder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i6) {
                    StressDayDataViewKt.i(modifier3, brushM1575verticalGradient8A3gB4$default, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        brush2 = brush;
        if ((i3 & 91) == 18) {
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i5 != 0) {
                Brush.Companion companion3 = Brush.INSTANCE;
                Color.Companion companion4 = Color.INSTANCE;
                brushM1575verticalGradient8A3gB4$default = Brush.Companion.m1575verticalGradient8A3gB4$default(companion3, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(companion4.m1652getRed0d7_KjU()), Color.m1608boximpl(companion4.m1645getBlue0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null);
            } else {
                brushM1575verticalGradient8A3gB4$default = brush2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(818958713, i, -1, "com.heytap.health.hrv.ui.item.GradientCylinder (StressDayDataView.kt:421)");
            }
            BoxKt.Box(BackgroundKt.background$default(PaddingKt.m426padding3ABfNKs(SizeKt.m455height3ABfNKs(modifier3, Dp.m4104constructorimpl(18)), Dp.m4104constructorimpl(1)), brushM1575verticalGradient8A3gB4$default, RoundedCornerShapeKt.m700RoundedCornerShape0680j_4(Dp.m4104constructorimpl(10)), 0.0f, 4, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i5 != 0) {
                Brush.Companion companion5 = Brush.INSTANCE;
                Color.Companion companion6 = Color.INSTANCE;
                brushM1575verticalGradient8A3gB4$default = Brush.Companion.m1575verticalGradient8A3gB4$default(companion5, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(companion6.m1652getRed0d7_KjU()), Color.m1608boximpl(companion6.m1645getBlue0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null);
            } else {
                brushM1575verticalGradient8A3gB4$default = brush2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(818958713, i, -1, "com.heytap.health.hrv.ui.item.GradientCylinder (StressDayDataView.kt:421)");
            }
            BoxKt.Box(BackgroundKt.background$default(PaddingKt.m426padding3ABfNKs(SizeKt.m455height3ABfNKs(modifier3, Dp.m4104constructorimpl(18)), Dp.m4104constructorimpl(1)), brushM1575verticalGradient8A3gB4$default, RoundedCornerShapeKt.m700RoundedCornerShape0680j_4(Dp.m4104constructorimpl(10)), 0.0f, 4, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$GradientCylinder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i6) {
                StressDayDataViewKt.i(modifier3, brushM1575verticalGradient8A3gB4$default, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void j(final SpaceView spaceView, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1720918639);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1720918639, i, -1, "com.heytap.health.hrv.ui.item.KnowledgeCard (StressDayDataView.kt:815)");
        }
        KnowledgeItemKt.a(spaceView, composerStartRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$KnowledgeCard$1
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
                StressDayDataViewKt.j(spaceView, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void k(final List<Integer> list, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2083298032);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2083298032, i, -1, "com.heytap.health.hrv.ui.item.PercentImage (StressDayDataView.kt:372)");
        }
        if (list == null || list.size() != 4) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$PercentImage$1
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
                    StressDayDataViewKt.k(list, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
            return;
        }
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
        Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl, density, companion2.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, G(list.get(0).intValue()), false, 2, null);
        Brush.Companion companion3 = Brush.INSTANCE;
        i(modifierWeight$default, Brush.Companion.m1567horizontalGradient8A3gB4$default(companion3, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorResources_androidKt.colorResource(R$color.health_hrv_stress_excellent_start, composerStartRestartGroup, 0)), Color.m1608boximpl(ColorResources_androidKt.colorResource(R$color.health_hrv_stress_excellent_end, composerStartRestartGroup, 0))}), 0.0f, 0.0f, 0, 14, (Object) null), composerStartRestartGroup, 0, 0);
        i(RowScope.weight$default(rowScopeInstance, companion, G(list.get(1).intValue()), false, 2, null), Brush.Companion.m1567horizontalGradient8A3gB4$default(companion3, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorResources_androidKt.colorResource(R$color.health_hrv_stress_good_start, composerStartRestartGroup, 0)), Color.m1608boximpl(ColorResources_androidKt.colorResource(R$color.health_hrv_stress_good_end, composerStartRestartGroup, 0))}), 0.0f, 0.0f, 0, 14, (Object) null), composerStartRestartGroup, 0, 0);
        i(RowScope.weight$default(rowScopeInstance, companion, G(list.get(2).intValue()), false, 2, null), Brush.Companion.m1567horizontalGradient8A3gB4$default(companion3, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorResources_androidKt.colorResource(R$color.health_hrv_stress_normal_start, composerStartRestartGroup, 0)), Color.m1608boximpl(ColorResources_androidKt.colorResource(R$color.health_hrv_stress_normal_end, composerStartRestartGroup, 0))}), 0.0f, 0.0f, 0, 14, (Object) null), composerStartRestartGroup, 0, 0);
        i(RowScope.weight$default(rowScopeInstance, companion, G(list.get(3).intValue()), false, 2, null), Brush.Companion.m1567horizontalGradient8A3gB4$default(companion3, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorResources_androidKt.colorResource(R$color.health_hrv_stress_over_start, composerStartRestartGroup, 0)), Color.m1608boximpl(ColorResources_androidKt.colorResource(R$color.health_hrv_stress_over_end, composerStartRestartGroup, 0))}), 0.0f, 0.0f, 0, 14, (Object) null), composerStartRestartGroup, 0, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$PercentImage$3
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
                StressDayDataViewKt.k(list, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void l(final int i, final String str, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(513547030);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        int i4 = i3;
        if ((i4 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(513547030, i4, -1, "com.heytap.health.hrv.ui.item.PercentValue (StressDayDataView.kt:343)");
            }
            Modifier modifierM430paddingqDBjuR0$default = PaddingKt.m430paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m4104constructorimpl(28), 0.0f, 0.0f, 13, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl, density, companion.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(i, composerStartRestartGroup, i4 & 14);
            long sp = TextUnitKt.getSp(14);
            int i5 = com.heytap.health.health_base.R$color.health_base_black_90alpha;
            long jColorResource = ColorResources_androidKt.colorResource(i5, composerStartRestartGroup, 0);
            TextAlign.Companion companion2 = TextAlign.INSTANCE;
            TextKt.m1201Text4IGK_g(strStringResource, (Modifier) null, jColorResource, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3991boximpl(companion2.m4003getStarte0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 130546);
            composer2 = composerStartRestartGroup;
            TextKt.m1201Text4IGK_g(str, (Modifier) null, ColorResources_androidKt.colorResource(i5, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getW500(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3991boximpl(companion2.m3999getEnde0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((i4 >> 3) & 14) | 199680, 0, 130514);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$PercentValue$2
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
                StressDayDataViewKt.l(i, str, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0497  */
    /* JADX WARN: Code duplicated, block: B:111:0x0504  */
    /* JADX WARN: Code duplicated, block: B:114:0x0510  */
    /* JADX WARN: Code duplicated, block: B:115:0x0514  */
    /* JADX WARN: Code duplicated, block: B:118:0x0554  */
    /* JADX WARN: Code duplicated, block: B:135:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:139:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:143:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    /* JADX WARN: Code duplicated, block: B:45:0x009e  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a6 A[PHI: r3 r4 r14
  0x00a6: PHI (r3v6 androidx.lifecycle.LiveData<java.lang.String>) = (r3v2 androidx.lifecycle.LiveData<java.lang.String>), (r3v7 androidx.lifecycle.LiveData<java.lang.String>) binds: [B:47:0x00a1, B:36:0x006c] A[DONT_GENERATE, DONT_INLINE]
  0x00a6: PHI (r4v14 androidx.lifecycle.LiveData<java.lang.Integer>) = (r4v8 androidx.lifecycle.LiveData<java.lang.Integer>), (r4v16 androidx.lifecycle.LiveData<java.lang.Integer>) binds: [B:47:0x00a1, B:36:0x006c] A[DONT_GENERATE, DONT_INLINE]
  0x00a6: PHI (r14v15 androidx.lifecycle.LiveData<java.lang.Integer>) = (r14v0 androidx.lifecycle.LiveData<java.lang.Integer>), (r14v16 androidx.lifecycle.LiveData<java.lang.Integer>) binds: [B:47:0x00a1, B:36:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:55:0x0109  */
    /* JADX WARN: Code duplicated, block: B:58:0x0115  */
    /* JADX WARN: Code duplicated, block: B:59:0x0119  */
    /* JADX WARN: Code duplicated, block: B:62:0x01af  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x020e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0221 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x0229  */
    /* JADX WARN: Code duplicated, block: B:77:0x027c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0288  */
    /* JADX WARN: Code duplicated, block: B:81:0x028c  */
    /* JADX WARN: Code duplicated, block: B:84:0x030f  */
    /* JADX WARN: Code duplicated, block: B:87:0x031b  */
    /* JADX WARN: Code duplicated, block: B:88:0x031f  */
    /* JADX WARN: Code duplicated, block: B:91:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:94:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:95:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:98:0x040d  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void m(LiveData<String> liveData, LiveData<Integer> liveData2, LiveData<Integer> liveData3, boolean z, Composer composer, final int i, final int i2) {
        boolean z2;
        LiveData<String> mutableLiveData;
        LiveData<Integer> mutableLiveData2;
        LiveData<Integer> mutableLiveData3;
        LiveData<Integer> liveData4;
        boolean z3;
        Modifier.Companion companion;
        Function0<ComposeUiNode> constructor;
        float f;
        String str;
        boolean z4;
        int i3;
        Function0<ComposeUiNode> constructor2;
        Function0<ComposeUiNode> constructor3;
        final LiveData<Integer> liveData5;
        Integer num;
        Function0<ComposeUiNode> constructor4;
        String strStringResource;
        String strStringResource2;
        Function0<ComposeUiNode> constructor5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i4;
        LiveData<Integer> liveData6;
        final LiveData<Integer> liveData7;
        final boolean z5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1749027708);
        int currentMarker = composerStartRestartGroup.getCurrentMarker();
        int i5 = i2 & 1;
        int i6 = i5 != 0 ? i | 2 : i;
        int i7 = i2 & 2;
        if (i7 != 0) {
            i6 |= 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i6 |= 128;
        }
        int i9 = i2 & 8;
        if (i9 == 0) {
            if ((i & 7168) == 0) {
                z2 = z;
                i6 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            }
            if ((i2 & 7) == 7 || (i6 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i5 != 0) {
                        mutableLiveData = new MutableLiveData<>("");
                    } else {
                        mutableLiveData = liveData;
                    }
                    if (i7 != 0) {
                        mutableLiveData2 = new MutableLiveData<>(20);
                    } else {
                        mutableLiveData2 = liveData2;
                    }
                    if (i8 != 0) {
                        mutableLiveData3 = new MutableLiveData<>(0);
                    } else {
                        mutableLiveData3 = liveData3;
                    }
                    liveData4 = mutableLiveData3;
                    if (i9 != 0) {
                        z3 = false;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1749027708, i, -1, "com.heytap.health.hrv.ui.item.StatusAnalyze (StressDayDataView.kt:438)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierD = ComposeItemKt.d(companion);
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
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierD);
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
                    d(StringResources_androidKt.stringResource(R$string.health_hrv_today_status_analyze, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
                    f = 10;
                    DividerKt.m1008DivideroMI9zvI(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(f), 0.0f, 0.0f, 13, null), ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_10alpha, composerStartRestartGroup, 0), Dp.m4104constructorimpl((float) 0.33d), 0.0f, composerStartRestartGroup, 390, 8);
                    str = (String) LiveDataAdapterKt.observeAsState(mutableLiveData, composerStartRestartGroup, 8).getValue();
                    composerStartRestartGroup.startReplaceableGroup(1164800315);
                    if (str != null || str.length() == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        TextKt.m1201Text4IGK_g(str, PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(f), 0.0f, Dp.m4104constructorimpl(12), 5, null), ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 0, 131056);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(1164800662);
                    if (!puk.INSTANCE.a() || z3) {
                        i3 = 8;
                    } else {
                        i3 = 8;
                        e(mutableLiveData2, composerStartRestartGroup, 8);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierI = I(companion, 0.0f, 0.0f, 3, null);
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierI);
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
                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor3 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(companion);
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
                    Updater.m1266setimpl(composerM1259constructorimpl3, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl3, density3, companion3.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf3.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    liveData5 = liveData4;
                    num = (Integer) LiveDataAdapterKt.observeAsState(liveData5, composerStartRestartGroup, i3).getValue();
                    Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor4 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierWeight$default);
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
                    Updater.m1266setimpl(composerM1259constructorimpl4, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl4, density4, companion3.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl4, layoutDirection4, companion3.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl4, viewConfiguration4, companion3.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf4.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    if (num != null || num.intValue() == Integer.MAX_VALUE) {
                        composerStartRestartGroup.startReplaceableGroup(1663409720);
                        strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_stress_compare_to_yesterday_null_v1, new Object[]{"--"}, composerStartRestartGroup, 64);
                        composerStartRestartGroup.endReplaceableGroup();
                        strStringResource2 = "--";
                    } else if (num.intValue() > 0) {
                        composerStartRestartGroup.startReplaceableGroup(1663409986);
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        strStringResource2 = String.format("%s%%", Arrays.copyOf(new Object[]{num}, 1));
                        Intrinsics.checkNotNullExpressionValue(strStringResource2, "format(...)");
                        strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_stress_compare_to_yesterday_up_v1, new Object[]{strStringResource2}, composerStartRestartGroup, 64);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (num.intValue() < 0) {
                        composerStartRestartGroup.startReplaceableGroup(1663410192);
                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                        strStringResource2 = String.format("%s%%", Arrays.copyOf(new Object[]{Integer.valueOf(Math.abs(num.intValue()))}, 1));
                        Intrinsics.checkNotNullExpressionValue(strStringResource2, "format(...)");
                        strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_stress_compare_to_yesterday_down_v1, new Object[]{strStringResource2}, composerStartRestartGroup, 64);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(1663410481);
                        strStringResource2 = StringResources_androidKt.stringResource(R$string.health_hrv_stress_compare_to_equal, composerStartRestartGroup, 0);
                        strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_stress_compare_to_yesterday_equal_v1, new Object[]{strStringResource2}, composerStartRestartGroup, 64);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    h(strStringResource, strStringResource2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor5 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(companion);
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
                    Updater.m1266setimpl(composerM1259constructorimpl5, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl5, density5, companion3.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl5, layoutDirection5, companion3.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl5, viewConfiguration5, companion3.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf5.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    if (num != null || num.intValue() == Integer.MAX_VALUE) {
                        composerStartRestartGroup.endToMarker(currentMarker);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final LiveData<String> liveData8 = mutableLiveData;
                        final LiveData<Integer> liveData9 = mutableLiveData2;
                        final boolean z6 = z3;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$StatusAnalyze$1$1$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                                invoke(composer2, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i10) {
                                StressDayDataViewKt.m(liveData8, liveData9, liveData5, z6, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    if (num.intValue() > 0) {
                        i4 = R$drawable.health_hrv_ic_up;
                    } else {
                        i4 = num.intValue() < 0 ? R$drawable.health_hrv_ic_down : R$drawable.health_hrv_ic_equal;
                    }
                    liveData6 = liveData5;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i4, composerStartRestartGroup, 0), "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 124);
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
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    liveData7 = mutableLiveData2;
                    z5 = z3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    mutableLiveData = liveData;
                    mutableLiveData2 = liveData2;
                    liveData4 = liveData3;
                }
                z3 = z2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1749027708, i, -1, "com.heytap.health.hrv.ui.item.StatusAnalyze (StressDayDataView.kt:438)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierD2 = ComposeItemKt.d(companion);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement2.getTop();
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration6 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                constructor = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifierD2);
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
                Updater.m1266setimpl(composerM1259constructorimpl6, measurePolicyColumnMeasurePolicy4, companion5.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl6, density6, companion5.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl6, layoutDirection6, companion5.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl6, viewConfiguration6, companion5.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf6.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                d(StringResources_androidKt.stringResource(R$string.health_hrv_today_status_analyze, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
                f = 10;
                DividerKt.m1008DivideroMI9zvI(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(f), 0.0f, 0.0f, 13, null), ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_10alpha, composerStartRestartGroup, 0), Dp.m4104constructorimpl((float) 0.33d), 0.0f, composerStartRestartGroup, 390, 8);
                str = (String) LiveDataAdapterKt.observeAsState(mutableLiveData, composerStartRestartGroup, 8).getValue();
                composerStartRestartGroup.startReplaceableGroup(1164800315);
                if (str != null) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (!z4) {
                    TextKt.m1201Text4IGK_g(str, PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(f), 0.0f, Dp.m4104constructorimpl(12), 5, null), ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 0, 131056);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(1164800662);
                if (puk.INSTANCE.a()) {
                    i3 = 8;
                } else {
                    i3 = 8;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierI2 = I(companion, 0.0f, 0.0f, 3, null);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration7 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifierI2);
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
                Updater.m1266setimpl(composerM1259constructorimpl7, measurePolicyColumnMeasurePolicy5, companion5.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl7, density7, companion5.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl7, layoutDirection7, companion5.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl7, viewConfiguration7, companion5.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf7.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                Alignment.Vertical centerVertically3 = companion4.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement2.getStart(), centerVertically3, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density8 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection8 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration8 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor3 = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf8 = LayoutKt.materializerOf(companion);
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
                Updater.m1266setimpl(composerM1259constructorimpl8, measurePolicyRowMeasurePolicy3, companion5.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl8, density8, companion5.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl8, layoutDirection8, companion5.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl8, viewConfiguration8, companion5.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf8.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                liveData5 = liveData4;
                num = (Integer) LiveDataAdapterKt.observeAsState(liveData5, composerStartRestartGroup, i3).getValue();
                Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance2, companion, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density9 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection9 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration9 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor4 = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf9 = LayoutKt.materializerOf(modifierWeight$default2);
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
                Updater.m1266setimpl(composerM1259constructorimpl9, measurePolicyColumnMeasurePolicy6, companion5.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl9, density9, companion5.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl9, layoutDirection9, companion5.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl9, viewConfiguration9, companion5.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf9.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                if (num != null) {
                    composerStartRestartGroup.startReplaceableGroup(1663409720);
                    strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_stress_compare_to_yesterday_null_v1, new Object[]{"--"}, composerStartRestartGroup, 64);
                    composerStartRestartGroup.endReplaceableGroup();
                    strStringResource2 = "--";
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1663409720);
                    strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_stress_compare_to_yesterday_null_v1, new Object[]{"--"}, composerStartRestartGroup, 64);
                    composerStartRestartGroup.endReplaceableGroup();
                    strStringResource2 = "--";
                }
                h(strStringResource, strStringResource2, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Alignment.Vertical centerVertically4 = companion4.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement2.getStart(), centerVertically4, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density10 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection10 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration10 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor5 = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf10 = LayoutKt.materializerOf(companion);
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
                Updater.m1266setimpl(composerM1259constructorimpl10, measurePolicyRowMeasurePolicy4, companion5.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl10, density10, companion5.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl10, layoutDirection10, companion5.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl10, viewConfiguration10, companion5.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf10.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                if (num != null) {
                }
                composerStartRestartGroup.endToMarker(currentMarker);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final LiveData<String> liveData10 = mutableLiveData;
                final LiveData<Integer> liveData11 = mutableLiveData2;
                final boolean z7 = z3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$StatusAnalyze$1$1$1$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p010kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                        invoke(composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i10) {
                        StressDayDataViewKt.m(liveData10, liveData11, liveData5, z7, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            composerStartRestartGroup.skipToGroupEnd();
            mutableLiveData = liveData;
            liveData7 = liveData2;
            liveData6 = liveData3;
            z5 = z2;
            scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                return;
            }
            final LiveData<String> liveData12 = mutableLiveData;
            final LiveData<Integer> liveData13 = liveData6;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$StatusAnalyze$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                    invoke(composer2, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i10) {
                    StressDayDataViewKt.m(liveData12, liveData7, liveData13, z5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i6 |= 3072;
        z2 = z;
        if ((i2 & 7) == 7) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    mutableLiveData = new MutableLiveData<>("");
                } else {
                    mutableLiveData = liveData;
                }
                if (i7 != 0) {
                    mutableLiveData2 = new MutableLiveData<>(20);
                } else {
                    mutableLiveData2 = liveData2;
                }
                if (i8 != 0) {
                    mutableLiveData3 = new MutableLiveData<>(0);
                } else {
                    mutableLiveData3 = liveData3;
                }
                liveData4 = mutableLiveData3;
                if (i9 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
            } else {
                if (i5 != 0) {
                    mutableLiveData = new MutableLiveData<>("");
                } else {
                    mutableLiveData = liveData;
                }
                if (i7 != 0) {
                    mutableLiveData2 = new MutableLiveData<>(20);
                } else {
                    mutableLiveData2 = liveData2;
                }
                if (i8 != 0) {
                    mutableLiveData3 = new MutableLiveData<>(0);
                } else {
                    mutableLiveData3 = liveData3;
                }
                liveData4 = mutableLiveData3;
                if (i9 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1749027708, i, -1, "com.heytap.health.hrv.ui.item.StatusAnalyze (StressDayDataView.kt:438)");
            }
            companion = Modifier.INSTANCE;
            Modifier modifierD3 = ComposeItemKt.d(companion);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement3 = Arrangement.INSTANCE;
            Arrangement.Vertical top3 = arrangement3.getTop();
            Alignment.Companion companion6 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(top3, companion6.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density11 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection11 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration11 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
            constructor = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11 = LayoutKt.materializerOf(modifierD3);
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
            Updater.m1266setimpl(composerM1259constructorimpl11, measurePolicyColumnMeasurePolicy7, companion7.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl11, density11, companion7.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl11, layoutDirection11, companion7.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl11, viewConfiguration11, companion7.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf11.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            d(StringResources_androidKt.stringResource(R$string.health_hrv_today_status_analyze, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
            f = 10;
            DividerKt.m1008DivideroMI9zvI(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(f), 0.0f, 0.0f, 13, null), ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_10alpha, composerStartRestartGroup, 0), Dp.m4104constructorimpl((float) 0.33d), 0.0f, composerStartRestartGroup, 390, 8);
            str = (String) LiveDataAdapterKt.observeAsState(mutableLiveData, composerStartRestartGroup, 8).getValue();
            composerStartRestartGroup.startReplaceableGroup(1164800315);
            if (str != null) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (!z4) {
                TextKt.m1201Text4IGK_g(str, PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(f), 0.0f, Dp.m4104constructorimpl(12), 5, null), ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 0, 131056);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1164800662);
            if (puk.INSTANCE.a()) {
                i3 = 8;
            } else {
                i3 = 8;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierI3 = I(companion, 0.0f, 0.0f, 3, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy8 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion6.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density12 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection12 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration12 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf12 = LayoutKt.materializerOf(modifierI3);
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
            Updater.m1266setimpl(composerM1259constructorimpl12, measurePolicyColumnMeasurePolicy8, companion7.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl12, density12, companion7.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl12, layoutDirection12, companion7.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl12, viewConfiguration12, companion7.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf12.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Alignment.Vertical centerVertically5 = companion6.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement3.getStart(), centerVertically5, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density13 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection13 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration13 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor3 = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf13 = LayoutKt.materializerOf(companion);
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
            Composer composerM1259constructorimpl13 = Updater.m1259constructorimpl(composerStartRestartGroup);
            Updater.m1266setimpl(composerM1259constructorimpl13, measurePolicyRowMeasurePolicy5, companion7.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl13, density13, companion7.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl13, layoutDirection13, companion7.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl13, viewConfiguration13, companion7.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf13.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            liveData5 = liveData4;
            num = (Integer) LiveDataAdapterKt.observeAsState(liveData5, composerStartRestartGroup, i3).getValue();
            Modifier modifierWeight$default3 = RowScope.weight$default(rowScopeInstance3, companion, 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy9 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion6.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density14 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection14 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration14 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor4 = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf14 = LayoutKt.materializerOf(modifierWeight$default3);
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
            Composer composerM1259constructorimpl14 = Updater.m1259constructorimpl(composerStartRestartGroup);
            Updater.m1266setimpl(composerM1259constructorimpl14, measurePolicyColumnMeasurePolicy9, companion7.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl14, density14, companion7.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl14, layoutDirection14, companion7.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl14, viewConfiguration14, companion7.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf14.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            if (num != null) {
                composerStartRestartGroup.startReplaceableGroup(1663409720);
                strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_stress_compare_to_yesterday_null_v1, new Object[]{"--"}, composerStartRestartGroup, 64);
                composerStartRestartGroup.endReplaceableGroup();
                strStringResource2 = "--";
            } else {
                composerStartRestartGroup.startReplaceableGroup(1663409720);
                strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_stress_compare_to_yesterday_null_v1, new Object[]{"--"}, composerStartRestartGroup, 64);
                composerStartRestartGroup.endReplaceableGroup();
                strStringResource2 = "--";
            }
            h(strStringResource, strStringResource2, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Alignment.Vertical centerVertically6 = companion6.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement3.getStart(), centerVertically6, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density15 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection15 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration15 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor5 = companion7.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf15 = LayoutKt.materializerOf(companion);
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
            Composer composerM1259constructorimpl15 = Updater.m1259constructorimpl(composerStartRestartGroup);
            Updater.m1266setimpl(composerM1259constructorimpl15, measurePolicyRowMeasurePolicy6, companion7.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl15, density15, companion7.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl15, layoutDirection15, companion7.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl15, viewConfiguration15, companion7.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf15.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            if (num != null) {
            }
            composerStartRestartGroup.endToMarker(currentMarker);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final LiveData<String> liveData14 = mutableLiveData;
            final LiveData<Integer> liveData15 = mutableLiveData2;
            final boolean z8 = z3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$StatusAnalyze$1$1$1$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                    invoke(composer2, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i10) {
                    StressDayDataViewKt.m(liveData14, liveData15, liveData5, z8, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
            return;
        }
        composerStartRestartGroup.startDefaults();
        if ((i & 1) != 0) {
            if (i5 != 0) {
                mutableLiveData = new MutableLiveData<>("");
            } else {
                mutableLiveData = liveData;
            }
            if (i7 != 0) {
                mutableLiveData2 = new MutableLiveData<>(20);
            } else {
                mutableLiveData2 = liveData2;
            }
            if (i8 != 0) {
                mutableLiveData3 = new MutableLiveData<>(0);
            } else {
                mutableLiveData3 = liveData3;
            }
            liveData4 = mutableLiveData3;
            if (i9 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
        } else {
            if (i5 != 0) {
                mutableLiveData = new MutableLiveData<>("");
            } else {
                mutableLiveData = liveData;
            }
            if (i7 != 0) {
                mutableLiveData2 = new MutableLiveData<>(20);
            } else {
                mutableLiveData2 = liveData2;
            }
            if (i8 != 0) {
                mutableLiveData3 = new MutableLiveData<>(0);
            } else {
                mutableLiveData3 = liveData3;
            }
            liveData4 = mutableLiveData3;
            if (i9 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
        }
        composerStartRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1749027708, i, -1, "com.heytap.health.hrv.ui.item.StatusAnalyze (StressDayDataView.kt:438)");
        }
        companion = Modifier.INSTANCE;
        Modifier modifierD4 = ComposeItemKt.d(companion);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement4 = Arrangement.INSTANCE;
        Arrangement.Vertical top4 = arrangement4.getTop();
        Alignment.Companion companion8 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy10 = ColumnKt.columnMeasurePolicy(top4, companion8.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density16 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection16 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration16 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
        constructor = companion9.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf16 = LayoutKt.materializerOf(modifierD4);
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
        Composer composerM1259constructorimpl16 = Updater.m1259constructorimpl(composerStartRestartGroup);
        Updater.m1266setimpl(composerM1259constructorimpl16, measurePolicyColumnMeasurePolicy10, companion9.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl16, density16, companion9.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl16, layoutDirection16, companion9.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl16, viewConfiguration16, companion9.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf16.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
        d(StringResources_androidKt.stringResource(R$string.health_hrv_today_status_analyze, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
        f = 10;
        DividerKt.m1008DivideroMI9zvI(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(f), 0.0f, 0.0f, 13, null), ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_10alpha, composerStartRestartGroup, 0), Dp.m4104constructorimpl((float) 0.33d), 0.0f, composerStartRestartGroup, 390, 8);
        str = (String) LiveDataAdapterKt.observeAsState(mutableLiveData, composerStartRestartGroup, 8).getValue();
        composerStartRestartGroup.startReplaceableGroup(1164800315);
        if (str != null) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (!z4) {
            TextKt.m1201Text4IGK_g(str, PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(f), 0.0f, Dp.m4104constructorimpl(12), 5, null), ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_90alpha, composerStartRestartGroup, 0), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 0, 131056);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1164800662);
        if (puk.INSTANCE.a()) {
            i3 = 8;
        } else {
            i3 = 8;
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierI4 = I(companion, 0.0f, 0.0f, 3, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy11 = ColumnKt.columnMeasurePolicy(arrangement4.getTop(), companion8.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density17 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection17 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration17 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        constructor2 = companion9.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf17 = LayoutKt.materializerOf(modifierI4);
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
        Composer composerM1259constructorimpl17 = Updater.m1259constructorimpl(composerStartRestartGroup);
        Updater.m1266setimpl(composerM1259constructorimpl17, measurePolicyColumnMeasurePolicy11, companion9.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl17, density17, companion9.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl17, layoutDirection17, companion9.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl17, viewConfiguration17, companion9.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf17.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Alignment.Vertical centerVertically7 = companion8.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(arrangement4.getStart(), centerVertically7, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density18 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection18 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration18 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        constructor3 = companion9.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf18 = LayoutKt.materializerOf(companion);
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
        Composer composerM1259constructorimpl18 = Updater.m1259constructorimpl(composerStartRestartGroup);
        Updater.m1266setimpl(composerM1259constructorimpl18, measurePolicyRowMeasurePolicy7, companion9.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl18, density18, companion9.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl18, layoutDirection18, companion9.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl18, viewConfiguration18, companion9.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf18.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
        liveData5 = liveData4;
        num = (Integer) LiveDataAdapterKt.observeAsState(liveData5, composerStartRestartGroup, i3).getValue();
        Modifier modifierWeight$default4 = RowScope.weight$default(rowScopeInstance4, companion, 1.0f, false, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy12 = ColumnKt.columnMeasurePolicy(arrangement4.getTop(), companion8.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density19 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection19 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration19 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        constructor4 = companion9.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf19 = LayoutKt.materializerOf(modifierWeight$default4);
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
        Composer composerM1259constructorimpl19 = Updater.m1259constructorimpl(composerStartRestartGroup);
        Updater.m1266setimpl(composerM1259constructorimpl19, measurePolicyColumnMeasurePolicy12, companion9.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl19, density19, companion9.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl19, layoutDirection19, companion9.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl19, viewConfiguration19, companion9.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf19.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        if (num != null) {
            composerStartRestartGroup.startReplaceableGroup(1663409720);
            strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_stress_compare_to_yesterday_null_v1, new Object[]{"--"}, composerStartRestartGroup, 64);
            composerStartRestartGroup.endReplaceableGroup();
            strStringResource2 = "--";
        } else {
            composerStartRestartGroup.startReplaceableGroup(1663409720);
            strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_stress_compare_to_yesterday_null_v1, new Object[]{"--"}, composerStartRestartGroup, 64);
            composerStartRestartGroup.endReplaceableGroup();
            strStringResource2 = "--";
        }
        h(strStringResource, strStringResource2, composerStartRestartGroup, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Alignment.Vertical centerVertically8 = companion8.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy8 = RowKt.rowMeasurePolicy(arrangement4.getStart(), centerVertically8, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration110 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        constructor5 = companion9.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf110 = LayoutKt.materializerOf(companion);
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
        Composer composerM1259constructorimpl110 = Updater.m1259constructorimpl(composerStartRestartGroup);
        Updater.m1266setimpl(composerM1259constructorimpl110, measurePolicyRowMeasurePolicy8, companion9.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl110, density110, companion9.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl110, layoutDirection110, companion9.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl110, viewConfiguration110, companion9.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf110.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        if (num != null) {
        }
        composerStartRestartGroup.endToMarker(currentMarker);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final LiveData<String> liveData16 = mutableLiveData;
        final LiveData<Integer> liveData17 = mutableLiveData2;
        final boolean z9 = z3;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$StatusAnalyze$1$1$1$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                invoke(composer2, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i10) {
                StressDayDataViewKt.m(liveData16, liveData17, liveData5, z9, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
        return;
        scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        final LiveData<String> liveData18 = mutableLiveData;
        final LiveData<Integer> liveData19 = liveData6;
        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$StatusAnalyze$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                invoke(composer2, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i10) {
                StressDayDataViewKt.m(liveData18, liveData7, liveData19, z5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void n(LiveData<List<Integer>> liveData, LiveData<List<Integer>> liveData2, Composer composer, final int i, final int i2) {
        LiveData<List<Integer>> mutableLiveData;
        LiveData<List<Integer>> liveData3;
        final LiveData<List<Integer>> liveData4;
        final LiveData<List<Integer>> liveData5;
        List<Integer> value;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1660030231);
        int currentMarker = composerStartRestartGroup.getCurrentMarker();
        int i3 = i2 & 1;
        int i4 = i3 != 0 ? i | 2 : i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 |= 16;
        }
        if ((i2 & 3) == 3 && (i4 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            liveData4 = liveData;
            liveData5 = liveData2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                LiveData<List<Integer>> mutableLiveData2 = i3 != 0 ? new MutableLiveData<>(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 0, 0, 0})) : liveData;
                if (i5 != 0) {
                    liveData3 = mutableLiveData2;
                    mutableLiveData = new MutableLiveData(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 0, 0, 0}));
                } else {
                    mutableLiveData = liveData2;
                    liveData3 = mutableLiveData2;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                liveData3 = liveData;
                mutableLiveData = liveData2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1660030231, i, -1, "com.heytap.health.hrv.ui.item.StatusPercent (StressDayDataView.kt:277)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierD = ComposeItemKt.d(companion);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierD);
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
            d(StringResources_androidKt.stringResource(R$string.health_hrv_today_status_percent, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
            final LiveData<List<Integer>> liveData6 = mutableLiveData;
            liveData4 = liveData3;
            DividerKt.m1008DivideroMI9zvI(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(10), 0.0f, Dp.m4104constructorimpl(20), 5, null), ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_10alpha, composerStartRestartGroup, 0), Dp.m4104constructorimpl((float) 0.33d), 0.0f, composerStartRestartGroup, 390, 8);
            List list = (List) LiveDataAdapterKt.observeAsState(liveData4, composerStartRestartGroup, 8).getValue();
            Integer numValueOf = list != null ? Integer.valueOf(CollectionsKt___CollectionsKt.sumOfInt(list)) : null;
            composerStartRestartGroup.startReplaceableGroup(-1677642936);
            if (numValueOf == null || numValueOf.intValue() == 0) {
                TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(R$string.health_hrv_status_no_data, composerStartRestartGroup, 0), (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_85alpha, composerStartRestartGroup, 0), TextUnitKt.getSp(20), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
                composerStartRestartGroup.endToMarker(currentMarker);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$StatusPercent$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p010kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i6) {
                        StressDayDataViewKt.n(liveData4, liveData6, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            composerStartRestartGroup.endReplaceableGroup();
            k(list, composerStartRestartGroup, 8);
            List<Integer> value2 = liveData6.getValue();
            if ((value2 != null && value2.size() == 4) && list.size() == 4 && (value = liveData6.getValue()) != null) {
                int i6 = R$plurals.health_hrv_percent_content_v1;
                th7.d(i6, value.get(0).intValue(), String.valueOf(((Number) list.get(0)).intValue()), String.valueOf(value.get(0).intValue()));
                String content1 = th7.d(i6, value.get(0).intValue(), String.valueOf(((Number) list.get(0)).intValue()), String.valueOf(value.get(0).intValue()));
                int i7 = R$string.health_hrv_status_excellent;
                Intrinsics.checkNotNullExpressionValue(content1, "content1");
                l(i7, content1, composerStartRestartGroup, 0);
                String content2 = th7.d(i6, value.get(1).intValue(), String.valueOf(((Number) list.get(1)).intValue()), String.valueOf(value.get(1).intValue()));
                int i8 = R$string.health_hrv_status_good;
                Intrinsics.checkNotNullExpressionValue(content2, "content2");
                l(i8, content2, composerStartRestartGroup, 0);
                String content3 = th7.d(i6, value.get(2).intValue(), String.valueOf(((Number) list.get(2)).intValue()), String.valueOf(value.get(2).intValue()));
                int i9 = R$string.health_hrv_status_normal_v1;
                Intrinsics.checkNotNullExpressionValue(content3, "content3");
                l(i9, content3, composerStartRestartGroup, 0);
                String content4 = th7.d(i6, value.get(3).intValue(), String.valueOf(((Number) list.get(3)).intValue()), String.valueOf(value.get(3).intValue()));
                int i10 = R$string.health_hrv_status_stress_over_v1;
                Intrinsics.checkNotNullExpressionValue(content4, "content4");
                l(i10, content4, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            liveData5 = liveData6;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$StatusPercent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i11) {
                StressDayDataViewKt.n(liveData4, liveData5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void o(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(913784464);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(913784464, i, -1, "com.heytap.health.hrv.ui.item.Tips (StressDayDataView.kt:209)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final MutableState mutableState = (MutableState) objRememberedValue;
            AnimatedVisibilityKt.AnimatedVisibility(p(mutableState) && fdg.x(HrvConstant.PHYSICAL_MENTAL_NAME).r(HrvConstant.SHOW_HRV_TIPS, true), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 973032632, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$Tips$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // p010kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@NotNull AnimatedVisibilityScope AnimatedVisibility, @Nullable Composer composer2, int i2) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(973032632, i2, -1, "com.heytap.health.hrv.ui.item.Tips.<anonymous> (StressDayDataView.kt:218)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierD = ComposeItemKt.d(companion);
                    final MutableState<Boolean> mutableState2 = mutableState;
                    final Context context2 = context;
                    composer2.startReplaceableGroup(-483455358);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierD);
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
                    Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl, density, companion3.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
                    composer2.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer composerM1259constructorimpl2 = Updater.m1259constructorimpl(composer2);
                    Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion3.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                    composer2.enableReusing();
                    function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Modifier modifierWeight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection3 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierWeight$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer composerM1259constructorimpl3 = Updater.m1259constructorimpl(composer2);
                    Updater.m1266setimpl(composerM1259constructorimpl3, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m1266setimpl(composerM1259constructorimpl3, density3, companion3.getSetDensity());
                    Updater.m1266setimpl(composerM1259constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                    Updater.m1266setimpl(composerM1259constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
                    composer2.enableReusing();
                    function3MaterializerOf3.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    StressDayDataViewKt.d(StringResources_androidKt.stringResource(R$string.health_hrv_about_tips, composer2, 0), composer2, 0);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier modifierM469size3ABfNKs = SizeKt.m469size3ABfNKs(companion, Dp.m4104constructorimpl(24));
                    composer2.startReplaceableGroup(1157296644);
                    boolean zChanged = composer2.changed(mutableState2);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$Tips$1$1$1$2$1
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
                                StressDayDataViewKt.q(mutableState2, false);
                                fdg.x(HrvConstant.PHYSICAL_MENTAL_NAME).W(HrvConstant.SHOW_HRV_TIPS, false);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(R$drawable.health_hrv_cancel_icon, composer2, 0), "", ClickableKt.m187clickableXHw0xAI$default(modifierM469size3ABfNKs, false, null, null, (Function0) objRememberedValue2, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    float f = 10;
                    DividerKt.m1008DivideroMI9zvI(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(f), 0.0f, Dp.m4104constructorimpl(12), 5, null), ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_10alpha, composer2, 0), Dp.m4104constructorimpl((float) 0.33d), 0.0f, composer2, 390, 8);
                    String strStringResource = StringResources_androidKt.stringResource(R$string.health_hrv_about_tips_des, composer2, 0);
                    long sp = TextUnitKt.getSp(14);
                    FontWeight.Companion companion4 = FontWeight.INSTANCE;
                    TextKt.m1201Text4IGK_g(strStringResource, (Modifier) null, ColorResources_androidKt.colorResource(com.heytap.health.health_base.R$color.health_base_black_55alpha, composer2, 0), sp, (FontStyle) null, companion4.getW400(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
                    TextKt.m1201Text4IGK_g(StringResources_androidKt.stringResource(com.heytap.health.health_base.R$string.health_base_learn_more_2, composer2, 0), ClickableKt.m187clickableXHw0xAI$default(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, Dp.m4104constructorimpl(f), 0.0f, 0.0f, 13, null), false, null, null, new Function0<Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$Tips$1$1$2
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
                            context2.startActivity(new Intent(context2, (Class<?>) StressDetailDescriptionActivity.class));
                        }
                    }, 7, null), ColorKt.Color(4294949224L), TextUnitKt.getSp(14), (FontStyle) null, companion4.getW500(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200064, 0, 131024);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$Tips$2
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
                StressDayDataViewKt.o(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    public static final boolean p(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void q(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(locale = "zh")
    public static final void r(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1585714877);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1585714877, i, -1, "com.heytap.health.hrv.ui.item.View (StressDayDataView.kt:1028)");
            }
            e88.d((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
            Random.Companion r3 = Random.INSTANCE;
            new MutableLiveData(new PhysicalMentalAchievement("12345", 20241002, "test", null, 2, 80, r3.nextInt(1, 101), r3.nextInt(3, 5), r3.nextInt(3, 5), 4, r3.nextInt(1, 18000), 8000, r3.nextInt(1, 22), 12, r3.nextInt(14400, 46800), 420, 500, r3.nextInt(240, 1140), kr8.WORST_100MI_PACE, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, -524288, 1, null));
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
            Modifier modifierM163backgroundbw27NRU$default = BackgroundKt.m163backgroundbw27NRU$default(PaddingKt.m430paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m4104constructorimpl(10), 7, null), ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_card_white_bg, composerStartRestartGroup, 0), null, 2, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM163backgroundbw27NRU$default);
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
            Updater.m1266setimpl(composerM1259constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl2, density2, companion3.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposeItemKt.b(composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            m(null, null, null, false, composerStartRestartGroup, 0, 15);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.item.StressDayDataViewKt$View$2
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
                StressDayDataViewKt.r(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}