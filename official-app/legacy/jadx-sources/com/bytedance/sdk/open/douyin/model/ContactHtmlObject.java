package com.bytedance.sdk.open.douyin.model;

import android.os.Bundle;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.platform.sdk.center.cons.AcConstants;

/* JADX INFO: loaded from: classes13.dex */
public class ContactHtmlObject {

    @SerializedName("discription")
    private String mDiscription;

    @SerializedName(AcConstants.K_HTML)
    private String mHtml;

    @SerializedName("title")
    private String mTitle;

    @SerializedName("thumburl")
    private String thumbUrl;

    public static ContactHtmlObject unserialize(Bundle bundle) {
        String string = bundle.getString("_aweme_open_sdk_share_contact_html_key", "");
        if (string == null) {
            return null;
        }
        try {
            return (ContactHtmlObject) new Gson().fromJson(string, ContactHtmlObject.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public String getDiscription() {
        return this.mDiscription;
    }

    public String getHtml() {
        return this.mHtml;
    }

    public String getThumbUrl() {
        return this.thumbUrl;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void serialize(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.putSerializable("_aweme_open_sdk_share_contact_html_key", new Gson().toJson(this));
    }

    public void setDiscription(String str) {
        this.mDiscription = str;
    }

    public void setHtml(String str) {
        this.mHtml = str;
    }

    public void setThumbUrl(String str) {
        this.thumbUrl = str;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }
}
