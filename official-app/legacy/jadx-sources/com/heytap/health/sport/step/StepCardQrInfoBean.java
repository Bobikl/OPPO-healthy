package com.heytap.health.sport.step;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class StepCardQrInfoBean {
    private String brandLogo;
    private String brandSlogan;
    private Bitmap qrBitmap;
    private String qrCodeDesc;
    private String qrCodeUrl;

    public String getBrandLogo() {
        return this.brandLogo;
    }

    public String getBrandSlogan() {
        return this.brandSlogan;
    }

    public Bitmap getQrBitmap() {
        return this.qrBitmap;
    }

    public String getQrCodeDesc() {
        return this.qrCodeDesc;
    }

    public String getQrCodeUrl() {
        return this.qrCodeUrl;
    }

    public void setBrandLogo(String str) {
        this.brandLogo = str;
    }

    public void setBrandSlogan(String str) {
        this.brandSlogan = str;
    }

    public void setQrBitmap(Bitmap bitmap) {
        this.qrBitmap = bitmap;
    }

    public void setQrCodeDesc(String str) {
        this.qrCodeDesc = str;
    }

    public void setQrCodeUrl(String str) {
        this.qrCodeUrl = str;
    }

    @NonNull
    public String toString() {
        return "StepCardQrInfoBean,qrCodeUrl:" + this.qrCodeUrl + ",qrCodeDesc:" + this.qrCodeDesc + ",brandLogo:" + this.brandLogo + "brandSlogan:" + this.brandSlogan;
    }
}
