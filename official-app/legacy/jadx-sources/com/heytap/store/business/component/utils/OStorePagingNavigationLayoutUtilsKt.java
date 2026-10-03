package com.heytap.store.business.component.utils;

import android.graphics.Point;
import com.heytap.store.business.component.entity.OStoreHeaderInfo;
import com.heytap.store.business.component.entity.OStoreItemDetail;
import com.heytap.store.business.component.entity.OStorePagingNavigationData;
import com.heytap.store.business.component.view.OStorePagingNavigation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001af\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012¨\u0006\u0014"}, d2 = {"pagingNavigationChunkData", "", "Lcom/heytap/store/business/component/entity/OStorePagingNavigationData;", "notNeedPaging", "", "type", "Lcom/heytap/store/business/component/view/OStorePagingNavigation;", "countPerPage", "", "row", "col", "itemSize", "Landroid/graphics/Point;", "src", "Lcom/heytap/store/business/component/entity/OStoreItemDetail;", "headerInfo", "Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;", "moduleCode", "", "statisticTitle", "widget_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class OStorePagingNavigationLayoutUtilsKt {
    @NotNull
    public static final List<OStorePagingNavigationData> pagingNavigationChunkData(boolean z, @NotNull final OStorePagingNavigation type, int i, final int i2, final int i3, @Nullable final Point point, @NotNull List<OStoreItemDetail> src, @Nullable final OStoreHeaderInfo oStoreHeaderInfo, @NotNull final String moduleCode, @NotNull final String statisticTitle) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(moduleCode, "moduleCode");
        Intrinsics.checkNotNullParameter(statisticTitle, "statisticTitle");
        final ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(new OStorePagingNavigationData(type, i2, i3, point, i, src, oStoreHeaderInfo, moduleCode, statisticTitle));
        } else {
            final Ref.IntRef intRef = new Ref.IntRef();
            CollectionsKt___CollectionsKt.windowed(src, i, i, true, new Function1<List<? extends OStoreItemDetail>, Integer>() { // from class: com.heytap.store.business.component.utils.OStorePagingNavigationLayoutUtilsKt.pagingNavigationChunkData.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(List<? extends OStoreItemDetail> list) {
                    return invoke2((List<OStoreItemDetail>) list);
                }

                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Integer invoke2(@NotNull List<OStoreItemDetail> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    arrayList.add(new OStorePagingNavigationData(type, i2, i3, point, intRef.element, CollectionsKt___CollectionsKt.toMutableList((Collection) it), oStoreHeaderInfo, moduleCode, statisticTitle));
                    Ref.IntRef intRef2 = intRef;
                    int i4 = intRef2.element;
                    intRef2.element = i4 + 1;
                    return Integer.valueOf(i4);
                }
            });
        }
        return arrayList;
    }
}
