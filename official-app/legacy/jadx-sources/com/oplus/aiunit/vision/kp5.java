package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.SpaceInfo;
import com.heytap.health.base.switchManager.SwitchBean;
import com.heytap.health.devicemanager.processor.cloudaccess.response.DeviceCareRspBean;
import com.heytap.health.devicemanager.processor.cloudaccess.response.DeviceCouponRsp;
import com.heytap.health.devicemanager.processor.cloudaccess.response.RecyclePriceRsp;
import com.heytap.health.network.core.BaseResponse;
import io.protostuff.MapSchema;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJ/\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\tJ5\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\n0\u00062\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/kp5;", "", "", "", "", "params", "Lcom/heytap/health/network/core/BaseResponse;", "Lcom/heytap/health/base/switchManager/SwitchBean;", "b", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/heytap/health/devicemanager/processor/cloudaccess/response/RecyclePriceRsp;", MapSchema.FIELD_NAME_ENTRY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/devicemanager/processor/cloudaccess/response/DeviceCouponRsp;", "d", "Lcom/heytap/health/devicemanager/processor/cloudaccess/response/DeviceCareRspBean;", "c", "Lcom/heytap/databaseengine/model/SpaceInfo;", "a", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public interface kp5 {
    @m1e("v1/c2s/operation/queryOperationList")
    @Nullable
    Object a(@av1 @NotNull Map<String, String> map, @NotNull Continuation<? super BaseResponse<List<SpaceInfo>>> continuation);

    @m1e("v1/c2s/switch/querySwitchStatus")
    @Nullable
    Object b(@av1 @NotNull Map<String, Integer> map, @NotNull Continuation<? super BaseResponse<SwitchBean>> continuation);

    @m1e("v2/c2s/device/queryUserDeviceCare")
    @Nullable
    Object c(@av1 @NotNull Map<String, String> map, @NotNull Continuation<? super BaseResponse<DeviceCareRspBean>> continuation);

    @m1e("v1/c2s/user/coupon/queryUserWearCoupons")
    @Nullable
    Object d(@NotNull Continuation<? super BaseResponse<DeviceCouponRsp>> continuation);

    @m1e("v1/c2s/device/queryUserDeviceRecyclePrice")
    @Nullable
    Object e(@NotNull Continuation<? super BaseResponse<List<RecyclePriceRsp>>> continuation);
}
