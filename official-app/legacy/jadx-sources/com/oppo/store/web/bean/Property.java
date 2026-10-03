package com.oppo.store.web.bean;

import androidx.annotation.Keep;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.y04;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u0013Jt\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\rHÖ\u0001J\t\u0010*\u001a\u00020\u000bHÖ\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0015\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0016\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0017\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0018\u0010\u0010R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u001b\u0010\u0010¨\u0006+"}, d2 = {"Lcom/oppo/store/web/bean/Property;", "", Fields.WIDTH_FIELD, "", Fields.HEIGHT_FIELD, y04.TIME_STYLE_LEFT_DIR_NAME, "top", y04.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "urlList", "", "", "defaultSelectIndex", "", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/util/List;Ljava/lang/Integer;)V", "getBottom", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getDefaultSelectIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeight", "getLeft", "getRight", "getTop", "getUrlList", "()Ljava/util/List;", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/util/List;Ljava/lang/Integer;)Lcom/oppo/store/web/bean/Property;", "equals", "", "other", "hashCode", "toString", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class Property {

    @Nullable
    private final Float bottom;

    @Nullable
    private final Integer defaultSelectIndex;

    @Nullable
    private final Float height;

    @Nullable
    private final Float left;

    @Nullable
    private final Float right;

    @Nullable
    private final Float top;

    @Nullable
    private final List<String> urlList;

    @Nullable
    private final Float width;

    public Property(@Nullable Float f, @Nullable Float f2, @Nullable Float f3, @Nullable Float f4, @Nullable Float f5, @Nullable Float f6, @Nullable List<String> list, @Nullable Integer num) {
        this.width = f;
        this.height = f2;
        this.left = f3;
        this.top = f4;
        this.right = f5;
        this.bottom = f6;
        this.urlList = list;
        this.defaultSelectIndex = num;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float getWidth() {
        return this.width;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float getHeight() {
        return this.height;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getLeft() {
        return this.left;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float getTop() {
        return this.top;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Float getRight() {
        return this.right;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Float getBottom() {
        return this.bottom;
    }

    @Nullable
    public final List<String> component7() {
        return this.urlList;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getDefaultSelectIndex() {
        return this.defaultSelectIndex;
    }

    @NotNull
    public final Property copy(@Nullable Float width, @Nullable Float height, @Nullable Float left, @Nullable Float top, @Nullable Float right, @Nullable Float bottom, @Nullable List<String> urlList, @Nullable Integer defaultSelectIndex) {
        return new Property(width, height, left, top, right, bottom, urlList, defaultSelectIndex);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Property)) {
            return false;
        }
        Property property = (Property) other;
        return Intrinsics.areEqual((Object) this.width, (Object) property.width) && Intrinsics.areEqual((Object) this.height, (Object) property.height) && Intrinsics.areEqual((Object) this.left, (Object) property.left) && Intrinsics.areEqual((Object) this.top, (Object) property.top) && Intrinsics.areEqual((Object) this.right, (Object) property.right) && Intrinsics.areEqual((Object) this.bottom, (Object) property.bottom) && Intrinsics.areEqual(this.urlList, property.urlList) && Intrinsics.areEqual(this.defaultSelectIndex, property.defaultSelectIndex);
    }

    @Nullable
    public final Float getBottom() {
        return this.bottom;
    }

    @Nullable
    public final Integer getDefaultSelectIndex() {
        return this.defaultSelectIndex;
    }

    @Nullable
    public final Float getHeight() {
        return this.height;
    }

    @Nullable
    public final Float getLeft() {
        return this.left;
    }

    @Nullable
    public final Float getRight() {
        return this.right;
    }

    @Nullable
    public final Float getTop() {
        return this.top;
    }

    @Nullable
    public final List<String> getUrlList() {
        return this.urlList;
    }

    @Nullable
    public final Float getWidth() {
        return this.width;
    }

    public int hashCode() {
        Float f = this.width;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.height;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.left;
        int iHashCode3 = (iHashCode2 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.top;
        int iHashCode4 = (iHashCode3 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.right;
        int iHashCode5 = (iHashCode4 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Float f6 = this.bottom;
        int iHashCode6 = (iHashCode5 + (f6 == null ? 0 : f6.hashCode())) * 31;
        List<String> list = this.urlList;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.defaultSelectIndex;
        return iHashCode7 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Property(width=" + this.width + ", height=" + this.height + ", left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", urlList=" + this.urlList + ", defaultSelectIndex=" + this.defaultSelectIndex + ')';
    }

    public /* synthetic */ Property(Float f, Float f2, Float f3, Float f4, Float f5, Float f6, List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, (i & 4) != 0 ? null : f3, (i & 8) != 0 ? null : f4, (i & 16) != 0 ? null : f5, (i & 32) != 0 ? null : f6, list, num);
    }
}
