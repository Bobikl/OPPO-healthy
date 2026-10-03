package com.bytedance.sdk.open.aweme.authorize.model;

import android.os.Bundle;
import com.google.gson.Gson;
import com.oplus.aiunit.vision.s81;
import com.oplus.aiunit.vision.v81;

/* JADX INFO: loaded from: classes13.dex */
public class Authorization {

    public static class Request extends s81 {
        public String clientKey;
        public String optionalScope0;
        public String optionalScope1;
        public String redirectUri;
        public String scope;
        public String state;
        public VerifyObject verifyObject;

        public Request() {
        }

        public Request(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.oplus.aiunit.vision.s81
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.state = bundle.getString("_bytedance_params_state");
            this.clientKey = bundle.getString("_bytedance_params_client_key");
            this.redirectUri = bundle.getString("_bytedance_params_redirect_uri");
            this.scope = bundle.getString("_bytedance_params_scope");
            this.optionalScope0 = bundle.getString("_bytedance_params_optional_scope0");
            this.optionalScope1 = bundle.getString("_bytedance_params_optional_scope1");
            String string = bundle.getString("_aweme_params_verify_scope");
            if (string != null) {
                this.verifyObject = (VerifyObject) new Gson().fromJson(string, VerifyObject.class);
            }
        }

        public String getClientKey() {
            return this.clientKey;
        }

        @Override // com.oplus.aiunit.vision.s81
        public int getType() {
            return 1;
        }

        @Override // com.oplus.aiunit.vision.s81
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_bytedance_params_state", this.state);
            bundle.putString("_bytedance_params_client_key", this.clientKey);
            bundle.putString("_bytedance_params_redirect_uri", this.redirectUri);
            bundle.putString("_bytedance_params_scope", this.scope);
            bundle.putString("_bytedance_params_optional_scope0", this.optionalScope0);
            bundle.putString("_bytedance_params_optional_scope1", this.optionalScope1);
            if (this.verifyObject != null) {
                bundle.putString("_aweme_params_verify_scope", new Gson().toJson(this.verifyObject));
            }
        }
    }

    public static class Response extends v81 {
        public String authCode;
        public String grantedPermissions;
        public String state;

        public Response() {
        }

        public Response(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.oplus.aiunit.vision.v81
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.authCode = bundle.getString("_bytedance_params_authcode");
            this.state = bundle.getString("_bytedance_params_state");
            this.grantedPermissions = bundle.getString("_bytedance_params_granted_permission");
        }

        @Override // com.oplus.aiunit.vision.v81
        public int getType() {
            return 2;
        }

        @Override // com.oplus.aiunit.vision.v81
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_bytedance_params_authcode", this.authCode);
            bundle.putString("_bytedance_params_state", this.state);
            bundle.putString("_bytedance_params_granted_permission", this.grantedPermissions);
        }
    }
}
