package com.heytap.store.product_support.data;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/heytap/store/product_support/data/PlaceholderLabel;", "", "()V", "activityInfo", "", "getActivityInfo", "()Ljava/lang/String;", "expandIdentityList", "", "", "getExpandIdentityList", "()Ljava/util/List;", "serialVersionUID", "getSerialVersionUID", "()I", "type", "getType", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PlaceholderLabel {

    @Nullable
    private final String activityInfo;

    @Nullable
    private final List<Integer> expandIdentityList;
    private final int serialVersionUID;
    private final int type;

    @Nullable
    public final String getActivityInfo() {
        return this.activityInfo;
    }

    @Nullable
    public final List<Integer> getExpandIdentityList() {
        return this.expandIdentityList;
    }

    public final int getSerialVersionUID() {
        return this.serialVersionUID;
    }

    public final int getType() {
        return this.type;
    }
}
