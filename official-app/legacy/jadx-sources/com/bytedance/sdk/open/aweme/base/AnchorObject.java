package com.bytedance.sdk.open.aweme.base;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class AnchorObject {

    @SerializedName("anchor_icon")
    public UrlModel anchorIcon;

    @SerializedName("anchor_business_type")
    public int mAnchorBusinessType;

    @SerializedName("anchor_content")
    public String mAnchorContent;

    @SerializedName("anchor_title")
    public String mAnchorTitle;

    public static AnchorObject unserialize(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("_aweme_open_sdk_params_anchor_info");
        try {
            if (!TextUtils.isEmpty(string)) {
                return (AnchorObject) new Gson().fromJson(string, AnchorObject.class);
            }
        } catch (JsonSyntaxException e2) {
            e2.printStackTrace();
        }
        return null;
    }

    public int getAnchorBusinessType() {
        return this.mAnchorBusinessType;
    }

    public String getAnchorContent() {
        return this.mAnchorContent;
    }

    public String getAnchorIconUrl() {
        List<String> list;
        UrlModel urlModel = this.anchorIcon;
        if (urlModel == null || (list = urlModel.urlList) == null || list.isEmpty()) {
            return null;
        }
        return this.anchorIcon.urlList.get(0);
    }

    public String getAnchorTitle() {
        return this.mAnchorTitle;
    }

    public void serialize(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.putString("_aweme_open_sdk_params_anchor_info", new Gson().toJson(this));
    }

    public void setAnchorBusinessType(int i) {
        this.mAnchorBusinessType = i;
    }

    public void setAnchorContent(String str) {
        this.mAnchorContent = str;
    }

    public void setAnchorIconUrl(String str) {
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        urlModel.urlList = arrayList;
        this.anchorIcon = urlModel;
    }

    public void setAnchorTitle(String str) {
        this.mAnchorTitle = str;
    }
}
