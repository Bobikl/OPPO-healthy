package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010)\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0006R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0006R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010#\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\u001a\u0010&\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0006\"\u0004\b(\u0010\b¨\u0006+"}, d2 = {"Lcom/heytap/store/homemodule/data/HomeTabItemBean;", "", "()V", "columnColor", "", "getColumnColor", "()Ljava/lang/String;", "setColumnColor", "(Ljava/lang/String;)V", "<set-?>", "", "contentType", "getContentType", "()I", "imageUrl", "getImageUrl", "setImageUrl", "isUseFilterColor", "", "()Z", "setUseFilterColor", "(Z)V", "link", "getLink", "name", "getName", "nativePageId", "getNativePageId", "setNativePageId", "navigateStyle", "getNavigateStyle", "()Ljava/lang/Integer;", "setNavigateStyle", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "navigateThemePic", "getNavigateThemePic", "setNavigateThemePic", "selectImageUrl", "getSelectImageUrl", "setSelectImageUrl", "toString", "Companion", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HomeTabItemBean {
    public static final int CONTENT_TYPE_ERROR = -1;
    public static final int CONTENT_TYPE_H5 = 2;
    public static final int CONTENT_TYPE_MAIN = 3;
    public static final int CONTENT_TYPE_NATIVE = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String columnColor;
    private int contentType;

    @NotNull
    private String imageUrl;
    private boolean isUseFilterColor;

    @Nullable
    private String link;

    @Nullable
    private String name;

    @Nullable
    private String nativePageId;

    @Nullable
    private Integer navigateStyle;

    @Nullable
    private String navigateThemePic;

    @NotNull
    private String selectImageUrl;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/heytap/store/homemodule/data/HomeTabItemBean$Companion;", "", "()V", "CONTENT_TYPE_ERROR", "", "CONTENT_TYPE_H5", "CONTENT_TYPE_MAIN", "CONTENT_TYPE_NATIVE", "createMainItemTab", "Lcom/heytap/store/homemodule/data/HomeTabItemBean;", "fromHomeTabItemDetail", "item", "Lcom/heytap/store/homemodule/data/HomeTabItemDetail;", "getContentTypeFromLink", "link", "", "homeTabItemDetail2TabItemBean", "", "items", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final HomeTabItemBean fromHomeTabItemDetail(HomeTabItemDetail item) {
            HomeTabItemBean homeTabItemBean = new HomeTabItemBean(null);
            homeTabItemBean.name = item.getTitle();
            String nativePageId = item.getNativePageId();
            if (nativePageId == null) {
                nativePageId = "";
            }
            homeTabItemBean.setNativePageId(nativePageId);
            String picSvg = item.getPicSvg();
            if (picSvg == null) {
                picSvg = "";
            }
            homeTabItemBean.setImageUrl(picSvg);
            String picSelectSvg = item.getPicSelectSvg();
            if (picSelectSvg == null) {
                picSelectSvg = "";
            }
            homeTabItemBean.setSelectImageUrl(picSelectSvg);
            homeTabItemBean.setUseFilterColor(item.getPicStyle() != 1);
            String link = item.getLink();
            homeTabItemBean.link = link != null ? link : "";
            Integer navigationType = item.getNavigationType();
            homeTabItemBean.contentType = navigationType == null ? getContentTypeFromLink(homeTabItemBean.getLink()) : navigationType.intValue();
            homeTabItemBean.setColumnColor(item.getColumnColor());
            homeTabItemBean.setNavigateStyle(item.getNavigateStyle());
            homeTabItemBean.setNavigateThemePic(item.getNavigateThemePic());
            return homeTabItemBean;
        }

        private final int getContentTypeFromLink(String link) {
            if (link == null) {
                return -1;
            }
            if (link.length() == 0) {
                return -1;
            }
            return StringsKt__StringsJVMKt.startsWith$default(link, "http", false, 2, null) ? 2 : 1;
        }

        @NotNull
        public final HomeTabItemBean createMainItemTab() {
            HomeTabItemBean homeTabItemBean = new HomeTabItemBean(null);
            homeTabItemBean.name = "推荐";
            homeTabItemBean.setImageUrl("");
            homeTabItemBean.setNavigateStyle(2);
            homeTabItemBean.setColumnColor("#FFFFFF");
            homeTabItemBean.setNativePageId("200");
            homeTabItemBean.contentType = 1;
            return homeTabItemBean;
        }

        @NotNull
        public final List<HomeTabItemBean> homeTabItemDetail2TabItemBean(@NotNull List<HomeTabItemDetail> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            ArrayList arrayList = new ArrayList();
            Iterator<HomeTabItemDetail> it = items.iterator();
            while (it.hasNext()) {
                HomeTabItemBean homeTabItemBeanFromHomeTabItemDetail = fromHomeTabItemDetail(it.next());
                if (homeTabItemBeanFromHomeTabItemDetail.getContentType() != -1) {
                    arrayList.add(homeTabItemBeanFromHomeTabItemDetail);
                }
            }
            return arrayList;
        }
    }

    public /* synthetic */ HomeTabItemBean(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public final String getColumnColor() {
        return this.columnColor;
    }

    public final int getContentType() {
        return this.contentType;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getNativePageId() {
        return this.nativePageId;
    }

    @Nullable
    public final Integer getNavigateStyle() {
        return this.navigateStyle;
    }

    @Nullable
    public final String getNavigateThemePic() {
        return this.navigateThemePic;
    }

    @NotNull
    public final String getSelectImageUrl() {
        return this.selectImageUrl;
    }

    /* JADX INFO: renamed from: isUseFilterColor, reason: from getter */
    public final boolean getIsUseFilterColor() {
        return this.isUseFilterColor;
    }

    public final void setColumnColor(@Nullable String str) {
        this.columnColor = str;
    }

    public final void setImageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageUrl = str;
    }

    public final void setNativePageId(@Nullable String str) {
        this.nativePageId = str;
    }

    public final void setNavigateStyle(@Nullable Integer num) {
        this.navigateStyle = num;
    }

    public final void setNavigateThemePic(@Nullable String str) {
        this.navigateThemePic = str;
    }

    public final void setSelectImageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selectImageUrl = str;
    }

    public final void setUseFilterColor(boolean z) {
        this.isUseFilterColor = z;
    }

    @NotNull
    public String toString() {
        return "TabItemBean{name='" + ((Object) this.name) + "', columnColor=" + ((Object) this.columnColor) + ", nativePageId=" + ((Object) this.nativePageId) + ", contentType=" + this.contentType + ", link='" + ((Object) this.link) + "', imageUrl=" + this.imageUrl + ", navigateStyle=" + this.navigateStyle + ", navigateThemePic=" + ((Object) this.navigateThemePic) + '}';
    }

    private HomeTabItemBean() {
        this.columnColor = "";
        this.nativePageId = "";
        this.imageUrl = "";
        this.selectImageUrl = "";
        this.isUseFilterColor = true;
        this.navigateStyle = 1;
        this.navigateThemePic = "";
    }
}
