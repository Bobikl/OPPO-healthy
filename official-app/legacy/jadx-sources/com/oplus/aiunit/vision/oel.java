package com.oplus.aiunit.vision;

import android.os.Build;
import com.heytap.health.watch.watchface.proto.Proto$DeviceInfo;
import com.heytap.health.watchface.business.store.bean.DeviceInfoJsBean;

/* JADX INFO: loaded from: classes19.dex */
public class oel {
    public static DeviceInfoJsBean a(Proto$DeviceInfo proto$DeviceInfo) {
        DeviceInfoJsBean deviceInfoJsBean = new DeviceInfoJsBean();
        if (proto$DeviceInfo == null) {
            ltl.i("WatchFaceStoreJsHelper", "[getDeviceInfo] currentDeviceInfo = null,and return ");
            return null;
        }
        String firmwareVersion = proto$DeviceInfo.getFirmwareVersion();
        deviceInfoJsBean.setDeviceModel(proto$DeviceInfo.getModel());
        deviceInfoJsBean.setDeviceType(proto$DeviceInfo.getDeviceCategory());
        deviceInfoJsBean.setFirmwareVersion(String.valueOf(kg7.b(proto$DeviceInfo.getFirmwareVersion())));
        deviceInfoJsBean.setHealthVersion(String.valueOf(qe0.m()));
        deviceInfoJsBean.setRegion("CN");
        deviceInfoJsBean.setLang(kta.a());
        deviceInfoJsBean.setOs(1);
        deviceInfoJsBean.setShape(String.valueOf(proto$DeviceInfo.getScreenTypeValue()));
        deviceInfoJsBean.setOsVersion(Build.VERSION.SDK_INT);
        deviceInfoJsBean.setSource(1);
        deviceInfoJsBean.setDeviceAppVersion(proto$DeviceInfo.getDeviceAppVersion());
        deviceInfoJsBean.setCh("OPPO");
        deviceInfoJsBean.setSkuCode(proto$DeviceInfo.getModel() + "/" + proto$DeviceInfo.getSku());
        deviceInfoJsBean.setFirmwareId(kg7.a(firmwareVersion));
        deviceInfoJsBean.setStatusBarHeight(ejg.h());
        deviceInfoJsBean.setScreen(proto$DeviceInfo.getScreenHeight() + "#" + proto$DeviceInfo.getScreenWidth());
        String strD = v9g.w().D("tag_sp_sku_id" + proto$DeviceInfo.getSku());
        deviceInfoJsBean.setSkuIdUrl(strD);
        ltl.a("WatchFaceStoreJsHelper", "[getDeviceInfo] TAG_SP_SKU_ID skuIdUrl " + strD);
        return deviceInfoJsBean;
    }
}
