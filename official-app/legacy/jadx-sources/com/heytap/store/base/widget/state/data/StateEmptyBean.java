package com.heytap.store.base.widget.state.data;

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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0002\u0010\u000fJ\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003Jf\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0005HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010!\"\u0004\b\"\u0010#R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010!\"\u0004\b$\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0019\"\u0004\b(\u0010\u001b¨\u00067"}, d2 = {"Lcom/heytap/store/base/widget/state/data/StateEmptyBean;", "", "title", "", "iconRes", "", "btnDesc", "", "iconPath", "isSmallView", "", "scene", VideoCustomPresenter.INDEX_COLOR, "Lcom/heytap/store/base/widget/state/data/StateColorStyle;", "isFullScreenCenter", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/String;ZLjava/lang/String;Lcom/heytap/store/base/widget/state/data/StateColorStyle;Z)V", "getBtnDesc", "()Ljava/lang/CharSequence;", "setBtnDesc", "(Ljava/lang/CharSequence;)V", "getColorStyle", "()Lcom/heytap/store/base/widget/state/data/StateColorStyle;", "setColorStyle", "(Lcom/heytap/store/base/widget/state/data/StateColorStyle;)V", "getIconPath", "()Ljava/lang/String;", "setIconPath", "(Ljava/lang/String;)V", "getIconRes", "()Ljava/lang/Integer;", "setIconRes", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "()Z", "setFullScreenCenter", "(Z)V", "setSmallView", "getScene", "setScene", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/String;ZLjava/lang/String;Lcom/heytap/store/base/widget/state/data/StateColorStyle;Z)Lcom/heytap/store/base/widget/state/data/StateEmptyBean;", "equals", "other", "hashCode", "toString", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class StateEmptyBean {

    @Nullable
    private CharSequence btnDesc;

    @Nullable
    private StateColorStyle colorStyle;

    @NotNull
    private String iconPath;

    @Nullable
    private Integer iconRes;
    private boolean isFullScreenCenter;
    private boolean isSmallView;

    @Nullable
    private String scene;

    @NotNull
    private String title;

    public StateEmptyBean() {
        this(null, null, null, null, false, null, null, false, 255, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getIconRes() {
        return this.iconRes;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CharSequence getBtnDesc() {
        return this.btnDesc;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconPath() {
        return this.iconPath;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsSmallView() {
        return this.isSmallView;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getScene() {
        return this.scene;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final StateColorStyle getColorStyle() {
        return this.colorStyle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsFullScreenCenter() {
        return this.isFullScreenCenter;
    }

    @NotNull
    public final StateEmptyBean copy(@NotNull String title, @DrawableRes @Nullable Integer iconRes, @Nullable CharSequence btnDesc, @NotNull String iconPath, boolean isSmallView, @Nullable String scene, @Nullable StateColorStyle colorStyle, boolean isFullScreenCenter) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(iconPath, "iconPath");
        return new StateEmptyBean(title, iconRes, btnDesc, iconPath, isSmallView, scene, colorStyle, isFullScreenCenter);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StateEmptyBean)) {
            return false;
        }
        StateEmptyBean stateEmptyBean = (StateEmptyBean) other;
        return Intrinsics.areEqual(this.title, stateEmptyBean.title) && Intrinsics.areEqual(this.iconRes, stateEmptyBean.iconRes) && Intrinsics.areEqual(this.btnDesc, stateEmptyBean.btnDesc) && Intrinsics.areEqual(this.iconPath, stateEmptyBean.iconPath) && this.isSmallView == stateEmptyBean.isSmallView && Intrinsics.areEqual(this.scene, stateEmptyBean.scene) && Intrinsics.areEqual(this.colorStyle, stateEmptyBean.colorStyle) && this.isFullScreenCenter == stateEmptyBean.isFullScreenCenter;
    }

    @Nullable
    public final CharSequence getBtnDesc() {
        return this.btnDesc;
    }

    @Nullable
    public final StateColorStyle getColorStyle() {
        return this.colorStyle;
    }

    @NotNull
    public final String getIconPath() {
        return this.iconPath;
    }

    @Nullable
    public final Integer getIconRes() {
        return this.iconRes;
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
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        Integer num = this.iconRes;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        CharSequence charSequence = this.btnDesc;
        int iHashCode3 = (((iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + this.iconPath.hashCode()) * 31;
        boolean z = this.isSmallView;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode3 + r1) * 31;
        String str = this.scene;
        int iHashCode4 = (i + (str == null ? 0 : str.hashCode())) * 31;
        StateColorStyle stateColorStyle = this.colorStyle;
        int iHashCode5 = (iHashCode4 + (stateColorStyle != null ? stateColorStyle.hashCode() : 0)) * 31;
        boolean z2 = this.isFullScreenCenter;
        return iHashCode5 + (z2 ? 1 : z2);
    }

    public final boolean isFullScreenCenter() {
        return this.isFullScreenCenter;
    }

    public final boolean isSmallView() {
        return this.isSmallView;
    }

    public final void setBtnDesc(@Nullable CharSequence charSequence) {
        this.btnDesc = charSequence;
    }

    public final void setColorStyle(@Nullable StateColorStyle stateColorStyle) {
        this.colorStyle = stateColorStyle;
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

    public final void setScene(@Nullable String str) {
        this.scene = str;
    }

    public final void setSmallView(boolean z) {
        this.isSmallView = z;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "StateEmptyBean(title=" + this.title + ", iconRes=" + this.iconRes + ", btnDesc=" + ((Object) this.btnDesc) + ", iconPath=" + this.iconPath + ", isSmallView=" + this.isSmallView + ", scene=" + ((Object) this.scene) + ", colorStyle=" + this.colorStyle + ", isFullScreenCenter=" + this.isFullScreenCenter + ')';
    }

    public StateEmptyBean(@NotNull String title, @DrawableRes @Nullable Integer num, @Nullable CharSequence charSequence, @NotNull String iconPath, boolean z, @Nullable String str, @Nullable StateColorStyle stateColorStyle, boolean z2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(iconPath, "iconPath");
        this.title = title;
        this.iconRes = num;
        this.btnDesc = charSequence;
        this.iconPath = iconPath;
        this.isSmallView = z;
        this.scene = str;
        this.colorStyle = stateColorStyle;
        this.isFullScreenCenter = z2;
    }

    public /* synthetic */ StateEmptyBean(String str, Integer num, CharSequence charSequence, String str2, boolean z, String str3, StateColorStyle stateColorStyle, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : charSequence, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : stateColorStyle, (i & 128) != 0 ? false : z2);
    }
}
