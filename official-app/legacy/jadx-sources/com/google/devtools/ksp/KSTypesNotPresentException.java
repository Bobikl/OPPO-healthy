package com.google.devtools.ksp;

import com.google.devtools.ksp.symbol.KSType;
import com.oplus.aiunit.vision.oea;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@KspExperimental
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/devtools/ksp/KSTypesNotPresentException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "ksTypes", "", "Lcom/google/devtools/ksp/symbol/KSType;", "cause", "", "(Ljava/util/List;Ljava/lang/Throwable;)V", "getKsTypes", "()Ljava/util/List;", oea.FEATURE_API_REQUEST}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KSTypesNotPresentException extends RuntimeException {

    @NotNull
    private final List<KSType> ksTypes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KSTypesNotPresentException(@NotNull List<? extends KSType> ksTypes, @NotNull Throwable cause) {
        super(cause);
        Intrinsics.checkNotNullParameter(ksTypes, "ksTypes");
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.ksTypes = ksTypes;
    }

    @NotNull
    public final List<KSType> getKsTypes() {
        return this.ksTypes;
    }
}
