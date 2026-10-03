package com.heytap.store.business.component.utils;

import android.content.Context;
import com.heytap.store.business.component.entity.ProductLatticeDetail;
import com.heytap.store.business.component.entity.ProductLatticeEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"handleProductGrid", "Lcom/heytap/store/business/component/entity/ProductLatticeEntity;", "data", "context", "Landroid/content/Context;", "widget_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ProductLatticeDataUtilKt {
    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    @Nullable
    public static final ProductLatticeEntity handleProductGrid(@Nullable ProductLatticeEntity productLatticeEntity, @NotNull Context context) {
        int i;
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        if (productLatticeEntity == null) {
            return null;
        }
        if (ScreenParamUtilKt.isPad(context)) {
            ArrayList arrayList = new ArrayList();
            List<ProductLatticeDetail> details = productLatticeEntity.getDetails();
            if (details != null) {
                for (ProductLatticeDetail productLatticeDetail : details) {
                    List<ProductLatticeDetail> childDetails = productLatticeDetail.getChildDetails();
                    Boolean boolValueOf = childDetails == null ? null : Boolean.valueOf(arrayList.addAll(childDetails));
                    if (boolValueOf == null) {
                        arrayList.add(productLatticeDetail);
                    } else {
                        boolValueOf.booleanValue();
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                ProductLatticeDetail productLatticeDetail2 = (ProductLatticeDetail) obj;
                if (productLatticeDetail2.getGoodsCardType() != 2) {
                    z = false;
                } else {
                    String backgroundPic = productLatticeDetail2.getBackgroundPic();
                    if (backgroundPic == null || backgroundPic.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (!z) {
                    arrayList2.add(obj);
                }
            }
            productLatticeEntity.setDetails(arrayList2);
            List<ProductLatticeDetail> details2 = productLatticeEntity.getDetails();
            if (details2 != null) {
                for (ProductLatticeDetail productLatticeDetail3 : details2) {
                    if (productLatticeDetail3.getGoodsCardType() == 2) {
                        String backgroundPicJson = productLatticeDetail3.getBackgroundPicJson();
                        if (!(backgroundPicJson == null || backgroundPicJson.length() == 0)) {
                            String backgroundPic2 = productLatticeDetail3.getBackgroundPic();
                            if (!(backgroundPic2 == null || backgroundPic2.length() == 0)) {
                                productLatticeDetail3.setBackgroundPicJson("");
                            }
                        }
                    }
                }
            }
            return productLatticeEntity;
        }
        List<ProductLatticeDetail> details3 = productLatticeEntity.getDetails();
        List<ProductLatticeDetail> list = details3;
        if (list == null || list.isEmpty()) {
            return productLatticeEntity;
        }
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : details3) {
            Integer numValueOf = Integer.valueOf(((ProductLatticeDetail) obj2).getGroupId());
            Object arrayList4 = linkedHashMap.get(numValueOf);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        if (linkedHashMap.isEmpty()) {
            return productLatticeEntity;
        }
        Iterator it = linkedHashMap.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            List list2 = (List) linkedHashMap.get(it.next());
            if (list2 == null) {
                return productLatticeEntity;
            }
            ProductLatticeDetail productLatticeDetail4 = (ProductLatticeDetail) CollectionsKt___CollectionsKt.getOrNull(list2, 0);
            int gridType = productLatticeDetail4 == null ? -1 : productLatticeDetail4.getGridType();
            if (gridType != 1) {
                if (gridType != 2) {
                    int size = list2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        int i4 = i3 + 1;
                        Object obj3 = list2.get(i3);
                        ((ProductLatticeDetail) obj3).setPosition(i2);
                        arrayList3.add(obj3);
                        i3 = i4;
                        i2++;
                    }
                } else if (list2.size() >= 3) {
                    ProductLatticeDetail productLatticeDetail5 = (ProductLatticeDetail) list2.get(0);
                    productLatticeDetail5.setCardType(4);
                    int i5 = i2 + 1;
                    productLatticeDetail5.setPosition(i2);
                    arrayList3.add(productLatticeDetail5);
                    ProductLatticeDetail productLatticeDetailClone = ((ProductLatticeDetail) list2.get(1)).clone();
                    productLatticeDetailClone.setCardType(2);
                    ArrayList arrayList5 = new ArrayList();
                    ProductLatticeDetail productLatticeDetail6 = (ProductLatticeDetail) list2.get(1);
                    int i6 = i5 + 1;
                    productLatticeDetail6.setPosition(i5);
                    productLatticeDetail6.setCardType(2);
                    arrayList5.add(productLatticeDetail6);
                    ProductLatticeDetail productLatticeDetail7 = (ProductLatticeDetail) list2.get(2);
                    i = i6 + 1;
                    productLatticeDetail7.setPosition(i6);
                    productLatticeDetail7.setCardType(2);
                    arrayList5.add(productLatticeDetail7);
                    productLatticeDetailClone.setExtendObj(arrayList5);
                    arrayList3.add(productLatticeDetailClone);
                    i2 = i;
                }
            } else if (list2.size() >= 4) {
                ProductLatticeDetail productLatticeDetail8 = (ProductLatticeDetail) list2.get(0);
                productLatticeDetail8.setCardType(3);
                int i7 = i2 + 1;
                productLatticeDetail8.setPosition(i2);
                arrayList3.add(productLatticeDetail8);
                ProductLatticeDetail productLatticeDetailClone2 = ((ProductLatticeDetail) list2.get(1)).clone();
                productLatticeDetailClone2.setCardType(1);
                ArrayList arrayList6 = new ArrayList();
                ProductLatticeDetail productLatticeDetail9 = (ProductLatticeDetail) list2.get(1);
                int i8 = i7 + 1;
                productLatticeDetail9.setPosition(i7);
                productLatticeDetail9.setCardType(1);
                arrayList6.add(productLatticeDetail9);
                ProductLatticeDetail productLatticeDetail10 = (ProductLatticeDetail) list2.get(2);
                int i9 = i8 + 1;
                productLatticeDetail10.setPosition(i8);
                productLatticeDetail10.setCardType(1);
                arrayList6.add(productLatticeDetail10);
                ProductLatticeDetail productLatticeDetail11 = (ProductLatticeDetail) list2.get(3);
                i = i9 + 1;
                productLatticeDetail11.setPosition(i9);
                productLatticeDetail11.setCardType(1);
                arrayList6.add(productLatticeDetail11);
                productLatticeDetailClone2.setExtendObj(arrayList6);
                arrayList3.add(productLatticeDetailClone2);
                i2 = i;
            }
        }
        productLatticeEntity.setDetails(arrayList3);
        return productLatticeEntity;
    }
}
