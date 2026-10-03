package com.heytap.store.entity;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.hp6;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/heytap/store/entity/HomeConfigDateBean;", "", "()V", "componentCode", "", "getComponentCode", "()I", "setComponentCode", "(I)V", hp6.DETAIL_ENTRY, "", "Lcom/heytap/store/entity/HomeConfigDetailBean;", "getDetails", "()Ljava/util/List;", "setDetails", "(Ljava/util/List;)V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "modelCode", "getModelCode", "setModelCode", "moduleCode", "getModuleCode", "setModuleCode", "title", "getTitle", "setTitle", "datapersistence_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class HomeConfigDateBean {
    private int componentCode;

    @Nullable
    private List<HomeConfigDetailBean> details;
    private int modelCode;

    @NotNull
    private String id = "";

    @NotNull
    private String title = "";

    @NotNull
    private String moduleCode = "";

    public final int getComponentCode() {
        return this.componentCode;
    }

    @Nullable
    public final List<HomeConfigDetailBean> getDetails() {
        return this.details;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getModelCode() {
        return this.modelCode;
    }

    @NotNull
    public final String getModuleCode() {
        return this.moduleCode;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setComponentCode(int i) {
        this.componentCode = i;
    }

    public final void setDetails(@Nullable List<HomeConfigDetailBean> list) {
        this.details = list;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setModelCode(int i) {
        this.modelCode = i;
    }

    public final void setModuleCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.moduleCode = str;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }
}
