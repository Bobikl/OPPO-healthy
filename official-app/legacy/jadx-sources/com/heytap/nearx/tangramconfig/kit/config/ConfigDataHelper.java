package com.heytap.nearx.tangramconfig.kit.config;

import android.text.TextUtils;
import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.kit.bean.ConfigIpcResponse;
import com.heytap.nearx.tangramconfig.kit.bean.GatewayIpcInfo;
import com.heytap.nearx.tangramconfig.kit.bean.InitIpcParamsBean;
import com.heytap.nearx.tangramconfig.kit.bean.IpcConfigData;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0014¨\u0006\u0015"}, d2 = {"Lcom/heytap/nearx/tangramconfig/kit/config/ConfigDataHelper;", "", "()V", "getGatewayInfoFrom", "Lcom/heytap/nearx/tangramconfig/kit/bean/GatewayIpcInfo;", "json", "", "getInitParamBeanJson", Fields.PRODUCT_ID, TraceConstants.KEY_PKG_NAME, "parseConfigDataArray", "", "Lcom/heytap/nearx/tangramconfig/kit/bean/IpcConfigData;", "configDatasJsonArray", "Lorg/json/JSONArray;", "parseConfigResponse", "Lcom/heytap/nearx/tangramconfig/kit/bean/ConfigIpcResponse;", "parseGatewayInfoToJson", "bean", "parseInitParamBeanToJson", "Lcom/heytap/nearx/tangramconfig/kit/bean/InitIpcParamsBean;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ConfigDataHelper {

    @NotNull
    public static final ConfigDataHelper INSTANCE = new ConfigDataHelper();

    private ConfigDataHelper() {
    }

    private final List<IpcConfigData> parseConfigDataArray(JSONArray configDatasJsonArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = configDatasJsonArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = configDatasJsonArray.getJSONObject(i);
            IpcConfigData ipcConfigData = new IpcConfigData();
            ipcConfigData.setConfigCode(jSONObject.optString(Fields.CONFIG_CODE));
            ipcConfigData.setFileType(jSONObject.optInt(Fields.FILE_TYPE));
            ipcConfigData.setVersionCode(jSONObject.optInt("versionCode"));
            ipcConfigData.setConfigUrl(jSONObject.optString(Fields.CONFIG_URL));
            ipcConfigData.setConfigFileSize(jSONObject.optLong(Fields.CONFIG_FILE_SIZE));
            ipcConfigData.setConfigMaxVersion(jSONObject.optInt(Fields.CONFIG_MAX_VERSION));
            ipcConfigData.setContent(jSONObject.optString("content"));
            arrayList.add(ipcConfigData);
        }
        return arrayList;
    }

    @NotNull
    public final GatewayIpcInfo getGatewayInfoFrom(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        JSONObject jSONObject = new JSONObject(json);
        GatewayIpcInfo gatewayIpcInfo = new GatewayIpcInfo();
        gatewayIpcInfo.setProductId(jSONObject.optString(Fields.PRODUCT_ID));
        gatewayIpcInfo.setProductMaxVersion(jSONObject.optInt(Fields.PRODUCT_MAX_VERSION));
        return gatewayIpcInfo;
    }

    @NotNull
    public final String getInitParamBeanJson(@NotNull String productId, @NotNull String pkgName) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(pkgName, "pkgName");
        InitIpcParamsBean initIpcParamsBean = new InitIpcParamsBean();
        initIpcParamsBean.productId = productId;
        initIpcParamsBean.hostAppPkg = pkgName;
        initIpcParamsBean.sdkVersion = "1216";
        return parseInitParamBeanToJson(initIpcParamsBean);
    }

    @Nullable
    public final ConfigIpcResponse parseConfigResponse(@Nullable String json) {
        if (TextUtils.isEmpty(json)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(json);
        ConfigIpcResponse configIpcResponse = new ConfigIpcResponse();
        configIpcResponse.setProductId(jSONObject.optString(Fields.PRODUCT_ID));
        configIpcResponse.setProductMaxVersion(Long.valueOf(jSONObject.optLong(Fields.PRODUCT_MAX_VERSION)));
        configIpcResponse.setSpkey(jSONObject.optString("spkey"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(Fields.CONFIG_DATAS);
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            configIpcResponse.setConfigDatas(parseConfigDataArray(jSONArrayOptJSONArray));
        }
        return configIpcResponse;
    }

    @NotNull
    public final String parseGatewayInfoToJson(@NotNull GatewayIpcInfo bean) throws JSONException {
        Intrinsics.checkNotNullParameter(bean, "bean");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Fields.PRODUCT_ID, bean.getProductId());
        jSONObject.put(Fields.PRODUCT_MAX_VERSION, bean.getProductMaxVersion());
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, String> entry : bean.getExtraParmaMap().entrySet()) {
            jSONObject2.put(entry.getKey(), entry.getValue());
        }
        jSONObject.put(Fields.EXTRA_PARAMS_FIELD, jSONObject2);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
        return string;
    }

    @NotNull
    public final String parseInitParamBeanToJson(@NotNull InitIpcParamsBean bean) throws JSONException {
        Intrinsics.checkNotNullParameter(bean, "bean");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Fields.PRODUCT_ID, bean.productId);
        jSONObject.put(Fields.HOST_APP_PKG, bean.hostAppPkg);
        jSONObject.put(Fields.SDK_VERSION, bean.sdkVersion);
        JSONObject jSONObject2 = new JSONObject();
        HashMap<String, String> paramsMap = bean.extraParmaMap;
        Intrinsics.checkNotNullExpressionValue(paramsMap, "paramsMap");
        for (Map.Entry<String, String> entry : paramsMap.entrySet()) {
            jSONObject2.put(entry.getKey(), entry.getValue());
        }
        jSONObject.put(Fields.EXTRA_PARAMS_FIELD, jSONObject2);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
        return string;
    }
}
