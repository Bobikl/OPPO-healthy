package com.oplus.pantanal.seedling.update;

import com.oplus.pantanal.seedling.bean.CancelPanelActionConfigEnum;
import com.oplus.pantanal.seedling.bean.PanelActionEnum;
import com.oplus.pantanal.seedling.bean.SeedlingHostEnum;
import com.oplus.pantanal.seedling.convertor.JsonToSeedlingCardOptionsConvertor;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\bP\b\u0086\b\u0018\u0000 h2\u00020\u0001:\u0001hBó\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\u0010\u001bJ\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0017\u0010T\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000eHÆ\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010#J\t\u0010V\u001a\u00020\nHÆ\u0003J\t\u0010W\u001a\u00020\u0006HÆ\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u00100J\u0017\u0010Y\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010JJ\t\u0010]\u001a\u00020\u0006HÆ\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010#J\u0011\u0010_\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fHÆ\u0003J\u0017\u0010`\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eHÆ\u0003J\u0017\u0010a\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eHÆ\u0003Jü\u0001\u0010b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010cJ\u0013\u0010d\u001a\u00020\u00062\b\u0010e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010f\u001a\u00020\nHÖ\u0001J\t\u0010g\u001a\u00020\u0003HÖ\u0001R&\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0010\n\u0002\u00103\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b4\u0010#\"\u0004\b5\u0010%R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u00106\"\u0004\b7\u00108R(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010(\"\u0004\b@\u0010*R(\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010,\"\u0004\bB\u0010.R\u001a\u0010\u0016\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u00106\"\u0004\bH\u00108R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010M\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u00106\"\u0004\bO\u00108R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010,\"\u0004\bQ\u0010.¨\u0006i"}, d2 = {"Lcom/oplus/pantanal/seedling/update/SeedlingCardOptions;", "", JsonToSeedlingCardOptionsConvertor.KEY_PAGE_ID, "", JsonToSeedlingCardOptionsConvertor.KEY_DATA_SOURCE_PKG_NAME, JsonToSeedlingCardOptionsConvertor.KEY_IS_MILESTONE, "", JsonToSeedlingCardOptionsConvertor.KEY_REQUEST_SHOW_PANEL, JsonToSeedlingCardOptionsConvertor.KEY_REQUEST_HIDE_STATUS_BAR, JsonToSeedlingCardOptionsConvertor.KEY_GRADE_IN_UPK, "", JsonToSeedlingCardOptionsConvertor.KEY_NOTIFICATION_ID_LIST, "", JsonToSeedlingCardOptionsConvertor.KEY_SHOW_HOST_MAP, "", "Lcom/oplus/pantanal/seedling/bean/SeedlingHostEnum;", JsonToSeedlingCardOptionsConvertor.KEY_LOCK_SCREEN_SHOW_HOST_MAP, JsonToSeedlingCardOptionsConvertor.KEY_CANCEL_PANEL_ACTION_CONFIG, "Lcom/oplus/pantanal/seedling/bean/CancelPanelActionConfigEnum;", JsonToSeedlingCardOptionsConvertor.KEY_PANEL_ACTION_CONFIG_MAP, "Lcom/oplus/pantanal/seedling/bean/PanelActionEnum;", JsonToSeedlingCardOptionsConvertor.KEY_CONTROL_ACTION, JsonToSeedlingCardOptionsConvertor.KEY_REMIND_TYPE_IN_UPK, JsonToSeedlingCardOptionsConvertor.KEY_SHOULD_FOCUS_IN_UPK, JsonToSeedlingCardOptionsConvertor.KEY_FOCUS_TIMESTAMP_IN_UPK, "", JsonToSeedlingCardOptionsConvertor.KEY_EXTENSIBLE_ACTION_IN_UPK, "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;ZLjava/lang/Integer;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Lcom/oplus/pantanal/seedling/bean/CancelPanelActionConfigEnum;Ljava/util/Map;Ljava/lang/Integer;IZLjava/lang/Long;Ljava/util/Map;)V", "getCancelPanelActionConfig$annotations", "()V", "getCancelPanelActionConfig", "()Lcom/oplus/pantanal/seedling/bean/CancelPanelActionConfigEnum;", "setCancelPanelActionConfig", "(Lcom/oplus/pantanal/seedling/bean/CancelPanelActionConfigEnum;)V", "getControlAction", "()Ljava/lang/Integer;", "setControlAction", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDataSourcePkgName", "()Ljava/lang/String;", "setDataSourcePkgName", "(Ljava/lang/String;)V", "getExtensibleActionMap", "()Ljava/util/Map;", "setExtensibleActionMap", "(Ljava/util/Map;)V", "getFocusTimestamp", "()Ljava/lang/Long;", "setFocusTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getGrade", "setGrade", "()Z", "setMilestone", "(Z)V", "getLockScreenShowHostMap", "setLockScreenShowHostMap", "getNotificationIdList", "()Ljava/util/List;", "setNotificationIdList", "(Ljava/util/List;)V", "getPageId", "setPageId", "getPanelActionConfigMap", "setPanelActionConfigMap", "getRemindType", "()I", "setRemindType", "(I)V", "getRequestHideStatusBar", "setRequestHideStatusBar", "getRequestShowPanel", "()Ljava/lang/Boolean;", "setRequestShowPanel", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getShouldFocus", "setShouldFocus", "getShowHostMap", "setShowHostMap", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;ZLjava/lang/Integer;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Lcom/oplus/pantanal/seedling/bean/CancelPanelActionConfigEnum;Ljava/util/Map;Ljava/lang/Integer;IZLjava/lang/Long;Ljava/util/Map;)Lcom/oplus/pantanal/seedling/update/SeedlingCardOptions;", "equals", "other", "hashCode", "toString", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SeedlingCardOptions {
    public static final int GRADE_1 = 1;
    public static final int GRADE_2 = 2;
    public static final int GRADE_3 = 3;
    public static final int GRADE_4 = 4;
    public static final int GRADE_5 = 5;
    private static final int GRADE_BASE = 0;
    public static final int REMIND_TYPE_NORMAL = 0;
    public static final int REMIND_TYPE_STRONG_ALWAYS = 13;
    public static final int REMIND_TYPE_STRONG_LONG = 12;
    public static final int REMIND_TYPE_STRONG_SHORT = 11;

    @Nullable
    private CancelPanelActionConfigEnum cancelPanelActionConfig;

    @Nullable
    private Integer controlAction;

    @Nullable
    private String dataSourcePkgName;

    @Nullable
    private Map<String, ? extends Object> extensibleActionMap;

    @Nullable
    private Long focusTimestamp;

    @Nullable
    private Integer grade;
    private boolean isMilestone;

    @Nullable
    private Map<SeedlingHostEnum, Boolean> lockScreenShowHostMap;

    @Nullable
    private List<Integer> notificationIdList;

    @Nullable
    private String pageId;

    @Nullable
    private Map<PanelActionEnum, ? extends CancelPanelActionConfigEnum> panelActionConfigMap;
    private int remindType;
    private boolean requestHideStatusBar;

    @Nullable
    private Boolean requestShowPanel;
    private boolean shouldFocus;

    @Nullable
    private Map<SeedlingHostEnum, Boolean> showHostMap;

    public SeedlingCardOptions() {
        this(null, null, false, null, false, null, null, null, null, null, null, null, 0, false, null, null, 65535, null);
    }

    @Deprecated(message = "use panelActionConfigMap instead")
    public static /* synthetic */ void getCancelPanelActionConfig$annotations() {
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final CancelPanelActionConfigEnum getCancelPanelActionConfig() {
        return this.cancelPanelActionConfig;
    }

    @Nullable
    public final Map<PanelActionEnum, CancelPanelActionConfigEnum> component11() {
        return this.panelActionConfigMap;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getControlAction() {
        return this.controlAction;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getRemindType() {
        return this.remindType;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getShouldFocus() {
        return this.shouldFocus;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Long getFocusTimestamp() {
        return this.focusTimestamp;
    }

    @Nullable
    public final Map<String, Object> component16() {
        return this.extensibleActionMap;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDataSourcePkgName() {
        return this.dataSourcePkgName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsMilestone() {
        return this.isMilestone;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getRequestShowPanel() {
        return this.requestShowPanel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getRequestHideStatusBar() {
        return this.requestHideStatusBar;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getGrade() {
        return this.grade;
    }

    @Nullable
    public final List<Integer> component7() {
        return this.notificationIdList;
    }

    @Nullable
    public final Map<SeedlingHostEnum, Boolean> component8() {
        return this.showHostMap;
    }

    @Nullable
    public final Map<SeedlingHostEnum, Boolean> component9() {
        return this.lockScreenShowHostMap;
    }

    @NotNull
    public final SeedlingCardOptions copy(@Nullable String pageId, @Nullable String dataSourcePkgName, boolean isMilestone, @Nullable Boolean requestShowPanel, boolean requestHideStatusBar, @Nullable Integer grade, @Nullable List<Integer> notificationIdList, @Nullable Map<SeedlingHostEnum, Boolean> showHostMap, @Nullable Map<SeedlingHostEnum, Boolean> lockScreenShowHostMap, @Nullable CancelPanelActionConfigEnum cancelPanelActionConfig, @Nullable Map<PanelActionEnum, ? extends CancelPanelActionConfigEnum> panelActionConfigMap, @Nullable Integer controlAction, int remindType, boolean shouldFocus, @Nullable Long focusTimestamp, @Nullable Map<String, ? extends Object> extensibleActionMap) {
        return new SeedlingCardOptions(pageId, dataSourcePkgName, isMilestone, requestShowPanel, requestHideStatusBar, grade, notificationIdList, showHostMap, lockScreenShowHostMap, cancelPanelActionConfig, panelActionConfigMap, controlAction, remindType, shouldFocus, focusTimestamp, extensibleActionMap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeedlingCardOptions)) {
            return false;
        }
        SeedlingCardOptions seedlingCardOptions = (SeedlingCardOptions) other;
        return Intrinsics.areEqual(this.pageId, seedlingCardOptions.pageId) && Intrinsics.areEqual(this.dataSourcePkgName, seedlingCardOptions.dataSourcePkgName) && this.isMilestone == seedlingCardOptions.isMilestone && Intrinsics.areEqual(this.requestShowPanel, seedlingCardOptions.requestShowPanel) && this.requestHideStatusBar == seedlingCardOptions.requestHideStatusBar && Intrinsics.areEqual(this.grade, seedlingCardOptions.grade) && Intrinsics.areEqual(this.notificationIdList, seedlingCardOptions.notificationIdList) && Intrinsics.areEqual(this.showHostMap, seedlingCardOptions.showHostMap) && Intrinsics.areEqual(this.lockScreenShowHostMap, seedlingCardOptions.lockScreenShowHostMap) && this.cancelPanelActionConfig == seedlingCardOptions.cancelPanelActionConfig && Intrinsics.areEqual(this.panelActionConfigMap, seedlingCardOptions.panelActionConfigMap) && Intrinsics.areEqual(this.controlAction, seedlingCardOptions.controlAction) && this.remindType == seedlingCardOptions.remindType && this.shouldFocus == seedlingCardOptions.shouldFocus && Intrinsics.areEqual(this.focusTimestamp, seedlingCardOptions.focusTimestamp) && Intrinsics.areEqual(this.extensibleActionMap, seedlingCardOptions.extensibleActionMap);
    }

    @Nullable
    public final CancelPanelActionConfigEnum getCancelPanelActionConfig() {
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
    public final Map<SeedlingHostEnum, Boolean> getLockScreenShowHostMap() {
        return this.lockScreenShowHostMap;
    }

    @Nullable
    public final List<Integer> getNotificationIdList() {
        return this.notificationIdList;
    }

    @Nullable
    public final String getPageId() {
        return this.pageId;
    }

    @Nullable
    public final Map<PanelActionEnum, CancelPanelActionConfigEnum> getPanelActionConfigMap() {
        return this.panelActionConfigMap;
    }

    public final int getRemindType() {
        return this.remindType;
    }

    public final boolean getRequestHideStatusBar() {
        return this.requestHideStatusBar;
    }

    @Nullable
    public final Boolean getRequestShowPanel() {
        return this.requestShowPanel;
    }

    public final boolean getShouldFocus() {
        return this.shouldFocus;
    }

    @Nullable
    public final Map<SeedlingHostEnum, Boolean> getShowHostMap() {
        return this.showHostMap;
    }

    public int hashCode() {
        String str = this.pageId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dataSourcePkgName;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isMilestone)) * 31;
        Boolean bool = this.requestShowPanel;
        int iHashCode3 = (((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.requestHideStatusBar)) * 31;
        Integer num = this.grade;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list = this.notificationIdList;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Map<SeedlingHostEnum, Boolean> map = this.showHostMap;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        Map<SeedlingHostEnum, Boolean> map2 = this.lockScreenShowHostMap;
        int iHashCode7 = (iHashCode6 + (map2 == null ? 0 : map2.hashCode())) * 31;
        CancelPanelActionConfigEnum cancelPanelActionConfigEnum = this.cancelPanelActionConfig;
        int iHashCode8 = (iHashCode7 + (cancelPanelActionConfigEnum == null ? 0 : cancelPanelActionConfigEnum.hashCode())) * 31;
        Map<PanelActionEnum, ? extends CancelPanelActionConfigEnum> map3 = this.panelActionConfigMap;
        int iHashCode9 = (iHashCode8 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Integer num2 = this.controlAction;
        int iHashCode10 = (((((iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31) + Integer.hashCode(this.remindType)) * 31) + Boolean.hashCode(this.shouldFocus)) * 31;
        Long l = this.focusTimestamp;
        int iHashCode11 = (iHashCode10 + (l == null ? 0 : l.hashCode())) * 31;
        Map<String, ? extends Object> map4 = this.extensibleActionMap;
        return iHashCode11 + (map4 != null ? map4.hashCode() : 0);
    }

    public final boolean isMilestone() {
        return this.isMilestone;
    }

    public final void setCancelPanelActionConfig(@Nullable CancelPanelActionConfigEnum cancelPanelActionConfigEnum) {
        this.cancelPanelActionConfig = cancelPanelActionConfigEnum;
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

    public final void setFocusTimestamp(@Nullable Long l) {
        this.focusTimestamp = l;
    }

    public final void setGrade(@Nullable Integer num) {
        this.grade = num;
    }

    public final void setLockScreenShowHostMap(@Nullable Map<SeedlingHostEnum, Boolean> map) {
        this.lockScreenShowHostMap = map;
    }

    public final void setMilestone(boolean z) {
        this.isMilestone = z;
    }

    public final void setNotificationIdList(@Nullable List<Integer> list) {
        this.notificationIdList = list;
    }

    public final void setPageId(@Nullable String str) {
        this.pageId = str;
    }

    public final void setPanelActionConfigMap(@Nullable Map<PanelActionEnum, ? extends CancelPanelActionConfigEnum> map) {
        this.panelActionConfigMap = map;
    }

    public final void setRemindType(int i) {
        this.remindType = i;
    }

    public final void setRequestHideStatusBar(boolean z) {
        this.requestHideStatusBar = z;
    }

    public final void setRequestShowPanel(@Nullable Boolean bool) {
        this.requestShowPanel = bool;
    }

    public final void setShouldFocus(boolean z) {
        this.shouldFocus = z;
    }

    public final void setShowHostMap(@Nullable Map<SeedlingHostEnum, Boolean> map) {
        this.showHostMap = map;
    }

    @NotNull
    public String toString() {
        return "SeedlingCardOptions(pageId=" + this.pageId + ", dataSourcePkgName=" + this.dataSourcePkgName + ", isMilestone=" + this.isMilestone + ", requestShowPanel=" + this.requestShowPanel + ", requestHideStatusBar=" + this.requestHideStatusBar + ", grade=" + this.grade + ", notificationIdList=" + this.notificationIdList + ", showHostMap=" + this.showHostMap + ", lockScreenShowHostMap=" + this.lockScreenShowHostMap + ", cancelPanelActionConfig=" + this.cancelPanelActionConfig + ", panelActionConfigMap=" + this.panelActionConfigMap + ", controlAction=" + this.controlAction + ", remindType=" + this.remindType + ", shouldFocus=" + this.shouldFocus + ", focusTimestamp=" + this.focusTimestamp + ", extensibleActionMap=" + this.extensibleActionMap + ")";
    }

    public SeedlingCardOptions(@Nullable String str, @Nullable String str2, boolean z, @Nullable Boolean bool, boolean z2, @Nullable Integer num, @Nullable List<Integer> list, @Nullable Map<SeedlingHostEnum, Boolean> map, @Nullable Map<SeedlingHostEnum, Boolean> map2, @Nullable CancelPanelActionConfigEnum cancelPanelActionConfigEnum, @Nullable Map<PanelActionEnum, ? extends CancelPanelActionConfigEnum> map3, @Nullable Integer num2, int i, boolean z3, @Nullable Long l, @Nullable Map<String, ? extends Object> map4) {
        this.pageId = str;
        this.dataSourcePkgName = str2;
        this.isMilestone = z;
        this.requestShowPanel = bool;
        this.requestHideStatusBar = z2;
        this.grade = num;
        this.notificationIdList = list;
        this.showHostMap = map;
        this.lockScreenShowHostMap = map2;
        this.cancelPanelActionConfig = cancelPanelActionConfigEnum;
        this.panelActionConfigMap = map3;
        this.controlAction = num2;
        this.remindType = i;
        this.shouldFocus = z3;
        this.focusTimestamp = l;
        this.extensibleActionMap = map4;
    }

    public /* synthetic */ SeedlingCardOptions(String str, String str2, boolean z, Boolean bool, boolean z2, Integer num, List list, Map map, Map map2, CancelPanelActionConfigEnum cancelPanelActionConfigEnum, Map map3, Integer num2, int i, boolean z3, Long l, Map map4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : bool, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : list, (i2 & 128) != 0 ? null : map, (i2 & 256) != 0 ? null : map2, (i2 & 512) != 0 ? null : cancelPanelActionConfigEnum, (i2 & 1024) != 0 ? null : map3, (i2 & 2048) != 0 ? null : num2, (i2 & 4096) != 0 ? 0 : i, (i2 & 8192) == 0 ? z3 : false, (i2 & 16384) != 0 ? null : l, (i2 & 32768) != 0 ? null : map4);
    }
}
