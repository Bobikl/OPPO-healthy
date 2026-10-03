package com.oplus.aiunit.vision;

import android.os.Bundle;
import com.bytedance.sdk.open.aweme.base.MediaContent;
import com.bytedance.sdk.open.douyin.model.ContactHtmlObject;

/* JADX INFO: loaded from: classes13.dex */
public class i9m extends s81 {
    public String a;
    public MediaContent b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ContactHtmlObject f12450c;
    public String d;

    public i9m(Bundle bundle) {
        fromBundle(bundle);
    }

    @Override // com.oplus.aiunit.vision.s81
    public void fromBundle(Bundle bundle) {
        this.callerPackage = bundle.getString("_aweme_share_contact_caller_package");
        this.extras = bundle.getBundle("_aweme_share_contact_params_extra");
        this.callerLocalEntry = bundle.getString("_aweme_share_contact_caller_local_entry");
        this.a = bundle.getString("_aweme_open_sdk_share_contact_client_key");
        this.b = MediaContent.Builder.fromBundle(bundle);
        this.f12450c = ContactHtmlObject.unserialize(bundle);
        this.d = bundle.getString("_aweme_open_sdk_share_contact_state_key", "");
    }

    @Override // com.oplus.aiunit.vision.s81
    public int getType() {
        return 5;
    }

    @Override // com.oplus.aiunit.vision.s81
    public void toBundle(Bundle bundle) {
        super.toBundle(bundle);
        bundle.putInt("_aweme_share_contact_params_type", getType());
        bundle.putBundle("_aweme_share_contact_params_extra", this.extras);
        bundle.putString("_aweme_share_contact_caller_local_entry", this.callerLocalEntry);
        bundle.putString("_aweme_open_sdk_share_contact_state_key", this.d);
        bundle.putString("_aweme_open_sdk_share_contact_client_key", this.a);
        MediaContent mediaContent = this.b;
        if (mediaContent != null) {
            bundle.putAll(MediaContent.Builder.toBundle(mediaContent));
        }
        ContactHtmlObject contactHtmlObject = this.f12450c;
        if (contactHtmlObject != null) {
            contactHtmlObject.serialize(bundle);
        }
    }
}
