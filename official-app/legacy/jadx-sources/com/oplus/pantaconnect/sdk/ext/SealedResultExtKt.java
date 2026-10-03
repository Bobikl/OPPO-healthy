package com.oplus.pantaconnect.sdk.ext;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.pantaconnect.sdk.ResultCode;
import com.oplus.pantaconnect.sdk.SealedResult;
import com.oplus.pantaconnect.sdk.exception.ServerRemoteException;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00010\u0004¢\u0006\u0002\b\u0005H\u0086\b¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"getOrThrow", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/oplus/pantaconnect/sdk/SealedResult;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lcom/oplus/pantaconnect/sdk/SealedResult;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SealedResultExtKt {
    public static final /* synthetic */ <T> T getOrThrow(SealedResult sealedResult, Function1<? super SealedResult, ? extends T> function1) throws ServerRemoteException {
        if (sealedResult.getResultCode() == ResultCode.SUCCESS) {
            return function1.invoke(sealedResult);
        }
        throw new ServerRemoteException(sealedResult.getErrorCode().getNumber(), sealedResult.getMessage());
    }
}
