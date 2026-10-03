package com.oplus.aiunit.vision;

import com.google.gson.JsonObject;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.operation.doctor.AlipayAuthInfo;
import com.heytap.health.operations.doctor.AlipayUserBean;
import com.heytap.health.operations.doctor.DoctorServiceBean;
import com.heytap.webview.extension.protocol.Const;
import io.protostuff.MapSchema;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ?\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00052$\b\u0001\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001`\fH§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\bJC\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00162\b\b\u0001\u0010\u0012\u001a\u00020\u00032\u0014\b\u0001\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/hy5;", "", "", "", "params", "Lcom/heytap/health/network/core/BaseResponse;", "Lcom/heytap/health/operation/doctor/AlipayAuthInfo;", "b", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/operations/doctor/AlipayUserBean;", MapSchema.FIELD_NAME_ENTRY, "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Lcom/google/gson/JsonObject;", "d", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/operations/doctor/DoctorServiceBean;", "c", "url", "headers", "Lcom/oplus/aiunit/vision/o8c$c;", Const.Scheme.SCHEME_FILE, "Lcom/oplus/aiunit/vision/ztf;", "a", "(Ljava/lang/String;Ljava/util/Map;Lcom/oplus/aiunit/vision/o8c$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public interface hy5 {
    @m8c
    @m1e
    @Nullable
    Object a(@dmk @NotNull String str, @oi8 @NotNull Map<String, String> map, @n8e @NotNull o8c.c cVar, @NotNull Continuation<? super ztf<Object>> continuation);

    @m1e("v1/c2s/third/account/aliAuthInfo")
    @Nullable
    Object b(@av1 @NotNull Map<String, String> map, @NotNull Continuation<? super BaseResponse<AlipayAuthInfo>> continuation);

    @m1e("v1/c2s/doctor/service")
    @Nullable
    Object c(@av1 @NotNull Map<String, String> map, @NotNull Continuation<? super BaseResponse<DoctorServiceBean>> continuation);

    @m1e("v1/c2s/doctorResource/syncHealthData")
    @Nullable
    Object d(@av1 @NotNull HashMap<String, Object> map, @NotNull Continuation<? super BaseResponse<JsonObject>> continuation);

    @m1e("v1/c2s/doctor/bindAlipay")
    @Nullable
    Object e(@av1 @NotNull Map<String, String> map, @NotNull Continuation<? super BaseResponse<AlipayUserBean>> continuation);
}
