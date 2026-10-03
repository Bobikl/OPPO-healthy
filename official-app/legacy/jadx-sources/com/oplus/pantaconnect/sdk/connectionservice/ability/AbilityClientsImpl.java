package com.oplus.pantaconnect.sdk.connectionservice.ability;

import android.os.Bundle;
import android.os.RemoteException;
import coconut.prunes;
import com.google.protobuf.Int32Value;
import com.google.protobuf.InvalidProtocolBufferException;
import com.oplus.pantaconnect.sdk.RequestScope;
import com.oplus.pantaconnect.sdk.ResultCode;
import com.oplus.pantaconnect.sdk.SealedResult;
import com.oplus.pantaconnect.sdk.connectionservice.ability.AbilityClientsImpl;
import com.oplus.pantaconnect.sdk.connectionservice.connection.ConnectionServiceClientsImplKt;
import com.oplus.pantaconnect.sdk.connectionservice.connection.DisplayDevice;
import com.oplus.pantaconnect.sdk.exception.IpcInterfaceNullPointException;
import com.oplus.pantaconnect.sdk.exception.ServerRemoteException;
import com.oplus.pantaconnect.sdk.ipc.AppIpc;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J$\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/ability/AbilityClientsImpl;", "Lcom/oplus/pantaconnect/sdk/connectionservice/ability/AbilityClients;", "()V", "checkLocalAbility", "Ljava/util/concurrent/CompletableFuture;", "", "ability", "", "packageName", "", "getAppIdByPackageName", "getCachedDevicesByAbility", "", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/DisplayDevice;", "extraData", "Landroid/os/Bundle;", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AbilityClientsImpl implements AbilityClients {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean checkLocalAbility$lambda$0(int i, String str) {
        RequestScope requestScope = RequestScope.CONNECTION;
        String strValueOf = String.valueOf(i);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return Boolean.valueOf(AppIpc.remoteRequest(requestScope, "checkLocalAbility", strValueOf, bytes)[0] != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAppIdByPackageName$lambda$2(String str, final CompletableFuture completableFuture) throws IpcInterfaceNullPointException, RemoteException {
        RequestScope requestScope = RequestScope.CONNECTION;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        AppIpc.remoteRequest$default(requestScope, "getAppIdByPackageName", null, bytes, new Function1<byte[], Boolean>() { // from class: com.oplus.pantaconnect.sdk.connectionservice.ability.AbilityClientsImpl$getAppIdByPackageName$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull byte[] bArr) throws InvalidProtocolBufferException {
                SealedResult from = SealedResult.parseFrom(bArr);
                if (from.getResultCode() == ResultCode.SUCCESS) {
                    completableFuture.complete(Integer.valueOf(Int32Value.parseFrom(from.getData()).getValue()));
                } else {
                    completableFuture.completeExceptionally(new ServerRemoteException(from.getResultCode().getNumber(), from.getMessage()));
                }
                return Boolean.TRUE;
            }
        }, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCachedDevicesByAbility$lambda$1(int i, Bundle bundle, final CompletableFuture completableFuture) throws IpcInterfaceNullPointException, RemoteException {
        AppIpc.remoteRequestBundle$default(RequestScope.CONNECTION, "getCachedDevicesByAbility", String.valueOf(i), null, bundle, new Function1<byte[], Boolean>() { // from class: com.oplus.pantaconnect.sdk.connectionservice.ability.AbilityClientsImpl$getCachedDevicesByAbility$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull byte[] bArr) throws InvalidProtocolBufferException {
                SealedResult from = SealedResult.parseFrom(bArr);
                if (from.getResultCode() == ResultCode.SUCCESS) {
                    completableFuture.complete(ConnectionServiceClientsImplKt.toDisplayDeviceList((prunes) prunes.blueberry.parseFrom(from.getData())));
                } else {
                    completableFuture.completeExceptionally(new ServerRemoteException(from.getResultCode().getNumber(), from.getMessage()));
                }
                return Boolean.TRUE;
            }
        }, 8, null);
        return Unit.INSTANCE;
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.ability.AbilityClients
    @NotNull
    public CompletableFuture<Boolean> checkLocalAbility(final int ability, @NotNull final String packageName) {
        return CompletableFuture.supplyAsync(new Supplier() { // from class: com.oplus.aiunit.vision.g2
            @Override // java.util.function.Supplier
            public final Object get() {
                return AbilityClientsImpl.checkLocalAbility$lambda$0(ability, packageName);
            }
        });
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.ability.AbilityClients
    @NotNull
    public CompletableFuture<Integer> getAppIdByPackageName(@NotNull final String packageName) {
        final CompletableFuture<Integer> completableFuture = new CompletableFuture<>();
        CompletableFuture.supplyAsync(new Supplier() { // from class: com.oplus.aiunit.vision.h2
            @Override // java.util.function.Supplier
            public final Object get() {
                return AbilityClientsImpl.getAppIdByPackageName$lambda$2(packageName, completableFuture);
            }
        });
        return completableFuture;
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.ability.AbilityClients
    @NotNull
    public CompletableFuture<List<DisplayDevice>> getCachedDevicesByAbility(final int ability, @NotNull final Bundle extraData) {
        final CompletableFuture<List<DisplayDevice>> completableFuture = new CompletableFuture<>();
        CompletableFuture.supplyAsync(new Supplier() { // from class: com.oplus.aiunit.vision.f2
            @Override // java.util.function.Supplier
            public final Object get() {
                return AbilityClientsImpl.getCachedDevicesByAbility$lambda$1(ability, extraData, completableFuture);
            }
        });
        return completableFuture;
    }
}
