package com.heytap.store.product_support.data;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u0014\u0010\u001b\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u001c\u0010\u001d\u001a\u00020\u000e8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017¨\u0006 "}, d2 = {"Lcom/heytap/store/product_support/data/GoodsActivityInfoJsonBean;", "", "()V", "activityInfo", "", "getActivityInfo", "()Ljava/lang/String;", "setActivityInfo", "(Ljava/lang/String;)V", "color", "getColor", "setColor", "expandIdentityList", "", "", "getExpandIdentityList", "()Ljava/util/List;", "setExpandIdentityList", "(Ljava/util/List;)V", "level", "getLevel", "()I", "setLevel", "(I)V", "logo", "getLogo", "setLogo", "serialVersionUID", "getSerialVersionUID", "type", "getType", "setType", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class GoodsActivityInfoJsonBean {

    @Nullable
    private String activityInfo;

    @Nullable
    private List<Integer> expandIdentityList;
    private final int serialVersionUID;
    private int type;

    @Nullable
    private String logo = "";

    @Nullable
    private String color = "";
    private int level = 2;

    @Nullable
    public final String getActivityInfo() {
        return this.activityInfo;
    }

    @Nullable
    public final String getColor() {
        return this.color;
    }

    @Nullable
    public final List<Integer> getExpandIdentityList() {
        return this.expandIdentityList;
    }

    public final int getLevel() {
        return this.level;
    }

    @Nullable
    public final String getLogo() {
        return this.logo;
    }

    public final int getSerialVersionUID() {
        return this.serialVersionUID;
    }

    public final int getType() {
        if (this.type == 5) {
            List<Integer> list = this.expandIdentityList;
            boolean z = false;
            if (list != null && (list.isEmpty() ^ true)) {
                List<Integer> list2 = this.expandIdentityList;
                if (list2 != null && list2.contains(10)) {
                    z = true;
                }
                if (z) {
                    return 102;
                }
            }
        }
        return this.type;
    }

    public final void setActivityInfo(@Nullable String str) {
        this.activityInfo = str;
    }

    public final void setColor(@Nullable String str) {
        this.color = str;
    }

    public final void setExpandIdentityList(@Nullable List<Integer> list) {
        this.expandIdentityList = list;
    }

    public final void setLevel(int i) {
        this.level = i;
    }

    public final void setLogo(@Nullable String str) {
        this.logo = str;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
