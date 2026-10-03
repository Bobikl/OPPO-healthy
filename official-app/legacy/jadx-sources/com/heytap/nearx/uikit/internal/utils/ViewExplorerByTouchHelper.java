package com.heytap.nearx.uikit.internal.utils;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.l9d;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 ¢\u0006\u0004\b'\u0010(J\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0014J\u0016\u0010\u000b\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0014J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0014J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0014J\"\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/heytap/nearx/uikit/internal/utils/ViewExplorerByTouchHelper;", "Landroidx/customview/widget/ExploreByTouchHelper;", "", "a", "", "x", "y", "", "getVirtualViewAt", "", "virtualViewIds", "getVisibleVirtualViews", "virtualViewId", "Landroid/view/accessibility/AccessibilityEvent;", "event", "onPopulateEventForVirtualView", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", l9d.BUNDLE_KEY_NODE, "onPopulateNodeForVirtualView", "action", "Landroid/os/Bundle;", Const.Batch.ARGUMENTS, "", "onPerformActionForVirtualView", "position", "Landroid/graphics/Rect;", "rect", "b", "Landroid/view/View;", "i", "Landroid/view/View;", "mHostView", "Lcom/heytap/nearx/uikit/internal/utils/ViewExplorerByTouchHelper$a;", "j", "Lcom/heytap/nearx/uikit/internal/utils/ViewExplorerByTouchHelper$a;", "viewTalkBalkInteraction", MapSchema.FIELD_NAME_KEY, "Landroid/graphics/Rect;", "tempRect", "<init>", "(Landroid/view/View;Lcom/heytap/nearx/uikit/internal/utils/ViewExplorerByTouchHelper$a;)V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class ViewExplorerByTouchHelper extends ExploreByTouchHelper {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final View mHostView;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public a viewTalkBalkInteraction;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Rect tempRect;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J \u0010\f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH&J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0002H&R\u0014\u0010\u0015\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/heytap/nearx/uikit/internal/utils/ViewExplorerByTouchHelper$a;", "", "", "position", "Landroid/graphics/Rect;", "rect", "", "getItemBounds", "virtualViewId", f04.JSON_KEY_RKE_ACTION_TYPE, "", "resolvePara", "performAction", "", "x", "y", "getVirtualViewAt", "", "getItemDescription", "getCurrentPosition", "()I", "currentPosition", "getItemCounts", "itemCounts", "getClassName", "()Ljava/lang/CharSequence;", "className", "getDisablePosition", "disablePosition", "nearx_release"}, k = 1, mv = {1, 6, 0})
    public interface a {
        @Nullable
        CharSequence getClassName();

        int getCurrentPosition();

        int getDisablePosition();

        void getItemBounds(int position, @NotNull Rect rect);

        int getItemCounts();

        @NotNull
        CharSequence getItemDescription(int virtualViewId);

        int getVirtualViewAt(float x, float y);

        void performAction(int virtualViewId, int actionType, boolean resolvePara);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewExplorerByTouchHelper(@NotNull View mHostView, @NotNull a viewTalkBalkInteraction) {
        super(mHostView);
        Intrinsics.checkNotNullParameter(mHostView, "mHostView");
        Intrinsics.checkNotNullParameter(viewTalkBalkInteraction, "viewTalkBalkInteraction");
        this.mHostView = mHostView;
        this.viewTalkBalkInteraction = viewTalkBalkInteraction;
        this.tempRect = new Rect();
    }

    public final void a() {
        AccessibilityNodeProviderCompat accessibilityNodeProvider;
        int focusedVirtualView = getFocusedVirtualView();
        if (focusedVirtualView == Integer.MIN_VALUE || (accessibilityNodeProvider = getAccessibilityNodeProvider(this.mHostView)) == null) {
            return;
        }
        accessibilityNodeProvider.performAction(focusedVirtualView, 128, null);
    }

    public final void b(int position, Rect rect) {
        if (position < 0 || position >= this.viewTalkBalkInteraction.getItemCounts()) {
            return;
        }
        this.viewTalkBalkInteraction.getItemBounds(position, rect);
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public int getVirtualViewAt(float x, float y) {
        int virtualViewAt = this.viewTalkBalkInteraction.getVirtualViewAt(x, y);
        if (virtualViewAt >= 0) {
            return virtualViewAt;
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public void getVisibleVirtualViews(@NotNull List<Integer> virtualViewIds) {
        Intrinsics.checkNotNullParameter(virtualViewIds, "virtualViewIds");
        int itemCounts = this.viewTalkBalkInteraction.getItemCounts();
        for (int i = 0; i < itemCounts; i++) {
            virtualViewIds.add(Integer.valueOf(i));
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public boolean onPerformActionForVirtualView(int virtualViewId, int action, @Nullable Bundle arguments) {
        if (action != 16) {
            return false;
        }
        this.viewTalkBalkInteraction.performAction(virtualViewId, 16, false);
        return true;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public void onPopulateEventForVirtualView(int virtualViewId, @NotNull AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        event.setContentDescription(this.viewTalkBalkInteraction.getItemDescription(virtualViewId));
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public void onPopulateNodeForVirtualView(int virtualViewId, @NotNull AccessibilityNodeInfoCompat node) {
        Intrinsics.checkNotNullParameter(node, "node");
        b(virtualViewId, this.tempRect);
        node.setContentDescription(this.viewTalkBalkInteraction.getItemDescription(virtualViewId));
        node.setBoundsInParent(this.tempRect);
        if (this.viewTalkBalkInteraction.getClassName() != null) {
            node.setClassName(this.viewTalkBalkInteraction.getClassName());
        }
        node.addAction(16);
        if (virtualViewId == this.viewTalkBalkInteraction.getCurrentPosition()) {
            node.setSelected(true);
        }
        if (virtualViewId == this.viewTalkBalkInteraction.getDisablePosition()) {
            node.setEnabled(false);
        }
    }
}
