package com.heytap.store.base.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.heytap.store.base.core.R;
import com.heytap.store.base.core.listener.NoFastClickListener;
import com.heytap.store.base.widget.state.CommonConfig;
import com.heytap.store.platform.tools.NetworkUtils;
import com.heytap.store.platform.tools.ToastUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0019\u001a\u00020\u0010J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0014J\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020!R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lcom/heytap/store/base/core/view/MessageCountView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "callback", "Lcom/heytap/store/base/core/view/MessageViewCallback;", "getCallback", "()Lcom/heytap/store/base/core/view/MessageViewCallback;", "setCallback", "(Lcom/heytap/store/base/core/view/MessageViewCallback;)V", "ivMessageView", "Landroid/widget/ImageView;", "ivMessageViewTips", "Lcom/heytap/store/base/core/view/RedBubbleView;", "mUnreadMsgNum", "", "getMUnreadMsgNum", "()J", "setMUnreadMsgNum", "(J)V", "getMessageView", "initView", "", "resetAnim", "setData", "count", "setNeedAnim", "need", "", "updateMessageView", "isLightStyle", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MessageCountView extends FrameLayout {

    @Nullable
    private MessageViewCallback callback;
    private ImageView ivMessageView;
    private RedBubbleView ivMessageViewTips;
    private long mUnreadMsgNum;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MessageCountView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void initView() {
        View.inflate(getContext(), R.layout.pf_core_view_message_count, this);
        View viewFindViewById = findViewById(R.id.iv_message_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.iv_message_view)");
        this.ivMessageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.iv_message_view_tips);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.iv_message_view_tips)");
        this.ivMessageViewTips = (RedBubbleView) viewFindViewById2;
        ImageView imageView = this.ivMessageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivMessageView");
            imageView = null;
        }
        imageView.setOnClickListener(new NoFastClickListener(NoFastClickListener.FAST_CLICK_INTERVAL) { // from class: com.heytap.store.base.core.view.MessageCountView.initView.1
            @Override // com.heytap.store.base.core.listener.NoFastClickListener
            public void onNoFastClick(@NotNull View v) {
                Intrinsics.checkNotNullParameter(v, "v");
                NetworkUtils networkUtils = NetworkUtils.INSTANCE;
                Context context = MessageCountView.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                if (!networkUtils.isAvailable(context)) {
                    ToastUtils.show$default(ToastUtils.INSTANCE, CommonConfig.INSTANCE.getToastNoNetStr(), 0, 0, 0, 14, (Object) null);
                    return;
                }
                MessageViewCallback callback = MessageCountView.this.getCallback();
                if (callback == null) {
                    return;
                }
                callback.onClick(MessageCountView.this.getMUnreadMsgNum());
            }
        });
        setClipChildren(false);
    }

    @Nullable
    public final MessageViewCallback getCallback() {
        return this.callback;
    }

    public final long getMUnreadMsgNum() {
        return this.mUnreadMsgNum;
    }

    @NotNull
    public final ImageView getMessageView() {
        ImageView imageView = this.ivMessageView;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ivMessageView");
        return null;
    }

    public final void resetAnim() {
        RedBubbleView redBubbleView = this.ivMessageViewTips;
        if (redBubbleView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivMessageViewTips");
            redBubbleView = null;
        }
        redBubbleView.resetAnim();
    }

    public final void setCallback(@Nullable MessageViewCallback messageViewCallback) {
        this.callback = messageViewCallback;
    }

    public final void setData(long count) {
        this.mUnreadMsgNum = count;
        RedBubbleView redBubbleView = this.ivMessageViewTips;
        if (redBubbleView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivMessageViewTips");
            redBubbleView = null;
        }
        redBubbleView.setData(count);
    }

    public final void setMUnreadMsgNum(long j2) {
        this.mUnreadMsgNum = j2;
    }

    public final void setNeedAnim(boolean need) {
        RedBubbleView redBubbleView = this.ivMessageViewTips;
        if (redBubbleView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivMessageViewTips");
            redBubbleView = null;
        }
        redBubbleView.setNeedAnim(need);
    }

    public final void updateMessageView(boolean isLightStyle) {
        ImageView imageView = this.ivMessageView;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivMessageView");
            imageView = null;
        }
        imageView.setForceDarkAllowed(false);
        ImageView imageView3 = this.ivMessageView;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivMessageView");
            imageView3 = null;
        }
        if (imageView3.getVisibility() != 0) {
            ImageView imageView4 = this.ivMessageView;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivMessageView");
                imageView4 = null;
            }
            imageView4.setVisibility(0);
        }
        ImageView imageView5 = this.ivMessageView;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivMessageView");
        } else {
            imageView2 = imageView5;
        }
        imageView2.setImageResource(isLightStyle ? R.drawable.widget_nav_bar_message_icon_light : R.drawable.widget_nav_bar_message_icon_dark);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MessageCountView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MessageCountView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MessageCountView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        initView();
    }
}
