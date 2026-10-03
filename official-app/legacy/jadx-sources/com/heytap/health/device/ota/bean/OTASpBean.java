package com.heytap.health.device.ota.bean;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.sc8;
import com.oplus.aiunit.vision.y8g;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class OTASpBean {
    public static String TAG = "OTASpBean";
    private boolean isAutoDownload = false;
    private boolean isFirstUpdate = true;
    private String mMac;

    public static OTASpBean newItem(String str) {
        String strD = y8g.a().D(str + TAG);
        if (!TextUtils.isEmpty(strD)) {
            return (OTASpBean) sc8.a(strD, OTASpBean.class);
        }
        OTASpBean oTASpBean = new OTASpBean();
        oTASpBean.mMac = str;
        return oTASpBean;
    }

    public boolean getFirstUpdate() {
        return this.isFirstUpdate;
    }

    public boolean isAutoDownload() {
        return this.isAutoDownload;
    }

    public void save() {
        y8g.a().U(this.mMac + TAG, sc8.g(this));
    }

    public void setAutoDownload(boolean z) {
        this.isAutoDownload = z;
    }

    public void setFirstUpdate(boolean z) {
        this.isFirstUpdate = z;
    }
}
