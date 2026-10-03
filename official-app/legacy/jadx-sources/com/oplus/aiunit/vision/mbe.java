package com.oplus.aiunit.vision;

import com.platform.usercenter.account.newcommon.router.LinkInfo;
import com.platform.usercenter.bizuws.executor.dialog.ShowDialogExecutor;
import io.protostuff.MapSchema;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJL\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0007JD\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0007JL\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0007JT\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0007JL\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0007JL\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0007JL\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0007JL\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0007JL\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0007JL\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0007¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/mbe;", "", "", "failReason", "btnId", "bizNode", "bizCode", "bizResult", "bizErrorMsg", "statusId", "", "c", MapSchema.FIELD_NAME_ENTRY, "d", ShowDialogExecutor.JSON_DIALOG_ID_KEY, "downloadChannel", b2n.f, "f", "b", "a", b2n.g, "i", "code", sbe.PAY_SDK_PREPAYTOKEN, "order", "j", "<init>", "()V", "paysdk_download_release"}, k = 1, mv = {1, 8, 0})
public final class mbe {

    @NotNull
    public static final mbe INSTANCE = new mbe();

    @JvmStatic
    @NotNull
    public static final Map<String, String> a(@NotNull String failReason, @NotNull String dialogId, @NotNull String bizNode, @NotNull String bizCode, @NotNull String bizResult, @NotNull String bizErrorMsg, @NotNull String statusId) {
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        Intrinsics.checkNotNullParameter(bizNode, "bizNode");
        Intrinsics.checkNotNullParameter(bizCode, "bizCode");
        Intrinsics.checkNotNullParameter(bizResult, "bizResult");
        Intrinsics.checkNotNullParameter(bizErrorMsg, "bizErrorMsg");
        Intrinsics.checkNotNullParameter(statusId, "statusId");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_pay_center_choose_download_btn");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_pay_center_choose_download_btn");
        map.put("payMsgType", "_PayMerchantSdk");
        map.put("fail_reason", failReason);
        map.put("dialog_id", dialogId);
        map.put("bizNode", bizNode);
        map.put("bizCode", bizCode);
        map.put("bizResult", bizResult);
        map.put("bizErrorMsg", bizErrorMsg);
        map.put("status_id", statusId);
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> b(@NotNull String failReason, @NotNull String dialogId, @NotNull String bizNode, @NotNull String bizCode, @NotNull String bizResult, @NotNull String bizErrorMsg, @NotNull String statusId) {
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        Intrinsics.checkNotNullParameter(bizNode, "bizNode");
        Intrinsics.checkNotNullParameter(bizCode, "bizCode");
        Intrinsics.checkNotNullParameter(bizResult, "bizResult");
        Intrinsics.checkNotNullParameter(bizErrorMsg, "bizErrorMsg");
        Intrinsics.checkNotNullParameter(statusId, "statusId");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_pay_center_choose_download_dialog");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_pay_center_choose_download_dialog");
        map.put("payMsgType", "_PayMerchantSdk");
        map.put("fail_reason", failReason);
        map.put("dialog_id", dialogId);
        map.put("bizNode", bizNode);
        map.put("bizCode", bizCode);
        map.put("bizResult", bizResult);
        map.put("bizErrorMsg", bizErrorMsg);
        map.put("status_id", statusId);
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> c(@NotNull String failReason, @NotNull String btnId, @NotNull String bizNode, @NotNull String bizCode, @NotNull String bizResult, @NotNull String bizErrorMsg, @NotNull String statusId) {
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        Intrinsics.checkNotNullParameter(btnId, "btnId");
        Intrinsics.checkNotNullParameter(bizNode, "bizNode");
        Intrinsics.checkNotNullParameter(bizCode, "bizCode");
        Intrinsics.checkNotNullParameter(bizResult, "bizResult");
        Intrinsics.checkNotNullParameter(bizErrorMsg, "bizErrorMsg");
        Intrinsics.checkNotNullParameter(statusId, "statusId");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_pay_center_download_processa_btn");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_pay_center_download_processa_btn");
        map.put("payMsgType", "_PayMerchantSdk");
        map.put("fail_reason", failReason);
        map.put("btn_id", btnId);
        map.put("bizNode", bizNode);
        map.put("bizCode", bizCode);
        map.put("bizResult", bizResult);
        map.put("bizErrorMsg", bizErrorMsg);
        map.put("status_id", statusId);
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> d(@NotNull String failReason, @NotNull String btnId, @NotNull String bizNode, @NotNull String bizCode, @NotNull String bizResult, @NotNull String bizErrorMsg, @NotNull String statusId) {
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        Intrinsics.checkNotNullParameter(btnId, "btnId");
        Intrinsics.checkNotNullParameter(bizNode, "bizNode");
        Intrinsics.checkNotNullParameter(bizCode, "bizCode");
        Intrinsics.checkNotNullParameter(bizResult, "bizResult");
        Intrinsics.checkNotNullParameter(bizErrorMsg, "bizErrorMsg");
        Intrinsics.checkNotNullParameter(statusId, "statusId");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_pay_center_download_processa_dialog");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_pay_center_download_processa_dialog");
        map.put("payMsgType", "_PayMerchantSdk");
        map.put("fail_reason", failReason);
        map.put("btn_id", btnId);
        map.put("bizNode", bizNode);
        map.put("bizCode", bizCode);
        map.put("bizResult", bizResult);
        map.put("bizErrorMsg", bizErrorMsg);
        map.put("status_id", statusId);
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> e(@NotNull String failReason, @NotNull String btnId, @NotNull String bizNode, @NotNull String bizCode, @NotNull String bizResult, @NotNull String bizErrorMsg) {
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        Intrinsics.checkNotNullParameter(btnId, "btnId");
        Intrinsics.checkNotNullParameter(bizNode, "bizNode");
        Intrinsics.checkNotNullParameter(bizCode, "bizCode");
        Intrinsics.checkNotNullParameter(bizResult, "bizResult");
        Intrinsics.checkNotNullParameter(bizErrorMsg, "bizErrorMsg");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_pay_center_download_status");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_pay_center_download_status");
        map.put("payMsgType", "_PayMerchantSdk");
        map.put("fail_reason", failReason);
        map.put("btn_id", btnId);
        map.put("bizNode", bizNode);
        map.put("bizCode", bizCode);
        map.put("bizResult", bizResult);
        map.put("bizErrorMsg", bizErrorMsg);
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> f(@NotNull String failReason, @NotNull String dialogId, @NotNull String bizNode, @NotNull String bizCode, @NotNull String bizResult, @NotNull String bizErrorMsg, @NotNull String statusId) {
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        Intrinsics.checkNotNullParameter(bizNode, "bizNode");
        Intrinsics.checkNotNullParameter(bizCode, "bizCode");
        Intrinsics.checkNotNullParameter(bizResult, "bizResult");
        Intrinsics.checkNotNullParameter(bizErrorMsg, "bizErrorMsg");
        Intrinsics.checkNotNullParameter(statusId, "statusId");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_pay_center_download_tips_dialog");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_pay_center_download_tips_dialog");
        map.put("payMsgType", "_PayMerchantSdk");
        map.put("fail_reason", failReason);
        map.put("dialog_id", dialogId);
        map.put("bizNode", bizNode);
        map.put("bizCode", bizCode);
        map.put("bizResult", bizResult);
        map.put("bizErrorMsg", bizErrorMsg);
        map.put("status_id", statusId);
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> g(@NotNull String failReason, @NotNull String dialogId, @NotNull String bizNode, @NotNull String bizCode, @NotNull String bizResult, @NotNull String bizErrorMsg, @NotNull String statusId, @NotNull String downloadChannel) {
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        Intrinsics.checkNotNullParameter(bizNode, "bizNode");
        Intrinsics.checkNotNullParameter(bizCode, "bizCode");
        Intrinsics.checkNotNullParameter(bizResult, "bizResult");
        Intrinsics.checkNotNullParameter(bizErrorMsg, "bizErrorMsg");
        Intrinsics.checkNotNullParameter(statusId, "statusId");
        Intrinsics.checkNotNullParameter(downloadChannel, "downloadChannel");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_pay_center_download_tips_dialog_btn");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_pay_center_download_tips_dialog_btn");
        map.put("payMsgType", "_PayMerchantSdk");
        map.put("fail_reason", failReason);
        map.put("dialog_id", dialogId);
        map.put("bizNode", bizNode);
        map.put("bizCode", bizCode);
        map.put("bizResult", bizResult);
        map.put("bizErrorMsg", bizErrorMsg);
        map.put("status_id", statusId);
        map.put("download_channel", downloadChannel);
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> h(@NotNull String failReason, @NotNull String dialogId, @NotNull String bizNode, @NotNull String bizCode, @NotNull String bizResult, @NotNull String bizErrorMsg, @NotNull String statusId) {
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        Intrinsics.checkNotNullParameter(bizNode, "bizNode");
        Intrinsics.checkNotNullParameter(bizCode, "bizCode");
        Intrinsics.checkNotNullParameter(bizResult, "bizResult");
        Intrinsics.checkNotNullParameter(bizErrorMsg, "bizErrorMsg");
        Intrinsics.checkNotNullParameter(statusId, "statusId");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_pay_center_forced_upgrade_dialog");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_pay_center_forced_upgrade_dialog");
        map.put("payMsgType", "_PayMerchantSdk");
        map.put("fail_reason", failReason);
        map.put("dialog_id", dialogId);
        map.put("bizNode", bizNode);
        map.put("bizCode", bizCode);
        map.put("bizResult", bizResult);
        map.put("bizErrorMsg", bizErrorMsg);
        map.put("status_id", statusId);
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> i(@NotNull String failReason, @NotNull String dialogId, @NotNull String bizNode, @NotNull String bizCode, @NotNull String bizResult, @NotNull String bizErrorMsg, @NotNull String statusId) {
        Intrinsics.checkNotNullParameter(failReason, "failReason");
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        Intrinsics.checkNotNullParameter(bizNode, "bizNode");
        Intrinsics.checkNotNullParameter(bizCode, "bizCode");
        Intrinsics.checkNotNullParameter(bizResult, "bizResult");
        Intrinsics.checkNotNullParameter(bizErrorMsg, "bizErrorMsg");
        Intrinsics.checkNotNullParameter(statusId, "statusId");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_pay_center_forced_upgrade_dialog_btn");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_pay_center_forced_upgrade_dialog_btn");
        map.put("payMsgType", "_PayMerchantSdk");
        map.put("fail_reason", failReason);
        map.put("dialog_id", dialogId);
        map.put("bizNode", bizNode);
        map.put("bizCode", bizCode);
        map.put("bizResult", bizResult);
        map.put("bizErrorMsg", bizErrorMsg);
        map.put("status_id", statusId);
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> j(@NotNull String code, @NotNull String prePayToken, @NotNull String order, @NotNull String bizNode, @NotNull String bizCode, @NotNull String bizResult, @NotNull String bizErrorMsg) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(prePayToken, "prePayToken");
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(bizNode, "bizNode");
        Intrinsics.checkNotNullParameter(bizCode, "bizCode");
        Intrinsics.checkNotNullParameter(bizResult, "bizResult");
        Intrinsics.checkNotNullParameter(bizErrorMsg, "bizErrorMsg");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_payresult_notify_result");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_payresult_notify_result");
        map.put("payMsgType", "_PayMerchantSdk");
        map.put("reportByPaySdk", LinkInfo.CALL_TYPE_SDK);
        map.put("code", code);
        map.put(sbe.PAY_SDK_PREPAYTOKEN, prePayToken);
        map.put("order", order);
        map.put("bizNode", bizNode);
        map.put("bizCode", bizCode);
        map.put("bizResult", bizResult);
        map.put("bizErrorMsg", bizErrorMsg);
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }
}
