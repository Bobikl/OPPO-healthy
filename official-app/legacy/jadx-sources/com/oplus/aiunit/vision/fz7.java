package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.health.health.insight.ModuleType;
import com.heytap.health.insight.singledimen.TrendCardControl;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import p010kotlin.jvm.internal.ArrayIteratorKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016J\u001e\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003J \u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002J \u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0002J&\u0010\u0014\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J \u0010\u0017\u001a\u0004\u0018\u00010\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0016\u001a\u00020\u0012H\u0002J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0002¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/fz7;", "", "Lcom/oplus/aiunit/vision/g11;", "", "cardList", "", "c", "Lcom/heytap/health/health/insight/ModuleType;", "moduleType", "Lcom/oplus/aiunit/vision/f8b;", "contentTypeList", "f", "contentLogics", "b", "d", "", b2n.g, "sortedContentLogics", "", "lastShow", "a", "sorted", "lastShowType", MapSchema.FIELD_NAME_ENTRY, b2n.f, "logicType", "", "i", "<init>", "()V", "Companion", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFreqStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FreqStrategy.kt\ncom/heytap/health/insight/singledimen/strategy/FreqStrategy\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n32#2:205\n33#2:209\n766#3:206\n857#3,2:207\n1045#3:210\n288#3,2:211\n288#3,2:213\n288#3,2:216\n1045#3:218\n288#3,2:219\n288#3,2:221\n288#3,2:223\n1#4:215\n*S KotlinDebug\n*F\n+ 1 FreqStrategy.kt\ncom/heytap/health/insight/singledimen/strategy/FreqStrategy\n*L\n37#1:205\n37#1:209\n38#1:206\n38#1:207,2\n57#1:210\n70#1:211,2\n105#1:213,2\n114#1:216,2\n138#1:218\n143#1:219,2\n150#1:221,2\n151#1:223,2\n*E\n"})
public final class fz7 {
    public static final int $stable = 0;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModuleType.values().length];
            try {
                iArr[ModuleType.STEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ModuleType.CONSUMPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ModuleType.SNORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ModuleType.HEART_RATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ModuleType.HRV.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 FreqStrategy.kt\ncom/heytap/health/insight/singledimen/strategy/FreqStrategy\n*L\n1#1,328:1\n57#2:329\n*E\n"})
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            f8b f8bVarH = ((g11) t).h();
            Intrinsics.checkNotNull(f8bVarH);
            Integer numValueOf = Integer.valueOf(f8bVarH.getPriority());
            f8b f8bVarH2 = ((g11) t2).h();
            Intrinsics.checkNotNull(f8bVarH2);
            return ComparisonsKt__ComparisonsKt.compareValues(numValueOf, Integer.valueOf(f8bVarH2.getPriority()));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 FreqStrategy.kt\ncom/heytap/health/insight/singledimen/strategy/FreqStrategy\n*L\n1#1,328:1\n138#2:329\n*E\n"})
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((f8b) t).getPriority()), Integer.valueOf(((f8b) t2).getPriority()));
        }
    }

    public final g11 a(ModuleType moduleType, List<? extends g11> sortedContentLogics, int lastShow) {
        Object next;
        Object next2;
        f8b f8bVarH;
        f8b f8bVarH2;
        TrendCardControl.INSTANCE.k(sortedContentLogics);
        a7b.f("InsightChooserStrategy", "=== chooseCard after sorted: " + Unit.INSTANCE);
        List<? extends g11> list = sortedContentLogics;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            f8bVarH2 = ((g11) next).h();
            Intrinsics.checkNotNull(f8bVarH2);
        } while (!(f8bVarH2.getPriority() > lastShow));
        g11 g11Var = (g11) next;
        if (g11Var != null) {
            a7b.f("InsightChooserStrategy", "chooseCard lastShow:" + lastShow + ", firstBigger:" + g11Var.h());
            i(moduleType, g11Var.h());
            return g11Var;
        }
        Iterator<T> it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            f8bVarH = ((g11) next2).h();
            Intrinsics.checkNotNull(f8bVarH);
        } while (!(f8bVarH.getPriority() < lastShow));
        g11 g11Var2 = (g11) next2;
        a7b.f("InsightChooserStrategy", "chooseCard lastShow:" + lastShow + ", firstSmaller:" + (g11Var2 != null ? g11Var2.h() : null));
        if (g11Var2 != null) {
            i(moduleType, g11Var2.h());
            return g11Var2;
        }
        a7b.b("InsightChooserStrategy", "chooseCard first smaller is null, return first");
        g11 g11Var3 = (g11) CollectionsKt___CollectionsKt.first((List) sortedContentLogics);
        i(moduleType, g11Var3.h());
        return g11Var3;
    }

    public final g11 b(ModuleType moduleType, List<? extends g11> contentLogics) {
        TrendCardControl.INSTANCE.k(contentLogics);
        a7b.f("InsightChooserStrategy", "=== chooseCard, " + Unit.INSTANCE);
        if (contentLogics.isEmpty()) {
            a7b.f("InsightChooserStrategy", "chooseCard contentLogics is empty, " + moduleType);
            return null;
        }
        int iG = g(moduleType);
        List<? extends g11> listSortedWith = CollectionsKt___CollectionsKt.sortedWith(contentLogics, new c());
        if (h(moduleType)) {
            a7b.f("InsightChooserStrategy", "chooseCard need changeCard");
            return a(moduleType, listSortedWith, iG);
        }
        g11 g11VarD = d(moduleType, contentLogics);
        return g11VarD == null ? a(moduleType, listSortedWith, iG) : g11VarD;
    }

    @NotNull
    public List<g11> c(@NotNull List<? extends g11> cardList) {
        Intrinsics.checkNotNullParameter(cardList, "cardList");
        ModuleType[] moduleTypeArrValues = ModuleType.values();
        ArrayList arrayList = new ArrayList();
        Iterator it = ArrayIteratorKt.iterator(moduleTypeArrValues);
        while (it.hasNext()) {
            ModuleType moduleType = (ModuleType) it.next();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : cardList) {
                f8b f8bVarH = ((g11) obj).h();
                if ((f8bVarH != null ? f8bVarH.getModuleType() : null) == moduleType) {
                    arrayList2.add(obj);
                }
            }
            g11 g11VarB = b(moduleType, arrayList2);
            if (g11VarB != null) {
                arrayList.add(g11VarB);
            }
        }
        return arrayList;
    }

    public final g11 d(ModuleType moduleType, List<? extends g11> contentLogics) {
        Object next;
        f8b f8bVarH;
        int iG = g(moduleType);
        TrendCardControl.INSTANCE.k(contentLogics);
        a7b.f("InsightChooserStrategy", "findSameCard " + moduleType + ", " + Unit.INSTANCE);
        Iterator<T> it = contentLogics.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            f8bVarH = ((g11) next).h();
            Intrinsics.checkNotNull(f8bVarH);
        } while (!(f8bVarH.getPriority() == iG));
        g11 g11Var = (g11) next;
        a7b.f("InsightChooserStrategy", "findSameCard lastShowType:" + iG + ", sameCard found: " + (g11Var != null ? g11Var.h() : null));
        return g11Var;
    }

    public final f8b e(List<? extends f8b> sorted, int lastShowType) {
        Object obj;
        Object next;
        List<? extends f8b> list = sorted;
        Iterator<T> it = list.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((f8b) next).getPriority() > lastShowType));
        f8b f8bVar = (f8b) next;
        for (Object obj2 : list) {
            if (((f8b) obj2).getPriority() < lastShowType) {
                obj = obj2;
                break;
            }
        }
        f8b f8bVar2 = (f8b) obj;
        f8b f8bVar3 = f8bVar == null ? f8bVar2 : f8bVar;
        a7b.f("InsightChooserStrategy", "getFinalVisibleContentType bigger:" + f8bVar + ", smaller:" + f8bVar2 + ", lastShow:" + lastShowType);
        return f8bVar3;
    }

    @Nullable
    public final f8b f(@NotNull ModuleType moduleType, @NotNull List<? extends f8b> contentTypeList) {
        Intrinsics.checkNotNullParameter(moduleType, "moduleType");
        Intrinsics.checkNotNullParameter(contentTypeList, "contentTypeList");
        a7b.f("InsightChooserStrategy", "getFinalVisibleContentType " + moduleType + ", " + contentTypeList);
        Object obj = null;
        if (contentTypeList.isEmpty()) {
            return null;
        }
        if (contentTypeList.size() == 1) {
            return (f8b) CollectionsKt___CollectionsKt.first((List) contentTypeList);
        }
        List<? extends f8b> list = contentTypeList;
        List<? extends f8b> listSortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new d());
        int iG = g(moduleType);
        if (h(moduleType)) {
            return e(listSortedWith, iG);
        }
        for (Object obj2 : list) {
            if (((f8b) obj2).getPriority() == iG) {
                obj = obj2;
                break;
            }
        }
        f8b f8bVar = (f8b) obj;
        a7b.f("InsightChooserStrategy", "getFinalVisibleContentType sameType: " + f8bVar);
        return f8bVar == null ? e(listSortedWith, iG) : f8bVar;
    }

    public final int g(ModuleType moduleType) {
        int iS0;
        int i = b.$EnumSwitchMapping$0[moduleType.ordinal()];
        if (i == 1) {
            iS0 = waa.s0();
        } else if (i == 2) {
            iS0 = waa.d();
        } else if (i == 3) {
            iS0 = waa.m0();
        } else if (i != 4) {
            iS0 = i != 5 ? waa.g0() : waa.v();
        } else {
            iS0 = waa.p();
        }
        a7b.f("InsightChooserStrategy", "getLastShowType " + moduleType + ", lastShow:" + iS0);
        return iS0;
    }

    public final boolean h(ModuleType moduleType) {
        LocalDate localDateD;
        int i = b.$EnumSwitchMapping$0[moduleType.ordinal()];
        if (i == 1) {
            localDateD = o05.D(waa.v0());
        } else if (i == 2) {
            localDateD = o05.D(waa.g());
        } else if (i == 3) {
            localDateD = o05.D(waa.p0());
        } else if (i != 4) {
            localDateD = i != 5 ? o05.D(waa.j0()) : o05.D(waa.y());
        } else {
            localDateD = o05.D(waa.s());
        }
        a7b.f("InsightChooserStrategy", "ifNeedChangeCard " + moduleType + ", lastShowTime:" + localDateD + ", now:" + LocalDate.now());
        return !Intrinsics.areEqual(localDateD, LocalDate.now());
    }

    public final void i(ModuleType moduleType, f8b logicType) {
        a7b.f("InsightChooserStrategy", "saveLastShowType " + moduleType + ", logicType:" + logicType);
        if (logicType == null) {
            return;
        }
        int i = b.$EnumSwitchMapping$0[moduleType.ordinal()];
        if (i == 1) {
            waa.t1(logicType.getPriority());
            waa.v1(System.currentTimeMillis());
            return;
        }
        if (i == 2) {
            waa.A0(logicType.getPriority());
            waa.C0(System.currentTimeMillis());
            return;
        }
        if (i == 3) {
            waa.p1(logicType.getPriority());
            waa.r1(System.currentTimeMillis());
        } else if (i == 4) {
            waa.I0(logicType.getPriority());
            waa.K0(System.currentTimeMillis());
        } else if (i != 5) {
            waa.l1(logicType.getPriority());
            waa.n1(System.currentTimeMillis());
        } else {
            waa.M0(logicType.getPriority());
            waa.O0(System.currentTimeMillis());
        }
    }
}
