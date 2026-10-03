package com.heytap.store.base.core.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.heytap.store.base.core.R;
import com.heytap.store.platform.imageloader.ImageLoader;
import com.heytap.store.platform.imageloader.LoadStep;
import com.heytap.store.platform.imageloader.SimpleRequestListener;
import com.heytap.store.platform.videoplayer.bean.VideoPlayerProductDetailDataBeanKt;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002%&B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0019J\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020 J\u000e\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\tR\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/heytap/store/base/core/view/ReturnView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "icon", "Landroid/widget/ImageView;", "mContext", "showContextCallBack", "Lcom/heytap/store/base/core/view/ReturnView$ShowContextCallBack;", "getShowContextCallBack", "()Lcom/heytap/store/base/core/view/ReturnView$ShowContextCallBack;", "setShowContextCallBack", "(Lcom/heytap/store/base/core/view/ReturnView$ShowContextCallBack;)V", "textView", "Landroid/widget/TextView;", "view", "Landroid/view/View;", "initView", "", "setDefaultPropertiesForPic", "setDefaultPropertiesForText", "setIcon", ResourcesUtil.ResourceType.DRAWABLE, "Landroid/graphics/drawable/Drawable;", VideoPlayerProductDetailDataBeanKt.IMG, "", ClickApiEntity.SET_TEXT, "text", ClickApiEntity.SET_TEXT_COLOR, "color", "Companion", "ShowContextCallBack", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ReturnView extends LinearLayout {

    @NotNull
    public static final String TAG = "ReturnView";
    private ImageView icon;

    @NotNull
    private Context mContext;

    @Nullable
    private ShowContextCallBack showContextCallBack;
    private TextView textView;
    private View view;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/heytap/store/base/core/view/ReturnView$ShowContextCallBack;", "", "onFailureLoadImg", "", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface ShowContextCallBack {
        void onFailureLoadImg();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mContext = context;
        initView();
    }

    private final void initView() {
        setOrientation(0);
        View viewInflate = View.inflate(this.mContext, R.layout.return_view_layout, this);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(mContext, R.layo…return_view_layout, this)");
        this.view = viewInflate;
        ImageView imageView = null;
        if (viewInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            viewInflate = null;
        }
        View viewFindViewById = viewInflate.findViewById(R.id.back_tips);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.back_tips)");
        this.textView = (TextView) viewFindViewById;
        View view = this.view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
            view = null;
        }
        View viewFindViewById2 = view.findViewById(R.id.back_pic);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.back_pic)");
        ImageView imageView2 = (ImageView) viewFindViewById2;
        this.icon = imageView2;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("icon");
            imageView2 = null;
        }
        imageView2.setSelected(false);
        ImageView imageView3 = this.icon;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("icon");
        } else {
            imageView = imageView3;
        }
        imageView.setEnabled(false);
        setGravity(17);
    }

    @Nullable
    public final ShowContextCallBack getShowContextCallBack() {
        return this.showContextCallBack;
    }

    public final void setDefaultPropertiesForPic() {
    }

    public final void setDefaultPropertiesForText() {
    }

    public final void setIcon(@NotNull String img) {
        Intrinsics.checkNotNullParameter(img, "img");
        LoadStep loadStepLoad = ImageLoader.load(img);
        ImageView imageView = this.icon;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("icon");
            imageView = null;
        }
        loadStepLoad.into(imageView, new SimpleRequestListener() { // from class: com.heytap.store.base.core.view.ReturnView.setIcon.1
            @Override // com.heytap.store.platform.imageloader.SimpleRequestListener, com.heytap.store.platform.imageloader.RequestListener
            public void onFailure(@Nullable Throwable throwable) {
                ShowContextCallBack showContextCallBack = ReturnView.this.getShowContextCallBack();
                if (showContextCallBack == null) {
                    return;
                }
                showContextCallBack.onFailureLoadImg();
            }
        });
        TextView textView = this.textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textView");
            textView = null;
        }
        textView.setVisibility(8);
        ImageView imageView3 = this.icon;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("icon");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setVisibility(0);
    }

    public final void setShowContextCallBack(@Nullable ShowContextCallBack showContextCallBack) {
        this.showContextCallBack = showContextCallBack;
    }

    public final void setText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextView textView = this.textView;
        ImageView imageView = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textView");
            textView = null;
        }
        textView.setText(text);
        TextView textView2 = this.textView;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textView");
            textView2 = null;
        }
        textView2.setVisibility(0);
        ImageView imageView2 = this.icon;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("icon");
        } else {
            imageView = imageView2;
        }
        imageView.setVisibility(8);
    }

    public final void setTextColor(int color) {
        TextView textView = this.textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textView");
            textView = null;
        }
        textView.setTextColor(color);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.mContext = context;
        initView();
    }

    public final void setIcon(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        ImageView imageView = this.icon;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("icon");
            imageView = null;
        }
        imageView.setImageDrawable(drawable);
        TextView textView = this.textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textView");
            textView = null;
        }
        textView.setVisibility(8);
        ImageView imageView3 = this.icon;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("icon");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnView(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.mContext = context;
        initView();
    }
}
