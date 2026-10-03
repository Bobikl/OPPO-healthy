package com.oplus.pantanal.seedling.bean;

import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.enums.EnumEntries;
import p010kotlin.enums.EnumEntriesKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/oplus/pantanal/seedling/bean/PanelActionEnum;", "", "action", "", DBHealthReviewPlan.DESC, "", "(Ljava/lang/String;IILjava/lang/String;)V", "getAction", "()I", "getDesc", "()Ljava/lang/String;", "Unknown", "PANEL_SLIDE", "OUTSIDE_CLICK", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum PanelActionEnum {
    Unknown(-100, "无效的面板事件"),
    PANEL_SLIDE(100, "流体云面板内滑动事件"),
    OUTSIDE_CLICK(101, "流体云面板外点击空白区域事件");

    private final int action;

    @NotNull
    private final String desc;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/oplus/pantanal/seedling/bean/PanelActionEnum$Companion;", "", "()V", "create", "Lcom/oplus/pantanal/seedling/bean/PanelActionEnum;", "action", "", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final PanelActionEnum create(int action) {
            PanelActionEnum panelActionEnum = PanelActionEnum.PANEL_SLIDE;
            if (action == panelActionEnum.getAction()) {
                return panelActionEnum;
            }
            PanelActionEnum panelActionEnum2 = PanelActionEnum.OUTSIDE_CLICK;
            return action == panelActionEnum2.getAction() ? panelActionEnum2 : PanelActionEnum.Unknown;
        }
    }

    PanelActionEnum(int i, String str) {
        this.action = i;
        this.desc = str;
    }

    @JvmStatic
    @NotNull
    public static final PanelActionEnum create(int i) {
        return INSTANCE.create(i);
    }

    @NotNull
    public static EnumEntries<PanelActionEnum> getEntries() {
        return $ENTRIES;
    }

    public final int getAction() {
        return this.action;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }
}
