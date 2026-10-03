package com.oplus.aiunit.vision;

import com.heytap.health.watchface.business.legacy.main.bean.WatchIdInfo;
import com.heytap.health.watchface.network.bean.DetailItem;
import com.heytap.health.watchface.network.bean.WatchFaceHomeInfoResp;
import com.heytap.theme.watch.domain.dto.request.AppImpInfo;
import com.heytap.theme.watch.domain.dto.request.CommonParam;
import com.heytap.theme.watch.domain.dto.request.DetailParam;
import com.heytap.theme.watch.domain.dto.request.DownloadParam;
import com.heytap.theme.watch.domain.dto.request.PageBaseParam;
import com.heytap.theme.watch.domain.dto.request.ProductItemParam;
import com.heytap.theme.watch.domain.dto.request.order.CreateOrderParam;
import com.heytap.theme.watch.domain.dto.response.BulletinDto;
import com.heytap.theme.watch.domain.dto.response.DownloadDto;
import com.heytap.theme.watch.domain.dto.response.ProductItemListDto;
import com.heytap.theme.watch.domain.dto.response.common.ResponsesBody;
import com.heytap.theme.watch.domain.dto.response.order.H5OrderDto;
import com.heytap.theme.watch.domain.dto.response.order.OrderDto;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ai3 implements uo9 {
    public static final String TAG = "CloudDataRepository";
    public static final int TYPE_RES_WATCH_FACE = 1;

    @Override // com.oplus.aiunit.vision.uo9
    public lbd<ResponsesBody<WatchFaceHomeInfoResp>> a(int i, int i2) {
        PageBaseParam pageBaseParam = new PageBaseParam();
        pageBaseParam.setOffset(0);
        pageBaseParam.setSize(i2);
        pageBaseParam.setStart(i);
        return ((avl) hvl.d(avl.class)).i(pageBaseParam).L0(su8.c()).i1(su8.c()).n0(su8.c());
    }

    @Override // com.oplus.aiunit.vision.uo9
    public lbd<ResponsesBody<WatchFaceHomeInfoResp>> b(int i, int i2) {
        PageBaseParam pageBaseParam = new PageBaseParam();
        pageBaseParam.setOffset(0);
        pageBaseParam.setSize(i2);
        pageBaseParam.setStart(i);
        return ((avl) hvl.d(avl.class)).f(pageBaseParam).L0(su8.c()).i1(su8.c()).n0(f30.c());
    }

    @Override // com.oplus.aiunit.vision.uo9
    public lbd<ResponsesBody<WatchFaceHomeInfoResp>> c(int i, int i2) {
        PageBaseParam pageBaseParam = new PageBaseParam();
        pageBaseParam.setOffset(0);
        pageBaseParam.setSize(i2);
        pageBaseParam.setStart(i);
        return ((avl) hvl.d(avl.class)).y(pageBaseParam).L0(su8.c()).i1(su8.c()).n0(f30.c());
    }

    @Override // com.oplus.aiunit.vision.uo9
    public lbd<ProductItemListDto> d(List<AppImpInfo> list) {
        String token = um.c().getToken();
        ltl.a(TAG, "[getUserInfo] token " + token + " appImpInfos " + list);
        ProductItemParam productItemParam = new ProductItemParam();
        productItemParam.setToken(token);
        productItemParam.setType(1);
        productItemParam.setInfos(list);
        return ((avl) hvl.f(avl.class)).p(productItemParam).L0(su8.c()).i1(su8.c()).n0(su8.c());
    }

    @Override // com.oplus.aiunit.vision.uo9
    public lbd<DownloadDto> e(long j2, String str) {
        DownloadParam downloadParam = new DownloadParam();
        downloadParam.setIsTrail(false);
        downloadParam.setIsUpdate(false);
        downloadParam.setType(1);
        downloadParam.setKey(str);
        downloadParam.setToken(um.c().getToken());
        downloadParam.setVersionId(j2);
        return ((avl) hvl.d(avl.class)).C(downloadParam).L0(su8.c()).i1(su8.c()).n0(su8.c());
    }

    @Override // com.oplus.aiunit.vision.uo9
    public lbd<WatchFaceHomeInfoResp> f(int i, int i2) {
        PageBaseParam pageBaseParam = new PageBaseParam();
        pageBaseParam.setOffset(0);
        pageBaseParam.setSize(i2);
        pageBaseParam.setStart(i);
        return ((avl) hvl.d(avl.class)).w(pageBaseParam).L0(su8.c()).i1(su8.c()).n0(f30.c());
    }

    @Override // com.oplus.aiunit.vision.uo9
    public lbd<WatchFaceHomeInfoResp> g(int i, int i2) {
        String token = um.c().getToken();
        ltl.a(TAG, "[getUserInfo] start " + i + " size " + i2);
        abl ablVar = new abl();
        ablVar.g(token);
        ablVar.f(i);
        ablVar.d(i2);
        ablVar.e(i2);
        return ((avl) hvl.d(avl.class)).u(ablVar).L0(su8.c()).i1(su8.c()).n0(f30.c());
    }

    @Override // com.oplus.aiunit.vision.uo9
    public lbd<BulletinDto> h() {
        String token = um.c().getToken();
        ltl.a(TAG, "[getConfigInfo] token " + token);
        CommonParam commonParam = new CommonParam();
        commonParam.setToken(token);
        return ((avl) hvl.d(avl.class)).A(commonParam).L0(su8.c()).i1(su8.c()).n0(f30.c());
    }

    @Override // com.oplus.aiunit.vision.uo9
    public lbd<ResponsesBody<WatchFaceHomeInfoResp>> i(int i, int i2) {
        PageBaseParam pageBaseParam = new PageBaseParam();
        pageBaseParam.setOffset(0);
        pageBaseParam.setSize(i2);
        pageBaseParam.setStart(i);
        return ((avl) hvl.d(avl.class)).s(pageBaseParam).L0(su8.c()).i1(su8.c()).n0(f30.c());
    }

    @Override // com.oplus.aiunit.vision.uo9
    public lbd<WatchIdInfo> j(String str, String str2) {
        return new jfl().k(str, str2);
    }

    public lbd<ResponsesBody<H5OrderDto>> k(long j2, long j3) {
        CreateOrderParam createOrderParam = new CreateOrderParam();
        createOrderParam.setMasterId(Long.valueOf(j2));
        createOrderParam.setVersionId(Long.valueOf(j3));
        return ((avl) hvl.d(avl.class)).n(createOrderParam).L0(su8.c()).i1(su8.c()).n0(f30.c());
    }

    public lbd<ResponsesBody<OrderDto>> l(long j2, long j3) {
        CreateOrderParam createOrderParam = new CreateOrderParam();
        createOrderParam.setMasterId(Long.valueOf(j2));
        createOrderParam.setVersionId(Long.valueOf(j3));
        return ((avl) hvl.d(avl.class)).j(createOrderParam).L0(su8.c()).i1(su8.c()).n0(f30.c());
    }

    public lbd<DetailItem> m(long j2) {
        String token = um.c().getToken();
        ltl.a(TAG, "[getUserInfo] token " + token + " masterId " + j2);
        DetailParam detailParam = new DetailParam();
        detailParam.setToken(token);
        detailParam.setMasterId(j2);
        detailParam.setType(1);
        return ((avl) hvl.d(avl.class)).c(detailParam).L0(su8.c()).i1(su8.c()).n0(f30.c());
    }
}
