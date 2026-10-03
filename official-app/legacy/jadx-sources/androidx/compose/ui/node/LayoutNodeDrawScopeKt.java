package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"nextDrawNode", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,114:1\n71#2:115\n69#2:116\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n*L\n101#1:115\n102#1:116\n*E\n"})
public final class LayoutNodeDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final DrawModifierNode nextDrawNode(DelegatableNode delegatableNode) {
        Modifier.Node child;
        int iM3334constructorimpl = NodeKind.m3334constructorimpl(4);
        int iM3334constructorimpl2 = NodeKind.m3334constructorimpl(2);
        Modifier.Node child2 = delegatableNode.getNode().getChild();
        if (child2 == null) {
            return null;
        }
        if ((child2.getAggregateChildKindSet() & iM3334constructorimpl) == 0) {
            return null;
        }
        for (child = child2; child != 0 && (child.getKindSet() & iM3334constructorimpl2) == 0; child = child.getChild()) {
            if ((child.getKindSet() & iM3334constructorimpl) != 0) {
                return (DrawModifierNode) child;
            }
        }
        return null;
    }
}
