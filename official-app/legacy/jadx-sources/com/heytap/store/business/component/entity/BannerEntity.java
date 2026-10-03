package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.hp6;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\b¨\u0006\""}, d2 = {"Lcom/heytap/store/business/component/entity/BannerEntity;", "", "()V", "backgroundColor", "", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", "backgroundPic", "getBackgroundPic", "setBackgroundPic", "currentFirstPosition", "", "getCurrentFirstPosition", "()I", "setCurrentFirstPosition", "(I)V", hp6.DETAIL_ENTRY, "", "Lcom/heytap/store/business/component/entity/BannerDetail;", "getDetails", "()Ljava/util/List;", "setDetails", "(Ljava/util/List;)V", "headerInfo", "Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;", "getHeaderInfo", "()Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;", "setHeaderInfo", "(Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;)V", "title", "getTitle", "setTitle", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class BannerEntity {

    @Nullable
    private String backgroundColor;

    @Nullable
    private String backgroundPic;
    private int currentFirstPosition = -1;

    @Nullable
    private List<BannerDetail> details;

    @Nullable
    private OStoreHeaderInfo headerInfo;

    @Nullable
    private String title;

    @Nullable
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final String getBackgroundPic() {
        return this.backgroundPic;
    }

    public final int getCurrentFirstPosition() {
        return this.currentFirstPosition;
    }

    @Nullable
    public final List<BannerDetail> getDetails() {
        return this.details;
    }

    @Nullable
    public final OStoreHeaderInfo getHeaderInfo() {
        return this.headerInfo;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setBackgroundColor(@Nullable String str) {
        this.backgroundColor = str;
    }

    public final void setBackgroundPic(@Nullable String str) {
        this.backgroundPic = str;
    }

    public final void setCurrentFirstPosition(int i) {
        this.currentFirstPosition = i;
    }

    public final void setDetails(@Nullable List<BannerDetail> list) {
        this.details = list;
    }

    public final void setHeaderInfo(@Nullable OStoreHeaderInfo oStoreHeaderInfo) {
        this.headerInfo = oStoreHeaderInfo;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
