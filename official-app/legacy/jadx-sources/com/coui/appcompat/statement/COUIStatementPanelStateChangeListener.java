package com.coui.appcompat.statement;

import com.coui.component.responsiveui.unit.Dp;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b`\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/coui/appcompat/statement/COUIStatementPanelStateChangeListener;", "", "Companion", "a", "PanelStatusTypeEnum", "coui-support-statement_release"}, k = 1, mv = {1, 8, 0})
public interface COUIStatementPanelStateChangeListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/coui/appcompat/statement/COUIStatementPanelStateChangeListener$PanelStatusTypeEnum;", "", "(Ljava/lang/String;I)V", "INIT", "NORMAL", "SMALL_LAND", "SPLIT_SCREEN", "MINI", "TINY", "coui-support-statement_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum PanelStatusTypeEnum {
        INIT,
        NORMAL,
        SMALL_LAND,
        SPLIT_SCREEN,
        MINI,
        TINY
    }

    /* JADX INFO: renamed from: com.coui.appcompat.statement.COUIStatementPanelStateChangeListener$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/coui/appcompat/statement/COUIStatementPanelStateChangeListener$a;", "", "Lcom/coui/component/responsiveui/unit/Dp;", "b", "Lcom/coui/component/responsiveui/unit/Dp;", "a", "()Lcom/coui/component/responsiveui/unit/Dp;", "SCREN_DP_MINI_WIDTH", "c", "SCREN_DP_SPLIT_HEIGHT", "d", "getSCREN_DP_DEFAULT_HEIGHT", "SCREN_DP_DEFAULT_HEIGHT", MapSchema.FIELD_NAME_ENTRY, "getSCREN_DP_SMALL_LAND_SINGLE_LINE_HEIGHT", "SCREN_DP_SMALL_LAND_SINGLE_LINE_HEIGHT", "<init>", "()V", "coui-support-statement_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCOUIStatementPanelStateChangeListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 COUIStatementPanelStateChangeListener.kt\ncom/coui/appcompat/statement/COUIStatementPanelStateChangeListener$Companion\n+ 2 Dp.kt\ncom/coui/component/responsiveui/unit/DpKt\n*L\n1#1,99:1\n57#2:100\n57#2:101\n57#2:102\n57#2:103\n*S KotlinDebug\n*F\n+ 1 COUIStatementPanelStateChangeListener.kt\ncom/coui/appcompat/statement/COUIStatementPanelStateChangeListener$Companion\n*L\n31#1:100\n34#1:101\n36#1:102\n39#1:103\n*E\n"})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public static final Dp SCREN_DP_MINI_WIDTH = new Dp(207);

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final Dp SCREN_DP_SPLIT_HEIGHT = new Dp(600);

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public static final Dp SCREN_DP_DEFAULT_HEIGHT = new Dp(670);

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final Dp SCREN_DP_SMALL_LAND_SINGLE_LINE_HEIGHT = new Dp(300);

        @NotNull
        public final Dp a() {
            return SCREN_DP_MINI_WIDTH;
        }

        @NotNull
        public final Dp b() {
            return SCREN_DP_SPLIT_HEIGHT;
        }
    }
}
