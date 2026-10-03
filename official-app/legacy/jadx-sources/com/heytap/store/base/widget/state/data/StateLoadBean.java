package com.heytap.store.base.widget.state.data;

import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.Keep;
import com.heytap.health.watchface.business.creation.category.video.VideoCustomPresenter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\t\u0010/\u001a\u00020\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00103\u001a\u00020\u000eHÆ\u0003Jf\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\u000e2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0003HÖ\u0001J\t\u00109\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001b¨\u0006:"}, d2 = {"Lcom/heytap/store/base/widget/state/data/StateLoadBean;", "", "loadStyle", "", "title", "", "iconRes", "iconPath", "scene", VideoCustomPresenter.INDEX_COLOR, "Lcom/heytap/store/base/widget/state/data/StateColorStyle;", "customView", "Landroid/view/View;", "isFullScreenCenter", "", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/store/base/widget/state/data/StateColorStyle;Landroid/view/View;Z)V", "getColorStyle", "()Lcom/heytap/store/base/widget/state/data/StateColorStyle;", "setColorStyle", "(Lcom/heytap/store/base/widget/state/data/StateColorStyle;)V", "getCustomView", "()Landroid/view/View;", "setCustomView", "(Landroid/view/View;)V", "getIconPath", "()Ljava/lang/String;", "setIconPath", "(Ljava/lang/String;)V", "getIconRes", "()Ljava/lang/Integer;", "setIconRes", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "()Z", "setFullScreenCenter", "(Z)V", "getLoadStyle", "()I", "setLoadStyle", "(I)V", "getScene", "setScene", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/store/base/widget/state/data/StateColorStyle;Landroid/view/View;Z)Lcom/heytap/store/base/widget/state/data/StateLoadBean;", "equals", "other", "hashCode", "toString", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class StateLoadBean {

    @Nullable
    private StateColorStyle colorStyle;

    @Nullable
    private View customView;

    @NotNull
    private String iconPath;

    @Nullable
    private Integer iconRes;
    private boolean isFullScreenCenter;
    private int loadStyle;

    @Nullable
    private String scene;

    @NotNull
    private String title;

    public StateLoadBean() {
        this(0, null, null, null, null, null, null, false, 255, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLoadStyle() {
        return this.loadStyle;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getIconRes() {
        return this.iconRes;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconPath() {
        return this.iconPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getScene() {
        return this.scene;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final StateColorStyle getColorStyle() {
        return this.colorStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final View getCustomView() {
        return this.customView;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsFullScreenCenter() {
        return this.isFullScreenCenter;
    }

    @NotNull
    public final StateLoadBean copy(int loadStyle, @NotNull String title, @DrawableRes @Nullable Integer iconRes, @NotNull String iconPath, @Nullable String scene, @Nullable StateColorStyle colorStyle, @Nullable View customView, boolean isFullScreenCenter) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(iconPath, "iconPath");
        return new StateLoadBean(loadStyle, title, iconRes, iconPath, scene, colorStyle, customView, isFullScreenCenter);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StateLoadBean)) {
            return false;
        }
        StateLoadBean stateLoadBean = (StateLoadBean) other;
        return this.loadStyle == stateLoadBean.loadStyle && Intrinsics.areEqual(this.title, stateLoadBean.title) && Intrinsics.areEqual(this.iconRes, stateLoadBean.iconRes) && Intrinsics.areEqual(this.iconPath, stateLoadBean.iconPath) && Intrinsics.areEqual(this.scene, stateLoadBean.scene) && Intrinsics.areEqual(this.colorStyle, stateLoadBean.colorStyle) && Intrinsics.areEqual(this.customView, stateLoadBean.customView) && this.isFullScreenCenter == stateLoadBean.isFullScreenCenter;
    }

    @Nullable
    public final StateColorStyle getColorStyle() {
        return this.colorStyle;
    }

    @Nullable
    public final View getCustomView() {
        return this.customView;
    }

    @NotNull
    public final String getIconPath() {
        return this.iconPath;
    }

    @Nullable
    public final Integer getIconRes() {
        return this.iconRes;
    }

    public final int getLoadStyle() {
        return this.loadStyle;
    }

    @Nullable
    public final String getScene() {
        return this.scene;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.loadStyle) * 31) + this.title.hashCode()) * 31;
        Integer num = this.iconRes;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.iconPath.hashCode()) * 31;
        String str = this.scene;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        StateColorStyle stateColorStyle = this.colorStyle;
        int iHashCode4 = (iHashCode3 + (stateColorStyle == null ? 0 : stateColorStyle.hashCode())) * 31;
        View view = this.customView;
        int iHashCode5 = (iHashCode4 + (view != null ? view.hashCode() : 0)) * 31;
        boolean z = this.isFullScreenCenter;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return iHashCode5 + r3;
    }

    public final boolean isFullScreenCenter() {
        return this.isFullScreenCenter;
    }

    public final void setColorStyle(@Nullable StateColorStyle stateColorStyle) {
        this.colorStyle = stateColorStyle;
    }

    public final void setCustomView(@Nullable View view) {
        this.customView = view;
    }

    public final void setFullScreenCenter(boolean z) {
        this.isFullScreenCenter = z;
    }

    public final void setIconPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.iconPath = str;
    }

    public final void setIconRes(@Nullable Integer num) {
        this.iconRes = num;
    }

    public final void setLoadStyle(int i) {
        this.loadStyle = i;
    }

    public final void setScene(@Nullable String str) {
        this.scene = str;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "StateLoadBean(loadStyle=" + this.loadStyle + ", title=" + this.title + ", iconRes=" + this.iconRes + ", iconPath=" + this.iconPath + ", scene=" + ((Object) this.scene) + ", colorStyle=" + this.colorStyle + ", customView=" + this.customView + ", isFullScreenCenter=" + this.isFullScreenCenter + ')';
    }

    public StateLoadBean(int i, @NotNull String title, @DrawableRes @Nullable Integer num, @NotNull String iconPath, @Nullable String str, @Nullable StateColorStyle stateColorStyle, @Nullable View view, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(iconPath, "iconPath");
        this.loadStyle = i;
        this.title = title;
        this.iconRes = num;
        this.iconPath = iconPath;
        this.scene = str;
        this.colorStyle = stateColorStyle;
        this.customView = view;
        this.isFullScreenCenter = z;
    }

    public /* synthetic */ StateLoadBean(int i, String str, Integer num, String str2, String str3, StateColorStyle stateColorStyle, View view, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : num, (i2 & 8) == 0 ? str2 : "", (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : stateColorStyle, (i2 & 64) == 0 ? view : null, (i2 & 128) != 0 ? false : z);
    }
}
