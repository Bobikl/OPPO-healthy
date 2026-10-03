package com.bytedance.sdk.open.douyin.model;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.bytedance.sdk.open.aweme.base.MicroAppInfo;
import com.oplus.aiunit.vision.s81;
import com.oplus.aiunit.vision.v81;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class OpenRecord {

    public static class Request extends s81 {
        public String mCallerPackage;
        public String mClientKey;
        public ArrayList<String> mHashTagList;
        public MicroAppInfo mMicroAppInfo;
        public String mState;
        public int mTargetSceneType = 0;

        public Request() {
        }

        @Override // com.oplus.aiunit.vision.s81
        @SuppressLint({"MissingSuperCall"})
        public boolean checkArgs() {
            return true;
        }

        @Override // com.oplus.aiunit.vision.s81
        @SuppressLint({"MissingSuperCall"})
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.mCallerPackage = bundle.getString("_aweme_open_sdk_params_caller_package");
            this.callerLocalEntry = bundle.getString("_aweme_open_sdk_params_caller_local_entry");
            this.mState = bundle.getString("_aweme_open_sdk_params_state");
            this.mClientKey = bundle.getString("_aweme_open_sdk_params_client_key");
            this.mTargetSceneType = bundle.getInt("_aweme_open_sdk_params_target_landpage_scene", 0);
            this.mHashTagList = bundle.getStringArrayList("_aweme_open_sdk_params_hashtag_list");
            this.mMicroAppInfo = MicroAppInfo.unserialize(bundle);
        }

        @Override // com.oplus.aiunit.vision.s81
        public int getType() {
            return 7;
        }

        @Override // com.oplus.aiunit.vision.s81
        @SuppressLint({"MissingSuperCall"})
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_aweme_open_sdk_params_caller_local_entry", this.callerLocalEntry);
            bundle.putString("_aweme_open_sdk_params_client_key", this.mClientKey);
            bundle.putString("_aweme_open_sdk_params_caller_package", this.mCallerPackage);
            bundle.putString("_aweme_open_sdk_params_state", this.mState);
            bundle.putInt("_aweme_open_sdk_params_target_landpage_scene", this.mTargetSceneType);
            ArrayList<String> arrayList = this.mHashTagList;
            if (arrayList != null && arrayList.size() > 0) {
                bundle.putString("_aweme_open_sdk_params_target_scene", this.mHashTagList.get(0));
                bundle.putStringArrayList("_aweme_open_sdk_params_hashtag_list", this.mHashTagList);
            }
            MicroAppInfo microAppInfo = this.mMicroAppInfo;
            if (microAppInfo != null) {
                microAppInfo.serialize(bundle);
            }
        }

        public Request(Bundle bundle) {
            fromBundle(bundle);
        }
    }

    public static class Response extends v81 {
        public String state;

        public Response() {
        }

        public Response(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.oplus.aiunit.vision.v81
        @SuppressLint({"MissingSuperCall"})
        public void fromBundle(Bundle bundle) {
            this.errorCode = bundle.getInt("_aweme_open_sdk_params_error_code");
            this.errorMsg = bundle.getString("_aweme_open_sdk_params_error_msg");
            this.extras = bundle.getBundle("_bytedance_params_extra");
            this.state = bundle.getString("_aweme_open_sdk_params_state");
        }

        @Override // com.oplus.aiunit.vision.v81
        public int getType() {
            return 8;
        }

        @Override // com.oplus.aiunit.vision.v81
        @SuppressLint({"MissingSuperCall"})
        public void toBundle(Bundle bundle) {
            bundle.putInt("_aweme_open_sdk_params_error_code", this.errorCode);
            bundle.putString("_aweme_open_sdk_params_error_msg", this.errorMsg);
            bundle.putInt("_aweme_open_sdk_params_type", getType());
            bundle.putBundle("_bytedance_params_extra", this.extras);
            bundle.putString("_aweme_open_sdk_params_state", this.state);
        }
    }
}
