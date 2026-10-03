package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.hp6;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003JP\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\bHÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018¨\u0006)"}, d2 = {"Lcom/heytap/store/homemodule/data/HomeTabData;", "", "componentCode", "", hp6.DETAIL_ENTRY, "", "Lcom/heytap/store/homemodule/data/HomeTabItemDetail;", "id", "", "modelCode", "moduleCode", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getComponentCode", "()Ljava/lang/Integer;", "setComponentCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDetails", "()Ljava/util/List;", "setDetails", "(Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getModelCode", "setModelCode", "getModuleCode", "setModuleCode", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/heytap/store/homemodule/data/HomeTabData;", "equals", "", "other", "hashCode", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class HomeTabData {

    @Nullable
    private Integer componentCode;

    @Nullable
    private List<HomeTabItemDetail> details;

    @Nullable
    private String id;

    @Nullable
    private Integer modelCode;

    @Nullable
    private String moduleCode;

    public HomeTabData(@Nullable Integer num, @Nullable List<HomeTabItemDetail> list, @Nullable String str, @Nullable Integer num2, @Nullable String str2) {
        this.componentCode = num;
        this.details = list;
        this.id = str;
        this.modelCode = num2;
        this.moduleCode = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeTabData copy$default(HomeTabData homeTabData, Integer num, List list, String str, Integer num2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = homeTabData.componentCode;
        }
        if ((i & 2) != 0) {
            list = homeTabData.details;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            str = homeTabData.id;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            num2 = homeTabData.modelCode;
        }
        Integer num3 = num2;
        if ((i & 16) != 0) {
            str2 = homeTabData.moduleCode;
        }
        return homeTabData.copy(num, list2, str3, num3, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getComponentCode() {
        return this.componentCode;
    }

    @Nullable
    public final List<HomeTabItemDetail> component2() {
        return this.details;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getModelCode() {
        return this.modelCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getModuleCode() {
        return this.moduleCode;
    }

    @NotNull
    public final HomeTabData copy(@Nullable Integer componentCode, @Nullable List<HomeTabItemDetail> details, @Nullable String id, @Nullable Integer modelCode, @Nullable String moduleCode) {
        return new HomeTabData(componentCode, details, id, modelCode, moduleCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeTabData)) {
            return false;
        }
        HomeTabData homeTabData = (HomeTabData) other;
        return Intrinsics.areEqual(this.componentCode, homeTabData.componentCode) && Intrinsics.areEqual(this.details, homeTabData.details) && Intrinsics.areEqual(this.id, homeTabData.id) && Intrinsics.areEqual(this.modelCode, homeTabData.modelCode) && Intrinsics.areEqual(this.moduleCode, homeTabData.moduleCode);
    }

    @Nullable
    public final Integer getComponentCode() {
        return this.componentCode;
    }

    @Nullable
    public final List<HomeTabItemDetail> getDetails() {
        return this.details;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Integer getModelCode() {
        return this.modelCode;
    }

    @Nullable
    public final String getModuleCode() {
        return this.moduleCode;
    }

    public int hashCode() {
        Integer num = this.componentCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<HomeTabItemDetail> list = this.details;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.id;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.modelCode;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.moduleCode;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setComponentCode(@Nullable Integer num) {
        this.componentCode = num;
    }

    public final void setDetails(@Nullable List<HomeTabItemDetail> list) {
        this.details = list;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setModelCode(@Nullable Integer num) {
        this.modelCode = num;
    }

    public final void setModuleCode(@Nullable String str) {
        this.moduleCode = str;
    }

    @NotNull
    public String toString() {
        return "HomeTabData(componentCode=" + this.componentCode + ", details=" + this.details + ", id=" + ((Object) this.id) + ", modelCode=" + this.modelCode + ", moduleCode=" + ((Object) this.moduleCode) + ')';
    }
}
