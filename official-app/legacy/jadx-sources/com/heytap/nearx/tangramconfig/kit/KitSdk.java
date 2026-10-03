package com.heytap.nearx.tangramconfig.kit;

import android.content.Context;
import com.heytap.mspsdk.log.MspLog;
import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.kit.bean.ConfigIpcResponse;
import com.heytap.nearx.tangramconfig.kit.bean.GatewayIpcInfo;
import com.heytap.nearx.tangramconfig.kit.bean.InitIpcParamsBean;
import com.heytap.nearx.tangramconfig.kit.callback.IpcCallback;
import com.heytap.nearx.tangramconfig.kit.client.KitProxy;
import com.heytap.nearx.tangramconfig.kit.config.ConfigDataHelper;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.nearx.tangramconfig.strategy.StrategyEntity;
import com.heytap.nearx.tangramconfig.strategy.StrategyHelper;
import com.heytap.nearx.tangramconfig.util.AppInfoUtil;
import com.heytap.nearx.tangramconfig.util.PrintUtilsKt;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ(\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\nJ&\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nJ$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00130\nJ.\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\nJ\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/heytap/nearx/tangramconfig/kit/KitSdk;", "", "()V", "TAG", "", "changeSdkModeWithMspCrash", "", "context", "Landroid/content/Context;", "callback", "Lcom/heytap/nearx/tangramconfig/kit/DataCallback;", "", "checkUpdateConfig", "requestDeanJson", "", "gatewayUpdate", "requestInfo", "Lcom/heytap/nearx/tangramconfig/kit/bean/GatewayIpcInfo;", "getConfigData", "Lcom/heytap/nearx/tangramconfig/kit/bean/ConfigIpcResponse;", "getDynamicCondition", Fields.PRODUCT_ID, "host", "Lcom/heytap/nearx/tangramconfig/strategy/StrategyEntity;", "isMspSupportCloudCtrl", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class KitSdk {

    @NotNull
    public static final KitSdk INSTANCE = new KitSdk();

    @NotNull
    public static final String TAG = "KitSdk";

    private KitSdk() {
    }

    public final void changeSdkModeWithMspCrash(@NotNull Context context, @NotNull final DataCallback<Integer> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        new KitProxy().addMspCrashListener(context, new IpcCallback<String>() { // from class: com.heytap.nearx.tangramconfig.kit.KitSdk.changeSdkModeWithMspCrash.1
            @Override // com.heytap.nearx.tangramconfig.kit.callback.IpcCallback
            public void onFailed(@NotNull Exception e2) {
                Intrinsics.checkNotNullParameter(e2, "e");
                callback.callback(0);
            }

            @Override // com.heytap.nearx.tangramconfig.kit.callback.IpcCallback
            public void callback(@Nullable String result) {
                callback.callback(1);
            }
        });
    }

    public final void checkUpdateConfig(@NotNull Context context, @Nullable String requestDeanJson, @Nullable final DataCallback<Boolean> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        new KitProxy().checkUpdateConfig(context, requestDeanJson, new IpcCallback<Boolean>() { // from class: com.heytap.nearx.tangramconfig.kit.KitSdk.checkUpdateConfig.1
            @Override // com.heytap.nearx.tangramconfig.kit.callback.IpcCallback
            public void onFailed(@NotNull Exception e2) {
                Intrinsics.checkNotNullParameter(e2, "e");
                DataCallback<Boolean> dataCallback = callback;
                if (dataCallback != null) {
                    dataCallback.callback(Boolean.FALSE);
                }
            }

            @Override // com.heytap.nearx.tangramconfig.kit.callback.IpcCallback
            public void callback(@Nullable Boolean result) {
                DataCallback<Boolean> dataCallback = callback;
                if (dataCallback != null) {
                    dataCallback.callback(result);
                }
            }
        });
    }

    public final void gatewayUpdate(@NotNull Context context, @NotNull GatewayIpcInfo requestInfo, @Nullable final DataCallback<String> callback) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        new KitProxy().gatewayUpdate(context, ConfigDataHelper.INSTANCE.parseGatewayInfoToJson(requestInfo), new IpcCallback<String>() { // from class: com.heytap.nearx.tangramconfig.kit.KitSdk.gatewayUpdate.1
            @Override // com.heytap.nearx.tangramconfig.kit.callback.IpcCallback
            public void onFailed(@NotNull Exception e2) {
                Intrinsics.checkNotNullParameter(e2, "e");
                DataCallback<String> dataCallback = callback;
                if (dataCallback != null) {
                    dataCallback.callback(null);
                }
            }

            @Override // com.heytap.nearx.tangramconfig.kit.callback.IpcCallback
            public void callback(@Nullable String result) {
                DataCallback<String> dataCallback = callback;
                if (dataCallback != null) {
                    dataCallback.callback(result);
                }
            }
        });
    }

    public final void getConfigData(@NotNull Context context, @NotNull String requestDeanJson, @NotNull final DataCallback<ConfigIpcResponse> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestDeanJson, "requestDeanJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        new KitProxy().getConfigData(context, requestDeanJson, new IpcCallback<ConfigIpcResponse>() { // from class: com.heytap.nearx.tangramconfig.kit.KitSdk.getConfigData.1
            @Override // com.heytap.nearx.tangramconfig.kit.callback.IpcCallback
            public void onFailed(@NotNull Exception e2) {
                Intrinsics.checkNotNullParameter(e2, "e");
                DataCallback<ConfigIpcResponse> dataCallback = callback;
                if (dataCallback != null) {
                    dataCallback.callback(null);
                }
            }

            @Override // com.heytap.nearx.tangramconfig.kit.callback.IpcCallback
            public void callback(@Nullable ConfigIpcResponse result) {
                DataCallback<ConfigIpcResponse> dataCallback = callback;
                if (dataCallback != null) {
                    dataCallback.callback(result);
                }
            }
        });
    }

    public final void getDynamicCondition(@NotNull Context context, @NotNull String productId, @NotNull String host, @NotNull final DataCallback<StrategyEntity> callback) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InitIpcParamsBean initIpcParamsBean = new InitIpcParamsBean();
        initIpcParamsBean.productId = productId;
        initIpcParamsBean.sdkVersion = "1216";
        initIpcParamsBean.hostAppPkg = AppInfoUtil.INSTANCE.getPackageName(context);
        Pattern patternCompile = Pattern.compile("https?://([^/:]*)");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(\"https?://([^/:]*)\")");
        Matcher matcher = patternCompile.matcher(host);
        Intrinsics.checkNotNullExpressionValue(matcher, "pattern.matcher(host)");
        if (matcher.find()) {
            initIpcParamsBean.extraParmaMap.put(Fields.HOST_URL_FIELD, matcher.group(0));
        }
        initIpcParamsBean.extraParmaMap.put(Fields.SDK_VERSION_CODE_FIELD, "1216");
        String initParamBeanToJson = ConfigDataHelper.INSTANCE.parseInitParamBeanToJson(initIpcParamsBean);
        MspLog.d(StrategyHelper.TAG, "getDynamicCondition :  " + PrintUtilsKt.printHostDesensitize$default(initParamBeanToJson, null, 1, null));
        new KitProxy().getDynamicCondition(context, initParamBeanToJson, new IpcCallback<StrategyEntity>() { // from class: com.heytap.nearx.tangramconfig.kit.KitSdk.getDynamicCondition.1
            @Override // com.heytap.nearx.tangramconfig.kit.callback.IpcCallback
            public void onFailed(@NotNull Exception e2) {
                Intrinsics.checkNotNullParameter(e2, "e");
            }

            @Override // com.heytap.nearx.tangramconfig.kit.callback.IpcCallback
            public void callback(@Nullable StrategyEntity result) {
                DataCallback<StrategyEntity> dataCallback = callback;
                if (dataCallback != null) {
                    dataCallback.callback(result);
                }
            }
        });
    }

    public final boolean isMspSupportCloudCtrl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new KitProxy().isSupportCloudCtrlKit(context);
    }
}
