package com.oplus.aiunit.vision;

import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.store.business.rn.service.RnConstant;
import com.platform.usercenter.account.newcommon.router.LinkInfo;
import io.protostuff.MapSchema;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u001f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%J4\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007JT\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0007JD\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0007JT\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0007J\\\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0007JL\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0007J4\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0007J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0007J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0007J$\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0007JT\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0007J\\\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H\u0007¨\u0006&"}, d2 = {"Lcom/oplus/aiunit/vision/rbe;", "", "", ebe.INPUT_PARAMETERS, "bizNode", "bizCode", "bizResult", "", MapSchema.FIELD_NAME_ENTRY, "bizErrorMsg", "resultId", "failPackage", "launchModel", "d", "b", "c", "typeId", "errCode", "order", sbe.PAY_SDK_PREPAYTOKEN, AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "f", "keyboard", "a", LogFieldKey.LEVEL_KEY, "j", "i", MapSchema.FIELD_NAME_KEY, "message", "payOrder", "channelId", "timestamp", "canHandle", b2n.f, "expMsg", b2n.g, "<init>", "()V", "paysdk_release"}, k = 1, mv = {1, 8, 0})
public final class rbe {

    @NotNull
    public static final rbe INSTANCE = new rbe();

    @JvmStatic
    @NotNull
    public static final Map<String, String> a(@NotNull String bizNode, @NotNull String bizCode, @NotNull String bizResult, @NotNull String bizErrorMsg, @NotNull String order, @NotNull String prePayToken, @NotNull String keyboard) {
        Intrinsics.checkNotNullParameter(bizNode, "bizNode");
        Intrinsics.checkNotNullParameter(bizCode, "bizCode");
        Intrinsics.checkNotNullParameter(bizResult, "bizResult");
        Intrinsics.checkNotNullParameter(bizErrorMsg, "bizErrorMsg");
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(prePayToken, "prePayToken");
        Intrinsics.checkNotNullParameter(keyboard, "keyboard");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_menu_kill_app");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_menu_kill_app");
        map.put("payMsgType", "_PayMerchantSdk");
        map.put("bizNode", bizNode);
        map.put("bizCode", bizCode);
        map.put("bizResult", bizResult);
        map.put("bizErrorMsg", bizErrorMsg);
        map.put("order", order);
        map.put(sbe.PAY_SDK_PREPAYTOKEN, prePayToken);
        map.put(RnConstant.KEY_PAGE, LinkInfo.CALL_TYPE_SDK);
        map.put("keyboard", keyboard);
        map.put("dcs_upload", "enable");
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> b(@NotNull String inputParameters, @NotNull String bizNode, @NotNull String bizCode, @NotNull String bizResult, @NotNull String bizErrorMsg, @NotNull String launchModel) {
        Intrinsics.checkNotNullParameter(inputParameters, "inputParameters");
        Intrinsics.checkNotNullParameter(bizNode, "bizNode");
        Intrinsics.checkNotNullParameter(bizCode, "bizCode");
        Intrinsics.checkNotNullParameter(bizResult, "bizResult");
        Intrinsics.checkNotNullParameter(bizErrorMsg, "bizErrorMsg");
        Intrinsics.checkNotNullParameter(launchModel, "launchModel");
        HashMap map = new HashMap();
        map.put("method_id", ebe.EVENT_ID_PAY_CENTER_LAUNCH_MODEL);
        map.put("categoryId", rni.DEFAULT_CATEGORY_TECHNOLOGY);
        map.put("log_tag", rni.DEFAULT_CATEGORY_TECHNOLOGY);
        map.put(of5.ARG_EVENT_ID, ebe.EVENT_ID_PAY_CENTER_LAUNCH_MODEL);
        map.put("payMsgType", "_PayMerchantSdk");
        map.put(ebe.INPUT_PARAMETERS, inputParameters);
        map.put("bizNode", bizNode);
        map.put("bizCode", bizCode);
        map.put("bizResult", bizResult);
        map.put("bizErrorMsg", bizErrorMsg);
        map.put("launchModel", launchModel);
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> c(@NotNull String inputParameters, @NotNull String bizNode, @NotNull String bizCode, @NotNull String bizResult, @NotNull String bizErrorMsg, @NotNull String resultId, @NotNull String failPackage, @NotNull String launchModel) {
        Intrinsics.checkNotNullParameter(inputParameters, "inputParameters");
        Intrinsics.checkNotNullParameter(bizNode, "bizNode");
        Intrinsics.checkNotNullParameter(bizCode, "bizCode");
        Intrinsics.checkNotNullParameter(bizResult, "bizResult");
        Intrinsics.checkNotNullParameter(bizErrorMsg, "bizErrorMsg");
        Intrinsics.checkNotNullParameter(resultId, "resultId");
        Intrinsics.checkNotNullParameter(failPackage, "failPackage");
        Intrinsics.checkNotNullParameter(launchModel, "launchModel");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_pay_center_launch_model_digging_strategy");
        map.put("categoryId", rni.DEFAULT_CATEGORY_TECHNOLOGY);
        map.put("log_tag", rni.DEFAULT_CATEGORY_TECHNOLOGY);
        map.put(of5.ARG_EVENT_ID, "event_id_pay_center_launch_model_digging_strategy");
        map.put("payMsgType", "_PayMerchantSdk");
        map.put(ebe.INPUT_PARAMETERS, inputParameters);
        map.put("bizNode", bizNode);
        map.put("bizCode", bizCode);
        map.put("bizResult", bizResult);
        map.put("bizErrorMsg", bizErrorMsg);
        map.put("result_id", resultId);
        map.put("fail_package", failPackage);
        map.put("launch_model", launchModel);
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> d(@NotNull String inputParameters, @NotNull String bizNode, @NotNull String bizCode, @NotNull String bizResult, @NotNull String bizErrorMsg, @NotNull String resultId, @NotNull String failPackage, @NotNull String launchModel) {
        Intrinsics.checkNotNullParameter(inputParameters, "inputParameters");
        Intrinsics.checkNotNullParameter(bizNode, "bizNode");
        Intrinsics.checkNotNullParameter(bizCode, "bizCode");
        Intrinsics.checkNotNullParameter(bizResult, "bizResult");
        Intrinsics.checkNotNullParameter(bizErrorMsg, "bizErrorMsg");
        Intrinsics.checkNotNullParameter(resultId, "resultId");
        Intrinsics.checkNotNullParameter(failPackage, "failPackage");
        Intrinsics.checkNotNullParameter(launchModel, "launchModel");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_pay_center_start_up_status");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_pay_center_start_up_status");
        map.put("payMsgType", "_PayMerchantSdk");
        map.put(ebe.INPUT_PARAMETERS, inputParameters);
        map.put("bizNode", bizNode);
        map.put("bizCode", bizCode);
        map.put("bizResult", bizResult);
        map.put("bizErrorMsg", bizErrorMsg);
        map.put("result_id", resultId);
        map.put("fail_package", failPackage);
        map.put("launch_model", launchModel);
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> e(@NotNull String inputParameters, @NotNull String bizNode, @NotNull String bizCode, @NotNull String bizResult) {
        Intrinsics.checkNotNullParameter(inputParameters, "inputParameters");
        Intrinsics.checkNotNullParameter(bizNode, "bizNode");
        Intrinsics.checkNotNullParameter(bizCode, "bizCode");
        Intrinsics.checkNotNullParameter(bizResult, "bizResult");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_pay_get_order_detail");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_pay_get_order_detail");
        map.put("payMsgType", "_PayMerchantSdk");
        map.put(ebe.INPUT_PARAMETERS, inputParameters);
        map.put("bizNode", bizNode);
        map.put("bizCode", bizCode);
        map.put("bizResult", bizResult);
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> f(@NotNull String typeId, @NotNull String bizNode, @NotNull String bizCode, @NotNull String bizResult, @NotNull String bizErrorMsg, @NotNull String errCode, @NotNull String order, @NotNull String prePayToken, @NotNull String response) {
        Intrinsics.checkNotNullParameter(typeId, "typeId");
        Intrinsics.checkNotNullParameter(bizNode, "bizNode");
        Intrinsics.checkNotNullParameter(bizCode, "bizCode");
        Intrinsics.checkNotNullParameter(bizResult, "bizResult");
        Intrinsics.checkNotNullParameter(bizErrorMsg, "bizErrorMsg");
        Intrinsics.checkNotNullParameter(errCode, "errCode");
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(prePayToken, "prePayToken");
        Intrinsics.checkNotNullParameter(response, "response");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_pay_result");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_pay_result");
        map.put("payMsgType", "_PayMerchantSdk");
        map.put("type_id", typeId);
        map.put("bizNode", bizNode);
        map.put("bizCode", bizCode);
        map.put("bizResult", bizResult);
        map.put("bizErrorMsg", bizErrorMsg);
        map.put("errCode", errCode);
        map.put("order", order);
        map.put(sbe.PAY_SDK_PREPAYTOKEN, prePayToken);
        map.put("type", "request");
        map.put(AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, response);
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> g(@NotNull String errCode, @NotNull String message, @NotNull String order, @NotNull String payOrder, @NotNull String channelId, @NotNull String prePayToken, @NotNull String timestamp, @NotNull String canHandle) {
        Intrinsics.checkNotNullParameter(errCode, "errCode");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(payOrder, "payOrder");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(prePayToken, "prePayToken");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(canHandle, "canHandle");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_pay_result_scheme");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_pay_result_scheme");
        map.put("payMsgType", "_PayMerchantSdk");
        map.put("errCode", errCode);
        map.put("message", message);
        map.put("order", order);
        map.put("payOrder", payOrder);
        map.put("channelId", channelId);
        map.put(sbe.PAY_SDK_PREPAYTOKEN, prePayToken);
        map.put("timestamp", timestamp);
        map.put("canHandle", canHandle);
        map.put("dcs_upload", "enable");
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> h(@NotNull String errCode, @NotNull String message, @NotNull String order, @NotNull String payOrder, @NotNull String channelId, @NotNull String prePayToken, @NotNull String timestamp, @NotNull String canHandle, @NotNull String expMsg) {
        Intrinsics.checkNotNullParameter(errCode, "errCode");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(payOrder, "payOrder");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(prePayToken, "prePayToken");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(canHandle, "canHandle");
        Intrinsics.checkNotNullParameter(expMsg, "expMsg");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_pay_result_scheme_start_fail");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_pay_result_scheme_start_fail");
        map.put("payMsgType", "_PayMerchantSdk");
        map.put("errCode", errCode);
        map.put("message", message);
        map.put("order", order);
        map.put("payOrder", payOrder);
        map.put("channelId", channelId);
        map.put(sbe.PAY_SDK_PREPAYTOKEN, prePayToken);
        map.put("timestamp", timestamp);
        map.put("canHandle", canHandle);
        map.put("expMsg", expMsg);
        map.put("dcs_upload", "enable");
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> i(@NotNull String bizResult, @NotNull String bizErrorMsg) {
        Intrinsics.checkNotNullParameter(bizResult, "bizResult");
        Intrinsics.checkNotNullParameter(bizErrorMsg, "bizErrorMsg");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_sdk_get_router_info_empty");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_sdk_get_router_info_empty");
        map.put("payMsgType", "_PayMerchantSdk");
        map.put("bizResult", bizResult);
        map.put("bizErrorMsg", bizErrorMsg);
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> j(@NotNull String bizResult, @NotNull String bizErrorMsg) {
        Intrinsics.checkNotNullParameter(bizResult, "bizResult");
        Intrinsics.checkNotNullParameter(bizErrorMsg, "bizErrorMsg");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_sdk_get_router_info_error");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_sdk_get_router_info_error");
        map.put("payMsgType", "_PayMerchantSdk");
        map.put("bizResult", bizResult);
        map.put("bizErrorMsg", bizErrorMsg);
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> k(@NotNull String bizResult, @NotNull String bizErrorMsg) {
        Intrinsics.checkNotNullParameter(bizResult, "bizResult");
        Intrinsics.checkNotNullParameter(bizErrorMsg, "bizErrorMsg");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_sdk_start_default_strategy");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_sdk_start_default_strategy");
        map.put("payMsgType", "_PayMerchantSdk");
        map.put("bizResult", bizResult);
        map.put("bizErrorMsg", bizErrorMsg);
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> l(@NotNull String bizNode, @NotNull String bizCode, @NotNull String bizResult, @NotNull String bizErrorMsg) {
        Intrinsics.checkNotNullParameter(bizNode, "bizNode");
        Intrinsics.checkNotNullParameter(bizCode, "bizCode");
        Intrinsics.checkNotNullParameter(bizResult, "bizResult");
        Intrinsics.checkNotNullParameter(bizErrorMsg, "bizErrorMsg");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_sdk_update_host_app_info_exception");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_sdk_update_host_app_info_exception");
        map.put("payMsgType", "_PayMerchantSdk");
        map.put("bizNode", bizNode);
        map.put("bizCode", bizCode);
        map.put("bizResult", bizResult);
        map.put("bizErrorMsg", bizErrorMsg);
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }
}
