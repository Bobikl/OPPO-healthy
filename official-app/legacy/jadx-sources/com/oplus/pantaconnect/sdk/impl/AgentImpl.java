package com.oplus.pantaconnect.sdk.impl;

import com.oplus.pantaconnect.sdk.Agent;
import com.oplus.pantaconnect.sdk.PlatformInitialization;
import com.oplus.pantaconnect.sdk.ResultCode;
import com.oplus.pantaconnect.sdk.SdkExtension;
import com.oplus.pantaconnect.sdk.SealedResult;
import com.oplus.pantaconnect.sdk.connection.ConnectionExtension;
import com.oplus.pantaconnect.sdk.connection.ConnectionOptions;
import com.oplus.pantaconnect.sdk.connection.RemoteConnection;
import com.oplus.pantaconnect.sdk.ext.CompletableFutureExt;
import com.oplus.pantaconnect.sdk.ext.CompletableFutureExt$sam$i$java_util_function_Consumer$0;
import com.oplus.pantaconnect.sdk.impl.AgentImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u001a\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0015\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\tH\u0000¢\u0006\u0002\b\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00192\u0006\u0010\"\u001a\u00020!H\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\u0019H\u0016J\u0013\u0010$\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020!0\u0019H\u0016J\u001a\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010*\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006+"}, d2 = {"Lcom/oplus/pantaconnect/sdk/impl/AgentImpl;", "Lcom/oplus/pantaconnect/sdk/Agent;", "agentId", "", "serviceId", "displayName", "", "connections", "", "Lcom/oplus/pantaconnect/sdk/connection/RemoteConnection;", "extensions", "", "connectionClients", "Lcom/oplus/pantaconnect/sdk/impl/ConnectionClients;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/util/List;Ljava/lang/Object;Lcom/oplus/pantaconnect/sdk/impl/ConnectionClients;)V", "getAgentId", "()Ljava/lang/String;", "getConnections", "()Ljava/util/List;", "getDisplayName", "()Ljava/lang/CharSequence;", "getExtensions", "()Ljava/lang/Object;", "getServiceId", "acceptConnection", "Ljava/util/concurrent/CompletableFuture;", "options", "Lcom/oplus/pantaconnect/sdk/connection/ConnectionOptions;", "addRemoteConnection", "", "remoteConnection", "addRemoteConnection$core_release", "authResponse", "", "isAgree", "close", "equals", "other", "hashCode", "", "rejectConnection", "requestConnection", "toString", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAgentImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgentImpl.kt\ncom/oplus/pantaconnect/sdk/impl/AgentImpl\n+ 2 CompletableFutureExt.kt\ncom/oplus/pantaconnect/sdk/ext/CompletableFutureExt\n*L\n1#1,117:1\n41#2,8:118\n41#2,8:126\n41#2,8:134\n41#2,8:142\n41#2,8:150\n*S KotlinDebug\n*F\n+ 1 AgentImpl.kt\ncom/oplus/pantaconnect/sdk/impl/AgentImpl\n*L\n74#1:118,8\n52#1:126,8\n65#1:134,8\n79#1:142,8\n85#1:150,8\n*E\n"})
public final class AgentImpl implements Agent {

    @NotNull
    private final String agentId;

    @NotNull
    private final ConnectionClients connectionClients;

    @NotNull
    private final List<RemoteConnection> connections;

    @NotNull
    private final CharSequence displayName;

    @Nullable
    private final Object extensions;

    @NotNull
    private final String serviceId;

    public AgentImpl(@NotNull String str, @NotNull String str2, @NotNull CharSequence charSequence, @NotNull List<RemoteConnection> list, @Nullable Object obj, @NotNull ConnectionClients connectionClients) {
        this.agentId = str;
        this.serviceId = str2;
        this.displayName = charSequence;
        this.connections = list;
        this.extensions = obj;
        this.connectionClients = connectionClients;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RemoteConnection acceptConnection$lambda$3(final AgentImpl agentImpl, ConnectionOptions connectionOptions) {
        CompletableFuture<SealedResult> completableFutureAcceptConnection = agentImpl.connectionClients.acceptConnection(agentImpl, connectionOptions);
        final CompletableFuture completableFuture = new CompletableFuture();
        completableFutureAcceptConnection.thenAcceptAsync((Consumer<? super SealedResult>) new CompletableFutureExt$sam$i$java_util_function_Consumer$0(new Function1<SealedResult, Unit>() { // from class: com.oplus.pantaconnect.sdk.impl.AgentImpl$acceptConnection$lambda$3$$inlined$map$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SealedResult sealedResult) {
                m5204invoke(sealedResult);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m5204invoke(SealedResult sealedResult) {
                ConnectionExtension connectionExtension;
                CompletableFuture completableFuture2 = completableFuture;
                SdkExtension sdkExtension = PlatformInitialization.INSTANCE.getSdkExtension();
                completableFuture2.complete(new RemoteConnectionImpl(agentImpl, false, false, (sdkExtension == null || (connectionExtension = sdkExtension.getConnectionExtension()) == null) ? 0L : connectionExtension.getConnectionId(), null, 16, null));
            }
        })).exceptionally((Function<Throwable, ? extends Void>) new CompletableFutureExt.AnonymousClass2(completableFuture));
        return (RemoteConnection) completableFuture.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean authResponse$lambda$6(AgentImpl agentImpl, boolean z) {
        CompletableFuture<SealedResult> completableFutureAuthResponse = agentImpl.connectionClients.authResponse(agentImpl, z);
        final CompletableFuture completableFuture = new CompletableFuture();
        completableFutureAuthResponse.thenAcceptAsync((Consumer<? super SealedResult>) new CompletableFutureExt$sam$i$java_util_function_Consumer$0(new Function1<SealedResult, Unit>() { // from class: com.oplus.pantaconnect.sdk.impl.AgentImpl$authResponse$lambda$6$$inlined$map$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SealedResult sealedResult) {
                m5205invoke(sealedResult);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m5205invoke(SealedResult sealedResult) {
                completableFuture.complete(Boolean.TRUE);
            }
        })).exceptionally((Function<Throwable, ? extends Void>) new CompletableFutureExt.AnonymousClass2(completableFuture));
        return (Boolean) completableFuture.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean close$lambda$8(AgentImpl agentImpl) {
        CompletableFuture<SealedResult> completableFutureClose = agentImpl.connectionClients.close(agentImpl, "agent close.");
        final CompletableFuture completableFuture = new CompletableFuture();
        completableFutureClose.thenAcceptAsync((Consumer<? super SealedResult>) new CompletableFutureExt$sam$i$java_util_function_Consumer$0(new Function1<SealedResult, Unit>() { // from class: com.oplus.pantaconnect.sdk.impl.AgentImpl$close$lambda$8$$inlined$map$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SealedResult sealedResult) {
                m5206invoke(sealedResult);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m5206invoke(SealedResult sealedResult) {
                completableFuture.complete(Boolean.TRUE);
            }
        })).exceptionally((Function<Throwable, ? extends Void>) new CompletableFutureExt.AnonymousClass2(completableFuture));
        return (Boolean) completableFuture.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RemoteConnection requestConnection$lambda$1(final AgentImpl agentImpl, ConnectionOptions connectionOptions) {
        CompletableFuture<SealedResult> completableFutureRequestConnection = agentImpl.connectionClients.requestConnection(agentImpl, connectionOptions);
        final CompletableFuture completableFuture = new CompletableFuture();
        completableFutureRequestConnection.thenAcceptAsync((Consumer<? super SealedResult>) new CompletableFutureExt$sam$i$java_util_function_Consumer$0(new Function1<SealedResult, Unit>() { // from class: com.oplus.pantaconnect.sdk.impl.AgentImpl$requestConnection$lambda$1$$inlined$map$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SealedResult sealedResult) {
                m5208invoke(sealedResult);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m5208invoke(SealedResult sealedResult) {
                ConnectionExtension connectionExtension;
                CompletableFuture completableFuture2 = completableFuture;
                boolean z = sealedResult.getResultCode() == ResultCode.CANCELLED;
                SdkExtension sdkExtension = PlatformInitialization.INSTANCE.getSdkExtension();
                completableFuture2.complete(new RemoteConnectionImpl(agentImpl, false, z, (sdkExtension == null || (connectionExtension = sdkExtension.getConnectionExtension()) == null) ? 0L : connectionExtension.getConnectionId(), null, 16, null));
            }
        })).exceptionally((Function<Throwable, ? extends Void>) new CompletableFutureExt.AnonymousClass2(completableFuture));
        return (RemoteConnection) completableFuture.get();
    }

    @Override // com.oplus.pantaconnect.sdk.Agent
    @NotNull
    public CompletableFuture<RemoteConnection> acceptConnection() {
        return Agent.DefaultImpls.acceptConnection(this);
    }

    public final void addRemoteConnection$core_release(@NotNull RemoteConnection remoteConnection) {
        getConnections().add(remoteConnection);
    }

    @Override // com.oplus.pantaconnect.sdk.Agent
    @NotNull
    public CompletableFuture<Boolean> authResponse(final boolean isAgree) {
        return CompletableFuture.supplyAsync(new Supplier() { // from class: com.oplus.aiunit.vision.tq
            @Override // java.util.function.Supplier
            public final Object get() {
                return AgentImpl.authResponse$lambda$6(this.a, isAgree);
            }
        });
    }

    @Override // com.oplus.pantaconnect.sdk.Agent
    @NotNull
    public CompletableFuture<Boolean> close() {
        return CompletableFuture.supplyAsync(new Supplier() { // from class: com.oplus.aiunit.vision.vq
            @Override // java.util.function.Supplier
            public final Object get() {
                return AgentImpl.close$lambda$8(this.a);
            }
        });
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(AgentImpl.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.oplus.pantaconnect.sdk.impl.AgentImpl");
        AgentImpl agentImpl = (AgentImpl) other;
        return Intrinsics.areEqual(this.agentId, agentImpl.agentId) && Intrinsics.areEqual(getServiceId(), agentImpl.getServiceId()) && Intrinsics.areEqual(getDisplayName(), agentImpl.getDisplayName());
    }

    @NotNull
    public final String getAgentId() {
        return this.agentId;
    }

    @Override // com.oplus.pantaconnect.sdk.Agent
    @NotNull
    public List<RemoteConnection> getConnections() {
        return this.connections;
    }

    @Override // com.oplus.pantaconnect.sdk.Agent
    @NotNull
    public CharSequence getDisplayName() {
        return this.displayName;
    }

    @Override // com.oplus.pantaconnect.sdk.Agent
    @Nullable
    public Object getExtensions() {
        return this.extensions;
    }

    @Override // com.oplus.pantaconnect.sdk.Agent
    @NotNull
    public String getServiceId() {
        return this.serviceId;
    }

    public int hashCode() {
        return getDisplayName().hashCode() + ((getServiceId().hashCode() + (this.agentId.hashCode() * 31)) * 31);
    }

    @Override // com.oplus.pantaconnect.sdk.Agent
    @NotNull
    public CompletableFuture<Boolean> rejectConnection() {
        CompletableFuture<SealedResult> completableFutureRejectConnection = this.connectionClients.rejectConnection(this);
        final CompletableFuture<Boolean> completableFuture = new CompletableFuture<>();
        completableFutureRejectConnection.thenAcceptAsync((Consumer<? super SealedResult>) new CompletableFutureExt$sam$i$java_util_function_Consumer$0(new Function1<SealedResult, Unit>() { // from class: com.oplus.pantaconnect.sdk.impl.AgentImpl$rejectConnection$$inlined$map$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SealedResult sealedResult) {
                m5207invoke(sealedResult);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m5207invoke(SealedResult sealedResult) {
                completableFuture.complete(Boolean.TRUE);
            }
        })).exceptionally((Function<Throwable, ? extends Void>) new CompletableFutureExt.AnonymousClass2(completableFuture));
        return completableFuture;
    }

    @Override // com.oplus.pantaconnect.sdk.Agent
    @NotNull
    public CompletableFuture<RemoteConnection> requestConnection() {
        return Agent.DefaultImpls.requestConnection(this);
    }

    @NotNull
    public String toString() {
        return "AgentImpl(agentId='" + this.agentId + "', serviceId='" + getServiceId() + "', displayName=" + ((Object) getDisplayName()) + ", connections='" + getConnections() + "')";
    }

    @Override // com.oplus.pantaconnect.sdk.Agent
    @NotNull
    public CompletableFuture<RemoteConnection> acceptConnection(@Nullable final ConnectionOptions options) {
        if (options == null) {
            options = new ConnectionOptions(null, null, null, null, 15, null);
        }
        return CompletableFuture.supplyAsync(new Supplier() { // from class: com.oplus.aiunit.vision.wq
            @Override // java.util.function.Supplier
            public final Object get() {
                return AgentImpl.acceptConnection$lambda$3(this.a, options);
            }
        });
    }

    @Override // com.oplus.pantaconnect.sdk.Agent
    @NotNull
    public CompletableFuture<RemoteConnection> requestConnection(@Nullable final ConnectionOptions options) {
        if (options == null) {
            options = new ConnectionOptions(null, null, null, null, 15, null);
        }
        return CompletableFuture.supplyAsync(new Supplier() { // from class: com.oplus.aiunit.vision.uq
            @Override // java.util.function.Supplier
            public final Object get() {
                return AgentImpl.requestConnection$lambda$1(this.a, options);
            }
        });
    }

    public /* synthetic */ AgentImpl(String str, String str2, CharSequence charSequence, List list, Object obj, ConnectionClients connectionClients, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, charSequence, (i & 8) != 0 ? new ArrayList() : list, (i & 16) != 0 ? null : obj, (i & 32) != 0 ? new ConnectionClientsImpl(null, 0L, 3, null) : connectionClients);
    }
}
