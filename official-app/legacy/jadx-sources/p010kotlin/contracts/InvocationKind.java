package p010kotlin.contracts;

import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.SinceKotlin;
import p010kotlin.enums.EnumEntries;
import p010kotlin.enums.EnumEntriesKt;
import p010kotlin.internal.ContractsDsl;

/* JADX INFO: loaded from: classes10.dex */
@SinceKotlin(version = "1.3")
@ContractsDsl
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/contracts/InvocationKind;", "", "(Ljava/lang/String;I)V", "AT_MOST_ONCE", "AT_LEAST_ONCE", "EXACTLY_ONCE", LanConstants.OPERATOR_UNKNOWN, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalContracts
public enum InvocationKind {
    AT_MOST_ONCE,
    AT_LEAST_ONCE,
    EXACTLY_ONCE,
    UNKNOWN;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<InvocationKind> getEntries() {
        return $ENTRIES;
    }
}
