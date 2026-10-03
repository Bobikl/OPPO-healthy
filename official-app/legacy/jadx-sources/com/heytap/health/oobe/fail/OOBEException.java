package com.heytap.health.oobe.fail;

import com.heytap.health.oobe.dto.OOBEFail;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/heytap/health/oobe/fail/OOBEException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "OOBEFail", "Lcom/heytap/health/oobe/dto/OOBEFail;", "(Lcom/heytap/health/oobe/dto/OOBEFail;)V", "getOOBEFail", "()Lcom/heytap/health/oobe/dto/OOBEFail;", "toString", "", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OOBEException extends RuntimeException {

    @NotNull
    private final OOBEFail OOBEFail;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OOBEException(@NotNull OOBEFail OOBEFail) {
        super(OOBEFail.getLog(), null, false, false);
        Intrinsics.checkNotNullParameter(OOBEFail, "OOBEFail");
        this.OOBEFail = OOBEFail;
    }

    @NotNull
    public final OOBEFail getOOBEFail() {
        return this.OOBEFail;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return this.OOBEFail.toString();
    }
}
