package com.heytap.health.oobe.repo;

import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sporthealth.blib.data.NetResult;
import com.oplus.aiunit.vision.CheckBindStatus;
import com.oplus.aiunit.vision.GetBindKey;
import com.oplus.aiunit.vision.OldestSupprotVersion;
import com.oplus.aiunit.vision.av1;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.e17;
import com.oplus.aiunit.vision.fk5;
import com.oplus.aiunit.vision.m1e;
import com.oplus.aiunit.vision.rc4;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J'\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00032\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006J'\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0006J'\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0006J'\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0006J%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0006J%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0006J'\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0006J%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0006J%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0006J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0006J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0006J'\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0006J'\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0006J'\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0006J%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/oobe/repo/a;", "", "params", "Lcom/heytap/sporthealth/blib/data/NetResult;", "Lcom/oplus/aiunit/vision/x83;", LogFieldKey.PROCESS_NAME_KEY, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/nfd;", "a", "Lcom/oplus/aiunit/vision/l58;", "o", "j", LogFieldKey.MESSAGE_KEY, b2n.g, LogFieldKey.LEVEL_KEY, "d", "n", "Lcom/oplus/aiunit/vision/fk5;", MapSchema.FIELD_NAME_KEY, b2n.f, "Lcom/oplus/aiunit/vision/e17;", MapSchema.FIELD_NAME_ENTRY, "b", "c", "q", "i", "Lcom/oplus/aiunit/vision/rc4;", "f", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
interface a {
    @m1e("v1/c2s/device/queryOldestSupportedVersion")
    @Nullable
    Object a(@av1 @Nullable Object obj, @NotNull Continuation<? super NetResult<OldestSupprotVersion>> continuation);

    @m1e("v1/c2s/school/cleanVirtualAccount")
    @Nullable
    Object b(@av1 @Nullable Object obj, @NotNull Continuation<? super NetResult<Object>> continuation);

    @m1e("v1/c2s/school/checkNickname")
    @Nullable
    Object c(@av1 @Nullable Object obj, @NotNull Continuation<? super NetResult<Object>> continuation);

    @m1e("v2/c2s/device/unbindSecondaryDevice")
    @Nullable
    Object d(@av1 @Nullable Object obj, @NotNull Continuation<? super NetResult<Object>> continuation);

    @m1e("v2/c2s/school/getDeviceBindingRecords")
    @Nullable
    Object e(@av1 @Nullable Object obj, @NotNull Continuation<? super NetResult<e17>> continuation);

    @m1e("v2/c2s/school/createVirtualAccount")
    @Nullable
    Object f(@av1 @Nullable Object obj, @NotNull Continuation<? super NetResult<rc4>> continuation);

    @m1e("v1/c2s/account/queryUserInfoMask")
    @Nullable
    Object g(@av1 @Nullable Object obj, @NotNull Continuation<? super NetResult<Object>> continuation);

    @m1e("v2/c2s/device/reportDeviceInfo")
    @Nullable
    Object h(@av1 @Nullable Object obj, @NotNull Continuation<? super NetResult<Object>> continuation);

    @m1e("v1/c2s/device/updateMobileVaid")
    @Nullable
    Object i(@av1 @Nullable Object obj, @NotNull Continuation<? super NetResult<Object>> continuation);

    @m1e("v2/c2s/device/bindDeviceWithRegisterWarranty")
    @Nullable
    Object j(@av1 @Nullable Object obj, @NotNull Continuation<? super NetResult<Object>> continuation);

    @m1e("v1/c2s/device/queryDeviceModelDetail")
    @Nullable
    Object k(@av1 @Nullable Object obj, @NotNull Continuation<? super NetResult<fk5>> continuation);

    @m1e("v2/c2s/device/unbindDevice")
    @Nullable
    Object l(@av1 @Nullable Object obj, @NotNull Continuation<? super NetResult<Object>> continuation);

    @m1e("v2/c2s/device/bindSecondaryDevice")
    @Nullable
    Object m(@av1 @Nullable Object obj, @NotNull Continuation<? super NetResult<Object>> continuation);

    @m1e("v2/c2s/device/unbindDeviceWithVirtual")
    @Nullable
    Object n(@av1 @Nullable Object obj, @NotNull Continuation<? super NetResult<Object>> continuation);

    @m1e("v2/c2s/device/getBindKey")
    @Nullable
    Object o(@av1 @Nullable Object obj, @NotNull Continuation<? super NetResult<GetBindKey>> continuation);

    @m1e("v2/c2s/device/checkBindStatus")
    @Nullable
    Object p(@av1 @Nullable Object obj, @NotNull Continuation<? super NetResult<CheckBindStatus>> continuation);

    @m1e("v1/c2s/school/updateVirtualAccount")
    @Nullable
    Object q(@av1 @Nullable Object obj, @NotNull Continuation<? super NetResult<Object>> continuation);
}
