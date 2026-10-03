package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.sdk.open.aweme.base.AnchorObject;
import com.bytedance.sdk.open.aweme.base.MediaContent;
import com.bytedance.sdk.open.aweme.base.MicroAppInfo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class izg extends s81 {
    public int a = 0;
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<String> f12699c;
    public MediaContent d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MicroAppInfo f12700e;
    public AnchorObject f;
    public String g;
    public String h;
    public String i;

    public izg() {
    }

    @Override // com.oplus.aiunit.vision.s81
    @SuppressLint({"MissingSuperCall"})
    public boolean checkArgs() {
        MediaContent mediaContent = this.d;
        if (mediaContent != null) {
            return mediaContent.checkArgs();
        }
        Log.e("Aweme.OpenSDK.Share", "checkArgs fail ,mediaContent is null");
        return false;
    }

    @Override // com.oplus.aiunit.vision.s81
    @SuppressLint({"MissingSuperCall"})
    public void fromBundle(Bundle bundle) {
        super.fromBundle(bundle);
        this.g = bundle.getString("_aweme_open_sdk_params_caller_package");
        this.callerLocalEntry = bundle.getString("_aweme_open_sdk_params_caller_local_entry");
        this.i = bundle.getString("_aweme_open_sdk_params_state");
        this.h = bundle.getString("_aweme_open_sdk_params_client_key");
        this.a = bundle.getInt("_aweme_open_sdk_params_target_landpage_scene", 0);
        this.f12699c = bundle.getStringArrayList("_aweme_open_sdk_params_hashtag_list");
        this.d = MediaContent.Builder.fromBundle(bundle);
        this.f12700e = MicroAppInfo.unserialize(bundle);
        this.f = AnchorObject.unserialize(bundle);
    }

    @Override // com.oplus.aiunit.vision.s81
    public int getType() {
        return 3;
    }

    @Override // com.oplus.aiunit.vision.s81
    @SuppressLint({"MissingSuperCall"})
    public void toBundle(Bundle bundle) {
        super.toBundle(bundle);
        bundle.putString("_aweme_open_sdk_params_caller_local_entry", this.callerLocalEntry);
        bundle.putString("_aweme_open_sdk_params_client_key", this.h);
        bundle.putString("_aweme_open_sdk_params_caller_package", this.g);
        if (this.b) {
            bundle.putInt("_aweme_open_sdk_params_target_landpage_scene", 2);
        } else {
            bundle.putInt("_aweme_open_sdk_params_target_landpage_scene", 0);
        }
        bundle.putString("_aweme_open_sdk_params_state", this.i);
        MediaContent mediaContent = this.d;
        if (mediaContent != null) {
            bundle.putAll(MediaContent.Builder.toBundle(mediaContent));
        }
        ArrayList<String> arrayList = this.f12699c;
        if (arrayList != null && arrayList.size() > 0) {
            bundle.putString("_aweme_open_sdk_params_target_scene", this.f12699c.get(0));
            bundle.putStringArrayList("_aweme_open_sdk_params_hashtag_list", this.f12699c);
        }
        MicroAppInfo microAppInfo = this.f12700e;
        if (microAppInfo != null) {
            microAppInfo.serialize(bundle);
        }
        AnchorObject anchorObject = this.f;
        if (anchorObject != null) {
            anchorObject.serialize(bundle);
        }
    }

    public izg(Bundle bundle) {
        fromBundle(bundle);
    }
}
