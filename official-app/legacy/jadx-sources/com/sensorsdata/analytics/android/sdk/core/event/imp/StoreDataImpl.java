package com.sensorsdata.analytics.android.sdk.core.event.imp;

import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.core.event.Event;
import com.sensorsdata.analytics.android.sdk.core.event.EventProcessor;
import com.sensorsdata.analytics.android.sdk.core.mediator.Modules;
import com.sensorsdata.analytics.android.sdk.core.mediator.SAModuleManager;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbAdapter;
import com.sensorsdata.analytics.android.sdk.exceptions.DebugModeException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class StoreDataImpl implements EventProcessor.IStoreData {
    private static final String TAG = "SA.StoreDataImpl";
    private final DbAdapter mDbAdapter = DbAdapter.getInstance();

    @Override // com.sensorsdata.analytics.android.sdk.core.event.EventProcessor.IStoreData
    public int storeData(Event event) {
        if (event == null) {
            return 0;
        }
        JSONObject jSONObject = event.toJSONObject();
        int iAddJSON = this.mDbAdapter.addJSON(jSONObject);
        SAModuleManager.getInstance().invokeModuleFunction(Modules.Advert.MODULE_NAME, Modules.Advert.METHOD_SEND_EVENT_SAT, jSONObject);
        if (iAddJSON < 0) {
            String str = "Failed to enqueue the event: " + jSONObject;
            if (SALog.isDebug()) {
                throw new DebugModeException(str);
            }
            SALog.i(TAG, str);
        }
        return iAddJSON;
    }
}
