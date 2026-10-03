package com.sensorsdata.analytics.android.sdk.core.event;

import android.text.TextUtils;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertyFilter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class TrackEvent extends Event {
    private String mAnonymousId;
    private String mDistinctId;
    private String mEventName;
    private JSONObject mIdentities;
    private String mItemId;
    private String mItemType;
    private String mLoginId;
    private String mOriginalId;

    public String getAnonymousId() {
        return this.mAnonymousId;
    }

    public String getDistinctId() {
        return this.mDistinctId;
    }

    public String getEventName() {
        return this.mEventName;
    }

    public JSONObject getIdentities() {
        return this.mIdentities;
    }

    public String getItemId() {
        return this.mItemId;
    }

    public String getItemType() {
        return this.mItemType;
    }

    public String getLoginId() {
        return this.mLoginId;
    }

    public String getOriginalId() {
        return this.mOriginalId;
    }

    public void setAnonymousId(String str) {
        this.mAnonymousId = str;
    }

    public void setDistinctId(String str) {
        this.mDistinctId = str;
    }

    public void setEventName(String str) {
        this.mEventName = str;
    }

    public void setIdentities(JSONObject jSONObject) {
        this.mIdentities = jSONObject;
    }

    public void setItemId(String str) {
        this.mItemId = str;
    }

    public void setItemType(String str) {
        this.mItemType = str;
    }

    public void setLoginId(String str) {
        this.mLoginId = str;
    }

    public void setOriginalId(String str) {
        this.mOriginalId = str;
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.event.Event
    public JSONObject toJSONObject() {
        try {
            if (getExtras() != null) {
                return getExtras();
            }
            JSONObject jSONObject = new JSONObject();
            if (getTrackId() != 0) {
                jSONObject.put("_track_id", getTrackId());
            }
            jSONObject.put(ClickApiEntity.TIME, getTime());
            jSONObject.put("type", getType());
            jSONObject.put("distinct_id", getDistinctId());
            jSONObject.put("anonymous_id", getAnonymousId());
            if (getIdentities() != null && getIdentities().length() > 0) {
                jSONObject.put("identities", getIdentities());
            }
            if (!TextUtils.isEmpty(getProject())) {
                jSONObject.put("project", getProject());
            }
            if (!TextUtils.isEmpty(getToken())) {
                jSONObject.put("token", getToken());
            }
            if (!TextUtils.isEmpty(getEventName())) {
                jSONObject.put("event", getEventName());
            }
            if (!TextUtils.isEmpty(getOriginalId())) {
                jSONObject.put("original_id", getOriginalId());
            }
            if (!TextUtils.isEmpty(getLoginId())) {
                jSONObject.put("login_id", getLoginId());
            }
            if (!TextUtils.isEmpty(getItemType())) {
                jSONObject.put(SensorsBean.ITEM_TYPE, getItemType());
            }
            if (!TextUtils.isEmpty(getItemId())) {
                jSONObject.put("item_id", getItemId());
            }
            jSONObject.put(SAPropertyFilter.LIB, getLib());
            jSONObject.put(SAPropertyFilter.PROPERTIES, getProperties());
            return jSONObject;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }
}
