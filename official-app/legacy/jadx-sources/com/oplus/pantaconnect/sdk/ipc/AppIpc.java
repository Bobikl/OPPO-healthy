package com.oplus.pantaconnect.sdk.ipc;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.RequiresApi;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.oplus.pantaconnect.sdk.RequestScope;
import com.oplus.pantaconnect.sdk.exception.IpcInterfaceNullPointException;
import com.oplus.pantaconnect.sdk.logger.SdkLogger;
import com.oplus.pantaconnect.service.IOuterIpcInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000e\u001a\u00020\t\u001aF\u0010\b\u001a\u00020\u000f2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000e\u001a\u00020\t2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u0013\u001aN\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u0013\u001aN\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000e\u001a\u00020\t2\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00120\u0019j\u0002`\u001aH\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000*.\u0010\u001b\"\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00120\u00192\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00120\u0019*\"\u0010\u001c\"\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u00112\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u0011¨\u0006\u001d"}, d2 = {"KEY_BINDER", "", "KEY_IS_ASYNC", "KEY_IS_BUNDLE_RESPONSE", "KEY_PROCESS_BUNDLE", "KEY_SCOPE", "logger", "Lcom/oplus/pantaconnect/sdk/logger/SdkLogger;", "remoteRequest", "", "scope", "Lcom/oplus/pantaconnect/sdk/RequestScope;", "method", "params", "args", "", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "Lkotlin/Function1;", "", "Lcom/oplus/pantaconnect/sdk/ipc/Response;", "remoteRequestBundle", "bundle", "Landroid/os/Bundle;", "remoteRequestWithBundleResponse", "bundleResponse", "Lkotlin/Function2;", "Lcom/oplus/pantaconnect/sdk/ipc/BundleResponse;", "BundleResponse", "Response", "core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName(name = "AppIpc")
public final class AppIpc {

    @NotNull
    private static final String KEY_BINDER = "call_process_binder";

    @NotNull
    private static final String KEY_IS_ASYNC = "is-async";

    @NotNull
    private static final String KEY_IS_BUNDLE_RESPONSE = "bundle_response";

    @NotNull
    private static final String KEY_PROCESS_BUNDLE = "data_bundle";

    @NotNull
    private static final String KEY_SCOPE = "scope";

    @NotNull
    private static final SdkLogger logger = SdkLogger.Companion.getDefault$default(SdkLogger.INSTANCE, "AppIpc", null, 2, null);

    public static final void remoteRequest(@NotNull RequestScope requestScope, @NotNull String str, @Nullable String str2, @NotNull byte[] bArr, @NotNull final Function1<? super byte[], Boolean> function1) throws IpcInterfaceNullPointException, RemoteException {
        ServiceConnectivity serviceConnectivityCreate = ServiceConnectivity.INSTANCE.create();
        IOuterIpcInterface ipcInterface = serviceConnectivityCreate.getIpcInterface();
        SdkLogger sdkLogger = logger;
        StringBuilder sb = new StringBuilder("remote request ---async---. ");
        sb.append(ipcInterface != null);
        sdkLogger.info(sb.toString());
        if (ipcInterface != null) {
            Bundle bundle = new Bundle();
            bundle.putString("scope", requestScope.getScopeName());
            bundle.putBoolean(KEY_IS_ASYNC, true);
            bundle.putBinder(KEY_BINDER, serviceConnectivityCreate.getIpcCallback(str, new Function2<byte[], Bundle, Boolean>() { // from class: com.oplus.pantaconnect.sdk.ipc.AppIpc$remoteRequest$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                @NotNull
                public final Boolean invoke(@NotNull byte[] bArr2, @NotNull Bundle bundle2) {
                    return function1.invoke(bArr2);
                }
            }).asBinder());
            Unit unit = Unit.INSTANCE;
            ipcInterface.request(str, str2, bArr, bundle);
        }
    }

    public static /* synthetic */ void remoteRequest$default(RequestScope requestScope, String str, String str2, byte[] bArr, Function1 function1, int i, Object obj) throws IpcInterfaceNullPointException, RemoteException {
        if ((i & 1) != 0) {
            requestScope = RequestScope.CONNECTION;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            bArr = new byte[0];
        }
        remoteRequest(requestScope, str, str2, bArr, function1);
    }

    public static final void remoteRequestBundle(@NotNull RequestScope requestScope, @NotNull String str, @Nullable String str2, @NotNull byte[] bArr, @NotNull Bundle bundle, @NotNull final Function1<? super byte[], Boolean> function1) throws IpcInterfaceNullPointException, RemoteException {
        ServiceConnectivity serviceConnectivityCreate = ServiceConnectivity.INSTANCE.create();
        IOuterIpcInterface ipcInterface = serviceConnectivityCreate.getIpcInterface();
        SdkLogger sdkLogger = logger;
        StringBuilder sb = new StringBuilder("remote request with bundle ---async---. ");
        sb.append(ipcInterface != null);
        sdkLogger.info(sb.toString());
        if (ipcInterface != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("scope", requestScope.getScopeName());
            bundle2.putBoolean(KEY_IS_ASYNC, true);
            bundle2.putBundle(KEY_PROCESS_BUNDLE, bundle);
            bundle2.putBinder(KEY_BINDER, serviceConnectivityCreate.getIpcCallback(str, new Function2<byte[], Bundle, Boolean>() { // from class: com.oplus.pantaconnect.sdk.ipc.AppIpc$remoteRequestBundle$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                @NotNull
                public final Boolean invoke(@NotNull byte[] bArr2, @NotNull Bundle bundle3) {
                    return function1.invoke(bArr2);
                }
            }).asBinder());
            Unit unit = Unit.INSTANCE;
            ipcInterface.request(str, str2, bArr, bundle2);
        }
    }

    public static /* synthetic */ void remoteRequestBundle$default(RequestScope requestScope, String str, String str2, byte[] bArr, Bundle bundle, Function1 function1, int i, Object obj) throws IpcInterfaceNullPointException, RemoteException {
        if ((i & 1) != 0) {
            requestScope = RequestScope.CONNECTION;
        }
        RequestScope requestScope2 = requestScope;
        if ((i & 4) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            bArr = new byte[0];
        }
        remoteRequestBundle(requestScope2, str, str3, bArr, bundle, function1);
    }

    @RequiresApi(33)
    public static final void remoteRequestWithBundleResponse(@NotNull RequestScope requestScope, @NotNull String str, @Nullable String str2, @NotNull byte[] bArr, @NotNull final Function2<? super byte[], ? super Bundle, Boolean> function2) throws IpcInterfaceNullPointException, RemoteException {
        ServiceConnectivity serviceConnectivityCreate = ServiceConnectivity.INSTANCE.create();
        IOuterIpcInterface ipcInterface = serviceConnectivityCreate.getIpcInterface();
        SdkLogger sdkLogger = logger;
        StringBuilder sb = new StringBuilder("bundle remote request ---async---. ");
        sb.append(ipcInterface != null);
        sdkLogger.info(sb.toString());
        if (ipcInterface != null) {
            Bundle bundle = new Bundle();
            bundle.putString("scope", requestScope.getScopeName());
            bundle.putBoolean(KEY_IS_ASYNC, true);
            bundle.putBoolean(KEY_IS_BUNDLE_RESPONSE, true);
            bundle.putBinder(KEY_BINDER, serviceConnectivityCreate.getIpcCallback(str, new Function2<byte[], Bundle, Boolean>() { // from class: com.oplus.pantaconnect.sdk.ipc.AppIpc$remoteRequestWithBundleResponse$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                @NotNull
                public final Boolean invoke(@NotNull byte[] bArr2, @NotNull Bundle bundle2) {
                    function2.invoke(bArr2, bundle2);
                    return Boolean.TRUE;
                }
            }).asBinder());
            Unit unit = Unit.INSTANCE;
            ipcInterface.request(str, str2, bArr, bundle);
        }
    }

    public static /* synthetic */ void remoteRequestWithBundleResponse$default(RequestScope requestScope, String str, String str2, byte[] bArr, Function2 function2, int i, Object obj) throws IpcInterfaceNullPointException, RemoteException {
        if ((i & 1) != 0) {
            requestScope = RequestScope.CONNECTION;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            bArr = new byte[0];
        }
        remoteRequestWithBundleResponse(requestScope, str, str2, bArr, function2);
    }

    public static /* synthetic */ byte[] remoteRequest$default(RequestScope requestScope, String str, String str2, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            requestScope = RequestScope.CONNECTION;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            bArr = new byte[0];
        }
        return remoteRequest(requestScope, str, str2, bArr);
    }

    @NotNull
    public static final byte[] remoteRequest(@NotNull RequestScope requestScope, @NotNull String str, @Nullable String str2, @NotNull byte[] bArr) throws IpcInterfaceNullPointException, RemoteException {
        IOuterIpcInterface ipcInterface = ServiceConnectivity.INSTANCE.create().getIpcInterface();
        SdkLogger sdkLogger = logger;
        StringBuilder sb = new StringBuilder("remote request. ");
        sb.append(ipcInterface != null);
        sdkLogger.info(sb.toString());
        if (ipcInterface != null) {
            Bundle bundle = new Bundle();
            bundle.putString("scope", requestScope.getScopeName());
            bundle.putBoolean(KEY_IS_ASYNC, false);
            Unit unit = Unit.INSTANCE;
            byte[] bArrRequest = ipcInterface.request(str, str2, bArr, bundle);
            if (bArrRequest != null) {
                return bArrRequest;
            }
        }
        return new byte[0];
    }
}
