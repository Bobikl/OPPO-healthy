package com.oplus.aiunit.vision;

import android.os.Bundle;

/* JADX INFO: loaded from: classes13.dex */
public abstract class s81 {
    public String callerLocalEntry;
    public String callerPackage;
    public String callerVersion;
    public Bundle extras;

    public boolean checkArgs() {
        return true;
    }

    public void fromBundle(Bundle bundle) {
        this.callerPackage = bundle.getString("_bytedance_params_type_caller_package");
        this.callerVersion = bundle.getString("__bytedance_base_caller_version");
        this.extras = bundle.getBundle("_bytedance_params_extra");
        this.callerLocalEntry = bundle.getString("_bytedance_params_from_entry");
    }

    public String getCallerLocalEntry() {
        return this.callerLocalEntry;
    }

    public String getCallerPackage() {
        return this.callerPackage;
    }

    public String getCallerVersion() {
        return this.callerVersion;
    }

    public abstract int getType();

    public void toBundle(Bundle bundle) {
        bundle.putInt("_bytedance_params_type", getType());
        bundle.putBundle("_bytedance_params_extra", this.extras);
        bundle.putString("_bytedance_params_from_entry", this.callerLocalEntry);
        bundle.putString("_aweme_params_caller_open_sdk_common_name", "opensdk-common");
        bundle.putString("_aweme_params_caller_open_sdk_common_version", "0.1.9.0");
    }
}
