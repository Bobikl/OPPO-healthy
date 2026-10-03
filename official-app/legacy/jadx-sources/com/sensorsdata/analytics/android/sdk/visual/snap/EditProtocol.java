package com.sensorsdata.analytics.android.sdk.visual.snap;

import android.os.Handler;
import com.oplus.smartenginehelper.ParserTag;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertyFilter;
import com.sensorsdata.analytics.android.sdk.visual.ViewSnapshot;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class EditProtocol {
    private static final Class<?>[] NO_PARAMS = new Class[0];
    private static final String TAG = "SA.EProtocol";
    private final ResourceIds mResourceIds;
    private List<PropertyDescription> propertyDescriptionList;

    public static class BadInstructionsException extends Exception {
        private static final long serialVersionUID = -4062004792184145311L;

        public BadInstructionsException(String str) {
            super(str);
        }

        public BadInstructionsException(String str, Throwable th) {
            super(str, th);
        }
    }

    public EditProtocol(ResourceIds resourceIds) {
        this.mResourceIds = resourceIds;
        try {
            JSONObject jSONObject = new JSONObject("{\"type\":\"snapshot_request\",\"payload\":{\"config\":{\"classes\":[{\"name\":\"android.view.View\",\"properties\":[{\"name\":\"clickable\",\"get\":{\"selector\":\"isClickable\",\"parameters\":[],\"result\":{\"type\":\"java.lang.Boolean\"}}}]},{\"name\":\"android.widget.TextView\",\"properties\":[{\"name\":\"clickable\",\"get\":{\"selector\":\"isClickable\",\"parameters\":[],\"result\":{\"type\":\"java.lang.Boolean\"}}}]},{\"name\":\"android.widget.ImageView\",\"properties\":[{\"name\":\"clickable\",\"get\":{\"selector\":\"isClickable\",\"parameters\":[],\"result\":{\"type\":\"java.lang.Boolean\"}}}]}]}}}").getJSONObject("payload");
            if (jSONObject.has("config")) {
                this.propertyDescriptionList = getListPropertyDescription(jSONObject);
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    private List<PropertyDescription> getListPropertyDescription(JSONObject jSONObject) throws BadInstructionsException {
        LinkedList linkedList = new LinkedList();
        try {
            JSONArray jSONArray = jSONObject.getJSONObject("config").getJSONArray("classes");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                Class<?> cls = Class.forName(jSONObject2.getString("name"));
                JSONArray jSONArray2 = jSONObject2.getJSONArray(SAPropertyFilter.PROPERTIES);
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    linkedList.add(readPropertyDescription(cls, jSONArray2.getJSONObject(i2)));
                }
            }
            return linkedList;
        } catch (ClassNotFoundException e2) {
            throw new BadInstructionsException("Can't resolve types for snapshot configuration", e2);
        } catch (JSONException e3) {
            throw new BadInstructionsException("Can't read snapshot configuration", e3);
        }
    }

    private PropertyDescription readPropertyDescription(Class<?> cls, JSONObject jSONObject) throws BadInstructionsException {
        Caller caller;
        try {
            String string = jSONObject.getString("name");
            if (jSONObject.has(ParserTag.TAG_GET)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(ParserTag.TAG_GET);
                caller = new Caller(cls, jSONObject2.getString("selector"), NO_PARAMS, Class.forName(jSONObject2.getJSONObject("result").getString("type")));
            } else {
                caller = null;
            }
            return new PropertyDescription(string, cls, caller, jSONObject.has("set") ? jSONObject.getJSONObject("set").getString("selector") : null);
        } catch (ClassNotFoundException e2) {
            throw new BadInstructionsException("Can't read property JSON, relevant arg/return class not found", e2);
        } catch (NoSuchMethodException e3) {
            throw new BadInstructionsException("Can't create property reader", e3);
        } catch (JSONException e4) {
            throw new BadInstructionsException("Can't read property JSON", e4);
        }
    }

    public ViewSnapshot readSnapshotConfig(Handler handler) throws BadInstructionsException {
        List<PropertyDescription> list = this.propertyDescriptionList;
        if (list == null) {
            return null;
        }
        return new ViewSnapshot(list, this.mResourceIds, handler);
    }
}
