package com.heytap.health.operation.medal;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.health.operations.bean.MedalListBean;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\b"}, d2 = {"Lcom/heytap/health/operation/medal/MedalHelper;", "", "", "Lcom/heytap/health/operations/bean/MedalListBean;", "medals", "a", "<init>", "()V", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMedalHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MedalHelper.kt\ncom/heytap/health/operation/medal/MedalHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,30:1\n1477#2:31\n1502#2,3:32\n1505#2,3:42\n372#3,7:35\n125#4:45\n152#4,2:46\n154#4:49\n603#5:48\n*S KotlinDebug\n*F\n+ 1 MedalHelper.kt\ncom/heytap/health/operation/medal/MedalHelper\n*L\n21#1:31\n21#1:32,3\n21#1:42,3\n21#1:35,7\n23#1:45\n23#1:46,2\n23#1:49\n25#1:48\n*E\n"})
public final class MedalHelper {
    public static final int $stable = 0;

    @NotNull
    public static final MedalHelper INSTANCE = new MedalHelper();

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 MedalHelper.kt\ncom/heytap/health/operation/medal/MedalHelper\n*L\n1#1,328:1\n25#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((MedalListBean) t).getSort()), Integer.valueOf(((MedalListBean) t2).getSort()));
        }
    }

    @NotNull
    public final List<MedalListBean> a(@NotNull List<? extends MedalListBean> medals) {
        Intrinsics.checkNotNullParameter(medals, "medals");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : medals) {
            String typeCode = ((MedalListBean) obj).getTypeCode();
            Object arrayList = linkedHashMap.get(typeCode);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(typeCode, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            List list = (List) ((Map.Entry) it.next()).getValue();
            SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.sortedWith(SequencesKt___SequencesKt.filter(CollectionsKt___CollectionsKt.asSequence(list), new Function1<MedalListBean, Boolean>() { // from class: com.heytap.health.operation.medal.MedalHelper$sortByTypeThenSort$2$1$1
                @Override // p010kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull MedalListBean it2) {
                    Intrinsics.checkNotNullParameter(it2, "it");
                    return Boolean.valueOf(it2.isOnline());
                }
            }), new a()));
            arrayList2.add(list);
        }
        return CollectionsKt___CollectionsKt.toList(CollectionsKt__IterablesKt.flatten(arrayList2));
    }
}
