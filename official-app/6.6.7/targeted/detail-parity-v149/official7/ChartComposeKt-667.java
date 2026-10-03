package com.heytap.health.bodyfat.ui;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.ColorResources_androidKt;
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
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.heytap.health.base.R$string;
import com.heytap.health.bodyfat.R$color;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.ChartXY;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.x1k;
import com.oplus.backup.sdk.common.utils.ModuleType;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsJvmKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.random.Random;
import p010kotlin.random.RandomKt;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aå\u0002\u0010&\u001a\u00020\u001f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f2$\u0010\u0014\u001a \u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00050\u00112\u0006\u0010\u0015\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00162\u0006\u0010\u0018\u001a\u00020\u00122\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00122\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u001d2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001d2\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001d2\u001c\b\u0002\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0012\u0018\u00010\"2\b\b\u0002\u0010%\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001a\u0014\u0010*\u001a\u00020\u001f*\u00020(2\u0006\u0010)\u001a\u00020\rH\u0002\u001a\u000f\u0010+\u001a\u00020\u001fH\u0007¢\u0006\u0004\b+\u0010,\u001a\u000f\u0010-\u001a\u00020\u001fH\u0007¢\u0006\u0004\b-\u0010,\u001a\u000f\u0010.\u001a\u00020\u001fH\u0007¢\u0006\u0004\b.\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006/"}, d2 = {"", "heightDp", "Lcom/heytap/health/bodyfat/ui/ChartDrawableData;", "leftDrawableData", "rightDrawableData", "", "leftAuxiliaryDrawableData", "rightAuxiliaryDrawableData", "", "yLabelCount", "Landroidx/compose/ui/unit/Dp;", "leftYLabelWidthDp", "rightYLabelWidthDp", "", "showBoundaryLine", "Landroidx/compose/runtime/MutableState;", "markerIndex", "Lkotlin/Function3;", "", "", "markerLabelFormat", "offsetYDp", "Lkotlin/Pair;", "minMax", "visibleDuration", "visibleStart", "Lcom/heytap/health/bodyfat/ui/ChartScrollSnapUnit;", "scrollSnapUnit", "xLabelOffset", "Lkotlin/Function1;", "xLabelFormat", "", "onMarkerChange", "onVisibleStartChange", "Lkotlin/Function2;", "Lcom/heytap/health/bodyfat/ui/ChartScrollDirection;", "onScrollEnd", "xLabelClipExtendDp", "a", "(FLcom/heytap/health/bodyfat/ui/ChartDrawableData;Lcom/heytap/health/bodyfat/ui/ChartDrawableData;Ljava/util/List;Ljava/util/List;IFFZLandroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function3;FLkotlin/Pair;JJLcom/heytap/health/bodyfat/ui/ChartScrollSnapUnit;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;FLandroidx/compose/runtime/Composer;IIII)V", "Landroid/view/View;", "disallowIntercept", "D", LogFieldKey.PROCESS_NAME_KEY, "(Landroidx/compose/runtime/Composer;I)V", "o", "q", "bodyfat_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nChartCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChartCompose.kt\ncom/heytap/health/bodyfat/ui/ChartComposeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1336:1\n154#2:1337\n154#2:1338\n154#2:1339\n154#2:1340\n154#2:1341\n154#2:1342\n174#2:1419\n174#2:1420\n154#2:1422\n174#2:1423\n154#2:1424\n154#2:1425\n174#2:1444\n154#2:1452\n154#2:1498\n154#2:1537\n76#3:1343\n76#3:1344\n76#3:1345\n76#3:1460\n76#3:1506\n76#3:1545\n1#4:1346\n50#5:1347\n49#5:1348\n50#5:1355\n49#5:1356\n50#5:1363\n49#5:1364\n36#5:1371\n36#5:1378\n25#5:1385\n25#5:1392\n50#5:1399\n49#5:1400\n25#5:1411\n83#5,3:1426\n83#5,3:1435\n36#5:1445\n460#5,13:1472\n25#5:1486\n473#5,3:1493\n460#5,13:1518\n473#5,3:1532\n460#5,13:1557\n25#5:1571\n473#5,3:1578\n1114#6,6:1349\n1114#6,6:1357\n1114#6,6:1365\n1114#6,6:1372\n1114#6,6:1379\n1114#6,6:1386\n1114#6,6:1393\n1114#6,3:1401\n1117#6,3:1408\n1114#6,6:1412\n1114#6,6:1429\n1114#6,6:1438\n1114#6,6:1446\n1114#6,6:1487\n1114#6,6:1572\n1855#7,2:1404\n1855#7,2:1406\n51#8:1418\n58#8:1421\n67#9,6:1453\n73#9:1485\n77#9:1497\n67#9,6:1499\n73#9:1531\n77#9:1536\n67#9,6:1538\n73#9:1570\n77#9:1582\n75#10:1459\n76#10,11:1461\n89#10:1496\n75#10:1505\n76#10,11:1507\n89#10:1535\n75#10:1544\n76#10,11:1546\n89#10:1581\n76#11:1583\n102#11,2:1584\n76#11:1586\n102#11,2:1587\n76#11:1589\n76#11:1590\n76#11:1591\n76#11:1592\n76#11:1593\n76#11:1594\n*S KotlinDebug\n*F\n+ 1 ChartCompose.kt\ncom/heytap/health/bodyfat/ui/ChartComposeKt\n*L\n152#1:1337\n154#1:1338\n215#1:1339\n222#1:1340\n224#1:1341\n226#1:1342\n318#1:1419\n319#1:1420\n324#1:1422\n329#1:1423\n333#1:1424\n344#1:1425\n445#1:1444\n1207#1:1452\n1262#1:1498\n1317#1:1537\n229#1:1343\n230#1:1344\n231#1:1345\n1205#1:1460\n1260#1:1506\n1315#1:1545\n237#1:1347\n237#1:1348\n249#1:1355\n249#1:1356\n261#1:1363\n261#1:1364\n274#1:1371\n282#1:1378\n294#1:1385\n296#1:1392\n299#1:1399\n299#1:1400\n315#1:1411\n382#1:1426,3\n399#1:1435,3\n446#1:1445\n1205#1:1472,13\n1221#1:1486\n1205#1:1493,3\n1260#1:1518,13\n1260#1:1532,3\n1315#1:1557,13\n1333#1:1571\n1315#1:1578,3\n237#1:1349,6\n249#1:1357,6\n261#1:1365,6\n274#1:1372,6\n282#1:1379,6\n294#1:1386,6\n296#1:1393,6\n299#1:1401,3\n299#1:1408,3\n315#1:1412,6\n382#1:1429,6\n399#1:1438,6\n446#1:1446,6\n1221#1:1487,6\n1333#1:1572,6\n301#1:1404,2\n302#1:1406,2\n316#1:1418\n319#1:1421\n1205#1:1453,6\n1205#1:1485\n1205#1:1497\n1260#1:1499,6\n1260#1:1531\n1260#1:1536\n1315#1:1538,6\n1315#1:1570\n1315#1:1582\n1205#1:1459\n1205#1:1461,11\n1205#1:1496\n1260#1:1505\n1260#1:1507,11\n1260#1:1535\n1315#1:1544\n1315#1:1546,11\n1315#1:1581\n294#1:1583\n294#1:1584,2\n296#1:1586\n296#1:1587,2\n308#1:1589\n309#1:1590\n310#1:1591\n311#1:1592\n312#1:1593\n334#1:1594\n*E\n"})
public final class ChartComposeKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChartScrollSnapUnit.values().length];
            try {
                iArr[ChartScrollSnapUnit.MILLISECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChartScrollSnapUnit.SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChartScrollSnapUnit.MINUTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChartScrollSnapUnit.HOUR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChartScrollSnapUnit.DAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ChartScrollSnapUnit.MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void D(View view, boolean z) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0146  */
    /* JADX WARN: Code duplicated, block: B:101:0x0149  */
    /* JADX WARN: Code duplicated, block: B:103:0x014d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0153  */
    /* JADX WARN: Code duplicated, block: B:106:0x0156  */
    /* JADX WARN: Code duplicated, block: B:110:0x015d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0160  */
    /* JADX WARN: Code duplicated, block: B:113:0x0164  */
    /* JADX WARN: Code duplicated, block: B:115:0x016a  */
    /* JADX WARN: Code duplicated, block: B:116:0x016d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0176  */
    /* JADX WARN: Code duplicated, block: B:122:0x017c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0185  */
    /* JADX WARN: Code duplicated, block: B:127:0x0189  */
    /* JADX WARN: Code duplicated, block: B:130:0x0191  */
    /* JADX WARN: Code duplicated, block: B:131:0x0198  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:154:0x01db  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:160:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:161:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:163:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:165:0x0202  */
    /* JADX WARN: Code duplicated, block: B:166:0x0205  */
    /* JADX WARN: Code duplicated, block: B:170:0x020d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0214  */
    /* JADX WARN: Code duplicated, block: B:173:0x021c  */
    /* JADX WARN: Code duplicated, block: B:175:0x0222  */
    /* JADX WARN: Code duplicated, block: B:176:0x0225  */
    /* JADX WARN: Code duplicated, block: B:180:0x022d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0232  */
    /* JADX WARN: Code duplicated, block: B:183:0x0238  */
    /* JADX WARN: Code duplicated, block: B:185:0x023e  */
    /* JADX WARN: Code duplicated, block: B:186:0x0241  */
    /* JADX WARN: Code duplicated, block: B:188:0x0246  */
    /* JADX WARN: Code duplicated, block: B:191:0x024e  */
    /* JADX WARN: Code duplicated, block: B:192:0x0253  */
    /* JADX WARN: Code duplicated, block: B:194:0x0259  */
    /* JADX WARN: Code duplicated, block: B:197:0x0260  */
    /* JADX WARN: Code duplicated, block: B:201:0x026a  */
    /* JADX WARN: Code duplicated, block: B:211:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:213:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:220:0x02ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:221:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:222:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:224:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:225:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:227:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:228:0x0300  */
    /* JADX WARN: Code duplicated, block: B:230:0x0304  */
    /* JADX WARN: Code duplicated, block: B:231:0x0309  */
    /* JADX WARN: Code duplicated, block: B:233:0x030d  */
    /* JADX WARN: Code duplicated, block: B:234:0x0312  */
    /* JADX WARN: Code duplicated, block: B:236:0x0316  */
    /* JADX WARN: Code duplicated, block: B:237:0x0319  */
    /* JADX WARN: Code duplicated, block: B:240:0x0321  */
    /* JADX WARN: Code duplicated, block: B:241:0x0327  */
    /* JADX WARN: Code duplicated, block: B:243:0x032b  */
    /* JADX WARN: Code duplicated, block: B:244:0x0331  */
    /* JADX WARN: Code duplicated, block: B:246:0x0335  */
    /* JADX WARN: Code duplicated, block: B:247:0x0337  */
    /* JADX WARN: Code duplicated, block: B:249:0x033b  */
    /* JADX WARN: Code duplicated, block: B:250:0x033e  */
    /* JADX WARN: Code duplicated, block: B:253:0x0346  */
    /* JADX WARN: Code duplicated, block: B:254:0x0355  */
    /* JADX WARN: Code duplicated, block: B:256:0x0359  */
    /* JADX WARN: Code duplicated, block: B:258:0x035e  */
    /* JADX WARN: Code duplicated, block: B:259:0x0362  */
    /* JADX WARN: Code duplicated, block: B:261:0x0365  */
    /* JADX WARN: Code duplicated, block: B:262:0x0367  */
    /* JADX WARN: Code duplicated, block: B:264:0x036b  */
    /* JADX WARN: Code duplicated, block: B:265:0x036d  */
    /* JADX WARN: Code duplicated, block: B:267:0x0371  */
    /* JADX WARN: Code duplicated, block: B:268:0x0373  */
    /* JADX WARN: Code duplicated, block: B:271:0x037b  */
    /* JADX WARN: Code duplicated, block: B:272:0x038a  */
    /* JADX WARN: Code duplicated, block: B:276:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:279:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:281:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:285:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:287:0x0436  */
    /* JADX WARN: Code duplicated, block: B:289:0x043f  */
    /* JADX WARN: Code duplicated, block: B:290:0x0445  */
    /* JADX WARN: Code duplicated, block: B:292:0x0449  */
    /* JADX WARN: Code duplicated, block: B:293:0x0450  */
    /* JADX WARN: Code duplicated, block: B:296:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:298:0x04be  */
    /* JADX WARN: Code duplicated, block: B:301:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:303:0x0506  */
    /* JADX WARN: Code duplicated, block: B:306:0x054c  */
    /* JADX WARN: Code duplicated, block: B:308:0x0554  */
    /* JADX WARN: Code duplicated, block: B:311:0x0590  */
    /* JADX WARN: Code duplicated, block: B:313:0x0598  */
    /* JADX WARN: Code duplicated, block: B:316:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:318:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:321:0x0604  */
    /* JADX WARN: Code duplicated, block: B:322:0x0612  */
    /* JADX WARN: Code duplicated, block: B:325:0x062b  */
    /* JADX WARN: Code duplicated, block: B:328:0x0639  */
    /* JADX WARN: Code duplicated, block: B:329:0x063e  */
    /* JADX WARN: Code duplicated, block: B:331:0x0641  */
    /* JADX WARN: Code duplicated, block: B:332:0x0646  */
    /* JADX WARN: Code duplicated, block: B:335:0x065c  */
    /* JADX WARN: Code duplicated, block: B:337:0x0662  */
    /* JADX WARN: Code duplicated, block: B:339:0x0668  */
    /* JADX WARN: Code duplicated, block: B:344:0x067a  */
    /* JADX WARN: Code duplicated, block: B:349:0x0696  */
    /* JADX WARN: Code duplicated, block: B:354:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:361:0x0718  */
    /* JADX WARN: Code duplicated, block: B:364:0x075a  */
    /* JADX WARN: Code duplicated, block: B:367:0x077a  */
    /* JADX WARN: Code duplicated, block: B:370:0x079a  */
    /* JADX WARN: Code duplicated, block: B:371:0x079f  */
    /* JADX WARN: Code duplicated, block: B:373:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:374:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:377:0x07de  */
    /* JADX WARN: Code duplicated, block: B:378:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:381:0x0813  */
    /* JADX WARN: Code duplicated, block: B:382:0x0815  */
    /* JADX WARN: Code duplicated, block: B:385:0x082b  */
    /* JADX WARN: Code duplicated, block: B:386:0x0831  */
    /* JADX WARN: Code duplicated, block: B:388:0x0834  */
    /* JADX WARN: Code duplicated, block: B:389:0x083a  */
    /* JADX WARN: Code duplicated, block: B:393:0x0863 A[LOOP:0: B:391:0x0860->B:393:0x0863, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:396:0x0874  */
    /* JADX WARN: Code duplicated, block: B:398:0x087c  */
    /* JADX WARN: Code duplicated, block: B:402:0x08ca A[LOOP:1: B:400:0x08c7->B:402:0x08ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:405:0x08da  */
    /* JADX WARN: Code duplicated, block: B:407:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:410:0x0906  */
    /* JADX WARN: Code duplicated, block: B:411:0x090e  */
    /* JADX WARN: Code duplicated, block: B:414:0x096c  */
    /* JADX WARN: Code duplicated, block: B:416:0x0974  */
    /* JADX WARN: Code duplicated, block: B:419:0x0a32  */
    /* JADX WARN: Code duplicated, block: B:424:0x0a5e  */
    /* JADX WARN: Code duplicated, block: B:429:0x0686 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:0x0674 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x06b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x06a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:439:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x010e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0111  */
    /* JADX WARN: Code duplicated, block: B:81:0x0115  */
    /* JADX WARN: Code duplicated, block: B:83:0x011b  */
    /* JADX WARN: Code duplicated, block: B:84:0x011d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0120  */
    /* JADX WARN: Code duplicated, block: B:89:0x0129  */
    /* JADX WARN: Code duplicated, block: B:90:0x012c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0130  */
    /* JADX WARN: Code duplicated, block: B:94:0x0138  */
    /* JADX WARN: Code duplicated, block: B:95:0x013b  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(float f, @Nullable ChartDrawableData chartDrawableData, @Nullable ChartDrawableData chartDrawableData2, @Nullable List<ChartDrawableData> list, @Nullable List<ChartDrawableData> list2, int i, float f2, float f3, boolean z, @Nullable MutableState<Integer> mutableState, @NotNull final Function3<? super Long, ? super Float, ? super Float, ? extends List<String>> markerLabelFormat, final float f4, @NotNull final Pair<Long, Long> minMax, final long j2, long j3, @Nullable ChartScrollSnapUnit chartScrollSnapUnit, long j4, @NotNull final Function1<? super Long, String> xLabelFormat, @Nullable Function1<? super Integer, Unit> function1, @Nullable Function1<? super Long, Unit> function2, @Nullable Function2<? super Long, ? super ChartScrollDirection, Long> function3, float f5, @Nullable Composer composer, final int i2, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ChartScrollSnapUnit chartScrollSnapUnit2;
        int i13;
        int i14;
        long j5;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        float f6;
        ChartDrawableData chartDrawableData3;
        ChartDrawableData chartDrawableData4;
        List<ChartDrawableData> listEmptyList;
        List<ChartDrawableData> listEmptyList2;
        int i25;
        float f7;
        float fM4104constructorimpl;
        float fM4104constructorimpl2;
        boolean z2;
        MutableState<Integer> mutableState2;
        float f8;
        long jLongValue;
        long j6;
        Function1<? super Integer, Unit> function4;
        Function1<? super Long, Unit> function5;
        Function2<? super Long, ? super ChartScrollDirection, Long> function6;
        float f9;
        float fM4104constructorimpl3;
        ChartDrawableData chartDrawableData5;
        ChartDrawableData chartDrawableData6;
        List<ChartDrawableData> list3;
        List<ChartDrawableData> list4;
        boolean z3;
        ChartScrollSnapUnit chartScrollSnapUnit3;
        long j7;
        Function2<? super Long, ? super ChartScrollDirection, Long> function7;
        int i26;
        MutableState<Integer> mutableState3;
        long j8;
        Function1<? super Integer, Unit> function8;
        Function1<? super Long, Unit> function9;
        float fM4104constructorimpl4;
        float fM4104constructorimpl5;
        int iM1672toArgb8_81llA;
        float fMo312toPxR2X_6o;
        float fMo312toPxR2X_6o2;
        boolean zChanged;
        Object objRememberedValue;
        Object obj;
        boolean zChanged2;
        Object objRememberedValue2;
        Object obj2;
        boolean zChanged3;
        Object objRememberedValue3;
        Object obj3;
        boolean zChanged4;
        Object objRememberedValue4;
        Object obj4;
        boolean zChanged5;
        Object objRememberedValue5;
        Object obj5;
        Object objRememberedValue6;
        Composer.Companion companion;
        int i27;
        SnapshotMutationPolicy snapshotMutationPolicy;
        MutableState mutableState4;
        Object objRememberedValue7;
        MutableState mutableState5;
        List<ChartXY> listA;
        List<ChartXY> listA2;
        boolean zChanged6;
        Object objRememberedValue8;
        List listCreateListBuilder;
        List<ChartXY> listA3;
        List<ChartXY> listA4;
        State stateRememberUpdatedState;
        State stateRememberUpdatedState2;
        Object objRememberedValue9;
        final MutableState mutableState6;
        float fFloatValue;
        float pointRadiusDp;
        float pointRadiusDp2;
        float fMo313toPx0680j_4;
        long j9;
        long jCoerceAtLeast;
        boolean z4;
        Pair<Float, Float> pairF;
        Pair<Float, Float> pairF2;
        Object[] objArr;
        int i28;
        boolean zChanged7;
        Object objRememberedValue10;
        Object[] objArr2;
        int i29;
        boolean zChanged8;
        Object objRememberedValue11;
        Integer value;
        boolean zChanged9;
        Object objRememberedValue12;
        final Function1<? super Long, Unit> function10;
        final Function1<? super Integer, Unit> function11;
        final Function2<? super Long, ? super ChartScrollDirection, Long> function12;
        final MutableState<Integer> mutableState7;
        final float f10;
        final ChartDrawableData chartDrawableData7;
        final ChartDrawableData chartDrawableData8;
        final List<ChartDrawableData> list5;
        final List<ChartDrawableData> list6;
        final int i30;
        final float f11;
        final float f12;
        final boolean z5;
        final long j10;
        final ChartScrollSnapUnit chartScrollSnapUnit4;
        final long j11;
        final float f13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2;
        int i31;
        Intrinsics.checkNotNullParameter(markerLabelFormat, "markerLabelFormat");
        Intrinsics.checkNotNullParameter(minMax, "minMax");
        Intrinsics.checkNotNullParameter(xLabelFormat, "xLabelFormat");
        Composer composerStartRestartGroup = composer.startRestartGroup(-920059604);
        int i32 = i5 & 1;
        if (i32 != 0) {
            i6 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i6 = i2 | (composerStartRestartGroup.changed(f) ? 4 : 2);
        } else {
            i6 = i2;
        }
        int i33 = i5 & 2;
        if (i33 != 0) {
            i6 |= 16;
        }
        int i34 = i5 & 4;
        if (i34 != 0) {
            i6 |= 128;
        }
        int i35 = i5 & 8;
        if (i35 != 0) {
            i6 |= 1024;
        }
        int i36 = i5 & 16;
        if (i36 != 0) {
            i6 |= 8192;
        }
        int i37 = i5 & 32;
        if (i37 != 0) {
            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i2 & 458752) == 0) {
            i6 |= composerStartRestartGroup.changed(i) ? 131072 : 65536;
        }
        int i38 = i5 & 64;
        if (i38 != 0) {
            i6 |= 1572864;
        } else if ((i2 & 3670016) == 0) {
            i6 |= composerStartRestartGroup.changed(f2) ? 1048576 : 524288;
        }
        int i39 = i5 & 128;
        if (i39 != 0) {
            i6 |= 12582912;
        } else if ((i2 & 29360128) == 0) {
            i6 |= composerStartRestartGroup.changed(f3) ? 8388608 : 4194304;
        }
        int i40 = i5 & 256;
        if (i40 != 0) {
            i6 |= 100663296;
        } else if ((i2 & 234881024) == 0) {
            i6 |= composerStartRestartGroup.changed(z) ? 67108864 : 33554432;
        }
        int i41 = i5 & 512;
        if (i41 == 0) {
            if ((i2 & 1879048192) == 0) {
                i6 |= composerStartRestartGroup.changed(mutableState) ? 536870912 : 268435456;
            }
            if ((i5 & 1024) != 0) {
                i7 = i3 | 6;
            } else if ((i3 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(markerLabelFormat)) {
                    i8 = 4;
                } else {
                    i8 = 2;
                }
                i7 = i8 | i3;
            } else {
                i7 = i3;
            }
            if ((i5 & 2048) != 0) {
                if ((i3 & 112) == 0) {
                    if (composerStartRestartGroup.changed(f4)) {
                        i9 = 32;
                    } else {
                        i9 = 16;
                    }
                    i7 |= i9;
                }
                if ((i5 & 4096) != 0) {
                    i7 |= ModuleType.TYPE_SYSTEM_SETTING;
                } else if ((i3 & 896) == 0) {
                    if (composerStartRestartGroup.changed(minMax)) {
                        i10 = 256;
                    } else {
                        i10 = 128;
                    }
                    i7 |= i10;
                }
                if ((i5 & 8192) != 0) {
                    i7 |= 3072;
                } else if ((i3 & 7168) == 0) {
                    if (composerStartRestartGroup.changed(j2)) {
                        i11 = 2048;
                    } else {
                        i11 = 1024;
                    }
                    i7 |= i11;
                }
                if ((57344 & i3) != 0) {
                    if ((i5 & 16384) == 0 || !composerStartRestartGroup.changed(j3)) {
                        i31 = 8192;
                    } else {
                        i31 = 16384;
                    }
                    i7 |= i31;
                }
                i12 = 32768 & i5;
                if (i12 != 0) {
                    i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    chartScrollSnapUnit2 = chartScrollSnapUnit;
                } else {
                    chartScrollSnapUnit2 = chartScrollSnapUnit;
                    if ((i3 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(chartScrollSnapUnit2)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i7 |= i13;
                    }
                }
                i14 = i5 & 65536;
                if (i14 != 0) {
                    i7 |= 1572864;
                    j5 = j4;
                } else {
                    j5 = j4;
                    if ((i3 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(j5)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i7 |= i15;
                    }
                }
                if ((i5 & 131072) != 0) {
                    if ((i3 & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(xLabelFormat)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                    }
                    i17 = i5 & 262144;
                    if (i17 != 0) {
                        i7 |= 100663296;
                    } else if ((i3 & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                        i7 |= i18;
                    }
                    i19 = i5 & 524288;
                    if (i19 != 0) {
                        i7 |= 805306368;
                    } else if ((i3 & 1879048192) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i7 |= i20;
                    }
                    i21 = i5 & 1048576;
                    if (i21 != 0) {
                        i22 = i4 | 6;
                    } else if ((i4 & 14) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i4 | i23;
                    } else {
                        i22 = i4;
                    }
                    i24 = i5 & 2097152;
                    if (i24 != 0) {
                        i22 |= 48;
                    } else if ((i4 & 112) == 0) {
                        i22 |= composerStartRestartGroup.changed(f5) ? 32 : 16;
                    }
                    if ((i5 & 30) != 30 && (1533916891 & i6) == 306783378 && (1533916891 & i7) == 306783378 && (i22 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        f10 = f;
                        chartDrawableData7 = chartDrawableData;
                        chartDrawableData8 = chartDrawableData2;
                        list5 = list;
                        list6 = list2;
                        i30 = i;
                        f11 = f2;
                        z5 = z;
                        mutableState7 = mutableState;
                        j10 = j3;
                        function11 = function1;
                        function10 = function2;
                        function12 = function3;
                        f13 = f5;
                        composer2 = composerStartRestartGroup;
                        chartScrollSnapUnit4 = chartScrollSnapUnit2;
                        j11 = j5;
                        f12 = f3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i32 != 0) {
                                f6 = 279.0f;
                            } else {
                                f6 = f;
                            }
                            if (i33 != 0) {
                                chartDrawableData3 = null;
                            } else {
                                chartDrawableData3 = chartDrawableData;
                            }
                            if (i34 != 0) {
                                chartDrawableData4 = null;
                            } else {
                                chartDrawableData4 = chartDrawableData2;
                            }
                            if (i35 != 0) {
                                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                            } else {
                                listEmptyList = list;
                            }
                            if (i36 != 0) {
                                listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                            } else {
                                listEmptyList2 = list2;
                            }
                            if (i37 != 0) {
                                i25 = 2;
                            } else {
                                i25 = i;
                            }
                            f7 = f6;
                            if (i38 != 0) {
                                fM4104constructorimpl = Dp.m4104constructorimpl(22);
                            } else {
                                fM4104constructorimpl = f2;
                            }
                            if (i39 != 0) {
                                fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                            } else {
                                fM4104constructorimpl2 = f3;
                            }
                            if (i40 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            if (i41 != 0) {
                                mutableState2 = null;
                            } else {
                                mutableState2 = mutableState;
                            }
                            f8 = fM4104constructorimpl;
                            if ((i5 & 16384) != 0) {
                                jLongValue = minMax.getFirst().longValue();
                                i7 &= -57345;
                            } else {
                                jLongValue = j3;
                            }
                            if (i12 != 0) {
                                chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                            }
                            if (i14 != 0) {
                                j6 = 43200000;
                            } else {
                                j6 = j5;
                            }
                            if (i17 != 0) {
                                function4 = null;
                            } else {
                                function4 = function1;
                            }
                            if (i19 != 0) {
                                function5 = null;
                            } else {
                                function5 = function2;
                            }
                            if (i21 != 0) {
                                function6 = null;
                            } else {
                                function6 = function3;
                            }
                            Function1<? super Integer, Unit> function13 = function4;
                            f9 = fM4104constructorimpl2;
                            if (i24 != 0) {
                                fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                            } else {
                                fM4104constructorimpl3 = f5;
                            }
                            chartDrawableData5 = chartDrawableData3;
                            chartDrawableData6 = chartDrawableData4;
                            list3 = listEmptyList;
                            list4 = listEmptyList2;
                            z3 = z2;
                            chartScrollSnapUnit3 = chartScrollSnapUnit2;
                            j7 = j6;
                            function7 = function6;
                            i26 = i25;
                            mutableState3 = mutableState2;
                            j8 = jLongValue;
                            function8 = function13;
                            function9 = function5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i5 & 16384) != 0) {
                                i7 &= -57345;
                            }
                            f7 = f;
                            chartDrawableData5 = chartDrawableData;
                            chartDrawableData6 = chartDrawableData2;
                            list3 = list;
                            list4 = list2;
                            i26 = i;
                            f8 = f2;
                            f9 = f3;
                            z3 = z;
                            j8 = j3;
                            function9 = function2;
                            fM4104constructorimpl3 = f5;
                            chartScrollSnapUnit3 = chartScrollSnapUnit2;
                            j7 = j5;
                            mutableState3 = mutableState;
                            function8 = function1;
                            function7 = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-920059604, i6, i7, "com.heytap.health.bodyfat.ui.Chart (ChartCompose.kt:138)");
                        }
                        if (minMax.getFirst().longValue() == minMax.getSecond().longValue()) {
                            m8b.b("Chart", "min == max; return!");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            final float f14 = f7;
                            final ChartDrawableData chartDrawableData9 = chartDrawableData5;
                            final ChartDrawableData chartDrawableData10 = chartDrawableData6;
                            final List<ChartDrawableData> list7 = list3;
                            final List<ChartDrawableData> list8 = list4;
                            final int i42 = i26;
                            final float f15 = f8;
                            final float f16 = f9;
                            final boolean z6 = z3;
                            final MutableState<Integer> mutableState8 = mutableState3;
                            final Function2<? super Long, ? super ChartScrollDirection, Long> function14 = function7;
                            final Function1<? super Long, Unit> function15 = function9;
                            final Function1<? super Integer, Unit> function16 = function8;
                            final long j12 = j8;
                            final ChartScrollSnapUnit chartScrollSnapUnit5 = chartScrollSnapUnit3;
                            final long j13 = j7;
                            final float f17 = fM4104constructorimpl3;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$1
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

                                public final void invoke(@Nullable Composer composer3, int i43) {
                                    ChartComposeKt.a(f14, chartDrawableData9, chartDrawableData10, list7, list8, i42, f15, f16, z6, mutableState8, markerLabelFormat, f4, minMax, j2, j12, chartScrollSnapUnit5, j13, xLabelFormat, function16, function15, function14, f17, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                }
                            });
                            return;
                        }
                        Function2<? super Long, ? super ChartScrollDirection, Long> function17 = function7;
                        Function1<? super Long, Unit> function18 = function9;
                        Function1<? super Integer, Unit> function19 = function8;
                        if (chartDrawableData5 == null) {
                            fM4104constructorimpl4 = Dp.m4104constructorimpl(0);
                        } else {
                            fM4104constructorimpl4 = f8;
                        }
                        if (chartDrawableData6 == null) {
                            fM4104constructorimpl5 = Dp.m4104constructorimpl(0);
                        } else {
                            fM4104constructorimpl5 = f9;
                        }
                        float fM4104constructorimpl6 = Dp.m4104constructorimpl(22);
                        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        iM1672toArgb8_81llA = ColorKt.m1672toArgb8_81llA(ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha55, composerStartRestartGroup, 0));
                        fMo312toPxR2X_6o = density.mo312toPxR2X_6o(TextUnitKt.getSp(10));
                        fMo312toPxR2X_6o2 = density.mo312toPxR2X_6o(TextUnitKt.getSp(12));
                        Float fValueOf = Float.valueOf(fMo312toPxR2X_6o);
                        Integer numValueOf = Integer.valueOf(iM1672toArgb8_81llA);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(fValueOf) | composerStartRestartGroup.changed(numValueOf);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            obj = objRememberedValue;
                            Paint paint = new Paint();
                            paint.setAntiAlias(true);
                            paint.setTextSize(fMo312toPxR2X_6o);
                            paint.setColor(iM1672toArgb8_81llA);
                            paint.setTextAlign(Paint.Align.RIGHT);
                            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                            composerStartRestartGroup.updateRememberedValue(paint);
                            obj = paint;
                        }
                        obj = objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        Paint paint2 = (Paint) obj;
                        Float fValueOf2 = Float.valueOf(fMo312toPxR2X_6o);
                        Integer numValueOf2 = Integer.valueOf(iM1672toArgb8_81llA);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(fValueOf2) | composerStartRestartGroup.changed(numValueOf2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            obj2 = objRememberedValue2;
                            Paint paint3 = new Paint();
                            paint3.setAntiAlias(true);
                            paint3.setTextSize(fMo312toPxR2X_6o);
                            paint3.setColor(iM1672toArgb8_81llA);
                            paint3.setTextAlign(Paint.Align.RIGHT);
                            paint3.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                            composerStartRestartGroup.updateRememberedValue(paint3);
                            obj2 = paint3;
                        }
                        obj2 = objRememberedValue2;
                        composerStartRestartGroup.endReplaceableGroup();
                        Paint paint4 = (Paint) obj2;
                        Float fValueOf3 = Float.valueOf(fMo312toPxR2X_6o);
                        Integer numValueOf3 = Integer.valueOf(iM1672toArgb8_81llA);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged3 = composerStartRestartGroup.changed(fValueOf3) | composerStartRestartGroup.changed(numValueOf3);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            obj3 = objRememberedValue3;
                            Paint paint5 = new Paint();
                            paint5.setAntiAlias(true);
                            paint5.setTextSize(fMo312toPxR2X_6o);
                            paint5.setColor(iM1672toArgb8_81llA);
                            paint5.setTextAlign(Paint.Align.CENTER);
                            paint5.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                            composerStartRestartGroup.updateRememberedValue(paint5);
                            obj3 = paint5;
                        }
                        obj3 = objRememberedValue3;
                        composerStartRestartGroup.endReplaceableGroup();
                        Paint paint6 = (Paint) obj3;
                        Float fValueOf4 = Float.valueOf(fMo312toPxR2X_6o2);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged4 = composerStartRestartGroup.changed(fValueOf4);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            obj4 = objRememberedValue4;
                            Paint paint7 = new Paint();
                            paint7.setAntiAlias(true);
                            paint7.setTextSize(fMo312toPxR2X_6o2);
                            paint7.setColor(-1);
                            paint7.setTextAlign(Paint.Align.LEFT);
                            composerStartRestartGroup.updateRememberedValue(paint7);
                            obj4 = paint7;
                        }
                        obj4 = objRememberedValue4;
                        composerStartRestartGroup.endReplaceableGroup();
                        Paint paint8 = (Paint) obj4;
                        Float fValueOf5 = Float.valueOf(fMo312toPxR2X_6o2);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged5 = composerStartRestartGroup.changed(fValueOf5);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            obj5 = objRememberedValue5;
                            Paint paint9 = new Paint();
                            paint9.setAntiAlias(true);
                            paint9.setTextSize(fMo312toPxR2X_6o2);
                            paint9.setColor(-1);
                            paint9.setTextAlign(Paint.Align.LEFT);
                            paint9.setFakeBoldText(true);
                            composerStartRestartGroup.updateRememberedValue(paint9);
                            obj5 = paint9;
                        }
                        obj5 = objRememberedValue5;
                        composerStartRestartGroup.endReplaceableGroup();
                        Paint paint10 = (Paint) obj5;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue6 == companion.getEmpty()) {
                            i27 = 2;
                            snapshotMutationPolicy = null;
                            objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j8), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            i27 = 2;
                            snapshotMutationPolicy = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState4 = (MutableState) objRememberedValue6;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == companion.getEmpty()) {
                            objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i27, snapshotMutationPolicy);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState5 = (MutableState) objRememberedValue7;
                        if (chartDrawableData5 != null) {
                            listA = chartDrawableData5.a();
                        } else {
                            listA = null;
                        }
                        if (chartDrawableData6 != null) {
                            listA2 = chartDrawableData6.a();
                        } else {
                            listA2 = null;
                        }
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged6 = composerStartRestartGroup.changed(listA) | composerStartRestartGroup.changed(listA2);
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (zChanged6 || objRememberedValue8 == companion.getEmpty()) {
                            listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                            if (chartDrawableData5 != null && (listA4 = chartDrawableData5.a()) != null) {
                                for (ChartXY chartXY : listA4) {
                                    if (chartXY.getY() != null) {
                                        listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                                    }
                                }
                                Unit unit = Unit.INSTANCE;
                            }
                            if (chartDrawableData6 != null && (listA3 = chartDrawableData6.a()) != null) {
                                for (ChartXY chartXY2 : listA3) {
                                    if (chartXY2.getY() != null) {
                                        listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                                    }
                                }
                                Unit unit2 = Unit.INSTANCE;
                            }
                            objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        List list9 = (List) objRememberedValue8;
                        State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(list9, composerStartRestartGroup, 8);
                        State stateRememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(mutableState3, composerStartRestartGroup, (i6 >> 27) & 14);
                        State stateRememberUpdatedState5 = SnapshotStateKt.rememberUpdatedState(function19, composerStartRestartGroup, (i7 >> 24) & 14);
                        stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function18, composerStartRestartGroup, (i7 >> 27) & 14);
                        stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function17, composerStartRestartGroup, i22 & 14);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState6 = (MutableState) objRememberedValue9;
                        float fMo313toPx0680j_5 = density.mo313toPx0680j_4(Dp.m4104constructorimpl(fM4104constructorimpl4 + fM4104constructorimpl5));
                        float fMo313toPx0680j_6 = density.mo313toPx0680j_4(fM4104constructorimpl4);
                        float f18 = fM4104constructorimpl4;
                        float fMo313toPx0680j_7 = density.mo313toPx0680j_4(Dp.m4104constructorimpl(f4));
                        float fMo313toPx0680j_8 = density.mo313toPx0680j_4(Dp.m4104constructorimpl(Dp.m4104constructorimpl(f7) - fM4104constructorimpl6));
                        if (j2 > 0 || ((Number) mutableState6.getValue()).floatValue() <= fMo313toPx0680j_5) {
                            fFloatValue = 0.0f;
                        } else {
                            fFloatValue = (((Number) mutableState6.getValue()).floatValue() - fMo313toPx0680j_5) / j2;
                        }
                        float fFloatValue2 = ((Number) mutableState6.getValue()).floatValue() - density.mo313toPx0680j_4(fM4104constructorimpl5);
                        float fMo313toPx0680j_9 = density.mo313toPx0680j_4(Dp.m4104constructorimpl(600));
                        if (chartDrawableData5 != null) {
                            pointRadiusDp = chartDrawableData5.getPointRadiusDp();
                        } else {
                            pointRadiusDp = 0.0f;
                        }
                        if (chartDrawableData6 != null) {
                            pointRadiusDp2 = chartDrawableData6.getPointRadiusDp();
                        } else {
                            pointRadiusDp2 = 0.0f;
                        }
                        fMo313toPx0680j_4 = density.mo313toPx0680j_4(Dp.m4104constructorimpl(Math.max(pointRadiusDp, pointRadiusDp2)));
                        float f19 = 16;
                        State stateRememberUpdatedState6 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(Math.max(4 * fMo313toPx0680j_4, density.mo313toPx0680j_4(Dp.m4104constructorimpl(f19)))), composerStartRestartGroup, 0);
                        if (fFloatValue > 0.0f) {
                            j9 = ((long) (fMo313toPx0680j_4 / fFloatValue)) + 1;
                        } else {
                            j9 = 0;
                        }
                        long j14 = j9;
                        jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(minMax.getSecond().longValue() - j2, minMax.getFirst().longValue());
                        if (jCoerceAtLeast > minMax.getFirst().longValue()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        float fMax = Math.max(viewConfiguration.getTouchSlop() * 2.0f, density.mo313toPx0680j_4(Dp.m4104constructorimpl(f19)));
                        if (chartDrawableData5 != null) {
                            pairF = chartDrawableData5.f();
                        } else {
                            pairF = null;
                        }
                        if (chartDrawableData6 != null) {
                            pairF2 = chartDrawableData6.f();
                        } else {
                            pairF2 = null;
                        }
                        Long lValueOf = Long.valueOf(j8);
                        Long lValueOf2 = Long.valueOf(j2);
                        Pair<Float, Float> pair = pairF2;
                        Pair<Float, Float> pair2 = pairF;
                        objArr = new Object[]{Long.valueOf(j8), minMax, Long.valueOf(jCoerceAtLeast), mutableState5, mutableState4};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        zChanged7 = false;
                        for (i28 = 0; i28 < 5; i28++) {
                            zChanged7 |= composerStartRestartGroup.changed(objArr[i28]);
                        }
                        objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                        if (zChanged7 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i43 = ((i7 >> 12) & 14) | 4096;
                        int i44 = i7 >> 3;
                        EffectsKt.LaunchedEffect(lValueOf, minMax, lValueOf2, (Function2) objRememberedValue10, composerStartRestartGroup, (i44 & 896) | i43 | (i44 & 112));
                        Pair<Long, Long> pairD = d(mutableState5);
                        objArr2 = new Object[]{mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        zChanged8 = false;
                        for (i29 = 0; i29 < 4; i29++) {
                            zChanged8 |= composerStartRestartGroup.changed(objArr2[i29]);
                        }
                        objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                        if (zChanged8 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(pairD, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 64);
                        Object[] objArr3 = new Object[5];
                        if (mutableState3 != null) {
                            value = mutableState3.getValue();
                        } else {
                            value = null;
                        }
                        objArr3[0] = value;
                        objArr3[1] = list9;
                        objArr3[2] = Long.valueOf(b(mutableState4));
                        objArr3[3] = Long.valueOf(j2);
                        objArr3[4] = Long.valueOf(j14);
                        EffectsKt.LaunchedEffect(objArr3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$4(mutableState3, list9, j2, j14, mutableState4, stateRememberUpdatedState5, null), composerStartRestartGroup, 72);
                        Modifier modifierM455height3ABfNKs = SizeKt.m455height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4104constructorimpl(f7));
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged9 = composerStartRestartGroup.changed(mutableState6);
                        objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                        if (zChanged9 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // p010kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                    m4625invokeozmzZPI(intSize.m4268unboximpl());
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                                public final void m4625invokeozmzZPI(long j15) {
                                    mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j15)));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(OnRemeasuredModifierKt.onSizeChanged(modifierM455height3ABfNKs, (Function1) objRememberedValue12), new Object[]{Float.valueOf(fFloatValue), Float.valueOf(fMo313toPx0680j_6), Float.valueOf(fFloatValue2), Float.valueOf(fMo313toPx0680j_7), Float.valueOf(fMo313toPx0680j_8), minMax, Long.valueOf(j2), chartScrollSnapUnit3, view}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$6(fMo313toPx0680j_6, fFloatValue2, fMo313toPx0680j_7, fMo313toPx0680j_8, view, viewConfiguration, fFloatValue, minMax, jCoerceAtLeast, z4, fMax, fMo313toPx0680j_9, mutableState5, mutableState4, stateRememberUpdatedState4, stateRememberUpdatedState3, stateRememberUpdatedState6, stateRememberUpdatedState5, stateRememberUpdatedState, chartScrollSnapUnit3, stateRememberUpdatedState2, null));
                        MutableState<Integer> mutableState9 = mutableState3;
                        Composer composer3 = composerStartRestartGroup;
                        CanvasKt.Canvas(modifierPointerInput, new ChartComposeKt$Chart$7(f18, f4, fM4104constructorimpl5, fM4104constructorimpl6, j2, pair2, pair, i26, paint2, paint4, z3, chartDrawableData5, chartDrawableData6, list4, paint6, minMax, j7, list3, mutableState9, list9, markerLabelFormat, paint8, iM1672toArgb8_81llA, mutableState4, fM4104constructorimpl3, xLabelFormat, paint10), composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function10 = function18;
                        function11 = function19;
                        function12 = function17;
                        mutableState7 = mutableState9;
                        f10 = f7;
                        chartDrawableData7 = chartDrawableData5;
                        chartDrawableData8 = chartDrawableData6;
                        list5 = list3;
                        list6 = list4;
                        i30 = i26;
                        f11 = f8;
                        f12 = f9;
                        z5 = z3;
                        j10 = j8;
                        chartScrollSnapUnit4 = chartScrollSnapUnit3;
                        j11 = j7;
                        f13 = fM4104constructorimpl3;
                        composer2 = composer3;
                    }
                    scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // p010kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer4, int i45) {
                            ChartComposeKt.a(f10, chartDrawableData7, chartDrawableData8, list5, list6, i30, f11, f12, z5, mutableState7, markerLabelFormat, f4, minMax, j2, j10, chartScrollSnapUnit4, j11, xLabelFormat, function11, function10, function12, f13, composer4, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                        }
                    });
                }
                i16 = 12582912;
                i7 |= i16;
                i17 = i5 & 262144;
                if (i17 != 0) {
                    i7 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i7 |= i18;
                }
                i19 = i5 & 524288;
                if (i19 != 0) {
                    i7 |= 805306368;
                } else if ((i3 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i7 |= i20;
                }
                i21 = i5 & 1048576;
                if (i21 != 0) {
                    i22 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i4 | i23;
                } else {
                    i22 = i4;
                }
                i24 = i5 & 2097152;
                if (i24 != 0) {
                    i22 |= 48;
                } else if ((i4 & 112) == 0) {
                    i22 |= composerStartRestartGroup.changed(f5) ? 32 : 16;
                }
                if ((i5 & 30) != 30) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i32 != 0) {
                            f6 = 279.0f;
                        } else {
                            f6 = f;
                        }
                        if (i33 != 0) {
                            chartDrawableData3 = null;
                        } else {
                            chartDrawableData3 = chartDrawableData;
                        }
                        if (i34 != 0) {
                            chartDrawableData4 = null;
                        } else {
                            chartDrawableData4 = chartDrawableData2;
                        }
                        if (i35 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if (i36 != 0) {
                            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList2 = list2;
                        }
                        if (i37 != 0) {
                            i25 = 2;
                        } else {
                            i25 = i;
                        }
                        f7 = f6;
                        if (i38 != 0) {
                            fM4104constructorimpl = Dp.m4104constructorimpl(22);
                        } else {
                            fM4104constructorimpl = f2;
                        }
                        if (i39 != 0) {
                            fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                        } else {
                            fM4104constructorimpl2 = f3;
                        }
                        if (i40 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if (i41 != 0) {
                            mutableState2 = null;
                        } else {
                            mutableState2 = mutableState;
                        }
                        f8 = fM4104constructorimpl;
                        if ((i5 & 16384) != 0) {
                            jLongValue = minMax.getFirst().longValue();
                            i7 &= -57345;
                        } else {
                            jLongValue = j3;
                        }
                        if (i12 != 0) {
                            chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                        }
                        if (i14 != 0) {
                            j6 = 43200000;
                        } else {
                            j6 = j5;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        } else {
                            function4 = function1;
                        }
                        if (i19 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i21 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        Function1<? super Integer, Unit> function110 = function4;
                        f9 = fM4104constructorimpl2;
                        if (i24 != 0) {
                            fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                        } else {
                            fM4104constructorimpl3 = f5;
                        }
                        chartDrawableData5 = chartDrawableData3;
                        chartDrawableData6 = chartDrawableData4;
                        list3 = listEmptyList;
                        list4 = listEmptyList2;
                        z3 = z2;
                        chartScrollSnapUnit3 = chartScrollSnapUnit2;
                        j7 = j6;
                        function7 = function6;
                        i26 = i25;
                        mutableState3 = mutableState2;
                        j8 = jLongValue;
                        function8 = function110;
                        function9 = function5;
                    } else {
                        if (i32 != 0) {
                            f6 = 279.0f;
                        } else {
                            f6 = f;
                        }
                        if (i33 != 0) {
                            chartDrawableData3 = null;
                        } else {
                            chartDrawableData3 = chartDrawableData;
                        }
                        if (i34 != 0) {
                            chartDrawableData4 = null;
                        } else {
                            chartDrawableData4 = chartDrawableData2;
                        }
                        if (i35 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if (i36 != 0) {
                            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList2 = list2;
                        }
                        if (i37 != 0) {
                            i25 = 2;
                        } else {
                            i25 = i;
                        }
                        f7 = f6;
                        if (i38 != 0) {
                            fM4104constructorimpl = Dp.m4104constructorimpl(22);
                        } else {
                            fM4104constructorimpl = f2;
                        }
                        if (i39 != 0) {
                            fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                        } else {
                            fM4104constructorimpl2 = f3;
                        }
                        if (i40 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if (i41 != 0) {
                            mutableState2 = null;
                        } else {
                            mutableState2 = mutableState;
                        }
                        f8 = fM4104constructorimpl;
                        if ((i5 & 16384) != 0) {
                            jLongValue = minMax.getFirst().longValue();
                            i7 &= -57345;
                        } else {
                            jLongValue = j3;
                        }
                        if (i12 != 0) {
                            chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                        }
                        if (i14 != 0) {
                            j6 = 43200000;
                        } else {
                            j6 = j5;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        } else {
                            function4 = function1;
                        }
                        if (i19 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i21 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        Function1<? super Integer, Unit> function111 = function4;
                        f9 = fM4104constructorimpl2;
                        if (i24 != 0) {
                            fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                        } else {
                            fM4104constructorimpl3 = f5;
                        }
                        chartDrawableData5 = chartDrawableData3;
                        chartDrawableData6 = chartDrawableData4;
                        list3 = listEmptyList;
                        list4 = listEmptyList2;
                        z3 = z2;
                        chartScrollSnapUnit3 = chartScrollSnapUnit2;
                        j7 = j6;
                        function7 = function6;
                        i26 = i25;
                        mutableState3 = mutableState2;
                        j8 = jLongValue;
                        function8 = function111;
                        function9 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-920059604, i6, i7, "com.heytap.health.bodyfat.ui.Chart (ChartCompose.kt:138)");
                    }
                    if (minMax.getFirst().longValue() == minMax.getSecond().longValue()) {
                        m8b.b("Chart", "min == max; return!");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final float f110 = f7;
                        final ChartDrawableData chartDrawableData11 = chartDrawableData5;
                        final ChartDrawableData chartDrawableData12 = chartDrawableData6;
                        final List<ChartDrawableData> list10 = list3;
                        final List<ChartDrawableData> list11 = list4;
                        final int i45 = i26;
                        final float f111 = f8;
                        final float f112 = f9;
                        final boolean z7 = z3;
                        final MutableState<Integer> mutableState10 = mutableState3;
                        final Function2<? super Long, ? super ChartScrollDirection, Long> function112 = function7;
                        final Function1<? super Long, Unit> function113 = function9;
                        final Function1<? super Integer, Unit> function114 = function8;
                        final long j15 = j8;
                        final ChartScrollSnapUnit chartScrollSnapUnit6 = chartScrollSnapUnit3;
                        final long j16 = j7;
                        final float f113 = fM4104constructorimpl3;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer4, int i46) {
                                ChartComposeKt.a(f110, chartDrawableData11, chartDrawableData12, list10, list11, i45, f111, f112, z7, mutableState10, markerLabelFormat, f4, minMax, j2, j15, chartScrollSnapUnit6, j16, xLabelFormat, function114, function113, function112, f113, composer4, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                            }
                        });
                        return;
                    }
                    Function2<? super Long, ? super ChartScrollDirection, Long> function115 = function7;
                    Function1<? super Long, Unit> function116 = function9;
                    Function1<? super Integer, Unit> function117 = function8;
                    if (chartDrawableData5 == null) {
                        fM4104constructorimpl4 = Dp.m4104constructorimpl(0);
                    } else {
                        fM4104constructorimpl4 = f8;
                    }
                    if (chartDrawableData6 == null) {
                        fM4104constructorimpl5 = Dp.m4104constructorimpl(0);
                    } else {
                        fM4104constructorimpl5 = f9;
                    }
                    float fM4104constructorimpl7 = Dp.m4104constructorimpl(22);
                    Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    View view2 = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    iM1672toArgb8_81llA = ColorKt.m1672toArgb8_81llA(ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha55, composerStartRestartGroup, 0));
                    fMo312toPxR2X_6o = density2.mo312toPxR2X_6o(TextUnitKt.getSp(10));
                    fMo312toPxR2X_6o2 = density2.mo312toPxR2X_6o(TextUnitKt.getSp(12));
                    Float fValueOf6 = Float.valueOf(fMo312toPxR2X_6o);
                    Integer numValueOf4 = Integer.valueOf(iM1672toArgb8_81llA);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(fValueOf6) | composerStartRestartGroup.changed(numValueOf4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        obj = objRememberedValue;
                        Paint paint11 = new Paint();
                        paint11.setAntiAlias(true);
                        paint11.setTextSize(fMo312toPxR2X_6o);
                        paint11.setColor(iM1672toArgb8_81llA);
                        paint11.setTextAlign(Paint.Align.RIGHT);
                        paint11.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint11);
                        obj = paint11;
                    } else {
                        obj = objRememberedValue;
                        Paint paint12 = new Paint();
                        paint12.setAntiAlias(true);
                        paint12.setTextSize(fMo312toPxR2X_6o);
                        paint12.setColor(iM1672toArgb8_81llA);
                        paint12.setTextAlign(Paint.Align.RIGHT);
                        paint12.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint12);
                        obj = paint12;
                    }
                    obj = objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint13 = (Paint) obj;
                    Float fValueOf7 = Float.valueOf(fMo312toPxR2X_6o);
                    Integer numValueOf5 = Integer.valueOf(iM1672toArgb8_81llA);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(fValueOf7) | composerStartRestartGroup.changed(numValueOf5);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        obj2 = objRememberedValue2;
                        Paint paint14 = new Paint();
                        paint14.setAntiAlias(true);
                        paint14.setTextSize(fMo312toPxR2X_6o);
                        paint14.setColor(iM1672toArgb8_81llA);
                        paint14.setTextAlign(Paint.Align.RIGHT);
                        paint14.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint14);
                        obj2 = paint14;
                    } else {
                        obj2 = objRememberedValue2;
                        Paint paint15 = new Paint();
                        paint15.setAntiAlias(true);
                        paint15.setTextSize(fMo312toPxR2X_6o);
                        paint15.setColor(iM1672toArgb8_81llA);
                        paint15.setTextAlign(Paint.Align.RIGHT);
                        paint15.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint15);
                        obj2 = paint15;
                    }
                    obj2 = objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint16 = (Paint) obj2;
                    Float fValueOf8 = Float.valueOf(fMo312toPxR2X_6o);
                    Integer numValueOf6 = Integer.valueOf(iM1672toArgb8_81llA);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(fValueOf8) | composerStartRestartGroup.changed(numValueOf6);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        obj3 = objRememberedValue3;
                        Paint paint17 = new Paint();
                        paint17.setAntiAlias(true);
                        paint17.setTextSize(fMo312toPxR2X_6o);
                        paint17.setColor(iM1672toArgb8_81llA);
                        paint17.setTextAlign(Paint.Align.CENTER);
                        paint17.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint17);
                        obj3 = paint17;
                    } else {
                        obj3 = objRememberedValue3;
                        Paint paint18 = new Paint();
                        paint18.setAntiAlias(true);
                        paint18.setTextSize(fMo312toPxR2X_6o);
                        paint18.setColor(iM1672toArgb8_81llA);
                        paint18.setTextAlign(Paint.Align.CENTER);
                        paint18.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint18);
                        obj3 = paint18;
                    }
                    obj3 = objRememberedValue3;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint19 = (Paint) obj3;
                    Float fValueOf9 = Float.valueOf(fMo312toPxR2X_6o2);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged4 = composerStartRestartGroup.changed(fValueOf9);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4) {
                        obj4 = objRememberedValue4;
                        Paint paint20 = new Paint();
                        paint20.setAntiAlias(true);
                        paint20.setTextSize(fMo312toPxR2X_6o2);
                        paint20.setColor(-1);
                        paint20.setTextAlign(Paint.Align.LEFT);
                        composerStartRestartGroup.updateRememberedValue(paint20);
                        obj4 = paint20;
                    } else {
                        obj4 = objRememberedValue4;
                        Paint paint21 = new Paint();
                        paint21.setAntiAlias(true);
                        paint21.setTextSize(fMo312toPxR2X_6o2);
                        paint21.setColor(-1);
                        paint21.setTextAlign(Paint.Align.LEFT);
                        composerStartRestartGroup.updateRememberedValue(paint21);
                        obj4 = paint21;
                    }
                    obj4 = objRememberedValue4;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint22 = (Paint) obj4;
                    Float fValueOf10 = Float.valueOf(fMo312toPxR2X_6o2);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged5 = composerStartRestartGroup.changed(fValueOf10);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged5) {
                        obj5 = objRememberedValue5;
                        Paint paint23 = new Paint();
                        paint23.setAntiAlias(true);
                        paint23.setTextSize(fMo312toPxR2X_6o2);
                        paint23.setColor(-1);
                        paint23.setTextAlign(Paint.Align.LEFT);
                        paint23.setFakeBoldText(true);
                        composerStartRestartGroup.updateRememberedValue(paint23);
                        obj5 = paint23;
                    } else {
                        obj5 = objRememberedValue5;
                        Paint paint24 = new Paint();
                        paint24.setAntiAlias(true);
                        paint24.setTextSize(fMo312toPxR2X_6o2);
                        paint24.setColor(-1);
                        paint24.setTextAlign(Paint.Align.LEFT);
                        paint24.setFakeBoldText(true);
                        composerStartRestartGroup.updateRememberedValue(paint24);
                        obj5 = paint24;
                    }
                    obj5 = objRememberedValue5;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint110 = (Paint) obj5;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue6 == companion.getEmpty()) {
                        i27 = 2;
                        snapshotMutationPolicy = null;
                        objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j8), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        i27 = 2;
                        snapshotMutationPolicy = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState4 = (MutableState) objRememberedValue6;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i27, snapshotMutationPolicy);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState5 = (MutableState) objRememberedValue7;
                    if (chartDrawableData5 != null) {
                        listA = chartDrawableData5.a();
                    } else {
                        listA = null;
                    }
                    if (chartDrawableData6 != null) {
                        listA2 = chartDrawableData6.a();
                    } else {
                        listA2 = null;
                    }
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged6 = composerStartRestartGroup.changed(listA) | composerStartRestartGroup.changed(listA2);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (zChanged6) {
                        listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                        if (chartDrawableData5 != null) {
                            while (r12.hasNext()) {
                                if (chartXY.getY() != null) {
                                    listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                                }
                            }
                            Unit unit3 = Unit.INSTANCE;
                        }
                        if (chartDrawableData6 != null) {
                            while (r12.hasNext()) {
                                if (chartXY2.getY() != null) {
                                    listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                                }
                            }
                            Unit unit4 = Unit.INSTANCE;
                        }
                        objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    } else {
                        listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                        if (chartDrawableData5 != null) {
                            while (r12.hasNext()) {
                                if (chartXY.getY() != null) {
                                    listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                                }
                            }
                            Unit unit5 = Unit.INSTANCE;
                        }
                        if (chartDrawableData6 != null) {
                            while (r12.hasNext()) {
                                if (chartXY2.getY() != null) {
                                    listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                                }
                            }
                            Unit unit6 = Unit.INSTANCE;
                        }
                        objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list12 = (List) objRememberedValue8;
                    State stateRememberUpdatedState7 = SnapshotStateKt.rememberUpdatedState(list12, composerStartRestartGroup, 8);
                    State stateRememberUpdatedState8 = SnapshotStateKt.rememberUpdatedState(mutableState3, composerStartRestartGroup, (i6 >> 27) & 14);
                    State stateRememberUpdatedState9 = SnapshotStateKt.rememberUpdatedState(function117, composerStartRestartGroup, (i7 >> 24) & 14);
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function116, composerStartRestartGroup, (i7 >> 27) & 14);
                    stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function115, composerStartRestartGroup, i22 & 14);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState6 = (MutableState) objRememberedValue9;
                    float fMo313toPx0680j_10 = density2.mo313toPx0680j_4(Dp.m4104constructorimpl(fM4104constructorimpl4 + fM4104constructorimpl5));
                    float fMo313toPx0680j_11 = density2.mo313toPx0680j_4(fM4104constructorimpl4);
                    float f114 = fM4104constructorimpl4;
                    float fMo313toPx0680j_12 = density2.mo313toPx0680j_4(Dp.m4104constructorimpl(f4));
                    float fMo313toPx0680j_13 = density2.mo313toPx0680j_4(Dp.m4104constructorimpl(Dp.m4104constructorimpl(f7) - fM4104constructorimpl7));
                    if (j2 > 0) {
                        fFloatValue = 0.0f;
                    } else {
                        fFloatValue = 0.0f;
                    }
                    float fFloatValue3 = ((Number) mutableState6.getValue()).floatValue() - density2.mo313toPx0680j_4(fM4104constructorimpl5);
                    float fMo313toPx0680j_14 = density2.mo313toPx0680j_4(Dp.m4104constructorimpl(600));
                    if (chartDrawableData5 != null) {
                        pointRadiusDp = chartDrawableData5.getPointRadiusDp();
                    } else {
                        pointRadiusDp = 0.0f;
                    }
                    if (chartDrawableData6 != null) {
                        pointRadiusDp2 = chartDrawableData6.getPointRadiusDp();
                    } else {
                        pointRadiusDp2 = 0.0f;
                    }
                    fMo313toPx0680j_4 = density2.mo313toPx0680j_4(Dp.m4104constructorimpl(Math.max(pointRadiusDp, pointRadiusDp2)));
                    float f115 = 16;
                    State stateRememberUpdatedState10 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(Math.max(4 * fMo313toPx0680j_4, density2.mo313toPx0680j_4(Dp.m4104constructorimpl(f115)))), composerStartRestartGroup, 0);
                    if (fFloatValue > 0.0f) {
                        j9 = ((long) (fMo313toPx0680j_4 / fFloatValue)) + 1;
                    } else {
                        j9 = 0;
                    }
                    long j17 = j9;
                    jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(minMax.getSecond().longValue() - j2, minMax.getFirst().longValue());
                    if (jCoerceAtLeast > minMax.getFirst().longValue()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    float fMax2 = Math.max(viewConfiguration2.getTouchSlop() * 2.0f, density2.mo313toPx0680j_4(Dp.m4104constructorimpl(f115)));
                    if (chartDrawableData5 != null) {
                        pairF = chartDrawableData5.f();
                    } else {
                        pairF = null;
                    }
                    if (chartDrawableData6 != null) {
                        pairF2 = chartDrawableData6.f();
                    } else {
                        pairF2 = null;
                    }
                    Long lValueOf3 = Long.valueOf(j8);
                    Long lValueOf4 = Long.valueOf(j2);
                    Pair<Float, Float> pair3 = pairF2;
                    Pair<Float, Float> pair4 = pairF;
                    objArr = new Object[]{Long.valueOf(j8), minMax, Long.valueOf(jCoerceAtLeast), mutableState5, mutableState4};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged7 = false;
                    while (i28 < 5) {
                        zChanged7 |= composerStartRestartGroup.changed(objArr[i28]);
                    }
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (zChanged7) {
                        objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    } else {
                        objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i46 = ((i7 >> 12) & 14) | 4096;
                    int i47 = i7 >> 3;
                    EffectsKt.LaunchedEffect(lValueOf3, minMax, lValueOf4, (Function2) objRememberedValue10, composerStartRestartGroup, (i47 & 896) | i46 | (i47 & 112));
                    Pair<Long, Long> pairD2 = d(mutableState5);
                    objArr2 = new Object[]{mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged8 = false;
                    while (i29 < 4) {
                        zChanged8 |= composerStartRestartGroup.changed(objArr2[i29]);
                    }
                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (zChanged8) {
                        objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    } else {
                        objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(pairD2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 64);
                    Object[] objArr4 = new Object[5];
                    if (mutableState3 != null) {
                        value = mutableState3.getValue();
                    } else {
                        value = null;
                    }
                    objArr4[0] = value;
                    objArr4[1] = list12;
                    objArr4[2] = Long.valueOf(b(mutableState4));
                    objArr4[3] = Long.valueOf(j2);
                    objArr4[4] = Long.valueOf(j17);
                    EffectsKt.LaunchedEffect(objArr4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$4(mutableState3, list12, j2, j17, mutableState4, stateRememberUpdatedState9, null), composerStartRestartGroup, 72);
                    Modifier modifierM455height3ABfNKs2 = SizeKt.m455height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4104constructorimpl(f7));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged9 = composerStartRestartGroup.changed(mutableState6);
                    objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (zChanged9) {
                        objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p010kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m4625invokeozmzZPI(intSize.m4268unboximpl());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m4625invokeozmzZPI(long j18) {
                                mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j18)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    } else {
                        objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p010kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m4625invokeozmzZPI(intSize.m4268unboximpl());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m4625invokeozmzZPI(long j18) {
                                mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j18)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(OnRemeasuredModifierKt.onSizeChanged(modifierM455height3ABfNKs2, (Function1) objRememberedValue12), new Object[]{Float.valueOf(fFloatValue), Float.valueOf(fMo313toPx0680j_11), Float.valueOf(fFloatValue3), Float.valueOf(fMo313toPx0680j_12), Float.valueOf(fMo313toPx0680j_13), minMax, Long.valueOf(j2), chartScrollSnapUnit3, view2}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$6(fMo313toPx0680j_11, fFloatValue3, fMo313toPx0680j_12, fMo313toPx0680j_13, view2, viewConfiguration2, fFloatValue, minMax, jCoerceAtLeast, z4, fMax2, fMo313toPx0680j_14, mutableState5, mutableState4, stateRememberUpdatedState8, stateRememberUpdatedState7, stateRememberUpdatedState10, stateRememberUpdatedState9, stateRememberUpdatedState, chartScrollSnapUnit3, stateRememberUpdatedState2, null));
                    MutableState<Integer> mutableState11 = mutableState3;
                    Composer composer4 = composerStartRestartGroup;
                    CanvasKt.Canvas(modifierPointerInput2, new ChartComposeKt$Chart$7(f114, f4, fM4104constructorimpl5, fM4104constructorimpl7, j2, pair4, pair3, i26, paint13, paint16, z3, chartDrawableData5, chartDrawableData6, list4, paint19, minMax, j7, list3, mutableState11, list12, markerLabelFormat, paint22, iM1672toArgb8_81llA, mutableState4, fM4104constructorimpl3, xLabelFormat, paint110), composer4, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function10 = function116;
                    function11 = function117;
                    function12 = function115;
                    mutableState7 = mutableState11;
                    f10 = f7;
                    chartDrawableData7 = chartDrawableData5;
                    chartDrawableData8 = chartDrawableData6;
                    list5 = list3;
                    list6 = list4;
                    i30 = i26;
                    f11 = f8;
                    f12 = f9;
                    z5 = z3;
                    j10 = j8;
                    chartScrollSnapUnit4 = chartScrollSnapUnit3;
                    j11 = j7;
                    f13 = fM4104constructorimpl3;
                    composer2 = composer4;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i32 != 0) {
                            f6 = 279.0f;
                        } else {
                            f6 = f;
                        }
                        if (i33 != 0) {
                            chartDrawableData3 = null;
                        } else {
                            chartDrawableData3 = chartDrawableData;
                        }
                        if (i34 != 0) {
                            chartDrawableData4 = null;
                        } else {
                            chartDrawableData4 = chartDrawableData2;
                        }
                        if (i35 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if (i36 != 0) {
                            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList2 = list2;
                        }
                        if (i37 != 0) {
                            i25 = 2;
                        } else {
                            i25 = i;
                        }
                        f7 = f6;
                        if (i38 != 0) {
                            fM4104constructorimpl = Dp.m4104constructorimpl(22);
                        } else {
                            fM4104constructorimpl = f2;
                        }
                        if (i39 != 0) {
                            fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                        } else {
                            fM4104constructorimpl2 = f3;
                        }
                        if (i40 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if (i41 != 0) {
                            mutableState2 = null;
                        } else {
                            mutableState2 = mutableState;
                        }
                        f8 = fM4104constructorimpl;
                        if ((i5 & 16384) != 0) {
                            jLongValue = minMax.getFirst().longValue();
                            i7 &= -57345;
                        } else {
                            jLongValue = j3;
                        }
                        if (i12 != 0) {
                            chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                        }
                        if (i14 != 0) {
                            j6 = 43200000;
                        } else {
                            j6 = j5;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        } else {
                            function4 = function1;
                        }
                        if (i19 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i21 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        Function1<? super Integer, Unit> function118 = function4;
                        f9 = fM4104constructorimpl2;
                        if (i24 != 0) {
                            fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                        } else {
                            fM4104constructorimpl3 = f5;
                        }
                        chartDrawableData5 = chartDrawableData3;
                        chartDrawableData6 = chartDrawableData4;
                        list3 = listEmptyList;
                        list4 = listEmptyList2;
                        z3 = z2;
                        chartScrollSnapUnit3 = chartScrollSnapUnit2;
                        j7 = j6;
                        function7 = function6;
                        i26 = i25;
                        mutableState3 = mutableState2;
                        j8 = jLongValue;
                        function8 = function118;
                        function9 = function5;
                    } else {
                        if (i32 != 0) {
                            f6 = 279.0f;
                        } else {
                            f6 = f;
                        }
                        if (i33 != 0) {
                            chartDrawableData3 = null;
                        } else {
                            chartDrawableData3 = chartDrawableData;
                        }
                        if (i34 != 0) {
                            chartDrawableData4 = null;
                        } else {
                            chartDrawableData4 = chartDrawableData2;
                        }
                        if (i35 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if (i36 != 0) {
                            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList2 = list2;
                        }
                        if (i37 != 0) {
                            i25 = 2;
                        } else {
                            i25 = i;
                        }
                        f7 = f6;
                        if (i38 != 0) {
                            fM4104constructorimpl = Dp.m4104constructorimpl(22);
                        } else {
                            fM4104constructorimpl = f2;
                        }
                        if (i39 != 0) {
                            fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                        } else {
                            fM4104constructorimpl2 = f3;
                        }
                        if (i40 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if (i41 != 0) {
                            mutableState2 = null;
                        } else {
                            mutableState2 = mutableState;
                        }
                        f8 = fM4104constructorimpl;
                        if ((i5 & 16384) != 0) {
                            jLongValue = minMax.getFirst().longValue();
                            i7 &= -57345;
                        } else {
                            jLongValue = j3;
                        }
                        if (i12 != 0) {
                            chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                        }
                        if (i14 != 0) {
                            j6 = 43200000;
                        } else {
                            j6 = j5;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        } else {
                            function4 = function1;
                        }
                        if (i19 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i21 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        Function1<? super Integer, Unit> function119 = function4;
                        f9 = fM4104constructorimpl2;
                        if (i24 != 0) {
                            fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                        } else {
                            fM4104constructorimpl3 = f5;
                        }
                        chartDrawableData5 = chartDrawableData3;
                        chartDrawableData6 = chartDrawableData4;
                        list3 = listEmptyList;
                        list4 = listEmptyList2;
                        z3 = z2;
                        chartScrollSnapUnit3 = chartScrollSnapUnit2;
                        j7 = j6;
                        function7 = function6;
                        i26 = i25;
                        mutableState3 = mutableState2;
                        j8 = jLongValue;
                        function8 = function119;
                        function9 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-920059604, i6, i7, "com.heytap.health.bodyfat.ui.Chart (ChartCompose.kt:138)");
                    }
                    if (minMax.getFirst().longValue() == minMax.getSecond().longValue()) {
                        m8b.b("Chart", "min == max; return!");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final float f116 = f7;
                        final ChartDrawableData chartDrawableData13 = chartDrawableData5;
                        final ChartDrawableData chartDrawableData14 = chartDrawableData6;
                        final List<ChartDrawableData> list13 = list3;
                        final List<ChartDrawableData> list14 = list4;
                        final int i48 = i26;
                        final float f117 = f8;
                        final float f118 = f9;
                        final boolean z8 = z3;
                        final MutableState<Integer> mutableState12 = mutableState3;
                        final Function2<? super Long, ? super ChartScrollDirection, Long> function1110 = function7;
                        final Function1<? super Long, Unit> function1111 = function9;
                        final Function1<? super Integer, Unit> function1112 = function8;
                        final long j18 = j8;
                        final ChartScrollSnapUnit chartScrollSnapUnit7 = chartScrollSnapUnit3;
                        final long j19 = j7;
                        final float f119 = fM4104constructorimpl3;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer5, int i49) {
                                ChartComposeKt.a(f116, chartDrawableData13, chartDrawableData14, list13, list14, i48, f117, f118, z8, mutableState12, markerLabelFormat, f4, minMax, j2, j18, chartScrollSnapUnit7, j19, xLabelFormat, function1112, function1111, function1110, f119, composer5, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                            }
                        });
                        return;
                    }
                    Function2<? super Long, ? super ChartScrollDirection, Long> function1113 = function7;
                    Function1<? super Long, Unit> function1114 = function9;
                    Function1<? super Integer, Unit> function1115 = function8;
                    if (chartDrawableData5 == null) {
                        fM4104constructorimpl4 = Dp.m4104constructorimpl(0);
                    } else {
                        fM4104constructorimpl4 = f8;
                    }
                    if (chartDrawableData6 == null) {
                        fM4104constructorimpl5 = Dp.m4104constructorimpl(0);
                    } else {
                        fM4104constructorimpl5 = f9;
                    }
                    float fM4104constructorimpl8 = Dp.m4104constructorimpl(22);
                    Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    View view3 = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    iM1672toArgb8_81llA = ColorKt.m1672toArgb8_81llA(ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha55, composerStartRestartGroup, 0));
                    fMo312toPxR2X_6o = density3.mo312toPxR2X_6o(TextUnitKt.getSp(10));
                    fMo312toPxR2X_6o2 = density3.mo312toPxR2X_6o(TextUnitKt.getSp(12));
                    Float fValueOf11 = Float.valueOf(fMo312toPxR2X_6o);
                    Integer numValueOf7 = Integer.valueOf(iM1672toArgb8_81llA);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(fValueOf11) | composerStartRestartGroup.changed(numValueOf7);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        obj = objRememberedValue;
                        Paint paint111 = new Paint();
                        paint111.setAntiAlias(true);
                        paint111.setTextSize(fMo312toPxR2X_6o);
                        paint111.setColor(iM1672toArgb8_81llA);
                        paint111.setTextAlign(Paint.Align.RIGHT);
                        paint111.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint111);
                        obj = paint111;
                    } else {
                        obj = objRememberedValue;
                        Paint paint112 = new Paint();
                        paint112.setAntiAlias(true);
                        paint112.setTextSize(fMo312toPxR2X_6o);
                        paint112.setColor(iM1672toArgb8_81llA);
                        paint112.setTextAlign(Paint.Align.RIGHT);
                        paint112.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint112);
                        obj = paint112;
                    }
                    obj = objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint113 = (Paint) obj;
                    Float fValueOf12 = Float.valueOf(fMo312toPxR2X_6o);
                    Integer numValueOf8 = Integer.valueOf(iM1672toArgb8_81llA);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(fValueOf12) | composerStartRestartGroup.changed(numValueOf8);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        obj2 = objRememberedValue2;
                        Paint paint114 = new Paint();
                        paint114.setAntiAlias(true);
                        paint114.setTextSize(fMo312toPxR2X_6o);
                        paint114.setColor(iM1672toArgb8_81llA);
                        paint114.setTextAlign(Paint.Align.RIGHT);
                        paint114.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint114);
                        obj2 = paint114;
                    } else {
                        obj2 = objRememberedValue2;
                        Paint paint115 = new Paint();
                        paint115.setAntiAlias(true);
                        paint115.setTextSize(fMo312toPxR2X_6o);
                        paint115.setColor(iM1672toArgb8_81llA);
                        paint115.setTextAlign(Paint.Align.RIGHT);
                        paint115.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint115);
                        obj2 = paint115;
                    }
                    obj2 = objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint116 = (Paint) obj2;
                    Float fValueOf13 = Float.valueOf(fMo312toPxR2X_6o);
                    Integer numValueOf9 = Integer.valueOf(iM1672toArgb8_81llA);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(fValueOf13) | composerStartRestartGroup.changed(numValueOf9);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        obj3 = objRememberedValue3;
                        Paint paint117 = new Paint();
                        paint117.setAntiAlias(true);
                        paint117.setTextSize(fMo312toPxR2X_6o);
                        paint117.setColor(iM1672toArgb8_81llA);
                        paint117.setTextAlign(Paint.Align.CENTER);
                        paint117.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint117);
                        obj3 = paint117;
                    } else {
                        obj3 = objRememberedValue3;
                        Paint paint118 = new Paint();
                        paint118.setAntiAlias(true);
                        paint118.setTextSize(fMo312toPxR2X_6o);
                        paint118.setColor(iM1672toArgb8_81llA);
                        paint118.setTextAlign(Paint.Align.CENTER);
                        paint118.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint118);
                        obj3 = paint118;
                    }
                    obj3 = objRememberedValue3;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint119 = (Paint) obj3;
                    Float fValueOf14 = Float.valueOf(fMo312toPxR2X_6o2);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged4 = composerStartRestartGroup.changed(fValueOf14);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4) {
                        obj4 = objRememberedValue4;
                        Paint paint25 = new Paint();
                        paint25.setAntiAlias(true);
                        paint25.setTextSize(fMo312toPxR2X_6o2);
                        paint25.setColor(-1);
                        paint25.setTextAlign(Paint.Align.LEFT);
                        composerStartRestartGroup.updateRememberedValue(paint25);
                        obj4 = paint25;
                    } else {
                        obj4 = objRememberedValue4;
                        Paint paint26 = new Paint();
                        paint26.setAntiAlias(true);
                        paint26.setTextSize(fMo312toPxR2X_6o2);
                        paint26.setColor(-1);
                        paint26.setTextAlign(Paint.Align.LEFT);
                        composerStartRestartGroup.updateRememberedValue(paint26);
                        obj4 = paint26;
                    }
                    obj4 = objRememberedValue4;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint27 = (Paint) obj4;
                    Float fValueOf15 = Float.valueOf(fMo312toPxR2X_6o2);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged5 = composerStartRestartGroup.changed(fValueOf15);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged5) {
                        obj5 = objRememberedValue5;
                        Paint paint28 = new Paint();
                        paint28.setAntiAlias(true);
                        paint28.setTextSize(fMo312toPxR2X_6o2);
                        paint28.setColor(-1);
                        paint28.setTextAlign(Paint.Align.LEFT);
                        paint28.setFakeBoldText(true);
                        composerStartRestartGroup.updateRememberedValue(paint28);
                        obj5 = paint28;
                    } else {
                        obj5 = objRememberedValue5;
                        Paint paint29 = new Paint();
                        paint29.setAntiAlias(true);
                        paint29.setTextSize(fMo312toPxR2X_6o2);
                        paint29.setColor(-1);
                        paint29.setTextAlign(Paint.Align.LEFT);
                        paint29.setFakeBoldText(true);
                        composerStartRestartGroup.updateRememberedValue(paint29);
                        obj5 = paint29;
                    }
                    obj5 = objRememberedValue5;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint1110 = (Paint) obj5;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue6 == companion.getEmpty()) {
                        i27 = 2;
                        snapshotMutationPolicy = null;
                        objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j8), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        i27 = 2;
                        snapshotMutationPolicy = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState4 = (MutableState) objRememberedValue6;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i27, snapshotMutationPolicy);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState5 = (MutableState) objRememberedValue7;
                    if (chartDrawableData5 != null) {
                        listA = chartDrawableData5.a();
                    } else {
                        listA = null;
                    }
                    if (chartDrawableData6 != null) {
                        listA2 = chartDrawableData6.a();
                    } else {
                        listA2 = null;
                    }
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged6 = composerStartRestartGroup.changed(listA) | composerStartRestartGroup.changed(listA2);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (zChanged6) {
                        listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                        if (chartDrawableData5 != null) {
                            while (r12.hasNext()) {
                                if (chartXY.getY() != null) {
                                    listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                                }
                            }
                            Unit unit7 = Unit.INSTANCE;
                        }
                        if (chartDrawableData6 != null) {
                            while (r12.hasNext()) {
                                if (chartXY2.getY() != null) {
                                    listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                                }
                            }
                            Unit unit8 = Unit.INSTANCE;
                        }
                        objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    } else {
                        listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                        if (chartDrawableData5 != null) {
                            while (r12.hasNext()) {
                                if (chartXY.getY() != null) {
                                    listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                                }
                            }
                            Unit unit9 = Unit.INSTANCE;
                        }
                        if (chartDrawableData6 != null) {
                            while (r12.hasNext()) {
                                if (chartXY2.getY() != null) {
                                    listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                                }
                            }
                            Unit unit10 = Unit.INSTANCE;
                        }
                        objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list15 = (List) objRememberedValue8;
                    State stateRememberUpdatedState11 = SnapshotStateKt.rememberUpdatedState(list15, composerStartRestartGroup, 8);
                    State stateRememberUpdatedState12 = SnapshotStateKt.rememberUpdatedState(mutableState3, composerStartRestartGroup, (i6 >> 27) & 14);
                    State stateRememberUpdatedState13 = SnapshotStateKt.rememberUpdatedState(function1115, composerStartRestartGroup, (i7 >> 24) & 14);
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1114, composerStartRestartGroup, (i7 >> 27) & 14);
                    stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function1113, composerStartRestartGroup, i22 & 14);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState6 = (MutableState) objRememberedValue9;
                    float fMo313toPx0680j_15 = density3.mo313toPx0680j_4(Dp.m4104constructorimpl(fM4104constructorimpl4 + fM4104constructorimpl5));
                    float fMo313toPx0680j_16 = density3.mo313toPx0680j_4(fM4104constructorimpl4);
                    float f1110 = fM4104constructorimpl4;
                    float fMo313toPx0680j_17 = density3.mo313toPx0680j_4(Dp.m4104constructorimpl(f4));
                    float fMo313toPx0680j_18 = density3.mo313toPx0680j_4(Dp.m4104constructorimpl(Dp.m4104constructorimpl(f7) - fM4104constructorimpl8));
                    if (j2 > 0) {
                        fFloatValue = 0.0f;
                    } else {
                        fFloatValue = 0.0f;
                    }
                    float fFloatValue4 = ((Number) mutableState6.getValue()).floatValue() - density3.mo313toPx0680j_4(fM4104constructorimpl5);
                    float fMo313toPx0680j_19 = density3.mo313toPx0680j_4(Dp.m4104constructorimpl(600));
                    if (chartDrawableData5 != null) {
                        pointRadiusDp = chartDrawableData5.getPointRadiusDp();
                    } else {
                        pointRadiusDp = 0.0f;
                    }
                    if (chartDrawableData6 != null) {
                        pointRadiusDp2 = chartDrawableData6.getPointRadiusDp();
                    } else {
                        pointRadiusDp2 = 0.0f;
                    }
                    fMo313toPx0680j_4 = density3.mo313toPx0680j_4(Dp.m4104constructorimpl(Math.max(pointRadiusDp, pointRadiusDp2)));
                    float f1111 = 16;
                    State stateRememberUpdatedState14 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(Math.max(4 * fMo313toPx0680j_4, density3.mo313toPx0680j_4(Dp.m4104constructorimpl(f1111)))), composerStartRestartGroup, 0);
                    if (fFloatValue > 0.0f) {
                        j9 = ((long) (fMo313toPx0680j_4 / fFloatValue)) + 1;
                    } else {
                        j9 = 0;
                    }
                    long j110 = j9;
                    jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(minMax.getSecond().longValue() - j2, minMax.getFirst().longValue());
                    if (jCoerceAtLeast > minMax.getFirst().longValue()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    float fMax3 = Math.max(viewConfiguration3.getTouchSlop() * 2.0f, density3.mo313toPx0680j_4(Dp.m4104constructorimpl(f1111)));
                    if (chartDrawableData5 != null) {
                        pairF = chartDrawableData5.f();
                    } else {
                        pairF = null;
                    }
                    if (chartDrawableData6 != null) {
                        pairF2 = chartDrawableData6.f();
                    } else {
                        pairF2 = null;
                    }
                    Long lValueOf5 = Long.valueOf(j8);
                    Long lValueOf6 = Long.valueOf(j2);
                    Pair<Float, Float> pair5 = pairF2;
                    Pair<Float, Float> pair6 = pairF;
                    objArr = new Object[]{Long.valueOf(j8), minMax, Long.valueOf(jCoerceAtLeast), mutableState5, mutableState4};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged7 = false;
                    while (i28 < 5) {
                        zChanged7 |= composerStartRestartGroup.changed(objArr[i28]);
                    }
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (zChanged7) {
                        objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    } else {
                        objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i49 = ((i7 >> 12) & 14) | 4096;
                    int i410 = i7 >> 3;
                    EffectsKt.LaunchedEffect(lValueOf5, minMax, lValueOf6, (Function2) objRememberedValue10, composerStartRestartGroup, (i410 & 896) | i49 | (i410 & 112));
                    Pair<Long, Long> pairD3 = d(mutableState5);
                    objArr2 = new Object[]{mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged8 = false;
                    while (i29 < 4) {
                        zChanged8 |= composerStartRestartGroup.changed(objArr2[i29]);
                    }
                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (zChanged8) {
                        objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    } else {
                        objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(pairD3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 64);
                    Object[] objArr5 = new Object[5];
                    if (mutableState3 != null) {
                        value = mutableState3.getValue();
                    } else {
                        value = null;
                    }
                    objArr5[0] = value;
                    objArr5[1] = list15;
                    objArr5[2] = Long.valueOf(b(mutableState4));
                    objArr5[3] = Long.valueOf(j2);
                    objArr5[4] = Long.valueOf(j110);
                    EffectsKt.LaunchedEffect(objArr5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$4(mutableState3, list15, j2, j110, mutableState4, stateRememberUpdatedState13, null), composerStartRestartGroup, 72);
                    Modifier modifierM455height3ABfNKs3 = SizeKt.m455height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4104constructorimpl(f7));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged9 = composerStartRestartGroup.changed(mutableState6);
                    objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (zChanged9) {
                        objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p010kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m4625invokeozmzZPI(intSize.m4268unboximpl());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m4625invokeozmzZPI(long j111) {
                                mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j111)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    } else {
                        objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p010kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m4625invokeozmzZPI(intSize.m4268unboximpl());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m4625invokeozmzZPI(long j111) {
                                mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j111)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierPointerInput3 = SuspendingPointerInputFilterKt.pointerInput(OnRemeasuredModifierKt.onSizeChanged(modifierM455height3ABfNKs3, (Function1) objRememberedValue12), new Object[]{Float.valueOf(fFloatValue), Float.valueOf(fMo313toPx0680j_16), Float.valueOf(fFloatValue4), Float.valueOf(fMo313toPx0680j_17), Float.valueOf(fMo313toPx0680j_18), minMax, Long.valueOf(j2), chartScrollSnapUnit3, view3}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$6(fMo313toPx0680j_16, fFloatValue4, fMo313toPx0680j_17, fMo313toPx0680j_18, view3, viewConfiguration3, fFloatValue, minMax, jCoerceAtLeast, z4, fMax3, fMo313toPx0680j_19, mutableState5, mutableState4, stateRememberUpdatedState12, stateRememberUpdatedState11, stateRememberUpdatedState14, stateRememberUpdatedState13, stateRememberUpdatedState, chartScrollSnapUnit3, stateRememberUpdatedState2, null));
                    MutableState<Integer> mutableState13 = mutableState3;
                    Composer composer5 = composerStartRestartGroup;
                    CanvasKt.Canvas(modifierPointerInput3, new ChartComposeKt$Chart$7(f1110, f4, fM4104constructorimpl5, fM4104constructorimpl8, j2, pair6, pair5, i26, paint113, paint116, z3, chartDrawableData5, chartDrawableData6, list4, paint119, minMax, j7, list3, mutableState13, list15, markerLabelFormat, paint27, iM1672toArgb8_81llA, mutableState4, fM4104constructorimpl3, xLabelFormat, paint1110), composer5, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function10 = function1114;
                    function11 = function1115;
                    function12 = function1113;
                    mutableState7 = mutableState13;
                    f10 = f7;
                    chartDrawableData7 = chartDrawableData5;
                    chartDrawableData8 = chartDrawableData6;
                    list5 = list3;
                    list6 = list4;
                    i30 = i26;
                    f11 = f8;
                    f12 = f9;
                    z5 = z3;
                    j10 = j8;
                    chartScrollSnapUnit4 = chartScrollSnapUnit3;
                    j11 = j7;
                    f13 = fM4104constructorimpl3;
                    composer2 = composer5;
                }
                scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // p010kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                        invoke(composer6, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer6, int i411) {
                        ChartComposeKt.a(f10, chartDrawableData7, chartDrawableData8, list5, list6, i30, f11, f12, z5, mutableState7, markerLabelFormat, f4, minMax, j2, j10, chartScrollSnapUnit4, j11, xLabelFormat, function11, function10, function12, f13, composer6, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                    }
                });
            }
            i7 |= 48;
            if ((i5 & 4096) != 0) {
                i7 |= ModuleType.TYPE_SYSTEM_SETTING;
            } else if ((i3 & 896) == 0) {
                if (composerStartRestartGroup.changed(minMax)) {
                    i10 = 256;
                } else {
                    i10 = 128;
                }
                i7 |= i10;
            }
            if ((i5 & 8192) != 0) {
                i7 |= 3072;
            } else if ((i3 & 7168) == 0) {
                if (composerStartRestartGroup.changed(j2)) {
                    i11 = 2048;
                } else {
                    i11 = 1024;
                }
                i7 |= i11;
            }
            if ((57344 & i3) != 0) {
                if ((i5 & 16384) == 0) {
                    i31 = 8192;
                } else {
                    i31 = 8192;
                }
                i7 |= i31;
            }
            i12 = 32768 & i5;
            if (i12 != 0) {
                i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                chartScrollSnapUnit2 = chartScrollSnapUnit;
            } else {
                chartScrollSnapUnit2 = chartScrollSnapUnit;
                if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(chartScrollSnapUnit2)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i7 |= i13;
                }
            }
            i14 = i5 & 65536;
            if (i14 != 0) {
                i7 |= 1572864;
                j5 = j4;
            } else {
                j5 = j4;
                if ((i3 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(j5)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i7 |= i15;
                }
            }
            if ((i5 & 131072) != 0) {
                if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(xLabelFormat)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                }
                i17 = i5 & 262144;
                if (i17 != 0) {
                    i7 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i7 |= i18;
                }
                i19 = i5 & 524288;
                if (i19 != 0) {
                    i7 |= 805306368;
                } else if ((i3 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i7 |= i20;
                }
                i21 = i5 & 1048576;
                if (i21 != 0) {
                    i22 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i4 | i23;
                } else {
                    i22 = i4;
                }
                i24 = i5 & 2097152;
                if (i24 != 0) {
                    i22 |= 48;
                } else if ((i4 & 112) == 0) {
                    i22 |= composerStartRestartGroup.changed(f5) ? 32 : 16;
                }
                if ((i5 & 30) != 30) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i32 != 0) {
                            f6 = 279.0f;
                        } else {
                            f6 = f;
                        }
                        if (i33 != 0) {
                            chartDrawableData3 = null;
                        } else {
                            chartDrawableData3 = chartDrawableData;
                        }
                        if (i34 != 0) {
                            chartDrawableData4 = null;
                        } else {
                            chartDrawableData4 = chartDrawableData2;
                        }
                        if (i35 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if (i36 != 0) {
                            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList2 = list2;
                        }
                        if (i37 != 0) {
                            i25 = 2;
                        } else {
                            i25 = i;
                        }
                        f7 = f6;
                        if (i38 != 0) {
                            fM4104constructorimpl = Dp.m4104constructorimpl(22);
                        } else {
                            fM4104constructorimpl = f2;
                        }
                        if (i39 != 0) {
                            fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                        } else {
                            fM4104constructorimpl2 = f3;
                        }
                        if (i40 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if (i41 != 0) {
                            mutableState2 = null;
                        } else {
                            mutableState2 = mutableState;
                        }
                        f8 = fM4104constructorimpl;
                        if ((i5 & 16384) != 0) {
                            jLongValue = minMax.getFirst().longValue();
                            i7 &= -57345;
                        } else {
                            jLongValue = j3;
                        }
                        if (i12 != 0) {
                            chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                        }
                        if (i14 != 0) {
                            j6 = 43200000;
                        } else {
                            j6 = j5;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        } else {
                            function4 = function1;
                        }
                        if (i19 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i21 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        Function1<? super Integer, Unit> function1116 = function4;
                        f9 = fM4104constructorimpl2;
                        if (i24 != 0) {
                            fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                        } else {
                            fM4104constructorimpl3 = f5;
                        }
                        chartDrawableData5 = chartDrawableData3;
                        chartDrawableData6 = chartDrawableData4;
                        list3 = listEmptyList;
                        list4 = listEmptyList2;
                        z3 = z2;
                        chartScrollSnapUnit3 = chartScrollSnapUnit2;
                        j7 = j6;
                        function7 = function6;
                        i26 = i25;
                        mutableState3 = mutableState2;
                        j8 = jLongValue;
                        function8 = function1116;
                        function9 = function5;
                    } else {
                        if (i32 != 0) {
                            f6 = 279.0f;
                        } else {
                            f6 = f;
                        }
                        if (i33 != 0) {
                            chartDrawableData3 = null;
                        } else {
                            chartDrawableData3 = chartDrawableData;
                        }
                        if (i34 != 0) {
                            chartDrawableData4 = null;
                        } else {
                            chartDrawableData4 = chartDrawableData2;
                        }
                        if (i35 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if (i36 != 0) {
                            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList2 = list2;
                        }
                        if (i37 != 0) {
                            i25 = 2;
                        } else {
                            i25 = i;
                        }
                        f7 = f6;
                        if (i38 != 0) {
                            fM4104constructorimpl = Dp.m4104constructorimpl(22);
                        } else {
                            fM4104constructorimpl = f2;
                        }
                        if (i39 != 0) {
                            fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                        } else {
                            fM4104constructorimpl2 = f3;
                        }
                        if (i40 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if (i41 != 0) {
                            mutableState2 = null;
                        } else {
                            mutableState2 = mutableState;
                        }
                        f8 = fM4104constructorimpl;
                        if ((i5 & 16384) != 0) {
                            jLongValue = minMax.getFirst().longValue();
                            i7 &= -57345;
                        } else {
                            jLongValue = j3;
                        }
                        if (i12 != 0) {
                            chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                        }
                        if (i14 != 0) {
                            j6 = 43200000;
                        } else {
                            j6 = j5;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        } else {
                            function4 = function1;
                        }
                        if (i19 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i21 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        Function1<? super Integer, Unit> function1117 = function4;
                        f9 = fM4104constructorimpl2;
                        if (i24 != 0) {
                            fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                        } else {
                            fM4104constructorimpl3 = f5;
                        }
                        chartDrawableData5 = chartDrawableData3;
                        chartDrawableData6 = chartDrawableData4;
                        list3 = listEmptyList;
                        list4 = listEmptyList2;
                        z3 = z2;
                        chartScrollSnapUnit3 = chartScrollSnapUnit2;
                        j7 = j6;
                        function7 = function6;
                        i26 = i25;
                        mutableState3 = mutableState2;
                        j8 = jLongValue;
                        function8 = function1117;
                        function9 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-920059604, i6, i7, "com.heytap.health.bodyfat.ui.Chart (ChartCompose.kt:138)");
                    }
                    if (minMax.getFirst().longValue() == minMax.getSecond().longValue()) {
                        m8b.b("Chart", "min == max; return!");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final float f1112 = f7;
                        final ChartDrawableData chartDrawableData15 = chartDrawableData5;
                        final ChartDrawableData chartDrawableData16 = chartDrawableData6;
                        final List<ChartDrawableData> list16 = list3;
                        final List<ChartDrawableData> list17 = list4;
                        final int i411 = i26;
                        final float f1113 = f8;
                        final float f1114 = f9;
                        final boolean z9 = z3;
                        final MutableState<Integer> mutableState14 = mutableState3;
                        final Function2<? super Long, ? super ChartScrollDirection, Long> function1118 = function7;
                        final Function1<? super Long, Unit> function1119 = function9;
                        final Function1<? super Integer, Unit> function11110 = function8;
                        final long j111 = j8;
                        final ChartScrollSnapUnit chartScrollSnapUnit8 = chartScrollSnapUnit3;
                        final long j112 = j7;
                        final float f1115 = fM4104constructorimpl3;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                invoke(composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer6, int i412) {
                                ChartComposeKt.a(f1112, chartDrawableData15, chartDrawableData16, list16, list17, i411, f1113, f1114, z9, mutableState14, markerLabelFormat, f4, minMax, j2, j111, chartScrollSnapUnit8, j112, xLabelFormat, function11110, function1119, function1118, f1115, composer6, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                            }
                        });
                        return;
                    }
                    Function2<? super Long, ? super ChartScrollDirection, Long> function11111 = function7;
                    Function1<? super Long, Unit> function11112 = function9;
                    Function1<? super Integer, Unit> function11113 = function8;
                    if (chartDrawableData5 == null) {
                        fM4104constructorimpl4 = Dp.m4104constructorimpl(0);
                    } else {
                        fM4104constructorimpl4 = f8;
                    }
                    if (chartDrawableData6 == null) {
                        fM4104constructorimpl5 = Dp.m4104constructorimpl(0);
                    } else {
                        fM4104constructorimpl5 = f9;
                    }
                    float fM4104constructorimpl9 = Dp.m4104constructorimpl(22);
                    Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    View view4 = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                    ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    iM1672toArgb8_81llA = ColorKt.m1672toArgb8_81llA(ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha55, composerStartRestartGroup, 0));
                    fMo312toPxR2X_6o = density4.mo312toPxR2X_6o(TextUnitKt.getSp(10));
                    fMo312toPxR2X_6o2 = density4.mo312toPxR2X_6o(TextUnitKt.getSp(12));
                    Float fValueOf16 = Float.valueOf(fMo312toPxR2X_6o);
                    Integer numValueOf10 = Integer.valueOf(iM1672toArgb8_81llA);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(fValueOf16) | composerStartRestartGroup.changed(numValueOf10);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        obj = objRememberedValue;
                        Paint paint1111 = new Paint();
                        paint1111.setAntiAlias(true);
                        paint1111.setTextSize(fMo312toPxR2X_6o);
                        paint1111.setColor(iM1672toArgb8_81llA);
                        paint1111.setTextAlign(Paint.Align.RIGHT);
                        paint1111.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint1111);
                        obj = paint1111;
                    } else {
                        obj = objRememberedValue;
                        Paint paint1112 = new Paint();
                        paint1112.setAntiAlias(true);
                        paint1112.setTextSize(fMo312toPxR2X_6o);
                        paint1112.setColor(iM1672toArgb8_81llA);
                        paint1112.setTextAlign(Paint.Align.RIGHT);
                        paint1112.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint1112);
                        obj = paint1112;
                    }
                    obj = objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint1113 = (Paint) obj;
                    Float fValueOf17 = Float.valueOf(fMo312toPxR2X_6o);
                    Integer numValueOf11 = Integer.valueOf(iM1672toArgb8_81llA);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(fValueOf17) | composerStartRestartGroup.changed(numValueOf11);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        obj2 = objRememberedValue2;
                        Paint paint1114 = new Paint();
                        paint1114.setAntiAlias(true);
                        paint1114.setTextSize(fMo312toPxR2X_6o);
                        paint1114.setColor(iM1672toArgb8_81llA);
                        paint1114.setTextAlign(Paint.Align.RIGHT);
                        paint1114.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint1114);
                        obj2 = paint1114;
                    } else {
                        obj2 = objRememberedValue2;
                        Paint paint1115 = new Paint();
                        paint1115.setAntiAlias(true);
                        paint1115.setTextSize(fMo312toPxR2X_6o);
                        paint1115.setColor(iM1672toArgb8_81llA);
                        paint1115.setTextAlign(Paint.Align.RIGHT);
                        paint1115.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint1115);
                        obj2 = paint1115;
                    }
                    obj2 = objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint1116 = (Paint) obj2;
                    Float fValueOf18 = Float.valueOf(fMo312toPxR2X_6o);
                    Integer numValueOf12 = Integer.valueOf(iM1672toArgb8_81llA);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(fValueOf18) | composerStartRestartGroup.changed(numValueOf12);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        obj3 = objRememberedValue3;
                        Paint paint1117 = new Paint();
                        paint1117.setAntiAlias(true);
                        paint1117.setTextSize(fMo312toPxR2X_6o);
                        paint1117.setColor(iM1672toArgb8_81llA);
                        paint1117.setTextAlign(Paint.Align.CENTER);
                        paint1117.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint1117);
                        obj3 = paint1117;
                    } else {
                        obj3 = objRememberedValue3;
                        Paint paint1118 = new Paint();
                        paint1118.setAntiAlias(true);
                        paint1118.setTextSize(fMo312toPxR2X_6o);
                        paint1118.setColor(iM1672toArgb8_81llA);
                        paint1118.setTextAlign(Paint.Align.CENTER);
                        paint1118.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint1118);
                        obj3 = paint1118;
                    }
                    obj3 = objRememberedValue3;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint1119 = (Paint) obj3;
                    Float fValueOf19 = Float.valueOf(fMo312toPxR2X_6o2);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged4 = composerStartRestartGroup.changed(fValueOf19);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4) {
                        obj4 = objRememberedValue4;
                        Paint paint210 = new Paint();
                        paint210.setAntiAlias(true);
                        paint210.setTextSize(fMo312toPxR2X_6o2);
                        paint210.setColor(-1);
                        paint210.setTextAlign(Paint.Align.LEFT);
                        composerStartRestartGroup.updateRememberedValue(paint210);
                        obj4 = paint210;
                    } else {
                        obj4 = objRememberedValue4;
                        Paint paint211 = new Paint();
                        paint211.setAntiAlias(true);
                        paint211.setTextSize(fMo312toPxR2X_6o2);
                        paint211.setColor(-1);
                        paint211.setTextAlign(Paint.Align.LEFT);
                        composerStartRestartGroup.updateRememberedValue(paint211);
                        obj4 = paint211;
                    }
                    obj4 = objRememberedValue4;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint212 = (Paint) obj4;
                    Float fValueOf110 = Float.valueOf(fMo312toPxR2X_6o2);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged5 = composerStartRestartGroup.changed(fValueOf110);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged5) {
                        obj5 = objRememberedValue5;
                        Paint paint213 = new Paint();
                        paint213.setAntiAlias(true);
                        paint213.setTextSize(fMo312toPxR2X_6o2);
                        paint213.setColor(-1);
                        paint213.setTextAlign(Paint.Align.LEFT);
                        paint213.setFakeBoldText(true);
                        composerStartRestartGroup.updateRememberedValue(paint213);
                        obj5 = paint213;
                    } else {
                        obj5 = objRememberedValue5;
                        Paint paint214 = new Paint();
                        paint214.setAntiAlias(true);
                        paint214.setTextSize(fMo312toPxR2X_6o2);
                        paint214.setColor(-1);
                        paint214.setTextAlign(Paint.Align.LEFT);
                        paint214.setFakeBoldText(true);
                        composerStartRestartGroup.updateRememberedValue(paint214);
                        obj5 = paint214;
                    }
                    obj5 = objRememberedValue5;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint11110 = (Paint) obj5;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue6 == companion.getEmpty()) {
                        i27 = 2;
                        snapshotMutationPolicy = null;
                        objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j8), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        i27 = 2;
                        snapshotMutationPolicy = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState4 = (MutableState) objRememberedValue6;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i27, snapshotMutationPolicy);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState5 = (MutableState) objRememberedValue7;
                    if (chartDrawableData5 != null) {
                        listA = chartDrawableData5.a();
                    } else {
                        listA = null;
                    }
                    if (chartDrawableData6 != null) {
                        listA2 = chartDrawableData6.a();
                    } else {
                        listA2 = null;
                    }
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged6 = composerStartRestartGroup.changed(listA) | composerStartRestartGroup.changed(listA2);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (zChanged6) {
                        listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                        if (chartDrawableData5 != null) {
                            while (r12.hasNext()) {
                                if (chartXY.getY() != null) {
                                    listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                                }
                            }
                            Unit unit11 = Unit.INSTANCE;
                        }
                        if (chartDrawableData6 != null) {
                            while (r12.hasNext()) {
                                if (chartXY2.getY() != null) {
                                    listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                                }
                            }
                            Unit unit12 = Unit.INSTANCE;
                        }
                        objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    } else {
                        listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                        if (chartDrawableData5 != null) {
                            while (r12.hasNext()) {
                                if (chartXY.getY() != null) {
                                    listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                                }
                            }
                            Unit unit13 = Unit.INSTANCE;
                        }
                        if (chartDrawableData6 != null) {
                            while (r12.hasNext()) {
                                if (chartXY2.getY() != null) {
                                    listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                                }
                            }
                            Unit unit14 = Unit.INSTANCE;
                        }
                        objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list18 = (List) objRememberedValue8;
                    State stateRememberUpdatedState15 = SnapshotStateKt.rememberUpdatedState(list18, composerStartRestartGroup, 8);
                    State stateRememberUpdatedState16 = SnapshotStateKt.rememberUpdatedState(mutableState3, composerStartRestartGroup, (i6 >> 27) & 14);
                    State stateRememberUpdatedState17 = SnapshotStateKt.rememberUpdatedState(function11113, composerStartRestartGroup, (i7 >> 24) & 14);
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function11112, composerStartRestartGroup, (i7 >> 27) & 14);
                    stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function11111, composerStartRestartGroup, i22 & 14);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState6 = (MutableState) objRememberedValue9;
                    float fMo313toPx0680j_110 = density4.mo313toPx0680j_4(Dp.m4104constructorimpl(fM4104constructorimpl4 + fM4104constructorimpl5));
                    float fMo313toPx0680j_111 = density4.mo313toPx0680j_4(fM4104constructorimpl4);
                    float f1116 = fM4104constructorimpl4;
                    float fMo313toPx0680j_112 = density4.mo313toPx0680j_4(Dp.m4104constructorimpl(f4));
                    float fMo313toPx0680j_113 = density4.mo313toPx0680j_4(Dp.m4104constructorimpl(Dp.m4104constructorimpl(f7) - fM4104constructorimpl9));
                    if (j2 > 0) {
                        fFloatValue = 0.0f;
                    } else {
                        fFloatValue = 0.0f;
                    }
                    float fFloatValue5 = ((Number) mutableState6.getValue()).floatValue() - density4.mo313toPx0680j_4(fM4104constructorimpl5);
                    float fMo313toPx0680j_114 = density4.mo313toPx0680j_4(Dp.m4104constructorimpl(600));
                    if (chartDrawableData5 != null) {
                        pointRadiusDp = chartDrawableData5.getPointRadiusDp();
                    } else {
                        pointRadiusDp = 0.0f;
                    }
                    if (chartDrawableData6 != null) {
                        pointRadiusDp2 = chartDrawableData6.getPointRadiusDp();
                    } else {
                        pointRadiusDp2 = 0.0f;
                    }
                    fMo313toPx0680j_4 = density4.mo313toPx0680j_4(Dp.m4104constructorimpl(Math.max(pointRadiusDp, pointRadiusDp2)));
                    float f1117 = 16;
                    State stateRememberUpdatedState18 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(Math.max(4 * fMo313toPx0680j_4, density4.mo313toPx0680j_4(Dp.m4104constructorimpl(f1117)))), composerStartRestartGroup, 0);
                    if (fFloatValue > 0.0f) {
                        j9 = ((long) (fMo313toPx0680j_4 / fFloatValue)) + 1;
                    } else {
                        j9 = 0;
                    }
                    long j113 = j9;
                    jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(minMax.getSecond().longValue() - j2, minMax.getFirst().longValue());
                    if (jCoerceAtLeast > minMax.getFirst().longValue()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    float fMax4 = Math.max(viewConfiguration4.getTouchSlop() * 2.0f, density4.mo313toPx0680j_4(Dp.m4104constructorimpl(f1117)));
                    if (chartDrawableData5 != null) {
                        pairF = chartDrawableData5.f();
                    } else {
                        pairF = null;
                    }
                    if (chartDrawableData6 != null) {
                        pairF2 = chartDrawableData6.f();
                    } else {
                        pairF2 = null;
                    }
                    Long lValueOf7 = Long.valueOf(j8);
                    Long lValueOf8 = Long.valueOf(j2);
                    Pair<Float, Float> pair7 = pairF2;
                    Pair<Float, Float> pair8 = pairF;
                    objArr = new Object[]{Long.valueOf(j8), minMax, Long.valueOf(jCoerceAtLeast), mutableState5, mutableState4};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged7 = false;
                    while (i28 < 5) {
                        zChanged7 |= composerStartRestartGroup.changed(objArr[i28]);
                    }
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (zChanged7) {
                        objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    } else {
                        objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i412 = ((i7 >> 12) & 14) | 4096;
                    int i413 = i7 >> 3;
                    EffectsKt.LaunchedEffect(lValueOf7, minMax, lValueOf8, (Function2) objRememberedValue10, composerStartRestartGroup, (i413 & 896) | i412 | (i413 & 112));
                    Pair<Long, Long> pairD4 = d(mutableState5);
                    objArr2 = new Object[]{mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged8 = false;
                    while (i29 < 4) {
                        zChanged8 |= composerStartRestartGroup.changed(objArr2[i29]);
                    }
                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (zChanged8) {
                        objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    } else {
                        objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(pairD4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 64);
                    Object[] objArr6 = new Object[5];
                    if (mutableState3 != null) {
                        value = mutableState3.getValue();
                    } else {
                        value = null;
                    }
                    objArr6[0] = value;
                    objArr6[1] = list18;
                    objArr6[2] = Long.valueOf(b(mutableState4));
                    objArr6[3] = Long.valueOf(j2);
                    objArr6[4] = Long.valueOf(j113);
                    EffectsKt.LaunchedEffect(objArr6, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$4(mutableState3, list18, j2, j113, mutableState4, stateRememberUpdatedState17, null), composerStartRestartGroup, 72);
                    Modifier modifierM455height3ABfNKs4 = SizeKt.m455height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4104constructorimpl(f7));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged9 = composerStartRestartGroup.changed(mutableState6);
                    objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (zChanged9) {
                        objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p010kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m4625invokeozmzZPI(intSize.m4268unboximpl());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m4625invokeozmzZPI(long j114) {
                                mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j114)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    } else {
                        objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p010kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m4625invokeozmzZPI(intSize.m4268unboximpl());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m4625invokeozmzZPI(long j114) {
                                mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j114)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierPointerInput4 = SuspendingPointerInputFilterKt.pointerInput(OnRemeasuredModifierKt.onSizeChanged(modifierM455height3ABfNKs4, (Function1) objRememberedValue12), new Object[]{Float.valueOf(fFloatValue), Float.valueOf(fMo313toPx0680j_111), Float.valueOf(fFloatValue5), Float.valueOf(fMo313toPx0680j_112), Float.valueOf(fMo313toPx0680j_113), minMax, Long.valueOf(j2), chartScrollSnapUnit3, view4}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$6(fMo313toPx0680j_111, fFloatValue5, fMo313toPx0680j_112, fMo313toPx0680j_113, view4, viewConfiguration4, fFloatValue, minMax, jCoerceAtLeast, z4, fMax4, fMo313toPx0680j_114, mutableState5, mutableState4, stateRememberUpdatedState16, stateRememberUpdatedState15, stateRememberUpdatedState18, stateRememberUpdatedState17, stateRememberUpdatedState, chartScrollSnapUnit3, stateRememberUpdatedState2, null));
                    MutableState<Integer> mutableState15 = mutableState3;
                    Composer composer6 = composerStartRestartGroup;
                    CanvasKt.Canvas(modifierPointerInput4, new ChartComposeKt$Chart$7(f1116, f4, fM4104constructorimpl5, fM4104constructorimpl9, j2, pair8, pair7, i26, paint1113, paint1116, z3, chartDrawableData5, chartDrawableData6, list4, paint1119, minMax, j7, list3, mutableState15, list18, markerLabelFormat, paint212, iM1672toArgb8_81llA, mutableState4, fM4104constructorimpl3, xLabelFormat, paint11110), composer6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function10 = function11112;
                    function11 = function11113;
                    function12 = function11111;
                    mutableState7 = mutableState15;
                    f10 = f7;
                    chartDrawableData7 = chartDrawableData5;
                    chartDrawableData8 = chartDrawableData6;
                    list5 = list3;
                    list6 = list4;
                    i30 = i26;
                    f11 = f8;
                    f12 = f9;
                    z5 = z3;
                    j10 = j8;
                    chartScrollSnapUnit4 = chartScrollSnapUnit3;
                    j11 = j7;
                    f13 = fM4104constructorimpl3;
                    composer2 = composer6;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i32 != 0) {
                            f6 = 279.0f;
                        } else {
                            f6 = f;
                        }
                        if (i33 != 0) {
                            chartDrawableData3 = null;
                        } else {
                            chartDrawableData3 = chartDrawableData;
                        }
                        if (i34 != 0) {
                            chartDrawableData4 = null;
                        } else {
                            chartDrawableData4 = chartDrawableData2;
                        }
                        if (i35 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if (i36 != 0) {
                            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList2 = list2;
                        }
                        if (i37 != 0) {
                            i25 = 2;
                        } else {
                            i25 = i;
                        }
                        f7 = f6;
                        if (i38 != 0) {
                            fM4104constructorimpl = Dp.m4104constructorimpl(22);
                        } else {
                            fM4104constructorimpl = f2;
                        }
                        if (i39 != 0) {
                            fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                        } else {
                            fM4104constructorimpl2 = f3;
                        }
                        if (i40 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if (i41 != 0) {
                            mutableState2 = null;
                        } else {
                            mutableState2 = mutableState;
                        }
                        f8 = fM4104constructorimpl;
                        if ((i5 & 16384) != 0) {
                            jLongValue = minMax.getFirst().longValue();
                            i7 &= -57345;
                        } else {
                            jLongValue = j3;
                        }
                        if (i12 != 0) {
                            chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                        }
                        if (i14 != 0) {
                            j6 = 43200000;
                        } else {
                            j6 = j5;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        } else {
                            function4 = function1;
                        }
                        if (i19 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i21 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        Function1<? super Integer, Unit> function11114 = function4;
                        f9 = fM4104constructorimpl2;
                        if (i24 != 0) {
                            fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                        } else {
                            fM4104constructorimpl3 = f5;
                        }
                        chartDrawableData5 = chartDrawableData3;
                        chartDrawableData6 = chartDrawableData4;
                        list3 = listEmptyList;
                        list4 = listEmptyList2;
                        z3 = z2;
                        chartScrollSnapUnit3 = chartScrollSnapUnit2;
                        j7 = j6;
                        function7 = function6;
                        i26 = i25;
                        mutableState3 = mutableState2;
                        j8 = jLongValue;
                        function8 = function11114;
                        function9 = function5;
                    } else {
                        if (i32 != 0) {
                            f6 = 279.0f;
                        } else {
                            f6 = f;
                        }
                        if (i33 != 0) {
                            chartDrawableData3 = null;
                        } else {
                            chartDrawableData3 = chartDrawableData;
                        }
                        if (i34 != 0) {
                            chartDrawableData4 = null;
                        } else {
                            chartDrawableData4 = chartDrawableData2;
                        }
                        if (i35 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if (i36 != 0) {
                            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList2 = list2;
                        }
                        if (i37 != 0) {
                            i25 = 2;
                        } else {
                            i25 = i;
                        }
                        f7 = f6;
                        if (i38 != 0) {
                            fM4104constructorimpl = Dp.m4104constructorimpl(22);
                        } else {
                            fM4104constructorimpl = f2;
                        }
                        if (i39 != 0) {
                            fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                        } else {
                            fM4104constructorimpl2 = f3;
                        }
                        if (i40 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if (i41 != 0) {
                            mutableState2 = null;
                        } else {
                            mutableState2 = mutableState;
                        }
                        f8 = fM4104constructorimpl;
                        if ((i5 & 16384) != 0) {
                            jLongValue = minMax.getFirst().longValue();
                            i7 &= -57345;
                        } else {
                            jLongValue = j3;
                        }
                        if (i12 != 0) {
                            chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                        }
                        if (i14 != 0) {
                            j6 = 43200000;
                        } else {
                            j6 = j5;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        } else {
                            function4 = function1;
                        }
                        if (i19 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i21 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        Function1<? super Integer, Unit> function11115 = function4;
                        f9 = fM4104constructorimpl2;
                        if (i24 != 0) {
                            fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                        } else {
                            fM4104constructorimpl3 = f5;
                        }
                        chartDrawableData5 = chartDrawableData3;
                        chartDrawableData6 = chartDrawableData4;
                        list3 = listEmptyList;
                        list4 = listEmptyList2;
                        z3 = z2;
                        chartScrollSnapUnit3 = chartScrollSnapUnit2;
                        j7 = j6;
                        function7 = function6;
                        i26 = i25;
                        mutableState3 = mutableState2;
                        j8 = jLongValue;
                        function8 = function11115;
                        function9 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-920059604, i6, i7, "com.heytap.health.bodyfat.ui.Chart (ChartCompose.kt:138)");
                    }
                    if (minMax.getFirst().longValue() == minMax.getSecond().longValue()) {
                        m8b.b("Chart", "min == max; return!");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final float f1118 = f7;
                        final ChartDrawableData chartDrawableData17 = chartDrawableData5;
                        final ChartDrawableData chartDrawableData18 = chartDrawableData6;
                        final List<ChartDrawableData> list19 = list3;
                        final List<ChartDrawableData> list110 = list4;
                        final int i414 = i26;
                        final float f1119 = f8;
                        final float f11110 = f9;
                        final boolean z10 = z3;
                        final MutableState<Integer> mutableState16 = mutableState3;
                        final Function2<? super Long, ? super ChartScrollDirection, Long> function11116 = function7;
                        final Function1<? super Long, Unit> function11117 = function9;
                        final Function1<? super Integer, Unit> function11118 = function8;
                        final long j114 = j8;
                        final ChartScrollSnapUnit chartScrollSnapUnit9 = chartScrollSnapUnit3;
                        final long j115 = j7;
                        final float f11111 = fM4104constructorimpl3;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                invoke(composer7, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer7, int i415) {
                                ChartComposeKt.a(f1118, chartDrawableData17, chartDrawableData18, list19, list110, i414, f1119, f11110, z10, mutableState16, markerLabelFormat, f4, minMax, j2, j114, chartScrollSnapUnit9, j115, xLabelFormat, function11118, function11117, function11116, f11111, composer7, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                            }
                        });
                        return;
                    }
                    Function2<? super Long, ? super ChartScrollDirection, Long> function11119 = function7;
                    Function1<? super Long, Unit> function111110 = function9;
                    Function1<? super Integer, Unit> function111111 = function8;
                    if (chartDrawableData5 == null) {
                        fM4104constructorimpl4 = Dp.m4104constructorimpl(0);
                    } else {
                        fM4104constructorimpl4 = f8;
                    }
                    if (chartDrawableData6 == null) {
                        fM4104constructorimpl5 = Dp.m4104constructorimpl(0);
                    } else {
                        fM4104constructorimpl5 = f9;
                    }
                    float fM4104constructorimpl10 = Dp.m4104constructorimpl(22);
                    Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    View view5 = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                    ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    iM1672toArgb8_81llA = ColorKt.m1672toArgb8_81llA(ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha55, composerStartRestartGroup, 0));
                    fMo312toPxR2X_6o = density5.mo312toPxR2X_6o(TextUnitKt.getSp(10));
                    fMo312toPxR2X_6o2 = density5.mo312toPxR2X_6o(TextUnitKt.getSp(12));
                    Float fValueOf111 = Float.valueOf(fMo312toPxR2X_6o);
                    Integer numValueOf13 = Integer.valueOf(iM1672toArgb8_81llA);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(fValueOf111) | composerStartRestartGroup.changed(numValueOf13);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        obj = objRememberedValue;
                        Paint paint11111 = new Paint();
                        paint11111.setAntiAlias(true);
                        paint11111.setTextSize(fMo312toPxR2X_6o);
                        paint11111.setColor(iM1672toArgb8_81llA);
                        paint11111.setTextAlign(Paint.Align.RIGHT);
                        paint11111.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint11111);
                        obj = paint11111;
                    } else {
                        obj = objRememberedValue;
                        Paint paint11112 = new Paint();
                        paint11112.setAntiAlias(true);
                        paint11112.setTextSize(fMo312toPxR2X_6o);
                        paint11112.setColor(iM1672toArgb8_81llA);
                        paint11112.setTextAlign(Paint.Align.RIGHT);
                        paint11112.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint11112);
                        obj = paint11112;
                    }
                    obj = objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint11113 = (Paint) obj;
                    Float fValueOf112 = Float.valueOf(fMo312toPxR2X_6o);
                    Integer numValueOf14 = Integer.valueOf(iM1672toArgb8_81llA);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(fValueOf112) | composerStartRestartGroup.changed(numValueOf14);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        obj2 = objRememberedValue2;
                        Paint paint11114 = new Paint();
                        paint11114.setAntiAlias(true);
                        paint11114.setTextSize(fMo312toPxR2X_6o);
                        paint11114.setColor(iM1672toArgb8_81llA);
                        paint11114.setTextAlign(Paint.Align.RIGHT);
                        paint11114.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint11114);
                        obj2 = paint11114;
                    } else {
                        obj2 = objRememberedValue2;
                        Paint paint11115 = new Paint();
                        paint11115.setAntiAlias(true);
                        paint11115.setTextSize(fMo312toPxR2X_6o);
                        paint11115.setColor(iM1672toArgb8_81llA);
                        paint11115.setTextAlign(Paint.Align.RIGHT);
                        paint11115.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint11115);
                        obj2 = paint11115;
                    }
                    obj2 = objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint11116 = (Paint) obj2;
                    Float fValueOf113 = Float.valueOf(fMo312toPxR2X_6o);
                    Integer numValueOf15 = Integer.valueOf(iM1672toArgb8_81llA);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(fValueOf113) | composerStartRestartGroup.changed(numValueOf15);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        obj3 = objRememberedValue3;
                        Paint paint11117 = new Paint();
                        paint11117.setAntiAlias(true);
                        paint11117.setTextSize(fMo312toPxR2X_6o);
                        paint11117.setColor(iM1672toArgb8_81llA);
                        paint11117.setTextAlign(Paint.Align.CENTER);
                        paint11117.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint11117);
                        obj3 = paint11117;
                    } else {
                        obj3 = objRememberedValue3;
                        Paint paint11118 = new Paint();
                        paint11118.setAntiAlias(true);
                        paint11118.setTextSize(fMo312toPxR2X_6o);
                        paint11118.setColor(iM1672toArgb8_81llA);
                        paint11118.setTextAlign(Paint.Align.CENTER);
                        paint11118.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint11118);
                        obj3 = paint11118;
                    }
                    obj3 = objRememberedValue3;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint11119 = (Paint) obj3;
                    Float fValueOf114 = Float.valueOf(fMo312toPxR2X_6o2);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged4 = composerStartRestartGroup.changed(fValueOf114);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4) {
                        obj4 = objRememberedValue4;
                        Paint paint215 = new Paint();
                        paint215.setAntiAlias(true);
                        paint215.setTextSize(fMo312toPxR2X_6o2);
                        paint215.setColor(-1);
                        paint215.setTextAlign(Paint.Align.LEFT);
                        composerStartRestartGroup.updateRememberedValue(paint215);
                        obj4 = paint215;
                    } else {
                        obj4 = objRememberedValue4;
                        Paint paint216 = new Paint();
                        paint216.setAntiAlias(true);
                        paint216.setTextSize(fMo312toPxR2X_6o2);
                        paint216.setColor(-1);
                        paint216.setTextAlign(Paint.Align.LEFT);
                        composerStartRestartGroup.updateRememberedValue(paint216);
                        obj4 = paint216;
                    }
                    obj4 = objRememberedValue4;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint217 = (Paint) obj4;
                    Float fValueOf115 = Float.valueOf(fMo312toPxR2X_6o2);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged5 = composerStartRestartGroup.changed(fValueOf115);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged5) {
                        obj5 = objRememberedValue5;
                        Paint paint218 = new Paint();
                        paint218.setAntiAlias(true);
                        paint218.setTextSize(fMo312toPxR2X_6o2);
                        paint218.setColor(-1);
                        paint218.setTextAlign(Paint.Align.LEFT);
                        paint218.setFakeBoldText(true);
                        composerStartRestartGroup.updateRememberedValue(paint218);
                        obj5 = paint218;
                    } else {
                        obj5 = objRememberedValue5;
                        Paint paint219 = new Paint();
                        paint219.setAntiAlias(true);
                        paint219.setTextSize(fMo312toPxR2X_6o2);
                        paint219.setColor(-1);
                        paint219.setTextAlign(Paint.Align.LEFT);
                        paint219.setFakeBoldText(true);
                        composerStartRestartGroup.updateRememberedValue(paint219);
                        obj5 = paint219;
                    }
                    obj5 = objRememberedValue5;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint111110 = (Paint) obj5;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue6 == companion.getEmpty()) {
                        i27 = 2;
                        snapshotMutationPolicy = null;
                        objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j8), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        i27 = 2;
                        snapshotMutationPolicy = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState4 = (MutableState) objRememberedValue6;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i27, snapshotMutationPolicy);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState5 = (MutableState) objRememberedValue7;
                    if (chartDrawableData5 != null) {
                        listA = chartDrawableData5.a();
                    } else {
                        listA = null;
                    }
                    if (chartDrawableData6 != null) {
                        listA2 = chartDrawableData6.a();
                    } else {
                        listA2 = null;
                    }
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged6 = composerStartRestartGroup.changed(listA) | composerStartRestartGroup.changed(listA2);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (zChanged6) {
                        listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                        if (chartDrawableData5 != null) {
                            while (r12.hasNext()) {
                                if (chartXY.getY() != null) {
                                    listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                                }
                            }
                            Unit unit15 = Unit.INSTANCE;
                        }
                        if (chartDrawableData6 != null) {
                            while (r12.hasNext()) {
                                if (chartXY2.getY() != null) {
                                    listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                                }
                            }
                            Unit unit16 = Unit.INSTANCE;
                        }
                        objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    } else {
                        listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                        if (chartDrawableData5 != null) {
                            while (r12.hasNext()) {
                                if (chartXY.getY() != null) {
                                    listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                                }
                            }
                            Unit unit17 = Unit.INSTANCE;
                        }
                        if (chartDrawableData6 != null) {
                            while (r12.hasNext()) {
                                if (chartXY2.getY() != null) {
                                    listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                                }
                            }
                            Unit unit18 = Unit.INSTANCE;
                        }
                        objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list111 = (List) objRememberedValue8;
                    State stateRememberUpdatedState19 = SnapshotStateKt.rememberUpdatedState(list111, composerStartRestartGroup, 8);
                    State stateRememberUpdatedState110 = SnapshotStateKt.rememberUpdatedState(mutableState3, composerStartRestartGroup, (i6 >> 27) & 14);
                    State stateRememberUpdatedState111 = SnapshotStateKt.rememberUpdatedState(function111111, composerStartRestartGroup, (i7 >> 24) & 14);
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function111110, composerStartRestartGroup, (i7 >> 27) & 14);
                    stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function11119, composerStartRestartGroup, i22 & 14);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState6 = (MutableState) objRememberedValue9;
                    float fMo313toPx0680j_115 = density5.mo313toPx0680j_4(Dp.m4104constructorimpl(fM4104constructorimpl4 + fM4104constructorimpl5));
                    float fMo313toPx0680j_116 = density5.mo313toPx0680j_4(fM4104constructorimpl4);
                    float f11112 = fM4104constructorimpl4;
                    float fMo313toPx0680j_117 = density5.mo313toPx0680j_4(Dp.m4104constructorimpl(f4));
                    float fMo313toPx0680j_118 = density5.mo313toPx0680j_4(Dp.m4104constructorimpl(Dp.m4104constructorimpl(f7) - fM4104constructorimpl10));
                    if (j2 > 0) {
                        fFloatValue = 0.0f;
                    } else {
                        fFloatValue = 0.0f;
                    }
                    float fFloatValue6 = ((Number) mutableState6.getValue()).floatValue() - density5.mo313toPx0680j_4(fM4104constructorimpl5);
                    float fMo313toPx0680j_119 = density5.mo313toPx0680j_4(Dp.m4104constructorimpl(600));
                    if (chartDrawableData5 != null) {
                        pointRadiusDp = chartDrawableData5.getPointRadiusDp();
                    } else {
                        pointRadiusDp = 0.0f;
                    }
                    if (chartDrawableData6 != null) {
                        pointRadiusDp2 = chartDrawableData6.getPointRadiusDp();
                    } else {
                        pointRadiusDp2 = 0.0f;
                    }
                    fMo313toPx0680j_4 = density5.mo313toPx0680j_4(Dp.m4104constructorimpl(Math.max(pointRadiusDp, pointRadiusDp2)));
                    float f11113 = 16;
                    State stateRememberUpdatedState112 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(Math.max(4 * fMo313toPx0680j_4, density5.mo313toPx0680j_4(Dp.m4104constructorimpl(f11113)))), composerStartRestartGroup, 0);
                    if (fFloatValue > 0.0f) {
                        j9 = ((long) (fMo313toPx0680j_4 / fFloatValue)) + 1;
                    } else {
                        j9 = 0;
                    }
                    long j116 = j9;
                    jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(minMax.getSecond().longValue() - j2, minMax.getFirst().longValue());
                    if (jCoerceAtLeast > minMax.getFirst().longValue()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    float fMax5 = Math.max(viewConfiguration5.getTouchSlop() * 2.0f, density5.mo313toPx0680j_4(Dp.m4104constructorimpl(f11113)));
                    if (chartDrawableData5 != null) {
                        pairF = chartDrawableData5.f();
                    } else {
                        pairF = null;
                    }
                    if (chartDrawableData6 != null) {
                        pairF2 = chartDrawableData6.f();
                    } else {
                        pairF2 = null;
                    }
                    Long lValueOf9 = Long.valueOf(j8);
                    Long lValueOf10 = Long.valueOf(j2);
                    Pair<Float, Float> pair9 = pairF2;
                    Pair<Float, Float> pair10 = pairF;
                    objArr = new Object[]{Long.valueOf(j8), minMax, Long.valueOf(jCoerceAtLeast), mutableState5, mutableState4};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged7 = false;
                    while (i28 < 5) {
                        zChanged7 |= composerStartRestartGroup.changed(objArr[i28]);
                    }
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (zChanged7) {
                        objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    } else {
                        objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i415 = ((i7 >> 12) & 14) | 4096;
                    int i416 = i7 >> 3;
                    EffectsKt.LaunchedEffect(lValueOf9, minMax, lValueOf10, (Function2) objRememberedValue10, composerStartRestartGroup, (i416 & 896) | i415 | (i416 & 112));
                    Pair<Long, Long> pairD5 = d(mutableState5);
                    objArr2 = new Object[]{mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged8 = false;
                    while (i29 < 4) {
                        zChanged8 |= composerStartRestartGroup.changed(objArr2[i29]);
                    }
                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (zChanged8) {
                        objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    } else {
                        objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(pairD5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 64);
                    Object[] objArr7 = new Object[5];
                    if (mutableState3 != null) {
                        value = mutableState3.getValue();
                    } else {
                        value = null;
                    }
                    objArr7[0] = value;
                    objArr7[1] = list111;
                    objArr7[2] = Long.valueOf(b(mutableState4));
                    objArr7[3] = Long.valueOf(j2);
                    objArr7[4] = Long.valueOf(j116);
                    EffectsKt.LaunchedEffect(objArr7, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$4(mutableState3, list111, j2, j116, mutableState4, stateRememberUpdatedState111, null), composerStartRestartGroup, 72);
                    Modifier modifierM455height3ABfNKs5 = SizeKt.m455height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4104constructorimpl(f7));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged9 = composerStartRestartGroup.changed(mutableState6);
                    objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (zChanged9) {
                        objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p010kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m4625invokeozmzZPI(intSize.m4268unboximpl());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m4625invokeozmzZPI(long j117) {
                                mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j117)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    } else {
                        objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p010kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m4625invokeozmzZPI(intSize.m4268unboximpl());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m4625invokeozmzZPI(long j117) {
                                mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j117)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierPointerInput5 = SuspendingPointerInputFilterKt.pointerInput(OnRemeasuredModifierKt.onSizeChanged(modifierM455height3ABfNKs5, (Function1) objRememberedValue12), new Object[]{Float.valueOf(fFloatValue), Float.valueOf(fMo313toPx0680j_116), Float.valueOf(fFloatValue6), Float.valueOf(fMo313toPx0680j_117), Float.valueOf(fMo313toPx0680j_118), minMax, Long.valueOf(j2), chartScrollSnapUnit3, view5}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$6(fMo313toPx0680j_116, fFloatValue6, fMo313toPx0680j_117, fMo313toPx0680j_118, view5, viewConfiguration5, fFloatValue, minMax, jCoerceAtLeast, z4, fMax5, fMo313toPx0680j_119, mutableState5, mutableState4, stateRememberUpdatedState110, stateRememberUpdatedState19, stateRememberUpdatedState112, stateRememberUpdatedState111, stateRememberUpdatedState, chartScrollSnapUnit3, stateRememberUpdatedState2, null));
                    MutableState<Integer> mutableState17 = mutableState3;
                    Composer composer7 = composerStartRestartGroup;
                    CanvasKt.Canvas(modifierPointerInput5, new ChartComposeKt$Chart$7(f11112, f4, fM4104constructorimpl5, fM4104constructorimpl10, j2, pair10, pair9, i26, paint11113, paint11116, z3, chartDrawableData5, chartDrawableData6, list4, paint11119, minMax, j7, list3, mutableState17, list111, markerLabelFormat, paint217, iM1672toArgb8_81llA, mutableState4, fM4104constructorimpl3, xLabelFormat, paint111110), composer7, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function10 = function111110;
                    function11 = function111111;
                    function12 = function11119;
                    mutableState7 = mutableState17;
                    f10 = f7;
                    chartDrawableData7 = chartDrawableData5;
                    chartDrawableData8 = chartDrawableData6;
                    list5 = list3;
                    list6 = list4;
                    i30 = i26;
                    f11 = f8;
                    f12 = f9;
                    z5 = z3;
                    j10 = j8;
                    chartScrollSnapUnit4 = chartScrollSnapUnit3;
                    j11 = j7;
                    f13 = fM4104constructorimpl3;
                    composer2 = composer7;
                }
                scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // p010kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer8, Integer num) {
                        invoke(composer8, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer8, int i417) {
                        ChartComposeKt.a(f10, chartDrawableData7, chartDrawableData8, list5, list6, i30, f11, f12, z5, mutableState7, markerLabelFormat, f4, minMax, j2, j10, chartScrollSnapUnit4, j11, xLabelFormat, function11, function10, function12, f13, composer8, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                    }
                });
            }
            i16 = 12582912;
            i7 |= i16;
            i17 = i5 & 262144;
            if (i17 != 0) {
                i7 |= 100663296;
            } else if ((i3 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i7 |= i18;
            }
            i19 = i5 & 524288;
            if (i19 != 0) {
                i7 |= 805306368;
            } else if ((i3 & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i7 |= i20;
            }
            i21 = i5 & 1048576;
            if (i21 != 0) {
                i22 = i4 | 6;
            } else if ((i4 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i4 | i23;
            } else {
                i22 = i4;
            }
            i24 = i5 & 2097152;
            if (i24 != 0) {
                i22 |= 48;
            } else if ((i4 & 112) == 0) {
                i22 |= composerStartRestartGroup.changed(f5) ? 32 : 16;
            }
            if ((i5 & 30) != 30) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i32 != 0) {
                        f6 = 279.0f;
                    } else {
                        f6 = f;
                    }
                    if (i33 != 0) {
                        chartDrawableData3 = null;
                    } else {
                        chartDrawableData3 = chartDrawableData;
                    }
                    if (i34 != 0) {
                        chartDrawableData4 = null;
                    } else {
                        chartDrawableData4 = chartDrawableData2;
                    }
                    if (i35 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i36 != 0) {
                        listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList2 = list2;
                    }
                    if (i37 != 0) {
                        i25 = 2;
                    } else {
                        i25 = i;
                    }
                    f7 = f6;
                    if (i38 != 0) {
                        fM4104constructorimpl = Dp.m4104constructorimpl(22);
                    } else {
                        fM4104constructorimpl = f2;
                    }
                    if (i39 != 0) {
                        fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                    } else {
                        fM4104constructorimpl2 = f3;
                    }
                    if (i40 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (i41 != 0) {
                        mutableState2 = null;
                    } else {
                        mutableState2 = mutableState;
                    }
                    f8 = fM4104constructorimpl;
                    if ((i5 & 16384) != 0) {
                        jLongValue = minMax.getFirst().longValue();
                        i7 &= -57345;
                    } else {
                        jLongValue = j3;
                    }
                    if (i12 != 0) {
                        chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                    }
                    if (i14 != 0) {
                        j6 = 43200000;
                    } else {
                        j6 = j5;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    } else {
                        function4 = function1;
                    }
                    if (i19 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i21 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    Function1<? super Integer, Unit> function111112 = function4;
                    f9 = fM4104constructorimpl2;
                    if (i24 != 0) {
                        fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                    } else {
                        fM4104constructorimpl3 = f5;
                    }
                    chartDrawableData5 = chartDrawableData3;
                    chartDrawableData6 = chartDrawableData4;
                    list3 = listEmptyList;
                    list4 = listEmptyList2;
                    z3 = z2;
                    chartScrollSnapUnit3 = chartScrollSnapUnit2;
                    j7 = j6;
                    function7 = function6;
                    i26 = i25;
                    mutableState3 = mutableState2;
                    j8 = jLongValue;
                    function8 = function111112;
                    function9 = function5;
                } else {
                    if (i32 != 0) {
                        f6 = 279.0f;
                    } else {
                        f6 = f;
                    }
                    if (i33 != 0) {
                        chartDrawableData3 = null;
                    } else {
                        chartDrawableData3 = chartDrawableData;
                    }
                    if (i34 != 0) {
                        chartDrawableData4 = null;
                    } else {
                        chartDrawableData4 = chartDrawableData2;
                    }
                    if (i35 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i36 != 0) {
                        listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList2 = list2;
                    }
                    if (i37 != 0) {
                        i25 = 2;
                    } else {
                        i25 = i;
                    }
                    f7 = f6;
                    if (i38 != 0) {
                        fM4104constructorimpl = Dp.m4104constructorimpl(22);
                    } else {
                        fM4104constructorimpl = f2;
                    }
                    if (i39 != 0) {
                        fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                    } else {
                        fM4104constructorimpl2 = f3;
                    }
                    if (i40 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (i41 != 0) {
                        mutableState2 = null;
                    } else {
                        mutableState2 = mutableState;
                    }
                    f8 = fM4104constructorimpl;
                    if ((i5 & 16384) != 0) {
                        jLongValue = minMax.getFirst().longValue();
                        i7 &= -57345;
                    } else {
                        jLongValue = j3;
                    }
                    if (i12 != 0) {
                        chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                    }
                    if (i14 != 0) {
                        j6 = 43200000;
                    } else {
                        j6 = j5;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    } else {
                        function4 = function1;
                    }
                    if (i19 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i21 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    Function1<? super Integer, Unit> function111113 = function4;
                    f9 = fM4104constructorimpl2;
                    if (i24 != 0) {
                        fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                    } else {
                        fM4104constructorimpl3 = f5;
                    }
                    chartDrawableData5 = chartDrawableData3;
                    chartDrawableData6 = chartDrawableData4;
                    list3 = listEmptyList;
                    list4 = listEmptyList2;
                    z3 = z2;
                    chartScrollSnapUnit3 = chartScrollSnapUnit2;
                    j7 = j6;
                    function7 = function6;
                    i26 = i25;
                    mutableState3 = mutableState2;
                    j8 = jLongValue;
                    function8 = function111113;
                    function9 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-920059604, i6, i7, "com.heytap.health.bodyfat.ui.Chart (ChartCompose.kt:138)");
                }
                if (minMax.getFirst().longValue() == minMax.getSecond().longValue()) {
                    m8b.b("Chart", "min == max; return!");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final float f11114 = f7;
                    final ChartDrawableData chartDrawableData19 = chartDrawableData5;
                    final ChartDrawableData chartDrawableData110 = chartDrawableData6;
                    final List<ChartDrawableData> list112 = list3;
                    final List<ChartDrawableData> list113 = list4;
                    final int i417 = i26;
                    final float f11115 = f8;
                    final float f11116 = f9;
                    final boolean z11 = z3;
                    final MutableState<Integer> mutableState18 = mutableState3;
                    final Function2<? super Long, ? super ChartScrollDirection, Long> function111114 = function7;
                    final Function1<? super Long, Unit> function111115 = function9;
                    final Function1<? super Integer, Unit> function111116 = function8;
                    final long j117 = j8;
                    final ChartScrollSnapUnit chartScrollSnapUnit10 = chartScrollSnapUnit3;
                    final long j118 = j7;
                    final float f11117 = fM4104constructorimpl3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // p010kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer8, Integer num) {
                            invoke(composer8, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer8, int i418) {
                            ChartComposeKt.a(f11114, chartDrawableData19, chartDrawableData110, list112, list113, i417, f11115, f11116, z11, mutableState18, markerLabelFormat, f4, minMax, j2, j117, chartScrollSnapUnit10, j118, xLabelFormat, function111116, function111115, function111114, f11117, composer8, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                        }
                    });
                    return;
                }
                Function2<? super Long, ? super ChartScrollDirection, Long> function111117 = function7;
                Function1<? super Long, Unit> function111118 = function9;
                Function1<? super Integer, Unit> function111119 = function8;
                if (chartDrawableData5 == null) {
                    fM4104constructorimpl4 = Dp.m4104constructorimpl(0);
                } else {
                    fM4104constructorimpl4 = f8;
                }
                if (chartDrawableData6 == null) {
                    fM4104constructorimpl5 = Dp.m4104constructorimpl(0);
                } else {
                    fM4104constructorimpl5 = f9;
                }
                float fM4104constructorimpl11 = Dp.m4104constructorimpl(22);
                Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                View view6 = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                ViewConfiguration viewConfiguration6 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                iM1672toArgb8_81llA = ColorKt.m1672toArgb8_81llA(ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha55, composerStartRestartGroup, 0));
                fMo312toPxR2X_6o = density6.mo312toPxR2X_6o(TextUnitKt.getSp(10));
                fMo312toPxR2X_6o2 = density6.mo312toPxR2X_6o(TextUnitKt.getSp(12));
                Float fValueOf116 = Float.valueOf(fMo312toPxR2X_6o);
                Integer numValueOf16 = Integer.valueOf(iM1672toArgb8_81llA);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(fValueOf116) | composerStartRestartGroup.changed(numValueOf16);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    obj = objRememberedValue;
                    Paint paint111111 = new Paint();
                    paint111111.setAntiAlias(true);
                    paint111111.setTextSize(fMo312toPxR2X_6o);
                    paint111111.setColor(iM1672toArgb8_81llA);
                    paint111111.setTextAlign(Paint.Align.RIGHT);
                    paint111111.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint111111);
                    obj = paint111111;
                } else {
                    obj = objRememberedValue;
                    Paint paint111112 = new Paint();
                    paint111112.setAntiAlias(true);
                    paint111112.setTextSize(fMo312toPxR2X_6o);
                    paint111112.setColor(iM1672toArgb8_81llA);
                    paint111112.setTextAlign(Paint.Align.RIGHT);
                    paint111112.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint111112);
                    obj = paint111112;
                }
                obj = objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint111113 = (Paint) obj;
                Float fValueOf117 = Float.valueOf(fMo312toPxR2X_6o);
                Integer numValueOf17 = Integer.valueOf(iM1672toArgb8_81llA);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(fValueOf117) | composerStartRestartGroup.changed(numValueOf17);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    obj2 = objRememberedValue2;
                    Paint paint111114 = new Paint();
                    paint111114.setAntiAlias(true);
                    paint111114.setTextSize(fMo312toPxR2X_6o);
                    paint111114.setColor(iM1672toArgb8_81llA);
                    paint111114.setTextAlign(Paint.Align.RIGHT);
                    paint111114.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint111114);
                    obj2 = paint111114;
                } else {
                    obj2 = objRememberedValue2;
                    Paint paint111115 = new Paint();
                    paint111115.setAntiAlias(true);
                    paint111115.setTextSize(fMo312toPxR2X_6o);
                    paint111115.setColor(iM1672toArgb8_81llA);
                    paint111115.setTextAlign(Paint.Align.RIGHT);
                    paint111115.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint111115);
                    obj2 = paint111115;
                }
                obj2 = objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint111116 = (Paint) obj2;
                Float fValueOf118 = Float.valueOf(fMo312toPxR2X_6o);
                Integer numValueOf18 = Integer.valueOf(iM1672toArgb8_81llA);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(fValueOf118) | composerStartRestartGroup.changed(numValueOf18);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    obj3 = objRememberedValue3;
                    Paint paint111117 = new Paint();
                    paint111117.setAntiAlias(true);
                    paint111117.setTextSize(fMo312toPxR2X_6o);
                    paint111117.setColor(iM1672toArgb8_81llA);
                    paint111117.setTextAlign(Paint.Align.CENTER);
                    paint111117.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint111117);
                    obj3 = paint111117;
                } else {
                    obj3 = objRememberedValue3;
                    Paint paint111118 = new Paint();
                    paint111118.setAntiAlias(true);
                    paint111118.setTextSize(fMo312toPxR2X_6o);
                    paint111118.setColor(iM1672toArgb8_81llA);
                    paint111118.setTextAlign(Paint.Align.CENTER);
                    paint111118.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint111118);
                    obj3 = paint111118;
                }
                obj3 = objRememberedValue3;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint111119 = (Paint) obj3;
                Float fValueOf119 = Float.valueOf(fMo312toPxR2X_6o2);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged4 = composerStartRestartGroup.changed(fValueOf119);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    obj4 = objRememberedValue4;
                    Paint paint2110 = new Paint();
                    paint2110.setAntiAlias(true);
                    paint2110.setTextSize(fMo312toPxR2X_6o2);
                    paint2110.setColor(-1);
                    paint2110.setTextAlign(Paint.Align.LEFT);
                    composerStartRestartGroup.updateRememberedValue(paint2110);
                    obj4 = paint2110;
                } else {
                    obj4 = objRememberedValue4;
                    Paint paint2111 = new Paint();
                    paint2111.setAntiAlias(true);
                    paint2111.setTextSize(fMo312toPxR2X_6o2);
                    paint2111.setColor(-1);
                    paint2111.setTextAlign(Paint.Align.LEFT);
                    composerStartRestartGroup.updateRememberedValue(paint2111);
                    obj4 = paint2111;
                }
                obj4 = objRememberedValue4;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint2112 = (Paint) obj4;
                Float fValueOf1110 = Float.valueOf(fMo312toPxR2X_6o2);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged5 = composerStartRestartGroup.changed(fValueOf1110);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged5) {
                    obj5 = objRememberedValue5;
                    Paint paint2113 = new Paint();
                    paint2113.setAntiAlias(true);
                    paint2113.setTextSize(fMo312toPxR2X_6o2);
                    paint2113.setColor(-1);
                    paint2113.setTextAlign(Paint.Align.LEFT);
                    paint2113.setFakeBoldText(true);
                    composerStartRestartGroup.updateRememberedValue(paint2113);
                    obj5 = paint2113;
                } else {
                    obj5 = objRememberedValue5;
                    Paint paint2114 = new Paint();
                    paint2114.setAntiAlias(true);
                    paint2114.setTextSize(fMo312toPxR2X_6o2);
                    paint2114.setColor(-1);
                    paint2114.setTextAlign(Paint.Align.LEFT);
                    paint2114.setFakeBoldText(true);
                    composerStartRestartGroup.updateRememberedValue(paint2114);
                    obj5 = paint2114;
                }
                obj5 = objRememberedValue5;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint1111110 = (Paint) obj5;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue6 == companion.getEmpty()) {
                    i27 = 2;
                    snapshotMutationPolicy = null;
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j8), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    i27 = 2;
                    snapshotMutationPolicy = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState4 = (MutableState) objRememberedValue6;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i27, snapshotMutationPolicy);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState5 = (MutableState) objRememberedValue7;
                if (chartDrawableData5 != null) {
                    listA = chartDrawableData5.a();
                } else {
                    listA = null;
                }
                if (chartDrawableData6 != null) {
                    listA2 = chartDrawableData6.a();
                } else {
                    listA2 = null;
                }
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged6 = composerStartRestartGroup.changed(listA) | composerStartRestartGroup.changed(listA2);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChanged6) {
                    listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    if (chartDrawableData5 != null) {
                        while (r12.hasNext()) {
                            if (chartXY.getY() != null) {
                                listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                            }
                        }
                        Unit unit19 = Unit.INSTANCE;
                    }
                    if (chartDrawableData6 != null) {
                        while (r12.hasNext()) {
                            if (chartXY2.getY() != null) {
                                listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                            }
                        }
                        Unit unit110 = Unit.INSTANCE;
                    }
                    objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    if (chartDrawableData5 != null) {
                        while (r12.hasNext()) {
                            if (chartXY.getY() != null) {
                                listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                            }
                        }
                        Unit unit111 = Unit.INSTANCE;
                    }
                    if (chartDrawableData6 != null) {
                        while (r12.hasNext()) {
                            if (chartXY2.getY() != null) {
                                listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                            }
                        }
                        Unit unit112 = Unit.INSTANCE;
                    }
                    objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list114 = (List) objRememberedValue8;
                State stateRememberUpdatedState113 = SnapshotStateKt.rememberUpdatedState(list114, composerStartRestartGroup, 8);
                State stateRememberUpdatedState114 = SnapshotStateKt.rememberUpdatedState(mutableState3, composerStartRestartGroup, (i6 >> 27) & 14);
                State stateRememberUpdatedState115 = SnapshotStateKt.rememberUpdatedState(function111119, composerStartRestartGroup, (i7 >> 24) & 14);
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function111118, composerStartRestartGroup, (i7 >> 27) & 14);
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function111117, composerStartRestartGroup, i22 & 14);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState6 = (MutableState) objRememberedValue9;
                float fMo313toPx0680j_1110 = density6.mo313toPx0680j_4(Dp.m4104constructorimpl(fM4104constructorimpl4 + fM4104constructorimpl5));
                float fMo313toPx0680j_1111 = density6.mo313toPx0680j_4(fM4104constructorimpl4);
                float f11118 = fM4104constructorimpl4;
                float fMo313toPx0680j_1112 = density6.mo313toPx0680j_4(Dp.m4104constructorimpl(f4));
                float fMo313toPx0680j_1113 = density6.mo313toPx0680j_4(Dp.m4104constructorimpl(Dp.m4104constructorimpl(f7) - fM4104constructorimpl11));
                if (j2 > 0) {
                    fFloatValue = 0.0f;
                } else {
                    fFloatValue = 0.0f;
                }
                float fFloatValue7 = ((Number) mutableState6.getValue()).floatValue() - density6.mo313toPx0680j_4(fM4104constructorimpl5);
                float fMo313toPx0680j_1114 = density6.mo313toPx0680j_4(Dp.m4104constructorimpl(600));
                if (chartDrawableData5 != null) {
                    pointRadiusDp = chartDrawableData5.getPointRadiusDp();
                } else {
                    pointRadiusDp = 0.0f;
                }
                if (chartDrawableData6 != null) {
                    pointRadiusDp2 = chartDrawableData6.getPointRadiusDp();
                } else {
                    pointRadiusDp2 = 0.0f;
                }
                fMo313toPx0680j_4 = density6.mo313toPx0680j_4(Dp.m4104constructorimpl(Math.max(pointRadiusDp, pointRadiusDp2)));
                float f11119 = 16;
                State stateRememberUpdatedState116 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(Math.max(4 * fMo313toPx0680j_4, density6.mo313toPx0680j_4(Dp.m4104constructorimpl(f11119)))), composerStartRestartGroup, 0);
                if (fFloatValue > 0.0f) {
                    j9 = ((long) (fMo313toPx0680j_4 / fFloatValue)) + 1;
                } else {
                    j9 = 0;
                }
                long j119 = j9;
                jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(minMax.getSecond().longValue() - j2, minMax.getFirst().longValue());
                if (jCoerceAtLeast > minMax.getFirst().longValue()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                float fMax6 = Math.max(viewConfiguration6.getTouchSlop() * 2.0f, density6.mo313toPx0680j_4(Dp.m4104constructorimpl(f11119)));
                if (chartDrawableData5 != null) {
                    pairF = chartDrawableData5.f();
                } else {
                    pairF = null;
                }
                if (chartDrawableData6 != null) {
                    pairF2 = chartDrawableData6.f();
                } else {
                    pairF2 = null;
                }
                Long lValueOf11 = Long.valueOf(j8);
                Long lValueOf12 = Long.valueOf(j2);
                Pair<Float, Float> pair11 = pairF2;
                Pair<Float, Float> pair12 = pairF;
                objArr = new Object[]{Long.valueOf(j8), minMax, Long.valueOf(jCoerceAtLeast), mutableState5, mutableState4};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged7 = false;
                while (i28 < 5) {
                    zChanged7 |= composerStartRestartGroup.changed(objArr[i28]);
                }
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (zChanged7) {
                    objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                } else {
                    objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i418 = ((i7 >> 12) & 14) | 4096;
                int i419 = i7 >> 3;
                EffectsKt.LaunchedEffect(lValueOf11, minMax, lValueOf12, (Function2) objRememberedValue10, composerStartRestartGroup, (i419 & 896) | i418 | (i419 & 112));
                Pair<Long, Long> pairD6 = d(mutableState5);
                objArr2 = new Object[]{mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged8 = false;
                while (i29 < 4) {
                    zChanged8 |= composerStartRestartGroup.changed(objArr2[i29]);
                }
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (zChanged8) {
                    objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                } else {
                    objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(pairD6, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 64);
                Object[] objArr8 = new Object[5];
                if (mutableState3 != null) {
                    value = mutableState3.getValue();
                } else {
                    value = null;
                }
                objArr8[0] = value;
                objArr8[1] = list114;
                objArr8[2] = Long.valueOf(b(mutableState4));
                objArr8[3] = Long.valueOf(j2);
                objArr8[4] = Long.valueOf(j119);
                EffectsKt.LaunchedEffect(objArr8, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$4(mutableState3, list114, j2, j119, mutableState4, stateRememberUpdatedState115, null), composerStartRestartGroup, 72);
                Modifier modifierM455height3ABfNKs6 = SizeKt.m455height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4104constructorimpl(f7));
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged9 = composerStartRestartGroup.changed(mutableState6);
                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (zChanged9) {
                    objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p010kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                            m4625invokeozmzZPI(intSize.m4268unboximpl());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                        public final void m4625invokeozmzZPI(long j1110) {
                            mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j1110)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                } else {
                    objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p010kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                            m4625invokeozmzZPI(intSize.m4268unboximpl());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                        public final void m4625invokeozmzZPI(long j1110) {
                            mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j1110)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierPointerInput6 = SuspendingPointerInputFilterKt.pointerInput(OnRemeasuredModifierKt.onSizeChanged(modifierM455height3ABfNKs6, (Function1) objRememberedValue12), new Object[]{Float.valueOf(fFloatValue), Float.valueOf(fMo313toPx0680j_1111), Float.valueOf(fFloatValue7), Float.valueOf(fMo313toPx0680j_1112), Float.valueOf(fMo313toPx0680j_1113), minMax, Long.valueOf(j2), chartScrollSnapUnit3, view6}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$6(fMo313toPx0680j_1111, fFloatValue7, fMo313toPx0680j_1112, fMo313toPx0680j_1113, view6, viewConfiguration6, fFloatValue, minMax, jCoerceAtLeast, z4, fMax6, fMo313toPx0680j_1114, mutableState5, mutableState4, stateRememberUpdatedState114, stateRememberUpdatedState113, stateRememberUpdatedState116, stateRememberUpdatedState115, stateRememberUpdatedState, chartScrollSnapUnit3, stateRememberUpdatedState2, null));
                MutableState<Integer> mutableState19 = mutableState3;
                Composer composer8 = composerStartRestartGroup;
                CanvasKt.Canvas(modifierPointerInput6, new ChartComposeKt$Chart$7(f11118, f4, fM4104constructorimpl5, fM4104constructorimpl11, j2, pair12, pair11, i26, paint111113, paint111116, z3, chartDrawableData5, chartDrawableData6, list4, paint111119, minMax, j7, list3, mutableState19, list114, markerLabelFormat, paint2112, iM1672toArgb8_81llA, mutableState4, fM4104constructorimpl3, xLabelFormat, paint1111110), composer8, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function10 = function111118;
                function11 = function111119;
                function12 = function111117;
                mutableState7 = mutableState19;
                f10 = f7;
                chartDrawableData7 = chartDrawableData5;
                chartDrawableData8 = chartDrawableData6;
                list5 = list3;
                list6 = list4;
                i30 = i26;
                f11 = f8;
                f12 = f9;
                z5 = z3;
                j10 = j8;
                chartScrollSnapUnit4 = chartScrollSnapUnit3;
                j11 = j7;
                f13 = fM4104constructorimpl3;
                composer2 = composer8;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i32 != 0) {
                        f6 = 279.0f;
                    } else {
                        f6 = f;
                    }
                    if (i33 != 0) {
                        chartDrawableData3 = null;
                    } else {
                        chartDrawableData3 = chartDrawableData;
                    }
                    if (i34 != 0) {
                        chartDrawableData4 = null;
                    } else {
                        chartDrawableData4 = chartDrawableData2;
                    }
                    if (i35 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i36 != 0) {
                        listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList2 = list2;
                    }
                    if (i37 != 0) {
                        i25 = 2;
                    } else {
                        i25 = i;
                    }
                    f7 = f6;
                    if (i38 != 0) {
                        fM4104constructorimpl = Dp.m4104constructorimpl(22);
                    } else {
                        fM4104constructorimpl = f2;
                    }
                    if (i39 != 0) {
                        fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                    } else {
                        fM4104constructorimpl2 = f3;
                    }
                    if (i40 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (i41 != 0) {
                        mutableState2 = null;
                    } else {
                        mutableState2 = mutableState;
                    }
                    f8 = fM4104constructorimpl;
                    if ((i5 & 16384) != 0) {
                        jLongValue = minMax.getFirst().longValue();
                        i7 &= -57345;
                    } else {
                        jLongValue = j3;
                    }
                    if (i12 != 0) {
                        chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                    }
                    if (i14 != 0) {
                        j6 = 43200000;
                    } else {
                        j6 = j5;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    } else {
                        function4 = function1;
                    }
                    if (i19 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i21 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    Function1<? super Integer, Unit> function1111110 = function4;
                    f9 = fM4104constructorimpl2;
                    if (i24 != 0) {
                        fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                    } else {
                        fM4104constructorimpl3 = f5;
                    }
                    chartDrawableData5 = chartDrawableData3;
                    chartDrawableData6 = chartDrawableData4;
                    list3 = listEmptyList;
                    list4 = listEmptyList2;
                    z3 = z2;
                    chartScrollSnapUnit3 = chartScrollSnapUnit2;
                    j7 = j6;
                    function7 = function6;
                    i26 = i25;
                    mutableState3 = mutableState2;
                    j8 = jLongValue;
                    function8 = function1111110;
                    function9 = function5;
                } else {
                    if (i32 != 0) {
                        f6 = 279.0f;
                    } else {
                        f6 = f;
                    }
                    if (i33 != 0) {
                        chartDrawableData3 = null;
                    } else {
                        chartDrawableData3 = chartDrawableData;
                    }
                    if (i34 != 0) {
                        chartDrawableData4 = null;
                    } else {
                        chartDrawableData4 = chartDrawableData2;
                    }
                    if (i35 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i36 != 0) {
                        listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList2 = list2;
                    }
                    if (i37 != 0) {
                        i25 = 2;
                    } else {
                        i25 = i;
                    }
                    f7 = f6;
                    if (i38 != 0) {
                        fM4104constructorimpl = Dp.m4104constructorimpl(22);
                    } else {
                        fM4104constructorimpl = f2;
                    }
                    if (i39 != 0) {
                        fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                    } else {
                        fM4104constructorimpl2 = f3;
                    }
                    if (i40 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (i41 != 0) {
                        mutableState2 = null;
                    } else {
                        mutableState2 = mutableState;
                    }
                    f8 = fM4104constructorimpl;
                    if ((i5 & 16384) != 0) {
                        jLongValue = minMax.getFirst().longValue();
                        i7 &= -57345;
                    } else {
                        jLongValue = j3;
                    }
                    if (i12 != 0) {
                        chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                    }
                    if (i14 != 0) {
                        j6 = 43200000;
                    } else {
                        j6 = j5;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    } else {
                        function4 = function1;
                    }
                    if (i19 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i21 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    Function1<? super Integer, Unit> function1111111 = function4;
                    f9 = fM4104constructorimpl2;
                    if (i24 != 0) {
                        fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                    } else {
                        fM4104constructorimpl3 = f5;
                    }
                    chartDrawableData5 = chartDrawableData3;
                    chartDrawableData6 = chartDrawableData4;
                    list3 = listEmptyList;
                    list4 = listEmptyList2;
                    z3 = z2;
                    chartScrollSnapUnit3 = chartScrollSnapUnit2;
                    j7 = j6;
                    function7 = function6;
                    i26 = i25;
                    mutableState3 = mutableState2;
                    j8 = jLongValue;
                    function8 = function1111111;
                    function9 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-920059604, i6, i7, "com.heytap.health.bodyfat.ui.Chart (ChartCompose.kt:138)");
                }
                if (minMax.getFirst().longValue() == minMax.getSecond().longValue()) {
                    m8b.b("Chart", "min == max; return!");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final float f111110 = f7;
                    final ChartDrawableData chartDrawableData111 = chartDrawableData5;
                    final ChartDrawableData chartDrawableData112 = chartDrawableData6;
                    final List<ChartDrawableData> list115 = list3;
                    final List<ChartDrawableData> list116 = list4;
                    final int i4110 = i26;
                    final float f111111 = f8;
                    final float f111112 = f9;
                    final boolean z12 = z3;
                    final MutableState<Integer> mutableState110 = mutableState3;
                    final Function2<? super Long, ? super ChartScrollDirection, Long> function1111112 = function7;
                    final Function1<? super Long, Unit> function1111113 = function9;
                    final Function1<? super Integer, Unit> function1111114 = function8;
                    final long j1110 = j8;
                    final ChartScrollSnapUnit chartScrollSnapUnit11 = chartScrollSnapUnit3;
                    final long j1111 = j7;
                    final float f111113 = fM4104constructorimpl3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // p010kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer9, Integer num) {
                            invoke(composer9, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer9, int i4111) {
                            ChartComposeKt.a(f111110, chartDrawableData111, chartDrawableData112, list115, list116, i4110, f111111, f111112, z12, mutableState110, markerLabelFormat, f4, minMax, j2, j1110, chartScrollSnapUnit11, j1111, xLabelFormat, function1111114, function1111113, function1111112, f111113, composer9, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                        }
                    });
                    return;
                }
                Function2<? super Long, ? super ChartScrollDirection, Long> function1111115 = function7;
                Function1<? super Long, Unit> function1111116 = function9;
                Function1<? super Integer, Unit> function1111117 = function8;
                if (chartDrawableData5 == null) {
                    fM4104constructorimpl4 = Dp.m4104constructorimpl(0);
                } else {
                    fM4104constructorimpl4 = f8;
                }
                if (chartDrawableData6 == null) {
                    fM4104constructorimpl5 = Dp.m4104constructorimpl(0);
                } else {
                    fM4104constructorimpl5 = f9;
                }
                float fM4104constructorimpl12 = Dp.m4104constructorimpl(22);
                Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                View view7 = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                ViewConfiguration viewConfiguration7 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                iM1672toArgb8_81llA = ColorKt.m1672toArgb8_81llA(ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha55, composerStartRestartGroup, 0));
                fMo312toPxR2X_6o = density7.mo312toPxR2X_6o(TextUnitKt.getSp(10));
                fMo312toPxR2X_6o2 = density7.mo312toPxR2X_6o(TextUnitKt.getSp(12));
                Float fValueOf1111 = Float.valueOf(fMo312toPxR2X_6o);
                Integer numValueOf19 = Integer.valueOf(iM1672toArgb8_81llA);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(fValueOf1111) | composerStartRestartGroup.changed(numValueOf19);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    obj = objRememberedValue;
                    Paint paint1111111 = new Paint();
                    paint1111111.setAntiAlias(true);
                    paint1111111.setTextSize(fMo312toPxR2X_6o);
                    paint1111111.setColor(iM1672toArgb8_81llA);
                    paint1111111.setTextAlign(Paint.Align.RIGHT);
                    paint1111111.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint1111111);
                    obj = paint1111111;
                } else {
                    obj = objRememberedValue;
                    Paint paint1111112 = new Paint();
                    paint1111112.setAntiAlias(true);
                    paint1111112.setTextSize(fMo312toPxR2X_6o);
                    paint1111112.setColor(iM1672toArgb8_81llA);
                    paint1111112.setTextAlign(Paint.Align.RIGHT);
                    paint1111112.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint1111112);
                    obj = paint1111112;
                }
                obj = objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint1111113 = (Paint) obj;
                Float fValueOf1112 = Float.valueOf(fMo312toPxR2X_6o);
                Integer numValueOf110 = Integer.valueOf(iM1672toArgb8_81llA);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(fValueOf1112) | composerStartRestartGroup.changed(numValueOf110);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    obj2 = objRememberedValue2;
                    Paint paint1111114 = new Paint();
                    paint1111114.setAntiAlias(true);
                    paint1111114.setTextSize(fMo312toPxR2X_6o);
                    paint1111114.setColor(iM1672toArgb8_81llA);
                    paint1111114.setTextAlign(Paint.Align.RIGHT);
                    paint1111114.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint1111114);
                    obj2 = paint1111114;
                } else {
                    obj2 = objRememberedValue2;
                    Paint paint1111115 = new Paint();
                    paint1111115.setAntiAlias(true);
                    paint1111115.setTextSize(fMo312toPxR2X_6o);
                    paint1111115.setColor(iM1672toArgb8_81llA);
                    paint1111115.setTextAlign(Paint.Align.RIGHT);
                    paint1111115.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint1111115);
                    obj2 = paint1111115;
                }
                obj2 = objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint1111116 = (Paint) obj2;
                Float fValueOf1113 = Float.valueOf(fMo312toPxR2X_6o);
                Integer numValueOf111 = Integer.valueOf(iM1672toArgb8_81llA);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(fValueOf1113) | composerStartRestartGroup.changed(numValueOf111);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    obj3 = objRememberedValue3;
                    Paint paint1111117 = new Paint();
                    paint1111117.setAntiAlias(true);
                    paint1111117.setTextSize(fMo312toPxR2X_6o);
                    paint1111117.setColor(iM1672toArgb8_81llA);
                    paint1111117.setTextAlign(Paint.Align.CENTER);
                    paint1111117.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint1111117);
                    obj3 = paint1111117;
                } else {
                    obj3 = objRememberedValue3;
                    Paint paint1111118 = new Paint();
                    paint1111118.setAntiAlias(true);
                    paint1111118.setTextSize(fMo312toPxR2X_6o);
                    paint1111118.setColor(iM1672toArgb8_81llA);
                    paint1111118.setTextAlign(Paint.Align.CENTER);
                    paint1111118.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint1111118);
                    obj3 = paint1111118;
                }
                obj3 = objRememberedValue3;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint1111119 = (Paint) obj3;
                Float fValueOf1114 = Float.valueOf(fMo312toPxR2X_6o2);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged4 = composerStartRestartGroup.changed(fValueOf1114);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    obj4 = objRememberedValue4;
                    Paint paint2115 = new Paint();
                    paint2115.setAntiAlias(true);
                    paint2115.setTextSize(fMo312toPxR2X_6o2);
                    paint2115.setColor(-1);
                    paint2115.setTextAlign(Paint.Align.LEFT);
                    composerStartRestartGroup.updateRememberedValue(paint2115);
                    obj4 = paint2115;
                } else {
                    obj4 = objRememberedValue4;
                    Paint paint2116 = new Paint();
                    paint2116.setAntiAlias(true);
                    paint2116.setTextSize(fMo312toPxR2X_6o2);
                    paint2116.setColor(-1);
                    paint2116.setTextAlign(Paint.Align.LEFT);
                    composerStartRestartGroup.updateRememberedValue(paint2116);
                    obj4 = paint2116;
                }
                obj4 = objRememberedValue4;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint2117 = (Paint) obj4;
                Float fValueOf1115 = Float.valueOf(fMo312toPxR2X_6o2);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged5 = composerStartRestartGroup.changed(fValueOf1115);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged5) {
                    obj5 = objRememberedValue5;
                    Paint paint2118 = new Paint();
                    paint2118.setAntiAlias(true);
                    paint2118.setTextSize(fMo312toPxR2X_6o2);
                    paint2118.setColor(-1);
                    paint2118.setTextAlign(Paint.Align.LEFT);
                    paint2118.setFakeBoldText(true);
                    composerStartRestartGroup.updateRememberedValue(paint2118);
                    obj5 = paint2118;
                } else {
                    obj5 = objRememberedValue5;
                    Paint paint2119 = new Paint();
                    paint2119.setAntiAlias(true);
                    paint2119.setTextSize(fMo312toPxR2X_6o2);
                    paint2119.setColor(-1);
                    paint2119.setTextAlign(Paint.Align.LEFT);
                    paint2119.setFakeBoldText(true);
                    composerStartRestartGroup.updateRememberedValue(paint2119);
                    obj5 = paint2119;
                }
                obj5 = objRememberedValue5;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint11111110 = (Paint) obj5;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue6 == companion.getEmpty()) {
                    i27 = 2;
                    snapshotMutationPolicy = null;
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j8), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    i27 = 2;
                    snapshotMutationPolicy = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState4 = (MutableState) objRememberedValue6;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i27, snapshotMutationPolicy);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState5 = (MutableState) objRememberedValue7;
                if (chartDrawableData5 != null) {
                    listA = chartDrawableData5.a();
                } else {
                    listA = null;
                }
                if (chartDrawableData6 != null) {
                    listA2 = chartDrawableData6.a();
                } else {
                    listA2 = null;
                }
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged6 = composerStartRestartGroup.changed(listA) | composerStartRestartGroup.changed(listA2);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChanged6) {
                    listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    if (chartDrawableData5 != null) {
                        while (r12.hasNext()) {
                            if (chartXY.getY() != null) {
                                listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                            }
                        }
                        Unit unit113 = Unit.INSTANCE;
                    }
                    if (chartDrawableData6 != null) {
                        while (r12.hasNext()) {
                            if (chartXY2.getY() != null) {
                                listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                            }
                        }
                        Unit unit114 = Unit.INSTANCE;
                    }
                    objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    if (chartDrawableData5 != null) {
                        while (r12.hasNext()) {
                            if (chartXY.getY() != null) {
                                listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                            }
                        }
                        Unit unit115 = Unit.INSTANCE;
                    }
                    if (chartDrawableData6 != null) {
                        while (r12.hasNext()) {
                            if (chartXY2.getY() != null) {
                                listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                            }
                        }
                        Unit unit116 = Unit.INSTANCE;
                    }
                    objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list117 = (List) objRememberedValue8;
                State stateRememberUpdatedState117 = SnapshotStateKt.rememberUpdatedState(list117, composerStartRestartGroup, 8);
                State stateRememberUpdatedState118 = SnapshotStateKt.rememberUpdatedState(mutableState3, composerStartRestartGroup, (i6 >> 27) & 14);
                State stateRememberUpdatedState119 = SnapshotStateKt.rememberUpdatedState(function1111117, composerStartRestartGroup, (i7 >> 24) & 14);
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1111116, composerStartRestartGroup, (i7 >> 27) & 14);
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function1111115, composerStartRestartGroup, i22 & 14);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState6 = (MutableState) objRememberedValue9;
                float fMo313toPx0680j_1115 = density7.mo313toPx0680j_4(Dp.m4104constructorimpl(fM4104constructorimpl4 + fM4104constructorimpl5));
                float fMo313toPx0680j_1116 = density7.mo313toPx0680j_4(fM4104constructorimpl4);
                float f111114 = fM4104constructorimpl4;
                float fMo313toPx0680j_1117 = density7.mo313toPx0680j_4(Dp.m4104constructorimpl(f4));
                float fMo313toPx0680j_1118 = density7.mo313toPx0680j_4(Dp.m4104constructorimpl(Dp.m4104constructorimpl(f7) - fM4104constructorimpl12));
                if (j2 > 0) {
                    fFloatValue = 0.0f;
                } else {
                    fFloatValue = 0.0f;
                }
                float fFloatValue8 = ((Number) mutableState6.getValue()).floatValue() - density7.mo313toPx0680j_4(fM4104constructorimpl5);
                float fMo313toPx0680j_1119 = density7.mo313toPx0680j_4(Dp.m4104constructorimpl(600));
                if (chartDrawableData5 != null) {
                    pointRadiusDp = chartDrawableData5.getPointRadiusDp();
                } else {
                    pointRadiusDp = 0.0f;
                }
                if (chartDrawableData6 != null) {
                    pointRadiusDp2 = chartDrawableData6.getPointRadiusDp();
                } else {
                    pointRadiusDp2 = 0.0f;
                }
                fMo313toPx0680j_4 = density7.mo313toPx0680j_4(Dp.m4104constructorimpl(Math.max(pointRadiusDp, pointRadiusDp2)));
                float f111115 = 16;
                State stateRememberUpdatedState1110 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(Math.max(4 * fMo313toPx0680j_4, density7.mo313toPx0680j_4(Dp.m4104constructorimpl(f111115)))), composerStartRestartGroup, 0);
                if (fFloatValue > 0.0f) {
                    j9 = ((long) (fMo313toPx0680j_4 / fFloatValue)) + 1;
                } else {
                    j9 = 0;
                }
                long j1112 = j9;
                jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(minMax.getSecond().longValue() - j2, minMax.getFirst().longValue());
                if (jCoerceAtLeast > minMax.getFirst().longValue()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                float fMax7 = Math.max(viewConfiguration7.getTouchSlop() * 2.0f, density7.mo313toPx0680j_4(Dp.m4104constructorimpl(f111115)));
                if (chartDrawableData5 != null) {
                    pairF = chartDrawableData5.f();
                } else {
                    pairF = null;
                }
                if (chartDrawableData6 != null) {
                    pairF2 = chartDrawableData6.f();
                } else {
                    pairF2 = null;
                }
                Long lValueOf13 = Long.valueOf(j8);
                Long lValueOf14 = Long.valueOf(j2);
                Pair<Float, Float> pair13 = pairF2;
                Pair<Float, Float> pair14 = pairF;
                objArr = new Object[]{Long.valueOf(j8), minMax, Long.valueOf(jCoerceAtLeast), mutableState5, mutableState4};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged7 = false;
                while (i28 < 5) {
                    zChanged7 |= composerStartRestartGroup.changed(objArr[i28]);
                }
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (zChanged7) {
                    objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                } else {
                    objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i4111 = ((i7 >> 12) & 14) | 4096;
                int i4112 = i7 >> 3;
                EffectsKt.LaunchedEffect(lValueOf13, minMax, lValueOf14, (Function2) objRememberedValue10, composerStartRestartGroup, (i4112 & 896) | i4111 | (i4112 & 112));
                Pair<Long, Long> pairD7 = d(mutableState5);
                objArr2 = new Object[]{mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged8 = false;
                while (i29 < 4) {
                    zChanged8 |= composerStartRestartGroup.changed(objArr2[i29]);
                }
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (zChanged8) {
                    objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                } else {
                    objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(pairD7, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 64);
                Object[] objArr9 = new Object[5];
                if (mutableState3 != null) {
                    value = mutableState3.getValue();
                } else {
                    value = null;
                }
                objArr9[0] = value;
                objArr9[1] = list117;
                objArr9[2] = Long.valueOf(b(mutableState4));
                objArr9[3] = Long.valueOf(j2);
                objArr9[4] = Long.valueOf(j1112);
                EffectsKt.LaunchedEffect(objArr9, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$4(mutableState3, list117, j2, j1112, mutableState4, stateRememberUpdatedState119, null), composerStartRestartGroup, 72);
                Modifier modifierM455height3ABfNKs7 = SizeKt.m455height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4104constructorimpl(f7));
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged9 = composerStartRestartGroup.changed(mutableState6);
                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (zChanged9) {
                    objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p010kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                            m4625invokeozmzZPI(intSize.m4268unboximpl());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                        public final void m4625invokeozmzZPI(long j1113) {
                            mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j1113)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                } else {
                    objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p010kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                            m4625invokeozmzZPI(intSize.m4268unboximpl());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                        public final void m4625invokeozmzZPI(long j1113) {
                            mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j1113)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierPointerInput7 = SuspendingPointerInputFilterKt.pointerInput(OnRemeasuredModifierKt.onSizeChanged(modifierM455height3ABfNKs7, (Function1) objRememberedValue12), new Object[]{Float.valueOf(fFloatValue), Float.valueOf(fMo313toPx0680j_1116), Float.valueOf(fFloatValue8), Float.valueOf(fMo313toPx0680j_1117), Float.valueOf(fMo313toPx0680j_1118), minMax, Long.valueOf(j2), chartScrollSnapUnit3, view7}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$6(fMo313toPx0680j_1116, fFloatValue8, fMo313toPx0680j_1117, fMo313toPx0680j_1118, view7, viewConfiguration7, fFloatValue, minMax, jCoerceAtLeast, z4, fMax7, fMo313toPx0680j_1119, mutableState5, mutableState4, stateRememberUpdatedState118, stateRememberUpdatedState117, stateRememberUpdatedState1110, stateRememberUpdatedState119, stateRememberUpdatedState, chartScrollSnapUnit3, stateRememberUpdatedState2, null));
                MutableState<Integer> mutableState111 = mutableState3;
                Composer composer9 = composerStartRestartGroup;
                CanvasKt.Canvas(modifierPointerInput7, new ChartComposeKt$Chart$7(f111114, f4, fM4104constructorimpl5, fM4104constructorimpl12, j2, pair14, pair13, i26, paint1111113, paint1111116, z3, chartDrawableData5, chartDrawableData6, list4, paint1111119, minMax, j7, list3, mutableState111, list117, markerLabelFormat, paint2117, iM1672toArgb8_81llA, mutableState4, fM4104constructorimpl3, xLabelFormat, paint11111110), composer9, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function10 = function1111116;
                function11 = function1111117;
                function12 = function1111115;
                mutableState7 = mutableState111;
                f10 = f7;
                chartDrawableData7 = chartDrawableData5;
                chartDrawableData8 = chartDrawableData6;
                list5 = list3;
                list6 = list4;
                i30 = i26;
                f11 = f8;
                f12 = f9;
                z5 = z3;
                j10 = j8;
                chartScrollSnapUnit4 = chartScrollSnapUnit3;
                j11 = j7;
                f13 = fM4104constructorimpl3;
                composer2 = composer9;
            }
            scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer10, Integer num) {
                    invoke(composer10, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer10, int i4113) {
                    ChartComposeKt.a(f10, chartDrawableData7, chartDrawableData8, list5, list6, i30, f11, f12, z5, mutableState7, markerLabelFormat, f4, minMax, j2, j10, chartScrollSnapUnit4, j11, xLabelFormat, function11, function10, function12, f13, composer10, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                }
            });
        }
        i6 |= 805306368;
        if ((i5 & 1024) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            if (composerStartRestartGroup.changedInstance(markerLabelFormat)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i3;
        } else {
            i7 = i3;
        }
        if ((i5 & 2048) != 0) {
            if ((i3 & 112) == 0) {
                if (composerStartRestartGroup.changed(f4)) {
                    i9 = 32;
                } else {
                    i9 = 16;
                }
                i7 |= i9;
            }
            if ((i5 & 4096) != 0) {
                i7 |= ModuleType.TYPE_SYSTEM_SETTING;
            } else if ((i3 & 896) == 0) {
                if (composerStartRestartGroup.changed(minMax)) {
                    i10 = 256;
                } else {
                    i10 = 128;
                }
                i7 |= i10;
            }
            if ((i5 & 8192) != 0) {
                i7 |= 3072;
            } else if ((i3 & 7168) == 0) {
                if (composerStartRestartGroup.changed(j2)) {
                    i11 = 2048;
                } else {
                    i11 = 1024;
                }
                i7 |= i11;
            }
            if ((57344 & i3) != 0) {
                if ((i5 & 16384) == 0) {
                    i31 = 8192;
                } else {
                    i31 = 8192;
                }
                i7 |= i31;
            }
            i12 = 32768 & i5;
            if (i12 != 0) {
                i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                chartScrollSnapUnit2 = chartScrollSnapUnit;
            } else {
                chartScrollSnapUnit2 = chartScrollSnapUnit;
                if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(chartScrollSnapUnit2)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i7 |= i13;
                }
            }
            i14 = i5 & 65536;
            if (i14 != 0) {
                i7 |= 1572864;
                j5 = j4;
            } else {
                j5 = j4;
                if ((i3 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(j5)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i7 |= i15;
                }
            }
            if ((i5 & 131072) != 0) {
                if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(xLabelFormat)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                }
                i17 = i5 & 262144;
                if (i17 != 0) {
                    i7 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i7 |= i18;
                }
                i19 = i5 & 524288;
                if (i19 != 0) {
                    i7 |= 805306368;
                } else if ((i3 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i7 |= i20;
                }
                i21 = i5 & 1048576;
                if (i21 != 0) {
                    i22 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i4 | i23;
                } else {
                    i22 = i4;
                }
                i24 = i5 & 2097152;
                if (i24 != 0) {
                    i22 |= 48;
                } else if ((i4 & 112) == 0) {
                    i22 |= composerStartRestartGroup.changed(f5) ? 32 : 16;
                }
                if ((i5 & 30) != 30) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i32 != 0) {
                            f6 = 279.0f;
                        } else {
                            f6 = f;
                        }
                        if (i33 != 0) {
                            chartDrawableData3 = null;
                        } else {
                            chartDrawableData3 = chartDrawableData;
                        }
                        if (i34 != 0) {
                            chartDrawableData4 = null;
                        } else {
                            chartDrawableData4 = chartDrawableData2;
                        }
                        if (i35 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if (i36 != 0) {
                            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList2 = list2;
                        }
                        if (i37 != 0) {
                            i25 = 2;
                        } else {
                            i25 = i;
                        }
                        f7 = f6;
                        if (i38 != 0) {
                            fM4104constructorimpl = Dp.m4104constructorimpl(22);
                        } else {
                            fM4104constructorimpl = f2;
                        }
                        if (i39 != 0) {
                            fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                        } else {
                            fM4104constructorimpl2 = f3;
                        }
                        if (i40 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if (i41 != 0) {
                            mutableState2 = null;
                        } else {
                            mutableState2 = mutableState;
                        }
                        f8 = fM4104constructorimpl;
                        if ((i5 & 16384) != 0) {
                            jLongValue = minMax.getFirst().longValue();
                            i7 &= -57345;
                        } else {
                            jLongValue = j3;
                        }
                        if (i12 != 0) {
                            chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                        }
                        if (i14 != 0) {
                            j6 = 43200000;
                        } else {
                            j6 = j5;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        } else {
                            function4 = function1;
                        }
                        if (i19 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i21 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        Function1<? super Integer, Unit> function1111118 = function4;
                        f9 = fM4104constructorimpl2;
                        if (i24 != 0) {
                            fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                        } else {
                            fM4104constructorimpl3 = f5;
                        }
                        chartDrawableData5 = chartDrawableData3;
                        chartDrawableData6 = chartDrawableData4;
                        list3 = listEmptyList;
                        list4 = listEmptyList2;
                        z3 = z2;
                        chartScrollSnapUnit3 = chartScrollSnapUnit2;
                        j7 = j6;
                        function7 = function6;
                        i26 = i25;
                        mutableState3 = mutableState2;
                        j8 = jLongValue;
                        function8 = function1111118;
                        function9 = function5;
                    } else {
                        if (i32 != 0) {
                            f6 = 279.0f;
                        } else {
                            f6 = f;
                        }
                        if (i33 != 0) {
                            chartDrawableData3 = null;
                        } else {
                            chartDrawableData3 = chartDrawableData;
                        }
                        if (i34 != 0) {
                            chartDrawableData4 = null;
                        } else {
                            chartDrawableData4 = chartDrawableData2;
                        }
                        if (i35 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if (i36 != 0) {
                            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList2 = list2;
                        }
                        if (i37 != 0) {
                            i25 = 2;
                        } else {
                            i25 = i;
                        }
                        f7 = f6;
                        if (i38 != 0) {
                            fM4104constructorimpl = Dp.m4104constructorimpl(22);
                        } else {
                            fM4104constructorimpl = f2;
                        }
                        if (i39 != 0) {
                            fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                        } else {
                            fM4104constructorimpl2 = f3;
                        }
                        if (i40 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if (i41 != 0) {
                            mutableState2 = null;
                        } else {
                            mutableState2 = mutableState;
                        }
                        f8 = fM4104constructorimpl;
                        if ((i5 & 16384) != 0) {
                            jLongValue = minMax.getFirst().longValue();
                            i7 &= -57345;
                        } else {
                            jLongValue = j3;
                        }
                        if (i12 != 0) {
                            chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                        }
                        if (i14 != 0) {
                            j6 = 43200000;
                        } else {
                            j6 = j5;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        } else {
                            function4 = function1;
                        }
                        if (i19 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i21 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        Function1<? super Integer, Unit> function1111119 = function4;
                        f9 = fM4104constructorimpl2;
                        if (i24 != 0) {
                            fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                        } else {
                            fM4104constructorimpl3 = f5;
                        }
                        chartDrawableData5 = chartDrawableData3;
                        chartDrawableData6 = chartDrawableData4;
                        list3 = listEmptyList;
                        list4 = listEmptyList2;
                        z3 = z2;
                        chartScrollSnapUnit3 = chartScrollSnapUnit2;
                        j7 = j6;
                        function7 = function6;
                        i26 = i25;
                        mutableState3 = mutableState2;
                        j8 = jLongValue;
                        function8 = function1111119;
                        function9 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-920059604, i6, i7, "com.heytap.health.bodyfat.ui.Chart (ChartCompose.kt:138)");
                    }
                    if (minMax.getFirst().longValue() == minMax.getSecond().longValue()) {
                        m8b.b("Chart", "min == max; return!");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final float f111116 = f7;
                        final ChartDrawableData chartDrawableData113 = chartDrawableData5;
                        final ChartDrawableData chartDrawableData114 = chartDrawableData6;
                        final List<ChartDrawableData> list118 = list3;
                        final List<ChartDrawableData> list119 = list4;
                        final int i4113 = i26;
                        final float f111117 = f8;
                        final float f111118 = f9;
                        final boolean z13 = z3;
                        final MutableState<Integer> mutableState112 = mutableState3;
                        final Function2<? super Long, ? super ChartScrollDirection, Long> function11111110 = function7;
                        final Function1<? super Long, Unit> function11111111 = function9;
                        final Function1<? super Integer, Unit> function11111112 = function8;
                        final long j1113 = j8;
                        final ChartScrollSnapUnit chartScrollSnapUnit12 = chartScrollSnapUnit3;
                        final long j1114 = j7;
                        final float f111119 = fM4104constructorimpl3;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer10, Integer num) {
                                invoke(composer10, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer10, int i4114) {
                                ChartComposeKt.a(f111116, chartDrawableData113, chartDrawableData114, list118, list119, i4113, f111117, f111118, z13, mutableState112, markerLabelFormat, f4, minMax, j2, j1113, chartScrollSnapUnit12, j1114, xLabelFormat, function11111112, function11111111, function11111110, f111119, composer10, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                            }
                        });
                        return;
                    }
                    Function2<? super Long, ? super ChartScrollDirection, Long> function11111113 = function7;
                    Function1<? super Long, Unit> function11111114 = function9;
                    Function1<? super Integer, Unit> function11111115 = function8;
                    if (chartDrawableData5 == null) {
                        fM4104constructorimpl4 = Dp.m4104constructorimpl(0);
                    } else {
                        fM4104constructorimpl4 = f8;
                    }
                    if (chartDrawableData6 == null) {
                        fM4104constructorimpl5 = Dp.m4104constructorimpl(0);
                    } else {
                        fM4104constructorimpl5 = f9;
                    }
                    float fM4104constructorimpl13 = Dp.m4104constructorimpl(22);
                    Density density8 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    View view8 = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                    ViewConfiguration viewConfiguration8 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    iM1672toArgb8_81llA = ColorKt.m1672toArgb8_81llA(ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha55, composerStartRestartGroup, 0));
                    fMo312toPxR2X_6o = density8.mo312toPxR2X_6o(TextUnitKt.getSp(10));
                    fMo312toPxR2X_6o2 = density8.mo312toPxR2X_6o(TextUnitKt.getSp(12));
                    Float fValueOf1116 = Float.valueOf(fMo312toPxR2X_6o);
                    Integer numValueOf112 = Integer.valueOf(iM1672toArgb8_81llA);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(fValueOf1116) | composerStartRestartGroup.changed(numValueOf112);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        obj = objRememberedValue;
                        Paint paint11111111 = new Paint();
                        paint11111111.setAntiAlias(true);
                        paint11111111.setTextSize(fMo312toPxR2X_6o);
                        paint11111111.setColor(iM1672toArgb8_81llA);
                        paint11111111.setTextAlign(Paint.Align.RIGHT);
                        paint11111111.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint11111111);
                        obj = paint11111111;
                    } else {
                        obj = objRememberedValue;
                        Paint paint11111112 = new Paint();
                        paint11111112.setAntiAlias(true);
                        paint11111112.setTextSize(fMo312toPxR2X_6o);
                        paint11111112.setColor(iM1672toArgb8_81llA);
                        paint11111112.setTextAlign(Paint.Align.RIGHT);
                        paint11111112.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint11111112);
                        obj = paint11111112;
                    }
                    obj = objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint11111113 = (Paint) obj;
                    Float fValueOf1117 = Float.valueOf(fMo312toPxR2X_6o);
                    Integer numValueOf113 = Integer.valueOf(iM1672toArgb8_81llA);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(fValueOf1117) | composerStartRestartGroup.changed(numValueOf113);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        obj2 = objRememberedValue2;
                        Paint paint11111114 = new Paint();
                        paint11111114.setAntiAlias(true);
                        paint11111114.setTextSize(fMo312toPxR2X_6o);
                        paint11111114.setColor(iM1672toArgb8_81llA);
                        paint11111114.setTextAlign(Paint.Align.RIGHT);
                        paint11111114.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint11111114);
                        obj2 = paint11111114;
                    } else {
                        obj2 = objRememberedValue2;
                        Paint paint11111115 = new Paint();
                        paint11111115.setAntiAlias(true);
                        paint11111115.setTextSize(fMo312toPxR2X_6o);
                        paint11111115.setColor(iM1672toArgb8_81llA);
                        paint11111115.setTextAlign(Paint.Align.RIGHT);
                        paint11111115.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint11111115);
                        obj2 = paint11111115;
                    }
                    obj2 = objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint11111116 = (Paint) obj2;
                    Float fValueOf1118 = Float.valueOf(fMo312toPxR2X_6o);
                    Integer numValueOf114 = Integer.valueOf(iM1672toArgb8_81llA);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(fValueOf1118) | composerStartRestartGroup.changed(numValueOf114);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        obj3 = objRememberedValue3;
                        Paint paint11111117 = new Paint();
                        paint11111117.setAntiAlias(true);
                        paint11111117.setTextSize(fMo312toPxR2X_6o);
                        paint11111117.setColor(iM1672toArgb8_81llA);
                        paint11111117.setTextAlign(Paint.Align.CENTER);
                        paint11111117.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint11111117);
                        obj3 = paint11111117;
                    } else {
                        obj3 = objRememberedValue3;
                        Paint paint11111118 = new Paint();
                        paint11111118.setAntiAlias(true);
                        paint11111118.setTextSize(fMo312toPxR2X_6o);
                        paint11111118.setColor(iM1672toArgb8_81llA);
                        paint11111118.setTextAlign(Paint.Align.CENTER);
                        paint11111118.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint11111118);
                        obj3 = paint11111118;
                    }
                    obj3 = objRememberedValue3;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint11111119 = (Paint) obj3;
                    Float fValueOf1119 = Float.valueOf(fMo312toPxR2X_6o2);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged4 = composerStartRestartGroup.changed(fValueOf1119);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4) {
                        obj4 = objRememberedValue4;
                        Paint paint21110 = new Paint();
                        paint21110.setAntiAlias(true);
                        paint21110.setTextSize(fMo312toPxR2X_6o2);
                        paint21110.setColor(-1);
                        paint21110.setTextAlign(Paint.Align.LEFT);
                        composerStartRestartGroup.updateRememberedValue(paint21110);
                        obj4 = paint21110;
                    } else {
                        obj4 = objRememberedValue4;
                        Paint paint21111 = new Paint();
                        paint21111.setAntiAlias(true);
                        paint21111.setTextSize(fMo312toPxR2X_6o2);
                        paint21111.setColor(-1);
                        paint21111.setTextAlign(Paint.Align.LEFT);
                        composerStartRestartGroup.updateRememberedValue(paint21111);
                        obj4 = paint21111;
                    }
                    obj4 = objRememberedValue4;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint21112 = (Paint) obj4;
                    Float fValueOf11110 = Float.valueOf(fMo312toPxR2X_6o2);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged5 = composerStartRestartGroup.changed(fValueOf11110);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged5) {
                        obj5 = objRememberedValue5;
                        Paint paint21113 = new Paint();
                        paint21113.setAntiAlias(true);
                        paint21113.setTextSize(fMo312toPxR2X_6o2);
                        paint21113.setColor(-1);
                        paint21113.setTextAlign(Paint.Align.LEFT);
                        paint21113.setFakeBoldText(true);
                        composerStartRestartGroup.updateRememberedValue(paint21113);
                        obj5 = paint21113;
                    } else {
                        obj5 = objRememberedValue5;
                        Paint paint21114 = new Paint();
                        paint21114.setAntiAlias(true);
                        paint21114.setTextSize(fMo312toPxR2X_6o2);
                        paint21114.setColor(-1);
                        paint21114.setTextAlign(Paint.Align.LEFT);
                        paint21114.setFakeBoldText(true);
                        composerStartRestartGroup.updateRememberedValue(paint21114);
                        obj5 = paint21114;
                    }
                    obj5 = objRememberedValue5;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint111111110 = (Paint) obj5;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue6 == companion.getEmpty()) {
                        i27 = 2;
                        snapshotMutationPolicy = null;
                        objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j8), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        i27 = 2;
                        snapshotMutationPolicy = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState4 = (MutableState) objRememberedValue6;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i27, snapshotMutationPolicy);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState5 = (MutableState) objRememberedValue7;
                    if (chartDrawableData5 != null) {
                        listA = chartDrawableData5.a();
                    } else {
                        listA = null;
                    }
                    if (chartDrawableData6 != null) {
                        listA2 = chartDrawableData6.a();
                    } else {
                        listA2 = null;
                    }
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged6 = composerStartRestartGroup.changed(listA) | composerStartRestartGroup.changed(listA2);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (zChanged6) {
                        listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                        if (chartDrawableData5 != null) {
                            while (r12.hasNext()) {
                                if (chartXY.getY() != null) {
                                    listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                                }
                            }
                            Unit unit117 = Unit.INSTANCE;
                        }
                        if (chartDrawableData6 != null) {
                            while (r12.hasNext()) {
                                if (chartXY2.getY() != null) {
                                    listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                                }
                            }
                            Unit unit118 = Unit.INSTANCE;
                        }
                        objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    } else {
                        listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                        if (chartDrawableData5 != null) {
                            while (r12.hasNext()) {
                                if (chartXY.getY() != null) {
                                    listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                                }
                            }
                            Unit unit119 = Unit.INSTANCE;
                        }
                        if (chartDrawableData6 != null) {
                            while (r12.hasNext()) {
                                if (chartXY2.getY() != null) {
                                    listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                                }
                            }
                            Unit unit1110 = Unit.INSTANCE;
                        }
                        objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list1110 = (List) objRememberedValue8;
                    State stateRememberUpdatedState1111 = SnapshotStateKt.rememberUpdatedState(list1110, composerStartRestartGroup, 8);
                    State stateRememberUpdatedState1112 = SnapshotStateKt.rememberUpdatedState(mutableState3, composerStartRestartGroup, (i6 >> 27) & 14);
                    State stateRememberUpdatedState1113 = SnapshotStateKt.rememberUpdatedState(function11111115, composerStartRestartGroup, (i7 >> 24) & 14);
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function11111114, composerStartRestartGroup, (i7 >> 27) & 14);
                    stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function11111113, composerStartRestartGroup, i22 & 14);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState6 = (MutableState) objRememberedValue9;
                    float fMo313toPx0680j_11110 = density8.mo313toPx0680j_4(Dp.m4104constructorimpl(fM4104constructorimpl4 + fM4104constructorimpl5));
                    float fMo313toPx0680j_11111 = density8.mo313toPx0680j_4(fM4104constructorimpl4);
                    float f1111110 = fM4104constructorimpl4;
                    float fMo313toPx0680j_11112 = density8.mo313toPx0680j_4(Dp.m4104constructorimpl(f4));
                    float fMo313toPx0680j_11113 = density8.mo313toPx0680j_4(Dp.m4104constructorimpl(Dp.m4104constructorimpl(f7) - fM4104constructorimpl13));
                    if (j2 > 0) {
                        fFloatValue = 0.0f;
                    } else {
                        fFloatValue = 0.0f;
                    }
                    float fFloatValue9 = ((Number) mutableState6.getValue()).floatValue() - density8.mo313toPx0680j_4(fM4104constructorimpl5);
                    float fMo313toPx0680j_11114 = density8.mo313toPx0680j_4(Dp.m4104constructorimpl(600));
                    if (chartDrawableData5 != null) {
                        pointRadiusDp = chartDrawableData5.getPointRadiusDp();
                    } else {
                        pointRadiusDp = 0.0f;
                    }
                    if (chartDrawableData6 != null) {
                        pointRadiusDp2 = chartDrawableData6.getPointRadiusDp();
                    } else {
                        pointRadiusDp2 = 0.0f;
                    }
                    fMo313toPx0680j_4 = density8.mo313toPx0680j_4(Dp.m4104constructorimpl(Math.max(pointRadiusDp, pointRadiusDp2)));
                    float f1111111 = 16;
                    State stateRememberUpdatedState1114 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(Math.max(4 * fMo313toPx0680j_4, density8.mo313toPx0680j_4(Dp.m4104constructorimpl(f1111111)))), composerStartRestartGroup, 0);
                    if (fFloatValue > 0.0f) {
                        j9 = ((long) (fMo313toPx0680j_4 / fFloatValue)) + 1;
                    } else {
                        j9 = 0;
                    }
                    long j1115 = j9;
                    jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(minMax.getSecond().longValue() - j2, minMax.getFirst().longValue());
                    if (jCoerceAtLeast > minMax.getFirst().longValue()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    float fMax8 = Math.max(viewConfiguration8.getTouchSlop() * 2.0f, density8.mo313toPx0680j_4(Dp.m4104constructorimpl(f1111111)));
                    if (chartDrawableData5 != null) {
                        pairF = chartDrawableData5.f();
                    } else {
                        pairF = null;
                    }
                    if (chartDrawableData6 != null) {
                        pairF2 = chartDrawableData6.f();
                    } else {
                        pairF2 = null;
                    }
                    Long lValueOf15 = Long.valueOf(j8);
                    Long lValueOf16 = Long.valueOf(j2);
                    Pair<Float, Float> pair15 = pairF2;
                    Pair<Float, Float> pair16 = pairF;
                    objArr = new Object[]{Long.valueOf(j8), minMax, Long.valueOf(jCoerceAtLeast), mutableState5, mutableState4};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged7 = false;
                    while (i28 < 5) {
                        zChanged7 |= composerStartRestartGroup.changed(objArr[i28]);
                    }
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (zChanged7) {
                        objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    } else {
                        objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i4114 = ((i7 >> 12) & 14) | 4096;
                    int i4115 = i7 >> 3;
                    EffectsKt.LaunchedEffect(lValueOf15, minMax, lValueOf16, (Function2) objRememberedValue10, composerStartRestartGroup, (i4115 & 896) | i4114 | (i4115 & 112));
                    Pair<Long, Long> pairD8 = d(mutableState5);
                    objArr2 = new Object[]{mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged8 = false;
                    while (i29 < 4) {
                        zChanged8 |= composerStartRestartGroup.changed(objArr2[i29]);
                    }
                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (zChanged8) {
                        objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    } else {
                        objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(pairD8, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 64);
                    Object[] objArr10 = new Object[5];
                    if (mutableState3 != null) {
                        value = mutableState3.getValue();
                    } else {
                        value = null;
                    }
                    objArr10[0] = value;
                    objArr10[1] = list1110;
                    objArr10[2] = Long.valueOf(b(mutableState4));
                    objArr10[3] = Long.valueOf(j2);
                    objArr10[4] = Long.valueOf(j1115);
                    EffectsKt.LaunchedEffect(objArr10, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$4(mutableState3, list1110, j2, j1115, mutableState4, stateRememberUpdatedState1113, null), composerStartRestartGroup, 72);
                    Modifier modifierM455height3ABfNKs8 = SizeKt.m455height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4104constructorimpl(f7));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged9 = composerStartRestartGroup.changed(mutableState6);
                    objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (zChanged9) {
                        objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p010kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m4625invokeozmzZPI(intSize.m4268unboximpl());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m4625invokeozmzZPI(long j1116) {
                                mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j1116)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    } else {
                        objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p010kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m4625invokeozmzZPI(intSize.m4268unboximpl());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m4625invokeozmzZPI(long j1116) {
                                mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j1116)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierPointerInput8 = SuspendingPointerInputFilterKt.pointerInput(OnRemeasuredModifierKt.onSizeChanged(modifierM455height3ABfNKs8, (Function1) objRememberedValue12), new Object[]{Float.valueOf(fFloatValue), Float.valueOf(fMo313toPx0680j_11111), Float.valueOf(fFloatValue9), Float.valueOf(fMo313toPx0680j_11112), Float.valueOf(fMo313toPx0680j_11113), minMax, Long.valueOf(j2), chartScrollSnapUnit3, view8}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$6(fMo313toPx0680j_11111, fFloatValue9, fMo313toPx0680j_11112, fMo313toPx0680j_11113, view8, viewConfiguration8, fFloatValue, minMax, jCoerceAtLeast, z4, fMax8, fMo313toPx0680j_11114, mutableState5, mutableState4, stateRememberUpdatedState1112, stateRememberUpdatedState1111, stateRememberUpdatedState1114, stateRememberUpdatedState1113, stateRememberUpdatedState, chartScrollSnapUnit3, stateRememberUpdatedState2, null));
                    MutableState<Integer> mutableState113 = mutableState3;
                    Composer composer10 = composerStartRestartGroup;
                    CanvasKt.Canvas(modifierPointerInput8, new ChartComposeKt$Chart$7(f1111110, f4, fM4104constructorimpl5, fM4104constructorimpl13, j2, pair16, pair15, i26, paint11111113, paint11111116, z3, chartDrawableData5, chartDrawableData6, list4, paint11111119, minMax, j7, list3, mutableState113, list1110, markerLabelFormat, paint21112, iM1672toArgb8_81llA, mutableState4, fM4104constructorimpl3, xLabelFormat, paint111111110), composer10, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function10 = function11111114;
                    function11 = function11111115;
                    function12 = function11111113;
                    mutableState7 = mutableState113;
                    f10 = f7;
                    chartDrawableData7 = chartDrawableData5;
                    chartDrawableData8 = chartDrawableData6;
                    list5 = list3;
                    list6 = list4;
                    i30 = i26;
                    f11 = f8;
                    f12 = f9;
                    z5 = z3;
                    j10 = j8;
                    chartScrollSnapUnit4 = chartScrollSnapUnit3;
                    j11 = j7;
                    f13 = fM4104constructorimpl3;
                    composer2 = composer10;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i32 != 0) {
                            f6 = 279.0f;
                        } else {
                            f6 = f;
                        }
                        if (i33 != 0) {
                            chartDrawableData3 = null;
                        } else {
                            chartDrawableData3 = chartDrawableData;
                        }
                        if (i34 != 0) {
                            chartDrawableData4 = null;
                        } else {
                            chartDrawableData4 = chartDrawableData2;
                        }
                        if (i35 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if (i36 != 0) {
                            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList2 = list2;
                        }
                        if (i37 != 0) {
                            i25 = 2;
                        } else {
                            i25 = i;
                        }
                        f7 = f6;
                        if (i38 != 0) {
                            fM4104constructorimpl = Dp.m4104constructorimpl(22);
                        } else {
                            fM4104constructorimpl = f2;
                        }
                        if (i39 != 0) {
                            fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                        } else {
                            fM4104constructorimpl2 = f3;
                        }
                        if (i40 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if (i41 != 0) {
                            mutableState2 = null;
                        } else {
                            mutableState2 = mutableState;
                        }
                        f8 = fM4104constructorimpl;
                        if ((i5 & 16384) != 0) {
                            jLongValue = minMax.getFirst().longValue();
                            i7 &= -57345;
                        } else {
                            jLongValue = j3;
                        }
                        if (i12 != 0) {
                            chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                        }
                        if (i14 != 0) {
                            j6 = 43200000;
                        } else {
                            j6 = j5;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        } else {
                            function4 = function1;
                        }
                        if (i19 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i21 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        Function1<? super Integer, Unit> function11111116 = function4;
                        f9 = fM4104constructorimpl2;
                        if (i24 != 0) {
                            fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                        } else {
                            fM4104constructorimpl3 = f5;
                        }
                        chartDrawableData5 = chartDrawableData3;
                        chartDrawableData6 = chartDrawableData4;
                        list3 = listEmptyList;
                        list4 = listEmptyList2;
                        z3 = z2;
                        chartScrollSnapUnit3 = chartScrollSnapUnit2;
                        j7 = j6;
                        function7 = function6;
                        i26 = i25;
                        mutableState3 = mutableState2;
                        j8 = jLongValue;
                        function8 = function11111116;
                        function9 = function5;
                    } else {
                        if (i32 != 0) {
                            f6 = 279.0f;
                        } else {
                            f6 = f;
                        }
                        if (i33 != 0) {
                            chartDrawableData3 = null;
                        } else {
                            chartDrawableData3 = chartDrawableData;
                        }
                        if (i34 != 0) {
                            chartDrawableData4 = null;
                        } else {
                            chartDrawableData4 = chartDrawableData2;
                        }
                        if (i35 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if (i36 != 0) {
                            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList2 = list2;
                        }
                        if (i37 != 0) {
                            i25 = 2;
                        } else {
                            i25 = i;
                        }
                        f7 = f6;
                        if (i38 != 0) {
                            fM4104constructorimpl = Dp.m4104constructorimpl(22);
                        } else {
                            fM4104constructorimpl = f2;
                        }
                        if (i39 != 0) {
                            fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                        } else {
                            fM4104constructorimpl2 = f3;
                        }
                        if (i40 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if (i41 != 0) {
                            mutableState2 = null;
                        } else {
                            mutableState2 = mutableState;
                        }
                        f8 = fM4104constructorimpl;
                        if ((i5 & 16384) != 0) {
                            jLongValue = minMax.getFirst().longValue();
                            i7 &= -57345;
                        } else {
                            jLongValue = j3;
                        }
                        if (i12 != 0) {
                            chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                        }
                        if (i14 != 0) {
                            j6 = 43200000;
                        } else {
                            j6 = j5;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        } else {
                            function4 = function1;
                        }
                        if (i19 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i21 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        Function1<? super Integer, Unit> function11111117 = function4;
                        f9 = fM4104constructorimpl2;
                        if (i24 != 0) {
                            fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                        } else {
                            fM4104constructorimpl3 = f5;
                        }
                        chartDrawableData5 = chartDrawableData3;
                        chartDrawableData6 = chartDrawableData4;
                        list3 = listEmptyList;
                        list4 = listEmptyList2;
                        z3 = z2;
                        chartScrollSnapUnit3 = chartScrollSnapUnit2;
                        j7 = j6;
                        function7 = function6;
                        i26 = i25;
                        mutableState3 = mutableState2;
                        j8 = jLongValue;
                        function8 = function11111117;
                        function9 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-920059604, i6, i7, "com.heytap.health.bodyfat.ui.Chart (ChartCompose.kt:138)");
                    }
                    if (minMax.getFirst().longValue() == minMax.getSecond().longValue()) {
                        m8b.b("Chart", "min == max; return!");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final float f1111112 = f7;
                        final ChartDrawableData chartDrawableData115 = chartDrawableData5;
                        final ChartDrawableData chartDrawableData116 = chartDrawableData6;
                        final List<ChartDrawableData> list1111 = list3;
                        final List<ChartDrawableData> list1112 = list4;
                        final int i4116 = i26;
                        final float f1111113 = f8;
                        final float f1111114 = f9;
                        final boolean z14 = z3;
                        final MutableState<Integer> mutableState114 = mutableState3;
                        final Function2<? super Long, ? super ChartScrollDirection, Long> function11111118 = function7;
                        final Function1<? super Long, Unit> function11111119 = function9;
                        final Function1<? super Integer, Unit> function111111110 = function8;
                        final long j1116 = j8;
                        final ChartScrollSnapUnit chartScrollSnapUnit13 = chartScrollSnapUnit3;
                        final long j1117 = j7;
                        final float f1111115 = fM4104constructorimpl3;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer11, Integer num) {
                                invoke(composer11, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer11, int i4117) {
                                ChartComposeKt.a(f1111112, chartDrawableData115, chartDrawableData116, list1111, list1112, i4116, f1111113, f1111114, z14, mutableState114, markerLabelFormat, f4, minMax, j2, j1116, chartScrollSnapUnit13, j1117, xLabelFormat, function111111110, function11111119, function11111118, f1111115, composer11, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                            }
                        });
                        return;
                    }
                    Function2<? super Long, ? super ChartScrollDirection, Long> function111111111 = function7;
                    Function1<? super Long, Unit> function111111112 = function9;
                    Function1<? super Integer, Unit> function111111113 = function8;
                    if (chartDrawableData5 == null) {
                        fM4104constructorimpl4 = Dp.m4104constructorimpl(0);
                    } else {
                        fM4104constructorimpl4 = f8;
                    }
                    if (chartDrawableData6 == null) {
                        fM4104constructorimpl5 = Dp.m4104constructorimpl(0);
                    } else {
                        fM4104constructorimpl5 = f9;
                    }
                    float fM4104constructorimpl14 = Dp.m4104constructorimpl(22);
                    Density density9 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    View view9 = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                    ViewConfiguration viewConfiguration9 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    iM1672toArgb8_81llA = ColorKt.m1672toArgb8_81llA(ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha55, composerStartRestartGroup, 0));
                    fMo312toPxR2X_6o = density9.mo312toPxR2X_6o(TextUnitKt.getSp(10));
                    fMo312toPxR2X_6o2 = density9.mo312toPxR2X_6o(TextUnitKt.getSp(12));
                    Float fValueOf11111 = Float.valueOf(fMo312toPxR2X_6o);
                    Integer numValueOf115 = Integer.valueOf(iM1672toArgb8_81llA);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(fValueOf11111) | composerStartRestartGroup.changed(numValueOf115);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        obj = objRememberedValue;
                        Paint paint111111111 = new Paint();
                        paint111111111.setAntiAlias(true);
                        paint111111111.setTextSize(fMo312toPxR2X_6o);
                        paint111111111.setColor(iM1672toArgb8_81llA);
                        paint111111111.setTextAlign(Paint.Align.RIGHT);
                        paint111111111.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint111111111);
                        obj = paint111111111;
                    } else {
                        obj = objRememberedValue;
                        Paint paint111111112 = new Paint();
                        paint111111112.setAntiAlias(true);
                        paint111111112.setTextSize(fMo312toPxR2X_6o);
                        paint111111112.setColor(iM1672toArgb8_81llA);
                        paint111111112.setTextAlign(Paint.Align.RIGHT);
                        paint111111112.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint111111112);
                        obj = paint111111112;
                    }
                    obj = objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint111111113 = (Paint) obj;
                    Float fValueOf11112 = Float.valueOf(fMo312toPxR2X_6o);
                    Integer numValueOf116 = Integer.valueOf(iM1672toArgb8_81llA);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(fValueOf11112) | composerStartRestartGroup.changed(numValueOf116);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        obj2 = objRememberedValue2;
                        Paint paint111111114 = new Paint();
                        paint111111114.setAntiAlias(true);
                        paint111111114.setTextSize(fMo312toPxR2X_6o);
                        paint111111114.setColor(iM1672toArgb8_81llA);
                        paint111111114.setTextAlign(Paint.Align.RIGHT);
                        paint111111114.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint111111114);
                        obj2 = paint111111114;
                    } else {
                        obj2 = objRememberedValue2;
                        Paint paint111111115 = new Paint();
                        paint111111115.setAntiAlias(true);
                        paint111111115.setTextSize(fMo312toPxR2X_6o);
                        paint111111115.setColor(iM1672toArgb8_81llA);
                        paint111111115.setTextAlign(Paint.Align.RIGHT);
                        paint111111115.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint111111115);
                        obj2 = paint111111115;
                    }
                    obj2 = objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint111111116 = (Paint) obj2;
                    Float fValueOf11113 = Float.valueOf(fMo312toPxR2X_6o);
                    Integer numValueOf117 = Integer.valueOf(iM1672toArgb8_81llA);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(fValueOf11113) | composerStartRestartGroup.changed(numValueOf117);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        obj3 = objRememberedValue3;
                        Paint paint111111117 = new Paint();
                        paint111111117.setAntiAlias(true);
                        paint111111117.setTextSize(fMo312toPxR2X_6o);
                        paint111111117.setColor(iM1672toArgb8_81llA);
                        paint111111117.setTextAlign(Paint.Align.CENTER);
                        paint111111117.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint111111117);
                        obj3 = paint111111117;
                    } else {
                        obj3 = objRememberedValue3;
                        Paint paint111111118 = new Paint();
                        paint111111118.setAntiAlias(true);
                        paint111111118.setTextSize(fMo312toPxR2X_6o);
                        paint111111118.setColor(iM1672toArgb8_81llA);
                        paint111111118.setTextAlign(Paint.Align.CENTER);
                        paint111111118.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                        composerStartRestartGroup.updateRememberedValue(paint111111118);
                        obj3 = paint111111118;
                    }
                    obj3 = objRememberedValue3;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint111111119 = (Paint) obj3;
                    Float fValueOf11114 = Float.valueOf(fMo312toPxR2X_6o2);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged4 = composerStartRestartGroup.changed(fValueOf11114);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4) {
                        obj4 = objRememberedValue4;
                        Paint paint21115 = new Paint();
                        paint21115.setAntiAlias(true);
                        paint21115.setTextSize(fMo312toPxR2X_6o2);
                        paint21115.setColor(-1);
                        paint21115.setTextAlign(Paint.Align.LEFT);
                        composerStartRestartGroup.updateRememberedValue(paint21115);
                        obj4 = paint21115;
                    } else {
                        obj4 = objRememberedValue4;
                        Paint paint21116 = new Paint();
                        paint21116.setAntiAlias(true);
                        paint21116.setTextSize(fMo312toPxR2X_6o2);
                        paint21116.setColor(-1);
                        paint21116.setTextAlign(Paint.Align.LEFT);
                        composerStartRestartGroup.updateRememberedValue(paint21116);
                        obj4 = paint21116;
                    }
                    obj4 = objRememberedValue4;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint21117 = (Paint) obj4;
                    Float fValueOf11115 = Float.valueOf(fMo312toPxR2X_6o2);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged5 = composerStartRestartGroup.changed(fValueOf11115);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged5) {
                        obj5 = objRememberedValue5;
                        Paint paint21118 = new Paint();
                        paint21118.setAntiAlias(true);
                        paint21118.setTextSize(fMo312toPxR2X_6o2);
                        paint21118.setColor(-1);
                        paint21118.setTextAlign(Paint.Align.LEFT);
                        paint21118.setFakeBoldText(true);
                        composerStartRestartGroup.updateRememberedValue(paint21118);
                        obj5 = paint21118;
                    } else {
                        obj5 = objRememberedValue5;
                        Paint paint21119 = new Paint();
                        paint21119.setAntiAlias(true);
                        paint21119.setTextSize(fMo312toPxR2X_6o2);
                        paint21119.setColor(-1);
                        paint21119.setTextAlign(Paint.Align.LEFT);
                        paint21119.setFakeBoldText(true);
                        composerStartRestartGroup.updateRememberedValue(paint21119);
                        obj5 = paint21119;
                    }
                    obj5 = objRememberedValue5;
                    composerStartRestartGroup.endReplaceableGroup();
                    Paint paint1111111110 = (Paint) obj5;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue6 == companion.getEmpty()) {
                        i27 = 2;
                        snapshotMutationPolicy = null;
                        objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j8), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        i27 = 2;
                        snapshotMutationPolicy = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState4 = (MutableState) objRememberedValue6;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i27, snapshotMutationPolicy);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState5 = (MutableState) objRememberedValue7;
                    if (chartDrawableData5 != null) {
                        listA = chartDrawableData5.a();
                    } else {
                        listA = null;
                    }
                    if (chartDrawableData6 != null) {
                        listA2 = chartDrawableData6.a();
                    } else {
                        listA2 = null;
                    }
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged6 = composerStartRestartGroup.changed(listA) | composerStartRestartGroup.changed(listA2);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (zChanged6) {
                        listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                        if (chartDrawableData5 != null) {
                            while (r12.hasNext()) {
                                if (chartXY.getY() != null) {
                                    listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                                }
                            }
                            Unit unit1111 = Unit.INSTANCE;
                        }
                        if (chartDrawableData6 != null) {
                            while (r12.hasNext()) {
                                if (chartXY2.getY() != null) {
                                    listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                                }
                            }
                            Unit unit1112 = Unit.INSTANCE;
                        }
                        objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    } else {
                        listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                        if (chartDrawableData5 != null) {
                            while (r12.hasNext()) {
                                if (chartXY.getY() != null) {
                                    listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                                }
                            }
                            Unit unit1113 = Unit.INSTANCE;
                        }
                        if (chartDrawableData6 != null) {
                            while (r12.hasNext()) {
                                if (chartXY2.getY() != null) {
                                    listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                                }
                            }
                            Unit unit1114 = Unit.INSTANCE;
                        }
                        objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list1113 = (List) objRememberedValue8;
                    State stateRememberUpdatedState1115 = SnapshotStateKt.rememberUpdatedState(list1113, composerStartRestartGroup, 8);
                    State stateRememberUpdatedState1116 = SnapshotStateKt.rememberUpdatedState(mutableState3, composerStartRestartGroup, (i6 >> 27) & 14);
                    State stateRememberUpdatedState1117 = SnapshotStateKt.rememberUpdatedState(function111111113, composerStartRestartGroup, (i7 >> 24) & 14);
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function111111112, composerStartRestartGroup, (i7 >> 27) & 14);
                    stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function111111111, composerStartRestartGroup, i22 & 14);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState6 = (MutableState) objRememberedValue9;
                    float fMo313toPx0680j_11115 = density9.mo313toPx0680j_4(Dp.m4104constructorimpl(fM4104constructorimpl4 + fM4104constructorimpl5));
                    float fMo313toPx0680j_11116 = density9.mo313toPx0680j_4(fM4104constructorimpl4);
                    float f1111116 = fM4104constructorimpl4;
                    float fMo313toPx0680j_11117 = density9.mo313toPx0680j_4(Dp.m4104constructorimpl(f4));
                    float fMo313toPx0680j_11118 = density9.mo313toPx0680j_4(Dp.m4104constructorimpl(Dp.m4104constructorimpl(f7) - fM4104constructorimpl14));
                    if (j2 > 0) {
                        fFloatValue = 0.0f;
                    } else {
                        fFloatValue = 0.0f;
                    }
                    float fFloatValue10 = ((Number) mutableState6.getValue()).floatValue() - density9.mo313toPx0680j_4(fM4104constructorimpl5);
                    float fMo313toPx0680j_11119 = density9.mo313toPx0680j_4(Dp.m4104constructorimpl(600));
                    if (chartDrawableData5 != null) {
                        pointRadiusDp = chartDrawableData5.getPointRadiusDp();
                    } else {
                        pointRadiusDp = 0.0f;
                    }
                    if (chartDrawableData6 != null) {
                        pointRadiusDp2 = chartDrawableData6.getPointRadiusDp();
                    } else {
                        pointRadiusDp2 = 0.0f;
                    }
                    fMo313toPx0680j_4 = density9.mo313toPx0680j_4(Dp.m4104constructorimpl(Math.max(pointRadiusDp, pointRadiusDp2)));
                    float f1111117 = 16;
                    State stateRememberUpdatedState1118 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(Math.max(4 * fMo313toPx0680j_4, density9.mo313toPx0680j_4(Dp.m4104constructorimpl(f1111117)))), composerStartRestartGroup, 0);
                    if (fFloatValue > 0.0f) {
                        j9 = ((long) (fMo313toPx0680j_4 / fFloatValue)) + 1;
                    } else {
                        j9 = 0;
                    }
                    long j1118 = j9;
                    jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(minMax.getSecond().longValue() - j2, minMax.getFirst().longValue());
                    if (jCoerceAtLeast > minMax.getFirst().longValue()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    float fMax9 = Math.max(viewConfiguration9.getTouchSlop() * 2.0f, density9.mo313toPx0680j_4(Dp.m4104constructorimpl(f1111117)));
                    if (chartDrawableData5 != null) {
                        pairF = chartDrawableData5.f();
                    } else {
                        pairF = null;
                    }
                    if (chartDrawableData6 != null) {
                        pairF2 = chartDrawableData6.f();
                    } else {
                        pairF2 = null;
                    }
                    Long lValueOf17 = Long.valueOf(j8);
                    Long lValueOf18 = Long.valueOf(j2);
                    Pair<Float, Float> pair17 = pairF2;
                    Pair<Float, Float> pair18 = pairF;
                    objArr = new Object[]{Long.valueOf(j8), minMax, Long.valueOf(jCoerceAtLeast), mutableState5, mutableState4};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged7 = false;
                    while (i28 < 5) {
                        zChanged7 |= composerStartRestartGroup.changed(objArr[i28]);
                    }
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (zChanged7) {
                        objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    } else {
                        objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i4117 = ((i7 >> 12) & 14) | 4096;
                    int i4118 = i7 >> 3;
                    EffectsKt.LaunchedEffect(lValueOf17, minMax, lValueOf18, (Function2) objRememberedValue10, composerStartRestartGroup, (i4118 & 896) | i4117 | (i4118 & 112));
                    Pair<Long, Long> pairD9 = d(mutableState5);
                    objArr2 = new Object[]{mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged8 = false;
                    while (i29 < 4) {
                        zChanged8 |= composerStartRestartGroup.changed(objArr2[i29]);
                    }
                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (zChanged8) {
                        objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    } else {
                        objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(pairD9, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 64);
                    Object[] objArr11 = new Object[5];
                    if (mutableState3 != null) {
                        value = mutableState3.getValue();
                    } else {
                        value = null;
                    }
                    objArr11[0] = value;
                    objArr11[1] = list1113;
                    objArr11[2] = Long.valueOf(b(mutableState4));
                    objArr11[3] = Long.valueOf(j2);
                    objArr11[4] = Long.valueOf(j1118);
                    EffectsKt.LaunchedEffect(objArr11, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$4(mutableState3, list1113, j2, j1118, mutableState4, stateRememberUpdatedState1117, null), composerStartRestartGroup, 72);
                    Modifier modifierM455height3ABfNKs9 = SizeKt.m455height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4104constructorimpl(f7));
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged9 = composerStartRestartGroup.changed(mutableState6);
                    objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (zChanged9) {
                        objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p010kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m4625invokeozmzZPI(intSize.m4268unboximpl());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m4625invokeozmzZPI(long j1119) {
                                mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j1119)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    } else {
                        objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // p010kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                m4625invokeozmzZPI(intSize.m4268unboximpl());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                            public final void m4625invokeozmzZPI(long j1119) {
                                mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j1119)));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierPointerInput9 = SuspendingPointerInputFilterKt.pointerInput(OnRemeasuredModifierKt.onSizeChanged(modifierM455height3ABfNKs9, (Function1) objRememberedValue12), new Object[]{Float.valueOf(fFloatValue), Float.valueOf(fMo313toPx0680j_11116), Float.valueOf(fFloatValue10), Float.valueOf(fMo313toPx0680j_11117), Float.valueOf(fMo313toPx0680j_11118), minMax, Long.valueOf(j2), chartScrollSnapUnit3, view9}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$6(fMo313toPx0680j_11116, fFloatValue10, fMo313toPx0680j_11117, fMo313toPx0680j_11118, view9, viewConfiguration9, fFloatValue, minMax, jCoerceAtLeast, z4, fMax9, fMo313toPx0680j_11119, mutableState5, mutableState4, stateRememberUpdatedState1116, stateRememberUpdatedState1115, stateRememberUpdatedState1118, stateRememberUpdatedState1117, stateRememberUpdatedState, chartScrollSnapUnit3, stateRememberUpdatedState2, null));
                    MutableState<Integer> mutableState115 = mutableState3;
                    Composer composer11 = composerStartRestartGroup;
                    CanvasKt.Canvas(modifierPointerInput9, new ChartComposeKt$Chart$7(f1111116, f4, fM4104constructorimpl5, fM4104constructorimpl14, j2, pair18, pair17, i26, paint111111113, paint111111116, z3, chartDrawableData5, chartDrawableData6, list4, paint111111119, minMax, j7, list3, mutableState115, list1113, markerLabelFormat, paint21117, iM1672toArgb8_81llA, mutableState4, fM4104constructorimpl3, xLabelFormat, paint1111111110), composer11, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function10 = function111111112;
                    function11 = function111111113;
                    function12 = function111111111;
                    mutableState7 = mutableState115;
                    f10 = f7;
                    chartDrawableData7 = chartDrawableData5;
                    chartDrawableData8 = chartDrawableData6;
                    list5 = list3;
                    list6 = list4;
                    i30 = i26;
                    f11 = f8;
                    f12 = f9;
                    z5 = z3;
                    j10 = j8;
                    chartScrollSnapUnit4 = chartScrollSnapUnit3;
                    j11 = j7;
                    f13 = fM4104constructorimpl3;
                    composer2 = composer11;
                }
                scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // p010kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer12, Integer num) {
                        invoke(composer12, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer12, int i4119) {
                        ChartComposeKt.a(f10, chartDrawableData7, chartDrawableData8, list5, list6, i30, f11, f12, z5, mutableState7, markerLabelFormat, f4, minMax, j2, j10, chartScrollSnapUnit4, j11, xLabelFormat, function11, function10, function12, f13, composer12, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                    }
                });
            }
            i16 = 12582912;
            i7 |= i16;
            i17 = i5 & 262144;
            if (i17 != 0) {
                i7 |= 100663296;
            } else if ((i3 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i7 |= i18;
            }
            i19 = i5 & 524288;
            if (i19 != 0) {
                i7 |= 805306368;
            } else if ((i3 & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i7 |= i20;
            }
            i21 = i5 & 1048576;
            if (i21 != 0) {
                i22 = i4 | 6;
            } else if ((i4 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i4 | i23;
            } else {
                i22 = i4;
            }
            i24 = i5 & 2097152;
            if (i24 != 0) {
                i22 |= 48;
            } else if ((i4 & 112) == 0) {
                i22 |= composerStartRestartGroup.changed(f5) ? 32 : 16;
            }
            if ((i5 & 30) != 30) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i32 != 0) {
                        f6 = 279.0f;
                    } else {
                        f6 = f;
                    }
                    if (i33 != 0) {
                        chartDrawableData3 = null;
                    } else {
                        chartDrawableData3 = chartDrawableData;
                    }
                    if (i34 != 0) {
                        chartDrawableData4 = null;
                    } else {
                        chartDrawableData4 = chartDrawableData2;
                    }
                    if (i35 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i36 != 0) {
                        listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList2 = list2;
                    }
                    if (i37 != 0) {
                        i25 = 2;
                    } else {
                        i25 = i;
                    }
                    f7 = f6;
                    if (i38 != 0) {
                        fM4104constructorimpl = Dp.m4104constructorimpl(22);
                    } else {
                        fM4104constructorimpl = f2;
                    }
                    if (i39 != 0) {
                        fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                    } else {
                        fM4104constructorimpl2 = f3;
                    }
                    if (i40 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (i41 != 0) {
                        mutableState2 = null;
                    } else {
                        mutableState2 = mutableState;
                    }
                    f8 = fM4104constructorimpl;
                    if ((i5 & 16384) != 0) {
                        jLongValue = minMax.getFirst().longValue();
                        i7 &= -57345;
                    } else {
                        jLongValue = j3;
                    }
                    if (i12 != 0) {
                        chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                    }
                    if (i14 != 0) {
                        j6 = 43200000;
                    } else {
                        j6 = j5;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    } else {
                        function4 = function1;
                    }
                    if (i19 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i21 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    Function1<? super Integer, Unit> function111111114 = function4;
                    f9 = fM4104constructorimpl2;
                    if (i24 != 0) {
                        fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                    } else {
                        fM4104constructorimpl3 = f5;
                    }
                    chartDrawableData5 = chartDrawableData3;
                    chartDrawableData6 = chartDrawableData4;
                    list3 = listEmptyList;
                    list4 = listEmptyList2;
                    z3 = z2;
                    chartScrollSnapUnit3 = chartScrollSnapUnit2;
                    j7 = j6;
                    function7 = function6;
                    i26 = i25;
                    mutableState3 = mutableState2;
                    j8 = jLongValue;
                    function8 = function111111114;
                    function9 = function5;
                } else {
                    if (i32 != 0) {
                        f6 = 279.0f;
                    } else {
                        f6 = f;
                    }
                    if (i33 != 0) {
                        chartDrawableData3 = null;
                    } else {
                        chartDrawableData3 = chartDrawableData;
                    }
                    if (i34 != 0) {
                        chartDrawableData4 = null;
                    } else {
                        chartDrawableData4 = chartDrawableData2;
                    }
                    if (i35 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i36 != 0) {
                        listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList2 = list2;
                    }
                    if (i37 != 0) {
                        i25 = 2;
                    } else {
                        i25 = i;
                    }
                    f7 = f6;
                    if (i38 != 0) {
                        fM4104constructorimpl = Dp.m4104constructorimpl(22);
                    } else {
                        fM4104constructorimpl = f2;
                    }
                    if (i39 != 0) {
                        fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                    } else {
                        fM4104constructorimpl2 = f3;
                    }
                    if (i40 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (i41 != 0) {
                        mutableState2 = null;
                    } else {
                        mutableState2 = mutableState;
                    }
                    f8 = fM4104constructorimpl;
                    if ((i5 & 16384) != 0) {
                        jLongValue = minMax.getFirst().longValue();
                        i7 &= -57345;
                    } else {
                        jLongValue = j3;
                    }
                    if (i12 != 0) {
                        chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                    }
                    if (i14 != 0) {
                        j6 = 43200000;
                    } else {
                        j6 = j5;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    } else {
                        function4 = function1;
                    }
                    if (i19 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i21 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    Function1<? super Integer, Unit> function111111115 = function4;
                    f9 = fM4104constructorimpl2;
                    if (i24 != 0) {
                        fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                    } else {
                        fM4104constructorimpl3 = f5;
                    }
                    chartDrawableData5 = chartDrawableData3;
                    chartDrawableData6 = chartDrawableData4;
                    list3 = listEmptyList;
                    list4 = listEmptyList2;
                    z3 = z2;
                    chartScrollSnapUnit3 = chartScrollSnapUnit2;
                    j7 = j6;
                    function7 = function6;
                    i26 = i25;
                    mutableState3 = mutableState2;
                    j8 = jLongValue;
                    function8 = function111111115;
                    function9 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-920059604, i6, i7, "com.heytap.health.bodyfat.ui.Chart (ChartCompose.kt:138)");
                }
                if (minMax.getFirst().longValue() == minMax.getSecond().longValue()) {
                    m8b.b("Chart", "min == max; return!");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final float f1111118 = f7;
                    final ChartDrawableData chartDrawableData117 = chartDrawableData5;
                    final ChartDrawableData chartDrawableData118 = chartDrawableData6;
                    final List<ChartDrawableData> list1114 = list3;
                    final List<ChartDrawableData> list1115 = list4;
                    final int i4119 = i26;
                    final float f1111119 = f8;
                    final float f11111110 = f9;
                    final boolean z15 = z3;
                    final MutableState<Integer> mutableState116 = mutableState3;
                    final Function2<? super Long, ? super ChartScrollDirection, Long> function111111116 = function7;
                    final Function1<? super Long, Unit> function111111117 = function9;
                    final Function1<? super Integer, Unit> function111111118 = function8;
                    final long j1119 = j8;
                    final ChartScrollSnapUnit chartScrollSnapUnit14 = chartScrollSnapUnit3;
                    final long j11110 = j7;
                    final float f11111111 = fM4104constructorimpl3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // p010kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer12, Integer num) {
                            invoke(composer12, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer12, int i41110) {
                            ChartComposeKt.a(f1111118, chartDrawableData117, chartDrawableData118, list1114, list1115, i4119, f1111119, f11111110, z15, mutableState116, markerLabelFormat, f4, minMax, j2, j1119, chartScrollSnapUnit14, j11110, xLabelFormat, function111111118, function111111117, function111111116, f11111111, composer12, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                        }
                    });
                    return;
                }
                Function2<? super Long, ? super ChartScrollDirection, Long> function111111119 = function7;
                Function1<? super Long, Unit> function1111111110 = function9;
                Function1<? super Integer, Unit> function1111111111 = function8;
                if (chartDrawableData5 == null) {
                    fM4104constructorimpl4 = Dp.m4104constructorimpl(0);
                } else {
                    fM4104constructorimpl4 = f8;
                }
                if (chartDrawableData6 == null) {
                    fM4104constructorimpl5 = Dp.m4104constructorimpl(0);
                } else {
                    fM4104constructorimpl5 = f9;
                }
                float fM4104constructorimpl15 = Dp.m4104constructorimpl(22);
                Density density10 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                View view10 = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                ViewConfiguration viewConfiguration10 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                iM1672toArgb8_81llA = ColorKt.m1672toArgb8_81llA(ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha55, composerStartRestartGroup, 0));
                fMo312toPxR2X_6o = density10.mo312toPxR2X_6o(TextUnitKt.getSp(10));
                fMo312toPxR2X_6o2 = density10.mo312toPxR2X_6o(TextUnitKt.getSp(12));
                Float fValueOf11116 = Float.valueOf(fMo312toPxR2X_6o);
                Integer numValueOf118 = Integer.valueOf(iM1672toArgb8_81llA);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(fValueOf11116) | composerStartRestartGroup.changed(numValueOf118);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    obj = objRememberedValue;
                    Paint paint1111111111 = new Paint();
                    paint1111111111.setAntiAlias(true);
                    paint1111111111.setTextSize(fMo312toPxR2X_6o);
                    paint1111111111.setColor(iM1672toArgb8_81llA);
                    paint1111111111.setTextAlign(Paint.Align.RIGHT);
                    paint1111111111.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint1111111111);
                    obj = paint1111111111;
                } else {
                    obj = objRememberedValue;
                    Paint paint1111111112 = new Paint();
                    paint1111111112.setAntiAlias(true);
                    paint1111111112.setTextSize(fMo312toPxR2X_6o);
                    paint1111111112.setColor(iM1672toArgb8_81llA);
                    paint1111111112.setTextAlign(Paint.Align.RIGHT);
                    paint1111111112.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint1111111112);
                    obj = paint1111111112;
                }
                obj = objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint1111111113 = (Paint) obj;
                Float fValueOf11117 = Float.valueOf(fMo312toPxR2X_6o);
                Integer numValueOf119 = Integer.valueOf(iM1672toArgb8_81llA);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(fValueOf11117) | composerStartRestartGroup.changed(numValueOf119);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    obj2 = objRememberedValue2;
                    Paint paint1111111114 = new Paint();
                    paint1111111114.setAntiAlias(true);
                    paint1111111114.setTextSize(fMo312toPxR2X_6o);
                    paint1111111114.setColor(iM1672toArgb8_81llA);
                    paint1111111114.setTextAlign(Paint.Align.RIGHT);
                    paint1111111114.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint1111111114);
                    obj2 = paint1111111114;
                } else {
                    obj2 = objRememberedValue2;
                    Paint paint1111111115 = new Paint();
                    paint1111111115.setAntiAlias(true);
                    paint1111111115.setTextSize(fMo312toPxR2X_6o);
                    paint1111111115.setColor(iM1672toArgb8_81llA);
                    paint1111111115.setTextAlign(Paint.Align.RIGHT);
                    paint1111111115.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint1111111115);
                    obj2 = paint1111111115;
                }
                obj2 = objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint1111111116 = (Paint) obj2;
                Float fValueOf11118 = Float.valueOf(fMo312toPxR2X_6o);
                Integer numValueOf1110 = Integer.valueOf(iM1672toArgb8_81llA);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(fValueOf11118) | composerStartRestartGroup.changed(numValueOf1110);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    obj3 = objRememberedValue3;
                    Paint paint1111111117 = new Paint();
                    paint1111111117.setAntiAlias(true);
                    paint1111111117.setTextSize(fMo312toPxR2X_6o);
                    paint1111111117.setColor(iM1672toArgb8_81llA);
                    paint1111111117.setTextAlign(Paint.Align.CENTER);
                    paint1111111117.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint1111111117);
                    obj3 = paint1111111117;
                } else {
                    obj3 = objRememberedValue3;
                    Paint paint1111111118 = new Paint();
                    paint1111111118.setAntiAlias(true);
                    paint1111111118.setTextSize(fMo312toPxR2X_6o);
                    paint1111111118.setColor(iM1672toArgb8_81llA);
                    paint1111111118.setTextAlign(Paint.Align.CENTER);
                    paint1111111118.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint1111111118);
                    obj3 = paint1111111118;
                }
                obj3 = objRememberedValue3;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint1111111119 = (Paint) obj3;
                Float fValueOf11119 = Float.valueOf(fMo312toPxR2X_6o2);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged4 = composerStartRestartGroup.changed(fValueOf11119);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    obj4 = objRememberedValue4;
                    Paint paint211110 = new Paint();
                    paint211110.setAntiAlias(true);
                    paint211110.setTextSize(fMo312toPxR2X_6o2);
                    paint211110.setColor(-1);
                    paint211110.setTextAlign(Paint.Align.LEFT);
                    composerStartRestartGroup.updateRememberedValue(paint211110);
                    obj4 = paint211110;
                } else {
                    obj4 = objRememberedValue4;
                    Paint paint211111 = new Paint();
                    paint211111.setAntiAlias(true);
                    paint211111.setTextSize(fMo312toPxR2X_6o2);
                    paint211111.setColor(-1);
                    paint211111.setTextAlign(Paint.Align.LEFT);
                    composerStartRestartGroup.updateRememberedValue(paint211111);
                    obj4 = paint211111;
                }
                obj4 = objRememberedValue4;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint211112 = (Paint) obj4;
                Float fValueOf111110 = Float.valueOf(fMo312toPxR2X_6o2);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged5 = composerStartRestartGroup.changed(fValueOf111110);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged5) {
                    obj5 = objRememberedValue5;
                    Paint paint211113 = new Paint();
                    paint211113.setAntiAlias(true);
                    paint211113.setTextSize(fMo312toPxR2X_6o2);
                    paint211113.setColor(-1);
                    paint211113.setTextAlign(Paint.Align.LEFT);
                    paint211113.setFakeBoldText(true);
                    composerStartRestartGroup.updateRememberedValue(paint211113);
                    obj5 = paint211113;
                } else {
                    obj5 = objRememberedValue5;
                    Paint paint211114 = new Paint();
                    paint211114.setAntiAlias(true);
                    paint211114.setTextSize(fMo312toPxR2X_6o2);
                    paint211114.setColor(-1);
                    paint211114.setTextAlign(Paint.Align.LEFT);
                    paint211114.setFakeBoldText(true);
                    composerStartRestartGroup.updateRememberedValue(paint211114);
                    obj5 = paint211114;
                }
                obj5 = objRememberedValue5;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint11111111110 = (Paint) obj5;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue6 == companion.getEmpty()) {
                    i27 = 2;
                    snapshotMutationPolicy = null;
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j8), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    i27 = 2;
                    snapshotMutationPolicy = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState4 = (MutableState) objRememberedValue6;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i27, snapshotMutationPolicy);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState5 = (MutableState) objRememberedValue7;
                if (chartDrawableData5 != null) {
                    listA = chartDrawableData5.a();
                } else {
                    listA = null;
                }
                if (chartDrawableData6 != null) {
                    listA2 = chartDrawableData6.a();
                } else {
                    listA2 = null;
                }
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged6 = composerStartRestartGroup.changed(listA) | composerStartRestartGroup.changed(listA2);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChanged6) {
                    listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    if (chartDrawableData5 != null) {
                        while (r12.hasNext()) {
                            if (chartXY.getY() != null) {
                                listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                            }
                        }
                        Unit unit1115 = Unit.INSTANCE;
                    }
                    if (chartDrawableData6 != null) {
                        while (r12.hasNext()) {
                            if (chartXY2.getY() != null) {
                                listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                            }
                        }
                        Unit unit1116 = Unit.INSTANCE;
                    }
                    objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    if (chartDrawableData5 != null) {
                        while (r12.hasNext()) {
                            if (chartXY.getY() != null) {
                                listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                            }
                        }
                        Unit unit1117 = Unit.INSTANCE;
                    }
                    if (chartDrawableData6 != null) {
                        while (r12.hasNext()) {
                            if (chartXY2.getY() != null) {
                                listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                            }
                        }
                        Unit unit1118 = Unit.INSTANCE;
                    }
                    objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list1116 = (List) objRememberedValue8;
                State stateRememberUpdatedState1119 = SnapshotStateKt.rememberUpdatedState(list1116, composerStartRestartGroup, 8);
                State stateRememberUpdatedState11110 = SnapshotStateKt.rememberUpdatedState(mutableState3, composerStartRestartGroup, (i6 >> 27) & 14);
                State stateRememberUpdatedState11111 = SnapshotStateKt.rememberUpdatedState(function1111111111, composerStartRestartGroup, (i7 >> 24) & 14);
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1111111110, composerStartRestartGroup, (i7 >> 27) & 14);
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function111111119, composerStartRestartGroup, i22 & 14);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState6 = (MutableState) objRememberedValue9;
                float fMo313toPx0680j_111110 = density10.mo313toPx0680j_4(Dp.m4104constructorimpl(fM4104constructorimpl4 + fM4104constructorimpl5));
                float fMo313toPx0680j_111111 = density10.mo313toPx0680j_4(fM4104constructorimpl4);
                float f11111112 = fM4104constructorimpl4;
                float fMo313toPx0680j_111112 = density10.mo313toPx0680j_4(Dp.m4104constructorimpl(f4));
                float fMo313toPx0680j_111113 = density10.mo313toPx0680j_4(Dp.m4104constructorimpl(Dp.m4104constructorimpl(f7) - fM4104constructorimpl15));
                if (j2 > 0) {
                    fFloatValue = 0.0f;
                } else {
                    fFloatValue = 0.0f;
                }
                float fFloatValue11 = ((Number) mutableState6.getValue()).floatValue() - density10.mo313toPx0680j_4(fM4104constructorimpl5);
                float fMo313toPx0680j_111114 = density10.mo313toPx0680j_4(Dp.m4104constructorimpl(600));
                if (chartDrawableData5 != null) {
                    pointRadiusDp = chartDrawableData5.getPointRadiusDp();
                } else {
                    pointRadiusDp = 0.0f;
                }
                if (chartDrawableData6 != null) {
                    pointRadiusDp2 = chartDrawableData6.getPointRadiusDp();
                } else {
                    pointRadiusDp2 = 0.0f;
                }
                fMo313toPx0680j_4 = density10.mo313toPx0680j_4(Dp.m4104constructorimpl(Math.max(pointRadiusDp, pointRadiusDp2)));
                float f11111113 = 16;
                State stateRememberUpdatedState11112 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(Math.max(4 * fMo313toPx0680j_4, density10.mo313toPx0680j_4(Dp.m4104constructorimpl(f11111113)))), composerStartRestartGroup, 0);
                if (fFloatValue > 0.0f) {
                    j9 = ((long) (fMo313toPx0680j_4 / fFloatValue)) + 1;
                } else {
                    j9 = 0;
                }
                long j11111 = j9;
                jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(minMax.getSecond().longValue() - j2, minMax.getFirst().longValue());
                if (jCoerceAtLeast > minMax.getFirst().longValue()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                float fMax10 = Math.max(viewConfiguration10.getTouchSlop() * 2.0f, density10.mo313toPx0680j_4(Dp.m4104constructorimpl(f11111113)));
                if (chartDrawableData5 != null) {
                    pairF = chartDrawableData5.f();
                } else {
                    pairF = null;
                }
                if (chartDrawableData6 != null) {
                    pairF2 = chartDrawableData6.f();
                } else {
                    pairF2 = null;
                }
                Long lValueOf19 = Long.valueOf(j8);
                Long lValueOf110 = Long.valueOf(j2);
                Pair<Float, Float> pair19 = pairF2;
                Pair<Float, Float> pair110 = pairF;
                objArr = new Object[]{Long.valueOf(j8), minMax, Long.valueOf(jCoerceAtLeast), mutableState5, mutableState4};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged7 = false;
                while (i28 < 5) {
                    zChanged7 |= composerStartRestartGroup.changed(objArr[i28]);
                }
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (zChanged7) {
                    objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                } else {
                    objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i41110 = ((i7 >> 12) & 14) | 4096;
                int i41111 = i7 >> 3;
                EffectsKt.LaunchedEffect(lValueOf19, minMax, lValueOf110, (Function2) objRememberedValue10, composerStartRestartGroup, (i41111 & 896) | i41110 | (i41111 & 112));
                Pair<Long, Long> pairD10 = d(mutableState5);
                objArr2 = new Object[]{mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged8 = false;
                while (i29 < 4) {
                    zChanged8 |= composerStartRestartGroup.changed(objArr2[i29]);
                }
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (zChanged8) {
                    objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                } else {
                    objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(pairD10, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 64);
                Object[] objArr12 = new Object[5];
                if (mutableState3 != null) {
                    value = mutableState3.getValue();
                } else {
                    value = null;
                }
                objArr12[0] = value;
                objArr12[1] = list1116;
                objArr12[2] = Long.valueOf(b(mutableState4));
                objArr12[3] = Long.valueOf(j2);
                objArr12[4] = Long.valueOf(j11111);
                EffectsKt.LaunchedEffect(objArr12, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$4(mutableState3, list1116, j2, j11111, mutableState4, stateRememberUpdatedState11111, null), composerStartRestartGroup, 72);
                Modifier modifierM455height3ABfNKs10 = SizeKt.m455height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4104constructorimpl(f7));
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged9 = composerStartRestartGroup.changed(mutableState6);
                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (zChanged9) {
                    objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p010kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                            m4625invokeozmzZPI(intSize.m4268unboximpl());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                        public final void m4625invokeozmzZPI(long j11112) {
                            mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j11112)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                } else {
                    objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p010kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                            m4625invokeozmzZPI(intSize.m4268unboximpl());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                        public final void m4625invokeozmzZPI(long j11112) {
                            mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j11112)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierPointerInput10 = SuspendingPointerInputFilterKt.pointerInput(OnRemeasuredModifierKt.onSizeChanged(modifierM455height3ABfNKs10, (Function1) objRememberedValue12), new Object[]{Float.valueOf(fFloatValue), Float.valueOf(fMo313toPx0680j_111111), Float.valueOf(fFloatValue11), Float.valueOf(fMo313toPx0680j_111112), Float.valueOf(fMo313toPx0680j_111113), minMax, Long.valueOf(j2), chartScrollSnapUnit3, view10}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$6(fMo313toPx0680j_111111, fFloatValue11, fMo313toPx0680j_111112, fMo313toPx0680j_111113, view10, viewConfiguration10, fFloatValue, minMax, jCoerceAtLeast, z4, fMax10, fMo313toPx0680j_111114, mutableState5, mutableState4, stateRememberUpdatedState11110, stateRememberUpdatedState1119, stateRememberUpdatedState11112, stateRememberUpdatedState11111, stateRememberUpdatedState, chartScrollSnapUnit3, stateRememberUpdatedState2, null));
                MutableState<Integer> mutableState117 = mutableState3;
                Composer composer12 = composerStartRestartGroup;
                CanvasKt.Canvas(modifierPointerInput10, new ChartComposeKt$Chart$7(f11111112, f4, fM4104constructorimpl5, fM4104constructorimpl15, j2, pair110, pair19, i26, paint1111111113, paint1111111116, z3, chartDrawableData5, chartDrawableData6, list4, paint1111111119, minMax, j7, list3, mutableState117, list1116, markerLabelFormat, paint211112, iM1672toArgb8_81llA, mutableState4, fM4104constructorimpl3, xLabelFormat, paint11111111110), composer12, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function10 = function1111111110;
                function11 = function1111111111;
                function12 = function111111119;
                mutableState7 = mutableState117;
                f10 = f7;
                chartDrawableData7 = chartDrawableData5;
                chartDrawableData8 = chartDrawableData6;
                list5 = list3;
                list6 = list4;
                i30 = i26;
                f11 = f8;
                f12 = f9;
                z5 = z3;
                j10 = j8;
                chartScrollSnapUnit4 = chartScrollSnapUnit3;
                j11 = j7;
                f13 = fM4104constructorimpl3;
                composer2 = composer12;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i32 != 0) {
                        f6 = 279.0f;
                    } else {
                        f6 = f;
                    }
                    if (i33 != 0) {
                        chartDrawableData3 = null;
                    } else {
                        chartDrawableData3 = chartDrawableData;
                    }
                    if (i34 != 0) {
                        chartDrawableData4 = null;
                    } else {
                        chartDrawableData4 = chartDrawableData2;
                    }
                    if (i35 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i36 != 0) {
                        listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList2 = list2;
                    }
                    if (i37 != 0) {
                        i25 = 2;
                    } else {
                        i25 = i;
                    }
                    f7 = f6;
                    if (i38 != 0) {
                        fM4104constructorimpl = Dp.m4104constructorimpl(22);
                    } else {
                        fM4104constructorimpl = f2;
                    }
                    if (i39 != 0) {
                        fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                    } else {
                        fM4104constructorimpl2 = f3;
                    }
                    if (i40 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (i41 != 0) {
                        mutableState2 = null;
                    } else {
                        mutableState2 = mutableState;
                    }
                    f8 = fM4104constructorimpl;
                    if ((i5 & 16384) != 0) {
                        jLongValue = minMax.getFirst().longValue();
                        i7 &= -57345;
                    } else {
                        jLongValue = j3;
                    }
                    if (i12 != 0) {
                        chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                    }
                    if (i14 != 0) {
                        j6 = 43200000;
                    } else {
                        j6 = j5;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    } else {
                        function4 = function1;
                    }
                    if (i19 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i21 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    Function1<? super Integer, Unit> function1111111112 = function4;
                    f9 = fM4104constructorimpl2;
                    if (i24 != 0) {
                        fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                    } else {
                        fM4104constructorimpl3 = f5;
                    }
                    chartDrawableData5 = chartDrawableData3;
                    chartDrawableData6 = chartDrawableData4;
                    list3 = listEmptyList;
                    list4 = listEmptyList2;
                    z3 = z2;
                    chartScrollSnapUnit3 = chartScrollSnapUnit2;
                    j7 = j6;
                    function7 = function6;
                    i26 = i25;
                    mutableState3 = mutableState2;
                    j8 = jLongValue;
                    function8 = function1111111112;
                    function9 = function5;
                } else {
                    if (i32 != 0) {
                        f6 = 279.0f;
                    } else {
                        f6 = f;
                    }
                    if (i33 != 0) {
                        chartDrawableData3 = null;
                    } else {
                        chartDrawableData3 = chartDrawableData;
                    }
                    if (i34 != 0) {
                        chartDrawableData4 = null;
                    } else {
                        chartDrawableData4 = chartDrawableData2;
                    }
                    if (i35 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i36 != 0) {
                        listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList2 = list2;
                    }
                    if (i37 != 0) {
                        i25 = 2;
                    } else {
                        i25 = i;
                    }
                    f7 = f6;
                    if (i38 != 0) {
                        fM4104constructorimpl = Dp.m4104constructorimpl(22);
                    } else {
                        fM4104constructorimpl = f2;
                    }
                    if (i39 != 0) {
                        fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                    } else {
                        fM4104constructorimpl2 = f3;
                    }
                    if (i40 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (i41 != 0) {
                        mutableState2 = null;
                    } else {
                        mutableState2 = mutableState;
                    }
                    f8 = fM4104constructorimpl;
                    if ((i5 & 16384) != 0) {
                        jLongValue = minMax.getFirst().longValue();
                        i7 &= -57345;
                    } else {
                        jLongValue = j3;
                    }
                    if (i12 != 0) {
                        chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                    }
                    if (i14 != 0) {
                        j6 = 43200000;
                    } else {
                        j6 = j5;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    } else {
                        function4 = function1;
                    }
                    if (i19 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i21 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    Function1<? super Integer, Unit> function1111111113 = function4;
                    f9 = fM4104constructorimpl2;
                    if (i24 != 0) {
                        fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                    } else {
                        fM4104constructorimpl3 = f5;
                    }
                    chartDrawableData5 = chartDrawableData3;
                    chartDrawableData6 = chartDrawableData4;
                    list3 = listEmptyList;
                    list4 = listEmptyList2;
                    z3 = z2;
                    chartScrollSnapUnit3 = chartScrollSnapUnit2;
                    j7 = j6;
                    function7 = function6;
                    i26 = i25;
                    mutableState3 = mutableState2;
                    j8 = jLongValue;
                    function8 = function1111111113;
                    function9 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-920059604, i6, i7, "com.heytap.health.bodyfat.ui.Chart (ChartCompose.kt:138)");
                }
                if (minMax.getFirst().longValue() == minMax.getSecond().longValue()) {
                    m8b.b("Chart", "min == max; return!");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final float f11111114 = f7;
                    final ChartDrawableData chartDrawableData119 = chartDrawableData5;
                    final ChartDrawableData chartDrawableData1110 = chartDrawableData6;
                    final List<ChartDrawableData> list1117 = list3;
                    final List<ChartDrawableData> list1118 = list4;
                    final int i41112 = i26;
                    final float f11111115 = f8;
                    final float f11111116 = f9;
                    final boolean z16 = z3;
                    final MutableState<Integer> mutableState118 = mutableState3;
                    final Function2<? super Long, ? super ChartScrollDirection, Long> function1111111114 = function7;
                    final Function1<? super Long, Unit> function1111111115 = function9;
                    final Function1<? super Integer, Unit> function1111111116 = function8;
                    final long j11112 = j8;
                    final ChartScrollSnapUnit chartScrollSnapUnit15 = chartScrollSnapUnit3;
                    final long j11113 = j7;
                    final float f11111117 = fM4104constructorimpl3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // p010kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer13, Integer num) {
                            invoke(composer13, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer13, int i41113) {
                            ChartComposeKt.a(f11111114, chartDrawableData119, chartDrawableData1110, list1117, list1118, i41112, f11111115, f11111116, z16, mutableState118, markerLabelFormat, f4, minMax, j2, j11112, chartScrollSnapUnit15, j11113, xLabelFormat, function1111111116, function1111111115, function1111111114, f11111117, composer13, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                        }
                    });
                    return;
                }
                Function2<? super Long, ? super ChartScrollDirection, Long> function1111111117 = function7;
                Function1<? super Long, Unit> function1111111118 = function9;
                Function1<? super Integer, Unit> function1111111119 = function8;
                if (chartDrawableData5 == null) {
                    fM4104constructorimpl4 = Dp.m4104constructorimpl(0);
                } else {
                    fM4104constructorimpl4 = f8;
                }
                if (chartDrawableData6 == null) {
                    fM4104constructorimpl5 = Dp.m4104constructorimpl(0);
                } else {
                    fM4104constructorimpl5 = f9;
                }
                float fM4104constructorimpl16 = Dp.m4104constructorimpl(22);
                Density density11 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                View view11 = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                ViewConfiguration viewConfiguration11 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                iM1672toArgb8_81llA = ColorKt.m1672toArgb8_81llA(ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha55, composerStartRestartGroup, 0));
                fMo312toPxR2X_6o = density11.mo312toPxR2X_6o(TextUnitKt.getSp(10));
                fMo312toPxR2X_6o2 = density11.mo312toPxR2X_6o(TextUnitKt.getSp(12));
                Float fValueOf111111 = Float.valueOf(fMo312toPxR2X_6o);
                Integer numValueOf1111 = Integer.valueOf(iM1672toArgb8_81llA);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(fValueOf111111) | composerStartRestartGroup.changed(numValueOf1111);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    obj = objRememberedValue;
                    Paint paint11111111111 = new Paint();
                    paint11111111111.setAntiAlias(true);
                    paint11111111111.setTextSize(fMo312toPxR2X_6o);
                    paint11111111111.setColor(iM1672toArgb8_81llA);
                    paint11111111111.setTextAlign(Paint.Align.RIGHT);
                    paint11111111111.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint11111111111);
                    obj = paint11111111111;
                } else {
                    obj = objRememberedValue;
                    Paint paint11111111112 = new Paint();
                    paint11111111112.setAntiAlias(true);
                    paint11111111112.setTextSize(fMo312toPxR2X_6o);
                    paint11111111112.setColor(iM1672toArgb8_81llA);
                    paint11111111112.setTextAlign(Paint.Align.RIGHT);
                    paint11111111112.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint11111111112);
                    obj = paint11111111112;
                }
                obj = objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint11111111113 = (Paint) obj;
                Float fValueOf111112 = Float.valueOf(fMo312toPxR2X_6o);
                Integer numValueOf1112 = Integer.valueOf(iM1672toArgb8_81llA);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(fValueOf111112) | composerStartRestartGroup.changed(numValueOf1112);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    obj2 = objRememberedValue2;
                    Paint paint11111111114 = new Paint();
                    paint11111111114.setAntiAlias(true);
                    paint11111111114.setTextSize(fMo312toPxR2X_6o);
                    paint11111111114.setColor(iM1672toArgb8_81llA);
                    paint11111111114.setTextAlign(Paint.Align.RIGHT);
                    paint11111111114.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint11111111114);
                    obj2 = paint11111111114;
                } else {
                    obj2 = objRememberedValue2;
                    Paint paint11111111115 = new Paint();
                    paint11111111115.setAntiAlias(true);
                    paint11111111115.setTextSize(fMo312toPxR2X_6o);
                    paint11111111115.setColor(iM1672toArgb8_81llA);
                    paint11111111115.setTextAlign(Paint.Align.RIGHT);
                    paint11111111115.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint11111111115);
                    obj2 = paint11111111115;
                }
                obj2 = objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint11111111116 = (Paint) obj2;
                Float fValueOf111113 = Float.valueOf(fMo312toPxR2X_6o);
                Integer numValueOf1113 = Integer.valueOf(iM1672toArgb8_81llA);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(fValueOf111113) | composerStartRestartGroup.changed(numValueOf1113);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    obj3 = objRememberedValue3;
                    Paint paint11111111117 = new Paint();
                    paint11111111117.setAntiAlias(true);
                    paint11111111117.setTextSize(fMo312toPxR2X_6o);
                    paint11111111117.setColor(iM1672toArgb8_81llA);
                    paint11111111117.setTextAlign(Paint.Align.CENTER);
                    paint11111111117.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint11111111117);
                    obj3 = paint11111111117;
                } else {
                    obj3 = objRememberedValue3;
                    Paint paint11111111118 = new Paint();
                    paint11111111118.setAntiAlias(true);
                    paint11111111118.setTextSize(fMo312toPxR2X_6o);
                    paint11111111118.setColor(iM1672toArgb8_81llA);
                    paint11111111118.setTextAlign(Paint.Align.CENTER);
                    paint11111111118.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint11111111118);
                    obj3 = paint11111111118;
                }
                obj3 = objRememberedValue3;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint11111111119 = (Paint) obj3;
                Float fValueOf111114 = Float.valueOf(fMo312toPxR2X_6o2);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged4 = composerStartRestartGroup.changed(fValueOf111114);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    obj4 = objRememberedValue4;
                    Paint paint211115 = new Paint();
                    paint211115.setAntiAlias(true);
                    paint211115.setTextSize(fMo312toPxR2X_6o2);
                    paint211115.setColor(-1);
                    paint211115.setTextAlign(Paint.Align.LEFT);
                    composerStartRestartGroup.updateRememberedValue(paint211115);
                    obj4 = paint211115;
                } else {
                    obj4 = objRememberedValue4;
                    Paint paint211116 = new Paint();
                    paint211116.setAntiAlias(true);
                    paint211116.setTextSize(fMo312toPxR2X_6o2);
                    paint211116.setColor(-1);
                    paint211116.setTextAlign(Paint.Align.LEFT);
                    composerStartRestartGroup.updateRememberedValue(paint211116);
                    obj4 = paint211116;
                }
                obj4 = objRememberedValue4;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint211117 = (Paint) obj4;
                Float fValueOf111115 = Float.valueOf(fMo312toPxR2X_6o2);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged5 = composerStartRestartGroup.changed(fValueOf111115);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged5) {
                    obj5 = objRememberedValue5;
                    Paint paint211118 = new Paint();
                    paint211118.setAntiAlias(true);
                    paint211118.setTextSize(fMo312toPxR2X_6o2);
                    paint211118.setColor(-1);
                    paint211118.setTextAlign(Paint.Align.LEFT);
                    paint211118.setFakeBoldText(true);
                    composerStartRestartGroup.updateRememberedValue(paint211118);
                    obj5 = paint211118;
                } else {
                    obj5 = objRememberedValue5;
                    Paint paint211119 = new Paint();
                    paint211119.setAntiAlias(true);
                    paint211119.setTextSize(fMo312toPxR2X_6o2);
                    paint211119.setColor(-1);
                    paint211119.setTextAlign(Paint.Align.LEFT);
                    paint211119.setFakeBoldText(true);
                    composerStartRestartGroup.updateRememberedValue(paint211119);
                    obj5 = paint211119;
                }
                obj5 = objRememberedValue5;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint111111111110 = (Paint) obj5;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue6 == companion.getEmpty()) {
                    i27 = 2;
                    snapshotMutationPolicy = null;
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j8), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    i27 = 2;
                    snapshotMutationPolicy = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState4 = (MutableState) objRememberedValue6;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i27, snapshotMutationPolicy);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState5 = (MutableState) objRememberedValue7;
                if (chartDrawableData5 != null) {
                    listA = chartDrawableData5.a();
                } else {
                    listA = null;
                }
                if (chartDrawableData6 != null) {
                    listA2 = chartDrawableData6.a();
                } else {
                    listA2 = null;
                }
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged6 = composerStartRestartGroup.changed(listA) | composerStartRestartGroup.changed(listA2);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChanged6) {
                    listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    if (chartDrawableData5 != null) {
                        while (r12.hasNext()) {
                            if (chartXY.getY() != null) {
                                listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                            }
                        }
                        Unit unit1119 = Unit.INSTANCE;
                    }
                    if (chartDrawableData6 != null) {
                        while (r12.hasNext()) {
                            if (chartXY2.getY() != null) {
                                listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                            }
                        }
                        Unit unit11110 = Unit.INSTANCE;
                    }
                    objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    if (chartDrawableData5 != null) {
                        while (r12.hasNext()) {
                            if (chartXY.getY() != null) {
                                listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                            }
                        }
                        Unit unit11111 = Unit.INSTANCE;
                    }
                    if (chartDrawableData6 != null) {
                        while (r12.hasNext()) {
                            if (chartXY2.getY() != null) {
                                listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                            }
                        }
                        Unit unit11112 = Unit.INSTANCE;
                    }
                    objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list1119 = (List) objRememberedValue8;
                State stateRememberUpdatedState11113 = SnapshotStateKt.rememberUpdatedState(list1119, composerStartRestartGroup, 8);
                State stateRememberUpdatedState11114 = SnapshotStateKt.rememberUpdatedState(mutableState3, composerStartRestartGroup, (i6 >> 27) & 14);
                State stateRememberUpdatedState11115 = SnapshotStateKt.rememberUpdatedState(function1111111119, composerStartRestartGroup, (i7 >> 24) & 14);
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1111111118, composerStartRestartGroup, (i7 >> 27) & 14);
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function1111111117, composerStartRestartGroup, i22 & 14);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState6 = (MutableState) objRememberedValue9;
                float fMo313toPx0680j_111115 = density11.mo313toPx0680j_4(Dp.m4104constructorimpl(fM4104constructorimpl4 + fM4104constructorimpl5));
                float fMo313toPx0680j_111116 = density11.mo313toPx0680j_4(fM4104constructorimpl4);
                float f11111118 = fM4104constructorimpl4;
                float fMo313toPx0680j_111117 = density11.mo313toPx0680j_4(Dp.m4104constructorimpl(f4));
                float fMo313toPx0680j_111118 = density11.mo313toPx0680j_4(Dp.m4104constructorimpl(Dp.m4104constructorimpl(f7) - fM4104constructorimpl16));
                if (j2 > 0) {
                    fFloatValue = 0.0f;
                } else {
                    fFloatValue = 0.0f;
                }
                float fFloatValue12 = ((Number) mutableState6.getValue()).floatValue() - density11.mo313toPx0680j_4(fM4104constructorimpl5);
                float fMo313toPx0680j_111119 = density11.mo313toPx0680j_4(Dp.m4104constructorimpl(600));
                if (chartDrawableData5 != null) {
                    pointRadiusDp = chartDrawableData5.getPointRadiusDp();
                } else {
                    pointRadiusDp = 0.0f;
                }
                if (chartDrawableData6 != null) {
                    pointRadiusDp2 = chartDrawableData6.getPointRadiusDp();
                } else {
                    pointRadiusDp2 = 0.0f;
                }
                fMo313toPx0680j_4 = density11.mo313toPx0680j_4(Dp.m4104constructorimpl(Math.max(pointRadiusDp, pointRadiusDp2)));
                float f11111119 = 16;
                State stateRememberUpdatedState11116 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(Math.max(4 * fMo313toPx0680j_4, density11.mo313toPx0680j_4(Dp.m4104constructorimpl(f11111119)))), composerStartRestartGroup, 0);
                if (fFloatValue > 0.0f) {
                    j9 = ((long) (fMo313toPx0680j_4 / fFloatValue)) + 1;
                } else {
                    j9 = 0;
                }
                long j11114 = j9;
                jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(minMax.getSecond().longValue() - j2, minMax.getFirst().longValue());
                if (jCoerceAtLeast > minMax.getFirst().longValue()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                float fMax11 = Math.max(viewConfiguration11.getTouchSlop() * 2.0f, density11.mo313toPx0680j_4(Dp.m4104constructorimpl(f11111119)));
                if (chartDrawableData5 != null) {
                    pairF = chartDrawableData5.f();
                } else {
                    pairF = null;
                }
                if (chartDrawableData6 != null) {
                    pairF2 = chartDrawableData6.f();
                } else {
                    pairF2 = null;
                }
                Long lValueOf111 = Long.valueOf(j8);
                Long lValueOf112 = Long.valueOf(j2);
                Pair<Float, Float> pair111 = pairF2;
                Pair<Float, Float> pair112 = pairF;
                objArr = new Object[]{Long.valueOf(j8), minMax, Long.valueOf(jCoerceAtLeast), mutableState5, mutableState4};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged7 = false;
                while (i28 < 5) {
                    zChanged7 |= composerStartRestartGroup.changed(objArr[i28]);
                }
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (zChanged7) {
                    objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                } else {
                    objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i41113 = ((i7 >> 12) & 14) | 4096;
                int i41114 = i7 >> 3;
                EffectsKt.LaunchedEffect(lValueOf111, minMax, lValueOf112, (Function2) objRememberedValue10, composerStartRestartGroup, (i41114 & 896) | i41113 | (i41114 & 112));
                Pair<Long, Long> pairD11 = d(mutableState5);
                objArr2 = new Object[]{mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged8 = false;
                while (i29 < 4) {
                    zChanged8 |= composerStartRestartGroup.changed(objArr2[i29]);
                }
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (zChanged8) {
                    objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                } else {
                    objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(pairD11, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 64);
                Object[] objArr13 = new Object[5];
                if (mutableState3 != null) {
                    value = mutableState3.getValue();
                } else {
                    value = null;
                }
                objArr13[0] = value;
                objArr13[1] = list1119;
                objArr13[2] = Long.valueOf(b(mutableState4));
                objArr13[3] = Long.valueOf(j2);
                objArr13[4] = Long.valueOf(j11114);
                EffectsKt.LaunchedEffect(objArr13, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$4(mutableState3, list1119, j2, j11114, mutableState4, stateRememberUpdatedState11115, null), composerStartRestartGroup, 72);
                Modifier modifierM455height3ABfNKs11 = SizeKt.m455height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4104constructorimpl(f7));
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged9 = composerStartRestartGroup.changed(mutableState6);
                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (zChanged9) {
                    objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p010kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                            m4625invokeozmzZPI(intSize.m4268unboximpl());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                        public final void m4625invokeozmzZPI(long j11115) {
                            mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j11115)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                } else {
                    objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p010kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                            m4625invokeozmzZPI(intSize.m4268unboximpl());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                        public final void m4625invokeozmzZPI(long j11115) {
                            mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j11115)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierPointerInput11 = SuspendingPointerInputFilterKt.pointerInput(OnRemeasuredModifierKt.onSizeChanged(modifierM455height3ABfNKs11, (Function1) objRememberedValue12), new Object[]{Float.valueOf(fFloatValue), Float.valueOf(fMo313toPx0680j_111116), Float.valueOf(fFloatValue12), Float.valueOf(fMo313toPx0680j_111117), Float.valueOf(fMo313toPx0680j_111118), minMax, Long.valueOf(j2), chartScrollSnapUnit3, view11}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$6(fMo313toPx0680j_111116, fFloatValue12, fMo313toPx0680j_111117, fMo313toPx0680j_111118, view11, viewConfiguration11, fFloatValue, minMax, jCoerceAtLeast, z4, fMax11, fMo313toPx0680j_111119, mutableState5, mutableState4, stateRememberUpdatedState11114, stateRememberUpdatedState11113, stateRememberUpdatedState11116, stateRememberUpdatedState11115, stateRememberUpdatedState, chartScrollSnapUnit3, stateRememberUpdatedState2, null));
                MutableState<Integer> mutableState119 = mutableState3;
                Composer composer13 = composerStartRestartGroup;
                CanvasKt.Canvas(modifierPointerInput11, new ChartComposeKt$Chart$7(f11111118, f4, fM4104constructorimpl5, fM4104constructorimpl16, j2, pair112, pair111, i26, paint11111111113, paint11111111116, z3, chartDrawableData5, chartDrawableData6, list4, paint11111111119, minMax, j7, list3, mutableState119, list1119, markerLabelFormat, paint211117, iM1672toArgb8_81llA, mutableState4, fM4104constructorimpl3, xLabelFormat, paint111111111110), composer13, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function10 = function1111111118;
                function11 = function1111111119;
                function12 = function1111111117;
                mutableState7 = mutableState119;
                f10 = f7;
                chartDrawableData7 = chartDrawableData5;
                chartDrawableData8 = chartDrawableData6;
                list5 = list3;
                list6 = list4;
                i30 = i26;
                f11 = f8;
                f12 = f9;
                z5 = z3;
                j10 = j8;
                chartScrollSnapUnit4 = chartScrollSnapUnit3;
                j11 = j7;
                f13 = fM4104constructorimpl3;
                composer2 = composer13;
            }
            scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer14, Integer num) {
                    invoke(composer14, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer14, int i41115) {
                    ChartComposeKt.a(f10, chartDrawableData7, chartDrawableData8, list5, list6, i30, f11, f12, z5, mutableState7, markerLabelFormat, f4, minMax, j2, j10, chartScrollSnapUnit4, j11, xLabelFormat, function11, function10, function12, f13, composer14, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                }
            });
        }
        i7 |= 48;
        if ((i5 & 4096) != 0) {
            i7 |= ModuleType.TYPE_SYSTEM_SETTING;
        } else if ((i3 & 896) == 0) {
            if (composerStartRestartGroup.changed(minMax)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i7 |= i10;
        }
        if ((i5 & 8192) != 0) {
            i7 |= 3072;
        } else if ((i3 & 7168) == 0) {
            if (composerStartRestartGroup.changed(j2)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i7 |= i11;
        }
        if ((57344 & i3) != 0) {
            if ((i5 & 16384) == 0) {
                i31 = 8192;
            } else {
                i31 = 8192;
            }
            i7 |= i31;
        }
        i12 = 32768 & i5;
        if (i12 != 0) {
            i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            chartScrollSnapUnit2 = chartScrollSnapUnit;
        } else {
            chartScrollSnapUnit2 = chartScrollSnapUnit;
            if ((i3 & 458752) == 0) {
                if (composerStartRestartGroup.changed(chartScrollSnapUnit2)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i7 |= i13;
            }
        }
        i14 = i5 & 65536;
        if (i14 != 0) {
            i7 |= 1572864;
            j5 = j4;
        } else {
            j5 = j4;
            if ((i3 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(j5)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i7 |= i15;
            }
        }
        if ((i5 & 131072) != 0) {
            if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(xLabelFormat)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
            }
            i17 = i5 & 262144;
            if (i17 != 0) {
                i7 |= 100663296;
            } else if ((i3 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i7 |= i18;
            }
            i19 = i5 & 524288;
            if (i19 != 0) {
                i7 |= 805306368;
            } else if ((i3 & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i7 |= i20;
            }
            i21 = i5 & 1048576;
            if (i21 != 0) {
                i22 = i4 | 6;
            } else if ((i4 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i4 | i23;
            } else {
                i22 = i4;
            }
            i24 = i5 & 2097152;
            if (i24 != 0) {
                i22 |= 48;
            } else if ((i4 & 112) == 0) {
                i22 |= composerStartRestartGroup.changed(f5) ? 32 : 16;
            }
            if ((i5 & 30) != 30) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i32 != 0) {
                        f6 = 279.0f;
                    } else {
                        f6 = f;
                    }
                    if (i33 != 0) {
                        chartDrawableData3 = null;
                    } else {
                        chartDrawableData3 = chartDrawableData;
                    }
                    if (i34 != 0) {
                        chartDrawableData4 = null;
                    } else {
                        chartDrawableData4 = chartDrawableData2;
                    }
                    if (i35 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i36 != 0) {
                        listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList2 = list2;
                    }
                    if (i37 != 0) {
                        i25 = 2;
                    } else {
                        i25 = i;
                    }
                    f7 = f6;
                    if (i38 != 0) {
                        fM4104constructorimpl = Dp.m4104constructorimpl(22);
                    } else {
                        fM4104constructorimpl = f2;
                    }
                    if (i39 != 0) {
                        fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                    } else {
                        fM4104constructorimpl2 = f3;
                    }
                    if (i40 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (i41 != 0) {
                        mutableState2 = null;
                    } else {
                        mutableState2 = mutableState;
                    }
                    f8 = fM4104constructorimpl;
                    if ((i5 & 16384) != 0) {
                        jLongValue = minMax.getFirst().longValue();
                        i7 &= -57345;
                    } else {
                        jLongValue = j3;
                    }
                    if (i12 != 0) {
                        chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                    }
                    if (i14 != 0) {
                        j6 = 43200000;
                    } else {
                        j6 = j5;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    } else {
                        function4 = function1;
                    }
                    if (i19 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i21 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    Function1<? super Integer, Unit> function11111111110 = function4;
                    f9 = fM4104constructorimpl2;
                    if (i24 != 0) {
                        fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                    } else {
                        fM4104constructorimpl3 = f5;
                    }
                    chartDrawableData5 = chartDrawableData3;
                    chartDrawableData6 = chartDrawableData4;
                    list3 = listEmptyList;
                    list4 = listEmptyList2;
                    z3 = z2;
                    chartScrollSnapUnit3 = chartScrollSnapUnit2;
                    j7 = j6;
                    function7 = function6;
                    i26 = i25;
                    mutableState3 = mutableState2;
                    j8 = jLongValue;
                    function8 = function11111111110;
                    function9 = function5;
                } else {
                    if (i32 != 0) {
                        f6 = 279.0f;
                    } else {
                        f6 = f;
                    }
                    if (i33 != 0) {
                        chartDrawableData3 = null;
                    } else {
                        chartDrawableData3 = chartDrawableData;
                    }
                    if (i34 != 0) {
                        chartDrawableData4 = null;
                    } else {
                        chartDrawableData4 = chartDrawableData2;
                    }
                    if (i35 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i36 != 0) {
                        listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList2 = list2;
                    }
                    if (i37 != 0) {
                        i25 = 2;
                    } else {
                        i25 = i;
                    }
                    f7 = f6;
                    if (i38 != 0) {
                        fM4104constructorimpl = Dp.m4104constructorimpl(22);
                    } else {
                        fM4104constructorimpl = f2;
                    }
                    if (i39 != 0) {
                        fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                    } else {
                        fM4104constructorimpl2 = f3;
                    }
                    if (i40 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (i41 != 0) {
                        mutableState2 = null;
                    } else {
                        mutableState2 = mutableState;
                    }
                    f8 = fM4104constructorimpl;
                    if ((i5 & 16384) != 0) {
                        jLongValue = minMax.getFirst().longValue();
                        i7 &= -57345;
                    } else {
                        jLongValue = j3;
                    }
                    if (i12 != 0) {
                        chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                    }
                    if (i14 != 0) {
                        j6 = 43200000;
                    } else {
                        j6 = j5;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    } else {
                        function4 = function1;
                    }
                    if (i19 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i21 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    Function1<? super Integer, Unit> function11111111111 = function4;
                    f9 = fM4104constructorimpl2;
                    if (i24 != 0) {
                        fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                    } else {
                        fM4104constructorimpl3 = f5;
                    }
                    chartDrawableData5 = chartDrawableData3;
                    chartDrawableData6 = chartDrawableData4;
                    list3 = listEmptyList;
                    list4 = listEmptyList2;
                    z3 = z2;
                    chartScrollSnapUnit3 = chartScrollSnapUnit2;
                    j7 = j6;
                    function7 = function6;
                    i26 = i25;
                    mutableState3 = mutableState2;
                    j8 = jLongValue;
                    function8 = function11111111111;
                    function9 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-920059604, i6, i7, "com.heytap.health.bodyfat.ui.Chart (ChartCompose.kt:138)");
                }
                if (minMax.getFirst().longValue() == minMax.getSecond().longValue()) {
                    m8b.b("Chart", "min == max; return!");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final float f111111110 = f7;
                    final ChartDrawableData chartDrawableData1111 = chartDrawableData5;
                    final ChartDrawableData chartDrawableData1112 = chartDrawableData6;
                    final List<ChartDrawableData> list11110 = list3;
                    final List<ChartDrawableData> list11111 = list4;
                    final int i41115 = i26;
                    final float f111111111 = f8;
                    final float f111111112 = f9;
                    final boolean z17 = z3;
                    final MutableState<Integer> mutableState1110 = mutableState3;
                    final Function2<? super Long, ? super ChartScrollDirection, Long> function11111111112 = function7;
                    final Function1<? super Long, Unit> function11111111113 = function9;
                    final Function1<? super Integer, Unit> function11111111114 = function8;
                    final long j11115 = j8;
                    final ChartScrollSnapUnit chartScrollSnapUnit16 = chartScrollSnapUnit3;
                    final long j11116 = j7;
                    final float f111111113 = fM4104constructorimpl3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // p010kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer14, Integer num) {
                            invoke(composer14, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer14, int i41116) {
                            ChartComposeKt.a(f111111110, chartDrawableData1111, chartDrawableData1112, list11110, list11111, i41115, f111111111, f111111112, z17, mutableState1110, markerLabelFormat, f4, minMax, j2, j11115, chartScrollSnapUnit16, j11116, xLabelFormat, function11111111114, function11111111113, function11111111112, f111111113, composer14, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                        }
                    });
                    return;
                }
                Function2<? super Long, ? super ChartScrollDirection, Long> function11111111115 = function7;
                Function1<? super Long, Unit> function11111111116 = function9;
                Function1<? super Integer, Unit> function11111111117 = function8;
                if (chartDrawableData5 == null) {
                    fM4104constructorimpl4 = Dp.m4104constructorimpl(0);
                } else {
                    fM4104constructorimpl4 = f8;
                }
                if (chartDrawableData6 == null) {
                    fM4104constructorimpl5 = Dp.m4104constructorimpl(0);
                } else {
                    fM4104constructorimpl5 = f9;
                }
                float fM4104constructorimpl17 = Dp.m4104constructorimpl(22);
                Density density12 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                View view12 = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                ViewConfiguration viewConfiguration12 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                iM1672toArgb8_81llA = ColorKt.m1672toArgb8_81llA(ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha55, composerStartRestartGroup, 0));
                fMo312toPxR2X_6o = density12.mo312toPxR2X_6o(TextUnitKt.getSp(10));
                fMo312toPxR2X_6o2 = density12.mo312toPxR2X_6o(TextUnitKt.getSp(12));
                Float fValueOf111116 = Float.valueOf(fMo312toPxR2X_6o);
                Integer numValueOf1114 = Integer.valueOf(iM1672toArgb8_81llA);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(fValueOf111116) | composerStartRestartGroup.changed(numValueOf1114);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    obj = objRememberedValue;
                    Paint paint111111111111 = new Paint();
                    paint111111111111.setAntiAlias(true);
                    paint111111111111.setTextSize(fMo312toPxR2X_6o);
                    paint111111111111.setColor(iM1672toArgb8_81llA);
                    paint111111111111.setTextAlign(Paint.Align.RIGHT);
                    paint111111111111.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint111111111111);
                    obj = paint111111111111;
                } else {
                    obj = objRememberedValue;
                    Paint paint111111111112 = new Paint();
                    paint111111111112.setAntiAlias(true);
                    paint111111111112.setTextSize(fMo312toPxR2X_6o);
                    paint111111111112.setColor(iM1672toArgb8_81llA);
                    paint111111111112.setTextAlign(Paint.Align.RIGHT);
                    paint111111111112.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint111111111112);
                    obj = paint111111111112;
                }
                obj = objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint111111111113 = (Paint) obj;
                Float fValueOf111117 = Float.valueOf(fMo312toPxR2X_6o);
                Integer numValueOf1115 = Integer.valueOf(iM1672toArgb8_81llA);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(fValueOf111117) | composerStartRestartGroup.changed(numValueOf1115);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    obj2 = objRememberedValue2;
                    Paint paint111111111114 = new Paint();
                    paint111111111114.setAntiAlias(true);
                    paint111111111114.setTextSize(fMo312toPxR2X_6o);
                    paint111111111114.setColor(iM1672toArgb8_81llA);
                    paint111111111114.setTextAlign(Paint.Align.RIGHT);
                    paint111111111114.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint111111111114);
                    obj2 = paint111111111114;
                } else {
                    obj2 = objRememberedValue2;
                    Paint paint111111111115 = new Paint();
                    paint111111111115.setAntiAlias(true);
                    paint111111111115.setTextSize(fMo312toPxR2X_6o);
                    paint111111111115.setColor(iM1672toArgb8_81llA);
                    paint111111111115.setTextAlign(Paint.Align.RIGHT);
                    paint111111111115.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint111111111115);
                    obj2 = paint111111111115;
                }
                obj2 = objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint111111111116 = (Paint) obj2;
                Float fValueOf111118 = Float.valueOf(fMo312toPxR2X_6o);
                Integer numValueOf1116 = Integer.valueOf(iM1672toArgb8_81llA);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(fValueOf111118) | composerStartRestartGroup.changed(numValueOf1116);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    obj3 = objRememberedValue3;
                    Paint paint111111111117 = new Paint();
                    paint111111111117.setAntiAlias(true);
                    paint111111111117.setTextSize(fMo312toPxR2X_6o);
                    paint111111111117.setColor(iM1672toArgb8_81llA);
                    paint111111111117.setTextAlign(Paint.Align.CENTER);
                    paint111111111117.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint111111111117);
                    obj3 = paint111111111117;
                } else {
                    obj3 = objRememberedValue3;
                    Paint paint111111111118 = new Paint();
                    paint111111111118.setAntiAlias(true);
                    paint111111111118.setTextSize(fMo312toPxR2X_6o);
                    paint111111111118.setColor(iM1672toArgb8_81llA);
                    paint111111111118.setTextAlign(Paint.Align.CENTER);
                    paint111111111118.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint111111111118);
                    obj3 = paint111111111118;
                }
                obj3 = objRememberedValue3;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint111111111119 = (Paint) obj3;
                Float fValueOf111119 = Float.valueOf(fMo312toPxR2X_6o2);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged4 = composerStartRestartGroup.changed(fValueOf111119);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    obj4 = objRememberedValue4;
                    Paint paint2111110 = new Paint();
                    paint2111110.setAntiAlias(true);
                    paint2111110.setTextSize(fMo312toPxR2X_6o2);
                    paint2111110.setColor(-1);
                    paint2111110.setTextAlign(Paint.Align.LEFT);
                    composerStartRestartGroup.updateRememberedValue(paint2111110);
                    obj4 = paint2111110;
                } else {
                    obj4 = objRememberedValue4;
                    Paint paint2111111 = new Paint();
                    paint2111111.setAntiAlias(true);
                    paint2111111.setTextSize(fMo312toPxR2X_6o2);
                    paint2111111.setColor(-1);
                    paint2111111.setTextAlign(Paint.Align.LEFT);
                    composerStartRestartGroup.updateRememberedValue(paint2111111);
                    obj4 = paint2111111;
                }
                obj4 = objRememberedValue4;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint2111112 = (Paint) obj4;
                Float fValueOf1111110 = Float.valueOf(fMo312toPxR2X_6o2);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged5 = composerStartRestartGroup.changed(fValueOf1111110);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged5) {
                    obj5 = objRememberedValue5;
                    Paint paint2111113 = new Paint();
                    paint2111113.setAntiAlias(true);
                    paint2111113.setTextSize(fMo312toPxR2X_6o2);
                    paint2111113.setColor(-1);
                    paint2111113.setTextAlign(Paint.Align.LEFT);
                    paint2111113.setFakeBoldText(true);
                    composerStartRestartGroup.updateRememberedValue(paint2111113);
                    obj5 = paint2111113;
                } else {
                    obj5 = objRememberedValue5;
                    Paint paint2111114 = new Paint();
                    paint2111114.setAntiAlias(true);
                    paint2111114.setTextSize(fMo312toPxR2X_6o2);
                    paint2111114.setColor(-1);
                    paint2111114.setTextAlign(Paint.Align.LEFT);
                    paint2111114.setFakeBoldText(true);
                    composerStartRestartGroup.updateRememberedValue(paint2111114);
                    obj5 = paint2111114;
                }
                obj5 = objRememberedValue5;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint1111111111110 = (Paint) obj5;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue6 == companion.getEmpty()) {
                    i27 = 2;
                    snapshotMutationPolicy = null;
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j8), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    i27 = 2;
                    snapshotMutationPolicy = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState4 = (MutableState) objRememberedValue6;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i27, snapshotMutationPolicy);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState5 = (MutableState) objRememberedValue7;
                if (chartDrawableData5 != null) {
                    listA = chartDrawableData5.a();
                } else {
                    listA = null;
                }
                if (chartDrawableData6 != null) {
                    listA2 = chartDrawableData6.a();
                } else {
                    listA2 = null;
                }
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged6 = composerStartRestartGroup.changed(listA) | composerStartRestartGroup.changed(listA2);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChanged6) {
                    listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    if (chartDrawableData5 != null) {
                        while (r12.hasNext()) {
                            if (chartXY.getY() != null) {
                                listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                            }
                        }
                        Unit unit11113 = Unit.INSTANCE;
                    }
                    if (chartDrawableData6 != null) {
                        while (r12.hasNext()) {
                            if (chartXY2.getY() != null) {
                                listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                            }
                        }
                        Unit unit11114 = Unit.INSTANCE;
                    }
                    objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    if (chartDrawableData5 != null) {
                        while (r12.hasNext()) {
                            if (chartXY.getY() != null) {
                                listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                            }
                        }
                        Unit unit11115 = Unit.INSTANCE;
                    }
                    if (chartDrawableData6 != null) {
                        while (r12.hasNext()) {
                            if (chartXY2.getY() != null) {
                                listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                            }
                        }
                        Unit unit11116 = Unit.INSTANCE;
                    }
                    objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list11112 = (List) objRememberedValue8;
                State stateRememberUpdatedState11117 = SnapshotStateKt.rememberUpdatedState(list11112, composerStartRestartGroup, 8);
                State stateRememberUpdatedState11118 = SnapshotStateKt.rememberUpdatedState(mutableState3, composerStartRestartGroup, (i6 >> 27) & 14);
                State stateRememberUpdatedState11119 = SnapshotStateKt.rememberUpdatedState(function11111111117, composerStartRestartGroup, (i7 >> 24) & 14);
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function11111111116, composerStartRestartGroup, (i7 >> 27) & 14);
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function11111111115, composerStartRestartGroup, i22 & 14);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState6 = (MutableState) objRememberedValue9;
                float fMo313toPx0680j_1111110 = density12.mo313toPx0680j_4(Dp.m4104constructorimpl(fM4104constructorimpl4 + fM4104constructorimpl5));
                float fMo313toPx0680j_1111111 = density12.mo313toPx0680j_4(fM4104constructorimpl4);
                float f111111114 = fM4104constructorimpl4;
                float fMo313toPx0680j_1111112 = density12.mo313toPx0680j_4(Dp.m4104constructorimpl(f4));
                float fMo313toPx0680j_1111113 = density12.mo313toPx0680j_4(Dp.m4104constructorimpl(Dp.m4104constructorimpl(f7) - fM4104constructorimpl17));
                if (j2 > 0) {
                    fFloatValue = 0.0f;
                } else {
                    fFloatValue = 0.0f;
                }
                float fFloatValue13 = ((Number) mutableState6.getValue()).floatValue() - density12.mo313toPx0680j_4(fM4104constructorimpl5);
                float fMo313toPx0680j_1111114 = density12.mo313toPx0680j_4(Dp.m4104constructorimpl(600));
                if (chartDrawableData5 != null) {
                    pointRadiusDp = chartDrawableData5.getPointRadiusDp();
                } else {
                    pointRadiusDp = 0.0f;
                }
                if (chartDrawableData6 != null) {
                    pointRadiusDp2 = chartDrawableData6.getPointRadiusDp();
                } else {
                    pointRadiusDp2 = 0.0f;
                }
                fMo313toPx0680j_4 = density12.mo313toPx0680j_4(Dp.m4104constructorimpl(Math.max(pointRadiusDp, pointRadiusDp2)));
                float f111111115 = 16;
                State stateRememberUpdatedState111110 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(Math.max(4 * fMo313toPx0680j_4, density12.mo313toPx0680j_4(Dp.m4104constructorimpl(f111111115)))), composerStartRestartGroup, 0);
                if (fFloatValue > 0.0f) {
                    j9 = ((long) (fMo313toPx0680j_4 / fFloatValue)) + 1;
                } else {
                    j9 = 0;
                }
                long j11117 = j9;
                jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(minMax.getSecond().longValue() - j2, minMax.getFirst().longValue());
                if (jCoerceAtLeast > minMax.getFirst().longValue()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                float fMax12 = Math.max(viewConfiguration12.getTouchSlop() * 2.0f, density12.mo313toPx0680j_4(Dp.m4104constructorimpl(f111111115)));
                if (chartDrawableData5 != null) {
                    pairF = chartDrawableData5.f();
                } else {
                    pairF = null;
                }
                if (chartDrawableData6 != null) {
                    pairF2 = chartDrawableData6.f();
                } else {
                    pairF2 = null;
                }
                Long lValueOf113 = Long.valueOf(j8);
                Long lValueOf114 = Long.valueOf(j2);
                Pair<Float, Float> pair113 = pairF2;
                Pair<Float, Float> pair114 = pairF;
                objArr = new Object[]{Long.valueOf(j8), minMax, Long.valueOf(jCoerceAtLeast), mutableState5, mutableState4};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged7 = false;
                while (i28 < 5) {
                    zChanged7 |= composerStartRestartGroup.changed(objArr[i28]);
                }
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (zChanged7) {
                    objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                } else {
                    objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i41116 = ((i7 >> 12) & 14) | 4096;
                int i41117 = i7 >> 3;
                EffectsKt.LaunchedEffect(lValueOf113, minMax, lValueOf114, (Function2) objRememberedValue10, composerStartRestartGroup, (i41117 & 896) | i41116 | (i41117 & 112));
                Pair<Long, Long> pairD12 = d(mutableState5);
                objArr2 = new Object[]{mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged8 = false;
                while (i29 < 4) {
                    zChanged8 |= composerStartRestartGroup.changed(objArr2[i29]);
                }
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (zChanged8) {
                    objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                } else {
                    objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(pairD12, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 64);
                Object[] objArr14 = new Object[5];
                if (mutableState3 != null) {
                    value = mutableState3.getValue();
                } else {
                    value = null;
                }
                objArr14[0] = value;
                objArr14[1] = list11112;
                objArr14[2] = Long.valueOf(b(mutableState4));
                objArr14[3] = Long.valueOf(j2);
                objArr14[4] = Long.valueOf(j11117);
                EffectsKt.LaunchedEffect(objArr14, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$4(mutableState3, list11112, j2, j11117, mutableState4, stateRememberUpdatedState11119, null), composerStartRestartGroup, 72);
                Modifier modifierM455height3ABfNKs12 = SizeKt.m455height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4104constructorimpl(f7));
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged9 = composerStartRestartGroup.changed(mutableState6);
                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (zChanged9) {
                    objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p010kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                            m4625invokeozmzZPI(intSize.m4268unboximpl());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                        public final void m4625invokeozmzZPI(long j11118) {
                            mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j11118)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                } else {
                    objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p010kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                            m4625invokeozmzZPI(intSize.m4268unboximpl());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                        public final void m4625invokeozmzZPI(long j11118) {
                            mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j11118)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierPointerInput12 = SuspendingPointerInputFilterKt.pointerInput(OnRemeasuredModifierKt.onSizeChanged(modifierM455height3ABfNKs12, (Function1) objRememberedValue12), new Object[]{Float.valueOf(fFloatValue), Float.valueOf(fMo313toPx0680j_1111111), Float.valueOf(fFloatValue13), Float.valueOf(fMo313toPx0680j_1111112), Float.valueOf(fMo313toPx0680j_1111113), minMax, Long.valueOf(j2), chartScrollSnapUnit3, view12}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$6(fMo313toPx0680j_1111111, fFloatValue13, fMo313toPx0680j_1111112, fMo313toPx0680j_1111113, view12, viewConfiguration12, fFloatValue, minMax, jCoerceAtLeast, z4, fMax12, fMo313toPx0680j_1111114, mutableState5, mutableState4, stateRememberUpdatedState11118, stateRememberUpdatedState11117, stateRememberUpdatedState111110, stateRememberUpdatedState11119, stateRememberUpdatedState, chartScrollSnapUnit3, stateRememberUpdatedState2, null));
                MutableState<Integer> mutableState1111 = mutableState3;
                Composer composer14 = composerStartRestartGroup;
                CanvasKt.Canvas(modifierPointerInput12, new ChartComposeKt$Chart$7(f111111114, f4, fM4104constructorimpl5, fM4104constructorimpl17, j2, pair114, pair113, i26, paint111111111113, paint111111111116, z3, chartDrawableData5, chartDrawableData6, list4, paint111111111119, minMax, j7, list3, mutableState1111, list11112, markerLabelFormat, paint2111112, iM1672toArgb8_81llA, mutableState4, fM4104constructorimpl3, xLabelFormat, paint1111111111110), composer14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function10 = function11111111116;
                function11 = function11111111117;
                function12 = function11111111115;
                mutableState7 = mutableState1111;
                f10 = f7;
                chartDrawableData7 = chartDrawableData5;
                chartDrawableData8 = chartDrawableData6;
                list5 = list3;
                list6 = list4;
                i30 = i26;
                f11 = f8;
                f12 = f9;
                z5 = z3;
                j10 = j8;
                chartScrollSnapUnit4 = chartScrollSnapUnit3;
                j11 = j7;
                f13 = fM4104constructorimpl3;
                composer2 = composer14;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i32 != 0) {
                        f6 = 279.0f;
                    } else {
                        f6 = f;
                    }
                    if (i33 != 0) {
                        chartDrawableData3 = null;
                    } else {
                        chartDrawableData3 = chartDrawableData;
                    }
                    if (i34 != 0) {
                        chartDrawableData4 = null;
                    } else {
                        chartDrawableData4 = chartDrawableData2;
                    }
                    if (i35 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i36 != 0) {
                        listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList2 = list2;
                    }
                    if (i37 != 0) {
                        i25 = 2;
                    } else {
                        i25 = i;
                    }
                    f7 = f6;
                    if (i38 != 0) {
                        fM4104constructorimpl = Dp.m4104constructorimpl(22);
                    } else {
                        fM4104constructorimpl = f2;
                    }
                    if (i39 != 0) {
                        fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                    } else {
                        fM4104constructorimpl2 = f3;
                    }
                    if (i40 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (i41 != 0) {
                        mutableState2 = null;
                    } else {
                        mutableState2 = mutableState;
                    }
                    f8 = fM4104constructorimpl;
                    if ((i5 & 16384) != 0) {
                        jLongValue = minMax.getFirst().longValue();
                        i7 &= -57345;
                    } else {
                        jLongValue = j3;
                    }
                    if (i12 != 0) {
                        chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                    }
                    if (i14 != 0) {
                        j6 = 43200000;
                    } else {
                        j6 = j5;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    } else {
                        function4 = function1;
                    }
                    if (i19 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i21 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    Function1<? super Integer, Unit> function11111111118 = function4;
                    f9 = fM4104constructorimpl2;
                    if (i24 != 0) {
                        fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                    } else {
                        fM4104constructorimpl3 = f5;
                    }
                    chartDrawableData5 = chartDrawableData3;
                    chartDrawableData6 = chartDrawableData4;
                    list3 = listEmptyList;
                    list4 = listEmptyList2;
                    z3 = z2;
                    chartScrollSnapUnit3 = chartScrollSnapUnit2;
                    j7 = j6;
                    function7 = function6;
                    i26 = i25;
                    mutableState3 = mutableState2;
                    j8 = jLongValue;
                    function8 = function11111111118;
                    function9 = function5;
                } else {
                    if (i32 != 0) {
                        f6 = 279.0f;
                    } else {
                        f6 = f;
                    }
                    if (i33 != 0) {
                        chartDrawableData3 = null;
                    } else {
                        chartDrawableData3 = chartDrawableData;
                    }
                    if (i34 != 0) {
                        chartDrawableData4 = null;
                    } else {
                        chartDrawableData4 = chartDrawableData2;
                    }
                    if (i35 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i36 != 0) {
                        listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList2 = list2;
                    }
                    if (i37 != 0) {
                        i25 = 2;
                    } else {
                        i25 = i;
                    }
                    f7 = f6;
                    if (i38 != 0) {
                        fM4104constructorimpl = Dp.m4104constructorimpl(22);
                    } else {
                        fM4104constructorimpl = f2;
                    }
                    if (i39 != 0) {
                        fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                    } else {
                        fM4104constructorimpl2 = f3;
                    }
                    if (i40 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (i41 != 0) {
                        mutableState2 = null;
                    } else {
                        mutableState2 = mutableState;
                    }
                    f8 = fM4104constructorimpl;
                    if ((i5 & 16384) != 0) {
                        jLongValue = minMax.getFirst().longValue();
                        i7 &= -57345;
                    } else {
                        jLongValue = j3;
                    }
                    if (i12 != 0) {
                        chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                    }
                    if (i14 != 0) {
                        j6 = 43200000;
                    } else {
                        j6 = j5;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    } else {
                        function4 = function1;
                    }
                    if (i19 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i21 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    Function1<? super Integer, Unit> function11111111119 = function4;
                    f9 = fM4104constructorimpl2;
                    if (i24 != 0) {
                        fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                    } else {
                        fM4104constructorimpl3 = f5;
                    }
                    chartDrawableData5 = chartDrawableData3;
                    chartDrawableData6 = chartDrawableData4;
                    list3 = listEmptyList;
                    list4 = listEmptyList2;
                    z3 = z2;
                    chartScrollSnapUnit3 = chartScrollSnapUnit2;
                    j7 = j6;
                    function7 = function6;
                    i26 = i25;
                    mutableState3 = mutableState2;
                    j8 = jLongValue;
                    function8 = function11111111119;
                    function9 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-920059604, i6, i7, "com.heytap.health.bodyfat.ui.Chart (ChartCompose.kt:138)");
                }
                if (minMax.getFirst().longValue() == minMax.getSecond().longValue()) {
                    m8b.b("Chart", "min == max; return!");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final float f111111116 = f7;
                    final ChartDrawableData chartDrawableData1113 = chartDrawableData5;
                    final ChartDrawableData chartDrawableData1114 = chartDrawableData6;
                    final List<ChartDrawableData> list11113 = list3;
                    final List<ChartDrawableData> list11114 = list4;
                    final int i41118 = i26;
                    final float f111111117 = f8;
                    final float f111111118 = f9;
                    final boolean z18 = z3;
                    final MutableState<Integer> mutableState1112 = mutableState3;
                    final Function2<? super Long, ? super ChartScrollDirection, Long> function111111111110 = function7;
                    final Function1<? super Long, Unit> function111111111111 = function9;
                    final Function1<? super Integer, Unit> function111111111112 = function8;
                    final long j11118 = j8;
                    final ChartScrollSnapUnit chartScrollSnapUnit17 = chartScrollSnapUnit3;
                    final long j11119 = j7;
                    final float f111111119 = fM4104constructorimpl3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // p010kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer15, Integer num) {
                            invoke(composer15, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer15, int i41119) {
                            ChartComposeKt.a(f111111116, chartDrawableData1113, chartDrawableData1114, list11113, list11114, i41118, f111111117, f111111118, z18, mutableState1112, markerLabelFormat, f4, minMax, j2, j11118, chartScrollSnapUnit17, j11119, xLabelFormat, function111111111112, function111111111111, function111111111110, f111111119, composer15, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                        }
                    });
                    return;
                }
                Function2<? super Long, ? super ChartScrollDirection, Long> function111111111113 = function7;
                Function1<? super Long, Unit> function111111111114 = function9;
                Function1<? super Integer, Unit> function111111111115 = function8;
                if (chartDrawableData5 == null) {
                    fM4104constructorimpl4 = Dp.m4104constructorimpl(0);
                } else {
                    fM4104constructorimpl4 = f8;
                }
                if (chartDrawableData6 == null) {
                    fM4104constructorimpl5 = Dp.m4104constructorimpl(0);
                } else {
                    fM4104constructorimpl5 = f9;
                }
                float fM4104constructorimpl18 = Dp.m4104constructorimpl(22);
                Density density13 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                View view13 = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                ViewConfiguration viewConfiguration13 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                iM1672toArgb8_81llA = ColorKt.m1672toArgb8_81llA(ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha55, composerStartRestartGroup, 0));
                fMo312toPxR2X_6o = density13.mo312toPxR2X_6o(TextUnitKt.getSp(10));
                fMo312toPxR2X_6o2 = density13.mo312toPxR2X_6o(TextUnitKt.getSp(12));
                Float fValueOf1111111 = Float.valueOf(fMo312toPxR2X_6o);
                Integer numValueOf1117 = Integer.valueOf(iM1672toArgb8_81llA);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(fValueOf1111111) | composerStartRestartGroup.changed(numValueOf1117);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    obj = objRememberedValue;
                    Paint paint1111111111111 = new Paint();
                    paint1111111111111.setAntiAlias(true);
                    paint1111111111111.setTextSize(fMo312toPxR2X_6o);
                    paint1111111111111.setColor(iM1672toArgb8_81llA);
                    paint1111111111111.setTextAlign(Paint.Align.RIGHT);
                    paint1111111111111.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint1111111111111);
                    obj = paint1111111111111;
                } else {
                    obj = objRememberedValue;
                    Paint paint1111111111112 = new Paint();
                    paint1111111111112.setAntiAlias(true);
                    paint1111111111112.setTextSize(fMo312toPxR2X_6o);
                    paint1111111111112.setColor(iM1672toArgb8_81llA);
                    paint1111111111112.setTextAlign(Paint.Align.RIGHT);
                    paint1111111111112.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint1111111111112);
                    obj = paint1111111111112;
                }
                obj = objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint1111111111113 = (Paint) obj;
                Float fValueOf1111112 = Float.valueOf(fMo312toPxR2X_6o);
                Integer numValueOf1118 = Integer.valueOf(iM1672toArgb8_81llA);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(fValueOf1111112) | composerStartRestartGroup.changed(numValueOf1118);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    obj2 = objRememberedValue2;
                    Paint paint1111111111114 = new Paint();
                    paint1111111111114.setAntiAlias(true);
                    paint1111111111114.setTextSize(fMo312toPxR2X_6o);
                    paint1111111111114.setColor(iM1672toArgb8_81llA);
                    paint1111111111114.setTextAlign(Paint.Align.RIGHT);
                    paint1111111111114.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint1111111111114);
                    obj2 = paint1111111111114;
                } else {
                    obj2 = objRememberedValue2;
                    Paint paint1111111111115 = new Paint();
                    paint1111111111115.setAntiAlias(true);
                    paint1111111111115.setTextSize(fMo312toPxR2X_6o);
                    paint1111111111115.setColor(iM1672toArgb8_81llA);
                    paint1111111111115.setTextAlign(Paint.Align.RIGHT);
                    paint1111111111115.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint1111111111115);
                    obj2 = paint1111111111115;
                }
                obj2 = objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint1111111111116 = (Paint) obj2;
                Float fValueOf1111113 = Float.valueOf(fMo312toPxR2X_6o);
                Integer numValueOf1119 = Integer.valueOf(iM1672toArgb8_81llA);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(fValueOf1111113) | composerStartRestartGroup.changed(numValueOf1119);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    obj3 = objRememberedValue3;
                    Paint paint1111111111117 = new Paint();
                    paint1111111111117.setAntiAlias(true);
                    paint1111111111117.setTextSize(fMo312toPxR2X_6o);
                    paint1111111111117.setColor(iM1672toArgb8_81llA);
                    paint1111111111117.setTextAlign(Paint.Align.CENTER);
                    paint1111111111117.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint1111111111117);
                    obj3 = paint1111111111117;
                } else {
                    obj3 = objRememberedValue3;
                    Paint paint1111111111118 = new Paint();
                    paint1111111111118.setAntiAlias(true);
                    paint1111111111118.setTextSize(fMo312toPxR2X_6o);
                    paint1111111111118.setColor(iM1672toArgb8_81llA);
                    paint1111111111118.setTextAlign(Paint.Align.CENTER);
                    paint1111111111118.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    composerStartRestartGroup.updateRememberedValue(paint1111111111118);
                    obj3 = paint1111111111118;
                }
                obj3 = objRememberedValue3;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint1111111111119 = (Paint) obj3;
                Float fValueOf1111114 = Float.valueOf(fMo312toPxR2X_6o2);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged4 = composerStartRestartGroup.changed(fValueOf1111114);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    obj4 = objRememberedValue4;
                    Paint paint2111115 = new Paint();
                    paint2111115.setAntiAlias(true);
                    paint2111115.setTextSize(fMo312toPxR2X_6o2);
                    paint2111115.setColor(-1);
                    paint2111115.setTextAlign(Paint.Align.LEFT);
                    composerStartRestartGroup.updateRememberedValue(paint2111115);
                    obj4 = paint2111115;
                } else {
                    obj4 = objRememberedValue4;
                    Paint paint2111116 = new Paint();
                    paint2111116.setAntiAlias(true);
                    paint2111116.setTextSize(fMo312toPxR2X_6o2);
                    paint2111116.setColor(-1);
                    paint2111116.setTextAlign(Paint.Align.LEFT);
                    composerStartRestartGroup.updateRememberedValue(paint2111116);
                    obj4 = paint2111116;
                }
                obj4 = objRememberedValue4;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint2111117 = (Paint) obj4;
                Float fValueOf1111115 = Float.valueOf(fMo312toPxR2X_6o2);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged5 = composerStartRestartGroup.changed(fValueOf1111115);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged5) {
                    obj5 = objRememberedValue5;
                    Paint paint2111118 = new Paint();
                    paint2111118.setAntiAlias(true);
                    paint2111118.setTextSize(fMo312toPxR2X_6o2);
                    paint2111118.setColor(-1);
                    paint2111118.setTextAlign(Paint.Align.LEFT);
                    paint2111118.setFakeBoldText(true);
                    composerStartRestartGroup.updateRememberedValue(paint2111118);
                    obj5 = paint2111118;
                } else {
                    obj5 = objRememberedValue5;
                    Paint paint2111119 = new Paint();
                    paint2111119.setAntiAlias(true);
                    paint2111119.setTextSize(fMo312toPxR2X_6o2);
                    paint2111119.setColor(-1);
                    paint2111119.setTextAlign(Paint.Align.LEFT);
                    paint2111119.setFakeBoldText(true);
                    composerStartRestartGroup.updateRememberedValue(paint2111119);
                    obj5 = paint2111119;
                }
                obj5 = objRememberedValue5;
                composerStartRestartGroup.endReplaceableGroup();
                Paint paint11111111111110 = (Paint) obj5;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue6 == companion.getEmpty()) {
                    i27 = 2;
                    snapshotMutationPolicy = null;
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j8), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    i27 = 2;
                    snapshotMutationPolicy = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState4 = (MutableState) objRememberedValue6;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i27, snapshotMutationPolicy);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState5 = (MutableState) objRememberedValue7;
                if (chartDrawableData5 != null) {
                    listA = chartDrawableData5.a();
                } else {
                    listA = null;
                }
                if (chartDrawableData6 != null) {
                    listA2 = chartDrawableData6.a();
                } else {
                    listA2 = null;
                }
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged6 = composerStartRestartGroup.changed(listA) | composerStartRestartGroup.changed(listA2);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChanged6) {
                    listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    if (chartDrawableData5 != null) {
                        while (r12.hasNext()) {
                            if (chartXY.getY() != null) {
                                listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                            }
                        }
                        Unit unit11117 = Unit.INSTANCE;
                    }
                    if (chartDrawableData6 != null) {
                        while (r12.hasNext()) {
                            if (chartXY2.getY() != null) {
                                listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                            }
                        }
                        Unit unit11118 = Unit.INSTANCE;
                    }
                    objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    if (chartDrawableData5 != null) {
                        while (r12.hasNext()) {
                            if (chartXY.getY() != null) {
                                listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                            }
                        }
                        Unit unit11119 = Unit.INSTANCE;
                    }
                    if (chartDrawableData6 != null) {
                        while (r12.hasNext()) {
                            if (chartXY2.getY() != null) {
                                listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                            }
                        }
                        Unit unit111110 = Unit.INSTANCE;
                    }
                    objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list11115 = (List) objRememberedValue8;
                State stateRememberUpdatedState111111 = SnapshotStateKt.rememberUpdatedState(list11115, composerStartRestartGroup, 8);
                State stateRememberUpdatedState111112 = SnapshotStateKt.rememberUpdatedState(mutableState3, composerStartRestartGroup, (i6 >> 27) & 14);
                State stateRememberUpdatedState111113 = SnapshotStateKt.rememberUpdatedState(function111111111115, composerStartRestartGroup, (i7 >> 24) & 14);
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function111111111114, composerStartRestartGroup, (i7 >> 27) & 14);
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function111111111113, composerStartRestartGroup, i22 & 14);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState6 = (MutableState) objRememberedValue9;
                float fMo313toPx0680j_1111115 = density13.mo313toPx0680j_4(Dp.m4104constructorimpl(fM4104constructorimpl4 + fM4104constructorimpl5));
                float fMo313toPx0680j_1111116 = density13.mo313toPx0680j_4(fM4104constructorimpl4);
                float f1111111110 = fM4104constructorimpl4;
                float fMo313toPx0680j_1111117 = density13.mo313toPx0680j_4(Dp.m4104constructorimpl(f4));
                float fMo313toPx0680j_1111118 = density13.mo313toPx0680j_4(Dp.m4104constructorimpl(Dp.m4104constructorimpl(f7) - fM4104constructorimpl18));
                if (j2 > 0) {
                    fFloatValue = 0.0f;
                } else {
                    fFloatValue = 0.0f;
                }
                float fFloatValue14 = ((Number) mutableState6.getValue()).floatValue() - density13.mo313toPx0680j_4(fM4104constructorimpl5);
                float fMo313toPx0680j_1111119 = density13.mo313toPx0680j_4(Dp.m4104constructorimpl(600));
                if (chartDrawableData5 != null) {
                    pointRadiusDp = chartDrawableData5.getPointRadiusDp();
                } else {
                    pointRadiusDp = 0.0f;
                }
                if (chartDrawableData6 != null) {
                    pointRadiusDp2 = chartDrawableData6.getPointRadiusDp();
                } else {
                    pointRadiusDp2 = 0.0f;
                }
                fMo313toPx0680j_4 = density13.mo313toPx0680j_4(Dp.m4104constructorimpl(Math.max(pointRadiusDp, pointRadiusDp2)));
                float f1111111111 = 16;
                State stateRememberUpdatedState111114 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(Math.max(4 * fMo313toPx0680j_4, density13.mo313toPx0680j_4(Dp.m4104constructorimpl(f1111111111)))), composerStartRestartGroup, 0);
                if (fFloatValue > 0.0f) {
                    j9 = ((long) (fMo313toPx0680j_4 / fFloatValue)) + 1;
                } else {
                    j9 = 0;
                }
                long j111110 = j9;
                jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(minMax.getSecond().longValue() - j2, minMax.getFirst().longValue());
                if (jCoerceAtLeast > minMax.getFirst().longValue()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                float fMax13 = Math.max(viewConfiguration13.getTouchSlop() * 2.0f, density13.mo313toPx0680j_4(Dp.m4104constructorimpl(f1111111111)));
                if (chartDrawableData5 != null) {
                    pairF = chartDrawableData5.f();
                } else {
                    pairF = null;
                }
                if (chartDrawableData6 != null) {
                    pairF2 = chartDrawableData6.f();
                } else {
                    pairF2 = null;
                }
                Long lValueOf115 = Long.valueOf(j8);
                Long lValueOf116 = Long.valueOf(j2);
                Pair<Float, Float> pair115 = pairF2;
                Pair<Float, Float> pair116 = pairF;
                objArr = new Object[]{Long.valueOf(j8), minMax, Long.valueOf(jCoerceAtLeast), mutableState5, mutableState4};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged7 = false;
                while (i28 < 5) {
                    zChanged7 |= composerStartRestartGroup.changed(objArr[i28]);
                }
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (zChanged7) {
                    objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                } else {
                    objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i41119 = ((i7 >> 12) & 14) | 4096;
                int i411110 = i7 >> 3;
                EffectsKt.LaunchedEffect(lValueOf115, minMax, lValueOf116, (Function2) objRememberedValue10, composerStartRestartGroup, (i411110 & 896) | i41119 | (i411110 & 112));
                Pair<Long, Long> pairD13 = d(mutableState5);
                objArr2 = new Object[]{mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged8 = false;
                while (i29 < 4) {
                    zChanged8 |= composerStartRestartGroup.changed(objArr2[i29]);
                }
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (zChanged8) {
                    objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                } else {
                    objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(pairD13, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 64);
                Object[] objArr15 = new Object[5];
                if (mutableState3 != null) {
                    value = mutableState3.getValue();
                } else {
                    value = null;
                }
                objArr15[0] = value;
                objArr15[1] = list11115;
                objArr15[2] = Long.valueOf(b(mutableState4));
                objArr15[3] = Long.valueOf(j2);
                objArr15[4] = Long.valueOf(j111110);
                EffectsKt.LaunchedEffect(objArr15, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$4(mutableState3, list11115, j2, j111110, mutableState4, stateRememberUpdatedState111113, null), composerStartRestartGroup, 72);
                Modifier modifierM455height3ABfNKs13 = SizeKt.m455height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4104constructorimpl(f7));
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged9 = composerStartRestartGroup.changed(mutableState6);
                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (zChanged9) {
                    objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p010kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                            m4625invokeozmzZPI(intSize.m4268unboximpl());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                        public final void m4625invokeozmzZPI(long j111111) {
                            mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j111111)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                } else {
                    objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p010kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                            m4625invokeozmzZPI(intSize.m4268unboximpl());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                        public final void m4625invokeozmzZPI(long j111111) {
                            mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j111111)));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierPointerInput13 = SuspendingPointerInputFilterKt.pointerInput(OnRemeasuredModifierKt.onSizeChanged(modifierM455height3ABfNKs13, (Function1) objRememberedValue12), new Object[]{Float.valueOf(fFloatValue), Float.valueOf(fMo313toPx0680j_1111116), Float.valueOf(fFloatValue14), Float.valueOf(fMo313toPx0680j_1111117), Float.valueOf(fMo313toPx0680j_1111118), minMax, Long.valueOf(j2), chartScrollSnapUnit3, view13}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$6(fMo313toPx0680j_1111116, fFloatValue14, fMo313toPx0680j_1111117, fMo313toPx0680j_1111118, view13, viewConfiguration13, fFloatValue, minMax, jCoerceAtLeast, z4, fMax13, fMo313toPx0680j_1111119, mutableState5, mutableState4, stateRememberUpdatedState111112, stateRememberUpdatedState111111, stateRememberUpdatedState111114, stateRememberUpdatedState111113, stateRememberUpdatedState, chartScrollSnapUnit3, stateRememberUpdatedState2, null));
                MutableState<Integer> mutableState1113 = mutableState3;
                Composer composer15 = composerStartRestartGroup;
                CanvasKt.Canvas(modifierPointerInput13, new ChartComposeKt$Chart$7(f1111111110, f4, fM4104constructorimpl5, fM4104constructorimpl18, j2, pair116, pair115, i26, paint1111111111113, paint1111111111116, z3, chartDrawableData5, chartDrawableData6, list4, paint1111111111119, minMax, j7, list3, mutableState1113, list11115, markerLabelFormat, paint2111117, iM1672toArgb8_81llA, mutableState4, fM4104constructorimpl3, xLabelFormat, paint11111111111110), composer15, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function10 = function111111111114;
                function11 = function111111111115;
                function12 = function111111111113;
                mutableState7 = mutableState1113;
                f10 = f7;
                chartDrawableData7 = chartDrawableData5;
                chartDrawableData8 = chartDrawableData6;
                list5 = list3;
                list6 = list4;
                i30 = i26;
                f11 = f8;
                f12 = f9;
                z5 = z3;
                j10 = j8;
                chartScrollSnapUnit4 = chartScrollSnapUnit3;
                j11 = j7;
                f13 = fM4104constructorimpl3;
                composer2 = composer15;
            }
            scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer16, Integer num) {
                    invoke(composer16, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer16, int i411111) {
                    ChartComposeKt.a(f10, chartDrawableData7, chartDrawableData8, list5, list6, i30, f11, f12, z5, mutableState7, markerLabelFormat, f4, minMax, j2, j10, chartScrollSnapUnit4, j11, xLabelFormat, function11, function10, function12, f13, composer16, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                }
            });
        }
        i16 = 12582912;
        i7 |= i16;
        i17 = i5 & 262144;
        if (i17 != 0) {
            i7 |= 100663296;
        } else if ((i3 & 234881024) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i18 = 67108864;
            } else {
                i18 = 33554432;
            }
            i7 |= i18;
        }
        i19 = i5 & 524288;
        if (i19 != 0) {
            i7 |= 805306368;
        } else if ((i3 & 1879048192) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i20 = 536870912;
            } else {
                i20 = 268435456;
            }
            i7 |= i20;
        }
        i21 = i5 & 1048576;
        if (i21 != 0) {
            i22 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i22 = i4 | i23;
        } else {
            i22 = i4;
        }
        i24 = i5 & 2097152;
        if (i24 != 0) {
            i22 |= 48;
        } else if ((i4 & 112) == 0) {
            i22 |= composerStartRestartGroup.changed(f5) ? 32 : 16;
        }
        if ((i5 & 30) != 30) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i32 != 0) {
                    f6 = 279.0f;
                } else {
                    f6 = f;
                }
                if (i33 != 0) {
                    chartDrawableData3 = null;
                } else {
                    chartDrawableData3 = chartDrawableData;
                }
                if (i34 != 0) {
                    chartDrawableData4 = null;
                } else {
                    chartDrawableData4 = chartDrawableData2;
                }
                if (i35 != 0) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i36 != 0) {
                    listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    listEmptyList2 = list2;
                }
                if (i37 != 0) {
                    i25 = 2;
                } else {
                    i25 = i;
                }
                f7 = f6;
                if (i38 != 0) {
                    fM4104constructorimpl = Dp.m4104constructorimpl(22);
                } else {
                    fM4104constructorimpl = f2;
                }
                if (i39 != 0) {
                    fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                } else {
                    fM4104constructorimpl2 = f3;
                }
                if (i40 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if (i41 != 0) {
                    mutableState2 = null;
                } else {
                    mutableState2 = mutableState;
                }
                f8 = fM4104constructorimpl;
                if ((i5 & 16384) != 0) {
                    jLongValue = minMax.getFirst().longValue();
                    i7 &= -57345;
                } else {
                    jLongValue = j3;
                }
                if (i12 != 0) {
                    chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                }
                if (i14 != 0) {
                    j6 = 43200000;
                } else {
                    j6 = j5;
                }
                if (i17 != 0) {
                    function4 = null;
                } else {
                    function4 = function1;
                }
                if (i19 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i21 != 0) {
                    function6 = null;
                } else {
                    function6 = function3;
                }
                Function1<? super Integer, Unit> function111111111116 = function4;
                f9 = fM4104constructorimpl2;
                if (i24 != 0) {
                    fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                } else {
                    fM4104constructorimpl3 = f5;
                }
                chartDrawableData5 = chartDrawableData3;
                chartDrawableData6 = chartDrawableData4;
                list3 = listEmptyList;
                list4 = listEmptyList2;
                z3 = z2;
                chartScrollSnapUnit3 = chartScrollSnapUnit2;
                j7 = j6;
                function7 = function6;
                i26 = i25;
                mutableState3 = mutableState2;
                j8 = jLongValue;
                function8 = function111111111116;
                function9 = function5;
            } else {
                if (i32 != 0) {
                    f6 = 279.0f;
                } else {
                    f6 = f;
                }
                if (i33 != 0) {
                    chartDrawableData3 = null;
                } else {
                    chartDrawableData3 = chartDrawableData;
                }
                if (i34 != 0) {
                    chartDrawableData4 = null;
                } else {
                    chartDrawableData4 = chartDrawableData2;
                }
                if (i35 != 0) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i36 != 0) {
                    listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    listEmptyList2 = list2;
                }
                if (i37 != 0) {
                    i25 = 2;
                } else {
                    i25 = i;
                }
                f7 = f6;
                if (i38 != 0) {
                    fM4104constructorimpl = Dp.m4104constructorimpl(22);
                } else {
                    fM4104constructorimpl = f2;
                }
                if (i39 != 0) {
                    fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                } else {
                    fM4104constructorimpl2 = f3;
                }
                if (i40 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if (i41 != 0) {
                    mutableState2 = null;
                } else {
                    mutableState2 = mutableState;
                }
                f8 = fM4104constructorimpl;
                if ((i5 & 16384) != 0) {
                    jLongValue = minMax.getFirst().longValue();
                    i7 &= -57345;
                } else {
                    jLongValue = j3;
                }
                if (i12 != 0) {
                    chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                }
                if (i14 != 0) {
                    j6 = 43200000;
                } else {
                    j6 = j5;
                }
                if (i17 != 0) {
                    function4 = null;
                } else {
                    function4 = function1;
                }
                if (i19 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i21 != 0) {
                    function6 = null;
                } else {
                    function6 = function3;
                }
                Function1<? super Integer, Unit> function111111111117 = function4;
                f9 = fM4104constructorimpl2;
                if (i24 != 0) {
                    fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                } else {
                    fM4104constructorimpl3 = f5;
                }
                chartDrawableData5 = chartDrawableData3;
                chartDrawableData6 = chartDrawableData4;
                list3 = listEmptyList;
                list4 = listEmptyList2;
                z3 = z2;
                chartScrollSnapUnit3 = chartScrollSnapUnit2;
                j7 = j6;
                function7 = function6;
                i26 = i25;
                mutableState3 = mutableState2;
                j8 = jLongValue;
                function8 = function111111111117;
                function9 = function5;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-920059604, i6, i7, "com.heytap.health.bodyfat.ui.Chart (ChartCompose.kt:138)");
            }
            if (minMax.getFirst().longValue() == minMax.getSecond().longValue()) {
                m8b.b("Chart", "min == max; return!");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final float f1111111112 = f7;
                final ChartDrawableData chartDrawableData1115 = chartDrawableData5;
                final ChartDrawableData chartDrawableData1116 = chartDrawableData6;
                final List<ChartDrawableData> list11116 = list3;
                final List<ChartDrawableData> list11117 = list4;
                final int i411111 = i26;
                final float f1111111113 = f8;
                final float f1111111114 = f9;
                final boolean z19 = z3;
                final MutableState<Integer> mutableState1114 = mutableState3;
                final Function2<? super Long, ? super ChartScrollDirection, Long> function111111111118 = function7;
                final Function1<? super Long, Unit> function111111111119 = function9;
                final Function1<? super Integer, Unit> function1111111111110 = function8;
                final long j111111 = j8;
                final ChartScrollSnapUnit chartScrollSnapUnit18 = chartScrollSnapUnit3;
                final long j111112 = j7;
                final float f1111111115 = fM4104constructorimpl3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // p010kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer16, Integer num) {
                        invoke(composer16, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer16, int i411112) {
                        ChartComposeKt.a(f1111111112, chartDrawableData1115, chartDrawableData1116, list11116, list11117, i411111, f1111111113, f1111111114, z19, mutableState1114, markerLabelFormat, f4, minMax, j2, j111111, chartScrollSnapUnit18, j111112, xLabelFormat, function1111111111110, function111111111119, function111111111118, f1111111115, composer16, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                    }
                });
                return;
            }
            Function2<? super Long, ? super ChartScrollDirection, Long> function1111111111111 = function7;
            Function1<? super Long, Unit> function1111111111112 = function9;
            Function1<? super Integer, Unit> function1111111111113 = function8;
            if (chartDrawableData5 == null) {
                fM4104constructorimpl4 = Dp.m4104constructorimpl(0);
            } else {
                fM4104constructorimpl4 = f8;
            }
            if (chartDrawableData6 == null) {
                fM4104constructorimpl5 = Dp.m4104constructorimpl(0);
            } else {
                fM4104constructorimpl5 = f9;
            }
            float fM4104constructorimpl19 = Dp.m4104constructorimpl(22);
            Density density14 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            View view14 = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            ViewConfiguration viewConfiguration14 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            iM1672toArgb8_81llA = ColorKt.m1672toArgb8_81llA(ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha55, composerStartRestartGroup, 0));
            fMo312toPxR2X_6o = density14.mo312toPxR2X_6o(TextUnitKt.getSp(10));
            fMo312toPxR2X_6o2 = density14.mo312toPxR2X_6o(TextUnitKt.getSp(12));
            Float fValueOf1111116 = Float.valueOf(fMo312toPxR2X_6o);
            Integer numValueOf11110 = Integer.valueOf(iM1672toArgb8_81llA);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(fValueOf1111116) | composerStartRestartGroup.changed(numValueOf11110);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                obj = objRememberedValue;
                Paint paint11111111111111 = new Paint();
                paint11111111111111.setAntiAlias(true);
                paint11111111111111.setTextSize(fMo312toPxR2X_6o);
                paint11111111111111.setColor(iM1672toArgb8_81llA);
                paint11111111111111.setTextAlign(Paint.Align.RIGHT);
                paint11111111111111.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                composerStartRestartGroup.updateRememberedValue(paint11111111111111);
                obj = paint11111111111111;
            } else {
                obj = objRememberedValue;
                Paint paint11111111111112 = new Paint();
                paint11111111111112.setAntiAlias(true);
                paint11111111111112.setTextSize(fMo312toPxR2X_6o);
                paint11111111111112.setColor(iM1672toArgb8_81llA);
                paint11111111111112.setTextAlign(Paint.Align.RIGHT);
                paint11111111111112.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                composerStartRestartGroup.updateRememberedValue(paint11111111111112);
                obj = paint11111111111112;
            }
            obj = objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            Paint paint11111111111113 = (Paint) obj;
            Float fValueOf1111117 = Float.valueOf(fMo312toPxR2X_6o);
            Integer numValueOf11111 = Integer.valueOf(iM1672toArgb8_81llA);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged2 = composerStartRestartGroup.changed(fValueOf1111117) | composerStartRestartGroup.changed(numValueOf11111);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                obj2 = objRememberedValue2;
                Paint paint11111111111114 = new Paint();
                paint11111111111114.setAntiAlias(true);
                paint11111111111114.setTextSize(fMo312toPxR2X_6o);
                paint11111111111114.setColor(iM1672toArgb8_81llA);
                paint11111111111114.setTextAlign(Paint.Align.RIGHT);
                paint11111111111114.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                composerStartRestartGroup.updateRememberedValue(paint11111111111114);
                obj2 = paint11111111111114;
            } else {
                obj2 = objRememberedValue2;
                Paint paint11111111111115 = new Paint();
                paint11111111111115.setAntiAlias(true);
                paint11111111111115.setTextSize(fMo312toPxR2X_6o);
                paint11111111111115.setColor(iM1672toArgb8_81llA);
                paint11111111111115.setTextAlign(Paint.Align.RIGHT);
                paint11111111111115.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                composerStartRestartGroup.updateRememberedValue(paint11111111111115);
                obj2 = paint11111111111115;
            }
            obj2 = objRememberedValue2;
            composerStartRestartGroup.endReplaceableGroup();
            Paint paint11111111111116 = (Paint) obj2;
            Float fValueOf1111118 = Float.valueOf(fMo312toPxR2X_6o);
            Integer numValueOf11112 = Integer.valueOf(iM1672toArgb8_81llA);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged3 = composerStartRestartGroup.changed(fValueOf1111118) | composerStartRestartGroup.changed(numValueOf11112);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3) {
                obj3 = objRememberedValue3;
                Paint paint11111111111117 = new Paint();
                paint11111111111117.setAntiAlias(true);
                paint11111111111117.setTextSize(fMo312toPxR2X_6o);
                paint11111111111117.setColor(iM1672toArgb8_81llA);
                paint11111111111117.setTextAlign(Paint.Align.CENTER);
                paint11111111111117.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                composerStartRestartGroup.updateRememberedValue(paint11111111111117);
                obj3 = paint11111111111117;
            } else {
                obj3 = objRememberedValue3;
                Paint paint11111111111118 = new Paint();
                paint11111111111118.setAntiAlias(true);
                paint11111111111118.setTextSize(fMo312toPxR2X_6o);
                paint11111111111118.setColor(iM1672toArgb8_81llA);
                paint11111111111118.setTextAlign(Paint.Align.CENTER);
                paint11111111111118.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                composerStartRestartGroup.updateRememberedValue(paint11111111111118);
                obj3 = paint11111111111118;
            }
            obj3 = objRememberedValue3;
            composerStartRestartGroup.endReplaceableGroup();
            Paint paint11111111111119 = (Paint) obj3;
            Float fValueOf1111119 = Float.valueOf(fMo312toPxR2X_6o2);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged4 = composerStartRestartGroup.changed(fValueOf1111119);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged4) {
                obj4 = objRememberedValue4;
                Paint paint21111110 = new Paint();
                paint21111110.setAntiAlias(true);
                paint21111110.setTextSize(fMo312toPxR2X_6o2);
                paint21111110.setColor(-1);
                paint21111110.setTextAlign(Paint.Align.LEFT);
                composerStartRestartGroup.updateRememberedValue(paint21111110);
                obj4 = paint21111110;
            } else {
                obj4 = objRememberedValue4;
                Paint paint21111111 = new Paint();
                paint21111111.setAntiAlias(true);
                paint21111111.setTextSize(fMo312toPxR2X_6o2);
                paint21111111.setColor(-1);
                paint21111111.setTextAlign(Paint.Align.LEFT);
                composerStartRestartGroup.updateRememberedValue(paint21111111);
                obj4 = paint21111111;
            }
            obj4 = objRememberedValue4;
            composerStartRestartGroup.endReplaceableGroup();
            Paint paint21111112 = (Paint) obj4;
            Float fValueOf11111110 = Float.valueOf(fMo312toPxR2X_6o2);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged5 = composerStartRestartGroup.changed(fValueOf11111110);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged5) {
                obj5 = objRememberedValue5;
                Paint paint21111113 = new Paint();
                paint21111113.setAntiAlias(true);
                paint21111113.setTextSize(fMo312toPxR2X_6o2);
                paint21111113.setColor(-1);
                paint21111113.setTextAlign(Paint.Align.LEFT);
                paint21111113.setFakeBoldText(true);
                composerStartRestartGroup.updateRememberedValue(paint21111113);
                obj5 = paint21111113;
            } else {
                obj5 = objRememberedValue5;
                Paint paint21111114 = new Paint();
                paint21111114.setAntiAlias(true);
                paint21111114.setTextSize(fMo312toPxR2X_6o2);
                paint21111114.setColor(-1);
                paint21111114.setTextAlign(Paint.Align.LEFT);
                paint21111114.setFakeBoldText(true);
                composerStartRestartGroup.updateRememberedValue(paint21111114);
                obj5 = paint21111114;
            }
            obj5 = objRememberedValue5;
            composerStartRestartGroup.endReplaceableGroup();
            Paint paint111111111111110 = (Paint) obj5;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue6 == companion.getEmpty()) {
                i27 = 2;
                snapshotMutationPolicy = null;
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j8), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                i27 = 2;
                snapshotMutationPolicy = null;
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState4 = (MutableState) objRememberedValue6;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i27, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState5 = (MutableState) objRememberedValue7;
            if (chartDrawableData5 != null) {
                listA = chartDrawableData5.a();
            } else {
                listA = null;
            }
            if (chartDrawableData6 != null) {
                listA2 = chartDrawableData6.a();
            } else {
                listA2 = null;
            }
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged6 = composerStartRestartGroup.changed(listA) | composerStartRestartGroup.changed(listA2);
            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChanged6) {
                listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                if (chartDrawableData5 != null) {
                    while (r12.hasNext()) {
                        if (chartXY.getY() != null) {
                            listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                        }
                    }
                    Unit unit111111 = Unit.INSTANCE;
                }
                if (chartDrawableData6 != null) {
                    while (r12.hasNext()) {
                        if (chartXY2.getY() != null) {
                            listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                        }
                    }
                    Unit unit111112 = Unit.INSTANCE;
                }
                objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            } else {
                listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                if (chartDrawableData5 != null) {
                    while (r12.hasNext()) {
                        if (chartXY.getY() != null) {
                            listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                        }
                    }
                    Unit unit111113 = Unit.INSTANCE;
                }
                if (chartDrawableData6 != null) {
                    while (r12.hasNext()) {
                        if (chartXY2.getY() != null) {
                            listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                        }
                    }
                    Unit unit111114 = Unit.INSTANCE;
                }
                objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composerStartRestartGroup.endReplaceableGroup();
            List list11118 = (List) objRememberedValue8;
            State stateRememberUpdatedState111115 = SnapshotStateKt.rememberUpdatedState(list11118, composerStartRestartGroup, 8);
            State stateRememberUpdatedState111116 = SnapshotStateKt.rememberUpdatedState(mutableState3, composerStartRestartGroup, (i6 >> 27) & 14);
            State stateRememberUpdatedState111117 = SnapshotStateKt.rememberUpdatedState(function1111111111113, composerStartRestartGroup, (i7 >> 24) & 14);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1111111111112, composerStartRestartGroup, (i7 >> 27) & 14);
            stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function1111111111111, composerStartRestartGroup, i22 & 14);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState6 = (MutableState) objRememberedValue9;
            float fMo313toPx0680j_11111110 = density14.mo313toPx0680j_4(Dp.m4104constructorimpl(fM4104constructorimpl4 + fM4104constructorimpl5));
            float fMo313toPx0680j_11111111 = density14.mo313toPx0680j_4(fM4104constructorimpl4);
            float f1111111116 = fM4104constructorimpl4;
            float fMo313toPx0680j_11111112 = density14.mo313toPx0680j_4(Dp.m4104constructorimpl(f4));
            float fMo313toPx0680j_11111113 = density14.mo313toPx0680j_4(Dp.m4104constructorimpl(Dp.m4104constructorimpl(f7) - fM4104constructorimpl19));
            if (j2 > 0) {
                fFloatValue = 0.0f;
            } else {
                fFloatValue = 0.0f;
            }
            float fFloatValue15 = ((Number) mutableState6.getValue()).floatValue() - density14.mo313toPx0680j_4(fM4104constructorimpl5);
            float fMo313toPx0680j_11111114 = density14.mo313toPx0680j_4(Dp.m4104constructorimpl(600));
            if (chartDrawableData5 != null) {
                pointRadiusDp = chartDrawableData5.getPointRadiusDp();
            } else {
                pointRadiusDp = 0.0f;
            }
            if (chartDrawableData6 != null) {
                pointRadiusDp2 = chartDrawableData6.getPointRadiusDp();
            } else {
                pointRadiusDp2 = 0.0f;
            }
            fMo313toPx0680j_4 = density14.mo313toPx0680j_4(Dp.m4104constructorimpl(Math.max(pointRadiusDp, pointRadiusDp2)));
            float f1111111117 = 16;
            State stateRememberUpdatedState111118 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(Math.max(4 * fMo313toPx0680j_4, density14.mo313toPx0680j_4(Dp.m4104constructorimpl(f1111111117)))), composerStartRestartGroup, 0);
            if (fFloatValue > 0.0f) {
                j9 = ((long) (fMo313toPx0680j_4 / fFloatValue)) + 1;
            } else {
                j9 = 0;
            }
            long j111113 = j9;
            jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(minMax.getSecond().longValue() - j2, minMax.getFirst().longValue());
            if (jCoerceAtLeast > minMax.getFirst().longValue()) {
                z4 = true;
            } else {
                z4 = false;
            }
            float fMax14 = Math.max(viewConfiguration14.getTouchSlop() * 2.0f, density14.mo313toPx0680j_4(Dp.m4104constructorimpl(f1111111117)));
            if (chartDrawableData5 != null) {
                pairF = chartDrawableData5.f();
            } else {
                pairF = null;
            }
            if (chartDrawableData6 != null) {
                pairF2 = chartDrawableData6.f();
            } else {
                pairF2 = null;
            }
            Long lValueOf117 = Long.valueOf(j8);
            Long lValueOf118 = Long.valueOf(j2);
            Pair<Float, Float> pair117 = pairF2;
            Pair<Float, Float> pair118 = pairF;
            objArr = new Object[]{Long.valueOf(j8), minMax, Long.valueOf(jCoerceAtLeast), mutableState5, mutableState4};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            zChanged7 = false;
            while (i28 < 5) {
                zChanged7 |= composerStartRestartGroup.changed(objArr[i28]);
            }
            objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (zChanged7) {
                objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            } else {
                objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i411112 = ((i7 >> 12) & 14) | 4096;
            int i411113 = i7 >> 3;
            EffectsKt.LaunchedEffect(lValueOf117, minMax, lValueOf118, (Function2) objRememberedValue10, composerStartRestartGroup, (i411113 & 896) | i411112 | (i411113 & 112));
            Pair<Long, Long> pairD14 = d(mutableState5);
            objArr2 = new Object[]{mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            zChanged8 = false;
            while (i29 < 4) {
                zChanged8 |= composerStartRestartGroup.changed(objArr2[i29]);
            }
            objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (zChanged8) {
                objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            } else {
                objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(pairD14, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 64);
            Object[] objArr16 = new Object[5];
            if (mutableState3 != null) {
                value = mutableState3.getValue();
            } else {
                value = null;
            }
            objArr16[0] = value;
            objArr16[1] = list11118;
            objArr16[2] = Long.valueOf(b(mutableState4));
            objArr16[3] = Long.valueOf(j2);
            objArr16[4] = Long.valueOf(j111113);
            EffectsKt.LaunchedEffect(objArr16, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$4(mutableState3, list11118, j2, j111113, mutableState4, stateRememberUpdatedState111117, null), composerStartRestartGroup, 72);
            Modifier modifierM455height3ABfNKs14 = SizeKt.m455height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4104constructorimpl(f7));
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged9 = composerStartRestartGroup.changed(mutableState6);
            objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (zChanged9) {
                objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p010kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                        m4625invokeozmzZPI(intSize.m4268unboximpl());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                    public final void m4625invokeozmzZPI(long j111114) {
                        mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j111114)));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            } else {
                objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p010kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                        m4625invokeozmzZPI(intSize.m4268unboximpl());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                    public final void m4625invokeozmzZPI(long j111114) {
                        mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j111114)));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierPointerInput14 = SuspendingPointerInputFilterKt.pointerInput(OnRemeasuredModifierKt.onSizeChanged(modifierM455height3ABfNKs14, (Function1) objRememberedValue12), new Object[]{Float.valueOf(fFloatValue), Float.valueOf(fMo313toPx0680j_11111111), Float.valueOf(fFloatValue15), Float.valueOf(fMo313toPx0680j_11111112), Float.valueOf(fMo313toPx0680j_11111113), minMax, Long.valueOf(j2), chartScrollSnapUnit3, view14}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$6(fMo313toPx0680j_11111111, fFloatValue15, fMo313toPx0680j_11111112, fMo313toPx0680j_11111113, view14, viewConfiguration14, fFloatValue, minMax, jCoerceAtLeast, z4, fMax14, fMo313toPx0680j_11111114, mutableState5, mutableState4, stateRememberUpdatedState111116, stateRememberUpdatedState111115, stateRememberUpdatedState111118, stateRememberUpdatedState111117, stateRememberUpdatedState, chartScrollSnapUnit3, stateRememberUpdatedState2, null));
            MutableState<Integer> mutableState1115 = mutableState3;
            Composer composer16 = composerStartRestartGroup;
            CanvasKt.Canvas(modifierPointerInput14, new ChartComposeKt$Chart$7(f1111111116, f4, fM4104constructorimpl5, fM4104constructorimpl19, j2, pair118, pair117, i26, paint11111111111113, paint11111111111116, z3, chartDrawableData5, chartDrawableData6, list4, paint11111111111119, minMax, j7, list3, mutableState1115, list11118, markerLabelFormat, paint21111112, iM1672toArgb8_81llA, mutableState4, fM4104constructorimpl3, xLabelFormat, paint111111111111110), composer16, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function10 = function1111111111112;
            function11 = function1111111111113;
            function12 = function1111111111111;
            mutableState7 = mutableState1115;
            f10 = f7;
            chartDrawableData7 = chartDrawableData5;
            chartDrawableData8 = chartDrawableData6;
            list5 = list3;
            list6 = list4;
            i30 = i26;
            f11 = f8;
            f12 = f9;
            z5 = z3;
            j10 = j8;
            chartScrollSnapUnit4 = chartScrollSnapUnit3;
            j11 = j7;
            f13 = fM4104constructorimpl3;
            composer2 = composer16;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i32 != 0) {
                    f6 = 279.0f;
                } else {
                    f6 = f;
                }
                if (i33 != 0) {
                    chartDrawableData3 = null;
                } else {
                    chartDrawableData3 = chartDrawableData;
                }
                if (i34 != 0) {
                    chartDrawableData4 = null;
                } else {
                    chartDrawableData4 = chartDrawableData2;
                }
                if (i35 != 0) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i36 != 0) {
                    listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    listEmptyList2 = list2;
                }
                if (i37 != 0) {
                    i25 = 2;
                } else {
                    i25 = i;
                }
                f7 = f6;
                if (i38 != 0) {
                    fM4104constructorimpl = Dp.m4104constructorimpl(22);
                } else {
                    fM4104constructorimpl = f2;
                }
                if (i39 != 0) {
                    fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                } else {
                    fM4104constructorimpl2 = f3;
                }
                if (i40 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if (i41 != 0) {
                    mutableState2 = null;
                } else {
                    mutableState2 = mutableState;
                }
                f8 = fM4104constructorimpl;
                if ((i5 & 16384) != 0) {
                    jLongValue = minMax.getFirst().longValue();
                    i7 &= -57345;
                } else {
                    jLongValue = j3;
                }
                if (i12 != 0) {
                    chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                }
                if (i14 != 0) {
                    j6 = 43200000;
                } else {
                    j6 = j5;
                }
                if (i17 != 0) {
                    function4 = null;
                } else {
                    function4 = function1;
                }
                if (i19 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i21 != 0) {
                    function6 = null;
                } else {
                    function6 = function3;
                }
                Function1<? super Integer, Unit> function1111111111114 = function4;
                f9 = fM4104constructorimpl2;
                if (i24 != 0) {
                    fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                } else {
                    fM4104constructorimpl3 = f5;
                }
                chartDrawableData5 = chartDrawableData3;
                chartDrawableData6 = chartDrawableData4;
                list3 = listEmptyList;
                list4 = listEmptyList2;
                z3 = z2;
                chartScrollSnapUnit3 = chartScrollSnapUnit2;
                j7 = j6;
                function7 = function6;
                i26 = i25;
                mutableState3 = mutableState2;
                j8 = jLongValue;
                function8 = function1111111111114;
                function9 = function5;
            } else {
                if (i32 != 0) {
                    f6 = 279.0f;
                } else {
                    f6 = f;
                }
                if (i33 != 0) {
                    chartDrawableData3 = null;
                } else {
                    chartDrawableData3 = chartDrawableData;
                }
                if (i34 != 0) {
                    chartDrawableData4 = null;
                } else {
                    chartDrawableData4 = chartDrawableData2;
                }
                if (i35 != 0) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i36 != 0) {
                    listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    listEmptyList2 = list2;
                }
                if (i37 != 0) {
                    i25 = 2;
                } else {
                    i25 = i;
                }
                f7 = f6;
                if (i38 != 0) {
                    fM4104constructorimpl = Dp.m4104constructorimpl(22);
                } else {
                    fM4104constructorimpl = f2;
                }
                if (i39 != 0) {
                    fM4104constructorimpl2 = Dp.m4104constructorimpl(22);
                } else {
                    fM4104constructorimpl2 = f3;
                }
                if (i40 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if (i41 != 0) {
                    mutableState2 = null;
                } else {
                    mutableState2 = mutableState;
                }
                f8 = fM4104constructorimpl;
                if ((i5 & 16384) != 0) {
                    jLongValue = minMax.getFirst().longValue();
                    i7 &= -57345;
                } else {
                    jLongValue = j3;
                }
                if (i12 != 0) {
                    chartScrollSnapUnit2 = ChartScrollSnapUnit.DAY;
                }
                if (i14 != 0) {
                    j6 = 43200000;
                } else {
                    j6 = j5;
                }
                if (i17 != 0) {
                    function4 = null;
                } else {
                    function4 = function1;
                }
                if (i19 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i21 != 0) {
                    function6 = null;
                } else {
                    function6 = function3;
                }
                Function1<? super Integer, Unit> function1111111111115 = function4;
                f9 = fM4104constructorimpl2;
                if (i24 != 0) {
                    fM4104constructorimpl3 = Dp.m4104constructorimpl(0);
                } else {
                    fM4104constructorimpl3 = f5;
                }
                chartDrawableData5 = chartDrawableData3;
                chartDrawableData6 = chartDrawableData4;
                list3 = listEmptyList;
                list4 = listEmptyList2;
                z3 = z2;
                chartScrollSnapUnit3 = chartScrollSnapUnit2;
                j7 = j6;
                function7 = function6;
                i26 = i25;
                mutableState3 = mutableState2;
                j8 = jLongValue;
                function8 = function1111111111115;
                function9 = function5;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-920059604, i6, i7, "com.heytap.health.bodyfat.ui.Chart (ChartCompose.kt:138)");
            }
            if (minMax.getFirst().longValue() == minMax.getSecond().longValue()) {
                m8b.b("Chart", "min == max; return!");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final float f1111111118 = f7;
                final ChartDrawableData chartDrawableData1117 = chartDrawableData5;
                final ChartDrawableData chartDrawableData1118 = chartDrawableData6;
                final List<ChartDrawableData> list11119 = list3;
                final List<ChartDrawableData> list111110 = list4;
                final int i411114 = i26;
                final float f1111111119 = f8;
                final float f11111111110 = f9;
                final boolean z110 = z3;
                final MutableState<Integer> mutableState1116 = mutableState3;
                final Function2<? super Long, ? super ChartScrollDirection, Long> function1111111111116 = function7;
                final Function1<? super Long, Unit> function1111111111117 = function9;
                final Function1<? super Integer, Unit> function1111111111118 = function8;
                final long j111114 = j8;
                final ChartScrollSnapUnit chartScrollSnapUnit19 = chartScrollSnapUnit3;
                final long j111115 = j7;
                final float f11111111111 = fM4104constructorimpl3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // p010kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer17, Integer num) {
                        invoke(composer17, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer17, int i411115) {
                        ChartComposeKt.a(f1111111118, chartDrawableData1117, chartDrawableData1118, list11119, list111110, i411114, f1111111119, f11111111110, z110, mutableState1116, markerLabelFormat, f4, minMax, j2, j111114, chartScrollSnapUnit19, j111115, xLabelFormat, function1111111111118, function1111111111117, function1111111111116, f11111111111, composer17, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                    }
                });
                return;
            }
            Function2<? super Long, ? super ChartScrollDirection, Long> function1111111111119 = function7;
            Function1<? super Long, Unit> function11111111111110 = function9;
            Function1<? super Integer, Unit> function11111111111111 = function8;
            if (chartDrawableData5 == null) {
                fM4104constructorimpl4 = Dp.m4104constructorimpl(0);
            } else {
                fM4104constructorimpl4 = f8;
            }
            if (chartDrawableData6 == null) {
                fM4104constructorimpl5 = Dp.m4104constructorimpl(0);
            } else {
                fM4104constructorimpl5 = f9;
            }
            float fM4104constructorimpl110 = Dp.m4104constructorimpl(22);
            Density density15 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            View view15 = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            ViewConfiguration viewConfiguration15 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            iM1672toArgb8_81llA = ColorKt.m1672toArgb8_81llA(ColorResources_androidKt.colorResource(R$color.health_body_fat_black_alpha55, composerStartRestartGroup, 0));
            fMo312toPxR2X_6o = density15.mo312toPxR2X_6o(TextUnitKt.getSp(10));
            fMo312toPxR2X_6o2 = density15.mo312toPxR2X_6o(TextUnitKt.getSp(12));
            Float fValueOf11111111 = Float.valueOf(fMo312toPxR2X_6o);
            Integer numValueOf11113 = Integer.valueOf(iM1672toArgb8_81llA);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(fValueOf11111111) | composerStartRestartGroup.changed(numValueOf11113);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                obj = objRememberedValue;
                Paint paint111111111111111 = new Paint();
                paint111111111111111.setAntiAlias(true);
                paint111111111111111.setTextSize(fMo312toPxR2X_6o);
                paint111111111111111.setColor(iM1672toArgb8_81llA);
                paint111111111111111.setTextAlign(Paint.Align.RIGHT);
                paint111111111111111.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                composerStartRestartGroup.updateRememberedValue(paint111111111111111);
                obj = paint111111111111111;
            } else {
                obj = objRememberedValue;
                Paint paint111111111111112 = new Paint();
                paint111111111111112.setAntiAlias(true);
                paint111111111111112.setTextSize(fMo312toPxR2X_6o);
                paint111111111111112.setColor(iM1672toArgb8_81llA);
                paint111111111111112.setTextAlign(Paint.Align.RIGHT);
                paint111111111111112.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                composerStartRestartGroup.updateRememberedValue(paint111111111111112);
                obj = paint111111111111112;
            }
            obj = objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            Paint paint111111111111113 = (Paint) obj;
            Float fValueOf11111112 = Float.valueOf(fMo312toPxR2X_6o);
            Integer numValueOf11114 = Integer.valueOf(iM1672toArgb8_81llA);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged2 = composerStartRestartGroup.changed(fValueOf11111112) | composerStartRestartGroup.changed(numValueOf11114);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                obj2 = objRememberedValue2;
                Paint paint111111111111114 = new Paint();
                paint111111111111114.setAntiAlias(true);
                paint111111111111114.setTextSize(fMo312toPxR2X_6o);
                paint111111111111114.setColor(iM1672toArgb8_81llA);
                paint111111111111114.setTextAlign(Paint.Align.RIGHT);
                paint111111111111114.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                composerStartRestartGroup.updateRememberedValue(paint111111111111114);
                obj2 = paint111111111111114;
            } else {
                obj2 = objRememberedValue2;
                Paint paint111111111111115 = new Paint();
                paint111111111111115.setAntiAlias(true);
                paint111111111111115.setTextSize(fMo312toPxR2X_6o);
                paint111111111111115.setColor(iM1672toArgb8_81llA);
                paint111111111111115.setTextAlign(Paint.Align.RIGHT);
                paint111111111111115.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                composerStartRestartGroup.updateRememberedValue(paint111111111111115);
                obj2 = paint111111111111115;
            }
            obj2 = objRememberedValue2;
            composerStartRestartGroup.endReplaceableGroup();
            Paint paint111111111111116 = (Paint) obj2;
            Float fValueOf11111113 = Float.valueOf(fMo312toPxR2X_6o);
            Integer numValueOf11115 = Integer.valueOf(iM1672toArgb8_81llA);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged3 = composerStartRestartGroup.changed(fValueOf11111113) | composerStartRestartGroup.changed(numValueOf11115);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3) {
                obj3 = objRememberedValue3;
                Paint paint111111111111117 = new Paint();
                paint111111111111117.setAntiAlias(true);
                paint111111111111117.setTextSize(fMo312toPxR2X_6o);
                paint111111111111117.setColor(iM1672toArgb8_81llA);
                paint111111111111117.setTextAlign(Paint.Align.CENTER);
                paint111111111111117.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                composerStartRestartGroup.updateRememberedValue(paint111111111111117);
                obj3 = paint111111111111117;
            } else {
                obj3 = objRememberedValue3;
                Paint paint111111111111118 = new Paint();
                paint111111111111118.setAntiAlias(true);
                paint111111111111118.setTextSize(fMo312toPxR2X_6o);
                paint111111111111118.setColor(iM1672toArgb8_81llA);
                paint111111111111118.setTextAlign(Paint.Align.CENTER);
                paint111111111111118.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                composerStartRestartGroup.updateRememberedValue(paint111111111111118);
                obj3 = paint111111111111118;
            }
            obj3 = objRememberedValue3;
            composerStartRestartGroup.endReplaceableGroup();
            Paint paint111111111111119 = (Paint) obj3;
            Float fValueOf11111114 = Float.valueOf(fMo312toPxR2X_6o2);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged4 = composerStartRestartGroup.changed(fValueOf11111114);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged4) {
                obj4 = objRememberedValue4;
                Paint paint21111115 = new Paint();
                paint21111115.setAntiAlias(true);
                paint21111115.setTextSize(fMo312toPxR2X_6o2);
                paint21111115.setColor(-1);
                paint21111115.setTextAlign(Paint.Align.LEFT);
                composerStartRestartGroup.updateRememberedValue(paint21111115);
                obj4 = paint21111115;
            } else {
                obj4 = objRememberedValue4;
                Paint paint21111116 = new Paint();
                paint21111116.setAntiAlias(true);
                paint21111116.setTextSize(fMo312toPxR2X_6o2);
                paint21111116.setColor(-1);
                paint21111116.setTextAlign(Paint.Align.LEFT);
                composerStartRestartGroup.updateRememberedValue(paint21111116);
                obj4 = paint21111116;
            }
            obj4 = objRememberedValue4;
            composerStartRestartGroup.endReplaceableGroup();
            Paint paint21111117 = (Paint) obj4;
            Float fValueOf11111115 = Float.valueOf(fMo312toPxR2X_6o2);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged5 = composerStartRestartGroup.changed(fValueOf11111115);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged5) {
                obj5 = objRememberedValue5;
                Paint paint21111118 = new Paint();
                paint21111118.setAntiAlias(true);
                paint21111118.setTextSize(fMo312toPxR2X_6o2);
                paint21111118.setColor(-1);
                paint21111118.setTextAlign(Paint.Align.LEFT);
                paint21111118.setFakeBoldText(true);
                composerStartRestartGroup.updateRememberedValue(paint21111118);
                obj5 = paint21111118;
            } else {
                obj5 = objRememberedValue5;
                Paint paint21111119 = new Paint();
                paint21111119.setAntiAlias(true);
                paint21111119.setTextSize(fMo312toPxR2X_6o2);
                paint21111119.setColor(-1);
                paint21111119.setTextAlign(Paint.Align.LEFT);
                paint21111119.setFakeBoldText(true);
                composerStartRestartGroup.updateRememberedValue(paint21111119);
                obj5 = paint21111119;
            }
            obj5 = objRememberedValue5;
            composerStartRestartGroup.endReplaceableGroup();
            Paint paint1111111111111110 = (Paint) obj5;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue6 == companion.getEmpty()) {
                i27 = 2;
                snapshotMutationPolicy = null;
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j8), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                i27 = 2;
                snapshotMutationPolicy = null;
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState4 = (MutableState) objRememberedValue6;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i27, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState5 = (MutableState) objRememberedValue7;
            if (chartDrawableData5 != null) {
                listA = chartDrawableData5.a();
            } else {
                listA = null;
            }
            if (chartDrawableData6 != null) {
                listA2 = chartDrawableData6.a();
            } else {
                listA2 = null;
            }
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged6 = composerStartRestartGroup.changed(listA) | composerStartRestartGroup.changed(listA2);
            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChanged6) {
                listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                if (chartDrawableData5 != null) {
                    while (r12.hasNext()) {
                        if (chartXY.getY() != null) {
                            listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                        }
                    }
                    Unit unit111115 = Unit.INSTANCE;
                }
                if (chartDrawableData6 != null) {
                    while (r12.hasNext()) {
                        if (chartXY2.getY() != null) {
                            listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                        }
                    }
                    Unit unit111116 = Unit.INSTANCE;
                }
                objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            } else {
                listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                if (chartDrawableData5 != null) {
                    while (r12.hasNext()) {
                        if (chartXY.getY() != null) {
                            listCreateListBuilder.add(Long.valueOf(chartXY.getX()));
                        }
                    }
                    Unit unit111117 = Unit.INSTANCE;
                }
                if (chartDrawableData6 != null) {
                    while (r12.hasNext()) {
                        if (chartXY2.getY() != null) {
                            listCreateListBuilder.add(Long.valueOf(chartXY2.getX()));
                        }
                    }
                    Unit unit111118 = Unit.INSTANCE;
                }
                objRememberedValue8 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsJvmKt.toSortedSet(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder)));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composerStartRestartGroup.endReplaceableGroup();
            List list111111 = (List) objRememberedValue8;
            State stateRememberUpdatedState111119 = SnapshotStateKt.rememberUpdatedState(list111111, composerStartRestartGroup, 8);
            State stateRememberUpdatedState1111110 = SnapshotStateKt.rememberUpdatedState(mutableState3, composerStartRestartGroup, (i6 >> 27) & 14);
            State stateRememberUpdatedState1111111 = SnapshotStateKt.rememberUpdatedState(function11111111111111, composerStartRestartGroup, (i7 >> 24) & 14);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function11111111111110, composerStartRestartGroup, (i7 >> 27) & 14);
            stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function1111111111119, composerStartRestartGroup, i22 & 14);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState6 = (MutableState) objRememberedValue9;
            float fMo313toPx0680j_11111115 = density15.mo313toPx0680j_4(Dp.m4104constructorimpl(fM4104constructorimpl4 + fM4104constructorimpl5));
            float fMo313toPx0680j_11111116 = density15.mo313toPx0680j_4(fM4104constructorimpl4);
            float f11111111112 = fM4104constructorimpl4;
            float fMo313toPx0680j_11111117 = density15.mo313toPx0680j_4(Dp.m4104constructorimpl(f4));
            float fMo313toPx0680j_11111118 = density15.mo313toPx0680j_4(Dp.m4104constructorimpl(Dp.m4104constructorimpl(f7) - fM4104constructorimpl110));
            if (j2 > 0) {
                fFloatValue = 0.0f;
            } else {
                fFloatValue = 0.0f;
            }
            float fFloatValue16 = ((Number) mutableState6.getValue()).floatValue() - density15.mo313toPx0680j_4(fM4104constructorimpl5);
            float fMo313toPx0680j_11111119 = density15.mo313toPx0680j_4(Dp.m4104constructorimpl(600));
            if (chartDrawableData5 != null) {
                pointRadiusDp = chartDrawableData5.getPointRadiusDp();
            } else {
                pointRadiusDp = 0.0f;
            }
            if (chartDrawableData6 != null) {
                pointRadiusDp2 = chartDrawableData6.getPointRadiusDp();
            } else {
                pointRadiusDp2 = 0.0f;
            }
            fMo313toPx0680j_4 = density15.mo313toPx0680j_4(Dp.m4104constructorimpl(Math.max(pointRadiusDp, pointRadiusDp2)));
            float f11111111113 = 16;
            State stateRememberUpdatedState1111112 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(Math.max(4 * fMo313toPx0680j_4, density15.mo313toPx0680j_4(Dp.m4104constructorimpl(f11111111113)))), composerStartRestartGroup, 0);
            if (fFloatValue > 0.0f) {
                j9 = ((long) (fMo313toPx0680j_4 / fFloatValue)) + 1;
            } else {
                j9 = 0;
            }
            long j111116 = j9;
            jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(minMax.getSecond().longValue() - j2, minMax.getFirst().longValue());
            if (jCoerceAtLeast > minMax.getFirst().longValue()) {
                z4 = true;
            } else {
                z4 = false;
            }
            float fMax15 = Math.max(viewConfiguration15.getTouchSlop() * 2.0f, density15.mo313toPx0680j_4(Dp.m4104constructorimpl(f11111111113)));
            if (chartDrawableData5 != null) {
                pairF = chartDrawableData5.f();
            } else {
                pairF = null;
            }
            if (chartDrawableData6 != null) {
                pairF2 = chartDrawableData6.f();
            } else {
                pairF2 = null;
            }
            Long lValueOf119 = Long.valueOf(j8);
            Long lValueOf1110 = Long.valueOf(j2);
            Pair<Float, Float> pair119 = pairF2;
            Pair<Float, Float> pair1110 = pairF;
            objArr = new Object[]{Long.valueOf(j8), minMax, Long.valueOf(jCoerceAtLeast), mutableState5, mutableState4};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            zChanged7 = false;
            while (i28 < 5) {
                zChanged7 |= composerStartRestartGroup.changed(objArr[i28]);
            }
            objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (zChanged7) {
                objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            } else {
                objRememberedValue10 = new ChartComposeKt$Chart$2$1(j8, minMax, jCoerceAtLeast, mutableState5, mutableState4, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i411115 = ((i7 >> 12) & 14) | 4096;
            int i411116 = i7 >> 3;
            EffectsKt.LaunchedEffect(lValueOf119, minMax, lValueOf1110, (Function2) objRememberedValue10, composerStartRestartGroup, (i411116 & 896) | i411115 | (i411116 & 112));
            Pair<Long, Long> pairD15 = d(mutableState5);
            objArr2 = new Object[]{mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            zChanged8 = false;
            while (i29 < 4) {
                zChanged8 |= composerStartRestartGroup.changed(objArr2[i29]);
            }
            objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (zChanged8) {
                objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            } else {
                objRememberedValue11 = new ChartComposeKt$Chart$3$1(mutableState5, mutableState4, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(pairD15, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 64);
            Object[] objArr17 = new Object[5];
            if (mutableState3 != null) {
                value = mutableState3.getValue();
            } else {
                value = null;
            }
            objArr17[0] = value;
            objArr17[1] = list111111;
            objArr17[2] = Long.valueOf(b(mutableState4));
            objArr17[3] = Long.valueOf(j2);
            objArr17[4] = Long.valueOf(j111116);
            EffectsKt.LaunchedEffect(objArr17, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$4(mutableState3, list111111, j2, j111116, mutableState4, stateRememberUpdatedState1111111, null), composerStartRestartGroup, 72);
            Modifier modifierM455height3ABfNKs15 = SizeKt.m455height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4104constructorimpl(f7));
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged9 = composerStartRestartGroup.changed(mutableState6);
            objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (zChanged9) {
                objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p010kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                        m4625invokeozmzZPI(intSize.m4268unboximpl());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                    public final void m4625invokeozmzZPI(long j111117) {
                        mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j111117)));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            } else {
                objRememberedValue12 = new Function1<IntSize, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p010kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                        m4625invokeozmzZPI(intSize.m4268unboximpl());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                    public final void m4625invokeozmzZPI(long j111117) {
                        mutableState6.setValue(Float.valueOf(IntSize.m4264getWidthimpl(j111117)));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierPointerInput15 = SuspendingPointerInputFilterKt.pointerInput(OnRemeasuredModifierKt.onSizeChanged(modifierM455height3ABfNKs15, (Function1) objRememberedValue12), new Object[]{Float.valueOf(fFloatValue), Float.valueOf(fMo313toPx0680j_11111116), Float.valueOf(fFloatValue16), Float.valueOf(fMo313toPx0680j_11111117), Float.valueOf(fMo313toPx0680j_11111118), minMax, Long.valueOf(j2), chartScrollSnapUnit3, view15}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new ChartComposeKt$Chart$6(fMo313toPx0680j_11111116, fFloatValue16, fMo313toPx0680j_11111117, fMo313toPx0680j_11111118, view15, viewConfiguration15, fFloatValue, minMax, jCoerceAtLeast, z4, fMax15, fMo313toPx0680j_11111119, mutableState5, mutableState4, stateRememberUpdatedState1111110, stateRememberUpdatedState111119, stateRememberUpdatedState1111112, stateRememberUpdatedState1111111, stateRememberUpdatedState, chartScrollSnapUnit3, stateRememberUpdatedState2, null));
            MutableState<Integer> mutableState1117 = mutableState3;
            Composer composer17 = composerStartRestartGroup;
            CanvasKt.Canvas(modifierPointerInput15, new ChartComposeKt$Chart$7(f11111111112, f4, fM4104constructorimpl5, fM4104constructorimpl110, j2, pair1110, pair119, i26, paint111111111111113, paint111111111111116, z3, chartDrawableData5, chartDrawableData6, list4, paint111111111111119, minMax, j7, list3, mutableState1117, list111111, markerLabelFormat, paint21111117, iM1672toArgb8_81llA, mutableState4, fM4104constructorimpl3, xLabelFormat, paint1111111111111110), composer17, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function10 = function11111111111110;
            function11 = function11111111111111;
            function12 = function1111111111119;
            mutableState7 = mutableState1117;
            f10 = f7;
            chartDrawableData7 = chartDrawableData5;
            chartDrawableData8 = chartDrawableData6;
            list5 = list3;
            list6 = list4;
            i30 = i26;
            f11 = f8;
            f12 = f9;
            z5 = z3;
            j10 = j8;
            chartScrollSnapUnit4 = chartScrollSnapUnit3;
            j11 = j7;
            f13 = fM4104constructorimpl3;
            composer2 = composer17;
        }
        scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$Chart$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer18, Integer num) {
                invoke(composer18, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer18, int i411117) {
                ChartComposeKt.a(f10, chartDrawableData7, chartDrawableData8, list5, list6, i30, f11, f12, z5, mutableState7, markerLabelFormat, f4, minMax, j2, j10, chartScrollSnapUnit4, j11, xLabelFormat, function11, function10, function12, f13, composer18, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
            }
        });
    }

    public static final long b(MutableState<Long> mutableState) {
        return mutableState.getValue().longValue();
    }

    public static final void c(MutableState<Long> mutableState, long j2) {
        mutableState.setValue(Long.valueOf(j2));
    }

    public static final Pair<Long, Long> d(MutableState<Pair<Long, Long>> mutableState) {
        return mutableState.getValue();
    }

    public static final void e(MutableState<Pair<Long, Long>> mutableState, Pair<Long, Long> pair) {
        mutableState.setValue(pair);
    }

    public static final List<Long> f(State<? extends List<Long>> state) {
        return state.getValue();
    }

    public static final MutableState<Integer> g(State<? extends MutableState<Integer>> state) {
        return state.getValue();
    }

    public static final Function1<Integer, Unit> h(State<? extends Function1<? super Integer, Unit>> state) {
        return (Function1) state.getValue();
    }

    public static final Function1<Long, Unit> i(State<? extends Function1<? super Long, Unit>> state) {
        return (Function1) state.getValue();
    }

    public static final Function2<Long, ChartScrollDirection, Long> j(State<? extends Function2<? super Long, ? super ChartScrollDirection, Long>> state) {
        return (Function2) state.getValue();
    }

    public static final float k(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final long l(ChartScrollSnapUnit chartScrollSnapUnit, Pair<Long, Long> pair, long j2, long j3) {
        switch (a.$EnumSwitchMapping$0[chartScrollSnapUnit.ordinal()]) {
            case 1:
                return RangesKt___RangesKt.coerceIn(j3, pair.getFirst().longValue(), j2);
            case 2:
                return m(pair, j2, j3, 1000L);
            case 3:
                return m(pair, j2, j3, 60000L);
            case 4:
                return m(pair, j2, j3, 3600000L);
            case 5:
                return m(pair, j2, j3, 86400000L);
            case 6:
                return n(pair, j2, j3);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final long m(Pair<Long, Long> pair, long j2, long j3, long j4) {
        return RangesKt___RangesKt.coerceIn(pair.getFirst().longValue() + (((RangesKt___RangesKt.coerceAtLeast(j3 - pair.getFirst().longValue(), 0L) + (j4 / ((long) 2))) / j4) * j4), pair.getFirst().longValue(), j2);
    }

    public static final long n(Pair<Long, Long> pair, long j2, long j3) {
        LocalDate localDateD = h15.D(j3);
        long jX = h15.x(h15.y(localDateD));
        LocalDate localDatePlusMonths = localDateD.plusMonths(1L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusMonths, "date.plusMonths(1)");
        long jX2 = h15.x(h15.y(localDatePlusMonths));
        return RangesKt___RangesKt.coerceIn(j3 - jX < (jX2 - jX) / ((long) 2) ? jX : jX2, pair.getFirst().longValue(), j2);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 4293980658L, showBackground = true, widthDp = 360)
    public static final void o(@Nullable Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-313778707);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-313778707, i, -1, "com.heytap.health.bodyfat.ui.PreviewMonthUI (ChartCompose.kt:1227)");
            }
            LocalDate localDateD = h15.D(1773665570452L);
            LocalDate end = localDateD.plusDays(2366L);
            Intrinsics.checkNotNullExpressionValue(end, "end");
            int iA = ((int) ((x1k.a(end) - x1k.a(localDateD)) / 86400000)) + 1;
            Random Random = RandomKt.Random(42);
            ArrayList arrayList = new ArrayList(iA);
            int i2 = 0;
            while (i2 < iA) {
                arrayList.add(new ChartXY(x1k.a(localDateD) + (((long) i2) * 24 * 3600000), Float.valueOf((Random.nextFloat() * 20.0f) + 15.0f)));
                i2++;
                composerStartRestartGroup = composerStartRestartGroup;
            }
            Composer composer3 = composerStartRestartGroup;
            ArrayList arrayList2 = new ArrayList(iA);
            int i3 = 0;
            while (i3 < iA) {
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(new ChartXY(x1k.a(localDateD) + (((long) i3) * 24 * 3600000), Float.valueOf(Random.nextInt(10000) + 50000.0f)));
                i3++;
                arrayList2 = arrayList3;
            }
            ChartDrawableData chartDrawableData = new ChartDrawableData(4292556844L, 2.0f, 4.0f, 1.0f, 16777215L, arrayList, 0L, null, new Function1<Float, String>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$PreviewMonthUI$leftData$1
                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ String invoke(Float f) {
                    return invoke(f.floatValue());
                }

                @NotNull
                public final String invoke(float f) {
                    return ((int) f) + "%";
                }
            }, 192, null);
            ChartDrawableData chartDrawableData2 = new ChartDrawableData(4280208845L, 2.0f, 4.0f, 1.0f, 16777215L, arrayList2, 0L, null, new Function1<Float, String>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$PreviewMonthUI$rightData$1
                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ String invoke(Float f) {
                    return invoke(f.floatValue());
                }

                @NotNull
                public final String invoke(float f) {
                    return String.valueOf(f / 1000);
                }
            }, 192, null);
            Pair pair = TuplesKt.to(Long.valueOf(h15.x(h15.y(localDateD))), Long.valueOf(x1k.a(end)));
            Modifier modifierM163backgroundbw27NRU$default = BackgroundKt.m163backgroundbw27NRU$default(PaddingKt.m426padding3ABfNKs(Modifier.INSTANCE, Dp.m4104constructorimpl(16)), ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_card_white_bg, composer3, 0), null, 2, null);
            composer3.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
            composer3.startReplaceableGroup(-1323940314);
            Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM163backgroundbw27NRU$default);
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor);
            } else {
                composer3.useNode();
            }
            composer3.disableReusing();
            Composer composerM1259constructorimpl = Updater.m1259constructorimpl(composer3);
            Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl, density, companion.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            composer3.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer3)), composer3, 0);
            composer3.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composer3;
            a(0.0f, chartDrawableData, chartDrawableData2, null, null, 1, 0.0f, 0.0f, false, null, new Function3<Long, Float, Float, List<? extends String>>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$PreviewMonthUI$1$1
                @Override // p010kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ List<? extends String> invoke(Long l2, Float f, Float f2) {
                    return invoke(l2.longValue(), f.floatValue(), f2.floatValue());
                }

                @NotNull
                public final List<String> invoke(long j2, float f, float f2) {
                    return CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{String.valueOf(h15.D(j2)), String.valueOf(f), String.valueOf(f2)});
                }
            }, 97.0f, pair, 2678400000L, 0L, null, 0L, new Function1<Long, String>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$PreviewMonthUI$1$2
                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ String invoke(Long l2) {
                    return invoke(l2.longValue());
                }

                @NotNull
                public final String invoke(long j2) {
                    int dayOfMonth = h15.D(j2).getDayOfMonth();
                    return dayOfMonth % 3 == 1 ? String.valueOf(dayOfMonth) : "";
                }
            }, null, null, null, 0.0f, composer2, 197184, 12586038, 0, 4047833);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$PreviewMonthUI$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                invoke(composer4, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer4, int i4) {
                ChartComposeKt.o(composer4, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 4293980658L, locale = "zh", showBackground = true, widthDp = 360)
    public static final void p(@Nullable Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-857612523);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-857612523, i, -1, "com.heytap.health.bodyfat.ui.PreviewWeekUI (ChartCompose.kt:1163)");
            }
            LocalDate localDateD = h15.D(1773665570452L);
            LocalDate end = localDateD.plusDays(2366L);
            Intrinsics.checkNotNullExpressionValue(end, "end");
            int iA = ((int) ((x1k.a(end) - x1k.a(localDateD)) / 86400000)) + 1;
            Random Random = RandomKt.Random(42);
            ArrayList arrayList = new ArrayList(iA);
            int i2 = 0;
            while (i2 < iA) {
                arrayList.add(new ChartXY(x1k.a(localDateD) + (((long) i2) * 24 * 3600000), Float.valueOf((Random.nextFloat() * 20.0f) + 15.0f)));
                i2++;
                localDateD = localDateD;
            }
            LocalDate localDate = localDateD;
            ArrayList arrayList2 = new ArrayList(iA);
            for (int i3 = 0; i3 < iA; i3++) {
                arrayList2.add(new ChartXY(x1k.a(localDate) + (((long) i3) * 24 * 3600000), Float.valueOf(Random.nextInt(10000) + 50000.0f)));
            }
            float f = 2.0f;
            float f2 = 4.0f;
            float f3 = 1.0f;
            long j2 = 16777215;
            long j3 = 0;
            Pair pair = null;
            int i4 = 192;
            DefaultConstructorMarker defaultConstructorMarker = null;
            ChartDrawableData chartDrawableData = new ChartDrawableData(4292556844L, f, f2, f3, j2, arrayList, j3, pair, new Function1<Float, String>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$PreviewWeekUI$leftData$1
                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ String invoke(Float f4) {
                    return invoke(f4.floatValue());
                }

                @NotNull
                public final String invoke(float f4) {
                    return ((int) f4) + "%";
                }
            }, i4, defaultConstructorMarker);
            ChartDrawableData chartDrawableData2 = new ChartDrawableData(4280208845L, f, f2, f3, j2, arrayList2, j3, pair, new Function1<Float, String>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$PreviewWeekUI$rightData$1
                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ String invoke(Float f4) {
                    return invoke(f4.floatValue());
                }

                @NotNull
                public final String invoke(float f4) {
                    return String.valueOf(f4 / 1000);
                }
            }, i4, defaultConstructorMarker);
            LocalDate localDateS = h15.s(localDate);
            Intrinsics.checkNotNullExpressionValue(localDateS, "start.mondayOfWeek()");
            Pair pair2 = TuplesKt.to(Long.valueOf(h15.x(localDateS)), Long.valueOf(x1k.a(end)));
            final List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{StringResources_androidKt.stringResource(R$string.lib_base_date_monday, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(R$string.lib_base_date_tuesday, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(R$string.lib_base_date_wednesday, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(R$string.lib_base_date_thursday, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(R$string.lib_base_date_friday, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(R$string.lib_base_date_saturday, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(R$string.lib_base_date_sunday, composerStartRestartGroup, 0)});
            Modifier modifierM163backgroundbw27NRU$default = BackgroundKt.m163backgroundbw27NRU$default(PaddingKt.m426padding3ABfNKs(Modifier.INSTANCE, Dp.m4104constructorimpl(16)), ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_card_white_bg, composerStartRestartGroup, 0), null, 2, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl, density, companion.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m1201Text4IGK_g(String.valueOf(localDate), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 131070);
            long jLongValue = ((Number) pair2.getFirst()).longValue() + 129600000;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(2, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            a(0.0f, chartDrawableData, chartDrawableData2, null, null, 1, 0.0f, 0.0f, false, (MutableState) objRememberedValue, new Function3<Long, Float, Float, List<? extends String>>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$PreviewWeekUI$1$2
                @Override // p010kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ List<? extends String> invoke(Long l2, Float f4, Float f5) {
                    return invoke(l2.longValue(), f4.floatValue(), f5.floatValue());
                }

                @NotNull
                public final List<String> invoke(long j4, float f4, float f5) {
                    return CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{String.valueOf(h15.D(j4)), String.valueOf(f4), String.valueOf(f5)});
                }
            }, 97.0f, pair2, 604800000L, jLongValue, null, 0L, new Function1<Long, String>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$PreviewWeekUI$1$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ String invoke(Long l2) {
                    return invoke(l2.longValue());
                }

                @NotNull
                public final String invoke(long j4) {
                    return listListOf.get((h15.D(j4).getDayOfWeek().getValue() - 1) % 7);
                }
            }, null, null, null, 0.0f, composer2, 805503552, 3126, 0, 4030937);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$PreviewWeekUI$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i5) {
                ChartComposeKt.p(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 4293980658L, showBackground = true, widthDp = 360)
    public static final void q(@Nullable Composer composer, final int i) {
        long j2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1353285022);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1353285022, i, -1, "com.heytap.health.bodyfat.ui.PreviewYearUI (ChartCompose.kt:1282)");
            }
            LocalDate localDateD = h15.D(1773665570452L);
            LocalDate end = localDateD.plusDays(2366L);
            Intrinsics.checkNotNullExpressionValue(end, "end");
            int iA = ((int) ((x1k.a(end) - x1k.a(localDateD)) / 86400000)) + 1;
            Random Random = RandomKt.Random(42);
            ArrayList arrayList = new ArrayList(iA);
            int i2 = 0;
            while (true) {
                j2 = 3600000;
                if (i2 >= iA) {
                    break;
                }
                Random random = Random;
                arrayList.add(new ChartXY((((long) i2) * 24 * 3600000) + x1k.a(localDateD), Float.valueOf((random.nextFloat() * 20.0f) + 15.0f)));
                i2++;
                Random = random;
            }
            Random random2 = Random;
            ArrayList arrayList2 = new ArrayList(iA);
            int i3 = 0;
            while (i3 < iA) {
                arrayList2.add(new ChartXY((((long) i3) * 24 * j2) + x1k.a(localDateD), Float.valueOf(random2.nextInt(10000) + 50000.0f)));
                i3++;
                j2 = 3600000;
            }
            ChartDrawableData chartDrawableData = new ChartDrawableData(4292556844L, 2.0f, 1.0f, 0.0f, 16777215L, arrayList, 0L, null, new Function1<Float, String>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$PreviewYearUI$leftData$1
                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ String invoke(Float f) {
                    return invoke(f.floatValue());
                }

                @NotNull
                public final String invoke(float f) {
                    return ((int) f) + "%";
                }
            }, 192, null);
            ChartDrawableData chartDrawableData2 = new ChartDrawableData(4280208845L, 2.0f, 1.0f, 0.0f, 16777215L, arrayList2, 0L, null == true ? 1 : 0, new Function1<Float, String>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$PreviewYearUI$rightData$1
                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ String invoke(Float f) {
                    return invoke(f.floatValue());
                }

                @NotNull
                public final String invoke(float f) {
                    return String.valueOf(f / 1000);
                }
            }, 192, null);
            LocalDate localDateWithMonth = localDateD.withMonth(1);
            Intrinsics.checkNotNullExpressionValue(localDateWithMonth, "start.withMonth(1)");
            Pair pair = TuplesKt.to(Long.valueOf(h15.x(h15.y(localDateWithMonth))), Long.valueOf(x1k.a(end)));
            Modifier modifierM163backgroundbw27NRU$default = BackgroundKt.m163backgroundbw27NRU$default(PaddingKt.m426padding3ABfNKs(Modifier.INSTANCE, Dp.m4104constructorimpl(16)), ColorResources_androidKt.colorResource(com.heytap.health.base.R$color.lib_base_card_white_bg, composerStartRestartGroup, 0), null, 2, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl, density, companion.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(2, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            a(0.0f, chartDrawableData, chartDrawableData2, null, null, 1, 0.0f, 0.0f, true, (MutableState) objRememberedValue, new Function3<Long, Float, Float, List<? extends String>>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$PreviewYearUI$1$2
                @Override // p010kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ List<? extends String> invoke(Long l2, Float f, Float f2) {
                    return invoke(l2.longValue(), f.floatValue(), f2.floatValue());
                }

                @NotNull
                public final List<String> invoke(long j3, float f, float f2) {
                    return CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{String.valueOf(h15.D(j3)), String.valueOf(f), String.valueOf(f2)});
                }
            }, 97.0f, pair, 31622400000L, 0L, null, 0L, new Function1<Long, String>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$PreviewYearUI$1$3
                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ String invoke(Long l2) {
                    return invoke(l2.longValue());
                }

                @NotNull
                public final String invoke(long j3) {
                    LocalDate localDateD2 = h15.D(j3);
                    return localDateD2.getDayOfMonth() == localDateD2.lengthOfMonth() / 2 ? String.valueOf(localDateD2.getMonthValue()) : "";
                }
            }, null, null, null, 0.0f, composer2, 906166848, 12586038, 0, 4047065);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.bodyfat.ui.ChartComposeKt$PreviewYearUI$2
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
                ChartComposeKt.q(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}