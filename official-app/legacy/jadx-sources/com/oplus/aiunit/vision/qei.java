package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.base.share.SportShareDataBean;
import com.lifesense.plugin.ble.data.other.DeviceTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class qei {
    public static void a(SportShareDataBean sportShareDataBean) {
        String imgCardCode;
        StringBuilder sb = new StringBuilder();
        sb.append("buildShareSpace pageCode is ");
        sb.append(sportShareDataBean.getImgPageCode());
        sb.append(",CardCode is ");
        sb.append(sportShareDataBean.getImgCardCode());
        sb.append(",sportMode is ");
        sb.append(sportShareDataBean.getSportMode());
        int sportMode = sportShareDataBean.getSportMode();
        if (oei.j(sportMode)) {
            imgCardCode = "01";
        } else if (oei.m(sportMode)) {
            imgCardCode = "02";
        } else if (oei.i(sportMode)) {
            imgCardCode = DeviceTypeConstants.HEIGHT_RULER;
        } else if (oei.l(sportMode)) {
            imgCardCode = "06";
        } else if (oei.d(sportMode)) {
            imgCardCode = "04";
        } else if (oei.o(sportMode)) {
            imgCardCode = DeviceTypeConstants.WAIST_RULER;
        } else if (oei.c(sportMode)) {
            imgCardCode = "13";
        } else if (oei.h(sportMode)) {
            imgCardCode = "08";
        } else if (oei.a(sportMode)) {
            imgCardCode = DeviceTypeConstants.THERMOMETER;
        } else if (oei.k(sportMode)) {
            imgCardCode = "11";
        } else if (oei.n(sportMode)) {
            imgCardCode = "10";
        } else if (oei.g(sportMode)) {
            imgCardCode = "12";
        } else if (oei.b(sportMode)) {
            imgCardCode = DeviceTypeConstants.KITCHEN_SCALE;
        } else if (oei.f(sportMode)) {
            imgCardCode = "14";
        } else {
            imgCardCode = TextUtils.isEmpty(sportShareDataBean.getImgCardCode()) ? "00" : sportShareDataBean.getImgCardCode();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("cardCode: ");
        sb2.append(imgCardCode);
        sportShareDataBean.setChangePicBg(true);
        sportShareDataBean.setImgCardCode(imgCardCode);
        sportShareDataBean.setImgPageCode(TextUtils.isEmpty(sportShareDataBean.getImgPageCode()) ? ntf.a.SPORT_SHARE : sportShareDataBean.getImgPageCode());
    }
}
