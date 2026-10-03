package com.lifesense.device.scale.device.product;

import com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest;
import com.lifesense.weidong.lzsimplenetlibs.util.RequestCommonParamsUtils;
import com.oplus.drs.core.config.entity.DebugModeEntity;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class GetProductListRequest extends BaseRequest {
    public String productClassify = "productClassify";
    public String APPVERSION = "version";
    public String APPTYPE = RequestCommonParamsUtils.kRequestParam_AppType;
    public String LANGUAGE = "language";
    public String AREA = DebugModeEntity.KEY_AREA;

    public GetProductListRequest(String str) {
        setRequestMethod("POST");
        addHeaderParams(this.APPVERSION, str);
        addHeaderParams(this.APPTYPE, String.valueOf(6));
        String country = Locale.getDefault().getCountry();
        country = country == null ? "" : country;
        String language = Locale.getDefault().getLanguage();
        addHeaderParams(this.LANGUAGE, language != null ? language : "");
        addHeaderParams(this.AREA, country);
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getResponseClassName() {
        return GetProductListRespond.class.getName();
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getUrlWithoutProtocol() {
        return "/device_service/appIotProduct/getProductList";
    }
}
