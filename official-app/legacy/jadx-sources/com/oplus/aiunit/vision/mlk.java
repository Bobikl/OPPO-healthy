package com.oplus.aiunit.vision;

import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.health_archives.bean.HealthBusinessCode;
import com.heytap.health.health_archives.bean.UploadPdfBean;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0010\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\u0010\u0010\b\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\u0010\u0010\t\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u0000¨\u0006\n"}, d2 = {"", "Lcom/heytap/health/health_archives/bean/UploadPdfBean;", "", "a", "", MapSchema.FIELD_NAME_ENTRY, "f", "b", "d", "c", "health_archives_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUploadPdfBean.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadPdfBean.kt\ncom/heytap/health/health_archives/bean/UploadPdfBeanKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1726#2,3:87\n766#2:90\n857#2,2:91\n766#2:93\n857#2,2:94\n1603#2,9:96\n1855#2:105\n1856#2:107\n1612#2:108\n766#2:109\n857#2,2:110\n766#2:112\n857#2,2:113\n1549#2:115\n1620#2,3:116\n1549#2:119\n1620#2,3:120\n1#3:106\n*S KotlinDebug\n*F\n+ 1 UploadPdfBean.kt\ncom/heytap/health/health_archives/bean/UploadPdfBeanKt\n*L\n39#1:87,3\n46#1:90\n46#1:91,2\n54#1:93\n54#1:94,2\n54#1:96,9\n54#1:105\n54#1:107\n54#1:108\n61#1:109\n61#1:110,2\n68#1:112\n68#1:113,2\n72#1:115\n72#1:116,3\n76#1:119\n76#1:120,3\n54#1:106\n*E\n"})
public final class mlk {
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    public static final boolean a(@NotNull List<UploadPdfBean> list) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<UploadPdfBean> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        for (UploadPdfBean uploadPdfBean : list2) {
            if (uploadPdfBean.getErrorCode() > -1) {
                z = true;
            } else {
                String docId = uploadPdfBean.getDocId();
                if (docId == null || docId.length() == 0) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final List<UploadPdfBean> b(@NotNull List<UploadPdfBean> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((UploadPdfBean) obj).getErrorCode() > HealthBusinessCode.SUCCESS.getCode()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final String c(@NotNull List<UploadPdfBean> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<UploadPdfBean> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (UploadPdfBean uploadPdfBean : list2) {
            arrayList.add("docId: " + uploadPdfBean.getDocId() + ", clientId: " + uploadPdfBean.getClientFileId() + ", code: " + uploadPdfBean.getErrorCode() + ", url = " + v0j.a(uploadPdfBean.getOriginalUrl(), 5, 5));
        }
        String strE = GsonUtil.e(arrayList);
        Intrinsics.checkNotNullExpressionValue(strE, "toJson(map {\n        \"do…      )\n        }\"\n    })");
        return strE;
    }

    @NotNull
    public static final String d(@NotNull List<UploadPdfBean> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<UploadPdfBean> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (UploadPdfBean uploadPdfBean : list2) {
            arrayList.add("docId: " + uploadPdfBean.getDocId() + ", clientId: " + uploadPdfBean.getClientFileId() + ", code: " + uploadPdfBean.getErrorCode());
        }
        String strE = GsonUtil.e(arrayList);
        Intrinsics.checkNotNullExpressionValue(strE, "toJson(map { \"docId: ${i…code: ${it.errorCode}\" })");
        return strE;
    }

    @NotNull
    public static final List<String> e(@NotNull List<UploadPdfBean> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            UploadPdfBean uploadPdfBean = (UploadPdfBean) obj;
            String docId = uploadPdfBean.getDocId();
            boolean z = false;
            if (!(docId == null || docId.length() == 0) && uploadPdfBean.getErrorCode() == -1) {
                z = true;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String docId2 = ((UploadPdfBean) it.next()).getDocId();
            if (docId2 != null) {
                arrayList2.add(docId2);
            }
        }
        return arrayList2;
    }

    @NotNull
    public static final List<UploadPdfBean> f(@NotNull List<UploadPdfBean> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((UploadPdfBean) obj).getErrorCode() == HealthBusinessCode.SUCCESS.getCode()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
