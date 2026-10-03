package com.heytap.store.base.widget.state.data;

import androidx.annotation.DrawableRes;
import androidx.annotation.Keep;
import com.heytap.health.watchface.business.creation.category.video.VideoCustomPresenter;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bD\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000e¢\u0006\u0002\u0010\u0017J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010/J\u000b\u0010E\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010/J\u000b\u0010G\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u000eHÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010K\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nHÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010P\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010Q\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010/JÄ\u0001\u0010R\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010SJ\u0013\u0010T\u001a\u00020\u000e2\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010V\u001a\u00020\u0005HÖ\u0001J\t\u0010W\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0015\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b-\u0010%\"\u0004\b.\u0010'R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b\u0012\u0010/\"\u0004\b0\u00101R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b\r\u0010/\"\u0004\b3\u00101R\u001a\u0010\u0016\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u00104\"\u0004\b5\u00106R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b\u000f\u0010/\"\u0004\b7\u00101R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b\u0010\u0010/\"\u0004\b8\u00101R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b9\u0010%\"\u0004\b:\u0010'R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010*\"\u0004\b@\u0010,R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0019\"\u0004\bB\u0010\u001b¨\u0006X"}, d2 = {"Lcom/heytap/store/base/widget/state/data/StateErrorBean;", "", "title", "", "iconRes", "", "iconPath", "", "btnDesc", "recommendArray", "", "placeRes", "failRes", "isFile", "", "isNeedSceneConfig", "isSmallView", "scene", "isCustomData", VideoCustomPresenter.INDEX_COLOR, "Lcom/heytap/store/base/widget/state/data/StateColorStyle;", "errorType", "isFullScreenCenter", "(Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/heytap/store/base/widget/state/data/StateColorStyle;IZ)V", "getBtnDesc", "()Ljava/lang/CharSequence;", "setBtnDesc", "(Ljava/lang/CharSequence;)V", "getColorStyle", "()Lcom/heytap/store/base/widget/state/data/StateColorStyle;", "setColorStyle", "(Lcom/heytap/store/base/widget/state/data/StateColorStyle;)V", "getErrorType", "()I", "setErrorType", "(I)V", "getFailRes", "()Ljava/lang/Integer;", "setFailRes", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getIconPath", "()Ljava/lang/String;", "setIconPath", "(Ljava/lang/String;)V", "getIconRes", "setIconRes", "()Ljava/lang/Boolean;", "setCustomData", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setFile", "()Z", "setFullScreenCenter", "(Z)V", "setNeedSceneConfig", "setSmallView", "getPlaceRes", "setPlaceRes", "getRecommendArray", "()Ljava/util/List;", "setRecommendArray", "(Ljava/util/List;)V", "getScene", "setScene", "getTitle", "setTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/heytap/store/base/widget/state/data/StateColorStyle;IZ)Lcom/heytap/store/base/widget/state/data/StateErrorBean;", "equals", "other", "hashCode", "toString", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class StateErrorBean {

    @Nullable
    private CharSequence btnDesc;

    @Nullable
    private StateColorStyle colorStyle;
    private int errorType;

    @Nullable
    private Integer failRes;

    @Nullable
    private String iconPath;

    @Nullable
    private Integer iconRes;

    @Nullable
    private Boolean isCustomData;

    @Nullable
    private Boolean isFile;
    private boolean isFullScreenCenter;

    @Nullable
    private Boolean isNeedSceneConfig;

    @Nullable
    private Boolean isSmallView;

    @Nullable
    private Integer placeRes;

    @Nullable
    private List<String> recommendArray;

    @Nullable
    private String scene;

    @Nullable
    private CharSequence title;

    public StateErrorBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, 32767, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CharSequence getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getIsSmallView() {
        return this.isSmallView;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getScene() {
        return this.scene;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getIsCustomData() {
        return this.isCustomData;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final StateColorStyle getColorStyle() {
        return this.colorStyle;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getErrorType() {
        return this.errorType;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getIsFullScreenCenter() {
        return this.isFullScreenCenter;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getIconRes() {
        return this.iconRes;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconPath() {
        return this.iconPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CharSequence getBtnDesc() {
        return this.btnDesc;
    }

    @Nullable
    public final List<String> component5() {
        return this.recommendArray;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getPlaceRes() {
        return this.placeRes;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getFailRes() {
        return this.failRes;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getIsFile() {
        return this.isFile;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsNeedSceneConfig() {
        return this.isNeedSceneConfig;
    }

    @NotNull
    public final StateErrorBean copy(@Nullable CharSequence title, @DrawableRes @Nullable Integer iconRes, @Nullable String iconPath, @Nullable CharSequence btnDesc, @Nullable List<String> recommendArray, @DrawableRes @Nullable Integer placeRes, @DrawableRes @Nullable Integer failRes, @Nullable Boolean isFile, @Nullable Boolean isNeedSceneConfig, @Nullable Boolean isSmallView, @Nullable String scene, @Nullable Boolean isCustomData, @Nullable StateColorStyle colorStyle, int errorType, boolean isFullScreenCenter) {
        return new StateErrorBean(title, iconRes, iconPath, btnDesc, recommendArray, placeRes, failRes, isFile, isNeedSceneConfig, isSmallView, scene, isCustomData, colorStyle, errorType, isFullScreenCenter);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StateErrorBean)) {
            return false;
        }
        StateErrorBean stateErrorBean = (StateErrorBean) other;
        return Intrinsics.areEqual(this.title, stateErrorBean.title) && Intrinsics.areEqual(this.iconRes, stateErrorBean.iconRes) && Intrinsics.areEqual(this.iconPath, stateErrorBean.iconPath) && Intrinsics.areEqual(this.btnDesc, stateErrorBean.btnDesc) && Intrinsics.areEqual(this.recommendArray, stateErrorBean.recommendArray) && Intrinsics.areEqual(this.placeRes, stateErrorBean.placeRes) && Intrinsics.areEqual(this.failRes, stateErrorBean.failRes) && Intrinsics.areEqual(this.isFile, stateErrorBean.isFile) && Intrinsics.areEqual(this.isNeedSceneConfig, stateErrorBean.isNeedSceneConfig) && Intrinsics.areEqual(this.isSmallView, stateErrorBean.isSmallView) && Intrinsics.areEqual(this.scene, stateErrorBean.scene) && Intrinsics.areEqual(this.isCustomData, stateErrorBean.isCustomData) && Intrinsics.areEqual(this.colorStyle, stateErrorBean.colorStyle) && this.errorType == stateErrorBean.errorType && this.isFullScreenCenter == stateErrorBean.isFullScreenCenter;
    }

    @Nullable
    public final CharSequence getBtnDesc() {
        return this.btnDesc;
    }

    @Nullable
    public final StateColorStyle getColorStyle() {
        return this.colorStyle;
    }

    public final int getErrorType() {
        return this.errorType;
    }

    @Nullable
    public final Integer getFailRes() {
        return this.failRes;
    }

    @Nullable
    public final String getIconPath() {
        return this.iconPath;
    }

    @Nullable
    public final Integer getIconRes() {
        return this.iconRes;
    }

    @Nullable
    public final Integer getPlaceRes() {
        return this.placeRes;
    }

    @Nullable
    public final List<String> getRecommendArray() {
        return this.recommendArray;
    }

    @Nullable
    public final String getScene() {
        return this.scene;
    }

    @Nullable
    public final CharSequence getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        CharSequence charSequence = this.title;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        Integer num = this.iconRes;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.iconPath;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence2 = this.btnDesc;
        int iHashCode4 = (iHashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        List<String> list = this.recommendArray;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.placeRes;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.failRes;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.isFile;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isNeedSceneConfig;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isSmallView;
        int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.scene;
        int iHashCode11 = (iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool4 = this.isCustomData;
        int iHashCode12 = (iHashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        StateColorStyle stateColorStyle = this.colorStyle;
        int iHashCode13 = (((iHashCode12 + (stateColorStyle != null ? stateColorStyle.hashCode() : 0)) * 31) + Integer.hashCode(this.errorType)) * 31;
        boolean z = this.isFullScreenCenter;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return iHashCode13 + r3;
    }

    @Nullable
    public final Boolean isCustomData() {
        return this.isCustomData;
    }

    @Nullable
    public final Boolean isFile() {
        return this.isFile;
    }

    public final boolean isFullScreenCenter() {
        return this.isFullScreenCenter;
    }

    @Nullable
    public final Boolean isNeedSceneConfig() {
        return this.isNeedSceneConfig;
    }

    @Nullable
    public final Boolean isSmallView() {
        return this.isSmallView;
    }

    public final void setBtnDesc(@Nullable CharSequence charSequence) {
        this.btnDesc = charSequence;
    }

    public final void setColorStyle(@Nullable StateColorStyle stateColorStyle) {
        this.colorStyle = stateColorStyle;
    }

    public final void setCustomData(@Nullable Boolean bool) {
        this.isCustomData = bool;
    }

    public final void setErrorType(int i) {
        this.errorType = i;
    }

    public final void setFailRes(@Nullable Integer num) {
        this.failRes = num;
    }

    public final void setFile(@Nullable Boolean bool) {
        this.isFile = bool;
    }

    public final void setFullScreenCenter(boolean z) {
        this.isFullScreenCenter = z;
    }

    public final void setIconPath(@Nullable String str) {
        this.iconPath = str;
    }

    public final void setIconRes(@Nullable Integer num) {
        this.iconRes = num;
    }

    public final void setNeedSceneConfig(@Nullable Boolean bool) {
        this.isNeedSceneConfig = bool;
    }

    public final void setPlaceRes(@Nullable Integer num) {
        this.placeRes = num;
    }

    public final void setRecommendArray(@Nullable List<String> list) {
        this.recommendArray = list;
    }

    public final void setScene(@Nullable String str) {
        this.scene = str;
    }

    public final void setSmallView(@Nullable Boolean bool) {
        this.isSmallView = bool;
    }

    public final void setTitle(@Nullable CharSequence charSequence) {
        this.title = charSequence;
    }

    @NotNull
    public String toString() {
        return "StateErrorBean(title=" + ((Object) this.title) + ", iconRes=" + this.iconRes + ", iconPath=" + ((Object) this.iconPath) + ", btnDesc=" + ((Object) this.btnDesc) + ", recommendArray=" + this.recommendArray + ", placeRes=" + this.placeRes + ", failRes=" + this.failRes + ", isFile=" + this.isFile + ", isNeedSceneConfig=" + this.isNeedSceneConfig + ", isSmallView=" + this.isSmallView + ", scene=" + ((Object) this.scene) + ", isCustomData=" + this.isCustomData + ", colorStyle=" + this.colorStyle + ", errorType=" + this.errorType + ", isFullScreenCenter=" + this.isFullScreenCenter + ')';
    }

    public StateErrorBean(@Nullable CharSequence charSequence, @DrawableRes @Nullable Integer num, @Nullable String str, @Nullable CharSequence charSequence2, @Nullable List<String> list, @DrawableRes @Nullable Integer num2, @DrawableRes @Nullable Integer num3, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str2, @Nullable Boolean bool4, @Nullable StateColorStyle stateColorStyle, int i, boolean z) {
        this.title = charSequence;
        this.iconRes = num;
        this.iconPath = str;
        this.btnDesc = charSequence2;
        this.recommendArray = list;
        this.placeRes = num2;
        this.failRes = num3;
        this.isFile = bool;
        this.isNeedSceneConfig = bool2;
        this.isSmallView = bool3;
        this.scene = str2;
        this.isCustomData = bool4;
        this.colorStyle = stateColorStyle;
        this.errorType = i;
        this.isFullScreenCenter = z;
    }

    public /* synthetic */ StateErrorBean(CharSequence charSequence, Integer num, String str, CharSequence charSequence2, List list, Integer num2, Integer num3, Boolean bool, Boolean bool2, Boolean bool3, String str2, Boolean bool4, StateColorStyle stateColorStyle, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : charSequence, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? null : charSequence2, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : num2, (i2 & 64) != 0 ? null : num3, (i2 & 128) != 0 ? Boolean.FALSE : bool, (i2 & 256) != 0 ? Boolean.TRUE : bool2, (i2 & 512) != 0 ? Boolean.FALSE : bool3, (i2 & 1024) != 0 ? null : str2, (i2 & 2048) != 0 ? Boolean.FALSE : bool4, (i2 & 4096) == 0 ? stateColorStyle : null, (i2 & 8192) != 0 ? 2 : i, (i2 & 16384) != 0 ? false : z);
    }
}
