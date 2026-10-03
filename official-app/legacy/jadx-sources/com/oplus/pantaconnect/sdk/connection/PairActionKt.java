package com.oplus.pantaconnect.sdk.connection;

import com.oplus.pantaconnect.agents.InternalPairAction;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toPairAction", "Lcom/oplus/pantaconnect/agents/InternalPairAction;", "Lcom/oplus/pantaconnect/sdk/connection/PairAction;", "core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PairActionKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PairAction.values().length];
            try {
                iArr[PairAction.ACCEPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PairAction.REJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PairAction.PIN_AUTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PairAction.CUSTOMIZE_AUTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final InternalPairAction toPairAction(@NotNull PairAction pairAction) {
        int i = WhenMappings.$EnumSwitchMapping$0[pairAction.ordinal()];
        if (i == 1) {
            return InternalPairAction.ACCEPT;
        }
        if (i == 2) {
            return InternalPairAction.REJECT;
        }
        if (i == 3) {
            return InternalPairAction.PIN_AUTH;
        }
        if (i == 4) {
            return InternalPairAction.CUSTOMIZE_AUTH;
        }
        throw new NoWhenBranchMatchedException();
    }
}
