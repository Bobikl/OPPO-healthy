package com.oplus.pantanal.seedling.bean;

import com.oplus.smartenginehelper.ParserTag;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/oplus/pantanal/seedling/bean/CancelPanelActionConfigEnum;", "", ParserTag.TAG_ACTION, "", "desc", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getAction", "()I", "getDesc", "()Ljava/lang/String;", "Unknown", "Retract", "Disappear", "NoAction", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum CancelPanelActionConfigEnum {
    Unknown(-1, "无效的面板事件目的配置"),
    Retract(1, "收起面板为胶囊"),
    Disappear(2, "让面板消失"),
    NoAction(3, "不做任何响应");

    private final int action;

    @NotNull
    private final String desc;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/oplus/pantanal/seedling/bean/CancelPanelActionConfigEnum$Companion;", "", "()V", "create", "Lcom/oplus/pantanal/seedling/bean/CancelPanelActionConfigEnum;", ParserTag.TAG_ACTION, "", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CancelPanelActionConfigEnum create(int action) {
            CancelPanelActionConfigEnum cancelPanelActionConfigEnum = CancelPanelActionConfigEnum.Retract;
            if (action == cancelPanelActionConfigEnum.getAction()) {
                return cancelPanelActionConfigEnum;
            }
            CancelPanelActionConfigEnum cancelPanelActionConfigEnum2 = CancelPanelActionConfigEnum.Disappear;
            if (action == cancelPanelActionConfigEnum2.getAction()) {
                return cancelPanelActionConfigEnum2;
            }
            CancelPanelActionConfigEnum cancelPanelActionConfigEnum3 = CancelPanelActionConfigEnum.NoAction;
            return action == cancelPanelActionConfigEnum3.getAction() ? cancelPanelActionConfigEnum3 : CancelPanelActionConfigEnum.Unknown;
        }
    }

    CancelPanelActionConfigEnum(int i, String str) {
        this.action = i;
        this.desc = str;
    }

    @JvmStatic
    @NotNull
    public static final CancelPanelActionConfigEnum create(int i) {
        return INSTANCE.create(i);
    }

    @NotNull
    public static EnumEntries<CancelPanelActionConfigEnum> getEntries() {
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
