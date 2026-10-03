package com.oplus.pantaconnect.sdk.connectionservice.account;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.RequiresApi;
import com.google.protobuf.InvalidProtocolBufferException;
import com.oplus.pantaconnect.sdk.PlatformInitialization;
import com.oplus.pantaconnect.sdk.RequestScope;
import com.oplus.pantaconnect.sdk.ResultCode;
import com.oplus.pantaconnect.sdk.SdkExtension;
import com.oplus.pantaconnect.sdk.SealedResult;
import com.oplus.pantaconnect.sdk.connection.ConnectionExtension;
import com.oplus.pantaconnect.sdk.connectionservice.account.AccountClientsImpl;
import com.oplus.pantaconnect.sdk.exception.IpcInterfaceNullPointException;
import com.oplus.pantaconnect.sdk.exception.ServerRemoteException;
import com.oplus.pantaconnect.sdk.ipc.AppIpc;
import com.oplus.pantaconnect.sdk.logger.SdkLogger;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0017J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/account/AccountClientsImpl;", "Lcom/oplus/pantaconnect/sdk/connectionservice/account/AccountClients;", "connectionExtension", "Lcom/oplus/pantaconnect/sdk/connection/ConnectionExtension;", "(Lcom/oplus/pantaconnect/sdk/connection/ConnectionExtension;)V", "logger", "Lcom/oplus/pantaconnect/sdk/logger/SdkLogger;", "getAccountLoginIntent", "Ljava/util/concurrent/CompletableFuture;", "Landroid/content/Intent;", "queryAccountLoginStatus", "Lcom/oplus/pantaconnect/sdk/SealedResult;", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AccountClientsImpl implements AccountClients {

    @Nullable
    private final ConnectionExtension connectionExtension;

    @NotNull
    private final SdkLogger logger;

    /* JADX WARN: Multi-variable type inference failed */
    public AccountClientsImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAccountLoginIntent$lambda$0(AccountClientsImpl accountClientsImpl, final CompletableFuture completableFuture) throws IpcInterfaceNullPointException, RemoteException {
        RequestScope requestScope;
        ConnectionExtension connectionExtension = accountClientsImpl.connectionExtension;
        if (connectionExtension == null || (requestScope = connectionExtension.getRequestScope()) == null) {
            requestScope = RequestScope.CONNECTION;
        }
        AppIpc.remoteRequestWithBundleResponse$default(requestScope, "getAccountLoginIntent", null, null, new Function2<byte[], Bundle, Boolean>() { // from class: com.oplus.pantaconnect.sdk.connectionservice.account.AccountClientsImpl$getAccountLoginIntent$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            @NotNull
            public final Boolean invoke(@NotNull byte[] bArr, @NotNull Bundle bundle) throws InvalidProtocolBufferException {
                boolean zCompleteExceptionally;
                SealedResult from = SealedResult.parseFrom(bArr);
                if (from.getResultCode() == ResultCode.SUCCESS) {
                    Intent intent = (Intent) bundle.getParcelable("accountIntent", Intent.class);
                    zCompleteExceptionally = intent != null ? completableFuture.complete(intent) : completableFuture.completeExceptionally(new ServerRemoteException(ResultCode.ERROR.getNumber(), "bundle translate to intent is null."));
                } else {
                    zCompleteExceptionally = completableFuture.completeExceptionally(new ServerRemoteException(from.getResultCode().getNumber(), from.getMessage()));
                }
                return Boolean.valueOf(zCompleteExceptionally);
            }
        }, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit queryAccountLoginStatus$lambda$1(AccountClientsImpl accountClientsImpl, final CompletableFuture completableFuture) throws IpcInterfaceNullPointException, RemoteException {
        RequestScope requestScope;
        ConnectionExtension connectionExtension = accountClientsImpl.connectionExtension;
        if (connectionExtension == null || (requestScope = connectionExtension.getRequestScope()) == null) {
            requestScope = RequestScope.CONNECTION;
        }
        AppIpc.remoteRequest$default(requestScope, "queryAccountLoginStatus", null, null, new Function1<byte[], Boolean>() { // from class: com.oplus.pantaconnect.sdk.connectionservice.account.AccountClientsImpl$queryAccountLoginStatus$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull byte[] bArr) throws InvalidProtocolBufferException {
                SealedResult from = SealedResult.parseFrom(bArr);
                return Boolean.valueOf(from.getResultCode() == ResultCode.SUCCESS ? completableFuture.complete(from) : completableFuture.completeExceptionally(new ServerRemoteException(from.getResultCode().getNumber(), from.getMessage())));
            }
        }, 12, null);
        return Unit.INSTANCE;
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.account.AccountClients
    @RequiresApi(33)
    @NotNull
    public CompletableFuture<Intent> getAccountLoginIntent() {
        this.logger.info("getAccountLoginIntent");
        final CompletableFuture<Intent> completableFuture = new CompletableFuture<>();
        CompletableFuture.supplyAsync(new Supplier() { // from class: com.oplus.aiunit.vision.mm
            @Override // java.util.function.Supplier
            public final Object get() {
                return AccountClientsImpl.getAccountLoginIntent$lambda$0(this.a, completableFuture);
            }
        });
        return completableFuture;
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.account.AccountClients
    @NotNull
    public CompletableFuture<SealedResult> queryAccountLoginStatus() {
        this.logger.info("queryAccountLoginStatus");
        final CompletableFuture<SealedResult> completableFuture = new CompletableFuture<>();
        CompletableFuture.supplyAsync(new Supplier() { // from class: com.oplus.aiunit.vision.lm
            @Override // java.util.function.Supplier
            public final Object get() {
                return AccountClientsImpl.queryAccountLoginStatus$lambda$1(this.a, completableFuture);
            }
        });
        return completableFuture;
    }

    public AccountClientsImpl(@Nullable ConnectionExtension connectionExtension) {
        this.connectionExtension = connectionExtension;
        this.logger = SdkLogger.Companion.getDefault$default(SdkLogger.INSTANCE, "AccountClientsImpl", null, 2, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AccountClientsImpl(ConnectionExtension connectionExtension, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            SdkExtension sdkExtension = PlatformInitialization.INSTANCE.getSdkExtension();
            connectionExtension = sdkExtension != null ? sdkExtension.getConnectionExtension() : null;
        }
        this(connectionExtension);
    }
}
