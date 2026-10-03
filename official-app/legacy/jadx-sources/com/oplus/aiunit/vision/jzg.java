package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.os.Bundle;

/* JADX INFO: loaded from: classes13.dex */
public class jzg extends v81 {
    public String a;
    public int b;

    public jzg(Bundle bundle) {
        fromBundle(bundle);
    }

    @Override // com.oplus.aiunit.vision.v81
    @SuppressLint({"MissingSuperCall"})
    public void fromBundle(Bundle bundle) {
        this.errorCode = bundle.getInt("_aweme_open_sdk_params_error_code");
        this.errorMsg = bundle.getString("_aweme_open_sdk_params_error_msg");
        this.extras = bundle.getBundle("_bytedance_params_extra");
        this.a = bundle.getString("_aweme_open_sdk_params_state");
        this.b = bundle.getInt("_aweme_open_sdk_params_sub_error_code", -1000);
    }

    @Override // com.oplus.aiunit.vision.v81
    public int getType() {
        return 4;
    }

    @Override // com.oplus.aiunit.vision.v81
    @SuppressLint({"MissingSuperCall"})
    public void toBundle(Bundle bundle) {
        bundle.putInt("_aweme_open_sdk_params_error_code", this.errorCode);
        bundle.putString("_aweme_open_sdk_params_error_msg", this.errorMsg);
        bundle.putInt("_aweme_open_sdk_params_type", getType());
        bundle.putBundle("_bytedance_params_extra", this.extras);
        bundle.putString("_aweme_open_sdk_params_state", this.a);
        bundle.putInt("_aweme_open_sdk_params_sub_error_code", this.b);
    }
}
