package com.oppo.store.web.bean;

import androidx.annotation.Keep;
import com.heytap.store.business.rn.service.RnConstant;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/oppo/store/web/bean/PageInterfaces;", "", RnConstant.KEY_PAGE, "", "interfaces", "", "Lcom/oppo/store/web/bean/Interface;", "(Ljava/lang/String;Ljava/util/List;)V", "getInterfaces", "()Ljava/util/List;", "getPage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class PageInterfaces {

    @Nullable
    private final List<Interface> interfaces;

    @Nullable
    private final String page;

    public PageInterfaces(@Nullable String str, @Nullable List<Interface> list) {
        this.page = str;
        this.interfaces = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PageInterfaces copy$default(PageInterfaces pageInterfaces, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pageInterfaces.page;
        }
        if ((i & 2) != 0) {
            list = pageInterfaces.interfaces;
        }
        return pageInterfaces.copy(str, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPage() {
        return this.page;
    }

    @Nullable
    public final List<Interface> component2() {
        return this.interfaces;
    }

    @NotNull
    public final PageInterfaces copy(@Nullable String page, @Nullable List<Interface> interfaces) {
        return new PageInterfaces(page, interfaces);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageInterfaces)) {
            return false;
        }
        PageInterfaces pageInterfaces = (PageInterfaces) other;
        return Intrinsics.areEqual(this.page, pageInterfaces.page) && Intrinsics.areEqual(this.interfaces, pageInterfaces.interfaces);
    }

    @Nullable
    public final List<Interface> getInterfaces() {
        return this.interfaces;
    }

    @Nullable
    public final String getPage() {
        return this.page;
    }

    public int hashCode() {
        String str = this.page;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Interface> list = this.interfaces;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PageInterfaces(page=" + this.page + ", interfaces=" + this.interfaces + ')';
    }
}
