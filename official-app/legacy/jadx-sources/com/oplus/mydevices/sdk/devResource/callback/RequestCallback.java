package com.oplus.mydevices.sdk.devResource.callback;

import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.oplus.mydevices.sdk.devResource.bean.response.DeviceResource;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/oplus/mydevices/sdk/devResource/callback/RequestCallback;", "", "onError", "", MapSchema.FIELD_NAME_ENTRY, "", "onSuccess", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "Lcom/oplus/mydevices/sdk/devResource/bean/response/DeviceResource;", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public interface RequestCallback {
    void onError(@NotNull String e2);

    void onSuccess(@NotNull DeviceResource response);
}
