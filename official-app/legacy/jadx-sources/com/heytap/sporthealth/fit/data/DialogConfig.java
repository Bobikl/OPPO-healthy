package com.heytap.sporthealth.fit.data;

import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class DialogConfig implements Serializable {
    public boolean mobileCheck = true;
    public boolean watchConnectTip = true;

    public String toString() {
        return "DialogConfig{mobileCheck=" + this.mobileCheck + ", watchConnectTip=" + this.watchConnectTip + '}';
    }
}
