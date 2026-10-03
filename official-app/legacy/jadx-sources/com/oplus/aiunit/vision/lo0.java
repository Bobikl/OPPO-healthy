package com.oplus.aiunit.vision;

import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.health_archives.bean.AutoStructureRequestBean;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¨\u0006\u0004"}, d2 = {"", "Lcom/heytap/health/health_archives/bean/AutoStructureRequestBean;", "", "a", "health_archives_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAutoStructureRequestBean.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoStructureRequestBean.kt\ncom/heytap/health/health_archives/bean/AutoStructureRequestBeanKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,23:1\n1549#2:24\n1620#2,3:25\n*S KotlinDebug\n*F\n+ 1 AutoStructureRequestBean.kt\ncom/heytap/health/health_archives/bean/AutoStructureRequestBeanKt\n*L\n22#1:24\n22#1:25,3\n*E\n"})
public final class lo0 {
    @NotNull
    public static final String a(@NotNull List<AutoStructureRequestBean> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<AutoStructureRequestBean> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (AutoStructureRequestBean autoStructureRequestBean : list2) {
            arrayList.add("docId: " + autoStructureRequestBean.getDocId() + ", md5: " + autoStructureRequestBean.getMd5());
        }
        String strE = GsonUtil.e(arrayList);
        Intrinsics.checkNotNullExpressionValue(strE, "toJson(map { \"docId: ${i…ocId}, md5: ${it.md5}\" })");
        return strE;
    }
}
