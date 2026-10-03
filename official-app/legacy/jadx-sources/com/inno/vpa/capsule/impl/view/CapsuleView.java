package com.inno.vpa.capsule.impl.view;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.udeviceui.R$dimen;
import com.heytap.udeviceui.R$id;
import com.heytap.udeviceui.R$layout;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.px2;
import com.oplus.aiunit.vision.uu5;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 82\u00020\u0001:\u00019B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b6\u00107J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0010\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\rH\u0002R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010&R\u0018\u0010-\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010&R\u0018\u0010/\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\u001cR\u0018\u00101\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010\u001cR\u0013\u00105\u001a\u0004\u0018\u0001028F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u0006:"}, d2 = {"Lcom/inno/vpa/capsule/impl/view/CapsuleView;", "Lcom/inno/vpa/capsule/impl/view/GestureView;", "", MapSchema.FIELD_NAME_ENTRY, "u", "Landroid/view/MotionEvent;", "event", "Landroid/content/Context;", "context", "t", "Lcom/oplus/aiunit/vision/px2;", "capsuleViewCallback", "setCapsuleViewCallback", "", "getBackgroundViewWidth", "v", "triggerAction", "w", "Landroid/view/View;", "A", "Landroid/view/View;", "mWholeView", "Landroid/widget/RelativeLayout;", c8l.KEY_B, "Landroid/widget/RelativeLayout;", "mMainCapsuleLayout", "Landroid/widget/ImageView;", "C", "Landroid/widget/ImageView;", "mBackgroundView", "Landroid/widget/LinearLayout;", "D", "Landroid/widget/LinearLayout;", "mContainerText", ExifInterface.LONGITUDE_EAST, "mContainerReplaceText", "Landroid/widget/TextView;", UserInfo.SEX_FEMALE, "Landroid/widget/TextView;", "mCapsuleTitle", "G", "mCapsuleSummary", "H", "mCapsuleReplaceTitle", "I", "mCapsuleReplaceSummary", "J", "mStartIcon", "K", "mEndIcon", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", lo9.TAG_DEFAULT_CREATION_PAINT, "<init>", "(Landroid/content/Context;)V", "Companion", "a", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class CapsuleView extends GestureView {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public View mWholeView;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public RelativeLayout mMainCapsuleLayout;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ImageView mBackgroundView;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public LinearLayout mContainerText;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public LinearLayout mContainerReplaceText;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public TextView mCapsuleTitle;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public TextView mCapsuleSummary;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public TextView mCapsuleReplaceTitle;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public TextView mCapsuleReplaceSummary;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ImageView mStartIcon;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ImageView mEndIcon;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/inno/vpa/capsule/impl/view/CapsuleView$initBaseData$1$1"}, k = 3, mv = {1, 4, 2})
    public static final class b implements Runnable {
        public final /* synthetic */ RelativeLayout i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ CapsuleView f8570j;

        public b(RelativeLayout relativeLayout, CapsuleView capsuleView) {
            this.i = relativeLayout;
            this.f8570j = capsuleView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context = this.f8570j.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            uu5.INSTANCE.b(this.i, context.getResources().getDimensionPixelOffset(R$dimen.gap_small_common));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapsuleView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.inno.vpa.capsule.impl.view.GestureView
    public void e() {
        super.e();
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.layout_capsule_view, (ViewGroup) null);
        this.mWholeView = viewInflate;
        this.mBackgroundView = viewInflate != null ? (ImageView) viewInflate.findViewById(R$id.iv_bg) : null;
        View view = this.mWholeView;
        RelativeLayout relativeLayout = view != null ? (RelativeLayout) view.findViewById(R$id.main_layout) : null;
        this.mMainCapsuleLayout = relativeLayout;
        if (relativeLayout != null) {
            relativeLayout.post(new b(relativeLayout, this));
        }
        v();
    }

    public final int getBackgroundViewWidth() {
        ImageView imageView = this.mBackgroundView;
        if (imageView != null) {
            return imageView.getWidth();
        }
        return 0;
    }

    @Nullable
    public final Paint getPaint() {
        TextView textView = this.mCapsuleTitle;
        if (textView != null) {
            return textView.getPaint();
        }
        return null;
    }

    public final void setCapsuleViewCallback(@Nullable px2 capsuleViewCallback) {
    }

    @Override // com.inno.vpa.capsule.impl.view.GestureView
    public void t(@NotNull MotionEvent event, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(context, "context");
        w(1);
    }

    @Override // com.inno.vpa.capsule.impl.view.GestureView
    public void u() {
        w(0);
    }

    public final void v() {
        View view = this.mWholeView;
        if (view != null) {
            this.mContainerText = (LinearLayout) view.findViewById(R$id.mContainerText);
            this.mContainerReplaceText = (LinearLayout) view.findViewById(R$id.mContainerReplaceText);
            this.mCapsuleTitle = (TextView) view.findViewById(R$id.tv_capsule_title);
            this.mCapsuleSummary = (TextView) view.findViewById(R$id.tv_capsule_summary);
            this.mCapsuleReplaceTitle = (TextView) view.findViewById(R$id.tv_replace_title);
            this.mCapsuleReplaceSummary = (TextView) view.findViewById(R$id.tv_replace_summary);
            this.mStartIcon = (ImageView) view.findViewById(R$id.iv_title_start_icon);
            this.mEndIcon = (ImageView) view.findViewById(R$id.iv_title_end_icon);
        }
        TextView textView = this.mCapsuleTitle;
        if (textView != null) {
            textView.setCompoundDrawables(null, null, null, null);
        }
    }

    public final void w(int triggerAction) {
    }
}
