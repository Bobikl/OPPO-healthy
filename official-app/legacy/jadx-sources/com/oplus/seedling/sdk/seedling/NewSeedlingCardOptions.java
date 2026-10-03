package com.oplus.seedling.sdk.seedling;

import androidx.annotation.Keep;
import com.oplus.pantanal.seedling.convertor.JsonToSeedlingCardOptionsConvertor;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.foundation.utils.RequiresVersionSdk;
import pantanal.foundation.utils.VersionSdk;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\bP\b\u0087\b\u0018\u0000 h2\u00020\u0001:\u0001hB[\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r¢\u0006\u0002\u0010\u000eBû\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0018\u00010\r\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005¢\u0006\u0002\u0010\u001bJ\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\rHÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010T\u001a\u00020\tHÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010.J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\u0017\u0010X\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0018\u00010\rHÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003J\t\u0010Z\u001a\u00020\u0005HÆ\u0003J\u0010\u0010[\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00107J\t\u0010\\\u001a\u00020\u0005HÆ\u0003J\u0010\u0010]\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0011\u0010^\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bHÆ\u0003J\u0017\u0010_\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rHÆ\u0003J\u0017\u0010`\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rHÆ\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0084\u0002\u0010b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0018\u00010\r2\b\b\u0002\u0010\u001a\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010cJ\u0013\u0010d\u001a\u00020\u00052\b\u0010e\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010f\u001a\u00020\tHÖ\u0001J\t\u0010g\u001a\u00020\u0003HÖ\u0001R(\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\"\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R,\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010!R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u00104\"\u0004\b5\u00106R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\b\u0006\u00107\"\u0004\b8\u00109R(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010*\"\u0004\b<\u0010,R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001e\u0010\u0017\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010&\"\u0004\bB\u0010(R(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010*\"\u0004\bD\u0010,R\u001e\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u00104\"\u0004\bJ\u00106R\u001e\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u00104\"\u0004\bL\u00106R\u001e\u0010\u001a\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u00104\"\u0004\bN\u00106R(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010*\"\u0004\bP\u0010,¨\u0006i"}, d2 = {"Lcom/oplus/seedling/sdk/seedling/NewSeedlingCardOptions;", "Ljava/io/Serializable;", JsonToSeedlingCardOptionsConvertor.KEY_DATA_SOURCE_PKG_NAME, "", JsonToSeedlingCardOptionsConvertor.KEY_IS_MILESTONE, "", "isRequestShowPanel", JsonToSeedlingCardOptionsConvertor.KEY_REQUEST_HIDE_STATUS_BAR, JsonToSeedlingCardOptionsConvertor.KEY_GRADE_IN_UPK, "", JsonToSeedlingCardOptionsConvertor.KEY_NOTIFICATION_ID_LIST, "", JsonToSeedlingCardOptionsConvertor.KEY_SHOW_HOST_MAP, "", "(Ljava/lang/String;ZLjava/lang/Boolean;ZLjava/lang/Integer;Ljava/util/List;Ljava/util/Map;)V", JsonToSeedlingCardOptionsConvertor.KEY_LOCK_SCREEN_SHOW_HOST_MAP, JsonToSeedlingCardOptionsConvertor.KEY_CANCEL_PANEL_ACTION_CONFIG, JsonToSeedlingCardOptionsConvertor.KEY_PANEL_ACTION_CONFIG_MAP, JsonToSeedlingCardOptionsConvertor.KEY_CONTROL_ACTION, "remindLevel", JsonToSeedlingCardOptionsConvertor.KEY_SHOULD_FOCUS_IN_UPK, JsonToSeedlingCardOptionsConvertor.KEY_FOCUS_TIMESTAMP_IN_UPK, "", "pageId", JsonToSeedlingCardOptionsConvertor.KEY_EXTENSIBLE_ACTION_IN_UPK, "", "shouldShow", "(Ljava/lang/String;ZLjava/lang/Boolean;ZLjava/lang/Integer;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/Integer;IZLjava/lang/Long;Ljava/lang/String;Ljava/util/Map;Z)V", "getCancelPanelActionConfig$annotations", "()V", "getCancelPanelActionConfig", "()Ljava/lang/Integer;", "setCancelPanelActionConfig", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getControlAction", "setControlAction", "getDataSourcePkgName", "()Ljava/lang/String;", "setDataSourcePkgName", "(Ljava/lang/String;)V", "getExtensibleActionMap", "()Ljava/util/Map;", "setExtensibleActionMap", "(Ljava/util/Map;)V", "getFocusTimestamp", "()Ljava/lang/Long;", "setFocusTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getGrade", "setGrade", "()Z", "setMilestone", "(Z)V", "()Ljava/lang/Boolean;", "setRequestShowPanel", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getLockScreenShowHostMap", "setLockScreenShowHostMap", "getNotificationIdList", "()Ljava/util/List;", "setNotificationIdList", "(Ljava/util/List;)V", "getPageId", "setPageId", "getPanelActionConfigMap", "setPanelActionConfigMap", "getRemindLevel", "()I", "setRemindLevel", "(I)V", "getRequestHideStatusBar", "setRequestHideStatusBar", "getShouldFocus", "setShouldFocus", "getShouldShow", "setShouldShow", "getShowHostMap", "setShowHostMap", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ZLjava/lang/Boolean;ZLjava/lang/Integer;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/Integer;IZLjava/lang/Long;Ljava/lang/String;Ljava/util/Map;Z)Lcom/oplus/seedling/sdk/seedling/NewSeedlingCardOptions;", "equals", "other", "hashCode", "toString", "Companion", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class NewSeedlingCardOptions implements Serializable {
    public static final int ACTION_DISAPPEAR = 2;
    public static final int ACTION_NOTHING = 3;
    public static final int ACTION_RETRACT = 1;
    public static final int PANEL_INSIDE_SLIDE = 100;
    public static final int PANEL_OUTSIDE_CLICK = 101;

    @NotNull
    public static final String TAG = "SeedlingCardOptions";
    private static final long serialVersionUID = 1;

    @Nullable
    private Integer cancelPanelActionConfig;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_0)
    @Nullable
    private Integer controlAction;

    @Nullable
    private String dataSourcePkgName;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_10)
    @Nullable
    private Map<String, ? extends Object> extensibleActionMap;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_0)
    @Nullable
    private Long focusTimestamp;

    @Nullable
    private Integer grade;
    private boolean isMilestone;

    @Nullable
    private Boolean isRequestShowPanel;

    @Nullable
    private Map<Integer, Boolean> lockScreenShowHostMap;

    @Nullable
    private List<Integer> notificationIdList;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_1)
    @NotNull
    private String pageId;

    @Nullable
    private Map<Integer, Integer> panelActionConfigMap;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_0)
    private int remindLevel;
    private boolean requestHideStatusBar;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_0)
    private boolean shouldFocus;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_24)
    private boolean shouldShow;

    @Nullable
    private Map<Integer, Boolean> showHostMap;

    public NewSeedlingCardOptions() {
        this(null, false, null, false, null, null, null, null, null, null, null, 0, false, null, null, null, false, 131071, null);
    }

    @Deprecated(message = "please use panelActionConfigMap instead of this attribute,which is supported in sdk version 1.1.21")
    public static /* synthetic */ void getCancelPanelActionConfig$annotations() {
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDataSourcePkgName() {
        return this.dataSourcePkgName;
    }

    @Nullable
    public final Map<Integer, Integer> component10() {
        return this.panelActionConfigMap;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getControlAction() {
        return this.controlAction;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getRemindLevel() {
        return this.remindLevel;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getShouldFocus() {
        return this.shouldFocus;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Long getFocusTimestamp() {
        return this.focusTimestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    @Nullable
    public final Map<String, Object> component16() {
        return this.extensibleActionMap;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getShouldShow() {
        return this.shouldShow;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsMilestone() {
        return this.isMilestone;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsRequestShowPanel() {
        return this.isRequestShowPanel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getRequestHideStatusBar() {
        return this.requestHideStatusBar;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getGrade() {
        return this.grade;
    }

    @Nullable
    public final List<Integer> component6() {
        return this.notificationIdList;
    }

    @Nullable
    public final Map<Integer, Boolean> component7() {
        return this.showHostMap;
    }

    @Nullable
    public final Map<Integer, Boolean> component8() {
        return this.lockScreenShowHostMap;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getCancelPanelActionConfig() {
        return this.cancelPanelActionConfig;
    }

    @NotNull
    public final NewSeedlingCardOptions copy(@Nullable String dataSourcePkgName, boolean isMilestone, @Nullable Boolean isRequestShowPanel, boolean requestHideStatusBar, @Nullable Integer grade, @Nullable List<Integer> notificationIdList, @Nullable Map<Integer, Boolean> showHostMap, @Nullable Map<Integer, Boolean> lockScreenShowHostMap, @Nullable Integer cancelPanelActionConfig, @Nullable Map<Integer, Integer> panelActionConfigMap, @Nullable Integer controlAction, int remindLevel, boolean shouldFocus, @Nullable Long focusTimestamp, @NotNull String pageId, @Nullable Map<String, ? extends Object> extensibleActionMap, boolean shouldShow) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        return new NewSeedlingCardOptions(dataSourcePkgName, isMilestone, isRequestShowPanel, requestHideStatusBar, grade, notificationIdList, showHostMap, lockScreenShowHostMap, cancelPanelActionConfig, panelActionConfigMap, controlAction, remindLevel, shouldFocus, focusTimestamp, pageId, extensibleActionMap, shouldShow);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewSeedlingCardOptions)) {
            return false;
        }
        NewSeedlingCardOptions newSeedlingCardOptions = (NewSeedlingCardOptions) other;
        return Intrinsics.areEqual(this.dataSourcePkgName, newSeedlingCardOptions.dataSourcePkgName) && this.isMilestone == newSeedlingCardOptions.isMilestone && Intrinsics.areEqual(this.isRequestShowPanel, newSeedlingCardOptions.isRequestShowPanel) && this.requestHideStatusBar == newSeedlingCardOptions.requestHideStatusBar && Intrinsics.areEqual(this.grade, newSeedlingCardOptions.grade) && Intrinsics.areEqual(this.notificationIdList, newSeedlingCardOptions.notificationIdList) && Intrinsics.areEqual(this.showHostMap, newSeedlingCardOptions.showHostMap) && Intrinsics.areEqual(this.lockScreenShowHostMap, newSeedlingCardOptions.lockScreenShowHostMap) && Intrinsics.areEqual(this.cancelPanelActionConfig, newSeedlingCardOptions.cancelPanelActionConfig) && Intrinsics.areEqual(this.panelActionConfigMap, newSeedlingCardOptions.panelActionConfigMap) && Intrinsics.areEqual(this.controlAction, newSeedlingCardOptions.controlAction) && this.remindLevel == newSeedlingCardOptions.remindLevel && this.shouldFocus == newSeedlingCardOptions.shouldFocus && Intrinsics.areEqual(this.focusTimestamp, newSeedlingCardOptions.focusTimestamp) && Intrinsics.areEqual(this.pageId, newSeedlingCardOptions.pageId) && Intrinsics.areEqual(this.extensibleActionMap, newSeedlingCardOptions.extensibleActionMap) && this.shouldShow == newSeedlingCardOptions.shouldShow;
    }

    @Nullable
    public final Integer getCancelPanelActionConfig() {
        return this.cancelPanelActionConfig;
    }

    @Nullable
    public final Integer getControlAction() {
        return this.controlAction;
    }

    @Nullable
    public final String getDataSourcePkgName() {
        return this.dataSourcePkgName;
    }

    @Nullable
    public final Map<String, Object> getExtensibleActionMap() {
        return this.extensibleActionMap;
    }

    @Nullable
    public final Long getFocusTimestamp() {
        return this.focusTimestamp;
    }

    @Nullable
    public final Integer getGrade() {
        return this.grade;
    }

    @Nullable
    public final Map<Integer, Boolean> getLockScreenShowHostMap() {
        return this.lockScreenShowHostMap;
    }

    @Nullable
    public final List<Integer> getNotificationIdList() {
        return this.notificationIdList;
    }

    @NotNull
    public final String getPageId() {
        return this.pageId;
    }

    @Nullable
    public final Map<Integer, Integer> getPanelActionConfigMap() {
        return this.panelActionConfigMap;
    }

    public final int getRemindLevel() {
        return this.remindLevel;
    }

    public final boolean getRequestHideStatusBar() {
        return this.requestHideStatusBar;
    }

    public final boolean getShouldFocus() {
        return this.shouldFocus;
    }

    public final boolean getShouldShow() {
        return this.shouldShow;
    }

    @Nullable
    public final Map<Integer, Boolean> getShowHostMap() {
        return this.showHostMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v31, types: [int] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        String str = this.dataSourcePkgName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.isMilestone;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode + r2) * 31;
        Boolean bool = this.isRequestShowPanel;
        int iHashCode2 = (i + (bool == null ? 0 : bool.hashCode())) * 31;
        boolean z2 = this.requestHideStatusBar;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        int i2 = (iHashCode2 + r3) * 31;
        Integer num = this.grade;
        int iHashCode3 = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list = this.notificationIdList;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Map<Integer, Boolean> map = this.showHostMap;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Map<Integer, Boolean> map2 = this.lockScreenShowHostMap;
        int iHashCode6 = (iHashCode5 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Integer num2 = this.cancelPanelActionConfig;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Map<Integer, Integer> map3 = this.panelActionConfigMap;
        int iHashCode8 = (iHashCode7 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Integer num3 = this.controlAction;
        int iHashCode9 = (((iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31) + Integer.hashCode(this.remindLevel)) * 31;
        boolean z3 = this.shouldFocus;
        ?? r4 = z3;
        if (z3) {
            r4 = 1;
        }
        int i3 = (iHashCode9 + r4) * 31;
        Long l2 = this.focusTimestamp;
        int iHashCode10 = (((i3 + (l2 == null ? 0 : l2.hashCode())) * 31) + this.pageId.hashCode()) * 31;
        Map<String, ? extends Object> map4 = this.extensibleActionMap;
        int iHashCode11 = (iHashCode10 + (map4 != null ? map4.hashCode() : 0)) * 31;
        boolean z4 = this.shouldShow;
        return iHashCode11 + (z4 ? 1 : z4);
    }

    public final boolean isMilestone() {
        return this.isMilestone;
    }

    @Nullable
    public final Boolean isRequestShowPanel() {
        return this.isRequestShowPanel;
    }

    public final void setCancelPanelActionConfig(@Nullable Integer num) {
        this.cancelPanelActionConfig = num;
    }

    public final void setControlAction(@Nullable Integer num) {
        this.controlAction = num;
    }

    public final void setDataSourcePkgName(@Nullable String str) {
        this.dataSourcePkgName = str;
    }

    public final void setExtensibleActionMap(@Nullable Map<String, ? extends Object> map) {
        this.extensibleActionMap = map;
    }

    public final void setFocusTimestamp(@Nullable Long l2) {
        this.focusTimestamp = l2;
    }

    public final void setGrade(@Nullable Integer num) {
        this.grade = num;
    }

    public final void setLockScreenShowHostMap(@Nullable Map<Integer, Boolean> map) {
        this.lockScreenShowHostMap = map;
    }

    public final void setMilestone(boolean z) {
        this.isMilestone = z;
    }

    public final void setNotificationIdList(@Nullable List<Integer> list) {
        this.notificationIdList = list;
    }

    public final void setPageId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pageId = str;
    }

    public final void setPanelActionConfigMap(@Nullable Map<Integer, Integer> map) {
        this.panelActionConfigMap = map;
    }

    public final void setRemindLevel(int i) {
        this.remindLevel = i;
    }

    public final void setRequestHideStatusBar(boolean z) {
        this.requestHideStatusBar = z;
    }

    public final void setRequestShowPanel(@Nullable Boolean bool) {
        this.isRequestShowPanel = bool;
    }

    public final void setShouldFocus(boolean z) {
        this.shouldFocus = z;
    }

    public final void setShouldShow(boolean z) {
        this.shouldShow = z;
    }

    public final void setShowHostMap(@Nullable Map<Integer, Boolean> map) {
        this.showHostMap = map;
    }

    @NotNull
    public String toString() {
        return "NewSeedlingCardOptions(dataSourcePkgName=" + this.dataSourcePkgName + ", isMilestone=" + this.isMilestone + ", isRequestShowPanel=" + this.isRequestShowPanel + ", requestHideStatusBar=" + this.requestHideStatusBar + ", grade=" + this.grade + ", notificationIdList=" + this.notificationIdList + ", showHostMap=" + this.showHostMap + ", lockScreenShowHostMap=" + this.lockScreenShowHostMap + ", cancelPanelActionConfig=" + this.cancelPanelActionConfig + ", panelActionConfigMap=" + this.panelActionConfigMap + ", controlAction=" + this.controlAction + ", remindLevel=" + this.remindLevel + ", shouldFocus=" + this.shouldFocus + ", focusTimestamp=" + this.focusTimestamp + ", pageId=" + this.pageId + ", extensibleActionMap=" + this.extensibleActionMap + ", shouldShow=" + this.shouldShow + ")";
    }

    public NewSeedlingCardOptions(@Nullable String str, boolean z, @Nullable Boolean bool, boolean z2, @Nullable Integer num, @Nullable List<Integer> list, @Nullable Map<Integer, Boolean> map, @Nullable Map<Integer, Boolean> map2, @Nullable Integer num2, @Nullable Map<Integer, Integer> map3, @Nullable Integer num3, int i, boolean z3, @Nullable Long l2, @NotNull String pageId, @Nullable Map<String, ? extends Object> map4, boolean z4) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        this.dataSourcePkgName = str;
        this.isMilestone = z;
        this.isRequestShowPanel = bool;
        this.requestHideStatusBar = z2;
        this.grade = num;
        this.notificationIdList = list;
        this.showHostMap = map;
        this.lockScreenShowHostMap = map2;
        this.cancelPanelActionConfig = num2;
        this.panelActionConfigMap = map3;
        this.controlAction = num3;
        this.remindLevel = i;
        this.shouldFocus = z3;
        this.focusTimestamp = l2;
        this.pageId = pageId;
        this.extensibleActionMap = map4;
        this.shouldShow = z4;
    }

    public /* synthetic */ NewSeedlingCardOptions(String str, boolean z, Boolean bool, boolean z2, Integer num, List list, Map map, Map map2, Integer num2, Map map3, Integer num3, int i, boolean z3, Long l2, String str2, Map map4, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? null : map, (i2 & 128) != 0 ? null : map2, (i2 & 256) != 0 ? null : num2, (i2 & 512) != 0 ? null : map3, (i2 & 1024) != 0 ? null : num3, (i2 & 2048) != 0 ? 0 : i, (i2 & 4096) != 0 ? false : z3, (i2 & 8192) != 0 ? null : l2, (i2 & 16384) != 0 ? "" : str2, (i2 & 32768) != 0 ? null : map4, (i2 & 65536) != 0 ? false : z4);
    }

    public NewSeedlingCardOptions(@Nullable String str, boolean z, @Nullable Boolean bool, boolean z2, @Nullable Integer num, @Nullable List<Integer> list, @Nullable Map<Integer, Boolean> map) {
        this(str, z, bool, z2, num, list, map, null, null, null, null, 0, false, null, null, null, false, 130560, null);
    }
}
