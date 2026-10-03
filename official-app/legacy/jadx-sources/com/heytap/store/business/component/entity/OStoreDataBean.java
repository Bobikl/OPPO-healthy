package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.hp6;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u00020\u001d8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/heytap/store/business/component/entity/OStoreDataBean;", "", "()V", hp6.DETAIL_ENTRY, "", "Lcom/heytap/store/business/component/entity/OStoreItemDetail;", "getDetails", "()Ljava/util/List;", "setDetails", "(Ljava/util/List;)V", "headerInfo", "Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;", "getHeaderInfo", "()Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;", "setHeaderInfo", "(Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;)V", "id", "", "getId", "()I", "setId", "(I)V", "styleInfo", "Lcom/heytap/store/business/component/entity/OStoreItemStyleInfo;", "getStyleInfo", "()Lcom/heytap/store/business/component/entity/OStoreItemStyleInfo;", "setStyleInfo", "(Lcom/heytap/store/business/component/entity/OStoreItemStyleInfo;)V", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OStoreDataBean {

    @Nullable
    private List<OStoreItemDetail> details;

    @Nullable
    private OStoreHeaderInfo headerInfo;
    private int id;

    @Nullable
    private OStoreItemStyleInfo styleInfo;

    @NotNull
    private String title = "";

    @Nullable
    public final List<OStoreItemDetail> getDetails() {
        return this.details;
    }

    @Nullable
    public final OStoreHeaderInfo getHeaderInfo() {
        return this.headerInfo;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final OStoreItemStyleInfo getStyleInfo() {
        return this.styleInfo;
    }

    @NotNull
    public final String getTitle() {
        String str = this.title;
        return str == null ? "" : str;
    }

    public final void setDetails(@Nullable List<OStoreItemDetail> list) {
        this.details = list;
    }

    public final void setHeaderInfo(@Nullable OStoreHeaderInfo oStoreHeaderInfo) {
        this.headerInfo = oStoreHeaderInfo;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setStyleInfo(@Nullable OStoreItemStyleInfo oStoreItemStyleInfo) {
        this.styleInfo = oStoreItemStyleInfo;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }
}
