package com.oplus.pantaconnect.sdk.connectionservice.connection;

import coconut.mango;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/connection/AccountState;", "Lcoconut/mango;", "toBufferType", "(Lcom/oplus/pantaconnect/sdk/connectionservice/connection/AccountState;)Lcoconut/mango;", "toExternalType", "(Lcoconut/mango;)Lcom/oplus/pantaconnect/sdk/connectionservice/connection/AccountState;", "connectionservice_release"}, k = 2, mv = {1, 9, 0})
public final class AccountStateKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AccountState.values().length];
            try {
                iArr[AccountState.NO_ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountState.DIFFERENT_ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountState.SAME_ACCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[mango.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                mango mangoVar = mango.NO_ACCOUNT;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                mango mangoVar2 = mango.NO_ACCOUNT;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final mango toBufferType(@NotNull AccountState accountState) {
        int i = WhenMappings.$EnumSwitchMapping$0[accountState.ordinal()];
        if (i == 1) {
            return mango.NO_ACCOUNT;
        }
        if (i == 2) {
            return mango.DIFFERENT_ACCOUNT;
        }
        if (i == 3) {
            return mango.SAME_ACCOUNT;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final AccountState toExternalType(@NotNull mango mangoVar) {
        int i = WhenMappings.$EnumSwitchMapping$1[mangoVar.ordinal()];
        if (i == 1) {
            return AccountState.NO_ACCOUNT;
        }
        if (i != 2) {
            return i != 3 ? AccountState.NO_ACCOUNT : AccountState.SAME_ACCOUNT;
        }
        return AccountState.DIFFERENT_ACCOUNT;
    }
}
