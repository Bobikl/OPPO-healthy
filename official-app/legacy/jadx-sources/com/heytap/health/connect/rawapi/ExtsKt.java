package com.heytap.health.connect.rawapi;

import android.os.Bundle;
import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.IWearableCallback;
import com.oplus.wearable.linkservice.sdk.OnResultCallback;
import com.oplus.wearable.linkservice.sdk.common.IRemoveBoundCallback;
import com.oplus.wearable.linkservice.sdk.common.Status;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0000\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0000\u001a\u000e\u0010\b\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\u0000¨\u0006\t"}, d2 = {"Lcom/heytap/health/connect/rawapi/IResult;", "Lcom/oplus/wearable/linkservice/sdk/common/IRemoveBoundCallback;", "a", "Lcom/oplus/wearable/linkservice/sdk/OnResultCallback;", "d", "Lcom/oplus/wearable/linkservice/sdk/IWearableCallback;", "b", "Lcom/heytap/health/adaptersdk/IResult;", "c", "lib_heytapconnect_impl_release"}, k = 2, mv = {1, 8, 0})
public final class ExtsKt {
    @Nullable
    public static final IRemoveBoundCallback a(@Nullable final IResult iResult) {
        if (iResult == null) {
            return null;
        }
        return new IRemoveBoundCallback.Stub() { // from class: com.heytap.health.connect.rawapi.ExtsKt$toIRemoveBoundCallback$1
            @Override // com.oplus.wearable.linkservice.sdk.common.IRemoveBoundCallback
            public void onDeviceRemovalFailed(@Nullable String nodeId, int error) throws RemoteException {
                Bundle bundle = new Bundle();
                bundle.putString("nodeId", nodeId);
                iResult.onResult(false, "remove failed " + error, bundle);
            }

            @Override // com.oplus.wearable.linkservice.sdk.common.IRemoveBoundCallback
            public void onDeviceRemovalSucceeded(@Nullable String nodeId) throws RemoteException {
                Bundle bundle = new Bundle();
                bundle.putString("nodeId", nodeId);
                iResult.onResult(true, "remove success", bundle);
            }
        };
    }

    @Nullable
    public static final IWearableCallback b(@Nullable final IResult iResult) {
        if (iResult == null) {
            return null;
        }
        return new IWearableCallback.Stub() { // from class: com.heytap.health.connect.rawapi.ExtsKt$toIWearableCallback$1
            @Override // com.oplus.wearable.linkservice.sdk.IWearableCallback
            public void onResult(@Nullable Status status) throws RemoteException {
                iResult.onResult(Intrinsics.areEqual(status, Status.SUCCESS), status != null ? status.getMsg() : null, null);
            }
        };
    }

    @Nullable
    public static final com.heytap.health.adaptersdk.IResult c(@Nullable final IResult iResult) {
        if (iResult == null) {
            return null;
        }
        return new com.heytap.health.adaptersdk.IResult.Stub() { // from class: com.heytap.health.connect.rawapi.ExtsKt$toOafIResult$1
            @Override // com.heytap.health.adaptersdk.IResult
            public void onResult(boolean success, int errorCode, @Nullable String msg) throws RemoteException {
                iResult.onResult(success, msg, null);
            }
        };
    }

    @Nullable
    public static final OnResultCallback d(@Nullable final IResult iResult) {
        if (iResult == null) {
            return null;
        }
        return new OnResultCallback.Stub() { // from class: com.heytap.health.connect.rawapi.ExtsKt$toOnResultCallback$1
            @Override // com.oplus.wearable.linkservice.sdk.OnResultCallback
            public void onFailure(@Nullable String message) throws RemoteException {
                iResult.onResult(false, message, null);
            }

            @Override // com.oplus.wearable.linkservice.sdk.OnResultCallback
            public void onSuccess(@Nullable Bundle bundle) throws RemoteException {
                iResult.onResult(true, "success", bundle);
            }
        };
    }
}
