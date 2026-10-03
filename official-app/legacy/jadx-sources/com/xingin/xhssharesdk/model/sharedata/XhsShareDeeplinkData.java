package com.xingin.xhssharesdk.model.sharedata;

import androidx.annotation.Keep;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Keep
public class XhsShareDeeplinkData {
    public String did;
    public XhsNote noteInfo;
    public String sdkVersion;
    public String shareSessionId;
    public String shareType;
    public long startShareTimestamp;
    public String thirdAppPackage;
    public String thirdAppVersion;

    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        XhsNote xhsNote = this.noteInfo;
        if (xhsNote != null) {
            jSONObject.putOpt("note_info", xhsNote.toJsonForDeeplink());
        }
        jSONObject.putOpt(SensorsBean.SHARE_TYPE, this.shareType);
        jSONObject.putOpt("sdk_version", this.sdkVersion);
        jSONObject.putOpt("third_app_package", this.thirdAppPackage);
        jSONObject.putOpt("third_app_version", this.thirdAppVersion);
        jSONObject.putOpt("share_session_id", this.shareSessionId);
        jSONObject.putOpt("did", this.did);
        jSONObject.putOpt("start_share_timestamp", Long.valueOf(this.startShareTimestamp));
        return jSONObject;
    }
}
