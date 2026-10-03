package com.oplus.aiunit.vision;

import com.heytap.health.watchface.business.legacy.main.bean.WatchIdInfo;
import com.heytap.health.watchface.network.bean.WatchFaceHomeInfoResp;
import com.heytap.theme.watch.domain.dto.request.AppImpInfo;
import com.heytap.theme.watch.domain.dto.response.BulletinDto;
import com.heytap.theme.watch.domain.dto.response.DownloadDto;
import com.heytap.theme.watch.domain.dto.response.ProductItemListDto;
import com.heytap.theme.watch.domain.dto.response.common.ResponsesBody;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface uo9 {
    lbd<ResponsesBody<WatchFaceHomeInfoResp>> a(int i, int i2);

    lbd<ResponsesBody<WatchFaceHomeInfoResp>> b(int i, int i2);

    lbd<ResponsesBody<WatchFaceHomeInfoResp>> c(int i, int i2);

    lbd<ProductItemListDto> d(List<AppImpInfo> list);

    lbd<DownloadDto> e(long j2, String str);

    lbd<WatchFaceHomeInfoResp> f(int i, int i2);

    lbd<WatchFaceHomeInfoResp> g(int i, int i2);

    lbd<BulletinDto> h();

    lbd<ResponsesBody<WatchFaceHomeInfoResp>> i(int i, int i2);

    lbd<WatchIdInfo> j(String str, String str2);
}
