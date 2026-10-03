package com.oplus.pantaconnect.sdk.connectionservice.account;

import android.content.Intent;
import com.google.protobuf.Int32Value;
import com.oplus.pantaconnect.sdk.SealedResult;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/account/AccountImpl;", "Lcom/oplus/pantaconnect/sdk/connectionservice/account/Account;", "accountClients", "Lcom/oplus/pantaconnect/sdk/connectionservice/account/AccountClients;", "(Lcom/oplus/pantaconnect/sdk/connectionservice/account/AccountClients;)V", "getAccountLoginIntent", "Ljava/util/concurrent/CompletableFuture;", "Landroid/content/Intent;", "queryAccountLoginStatus", "Lcom/oplus/pantaconnect/sdk/connectionservice/account/AccountLoginState;", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAccountImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountImpl.kt\ncom/oplus/pantaconnect/sdk/connectionservice/account/AccountImpl\n+ 2 CompletableFutureExt.kt\ncom/oplus/pantaconnect/sdk/ext/CompletableFutureExt\n*L\n1#1,51:1\n41#2,8:52\n*S KotlinDebug\n*F\n+ 1 AccountImpl.kt\ncom/oplus/pantaconnect/sdk/connectionservice/account/AccountImpl\n*L\n38#1:52,8\n*E\n"})
public final class AccountImpl implements Account {

    @NotNull
    private final AccountClients accountClients;

    /* JADX WARN: Multi-variable type inference failed */
    public AccountImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.account.Account
    @NotNull
    public CompletableFuture<Intent> getAccountLoginIntent() {
        return this.accountClients.getAccountLoginIntent();
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.account.Account
    @NotNull
    public CompletableFuture<AccountLoginState> queryAccountLoginStatus() {
        CompletableFuture<SealedResult> completableFutureQueryAccountLoginStatus = this.accountClients.queryAccountLoginStatus();
        final CompletableFuture<AccountLoginState> completableFuture = new CompletableFuture<>();
        final Function1<SealedResult, Unit> function1 = new Function1<SealedResult, Unit>() { // from class: com.oplus.pantaconnect.sdk.connectionservice.account.AccountImpl$queryAccountLoginStatus$$inlined$map$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SealedResult sealedResult) {
                m5190invoke(sealedResult);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m5190invoke(SealedResult sealedResult) {
                AccountLoginState accountLoginState;
                CompletableFuture completableFuture2 = completableFuture;
                SealedResult sealedResult2 = sealedResult;
                if (!sealedResult2.getData().isEmpty()) {
                    switch (Int32Value.parseFrom(sealedResult2.getData()).getValue()) {
                        case 128:
                        case 129:
                            accountLoginState = AccountLoginState.LOGOUT;
                            break;
                        case 130:
                            accountLoginState = AccountLoginState.LOGIN;
                            break;
                        case 131:
                            accountLoginState = AccountLoginState.KICKOFF;
                            break;
                        default:
                            accountLoginState = AccountLoginState.ERROR;
                            break;
                    }
                } else {
                    accountLoginState = AccountLoginState.ERROR;
                }
                completableFuture2.complete(accountLoginState);
            }
        };
        completableFutureQueryAccountLoginStatus.thenAcceptAsync(new Consumer() { // from class: com.oplus.pantaconnect.sdk.connectionservice.account.AccountImpl$inlined$sam$i$java_util_function_Consumer$0
            @Override // java.util.function.Consumer
            public final /* synthetic */ void accept(Object obj) {
                function1.invoke(obj);
            }
        }).exceptionally(new Function() { // from class: com.oplus.pantaconnect.sdk.connectionservice.account.AccountImpl$queryAccountLoginStatus$$inlined$map$2
            @Override // java.util.function.Function
            public final Void apply(Throwable th) {
                completableFuture.completeExceptionally(th);
                return null;
            }
        });
        return completableFuture;
    }

    public AccountImpl(@NotNull AccountClients accountClients) {
        this.accountClients = accountClients;
    }

    public /* synthetic */ AccountImpl(AccountClients accountClients, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AccountClientsKt.createAccountClients() : accountClients);
    }
}
