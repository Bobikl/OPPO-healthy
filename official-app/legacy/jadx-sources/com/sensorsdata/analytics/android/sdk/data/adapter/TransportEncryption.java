package com.sensorsdata.analytics.android.sdk.data.adapter;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.core.business.instantevent.InstantEventUtils;
import com.sensorsdata.analytics.android.sdk.core.mediator.Modules;
import com.sensorsdata.analytics.android.sdk.core.mediator.SAModuleManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class TransportEncryption extends EncryptDataOperation {
    private Object mSupportTransport;

    public TransportEncryption(Context context) {
        super(context);
        this.mSupportTransport = null;
        this.mDbEncrypt = false;
    }

    private String encryptValue(String str) {
        String str2 = isSupportTransport() ? (String) SAModuleManager.getInstance().invokeModuleFunction(Modules.Encrypt.MODULE_NAME, Modules.Encrypt.METHOD_STORE_EVENT, str) : "";
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return "{\"payloads\": \"" + str2 + "\"}";
    }

    private boolean isSupportTransport() {
        if (this.mSupportTransport == null) {
            this.mSupportTransport = SAModuleManager.getInstance().invokeModuleFunction(Modules.Encrypt.MODULE_NAME, Modules.Encrypt.METHOD_VERIFY_SUPPORT_TRANSPORT, new Object[0]);
        }
        Object obj = this.mSupportTransport;
        return obj != null && ((Boolean) obj).booleanValue();
    }

    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public /* bridge */ /* synthetic */ void deleteData(Uri uri, JSONArray jSONArray) {
        super.deleteData(uri, jSONArray);
    }

    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.EncryptDataOperation, com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public int insertData(Uri uri, JSONObject jSONObject) {
        try {
            if (deleteDataLowMemory(uri) != 0) {
                return -2;
            }
            int iIsInstantEvent = InstantEventUtils.isInstantEvent(jSONObject);
            ContentValues contentValues = new ContentValues();
            String strEncryptValue = encryptValue(jSONObject.toString());
            contentValues.put("data", strEncryptValue + "\t" + strEncryptValue.hashCode());
            contentValues.put("created_at", Long.valueOf(System.currentTimeMillis()));
            contentValues.put(DbParams.KEY_IS_INSTANT_EVENT, Integer.valueOf(iIsInstantEvent));
            this.contentResolver.insert(uri, contentValues);
            return 0;
        } catch (Throwable th) {
            SALog.i(this.TAG, th.getMessage());
            return 0;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.EncryptDataOperation, com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public String[] queryData(Uri uri, int i) {
        return queryData(uri, false, i);
    }

    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.EncryptDataOperation, com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public String[] queryData(Uri uri, boolean z, int i) throws Throwable {
        try {
            String[] strArrQueryData = super.queryData(uri, z, i);
            if (strArrQueryData != null && strArrQueryData.length >= 3 && "1".equals(strArrQueryData[2]) && isSupportTransport()) {
                String str = strArrQueryData[0];
                String str2 = (String) SAModuleManager.getInstance().invokeModuleFunction(Modules.Encrypt.MODULE_NAME, Modules.Encrypt.METHOD_ENCRYPT_EVENT_DATA, strArrQueryData[1]);
                try {
                    if (!TextUtils.isEmpty(str2) && str2.contains("payloads")) {
                        JSONArray jSONArray = new JSONArray();
                        JSONObject jSONObject = new JSONObject(str2);
                        jSONObject.put("flush_time", System.currentTimeMillis());
                        jSONArray.put(jSONObject);
                        return new String[]{str, jSONArray.toString(), "13"};
                    }
                } catch (JSONException e2) {
                    SALog.printStackTrace(e2);
                }
            }
            return strArrQueryData;
        } catch (Exception e3) {
            SALog.printStackTrace(e3);
            return null;
        }
    }
}
