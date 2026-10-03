package com.heytap.store.homemodule.utils;

import com.heytap.store.business.component.entity.HeaderAdvertPendantInfo;
import com.heytap.store.business.component.entity.OStoreHeaderInfo;
import com.heytap.store.business.component.entity.PicCubeDetail;
import com.heytap.store.homemodule.data.AdvertPendantInfo;
import com.heytap.store.homemodule.data.HomeDataBean;
import com.heytap.store.homemodule.data.HomeItemDetail;
import com.heytap.store.homemodule.data.HomeItemHeaderInfo;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0007"}, d2 = {"getOStoreHeaderInfoFromNetData", "Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;", "data", "Lcom/heytap/store/homemodule/data/HomeDataBean;", "getPicCubeDetail", "Ljava/util/ArrayList;", "Lcom/heytap/store/business/component/entity/PicCubeDetail;", "com.heytap.store.business.home-impl"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class OStoreComponentDataTransFormUtilKt {
    @Nullable
    public static final OStoreHeaderInfo getOStoreHeaderInfoFromNetData(@Nullable HomeDataBean homeDataBean) {
        HomeItemHeaderInfo headerInfo;
        if (homeDataBean == null || (headerInfo = homeDataBean.getHeaderInfo()) == null) {
            return null;
        }
        OStoreHeaderInfo oStoreHeaderInfo = new OStoreHeaderInfo();
        oStoreHeaderInfo.setColorScroll(headerInfo.getColorScroll());
        oStoreHeaderInfo.setColorTitle(headerInfo.getColorTitle());
        oStoreHeaderInfo.setShowMore(headerInfo.isShowMore());
        oStoreHeaderInfo.setShowPic(headerInfo.isShowPic());
        oStoreHeaderInfo.setMoreLink(headerInfo.getMoreLink());
        oStoreHeaderInfo.setMoreIsLogin(headerInfo.getMoreIsLogin());
        oStoreHeaderInfo.setMoreText(headerInfo.getMoreText());
        oStoreHeaderInfo.setPic(headerInfo.getPic());
        oStoreHeaderInfo.setPicField(headerInfo.getPicField());
        oStoreHeaderInfo.setPicJson(headerInfo.getPicJson());
        oStoreHeaderInfo.setPicJsonField(headerInfo.getPicJsonField());
        oStoreHeaderInfo.setPicLink(headerInfo.getPicLink());
        oStoreHeaderInfo.setStyleFillet(headerInfo.getStyleFillet());
        oStoreHeaderInfo.setTitle(headerInfo.getTitle());
        oStoreHeaderInfo.setTitleShow(headerInfo.getTitleShow());
        oStoreHeaderInfo.setTitleStyle(headerInfo.getTitleStyle());
        oStoreHeaderInfo.setPicTitle(headerInfo.getPicTitle());
        oStoreHeaderInfo.setPendantShow(headerInfo.getPendantShow());
        HeaderAdvertPendantInfo headerAdvertPendantInfo = new HeaderAdvertPendantInfo();
        AdvertPendantInfo advertPendantInfo = headerInfo.getAdvertPendantInfo();
        headerAdvertPendantInfo.setId(advertPendantInfo == null ? null : advertPendantInfo.getId());
        AdvertPendantInfo advertPendantInfo2 = headerInfo.getAdvertPendantInfo();
        headerAdvertPendantInfo.setPendantIcon(advertPendantInfo2 == null ? null : advertPendantInfo2.getPendantIcon());
        AdvertPendantInfo advertPendantInfo3 = headerInfo.getAdvertPendantInfo();
        headerAdvertPendantInfo.setPendantStyle(advertPendantInfo3 == null ? null : advertPendantInfo3.getPendantStyle());
        AdvertPendantInfo advertPendantInfo4 = headerInfo.getAdvertPendantInfo();
        headerAdvertPendantInfo.setPendantText(advertPendantInfo4 == null ? null : advertPendantInfo4.getPendantText());
        AdvertPendantInfo advertPendantInfo5 = headerInfo.getAdvertPendantInfo();
        headerAdvertPendantInfo.setPendantLinks(advertPendantInfo5 == null ? null : advertPendantInfo5.getPendantLinks());
        AdvertPendantInfo advertPendantInfo6 = headerInfo.getAdvertPendantInfo();
        headerAdvertPendantInfo.setPendantLogin(advertPendantInfo6 != null ? advertPendantInfo6.getPendantLogin() : null);
        oStoreHeaderInfo.setAdvertPendantInfo(headerAdvertPendantInfo);
        return oStoreHeaderInfo;
    }

    @Nullable
    public static final ArrayList<PicCubeDetail> getPicCubeDetail(@Nullable HomeDataBean homeDataBean) {
        List<HomeItemDetail> details;
        if (homeDataBean == null || (details = homeDataBean.getDetails()) == null) {
            return null;
        }
        ArrayList<PicCubeDetail> arrayList = new ArrayList<>();
        int size = details.size();
        for (int i = 0; i < size; i++) {
            HomeItemDetail homeItemDetail = details.get(i);
            arrayList.add(new PicCubeDetail(homeItemDetail.getRowNum(), homeItemDetail.getPicJson(), homeItemDetail.getPic(), i));
        }
        return arrayList;
    }
}
