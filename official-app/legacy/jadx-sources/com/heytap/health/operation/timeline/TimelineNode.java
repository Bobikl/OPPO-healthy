package com.heytap.health.operation.timeline;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.operation.R$id;
import com.heytap.health.operation.R$layout;
import com.heytap.health.operation.timeline.TimelineNode;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.n05;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__ReversedViewsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0016\b'\u0018\u0000 E2\u00020\u0001:\u0001\u0012B!\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u001c\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0017¢\u0006\u0004\bC\u0010DJ\u0006\u0010\u0003\u001a\u00020\u0002J&\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0016\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000bJ\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR!\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00000 8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#R'\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010%8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010(R\"\u0010/\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R\"\u00106\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010:\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00103\"\u0004\b9\u00105R\"\u0010<\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00101\u001a\u0004\b7\u00103\"\u0004\b;\u00105R(\u0010B\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006F"}, d2 = {"Lcom/heytap/health/operation/timeline/TimelineNode;", "", "", "n", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Lkotlin/Function0;", "", "clickWrapper", "Landroid/view/View;", "o", "view", "d", "", "toString", "Lcom/heytap/health/operation/timeline/NodeType;", "a", "Lcom/heytap/health/operation/timeline/NodeType;", LogFieldKey.MESSAGE_KEY, "()Lcom/heytap/health/operation/timeline/NodeType;", "type", "", "b", "J", LogFieldKey.LEVEL_KEY, "()J", "startTime", "c", b2n.f, "endTime", "", "Lkotlin/Lazy;", "j", "()Ljava/util/List;", "nextNodes", "", MapSchema.FIELD_NAME_ENTRY, "getExtraData", "()Ljava/util/Map;", "extraData", "f", "Ljava/lang/String;", "()Ljava/lang/String;", LogFieldKey.PROCESS_NAME_KEY, "(Ljava/lang/String;)V", "descStr", "", "I", "getStickyRes", "()I", "t", "(I)V", "stickyRes", b2n.g, "i", "r", "iconRes", "q", "iconBgRes", "Lkotlin/jvm/functions/Function0;", MapSchema.FIELD_NAME_KEY, "()Lkotlin/jvm/functions/Function0;", "s", "(Lkotlin/jvm/functions/Function0;)V", ParserTag.TAG_ONCLICK, "<init>", "(Lcom/heytap/health/operation/timeline/NodeType;JJ)V", "Companion", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class TimelineNode {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final NodeType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long startTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long endTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Lazy nextNodes;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy extraData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public String descStr;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int stickyRes;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int iconRes;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int iconBgRes;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function0<Unit> onClick;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    public static volatile long k = n05.INSTANCE.d(System.currentTimeMillis());

    /* JADX INFO: renamed from: com.heytap.health.operation.timeline.TimelineNode$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/operation/timeline/TimelineNode$a;", "", "", "currentSelectedDayTimestamp", "J", "a", "()J", "b", "(J)V", "<init>", "()V", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return TimelineNode.k;
        }

        public final void b(long j2) {
            TimelineNode.k = j2;
        }
    }

    public TimelineNode(@NotNull NodeType type, long j2, long j3) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.startTime = j2;
        this.endTime = j3;
        this.nextNodes = LazyKt__LazyJVMKt.lazy(new Function0<List<TimelineNode>>() { // from class: com.heytap.health.operation.timeline.TimelineNode$nextNodes$2
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final List<TimelineNode> invoke() {
                return new ArrayList();
            }
        });
        this.extraData = LazyKt__LazyJVMKt.lazy(new Function0<Map<String, Object>>() { // from class: com.heytap.health.operation.timeline.TimelineNode$extraData$2
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Map<String, Object> invoke() {
                return new LinkedHashMap();
            }
        });
        this.descStr = "";
        this.stickyRes = -1;
        this.iconRes = -1;
        this.iconBgRes = -1;
        this.onClick = new Function0<Unit>() { // from class: com.heytap.health.operation.timeline.TimelineNode$onClick$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
    }

    public static final void e(TimelineNode node, View view) {
        Intrinsics.checkNotNullParameter(node, "$node");
        node.onClick.invoke();
    }

    public final void d(@NotNull Context context, @NotNull View view) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R$id.ll_timeline_interval_container);
        for (final TimelineNode timelineNode : CollectionsKt__ReversedViewsKt.asReversedMutable(j())) {
            View viewInflate = layoutInflaterFrom.inflate(R$layout.operation_card_timeline_interval_item, (ViewGroup) linearLayout, false);
            ((TextView) viewInflate.findViewById(R$id.tv_timeline_interval_item_desc)).setText(timelineNode.descStr);
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.h0k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    TimelineNode.e(this.i, view2);
                }
            });
            linearLayout.addView(viewInflate);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDescStr() {
        return this.descStr;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getIconBgRes() {
        return this.iconBgRes;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getIconRes() {
        return this.iconRes;
    }

    @NotNull
    public final List<TimelineNode> j() {
        return (List) this.nextNodes.getValue();
    }

    @NotNull
    public final Function0<Unit> k() {
        return this.onClick;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final NodeType getType() {
        return this.type;
    }

    public final boolean n() {
        return !j().isEmpty();
    }

    @NotNull
    public abstract View o(@NotNull Context context, @NotNull ViewGroup container, @NotNull Function0<Unit> clickWrapper);

    public final void p(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.descStr = str;
    }

    public final void q(int i) {
        this.iconBgRes = i;
    }

    public final void r(int i) {
        this.iconRes = i;
    }

    public final void s(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onClick = function0;
    }

    public final void t(int i) {
        this.stickyRes = i;
    }

    @NotNull
    public String toString() {
        return "TimelineNode{startTime:" + this.startTime + ", endTime:" + this.endTime + ", descStr:" + this.descStr + "}";
    }
}
