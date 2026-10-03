package com.oplus.aiunit.vision;

import android.os.Bundle;

/* JADX INFO: loaded from: classes13.dex */
public class m9m extends v81 {
    public String a;

    @Override // com.oplus.aiunit.vision.v81
    public void fromBundle(Bundle bundle) {
        this.errorCode = bundle.getInt("_aweme_share_contact_params_error_code");
        this.errorMsg = bundle.getString("_aweme_share_contact_params_error_msg");
        this.extras = bundle.getBundle("_aweme_share_contact_params_extra");
        this.a = bundle.getString("_aweme_open_sdk_share_contact_state_key");
    }

    @Override // com.oplus.aiunit.vision.v81
    public int getType() {
        return 6;
    }

    @Override // com.oplus.aiunit.vision.v81
    public void toBundle(Bundle bundle) {
        bundle.putInt("_aweme_share_contact_params_error_code", this.errorCode);
        bundle.putString("_aweme_share_contact_params_error_msg", this.errorMsg);
        bundle.putInt("_aweme_share_contact_params_type", getType());
        bundle.putBundle("_aweme_share_contact_params_extra", this.extras);
    }
}
