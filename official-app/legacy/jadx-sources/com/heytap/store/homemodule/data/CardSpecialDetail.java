package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u00020\u000b8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/heytap/store/homemodule/data/CardSpecialDetail;", "", "()V", "businessDetails", "", "Lcom/heytap/store/homemodule/data/BusinessDetail;", "getBusinessDetails", "()Ljava/util/List;", "setBusinessDetails", "(Ljava/util/List;)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class CardSpecialDetail {

    @Nullable
    private List<BusinessDetail> businessDetails;

    @NotNull
    private String name = "";

    @Nullable
    public final List<BusinessDetail> getBusinessDetails() {
        return this.businessDetails;
    }

    @NotNull
    public final String getName() {
        String str = this.name;
        return str == null ? "" : str;
    }

    public final void setBusinessDetails(@Nullable List<BusinessDetail> list) {
        this.businessDetails = list;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }
}
