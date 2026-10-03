package com.oplus.aiunit.vision;

import android.os.Bundle;

/* JADX INFO: loaded from: classes13.dex */
public abstract class v81 {
    public int errorCode;
    public String errorMsg;
    public Bundle extras;

    public boolean checkArgs() {
        return true;
    }

    public void fromBundle(Bundle bundle) {
        this.errorCode = bundle.getInt("_bytedance_params_error_code");
        this.errorMsg = bundle.getString("_bytedance_params_error_msg");
        this.extras = bundle.getBundle("_bytedance_params_extra");
    }

    public abstract int getType();

    public boolean isCancel() {
        return this.errorCode == -2;
    }

    public boolean isSuccess() {
        return this.errorCode == 0;
    }

    public void toBundle(Bundle bundle) {
        bundle.putInt("_bytedance_params_error_code", this.errorCode);
        bundle.putString("_bytedance_params_error_msg", this.errorMsg);
        bundle.putInt("_bytedance_params_type", getType());
        bundle.putBundle("_bytedance_params_extra", this.extras);
    }
}
