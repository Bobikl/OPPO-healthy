package com.oplus.aiunit.vision;

import com.heytap.device.data.api.AGPSFileRequest;
import com.heytap.device.data.api.AGPSFileResponse;
import com.heytap.device.data.api.HFGpsFileAPIRequest;
import com.heytap.device.data.api.HFGpsFileResponse;
import com.heytap.device.data.api.PersonalHFGpsFileResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/x;", "", "Lcom/heytap/device/data/api/AGPSFileRequest;", "request", "Lcom/heytap/device/data/api/AGPSFileResponse;", "b", "(Lcom/heytap/device/data/api/AGPSFileRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/device/data/api/HFGpsFileAPIRequest;", "Lcom/heytap/device/data/api/HFGpsFileResponse;", "c", "(Lcom/heytap/device/data/api/HFGpsFileAPIRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/device/data/api/PersonalHFGpsFileResponse;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public interface x {
    @m1e("v1/c2s/sport/data/hfFile")
    @Nullable
    Object a(@NotNull Continuation<? super PersonalHFGpsFileResponse> continuation);

    @m1e("v1/c2s/ephemeris/queryRsEphemerisInfo")
    @Nullable
    Object b(@av1 @NotNull AGPSFileRequest aGPSFileRequest, @NotNull Continuation<? super AGPSFileResponse> continuation);

    @m1e("v1/c2s/sport/data/queryHfFile")
    @Nullable
    Object c(@av1 @NotNull HFGpsFileAPIRequest hFGpsFileAPIRequest, @NotNull Continuation<? super HFGpsFileResponse> continuation);
}
