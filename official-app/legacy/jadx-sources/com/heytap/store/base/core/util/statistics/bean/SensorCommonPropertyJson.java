package com.heytap.store.base.core.util.statistics.bean;

import android.text.TextUtils;
import com.heytap.store.base.core.http.HttpConst;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class SensorCommonPropertyJson extends JSONObject implements Serializable {
    private String latest_utm_campaign;
    private String latest_utm_medium;
    private String latest_utm_source;
    private String latest_utm_term;
    private String rom;
    private String rom_version;
    private String s_channel;
    private String source;
    private String source_type;
    private String uc;
    private String um;
    private String us;
    private String ut;

    public JSONObject getDefaultCommonProperty() {
        if (TextUtils.isEmpty(this.source_type)) {
            this.source_type = "502";
        }
        if (TextUtils.isEmpty(this.us)) {
            this.us = UtmBean.DEFAULT;
        }
        if (TextUtils.isEmpty(this.um)) {
            this.um = UtmBean.DEFAULT;
        }
        if (TextUtils.isEmpty(this.uc)) {
            this.uc = UtmBean.DEFAULT;
        }
        if (TextUtils.isEmpty(this.ut)) {
            this.ut = UtmBean.DEFAULT;
        }
        if (TextUtils.isEmpty(this.latest_utm_source)) {
            this.latest_utm_source = UtmBean.DEFAULT;
        }
        if (TextUtils.isEmpty(this.latest_utm_medium)) {
            this.latest_utm_medium = UtmBean.DEFAULT;
        }
        if (TextUtils.isEmpty(this.latest_utm_campaign)) {
            this.latest_utm_campaign = UtmBean.DEFAULT;
        }
        if (TextUtils.isEmpty(this.latest_utm_term)) {
            this.latest_utm_term = UtmBean.DEFAULT;
        }
        return getSensorCommonProperty();
    }

    public JSONObject getSensorCommonProperty() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(HttpConst.SOURCE_TYPE, this.source_type);
            jSONObject.put(HttpConst.CHANNEL, this.s_channel);
            jSONObject.put(UtmBean.US, this.us);
            jSONObject.put(UtmBean.UM, this.um);
            jSONObject.put(UtmBean.UC, this.uc);
            jSONObject.put(UtmBean.UT, this.ut);
            jSONObject.put("latest_utm_source", this.latest_utm_source);
            jSONObject.put("latest_utm_medium", this.latest_utm_medium);
            jSONObject.put(DeepLinkInterpreter.KEY_ACTION_UTM_CAMPAIGN, this.latest_utm_campaign);
            jSONObject.put(DeepLinkInterpreter.KEY_ACTION_UTM_TERM, this.latest_utm_term);
            jSONObject.put("source", this.source);
            jSONObject.put(HttpConst.ROM, this.rom);
            jSONObject.put("rom_version", this.rom_version);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public void setLatest_utm_campaign(String str) {
        this.latest_utm_campaign = str;
    }

    public void setLatest_utm_medium(String str) {
        this.latest_utm_medium = str;
    }

    public void setLatest_utm_source(String str) {
        this.latest_utm_source = str;
    }

    public void setLatest_utm_term(String str) {
        this.latest_utm_term = str;
    }

    public void setRom(String str) {
        this.rom = str;
    }

    public void setRom_version(String str) {
        this.rom_version = str;
    }

    public void setS_channel(String str) {
        this.s_channel = str;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setSource_type(String str) {
        this.source_type = str;
    }

    public void setUc(String str) {
        this.uc = str;
    }

    public void setUm(String str) {
        this.um = str;
    }

    public void setUs(String str) {
        this.us = str;
    }

    public void setUt(String str) {
        this.ut = str;
    }
}
