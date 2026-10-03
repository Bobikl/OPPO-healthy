package com.oplus.weatherservicesdk.service;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.oplus.weatherservicesdk.BaseCallBack;
import com.oplus.weatherservicesdk.DebugLog;
import com.oplus.weatherservicesdk.Utils.ThreadPoolManager;
import com.oplus.weatherservicesdk.model.WeatherResponse;
import com.oppo.servicesdk.ICommonService;
import com.oppo.servicesdk.WeatherRequest;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class WeatherBaseDataTask implements WeatherServiceManager.IWeatherServiceManagerCallback {
    private static final String AIDL_IS_DISCONNECTED = "aidl is disconnected";
    private static final String DATA = "data";
    private static final String ERROR_CODE = "errorCode";
    private static final String ERROR_MESSAGE = "errorMessage";
    private static final String OTHER_ERROR_MESSAGE = "other error message";
    private static final String REQUEST_ID = "mRequestID";
    private static final String TAG = "WeatherBaseDataTask";
    private BaseCallBack mCallBack;
    private volatile boolean mCancelAll;
    private volatile String mCanceledRequestId;
    private Class mClazz;
    private Context mContext;
    private final Gson mGson;
    private WeatherRequest mRequest;
    private final WeatherServiceManager mServiceManager;
    private Type mType;

    public WeatherBaseDataTask(Class cls, Context context, com.oplus.servicesdk.WeatherRequest weatherRequest, BaseCallBack baseCallBack) {
        this.mRequest = null;
        this.mContext = null;
        this.mCallBack = null;
        this.mClazz = null;
        this.mType = null;
        this.mCancelAll = false;
        this.mCanceledRequestId = null;
        this.mServiceManager = new WeatherServiceManager();
        this.mGson = new Gson();
        this.mContext = context;
        this.mRequest = weatherRequest.toAidlInfo();
        this.mCallBack = baseCallBack;
        this.mClazz = cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callBackOnFailed(String str) {
        BaseCallBack baseCallBack = this.mCallBack;
        if (baseCallBack != null) {
            baseCallBack.onFail(str);
        }
        unRegisterConnectCallback();
    }

    private void callOnSuccess(Object obj) {
        BaseCallBack baseCallBack = this.mCallBack;
        if (baseCallBack != null) {
            baseCallBack.onSuccess(obj);
        }
        unRegisterConnectCallback();
    }

    private void executeRequest() {
        ThreadPoolManager.getInstance().getIOPoolExecutor().execute(new Runnable() { // from class: com.oplus.weatherservicesdk.service.WeatherBaseDataTask.1
            @Override // java.lang.Runnable
            public void run() {
                String str;
                try {
                    DebugLog.i(WeatherBaseDataTask.TAG, "executeRequest " + WeatherBaseDataTask.this.getMethodName());
                    WeatherBaseDataTask.this.doRequestFromWeatherService();
                } catch (RemoteException e2) {
                    e = e2;
                    str = "executeRequest RemoteException ";
                    DebugLog.e(WeatherBaseDataTask.TAG, str, e);
                    WeatherBaseDataTask.this.callBackOnFailed(e.getMessage());
                } catch (Exception e3) {
                    e = e3;
                    str = "executeRequest Exception ";
                    DebugLog.e(WeatherBaseDataTask.TAG, str, e);
                    WeatherBaseDataTask.this.callBackOnFailed(e.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getMethodName() {
        WeatherRequest weatherRequest = this.mRequest;
        if (weatherRequest != null) {
            return weatherRequest.getCallMethodName();
        }
        return null;
    }

    private boolean interceptForFakeCancel() {
        if (this.mCancelAll) {
            DebugLog.w(TAG, " doRequestFromWeatherService " + this.mRequest.getCallMethodName() + " cancel all ");
            this.mCancelAll = false;
            return true;
        }
        if (this.mRequest == null || !TextUtils.equals(this.mCanceledRequestId, this.mRequest.getRequestID())) {
            return false;
        }
        this.mCanceledRequestId = null;
        DebugLog.w(TAG, " doRequestFromWeatherService " + this.mRequest.getCallMethodName() + " canceled id= " + this.mCanceledRequestId);
        return true;
    }

    public void cancel(String str) {
        this.mCanceledRequestId = str;
        this.mCancelAll = false;
    }

    public void cancelAll() {
        this.mCanceledRequestId = null;
        this.mCancelAll = true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0054 A[PHI: r3
  0x0054: PHI (r3v4 java.lang.StringBuilder) = (r3v3 java.lang.StringBuilder), (r3v9 java.lang.StringBuilder) binds: [B:15:0x0052, B:12:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0056 A[PHI: r3
  0x0056: PHI (r3v8 java.lang.StringBuilder) = (r3v3 java.lang.StringBuilder), (r3v9 java.lang.StringBuilder) binds: [B:15:0x0052, B:12:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c2  */
    /* JADX WARN: Multi-variable type inference failed */
    public void doRequestFromWeatherService() {
        StringBuilder sb;
        boolean z;
        JsonResult jsonresultFromJson;
        ICommonService weatherService = this.mServiceManager.getWeatherService();
        if (weatherService == null) {
            callBackOnFailed(AIDL_IS_DISCONNECTED);
            DebugLog.w(TAG, AIDL_IS_DISCONNECTED);
            return;
        }
        if (interceptForFakeCancel()) {
            return;
        }
        String strExecute = weatherService.execute(this.mRequest);
        boolean z2 = true;
        if (DebugLog.isAllowPrintSensitiveLog()) {
            sb = new StringBuilder("after doRequestFromWeatherService ");
            sb.append(getMethodName());
            sb.append(" result ");
            sb.append(strExecute);
            if (strExecute != null) {
                z = true;
            } else {
                z = false;
            }
        } else {
            sb = new StringBuilder("after doRequestFromWeatherService ");
            sb.append(getMethodName());
            sb.append(" result ");
            if (strExecute != null) {
                z = true;
            } else {
                z = false;
            }
        }
        sb.append(z);
        DebugLog.i(TAG, sb.toString());
        if (strExecute == null) {
            if (interceptForFakeCancel()) {
                return;
            }
            callBackOnFailed(OTHER_ERROR_MESSAGE);
            return;
        }
        WeatherResponse weatherResponse = new WeatherResponse();
        try {
            JSONObject jSONObject = new JSONObject(strExecute);
            weatherResponse.errorCode = jSONObject.optInt("errorCode");
            weatherResponse.mRequestID = jSONObject.optString(REQUEST_ID);
            weatherResponse.errorMessage = jSONObject.optString(ERROR_MESSAGE);
            String strOptString = jSONObject.optString("data");
            if (!TextUtils.isEmpty(strOptString)) {
                Class cls = this.mClazz;
                if (cls != null) {
                    jsonresultFromJson = this.mGson.fromJson(strOptString, (Class<JsonResult>) cls);
                } else {
                    Type type = this.mType;
                    if (type != null) {
                        jsonresultFromJson = this.mGson.fromJson(strOptString, type);
                    }
                    StringBuilder sb2 = new StringBuilder(" doRequestFromWeatherService ");
                    sb2.append(this.mRequest.getCallMethodName());
                    sb2.append(" response data ");
                    if (weatherResponse.data != 0) {
                        z2 = false;
                    }
                    sb2.append(z2);
                    DebugLog.i(TAG, sb2.toString());
                }
                weatherResponse.data = jsonresultFromJson;
                StringBuilder sb3 = new StringBuilder(" doRequestFromWeatherService ");
                sb3.append(this.mRequest.getCallMethodName());
                sb3.append(" response data ");
                if (weatherResponse.data != 0) {
                    z2 = false;
                }
                sb3.append(z2);
                DebugLog.i(TAG, sb3.toString());
            }
            if (interceptForFakeCancel()) {
                return;
            }
            if (this.mCallBack == null) {
                if (interceptForFakeCancel()) {
                    return;
                }
                callBackOnFailed(OTHER_ERROR_MESSAGE);
            } else if (weatherResponse.errorCode == 0) {
                callOnSuccess(weatherResponse.data);
            } else {
                callBackOnFailed(weatherResponse.errorMessage);
            }
        } catch (JSONException e2) {
            DebugLog.e(TAG, " JSONException ", e2);
            if (interceptForFakeCancel()) {
                return;
            }
            callBackOnFailed(e2.getMessage());
        } catch (Exception e3) {
            DebugLog.e(TAG, " Exception ", e3);
            if (interceptForFakeCancel()) {
                return;
            }
            callBackOnFailed(e3.getMessage());
        }
    }

    public String getCurrentRestId() {
        WeatherRequest weatherRequest = this.mRequest;
        if (weatherRequest != null) {
            return weatherRequest.getRequestID();
        }
        return null;
    }

    @Override // com.oplus.weatherservicesdk.service.WeatherServiceManager.IWeatherServiceManagerCallback
    public void onServiceConnected() {
        executeRequest();
    }

    @Override // com.oplus.weatherservicesdk.service.WeatherServiceManager.IWeatherServiceManagerCallback
    public void onServiceDisconnected() {
        DebugLog.i(TAG, "onServiceDisconnected");
    }

    public void startServiceRequest() {
        if (this.mServiceManager.isStartService()) {
            DebugLog.i(TAG, "Service is started, do request now.");
            executeRequest();
            return;
        }
        DebugLog.i(TAG, "Service has not started, bind update Service.");
        this.mServiceManager.registerCallback(this);
        if (this.mServiceManager.bindUpdateService(this.mContext)) {
            return;
        }
        callBackOnFailed("bind weather common service failed.");
    }

    public void unRegisterConnectCallback() {
        this.mServiceManager.unregisterCallback(this);
        this.mServiceManager.unBindUpdateService(this.mContext);
    }

    public WeatherBaseDataTask(Type type, Context context, com.oplus.servicesdk.WeatherRequest weatherRequest, BaseCallBack baseCallBack) {
        this.mRequest = null;
        this.mContext = null;
        this.mCallBack = null;
        this.mClazz = null;
        this.mType = null;
        this.mCancelAll = false;
        this.mCanceledRequestId = null;
        this.mServiceManager = new WeatherServiceManager();
        this.mGson = new Gson();
        this.mContext = context;
        this.mRequest = weatherRequest.toAidlInfo();
        this.mCallBack = baseCallBack;
        this.mType = type;
    }

    public void startServiceRequest(Context context) {
        this.mContext = context;
        startServiceRequest();
    }

    public void startServiceRequest(Context context, String str) {
        this.mContext = context;
        WeatherRequest weatherRequest = this.mRequest;
        if (weatherRequest != null) {
            weatherRequest.setRequestID(str);
        }
        startServiceRequest();
    }

    public void startServiceRequest(String str) {
        WeatherRequest weatherRequest = this.mRequest;
        if (weatherRequest != null) {
            weatherRequest.setRequestID(str);
        }
        startServiceRequest();
    }
}
